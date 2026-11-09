package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gv extends v4.s0 {
    public boolean a;
    public final /* synthetic */ xw b;
    public final /* synthetic */ rw c;
    public final /* synthetic */ yw d;

    public gv(yw ywVar, xw xwVar, rw rwVar) {
        this.d = ywVar;
        this.b = xwVar;
        this.c = rwVar;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        yw ywVar = this.d;
        if (i7 == 1) {
            this.a = true;
            ywVar.f3 = true;
            a8.wa waVar = ywVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) waVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) waVar.c).cancel();
                waVar.c = null;
            }
            if (ywVar.X.r.getText().length() == 0 && ywVar.X.r.hasFocus()) {
                org.telegram.messenger.g0.v1(ywVar.X.r);
                ywVar.X.r.clearFocus();
            }
        } else {
            ywVar.f3 = false;
        }
        if (i7 == 0) {
            this.a = false;
            ywVar.f2 = false;
            boolean z9 = ywVar.c1;
            xw xwVar = this.b;
            if (z9) {
                ywVar.c1 = false;
                if (ywVar.e1) {
                    uw uwVar = xwVar.a;
                    int i10 = uw.B3;
                    uwVar.D1();
                    ywVar.e1 = false;
                }
                xwVar.d.f();
            }
            yw.v1(ywVar, xwVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        dh.g gVar;
        uw uwVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z9;
        Object[] objArr;
        this.c.V();
        xw xwVar = this.b;
        cv cvVar = xwVar.y;
        int i11 = -i10;
        ArrayList arrayList = cvVar.x;
        ArrayList arrayList2 = cvVar.o;
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
        yw ywVar = this.d;
        ywVar.C3(xwVar);
        ywVar.Q = true;
        View view3 = ywVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (ywVar.S0 != 10 && this.a && recyclerView.getChildCount() > 0 && i15 != -1) {
            v4.d1 K = recyclerView.K(i15);
            if (!ywVar.l4() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i17 = ywVar.Z1;
                if (i17 == i15) {
                    int i18 = ywVar.a2;
                    int i19 = i18 - top;
                    z9 = top < i18;
                    if (Math.abs(i19) <= 1) {
                        objArr = false;
                        if (objArr != false && ywVar.b2 && (z9 || ywVar.f3)) {
                            ywVar.o4(z9);
                        }
                        ywVar.Z1 = i15;
                        ywVar.a2 = top;
                        ywVar.b2 = true;
                    }
                } else {
                    z9 = i15 > i17;
                }
                objArr = true;
                if (objArr != false) {
                    ywVar.o4(z9);
                }
                ywVar.Z1 = i15;
                ywVar.a2 = top;
                ywVar.b2 = true;
            }
        }
        if (!ywVar.K && recyclerView == ywVar.e0[0].a && !ywVar.k2) {
            kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                if (!kVar2.w() && !ywVar.f2 && !ywVar.G3.c()) {
                    if (i10 > 0 && ywVar.l4() && ywVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i10 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i10 = -top2;
                            }
                        }
                    }
                    ywVar.Q = true;
                    View view4 = ywVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        uv uvVar = ywVar.G3;
        if (uvVar != null && uvVar.c() && (uwVar = xwVar.a) != null) {
            uwVar.invalidate();
        }
        rv rvVar = ywVar.E0;
        if (rvVar != null && rvVar.getPremiumHint() != null && ywVar.E0.getPremiumHint().V) {
            ywVar.E0.getPremiumHint().f(true);
        }
        ?? l42 = ywVar.l4();
        View childAt2 = xwVar.a.getChildAt(l42 == true ? 1 : 0);
        ywVar.e.a(i15 > l42 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - ywVar.N) + ((float) org.telegram.messenger.g0.L(5.0f)) < ((float) xwVar.a.getPaddingTop()), true);
        if (i10 == 0 || (gVar = ywVar.k4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        gVar.f(i7, i10);
    }
}
