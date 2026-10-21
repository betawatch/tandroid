package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public class ov0 extends rl0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.r7 e;
    public final /* synthetic */ uv0 f;

    public ov0(uv0 uv0Var, Context context) {
        this.f = uv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.im0
    public boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean E(jm0 jm0Var) {
        uv0 uv0Var = this.f;
        if (!uv0Var.v0()) {
            int ceil = (int) Math.ceil(k() / ((this == uv0Var.H || uv0.v(uv0Var, this) != -1) ? uv0Var.m1[0] : uv0Var.q1));
            if (jm0Var.getChildCount() != 0 && jm0Var.getChildAt(0).getMeasuredHeight() * ceil > jm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rl0
    public String F(int i10) {
        ArrayList arrayList = this.f.t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((su0) arrayList.get(i11)).b) {
                return ((su0) arrayList.get(i11)).a;
            }
        }
        return ((su0) i2.e.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void G(jm0 jm0Var, float f7, int[] iArr) {
        int measuredHeight = jm0Var.getChildAt(0).getMeasuredHeight();
        uv0 uv0Var = this.f;
        int[] iArr2 = uv0Var.m1;
        int i10 = (uv0.p(uv0Var, this) != -1 || this == uv0Var.I) ? uv0Var.q1 : uv0.v(uv0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = jm0Var.getMeasuredHeight() - jm0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final float H(jm0 jm0Var) {
        uv0 uv0Var = this.f;
        int[] iArr = uv0Var.m1;
        int i10 = (this == uv0Var.I || uv0.p(uv0Var, this) != -1) ? uv0Var.q1 : uv0.v(uv0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (jm0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = jm0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(jm0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - jm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (jm0Var.getMeasuredHeight() - jm0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.rl0
    public void I() {
        this.f.e1(0, true);
    }

    @Override // org.telegram.ui.Components.rl0
    public final void J(jm0 jm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < jm0Var.getChildCount(); i11++) {
                View childAt = jm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    i10 = ((org.telegram.ui.Cells.s7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, jm0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final void K() {
        this.d = true;
        nu0 W = this.f.W(0);
        if (W != null) {
            uv0.r(W, null, false);
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
        uv0 uv0Var = this.f;
        jv0[] jv0VarArr = uv0Var.t1;
        if (DialogObject.isEncryptedDialog(uv0Var.j1)) {
            if (jv0VarArr[0].a.size() != 0 || jv0VarArr[0].g) {
                if (jv0VarArr[0].a.size() == 0) {
                    boolean[] zArr = jv0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = jv0VarArr[0].c().size() + jv0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = jv0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        jv0 jv0Var = jv0VarArr[0];
        if (jv0Var.o) {
            return jv0Var.e();
        }
        if (jv0Var.a.size() != 0 || jv0VarArr[0].g) {
            if (jv0VarArr[0].a.size() == 0) {
                jv0 jv0Var2 = jv0VarArr[0];
                boolean[] zArr3 = jv0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (jv0VarArr[0].e() != 0) {
                return Math.max(jv0VarArr[0].e(), jv0VarArr[0].c().size() + jv0VarArr[0].d());
            }
            int size2 = jv0VarArr[0].c().size() + jv0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            jv0 jv0Var3 = jv0VarArr[0];
            boolean[] zArr4 = jv0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = jv0Var3.r;
            if ((z10 ? jv0Var3.u : jv0Var3.n) != 0) {
                return (z10 ? jv0Var3.u : jv0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.g0
    public int j(int i10) {
        jv0[] jv0VarArr = this.f.t1;
        if (!this.d && jv0VarArr[0].c().size() == 0) {
            jv0 jv0Var = jv0VarArr[0];
            if (!jv0Var.g && jv0Var.l) {
                return 2;
            }
        }
        jv0VarArr[0].getClass();
        jv0VarArr[0].c().size();
        jv0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.g0
    public int k() {
        return this.f.t1[0].e();
    }

    @Override // s4.g0
    public void v(s4.b1 b1Var, int i10) {
        uv0 uv0Var = this.f;
        int[] iArr = uv0Var.m1;
        jv0[] jv0VarArr = uv0Var.t1;
        if (b1Var.f == 0) {
            ArrayList c10 = jv0VarArr[0].c();
            int d = i10 - jv0VarArr[0].d();
            View view = b1Var.a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                int messageId = s7Var.getMessageId();
                int i11 = this == uv0Var.H ? iArr[0] : uv0.v(uv0Var, this) != -1 ? iArr[1] : uv0Var.q1;
                if (d < 0 || d >= c10.size()) {
                    s7Var.k(null, i11, false);
                    s7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (uv0Var.C1) {
                    s7Var.i(uv0Var.Z0[(messageObject.getDialogId() > uv0Var.j1 ? 1 : (messageObject.getDialogId() == uv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    s7Var.i(false, z10);
                }
                s7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // s4.g0
    public s4.b1 x(ViewGroup viewGroup, int i10) {
        uv0 uv0Var = this.f;
        org.telegram.ui.ActionBar.d6 d6Var = uv0Var.F1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            hu0 M = uv0.M(0, uv0Var.j1, context, d6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new tl0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.r7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.e, uv0Var.v1.getCurrentAccount());
        if (i10 == 19) {
            s7Var.w0 = true;
        }
        s7Var.setGradientView(uv0Var.y);
        if (uv0.v(uv0Var, this) != -1) {
            s7Var.d0 = true;
        }
        s7Var.setLayoutParams(new s4.o0(-1, -2));
        return new tl0(s7Var);
    }
}
