package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bv extends u4.t0 {
    public boolean a;
    public final /* synthetic */ tw b;
    public final /* synthetic */ mw c;
    public final /* synthetic */ uw d;

    public bv(uw uwVar, tw twVar, mw mwVar) {
        this.d = uwVar;
        this.b = twVar;
        this.c = mwVar;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        uw uwVar = this.d;
        if (i3 == 1) {
            this.a = true;
            uwVar.f3 = true;
            b8.kg kgVar = uwVar.f0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) kgVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) kgVar.c).cancel();
                kgVar.c = null;
            }
            if (uwVar.Y.r.getText().length() == 0 && uwVar.Y.r.hasFocus()) {
                org.telegram.messenger.g0.v1(uwVar.Y.r);
                uwVar.Y.r.clearFocus();
            }
        } else {
            uwVar.f3 = false;
        }
        if (i3 == 0) {
            this.a = false;
            uwVar.f2 = false;
            boolean z10 = uwVar.c1;
            tw twVar = this.b;
            if (z10) {
                uwVar.c1 = false;
                if (uwVar.e1) {
                    pw pwVar = twVar.a;
                    int i10 = pw.C3;
                    pwVar.D1();
                    uwVar.e1 = false;
                }
                twVar.d.f();
            }
            uw.v1(uwVar, twVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        eh.g gVar;
        pw pwVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        Object[] objArr;
        this.c.V();
        tw twVar = this.b;
        xu xuVar = twVar.y;
        int i11 = -i10;
        ArrayList arrayList = xuVar.x;
        ArrayList arrayList2 = xuVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = ((u4.d1) arrayList2.get(i12)).a;
                view.setTranslationY(view.getTranslationY() + i11);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                View view2 = ((u4.d1) arrayList.get(i13)).a;
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
        uw uwVar = this.d;
        uwVar.C3(twVar);
        uwVar.R = true;
        View view3 = uwVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (uwVar.S0 != 10 && this.a && recyclerView.getChildCount() > 0 && i15 != -1) {
            u4.d1 K = recyclerView.K(i15);
            if (!uwVar.l4() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i17 = uwVar.Z1;
                if (i17 == i15) {
                    int i18 = uwVar.a2;
                    int i19 = i18 - top;
                    z10 = top < i18;
                    if (Math.abs(i19) <= 1) {
                        objArr = false;
                        if (objArr != false && uwVar.b2 && (z10 || uwVar.f3)) {
                            uwVar.o4(z10);
                        }
                        uwVar.Z1 = i15;
                        uwVar.a2 = top;
                        uwVar.b2 = true;
                    }
                } else {
                    z10 = i15 > i17;
                }
                objArr = true;
                if (objArr != false) {
                    uwVar.o4(z10);
                }
                uwVar.Z1 = i15;
                uwVar.a2 = top;
                uwVar.b2 = true;
            }
        }
        if (!uwVar.L && recyclerView == uwVar.f0[0].a && !uwVar.k2) {
            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                if (!kVar2.v() && !uwVar.f2 && !uwVar.G3.c()) {
                    if (i10 > 0 && uwVar.l4() && uwVar.f0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i10 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i10 = -top2;
                            }
                        }
                    }
                    uwVar.R = true;
                    View view4 = uwVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        pv pvVar = uwVar.G3;
        if (pvVar != null && pvVar.c() && (pwVar = twVar.a) != null) {
            pwVar.invalidate();
        }
        mv mvVar = uwVar.F0;
        if (mvVar != null && mvVar.getPremiumHint() != null && uwVar.F0.getPremiumHint().W) {
            uwVar.F0.getPremiumHint().f(true);
        }
        ?? l42 = uwVar.l4();
        View childAt2 = twVar.a.getChildAt(l42 == true ? 1 : 0);
        uwVar.e.a(i15 > l42 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - uwVar.O) + ((float) org.telegram.messenger.g0.L(5.0f)) < ((float) twVar.a.getPaddingTop()), true);
        if (i10 == 0 || (gVar = uwVar.k4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        gVar.f(i3, i10);
    }
}
