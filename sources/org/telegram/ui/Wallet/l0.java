package org.telegram.ui.Wallet;

import android.text.TextUtils;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.kg0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class l0 {
    public boolean h;
    public boolean i;
    public final /* synthetic */ m0 l;
    public final e3 a = new e3();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public String g = "";
    public int j = -1;
    public int k = -1;

    public l0(m0 m0Var) {
        this.l = m0Var;
    }

    public static TL_wallet.walletTransaction c(String str, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i10)).id, str)) {
                return (TL_wallet.walletTransaction) arrayList.get(i10);
            }
        }
        return null;
    }

    public static String i(JSONObject jSONObject) {
        String optString = jSONObject.optString("lt", "");
        String optString2 = jSONObject.optString("hash", "");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return a1.g.C(optString, ":", optString2);
    }

    public final void a() {
        int i10 = this.l.a;
        if (this.k >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.k, true);
            this.k = -1;
        }
        if (this.j >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.j, true);
            this.j = -1;
        }
        this.i = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TL_wallet.walletTransaction b(TL_wallet.walletTransaction wallettransaction) {
        String str = wallettransaction.id;
        ArrayList arrayList = this.b;
        TL_wallet.walletTransaction c10 = c(str, arrayList);
        if (c10 != null) {
            return c10;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.f.get((String) it.next());
            if (wallettransaction2 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i10) != wallettransaction2) {
                        i10++;
                    } else if (m0.f0(wallettransaction2, wallettransaction)) {
                        return wallettransaction2;
                    }
                }
            }
        }
        return null;
    }

    public final void d(TL_wallet.walletTransaction wallettransaction) {
        String str = wallettransaction.id;
        HashMap hashMap = this.e;
        hashMap.remove(str);
        HashSet hashSet = this.d;
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = (String) obj;
            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.f.get(str2);
            if (TextUtils.equals(str2, wallettransaction.id) || (wallettransaction2 != null && m0.f0(wallettransaction2, wallettransaction))) {
                hashSet.remove(str2);
                hashMap.remove(str2);
            }
        }
    }

    public final void e(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.b;
            if (i10 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i10)).date < wallettransaction.date) {
                break;
            } else {
                i10++;
            }
        }
        arrayList.add(i10, wallettransaction);
    }

    public final void f() {
        if (this.i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.i = true;
        this.j = ConnectionsManager.getInstance(this.l.a).sendRequestTyped(gettransactions, new org.telegram.messenger.a(), new k0(this, gettransactions, 0));
    }

    public final void g() {
        if (this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.g;
        this.k = ConnectionsManager.getInstance(this.l.a).sendRequestTyped(gettransactions, new org.telegram.messenger.a(), new k0(this, gettransactions, 1));
    }

    public final void h() {
        m0 m0Var = this.l;
        NotificationCenter.getInstance(m0Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletTransactionsUpdate, this, m0Var);
    }

    public final void j() {
        int i10;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        m0 m0Var = this.l;
        ArrayList arrayList2 = m0Var.p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i10 = 0;
            arrayList = this.b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, wallettransaction2.id)) || (wallettransaction.incoming == wallettransaction2.incoming && (m0.a0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || m0.a0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        o0 o0Var = (o0) m0Var.t.remove(wallettransaction);
                        if (o0Var != null) {
                            o0Var.b();
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i11)).id;
            if (!TextUtils.isEmpty(str2) && !hashSet.add(str2)) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        ArrayList arrayList3 = this.c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.-EL.sort(arrayList3, new kg0(10));
        e3 e3Var = this.a;
        HashSet hashSet2 = e3Var.a;
        HashSet hashSet3 = e3Var.a;
        HashMap hashMap = e3Var.b;
        hashSet2.clear();
        hashMap.clear();
        int size3 = arrayList3.size();
        while (i10 < size3) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj2;
            if (wallettransaction3 != null && (walletTransactionPeer = wallettransaction3.peer) != null && (str = walletTransactionPeer.address) != null && !str.isEmpty()) {
                hashSet3.add(str);
            }
        }
        hashMap.clear();
        e3Var.b(4, new ArrayList(hashSet3));
    }
}
