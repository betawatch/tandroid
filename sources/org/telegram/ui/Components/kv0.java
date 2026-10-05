package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public class kv0 extends gl0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final /* synthetic */ qv0 f;

    public kv0(qv0 qv0Var, Context context) {
        this.f = qv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.gl0
    public final boolean E(zl0 zl0Var) {
        qv0 qv0Var = this.f;
        if (!qv0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == qv0Var.H || qv0.u(qv0Var, this) != -1) ? qv0Var.m1[0] : qv0Var.q1));
            if (zl0Var.getChildCount() != 0 && zl0Var.getChildAt(0).getMeasuredHeight() * ceil > zl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.gl0
    public String F(int i10) {
        ArrayList arrayList = this.f.t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((ou0) arrayList.get(i11)).b) {
                return ((ou0) arrayList.get(i11)).a;
            }
        }
        return ((ou0) hg.c.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.gl0
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
        qv0 qv0Var = this.f;
        int[] iArr2 = qv0Var.m1;
        int i10 = (qv0.v(qv0Var, this) != -1 || this == qv0Var.I) ? qv0Var.q1 : qv0.u(qv0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.gl0
    public final float H(zl0 zl0Var) {
        qv0 qv0Var = this.f;
        int[] iArr = qv0Var.m1;
        int i10 = (this == qv0Var.I || qv0.v(qv0Var, this) != -1) ? qv0Var.q1 : qv0.u(qv0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (zl0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(zl0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - zl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.gl0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.gl0
    public final void J(zl0 zl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
                View childAt = zl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, zl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.gl0
    public final void K() {
        this.d = true;
        ju0 W = this.f.W(0);
        if (W != null) {
            qv0.q(W, null, false);
        }
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
        qv0 qv0Var = this.f;
        fv0[] fv0VarArr = qv0Var.t1;
        if (DialogObject.isEncryptedDialog(qv0Var.j1)) {
            if (fv0VarArr[0].a.size() != 0 || fv0VarArr[0].g) {
                if (fv0VarArr[0].a.size() == 0) {
                    boolean[] zArr = fv0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = fv0VarArr[0].c().size() + fv0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = fv0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        fv0 fv0Var = fv0VarArr[0];
        if (fv0Var.o) {
            return fv0Var.e();
        }
        if (fv0Var.a.size() != 0 || fv0VarArr[0].g) {
            if (fv0VarArr[0].a.size() == 0) {
                fv0 fv0Var2 = fv0VarArr[0];
                boolean[] zArr3 = fv0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (fv0VarArr[0].e() != 0) {
                return Math.max(fv0VarArr[0].e(), fv0VarArr[0].c().size() + fv0VarArr[0].d());
            }
            int size2 = fv0VarArr[0].c().size() + fv0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            fv0 fv0Var3 = fv0VarArr[0];
            boolean[] zArr4 = fv0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = fv0Var3.r;
            if ((z10 ? fv0Var3.u : fv0Var3.n) != 0) {
                return (z10 ? fv0Var3.u : fv0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.h0
    public int j(int i10) {
        fv0[] fv0VarArr = this.f.t1;
        if (!this.d && fv0VarArr[0].c().size() == 0) {
            fv0 fv0Var = fv0VarArr[0];
            if (!fv0Var.g && fv0Var.l) {
                return 2;
            }
        }
        fv0VarArr[0].getClass();
        fv0VarArr[0].c().size();
        fv0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.h0
    public int k() {
        return this.f.t1[0].e();
    }

    @Override // s4.h0
    public void v(s4.c1 c1Var, int i10) {
        qv0 qv0Var = this.f;
        int[] iArr = qv0Var.m1;
        fv0[] fv0VarArr = qv0Var.t1;
        if (c1Var.f == 0) {
            ArrayList c10 = fv0VarArr[0].c();
            int d = i10 - fv0VarArr[0].d();
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                int i11 = this == qv0Var.H ? iArr[0] : qv0.u(qv0Var, this) != -1 ? iArr[1] : qv0Var.q1;
                if (d < 0 || d >= c10.size()) {
                    t7Var.k(null, i11, false);
                    t7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (qv0Var.C1) {
                    t7Var.i(qv0Var.Z0[(messageObject.getDialogId() > qv0Var.j1 ? 1 : (messageObject.getDialogId() == qv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    t7Var.i(false, z10);
                }
                t7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // s4.h0
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        qv0 qv0Var = this.f;
        org.telegram.ui.ActionBar.d6 d6Var = qv0Var.F1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            du0 M = qv0.M(0, qv0Var.j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new il0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, qv0Var.v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.w0 = true;
        }
        t7Var.setGradientView(qv0Var.y);
        if (qv0.u(qv0Var, this) != -1) {
            t7Var.d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new il0(t7Var);
    }
}
