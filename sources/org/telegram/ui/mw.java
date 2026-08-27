package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mw extends f2.b1 {
    public boolean a;
    public final /* synthetic */ fy b;
    public final /* synthetic */ yx c;
    public final /* synthetic */ gy d;

    public mw(gy gyVar, fy fyVar, yx yxVar) {
        this.d = gyVar;
        this.b = fyVar;
        this.c = yxVar;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        gy gyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            gyVar.Z2 = true;
            b6.a aVar = gyVar.a0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.b;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.b).cancel();
                aVar.b = null;
            }
            if (gyVar.T.r.getText().length() == 0 && gyVar.T.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(gyVar.T.r);
                gyVar.T.r.clearFocus();
            }
        } else {
            gyVar.Z2 = false;
        }
        if (i10 == 0) {
            this.a = false;
            gyVar.a2 = false;
            boolean z10 = gyVar.X0;
            fy fyVar = this.b;
            if (z10) {
                gyVar.X0 = false;
                if (gyVar.Z0) {
                    cy cyVar = fyVar.a;
                    int i11 = cy.r3;
                    cyVar.A1();
                    gyVar.Z0 = false;
                }
                fyVar.d.l();
            }
            gy.r1(gyVar, fyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        cy cyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        boolean z11;
        this.c.X();
        fy fyVar = this.b;
        iw iwVar = fyVar.x;
        int i12 = -i11;
        ArrayList arrayList = iwVar.x;
        ArrayList arrayList2 = iwVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((f2.o1) arrayList2.get(i13)).a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((f2.o1) arrayList.get(i14)).a;
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
        gy gyVar = this.d;
        gyVar.r3(fyVar);
        gyVar.M = true;
        View view3 = gyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (gyVar.N0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            f2.o1 K = recyclerView.K(i16);
            if (!gyVar.Z3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = gyVar.U1;
                if (i18 == i16) {
                    int i19 = gyVar.V1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        z11 = false;
                        if (z11 && gyVar.W1 && (z10 || gyVar.Z2)) {
                            gyVar.c4(z10);
                        }
                        gyVar.U1 = i16;
                        gyVar.V1 = top;
                        gyVar.W1 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                z11 = true;
                if (z11) {
                    gyVar.c4(z10);
                }
                gyVar.U1 = i16;
                gyVar.V1 = top;
                gyVar.W1 = true;
            }
        }
        if (!gyVar.G && recyclerView == gyVar.a0[0].a && !gyVar.f2) {
            kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                if (!kVar2.t() && !gyVar.a2 && !gyVar.B3.c()) {
                    if (i11 > 0 && gyVar.Z3() && gyVar.a0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    gyVar.M = true;
                    View view4 = gyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (gyVar.fragmentView != null) {
            gyVar.m3();
        }
        bx bxVar = gyVar.B3;
        if (bxVar != null && bxVar.c() && (cyVar = fyVar.a) != null) {
            cyVar.invalidate();
        }
        yw ywVar = gyVar.A0;
        if (ywVar != null && ywVar.getPremiumHint() != null && gyVar.A0.getPremiumHint().R) {
            gyVar.A0.getPremiumHint().e(true);
        }
        ?? Z3 = gyVar.Z3();
        View childAt2 = fyVar.a.getChildAt(Z3 == true ? 1 : 0);
        gyVar.e.a(i16 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - gyVar.J) + ((float) AndroidUtilities.dp(5.0f)) < ((float) fyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (eVar = gyVar.h4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        eVar.f(i10, i11);
    }
}
