package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class bu0 extends jk0 {
    public final Context c;
    public boolean d;
    public org.telegram.ui.Cells.n7 e;
    public final /* synthetic */ hu0 f;

    public bu0(hu0 hu0Var, Context context) {
        this.f = hu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.jk0
    public final boolean E(zk0 zk0Var) {
        hu0 hu0Var = this.f;
        if (!hu0Var.t0()) {
            int ceil = (int) Math.ceil(k() / ((this == hu0Var.D || hu0.u(hu0Var, this) != -1) ? hu0Var.i1[0] : hu0Var.m1));
            if (zk0Var.getChildCount() != 0 && zk0Var.getChildAt(0).getMeasuredHeight() * ceil > zk0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jk0
    public String F(int i10) {
        ArrayList arrayList = this.f.p1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((et0) arrayList.get(i11)).b) {
                return ((et0) arrayList.get(i11)).a;
            }
        }
        return ((et0) i0.a.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.jk0
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
        hu0 hu0Var = this.f;
        int[] iArr2 = hu0Var.i1;
        int i10 = (hu0.v(hu0Var, this) != -1 || this == hu0Var.E) ? hu0Var.m1 : hu0.u(hu0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i10;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public final float H(zk0 zk0Var) {
        hu0 hu0Var = this.f;
        int[] iArr = hu0Var.i1;
        int i10 = (this == hu0Var.E || hu0.v(hu0Var, this) != -1) ? hu0Var.m1 : hu0.u(hu0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(k() / i10);
        if (zk0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(zk0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - zk0Var.getPaddingTop())) / ((ceil * measuredHeight) - (zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.jk0
    public void I() {
        this.f.c1(0, true);
    }

    @Override // org.telegram.ui.Components.jk0
    public final void J(zk0 zk0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < zk0Var.getChildCount(); i11++) {
                View childAt = zk0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    i10 = ((org.telegram.ui.Cells.o7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.S(0, zk0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public final void K() {
        this.d = true;
        zs0 W = this.f.W(0);
        if (W != null) {
            hu0.q(W, null, false);
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
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h() {
        hu0 hu0Var = this.f;
        wt0[] wt0VarArr = hu0Var.p1;
        if (DialogObject.isEncryptedDialog(hu0Var.f1)) {
            if (wt0VarArr[0].a.size() != 0 || wt0VarArr[0].g) {
                if (wt0VarArr[0].a.size() == 0) {
                    boolean[] zArr = wt0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = wt0VarArr[0].c().size() + wt0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = wt0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        wt0 wt0Var = wt0VarArr[0];
        if (wt0Var.o) {
            return wt0Var.e();
        }
        if (wt0Var.a.size() != 0 || wt0VarArr[0].g) {
            if (wt0VarArr[0].a.size() == 0) {
                wt0 wt0Var2 = wt0VarArr[0];
                boolean[] zArr3 = wt0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (wt0VarArr[0].e() != 0) {
                return Math.max(wt0VarArr[0].e(), wt0VarArr[0].c().size() + wt0VarArr[0].d());
            }
            int size2 = wt0VarArr[0].c().size() + wt0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            wt0 wt0Var3 = wt0VarArr[0];
            boolean[] zArr4 = wt0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = wt0Var3.r;
            if ((z10 ? wt0Var3.u : wt0Var3.n) != 0) {
                return (z10 ? wt0Var3.u : wt0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // f2.q0
    public int j(int i10) {
        wt0[] wt0VarArr = this.f.p1;
        if (!this.d && wt0VarArr[0].c().size() == 0) {
            wt0 wt0Var = wt0VarArr[0];
            if (!wt0Var.g && wt0Var.l) {
                return 2;
            }
        }
        wt0VarArr[0].getClass();
        wt0VarArr[0].c().size();
        wt0VarArr[0].getClass();
        return 0;
    }

    @Override // f2.q0
    public int k() {
        return this.f.p1[0].e();
    }

    @Override // f2.q0
    public void v(f2.o1 o1Var, int i10) {
        hu0 hu0Var = this.f;
        int[] iArr = hu0Var.i1;
        wt0[] wt0VarArr = hu0Var.p1;
        if (o1Var.f == 0) {
            ArrayList c10 = wt0VarArr[0].c();
            int d = i10 - wt0VarArr[0].d();
            View view = o1Var.a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                int messageId = o7Var.getMessageId();
                int i11 = this == hu0Var.D ? iArr[0] : hu0.u(hu0Var, this) != -1 ? iArr[1] : hu0Var.m1;
                if (d < 0 || d >= c10.size()) {
                    o7Var.k(null, i11, false);
                    o7Var.i(false, false);
                    return;
                }
                MessageObject messageObject = (MessageObject) c10.get(d);
                boolean z10 = messageObject.getId() == messageId;
                if (hu0Var.y1) {
                    o7Var.i(hu0Var.V0[(messageObject.getDialogId() > hu0Var.f1 ? 1 : (messageObject.getDialogId() == hu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z10);
                } else {
                    o7Var.i(false, z10);
                }
                o7Var.k(messageObject, i11, false);
            }
        }
    }

    @Override // f2.q0
    public f2.o1 x(ViewGroup viewGroup, int i10) {
        hu0 hu0Var = this.f;
        org.telegram.ui.ActionBar.c6 c6Var = hu0Var.B1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            ts0 M = hu0.M(0, hu0Var.f1, context, c6Var);
            M.setLayoutParams(new f2.y0(-1, -1));
            return new lk0(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.n7(viewGroup.getContext(), c6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.e, hu0Var.r1.getCurrentAccount());
        if (i10 == 19) {
            o7Var.s0 = true;
        }
        o7Var.setGradientView(hu0Var.y);
        if (hu0.u(hu0Var, this) != -1) {
            o7Var.W = true;
        }
        o7Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(o7Var);
    }
}
