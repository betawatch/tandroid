package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.cs0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class l0 {
    public static final long[] j = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final cs0 c;
    public boolean d;
    public int e;
    public int f;
    public int g = -1;
    public final k0 h;
    public final k0 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.k0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.k0] */
    public l0(int i10, String str, cs0 cs0Var) {
        final int i11 = 0;
        this.h = new Runnable(this) { // from class: org.telegram.ui.Wallet.k0
            public final /* synthetic */ l0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        l0 l0Var = this.b;
                        if (l0Var.d) {
                            l0Var.e++;
                            if (l0Var.g >= 0) {
                                ConnectionsManager.getInstance(l0Var.a).cancelRequest(l0Var.g, true);
                                l0Var.g = -1;
                            }
                            l0Var.a();
                            break;
                        }
                        break;
                    default:
                        l0 l0Var2 = this.b;
                        if (l0Var2.d) {
                            int i12 = l0Var2.e + 1;
                            l0Var2.e = i12;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(l0Var2.b);
                            AndroidUtilities.runOnUIThread(l0Var2.h, 30000L);
                            l0Var2.g = ConnectionsManager.getInstance(l0Var2.a).sendRequestTyped(gettransactionsbymsghash, new org.telegram.messenger.a(), new org.telegram.ui.Components.o(l0Var2, i12, 1));
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 1;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Wallet.k0
            public final /* synthetic */ l0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        l0 l0Var = this.b;
                        if (l0Var.d) {
                            l0Var.e++;
                            if (l0Var.g >= 0) {
                                ConnectionsManager.getInstance(l0Var.a).cancelRequest(l0Var.g, true);
                                l0Var.g = -1;
                            }
                            l0Var.a();
                            break;
                        }
                        break;
                    default:
                        l0 l0Var2 = this.b;
                        if (l0Var2.d) {
                            int i122 = l0Var2.e + 1;
                            l0Var2.e = i122;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(l0Var2.b);
                            AndroidUtilities.runOnUIThread(l0Var2.h, 30000L);
                            l0Var2.g = ConnectionsManager.getInstance(l0Var2.a).sendRequestTyped(gettransactionsbymsghash, new org.telegram.messenger.a(), new org.telegram.ui.Components.o(l0Var2, i122, 1));
                            break;
                        }
                        break;
                }
            }
        };
        this.a = i10;
        this.b = str;
        this.c = cs0Var;
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
