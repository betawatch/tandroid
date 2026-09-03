package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class su0 extends bl0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.p7 e;
    public final /* synthetic */ yu0 f;

    public su0(yu0 yu0Var, Context context) {
        this.f = yu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public final boolean E(rl0 rl0Var) {
        yu0 yu0Var = this.f;
        if (!yu0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == yu0Var.E || yu0.u(yu0Var, this) != -1) ? yu0Var.j1[0] : yu0Var.n1));
            if (rl0Var.getChildCount() != 0 && rl0Var.getChildAt(0).getMeasuredHeight() * ceil > rl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public String F(int i10) {
        ArrayList arrayList = this.f.q1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((vt0) arrayList.get(i11)).b) {
                return ((vt0) arrayList.get(i11)).a;
            }
        }
        return ((vt0) kf.k0.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.bl0
    public final void G(rl0 rl0Var, float f10, int[] iArr) {
        int measuredHeight = rl0Var.getChildAt(0).getMeasuredHeight();
        yu0 yu0Var = this.f;
        int[] iArr2 = yu0Var.j1;
        int i10 = (yu0.v(yu0Var, this) != -1 || this == yu0Var.F) ? yu0Var.n1 : yu0.u(yu0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = rl0Var.getMeasuredHeight() - rl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i10;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public final float H(rl0 rl0Var) {
        yu0 yu0Var = this.f;
        int[] iArr = yu0Var.j1;
        int i10 = (this == yu0Var.F || yu0.v(yu0Var, this) != -1) ? yu0Var.n1 : yu0.u(yu0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (rl0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = rl0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(rl0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - rl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (rl0Var.getMeasuredHeight() - rl0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.bl0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.bl0
    public final void J(rl0 rl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < rl0Var.getChildCount(); i11++) {
                View childAt = rl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q7) {
                    i10 = ((org.telegram.ui.Cells.q7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, rl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public final void K() {
        this.d = true;
        qt0 W = this.f.W(0);
        if (W != null) {
            yu0.q(W, null, false);
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
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h() {
        yu0 yu0Var = this.f;
        nu0[] nu0VarArr = yu0Var.q1;
        if (DialogObject.isEncryptedDialog(yu0Var.g1)) {
            if (nu0VarArr[0].a.size() != 0 || nu0VarArr[0].g) {
                if (nu0VarArr[0].a.size() == 0) {
                    boolean[] zArr = nu0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = nu0VarArr[0].c().size() + nu0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = nu0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        nu0 nu0Var = nu0VarArr[0];
        if (nu0Var.o) {
            return nu0Var.e();
        }
        if (nu0Var.a.size() != 0 || nu0VarArr[0].g) {
            if (nu0VarArr[0].a.size() == 0) {
                nu0 nu0Var2 = nu0VarArr[0];
                boolean[] zArr3 = nu0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (nu0VarArr[0].e() != 0) {
                return Math.max(nu0VarArr[0].e(), nu0VarArr[0].c().size() + nu0VarArr[0].d());
            }
            int size2 = nu0VarArr[0].c().size() + nu0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            nu0 nu0Var3 = nu0VarArr[0];
            boolean[] zArr4 = nu0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z4 = nu0Var3.r;
            if ((z4 ? nu0Var3.u : nu0Var3.n) != 0) {
                return (z4 ? nu0Var3.u : nu0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // f2.o0
    public int j(int i10) {
        nu0[] nu0VarArr = this.f.q1;
        if (!this.d && nu0VarArr[0].c().size() == 0) {
            nu0 nu0Var = nu0VarArr[0];
            if (!nu0Var.g && nu0Var.l) {
                return 2;
            }
        }
        nu0VarArr[0].getClass();
        nu0VarArr[0].c().size();
        nu0VarArr[0].getClass();
        return 0;
    }

    @Override // f2.o0
    public int k() {
        return this.f.q1[0].e();
    }

    @Override // f2.o0
    public void v(f2.l1 l1Var, int i10) {
        yu0 yu0Var = this.f;
        int[] iArr = yu0Var.j1;
        nu0[] nu0VarArr = yu0Var.q1;
        if (l1Var.f == 0) {
            ArrayList c3 = nu0VarArr[0].c();
            int d = i10 - nu0VarArr[0].d();
            View view = l1Var.a;
            if (view instanceof org.telegram.ui.Cells.q7) {
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                int messageId = q7Var.getMessageId();
                int i11 = this == yu0Var.E ? iArr[0] : yu0.u(yu0Var, this) != -1 ? iArr[1] : yu0Var.n1;
                if (d < 0 || d >= c3.size()) {
                    q7Var.k(null, i11, false);
                    q7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c3.get(d);
                boolean z4 = messageObject.getId() == messageId;
                if (yu0Var.z1) {
                    q7Var.i(yu0Var.W0[(messageObject.getDialogId() > yu0Var.g1 ? 1 : (messageObject.getDialogId() == yu0Var.g1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z4);
                } else {
                    q7Var.i(false, z4);
                }
                q7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // f2.o0
    public f2.l1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = yu0Var.C1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            kt0 M = yu0.M(0, yu0Var.g1, context, f6Var);
            M.setLayoutParams(new f2.w0(-1, -1));
            return new dl0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.p7(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.q7 q7Var = new org.telegram.ui.Cells.q7(context, this.e, yu0Var.s1.getCurrentAccount());
        if (i10 == 19) {
            q7Var.t0 = true;
        }
        q7Var.setGradientView(yu0Var.y);
        if (yu0.u(yu0Var, this) != -1) {
            q7Var.a0 = true;
        }
        q7Var.setLayoutParams(new f2.w0(-1, -2));
        return new dl0(q7Var);
    }
}
