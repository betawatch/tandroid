package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class tu0 extends uk0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final /* synthetic */ zu0 f;

    public tu0(zu0 zu0Var, Context context) {
        this.f = zu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.uk0
    public final boolean E(ml0 ml0Var) {
        zu0 zu0Var = this.f;
        if (!zu0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == zu0Var.H || zu0.u(zu0Var, this) != -1) ? zu0Var.m1[0] : zu0Var.q1));
            if (ml0Var.getChildCount() != 0 && ml0Var.getChildAt(0).getMeasuredHeight() * ceil > ml0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.uk0
    public String F(int i10) {
        ArrayList arrayList = this.f.t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((xt0) arrayList.get(i11)).b) {
                return ((xt0) arrayList.get(i11)).a;
            }
        }
        return ((xt0) hg.k0.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.uk0
    public final void G(ml0 ml0Var, float f7, int[] iArr) {
        int measuredHeight = ml0Var.getChildAt(0).getMeasuredHeight();
        zu0 zu0Var = this.f;
        int[] iArr2 = zu0Var.m1;
        int i10 = (zu0.v(zu0Var, this) != -1 || this == zu0Var.I) ? zu0Var.q1 : zu0.u(zu0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = ml0Var.getMeasuredHeight() - ml0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public final float H(ml0 ml0Var) {
        zu0 zu0Var = this.f;
        int[] iArr = zu0Var.m1;
        int i10 = (this == zu0Var.I || zu0.v(zu0Var, this) != -1) ? zu0Var.q1 : zu0.u(zu0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (ml0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = ml0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.S(ml0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - ml0Var.getPaddingTop())) / ((ceil * measuredHeight) - (ml0Var.getMeasuredHeight() - ml0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.uk0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.uk0
    public final void J(ml0 ml0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < ml0Var.getChildCount(); i11++) {
                View childAt = ml0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, ml0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public final void K() {
        this.d = true;
        st0 W = this.f.W(0);
        if (W != null) {
            zu0.q(W, null, false);
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
        zu0 zu0Var = this.f;
        ou0[] ou0VarArr = zu0Var.t1;
        if (DialogObject.isEncryptedDialog(zu0Var.j1)) {
            if (ou0VarArr[0].a.size() != 0 || ou0VarArr[0].g) {
                if (ou0VarArr[0].a.size() == 0) {
                    boolean[] zArr = ou0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = ou0VarArr[0].c().size() + ou0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = ou0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        ou0 ou0Var = ou0VarArr[0];
        if (ou0Var.o) {
            return ou0Var.e();
        }
        if (ou0Var.a.size() != 0 || ou0VarArr[0].g) {
            if (ou0VarArr[0].a.size() == 0) {
                ou0 ou0Var2 = ou0VarArr[0];
                boolean[] zArr3 = ou0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (ou0VarArr[0].e() != 0) {
                return Math.max(ou0VarArr[0].e(), ou0VarArr[0].c().size() + ou0VarArr[0].d());
            }
            int size2 = ou0VarArr[0].c().size() + ou0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            ou0 ou0Var3 = ou0VarArr[0];
            boolean[] zArr4 = ou0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = ou0Var3.r;
            if ((z10 ? ou0Var3.u : ou0Var3.n) != 0) {
                return (z10 ? ou0Var3.u : ou0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.h0
    public int j(int i10) {
        ou0[] ou0VarArr = this.f.t1;
        if (!this.d && ou0VarArr[0].c().size() == 0) {
            ou0 ou0Var = ou0VarArr[0];
            if (!ou0Var.g && ou0Var.l) {
                return 2;
            }
        }
        ou0VarArr[0].getClass();
        ou0VarArr[0].c().size();
        ou0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.h0
    public int k() {
        return this.f.t1[0].e();
    }

    @Override // s4.h0
    public void v(s4.c1 c1Var, int i10) {
        zu0 zu0Var = this.f;
        int[] iArr = zu0Var.m1;
        ou0[] ou0VarArr = zu0Var.t1;
        if (c1Var.f == 0) {
            ArrayList c10 = ou0VarArr[0].c();
            int d = i10 - ou0VarArr[0].d();
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                int i11 = this == zu0Var.H ? iArr[0] : zu0.u(zu0Var, this) != -1 ? iArr[1] : zu0Var.q1;
                if (d < 0 || d >= c10.size()) {
                    t7Var.k(null, i11, false);
                    t7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (zu0Var.C1) {
                    t7Var.i(zu0Var.Z0[(messageObject.getDialogId() > zu0Var.j1 ? 1 : (messageObject.getDialogId() == zu0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    t7Var.i(false, z10);
                }
                t7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // s4.h0
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = zu0Var.F1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            mt0 M = zu0.M(0, zu0Var.j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new wk0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, zu0Var.v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.w0 = true;
        }
        t7Var.setGradientView(zu0Var.y);
        if (zu0.u(zu0Var, this) != -1) {
            t7Var.d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new wk0(t7Var);
    }
}
