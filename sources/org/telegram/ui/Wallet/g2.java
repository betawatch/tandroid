package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ g2(s2 s2Var, int i7) {
        this.a = i7;
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
