package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
