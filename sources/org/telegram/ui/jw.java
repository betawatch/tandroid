package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jw extends f2.d1 {
    public boolean a;
    public final /* synthetic */ cy b;
    public final /* synthetic */ vx c;
    public final /* synthetic */ dy d;

    public jw(dy dyVar, cy cyVar, vx vxVar) {
        this.d = dyVar;
        this.b = cyVar;
        this.c = vxVar;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        dy dyVar = this.d;
        if (i9 == 1) {
            this.a = true;
            dyVar.Z2 = true;
            a6.a aVar = dyVar.a0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.b;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.b).cancel();
                aVar.b = null;
            }
            if (dyVar.T.r.getText().length() == 0 && dyVar.T.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(dyVar.T.r);
                dyVar.T.r.clearFocus();
            }
        } else {
            dyVar.Z2 = false;
        }
        if (i9 == 0) {
            this.a = false;
            dyVar.a2 = false;
            boolean z10 = dyVar.X0;
            cy cyVar = this.b;
            if (z10) {
                dyVar.X0 = false;
                if (dyVar.Z0) {
                    yx yxVar = cyVar.a;
                    int i10 = yx.r3;
                    yxVar.A1();
                    dyVar.Z0 = false;
                }
                cyVar.d.l();
            }
            dy.r1(dyVar, cyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ig.e eVar;
        yx yxVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        boolean z11;
        this.c.X();
        cy cyVar = this.b;
        fw fwVar = cyVar.x;
        int i11 = -i10;
        ArrayList arrayList = fwVar.x;
        ArrayList arrayList2 = fwVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = ((f2.q1) arrayList2.get(i12)).a;
                view.setTranslationY(view.getTranslationY() + i11);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                View view2 = ((f2.q1) arrayList.get(i13)).a;
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
        dy dyVar = this.d;
        dyVar.r3(cyVar);
        dyVar.M = true;
        View view3 = dyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (dyVar.N0 != 10 && this.a && recyclerView.getChildCount() > 0 && i15 != -1) {
            f2.q1 K = recyclerView.K(i15);
            if (!dyVar.Z3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i17 = dyVar.U1;
                if (i17 == i15) {
                    int i18 = dyVar.V1;
                    int i19 = i18 - top;
                    z10 = top < i18;
                    if (Math.abs(i19) <= 1) {
                        z11 = false;
                        if (z11 && dyVar.W1 && (z10 || dyVar.Z2)) {
                            dyVar.c4(z10);
                        }
                        dyVar.U1 = i15;
                        dyVar.V1 = top;
                        dyVar.W1 = true;
                    }
                } else {
                    z10 = i15 > i17;
                }
                z11 = true;
                if (z11) {
                    dyVar.c4(z10);
                }
                dyVar.U1 = i15;
                dyVar.V1 = top;
                dyVar.W1 = true;
            }
        }
        if (!dyVar.G && recyclerView == dyVar.a0[0].a && !dyVar.f2) {
            kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                if (!kVar2.s() && !dyVar.a2 && !dyVar.B3.c()) {
                    if (i10 > 0 && dyVar.Z3() && dyVar.a0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i10 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i10 = -top2;
                            }
                        }
                    }
                    dyVar.M = true;
                    View view4 = dyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (dyVar.fragmentView != null) {
            dyVar.m3();
        }
        yw ywVar = dyVar.B3;
        if (ywVar != null && ywVar.c() && (yxVar = cyVar.a) != null) {
            yxVar.invalidate();
        }
        vw vwVar = dyVar.A0;
        if (vwVar != null && vwVar.getPremiumHint() != null && dyVar.A0.getPremiumHint().R) {
            dyVar.A0.getPremiumHint().e(true);
        }
        ?? Z3 = dyVar.Z3();
        View childAt2 = cyVar.a.getChildAt(Z3 == true ? 1 : 0);
        dyVar.e.a(i15 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - dyVar.J) + ((float) AndroidUtilities.dp(5.0f)) < ((float) cyVar.a.getPaddingTop()), true);
        if (i10 == 0 || (eVar = dyVar.h4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        eVar.f(i9, i10);
    }
}
