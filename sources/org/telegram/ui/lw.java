package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lw extends f2.a1 {
    public boolean a;
    public final /* synthetic */ ey b;
    public final /* synthetic */ xx c;
    public final /* synthetic */ fy d;

    public lw(fy fyVar, ey eyVar, xx xxVar) {
        this.d = fyVar;
        this.b = eyVar;
        this.c = xxVar;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        fy fyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            fyVar.Z2 = true;
            ag.j2 j2Var = fyVar.a0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) j2Var.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) j2Var.c).cancel();
                j2Var.c = null;
            }
            if (fyVar.T.r.getText().length() == 0 && fyVar.T.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(fyVar.T.r);
                fyVar.T.r.clearFocus();
            }
        } else {
            fyVar.Z2 = false;
        }
        if (i10 == 0) {
            this.a = false;
            fyVar.a2 = false;
            boolean z10 = fyVar.X0;
            ey eyVar = this.b;
            if (z10) {
                fyVar.X0 = false;
                if (fyVar.Z0) {
                    ay ayVar = eyVar.a;
                    int i11 = ay.r3;
                    ayVar.A1();
                    fyVar.Z0 = false;
                }
                eyVar.d.l();
            }
            fy.r1(fyVar, eyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lg.e eVar;
        ay ayVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        boolean z10;
        boolean z11;
        this.c.X();
        ey eyVar = this.b;
        hw hwVar = eyVar.x;
        int i12 = -i11;
        ArrayList arrayList = hwVar.x;
        ArrayList arrayList2 = hwVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((f2.n1) arrayList2.get(i13)).a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((f2.n1) arrayList.get(i14)).a;
                view2.setTranslationY(view2.getTranslationY() + i12);
            }
        }
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < recyclerView.getChildCount(); i17++) {
            int R = RecyclerView.R(recyclerView.getChildAt(i17));
            if (R >= 0) {
                if (i15 == -1 || R > i15) {
                    i15 = R;
                }
                if (i16 == -1 || R < i16) {
                    i16 = R;
                }
            }
        }
        fy fyVar = this.d;
        fyVar.r3(eyVar);
        fyVar.M = true;
        View view3 = fyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (fyVar.N0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            f2.n1 K = recyclerView.K(i16);
            if (!fyVar.Z3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = fyVar.U1;
                if (i18 == i16) {
                    int i19 = fyVar.V1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        z11 = false;
                        if (z11 && fyVar.W1 && (z10 || fyVar.Z2)) {
                            fyVar.c4(z10);
                        }
                        fyVar.U1 = i16;
                        fyVar.V1 = top;
                        fyVar.W1 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                z11 = true;
                if (z11) {
                    fyVar.c4(z10);
                }
                fyVar.U1 = i16;
                fyVar.V1 = top;
                fyVar.W1 = true;
            }
        }
        if (!fyVar.G && recyclerView == fyVar.a0[0].a && !fyVar.f2) {
            lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                if (!lVar2.s() && !fyVar.a2 && !fyVar.B3.c()) {
                    if (i11 > 0 && fyVar.Z3() && fyVar.a0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    fyVar.M = true;
                    View view4 = fyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (fyVar.fragmentView != null) {
            fyVar.m3();
        }
        ax axVar = fyVar.B3;
        if (axVar != null && axVar.c() && (ayVar = eyVar.a) != null) {
            ayVar.invalidate();
        }
        xw xwVar = fyVar.A0;
        if (xwVar != null && xwVar.getPremiumHint() != null && fyVar.A0.getPremiumHint().R) {
            fyVar.A0.getPremiumHint().e(true);
        }
        ?? Z3 = fyVar.Z3();
        View childAt2 = eyVar.a.getChildAt(Z3 == true ? 1 : 0);
        fyVar.e.a(i16 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - fyVar.J) + ((float) AndroidUtilities.dp(5.0f)) < ((float) eyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (eVar = fyVar.h4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        eVar.f(i10, i11);
    }
}
