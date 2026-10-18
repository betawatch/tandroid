package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.gn0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class o0 {
    public static final long[] j = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final gn0 c;
    public boolean d;
    public int e;
    public int f;
    public int g = -1;
    public final n0 h;
    public final n0 i;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.n0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.n0] */
    public o0(int i10, String str, gn0 gn0Var) {
        final int i11 = 0;
        this.h = new Runnable(this) { // from class: org.telegram.ui.Wallet.n0
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
                            int i12 = o0Var2.e + 1;
                            o0Var2.e = i12;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(o0Var2.b);
                            AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                            o0Var2.g = ConnectionsManager.getInstance(o0Var2.a).sendRequestTyped(gettransactionsbymsghash, new org.telegram.messenger.a(), new org.telegram.ui.Components.o(o0Var2, i12, 1));
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 1;
        this.i = new Runnable(this) { // from class: org.telegram.ui.Wallet.n0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
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
                            int i122 = o0Var2.e + 1;
                            o0Var2.e = i122;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(o0Var2.b);
                            AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                            o0Var2.g = ConnectionsManager.getInstance(o0Var2.a).sendRequestTyped(gettransactionsbymsghash, new org.telegram.messenger.a(), new org.telegram.ui.Components.o(o0Var2, i122, 1));
                            break;
                        }
                        break;
                }
            }
        };
        this.a = i10;
        this.b = str;
        this.c = gn0Var;
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
