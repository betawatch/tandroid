package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ku0 extends tk0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.o7 e;
    public final /* synthetic */ qu0 f;

    public ku0(qu0 qu0Var, Context context) {
        this.f = qu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean E(jl0 jl0Var) {
        qu0 qu0Var = this.f;
        if (!qu0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == qu0Var.D || qu0.u(qu0Var, this) != -1) ? qu0Var.i1[0] : qu0Var.m1));
            if (jl0Var.getChildCount() != 0 && jl0Var.getChildAt(0).getMeasuredHeight() * ceil > jl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tk0
    public String F(int i10) {
        ArrayList arrayList = this.f.p1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((nt0) arrayList.get(i11)).b) {
                return ((nt0) arrayList.get(i11)).a;
            }
        }
        return ((nt0) j7.l1.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
        qu0 qu0Var = this.f;
        int[] iArr2 = qu0Var.i1;
        int i10 = (qu0.v(qu0Var, this) != -1 || this == qu0Var.E) ? qu0Var.m1 : qu0.u(qu0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = jl0Var.getMeasuredHeight() - jl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f9 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final float H(jl0 jl0Var) {
        qu0 qu0Var = this.f;
        int[] iArr = qu0Var.i1;
        int i10 = (this == qu0Var.E || qu0.v(qu0Var, this) != -1) ? qu0Var.m1 : qu0.u(qu0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (jl0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(jl0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - jl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (jl0Var.getMeasuredHeight() - jl0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.tk0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void J(jl0 jl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < jl0Var.getChildCount(); i11++) {
                View childAt = jl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    i10 = ((org.telegram.ui.Cells.p7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, jl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final void K() {
        this.d = true;
        it0 W = this.f.W(0);
        if (W != null) {
            qu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f.p1[0].m + i10;
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
        qu0 qu0Var = this.f;
        fu0[] fu0VarArr = qu0Var.p1;
        if (DialogObject.isEncryptedDialog(qu0Var.f1)) {
            if (fu0VarArr[0].a.size() != 0 || fu0VarArr[0].g) {
                if (fu0VarArr[0].a.size() == 0) {
                    boolean[] zArr = fu0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = fu0VarArr[0].c().size() + fu0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = fu0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        fu0 fu0Var = fu0VarArr[0];
        if (fu0Var.o) {
            return fu0Var.e();
        }
        if (fu0Var.a.size() != 0 || fu0VarArr[0].g) {
            if (fu0VarArr[0].a.size() == 0) {
                fu0 fu0Var2 = fu0VarArr[0];
                boolean[] zArr3 = fu0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (fu0VarArr[0].e() != 0) {
                return Math.max(fu0VarArr[0].e(), fu0VarArr[0].c().size() + fu0VarArr[0].d());
            }
            int size2 = fu0VarArr[0].c().size() + fu0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            fu0 fu0Var3 = fu0VarArr[0];
            boolean[] zArr4 = fu0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = fu0Var3.r;
            if ((z10 ? fu0Var3.u : fu0Var3.n) != 0) {
                return (z10 ? fu0Var3.u : fu0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // f2.p0
    public int j(int i10) {
        fu0[] fu0VarArr = this.f.p1;
        if (!this.d && fu0VarArr[0].c().size() == 0) {
            fu0 fu0Var = fu0VarArr[0];
            if (!fu0Var.g && fu0Var.l) {
                return 2;
            }
        }
        fu0VarArr[0].getClass();
        fu0VarArr[0].c().size();
        fu0VarArr[0].getClass();
        return 0;
    }

    @Override // f2.p0
    public int k() {
        return this.f.p1[0].e();
    }

    @Override // f2.p0
    public void v(f2.n1 n1Var, int i10) {
        qu0 qu0Var = this.f;
        int[] iArr = qu0Var.i1;
        fu0[] fu0VarArr = qu0Var.p1;
        if (n1Var.f == 0) {
            ArrayList c3 = fu0VarArr[0].c();
            int d = i10 - fu0VarArr[0].d();
            View view = n1Var.a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                int messageId = p7Var.getMessageId();
                int i11 = this == qu0Var.D ? iArr[0] : qu0.u(qu0Var, this) != -1 ? iArr[1] : qu0Var.m1;
                if (d < 0 || d >= c3.size()) {
                    p7Var.k(null, i11, false);
                    p7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c3.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (qu0Var.y1) {
                    p7Var.i(qu0Var.V0[(messageObject.getDialogId() > qu0Var.f1 ? 1 : (messageObject.getDialogId() == qu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    p7Var.i(false, z10);
                }
                p7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // f2.p0
    public f2.n1 x(ViewGroup viewGroup, int i10) {
        qu0 qu0Var = this.f;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            ct0 M = qu0.M(0, qu0Var.f1, context, c6Var);
            M.setLayoutParams(new f2.x0(-1, -1));
            return new vk0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.o7(viewGroup.getContext(), c6Var);
        }
        org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context, this.e, qu0Var.r1.getCurrentAccount());
        if (i10 == 19) {
            p7Var.s0 = true;
        }
        p7Var.setGradientView(qu0Var.y);
        if (qu0.u(qu0Var, this) != -1) {
            p7Var.W = true;
        }
        p7Var.setLayoutParams(new f2.x0(-1, -2));
        return new vk0(p7Var);
    }
}
