package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.lk0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class o0 {
    public static final long[] j = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final lk0 c;
    public boolean d;
    public int e;
    public int f;
    public int g = -1;
    public final n0 h;
    public final n0 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.n0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.n0] */
    public o0(int i7, String str, lk0 lk0Var) {
        final int i10 = 0;
        this.h = new Runnable(this) { // from class: org.telegram.ui.Wallet.n0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        o0 o0Var = this.b;
                        if (o0Var.d) {
                            o0Var.e++;
                            if (o0Var.g >= 0) {
                                ConnectionsManager.getInstance(o0Var.a).cancelRequest(o0Var.g, true);
                                o0Var.g = -1;
                            }
                            o0Var.a();
                            break;
                        }
                        break;
                    default:
                        o0 o0Var2 = this.b;
                        if (o0Var2.d) {
                            int i11 = o0Var2.e + 1;
                            o0Var2.e = i11;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(o0Var2.b);
                            org.telegram.messenger.g0.i3(o0Var2.h, 30000L);
                            o0Var2.g = ConnectionsManager.getInstance(o0Var2.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(o0Var2, i11, 1));
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Wallet.n0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        o0 o0Var = this.b;
                        if (o0Var.d) {
                            o0Var.e++;
                            if (o0Var.g >= 0) {
                                ConnectionsManager.getInstance(o0Var.a).cancelRequest(o0Var.g, true);
                                o0Var.g = -1;
                            }
                            o0Var.a();
                            break;
                        }
                        break;
                    default:
                        o0 o0Var2 = this.b;
                        if (o0Var2.d) {
                            int i112 = o0Var2.e + 1;
                            o0Var2.e = i112;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(o0Var2.b);
                            org.telegram.messenger.g0.i3(o0Var2.h, 30000L);
                            o0Var2.g = ConnectionsManager.getInstance(o0Var2.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new org.telegram.ui.Components.q(o0Var2, i112, 1));
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
