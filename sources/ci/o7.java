package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class o7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o7(Object obj, float f7, float f10, float f11, float f12, int i10) {
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
                p pVar = (p) this.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7 p7Var = pVar.a;
                float f7 = this.b;
                float f10 = this.c;
                p7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                p7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                p7Var.setTranslationX(this.d * floatValue);
                p7Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                p7Var.setAlpha(f11);
                pVar.s = f11;
                pVar.invalidate();
                break;
            default:
                ig.j jVar = (ig.j) this.f;
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
