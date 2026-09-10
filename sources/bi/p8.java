package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p8(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.a = i10;
        this.f = obj;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t tVar = (t) this.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8 q8Var = tVar.a;
                float f7 = this.b;
                float f10 = this.c;
                q8Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                q8Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                q8Var.setTranslationX(this.d * floatValue);
                q8Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                q8Var.setAlpha(f11);
                tVar.s = f11;
                tVar.invalidate();
                break;
            default:
                hg.j jVar = (hg.j) this.f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.c;
                float f13 = this.b;
                jVar.k = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                jVar.l = com.google.android.gms.internal.vision.e2.z(f14, f15, floatValue2, f15);
                jVar.a.a(f12, f14, false);
                break;
        }
    }
}
