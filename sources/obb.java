// default package

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class obb extends l13 {
    public final ArrayList b;
    public final RuntimeShader c;
    public RenderEffect d;
    public int e;
    public int f;
    public int g;
    public float h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;

    public obb(View view) {
        super(view);
        this.b = new ArrayList();
        this.i = new float[7];
        this.j = new float[7];
        this.k = new float[7];
        this.l = new float[7];
        RuntimeShader b = nm3.b(gl.v2(null, R.raw.superripple_effect));
        this.c = b;
        h(true);
        this.d = RenderEffect.createRuntimeShaderEffect(b, "img");
    }

    public final void h(boolean z) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        View view = (View) this.a;
        if (z || this.f != view.getWidth() || this.g != view.getHeight() || Math.abs(this.h - gl.p) > 0.01f) {
            RuntimeShader runtimeShader = this.c;
            int width = view.getWidth();
            this.f = width;
            int height = view.getHeight();
            this.g = height;
            runtimeShader.setFloatUniform("size", width, height);
            RuntimeShader runtimeShader2 = this.c;
            float f = gl.p;
            this.h = f;
            runtimeShader2.setFloatUniform("density", f);
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                roundedCorner4 = null;
                roundedCorner = null;
                roundedCorner2 = null;
                roundedCorner3 = null;
            } else {
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                roundedCorner3 = rootWindowInsets.getRoundedCorner(3);
                roundedCorner4 = rootWindowInsets.getRoundedCorner(2);
            }
            this.c.setFloatUniform("radius", (roundedCorner4 == null || (view != view.getRootView() && gl.n > 0)) ? 0.0f : roundedCorner4.getRadius(), roundedCorner2 == null ? 0.0f : roundedCorner2.getRadius(), (roundedCorner3 == null || (view != view.getRootView() && gl.n > 0)) ? 0.0f : roundedCorner3.getRadius(), roundedCorner != null ? roundedCorner.getRadius() : 0.0f);
        }
    }

    public final void i() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        View view = (View) this.a;
        ArrayList arrayList = this.b;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            boolean z2 = true;
            boolean z3 = this.e != Math.min(7, arrayList.size());
            this.e = Math.min(7, arrayList.size());
            int i = 0;
            while (true) {
                int i2 = this.e;
                fArr = this.l;
                fArr2 = this.k;
                fArr3 = this.j;
                fArr4 = this.i;
                if (i >= i2) {
                    break;
                }
                nbb nbbVar = (nbb) arrayList.get(i);
                boolean z4 = z3 || Math.abs(fArr4[i] - nbbVar.d) > 0.001f;
                float f = nbbVar.d;
                float f2 = nbbVar.c;
                float f3 = nbbVar.b;
                float f4 = nbbVar.a;
                fArr4[i] = f;
                boolean z5 = z4 || Math.abs(fArr3[i] - f4) > 0.001f;
                fArr3[i] = f4;
                boolean z6 = z5 || Math.abs(fArr2[i] - f3) > 0.001f;
                fArr2[i] = f3;
                z3 = z6 || Math.abs(fArr[i] - f2) > 0.001f;
                fArr[i] = f2;
                i++;
            }
            if (!z3 && this.f == view.getWidth() && this.g == view.getHeight() && Math.abs(this.h - gl.p) <= 0.01f) {
                z2 = false;
            }
            if (z2) {
                this.c.setIntUniform("count", this.e);
                this.c.setFloatUniform("t", fArr4);
                this.c.setFloatUniform("centerX", fArr3);
                this.c.setFloatUniform("centerY", fArr2);
                this.c.setFloatUniform("intensity", fArr);
                h(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.c, "img");
            }
            z = z2;
        }
        view.setRenderEffect(arrayList.isEmpty() ? null : this.d);
        if (z) {
            view.invalidate();
        }
    }
}
