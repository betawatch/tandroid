package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public class dv0 extends el0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final /* synthetic */ jv0 f;

    public dv0(jv0 jv0Var, Context context) {
        this.f = jv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public final boolean E(wl0 wl0Var) {
        jv0 jv0Var = this.f;
        if (!jv0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == jv0Var.H || jv0.u(jv0Var, this) != -1) ? jv0Var.m1[0] : jv0Var.q1));
            if (wl0Var.getChildCount() != 0 && wl0Var.getChildAt(0).getMeasuredHeight() * ceil > wl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public String F(int i10) {
        ArrayList arrayList = this.f.t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((hu0) arrayList.get(i11)).b) {
                return ((hu0) arrayList.get(i11)).a;
            }
        }
        return ((hu0) hg.c.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.el0
    public final void G(wl0 wl0Var, float f7, int[] iArr) {
        int measuredHeight = wl0Var.getChildAt(0).getMeasuredHeight();
        jv0 jv0Var = this.f;
        int[] iArr2 = jv0Var.m1;
        int i10 = (jv0.v(jv0Var, this) != -1 || this == jv0Var.I) ? jv0Var.q1 : jv0.u(jv0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = wl0Var.getMeasuredHeight() - wl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.el0
    public final float H(wl0 wl0Var) {
        jv0 jv0Var = this.f;
        int[] iArr = jv0Var.m1;
        int i10 = (this == jv0Var.I || jv0.v(jv0Var, this) != -1) ? jv0Var.q1 : jv0.u(jv0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (wl0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = wl0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(wl0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - wl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (wl0Var.getMeasuredHeight() - wl0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.el0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.el0
    public final void J(wl0 wl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < wl0Var.getChildCount(); i11++) {
                View childAt = wl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, wl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.el0
    public final void K() {
        this.d = true;
        cu0 W = this.f.W(0);
        if (W != null) {
            jv0.q(W, null, false);
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
        jv0 jv0Var = this.f;
        yu0[] yu0VarArr = jv0Var.t1;
        if (DialogObject.isEncryptedDialog(jv0Var.j1)) {
            if (yu0VarArr[0].a.size() != 0 || yu0VarArr[0].g) {
                if (yu0VarArr[0].a.size() == 0) {
                    boolean[] zArr = yu0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = yu0VarArr[0].c().size() + yu0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = yu0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        yu0 yu0Var = yu0VarArr[0];
        if (yu0Var.o) {
            return yu0Var.e();
        }
        if (yu0Var.a.size() != 0 || yu0VarArr[0].g) {
            if (yu0VarArr[0].a.size() == 0) {
                yu0 yu0Var2 = yu0VarArr[0];
                boolean[] zArr3 = yu0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (yu0VarArr[0].e() != 0) {
                return Math.max(yu0VarArr[0].e(), yu0VarArr[0].c().size() + yu0VarArr[0].d());
            }
            int size2 = yu0VarArr[0].c().size() + yu0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            yu0 yu0Var3 = yu0VarArr[0];
            boolean[] zArr4 = yu0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = yu0Var3.r;
            if ((z10 ? yu0Var3.u : yu0Var3.n) != 0) {
                return (z10 ? yu0Var3.u : yu0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.h0
    public int j(int i10) {
        yu0[] yu0VarArr = this.f.t1;
        if (!this.d && yu0VarArr[0].c().size() == 0) {
            yu0 yu0Var = yu0VarArr[0];
            if (!yu0Var.g && yu0Var.l) {
                return 2;
            }
        }
        yu0VarArr[0].getClass();
        yu0VarArr[0].c().size();
        yu0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.h0
    public int k() {
        return this.f.t1[0].e();
    }

    @Override // s4.h0
    public void v(s4.c1 c1Var, int i10) {
        jv0 jv0Var = this.f;
        int[] iArr = jv0Var.m1;
        yu0[] yu0VarArr = jv0Var.t1;
        if (c1Var.f == 0) {
            ArrayList c10 = yu0VarArr[0].c();
            int d = i10 - yu0VarArr[0].d();
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                int i11 = this == jv0Var.H ? iArr[0] : jv0.u(jv0Var, this) != -1 ? iArr[1] : jv0Var.q1;
                if (d < 0 || d >= c10.size()) {
                    t7Var.k(null, i11, false);
                    t7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (jv0Var.C1) {
                    t7Var.i(jv0Var.Z0[(messageObject.getDialogId() > jv0Var.j1 ? 1 : (messageObject.getDialogId() == jv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    t7Var.i(false, z10);
                }
                t7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // s4.h0
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        jv0 jv0Var = this.f;
        org.telegram.ui.ActionBar.d6 d6Var = jv0Var.F1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            wt0 M = jv0.M(0, jv0Var.j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new gl0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, jv0Var.v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.w0 = true;
        }
        t7Var.setGradientView(jv0Var.y);
        if (jv0.u(jv0Var, this) != -1) {
            t7Var.d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new gl0(t7Var);
    }
}
