package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class q9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ q9(v9 v9Var, int i7) {
        this.a = i7;
        this.b = v9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        v9 v9Var = this.b;
        switch (i7) {
            case 0:
                v9Var.d0 = null;
                break;
            default:
                hc.a0(v9Var).N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                break;
        }
    }
}
