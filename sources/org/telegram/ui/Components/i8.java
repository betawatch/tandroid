package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements org.telegram.ui.ActionBar.a2, zp {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8 b;

    public /* synthetic */ i8(v8 v8Var, int i10) {
        this.a = i10;
        this.b = v8Var;
    }

    @Override // org.telegram.ui.Components.zp
    public /* synthetic */ int D0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zp
    public void n0(int i10, int i11, boolean z10) {
        v8 v8Var = this.b;
        if (i11 == 0) {
            r8 r8Var = v8Var.U;
            int i12 = r8Var.c;
            if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                r8 a2 = r8Var.a();
                v8Var.U = a2;
                v8Var.a.b(a2, true);
                v8Var.n0();
            }
            v8Var.U.c = i10;
        } else if (i11 == 1) {
            r8 r8Var2 = v8Var.U;
            int i13 = r8Var2.d;
            if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                r8 a3 = r8Var2.a();
                v8Var.U = a3;
                v8Var.a.b(a3, true);
                v8Var.n0();
            }
            v8Var.U.d = i10;
        } else if (i11 == 2) {
            r8 r8Var3 = v8Var.U;
            int i14 = r8Var3.e;
            if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                r8 a10 = r8Var3.a();
                v8Var.U = a10;
                v8Var.a.b(a10, true);
                v8Var.n0();
            }
            v8Var.U.e = i10;
        } else if (i11 == 3) {
            r8 r8Var4 = v8Var.U;
            int i15 = r8Var4.f;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                r8 a11 = r8Var4.a();
                v8Var.U = a11;
                v8Var.a.b(a11, true);
                v8Var.n0();
            }
            v8Var.U.f = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        v8Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.zp
    public /* synthetic */ void g(boolean z10) {
    }

    @Override // org.telegram.ui.Components.zp
    public /* synthetic */ void n() {
    }
}
