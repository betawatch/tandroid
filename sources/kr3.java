// default package

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kr3 {
    public final RenderNode a = ul1.k();
    public final RenderNode[] b;
    public final RenderNode[] c;
    public final boolean d;
    public byte e;
    public byte f;
    public float g;
    public float h;
    public long i;
    public final /* synthetic */ mr3 j;

    public kr3(mr3 mr3Var, String str, int i, boolean z) {
        this.j = mr3Var;
        int i2 = i + 1;
        this.b = new RenderNode[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            RenderNode[] renderNodeArr = this.b;
            ul1.p();
            renderNodeArr[i3] = ul1.d(str + "_down_" + i);
        }
        if (i > 0 || z) {
            this.c = new RenderNode[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                this.c[i4] = ul1.k();
            }
        } else {
            this.c = this.b;
        }
        this.d = this.c == this.b;
        this.f = (byte) 1;
        this.e = (byte) 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z;
        int i;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f = width;
        mr3 mr3Var = this.j;
        int round = Math.round((mr3Var.d * f) / this.e);
        float f2 = height;
        byte b = mr3Var.d;
        int round2 = Math.round((b * f2) / this.f);
        float f3 = round;
        float f4 = f3 / f;
        float f5 = round2;
        float f6 = f5 / f2;
        float f7 = b;
        float f8 = (f * f7) / f3;
        float f9 = (f2 * f7) / f5;
        long r = hs6.r(hs6.r(hs6.r(hs6.r(hs6.r(0L, renderNode.getUniqueId()), round), round2), width), height);
        boolean z2 = (this.a.hasDisplayList() && this.b[0].hasDisplayList()) ? false : true;
        int i2 = 0;
        while (true) {
            int length = this.b.length;
            z = this.d;
            if (i2 >= length) {
                break;
            }
            z2 |= !r15[i2].hasDisplayList();
            if (!z) {
                z2 |= !this.c[i2].hasDisplayList();
            }
            i2++;
        }
        if (this.i == r && !z2) {
            return;
        }
        this.i = r;
        int i3 = 0;
        this.a.setPosition(0, 0, width, height);
        this.a.beginRecording(width, height).drawRenderNode(renderNode);
        this.a.endRecording();
        this.b[0].setPosition(0, 0, round, round2);
        RecordingCanvas beginRecording = this.b[0].beginRecording(round, round2);
        beginRecording.scale(f4, f6);
        beginRecording.drawRenderNode(this.a);
        this.b[0].endRecording();
        int i4 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.b;
            if (i4 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i4].setPosition(i3, i3, round, round2);
            RecordingCanvas beginRecording2 = this.b[i4].beginRecording(round, round2);
            if (i4 > 0) {
                beginRecording2.drawRenderNode(this.b[i3]);
            } else {
                beginRecording2.scale(f4, f6);
                beginRecording2.drawRenderNode(this.a);
            }
            this.b[i4].endRecording();
            if (z) {
                this.b[i4].setScaleX(f8);
                this.b[i4].setScaleY(f9);
                this.b[i4].setPivotX(0.0f);
                this.b[i4].setPivotY(0.0f);
                i = 0;
            } else {
                i = 0;
                this.c[i4].setPosition(0, 0, width, height);
                RecordingCanvas beginRecording3 = this.c[i4].beginRecording(width, height);
                beginRecording3.scale(f8, f9);
                beginRecording3.drawRenderNode(this.b[i4]);
                this.c[i4].endRecording();
            }
            i4++;
            i3 = i;
        }
    }

    public final void b(float f, float f2) {
        byte b = this.e;
        float f3 = b >= 2 ? (this.g + f) % b : 0.0f;
        this.g = f3;
        byte b2 = this.f;
        this.h = b2 >= 2 ? (this.h + f2) % b2 : 0.0f;
        if (this.j.b) {
            this.a.setTranslationX(f3);
            this.a.setTranslationY(this.h);
            for (RenderNode renderNode : this.c) {
                renderNode.setTranslationX(-this.g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f) {
        this.b[0].setRenderEffect(RenderEffect.createBlurEffect(mr3.a(f, this.e), mr3.a(f, this.f), Shader.TileMode.CLAMP));
    }

    public final void d(float f, RenderEffect renderEffect) {
        this.b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(mr3.a(f, this.e), mr3.a(f, this.f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.b[1].setRenderEffect(renderEffect);
    }
}
