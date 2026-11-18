package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class iv extends v4.u0 {
    public boolean a;
    public final /* synthetic */ bx b;
    public final /* synthetic */ vw c;
    public final /* synthetic */ cx d;

    public iv(cx cxVar, bx bxVar, vw vwVar) {
        this.d = cxVar;
        this.b = bxVar;
        this.c = vwVar;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        cx cxVar = this.d;
        if (i7 == 1) {
            this.a = true;
            cxVar.g3 = true;
            a8.xa xaVar = cxVar.f0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) xaVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) xaVar.c).cancel();
                xaVar.c = null;
            }
            if (cxVar.Y.r.getText().length() == 0 && cxVar.Y.r.hasFocus()) {
                org.telegram.messenger.g0.v1(cxVar.Y.r);
                cxVar.Y.r.clearFocus();
            }
        } else {
            cxVar.g3 = false;
        }
        if (i7 == 0) {
            this.a = false;
            cxVar.g2 = false;
            boolean z10 = cxVar.d1;
            bx bxVar = this.b;
            if (z10) {
                cxVar.d1 = false;
                if (cxVar.f1) {
                    yw ywVar = bxVar.a;
                    int i10 = yw.C3;
                    ywVar.D1();
                    cxVar.f1 = false;
                }
                bxVar.d.f();
            }
            cx.w1(cxVar, bxVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        dh.g gVar;
        yw ywVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        Object[] objArr;
        this.c.V();
        bx bxVar = this.b;
        ev evVar = bxVar.y;
        int i11 = -i10;
        ArrayList arrayList = evVar.x;
        ArrayList arrayList2 = evVar.o;
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
        cx cxVar = this.d;
        cxVar.C3(bxVar);
        cxVar.R = true;
        View view3 = cxVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (cxVar.T0 != 10 && this.a && recyclerView.getChildCount() > 0 && i15 != -1) {
            v4.f1 K = recyclerView.K(i15);
            if (!cxVar.n4() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i17 = cxVar.a2;
                if (i17 == i15) {
                    int i18 = cxVar.b2;
                    int i19 = i18 - top;
                    z10 = top < i18;
                    if (Math.abs(i19) <= 1) {
                        objArr = false;
                        if (objArr != false && cxVar.c2 && (z10 || cxVar.g3)) {
                            cxVar.q4(z10);
                        }
                        cxVar.a2 = i15;
                        cxVar.b2 = top;
                        cxVar.c2 = true;
                    }
                } else {
                    z10 = i15 > i17;
                }
                objArr = true;
                if (objArr != false) {
                    cxVar.q4(z10);
                }
                cxVar.a2 = i15;
                cxVar.b2 = top;
                cxVar.c2 = true;
            }
        }
        if (!cxVar.L && recyclerView == cxVar.f0[0].a && !cxVar.l2) {
            kVar = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
                if (!kVar2.y() && !cxVar.g2 && !cxVar.H3.c()) {
                    if (i10 > 0 && cxVar.n4() && cxVar.f0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i10 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i10 = -top2;
                            }
                        }
                    }
                    cxVar.R = true;
                    View view4 = cxVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        xv xvVar = cxVar.H3;
        if (xvVar != null && xvVar.c() && (ywVar = bxVar.a) != null) {
            ywVar.invalidate();
        }
        tv tvVar = cxVar.F0;
        if (tvVar != null && tvVar.getPremiumHint() != null && cxVar.F0.getPremiumHint().W) {
            cxVar.F0.getPremiumHint().f(true);
        }
        ?? n42 = cxVar.n4();
        View childAt2 = bxVar.a.getChildAt(n42 == true ? 1 : 0);
        cxVar.e.a(i15 > n42 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - cxVar.O) + ((float) org.telegram.messenger.g0.L(5.0f)) < ((float) bxVar.a.getPaddingTop()), true);
        if (i10 == 0 || (gVar = cxVar.o4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        gVar.f(i7, i10);
    }
}
