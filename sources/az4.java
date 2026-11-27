// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class az4 extends rne {
    public final RenderNode a = vk1.q();
    public final RuntimeShader b = fn3.d();
    public int c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f;
    public float[] g;
    public float[] h;
    public final /* synthetic */ bz4 i;

    public az4(bz4 bz4Var) {
        this.i = bz4Var;
    }

    @Override // rne
    public final void a(Rect rect, RectF rectF) {
        float f;
        float f2;
        int i;
        wy4 wy4Var;
        int i2;
        float f3;
        float f4;
        int i3;
        int a;
        int a2;
        int g;
        int g2;
        bz4 bz4Var = this.i;
        wy4 wy4Var2 = bz4Var.h;
        int i4 = (wy4Var2 == null || !wy4Var2.h() || wy4Var2.f() <= 0) ? 0 : 1;
        if (i4 != 0) {
            int f5 = wy4Var2.f();
            float f6 = i4 * f5;
            f = bz4.k(rectF.left, wy4Var2.g(), f5) - f6;
            f2 = bz4.k(rectF.top, wy4Var2.a(), f5) - f6;
            i = f5;
        } else {
            f = rectF.left;
            f2 = rectF.top;
            i = 1;
        }
        int i5 = i4;
        float f7 = f2;
        float f8 = f - rectF.left;
        float f9 = f7 - rectF.top;
        float f10 = i;
        int ceil = ((int) Math.ceil((rectF.right - f) / f10)) + i5;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f7) / f10)) + i5;
        if (!bz4Var.w && this.c == rect.width() && this.d == rect.height() && this.e == i) {
            wy4Var = wy4Var2;
            f4 = f7;
            i2 = ceil;
            f3 = f10;
            i3 = ceil2;
        } else {
            int i6 = bz4Var.y;
            float height = (i6 == 1 || i6 == 4) ? rect.height() : rect.width();
            RuntimeShader runtimeShader = this.b;
            cz4 cz4Var = bz4Var.E;
            cz4Var.getClass();
            wy4Var = wy4Var2;
            i2 = ceil;
            f3 = f10;
            f4 = f7;
            i3 = ceil2;
            runtimeShader.setInputShader("alphaMask", bz4Var.l(cz4Var, height, 0.0f, -1, i));
            RuntimeShader runtimeShader2 = this.b;
            cz4 cz4Var2 = bz4Var.F;
            cz4Var2.getClass();
            runtimeShader2.setInputShader("overlay", bz4Var.l(cz4Var2, height, 0.0f, bz4Var.I, i));
            this.b.setFloatUniform("background_color_premultiplied", Color.red(bz4Var.I) / 255.0f, Color.green(bz4Var.I) / 255.0f, Color.blue(bz4Var.I) / 255.0f, 1.0f);
            this.c = rect.width();
            this.d = rect.height();
            this.e = i;
            int i7 = i * i;
            RenderEffect[] renderEffectArr = this.f;
            if (renderEffectArr == null || renderEffectArr.length != i7) {
                this.f = new RenderEffect[i7];
                this.g = new float[i7];
                this.h = new float[i7];
            } else {
                Arrays.fill(renderEffectArr, (Object) null);
            }
        }
        int i8 = (((i5 == 0 || (a2 = (a = wy4Var.a()) % i) == 0) ? 0 : (((a ^ i) >> 31) | 1) > 0 ? a2 : a2 + i) * i) + ((i5 == 0 || (g2 = (g = wy4Var.g()) % i) == 0) ? 0 : (((g ^ i) >> 31) | 1) > 0 ? g2 : g2 + i);
        float f11 = f8 / f3;
        float f12 = f9 / f3;
        RenderEffect renderEffect = this.f[i8];
        if (renderEffect == null || this.g[i8] != f11 || this.h[i8] != f12) {
            this.b.setFloatUniform("shader_offset", f11, f12);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
            this.f[i8] = renderEffect;
            this.g[i8] = f11;
            this.h[i8] = f12;
        }
        this.a.setPosition(0, 0, i2, i3);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f3);
        this.a.setScaleY(f3);
        this.a.setTranslationX(f8);
        this.a.setTranslationY(f9);
        RecordingCanvas beginRecording = this.a.beginRecording();
        if (i5 != 0) {
            bz4Var.h.d(f, f4, i, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            bz4Var.f.e(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        this.a.endRecording();
        this.a.setRenderEffect(renderEffect);
        bz4Var.w = false;
    }

    @Override // rne
    public final void b() {
        this.a.discardDisplayList();
        this.c = -1;
    }

    @Override // rne
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // rne
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // rne
    public final void e(float f) {
        this.a.setAlpha(f);
    }
}
