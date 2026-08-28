package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class yt0 extends gk0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.q7 e;
    public final /* synthetic */ eu0 f;

    public yt0(eu0 eu0Var, Context context) {
        this.f = eu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.gk0
    public final boolean E(wk0 wk0Var) {
        eu0 eu0Var = this.f;
        if (!eu0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == eu0Var.D || eu0.u(eu0Var, this) != -1) ? eu0Var.i1[0] : eu0Var.m1));
            if (wk0Var.getChildCount() != 0 && wk0Var.getChildAt(0).getMeasuredHeight() * ceil > wk0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.gk0
    public String F(int i9) {
        ArrayList arrayList = this.f.p1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i9 <= ((ct0) arrayList.get(i10)).b) {
                return ((ct0) arrayList.get(i10)).a;
            }
        }
        return ((ct0) j3.r0.j(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
        eu0 eu0Var = this.f;
        int[] iArr2 = eu0Var.i1;
        int i9 = (eu0.v(eu0Var, this) != -1 || this == eu0Var.E) ? eu0Var.m1 : eu0.u(eu0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i9) * measuredHeight);
        int measuredHeight2 = wk0Var.getMeasuredHeight() - wk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i9;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.gk0
    public final float H(wk0 wk0Var) {
        eu0 eu0Var = this.f;
        int[] iArr = eu0Var.i1;
        int i9 = (this == eu0Var.E || eu0.v(eu0Var, this) != -1) ? eu0Var.m1 : eu0.u(eu0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i9);
        if (wk0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(wk0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i9) * measuredHeight) - (r3.getTop() - wk0Var.getPaddingTop())) / ((ceil * measuredHeight) - (wk0Var.getMeasuredHeight() - wk0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.gk0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.gk0
    public final void J(wk0 wk0Var) {
        if (this.d) {
            this.d = false;
            int i9 = 0;
            for (int i10 = 0; i10 < wk0Var.getChildCount(); i10++) {
                View childAt = wk0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r7) {
                    i9 = ((org.telegram.ui.Cells.r7) childAt).getMessageId();
                }
                if (i9 != 0) {
                    break;
                }
            }
            if (i9 == 0) {
                this.f.S(0, wk0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.gk0
    public final void K() {
        this.d = true;
        xs0 W = this.f.W(0);
        if (W != null) {
            eu0.q(W, null, false);
        }
    }

    public int L(int i9) {
        return this.f.p1[0].m + i9;
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h() {
        eu0 eu0Var = this.f;
        tt0[] tt0VarArr = eu0Var.p1;
        if (DialogObject.isEncryptedDialog(eu0Var.f1)) {
            if (tt0VarArr[0].a.size() != 0 || tt0VarArr[0].g) {
                if (tt0VarArr[0].a.size() == 0) {
                    boolean[] zArr = tt0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = tt0VarArr[0].c().size() + tt0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = tt0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        tt0 tt0Var = tt0VarArr[0];
        if (tt0Var.o) {
            return tt0Var.e();
        }
        if (tt0Var.a.size() != 0 || tt0VarArr[0].g) {
            if (tt0VarArr[0].a.size() == 0) {
                tt0 tt0Var2 = tt0VarArr[0];
                boolean[] zArr3 = tt0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (tt0VarArr[0].e() != 0) {
                return Math.max(tt0VarArr[0].e(), tt0VarArr[0].c().size() + tt0VarArr[0].d());
            }
            int size2 = tt0VarArr[0].c().size() + tt0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            tt0 tt0Var3 = tt0VarArr[0];
            boolean[] zArr4 = tt0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = tt0Var3.r;
            if ((z10 ? tt0Var3.u : tt0Var3.n) != 0) {
                return (z10 ? tt0Var3.u : tt0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // f2.r0
    public int j(int i9) {
        tt0[] tt0VarArr = this.f.p1;
        if (!this.d && tt0VarArr[0].c().size() == 0) {
            tt0 tt0Var = tt0VarArr[0];
            if (!tt0Var.g && tt0Var.l) {
                return 2;
            }
        }
        tt0VarArr[0].getClass();
        tt0VarArr[0].c().size();
        tt0VarArr[0].getClass();
        return 0;
    }

    @Override // f2.r0
    public int k() {
        return this.f.p1[0].e();
    }

    @Override // f2.r0
    public void v(f2.q1 q1Var, int i9) {
        eu0 eu0Var = this.f;
        int[] iArr = eu0Var.i1;
        tt0[] tt0VarArr = eu0Var.p1;
        if (q1Var.f == 0) {
            ArrayList c10 = tt0VarArr[0].c();
            int d = i9 - tt0VarArr[0].d();
            View view = q1Var.a;
            if (view instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                int messageId = r7Var.getMessageId();
                int i10 = this == eu0Var.D ? iArr[0] : eu0.u(eu0Var, this) != -1 ? iArr[1] : eu0Var.m1;
                if (d < 0 || d >= c10.size()) {
                    r7Var.k(null, i10, false);
                    r7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (eu0Var.y1) {
                    r7Var.i(eu0Var.V0[(messageObject.getDialogId() > eu0Var.f1 ? 1 : (messageObject.getDialogId() == eu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    r7Var.i(false, z10);
                }
                r7Var.k(messageObject, i10, false);
            }
        }
    }

    @Override // f2.r0
    public f2.q1 x(ViewGroup viewGroup, int i9) {
        eu0 eu0Var = this.f;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.c;
        if (i9 != 0 && i9 != 19) {
            rs0 M = eu0.M(0, eu0Var.f1, context, b6Var);
            M.setLayoutParams(new f2.a1(-1, -1));
            return new ik0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.q7(viewGroup.getContext(), b6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.e, eu0Var.r1.getCurrentAccount());
        if (i9 == 19) {
            r7Var.s0 = true;
        }
        r7Var.setGradientView(eu0Var.y);
        if (eu0.u(eu0Var, this) != -1) {
            r7Var.W = true;
        }
        r7Var.setLayoutParams(new f2.a1(-1, -2));
        return new ik0(r7Var);
    }
}
