package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class ut0 extends bk0 {
    public final Context c;
    public boolean d;
    public m.p3 e;
    public final /* synthetic */ au0 f;

    public ut0(au0 au0Var, Context context) {
        this.f = au0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tk0
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean E(uk0 uk0Var) {
        au0 au0Var = this.f;
        if (!au0Var.D0()) {
            int ceil = (int) Math.ceil(e() / ((this == au0Var.J || au0.v(au0Var, this) != -1) ? au0Var.o1[0] : au0Var.s1));
            if (uk0Var.getChildCount() != 0 && uk0Var.getChildAt(0).getMeasuredHeight() * ceil > uk0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bk0
    public String F(int i10) {
        ArrayList arrayList = this.f.v1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((ys0) arrayList.get(i11)).b) {
                return ((ys0) arrayList.get(i11)).a;
            }
        }
        return ((ys0) i0.a.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.bk0
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        int measuredHeight = uk0Var.getChildAt(0).getMeasuredHeight();
        au0 au0Var = this.f;
        int[] iArr2 = au0Var.o1;
        int i10 = (au0.w(au0Var, this) != -1 || this == au0Var.K) ? au0Var.s1 : au0.v(au0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(e() / i10) * measuredHeight);
        int measuredHeight2 = uk0Var.getMeasuredHeight() - uk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.bk0
    public final float H(uk0 uk0Var) {
        au0 au0Var = this.f;
        int[] iArr = au0Var.o1;
        int i10 = (this == au0Var.K || au0.w(au0Var, this) != -1) ? au0Var.s1 : au0.v(au0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(e() / i10);
        if (uk0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = uk0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(uk0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - uk0Var.getPaddingTop())) / ((ceil * measuredHeight) - (uk0Var.getMeasuredHeight() - uk0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.bk0
    public void I() {
        this.f.n1(0, true);
    }

    @Override // org.telegram.ui.Components.bk0
    public final void J(uk0 uk0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < uk0Var.getChildCount(); i11++) {
                View childAt = uk0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    i10 = ((org.telegram.ui.Cells.s7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.b0(0, uk0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.bk0
    public final void K() {
        this.d = true;
        ts0 f02 = this.f.f0(0);
        if (f02 != null) {
            au0.p(f02, null, false);
        }
    }

    public int L(int i10) {
        return this.f.v1[0].m + i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r0[1] != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r4[1] != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        if (r0.l == false) goto L42;
     */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b() {
        au0 au0Var = this.f;
        pt0[] pt0VarArr = au0Var.v1;
        if (org.telegram.messenger.o5.C(au0Var.l1)) {
            if (pt0VarArr[0].a.size() != 0 || pt0VarArr[0].g) {
                if (pt0VarArr[0].a.size() == 0) {
                    boolean[] zArr = pt0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = pt0VarArr[0].c().size() + pt0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = pt0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        pt0 pt0Var = pt0VarArr[0];
        if (pt0Var.o) {
            return pt0Var.e();
        }
        if (pt0Var.a.size() != 0 || pt0VarArr[0].g) {
            if (pt0VarArr[0].a.size() == 0) {
                pt0 pt0Var2 = pt0VarArr[0];
                boolean[] zArr3 = pt0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (pt0VarArr[0].e() != 0) {
                return Math.max(pt0VarArr[0].e(), pt0VarArr[0].c().size() + pt0VarArr[0].d());
            }
            int size2 = pt0VarArr[0].c().size() + pt0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            pt0 pt0Var3 = pt0VarArr[0];
            boolean[] zArr4 = pt0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = pt0Var3.r;
            if ((z10 ? pt0Var3.u : pt0Var3.n) != 0) {
                return (z10 ? pt0Var3.u : pt0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.g0
    public int d(int i10) {
        pt0[] pt0VarArr = this.f.v1;
        if (!this.d && pt0VarArr[0].c().size() == 0) {
            pt0 pt0Var = pt0VarArr[0];
            if (!pt0Var.g && pt0Var.l) {
                return 2;
            }
        }
        pt0VarArr[0].getClass();
        pt0VarArr[0].c().size();
        pt0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.g0
    public int e() {
        return this.f.v1[0].e();
    }

    @Override // s4.g0
    public void t(s4.c1 c1Var, int i10) {
        au0 au0Var = this.f;
        int[] iArr = au0Var.o1;
        pt0[] pt0VarArr = au0Var.v1;
        if (c1Var.f == 0) {
            ArrayList c10 = pt0VarArr[0].c();
            int d = i10 - pt0VarArr[0].d();
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                int messageId = s7Var.getMessageId();
                int i11 = this == au0Var.J ? iArr[0] : au0.v(au0Var, this) != -1 ? iArr[1] : au0Var.s1;
                if (d < 0 || d >= c10.size()) {
                    s7Var.k(null, i11, false);
                    s7Var.i(false, false);
                    return;
                }
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) c10.get(d);
                boolean z10 = kjVar.f1() == messageId;
                if (au0Var.E1) {
                    s7Var.i(au0Var.b1[(org.telegram.messenger.kj.B0(kjVar.k) > au0Var.l1 ? 1 : (org.telegram.messenger.kj.B0(kjVar.k) == au0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(kjVar.f1()) >= 0, z10);
                } else {
                    s7Var.i(false, z10);
                }
                s7Var.k(kjVar, i11, false);
            }
        }
    }

    @Override // s4.g0
    public s4.c1 w(ViewGroup viewGroup, int i10) {
        au0 au0Var = this.f;
        org.telegram.ui.ActionBar.p6 p6Var = au0Var.H1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            p3 W = au0.W(0, au0Var.l1, context, p6Var);
            W.setLayoutParams(new s4.o0(-1, -1));
            return new dk0(W);
        }
        if (this.e == null) {
            this.e = new m.p3(viewGroup.getContext(), p6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.e, au0Var.x1.getCurrentAccount());
        if (i10 == 19) {
            s7Var.w0 = true;
        }
        s7Var.setGradientView(au0Var.D);
        if (au0.v(au0Var, this) != -1) {
            s7Var.d0 = true;
        }
        s7Var.setLayoutParams(new s4.o0(-1, -2));
        return new dk0(s7Var);
    }
}
