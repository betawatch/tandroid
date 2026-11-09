package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.nk0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class n0 {
    public static final long[] j = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final nk0 c;
    public boolean d;
    public int e;
    public int f;
    public int g = -1;
    public final m0 h;
    public final m0 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.m0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.m0] */
    public n0(int i7, String str, nk0 nk0Var) {
        final int i10 = 0;
        this.h = new Runnable(this) { // from class: org.telegram.ui.Wallet.m0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        n0 n0Var = this.b;
                        if (n0Var.d) {
                            n0Var.e++;
                            if (n0Var.g >= 0) {
                                ConnectionsManager.getInstance(n0Var.a).cancelRequest(n0Var.g, true);
                                n0Var.g = -1;
                            }
                            n0Var.a();
                            break;
                        }
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        if (n0Var2.d) {
                            int i11 = n0Var2.e + 1;
                            n0Var2.e = i11;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(n0Var2.b);
                            org.telegram.messenger.g0.i3(n0Var2.h, 30000L);
                            n0Var2.g = ConnectionsManager.getInstance(n0Var2.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(n0Var2, i11, 1));
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Wallet.m0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        n0 n0Var = this.b;
                        if (n0Var.d) {
                            n0Var.e++;
                            if (n0Var.g >= 0) {
                                ConnectionsManager.getInstance(n0Var.a).cancelRequest(n0Var.g, true);
                                n0Var.g = -1;
                            }
                            n0Var.a();
                            break;
                        }
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        if (n0Var2.d) {
                            int i112 = n0Var2.e + 1;
                            n0Var2.e = i112;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(n0Var2.b);
                            org.telegram.messenger.g0.i3(n0Var2.h, 30000L);
                            n0Var2.g = ConnectionsManager.getInstance(n0Var2.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(n0Var2, i112, 1));
                            break;
                        }
                        break;
                }
            }
        };
        this.a = i7;
        this.b = str;
        this.c = nk0Var;
    }

    public final void a() {
        if (this.d) {
            int i7 = this.f;
            long j3 = j[i7];
            if (i7 < 4) {
                this.f = i7 + 1;
            }
            org.telegram.messenger.g0.i3(this.i, j3);
        }
    }

    public final void b() {
        this.d = false;
        this.e++;
        org.telegram.messenger.g0.r(this.i);
        org.telegram.messenger.g0.r(this.h);
        if (this.g >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.g, true);
            this.g = -1;
        }
    }
}
