package bi;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class fe extends b1 {
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

    public fe(View view) {
        super(view);
        this.b = new ArrayList();
        this.i = new float[7];
        this.j = new float[7];
        this.k = new float[7];
        this.l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(org.telegram.messenger.g0.y2(null, R.raw.superripple_effect));
        this.c = runtimeShader;
        e1(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void e1(boolean z9) {
        View view = (View) this.a;
        if (z9 || this.f != view.getWidth() || this.g != view.getHeight() || Math.abs(this.h - org.telegram.messenger.g0.p) > 0.01f) {
            RuntimeShader runtimeShader = this.c;
            int width = view.getWidth();
            this.f = width;
            int height = view.getHeight();
            this.g = height;
            runtimeShader.setFloatUniform("size", width, height);
            RuntimeShader runtimeShader2 = this.c;
            float f10 = org.telegram.messenger.g0.p;
            this.h = f10;
            runtimeShader2.setFloatUniform("density", f10);
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            RoundedCorner roundedCorner = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(0);
            RoundedCorner roundedCorner2 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(1);
            RoundedCorner roundedCorner3 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(3);
            this.c.setFloatUniform("radius", ((rootWindowInsets != null ? rootWindowInsets.getRoundedCorner(2) : null) == null || (view != view.getRootView() && org.telegram.messenger.g0.n > 0)) ? 0.0f : r1.getRadius(), roundedCorner2 == null ? 0.0f : roundedCorner2.getRadius(), (roundedCorner3 == null || (view != view.getRootView() && org.telegram.messenger.g0.n > 0)) ? 0.0f : roundedCorner3.getRadius(), roundedCorner != null ? roundedCorner.getRadius() : 0.0f);
        }
    }

    public final void f1() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        View view = (View) this.a;
        ArrayList arrayList = this.b;
        boolean z9 = false;
        if (!arrayList.isEmpty()) {
            boolean z10 = true;
            boolean z11 = this.e != Math.min(7, arrayList.size());
            this.e = Math.min(7, arrayList.size());
            int i7 = 0;
            while (true) {
                int i10 = this.e;
                fArr = this.l;
                fArr2 = this.k;
                fArr3 = this.j;
                fArr4 = this.i;
                if (i7 >= i10) {
                    break;
                }
                ee eeVar = (ee) arrayList.get(i7);
                boolean z12 = z11 || Math.abs(fArr4[i7] - eeVar.d) > 0.001f;
                float f10 = eeVar.d;
                float f11 = eeVar.c;
                float f12 = eeVar.b;
                float f13 = eeVar.a;
                fArr4[i7] = f10;
                boolean z13 = z12 || Math.abs(fArr3[i7] - f13) > 0.001f;
                fArr3[i7] = f13;
                boolean z14 = z13 || Math.abs(fArr2[i7] - f12) > 0.001f;
                fArr2[i7] = f12;
                z11 = z14 || Math.abs(fArr[i7] - f11) > 0.001f;
                fArr[i7] = f11;
                i7++;
            }
            if (!z11 && this.f == view.getWidth() && this.g == view.getHeight() && Math.abs(this.h - org.telegram.messenger.g0.p) <= 0.01f) {
                z10 = false;
            }
            if (z10) {
                this.c.setIntUniform("count", this.e);
                this.c.setFloatUniform("t", fArr4);
                this.c.setFloatUniform("centerX", fArr3);
                this.c.setFloatUniform("centerY", fArr2);
                this.c.setFloatUniform("intensity", fArr);
                e1(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.c, "img");
            }
            z9 = z10;
        }
        view.setRenderEffect(arrayList.isEmpty() ? null : this.d);
        if (z9) {
            view.invalidate();
        }
    }
}
