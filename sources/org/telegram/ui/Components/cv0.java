package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class cv0 extends dl0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.t7 e;
    public final /* synthetic */ iv0 f;

    public cv0(iv0 iv0Var, Context context) {
        this.f = iv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public final boolean E(vl0 vl0Var) {
        iv0 iv0Var = this.f;
        if (!iv0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == iv0Var.H || iv0.u(iv0Var, this) != -1) ? iv0Var.m1[0] : iv0Var.q1));
            if (vl0Var.getChildCount() != 0 && vl0Var.getChildAt(0).getMeasuredHeight() * ceil > vl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public String F(int i10) {
        ArrayList arrayList = this.f.t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((fu0) arrayList.get(i11)).b) {
                return ((fu0) arrayList.get(i11)).a;
            }
        }
        return ((fu0) hc.b.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        iv0 iv0Var = this.f;
        int[] iArr2 = iv0Var.m1;
        int i10 = (iv0.v(iv0Var, this) != -1 || this == iv0Var.I) ? iv0Var.q1 : iv0.u(iv0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final float H(vl0 vl0Var) {
        iv0 iv0Var = this.f;
        int[] iArr = iv0Var.m1;
        int i10 = (this == iv0Var.I || iv0.v(iv0Var, this) != -1) ? iv0Var.q1 : iv0.u(iv0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (vl0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(vl0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - vl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.dl0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void J(vl0 vl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
                View childAt = vl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    i10 = ((org.telegram.ui.Cells.u7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, vl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final void K() {
        this.d = true;
        au0 W = this.f.W(0);
        if (W != null) {
            iv0.q(W, null, false);
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
        iv0 iv0Var = this.f;
        xu0[] xu0VarArr = iv0Var.t1;
        if (DialogObject.isEncryptedDialog(iv0Var.j1)) {
            if (xu0VarArr[0].a.size() != 0 || xu0VarArr[0].g) {
                if (xu0VarArr[0].a.size() == 0) {
                    boolean[] zArr = xu0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = xu0VarArr[0].c().size() + xu0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = xu0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        xu0 xu0Var = xu0VarArr[0];
        if (xu0Var.o) {
            return xu0Var.e();
        }
        if (xu0Var.a.size() != 0 || xu0VarArr[0].g) {
            if (xu0VarArr[0].a.size() == 0) {
                xu0 xu0Var2 = xu0VarArr[0];
                boolean[] zArr3 = xu0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (xu0VarArr[0].e() != 0) {
                return Math.max(xu0VarArr[0].e(), xu0VarArr[0].c().size() + xu0VarArr[0].d());
            }
            int size2 = xu0VarArr[0].c().size() + xu0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            xu0 xu0Var3 = xu0VarArr[0];
            boolean[] zArr4 = xu0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = xu0Var3.r;
            if ((z10 ? xu0Var3.u : xu0Var3.n) != 0) {
                return (z10 ? xu0Var3.u : xu0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.h0
    public int j(int i10) {
        xu0[] xu0VarArr = this.f.t1;
        if (!this.d && xu0VarArr[0].c().size() == 0) {
            xu0 xu0Var = xu0VarArr[0];
            if (!xu0Var.g && xu0Var.l) {
                return 2;
            }
        }
        xu0VarArr[0].getClass();
        xu0VarArr[0].c().size();
        xu0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.h0
    public int k() {
        return this.f.t1[0].e();
    }

    @Override // s4.h0
    public void v(s4.c1 c1Var, int i10) {
        iv0 iv0Var = this.f;
        int[] iArr = iv0Var.m1;
        xu0[] xu0VarArr = iv0Var.t1;
        if (c1Var.f == 0) {
            ArrayList c10 = xu0VarArr[0].c();
            int d = i10 - xu0VarArr[0].d();
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.u7) {
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                int messageId = u7Var.getMessageId();
                int i11 = this == iv0Var.H ? iArr[0] : iv0.u(iv0Var, this) != -1 ? iArr[1] : iv0Var.q1;
                if (d < 0 || d >= c10.size()) {
                    u7Var.k(null, i11, false);
                    u7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (iv0Var.C1) {
                    u7Var.i(iv0Var.Z0[(messageObject.getDialogId() > iv0Var.j1 ? 1 : (messageObject.getDialogId() == iv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    u7Var.i(false, z10);
                }
                u7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // s4.h0
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        iv0 iv0Var = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = iv0Var.F1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            ut0 M = iv0.M(0, iv0Var.j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new fl0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.t7(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.e, iv0Var.v1.getCurrentAccount());
        if (i10 == 19) {
            u7Var.w0 = true;
        }
        u7Var.setGradientView(iv0Var.y);
        if (iv0.u(iv0Var, this) != -1) {
            u7Var.d0 = true;
        }
        u7Var.setLayoutParams(new s4.p0(-1, -2));
        return new fl0(u7Var);
    }
}
