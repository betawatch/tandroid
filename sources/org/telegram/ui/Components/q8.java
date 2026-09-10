package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements org.telegram.ui.ActionBar.c2, rq {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ q8(d9 d9Var, int i10) {
        this.a = i10;
        this.b = d9Var;
    }

    @Override // org.telegram.ui.Components.rq
    public /* synthetic */ int K0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rq
    public void t0(int i10, int i11, boolean z10) {
        d9 d9Var = this.b;
        if (i11 == 0) {
            z8 z8Var = d9Var.Y;
            int i12 = z8Var.c;
            if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                z8 a2 = z8Var.a();
                d9Var.Y = a2;
                d9Var.a.b(a2, true);
                d9Var.n0();
            }
            d9Var.Y.c = i10;
        } else if (i11 == 1) {
            z8 z8Var2 = d9Var.Y;
            int i13 = z8Var2.d;
            if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                z8 a10 = z8Var2.a();
                d9Var.Y = a10;
                d9Var.a.b(a10, true);
                d9Var.n0();
            }
            d9Var.Y.d = i10;
        } else if (i11 == 2) {
            z8 z8Var3 = d9Var.Y;
            int i14 = z8Var3.e;
            if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                z8 a11 = z8Var3.a();
                d9Var.Y = a11;
                d9Var.a.b(a11, true);
                d9Var.n0();
            }
            d9Var.Y.e = i10;
        } else if (i11 == 3) {
            z8 z8Var4 = d9Var.Y;
            int i15 = z8Var4.f;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                z8 a12 = z8Var4.a();
                d9Var.Y = a12;
                d9Var.a.b(a12, true);
                d9Var.n0();
            }
            d9Var.Y.f = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        d9Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.rq
    public /* synthetic */ void k(boolean z10) {
    }

    @Override // org.telegram.ui.Components.rq
    public /* synthetic */ void x() {
    }
}
