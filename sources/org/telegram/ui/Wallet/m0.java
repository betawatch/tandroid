package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ls0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m0 {
    public static final long[] j = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final ls0 c;
    public boolean d;
    public int e;
    public int f;
    public int g = -1;
    public final l0 h;
    public final l0 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.l0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.l0] */
    public m0(int i10, String str, ls0 ls0Var) {
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
                            AndroidUtilities.runOnUIThread(m0Var2.h, 30000L);
                            m0Var2.g = ConnectionsManager.getInstance(m0Var2.a).sendRequestTyped(gettransactionsbymsghash, new org.telegram.messenger.a(), new org.telegram.ui.Components.o(m0Var2, i12, 1));
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
                            AndroidUtilities.runOnUIThread(m0Var2.h, 30000L);
                            m0Var2.g = ConnectionsManager.getInstance(m0Var2.a).sendRequestTyped(gettransactionsbymsghash, new org.telegram.messenger.a(), new org.telegram.ui.Components.o(m0Var2, i122, 1));
                            break;
                        }
                        break;
                }
            }
        };
        this.a = i10;
        this.b = str;
        this.c = ls0Var;
    }

    public final void a() {
        if (this.d) {
            int i10 = this.f;
            long j3 = j[i10];
            if (i10 < 4) {
                this.f = i10 + 1;
            }
            AndroidUtilities.runOnUIThread(this.i, j3);
        }
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.g >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.g, true);
            this.g = -1;
        }
    }
}
