package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public class ev0 extends el0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final /* synthetic */ kv0 f;

    public ev0(kv0 kv0Var, Context context) {
        this.f = kv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public final boolean E(wl0 wl0Var) {
        kv0 kv0Var = this.f;
        if (!kv0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == kv0Var.H || kv0.u(kv0Var, this) != -1) ? kv0Var.m1[0] : kv0Var.q1));
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
            if (i10 <= ((iu0) arrayList.get(i11)).b) {
                return ((iu0) arrayList.get(i11)).a;
            }
        }
        return ((iu0) hg.k0.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.el0
    public final void G(wl0 wl0Var, float f7, int[] iArr) {
        int measuredHeight = wl0Var.getChildAt(0).getMeasuredHeight();
        kv0 kv0Var = this.f;
        int[] iArr2 = kv0Var.m1;
        int i10 = (kv0.v(kv0Var, this) != -1 || this == kv0Var.I) ? kv0Var.q1 : kv0.u(kv0Var, this) != -1 ? iArr2[1] : iArr2[0];
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
        kv0 kv0Var = this.f;
        int[] iArr = kv0Var.m1;
        int i10 = (this == kv0Var.I || kv0.v(kv0Var, this) != -1) ? kv0Var.q1 : kv0.u(kv0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (wl0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = wl0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.S(wl0Var.getChildAt(0)) < 0) {
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
        du0 W = this.f.W(0);
        if (W != null) {
            kv0.q(W, null, false);
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
        kv0 kv0Var = this.f;
        zu0[] zu0VarArr = kv0Var.t1;
        if (DialogObject.isEncryptedDialog(kv0Var.j1)) {
            if (zu0VarArr[0].a.size() != 0 || zu0VarArr[0].g) {
                if (zu0VarArr[0].a.size() == 0) {
                    boolean[] zArr = zu0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = zu0VarArr[0].c().size() + zu0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = zu0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        zu0 zu0Var = zu0VarArr[0];
        if (zu0Var.o) {
            return zu0Var.e();
        }
        if (zu0Var.a.size() != 0 || zu0VarArr[0].g) {
            if (zu0VarArr[0].a.size() == 0) {
                zu0 zu0Var2 = zu0VarArr[0];
                boolean[] zArr3 = zu0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (zu0VarArr[0].e() != 0) {
                return Math.max(zu0VarArr[0].e(), zu0VarArr[0].c().size() + zu0VarArr[0].d());
            }
            int size2 = zu0VarArr[0].c().size() + zu0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            zu0 zu0Var3 = zu0VarArr[0];
            boolean[] zArr4 = zu0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = zu0Var3.r;
            if ((z10 ? zu0Var3.u : zu0Var3.n) != 0) {
                return (z10 ? zu0Var3.u : zu0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.h0
    public int j(int i10) {
        zu0[] zu0VarArr = this.f.t1;
        if (!this.d && zu0VarArr[0].c().size() == 0) {
            zu0 zu0Var = zu0VarArr[0];
            if (!zu0Var.g && zu0Var.l) {
                return 2;
            }
        }
        zu0VarArr[0].getClass();
        zu0VarArr[0].c().size();
        zu0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.h0
    public int k() {
        return this.f.t1[0].e();
    }

    @Override // s4.h0
    public void v(s4.c1 c1Var, int i10) {
        kv0 kv0Var = this.f;
        int[] iArr = kv0Var.m1;
        zu0[] zu0VarArr = kv0Var.t1;
        if (c1Var.f == 0) {
            ArrayList c10 = zu0VarArr[0].c();
            int d = i10 - zu0VarArr[0].d();
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                int i11 = this == kv0Var.H ? iArr[0] : kv0.u(kv0Var, this) != -1 ? iArr[1] : kv0Var.q1;
                if (d < 0 || d >= c10.size()) {
                    t7Var.k(null, i11, false);
                    t7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (kv0Var.C1) {
                    t7Var.i(kv0Var.Z0[(messageObject.getDialogId() > kv0Var.j1 ? 1 : (messageObject.getDialogId() == kv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    t7Var.i(false, z10);
                }
                t7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // s4.h0
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        kv0 kv0Var = this.f;
        org.telegram.ui.ActionBar.e6 e6Var = kv0Var.F1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            xt0 M = kv0.M(0, kv0Var.j1, context, e6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new gl0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, kv0Var.v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.w0 = true;
        }
        t7Var.setGradientView(kv0Var.y);
        if (kv0.u(kv0Var, this) != -1) {
            t7Var.d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new gl0(t7Var);
    }
}
