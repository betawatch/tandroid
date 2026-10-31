package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jw extends s4.s0 {
    public boolean a;
    public final /* synthetic */ zx b;
    public final /* synthetic */ tx c;
    public final /* synthetic */ ay d;

    public jw(ay ayVar, zx zxVar, tx txVar) {
        this.d = ayVar;
        this.b = zxVar;
        this.c = txVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        ay ayVar = this.d;
        if (i10 == 1) {
            this.a = true;
            ayVar.e3 = true;
            a5.a aVar = ayVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            if (ayVar.X.r.getText().length() == 0 && ayVar.X.r.hasFocus()) {
                org.telegram.messenger.i0.v1(ayVar.X.r);
                ayVar.X.r.clearFocus();
            }
        } else {
            ayVar.e3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            ayVar.e2 = false;
            boolean z10 = ayVar.b1;
            zx zxVar = this.b;
            if (z10) {
                ayVar.b1 = false;
                if (ayVar.d1) {
                    wx wxVar = zxVar.a;
                    int i11 = wx.B3;
                    wxVar.D1();
                    ayVar.d1 = false;
                }
                zxVar.d.f();
            }
            ay.u1(ayVar, zxVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        tg.f fVar;
        wx wxVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        boolean z10;
        Object[] objArr;
        this.c.V();
        zx zxVar = this.b;
        fw fwVar = zxVar.y;
        int i12 = -i11;
        ArrayList arrayList = fwVar.x;
        ArrayList arrayList2 = fwVar.o;
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
        ay ayVar = this.d;
        ayVar.B3(zxVar);
        ayVar.Q = true;
        View view3 = ayVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (ayVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.c1 K = recyclerView.K(i16);
            if (!ayVar.k4() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = ayVar.Y1;
                if (i18 == i16) {
                    int i19 = ayVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        objArr = false;
                        if (objArr != false && ayVar.a2 && (z10 || ayVar.e3)) {
                            ayVar.n4(z10);
                        }
                        ayVar.Y1 = i16;
                        ayVar.Z1 = top;
                        ayVar.a2 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                objArr = true;
                if (objArr != false) {
                    ayVar.n4(z10);
                }
                ayVar.Y1 = i16;
                ayVar.Z1 = top;
                ayVar.a2 = true;
            }
        }
        if (!ayVar.K && recyclerView == ayVar.e0[0].a && !ayVar.j2) {
            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                if (!lVar2.u() && !ayVar.e2 && !ayVar.F3.c()) {
                    if (i11 > 0 && ayVar.k4() && ayVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    ayVar.Q = true;
                    View view4 = ayVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        xw xwVar = ayVar.F3;
        if (xwVar != null && xwVar.c() && (wxVar = zxVar.a) != null) {
            wxVar.invalidate();
        }
        uw uwVar = ayVar.E0;
        if (uwVar != null && uwVar.getPremiumHint() != null && ayVar.E0.getPremiumHint().V) {
            ayVar.E0.getPremiumHint().e(true);
        }
        ?? k42 = ayVar.k4();
        View childAt2 = zxVar.a.getChildAt(k42 == true ? 1 : 0);
        ayVar.e.a(i16 > k42 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - ayVar.N) + ((float) org.telegram.messenger.i0.L(5.0f)) < ((float) zxVar.a.getPaddingTop()), true);
        if (i11 == 0 || (fVar = ayVar.j4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        fVar.f(i10, i11);
    }
}
