package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class uv0 extends tl0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.v7 e;
    public final /* synthetic */ aw0 f;

    public uv0(aw0 aw0Var, Context context) {
        this.f = aw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean E(mm0 mm0Var) {
        aw0 aw0Var = this.f;
        if (!aw0Var.B0()) {
            int ceil = (int) Math.ceil(k() / ((this == aw0Var.J || aw0.w(aw0Var, this) != -1) ? aw0Var.o1[0] : aw0Var.s1));
            if (mm0Var.getChildCount() != 0 && mm0Var.getChildAt(0).getMeasuredHeight() * ceil > mm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tl0
    public String F(int i10) {
        ArrayList arrayList = this.f.v1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((zu0) arrayList.get(i11)).b) {
                return ((zu0) arrayList.get(i11)).a;
            }
        }
        return ((zu0) ic.a.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        aw0 aw0Var = this.f;
        int[] iArr2 = aw0Var.o1;
        int i10 = (aw0.x(aw0Var, this) != -1 || this == aw0Var.K) ? aw0Var.s1 : aw0.w(aw0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = mm0Var.getMeasuredHeight() - mm0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.tl0
    public final float H(mm0 mm0Var) {
        aw0 aw0Var = this.f;
        int[] iArr = aw0Var.o1;
        int i10 = (this == aw0Var.K || aw0.x(aw0Var, this) != -1) ? aw0Var.s1 : aw0.w(aw0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (mm0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(mm0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - mm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (mm0Var.getMeasuredHeight() - mm0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.tl0
    public void I() {
        this.f.l1(0, true);
    }

    @Override // org.telegram.ui.Components.tl0
    public final void J(mm0 mm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                View childAt = mm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.w7) {
                    i10 = ((org.telegram.ui.Cells.w7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.Z(0, mm0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.tl0
    public final void K() {
        this.d = true;
        tu0 d02 = this.f.d0(0);
        if (d02 != null) {
            aw0.t(d02, null, false);
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h() {
        aw0 aw0Var = this.f;
        pv0[] pv0VarArr = aw0Var.v1;
        if (DialogObject.isEncryptedDialog(aw0Var.l1)) {
            if (pv0VarArr[0].a.size() != 0 || pv0VarArr[0].g) {
                if (pv0VarArr[0].a.size() == 0) {
                    boolean[] zArr = pv0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = pv0VarArr[0].c().size() + pv0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = pv0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        pv0 pv0Var = pv0VarArr[0];
        if (pv0Var.o) {
            return pv0Var.e();
        }
        if (pv0Var.a.size() != 0 || pv0VarArr[0].g) {
            if (pv0VarArr[0].a.size() == 0) {
                pv0 pv0Var2 = pv0VarArr[0];
                boolean[] zArr3 = pv0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (pv0VarArr[0].e() != 0) {
                return Math.max(pv0VarArr[0].e(), pv0VarArr[0].c().size() + pv0VarArr[0].d());
            }
            int size2 = pv0VarArr[0].c().size() + pv0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            pv0 pv0Var3 = pv0VarArr[0];
            boolean[] zArr4 = pv0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = pv0Var3.r;
            if ((z10 ? pv0Var3.u : pv0Var3.n) != 0) {
                return (z10 ? pv0Var3.u : pv0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.h0
    public int j(int i10) {
        pv0[] pv0VarArr = this.f.v1;
        if (!this.d && pv0VarArr[0].c().size() == 0) {
            pv0 pv0Var = pv0VarArr[0];
            if (!pv0Var.g && pv0Var.l) {
                return 2;
            }
        }
        pv0VarArr[0].getClass();
        pv0VarArr[0].c().size();
        pv0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.h0
    public int k() {
        return this.f.v1[0].e();
    }

    @Override // s4.h0
    public void v(s4.e1 e1Var, int i10) {
        aw0 aw0Var = this.f;
        int[] iArr = aw0Var.o1;
        pv0[] pv0VarArr = aw0Var.v1;
        if (e1Var.f == 0) {
            ArrayList c10 = pv0VarArr[0].c();
            int d = i10 - pv0VarArr[0].d();
            View view = e1Var.a;
            if (view instanceof org.telegram.ui.Cells.w7) {
                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                int messageId = w7Var.getMessageId();
                int i11 = this == aw0Var.J ? iArr[0] : aw0.w(aw0Var, this) != -1 ? iArr[1] : aw0Var.s1;
                if (d < 0 || d >= c10.size()) {
                    w7Var.k(null, i11, false);
                    w7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (aw0Var.E1) {
                    w7Var.i(aw0Var.b1[(messageObject.getDialogId() > aw0Var.l1 ? 1 : (messageObject.getDialogId() == aw0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    w7Var.i(false, z10);
                }
                w7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // s4.h0
    public s4.e1 x(ViewGroup viewGroup, int i10) {
        aw0 aw0Var = this.f;
        org.telegram.ui.ActionBar.u6 u6Var = aw0Var.H1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            nu0 U = aw0.U(0, aw0Var.l1, context, u6Var);
            U.setLayoutParams(new s4.q0(-1, -1));
            return new vl0(U);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.v7(viewGroup.getContext(), u6Var);
        }
        org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7(context, this.e, aw0Var.x1.getCurrentAccount());
        if (i10 == 19) {
            w7Var.w0 = true;
        }
        w7Var.setGradientView(aw0Var.y);
        if (aw0.w(aw0Var, this) != -1) {
            w7Var.d0 = true;
        }
        w7Var.setLayoutParams(new s4.q0(-1, -2));
        return new vl0(w7Var);
    }
}
