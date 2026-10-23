package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class hw extends s4.r0 {
    public boolean a;
    public final /* synthetic */ ay b;
    public final /* synthetic */ ux c;
    public final /* synthetic */ cy d;

    public hw(cy cyVar, ay ayVar, ux uxVar) {
        this.d = cyVar;
        this.b = ayVar;
        this.c = uxVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        cy cyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            cyVar.e3 = true;
            a5.a aVar = cyVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
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
                    xx xxVar = ayVar.a;
                    int i11 = xx.t3;
                    xxVar.B1();
                    cyVar.d1 = false;
                }
                ayVar.d.l();
            }
            cy.o1(cyVar, ayVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        xx xxVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        Object[] objArr;
        this.c.X();
        ay ayVar = this.b;
        dw dwVar = ayVar.x;
        int i12 = -i11;
        ArrayList arrayList = dwVar.x;
        ArrayList arrayList2 = dwVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((s4.b1) arrayList2.get(i13)).a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((s4.b1) arrayList.get(i14)).a;
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
        cyVar.p3(ayVar);
        cyVar.Q = true;
        View view3 = cyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (cyVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.b1 K = recyclerView.K(i16);
            if (!cyVar.X3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = cyVar.Y1;
                if (i18 == i16) {
                    int i19 = cyVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        objArr = false;
                        if (objArr != false && cyVar.a2 && (z10 || cyVar.e3)) {
                            cyVar.a4(z10);
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
                    cyVar.a4(z10);
                }
                cyVar.Y1 = i16;
                cyVar.Z1 = top;
                cyVar.a2 = true;
            }
        }
        if (!cyVar.K && recyclerView == cyVar.e0[0].a && !cyVar.j2) {
            kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                if (!kVar2.t() && !cyVar.e2 && !cyVar.G3.c()) {
                    if (i11 > 0 && cyVar.X3() && cyVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
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
        if (cyVar.fragmentView != null) {
            cyVar.j3();
        }
        ww wwVar = cyVar.G3;
        if (wwVar != null && wwVar.c() && (xxVar = ayVar.a) != null) {
            xxVar.invalidate();
        }
        tw twVar = cyVar.E0;
        if (twVar != null && twVar.getPremiumHint() != null && cyVar.E0.getPremiumHint().V) {
            cyVar.E0.getPremiumHint().e(true);
        }
        ?? X3 = cyVar.X3();
        View childAt2 = ayVar.a.getChildAt(X3 == true ? 1 : 0);
        cyVar.e.a(i16 > X3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - cyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) ayVar.a.getPaddingTop()), true);
        if (i11 == 0 || (fVar = cyVar.l4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        fVar.f(i10, i11);
    }
}
