package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class er0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kv0 b;

    public /* synthetic */ er0(kv0 kv0Var, int i10) {
        this.a = i10;
        this.b = kv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kv0 kv0Var = this.b;
                ks ksVar = kv0Var.P0;
                kv0Var.b2 = (int) ksVar.c(AndroidUtilities.dp(14.0f));
                zr0 zr0Var = kv0Var.V;
                if (zr0Var != null) {
                    zr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ksVar.c(AndroidUtilities.dp(7.0f))));
                }
                du0[] du0VarArr = kv0Var.k0;
                if (du0VarArr != null) {
                    for (du0 du0Var : du0VarArr) {
                        if (du0Var != null) {
                            int paddingTop = du0Var.h.getPaddingTop();
                            js0 js0Var = du0Var.h;
                            int paddingLeft = js0Var.getPaddingLeft();
                            int Z = kv0Var.Z(du0Var.F);
                            int paddingRight = du0Var.h.getPaddingRight();
                            js0 js0Var2 = du0Var.h;
                            int Y = kv0Var.Y(kv0Var.v0());
                            js0Var2.e3 = Y;
                            js0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(du0Var.h, new x2(du0Var, paddingTop - du0Var.h.getPaddingTop(), 10));
                        }
                    }
                    break;
                }
                break;
            case 1:
                kv0 kv0Var2 = this.b;
                kv0Var2.b1(false);
                kv0Var2.G.h(true);
                kv0Var2.a1 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
