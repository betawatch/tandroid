package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bx extends s4.s0 {
    public boolean a;
    public final /* synthetic */ vy b;
    public final /* synthetic */ py c;
    public final /* synthetic */ wy d;

    public bx(wy wyVar, vy vyVar, py pyVar) {
        this.d = wyVar;
        this.b = vyVar;
        this.c = pyVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        wy wyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            wyVar.d3 = true;
            a5.a aVar = wyVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            if (wyVar.X.r.getText().length() == 0 && wyVar.X.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(wyVar.X.r);
                wyVar.X.r.clearFocus();
            }
        } else {
            wyVar.d3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            wyVar.e2 = false;
            boolean z10 = wyVar.b1;
            vy vyVar = this.b;
            if (z10) {
                wyVar.b1 = false;
                if (wyVar.d1) {
                    sy syVar = vyVar.a;
                    int i11 = sy.v3;
                    syVar.z1();
                    wyVar.d1 = false;
                }
                vyVar.d.l();
            }
            wy.r1(wyVar, vyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zg.e eVar;
        sy syVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        boolean z10;
        boolean z11;
        this.c.X();
        vy vyVar = this.b;
        xw xwVar = vyVar.x;
        int i12 = -i11;
        ArrayList arrayList = xwVar.x;
        ArrayList arrayList2 = xwVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((s4.c1) arrayList2.get(i13)).a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((s4.c1) arrayList.get(i14)).a;
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
        wy wyVar = this.d;
        wyVar.r3(vyVar);
        wyVar.Q = true;
        View view3 = wyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (wyVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.c1 K = recyclerView.K(i16);
            if (!wyVar.Z3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = wyVar.Y1;
                if (i18 == i16) {
                    int i19 = wyVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        z11 = false;
                        if (z11 && wyVar.a2 && (z10 || wyVar.d3)) {
                            wyVar.c4(z10);
                        }
                        wyVar.Y1 = i16;
                        wyVar.Z1 = top;
                        wyVar.a2 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                z11 = true;
                if (z11) {
                    wyVar.c4(z10);
                }
                wyVar.Y1 = i16;
                wyVar.Z1 = top;
                wyVar.a2 = true;
            }
        }
        if (!wyVar.K && recyclerView == wyVar.e0[0].a && !wyVar.j2) {
            lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                if (!lVar2.s() && !wyVar.e2 && !wyVar.F3.c()) {
                    if (i11 > 0 && wyVar.Z3() && wyVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    wyVar.Q = true;
                    View view4 = wyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (wyVar.fragmentView != null) {
            wyVar.m3();
        }
        qx qxVar = wyVar.F3;
        if (qxVar != null && qxVar.c() && (syVar = vyVar.a) != null) {
            syVar.invalidate();
        }
        nx nxVar = wyVar.E0;
        if (nxVar != null && nxVar.getPremiumHint() != null && wyVar.E0.getPremiumHint().V) {
            wyVar.E0.getPremiumHint().e(true);
        }
        ?? Z3 = wyVar.Z3();
        View childAt2 = vyVar.a.getChildAt(Z3 == true ? 1 : 0);
        wyVar.e.a(i16 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - wyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) vyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (eVar = wyVar.l4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        eVar.f(i10, i11);
    }
}
