package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ql0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class n0 {
    public static final long[] j = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final ql0 c;
    public boolean d;
    public int e;
    public int f;
    public int g = -1;
    public final m0 h;
    public final m0 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.m0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.m0] */
    public n0(int i10, String str, ql0 ql0Var) {
        final int i11 = 0;
        this.h = new Runnable(this) { // from class: org.telegram.ui.Wallet.m0
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
                            int i12 = n0Var2.e + 1;
                            n0Var2.e = i12;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(n0Var2.b);
                            AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                            n0Var2.g = ConnectionsManager.getInstance(n0Var2.a).sendRequestTyped(gettransactionsbymsghash, new org.telegram.messenger.a(), new org.telegram.ui.Components.o(n0Var2, i12, 1));
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 1;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Wallet.m0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
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
                            int i122 = n0Var2.e + 1;
                            n0Var2.e = i122;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(n0Var2.b);
                            AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                            n0Var2.g = ConnectionsManager.getInstance(n0Var2.a).sendRequestTyped(gettransactionsbymsghash, new org.telegram.messenger.a(), new org.telegram.ui.Components.o(n0Var2, i122, 1));
                            break;
                        }
                        break;
                }
            }
        };
        this.a = i10;
        this.b = str;
        this.c = ql0Var;
    }

    public final void a() {
        if (this.d) {
            int i10 = this.f;
            long j10 = j[i10];
            if (i10 < 4) {
                this.f = i10 + 1;
            }
            AndroidUtilities.runOnUIThread(this.i, j10);
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
