package ig;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.z;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c {
    public final RenderNode a = z.c();
    public final RenderNode[] b;
    public final RenderNode[] c;
    public final boolean d;
    public int e;
    public int f;
    public float g;
    public float h;
    public long i;
    public final /* synthetic */ e j;

    public c(e eVar, String str, int i9, boolean z10) {
        this.j = eVar;
        int i10 = i9 + 1;
        this.b = new RenderNode[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            RenderNode[] renderNodeArr = this.b;
            z.i();
            renderNodeArr[i11] = z.d(str + "_down_" + i9);
        }
        if (i9 > 0 || z10) {
            this.c = new RenderNode[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                this.c[i12] = z.c();
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
        int i9 = eVar.d;
        float f16 = (f10 * i9) / f12;
        float f17 = (f11 * i9) / f14;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        boolean z11 = (this.a.hasDisplayList() && this.b[0].hasDisplayList()) ? false : true;
        int i10 = 0;
        while (true) {
            int length = this.b.length;
            z10 = this.d;
            if (i10 >= length) {
                break;
            }
            z11 |= !r15[i10].hasDisplayList();
            if (!z10) {
                z11 |= !this.c[i10].hasDisplayList();
            }
            i10++;
        }
        if (this.i == calcHash && !z11) {
            return;
        }
        this.i = calcHash;
        int i11 = 0;
        this.a.setPosition(0, 0, width, height);
        this.a.beginRecording(width, height).drawRenderNode(renderNode);
        this.a.endRecording();
        this.b[0].setPosition(0, 0, round, round2);
        RecordingCanvas beginRecording = this.b[0].beginRecording(round, round2);
        beginRecording.scale(f13, f15);
        beginRecording.drawRenderNode(this.a);
        this.b[0].endRecording();
        int i12 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.b;
            if (i12 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i12].setPosition(i11, i11, round, round2);
            RecordingCanvas beginRecording2 = this.b[i12].beginRecording(round, round2);
            if (i12 > 0) {
                beginRecording2.drawRenderNode(this.b[i11]);
            } else {
                beginRecording2.scale(f13, f15);
                beginRecording2.drawRenderNode(this.a);
            }
            this.b[i12].endRecording();
            if (z10) {
                this.b[i12].setScaleX(f16);
                this.b[i12].setScaleY(f17);
                this.b[i12].setPivotX(0.0f);
                this.b[i12].setPivotY(0.0f);
            } else {
                this.c[i12].setPosition(0, 0, width, height);
                RecordingCanvas beginRecording3 = this.c[i12].beginRecording(width, height);
                beginRecording3.scale(f16, f17);
                beginRecording3.drawRenderNode(this.b[i12]);
                this.c[i12].endRecording();
            }
            i12++;
            i11 = 0;
        }
    }

    public final void b(float f10, float f11) {
        int i9 = this.e;
        float f12 = i9 >= 2 ? (this.g + f10) % i9 : 0.0f;
        this.g = f12;
        int i10 = this.f;
        this.h = i10 >= 2 ? (this.h + f11) % i10 : 0.0f;
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
