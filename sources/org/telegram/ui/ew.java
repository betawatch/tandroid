package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ew extends s4.u0 {
    public boolean a;
    public final /* synthetic */ ay b;
    public final /* synthetic */ tx c;
    public final /* synthetic */ cy d;

    public ew(cy cyVar, ay ayVar, tx txVar) {
        this.d = cyVar;
        this.b = ayVar;
        this.c = txVar;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        cy cyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            cyVar.e3 = true;
            a8.ng ngVar = cyVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) ngVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) ngVar.c).cancel();
                ngVar.c = null;
            }
            if (cyVar.X.r.getText().length() == 0 && cyVar.X.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(cyVar.X.r);
                cyVar.X.r.clearFocus();
            }
        } else {
            cyVar.e3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            cyVar.e2 = false;
            boolean z10 = cyVar.b1;
            ay ayVar = this.b;
            if (z10) {
                cyVar.b1 = false;
                if (cyVar.d1) {
                    wx wxVar = ayVar.a;
                    int i11 = wx.C3;
                    wxVar.G1();
                    cyVar.d1 = false;
                }
                ayVar.d.l();
            }
            cy.s1(cyVar, ayVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ch.f fVar;
        wx wxVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        Object[] objArr;
        this.c.V();
        ay ayVar = this.b;
        aw awVar = ayVar.x;
        int i12 = -i11;
        ArrayList arrayList = awVar.x;
        ArrayList arrayList2 = awVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((s4.e1) arrayList2.get(i13)).a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((s4.e1) arrayList.get(i14)).a;
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
        cy cyVar = this.d;
        cyVar.z3(ayVar);
        cyVar.Q = true;
        View view3 = cyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (cyVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.e1 K = recyclerView.K(i16);
            if (!cyVar.h4() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = cyVar.Y1;
                if (i18 == i16) {
                    int i19 = cyVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        objArr = false;
                        if (objArr != false && cyVar.a2 && (z10 || cyVar.e3)) {
                            cyVar.k4(z10);
                        }
                        cyVar.Y1 = i16;
                        cyVar.Z1 = top;
                        cyVar.a2 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                objArr = true;
                if (objArr != false) {
                    cyVar.k4(z10);
                }
                cyVar.Y1 = i16;
                cyVar.Z1 = top;
                cyVar.a2 = true;
            }
        }
        if (!cyVar.K && recyclerView == cyVar.e0[0].a && !cyVar.j2) {
            kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                if (!kVar2.q() && !cyVar.e2 && !cyVar.G3.c()) {
                    if (i11 > 0 && cyVar.h4() && cyVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    cyVar.Q = true;
                    View view4 = cyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        tw twVar = cyVar.G3;
        if (twVar != null && twVar.c() && (wxVar = ayVar.a) != null) {
            wxVar.invalidate();
        }
        qw qwVar = cyVar.E0;
        if (qwVar != null && qwVar.getPremiumHint() != null && cyVar.E0.getPremiumHint().V) {
            cyVar.E0.getPremiumHint().e(true);
        }
        ?? h42 = cyVar.h4();
        View childAt2 = ayVar.a.getChildAt(h42 == true ? 1 : 0);
        cyVar.e.a(i16 > h42 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - cyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) ayVar.a.getPaddingTop()), true);
        if (i11 == 0 || (fVar = cyVar.k4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        fVar.f(i10, i11);
    }
}
