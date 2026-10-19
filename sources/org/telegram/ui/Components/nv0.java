package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class nv0 extends ql0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.r7 e;
    public final /* synthetic */ tv0 f;

    public nv0(tv0 tv0Var, Context context) {
        this.f = tv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean E(im0 im0Var) {
        tv0 tv0Var = this.f;
        if (!tv0Var.v0()) {
            int ceil = (int) Math.ceil(k() / ((this == tv0Var.H || tv0.v(tv0Var, this) != -1) ? tv0Var.m1[0] : tv0Var.q1));
            if (im0Var.getChildCount() != 0 && im0Var.getChildAt(0).getMeasuredHeight() * ceil > im0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ql0
    public String F(int i10) {
        ArrayList arrayList = this.f.t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((ru0) arrayList.get(i11)).b) {
                return ((ru0) arrayList.get(i11)).a;
            }
        }
        return ((ru0) i2.e.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void G(im0 im0Var, float f7, int[] iArr) {
        int measuredHeight = im0Var.getChildAt(0).getMeasuredHeight();
        tv0 tv0Var = this.f;
        int[] iArr2 = tv0Var.m1;
        int i10 = (tv0.p(tv0Var, this) != -1 || this == tv0Var.I) ? tv0Var.q1 : tv0.v(tv0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = im0Var.getMeasuredHeight() - im0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final float H(im0 im0Var) {
        tv0 tv0Var = this.f;
        int[] iArr = tv0Var.m1;
        int i10 = (this == tv0Var.I || tv0.p(tv0Var, this) != -1) ? tv0Var.q1 : tv0.v(tv0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (im0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = im0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(im0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - im0Var.getPaddingTop())) / ((ceil * measuredHeight) - (im0Var.getMeasuredHeight() - im0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.ql0
    public void I() {
        this.f.e1(0, true);
    }

    @Override // org.telegram.ui.Components.ql0
    public final void J(im0 im0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < im0Var.getChildCount(); i11++) {
                View childAt = im0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    i10 = ((org.telegram.ui.Cells.s7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, im0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final void K() {
        this.d = true;
        mu0 W = this.f.W(0);
        if (W != null) {
            tv0.r(W, null, false);
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h() {
        tv0 tv0Var = this.f;
        iv0[] iv0VarArr = tv0Var.t1;
        if (DialogObject.isEncryptedDialog(tv0Var.j1)) {
            if (iv0VarArr[0].a.size() != 0 || iv0VarArr[0].g) {
                if (iv0VarArr[0].a.size() == 0) {
                    boolean[] zArr = iv0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = iv0VarArr[0].c().size() + iv0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = iv0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        iv0 iv0Var = iv0VarArr[0];
        if (iv0Var.o) {
            return iv0Var.e();
        }
        if (iv0Var.a.size() != 0 || iv0VarArr[0].g) {
            if (iv0VarArr[0].a.size() == 0) {
                iv0 iv0Var2 = iv0VarArr[0];
                boolean[] zArr3 = iv0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (iv0VarArr[0].e() != 0) {
                return Math.max(iv0VarArr[0].e(), iv0VarArr[0].c().size() + iv0VarArr[0].d());
            }
            int size2 = iv0VarArr[0].c().size() + iv0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            iv0 iv0Var3 = iv0VarArr[0];
            boolean[] zArr4 = iv0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = iv0Var3.r;
            if ((z10 ? iv0Var3.u : iv0Var3.n) != 0) {
                return (z10 ? iv0Var3.u : iv0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.g0
    public int j(int i10) {
        iv0[] iv0VarArr = this.f.t1;
        if (!this.d && iv0VarArr[0].c().size() == 0) {
            iv0 iv0Var = iv0VarArr[0];
            if (!iv0Var.g && iv0Var.l) {
                return 2;
            }
        }
        iv0VarArr[0].getClass();
        iv0VarArr[0].c().size();
        iv0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.g0
    public int k() {
        return this.f.t1[0].e();
    }

    @Override // s4.g0
    public void v(s4.b1 b1Var, int i10) {
        tv0 tv0Var = this.f;
        int[] iArr = tv0Var.m1;
        iv0[] iv0VarArr = tv0Var.t1;
        if (b1Var.f == 0) {
            ArrayList c10 = iv0VarArr[0].c();
            int d = i10 - iv0VarArr[0].d();
            View view = b1Var.a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                int messageId = s7Var.getMessageId();
                int i11 = this == tv0Var.H ? iArr[0] : tv0.v(tv0Var, this) != -1 ? iArr[1] : tv0Var.q1;
                if (d < 0 || d >= c10.size()) {
                    s7Var.k(null, i11, false);
                    s7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (tv0Var.C1) {
                    s7Var.i(tv0Var.Z0[(messageObject.getDialogId() > tv0Var.j1 ? 1 : (messageObject.getDialogId() == tv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    s7Var.i(false, z10);
                }
                s7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // s4.g0
    public s4.b1 x(ViewGroup viewGroup, int i10) {
        tv0 tv0Var = this.f;
        org.telegram.ui.ActionBar.d6 d6Var = tv0Var.F1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            gu0 M = tv0.M(0, tv0Var.j1, context, d6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new sl0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.r7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.e, tv0Var.v1.getCurrentAccount());
        if (i10 == 19) {
            s7Var.w0 = true;
        }
        s7Var.setGradientView(tv0Var.y);
        if (tv0.v(tv0Var, this) != -1) {
            s7Var.d0 = true;
        }
        s7Var.setLayoutParams(new s4.o0(-1, -2));
        return new sl0(s7Var);
    }
}
