package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements org.telegram.ui.ActionBar.a2, lq {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9 b;

    public /* synthetic */ o8(c9 c9Var, int i10) {
        this.a = i10;
        this.b = c9Var;
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ int K0(int i10) {
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

    @Override // org.telegram.ui.Components.lq
    public void x0(int i10, int i11, boolean z10) {
        c9 c9Var = this.b;
        if (i11 == 0) {
            y8 y8Var = c9Var.Y;
            int i12 = y8Var.c;
            if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                y8 a2 = y8Var.a();
                c9Var.Y = a2;
                c9Var.a.b(a2, true);
                c9Var.n0();
            }
            c9Var.Y.c = i10;
        } else if (i11 == 1) {
            y8 y8Var2 = c9Var.Y;
            int i13 = y8Var2.d;
            if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                y8 a10 = y8Var2.a();
                c9Var.Y = a10;
                c9Var.a.b(a10, true);
                c9Var.n0();
            }
            c9Var.Y.d = i10;
        } else if (i11 == 2) {
            y8 y8Var3 = c9Var.Y;
            int i14 = y8Var3.e;
            if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                y8 a11 = y8Var3.a();
                c9Var.Y = a11;
                c9Var.a.b(a11, true);
                c9Var.n0();
            }
            c9Var.Y.e = i10;
        } else if (i11 == 3) {
            y8 y8Var4 = c9Var.Y;
            int i15 = y8Var4.f;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                y8 a12 = y8Var4.a();
                c9Var.Y = a12;
                c9Var.a.b(a12, true);
                c9Var.n0();
            }
            c9Var.Y.f = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        c9Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ void l(boolean z10) {
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ void y() {
    }
}
