// default package

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ch3 extends i49 {
    public boolean a;
    public final /* synthetic */ bj3 b;
    public final /* synthetic */ vi3 c;
    public final /* synthetic */ cj3 d;

    public ch3(cj3 cj3Var, bj3 bj3Var, vi3 vi3Var) {
        this.d = cj3Var;
        this.b = bj3Var;
        this.c = vi3Var;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        cj3 cj3Var = this.d;
        if (i == 1) {
            this.a = true;
            cj3Var.g3 = true;
            kp kpVar = cj3Var.f0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) kpVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) kpVar.c).cancel();
                kpVar.c = null;
            }
            if (cj3Var.Y.r.getText().length() == 0 && cj3Var.Y.r.hasFocus()) {
                gl.t1(cj3Var.Y.r);
                cj3Var.Y.r.clearFocus();
            }
        } else {
            cj3Var.g3 = false;
        }
        if (i == 0) {
            this.a = false;
            cj3Var.g2 = false;
            boolean z = cj3Var.d1;
            bj3 bj3Var = this.b;
            if (z) {
                cj3Var.d1 = false;
                if (cj3Var.f1) {
                    yi3 yi3Var = bj3Var.a;
                    int i2 = yi3.C3;
                    yi3Var.D1();
                    cj3Var.f1 = false;
                }
                bj3Var.d.f();
            }
            cj3Var.H2(bj3Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean] */
    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        cq3 cq3Var;
        yi3 yi3Var;
        a aVar;
        a aVar2;
        View childAt;
        boolean z;
        Object[] objArr;
        this.c.V();
        bj3 bj3Var = this.b;
        yg3 yg3Var = bj3Var.y;
        int i3 = -i2;
        ArrayList arrayList = yg3Var.x;
        ArrayList arrayList2 = yg3Var.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = ((s49) arrayList2.get(i4)).a;
                view.setTranslationY(view.getTranslationY() + i3);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                View view2 = ((s49) arrayList.get(i5)).a;
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
        cj3 cj3Var = this.d;
        cj3Var.K2(bj3Var);
        cj3Var.R = true;
        View view3 = cj3Var.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (cj3Var.T0 != 10 && this.a && recyclerView.getChildCount() > 0 && i7 != -1) {
            s49 K = recyclerView.K(i7);
            if (!cj3Var.w3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i9 = cj3Var.a2;
                if (i9 == i7) {
                    int i10 = cj3Var.b2;
                    int i11 = i10 - top;
                    z = top < i10;
                    if (Math.abs(i11) <= 1) {
                        objArr = false;
                        if (objArr != false && cj3Var.c2 && (z || cj3Var.g3)) {
                            cj3Var.z3(z);
                        }
                        cj3Var.a2 = i7;
                        cj3Var.b2 = top;
                        cj3Var.c2 = true;
                    }
                } else {
                    z = i7 > i9;
                }
                objArr = true;
                if (objArr != false) {
                    cj3Var.z3(z);
                }
                cj3Var.a2 = i7;
                cj3Var.b2 = top;
                cj3Var.c2 = true;
            }
        }
        if (!cj3Var.L && recyclerView == cj3Var.f0[0].a && !cj3Var.l2) {
            aVar = ((d) cj3Var).actionBar;
            if (aVar != null) {
                aVar2 = ((d) cj3Var).actionBar;
                if (!aVar2.y() && !cj3Var.g2 && !cj3Var.H3.c()) {
                    if (i2 > 0 && cj3Var.w3() && cj3Var.f0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i2 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i2 = -top2;
                            }
                        }
                    }
                    cj3Var.R = true;
                    View view4 = cj3Var.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        rh3 rh3Var = cj3Var.H3;
        if (rh3Var != null && rh3Var.c() && (yi3Var = bj3Var.a) != null) {
            yi3Var.invalidate();
        }
        oh3 oh3Var = cj3Var.F0;
        if (oh3Var != null && oh3Var.getPremiumHint() != null && cj3Var.F0.getPremiumHint().W) {
            cj3Var.F0.getPremiumHint().f(true);
        }
        ?? w3 = cj3Var.w3();
        View childAt2 = bj3Var.a.getChildAt(w3 == true ? 1 : 0);
        cj3Var.e.a(i7 > w3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - cj3Var.O) + ((float) gl.L(5.0f)) < ((float) bj3Var.a.getPaddingTop()), true);
        if (i2 == 0 || (cq3Var = cj3Var.o4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        cq3Var.f(i, i2);
    }
}
