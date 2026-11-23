package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.messenger.s10;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public class r2 extends org.telegram.ui.ActionBar.w2 implements fs {
    public static int D1 = 1;
    public kg.g A1;
    public x10 B1;
    public final ArrayList C1;
    public String m1;
    public int n1;
    public final o1 o1;
    public final p1 p1;
    public final q1 q1;
    public final q2 r1;
    public float s1;
    public final boolean t1;
    public final boolean u1;
    public boolean v1;
    public int w1;
    public bi.b x1;
    public float y1;
    public s10 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(1, context, i6Var, true);
        int i7 = 1;
        this.m1 = null;
        this.n1 = -1;
        this.o1 = new o1();
        this.p1 = new p1();
        this.s1 = -1.0f;
        this.C1 = new ArrayList();
        this.t1 = z10;
        this.u1 = z11;
        this.G = true;
        P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, i6Var));
        this.w1 = this.H0;
        this.x = true;
        int i10 = 0;
        G0(false);
        this.b = new s1(this, context);
        q1 q1Var = new q1(i10, context, this);
        this.q1 = q1Var;
        q1Var.b = z10 ? 0 : D1;
        q1Var.setAdapter(new r1(this, z10, context));
        this.b.addView(q1Var, c8.na.e(-1, -1, 87));
        new x3(this.b, false, new m1(this, i10));
        if (!z10) {
            q2 q2Var = new q2(context);
            this.r1 = q2Var;
            q2Var.H = new m1(this, i7);
            q2Var.G = q1Var.b;
            q2Var.invalidate();
            this.b.addView(q2Var, c8.na.e(-1, -2, 87));
        }
        ks.f(this.a).c(this, ks.x0);
        ks.f(this.a).c(this, ks.B0);
        boolean z12 = org.telegram.messenger.a8.j;
        if (!z10) {
            ri.d0(this.a).D(5);
            ri.d0(this.a).y();
            ri.d0(this.a).Y0(0, true, true, false);
        }
        ri.d0(this.a).D(0);
        ri.d0(this.a).Y0(0, false, true, false);
        ri.d0(this.a).Y0(2, false, true, false);
        ri.d0(this.a).Y0(7, false, true, false);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return this.q1.getTranslationY() >= ((float) ((int) this.s1));
    }

    public boolean J0(Integer num) {
        return true;
    }

    public boolean K0(Integer num) {
        return num.intValue() != 6;
    }

    public boolean L0(Runnable runnable) {
        return true;
    }

    public final void M0() {
        l2 l2Var;
        this.d = false;
        this.c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
        for (View view : this.q1.getViewPages()) {
            if (view instanceof g2) {
                l2 l2Var2 = ((g2) view).f;
                if (l2Var2 != null) {
                    org.telegram.messenger.g0.v1(l2Var2.e);
                }
            } else if ((view instanceof b2) && (l2Var = ((b2) view).d) != null) {
                org.telegram.messenger.g0.v1(l2Var.e);
            }
        }
    }

    public final void N0(int i7) {
        if (J0(Integer.valueOf(i7))) {
            if ((i7 != 1 || L0(new ai.u0(this, i7, 12))) && ((Boolean) this.B1.a(Integer.valueOf(i7))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void O0() {
        ArrayList arrayList = this.C1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            p2 p2Var = (p2) obj;
            boolean K0 = p2Var.f.K0(6);
            ArrayList arrayList2 = p2Var.c;
            int size2 = arrayList2.size();
            int i10 = -1;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList2.size()) {
                    break;
                }
                int i12 = ((m2) arrayList2.get(i11)).a;
                if (i12 == 6) {
                    i10 = i11;
                }
                if (size2 == arrayList2.size() && (i12 == 1 || i12 == 2 || i12 == 3)) {
                    size2 = i11;
                }
                i11++;
            }
            if (K0 != (i10 >= 0)) {
                if (K0) {
                    arrayList2.add(size2, new n2(p2Var, 6, R.drawable.filled_widget_captions, gd.N0(2131744199, null)));
                } else {
                    arrayList2.remove(i10);
                }
                p2Var.requestLayout();
                p2Var.invalidate();
            }
        }
    }

    public final void P0(x10 x10Var) {
        this.B1 = x10Var;
        for (View view : this.q1.getViewPages()) {
            if (view instanceof g2) {
                f2 f2Var = ((g2) view).c;
                if (f2Var.I == null) {
                    f2Var.D(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final int S() {
        return this.b.getMeasuredHeight() <= 0 ? org.telegram.messenger.g0.q.y : (int) (this.b.getMeasuredHeight() - this.q1.getY());
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.x0;
        int i12 = ks.B0;
        if (i7 == i11 || i7 == i12) {
            for (View view : this.q1.getViewPages()) {
                if (view instanceof g2) {
                    g2 g2Var = (g2) view;
                    if (i7 == i12 || ((g2Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (g2Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        f2 f2Var = g2Var.c;
                        if (f2Var.I == null) {
                            f2Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        ks.f(this.a).n(this, ks.x0);
        ks.f(this.a).n(this, ks.B0);
        M0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.a8.j;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 >= 0 || this.H0 != this.w1 || (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0)) == this.H0) {
                return;
            }
            this.H0 = w02;
            this.w1 = w02;
            E0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
