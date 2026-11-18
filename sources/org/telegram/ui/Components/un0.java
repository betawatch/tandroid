package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class un0 implements ri.m, r0.m, org.telegram.ui.ActionBar.f1, ri.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;

    public /* synthetic */ un0(yo0 yo0Var, int i7) {
        this.a = i7;
        this.b = yo0Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        yo0 yo0Var = this.b;
        yo0Var.t0(g10);
        i0.b f10 = l1Var.a.f(519);
        if (!yo0Var.C2.equals(f10)) {
            yo0Var.C2 = f10;
            yo0Var.c.requestLayout();
        }
        return r0.l1.b;
    }

    @Override // ri.n
    public int e() {
        yo0 yo0Var = this.b;
        yo0Var.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, yo0Var.J0);
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        org.telegram.ui.ActionBar.h1 h1Var2;
        switch (this.a) {
            case 2:
                yo0 yo0Var = this.b;
                yo0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = yo0Var.F2) != null && h1Var.isShowing()) {
                    yo0Var.F2.d(true);
                    break;
                }
                break;
            default:
                yo0 yo0Var2 = this.b;
                yo0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var2 = yo0Var2.F2) != null && h1Var2.isShowing()) {
                    yo0Var2.F2.d(true);
                    break;
                }
                break;
        }
    }

    @Override // ri.m
    public void l(int i7) {
        yo0 yo0Var = this.b;
        dh.g gVar = yo0Var.K2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.dd.a(i7, 4)) {
            gVar.h(yo0Var.Y0.e());
        }
        gVar.e(yo0Var.P2, yo0Var.b.getWidth(), yo0Var.b.getHeight());
    }
}
