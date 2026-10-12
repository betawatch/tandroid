package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements org.telegram.ui.ActionBar.z1, yq {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;

    public /* synthetic */ u8(h9 h9Var, int i10) {
        this.a = i10;
        this.b = h9Var;
    }

    @Override // org.telegram.ui.Components.yq
    public /* synthetic */ int L0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yq
    public void t0(int i10, int i11, boolean z10) {
        h9 h9Var = this.b;
        if (i11 == 0) {
            d9 d9Var = h9Var.Y;
            int i12 = d9Var.c;
            if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                d9 a2 = d9Var.a();
                h9Var.Y = a2;
                h9Var.a.b(a2, true);
                h9Var.n0();
            }
            h9Var.Y.c = i10;
        } else if (i11 == 1) {
            d9 d9Var2 = h9Var.Y;
            int i13 = d9Var2.d;
            if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                d9 a10 = d9Var2.a();
                h9Var.Y = a10;
                h9Var.a.b(a10, true);
                h9Var.n0();
            }
            h9Var.Y.d = i10;
        } else if (i11 == 2) {
            d9 d9Var3 = h9Var.Y;
            int i14 = d9Var3.e;
            if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                d9 a11 = d9Var3.a();
                h9Var.Y = a11;
                h9Var.a.b(a11, true);
                h9Var.n0();
            }
            h9Var.Y.e = i10;
        } else if (i11 == 3) {
            d9 d9Var4 = h9Var.Y;
            int i15 = d9Var4.f;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                d9 a12 = d9Var4.a();
                h9Var.Y = a12;
                h9Var.a.b(a12, true);
                h9Var.n0();
            }
            h9Var.Y.f = i10;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        h9Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.yq
    public /* synthetic */ void k(boolean z10) {
    }

    @Override // org.telegram.ui.Components.yq
    public /* synthetic */ void y() {
    }
}
