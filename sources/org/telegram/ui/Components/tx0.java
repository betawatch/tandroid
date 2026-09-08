package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class tx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.google.firebase.messaging.n b;
    public final /* synthetic */ int c;

    public /* synthetic */ tx0(com.google.firebase.messaging.n nVar, int i10, int i11) {
        this.a = i11;
        this.b = nVar;
        this.c = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b.d;
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                arrayList.set(this.c, f7);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.b.e;
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                arrayList2.set(this.c, f10);
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) this.b.f;
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                arrayList3.set(this.c, f11);
                break;
            case 3:
                ArrayList arrayList4 = (ArrayList) this.b.d;
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                arrayList4.set(this.c, f12);
                break;
            case 4:
                ArrayList arrayList5 = (ArrayList) this.b.e;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                arrayList5.set(this.c, f13);
                break;
            default:
                ArrayList arrayList6 = (ArrayList) this.b.f;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                arrayList6.set(this.c, f14);
                break;
        }
    }
}
