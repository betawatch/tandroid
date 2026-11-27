package org.telegram.ui.Wallet;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.util.LruCache;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class c {
    public static volatile c[] T = new c[4];
    public static final long[] U = {1500, 2500, 4000, 6000, 10000, 15000, 20000};
    public static final LruCache V = new LruCache(TLObject.FLAG_12);
    public static DecimalFormat W;
    public int A;
    public final a25 B;
    public int E;
    public final a25 H;
    public final a25 I;
    public final ArrayList J;
    public final List K;
    public String L;
    public final a25 M;
    public final HashMap N;
    public final HashMap O;
    public final HashMap P;
    public final HashMap Q;
    public ArrayList R;
    public HashMap S;
    public final int a;
    public WalletEngine2 b;
    public k35 c;
    public String d;
    public TL_wallet.WalletState e;
    public TL_update.TL_updateWalletGaslessInfo f;
    public final a55 g;
    public final s43 h;
    public Boolean i;
    public String j;
    public long k;
    public boolean l;
    public boolean m;
    public b n;
    public x25 o;
    public t35 t;
    public String v;
    public String y;
    public String z;
    public final ArrayList p = new ArrayList();
    public final HashMap q = new HashMap();
    public final HashMap r = new HashMap();
    public final ArrayList s = new ArrayList();
    public final HashMap u = new HashMap();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public int C = -1;
    public int D = -1;
    public int F = 0;
    public final HashSet G = new HashSet();

    /* JADX WARN: Type inference failed for: r0v7, types: [a25] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a25] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a25] */
    /* JADX WARN: Type inference failed for: r2v5, types: [a25] */
    public c(int i) {
        final byte b = 1;
        this.B = new Runnable(this) { // from class: a25
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x25 x25Var;
                byte b2 = b;
                int i2 = 0;
                c cVar = this.b;
                switch (b2) {
                    case 0:
                        cVar.g0();
                        cVar.T();
                        break;
                    case 1:
                        if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (x25Var = cVar.o) != null && cVar.n != null) {
                            ArrayList arrayList = x25Var.b;
                            int size = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                    Object obj = arrayList.get(i3);
                                    i3++;
                                    if (cVar.N((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList2 = cVar.n.b;
                                        int size2 = arrayList2.size();
                                        while (i2 < size2) {
                                            Object obj2 = arrayList2.get(i2);
                                            i2++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && cVar.N(wallettransaction.nft)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        cVar.A().d();
                        cVar.G().g();
                        cVar.J();
                        int i4 = cVar.A;
                        long[] jArr = c.U;
                        if (i4 < 7) {
                            a25 a25Var = cVar.B;
                            cVar.A = i4 + 1;
                            hl.d3(a25Var, jArr[i4]);
                            break;
                        }
                        break;
                    case 2:
                        t35 t35Var = cVar.t;
                        if (t35Var != null && t35Var.d) {
                            cVar.J();
                            break;
                        }
                        break;
                    default:
                        int i5 = cVar.a;
                        x25 x25Var2 = cVar.o;
                        if (x25Var2 != null) {
                            x25Var2.d();
                        }
                        jxa.v(i5, false).M(yac.h(i5).e());
                        break;
                }
            }
        };
        this.E = -1;
        final byte b2 = 0;
        final byte b3 = 2;
        this.H = new Runnable(this) { // from class: a25
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x25 x25Var;
                byte b22 = b3;
                int i2 = 0;
                c cVar = this.b;
                switch (b22) {
                    case 0:
                        cVar.g0();
                        cVar.T();
                        break;
                    case 1:
                        if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (x25Var = cVar.o) != null && cVar.n != null) {
                            ArrayList arrayList = x25Var.b;
                            int size = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                    Object obj = arrayList.get(i3);
                                    i3++;
                                    if (cVar.N((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList2 = cVar.n.b;
                                        int size2 = arrayList2.size();
                                        while (i2 < size2) {
                                            Object obj2 = arrayList2.get(i2);
                                            i2++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && cVar.N(wallettransaction.nft)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        cVar.A().d();
                        cVar.G().g();
                        cVar.J();
                        int i4 = cVar.A;
                        long[] jArr = c.U;
                        if (i4 < 7) {
                            a25 a25Var = cVar.B;
                            cVar.A = i4 + 1;
                            hl.d3(a25Var, jArr[i4]);
                            break;
                        }
                        break;
                    case 2:
                        t35 t35Var = cVar.t;
                        if (t35Var != null && t35Var.d) {
                            cVar.J();
                            break;
                        }
                        break;
                    default:
                        int i5 = cVar.a;
                        x25 x25Var2 = cVar.o;
                        if (x25Var2 != null) {
                            x25Var2.d();
                        }
                        jxa.v(i5, false).M(yac.h(i5).e());
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.I = new Runnable(this) { // from class: a25
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x25 x25Var;
                byte b22 = b4;
                int i2 = 0;
                c cVar = this.b;
                switch (b22) {
                    case 0:
                        cVar.g0();
                        cVar.T();
                        break;
                    case 1:
                        if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (x25Var = cVar.o) != null && cVar.n != null) {
                            ArrayList arrayList = x25Var.b;
                            int size = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                    Object obj = arrayList.get(i3);
                                    i3++;
                                    if (cVar.N((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList2 = cVar.n.b;
                                        int size2 = arrayList2.size();
                                        while (i2 < size2) {
                                            Object obj2 = arrayList2.get(i2);
                                            i2++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && cVar.N(wallettransaction.nft)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        cVar.A().d();
                        cVar.G().g();
                        cVar.J();
                        int i4 = cVar.A;
                        long[] jArr = c.U;
                        if (i4 < 7) {
                            a25 a25Var = cVar.B;
                            cVar.A = i4 + 1;
                            hl.d3(a25Var, jArr[i4]);
                            break;
                        }
                        break;
                    case 2:
                        t35 t35Var = cVar.t;
                        if (t35Var != null && t35Var.d) {
                            cVar.J();
                            break;
                        }
                        break;
                    default:
                        int i5 = cVar.a;
                        x25 x25Var2 = cVar.o;
                        if (x25Var2 != null) {
                            x25Var2.d();
                        }
                        jxa.v(i5, false).M(yac.h(i5).e());
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = DesugarCollections.unmodifiableList(arrayList);
        this.M = new Runnable(this) { // from class: a25
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x25 x25Var;
                byte b22 = b2;
                int i2 = 0;
                c cVar = this.b;
                switch (b22) {
                    case 0:
                        cVar.g0();
                        cVar.T();
                        break;
                    case 1:
                        if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (x25Var = cVar.o) != null && cVar.n != null) {
                            ArrayList arrayList2 = x25Var.b;
                            int size = arrayList2.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                    Object obj = arrayList2.get(i3);
                                    i3++;
                                    if (cVar.N((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList22 = cVar.n.b;
                                        int size2 = arrayList22.size();
                                        while (i2 < size2) {
                                            Object obj2 = arrayList22.get(i2);
                                            i2++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && cVar.N(wallettransaction.nft)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        cVar.A().d();
                        cVar.G().g();
                        cVar.J();
                        int i4 = cVar.A;
                        long[] jArr = c.U;
                        if (i4 < 7) {
                            a25 a25Var = cVar.B;
                            cVar.A = i4 + 1;
                            hl.d3(a25Var, jArr[i4]);
                            break;
                        }
                        break;
                    case 2:
                        t35 t35Var = cVar.t;
                        if (t35Var != null && t35Var.d) {
                            cVar.J();
                            break;
                        }
                        break;
                    default:
                        int i5 = cVar.a;
                        x25 x25Var2 = cVar.o;
                        if (x25Var2 != null) {
                            x25Var2.d();
                        }
                        jxa.v(i5, false).M(yac.h(i5).e());
                        break;
                }
            }
        };
        this.N = new HashMap();
        this.O = new HashMap();
        this.P = new HashMap();
        this.Q = new HashMap();
        this.a = i;
        try {
            this.m = B().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e) {
            n("failed to load prefs", e);
        }
        this.h = new s43(this);
        i0();
        h0();
        P("requesting has walt balance");
        this.E = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new ic(b2), new b25(this, b2));
        this.g = new a55(this);
        a25 a25Var = this.M;
        Object obj = k35.g;
        synchronized (k35.class) {
            Iterator it = k35.j.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable = (Runnable) weakReference.get();
                if (runnable == null) {
                    k35.j.remove(weakReference);
                } else if (runnable == a25Var) {
                    b2 = 1;
                }
            }
            if (a25Var != null && b2 == 0) {
                k35.j.add(new WeakReference(a25Var));
            }
        }
        g0();
    }

    public static Context B() {
        org.telegram.ui.ActionBar.e S = LaunchActivity.S();
        return (S == null || S.getContext() == null) ? org.telegram.messenger.a.b : S.getContext();
    }

    public static c C(int i) {
        c cVar;
        c cVar2 = T[i];
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (c.class) {
            cVar = T[i];
            if (cVar == null) {
                c[] cVarArr = T;
                c cVar3 = new c(i);
                cVarArr[i] = cVar3;
                cVar = cVar3;
            }
        }
        return cVar;
    }

    public static TL_update.TL_updateSentWalletTransaction F(TLRPC.Updates updates) {
        if (updates == null) {
            return null;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateSentWalletTransaction) {
            return (TL_update.TL_updateSentWalletTransaction) update;
        }
        ArrayList<TLRPC.Update> arrayList = updates.updates;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.Update update2 = arrayList.get(i);
            i++;
            TLRPC.Update update3 = update2;
            if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                return (TL_update.TL_updateSentWalletTransaction) update3;
            }
        }
        return null;
    }

    public static void I(IdentityHashMap identityHashMap, HashMap hashMap, int i, TL_wallet.walletTransaction wallettransaction, boolean z) {
        TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
        if (z) {
            if (treeSet == null) {
                treeSet = new TreeSet();
                identityHashMap.put(wallettransaction, treeSet);
            }
            treeSet.add(Integer.valueOf(i));
        } else if (treeSet != null) {
            treeSet.remove(Integer.valueOf(i));
        }
        ArrayList v0 = v0(wallettransaction);
        int size = v0.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = v0.get(i2);
            i2++;
            String str = (String) obj;
            TreeSet treeSet2 = (TreeSet) hashMap.get(str);
            if (z) {
                if (treeSet2 == null) {
                    treeSet2 = new TreeSet();
                    hashMap.put(str, treeSet2);
                }
                treeSet2.add(Integer.valueOf(i));
            } else if (treeSet2 != null) {
                treeSet2.remove(Integer.valueOf(i));
            }
        }
    }

    public static boolean K(String str) {
        return "WALLET_SEND_CANCELLED".equals(str) || "PASSCODE_FAILED".equalsIgnoreCase(str);
    }

    public static void P(String str) {
        cc4.b("[gram-wallet] ".concat(str));
    }

    public static boolean Q(r47 r47Var, TL_wallet.walletTransaction wallettransaction) {
        if (r47Var != null && r47Var.k != null && wallettransaction != null && r47Var.O3()) {
            TLRPC.Message message = r47Var.k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j = wallettransaction.random_id;
                if (j != 0 && message.random_id == j) {
                    return true;
                }
                if (wallettransaction.localMessageId != 0 && r47Var.e1() == wallettransaction.localMessageId) {
                    return true;
                }
                if (!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer.transaction_id)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(ArrayList arrayList, char c, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String u0 = u0(str);
        if (u0 != null) {
            str2 = c + "x" + u0;
        } else {
            str2 = c + "r" + str;
        }
        arrayList.add(str2);
    }

    public static boolean b(String str, String str2) {
        String x0 = x0(str);
        return x0 != null && x0.equals(x0(str2));
    }

    public static byte[] b0(byte[] bArr) {
        byte[] bArr2 = new byte[jn7.r3];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z = false;
            int i = 0;
            for (byte b : bArr) {
                if (c35.e(b)) {
                    z = i > 0;
                } else {
                    if (z) {
                        if (i == 215) {
                            throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                        }
                        int i2 = i + 1;
                        bArr2[i] = 32;
                        i = i2;
                        z = false;
                    }
                    if (i == 215) {
                        throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                    }
                    bArr2[i] = b;
                    i++;
                }
            }
            return bArr2;
        } catch (RuntimeException e) {
            Arrays.fill(bArr2, (byte) 0);
            throw e;
        }
    }

    public static z45 d0(a35 a35Var) {
        JSONArray jSONArray = new JSONArray();
        List<a35> list = a35Var.g;
        if (list == null) {
            list = Collections.singletonList(a35Var);
        }
        for (a35 a35Var2 : list) {
            int i = a35Var2.e;
            byte[] bArr = a35Var2.d;
            String str = a35Var2.a;
            if (i != 3) {
                lq5.j("WALLET_UNSUPPORTED_SEND_MODE");
                return null;
            }
            if (str.indexOf(58) >= 0) {
                str = f0(str, bArr == null);
            }
            JSONObject put = new JSONObject().put("address", str).put("amount", Long.toString(a35Var2.b));
            byte[] bArr2 = a35Var2.c;
            if (bArr2 != null && bArr2.length > 0) {
                put.put("payload", Base64.encodeToString(bArr2, 2));
            }
            if (bArr != null && bArr.length > 0) {
                put.put("stateInit", Base64.encodeToString(bArr, 2));
            }
            jSONArray.put(put);
        }
        return new z45(new JSONObject().put("messages", jSONArray));
    }

    public static String f0(String str, boolean z) {
        try {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int parseInt = Integer.parseInt(str.substring(0, indexOf));
                String substring = str.substring(indexOf + 1);
                if (substring.length() == 64) {
                    byte[] bArr = new byte[36];
                    bArr[0] = z ? (byte) 17 : (byte) 81;
                    bArr[1] = (byte) parseInt;
                    for (int i = 0; i < 32; i++) {
                        int i2 = i << 1;
                        bArr[i + 2] = (byte) Integer.parseInt(substring.substring(i2, i2 + 2), 16);
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < 34; i4++) {
                        i3 ^= (bArr[i4] & 255) << 8;
                        for (int i5 = 0; i5 < 8; i5++) {
                            int i6 = 32768 & i3;
                            int i7 = i3 << 1;
                            if (i6 != 0) {
                                i7 ^= 4129;
                            }
                            i3 = i7 & 65535;
                        }
                    }
                    bArr[34] = (byte) (i3 >>> 8);
                    bArr[35] = (byte) i3;
                    return Base64.encodeToString(bArr, 11);
                }
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static TL_wallet.WalletTransactionPeer h(TLRPC.User user, String str, String str2) {
        TL_wallet.WalletTransactionPeer wallettransactionpeeraddress;
        if (user != null) {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerUser();
            wallettransactionpeeraddress.user_id = user.id;
        } else {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        }
        wallettransactionpeeraddress.address = str;
        if (TextUtils.isEmpty(str2) || "null".equals(str2)) {
            str2 = null;
        }
        wallettransactionpeeraddress.domain = str2;
        return wallettransactionpeeraddress;
    }

    public static z45 i(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        int indexOf = stargiftdepositpayload.nft_address.indexOf(58);
        String str = stargiftdepositpayload.nft_address;
        if (indexOf >= 0) {
            str = f0(str, true);
        }
        return new z45(jSONObject.put("messages", jSONArray.put(jSONObject2.put("address", str).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static void m(String str) {
        cc4.d("[gram-wallet] ".concat(str));
    }

    public static boolean m0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            String u0 = u0(str);
            if (u0 != null && u0.equals(u0(str2))) {
                return true;
            }
        }
        return false;
    }

    public static void n(String str, Throwable th) {
        cc4.e("[gram-wallet] ".concat(str), th);
    }

    public static void o(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() < 2) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList.get(i);
            if (wallettransaction != null && !TextUtils.isEmpty(wallettransaction.id)) {
                int i2 = i + 1;
                while (i2 < arrayList.size()) {
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) arrayList.get(i2);
                    if (wallettransaction2 != null && TextUtils.equals(wallettransaction2.id, wallettransaction.id)) {
                        int i3 = i2 - 1;
                        arrayList.remove(i2);
                        if (wallettransaction.nft != null || wallettransaction2.nft == null) {
                            wallettransaction.amount += wallettransaction2.amount;
                            wallettransaction2 = wallettransaction;
                            wallettransaction = wallettransaction2;
                        } else {
                            wallettransaction2.amount += wallettransaction.amount;
                            arrayList.set(i, wallettransaction2);
                        }
                        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                        if ((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift) && !(wallettransaction2.peer instanceof TL_wallet.walletTransactionPeerOnchainGift)) {
                            wallettransaction2.peer = walletTransactionPeer;
                        }
                        wallettransaction = wallettransaction2;
                        i2 = i3;
                    }
                    i2++;
                }
            }
        }
    }

    public static SpannableStringBuilder p(String str, CharSequence charSequence, int i) {
        String replace = charSequence.toString().replace((char) 8211, '-');
        String M0 = ob6.M0(i, null);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                M0 = ob6.J0((int) ((parseLong < -2147483647L || parseLong > 2147483647L) ? Math.abs(parseLong % 100) + 100 : Math.abs(parseLong)), str);
            } catch (NumberFormatException unused) {
            }
        }
        return hl.G2(M0, charSequence, "%1$s");
    }

    public static byte[][] q0(byte[] bArr, SecureRandom secureRandom) {
        if (bArr.length != 215) {
            lq5.j("INVALID_MNEMONIC_BACKUP_SIZE");
            return null;
        }
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, jn7.r3);
        try {
            secureRandom.nextBytes(bArr2[0]);
            secureRandom.nextBytes(bArr2[1]);
            for (int i = 0; i < bArr.length; i++) {
                bArr2[2][i] = (byte) ((bArr[i] ^ bArr2[0][i]) ^ bArr2[1][i]);
            }
            return bArr2;
        } catch (RuntimeException e) {
            for (byte[] bArr3 : bArr2) {
                Arrays.fill(bArr3, (byte) 0);
            }
            throw e;
        }
    }

    public static SpannableStringBuilder r(long j, boolean z) {
        return p("GramCapital", s(j, z), 2131749290);
    }

    public static String s(long j, boolean z) {
        if ((j > -10000000 && j < 10000000) || z) {
            return nza.K0(j);
        }
        DecimalFormat decimalFormat = W;
        if (decimalFormat == null) {
            decimalFormat = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
            W = decimalFormat;
        }
        return decimalFormat.format(j / 1.0E9d);
    }

    public static String t(long j, boolean z) {
        int i;
        boolean z2 = j <= -1000000000 || j >= 1000000000;
        if (!z) {
            i = z2 ? 2 : 3;
        } else {
            if (z2) {
                return s(j, true);
            }
            i = 4;
        }
        BigDecimal scale = BigDecimal.valueOf(j, 9).setScale(i, RoundingMode.DOWN);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public static boolean t0(TL_wallet.walletTransaction wallettransaction) {
        if (wallettransaction.pending) {
            return false;
        }
        return wallettransaction.nft != null || (wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnchainGift);
    }

    public static SpannableStringBuilder u(String str, float f) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f), i, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(5:9|(2:11|(1:16))|29|30|31)|32|33|34|35|(4:37|(1:39)|40|41)|31) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String u0(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LruCache lruCache = V;
        String str2 = (String) lruCache.get(str);
        if (str2 == null) {
            str2 = "";
            if (str.length() == 64) {
                for (0; i < 64; i + 1) {
                    char charAt = str.charAt(i);
                    i = ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f') || (charAt >= 'A' && charAt <= 'F')) ? i + 1 : 0;
                }
                str2 = str.toLowerCase(Locale.ROOT);
                lruCache.put(str, str2);
            }
            byte[] decode = Base64.decode(str.replace('-', '+').replace('_', '/'), 0);
            if (decode.length == 32) {
                StringBuilder sb = new StringBuilder(64);
                for (byte b : decode) {
                    sb.append(Character.forDigit((b >> 4) & 15, 16));
                    sb.append(Character.forDigit(b & 15, 16));
                }
                str2 = sb.toString();
            }
            lruCache.put(str, str2);
        }
        if (str2.isEmpty()) {
            return null;
        }
        return str2;
    }

    public static SpannableStringBuilder v(long j) {
        return w(j, false);
    }

    public static ArrayList v0(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = new ArrayList(5);
        if (wallettransaction != null) {
            if (!TextUtils.isEmpty(wallettransaction.id)) {
                arrayList.add("i" + wallettransaction.id);
            }
            a(arrayList, 't', wallettransaction.tx_hash);
            a(arrayList, 'm', wallettransaction.messageHash);
            if (!wallettransaction.incoming) {
                a(arrayList, 'g', wallettransaction.gaslessMessageBodyHash);
                a(arrayList, 'n', wallettransaction.normalMessageBodyHash);
            }
        }
        return arrayList;
    }

    public static SpannableStringBuilder w(long j, boolean z) {
        return p("Grams", s(j, z), 2131749261);
    }

    public static boolean w0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, wallettransaction2.id)) || m0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || m0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            return true;
        }
        if (wallettransaction.incoming || wallettransaction2.incoming) {
            return false;
        }
        return m0(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) || m0(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash);
    }

    public static String x0(String str) {
        if (str == null) {
            return null;
        }
        if (str.matches("-?[0-9]+:[0-9a-fA-F]{64}")) {
            return str.toLowerCase(Locale.ROOT);
        }
        try {
            byte[] decode = Base64.decode(str.replace('-', '+').replace('_', '/'), 0);
            if (decode.length != 36) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((int) decode[1]);
            sb.append(':');
            for (int i = 2; i < 34; i++) {
                sb.append(Character.forDigit((decode[i] >> 4) & 15, 16));
                sb.append(Character.forDigit(decode[i] & 15, 16));
            }
            return sb.toString();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final x25 A() {
        x25 x25Var = this.o;
        if (x25Var != null) {
            return x25Var;
        }
        x25 x25Var2 = new x25(this);
        this.o = x25Var2;
        return x25Var2;
    }

    public final void A0(Runnable runnable) {
        if (M()) {
            runnable.run();
        } else {
            this.w.add(new WeakReference(runnable));
        }
    }

    public final byte[] D() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).public_key;
        }
        return null;
    }

    public final void E(boolean z, boolean z2, boolean z3, icc iccVar) {
        P("getSecretPhrase: whenReady...");
        A0(new vu2(this, iccVar, z3, z, z2, (byte) 2));
    }

    public final b G() {
        b bVar = this.n;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.n = bVar2;
        return bVar2;
    }

    public final void H(boolean z, boolean z2, c35 c35Var, pcc pccVar) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(c35Var)) {
                pccVar.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(c35Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(c35Var);
            c35 b = c35Var.b();
            P("import wallet: requesting proof challenge");
            i18.a(this.a, null, new nu0((Object) this, (Object) b, (Object) pccVar, (Object) secretPhraseToAnchorPublicKey, (byte) 3), null, null, new bw1(this, pccVar, secretPhraseToPublicKey, b, (byte) 1), z, z2, new c34(new rj4(b, (byte) 21), (g25) null));
        } catch (Exception unused2) {
            pccVar.a("INVALID_PHRASE");
        }
    }

    public final void J() {
        b bVar = this.n;
        if (bVar != null) {
            bVar.g();
        }
        if (this.C >= 0) {
            return;
        }
        i0();
    }

    public final boolean L() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f;
        return tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
    }

    public final boolean M() {
        return (!(this.e instanceof TL_wallet.TL_walletState) || this.b == null || this.c == null) ? false : true;
    }

    public final boolean N(TL_wallet.nftItem nftitem) {
        if (nftitem == null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.y)) {
            return b(nftitem.address, this.y);
        }
        TL_stars.StarGift starGift = nftitem.gift;
        return (starGift instanceof TL_stars.TL_starGiftUnique) && TextUtils.equals(((TL_stars.TL_starGiftUnique) starGift).slug, this.z);
    }

    public final void O() {
        if (this.S == null) {
            this.R = new ArrayList();
            this.S = new HashMap();
            try {
                JSONArray jSONArray = new JSONArray(B().getSharedPreferences("gram_wallet_topups" + this.a, 0).getString("list", "[]"));
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    SerializedData serializedData = new SerializedData(Base64.decode(jSONObject.getString("gift"), 2));
                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    serializedData.cleanup();
                    if (TLdeserialize != null) {
                        String string = jSONObject.getString("comment");
                        this.R.add(string);
                        this.S.put(string, TLdeserialize);
                    }
                }
            } catch (Exception e) {
                n("failed to load top-ups", e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
    
        r4 = r4.c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R() {
        k35 k35Var;
        boolean z;
        if (!(this.e instanceof TL_wallet.TL_walletState) || k35Var == null) {
            return false;
        }
        k35Var.getClass();
        synchronized (k35.g) {
            try {
                z = k35Var.s().b;
            } catch (Exception e) {
                k35Var.m(e);
                z = true;
            }
        }
        return z;
    }

    public final boolean S() {
        return this.m && !xea.r.isEmpty();
    }

    public final void T() {
        jn7.f(this.a).k(jn7.d4, this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:90|91|(4:93|94|95|(4:101|102|103|(4:105|106|107|108)(9:109|(1:111)(4:191|(2:193|(1:217)(7:199|(1:203)|204|(1:215)(1:210)|211|212|(1:214)))|220|221)|(1:113)|114|(4:116|(1:118)(1:177)|(5:120|(3:122|(1:124)|125)|126|(1:128)|129)(14:132|(3:134|(2:136|(1:150)(1:143))|153)|154|(1:156)|157|(1:159)(1:176)|160|(1:175)(1:164)|165|(1:167)(1:174)|(1:171)|172|173|108)|130)(1:190)|179|(2:181|(1:(2:183|(2:185|186)(1:187))(2:188|189)))(0)|(0)(0)|130)))(1:397)|222|223|224|225|226|227|228|229|(3:231|(7:235|(3:237|(2:239|240)(2:242|(2:246|(2:248|249)(1:250)))|241)|251|252|241|232|233)|253)(1:387)|254|(1:383)(1:271)|(1:382)(1:277)|(3:(1:290)(1:381)|291|(2:295|(1:297)(29:298|299|300|301|302|303|(2:308|(3:310|311|312)(2:317|318))|319|(1:321)|322|(1:324)(3:375|376|377)|(1:326)(1:374)|327|(2:369|370)(1:(1:368)(1:332))|333|(1:337)|(1:339)(1:367)|340|(3:343|(3:346|(2:348|349)(1:364)|344)|365)|366|350|(1:352)(1:363)|353|(1:362)(2:357|358)|359|(3:361|103|(0)(0))|316|103|(0)(0))))|102|103|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0550, code lost:
    
        if (r0 != null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0455, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0456, code lost:
    
        r37 = r1;
        r39 = r6;
        r38 = r8;
        r40 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x045f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0460, code lost:
    
        r37 = r1;
        r39 = r6;
        r38 = r8;
        r40 = r11;
        r36 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String optString;
        boolean equals;
        JSONArray optJSONArray;
        String str6;
        String str7;
        String str8;
        JSONArray jSONArray;
        int i;
        ArrayList arrayList;
        HashMap hashMap;
        TL_wallet.walletTransaction wallettransaction;
        ArrayList arrayList2;
        HashSet hashSet;
        String str9;
        HashMap hashMap2;
        ArrayList arrayList3;
        String j;
        HashMap hashMap3;
        String str10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        b bVar;
        TL_wallet.walletTransaction wallettransaction2;
        TL_wallet.walletTransaction wallettransaction3;
        int i2;
        TL_wallet.walletTransaction wallettransaction4;
        TL_wallet.nftItem nftitem;
        ArrayList arrayList6;
        HashMap hashMap4;
        String str11;
        String str12;
        int i3;
        String string;
        JSONObject jSONObject2;
        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress;
        String str13;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        int i4;
        int i5;
        JSONObject optJSONObject3;
        t35 t35Var = this.t;
        if (t35Var == null || !TextUtils.equals(t35Var.b, x())) {
            return;
        }
        String optString2 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
        String str14 = "finality";
        String optString3 = jSONObject.optString("finality");
        P("streaming " + optString2 + ", finality: " + optString3);
        if ("account_state_change".equals(optString2) && "finalized".equals(optString3) && (this.e instanceof TL_wallet.TL_walletState) && (optJSONObject3 = jSONObject.optJSONObject("state")) != null) {
            try {
                long parseLong = Long.parseLong(optJSONObject3.getString("balance"));
                if (parseLong >= 0 && ((TL_wallet.TL_walletState) this.e).balance != parseLong) {
                    P("streaming updates balance to " + parseLong);
                    this.k = System.currentTimeMillis();
                    this.l = true;
                    ((TL_wallet.TL_walletState) this.e).balance = parseLong;
                    V();
                    T();
                    b bVar2 = this.n;
                    if (bVar2 != null) {
                        bVar2.g();
                    }
                }
            } catch (Exception unused) {
                m("Invalid streaming balance");
            }
        }
        b bVar3 = this.n;
        if (bVar3 != null) {
            ArrayList arrayList7 = bVar3.b;
            HashSet hashSet2 = bVar3.d;
            HashMap hashMap5 = bVar3.e;
            c cVar = bVar3.m;
            int i6 = 1;
            ArrayList arrayList8 = cVar.p;
            HashMap hashMap6 = bVar3.f;
            String optString4 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
            str = optString2;
            String str15 = "trace_external_hash_norm";
            if ("trace_invalidated".equals(optString4)) {
                String optString5 = jSONObject.optString("trace_external_hash_norm");
                if (!TextUtils.isEmpty(optString5)) {
                    ArrayList arrayList9 = new ArrayList(hashMap5.keySet());
                    int size = arrayList9.size();
                    int i7 = 0;
                    boolean z = false;
                    while (i7 < size) {
                        Object obj = arrayList9.get(i7);
                        i7++;
                        String str16 = (String) obj;
                        if (m0((String) hashMap5.get(str16), optString5)) {
                            hashMap5.remove(str16);
                            hashSet2.remove(str16);
                            TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) hashMap6.remove(str16);
                            int size2 = arrayList7.size() - 1;
                            while (size2 >= 0) {
                                String str17 = optString5;
                                if (arrayList7.get(size2) == wallettransaction5 || TextUtils.equals(((TL_wallet.walletTransaction) arrayList7.get(size2)).id, str16)) {
                                    arrayList7.remove(size2);
                                    z = true;
                                }
                                size2--;
                                optString5 = str17;
                            }
                        }
                    }
                    if (z) {
                        bVar3.k();
                        bVar3.i();
                    }
                }
            } else if ("transactions".equals(optString4) && (((equals = "finalized".equals((optString = jSONObject.optString("finality")))) || "confirmed".equals(optString)) && (optJSONArray = jSONObject.optJSONArray("transactions")) != null)) {
                str2 = "finalized";
                ArrayList arrayList10 = new ArrayList();
                str6 = "confirmed";
                String str18 = "trace_invalidated";
                int i8 = 0;
                TL_wallet.walletTransaction wallettransaction6 = null;
                boolean z2 = false;
                while (i8 < optJSONArray.length()) {
                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(i8);
                    if (optJSONObject4 != null) {
                        jSONArray = optJSONArray;
                        if (optJSONObject4.optBoolean("emulated")) {
                            str7 = str15;
                            str8 = str14;
                        } else {
                            i = i8;
                            if ("pending".equals(optJSONObject4.optString(str14)) || (j = b.j(optJSONObject4)) == null) {
                                hashMap2 = hashMap6;
                                str7 = str15;
                                str8 = str14;
                                arrayList = arrayList8;
                                hashMap = hashMap5;
                                arrayList3 = arrayList10;
                                wallettransaction = wallettransaction6;
                                arrayList2 = arrayList7;
                                hashSet = hashSet2;
                            } else {
                                str8 = str14;
                                wallettransaction = wallettransaction6;
                                try {
                                    str7 = str15;
                                } catch (Exception e) {
                                    e = e;
                                    hashMap3 = hashMap6;
                                    str7 = str15;
                                }
                                try {
                                } catch (Exception e2) {
                                    e = e2;
                                    hashMap3 = hashMap6;
                                    str10 = j;
                                    arrayList4 = arrayList8;
                                    hashMap = hashMap5;
                                    arrayList5 = arrayList10;
                                    bVar = bVar3;
                                    arrayList2 = arrayList7;
                                    hashSet = hashSet2;
                                    wallettransaction2 = null;
                                    n("stream transaction parse failed", e);
                                    wallettransaction3 = wallettransaction2;
                                    String str19 = str10;
                                    arrayList3 = arrayList5;
                                    if (wallettransaction3 == null) {
                                    }
                                }
                                if (b(optJSONObject4.getString("account"), cVar.x())) {
                                    JSONObject jSONObject3 = optJSONObject4.getJSONObject("description");
                                    if (!jSONObject3.optBoolean("destroyed")) {
                                        boolean optBoolean = jSONObject3.optBoolean("aborted");
                                        JSONObject optJSONObject5 = jSONObject3.optJSONObject("compute_ph");
                                        hashSet = hashSet2;
                                        if (optJSONObject5 != null) {
                                            hashMap = hashMap5;
                                            try {
                                            } catch (Exception e3) {
                                                e = e3;
                                                hashMap3 = hashMap6;
                                                str10 = j;
                                                arrayList4 = arrayList8;
                                                arrayList5 = arrayList10;
                                                bVar = bVar3;
                                                arrayList2 = arrayList7;
                                                wallettransaction2 = null;
                                                n("stream transaction parse failed", e);
                                                wallettransaction3 = wallettransaction2;
                                                String str192 = str10;
                                                arrayList3 = arrayList5;
                                                if (wallettransaction3 == null) {
                                                }
                                            }
                                            if (!optJSONObject5.optBoolean("skipped") && (!optJSONObject5.optBoolean("success") || optJSONObject5.optInt("exit_code") != 0)) {
                                                hashMap3 = hashMap6;
                                                str10 = j;
                                                arrayList4 = arrayList8;
                                                arrayList5 = arrayList10;
                                                bVar = bVar3;
                                                arrayList2 = arrayList7;
                                                wallettransaction3 = null;
                                                wallettransaction2 = null;
                                                String str1922 = str10;
                                                arrayList3 = arrayList5;
                                                if (wallettransaction3 == null) {
                                                    arrayList3.add(str1922);
                                                    str9 = str18;
                                                    bVar3 = bVar;
                                                    hashMap2 = hashMap3;
                                                    arrayList = arrayList4;
                                                    wallettransaction6 = wallettransaction;
                                                    arrayList10 = arrayList3;
                                                    str18 = str9;
                                                    arrayList8 = arrayList;
                                                    hashMap6 = hashMap2;
                                                    optJSONArray = jSONArray;
                                                    str14 = str8;
                                                    str15 = str7;
                                                    hashSet2 = hashSet;
                                                    hashMap5 = hashMap;
                                                    arrayList7 = arrayList2;
                                                    i6 = 1;
                                                    i8 = i + 1;
                                                } else {
                                                    if (wallettransaction3.incoming) {
                                                        wallettransaction4 = wallettransaction2;
                                                        arrayList = arrayList4;
                                                        i2 = 0;
                                                    } else {
                                                        arrayList = arrayList4;
                                                        ArrayList arrayList11 = new ArrayList(arrayList);
                                                        int size3 = arrayList11.size();
                                                        int i9 = 0;
                                                        while (i9 < size3) {
                                                            Object obj2 = arrayList11.get(i9);
                                                            i9++;
                                                            wallettransaction4 = (TL_wallet.walletTransaction) obj2;
                                                            boolean m0 = m0(wallettransaction4.gaslessMessageBodyHash, wallettransaction3.gaslessMessageBodyHash);
                                                            boolean m02 = m0(wallettransaction4.normalMessageBodyHash, wallettransaction3.normalMessageBodyHash);
                                                            if (!wallettransaction4.incoming && (m0 || m02)) {
                                                                wallettransaction3.gasless = m0;
                                                                if (wallettransaction3.nft == null && (nftitem = wallettransaction4.nft) != null) {
                                                                    wallettransaction3.nft = nftitem;
                                                                    wallettransaction3.peer = wallettransaction4.peer;
                                                                    wallettransaction3.amount = wallettransaction4.amount;
                                                                    wallettransaction3.comment = wallettransaction4.comment;
                                                                }
                                                                if (wallettransaction4.pending || wallettransaction4.failed || TextUtils.isEmpty(wallettransaction4.id)) {
                                                                    cVar.c(wallettransaction4, wallettransaction3);
                                                                } else {
                                                                    wallettransaction4.gasless = wallettransaction3.gasless;
                                                                }
                                                                i2 = 0;
                                                                wallettransaction4.pending = false;
                                                                wallettransaction4.failed = false;
                                                                wallettransaction4.phase = wallettransaction3.phase;
                                                                arrayList.remove(wallettransaction4);
                                                                g35 g35Var = (g35) cVar.u.remove(wallettransaction4);
                                                                if (g35Var != null) {
                                                                    g35Var.c();
                                                                }
                                                            }
                                                        }
                                                        i2 = 0;
                                                        wallettransaction4 = wallettransaction2;
                                                    }
                                                    if (wallettransaction4 != null) {
                                                        wallettransaction = wallettransaction4;
                                                    }
                                                    hashMap2 = hashMap3;
                                                    TL_wallet.walletTransaction wallettransaction7 = (TL_wallet.walletTransaction) hashMap2.get(str1922);
                                                    if (wallettransaction7 != null) {
                                                        bVar3 = bVar;
                                                        if (bVar3.b(wallettransaction7)) {
                                                            arrayList6 = arrayList2;
                                                        } else {
                                                            arrayList6 = arrayList2;
                                                            wallettransaction7 = b.d(wallettransaction7.id, arrayList6);
                                                        }
                                                        if (wallettransaction7 == null) {
                                                            hashMap2.put(str1922, wallettransaction7);
                                                            if (wallettransaction4 != null) {
                                                                wallettransaction7.gasless = wallettransaction3.gasless;
                                                                wallettransaction7.gaslessMessageBodyHash = wallettransaction3.gaslessMessageBodyHash;
                                                                wallettransaction7.normalMessageBodyHash = wallettransaction3.normalMessageBodyHash;
                                                                TL_wallet.nftItem nftitem2 = wallettransaction3.nft;
                                                                if (nftitem2 != null) {
                                                                    wallettransaction7.nft = nftitem2;
                                                                    wallettransaction7.peer = wallettransaction3.peer;
                                                                    wallettransaction7.amount = wallettransaction3.amount;
                                                                    wallettransaction7.comment = wallettransaction3.comment;
                                                                }
                                                                z2 = true;
                                                            }
                                                            hashMap4 = hashMap;
                                                            if (equals) {
                                                                hashMap4.remove(str1922);
                                                            }
                                                            arrayList2 = arrayList6;
                                                        } else {
                                                            hashMap4 = hashMap;
                                                            if (wallettransaction4 == null) {
                                                                int size4 = arrayList.size();
                                                                int i10 = i2;
                                                                while (i10 < size4) {
                                                                    Object obj3 = arrayList.get(i10);
                                                                    i10++;
                                                                    TL_wallet.walletTransaction wallettransaction8 = (TL_wallet.walletTransaction) obj3;
                                                                    int i11 = size4;
                                                                    if (wallettransaction8.incoming == wallettransaction3.incoming && ((!TextUtils.isEmpty(wallettransaction8.id) && TextUtils.equals(wallettransaction8.id, wallettransaction3.id)) || m0(wallettransaction8.tx_hash, wallettransaction3.tx_hash) || m0(wallettransaction8.messageHash, wallettransaction3.messageHash))) {
                                                                        HashSet hashSet3 = hashSet;
                                                                        hashSet3.remove(str1922);
                                                                        hashMap4.remove(str1922);
                                                                        arrayList2 = arrayList6;
                                                                        hashSet = hashSet3;
                                                                    } else {
                                                                        size4 = i11;
                                                                    }
                                                                }
                                                            }
                                                            HashSet hashSet4 = hashSet;
                                                            if (wallettransaction4 != null) {
                                                                wallettransaction3 = wallettransaction4;
                                                            }
                                                            bVar3.f(wallettransaction3);
                                                            hashMap2.put(str1922, wallettransaction3);
                                                            hashSet4.add(str1922);
                                                            if (equals) {
                                                                hashMap4.remove(str1922);
                                                                str11 = str7;
                                                            } else {
                                                                str11 = str7;
                                                                hashMap4.put(str1922, jSONObject.optString(str11));
                                                            }
                                                            StringBuilder l = c00.l("stream inserted ", str1922);
                                                            String str20 = wallettransaction3.id;
                                                            if (str20 == null || TextUtils.equals(str20, str1922)) {
                                                                str12 = "";
                                                            } else {
                                                                str12 = " as " + wallettransaction3.id;
                                                            }
                                                            l.append(str12);
                                                            P(l.toString());
                                                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction3.peer;
                                                            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                                                                String str21 = walletTransactionPeer.address;
                                                                hashMap = hashMap4;
                                                                str7 = str11;
                                                                arrayList2 = arrayList6;
                                                                hashSet = hashSet4;
                                                                str9 = str18;
                                                                cVar.j0(new nu0((Object) bVar3, wallettransaction3.id, (Object) str21, (Object) walletTransactionPeer.domain, (byte) 7), str21);
                                                            } else {
                                                                arrayList2 = arrayList6;
                                                                hashSet = hashSet4;
                                                                str7 = str11;
                                                                hashMap = hashMap4;
                                                                str9 = str18;
                                                            }
                                                            if (wallettransaction4 == null && t0(wallettransaction3)) {
                                                                a25 a25Var = cVar.I;
                                                                hl.r(a25Var);
                                                                hl.d3(a25Var, 300L);
                                                            }
                                                            wallettransaction6 = wallettransaction;
                                                            z2 = true;
                                                            arrayList10 = arrayList3;
                                                            str18 = str9;
                                                            arrayList8 = arrayList;
                                                            hashMap6 = hashMap2;
                                                            optJSONArray = jSONArray;
                                                            str14 = str8;
                                                            str15 = str7;
                                                            hashSet2 = hashSet;
                                                            hashMap5 = hashMap;
                                                            arrayList7 = arrayList2;
                                                            i6 = 1;
                                                            i8 = i + 1;
                                                        }
                                                        hashMap = hashMap4;
                                                    } else {
                                                        arrayList6 = arrayList2;
                                                        bVar3 = bVar;
                                                    }
                                                    wallettransaction7 = b.d(str1922, arrayList6);
                                                    if (wallettransaction7 == null) {
                                                        int size5 = arrayList6.size();
                                                        int i12 = i2;
                                                        while (true) {
                                                            if (i12 >= size5) {
                                                                wallettransaction7 = wallettransaction2;
                                                                break;
                                                            }
                                                            Object obj4 = arrayList6.get(i12);
                                                            i12++;
                                                            TL_wallet.walletTransaction wallettransaction9 = (TL_wallet.walletTransaction) obj4;
                                                            if (w0(wallettransaction9, wallettransaction3)) {
                                                                wallettransaction7 = wallettransaction9;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    if (wallettransaction7 == null) {
                                                    }
                                                    hashMap = hashMap4;
                                                }
                                            }
                                        } else {
                                            hashMap = hashMap5;
                                        }
                                        String x = cVar.x();
                                        JSONObject optJSONObject6 = optJSONObject4.optJSONObject("in_msg");
                                        arrayList2 = arrayList7;
                                        ArrayList arrayList12 = new ArrayList();
                                        bVar = bVar3;
                                        JSONArray optJSONArray2 = optJSONObject4.optJSONArray("out_msgs");
                                        hashMap3 = hashMap6;
                                        arrayList4 = arrayList8;
                                        str10 = j;
                                        arrayList5 = arrayList10;
                                        if (optJSONArray2 != null) {
                                            int i13 = 0;
                                            i3 = 0;
                                            while (i13 < optJSONArray2.length()) {
                                                try {
                                                    JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i13);
                                                    if (optJSONObject7 != null) {
                                                        if (optJSONObject7.optBoolean("bounced")) {
                                                            i5 = i13;
                                                            i3 = i6;
                                                        } else if (!optJSONObject7.isNull("value") && Long.parseLong(optJSONObject7.getString("value")) > 0) {
                                                            i5 = i13;
                                                            if (!b(optJSONObject7.getString("destination"), x)) {
                                                                arrayList12.add(optJSONObject7);
                                                            }
                                                        }
                                                        i13 = i5 + 1;
                                                    }
                                                    i5 = i13;
                                                    i13 = i5 + 1;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    wallettransaction2 = null;
                                                    n("stream transaction parse failed", e);
                                                    wallettransaction3 = wallettransaction2;
                                                    String str19222 = str10;
                                                    arrayList3 = arrayList5;
                                                    if (wallettransaction3 == null) {
                                                    }
                                                }
                                            }
                                        } else {
                                            i3 = 0;
                                        }
                                        boolean z3 = (i3 != 0 || optJSONObject6 == null || optJSONObject6.isNull("source") || optJSONObject6.isNull("value") || !b(optJSONObject6.getString("destination"), x) || b(optJSONObject6.getString("source"), x) || optJSONObject6.optBoolean("bounced") || Long.parseLong(optJSONObject6.getString("value")) <= 0 || !arrayList12.isEmpty()) ? 0 : i6;
                                        int i14 = (z3 == 0 && i3 == 0 && !optBoolean && arrayList12.size() == (i4 = i6)) ? i4 : 0;
                                        if ((z3 != 0 || i14 != 0) && (i14 == 0 || ((optJSONObject2 = jSONObject3.optJSONObject("action")) != null && optJSONObject2.optBoolean("success") && !optJSONObject2.optBoolean("no_funds") && optJSONObject2.optInt("result_code") == 0))) {
                                            JSONObject jSONObject4 = z3 != 0 ? optJSONObject6 : (JSONObject) arrayList12.get(0);
                                            long parseLong2 = Long.parseLong(jSONObject4.getString("value"));
                                            if (z3 == 0 || parseLong2 >= uc7.s1(cVar.a).k4.x0.f()) {
                                                wallettransaction3 = new TL_wallet.walletTransaction();
                                                String j2 = b.j(optJSONObject4);
                                                wallettransaction3.id = j2;
                                                if (j2 != null) {
                                                    wallettransaction3.tx_hash = optJSONObject4.getString("hash");
                                                    try {
                                                        wallettransaction3.messageHash = jSONObject4.optString("hash", null);
                                                        if (i14 != 0 && optJSONObject6 != null && (optJSONObject = optJSONObject6.optJSONObject("message_content")) != null) {
                                                            if (optJSONObject6.isNull("source")) {
                                                                wallettransaction2 = null;
                                                                try {
                                                                    wallettransaction3.normalMessageBodyHash = optJSONObject.optString("hash", null);
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    n("stream transaction parse failed", e);
                                                                    wallettransaction3 = wallettransaction2;
                                                                    String str192222 = str10;
                                                                    arrayList3 = arrayList5;
                                                                    if (wallettransaction3 == null) {
                                                                    }
                                                                }
                                                            } else {
                                                                wallettransaction3.gaslessMessageBodyHash = optJSONObject.optString("hash", null);
                                                            }
                                                        }
                                                        wallettransaction3.incoming = z3;
                                                        if (z3 == 0) {
                                                            parseLong2 = -parseLong2;
                                                        }
                                                        wallettransaction3.amount = parseLong2;
                                                        wallettransaction3.date = optJSONObject4.getInt("now");
                                                        wallettransaction3.fee = Long.parseLong(optJSONObject4.getString("total_fees"));
                                                        wallettransaction3.feeUnknown = false;
                                                        wallettransaction3.failed = false;
                                                        wallettransaction3.pending = false;
                                                        wallettransaction3.phase = WalletEngine2.SendPhase.CONFIRMED;
                                                        wallettransaction3.comment_encrypted = WalletEngine2.isEncryptedComment(jSONObject4);
                                                        JSONObject optJSONObject8 = jSONObject4.optJSONObject("message_content");
                                                        String optString6 = optJSONObject8 == null ? null : optJSONObject8.optString("body", null);
                                                        JSONObject optJSONObject9 = optJSONObject8 == null ? null : optJSONObject8.optJSONObject("decoded");
                                                        if (wallettransaction3.comment_encrypted) {
                                                            try {
                                                                wallettransaction3.comment = WalletEngine2.encryptedCommentPayload(optString6);
                                                            } catch (Exception unused2) {
                                                                wallettransaction3.comment_encrypted = false;
                                                            }
                                                        } else if (optJSONObject9 == null || !"text_comment".equals(optJSONObject9.optString(TeXSymbolParser.TYPE_ATTR))) {
                                                            wallettransaction3.comment = WalletEngine2.textCommentFromBody(optString6);
                                                        } else {
                                                            wallettransaction3.comment = optJSONObject9.optString("comment", null);
                                                        }
                                                        String str22 = wallettransaction3.comment;
                                                        if (str22 != null && str22.isEmpty()) {
                                                            wallettransaction3.comment = null;
                                                        }
                                                        string = z3 != 0 ? optJSONObject6.getString("source") : jSONObject4.getString("destination");
                                                        JSONObject optJSONObject10 = jSONObject.optJSONObject("address_book");
                                                        if (optJSONObject10 != null && string != null) {
                                                            Iterator<String> keys = optJSONObject10.keys();
                                                            while (keys.hasNext()) {
                                                                String next = keys.next();
                                                                if (b(next, string)) {
                                                                    jSONObject2 = optJSONObject10.optJSONObject(next);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        jSONObject2 = null;
                                                        wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                                        wallettransactionpeeraddress.address = jSONObject2 == null ? f0(string, false) : jSONObject2.optString("user_friendly", string);
                                                        if (jSONObject2 == null || jSONObject2.isNull("domain")) {
                                                            wallettransaction2 = null;
                                                            str13 = null;
                                                        } else {
                                                            wallettransaction2 = null;
                                                            str13 = jSONObject2.optString("domain", null);
                                                        }
                                                        wallettransactionpeeraddress.domain = str13;
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        wallettransaction2 = null;
                                                    }
                                                    if (b(wallettransactionpeeraddress.address, string)) {
                                                        wallettransaction3.peer = wallettransactionpeeraddress;
                                                        String str1922222 = str10;
                                                        arrayList3 = arrayList5;
                                                        if (wallettransaction3 == null) {
                                                        }
                                                    }
                                                    wallettransaction3 = wallettransaction2;
                                                    String str19222222 = str10;
                                                    arrayList3 = arrayList5;
                                                    if (wallettransaction3 == null) {
                                                    }
                                                }
                                            }
                                        }
                                        wallettransaction3 = null;
                                        wallettransaction2 = null;
                                        String str192222222 = str10;
                                        arrayList3 = arrayList5;
                                        if (wallettransaction3 == null) {
                                        }
                                    }
                                }
                                hashMap3 = hashMap6;
                                str10 = j;
                                arrayList4 = arrayList8;
                                hashMap = hashMap5;
                                arrayList5 = arrayList10;
                                bVar = bVar3;
                                arrayList2 = arrayList7;
                                hashSet = hashSet2;
                                wallettransaction3 = null;
                                wallettransaction2 = null;
                                String str1922222222 = str10;
                                arrayList3 = arrayList5;
                                if (wallettransaction3 == null) {
                                }
                            }
                            str9 = str18;
                            wallettransaction6 = wallettransaction;
                            arrayList10 = arrayList3;
                            str18 = str9;
                            arrayList8 = arrayList;
                            hashMap6 = hashMap2;
                            optJSONArray = jSONArray;
                            str14 = str8;
                            str15 = str7;
                            hashSet2 = hashSet;
                            hashMap5 = hashMap;
                            arrayList7 = arrayList2;
                            i6 = 1;
                            i8 = i + 1;
                        }
                    } else {
                        str7 = str15;
                        str8 = str14;
                        jSONArray = optJSONArray;
                    }
                    i = i8;
                    arrayList = arrayList8;
                    hashMap = hashMap5;
                    wallettransaction = wallettransaction6;
                    arrayList2 = arrayList7;
                    hashSet = hashSet2;
                    str9 = str18;
                    hashMap2 = hashMap6;
                    arrayList3 = arrayList10;
                    wallettransaction6 = wallettransaction;
                    arrayList10 = arrayList3;
                    str18 = str9;
                    arrayList8 = arrayList;
                    hashMap6 = hashMap2;
                    optJSONArray = jSONArray;
                    str14 = str8;
                    str15 = str7;
                    hashSet2 = hashSet;
                    hashMap5 = hashMap;
                    arrayList7 = arrayList2;
                    i6 = 1;
                    i8 = i + 1;
                }
                HashMap hashMap7 = hashMap6;
                ArrayList arrayList13 = arrayList10;
                TL_wallet.walletTransaction wallettransaction10 = wallettransaction6;
                str3 = str18;
                if (wallettransaction10 != null) {
                    int size6 = arrayList13.size();
                    int i15 = 0;
                    while (i15 < size6) {
                        Object obj5 = arrayList13.get(i15);
                        i15++;
                        String str23 = (String) obj5;
                        TL_wallet.walletTransaction wallettransaction11 = wallettransaction10;
                        if (!hashMap7.containsKey(str23)) {
                            hashMap7.put(str23, wallettransaction11);
                        }
                        wallettransaction10 = wallettransaction11;
                    }
                }
                if (z2) {
                    bVar3.k();
                    bVar3.i();
                }
                str4 = optString3;
                str5 = str6;
            }
            str6 = "confirmed";
            str2 = "finalized";
            str3 = "trace_invalidated";
            str4 = optString3;
            str5 = str6;
        } else {
            str = optString2;
            str2 = "finalized";
            str3 = "trace_invalidated";
            str4 = optString3;
            str5 = "confirmed";
        }
        if (str5.equals(str4) || str2.equals(str4) || str3.equals(str)) {
            a25 a25Var2 = this.H;
            hl.r(a25Var2);
            hl.d3(a25Var2, 250L);
        }
    }

    public final void V() {
        byte[] bArr;
        String str;
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            str = tL_walletState.address;
            bArr = tL_walletState.public_key;
        } else {
            bArr = null;
            str = null;
        }
        k35 k35Var = this.c;
        if (k35Var != null && !TextUtils.equals(k35Var.c, str)) {
            if (str == null) {
                P("received empty state, leaving wallet storage of " + this.c.c);
            } else {
                StringBuilder p = ik8.p("received new state of ", str, ", leaving wallet storage of ");
                p.append(this.c.c);
                P(p.toString());
            }
            this.c = null;
        }
        if (!TextUtils.isEmpty(str) && this.c == null) {
            P("setting up wallet storage of " + str);
            this.c = new k35(this.a, org.telegram.messenger.a.b, str);
            P("storage public keys = " + this.c.n().length);
        }
        x25 x25Var = this.o;
        if (x25Var != null && !TextUtils.equals(x25Var.e, str)) {
            x25Var.e = str;
            x25Var.b();
        }
        if (this.b != null && !TextUtils.equals(this.d, str)) {
            this.b.close();
            this.b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.b == null || !TextUtils.equals(this.d, str))) {
            if (this.b != null) {
                P("closing wallet-engine of " + this.d);
                this.b.close();
                this.b = null;
            }
            P("creating wallet-engine for " + str);
            try {
                int i = this.a;
                this.d = str;
                this.b = new WalletEngine2(i, str, bArr);
            } catch (Exception e) {
                n("failed to create engine!", e);
                this.d = null;
            }
        }
        int i2 = 0;
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null) {
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                Runnable runnable = (Runnable) ((WeakReference) obj).get();
                if (runnable != null) {
                    hl.c3(runnable);
                }
            }
            this.w.clear();
        }
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null && this.f != null) {
            ArrayList arrayList2 = this.x;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    hl.c3(runnable2);
                }
            }
            this.x.clear();
        }
        if (!TextUtils.equals(this.L, str)) {
            g0();
        }
        a0();
    }

    public final void W(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (TextUtils.isEmpty(str) || u0(str) == null) {
            return;
        }
        ArrayList arrayList = this.p;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
            String str2 = wallettransaction.messageHash;
            String str3 = tL_updateSentWalletTransaction.msg_hash;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && m0(str2, str3)) {
                d(wallettransaction, tL_updateSentWalletTransaction);
                return;
            }
        }
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            wallettransaction2.messageHash = tL_updateSentWalletTransaction.msg_hash;
            wallettransaction2.gasless = tL_updateSentWalletTransaction.gasless;
            wallettransaction2.pending = false;
            arrayList.add(0, wallettransaction2);
            G().k();
            G().i();
        }
    }

    public final void X(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f = tL_updateWalletGaslessInfo;
        V();
        T();
    }

    public final void Y(TL_update.TL_updateWalletState tL_updateWalletState) {
        z0(tL_updateWalletState.state);
    }

    public final void Z() {
        r0();
        this.p.clear();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c35 c35Var = ((a) obj).b;
            if (c35Var != null) {
                c35Var.close();
            }
        }
        arrayList.clear();
        b bVar = this.n;
        if (bVar != null) {
            bVar.a();
            bVar.b.clear();
            bVar.d.clear();
            bVar.e.clear();
            bVar.f.clear();
            bVar.g = "";
            bVar.h = false;
            bVar.k();
            this.n.k();
            this.n.i();
        }
        a0();
        this.f = null;
        h0();
    }

    public final void a0() {
        if (!TextUtils.equals(this.v, x())) {
            r0();
            this.v = x();
        }
        if (!M() || TextUtils.isEmpty(x())) {
            r0();
        } else {
            HashMap hashMap = this.u;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((g35) hashMap.get(wallettransaction)).b, wallettransaction.messageHash)) {
                    ((g35) hashMap.remove(wallettransaction)).c();
                }
            }
            ArrayList arrayList2 = this.p;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    String x = x();
                    g35 g35Var = new g35(this.a, str, x, new c25(this, wallettransaction2), new c25(this, wallettransaction2));
                    hashMap.put(wallettransaction2, g35Var);
                    if (!g35Var.f && !TextUtils.isEmpty(str)) {
                        g35Var.f = true;
                        g35Var.h = 0;
                        g35Var.b();
                        if (!TextUtils.isEmpty(x)) {
                            hl.d3(g35Var.m, 8000L);
                        }
                    }
                }
            }
        }
        boolean z = (!M() || TextUtils.isEmpty(x()) || this.G.isEmpty()) ? false : true;
        t35 t35Var = this.t;
        boolean z2 = t35Var != null && t35Var.d;
        if (z2 == z && (!z2 || t35Var == null || TextUtils.equals(t35Var.b, x()))) {
            return;
        }
        t35 t35Var2 = this.t;
        if (!z) {
            if (t35Var2 != null) {
                t35Var2.h();
            }
            hl.r(this.H);
            return;
        }
        if (t35Var2 != null && !TextUtils.equals(t35Var2.b, x())) {
            this.t.h();
            this.t = null;
        }
        t35 t35Var3 = this.t;
        if (t35Var3 == null) {
            t35Var3 = new t35(this.a, x(), this);
            this.t = t35Var3;
        }
        boolean z3 = t35Var3.d;
        if (z3) {
            return;
        }
        String str2 = t35Var3.b;
        if (z3 || TextUtils.isEmpty(str2)) {
            t35Var3.d("start ignored: running=" + t35Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
            return;
        }
        t35Var3.d("starting; address=" + str2);
        t35Var3.d = true;
        t35Var3.j = 0;
        t35Var3.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.nftItem nftitem;
        int size;
        x25 x25Var;
        wallettransaction.id = wallettransaction2.id;
        wallettransaction.incoming = wallettransaction2.incoming;
        wallettransaction.gasless = wallettransaction2.gasless;
        wallettransaction.failed = wallettransaction2.failed;
        wallettransaction.key_change = wallettransaction2.key_change;
        wallettransaction.comment_encrypted = wallettransaction2.comment_encrypted;
        boolean z = false;
        wallettransaction.comment_encrypted_preparing = false;
        wallettransaction.amount = wallettransaction2.amount;
        wallettransaction.fee = wallettransaction2.fee;
        wallettransaction.date = wallettransaction2.date;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if ((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift) && !(wallettransaction2.peer instanceof TL_wallet.walletTransactionPeerOnchainGift)) {
            z = true;
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction2.peer;
        if (walletTransactionPeer2 != null && walletTransactionPeer != null && b(walletTransactionPeer.address, walletTransactionPeer2.address)) {
            if (TextUtils.isEmpty(walletTransactionPeer2.domain) || "null".equals(walletTransactionPeer2.domain)) {
                walletTransactionPeer2.domain = walletTransactionPeer.domain;
            }
            if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress) && (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser)) {
                walletTransactionPeer.domain = walletTransactionPeer2.domain;
                wallettransaction.peer = walletTransactionPeer;
                wallettransaction.comment = wallettransaction2.comment;
                wallettransaction.tx_hash = wallettransaction2.tx_hash;
                nftitem = wallettransaction2.nft;
                if (nftitem == null) {
                    wallettransaction.nft = nftitem;
                } else if (z) {
                    wallettransaction.nft = null;
                }
                ArrayList arrayList = this.p;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) arrayList.get(size);
                    if (wallettransaction3 != wallettransaction && !wallettransaction3.pending && !TextUtils.isEmpty(wallettransaction2.id) && TextUtils.equals(wallettransaction3.id, wallettransaction2.id)) {
                        arrayList.remove(size);
                    }
                }
                g(wallettransaction, !wallettransaction2.failed, wallettransaction2.tx_hash);
                if (wallettransaction.nft != null || (x25Var = this.o) == null) {
                }
                x25Var.h(wallettransaction);
                this.o.d();
                return;
            }
        }
        walletTransactionPeer = walletTransactionPeer2;
        wallettransaction.peer = walletTransactionPeer;
        wallettransaction.comment = wallettransaction2.comment;
        wallettransaction.tx_hash = wallettransaction2.tx_hash;
        nftitem = wallettransaction2.nft;
        if (nftitem == null) {
        }
        ArrayList arrayList2 = this.p;
        while (size >= 0) {
        }
        g(wallettransaction, !wallettransaction2.failed, wallettransaction2.tx_hash);
        if (wallettransaction.nft != null) {
        }
    }

    public final TL_wallet.nftItem c0(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
        ArrayList arrayList = A().b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            if ((nftitem.gift instanceof TL_stars.TL_starGiftUnique) && b(nftitem.address, tL_starGiftUnique.gift_address)) {
                return nftitem;
            }
        }
        TL_wallet.nftItem nftitem2 = new TL_wallet.nftItem();
        String str = tL_starGiftUnique.gift_address;
        if (str == null) {
            str = "";
        }
        nftitem2.address = str;
        nftitem2.owner_address = "";
        nftitem2.index = "";
        nftitem2.name = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
        nftitem2.gift = tL_starGiftUnique;
        return nftitem2;
    }

    public final void d(TL_wallet.walletTransaction wallettransaction, TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        wallettransaction.messageHash = tL_updateSentWalletTransaction.msg_hash;
        wallettransaction.gasless = tL_updateSentWalletTransaction.gasless;
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            c(wallettransaction, wallettransaction2);
        } else {
            a0();
        }
    }

    public final boolean e() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled) {
            return true;
        }
        k35 k35Var = this.c;
        return k35Var != null && k35Var.f(tL_walletState.public_key);
    }

    public final void e0(c35 c35Var, boolean z, icc iccVar) {
        c35 b = c35Var.b();
        P("requesting proof challenge");
        ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getProofChallenge(), new ic((byte) 0), new o25(this, b, iccVar, z, (byte) 0));
    }

    public final boolean f() {
        k35 k35Var;
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        return !tL_walletState.backup_enabled && ((k35Var = this.c) == null || !k35Var.f(tL_walletState.public_key));
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, boolean z, String str) {
        a aVar;
        if (wallettransaction.pending) {
            b G = G();
            wallettransaction.failed = !z;
            int i = 0;
            wallettransaction.pending = false;
            if (!TextUtils.isEmpty(str)) {
                wallettransaction.tx_hash = str;
            }
            if (wallettransaction.key_change) {
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                while (true) {
                    if (i >= size) {
                        aVar = null;
                        break;
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    aVar = (a) obj;
                    if (TextUtils.equals(aVar.a, wallettransaction.messageHash)) {
                        break;
                    }
                }
                if (aVar != null) {
                    if (z) {
                        aVar.a();
                    } else {
                        c35 c35Var = aVar.b;
                        if (c35Var != null) {
                            c35Var.close();
                        }
                    }
                    arrayList.remove(aVar);
                }
            }
            pcc pccVar = (pcc) this.q.remove(wallettransaction);
            if (pccVar != null) {
                pccVar.a(Boolean.valueOf(z));
            }
            P("completed pending transaction: msg_hash=" + wallettransaction.messageHash + ", body_hash=" + wallettransaction.gaslessMessageBodyHash + ", transaction_id=" + wallettransaction.id + ", tx_hash=" + wallettransaction.tx_hash + ", success=" + z);
            G.k();
            G.i();
            a0();
        }
    }

    public final void g0() {
        int i;
        this.L = x();
        ArrayList o = k35.o(org.telegram.messenger.a.b, yac.h(this.a).e());
        o.remove(this.L);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            b35 b35Var = (b35) obj;
            hashMap.put(b35Var.a, b35Var);
        }
        this.J.clear();
        int size2 = o.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = o.get(i3);
            i3++;
            String str = (String) obj2;
            b35 b35Var2 = (b35) hashMap.get(str);
            if (b35Var2 == null) {
                b35Var2 = new b35(new k35(this.a, org.telegram.messenger.a.b, str));
            }
            k35 k35Var = b35Var2.f;
            synchronized (k35.g) {
                try {
                    i = k35Var.s().a;
                } catch (Exception e) {
                    k35Var.m(e);
                    i = 0;
                }
            }
            b35Var2.b = i;
            this.J.add(b35Var2);
            y(str, null);
            y0((v25) this.Q.get(str));
        }
        Collections.sort(this.J, new f03((byte) 21));
    }

    public final void h0() {
        P("requesting gasless info");
        this.D = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new ic((byte) 0), new b25(this, (byte) 2));
    }

    public final void i0() {
        P("requesting state");
        this.C = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getState(), new ic((byte) 0), new b25(this, (byte) 1));
    }

    public final Runnable j(TL_stars.starGiftDepositPayload stargiftdepositpayload, icc iccVar) {
        try {
            boolean[] zArr = new boolean[1];
            A0(new i25(this, zArr, iccVar, i(stargiftdepositpayload), (byte) 1));
            return new om1(zArr, (byte) 4);
        } catch (Exception e) {
            n("emulateDepositNFT: invalid payload", e);
            hl.c3(new h25(iccVar, e, (byte) 1));
            return new kc((byte) 10);
        }
    }

    public final void j0(icc iccVar, String str) {
        if (str == null) {
            iccVar.a(null, null);
            return;
        }
        HashMap hashMap = this.P;
        if (hashMap.containsKey(str)) {
            iccVar.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.a).sendRequestTyped(getuseraddresses, new ic((byte) 0), new p((Object) this, (Object) str, (Object) iccVar, (byte) 12));
    }

    public final Runnable k(a35 a35Var, icc iccVar) {
        try {
            boolean[] zArr = new boolean[1];
            A0(new i25(this, zArr, iccVar, d0(a35Var), (byte) 0));
            return new om1(zArr, (byte) 3);
        } catch (Exception e) {
            n("emulatePreparedMessage: invalid message", e);
            hl.c3(new h25(iccVar, e, (byte) 0));
            return new kc((byte) 10);
        }
    }

    public final void k0(TLRPC.User user, icc iccVar) {
        if (user == null) {
            iccVar.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.id);
        HashMap hashMap = this.O;
        if (hashMap.containsKey(valueOf)) {
            iccVar.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.id;
        int i = this.a;
        arrayList.add(uc7.s1(i).q1(user));
        ConnectionsManager.getInstance(i).sendRequestTyped(getuseraddresses, new ic((byte) 0), new p((Object) this, (Object) iccVar, (Object) user, (byte) 13));
    }

    public final rj4 l(String str, long j, String str2, byte[] bArr, icc iccVar) {
        s25 s25Var = new s25(this, str, j, str2, bArr, iccVar);
        A0(s25Var);
        return new rj4(s25Var, (byte) 20);
    }

    public final void l0(pcc pccVar, String str) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z = rv0.R0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i = this.a;
        ConnectionsManager.getInstance(i).sendRequestTyped(performapirequest, new ic((byte) 0), new qe2(this, str, pccVar), uc7.s1(i).r3, 0);
    }

    public final void n0(TLRPC.User user, String str, long j, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, pcc pccVar, pcc pccVar2) {
        o0(user, str, j, str2, bArr, nftitem, str3, pccVar, pccVar2, null, null, null);
    }

    public final void o0(TLRPC.User user, String str, long j, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, pcc pccVar, pcc pccVar2, z45 z45Var, z45 z45Var2, a35 a35Var) {
        String x = x();
        P("send to " + str + ", amount " + j + ", when ready...");
        A0(new d25(this, str, pccVar, nftitem, x, str2, bArr, j, a35Var, z45Var, user, str3, pccVar2, z45Var2, (byte) 0));
    }

    public final void p0(a35 a35Var, pcc pccVar, pcc pccVar2, Runnable runnable) {
        z45 d0;
        try {
            z45 d02 = d0(a35Var);
            String str = ((y45) d02.b.get(0)).a;
            a35 a35Var2 = a35Var.f;
            if (a35Var2 != null) {
                try {
                    d0 = d0(a35Var2);
                } catch (Exception e) {
                    n("sendPreparedMessage: invalid gasless message, sending the normal one", e);
                }
                o0(null, str, a35Var.b, null, null, null, null, pccVar, new gt(this, pccVar2, runnable, (byte) 19), d02, d0, a35Var);
            }
            d0 = null;
            o0(null, str, a35Var.b, null, null, null, null, pccVar, new gt(this, pccVar2, runnable, (byte) 19), d02, d0, a35Var);
        } catch (Exception e2) {
            n("sendPreparedMessage: invalid message", e2);
            pccVar.a(e2.getMessage() == null ? "NULL_ERROR" : e2.getMessage());
        }
    }

    public final CharSequence q(long j, boolean z) {
        RoundingMode roundingMode;
        BigDecimal scale;
        int i;
        String g = this.h.g();
        TL_wallet.currencyRate j2 = this.h.j();
        if (j2 != null) {
            String str = j2.symbol;
            String str2 = j2.thousandsSeparator;
            String str3 = j2.decimalSeparator;
            boolean z2 = j2.symbolLeft;
            boolean z3 = j2.spaceBetween;
            boolean z4 = j2.dropZeros;
            int i2 = j2.exp;
            double d = j2.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d2 = d * uc7.s1(this.a).k4.k.i;
                int max = Math.max(0, Math.min(i2, 20));
                BigDecimal movePointLeft = BigDecimal.valueOf(j).multiply(BigDecimal.valueOf(d2)).movePointLeft(9);
                if (!z || movePointLeft.signum() == 0) {
                    roundingMode = RoundingMode.HALF_UP;
                    scale = movePointLeft.setScale(max, roundingMode);
                    i = max;
                } else {
                    roundingMode = RoundingMode.HALF_UP;
                    BigDecimal round = movePointLeft.round(new MathContext(3, roundingMode));
                    scale = round.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : round.stripTrailingZeros();
                    i = Math.max(max, Math.min(20, Math.max(0, scale.scale())));
                }
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z5 = !isEmpty;
                if (!isEmpty) {
                    decimalFormatSymbols.setGroupingSeparator(str2.charAt(0));
                }
                decimalFormatSymbols.setDecimalSeparator(TextUtils.isEmpty(str3) ? '.' : str3.charAt(0));
                DecimalFormat decimalFormat = new DecimalFormat("#,##0", decimalFormatSymbols);
                decimalFormat.setGroupingUsed(z5);
                if (z4) {
                    max = 0;
                }
                decimalFormat.setMinimumFractionDigits(max);
                decimalFormat.setMaximumFractionDigits(i);
                decimalFormat.setRoundingMode(roundingMode);
                boolean z6 = scale.signum() < 0;
                String format = decimalFormat.format(scale.abs());
                if (!TextUtils.isEmpty(str)) {
                    g = str;
                }
                String str4 = z3 ? " " : "";
                String p = z2 ? qd4.p(g, str4, format) : qd4.p(format, str4, g);
                if (z6) {
                    p = "-".concat(p);
                }
                int indexOf = p.indexOf(8387);
                if (indexOf < 0) {
                    return p;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p);
                spannableStringBuilder.setSpan(new y7c(hl.n1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                return spannableStringBuilder;
            }
        }
        return "";
    }

    public final void r0() {
        HashMap hashMap = this.u;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((g35) it.next()).c();
        }
        hashMap.clear();
    }

    public final void s0(ArrayList arrayList) {
        TL_stars.StarGift starGift;
        if (arrayList.isEmpty()) {
            return;
        }
        O();
        if (this.S.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList.get(i);
            if (wallettransaction != null && !wallettransaction.incoming && !TextUtils.isEmpty(wallettransaction.comment) && (wallettransaction.peer instanceof TL_wallet.walletTransactionPeerAddress) && (starGift = (TL_stars.StarGift) this.S.get(wallettransaction.comment)) != null) {
                TL_wallet.walletTransactionPeerOnchainGift wallettransactionpeeronchaingift = new TL_wallet.walletTransactionPeerOnchainGift();
                wallettransactionpeeronchaingift.action = new TL_wallet.walletOnchainGiftActionBuy();
                wallettransaction.peer = wallettransactionpeeronchaingift;
                wallettransaction.nft = c0(starGift);
                wallettransaction.amount = -Math.abs(wallettransaction.amount);
            }
        }
    }

    public final String x() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).address;
        }
        return null;
    }

    public final v25 y(final String str, ku0 ku0Var) {
        HashMap hashMap = this.Q;
        v25 v25Var = (v25) hashMap.get(str);
        int i = this.a;
        if (v25Var != null) {
            boolean z = v25Var.e;
            if (!z) {
                if (ku0Var != null) {
                    v25Var.f.add(ku0Var);
                }
                return null;
            }
            if (z && ConnectionsManager.getInstance(i).getCurrentTime() < v25Var.d + jn7.W4) {
                if (ku0Var != null) {
                    ku0Var.a(v25Var);
                }
                return v25Var;
            }
        }
        final v25 v25Var2 = new v25();
        v25Var2.b = -1L;
        ArrayList arrayList = new ArrayList();
        v25Var2.f = arrayList;
        v25Var2.a = str;
        v25Var2.d = ConnectionsManager.getInstance(i).getCurrentTime();
        if (ku0Var != null) {
            arrayList.add(ku0Var);
        }
        hashMap.put(str, v25Var2);
        final byte b = 0;
        final byte b2 = 1;
        Utilities.B(new re4((Object) this, (Object) str, (Object) v25Var2, (byte) 12), new pcc(this) { // from class: e25
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // pcc
            public final void a(Object obj) {
                switch (b) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/walletInformation";
                        StringBuilder sb = new StringBuilder("address=");
                        String str2 = str;
                        sb.append(Uri.encode(str2));
                        sb.append("&use_v2=false");
                        performapirequest.query = sb.toString();
                        c cVar = this.b;
                        int i2 = cVar.a;
                        ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new ic((byte) 0), new nu0((Object) cVar, (Object) v25Var2, (Object) str2, (Object) runnable, (byte) 2), uc7.s1(i2).r3, 0);
                        break;
                    default:
                        c cVar2 = this.b;
                        v25 v25Var3 = v25Var2;
                        String str3 = str;
                        cVar2.l0(new ku0((Object) cVar2, (Object) v25Var3, (Object) str3, obj, (byte) 12), str3);
                        break;
                }
            }
        }, new pcc(this) { // from class: e25
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // pcc
            public final void a(Object obj) {
                switch (b2) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/walletInformation";
                        StringBuilder sb = new StringBuilder("address=");
                        String str2 = str;
                        sb.append(Uri.encode(str2));
                        sb.append("&use_v2=false");
                        performapirequest.query = sb.toString();
                        c cVar = this.b;
                        int i2 = cVar.a;
                        ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new ic((byte) 0), new nu0((Object) cVar, (Object) v25Var2, (Object) str2, (Object) runnable, (byte) 2), uc7.s1(i2).r3, 0);
                        break;
                    default:
                        c cVar2 = this.b;
                        v25 v25Var3 = v25Var2;
                        String str3 = str;
                        cVar2.l0(new ku0((Object) cVar2, (Object) v25Var3, (Object) str3, obj, (byte) 12), str3);
                        break;
                }
            }
        });
        return null;
    }

    public final void y0(v25 v25Var) {
        if (v25Var != null) {
            ArrayList arrayList = this.J;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                b35 b35Var = (b35) obj;
                if (TextUtils.equals(b35Var.a, v25Var.a)) {
                    b35Var.c = v25Var.b;
                    b35Var.d = !v25Var.e;
                    byte[] bArr = v25Var.c;
                    b35Var.e = (bArr == null || bArr.length <= 0 || b35Var.f.f(bArr)) ? false : true;
                }
            }
        }
    }

    public final long z() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).balance;
        }
        return 0L;
    }

    public final void z0(TL_wallet.WalletState walletState) {
        boolean z;
        b bVar;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z = true;
                    this.e = walletState;
                    V();
                    T();
                    if (z || (bVar = this.n) == null) {
                    }
                    bVar.g();
                    return;
                }
            }
            z = false;
            this.e = walletState;
            V();
            T();
            if (z) {
            }
        }
    }
}
