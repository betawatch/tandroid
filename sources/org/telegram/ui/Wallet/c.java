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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class c {
    public static volatile c[] R = new c[4];
    public static final long[] S = {1500, 2500, 4000, 6000, 10000, 15000, 20000};
    public static final LruCache T = new LruCache(TLObject.FLAG_12);
    public static DecimalFormat U;
    public int A;
    public final wz4 B;
    public int E;
    public final wz4 H;
    public final wz4 I;
    public final ArrayList J;
    public final List K;
    public String L;
    public final wz4 M;
    public final HashMap N;
    public final HashMap O;
    public final HashMap P;
    public final HashMap Q;
    public final int a;
    public WalletEngine2 b;
    public g15 c;
    public String d;
    public TL_wallet.WalletState e;
    public TL_update.TL_updateWalletGaslessInfo f;
    public final w25 g;
    public final a43 h;
    public Boolean i;
    public String j;
    public long k;
    public boolean l;
    public boolean m;
    public b n;
    public t05 o;
    public p15 t;
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

    /* JADX WARN: Type inference failed for: r0v7, types: [wz4] */
    /* JADX WARN: Type inference failed for: r2v1, types: [wz4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [wz4] */
    /* JADX WARN: Type inference failed for: r2v5, types: [wz4] */
    public c(int i) {
        final byte b = 1;
        this.B = new Runnable(this) { // from class: wz4
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t05 t05Var;
                byte b2 = b;
                int i2 = 0;
                c cVar = this.b;
                switch (b2) {
                    case 0:
                        cVar.e0();
                        cVar.S();
                        break;
                    case 1:
                        if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (t05Var = cVar.o) != null && cVar.n != null) {
                            ArrayList arrayList = t05Var.b;
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
                        long[] jArr = c.S;
                        if (i4 < 7) {
                            wz4 wz4Var = cVar.B;
                            cVar.A = i4 + 1;
                            gl.d3(wz4Var, jArr[i4]);
                            break;
                        }
                        break;
                    case 2:
                        p15 p15Var = cVar.t;
                        if (p15Var != null && p15Var.d) {
                            cVar.J();
                            break;
                        }
                        break;
                    default:
                        int i5 = cVar.a;
                        t05 t05Var2 = cVar.o;
                        if (t05Var2 != null) {
                            t05Var2.d();
                        }
                        gta.v(i5, false).M(y6c.h(i5).e());
                        break;
                }
            }
        };
        this.E = -1;
        final byte b2 = 0;
        final byte b3 = 2;
        this.H = new Runnable(this) { // from class: wz4
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t05 t05Var;
                byte b22 = b3;
                int i2 = 0;
                c cVar = this.b;
                switch (b22) {
                    case 0:
                        cVar.e0();
                        cVar.S();
                        break;
                    case 1:
                        if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (t05Var = cVar.o) != null && cVar.n != null) {
                            ArrayList arrayList = t05Var.b;
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
                        long[] jArr = c.S;
                        if (i4 < 7) {
                            wz4 wz4Var = cVar.B;
                            cVar.A = i4 + 1;
                            gl.d3(wz4Var, jArr[i4]);
                            break;
                        }
                        break;
                    case 2:
                        p15 p15Var = cVar.t;
                        if (p15Var != null && p15Var.d) {
                            cVar.J();
                            break;
                        }
                        break;
                    default:
                        int i5 = cVar.a;
                        t05 t05Var2 = cVar.o;
                        if (t05Var2 != null) {
                            t05Var2.d();
                        }
                        gta.v(i5, false).M(y6c.h(i5).e());
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.I = new Runnable(this) { // from class: wz4
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t05 t05Var;
                byte b22 = b4;
                int i2 = 0;
                c cVar = this.b;
                switch (b22) {
                    case 0:
                        cVar.e0();
                        cVar.S();
                        break;
                    case 1:
                        if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (t05Var = cVar.o) != null && cVar.n != null) {
                            ArrayList arrayList = t05Var.b;
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
                        long[] jArr = c.S;
                        if (i4 < 7) {
                            wz4 wz4Var = cVar.B;
                            cVar.A = i4 + 1;
                            gl.d3(wz4Var, jArr[i4]);
                            break;
                        }
                        break;
                    case 2:
                        p15 p15Var = cVar.t;
                        if (p15Var != null && p15Var.d) {
                            cVar.J();
                            break;
                        }
                        break;
                    default:
                        int i5 = cVar.a;
                        t05 t05Var2 = cVar.o;
                        if (t05Var2 != null) {
                            t05Var2.d();
                        }
                        gta.v(i5, false).M(y6c.h(i5).e());
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = DesugarCollections.unmodifiableList(arrayList);
        this.M = new Runnable(this) { // from class: wz4
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t05 t05Var;
                byte b22 = b2;
                int i2 = 0;
                c cVar = this.b;
                switch (b22) {
                    case 0:
                        cVar.e0();
                        cVar.S();
                        break;
                    case 1:
                        if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (t05Var = cVar.o) != null && cVar.n != null) {
                            ArrayList arrayList2 = t05Var.b;
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
                        long[] jArr = c.S;
                        if (i4 < 7) {
                            wz4 wz4Var = cVar.B;
                            cVar.A = i4 + 1;
                            gl.d3(wz4Var, jArr[i4]);
                            break;
                        }
                        break;
                    case 2:
                        p15 p15Var = cVar.t;
                        if (p15Var != null && p15Var.d) {
                            cVar.J();
                            break;
                        }
                        break;
                    default:
                        int i5 = cVar.a;
                        t05 t05Var2 = cVar.o;
                        if (t05Var2 != null) {
                            t05Var2.d();
                        }
                        gta.v(i5, false).M(y6c.h(i5).e());
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
        this.h = new a43(this);
        g0();
        f0();
        O("requesting has walt balance");
        this.E = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new hc(b2), new xz4(this, b2));
        this.g = new w25(this);
        wz4 wz4Var = this.M;
        Object obj = g15.g;
        synchronized (g15.class) {
            Iterator it = g15.j.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable = (Runnable) weakReference.get();
                if (runnable == null) {
                    g15.j.remove(weakReference);
                } else if (runnable == wz4Var) {
                    b2 = 1;
                }
            }
            if (wz4Var != null && b2 == 0) {
                g15.j.add(new WeakReference(wz4Var));
            }
        }
        e0();
    }

    public static Context B() {
        org.telegram.ui.ActionBar.d S2 = LaunchActivity.S();
        return (S2 == null || S2.getContext() == null) ? org.telegram.messenger.a.b : S2.getContext();
    }

    public static c C(int i) {
        c cVar;
        c cVar2 = R[i];
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (c.class) {
            cVar = R[i];
            if (cVar == null) {
                c[] cVarArr = R;
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
        ArrayList s0 = s0(wallettransaction);
        int size = s0.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = s0.get(i2);
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

    public static void O(String str) {
        fa4.b("[gram-wallet] ".concat(str));
    }

    public static boolean P(k27 k27Var, TL_wallet.walletTransaction wallettransaction) {
        if (k27Var != null && k27Var.k != null && wallettransaction != null && k27Var.O3()) {
            TLRPC.Message message = k27Var.k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j = wallettransaction.random_id;
                if (j != 0 && message.random_id == j) {
                    return true;
                }
                if (wallettransaction.localMessageId != 0 && k27Var.e1() == wallettransaction.localMessageId) {
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
        String r0 = r0(str);
        if (r0 != null) {
            str2 = c + "x" + r0;
        } else {
            str2 = c + "r" + str;
        }
        arrayList.add(str2);
    }

    public static byte[] a0(byte[] bArr) {
        byte[] bArr2 = new byte[kk7.r3];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z = false;
            int i = 0;
            for (byte b : bArr) {
                if (y05.e(b)) {
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

    public static boolean b(String str, String str2) {
        String u0 = u0(str);
        return u0 != null && u0.equals(u0(str2));
    }

    public static v25 b0(w05 w05Var) {
        JSONArray jSONArray = new JSONArray();
        List<w05> list = w05Var.g;
        if (list == null) {
            list = Collections.singletonList(w05Var);
        }
        for (w05 w05Var2 : list) {
            int i = w05Var2.e;
            byte[] bArr = w05Var2.d;
            String str = w05Var2.a;
            if (i != 3) {
                w26.j("WALLET_UNSUPPORTED_SEND_MODE");
                return null;
            }
            if (str.indexOf(58) >= 0) {
                str = d0(str, bArr == null);
            }
            JSONObject put = new JSONObject().put("address", str).put("amount", Long.toString(w05Var2.b));
            byte[] bArr2 = w05Var2.c;
            if (bArr2 != null && bArr2.length > 0) {
                put.put("payload", Base64.encodeToString(bArr2, 2));
            }
            if (bArr != null && bArr.length > 0) {
                put.put("stateInit", Base64.encodeToString(bArr, 2));
            }
            jSONArray.put(put);
        }
        return new v25(new JSONObject().put("messages", jSONArray));
    }

    public static String d0(String str, boolean z) {
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

    public static v25 i(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        int indexOf = stargiftdepositpayload.nft_address.indexOf(58);
        String str = stargiftdepositpayload.nft_address;
        if (indexOf >= 0) {
            str = d0(str, true);
        }
        return new v25(jSONObject.put("messages", jSONArray.put(jSONObject2.put("address", str).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static boolean k0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            String r0 = r0(str);
            if (r0 != null && r0.equals(r0(str2))) {
                return true;
            }
        }
        return false;
    }

    public static void m(String str) {
        fa4.d("[gram-wallet] ".concat(str));
    }

    public static void n(String str, Throwable th) {
        fa4.e("[gram-wallet] ".concat(str), th);
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

    public static byte[][] o0(byte[] bArr, SecureRandom secureRandom) {
        if (bArr.length != 215) {
            w26.j("INVALID_MNEMONIC_BACKUP_SIZE");
            return null;
        }
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, kk7.r3);
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

    public static SpannableStringBuilder p(String str, CharSequence charSequence, int i) {
        String replace = charSequence.toString().replace((char) 8211, '-');
        String M0 = k96.M0(i, null);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                M0 = k96.J0((int) ((parseLong < -2147483647L || parseLong > 2147483647L) ? Math.abs(parseLong % 100) + 100 : Math.abs(parseLong)), str);
            } catch (NumberFormatException unused) {
            }
        }
        return gl.G2(M0, charSequence, "%1$s");
    }

    public static boolean q0(TL_wallet.walletTransaction wallettransaction) {
        if (wallettransaction.pending) {
            return false;
        }
        return wallettransaction.nft != null || (wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnchainGift);
    }

    public static SpannableStringBuilder r(long j, boolean z) {
        return p("GramCapital", s(j, z), 2131749344);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(5:9|(2:11|(1:16))|29|30|31)|32|33|34|35|(4:37|(1:39)|40|41)|31) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String r0(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LruCache lruCache = T;
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

    public static String s(long j, boolean z) {
        if ((j > -10000000 && j < 10000000) || z) {
            return jva.J0(j);
        }
        DecimalFormat decimalFormat = U;
        if (decimalFormat == null) {
            decimalFormat = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
            U = decimalFormat;
        }
        return decimalFormat.format(j / 1.0E9d);
    }

    public static ArrayList s0(TL_wallet.walletTransaction wallettransaction) {
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

    public static boolean t0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, wallettransaction2.id)) || k0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || k0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            return true;
        }
        if (wallettransaction.incoming || wallettransaction2.incoming) {
            return false;
        }
        return k0(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) || k0(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash);
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

    public static String u0(String str) {
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

    public static SpannableStringBuilder v(long j) {
        return w(j, false);
    }

    public static SpannableStringBuilder w(long j, boolean z) {
        return p("Grams", s(j, z), 2131749315);
    }

    public final t05 A() {
        t05 t05Var = this.o;
        if (t05Var != null) {
            return t05Var;
        }
        t05 t05Var2 = new t05(this);
        this.o = t05Var2;
        return t05Var2;
    }

    public final byte[] D() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).public_key;
        }
        return null;
    }

    public final void E(boolean z, boolean z2, boolean z3, i8c i8cVar) {
        O("getSecretPhrase: whenReady...");
        x0(new ut2(this, i8cVar, z3, z, z2, (byte) 2));
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

    public final void H(boolean z, boolean z2, y05 y05Var, p8c p8cVar) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(y05Var)) {
                p8cVar.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(y05Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(y05Var);
            y05 b = y05Var.b();
            O("import wallet: requesting proof challenge");
            cy7.a(this.a, null, new eu0((Object) this, (Object) b, (Object) p8cVar, (Object) secretPhraseToAnchorPublicKey, (byte) 3), null, null, new ev1(this, p8cVar, secretPhraseToPublicKey, b, (byte) 1), z, z2, new h24(new iu4(b, (byte) 7), (c05) null));
        } catch (Exception unused2) {
            p8cVar.a("INVALID_PHRASE");
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
        g0();
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

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
    
        r4 = r4.c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q() {
        g15 g15Var;
        boolean z;
        if (!(this.e instanceof TL_wallet.TL_walletState) || g15Var == null) {
            return false;
        }
        g15Var.getClass();
        synchronized (g15.g) {
            try {
                z = g15Var.s().b;
            } catch (Exception e) {
                g15Var.m(e);
                z = true;
            }
        }
        return z;
    }

    public final boolean R() {
        return this.m && !gba.r.isEmpty();
    }

    public final void S() {
        kk7.f(this.a).k(kk7.c4, this);
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
    public final void T(JSONObject jSONObject) {
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
        p15 p15Var = this.t;
        if (p15Var == null || !TextUtils.equals(p15Var.b, x())) {
            return;
        }
        String optString2 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
        String str14 = "finality";
        String optString3 = jSONObject.optString("finality");
        O("streaming " + optString2 + ", finality: " + optString3);
        if ("account_state_change".equals(optString2) && "finalized".equals(optString3) && (this.e instanceof TL_wallet.TL_walletState) && (optJSONObject3 = jSONObject.optJSONObject("state")) != null) {
            try {
                long parseLong = Long.parseLong(optJSONObject3.getString("balance"));
                if (parseLong >= 0 && ((TL_wallet.TL_walletState) this.e).balance != parseLong) {
                    O("streaming updates balance to " + parseLong);
                    this.k = System.currentTimeMillis();
                    this.l = true;
                    ((TL_wallet.TL_walletState) this.e).balance = parseLong;
                    U();
                    S();
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
                        if (k0((String) hashMap5.get(str16), optString5)) {
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
                                                            boolean k0 = k0(wallettransaction4.gaslessMessageBodyHash, wallettransaction3.gaslessMessageBodyHash);
                                                            boolean k02 = k0(wallettransaction4.normalMessageBodyHash, wallettransaction3.normalMessageBodyHash);
                                                            if (!wallettransaction4.incoming && (k0 || k02)) {
                                                                wallettransaction3.gasless = k0;
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
                                                                c15 c15Var = (c15) cVar.u.remove(wallettransaction4);
                                                                if (c15Var != null) {
                                                                    c15Var.c();
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
                                                                    if (wallettransaction8.incoming == wallettransaction3.incoming && ((!TextUtils.isEmpty(wallettransaction8.id) && TextUtils.equals(wallettransaction8.id, wallettransaction3.id)) || k0(wallettransaction8.tx_hash, wallettransaction3.tx_hash) || k0(wallettransaction8.messageHash, wallettransaction3.messageHash))) {
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
                                                            StringBuilder k = b00.k("stream inserted ", str1922);
                                                            String str20 = wallettransaction3.id;
                                                            if (str20 == null || TextUtils.equals(str20, str1922)) {
                                                                str12 = "";
                                                            } else {
                                                                str12 = " as " + wallettransaction3.id;
                                                            }
                                                            k.append(str12);
                                                            O(k.toString());
                                                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction3.peer;
                                                            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                                                                String str21 = walletTransactionPeer.address;
                                                                hashMap = hashMap4;
                                                                str7 = str11;
                                                                arrayList2 = arrayList6;
                                                                hashSet = hashSet4;
                                                                str9 = str18;
                                                                cVar.h0(new eu0((Object) bVar3, wallettransaction3.id, (Object) str21, (Object) walletTransactionPeer.domain, (byte) 7), str21);
                                                            } else {
                                                                arrayList2 = arrayList6;
                                                                hashSet = hashSet4;
                                                                str7 = str11;
                                                                hashMap = hashMap4;
                                                                str9 = str18;
                                                            }
                                                            if (wallettransaction4 == null && q0(wallettransaction3)) {
                                                                wz4 wz4Var = cVar.I;
                                                                gl.r(wz4Var);
                                                                gl.d3(wz4Var, 300L);
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
                                                            if (t0(wallettransaction9, wallettransaction3)) {
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
                                            if (z3 == 0 || parseLong2 >= na7.q1(cVar.a).k4.p0.f()) {
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
                                                        wallettransactionpeeraddress.address = jSONObject2 == null ? d0(string, false) : jSONObject2.optString("user_friendly", string);
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
            wz4 wz4Var2 = this.H;
            gl.r(wz4Var2);
            gl.d3(wz4Var2, 250L);
        }
    }

    public final void U() {
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
        g15 g15Var = this.c;
        if (g15Var != null && !TextUtils.equals(g15Var.c, str)) {
            if (str == null) {
                O("received empty state, leaving wallet storage of " + this.c.c);
            } else {
                StringBuilder p = ug8.p("received new state of ", str, ", leaving wallet storage of ");
                p.append(this.c.c);
                O(p.toString());
            }
            this.c = null;
        }
        if (!TextUtils.isEmpty(str) && this.c == null) {
            O("setting up wallet storage of " + str);
            this.c = new g15(this.a, org.telegram.messenger.a.b, str);
            O("storage public keys = " + this.c.n().length);
        }
        t05 t05Var = this.o;
        if (t05Var != null && !TextUtils.equals(t05Var.e, str)) {
            t05Var.e = str;
            t05Var.b();
        }
        if (this.b != null && !TextUtils.equals(this.d, str)) {
            this.b.close();
            this.b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.b == null || !TextUtils.equals(this.d, str))) {
            if (this.b != null) {
                O("closing wallet-engine of " + this.d);
                this.b.close();
                this.b = null;
            }
            O("creating wallet-engine for " + str);
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
                    gl.c3(runnable);
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
                    gl.c3(runnable2);
                }
            }
            this.x.clear();
        }
        if (!TextUtils.equals(this.L, str)) {
            e0();
        }
        Z();
    }

    public final void V(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (TextUtils.isEmpty(str) || r0(str) == null) {
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
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && k0(str2, str3)) {
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

    public final void W(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f = tL_updateWalletGaslessInfo;
        U();
        S();
    }

    public final void X(TL_update.TL_updateWalletState tL_updateWalletState) {
        w0(tL_updateWalletState.state);
    }

    public final void Y() {
        p0();
        this.p.clear();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y05 y05Var = ((a) obj).b;
            if (y05Var != null) {
                y05Var.close();
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
        Z();
        this.f = null;
        f0();
    }

    public final void Z() {
        if (!TextUtils.equals(this.v, x())) {
            p0();
            this.v = x();
        }
        if (!M() || TextUtils.isEmpty(x())) {
            p0();
        } else {
            HashMap hashMap = this.u;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((c15) hashMap.get(wallettransaction)).b, wallettransaction.messageHash)) {
                    ((c15) hashMap.remove(wallettransaction)).c();
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
                    c15 c15Var = new c15(this.a, str, x, new yz4(this, wallettransaction2), new yz4(this, wallettransaction2));
                    hashMap.put(wallettransaction2, c15Var);
                    if (!c15Var.f && !TextUtils.isEmpty(str)) {
                        c15Var.f = true;
                        c15Var.h = 0;
                        c15Var.b();
                        if (!TextUtils.isEmpty(x)) {
                            gl.d3(c15Var.m, 8000L);
                        }
                    }
                }
            }
        }
        boolean z = (!M() || TextUtils.isEmpty(x()) || this.G.isEmpty()) ? false : true;
        p15 p15Var = this.t;
        boolean z2 = p15Var != null && p15Var.d;
        if (z2 == z && (!z2 || p15Var == null || TextUtils.equals(p15Var.b, x()))) {
            return;
        }
        p15 p15Var2 = this.t;
        if (!z) {
            if (p15Var2 != null) {
                p15Var2.h();
            }
            gl.r(this.H);
            return;
        }
        if (p15Var2 != null && !TextUtils.equals(p15Var2.b, x())) {
            this.t.h();
            this.t = null;
        }
        p15 p15Var3 = this.t;
        if (p15Var3 == null) {
            p15Var3 = new p15(this.a, x(), this);
            this.t = p15Var3;
        }
        boolean z3 = p15Var3.d;
        if (z3) {
            return;
        }
        String str2 = p15Var3.b;
        if (z3 || TextUtils.isEmpty(str2)) {
            p15Var3.d("start ignored: running=" + p15Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
            return;
        }
        p15Var3.d("starting; address=" + str2);
        p15Var3.d = true;
        p15Var3.j = 0;
        p15Var3.e();
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
        t05 t05Var;
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
                if (wallettransaction.nft != null || (t05Var = this.o) == null) {
                }
                t05Var.h(wallettransaction);
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

    public final void c0(y05 y05Var, boolean z, i8c i8cVar) {
        y05 b = y05Var.b();
        O("requesting proof challenge");
        ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getProofChallenge(), new hc((byte) 0), new k05(this, b, i8cVar, z, (byte) 0));
    }

    public final void d(TL_wallet.walletTransaction wallettransaction, TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        wallettransaction.messageHash = tL_updateSentWalletTransaction.msg_hash;
        wallettransaction.gasless = tL_updateSentWalletTransaction.gasless;
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            c(wallettransaction, wallettransaction2);
        } else {
            Z();
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
        g15 g15Var = this.c;
        return g15Var != null && g15Var.f(tL_walletState.public_key);
    }

    public final void e0() {
        int i;
        this.L = x();
        ArrayList o = g15.o(org.telegram.messenger.a.b, y6c.h(this.a).e());
        o.remove(this.L);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            x05 x05Var = (x05) obj;
            hashMap.put(x05Var.a, x05Var);
        }
        this.J.clear();
        int size2 = o.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = o.get(i3);
            i3++;
            String str = (String) obj2;
            x05 x05Var2 = (x05) hashMap.get(str);
            if (x05Var2 == null) {
                x05Var2 = new x05(new g15(this.a, org.telegram.messenger.a.b, str));
            }
            g15 g15Var = x05Var2.f;
            synchronized (g15.g) {
                try {
                    i = g15Var.s().a;
                } catch (Exception e) {
                    g15Var.m(e);
                    i = 0;
                }
            }
            x05Var2.b = i;
            this.J.add(x05Var2);
            y(str, null);
            v0((r05) this.Q.get(str));
        }
        Collections.sort(this.J, new mz2((byte) 20));
    }

    public final boolean f() {
        g15 g15Var;
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        return !tL_walletState.backup_enabled && ((g15Var = this.c) == null || !g15Var.f(tL_walletState.public_key));
    }

    public final void f0() {
        O("requesting gasless info");
        this.D = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new hc((byte) 0), new xz4(this, (byte) 2));
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
                        y05 y05Var = aVar.b;
                        if (y05Var != null) {
                            y05Var.close();
                        }
                    }
                    arrayList.remove(aVar);
                }
            }
            p8c p8cVar = (p8c) this.q.remove(wallettransaction);
            if (p8cVar != null) {
                p8cVar.a(Boolean.valueOf(z));
            }
            O("completed pending transaction: msg_hash=" + wallettransaction.messageHash + ", body_hash=" + wallettransaction.gaslessMessageBodyHash + ", transaction_id=" + wallettransaction.id + ", tx_hash=" + wallettransaction.tx_hash + ", success=" + z);
            G.k();
            G.i();
            Z();
        }
    }

    public final void g0() {
        O("requesting state");
        this.C = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getState(), new hc((byte) 0), new xz4(this, (byte) 1));
    }

    public final void h0(i8c i8cVar, String str) {
        if (str == null) {
            i8cVar.a(null, null);
            return;
        }
        HashMap hashMap = this.P;
        if (hashMap.containsKey(str)) {
            i8cVar.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.a).sendRequestTyped(getuseraddresses, new hc((byte) 0), new p((Object) this, (Object) str, (Object) i8cVar, (byte) 12));
    }

    public final void i0(TLRPC.User user, i8c i8cVar) {
        if (user == null) {
            i8cVar.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.id);
        HashMap hashMap = this.O;
        if (hashMap.containsKey(valueOf)) {
            i8cVar.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.id;
        int i = this.a;
        arrayList.add(na7.q1(i).o1(user));
        ConnectionsManager.getInstance(i).sendRequestTyped(getuseraddresses, new hc((byte) 0), new p((Object) this, (Object) i8cVar, (Object) user, (byte) 13));
    }

    public final Runnable j(TL_stars.starGiftDepositPayload stargiftdepositpayload, i8c i8cVar) {
        try {
            boolean[] zArr = new boolean[1];
            x0(new e05(this, zArr, i8cVar, i(stargiftdepositpayload), (byte) 1));
            return new il1(zArr, (byte) 4);
        } catch (Exception e) {
            n("emulateDepositNFT: invalid payload", e);
            gl.c3(new d05(i8cVar, e, (byte) 1));
            return new jc((byte) 10);
        }
    }

    public final void j0(p8c p8cVar, String str) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z = hv0.R0;
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
        ConnectionsManager.getInstance(i).sendRequestTyped(performapirequest, new hc((byte) 0), new ae2(this, str, p8cVar), na7.q1(i).r3, 0);
    }

    public final Runnable k(w05 w05Var, i8c i8cVar) {
        try {
            boolean[] zArr = new boolean[1];
            x0(new e05(this, zArr, i8cVar, b0(w05Var), (byte) 0));
            return new il1(zArr, (byte) 3);
        } catch (Exception e) {
            n("emulatePreparedMessage: invalid message", e);
            gl.c3(new d05(i8cVar, e, (byte) 0));
            return new jc((byte) 10);
        }
    }

    public final iu4 l(String str, long j, String str2, byte[] bArr, i8c i8cVar) {
        o05 o05Var = new o05(this, str, j, str2, bArr, i8cVar);
        x0(o05Var);
        return new iu4(o05Var, (byte) 6);
    }

    public final void l0(TLRPC.User user, String str, long j, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, p8c p8cVar, p8c p8cVar2) {
        m0(user, str, j, str2, bArr, nftitem, str3, p8cVar, p8cVar2, null, null, null);
    }

    public final void m0(TLRPC.User user, String str, long j, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, p8c p8cVar, p8c p8cVar2, v25 v25Var, v25 v25Var2, w05 w05Var) {
        String x = x();
        O("send to " + str + ", amount " + j + ", when ready...");
        x0(new zz4(this, str, p8cVar, nftitem, x, str2, bArr, j, w05Var, v25Var, user, str3, p8cVar2, v25Var2, (byte) 0));
    }

    public final void n0(w05 w05Var, p8c p8cVar, p8c p8cVar2, Runnable runnable) {
        v25 b0;
        try {
            v25 b02 = b0(w05Var);
            String str = ((u25) b02.b.get(0)).a;
            w05 w05Var2 = w05Var.f;
            if (w05Var2 != null) {
                try {
                    b0 = b0(w05Var2);
                } catch (Exception e) {
                    n("sendPreparedMessage: invalid gasless message, sending the normal one", e);
                }
                m0(null, str, w05Var.b, null, null, null, null, p8cVar, new ht(this, p8cVar2, runnable, (byte) 19), b02, b0, w05Var);
            }
            b0 = null;
            m0(null, str, w05Var.b, null, null, null, null, p8cVar, new ht(this, p8cVar2, runnable, (byte) 19), b02, b0, w05Var);
        } catch (Exception e2) {
            n("sendPreparedMessage: invalid message", e2);
            p8cVar.a(e2.getMessage() == null ? "NULL_ERROR" : e2.getMessage());
        }
    }

    public final void p0() {
        HashMap hashMap = this.u;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((c15) it.next()).c();
        }
        hashMap.clear();
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
                double d2 = d * na7.q1(this.a).k4.k.i;
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
                String p = z2 ? tb4.p(g, str4, format) : tb4.p(format, str4, g);
                if (z6) {
                    p = "-".concat(p);
                }
                int indexOf = p.indexOf(8387);
                if (indexOf < 0) {
                    return p;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p);
                spannableStringBuilder.setSpan(new z3c(gl.n1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                return spannableStringBuilder;
            }
        }
        return "";
    }

    public final void v0(r05 r05Var) {
        if (r05Var != null) {
            ArrayList arrayList = this.J;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                x05 x05Var = (x05) obj;
                if (TextUtils.equals(x05Var.a, r05Var.a)) {
                    x05Var.c = r05Var.b;
                    x05Var.d = !r05Var.e;
                    byte[] bArr = r05Var.c;
                    x05Var.e = (bArr == null || bArr.length <= 0 || x05Var.f.f(bArr)) ? false : true;
                }
            }
        }
    }

    public final void w0(TL_wallet.WalletState walletState) {
        boolean z;
        b bVar;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z = true;
                    this.e = walletState;
                    U();
                    S();
                    if (z || (bVar = this.n) == null) {
                    }
                    bVar.g();
                    return;
                }
            }
            z = false;
            this.e = walletState;
            U();
            S();
            if (z) {
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

    public final void x0(Runnable runnable) {
        if (M()) {
            runnable.run();
        } else {
            this.w.add(new WeakReference(runnable));
        }
    }

    public final r05 y(final String str, au0 au0Var) {
        HashMap hashMap = this.Q;
        r05 r05Var = (r05) hashMap.get(str);
        int i = this.a;
        if (r05Var != null) {
            boolean z = r05Var.e;
            if (!z) {
                if (au0Var != null) {
                    r05Var.f.add(au0Var);
                }
                return null;
            }
            if (z && ConnectionsManager.getInstance(i).getCurrentTime() < r05Var.d + kk7.W4) {
                if (au0Var != null) {
                    au0Var.a(r05Var);
                }
                return r05Var;
            }
        }
        final r05 r05Var2 = new r05();
        r05Var2.b = -1L;
        ArrayList arrayList = new ArrayList();
        r05Var2.f = arrayList;
        r05Var2.a = str;
        r05Var2.d = ConnectionsManager.getInstance(i).getCurrentTime();
        if (au0Var != null) {
            arrayList.add(au0Var);
        }
        hashMap.put(str, r05Var2);
        final byte b = 0;
        final byte b2 = 1;
        Utilities.B(new jf4((Object) this, (Object) str, (Object) r05Var2, (byte) 7), new p8c(this) { // from class: a05
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // p8c
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
                        ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new hc((byte) 0), new eu0((Object) cVar, (Object) r05Var2, (Object) str2, (Object) runnable, (byte) 2), na7.q1(i2).r3, 0);
                        break;
                    default:
                        c cVar2 = this.b;
                        r05 r05Var3 = r05Var2;
                        String str3 = str;
                        cVar2.j0(new au0((Object) cVar2, (Object) r05Var3, (Object) str3, obj, (byte) 12), str3);
                        break;
                }
            }
        }, new p8c(this) { // from class: a05
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // p8c
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
                        ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new hc((byte) 0), new eu0((Object) cVar, (Object) r05Var2, (Object) str2, (Object) runnable, (byte) 2), na7.q1(i2).r3, 0);
                        break;
                    default:
                        c cVar2 = this.b;
                        r05 r05Var3 = r05Var2;
                        String str3 = str;
                        cVar2.j0(new au0((Object) cVar2, (Object) r05Var3, (Object) str3, obj, (byte) 12), str3);
                        break;
                }
            }
        });
        return null;
    }

    public final long z() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).balance;
        }
        return 0L;
    }
}
