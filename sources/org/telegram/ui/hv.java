package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hv extends v4.s0 {
    public boolean a;
    public final /* synthetic */ yw b;
    public final /* synthetic */ sw c;
    public final /* synthetic */ zw d;

    public hv(zw zwVar, yw ywVar, sw swVar) {
        this.d = zwVar;
        this.b = ywVar;
        this.c = swVar;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        zw zwVar = this.d;
        if (i7 == 1) {
            this.a = true;
            zwVar.f3 = true;
            a8.wa waVar = zwVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) waVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) waVar.c).cancel();
                waVar.c = null;
            }
            if (zwVar.X.r.getText().length() == 0 && zwVar.X.r.hasFocus()) {
                org.telegram.messenger.g0.v1(zwVar.X.r);
                zwVar.X.r.clearFocus();
            }
        } else {
            zwVar.f3 = false;
        }
        if (i7 == 0) {
            this.a = false;
            zwVar.f2 = false;
            boolean z9 = zwVar.c1;
            yw ywVar = this.b;
            if (z9) {
                zwVar.c1 = false;
                if (zwVar.e1) {
                    vw vwVar = ywVar.a;
                    int i10 = vw.B3;
                    vwVar.D1();
                    zwVar.e1 = false;
                }
                ywVar.d.f();
            }
            zw.v1(zwVar, ywVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        dh.g gVar;
        vw vwVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        boolean z9;
        Object[] objArr;
        this.c.V();
        yw ywVar = this.b;
        dv dvVar = ywVar.y;
        int i11 = -i10;
        ArrayList arrayList = dvVar.x;
        ArrayList arrayList2 = dvVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = ((v4.d1) arrayList2.get(i12)).a;
                view.setTranslationY(view.getTranslationY() + i11);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                View view2 = ((v4.d1) arrayList.get(i13)).a;
                view2.setTranslationY(view2.getTranslationY() + i11);
            }
        }
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < recyclerView.getChildCount(); i16++) {
            int R = RecyclerView.R(recyclerView.getChildAt(i16));
            if (R >= 0) {
                if (i14 == -1 || R > i14) {
                    i14 = R;
                }
                if (i15 == -1 || R < i15) {
                    i15 = R;
                }
            }
        }
        zw zwVar = this.d;
        zwVar.C3(ywVar);
        zwVar.Q = true;
        View view3 = zwVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (zwVar.S0 != 10 && this.a && recyclerView.getChildCount() > 0 && i15 != -1) {
            v4.d1 K = recyclerView.K(i15);
            if (!zwVar.l4() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i17 = zwVar.Z1;
                if (i17 == i15) {
                    int i18 = zwVar.a2;
                    int i19 = i18 - top;
                    z9 = top < i18;
                    if (Math.abs(i19) <= 1) {
                        objArr = false;
                        if (objArr != false && zwVar.b2 && (z9 || zwVar.f3)) {
                            zwVar.o4(z9);
                        }
                        zwVar.Z1 = i15;
                        zwVar.a2 = top;
                        zwVar.b2 = true;
                    }
                } else {
                    z9 = i15 > i17;
                }
                objArr = true;
                if (objArr != false) {
                    zwVar.o4(z9);
                }
                zwVar.Z1 = i15;
                zwVar.a2 = top;
                zwVar.b2 = true;
            }
        }
        if (!zwVar.K && recyclerView == zwVar.e0[0].a && !zwVar.k2) {
            lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                if (!lVar2.x() && !zwVar.f2 && !zwVar.G3.c()) {
                    if (i10 > 0 && zwVar.l4() && zwVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i10 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i10 = -top2;
                            }
                        }
                    }
                    zwVar.Q = true;
                    View view4 = zwVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        vv vvVar = zwVar.G3;
        if (vvVar != null && vvVar.c() && (vwVar = ywVar.a) != null) {
            vwVar.invalidate();
        }
        sv svVar = zwVar.E0;
        if (svVar != null && svVar.getPremiumHint() != null && zwVar.E0.getPremiumHint().V) {
            zwVar.E0.getPremiumHint().f(true);
        }
        ?? l42 = zwVar.l4();
        View childAt2 = ywVar.a.getChildAt(l42 == true ? 1 : 0);
        zwVar.e.a(i15 > l42 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - zwVar.N) + ((float) org.telegram.messenger.g0.L(5.0f)) < ((float) ywVar.a.getPaddingTop()), true);
        if (i10 == 0 || (gVar = zwVar.k4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        gVar.f(i7, i10);
    }
}
