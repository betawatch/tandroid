// default package

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oi3 extends k69 {
    public boolean a;
    public final /* synthetic */ mk3 b;
    public final /* synthetic */ gk3 c;
    public final /* synthetic */ nk3 d;

    public oi3(nk3 nk3Var, mk3 mk3Var, gk3 gk3Var) {
        this.d = nk3Var;
        this.b = mk3Var;
        this.c = gk3Var;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        boolean z;
        nk3 nk3Var = this.d;
        if (i == 1) {
            this.a = true;
            nk3Var.g3 = true;
            kq kqVar = nk3Var.f0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) kqVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) kqVar.c).cancel();
                kqVar.c = null;
            }
            if (nk3Var.Y.r.getText().length() == 0 && nk3Var.Y.r.hasFocus()) {
                gm.t1(nk3Var.Y.r);
                nk3Var.Y.r.clearFocus();
            }
        } else {
            nk3Var.g3 = false;
        }
        if (i == 0) {
            this.a = false;
            nk3Var.g2 = false;
            boolean z2 = nk3Var.d1;
            mk3 mk3Var = this.b;
            if (z2) {
                nk3Var.d1 = false;
                if (nk3Var.f1) {
                    jk3 jk3Var = mk3Var.a;
                    int i2 = jk3.C3;
                    jk3Var.D1();
                    nk3Var.f1 = false;
                }
                mk3Var.d.f();
            }
            nk3Var.J2(mk3Var);
        }
        z = ((d) nk3Var).isPaused;
        if (z) {
            return;
        }
        nk3Var.w4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean] */
    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        mr3 mr3Var;
        jk3 jk3Var;
        a aVar;
        a aVar2;
        View childAt;
        boolean z;
        Object[] objArr;
        this.c.V();
        mk3 mk3Var = this.b;
        ki3 ki3Var = mk3Var.y;
        int i3 = -i2;
        ArrayList arrayList = ki3Var.x;
        ArrayList arrayList2 = ki3Var.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = ((u69) arrayList2.get(i4)).a;
                view.setTranslationY(view.getTranslationY() + i3);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                View view2 = ((u69) arrayList.get(i5)).a;
                view2.setTranslationY(view2.getTranslationY() + i3);
            }
        }
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < recyclerView.getChildCount(); i8++) {
            int R = RecyclerView.R(recyclerView.getChildAt(i8));
            if (R >= 0) {
                if (i6 == -1 || R > i6) {
                    i6 = R;
                }
                if (i7 == -1 || R < i7) {
                    i7 = R;
                }
            }
        }
        nk3 nk3Var = this.d;
        nk3Var.M2(mk3Var);
        nk3Var.R = true;
        View view3 = nk3Var.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (nk3Var.T0 != 10 && this.a && recyclerView.getChildCount() > 0 && i7 != -1) {
            u69 K = recyclerView.K(i7);
            if (!nk3Var.y3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i9 = nk3Var.a2;
                if (i9 == i7) {
                    int i10 = nk3Var.b2;
                    int i11 = i10 - top;
                    z = top < i10;
                    if (Math.abs(i11) <= 1) {
                        objArr = false;
                        if (objArr != false && nk3Var.c2 && (z || nk3Var.g3)) {
                            nk3Var.B3(z);
                        }
                        nk3Var.a2 = i7;
                        nk3Var.b2 = top;
                        nk3Var.c2 = true;
                    }
                } else {
                    z = i7 > i9;
                }
                objArr = true;
                if (objArr != false) {
                    nk3Var.B3(z);
                }
                nk3Var.a2 = i7;
                nk3Var.b2 = top;
                nk3Var.c2 = true;
            }
        }
        if (!nk3Var.L && recyclerView == nk3Var.f0[0].a && !nk3Var.l2) {
            aVar = ((d) nk3Var).actionBar;
            if (aVar != null) {
                aVar2 = ((d) nk3Var).actionBar;
                if (!aVar2.y() && !nk3Var.g2 && !nk3Var.H3.c()) {
                    if (i2 > 0 && nk3Var.y3() && nk3Var.f0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i2 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i2 = -top2;
                            }
                        }
                    }
                    nk3Var.R = true;
                    View view4 = nk3Var.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        dj3 dj3Var = nk3Var.H3;
        if (dj3Var != null && dj3Var.c() && (jk3Var = mk3Var.a) != null) {
            jk3Var.invalidate();
        }
        aj3 aj3Var = nk3Var.F0;
        if (aj3Var != null && aj3Var.getPremiumHint() != null && nk3Var.F0.getPremiumHint().W) {
            nk3Var.F0.getPremiumHint().f(true);
        }
        ?? y3 = nk3Var.y3();
        View childAt2 = mk3Var.a.getChildAt(y3 == true ? 1 : 0);
        nk3Var.e.a(i7 > y3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - nk3Var.O) + ((float) gm.L(5.0f)) < ((float) mk3Var.a.getPaddingTop()), true);
        if (i2 == 0 || (mr3Var = nk3Var.q4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        mr3Var.f(i, i2);
    }
}
