package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class jw extends s4.r0 {
    public boolean a;
    public final /* synthetic */ dy b;
    public final /* synthetic */ wx c;
    public final /* synthetic */ ey d;

    public jw(ey eyVar, dy dyVar, wx wxVar) {
        this.d = eyVar;
        this.b = dyVar;
        this.c = wxVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        ey eyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            eyVar.e3 = true;
            a5.a aVar = eyVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            if (eyVar.X.r.getText().length() == 0 && eyVar.X.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(eyVar.X.r);
                eyVar.X.r.clearFocus();
            }
        } else {
            eyVar.e3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            eyVar.e2 = false;
            boolean z10 = eyVar.b1;
            dy dyVar = this.b;
            if (z10) {
                eyVar.b1 = false;
                if (eyVar.d1) {
                    zx zxVar = dyVar.a;
                    int i11 = zx.w3;
                    zxVar.G1();
                    eyVar.d1 = false;
                }
                dyVar.d.l();
            }
            ey.n1(eyVar, dyVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        zx zxVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        Object[] objArr;
        this.c.W();
        dy dyVar = this.b;
        fw fwVar = dyVar.x;
        int i12 = -i11;
        ArrayList arrayList = fwVar.x;
        ArrayList arrayList2 = fwVar.o;
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
        ey eyVar = this.d;
        eyVar.p3(dyVar);
        eyVar.Q = true;
        View view3 = eyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (eyVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.b1 K = recyclerView.K(i16);
            if (!eyVar.X3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = eyVar.Y1;
                if (i18 == i16) {
                    int i19 = eyVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        objArr = false;
                        if (objArr != false && eyVar.a2 && (z10 || eyVar.e3)) {
                            eyVar.a4(z10);
                        }
                        eyVar.Y1 = i16;
                        eyVar.Z1 = top;
                        eyVar.a2 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                objArr = true;
                if (objArr != false) {
                    eyVar.a4(z10);
                }
                eyVar.Y1 = i16;
                eyVar.Z1 = top;
                eyVar.a2 = true;
            }
        }
        if (!eyVar.K && recyclerView == eyVar.e0[0].a && !eyVar.j2) {
            kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                if (!kVar2.s() && !eyVar.e2 && !eyVar.G3.c()) {
                    if (i11 > 0 && eyVar.X3() && eyVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    eyVar.Q = true;
                    View view4 = eyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (eyVar.fragmentView != null) {
            eyVar.i3();
        }
        yw ywVar = eyVar.G3;
        if (ywVar != null && ywVar.c() && (zxVar = dyVar.a) != null) {
            zxVar.invalidate();
        }
        vw vwVar = eyVar.E0;
        if (vwVar != null && vwVar.getPremiumHint() != null && eyVar.E0.getPremiumHint().V) {
            eyVar.E0.getPremiumHint().e(true);
        }
        ?? X3 = eyVar.X3();
        View childAt2 = dyVar.a.getChildAt(X3 == true ? 1 : 0);
        eyVar.e.a(i16 > X3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - eyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) dyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (fVar = eyVar.l4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        fVar.f(i10, i11);
    }
}
