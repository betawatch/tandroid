package dh;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class h {
    public float A;
    public boolean B;
    public final RenderNode a;
    public final RuntimeShader b;
    public RuntimeShader c;
    public RuntimeShader d;
    public RenderEffect e;
    public RenderEffect[] f;
    public float[] g;
    public float[] h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public int s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public h(RenderNode renderNode) {
        this.a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(g0.y2(null, R.raw.liquid_glass_shader));
        this.b = runtimeShader;
        this.d = runtimeShader;
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
        this.e = createRuntimeShaderEffect;
        renderNode.setRenderEffect(createRuntimeShaderEffect);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (this.x == f10 && this.y == f11 && this.z == f12 && this.A == f13 && this.t == f14 && this.u == f15 && this.v == f16 && this.w == f17) {
            return;
        }
        this.x = f10;
        this.y = f11;
        this.z = f12;
        this.A = f13;
        this.t = f14;
        this.u = f15;
        this.v = f16;
        this.w = f17;
        this.B = true;
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, int i7, float f21, float f22, int i10) {
        float f23;
        float f24;
        float f25;
        float f26;
        int length;
        float f27 = f14 + f17;
        if (f27 > f11) {
            float f28 = f14 / f27;
            f23 = f11 * f28;
            f24 = (1.0f - f28) * f11;
        } else {
            f23 = f14;
            f24 = f17;
        }
        float f29 = f15 + f16;
        if (f29 > f11) {
            float f30 = f15 / f29;
            f25 = f11 * f30;
            f26 = (1.0f - f30) * f11;
        } else {
            f25 = f15;
            f26 = f16;
        }
        if (this.i != i10 || Math.abs(this.j - f10) > 0.1f || Math.abs(this.k - f11) > 0.1f || Math.abs(this.l - f23) > 0.1f || Math.abs(this.m - f25) > 0.1f || Math.abs(this.n - f26) > 0.1f || Math.abs(this.o - f24) > 0.1f || Math.abs(this.p - f18) > 0.1f || Math.abs(this.q - f19) > 0.1f || Math.abs(this.r - f20) > 0.1f || this.s != i7 || this.B) {
            this.B = false;
            if (this.t > 0.0f) {
                if (this.c == null) {
                    this.c = new RuntimeShader(g0.y2(null, R.raw.liquid_glass_arrow_shader));
                }
                this.d = this.c;
            } else {
                this.d = this.b;
            }
            this.s = i7;
            float alpha = Color.alpha(i7) / 255.0f;
            float f31 = 1.0f / i10;
            this.i = i10;
            this.j = f10;
            this.k = f11;
            this.n = f26;
            this.m = f25;
            this.o = f24;
            this.l = f23;
            this.p = f18;
            this.d.setFloatUniform("size", (f10 / 2.0f) * f31, (f11 / 2.0f) * f31);
            this.d.setFloatUniform("radius", f26 * f31, f25 * f31, f24 * f31, f23 * f31);
            this.d.setFloatUniform("thickness", f18 * f31);
            RuntimeShader runtimeShader = this.d;
            this.q = f19;
            runtimeShader.setFloatUniform("refract_intensity", f19);
            RuntimeShader runtimeShader2 = this.d;
            this.r = f20;
            runtimeShader2.setFloatUniform("refract_index", f20);
            this.d.setFloatUniform("foreground_color_premultiplied", (Color.red(i7) / 255.0f) * alpha, (Color.green(i7) / 255.0f) * alpha, (Color.blue(i7) / 255.0f) * alpha, alpha);
            RuntimeShader runtimeShader3 = this.d;
            if (runtimeShader3 == this.c) {
                runtimeShader3.setFloatUniform("arrow", this.t * f31, this.u * f31, this.v * f31, this.w * f31);
                this.d.setFloatUniform("arrow_axis", this.x * f31, this.y * f31, this.z, this.A);
            }
            int i11 = (i10 * i10) + 1;
            RenderEffect[] renderEffectArr = this.f;
            if (renderEffectArr == null || renderEffectArr.length != i11) {
                this.f = new RenderEffect[i11];
                this.g = new float[i11];
                this.h = new float[i11];
            } else {
                Arrays.fill(renderEffectArr, (Object) null);
            }
        }
        float f32 = i10;
        float f33 = (((f10 / 2.0f) + f12) - f21) / f32;
        float f34 = (((f11 / 2.0f) + f13) - f22) / f32;
        if (f21 == ((int) f21) && f22 == ((int) f22)) {
            int i12 = (int) (-f22);
            int i13 = i12 % i10;
            if (i13 == 0) {
                i13 = 0;
            } else if ((((i12 ^ i10) >> 31) | 1) <= 0) {
                i13 += i10;
            }
            int i14 = (int) (-f21);
            int i15 = i14 % i10;
            length = (i13 * i10) + (i15 == 0 ? 0 : (((i14 ^ i10) >> 31) | 1) > 0 ? i15 : i15 + i10);
        } else {
            length = this.f.length - 1;
        }
        RenderEffect renderEffect = this.f[length];
        if (renderEffect == null || this.g[length] != f33 || this.h[length] != f34) {
            this.d.setFloatUniform("center", f33, f34);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.d, "img");
            this.f[length] = renderEffect;
            this.g[length] = f33;
            this.h[length] = f34;
        }
        if (this.e != renderEffect) {
            RenderNode renderNode = this.a;
            this.e = renderEffect;
            renderNode.setRenderEffect(renderEffect);
        }
    }
}
