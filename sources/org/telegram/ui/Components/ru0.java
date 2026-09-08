package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class ru0 extends tk0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final /* synthetic */ xu0 f;

    public ru0(xu0 xu0Var, Context context) {
        this.f = xu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean E(ll0 ll0Var) {
        xu0 xu0Var = this.f;
        if (!xu0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == xu0Var.H || xu0.u(xu0Var, this) != -1) ? xu0Var.m1[0] : xu0Var.q1));
            if (ll0Var.getChildCount() != 0 && ll0Var.getChildAt(0).getMeasuredHeight() * ceil > ll0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tk0
    public String F(int i10) {
        ArrayList arrayList = this.f.t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((vt0) arrayList.get(i11)).b) {
                return ((vt0) arrayList.get(i11)).a;
            }
        }
        return ((vt0) i2.g.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        xu0 xu0Var = this.f;
        int[] iArr2 = xu0Var.m1;
        int i10 = (xu0.v(xu0Var, this) != -1 || this == xu0Var.I) ? xu0Var.q1 : xu0.u(xu0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = ll0Var.getMeasuredHeight() - ll0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final float H(ll0 ll0Var) {
        xu0 xu0Var = this.f;
        int[] iArr = xu0Var.m1;
        int i10 = (this == xu0Var.I || xu0.v(xu0Var, this) != -1) ? xu0Var.q1 : xu0.u(xu0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (ll0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(ll0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - ll0Var.getPaddingTop())) / ((ceil * measuredHeight) - (ll0Var.getMeasuredHeight() - ll0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.tk0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void J(ll0 ll0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
                View childAt = ll0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, ll0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final void K() {
        this.d = true;
        qt0 W = this.f.W(0);
        if (W != null) {
            xu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f.t1[0].m + i10;
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h() {
        xu0 xu0Var = this.f;
        mu0[] mu0VarArr = xu0Var.t1;
        if (DialogObject.isEncryptedDialog(xu0Var.j1)) {
            if (mu0VarArr[0].a.size() != 0 || mu0VarArr[0].g) {
                if (mu0VarArr[0].a.size() == 0) {
                    boolean[] zArr = mu0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = mu0VarArr[0].c().size() + mu0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = mu0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        mu0 mu0Var = mu0VarArr[0];
        if (mu0Var.o) {
            return mu0Var.e();
        }
        if (mu0Var.a.size() != 0 || mu0VarArr[0].g) {
            if (mu0VarArr[0].a.size() == 0) {
                mu0 mu0Var2 = mu0VarArr[0];
                boolean[] zArr3 = mu0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (mu0VarArr[0].e() != 0) {
                return Math.max(mu0VarArr[0].e(), mu0VarArr[0].c().size() + mu0VarArr[0].d());
            }
            int size2 = mu0VarArr[0].c().size() + mu0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            mu0 mu0Var3 = mu0VarArr[0];
            boolean[] zArr4 = mu0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = mu0Var3.r;
            if ((z10 ? mu0Var3.u : mu0Var3.n) != 0) {
                return (z10 ? mu0Var3.u : mu0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.h0
    public int j(int i10) {
        mu0[] mu0VarArr = this.f.t1;
        if (!this.d && mu0VarArr[0].c().size() == 0) {
            mu0 mu0Var = mu0VarArr[0];
            if (!mu0Var.g && mu0Var.l) {
                return 2;
            }
        }
        mu0VarArr[0].getClass();
        mu0VarArr[0].c().size();
        mu0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.h0
    public int k() {
        return this.f.t1[0].e();
    }

    @Override // s4.h0
    public void v(s4.c1 c1Var, int i10) {
        xu0 xu0Var = this.f;
        int[] iArr = xu0Var.m1;
        mu0[] mu0VarArr = xu0Var.t1;
        if (c1Var.f == 0) {
            ArrayList c10 = mu0VarArr[0].c();
            int d = i10 - mu0VarArr[0].d();
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                int i11 = this == xu0Var.H ? iArr[0] : xu0.u(xu0Var, this) != -1 ? iArr[1] : xu0Var.q1;
                if (d < 0 || d >= c10.size()) {
                    t7Var.k(null, i11, false);
                    t7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (xu0Var.C1) {
                    t7Var.i(xu0Var.Z0[(messageObject.getDialogId() > xu0Var.j1 ? 1 : (messageObject.getDialogId() == xu0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    t7Var.i(false, z10);
                }
                t7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // s4.h0
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        xu0 xu0Var = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            kt0 M = xu0.M(0, xu0Var.j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new vk0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, xu0Var.v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.w0 = true;
        }
        t7Var.setGradientView(xu0Var.y);
        if (xu0.u(xu0Var, this) != -1) {
            t7Var.d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new vk0(t7Var);
    }
}
