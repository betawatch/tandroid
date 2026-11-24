// default package

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class c35 {
    public static final long[] o = {500, 1000, 3000, 5000, 10000};
    public final int a;
    public final String b;
    public final String c;
    public final y15 d;
    public final y15 e;
    public boolean f;
    public int g;
    public int h;
    public int j;
    public final a35 l;
    public final a35 m;
    public final a35 n;
    public int i = -1;
    public int k = -1;

    /* JADX WARN: Type inference failed for: r0v1, types: [a35] */
    /* JADX WARN: Type inference failed for: r0v2, types: [a35] */
    /* JADX WARN: Type inference failed for: r0v3, types: [a35] */
    public c35(int i, String str, String str2, y15 y15Var, y15 y15Var2) {
        final byte b = 0;
        this.l = new Runnable(this) { // from class: a35
            public final /* synthetic */ c35 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                final byte b3 = 0;
                final c35 c35Var = this.b;
                final byte b4 = 1;
                switch (b2) {
                    case 0:
                        int i2 = c35Var.a;
                        if (c35Var.f) {
                            StringBuilder l = hg9.l(i2, "[gram-wallet-polling] account=", " msg_hash=");
                            l.append(c35Var.b);
                            l.append(" no answer in 45000 ms");
                            fc4.b(l.toString());
                            c35Var.g++;
                            if (c35Var.i >= 0) {
                                ConnectionsManager.getInstance(i2).cancelRequest(c35Var.i, true);
                                c35Var.i = -1;
                            }
                            c35Var.b();
                            break;
                        }
                        break;
                    case 1:
                        int i3 = c35Var.a;
                        if (c35Var.f && c35Var.k < 0) {
                            final int i4 = c35Var.j + 1;
                            c35Var.j = i4;
                            TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                            performapirequest.endpoint = "/api/v3/traces";
                            performapirequest.query = "msg_hash=" + Uri.encode(c35Var.b) + "&include_actions=false";
                            c35Var.k = ConnectionsManager.getInstance(i3).sendRequestTyped(performapirequest, new kc(b3), new jac() { // from class: b35
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    byte b5 = b4;
                                    boolean z = false;
                                    int i5 = i4;
                                    c35 c35Var2 = c35Var;
                                    switch (b5) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            if (c35Var2.f && c35Var2.g == i5) {
                                                c35Var2.i = -1;
                                                gm.r(c35Var2.l);
                                                StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                                sb.append(c35Var2.a);
                                                sb.append(" msg_hash=");
                                                sb.append(c35Var2.b);
                                                sb.append(" transactions=");
                                                sb.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                sb.append(" errorCode=");
                                                sb.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                fc4.b(sb.toString());
                                                if (tL_error == null && wallettransactions != null) {
                                                    y15 y15Var3 = c35Var2.d;
                                                    c cVar = y15Var3.a;
                                                    TL_wallet.walletTransaction wallettransaction = y15Var3.b;
                                                    int i6 = cVar.a;
                                                    c.o(wallettransactions.transactions);
                                                    Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                    if (it.hasNext()) {
                                                        TL_wallet.walletTransaction next = it.next();
                                                        oc7.r1(i6).d4(wallettransactions.users, false);
                                                        oc7.r1(i6).X3(wallettransactions.chats, false);
                                                        cVar.c(wallettransaction, next);
                                                        cVar.J();
                                                        c35Var2.c();
                                                        break;
                                                    }
                                                }
                                                if (c35Var2.f && c35Var2.g == i5) {
                                                    c35Var2.b();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            String str3 = c35Var2.b;
                                            if (c35Var2.f && c35Var2.j == i5) {
                                                c35Var2.k = -1;
                                                if (apiresponse == null || apiresponse.response == null) {
                                                    StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    p.append(tL_error2 != null ? Integer.valueOf(tL_error2.code) : "none");
                                                    fc4.b(p.toString());
                                                } else {
                                                    try {
                                                        z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e) {
                                                        fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e);
                                                    }
                                                }
                                                if (!z) {
                                                    a35 a35Var = c35Var2.m;
                                                    if (c35Var2.f) {
                                                        gm.r(a35Var);
                                                        gm.d3(a35Var, 10000L);
                                                        break;
                                                    }
                                                } else {
                                                    c35Var2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, oc7.r1(i3).r3, 0);
                            break;
                        }
                        break;
                    default:
                        if (c35Var.f) {
                            final int i5 = c35Var.g + 1;
                            c35Var.g = i5;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(c35Var.b);
                            gm.d3(c35Var.l, 45000L);
                            c35Var.i = ConnectionsManager.getInstance(c35Var.a).sendRequestTyped(gettransactionsbymsghash, new kc(b3), new jac() { // from class: b35
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    byte b5 = b3;
                                    boolean z = false;
                                    int i52 = i5;
                                    c35 c35Var2 = c35Var;
                                    switch (b5) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            if (c35Var2.f && c35Var2.g == i52) {
                                                c35Var2.i = -1;
                                                gm.r(c35Var2.l);
                                                StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                                sb.append(c35Var2.a);
                                                sb.append(" msg_hash=");
                                                sb.append(c35Var2.b);
                                                sb.append(" transactions=");
                                                sb.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                sb.append(" errorCode=");
                                                sb.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                fc4.b(sb.toString());
                                                if (tL_error == null && wallettransactions != null) {
                                                    y15 y15Var3 = c35Var2.d;
                                                    c cVar = y15Var3.a;
                                                    TL_wallet.walletTransaction wallettransaction = y15Var3.b;
                                                    int i6 = cVar.a;
                                                    c.o(wallettransactions.transactions);
                                                    Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                    if (it.hasNext()) {
                                                        TL_wallet.walletTransaction next = it.next();
                                                        oc7.r1(i6).d4(wallettransactions.users, false);
                                                        oc7.r1(i6).X3(wallettransactions.chats, false);
                                                        cVar.c(wallettransaction, next);
                                                        cVar.J();
                                                        c35Var2.c();
                                                        break;
                                                    }
                                                }
                                                if (c35Var2.f && c35Var2.g == i52) {
                                                    c35Var2.b();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            String str3 = c35Var2.b;
                                            if (c35Var2.f && c35Var2.j == i52) {
                                                c35Var2.k = -1;
                                                if (apiresponse == null || apiresponse.response == null) {
                                                    StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    p.append(tL_error2 != null ? Integer.valueOf(tL_error2.code) : "none");
                                                    fc4.b(p.toString());
                                                } else {
                                                    try {
                                                        z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e) {
                                                        fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e);
                                                    }
                                                }
                                                if (!z) {
                                                    a35 a35Var = c35Var2.m;
                                                    if (c35Var2.f) {
                                                        gm.r(a35Var);
                                                        gm.d3(a35Var, 10000L);
                                                        break;
                                                    }
                                                } else {
                                                    c35Var2.c();
                                                    break;
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
        final byte b2 = 1;
        this.m = new Runnable(this) { // from class: a35
            public final /* synthetic */ c35 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                final byte b3 = 0;
                final c35 c35Var = this.b;
                final byte b4 = 1;
                switch (b22) {
                    case 0:
                        int i2 = c35Var.a;
                        if (c35Var.f) {
                            StringBuilder l = hg9.l(i2, "[gram-wallet-polling] account=", " msg_hash=");
                            l.append(c35Var.b);
                            l.append(" no answer in 45000 ms");
                            fc4.b(l.toString());
                            c35Var.g++;
                            if (c35Var.i >= 0) {
                                ConnectionsManager.getInstance(i2).cancelRequest(c35Var.i, true);
                                c35Var.i = -1;
                            }
                            c35Var.b();
                            break;
                        }
                        break;
                    case 1:
                        int i3 = c35Var.a;
                        if (c35Var.f && c35Var.k < 0) {
                            final int i4 = c35Var.j + 1;
                            c35Var.j = i4;
                            TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                            performapirequest.endpoint = "/api/v3/traces";
                            performapirequest.query = "msg_hash=" + Uri.encode(c35Var.b) + "&include_actions=false";
                            c35Var.k = ConnectionsManager.getInstance(i3).sendRequestTyped(performapirequest, new kc(b3), new jac() { // from class: b35
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    byte b5 = b4;
                                    boolean z = false;
                                    int i52 = i4;
                                    c35 c35Var2 = c35Var;
                                    switch (b5) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            if (c35Var2.f && c35Var2.g == i52) {
                                                c35Var2.i = -1;
                                                gm.r(c35Var2.l);
                                                StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                                sb.append(c35Var2.a);
                                                sb.append(" msg_hash=");
                                                sb.append(c35Var2.b);
                                                sb.append(" transactions=");
                                                sb.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                sb.append(" errorCode=");
                                                sb.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                fc4.b(sb.toString());
                                                if (tL_error == null && wallettransactions != null) {
                                                    y15 y15Var3 = c35Var2.d;
                                                    c cVar = y15Var3.a;
                                                    TL_wallet.walletTransaction wallettransaction = y15Var3.b;
                                                    int i6 = cVar.a;
                                                    c.o(wallettransactions.transactions);
                                                    Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                    if (it.hasNext()) {
                                                        TL_wallet.walletTransaction next = it.next();
                                                        oc7.r1(i6).d4(wallettransactions.users, false);
                                                        oc7.r1(i6).X3(wallettransactions.chats, false);
                                                        cVar.c(wallettransaction, next);
                                                        cVar.J();
                                                        c35Var2.c();
                                                        break;
                                                    }
                                                }
                                                if (c35Var2.f && c35Var2.g == i52) {
                                                    c35Var2.b();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            String str3 = c35Var2.b;
                                            if (c35Var2.f && c35Var2.j == i52) {
                                                c35Var2.k = -1;
                                                if (apiresponse == null || apiresponse.response == null) {
                                                    StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    p.append(tL_error2 != null ? Integer.valueOf(tL_error2.code) : "none");
                                                    fc4.b(p.toString());
                                                } else {
                                                    try {
                                                        z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e) {
                                                        fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e);
                                                    }
                                                }
                                                if (!z) {
                                                    a35 a35Var = c35Var2.m;
                                                    if (c35Var2.f) {
                                                        gm.r(a35Var);
                                                        gm.d3(a35Var, 10000L);
                                                        break;
                                                    }
                                                } else {
                                                    c35Var2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, oc7.r1(i3).r3, 0);
                            break;
                        }
                        break;
                    default:
                        if (c35Var.f) {
                            final int i5 = c35Var.g + 1;
                            c35Var.g = i5;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(c35Var.b);
                            gm.d3(c35Var.l, 45000L);
                            c35Var.i = ConnectionsManager.getInstance(c35Var.a).sendRequestTyped(gettransactionsbymsghash, new kc(b3), new jac() { // from class: b35
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    byte b5 = b3;
                                    boolean z = false;
                                    int i52 = i5;
                                    c35 c35Var2 = c35Var;
                                    switch (b5) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            if (c35Var2.f && c35Var2.g == i52) {
                                                c35Var2.i = -1;
                                                gm.r(c35Var2.l);
                                                StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                                sb.append(c35Var2.a);
                                                sb.append(" msg_hash=");
                                                sb.append(c35Var2.b);
                                                sb.append(" transactions=");
                                                sb.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                sb.append(" errorCode=");
                                                sb.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                fc4.b(sb.toString());
                                                if (tL_error == null && wallettransactions != null) {
                                                    y15 y15Var3 = c35Var2.d;
                                                    c cVar = y15Var3.a;
                                                    TL_wallet.walletTransaction wallettransaction = y15Var3.b;
                                                    int i6 = cVar.a;
                                                    c.o(wallettransactions.transactions);
                                                    Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                    if (it.hasNext()) {
                                                        TL_wallet.walletTransaction next = it.next();
                                                        oc7.r1(i6).d4(wallettransactions.users, false);
                                                        oc7.r1(i6).X3(wallettransactions.chats, false);
                                                        cVar.c(wallettransaction, next);
                                                        cVar.J();
                                                        c35Var2.c();
                                                        break;
                                                    }
                                                }
                                                if (c35Var2.f && c35Var2.g == i52) {
                                                    c35Var2.b();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            String str3 = c35Var2.b;
                                            if (c35Var2.f && c35Var2.j == i52) {
                                                c35Var2.k = -1;
                                                if (apiresponse == null || apiresponse.response == null) {
                                                    StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    p.append(tL_error2 != null ? Integer.valueOf(tL_error2.code) : "none");
                                                    fc4.b(p.toString());
                                                } else {
                                                    try {
                                                        z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e) {
                                                        fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e);
                                                    }
                                                }
                                                if (!z) {
                                                    a35 a35Var = c35Var2.m;
                                                    if (c35Var2.f) {
                                                        gm.r(a35Var);
                                                        gm.d3(a35Var, 10000L);
                                                        break;
                                                    }
                                                } else {
                                                    c35Var2.c();
                                                    break;
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
        final byte b3 = 2;
        this.n = new Runnable(this) { // from class: a35
            public final /* synthetic */ c35 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                final byte b32 = 0;
                final c35 c35Var = this.b;
                final byte b4 = 1;
                switch (b22) {
                    case 0:
                        int i2 = c35Var.a;
                        if (c35Var.f) {
                            StringBuilder l = hg9.l(i2, "[gram-wallet-polling] account=", " msg_hash=");
                            l.append(c35Var.b);
                            l.append(" no answer in 45000 ms");
                            fc4.b(l.toString());
                            c35Var.g++;
                            if (c35Var.i >= 0) {
                                ConnectionsManager.getInstance(i2).cancelRequest(c35Var.i, true);
                                c35Var.i = -1;
                            }
                            c35Var.b();
                            break;
                        }
                        break;
                    case 1:
                        int i3 = c35Var.a;
                        if (c35Var.f && c35Var.k < 0) {
                            final int i4 = c35Var.j + 1;
                            c35Var.j = i4;
                            TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                            performapirequest.endpoint = "/api/v3/traces";
                            performapirequest.query = "msg_hash=" + Uri.encode(c35Var.b) + "&include_actions=false";
                            c35Var.k = ConnectionsManager.getInstance(i3).sendRequestTyped(performapirequest, new kc(b32), new jac() { // from class: b35
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    byte b5 = b4;
                                    boolean z = false;
                                    int i52 = i4;
                                    c35 c35Var2 = c35Var;
                                    switch (b5) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            if (c35Var2.f && c35Var2.g == i52) {
                                                c35Var2.i = -1;
                                                gm.r(c35Var2.l);
                                                StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                                sb.append(c35Var2.a);
                                                sb.append(" msg_hash=");
                                                sb.append(c35Var2.b);
                                                sb.append(" transactions=");
                                                sb.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                sb.append(" errorCode=");
                                                sb.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                fc4.b(sb.toString());
                                                if (tL_error == null && wallettransactions != null) {
                                                    y15 y15Var3 = c35Var2.d;
                                                    c cVar = y15Var3.a;
                                                    TL_wallet.walletTransaction wallettransaction = y15Var3.b;
                                                    int i6 = cVar.a;
                                                    c.o(wallettransactions.transactions);
                                                    Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                    if (it.hasNext()) {
                                                        TL_wallet.walletTransaction next = it.next();
                                                        oc7.r1(i6).d4(wallettransactions.users, false);
                                                        oc7.r1(i6).X3(wallettransactions.chats, false);
                                                        cVar.c(wallettransaction, next);
                                                        cVar.J();
                                                        c35Var2.c();
                                                        break;
                                                    }
                                                }
                                                if (c35Var2.f && c35Var2.g == i52) {
                                                    c35Var2.b();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            String str3 = c35Var2.b;
                                            if (c35Var2.f && c35Var2.j == i52) {
                                                c35Var2.k = -1;
                                                if (apiresponse == null || apiresponse.response == null) {
                                                    StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    p.append(tL_error2 != null ? Integer.valueOf(tL_error2.code) : "none");
                                                    fc4.b(p.toString());
                                                } else {
                                                    try {
                                                        z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e) {
                                                        fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e);
                                                    }
                                                }
                                                if (!z) {
                                                    a35 a35Var = c35Var2.m;
                                                    if (c35Var2.f) {
                                                        gm.r(a35Var);
                                                        gm.d3(a35Var, 10000L);
                                                        break;
                                                    }
                                                } else {
                                                    c35Var2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, oc7.r1(i3).r3, 0);
                            break;
                        }
                        break;
                    default:
                        if (c35Var.f) {
                            final int i5 = c35Var.g + 1;
                            c35Var.g = i5;
                            TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                            gettransactionsbymsghash.msg_hash.add(c35Var.b);
                            gm.d3(c35Var.l, 45000L);
                            c35Var.i = ConnectionsManager.getInstance(c35Var.a).sendRequestTyped(gettransactionsbymsghash, new kc(b32), new jac() { // from class: b35
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    byte b5 = b32;
                                    boolean z = false;
                                    int i52 = i5;
                                    c35 c35Var2 = c35Var;
                                    switch (b5) {
                                        case 0:
                                            TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                            if (c35Var2.f && c35Var2.g == i52) {
                                                c35Var2.i = -1;
                                                gm.r(c35Var2.l);
                                                StringBuilder sb = new StringBuilder("[gram-wallet-polling] account=");
                                                sb.append(c35Var2.a);
                                                sb.append(" msg_hash=");
                                                sb.append(c35Var2.b);
                                                sb.append(" transactions=");
                                                sb.append(wallettransactions == null ? "none" : Integer.valueOf(wallettransactions.transactions.size()));
                                                sb.append(" errorCode=");
                                                sb.append(tL_error != null ? Integer.valueOf(tL_error.code) : "none");
                                                fc4.b(sb.toString());
                                                if (tL_error == null && wallettransactions != null) {
                                                    y15 y15Var3 = c35Var2.d;
                                                    c cVar = y15Var3.a;
                                                    TL_wallet.walletTransaction wallettransaction = y15Var3.b;
                                                    int i6 = cVar.a;
                                                    c.o(wallettransactions.transactions);
                                                    Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                                                    if (it.hasNext()) {
                                                        TL_wallet.walletTransaction next = it.next();
                                                        oc7.r1(i6).d4(wallettransactions.users, false);
                                                        oc7.r1(i6).X3(wallettransactions.chats, false);
                                                        cVar.c(wallettransaction, next);
                                                        cVar.J();
                                                        c35Var2.c();
                                                        break;
                                                    }
                                                }
                                                if (c35Var2.f && c35Var2.g == i52) {
                                                    c35Var2.b();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                            String str3 = c35Var2.b;
                                            if (c35Var2.f && c35Var2.j == i52) {
                                                c35Var2.k = -1;
                                                if (apiresponse == null || apiresponse.response == null) {
                                                    StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str3, " errorCode=");
                                                    p.append(tL_error2 != null ? Integer.valueOf(tL_error2.code) : "none");
                                                    fc4.b(p.toString());
                                                } else {
                                                    try {
                                                        z = c35Var2.a(new JSONObject(apiresponse.response.data));
                                                    } catch (Exception e) {
                                                        fc4.e("[gram-wallet-polling] chain: bad traces response for msg_hash=" + str3, e);
                                                    }
                                                }
                                                if (!z) {
                                                    a35 a35Var = c35Var2.m;
                                                    if (c35Var2.f) {
                                                        gm.r(a35Var);
                                                        gm.d3(a35Var, 10000L);
                                                        break;
                                                    }
                                                } else {
                                                    c35Var2.c();
                                                    break;
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
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = y15Var;
        this.e = y15Var2;
    }

    public final boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        t25 t25Var;
        JSONArray optJSONArray = jSONObject.optJSONArray("traces");
        JSONObject jSONObject3 = null;
        JSONObject optJSONObject2 = optJSONArray == null ? null : optJSONArray.optJSONObject(0);
        String str = this.b;
        if (optJSONObject2 == null) {
            fc4.b("[gram-wallet-polling] chain: msg_hash=" + str + " not on chain yet");
            return false;
        }
        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("trace_info");
        String optString = optJSONObject3 == null ? "" : optJSONObject3.optString("trace_state");
        boolean z = !optJSONObject2.optBoolean("is_incomplete", true) && "complete".equals(optString) && (optJSONObject3 == null || optJSONObject3.optInt("pending_messages", 0) == 0);
        JSONObject optJSONObject4 = optJSONObject2.optJSONObject("transactions");
        JSONArray optJSONArray2 = optJSONObject2.optJSONArray("transactions_order");
        if (optJSONObject4 == null || optJSONArray2 == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = null;
            for (int i = 0; i < optJSONArray2.length() && jSONObject2 == null; i++) {
                JSONObject optJSONObject5 = optJSONObject4.optJSONObject(optJSONArray2.optString(i));
                if (optJSONObject5 != null && c.b(optJSONObject5.optString("account"), this.c)) {
                    jSONObject2 = optJSONObject5;
                }
            }
        }
        if (jSONObject2 == null) {
            StringBuilder p = wi8.p("[gram-wallet-polling] chain: msg_hash=", str, " trace=");
            p.append(optJSONObject2.optString("trace_id"));
            p.append(" state=");
            p.append(optString);
            hg9.r(", no transaction of the wallet yet", p);
            return false;
        }
        JSONObject optJSONObject6 = jSONObject2.optJSONObject("description");
        if (optJSONObject6 == null) {
            optJSONObject = null;
        } else {
            optJSONObject = optJSONObject6.optJSONObject("compute_ph");
            jSONObject3 = optJSONObject6.optJSONObject("action");
        }
        boolean z2 = (optJSONObject6 == null || optJSONObject6.optBoolean("aborted", false) || (optJSONObject != null && !optJSONObject.optBoolean("success", true)) || (jSONObject3 != null && !jSONObject3.optBoolean("success", true))) ? false : true;
        JSONObject optJSONObject7 = jSONObject2.optJSONObject("in_msg");
        String optString2 = jSONObject2.optString("hash");
        String str2 = jSONObject2.optString("lt") + ":" + optString2;
        StringBuilder p2 = wi8.p("[gram-wallet-polling] chain: expected msg_hash=", str, ", trace=");
        p2.append(optJSONObject2.optString("trace_id"));
        p2.append(" (external ");
        p2.append(optJSONObject2.optString("external_hash"));
        p2.append(") state=");
        p2.append(optString);
        p2.append(" complete=");
        p2.append(z);
        wi8.z(", wallet tx id=", str2, " in_msg=", p2);
        p2.append(optJSONObject7 == null ? "none" : optJSONObject7.optString("hash"));
        p2.append(" success=");
        p2.append(z2);
        fc4.b(p2.toString());
        if (!z || TextUtils.isEmpty(optString2)) {
            return false;
        }
        y15 y15Var = this.e;
        c cVar = y15Var.a;
        TL_wallet.walletTransaction wallettransaction = y15Var.b;
        if (!wallettransaction.pending) {
            return true;
        }
        StringBuilder sb = new StringBuilder("send completed by the chain: msg_hash=");
        kt6.v(sb, wallettransaction.messageHash, ", id=", str2, ", success=");
        sb.append(z2);
        c.O(sb.toString());
        wallettransaction.id = str2;
        cVar.g(wallettransaction, z2, optString2);
        if (wallettransaction.nft != null && (t25Var = cVar.o) != null) {
            t25Var.h(wallettransaction);
            cVar.o.d();
        }
        cVar.J();
        return true;
    }

    public final void b() {
        if (this.f) {
            int i = this.h;
            long j = o[i];
            if (i < 4) {
                this.h = i + 1;
            }
            gm.d3(this.n, j);
        }
    }

    public final void c() {
        this.f = false;
        this.g++;
        this.j++;
        gm.r(this.n);
        gm.r(this.l);
        gm.r(this.m);
        int i = this.i;
        int i2 = this.a;
        if (i >= 0) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.i, true);
            this.i = -1;
        }
        if (this.k >= 0) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.k, true);
            this.k = -1;
        }
    }
}
