package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.w;
import org.telegram.messenger.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class e {
    public final RenderNode a = w.c();
    public final RenderNode[] b;
    public final RenderNode[] c;
    public final boolean d;
    public int e;
    public int f;
    public float g;
    public float h;
    public long i;
    public final /* synthetic */ g j;

    public e(g gVar, String str, int i7, boolean z9) {
        this.j = gVar;
        int i10 = i7 + 1;
        this.b = new RenderNode[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            RenderNode[] renderNodeArr = this.b;
            w.j();
            renderNodeArr[i11] = w.d(str + "_down_" + i7);
        }
        if (i7 > 0 || z9) {
            this.c = new RenderNode[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                this.c[i12] = w.c();
            }
        } else {
            this.c = this.b;
        }
        this.d = this.c == this.b;
        this.f = 1;
        this.e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z9;
        int i7;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f10 = width;
        g gVar = this.j;
        int round = Math.round((gVar.d * f10) / this.e);
        float f11 = height;
        int round2 = Math.round((gVar.d * f11) / this.f);
        float f12 = round;
        float f13 = f12 / f10;
        float f14 = round2;
        float f15 = f14 / f11;
        int i10 = gVar.d;
        float f16 = (f10 * i10) / f12;
        float f17 = (f11 * i10) / f14;
        long p10 = ui.p(ui.p(ui.p(ui.p(ui.p(0L, renderNode.getUniqueId()), round), round2), width), height);
        boolean z10 = (this.a.hasDisplayList() && this.b[0].hasDisplayList()) ? false : true;
        int i11 = 0;
        while (true) {
            int length = this.b.length;
            z9 = this.d;
            if (i11 >= length) {
                break;
            }
            z10 |= !r15[i11].hasDisplayList();
            if (!z9) {
                z10 |= !this.c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.i == p10 && !z10) {
            return;
        }
        this.i = p10;
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
            if (z9) {
                this.b[i13].setScaleX(f16);
                this.b[i13].setScaleY(f17);
                this.b[i13].setPivotX(0.0f);
                this.b[i13].setPivotY(0.0f);
                i7 = 0;
            } else {
                i7 = 0;
                this.c[i13].setPosition(0, 0, width, height);
                RecordingCanvas beginRecording3 = this.c[i13].beginRecording(width, height);
                beginRecording3.scale(f16, f17);
                beginRecording3.drawRenderNode(this.b[i13]);
                this.c[i13].endRecording();
            }
            i13++;
            i12 = i7;
        }
    }

    public final void b(float f10, float f11) {
        int i7 = this.e;
        float f12 = i7 >= 2 ? (this.g + f10) % i7 : 0.0f;
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
        this.b[0].setRenderEffect(RenderEffect.createBlurEffect(g.a(f10, this.e), g.a(f10, this.f), Shader.TileMode.CLAMP));
    }

    public final void d(float f10, RenderEffect renderEffect) {
        this.b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(g.a(f10, this.e), g.a(f10, this.f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.b[1].setRenderEffect(renderEffect);
    }
}
