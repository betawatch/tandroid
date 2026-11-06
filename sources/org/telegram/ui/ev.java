package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ev extends v4.s0 {
    public boolean a;
    public final /* synthetic */ vw b;
    public final /* synthetic */ pw c;
    public final /* synthetic */ ww d;

    public ev(ww wwVar, vw vwVar, pw pwVar) {
        this.d = wwVar;
        this.b = vwVar;
        this.c = pwVar;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        ww wwVar = this.d;
        if (i7 == 1) {
            this.a = true;
            wwVar.e3 = true;
            a8.wa waVar = wwVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) waVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) waVar.c).cancel();
                waVar.c = null;
            }
            if (wwVar.X.r.getText().length() == 0 && wwVar.X.r.hasFocus()) {
                org.telegram.messenger.g0.v1(wwVar.X.r);
                wwVar.X.r.clearFocus();
            }
        } else {
            wwVar.e3 = false;
        }
        if (i7 == 0) {
            this.a = false;
            wwVar.e2 = false;
            boolean z9 = wwVar.b1;
            vw vwVar = this.b;
            if (z9) {
                wwVar.b1 = false;
                if (wwVar.d1) {
                    sw swVar = vwVar.a;
                    int i10 = sw.B3;
                    swVar.D1();
                    wwVar.d1 = false;
                }
                vwVar.d.f();
            }
            ww.v1(wwVar, vwVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        dh.g gVar;
        sw swVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z9;
        Object[] objArr;
        this.c.V();
        vw vwVar = this.b;
        av avVar = vwVar.y;
        int i11 = -i10;
        ArrayList arrayList = avVar.x;
        ArrayList arrayList2 = avVar.o;
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
        ww wwVar = this.d;
        wwVar.C3(vwVar);
        wwVar.Q = true;
        View view3 = wwVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (wwVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i15 != -1) {
            v4.d1 K = recyclerView.K(i15);
            if (!wwVar.l4() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i17 = wwVar.Y1;
                if (i17 == i15) {
                    int i18 = wwVar.Z1;
                    int i19 = i18 - top;
                    z9 = top < i18;
                    if (Math.abs(i19) <= 1) {
                        objArr = false;
                        if (objArr != false && wwVar.a2 && (z9 || wwVar.e3)) {
                            wwVar.o4(z9);
                        }
                        wwVar.Y1 = i15;
                        wwVar.Z1 = top;
                        wwVar.a2 = true;
                    }
                } else {
                    z9 = i15 > i17;
                }
                objArr = true;
                if (objArr != false) {
                    wwVar.o4(z9);
                }
                wwVar.Y1 = i15;
                wwVar.Z1 = top;
                wwVar.a2 = true;
            }
        }
        if (!wwVar.K && recyclerView == wwVar.e0[0].a && !wwVar.j2) {
            kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                if (!kVar2.v() && !wwVar.e2 && !wwVar.F3.c()) {
                    if (i10 > 0 && wwVar.l4() && wwVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i10 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i10 = -top2;
                            }
                        }
                    }
                    wwVar.Q = true;
                    View view4 = wwVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        sv svVar = wwVar.F3;
        if (svVar != null && svVar.c() && (swVar = vwVar.a) != null) {
            swVar.invalidate();
        }
        pv pvVar = wwVar.E0;
        if (pvVar != null && pvVar.getPremiumHint() != null && wwVar.E0.getPremiumHint().V) {
            wwVar.E0.getPremiumHint().f(true);
        }
        ?? l42 = wwVar.l4();
        View childAt2 = vwVar.a.getChildAt(l42 == true ? 1 : 0);
        wwVar.e.a(i15 > l42 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - wwVar.N) + ((float) org.telegram.messenger.g0.L(5.0f)) < ((float) vwVar.a.getPaddingTop()), true);
        if (i10 == 0 || (gVar = wwVar.j4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        gVar.f(i7, i10);
    }
}
