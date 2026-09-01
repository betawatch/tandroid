package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements org.telegram.ui.ActionBar.c2, lq {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ j8(w8 w8Var, int i10) {
        this.a = i10;
        this.b = w8Var;
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ int H0(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
    public void v0(int i10, int i11, boolean z4) {
        w8 w8Var = this.b;
        if (i11 == 0) {
            s8 s8Var = w8Var.V;
            int i12 = s8Var.c;
            if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                s8 a2 = s8Var.a();
                w8Var.V = a2;
                w8Var.a.b(a2, true);
                w8Var.n0();
            }
            w8Var.V.c = i10;
        } else if (i11 == 1) {
            s8 s8Var2 = w8Var.V;
            int i13 = s8Var2.d;
            if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                s8 a10 = s8Var2.a();
                w8Var.V = a10;
                w8Var.a.b(a10, true);
                w8Var.n0();
            }
            w8Var.V.d = i10;
        } else if (i11 == 2) {
            s8 s8Var3 = w8Var.V;
            int i14 = s8Var3.e;
            if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                s8 a11 = s8Var3.a();
                w8Var.V = a11;
                w8Var.a.b(a11, true);
                w8Var.n0();
            }
            w8Var.V.e = i10;
        } else if (i11 == 3) {
            s8 s8Var4 = w8Var.V;
            int i15 = s8Var4.f;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                s8 a12 = s8Var4.a();
                w8Var.V = a12;
                w8Var.a.b(a12, true);
                w8Var.n0();
            }
            w8Var.V.f = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        w8Var.a.invalidate();
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ void k(boolean z4) {
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ void x() {
    }
}
