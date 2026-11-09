package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8.b8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yv0(a8.b8 b8Var, int i7, int i10) {
        this.a = i10;
        this.b = b8Var;
        this.c = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b.d;
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                arrayList.set(this.c, f10);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.b.e;
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                arrayList2.set(this.c, f11);
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) this.b.f;
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                arrayList3.set(this.c, f12);
                break;
            case 3:
                ArrayList arrayList4 = (ArrayList) this.b.d;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                arrayList4.set(this.c, f13);
                break;
            case 4:
                ArrayList arrayList5 = (ArrayList) this.b.e;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                arrayList5.set(this.c, f14);
                break;
            default:
                ArrayList arrayList6 = (ArrayList) this.b.f;
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                arrayList6.set(this.c, f15);
                break;
        }
    }
}
