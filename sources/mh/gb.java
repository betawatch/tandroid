package mh;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class gb extends cb.e {
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

    public gb(View view) {
        super(view);
        this.b = new ArrayList();
        this.i = new float[7];
        this.j = new float[7];
        this.k = new float[7];
        this.l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(AndroidUtilities.readRes(R.raw.superripple_effect));
        this.c = runtimeShader;
        L(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void L(boolean z4) {
        View view = (View) this.a;
        if (z4 || this.f != view.getWidth() || this.g != view.getHeight() || Math.abs(this.h - AndroidUtilities.density) > 0.01f) {
            RuntimeShader runtimeShader = this.c;
            int width = view.getWidth();
            this.f = width;
            int height = view.getHeight();
            this.g = height;
            runtimeShader.setFloatUniform("size", width, height);
            RuntimeShader runtimeShader2 = this.c;
            float f10 = AndroidUtilities.density;
            this.h = f10;
            runtimeShader2.setFloatUniform("density", f10);
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            RoundedCorner roundedCorner = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(0);
            RoundedCorner roundedCorner2 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(1);
            RoundedCorner roundedCorner3 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(3);
            this.c.setFloatUniform("radius", ((rootWindowInsets != null ? rootWindowInsets.getRoundedCorner(2) : null) == null || (view != view.getRootView() && AndroidUtilities.navigationBarHeight > 0)) ? 0.0f : r1.getRadius(), roundedCorner2 == null ? 0.0f : roundedCorner2.getRadius(), (roundedCorner3 == null || (view != view.getRootView() && AndroidUtilities.navigationBarHeight > 0)) ? 0.0f : roundedCorner3.getRadius(), roundedCorner == null ? 0.0f : roundedCorner.getRadius());
        }
    }

    public final void M() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        View view = (View) this.a;
        ArrayList arrayList = this.b;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            boolean z10 = true;
            boolean z11 = this.e != Math.min(7, arrayList.size());
            this.e = Math.min(7, arrayList.size());
            int i10 = 0;
            while (true) {
                int i11 = this.e;
                fArr = this.l;
                fArr2 = this.k;
                fArr3 = this.j;
                fArr4 = this.i;
                if (i10 >= i11) {
                    break;
                }
                fb fbVar = (fb) arrayList.get(i10);
                boolean z12 = z11 || Math.abs(fArr4[i10] - fbVar.d) > 0.001f;
                float f10 = fbVar.d;
                float f11 = fbVar.c;
                float f12 = fbVar.b;
                float f13 = fbVar.a;
                fArr4[i10] = f10;
                boolean z13 = z12 || Math.abs(fArr3[i10] - f13) > 0.001f;
                fArr3[i10] = f13;
                boolean z14 = z13 || Math.abs(fArr2[i10] - f12) > 0.001f;
                fArr2[i10] = f12;
                z11 = z14 || Math.abs(fArr[i10] - f11) > 0.001f;
                fArr[i10] = f11;
                i10++;
            }
            if (!z11 && this.f == view.getWidth() && this.g == view.getHeight() && Math.abs(this.h - AndroidUtilities.density) <= 0.01f) {
                z10 = false;
            }
            if (z10) {
                this.c.setIntUniform(NotificationBadge.NewHtcHomeBadger.COUNT, this.e);
                this.c.setFloatUniform("t", fArr4);
                this.c.setFloatUniform("centerX", fArr3);
                this.c.setFloatUniform("centerY", fArr2);
                this.c.setFloatUniform("intensity", fArr);
                L(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.c, "img");
            }
            z4 = z10;
        }
        view.setRenderEffect(arrayList.isEmpty() ? null : this.d);
        if (z4) {
            view.invalidate();
        }
    }
}
