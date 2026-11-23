package org.telegram.ui.Wallet;

import android.text.TextUtils;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.ls;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.qw0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class t0 {
    public boolean h;
    public boolean i;
    public boolean k;
    public final /* synthetic */ u0 m;
    public final e4 a = new e4();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public String g = "";
    public int j = -1;
    public int l = -1;

    public t0(u0 u0Var) {
        this.m = u0Var;
    }

    public static TL_wallet.walletTransaction d(String str, ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i7)).id, str)) {
                return (TL_wallet.walletTransaction) arrayList.get(i7);
            }
        }
        return null;
    }

    public static String j(JSONObject jSONObject) {
        String optString = jSONObject.optString("lt", "");
        String optString2 = jSONObject.optString("hash", "");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return a8.p0.E(optString, ":", optString2);
    }

    public final void a() {
        int i7 = this.l;
        u0 u0Var = this.m;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(u0Var.a).cancelRequest(this.l, true);
            this.l = -1;
        }
        if (this.j >= 0) {
            ConnectionsManager.getInstance(u0Var.a).cancelRequest(this.j, true);
            this.j = -1;
        }
        this.k = false;
        this.i = false;
    }

    public final boolean b(TL_wallet.walletTransaction wallettransaction) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (arrayList.get(i7) == wallettransaction) {
                return true;
            }
            i7++;
        }
    }

    public final TL_wallet.walletTransaction c(TL_wallet.walletTransaction wallettransaction) {
        TL_wallet.walletTransaction d = d(wallettransaction.id, this.b);
        if (d != null) {
            return d;
        }
        String str = wallettransaction.id;
        HashMap hashMap = this.f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap.get(str);
        if (wallettransaction2 != null && b(wallettransaction2)) {
            return wallettransaction2;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap.get((String) it.next());
            if (wallettransaction3 != null && b(wallettransaction3) && u0.t0(wallettransaction3, wallettransaction)) {
                return wallettransaction3;
            }
        }
        return null;
    }

    public final void e(TL_wallet.walletTransaction wallettransaction) {
        String str = wallettransaction.id;
        HashMap hashMap = this.e;
        hashMap.remove(str);
        String str2 = wallettransaction.id;
        HashMap hashMap2 = this.f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap2.get(str2);
        HashSet hashSet = this.d;
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            String str3 = (String) obj;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap2.get(str3);
            if (TextUtils.equals(str3, wallettransaction.id) || (wallettransaction3 != null && (wallettransaction3 == wallettransaction2 || u0.t0(wallettransaction3, wallettransaction)))) {
                hashSet.remove(str3);
                hashMap.remove(str3);
            }
        }
    }

    public final void f(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.b;
            if (i7 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i7)).date < wallettransaction.date) {
                break;
            } else {
                i7++;
            }
        }
        arrayList.add(i7, wallettransaction);
    }

    public final void g() {
        if (this.i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.i = true;
        this.j = ConnectionsManager.getInstance(this.m.a).sendRequestTyped(gettransactions, new d3.b(1), new s0(this, gettransactions, 1));
    }

    public final void h() {
        if (this.k || this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.g;
        this.k = true;
        this.l = ConnectionsManager.getInstance(this.m.a).sendRequestTyped(gettransactions, new d3.b(1), new s0(this, gettransactions, 0));
    }

    public final void i() {
        u0 u0Var = this.m;
        ls.f(u0Var.a).k(ls.e4, this, u0Var);
    }

    public final void k() {
        int i7;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        u0 u0Var = this.m;
        ArrayList arrayList2 = u0Var.p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i7 = 0;
            arrayList = this.b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, wallettransaction2.id)) || (wallettransaction.incoming == wallettransaction2.incoming && (u0.l0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || u0.l0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        x0 x0Var = (x0) u0Var.u.remove(wallettransaction);
                        if (x0Var != null) {
                            x0Var.c();
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i10)).id;
            if (!TextUtils.isEmpty(str2) && !hashSet.add(str2)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        ArrayList arrayList3 = this.c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.-EL.sort(arrayList3, new qw0(5));
        e4 e4Var = this.a;
        HashSet hashSet2 = e4Var.a;
        HashSet hashSet3 = e4Var.a;
        HashMap hashMap = e4Var.b;
        hashSet2.clear();
        hashMap.clear();
        int size3 = arrayList3.size();
        while (i7 < size3) {
            Object obj2 = arrayList3.get(i7);
            i7++;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj2;
            if (wallettransaction3 != null && (walletTransactionPeer = wallettransaction3.peer) != null && (str = walletTransactionPeer.address) != null && !str.isEmpty()) {
                hashSet3.add(str);
            }
        }
        hashMap.clear();
        e4Var.b(4, new ArrayList(hashSet3));
    }
}
