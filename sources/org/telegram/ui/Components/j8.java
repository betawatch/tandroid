package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements org.telegram.ui.ActionBar.b2, bq {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ j8(w8 w8Var, int i9) {
        this.a = i9;
        this.b = w8Var;
    }

    @Override // org.telegram.ui.Components.bq
    public /* synthetic */ int H0(int i9) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.bq
    public void n0(int i9, int i10, boolean z10) {
        w8 w8Var = this.b;
        if (i10 == 0) {
            s8 s8Var = w8Var.U;
            int i11 = s8Var.c;
            if (i11 != i9 && (i11 == 0 || i9 == 0)) {
                s8 a2 = s8Var.a();
                w8Var.U = a2;
                w8Var.a.b(a2, true);
                w8Var.m0();
            }
            w8Var.U.c = i9;
        } else if (i10 == 1) {
            s8 s8Var2 = w8Var.U;
            int i12 = s8Var2.d;
            if (i12 != i9 && (i12 == 0 || i9 == 0)) {
                s8 a3 = s8Var2.a();
                w8Var.U = a3;
                w8Var.a.b(a3, true);
                w8Var.m0();
            }
            w8Var.U.d = i9;
        } else if (i10 == 2) {
            s8 s8Var3 = w8Var.U;
            int i13 = s8Var3.e;
            if (i13 != i9 && (i13 == 0 || i9 == 0)) {
                s8 a10 = s8Var3.a();
                w8Var.U = a10;
                w8Var.a.b(a10, true);
                w8Var.m0();
            }
            w8Var.U.e = i9;
        } else if (i10 == 3) {
            s8 s8Var4 = w8Var.U;
            int i14 = s8Var4.f;
            if (i14 != i9 && (i14 == 0 || i9 == 0)) {
                s8 a11 = s8Var4.a();
                w8Var.U = a11;
                w8Var.a.b(a11, true);
                w8Var.m0();
            }
            w8Var.U.f = i9;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        w8Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.bq
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // org.telegram.ui.Components.bq
    public /* synthetic */ void k() {
    }
}
