package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class vv0 extends yl0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final /* synthetic */ bw0 f;

    public vv0(bw0 bw0Var, Context context) {
        this.f = bw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean E(qm0 qm0Var) {
        bw0 bw0Var = this.f;
        if (!bw0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == bw0Var.H || bw0.u(bw0Var, this) != -1) ? bw0Var.m1[0] : bw0Var.q1));
            if (qm0Var.getChildCount() != 0 && qm0Var.getChildAt(0).getMeasuredHeight() * ceil > qm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public String F(int i10) {
        ArrayList arrayList = this.f.t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((zu0) arrayList.get(i11)).b) {
                return ((zu0) arrayList.get(i11)).a;
            }
        }
        return ((zu0) hg.c.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.yl0
    public final void G(qm0 qm0Var, float f7, int[] iArr) {
        int measuredHeight = qm0Var.getChildAt(0).getMeasuredHeight();
        bw0 bw0Var = this.f;
        int[] iArr2 = bw0Var.m1;
        int i10 = (bw0.v(bw0Var, this) != -1 || this == bw0Var.I) ? bw0Var.q1 : bw0.u(bw0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = qm0Var.getMeasuredHeight() - qm0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public final float H(qm0 qm0Var) {
        bw0 bw0Var = this.f;
        int[] iArr = bw0Var.m1;
        int i10 = (this == bw0Var.I || bw0.v(bw0Var, this) != -1) ? bw0Var.q1 : bw0.u(bw0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (qm0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = qm0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(qm0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - qm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (qm0Var.getMeasuredHeight() - qm0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.yl0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.yl0
    public final void J(qm0 qm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < qm0Var.getChildCount(); i11++) {
                View childAt = qm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, qm0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public final void K() {
        this.d = true;
        uu0 W = this.f.W(0);
        if (W != null) {
            bw0.q(W, null, false);
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
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h() {
        bw0 bw0Var = this.f;
        qv0[] qv0VarArr = bw0Var.t1;
        if (DialogObject.isEncryptedDialog(bw0Var.j1)) {
            if (qv0VarArr[0].a.size() != 0 || qv0VarArr[0].g) {
                if (qv0VarArr[0].a.size() == 0) {
                    boolean[] zArr = qv0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = qv0VarArr[0].c().size() + qv0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = qv0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        qv0 qv0Var = qv0VarArr[0];
        if (qv0Var.o) {
            return qv0Var.e();
        }
        if (qv0Var.a.size() != 0 || qv0VarArr[0].g) {
            if (qv0VarArr[0].a.size() == 0) {
                qv0 qv0Var2 = qv0VarArr[0];
                boolean[] zArr3 = qv0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (qv0VarArr[0].e() != 0) {
                return Math.max(qv0VarArr[0].e(), qv0VarArr[0].c().size() + qv0VarArr[0].d());
            }
            int size2 = qv0VarArr[0].c().size() + qv0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            qv0 qv0Var3 = qv0VarArr[0];
            boolean[] zArr4 = qv0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = qv0Var3.r;
            if ((z10 ? qv0Var3.u : qv0Var3.n) != 0) {
                return (z10 ? qv0Var3.u : qv0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.i0
    public int j(int i10) {
        qv0[] qv0VarArr = this.f.t1;
        if (!this.d && qv0VarArr[0].c().size() == 0) {
            qv0 qv0Var = qv0VarArr[0];
            if (!qv0Var.g && qv0Var.l) {
                return 2;
            }
        }
        qv0VarArr[0].getClass();
        qv0VarArr[0].c().size();
        qv0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.i0
    public int k() {
        return this.f.t1[0].e();
    }

    @Override // s4.i0
    public void v(s4.d1 d1Var, int i10) {
        bw0 bw0Var = this.f;
        int[] iArr = bw0Var.m1;
        qv0[] qv0VarArr = bw0Var.t1;
        if (d1Var.f == 0) {
            ArrayList c10 = qv0VarArr[0].c();
            int d = i10 - qv0VarArr[0].d();
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                int i11 = this == bw0Var.H ? iArr[0] : bw0.u(bw0Var, this) != -1 ? iArr[1] : bw0Var.q1;
                if (d < 0 || d >= c10.size()) {
                    t7Var.k(null, i11, false);
                    t7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (bw0Var.C1) {
                    t7Var.i(bw0Var.Z0[(messageObject.getDialogId() > bw0Var.j1 ? 1 : (messageObject.getDialogId() == bw0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    t7Var.i(false, z10);
                }
                t7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // s4.i0
    public s4.d1 x(ViewGroup viewGroup, int i10) {
        bw0 bw0Var = this.f;
        org.telegram.ui.ActionBar.e6 e6Var = bw0Var.F1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            ou0 M = bw0.M(0, bw0Var.j1, context, e6Var);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new am0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, bw0Var.v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.w0 = true;
        }
        t7Var.setGradientView(bw0Var.y);
        if (bw0.u(bw0Var, this) != -1) {
            t7Var.d0 = true;
        }
        t7Var.setLayoutParams(new s4.q0(-1, -2));
        return new am0(t7Var);
    }
}
