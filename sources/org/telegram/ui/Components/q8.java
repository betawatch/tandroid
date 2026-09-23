package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements org.telegram.ui.ActionBar.a2, mq {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ q8(e9 e9Var, int i10) {
        this.a = i10;
        this.b = e9Var;
    }

    @Override // org.telegram.ui.Components.mq
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

    @Override // org.telegram.ui.Components.mq
    public void x0(int i10, int i11, boolean z10) {
        e9 e9Var = this.b;
        if (i11 == 0) {
            a9 a9Var = e9Var.Y;
            int i12 = a9Var.c;
            if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                a9 a2 = a9Var.a();
                e9Var.Y = a2;
                e9Var.a.b(a2, true);
                e9Var.n0();
            }
            e9Var.Y.c = i10;
        } else if (i11 == 1) {
            a9 a9Var2 = e9Var.Y;
            int i13 = a9Var2.d;
            if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                a9 a10 = a9Var2.a();
                e9Var.Y = a10;
                e9Var.a.b(a10, true);
                e9Var.n0();
            }
            e9Var.Y.d = i10;
        } else if (i11 == 2) {
            a9 a9Var3 = e9Var.Y;
            int i14 = a9Var3.e;
            if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                a9 a11 = a9Var3.a();
                e9Var.Y = a11;
                e9Var.a.b(a11, true);
                e9Var.n0();
            }
            e9Var.Y.e = i10;
        } else if (i11 == 3) {
            a9 a9Var4 = e9Var.Y;
            int i15 = a9Var4.f;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                a9 a12 = a9Var4.a();
                e9Var.Y = a12;
                e9Var.a.b(a12, true);
                e9Var.n0();
            }
            e9Var.Y.f = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        e9Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.mq
    public /* synthetic */ void l(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mq
    public /* synthetic */ void y() {
    }
}
