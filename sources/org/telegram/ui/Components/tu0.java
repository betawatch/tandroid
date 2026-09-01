package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class tu0 extends dl0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.q7 e;
    public final /* synthetic */ zu0 f;

    public tu0(zu0 zu0Var, Context context) {
        this.f = zu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sl0
    public boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public final boolean E(tl0 tl0Var) {
        zu0 zu0Var = this.f;
        if (!zu0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == zu0Var.E || zu0.u(zu0Var, this) != -1) ? zu0Var.j1[0] : zu0Var.n1));
            if (tl0Var.getChildCount() != 0 && tl0Var.getChildAt(0).getMeasuredHeight() * ceil > tl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public String F(int i10) {
        ArrayList arrayList = this.f.q1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((wt0) arrayList.get(i11)).b) {
                return ((wt0) arrayList.get(i11)).a;
            }
        }
        return ((wt0) l.d.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(tl0 tl0Var, float f10, int[] iArr) {
        int measuredHeight = tl0Var.getChildAt(0).getMeasuredHeight();
        zu0 zu0Var = this.f;
        int[] iArr2 = zu0Var.j1;
        int i10 = (zu0.v(zu0Var, this) != -1 || this == zu0Var.F) ? zu0Var.n1 : zu0.u(zu0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = tl0Var.getMeasuredHeight() - tl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i10;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final float H(tl0 tl0Var) {
        zu0 zu0Var = this.f;
        int[] iArr = zu0Var.j1;
        int i10 = (this == zu0Var.F || zu0.v(zu0Var, this) != -1) ? zu0Var.n1 : zu0.u(zu0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (tl0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = tl0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(tl0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - tl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (tl0Var.getMeasuredHeight() - tl0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.dl0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void J(tl0 tl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < tl0Var.getChildCount(); i11++) {
                View childAt = tl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.r7) {
                    i10 = ((org.telegram.ui.Cells.r7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, tl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final void K() {
        this.d = true;
        rt0 W = this.f.W(0);
        if (W != null) {
            zu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f.q1[0].m + i10;
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
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h() {
        zu0 zu0Var = this.f;
        ou0[] ou0VarArr = zu0Var.q1;
        if (DialogObject.isEncryptedDialog(zu0Var.g1)) {
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
            boolean z4 = ou0Var3.r;
            if ((z4 ? ou0Var3.u : ou0Var3.n) != 0) {
                return (z4 ? ou0Var3.u : ou0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // f2.p0
    public int j(int i10) {
        ou0[] ou0VarArr = this.f.q1;
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

    @Override // f2.p0
    public int k() {
        return this.f.q1[0].e();
    }

    @Override // f2.p0
    public void v(f2.m1 m1Var, int i10) {
        zu0 zu0Var = this.f;
        int[] iArr = zu0Var.j1;
        ou0[] ou0VarArr = zu0Var.q1;
        if (m1Var.f == 0) {
            ArrayList c3 = ou0VarArr[0].c();
            int d = i10 - ou0VarArr[0].d();
            View view = m1Var.a;
            if (view instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                int messageId = r7Var.getMessageId();
                int i11 = this == zu0Var.E ? iArr[0] : zu0.u(zu0Var, this) != -1 ? iArr[1] : zu0Var.n1;
                if (d < 0 || d >= c3.size()) {
                    r7Var.k(null, i11, false);
                    r7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c3.get(d);
                boolean z4 = messageObject.getId() == messageId;
                if (zu0Var.z1) {
                    r7Var.i(zu0Var.W0[(messageObject.getDialogId() > zu0Var.g1 ? 1 : (messageObject.getDialogId() == zu0Var.g1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z4);
                } else {
                    r7Var.i(false, z4);
                }
                r7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // f2.p0
    public f2.m1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.f;
        org.telegram.ui.ActionBar.g6 g6Var = zu0Var.C1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            lt0 M = zu0.M(0, zu0Var.g1, context, g6Var);
            M.setLayoutParams(new f2.x0(-1, -1));
            return new fl0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.q7(viewGroup.getContext(), g6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.e, zu0Var.s1.getCurrentAccount());
        if (i10 == 19) {
            r7Var.t0 = true;
        }
        r7Var.setGradientView(zu0Var.y);
        if (zu0.u(zu0Var, this) != -1) {
            r7Var.a0 = true;
        }
        r7Var.setLayoutParams(new f2.x0(-1, -2));
        return new fl0(r7Var);
    }
}
