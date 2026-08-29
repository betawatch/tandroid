package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements org.telegram.ui.ActionBar.b2, fq {
    public final /* synthetic */ int a;
    public final /* synthetic */ b9 b;

    public /* synthetic */ o8(b9 b9Var, int i10) {
        this.a = i10;
        this.b = b9Var;
    }

    @Override // org.telegram.ui.Components.fq
    public /* synthetic */ int G0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fq
    public void s0(int i10, int i11, boolean z10) {
        b9 b9Var = this.b;
        if (i11 == 0) {
            x8 x8Var = b9Var.U;
            int i12 = x8Var.c;
            if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                x8 a2 = x8Var.a();
                b9Var.U = a2;
                b9Var.a.b(a2, true);
                b9Var.n0();
            }
            b9Var.U.c = i10;
        } else if (i11 == 1) {
            x8 x8Var2 = b9Var.U;
            int i13 = x8Var2.d;
            if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                x8 a10 = x8Var2.a();
                b9Var.U = a10;
                b9Var.a.b(a10, true);
                b9Var.n0();
            }
            b9Var.U.d = i10;
        } else if (i11 == 2) {
            x8 x8Var3 = b9Var.U;
            int i14 = x8Var3.e;
            if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                x8 a11 = x8Var3.a();
                b9Var.U = a11;
                b9Var.a.b(a11, true);
                b9Var.n0();
            }
            b9Var.U.e = i10;
        } else if (i11 == 3) {
            x8 x8Var4 = b9Var.U;
            int i15 = x8Var4.f;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                x8 a12 = x8Var4.a();
                b9Var.U = a12;
                b9Var.a.b(a12, true);
                b9Var.n0();
            }
            b9Var.U.f = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        b9Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.fq
    public /* synthetic */ void i(boolean z10) {
    }

    @Override // org.telegram.ui.Components.fq
    public /* synthetic */ void q() {
    }
}
