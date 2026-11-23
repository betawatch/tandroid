package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hv extends v4.u0 {
    public boolean a;
    public final /* synthetic */ ax b;
    public final /* synthetic */ uw c;
    public final /* synthetic */ bx d;

    public hv(bx bxVar, ax axVar, uw uwVar) {
        this.d = bxVar;
        this.b = axVar;
        this.c = uwVar;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        bx bxVar = this.d;
        if (i7 == 1) {
            this.a = true;
            bxVar.g3 = true;
            a8.xa xaVar = bxVar.f0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) xaVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) xaVar.c).cancel();
                xaVar.c = null;
            }
            if (bxVar.Y.r.getText().length() == 0 && bxVar.Y.r.hasFocus()) {
                org.telegram.messenger.g0.v1(bxVar.Y.r);
                bxVar.Y.r.clearFocus();
            }
        } else {
            bxVar.g3 = false;
        }
        if (i7 == 0) {
            this.a = false;
            bxVar.g2 = false;
            boolean z10 = bxVar.d1;
            ax axVar = this.b;
            if (z10) {
                bxVar.d1 = false;
                if (bxVar.f1) {
                    xw xwVar = axVar.a;
                    int i10 = xw.C3;
                    xwVar.D1();
                    bxVar.f1 = false;
                }
                axVar.d.f();
            }
            bx.w1(bxVar, axVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        dh.g gVar;
        xw xwVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        Object[] objArr;
        this.c.V();
        ax axVar = this.b;
        dv dvVar = axVar.y;
        int i11 = -i10;
        ArrayList arrayList = dvVar.x;
        ArrayList arrayList2 = dvVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = ((v4.f1) arrayList2.get(i12)).a;
                view.setTranslationY(view.getTranslationY() + i11);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                View view2 = ((v4.f1) arrayList.get(i13)).a;
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
        bx bxVar = this.d;
        bxVar.C3(axVar);
        bxVar.R = true;
        View view3 = bxVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (bxVar.T0 != 10 && this.a && recyclerView.getChildCount() > 0 && i15 != -1) {
            v4.f1 K = recyclerView.K(i15);
            if (!bxVar.n4() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i17 = bxVar.a2;
                if (i17 == i15) {
                    int i18 = bxVar.b2;
                    int i19 = i18 - top;
                    z10 = top < i18;
                    if (Math.abs(i19) <= 1) {
                        objArr = false;
                        if (objArr != false && bxVar.c2 && (z10 || bxVar.g3)) {
                            bxVar.q4(z10);
                        }
                        bxVar.a2 = i15;
                        bxVar.b2 = top;
                        bxVar.c2 = true;
                    }
                } else {
                    z10 = i15 > i17;
                }
                objArr = true;
                if (objArr != false) {
                    bxVar.q4(z10);
                }
                bxVar.a2 = i15;
                bxVar.b2 = top;
                bxVar.c2 = true;
            }
        }
        if (!bxVar.L && recyclerView == bxVar.f0[0].a && !bxVar.l2) {
            kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                if (!kVar2.x() && !bxVar.g2 && !bxVar.H3.c()) {
                    if (i10 > 0 && bxVar.n4() && bxVar.f0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i10 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i10 = -top2;
                            }
                        }
                    }
                    bxVar.R = true;
                    View view4 = bxVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        wv wvVar = bxVar.H3;
        if (wvVar != null && wvVar.c() && (xwVar = axVar.a) != null) {
            xwVar.invalidate();
        }
        sv svVar = bxVar.F0;
        if (svVar != null && svVar.getPremiumHint() != null && bxVar.F0.getPremiumHint().W) {
            bxVar.F0.getPremiumHint().f(true);
        }
        ?? n42 = bxVar.n4();
        View childAt2 = axVar.a.getChildAt(n42 == true ? 1 : 0);
        bxVar.e.a(i15 > n42 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - bxVar.O) + ((float) org.telegram.messenger.g0.L(5.0f)) < ((float) axVar.a.getPaddingTop()), true);
        if (i10 == 0 || (gVar = bxVar.o4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        gVar.f(i7, i10);
    }
}
