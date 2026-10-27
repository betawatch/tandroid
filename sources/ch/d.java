package ch;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.x;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d {
    public final RenderNode a = x.c();
    public final RenderNode[] b;
    public final RenderNode[] c;
    public final boolean d;
    public int e;
    public int f;
    public float g;
    public float h;
    public long i;
    public final /* synthetic */ f j;

    public d(f fVar, String str, int i10, boolean z10) {
        this.j = fVar;
        int i11 = i10 + 1;
        this.b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.b;
            x.j();
            renderNodeArr[i12] = x.d(str + "_down_" + i10);
        }
        if (i10 > 0 || z10) {
            this.c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.c[i13] = x.c();
            }
        } else {
            this.c = this.b;
        }
        this.d = this.c == this.b;
        this.f = 1;
        this.e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        int i10;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f7 = width;
        f fVar = this.j;
        int round = Math.round((fVar.d * f7) / this.e);
        float f10 = height;
        int round2 = Math.round((fVar.d * f10) / this.f);
        float f11 = round;
        float f12 = f11 / f7;
        float f13 = round2;
        float f14 = f13 / f10;
        int i11 = fVar.d;
        float f15 = (f7 * i11) / f11;
        float f16 = (f10 * i11) / f13;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        boolean z11 = (this.a.hasDisplayList() && this.b[0].hasDisplayList()) ? false : true;
        int i12 = 0;
        while (true) {
            int length = this.b.length;
            z10 = this.d;
            if (i12 >= length) {
                break;
            }
            z11 |= !r15[i12].hasDisplayList();
            if (!z10) {
                z11 |= !this.c[i12].hasDisplayList();
            }
            i12++;
        }
        if (this.i == calcHash && !z11) {
            return;
        }
        this.i = calcHash;
        int i13 = 0;
        this.a.setPosition(0, 0, width, height);
        this.a.beginRecording(width, height).drawRenderNode(renderNode);
        this.a.endRecording();
        this.b[0].setPosition(0, 0, round, round2);
        RecordingCanvas beginRecording = this.b[0].beginRecording(round, round2);
        beginRecording.scale(f12, f14);
        beginRecording.drawRenderNode(this.a);
        this.b[0].endRecording();
        int i14 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.b;
            if (i14 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i14].setPosition(i13, i13, round, round2);
            RecordingCanvas beginRecording2 = this.b[i14].beginRecording(round, round2);
            if (i14 > 0) {
                beginRecording2.drawRenderNode(this.b[i13]);
            } else {
                beginRecording2.scale(f12, f14);
                beginRecording2.drawRenderNode(this.a);
            }
            this.b[i14].endRecording();
            if (z10) {
                this.b[i14].setScaleX(f15);
                this.b[i14].setScaleY(f16);
                this.b[i14].setPivotX(0.0f);
                this.b[i14].setPivotY(0.0f);
                i10 = 0;
            } else {
                i10 = 0;
                this.c[i14].setPosition(0, 0, width, height);
                RecordingCanvas beginRecording3 = this.c[i14].beginRecording(width, height);
                beginRecording3.scale(f15, f16);
                beginRecording3.drawRenderNode(this.b[i14]);
                this.c[i14].endRecording();
            }
            i14++;
            i13 = i10;
        }
    }

    public final void b(float f7, float f10) {
        int i10 = this.e;
        float f11 = i10 >= 2 ? (this.g + f7) % i10 : 0.0f;
        this.g = f11;
        int i11 = this.f;
        this.h = i11 >= 2 ? (this.h + f10) % i11 : 0.0f;
        if (this.j.b) {
            this.a.setTranslationX(f11);
            this.a.setTranslationY(this.h);
            for (RenderNode renderNode : this.c) {
                renderNode.setTranslationX(-this.g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f7) {
        this.b[0].setRenderEffect(RenderEffect.createBlurEffect(f.a(f7, this.e), f.a(f7, this.f), Shader.TileMode.CLAMP));
    }

    public final void d(float f7, RenderEffect renderEffect) {
        this.b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f.a(f7, this.e), f.a(f7, this.f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.b[1].setRenderEffect(renderEffect);
    }
}
