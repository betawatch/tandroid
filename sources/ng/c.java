package ng;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.y;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c {
    public final RenderNode a = y.c();
    public final RenderNode[] b;
    public final RenderNode[] c;
    public final boolean d;
    public int e;
    public int f;
    public float g;
    public float h;
    public long i;
    public final /* synthetic */ e j;

    public c(e eVar, String str, int i10, boolean z4) {
        this.j = eVar;
        int i11 = i10 + 1;
        this.b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.b;
            y.i();
            renderNodeArr[i12] = y.d(str + "_down_" + i10);
        }
        if (i10 > 0 || z4) {
            this.c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.c[i13] = y.c();
            }
        } else {
            this.c = this.b;
        }
        this.d = this.c == this.b;
        this.f = 1;
        this.e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z4;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f10 = width;
        e eVar = this.j;
        int round = Math.round((eVar.d * f10) / this.e);
        float f11 = height;
        int round2 = Math.round((eVar.d * f11) / this.f);
        float f12 = round;
        float f13 = f12 / f10;
        float f14 = round2;
        float f15 = f14 / f11;
        int i10 = eVar.d;
        float f16 = (f10 * i10) / f12;
        float f17 = (f11 * i10) / f14;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        boolean z10 = (this.a.hasDisplayList() && this.b[0].hasDisplayList()) ? false : true;
        int i11 = 0;
        while (true) {
            int length = this.b.length;
            z4 = this.d;
            if (i11 >= length) {
                break;
            }
            z10 |= !r15[i11].hasDisplayList();
            if (!z4) {
                z10 |= !this.c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.i == calcHash && !z10) {
            return;
        }
        this.i = calcHash;
        int i12 = 0;
        this.a.setPosition(0, 0, width, height);
        this.a.beginRecording(width, height).drawRenderNode(renderNode);
        this.a.endRecording();
        this.b[0].setPosition(0, 0, round, round2);
        RecordingCanvas beginRecording = this.b[0].beginRecording(round, round2);
        beginRecording.scale(f13, f15);
        beginRecording.drawRenderNode(this.a);
        this.b[0].endRecording();
        int i13 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.b;
            if (i13 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i13].setPosition(i12, i12, round, round2);
            RecordingCanvas beginRecording2 = this.b[i13].beginRecording(round, round2);
            if (i13 > 0) {
                beginRecording2.drawRenderNode(this.b[i12]);
            } else {
                beginRecording2.scale(f13, f15);
                beginRecording2.drawRenderNode(this.a);
            }
            this.b[i13].endRecording();
            if (z4) {
                this.b[i13].setScaleX(f16);
                this.b[i13].setScaleY(f17);
                this.b[i13].setPivotX(0.0f);
                this.b[i13].setPivotY(0.0f);
            } else {
                this.c[i13].setPosition(0, 0, width, height);
                RecordingCanvas beginRecording3 = this.c[i13].beginRecording(width, height);
                beginRecording3.scale(f16, f17);
                beginRecording3.drawRenderNode(this.b[i13]);
                this.c[i13].endRecording();
            }
            i13++;
            i12 = 0;
        }
    }

    public final void b(float f10, float f11) {
        int i10 = this.e;
        float f12 = i10 >= 2 ? (this.g + f10) % i10 : 0.0f;
        this.g = f12;
        int i11 = this.f;
        this.h = i11 >= 2 ? (this.h + f11) % i11 : 0.0f;
        if (this.j.b) {
            this.a.setTranslationX(f12);
            this.a.setTranslationY(this.h);
            for (RenderNode renderNode : this.c) {
                renderNode.setTranslationX(-this.g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f10) {
        this.b[0].setRenderEffect(RenderEffect.createBlurEffect(e.a(f10, this.e), e.a(f10, this.f), Shader.TileMode.CLAMP));
    }

    public final void d(float f10, RenderEffect renderEffect) {
        this.b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(e.a(f10, this.e), e.a(f10, this.f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.b[1].setRenderEffect(renderEffect);
    }
}
