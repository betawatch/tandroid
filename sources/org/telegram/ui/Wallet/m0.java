package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ep0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m0 {
    public static final long[] j = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final ep0 c;
    public boolean d;
    public int e;
    public int f;
    public int g = -1;
    public final l0 h;
    public final l0 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.l0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.l0] */
    public m0(int i10, String str, ep0 ep0Var) {
        final int i11 = 0;
        this.h = new Runnable(this) { // from class: org.telegram.ui.Wallet.l0
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        m0 m0Var = this.b;
                        if (m0Var.d) {
                            m0Var.e++;
                            if (m0Var.g >= 0) {
                                ConnectionsManager.getInstance(m0Var.a).cancelRequest(m0Var.g, true);
                                m0Var.g = -1;
                            }
                            m0Var.a();
                            break;
                        }
                        break;
                    default:
                        m0 m0Var2 = this.b;
                        if (m0Var2.d) {
                            int i12 = m0Var2.e + 1;
                            m0Var2.e = i12;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(m0Var2.b);
                            org.telegram.messenger.i0.h3(m0Var2.h, 30000L);
                            m0Var2.g = ConnectionsManager.getInstance(m0Var2.a).sendRequestTyped(gettransactionsbymsghash, new a3.b(1), new org.telegram.ui.Components.p(m0Var2, i12, 1));
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 1;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Wallet.l0
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        m0 m0Var = this.b;
                        if (m0Var.d) {
                            m0Var.e++;
                            if (m0Var.g >= 0) {
                                ConnectionsManager.getInstance(m0Var.a).cancelRequest(m0Var.g, true);
                                m0Var.g = -1;
                            }
                            m0Var.a();
                            break;
                        }
                        break;
                    default:
                        m0 m0Var2 = this.b;
                        if (m0Var2.d) {
                            int i122 = m0Var2.e + 1;
                            m0Var2.e = i122;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(m0Var2.b);
                            org.telegram.messenger.i0.h3(m0Var2.h, 30000L);
                            m0Var2.g = ConnectionsManager.getInstance(m0Var2.a).sendRequestTyped(gettransactionsbymsghash, new a3.b(1), new org.telegram.ui.Components.p(m0Var2, i122, 1));
                            break;
                        }
                        break;
                }
            }
        };
        this.a = i10;
        this.b = str;
        this.c = ep0Var;
    }

    public final void a() {
        if (this.d) {
            int i10 = this.f;
            long j10 = j[i10];
            if (i10 < 4) {
                this.f = i10 + 1;
            }
            org.telegram.messenger.i0.h3(this.i, j10);
        }
    }

    public final void b() {
        this.d = false;
        this.e++;
        org.telegram.messenger.i0.r(this.i);
        org.telegram.messenger.i0.r(this.h);
        if (this.g >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.g, true);
            this.g = -1;
        }
    }
}
