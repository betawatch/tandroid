package org.telegram.ui.Wallet;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class x0 {
    public static final long[] o = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final String c;
    public final l d;
    public final l e;
    public boolean f;
    public int g;
    public int h;
    public int j;
    public final v0 l;
    public final v0 m;
    public final v0 n;
    public int i = -1;
    public int k = -1;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.v0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.v0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Wallet.v0] */
    public x0(int i7, String str, String str2, l lVar, l lVar2) {
        final int i10 = 0;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Wallet.v0
            public final /* synthetic */ x0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        x0 x0Var = this.b;
                        int i11 = x0Var.a;
                        if (x0Var.f) {
                            org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i11 + " msg_hash=" + x0Var.b + " no answer in 45000 ms");
                            x0Var.g = x0Var.g + 1;
                            if (x0Var.i >= 0) {
                                ConnectionsManager.getInstance(i11).cancelRequest(x0Var.i, true);
                                x0Var.i = -1;
                            }
                            x0Var.b();
                            break;
                        }
                        break;
                    case 1:
                        final x0 x0Var2 = this.b;
                        int i12 = x0Var2.a;
                        if (x0Var2.f && x0Var2.k < 0) {
                            final int i13 = x0Var2.j + 1;
                            x0Var2.j = i13;
                            TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                            performapirequest.endpoint = "/api/v3/traces";
                            performapirequest.query = "msg_hash=" + Uri.encode(x0Var2.b) + "&include_actions=false";
                            final int i14 = 1;
                            x0Var2.k = ConnectionsManager.getInstance(i12).sendRequestTyped(performapirequest, new d3.b(1), new r10() { // from class: org.telegram.ui.Wallet.w0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.r10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i14) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            x0 x0Var3 = x0Var2;
                                            if (x0Var3.f) {
                                                int i15 = x0Var3.g;
                                                int i16 = i13;
                                                if (i15 == i16) {
                                                    x0Var3.i = -1;
                                                    org.telegram.messenger.g0.r(x0Var3.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(x0Var3.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(x0Var3.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = x0Var3.d;
                                                        u0 u0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = u0Var.a;
                                                        u0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            np.u1(i17).f4(wallettransactions.users, false);
                                                            np.u1(i17).Z3(wallettransactions.chats, false);
                                                            u0Var.d(wallettransaction, next);
                                                            u0Var.K();
                                                            x0Var3.c();
                                                            break;
                                                        }
                                                    }
                                                    if (x0Var3.f && x0Var3.g == i16) {
                                                        x0Var3.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            x0 x0Var4 = x0Var2;
                                            String str3 = x0Var4.b;
                                            if (x0Var4.f && x0Var4.j == i13) {
                                                x0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = x0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        x0Var4.c();
                                                        break;
                                                    } else {
                                                        v0 v0Var = x0Var4.m;
                                                        if (x0Var4.f) {
                                                            org.telegram.messenger.g0.r(v0Var);
                                                            org.telegram.messenger.g0.h3(v0Var, 10000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    StringBuilder u10 = a8.p0.u("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    u10.append(tL_error2 == null ? "none" : Integer.valueOf(tL_error2.code));
                                                    org.telegram.messenger.a8.b(u10.toString());
                                                }
                                                z10 = false;
                                                if (!z10) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, np.u1(i12).Q3, 0);
                            break;
                        }
                        break;
                    default:
                        final x0 x0Var3 = this.b;
                        if (x0Var3.f) {
                            final int i15 = x0Var3.g + 1;
                            x0Var3.g = i15;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(x0Var3.b);
                            org.telegram.messenger.g0.h3(x0Var3.l, 45000L);
                            final int i16 = 0;
                            x0Var3.i = ConnectionsManager.getInstance(x0Var3.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new r10() { // from class: org.telegram.ui.Wallet.w0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.r10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i16) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            x0 x0Var32 = x0Var3;
                                            if (x0Var32.f) {
                                                int i152 = x0Var32.g;
                                                int i162 = i15;
                                                if (i152 == i162) {
                                                    x0Var32.i = -1;
                                                    org.telegram.messenger.g0.r(x0Var32.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(x0Var32.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(x0Var32.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = x0Var32.d;
                                                        u0 u0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = u0Var.a;
                                                        u0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            np.u1(i17).f4(wallettransactions.users, false);
                                                            np.u1(i17).Z3(wallettransactions.chats, false);
                                                            u0Var.d(wallettransaction, next);
                                                            u0Var.K();
                                                            x0Var32.c();
                                                            break;
                                                        }
                                                    }
                                                    if (x0Var32.f && x0Var32.g == i162) {
                                                        x0Var32.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            x0 x0Var4 = x0Var3;
                                            String str3 = x0Var4.b;
                                            if (x0Var4.f && x0Var4.j == i15) {
                                                x0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = x0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        x0Var4.c();
                                                        break;
                                                    } else {
                                                        v0 v0Var = x0Var4.m;
                                                        if (x0Var4.f) {
                                                            org.telegram.messenger.g0.r(v0Var);
                                                            org.telegram.messenger.g0.h3(v0Var, 10000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    StringBuilder u10 = a8.p0.u("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    u10.append(tL_error2 == null ? "none" : Integer.valueOf(tL_error2.code));
                                                    org.telegram.messenger.a8.b(u10.toString());
                                                }
                                                z10 = false;
                                                if (!z10) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.m = new Runnable(this) { // from class: org.telegram.ui.Wallet.v0
            public final /* synthetic */ x0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        x0 x0Var = this.b;
                        int i112 = x0Var.a;
                        if (x0Var.f) {
                            org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i112 + " msg_hash=" + x0Var.b + " no answer in 45000 ms");
                            x0Var.g = x0Var.g + 1;
                            if (x0Var.i >= 0) {
                                ConnectionsManager.getInstance(i112).cancelRequest(x0Var.i, true);
                                x0Var.i = -1;
                            }
                            x0Var.b();
                            break;
                        }
                        break;
                    case 1:
                        final x0 x0Var2 = this.b;
                        int i12 = x0Var2.a;
                        if (x0Var2.f && x0Var2.k < 0) {
                            final int i13 = x0Var2.j + 1;
                            x0Var2.j = i13;
                            TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                            performapirequest.endpoint = "/api/v3/traces";
                            performapirequest.query = "msg_hash=" + Uri.encode(x0Var2.b) + "&include_actions=false";
                            final int i14 = 1;
                            x0Var2.k = ConnectionsManager.getInstance(i12).sendRequestTyped(performapirequest, new d3.b(1), new r10() { // from class: org.telegram.ui.Wallet.w0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.r10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i14) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            x0 x0Var32 = x0Var2;
                                            if (x0Var32.f) {
                                                int i152 = x0Var32.g;
                                                int i162 = i13;
                                                if (i152 == i162) {
                                                    x0Var32.i = -1;
                                                    org.telegram.messenger.g0.r(x0Var32.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(x0Var32.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(x0Var32.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = x0Var32.d;
                                                        u0 u0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = u0Var.a;
                                                        u0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            np.u1(i17).f4(wallettransactions.users, false);
                                                            np.u1(i17).Z3(wallettransactions.chats, false);
                                                            u0Var.d(wallettransaction, next);
                                                            u0Var.K();
                                                            x0Var32.c();
                                                            break;
                                                        }
                                                    }
                                                    if (x0Var32.f && x0Var32.g == i162) {
                                                        x0Var32.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            x0 x0Var4 = x0Var2;
                                            String str3 = x0Var4.b;
                                            if (x0Var4.f && x0Var4.j == i13) {
                                                x0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = x0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        x0Var4.c();
                                                        break;
                                                    } else {
                                                        v0 v0Var = x0Var4.m;
                                                        if (x0Var4.f) {
                                                            org.telegram.messenger.g0.r(v0Var);
                                                            org.telegram.messenger.g0.h3(v0Var, 10000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    StringBuilder u10 = a8.p0.u("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    u10.append(tL_error2 == null ? "none" : Integer.valueOf(tL_error2.code));
                                                    org.telegram.messenger.a8.b(u10.toString());
                                                }
                                                z10 = false;
                                                if (!z10) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, np.u1(i12).Q3, 0);
                            break;
                        }
                        break;
                    default:
                        final x0 x0Var3 = this.b;
                        if (x0Var3.f) {
                            final int i15 = x0Var3.g + 1;
                            x0Var3.g = i15;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(x0Var3.b);
                            org.telegram.messenger.g0.h3(x0Var3.l, 45000L);
                            final int i16 = 0;
                            x0Var3.i = ConnectionsManager.getInstance(x0Var3.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new r10() { // from class: org.telegram.ui.Wallet.w0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.r10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i16) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            x0 x0Var32 = x0Var3;
                                            if (x0Var32.f) {
                                                int i152 = x0Var32.g;
                                                int i162 = i15;
                                                if (i152 == i162) {
                                                    x0Var32.i = -1;
                                                    org.telegram.messenger.g0.r(x0Var32.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(x0Var32.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(x0Var32.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = x0Var32.d;
                                                        u0 u0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = u0Var.a;
                                                        u0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            np.u1(i17).f4(wallettransactions.users, false);
                                                            np.u1(i17).Z3(wallettransactions.chats, false);
                                                            u0Var.d(wallettransaction, next);
                                                            u0Var.K();
                                                            x0Var32.c();
                                                            break;
                                                        }
                                                    }
                                                    if (x0Var32.f && x0Var32.g == i162) {
                                                        x0Var32.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            x0 x0Var4 = x0Var3;
                                            String str3 = x0Var4.b;
                                            if (x0Var4.f && x0Var4.j == i15) {
                                                x0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = x0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        x0Var4.c();
                                                        break;
                                                    } else {
                                                        v0 v0Var = x0Var4.m;
                                                        if (x0Var4.f) {
                                                            org.telegram.messenger.g0.r(v0Var);
                                                            org.telegram.messenger.g0.h3(v0Var, 10000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    StringBuilder u10 = a8.p0.u("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    u10.append(tL_error2 == null ? "none" : Integer.valueOf(tL_error2.code));
                                                    org.telegram.messenger.a8.b(u10.toString());
                                                }
                                                z10 = false;
                                                if (!z10) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.n = new Runnable(this) { // from class: org.telegram.ui.Wallet.v0
            public final /* synthetic */ x0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        x0 x0Var = this.b;
                        int i112 = x0Var.a;
                        if (x0Var.f) {
                            org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i112 + " msg_hash=" + x0Var.b + " no answer in 45000 ms");
                            x0Var.g = x0Var.g + 1;
                            if (x0Var.i >= 0) {
                                ConnectionsManager.getInstance(i112).cancelRequest(x0Var.i, true);
                                x0Var.i = -1;
                            }
                            x0Var.b();
                            break;
                        }
                        break;
                    case 1:
                        final x0 x0Var2 = this.b;
                        int i122 = x0Var2.a;
                        if (x0Var2.f && x0Var2.k < 0) {
                            final int i13 = x0Var2.j + 1;
                            x0Var2.j = i13;
                            TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                            performapirequest.endpoint = "/api/v3/traces";
                            performapirequest.query = "msg_hash=" + Uri.encode(x0Var2.b) + "&include_actions=false";
                            final int i14 = 1;
                            x0Var2.k = ConnectionsManager.getInstance(i122).sendRequestTyped(performapirequest, new d3.b(1), new r10() { // from class: org.telegram.ui.Wallet.w0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.r10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i14) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            x0 x0Var32 = x0Var2;
                                            if (x0Var32.f) {
                                                int i152 = x0Var32.g;
                                                int i162 = i13;
                                                if (i152 == i162) {
                                                    x0Var32.i = -1;
                                                    org.telegram.messenger.g0.r(x0Var32.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(x0Var32.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(x0Var32.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = x0Var32.d;
                                                        u0 u0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = u0Var.a;
                                                        u0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            np.u1(i17).f4(wallettransactions.users, false);
                                                            np.u1(i17).Z3(wallettransactions.chats, false);
                                                            u0Var.d(wallettransaction, next);
                                                            u0Var.K();
                                                            x0Var32.c();
                                                            break;
                                                        }
                                                    }
                                                    if (x0Var32.f && x0Var32.g == i162) {
                                                        x0Var32.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            x0 x0Var4 = x0Var2;
                                            String str3 = x0Var4.b;
                                            if (x0Var4.f && x0Var4.j == i13) {
                                                x0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = x0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        x0Var4.c();
                                                        break;
                                                    } else {
                                                        v0 v0Var = x0Var4.m;
                                                        if (x0Var4.f) {
                                                            org.telegram.messenger.g0.r(v0Var);
                                                            org.telegram.messenger.g0.h3(v0Var, 10000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    StringBuilder u10 = a8.p0.u("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    u10.append(tL_error2 == null ? "none" : Integer.valueOf(tL_error2.code));
                                                    org.telegram.messenger.a8.b(u10.toString());
                                                }
                                                z10 = false;
                                                if (!z10) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, np.u1(i122).Q3, 0);
                            break;
                        }
                        break;
                    default:
                        final x0 x0Var3 = this.b;
                        if (x0Var3.f) {
                            final int i15 = x0Var3.g + 1;
                            x0Var3.g = i15;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(x0Var3.b);
                            org.telegram.messenger.g0.h3(x0Var3.l, 45000L);
                            final int i16 = 0;
                            x0Var3.i = ConnectionsManager.getInstance(x0Var3.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new r10() { // from class: org.telegram.ui.Wallet.w0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.r10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i16) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            x0 x0Var32 = x0Var3;
                                            if (x0Var32.f) {
                                                int i152 = x0Var32.g;
                                                int i162 = i15;
                                                if (i152 == i162) {
                                                    x0Var32.i = -1;
                                                    org.telegram.messenger.g0.r(x0Var32.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(x0Var32.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(x0Var32.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = x0Var32.d;
                                                        u0 u0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = u0Var.a;
                                                        u0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            np.u1(i17).f4(wallettransactions.users, false);
                                                            np.u1(i17).Z3(wallettransactions.chats, false);
                                                            u0Var.d(wallettransaction, next);
                                                            u0Var.K();
                                                            x0Var32.c();
                                                            break;
                                                        }
                                                    }
                                                    if (x0Var32.f && x0Var32.g == i162) {
                                                        x0Var32.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            x0 x0Var4 = x0Var3;
                                            String str3 = x0Var4.b;
                                            if (x0Var4.f && x0Var4.j == i15) {
                                                x0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = x0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        x0Var4.c();
                                                        break;
                                                    } else {
                                                        v0 v0Var = x0Var4.m;
                                                        if (x0Var4.f) {
                                                            org.telegram.messenger.g0.r(v0Var);
                                                            org.telegram.messenger.g0.h3(v0Var, 10000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    StringBuilder u10 = a8.p0.u("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    u10.append(tL_error2 == null ? "none" : Integer.valueOf(tL_error2.code));
                                                    org.telegram.messenger.a8.b(u10.toString());
                                                }
                                                z10 = false;
                                                if (!z10) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                        break;
                }
            }
        };
        this.a = i7;
        this.b = str;
        this.c = str2;
        this.d = lVar;
        this.e = lVar2;
    }

    public final boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        l0 l0Var;
        JSONArray optJSONArray = jSONObject.optJSONArray("traces");
        JSONObject optJSONObject = optJSONArray == null ? null : optJSONArray.optJSONObject(0);
        String str = this.b;
        if (optJSONObject == null) {
            org.telegram.messenger.a8.b("[gram-wallet-polling] chain: msg_hash=" + str + " not on chain yet");
            return false;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("trace_info");
        String optString = optJSONObject2 == null ? "" : optJSONObject2.optString("trace_state");
        boolean z10 = !optJSONObject.optBoolean("is_incomplete", true) && "complete".equals(optString) && (optJSONObject2 == null || optJSONObject2.optInt("pending_messages", 0) == 0);
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("transactions");
        JSONArray optJSONArray2 = optJSONObject.optJSONArray("transactions_order");
        if (optJSONObject3 == null || optJSONArray2 == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = null;
            for (int i7 = 0; i7 < optJSONArray2.length() && jSONObject2 == null; i7++) {
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject(optJSONArray2.optString(i7));
                if (optJSONObject4 != null && u0.c(optJSONObject4.optString("account"), this.c)) {
                    jSONObject2 = optJSONObject4;
                }
            }
        }
        if (jSONObject2 == null) {
            StringBuilder u10 = a8.p0.u("[gram-wallet-polling] chain: msg_hash=", str, " trace=");
            u10.append(optJSONObject.optString("trace_id"));
            u10.append(" state=");
            u10.append(optString);
            p5.c.s(", no transaction of the wallet yet", u10);
            return false;
        }
        JSONObject optJSONObject5 = jSONObject2.optJSONObject("description");
        JSONObject optJSONObject6 = optJSONObject5 == null ? null : optJSONObject5.optJSONObject("compute_ph");
        JSONObject optJSONObject7 = optJSONObject5 != null ? optJSONObject5.optJSONObject("action") : null;
        boolean z11 = (optJSONObject5 == null || optJSONObject5.optBoolean("aborted", false) || (optJSONObject6 != null && !optJSONObject6.optBoolean("success", true)) || (optJSONObject7 != null && !optJSONObject7.optBoolean("success", true))) ? false : true;
        JSONObject optJSONObject8 = jSONObject2.optJSONObject("in_msg");
        String optString2 = jSONObject2.optString("hash");
        String str2 = jSONObject2.optString("lt") + ":" + optString2;
        StringBuilder u11 = a8.p0.u("[gram-wallet-polling] chain: expected msg_hash=", str, ", trace=");
        u11.append(optJSONObject.optString("trace_id"));
        u11.append(" (external ");
        u11.append(optJSONObject.optString("external_hash"));
        u11.append(") state=");
        u11.append(optString);
        u11.append(" complete=");
        u11.append(z10);
        u11.append(", wallet tx id=");
        u11.append(str2);
        u11.append(" in_msg=");
        u11.append(optJSONObject8 == null ? "none" : optJSONObject8.optString("hash"));
        u11.append(" success=");
        u11.append(z11);
        org.telegram.messenger.a8.b(u11.toString());
        if (!z10 || TextUtils.isEmpty(optString2)) {
            return false;
        }
        l lVar = this.e;
        u0 u0Var = lVar.a;
        TL_wallet.walletTransaction wallettransaction = lVar.b;
        if (!wallettransaction.pending) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("send completed by the chain: msg_hash=");
        com.google.android.gms.internal.vision.e2.r(sb2, wallettransaction.messageHash, ", id=", str2, ", success=");
        sb2.append(z11);
        u0.P(sb2.toString());
        wallettransaction.id = str2;
        u0Var.h(wallettransaction, z11, optString2);
        if (wallettransaction.nft != null && (l0Var = u0Var.o) != null) {
            l0.a(l0Var, wallettransaction);
            u0Var.o.e();
        }
        u0Var.K();
        return true;
    }

    public final void b() {
        if (this.f) {
            int i7 = this.h;
            long j3 = o[i7];
            if (i7 < 4) {
                this.h = i7 + 1;
            }
            org.telegram.messenger.g0.h3(this.n, j3);
        }
    }

    public final void c() {
        this.f = false;
        this.g++;
        this.j++;
        org.telegram.messenger.g0.r(this.n);
        org.telegram.messenger.g0.r(this.l);
        org.telegram.messenger.g0.r(this.m);
        int i7 = this.i;
        int i10 = this.a;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.i, true);
            this.i = -1;
        }
        if (this.k >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.k, true);
            this.k = -1;
        }
    }
}
