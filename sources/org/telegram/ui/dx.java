package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dx extends s4.r0 {
    public boolean a;
    public final /* synthetic */ xy b;
    public final /* synthetic */ ry c;
    public final /* synthetic */ yy d;

    public dx(yy yyVar, xy xyVar, ry ryVar) {
        this.d = yyVar;
        this.b = xyVar;
        this.c = ryVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        yy yyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            yyVar.d3 = true;
            a5.a aVar = yyVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            if (yyVar.X.r.getText().length() == 0 && yyVar.X.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(yyVar.X.r);
                yyVar.X.r.clearFocus();
            }
        } else {
            yyVar.d3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            yyVar.e2 = false;
            boolean z10 = yyVar.b1;
            xy xyVar = this.b;
            if (z10) {
                yyVar.b1 = false;
                if (yyVar.d1) {
                    uy uyVar = xyVar.a;
                    int i11 = uy.t3;
                    uyVar.B1();
                    yyVar.d1 = false;
                }
                xyVar.d.l();
            }
            yy.o1(yyVar, xyVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        uy uyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        Object[] objArr;
        this.c.X();
        xy xyVar = this.b;
        zw zwVar = xyVar.x;
        int i12 = -i11;
        ArrayList arrayList = zwVar.x;
        ArrayList arrayList2 = zwVar.o;
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
        yy yyVar = this.d;
        yyVar.o3(xyVar);
        yyVar.Q = true;
        View view3 = yyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (yyVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.b1 K = recyclerView.K(i16);
            if (!yyVar.W3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = yyVar.Y1;
                if (i18 == i16) {
                    int i19 = yyVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        objArr = false;
                        if (objArr != false && yyVar.a2 && (z10 || yyVar.d3)) {
                            yyVar.Z3(z10);
                        }
                        yyVar.Y1 = i16;
                        yyVar.Z1 = top;
                        yyVar.a2 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                objArr = true;
                if (objArr != false) {
                    yyVar.Z3(z10);
                }
                yyVar.Y1 = i16;
                yyVar.Z1 = top;
                yyVar.a2 = true;
            }
        }
        if (!yyVar.K && recyclerView == yyVar.e0[0].a && !yyVar.j2) {
            kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                if (!kVar2.t() && !yyVar.e2 && !yyVar.F3.c()) {
                    if (i11 > 0 && yyVar.W3() && yyVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    yyVar.Q = true;
                    View view4 = yyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (yyVar.fragmentView != null) {
            yyVar.j3();
        }
        sx sxVar = yyVar.F3;
        if (sxVar != null && sxVar.c() && (uyVar = xyVar.a) != null) {
            uyVar.invalidate();
        }
        px pxVar = yyVar.E0;
        if (pxVar != null && pxVar.getPremiumHint() != null && yyVar.E0.getPremiumHint().V) {
            yyVar.E0.getPremiumHint().e(true);
        }
        ?? W3 = yyVar.W3();
        View childAt2 = xyVar.a.getChildAt(W3 == true ? 1 : 0);
        yyVar.e.a(i16 > W3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - yyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) xyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (fVar = yyVar.k4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        fVar.f(i10, i11);
    }
}
