package org.telegram.ui.Wallet;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class y0 {
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
    public final w0 l;
    public final w0 m;
    public final w0 n;
    public int i = -1;
    public int k = -1;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.w0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.w0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Wallet.w0] */
    public y0(int i7, String str, String str2, l lVar, l lVar2) {
        final int i10 = 0;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Wallet.w0
            public final /* synthetic */ y0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        y0 y0Var = this.b;
                        int i11 = y0Var.a;
                        if (y0Var.f) {
                            org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i11 + " msg_hash=" + y0Var.b + " no answer in 45000 ms");
                            y0Var.g = y0Var.g + 1;
                            if (y0Var.i >= 0) {
                                ConnectionsManager.getInstance(i11).cancelRequest(y0Var.i, true);
                                y0Var.i = -1;
                            }
                            y0Var.b();
                            break;
                        }
                        break;
                    case 1:
                        final y0 y0Var2 = this.b;
                        int i12 = y0Var2.a;
                        if (y0Var2.f && y0Var2.k < 0) {
                            final int i13 = y0Var2.j + 1;
                            y0Var2.j = i13;
                            TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                            performapirequest.endpoint = "/api/v3/traces";
                            performapirequest.query = "msg_hash=" + Uri.encode(y0Var2.b) + "&include_actions=false";
                            final int i14 = 1;
                            y0Var2.k = ConnectionsManager.getInstance(i12).sendRequestTyped(performapirequest, new d3.b(1), new p10() { // from class: org.telegram.ui.Wallet.x0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.p10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i14) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            y0 y0Var3 = y0Var2;
                                            if (y0Var3.f) {
                                                int i15 = y0Var3.g;
                                                int i16 = i13;
                                                if (i15 == i16) {
                                                    y0Var3.i = -1;
                                                    org.telegram.messenger.g0.r(y0Var3.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(y0Var3.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(y0Var3.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = y0Var3.d;
                                                        v0 v0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = v0Var.a;
                                                        v0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            mp.u1(i17).f4(wallettransactions.users, false);
                                                            mp.u1(i17).Z3(wallettransactions.chats, false);
                                                            v0Var.d(wallettransaction, next);
                                                            v0Var.K();
                                                            y0Var3.c();
                                                            break;
                                                        }
                                                    }
                                                    if (y0Var3.f && y0Var3.g == i16) {
                                                        y0Var3.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            y0 y0Var4 = y0Var2;
                                            String str3 = y0Var4.b;
                                            if (y0Var4.f && y0Var4.j == i13) {
                                                y0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = y0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        y0Var4.c();
                                                        break;
                                                    } else {
                                                        w0 w0Var = y0Var4.m;
                                                        if (y0Var4.f) {
                                                            org.telegram.messenger.g0.r(w0Var);
                                                            org.telegram.messenger.g0.h3(w0Var, 10000L);
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
                            }, mp.u1(i12).Q3, 0);
                            break;
                        }
                        break;
                    default:
                        final y0 y0Var3 = this.b;
                        if (y0Var3.f) {
                            final int i15 = y0Var3.g + 1;
                            y0Var3.g = i15;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(y0Var3.b);
                            org.telegram.messenger.g0.h3(y0Var3.l, 45000L);
                            final int i16 = 0;
                            y0Var3.i = ConnectionsManager.getInstance(y0Var3.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new p10() { // from class: org.telegram.ui.Wallet.x0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.p10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i16) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            y0 y0Var32 = y0Var3;
                                            if (y0Var32.f) {
                                                int i152 = y0Var32.g;
                                                int i162 = i15;
                                                if (i152 == i162) {
                                                    y0Var32.i = -1;
                                                    org.telegram.messenger.g0.r(y0Var32.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(y0Var32.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(y0Var32.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = y0Var32.d;
                                                        v0 v0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = v0Var.a;
                                                        v0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            mp.u1(i17).f4(wallettransactions.users, false);
                                                            mp.u1(i17).Z3(wallettransactions.chats, false);
                                                            v0Var.d(wallettransaction, next);
                                                            v0Var.K();
                                                            y0Var32.c();
                                                            break;
                                                        }
                                                    }
                                                    if (y0Var32.f && y0Var32.g == i162) {
                                                        y0Var32.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            y0 y0Var4 = y0Var3;
                                            String str3 = y0Var4.b;
                                            if (y0Var4.f && y0Var4.j == i15) {
                                                y0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = y0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        y0Var4.c();
                                                        break;
                                                    } else {
                                                        w0 w0Var = y0Var4.m;
                                                        if (y0Var4.f) {
                                                            org.telegram.messenger.g0.r(w0Var);
                                                            org.telegram.messenger.g0.h3(w0Var, 10000L);
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
        this.m = new Runnable(this) { // from class: org.telegram.ui.Wallet.w0
            public final /* synthetic */ y0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        y0 y0Var = this.b;
                        int i112 = y0Var.a;
                        if (y0Var.f) {
                            org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i112 + " msg_hash=" + y0Var.b + " no answer in 45000 ms");
                            y0Var.g = y0Var.g + 1;
                            if (y0Var.i >= 0) {
                                ConnectionsManager.getInstance(i112).cancelRequest(y0Var.i, true);
                                y0Var.i = -1;
                            }
                            y0Var.b();
                            break;
                        }
                        break;
                    case 1:
                        final y0 y0Var2 = this.b;
                        int i12 = y0Var2.a;
                        if (y0Var2.f && y0Var2.k < 0) {
                            final int i13 = y0Var2.j + 1;
                            y0Var2.j = i13;
                            TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                            performapirequest.endpoint = "/api/v3/traces";
                            performapirequest.query = "msg_hash=" + Uri.encode(y0Var2.b) + "&include_actions=false";
                            final int i14 = 1;
                            y0Var2.k = ConnectionsManager.getInstance(i12).sendRequestTyped(performapirequest, new d3.b(1), new p10() { // from class: org.telegram.ui.Wallet.x0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.p10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i14) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            y0 y0Var32 = y0Var2;
                                            if (y0Var32.f) {
                                                int i152 = y0Var32.g;
                                                int i162 = i13;
                                                if (i152 == i162) {
                                                    y0Var32.i = -1;
                                                    org.telegram.messenger.g0.r(y0Var32.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(y0Var32.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(y0Var32.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = y0Var32.d;
                                                        v0 v0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = v0Var.a;
                                                        v0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            mp.u1(i17).f4(wallettransactions.users, false);
                                                            mp.u1(i17).Z3(wallettransactions.chats, false);
                                                            v0Var.d(wallettransaction, next);
                                                            v0Var.K();
                                                            y0Var32.c();
                                                            break;
                                                        }
                                                    }
                                                    if (y0Var32.f && y0Var32.g == i162) {
                                                        y0Var32.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            y0 y0Var4 = y0Var2;
                                            String str3 = y0Var4.b;
                                            if (y0Var4.f && y0Var4.j == i13) {
                                                y0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = y0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        y0Var4.c();
                                                        break;
                                                    } else {
                                                        w0 w0Var = y0Var4.m;
                                                        if (y0Var4.f) {
                                                            org.telegram.messenger.g0.r(w0Var);
                                                            org.telegram.messenger.g0.h3(w0Var, 10000L);
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
                            }, mp.u1(i12).Q3, 0);
                            break;
                        }
                        break;
                    default:
                        final y0 y0Var3 = this.b;
                        if (y0Var3.f) {
                            final int i15 = y0Var3.g + 1;
                            y0Var3.g = i15;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(y0Var3.b);
                            org.telegram.messenger.g0.h3(y0Var3.l, 45000L);
                            final int i16 = 0;
                            y0Var3.i = ConnectionsManager.getInstance(y0Var3.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new p10() { // from class: org.telegram.ui.Wallet.x0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.p10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i16) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            y0 y0Var32 = y0Var3;
                                            if (y0Var32.f) {
                                                int i152 = y0Var32.g;
                                                int i162 = i15;
                                                if (i152 == i162) {
                                                    y0Var32.i = -1;
                                                    org.telegram.messenger.g0.r(y0Var32.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(y0Var32.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(y0Var32.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = y0Var32.d;
                                                        v0 v0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = v0Var.a;
                                                        v0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            mp.u1(i17).f4(wallettransactions.users, false);
                                                            mp.u1(i17).Z3(wallettransactions.chats, false);
                                                            v0Var.d(wallettransaction, next);
                                                            v0Var.K();
                                                            y0Var32.c();
                                                            break;
                                                        }
                                                    }
                                                    if (y0Var32.f && y0Var32.g == i162) {
                                                        y0Var32.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            y0 y0Var4 = y0Var3;
                                            String str3 = y0Var4.b;
                                            if (y0Var4.f && y0Var4.j == i15) {
                                                y0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = y0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        y0Var4.c();
                                                        break;
                                                    } else {
                                                        w0 w0Var = y0Var4.m;
                                                        if (y0Var4.f) {
                                                            org.telegram.messenger.g0.r(w0Var);
                                                            org.telegram.messenger.g0.h3(w0Var, 10000L);
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
        this.n = new Runnable(this) { // from class: org.telegram.ui.Wallet.w0
            public final /* synthetic */ y0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        y0 y0Var = this.b;
                        int i112 = y0Var.a;
                        if (y0Var.f) {
                            org.telegram.messenger.a8.b("[gram-wallet-polling] account=" + i112 + " msg_hash=" + y0Var.b + " no answer in 45000 ms");
                            y0Var.g = y0Var.g + 1;
                            if (y0Var.i >= 0) {
                                ConnectionsManager.getInstance(i112).cancelRequest(y0Var.i, true);
                                y0Var.i = -1;
                            }
                            y0Var.b();
                            break;
                        }
                        break;
                    case 1:
                        final y0 y0Var2 = this.b;
                        int i122 = y0Var2.a;
                        if (y0Var2.f && y0Var2.k < 0) {
                            final int i13 = y0Var2.j + 1;
                            y0Var2.j = i13;
                            TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                            performapirequest.endpoint = "/api/v3/traces";
                            performapirequest.query = "msg_hash=" + Uri.encode(y0Var2.b) + "&include_actions=false";
                            final int i14 = 1;
                            y0Var2.k = ConnectionsManager.getInstance(i122).sendRequestTyped(performapirequest, new d3.b(1), new p10() { // from class: org.telegram.ui.Wallet.x0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.p10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i14) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            y0 y0Var32 = y0Var2;
                                            if (y0Var32.f) {
                                                int i152 = y0Var32.g;
                                                int i162 = i13;
                                                if (i152 == i162) {
                                                    y0Var32.i = -1;
                                                    org.telegram.messenger.g0.r(y0Var32.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(y0Var32.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(y0Var32.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = y0Var32.d;
                                                        v0 v0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = v0Var.a;
                                                        v0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            mp.u1(i17).f4(wallettransactions.users, false);
                                                            mp.u1(i17).Z3(wallettransactions.chats, false);
                                                            v0Var.d(wallettransaction, next);
                                                            v0Var.K();
                                                            y0Var32.c();
                                                            break;
                                                        }
                                                    }
                                                    if (y0Var32.f && y0Var32.g == i162) {
                                                        y0Var32.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            y0 y0Var4 = y0Var2;
                                            String str3 = y0Var4.b;
                                            if (y0Var4.f && y0Var4.j == i13) {
                                                y0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = y0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        y0Var4.c();
                                                        break;
                                                    } else {
                                                        w0 w0Var = y0Var4.m;
                                                        if (y0Var4.f) {
                                                            org.telegram.messenger.g0.r(w0Var);
                                                            org.telegram.messenger.g0.h3(w0Var, 10000L);
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
                            }, mp.u1(i122).Q3, 0);
                            break;
                        }
                        break;
                    default:
                        final y0 y0Var3 = this.b;
                        if (y0Var3.f) {
                            final int i15 = y0Var3.g + 1;
                            y0Var3.g = i15;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(y0Var3.b);
                            org.telegram.messenger.g0.h3(y0Var3.l, 45000L);
                            final int i16 = 0;
                            y0Var3.i = ConnectionsManager.getInstance(y0Var3.a).sendRequestTyped(gettransactionsbymsghash, new d3.b(1), new p10() { // from class: org.telegram.ui.Wallet.x0
                                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
                                @Override // org.telegram.messenger.p10
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj, Object obj2) {
                                    boolean z10;
                                    switch (i16) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            y0 y0Var32 = y0Var3;
                                            if (y0Var32.f) {
                                                int i152 = y0Var32.g;
                                                int i162 = i15;
                                                if (i152 == i162) {
                                                    y0Var32.i = -1;
                                                    org.telegram.messenger.g0.r(y0Var32.l);
                                                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                                                    sb2.append(y0Var32.a);
                                                    sb2.append(" msg_hash=");
                                                    sb2.append(y0Var32.b);
                                                    sb2.append(" transactions=");
                                                    sb2.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                    sb2.append(" errorCode=");
                                                    sb2.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                    org.telegram.messenger.a8.b(sb2.toString());
                                                    if (tL_error == null && wallettransactions != null) {
                                                        l lVar3 = y0Var32.d;
                                                        v0 v0Var = lVar3.a;
                                                        TL_wallet.walletTransaction wallettransaction = lVar3.b;
                                                        int i17 = v0Var.a;
                                                        v0.p(wallettransactions.transactions);
                                                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                        if (it.hasNext()) {
                                                            TL_wallet.walletTransaction next = it.next();
                                                            mp.u1(i17).f4(wallettransactions.users, false);
                                                            mp.u1(i17).Z3(wallettransactions.chats, false);
                                                            v0Var.d(wallettransaction, next);
                                                            v0Var.K();
                                                            y0Var32.c();
                                                            break;
                                                        }
                                                    }
                                                    if (y0Var32.f && y0Var32.g == i162) {
                                                        y0Var32.b();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            y0 y0Var4 = y0Var3;
                                            String str3 = y0Var4.b;
                                            if (y0Var4.f && y0Var4.j == i15) {
                                                y0Var4.k = -1;
                                                if (apiresponse != null && apiresponse.response != null) {
                                                    try {
                                                        z10 = y0Var4.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e10);
                                                    }
                                                    if (!z10) {
                                                        y0Var4.c();
                                                        break;
                                                    } else {
                                                        w0 w0Var = y0Var4.m;
                                                        if (y0Var4.f) {
                                                            org.telegram.messenger.g0.r(w0Var);
                                                            org.telegram.messenger.g0.h3(w0Var, 10000L);
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
        m0 m0Var;
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
                if (optJSONObject4 != null && v0.c(optJSONObject4.optString("account"), this.c)) {
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
        v0 v0Var = lVar.a;
        TL_wallet.walletTransaction wallettransaction = lVar.b;
        if (!wallettransaction.pending) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("send completed by the chain: msg_hash=");
        com.google.android.gms.internal.vision.e2.r(sb2, wallettransaction.messageHash, ", id=", str2, ", success=");
        sb2.append(z11);
        v0.P(sb2.toString());
        wallettransaction.id = str2;
        v0Var.h(wallettransaction, z11, optString2);
        if (wallettransaction.nft != null && (m0Var = v0Var.o) != null) {
            m0.a(m0Var, wallettransaction);
            v0Var.o.e();
        }
        v0Var.K();
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
