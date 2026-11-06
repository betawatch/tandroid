package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.lk0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class p0 {
    public static final long[] j = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final lk0 c;
    public boolean d;
    public int e;
    public int f;
    public int g = -1;
    public final o0 h;
    public final o0 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.o0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.o0] */
    public p0(int i7, String str, lk0 lk0Var) {
        final int i10 = 0;
        this.h = new Runnable(this) { // from class: org.telegram.ui.Wallet.o0
            public final /* synthetic */ p0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        p0 p0Var = this.b;
                        if (p0Var.d) {
                            p0Var.e++;
                            if (p0Var.g >= 0) {
                                ConnectionsManager.getInstance(p0Var.a).cancelRequest(p0Var.g, true);
                                p0Var.g = -1;
                            }
                            p0Var.a();
                            break;
                        }
                        break;
                    default:
                        p0 p0Var2 = this.b;
                        if (p0Var2.d) {
                            int i11 = p0Var2.e + 1;
                            p0Var2.e = i11;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(p0Var2.b);
                            org.telegram.messenger.g0.i3(p0Var2.h, 30000L);
                            p0Var2.g = ConnectionsManager.getInstance(p0Var2.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(p0Var2, i11, 1));
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Wallet.o0
            public final /* synthetic */ p0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        p0 p0Var = this.b;
                        if (p0Var.d) {
                            p0Var.e++;
                            if (p0Var.g >= 0) {
                                ConnectionsManager.getInstance(p0Var.a).cancelRequest(p0Var.g, true);
                                p0Var.g = -1;
                            }
                            p0Var.a();
                            break;
                        }
                        break;
                    default:
                        p0 p0Var2 = this.b;
                        if (p0Var2.d) {
                            int i112 = p0Var2.e + 1;
                            p0Var2.e = i112;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(p0Var2.b);
                            org.telegram.messenger.g0.i3(p0Var2.h, 30000L);
                            p0Var2.g = ConnectionsManager.getInstance(p0Var2.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(p0Var2, i112, 1));
                            break;
                        }
                        break;
                }
            }
        };
        this.a = i7;
        this.b = str;
        this.c = lk0Var;
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
