// default package

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bzc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ hzc a;
    public final /* synthetic */ wzc b;
    public final /* synthetic */ wzc c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public bzc(hzc hzcVar, wzc wzcVar, wzc wzcVar2, int i, View view) {
        this.a = hzcVar;
        this.b = wzcVar;
        this.c = wzcVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        hzc hzcVar = this.a;
        gzc gzcVar = hzcVar.a;
        gzcVar.d(animatedFraction);
        float b = gzcVar.b();
        PathInterpolator pathInterpolator = dzc.e;
        int i = Build.VERSION.SDK_INT;
        wzc wzcVar = this.b;
        mzc lzcVar = i >= 34 ? new lzc(wzcVar) : i >= 30 ? new kzc(wzcVar) : i >= 29 ? new jzc(wzcVar) : new izc(wzcVar);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            tzc tzcVar = wzcVar.a;
            if (i3 == 0) {
                lzcVar.c(i2, tzcVar.f(i2));
            } else {
                iq5 f = tzcVar.f(i2);
                iq5 f2 = this.c.a.f(i2);
                float f3 = 1.0f - b;
                lzcVar.c(i2, wzc.e(f, (int) (((f.a - f2.a) * f3) + 0.5d), (int) (((f.b - f2.b) * f3) + 0.5d), (int) (((f.c - f2.c) * f3) + 0.5d), (int) (((f.d - f2.d) * f3) + 0.5d)));
            }
        }
        dzc.g(this.e, lzcVar.b(), Collections.singletonList(hzcVar));
    }
}
