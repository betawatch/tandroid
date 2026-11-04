package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ g2(s2 s2Var, int i3) {
        this.a = i3;
        this.b = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                s2 s2Var = this.b;
                if (!s2Var.a() && !s2Var.d) {
                    s2Var.d = false;
                    if (!s2Var.f) {
                        s2Var.f = true;
                        s2Var.b.c();
                    }
                    if (!s2Var.e) {
                        s2Var.a.dismiss();
                        break;
                    }
                }
                break;
            default:
                s2 s2Var2 = this.b;
                if (!s2Var2.a() && !s2Var2.d) {
                    s2Var2.d = false;
                    if (!s2Var2.f) {
                        s2Var2.f = true;
                        s2Var2.b.c();
                    }
                    if (!s2Var2.e) {
                        s2Var2.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
