package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class u9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;

    public /* synthetic */ u9(z9 z9Var, int i7) {
        this.a = i7;
        this.b = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        z9 z9Var = this.b;
        switch (i7) {
            case 0:
                z9Var.e0 = null;
                break;
            default:
                cc.a0(z9Var).N(hd.M0(2131745861, null), hd.M0(2131751105, null)).j();
                break;
        }
    }
}
