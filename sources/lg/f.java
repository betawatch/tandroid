package lg;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f {
    public final RenderNode a;
    public final RuntimeShader b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public int p;

    public f(RenderNode renderNode) {
        this.a = renderNode;
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.liquid_glass_shader));
        this.b = runtimeShader;
        renderNode.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "img"));
    }

    public final void a(float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        float f18;
        float f19;
        float f20;
        float f21;
        float width = this.a.getWidth();
        float height = this.a.getHeight();
        float f22 = (0.0f + f9) / 2.0f;
        float f23 = (0.0f + f10) / 2.0f;
        float f24 = f10 - 0.0f;
        float f25 = (f9 - 0.0f) / 2.0f;
        float f26 = f24 / 2.0f;
        float f27 = f11 + f14;
        if (f27 > f24) {
            float f28 = f11 / f27;
            f18 = f24 * f28;
            f19 = (1.0f - f28) * f24;
        } else {
            f18 = f11;
            f19 = f14;
        }
        float f29 = f12 + f13;
        if (f29 > f24) {
            float f30 = f12 / f29;
            f21 = f24 * (1.0f - f30);
            f20 = f24 * f30;
        } else {
            f20 = f12;
            f21 = f13;
        }
        if (Math.abs(this.c - width) > 0.1f || Math.abs(this.d - height) > 0.1f || Math.abs(this.e - f22) > 0.1f || Math.abs(this.f - f23) > 0.1f || Math.abs(this.g - f25) > 0.1f || Math.abs(this.h - f26) > 0.1f || Math.abs(this.i - f18) > 0.1f || Math.abs(this.j - f20) > 0.1f || Math.abs(this.k - f21) > 0.1f || Math.abs(this.l - f19) > 0.1f || Math.abs(this.m - f15) > 0.1f || Math.abs(this.n - f16) > 0.1f || Math.abs(this.o - f17) > 0.1f || this.p != i10) {
            this.p = i10;
            float alpha = Color.alpha(i10) / 255.0f;
            RuntimeShader runtimeShader = this.b;
            this.c = width;
            this.d = height;
            runtimeShader.setFloatUniform("resolution", width, height);
            RuntimeShader runtimeShader2 = this.b;
            this.e = f22;
            this.f = f23;
            runtimeShader2.setFloatUniform("center", f22, f23);
            RuntimeShader runtimeShader3 = this.b;
            this.g = f25;
            this.h = f26;
            runtimeShader3.setFloatUniform("size", f25, f26);
            RuntimeShader runtimeShader4 = this.b;
            this.k = f21;
            this.j = f20;
            this.l = f19;
            this.i = f18;
            runtimeShader4.setFloatUniform("radius", f21, f20, f19, f18);
            RuntimeShader runtimeShader5 = this.b;
            this.m = f15;
            runtimeShader5.setFloatUniform("thickness", f15);
            RuntimeShader runtimeShader6 = this.b;
            this.n = f16;
            runtimeShader6.setFloatUniform("refract_intensity", f16);
            RuntimeShader runtimeShader7 = this.b;
            this.o = f17;
            runtimeShader7.setFloatUniform("refract_index", f17);
            this.b.setFloatUniform("foreground_color_premultiplied", (Color.red(i10) / 255.0f) * alpha, (Color.green(i10) / 255.0f) * alpha, (Color.blue(i10) / 255.0f) * alpha, alpha);
            this.a.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.b, "img"));
        }
    }
}
