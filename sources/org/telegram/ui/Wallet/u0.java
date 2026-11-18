package org.telegram.ui.Wallet;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.util.LruCache;
import di.pb;
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
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cd0;
import org.telegram.ui.qw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class u0 {
    public static volatile u0[] R = new u0[4];
    public static final long[] S = {1500, 2500, 4000, 6000, 10000, 15000, 20000};
    public static final LruCache T = new LruCache(TLObject.FLAG_12);
    public static DecimalFormat U;
    public int A;
    public final h B;
    public int E;
    public final h H;
    public final h I;
    public final ArrayList J;
    public final List K;
    public String L;
    public final h M;
    public final HashMap N;
    public final HashMap O;
    public final HashMap P;
    public final HashMap Q;
    public final int a;
    public WalletEngine2 b;
    public z0 c;
    public String d;
    public TL_wallet.WalletState e;
    public TL_update.TL_updateWalletGaslessInfo f;
    public final l2 g;
    public final g h;
    public Boolean i;
    public String j;
    public long k;
    public boolean l;
    public boolean m;
    public t0 n;
    public l0 o;
    public i1 t;
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

    /* JADX WARN: Type inference failed for: r0v7, types: [org.telegram.ui.Wallet.h] */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.telegram.ui.Wallet.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.telegram.ui.Wallet.h] */
    /* JADX WARN: Type inference failed for: r2v5, types: [org.telegram.ui.Wallet.h] */
    public u0(int i7) {
        final int i10 = 1;
        this.B = new Runnable(this) { // from class: org.telegram.ui.Wallet.h
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l0 l0Var;
                switch (i10) {
                    case 0:
                        u0 u0Var = this.b;
                        u0Var.f0();
                        u0Var.T();
                        break;
                    case 1:
                        u0 u0Var2 = this.b;
                        if ((!TextUtils.isEmpty(u0Var2.y) || !TextUtils.isEmpty(u0Var2.z)) && (l0Var = u0Var2.o) != null && u0Var2.n != null) {
                            ArrayList arrayList = l0Var.b;
                            int size = arrayList.size();
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                if (i12 < size) {
                                    Object obj = arrayList.get(i12);
                                    i12++;
                                    if (u0Var2.O((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList2 = u0Var2.n.b;
                                        int size2 = arrayList2.size();
                                        while (i11 < size2) {
                                            Object obj2 = arrayList2.get(i11);
                                            i11++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && u0Var2.O(wallettransaction.nft)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        u0Var2.B().e();
                        u0Var2.H().g();
                        u0Var2.K();
                        int i13 = u0Var2.A;
                        long[] jArr = u0.S;
                        if (i13 < 7) {
                            h hVar = u0Var2.B;
                            u0Var2.A = i13 + 1;
                            org.telegram.messenger.g0.h3(hVar, jArr[i13]);
                            break;
                        }
                        break;
                    case 2:
                        u0 u0Var3 = this.b;
                        i1 i1Var = u0Var3.t;
                        if (i1Var != null && i1Var.d) {
                            u0Var3.K();
                            break;
                        }
                        break;
                    default:
                        u0 u0Var4 = this.b;
                        int i14 = u0Var4.a;
                        l0 l0Var2 = u0Var4.o;
                        if (l0Var2 != null) {
                            l0Var2.e();
                        }
                        di.x8.y(i14, false).O(j10.i(i14).e());
                        break;
                }
            }
        };
        this.E = -1;
        final int i11 = 0;
        final int i12 = 2;
        this.H = new Runnable(this) { // from class: org.telegram.ui.Wallet.h
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l0 l0Var;
                switch (i12) {
                    case 0:
                        u0 u0Var = this.b;
                        u0Var.f0();
                        u0Var.T();
                        break;
                    case 1:
                        u0 u0Var2 = this.b;
                        if ((!TextUtils.isEmpty(u0Var2.y) || !TextUtils.isEmpty(u0Var2.z)) && (l0Var = u0Var2.o) != null && u0Var2.n != null) {
                            ArrayList arrayList = l0Var.b;
                            int size = arrayList.size();
                            int i112 = 0;
                            int i122 = 0;
                            while (true) {
                                if (i122 < size) {
                                    Object obj = arrayList.get(i122);
                                    i122++;
                                    if (u0Var2.O((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList2 = u0Var2.n.b;
                                        int size2 = arrayList2.size();
                                        while (i112 < size2) {
                                            Object obj2 = arrayList2.get(i112);
                                            i112++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && u0Var2.O(wallettransaction.nft)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        u0Var2.B().e();
                        u0Var2.H().g();
                        u0Var2.K();
                        int i13 = u0Var2.A;
                        long[] jArr = u0.S;
                        if (i13 < 7) {
                            h hVar = u0Var2.B;
                            u0Var2.A = i13 + 1;
                            org.telegram.messenger.g0.h3(hVar, jArr[i13]);
                            break;
                        }
                        break;
                    case 2:
                        u0 u0Var3 = this.b;
                        i1 i1Var = u0Var3.t;
                        if (i1Var != null && i1Var.d) {
                            u0Var3.K();
                            break;
                        }
                        break;
                    default:
                        u0 u0Var4 = this.b;
                        int i14 = u0Var4.a;
                        l0 l0Var2 = u0Var4.o;
                        if (l0Var2 != null) {
                            l0Var2.e();
                        }
                        di.x8.y(i14, false).O(j10.i(i14).e());
                        break;
                }
            }
        };
        final int i13 = 3;
        this.I = new Runnable(this) { // from class: org.telegram.ui.Wallet.h
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l0 l0Var;
                switch (i13) {
                    case 0:
                        u0 u0Var = this.b;
                        u0Var.f0();
                        u0Var.T();
                        break;
                    case 1:
                        u0 u0Var2 = this.b;
                        if ((!TextUtils.isEmpty(u0Var2.y) || !TextUtils.isEmpty(u0Var2.z)) && (l0Var = u0Var2.o) != null && u0Var2.n != null) {
                            ArrayList arrayList = l0Var.b;
                            int size = arrayList.size();
                            int i112 = 0;
                            int i122 = 0;
                            while (true) {
                                if (i122 < size) {
                                    Object obj = arrayList.get(i122);
                                    i122++;
                                    if (u0Var2.O((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList2 = u0Var2.n.b;
                                        int size2 = arrayList2.size();
                                        while (i112 < size2) {
                                            Object obj2 = arrayList2.get(i112);
                                            i112++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && u0Var2.O(wallettransaction.nft)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        u0Var2.B().e();
                        u0Var2.H().g();
                        u0Var2.K();
                        int i132 = u0Var2.A;
                        long[] jArr = u0.S;
                        if (i132 < 7) {
                            h hVar = u0Var2.B;
                            u0Var2.A = i132 + 1;
                            org.telegram.messenger.g0.h3(hVar, jArr[i132]);
                            break;
                        }
                        break;
                    case 2:
                        u0 u0Var3 = this.b;
                        i1 i1Var = u0Var3.t;
                        if (i1Var != null && i1Var.d) {
                            u0Var3.K();
                            break;
                        }
                        break;
                    default:
                        u0 u0Var4 = this.b;
                        int i14 = u0Var4.a;
                        l0 l0Var2 = u0Var4.o;
                        if (l0Var2 != null) {
                            l0Var2.e();
                        }
                        di.x8.y(i14, false).O(j10.i(i14).e());
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = DesugarCollections.unmodifiableList(arrayList);
        this.M = new Runnable(this) { // from class: org.telegram.ui.Wallet.h
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l0 l0Var;
                switch (i11) {
                    case 0:
                        u0 u0Var = this.b;
                        u0Var.f0();
                        u0Var.T();
                        break;
                    case 1:
                        u0 u0Var2 = this.b;
                        if ((!TextUtils.isEmpty(u0Var2.y) || !TextUtils.isEmpty(u0Var2.z)) && (l0Var = u0Var2.o) != null && u0Var2.n != null) {
                            ArrayList arrayList2 = l0Var.b;
                            int size = arrayList2.size();
                            int i112 = 0;
                            int i122 = 0;
                            while (true) {
                                if (i122 < size) {
                                    Object obj = arrayList2.get(i122);
                                    i122++;
                                    if (u0Var2.O((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList22 = u0Var2.n.b;
                                        int size2 = arrayList22.size();
                                        while (i112 < size2) {
                                            Object obj2 = arrayList22.get(i112);
                                            i112++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && u0Var2.O(wallettransaction.nft)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        u0Var2.B().e();
                        u0Var2.H().g();
                        u0Var2.K();
                        int i132 = u0Var2.A;
                        long[] jArr = u0.S;
                        if (i132 < 7) {
                            h hVar = u0Var2.B;
                            u0Var2.A = i132 + 1;
                            org.telegram.messenger.g0.h3(hVar, jArr[i132]);
                            break;
                        }
                        break;
                    case 2:
                        u0 u0Var3 = this.b;
                        i1 i1Var = u0Var3.t;
                        if (i1Var != null && i1Var.d) {
                            u0Var3.K();
                            break;
                        }
                        break;
                    default:
                        u0 u0Var4 = this.b;
                        int i14 = u0Var4.a;
                        l0 l0Var2 = u0Var4.o;
                        if (l0Var2 != null) {
                            l0Var2.e();
                        }
                        di.x8.y(i14, false).O(j10.i(i14).e());
                        break;
                }
            }
        };
        this.N = new HashMap();
        this.O = new HashMap();
        this.P = new HashMap();
        this.Q = new HashMap();
        this.a = i7;
        try {
            this.m = C().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e10) {
            o("failed to load prefs", e10);
        }
        this.h = new g(this);
        h0();
        g0();
        P("requesting has walt balance");
        this.E = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new d3.b(i10), new i(this, i11));
        this.g = new l2(this);
        h hVar = this.M;
        Object obj = z0.g;
        synchronized (z0.class) {
            try {
                Iterator it = z0.j.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        z0.j.remove(weakReference);
                    } else if (runnable == hVar) {
                        i11 = 1;
                    }
                }
                if (hVar != null && i11 == 0) {
                    z0.j.add(new WeakReference(hVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f0();
    }

    public static Context C() {
        org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
        return (T2 == null || T2.getContext() == null) ? org.telegram.messenger.t0.b : T2.getContext();
    }

    public static u0 D(int i7) {
        u0 u0Var;
        u0 u0Var2 = R[i7];
        if (u0Var2 != null) {
            return u0Var2;
        }
        synchronized (u0.class) {
            try {
                u0Var = R[i7];
                if (u0Var == null) {
                    u0[] u0VarArr = R;
                    u0 u0Var3 = new u0(i7);
                    u0VarArr[i7] = u0Var3;
                    u0Var = u0Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u0Var;
    }

    public static TL_update.TL_updateSentWalletTransaction G(TLRPC.Updates updates) {
        if (updates == null) {
            return null;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateSentWalletTransaction) {
            return (TL_update.TL_updateSentWalletTransaction) update;
        }
        ArrayList<TLRPC.Update> arrayList = updates.updates;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.Update update2 = arrayList.get(i7);
            i7++;
            TLRPC.Update update3 = update2;
            if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                return (TL_update.TL_updateSentWalletTransaction) update3;
            }
        }
        return null;
    }

    public static void J(IdentityHashMap identityHashMap, HashMap hashMap, int i7, TL_wallet.walletTransaction wallettransaction, boolean z10) {
        TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
        if (z10) {
            if (treeSet == null) {
                treeSet = new TreeSet();
                identityHashMap.put(wallettransaction, treeSet);
            }
            treeSet.add(Integer.valueOf(i7));
        } else if (treeSet != null) {
            treeSet.remove(Integer.valueOf(i7));
        }
        ArrayList s02 = s0(wallettransaction);
        int size = s02.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = s02.get(i10);
            i10++;
            String str = (String) obj;
            TreeSet treeSet2 = (TreeSet) hashMap.get(str);
            if (z10) {
                if (treeSet2 == null) {
                    treeSet2 = new TreeSet();
                    hashMap.put(str, treeSet2);
                }
                treeSet2.add(Integer.valueOf(i7));
            } else if (treeSet2 != null) {
                treeSet2.remove(Integer.valueOf(i7));
            }
        }
    }

    public static boolean L(String str) {
        return "WALLET_SEND_CANCELLED".equals(str) || "PASSCODE_FAILED".equalsIgnoreCase(str);
    }

    public static void P(String str) {
        org.telegram.messenger.a8.b("[gram-wallet] " + str);
    }

    public static boolean Q(fj fjVar, TL_wallet.walletTransaction wallettransaction) {
        if (fjVar != null && fjVar.k != null && wallettransaction != null && fjVar.P3()) {
            TLRPC.Message message = fjVar.k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j3 = wallettransaction.random_id;
                if (j3 != 0 && message.random_id == j3) {
                    return true;
                }
                if (wallettransaction.localMessageId != 0 && fjVar.e1() == wallettransaction.localMessageId) {
                    return true;
                }
                if (!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer.transaction_id)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction) {
        if (wallettransaction.pending) {
            return false;
        }
        return wallettransaction.nft != null || (wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnchainGift);
    }

    public static void b(ArrayList arrayList, char c10, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String r02 = r0(str);
        if (r02 != null) {
            str2 = c10 + "x" + r02;
        } else {
            str2 = c10 + "r" + str;
        }
        arrayList.add(str2);
    }

    public static byte[] b0(byte[] bArr) {
        byte[] bArr2 = new byte[ks.s3];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z10 = false;
            int i7 = 0;
            for (byte b10 : bArr) {
                if (r0.e(b10)) {
                    z10 = i7 > 0;
                } else {
                    if (z10) {
                        if (i7 == 215) {
                            throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                        }
                        int i10 = i7 + 1;
                        bArr2[i7] = 32;
                        i7 = i10;
                        z10 = false;
                    }
                    if (i7 == 215) {
                        throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                    }
                    bArr2[i7] = b10;
                    i7++;
                }
            }
            return bArr2;
        } catch (RuntimeException e10) {
            Arrays.fill(bArr2, (byte) 0);
            throw e10;
        }
    }

    public static boolean c(String str, String str2) {
        String u02 = u0(str);
        return u02 != null && u02.equals(u0(str2));
    }

    public static k2 c0(p0 p0Var) {
        JSONArray jSONArray = new JSONArray();
        List<p0> list = p0Var.g;
        if (list == null) {
            list = Collections.singletonList(p0Var);
        }
        for (p0 p0Var2 : list) {
            int i7 = p0Var2.e;
            byte[] bArr = p0Var2.d;
            String str = p0Var2.a;
            if (i7 != 3) {
                throw new IllegalArgumentException("WALLET_UNSUPPORTED_SEND_MODE");
            }
            if (str.indexOf(58) >= 0) {
                str = e0(str, bArr == null);
            }
            JSONObject put = new JSONObject().put("address", str).put("amount", Long.toString(p0Var2.b));
            byte[] bArr2 = p0Var2.c;
            if (bArr2 != null && bArr2.length > 0) {
                put.put("payload", Base64.encodeToString(bArr2, 2));
            }
            if (bArr != null && bArr.length > 0) {
                put.put("stateInit", Base64.encodeToString(bArr, 2));
            }
            jSONArray.put(put);
        }
        return new k2(new JSONObject().put("messages", jSONArray));
    }

    public static String e0(String str, boolean z10) {
        try {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int parseInt = Integer.parseInt(str.substring(0, indexOf));
                String substring = str.substring(indexOf + 1);
                if (substring.length() == 64) {
                    byte[] bArr = new byte[36];
                    bArr[0] = z10 ? (byte) 17 : (byte) 81;
                    bArr[1] = (byte) parseInt;
                    for (int i7 = 0; i7 < 32; i7++) {
                        int i10 = i7 * 2;
                        bArr[i7 + 2] = (byte) Integer.parseInt(substring.substring(i10, i10 + 2), 16);
                    }
                    int i11 = 0;
                    for (int i12 = 0; i12 < 34; i12++) {
                        i11 ^= (bArr[i12] & 255) << 8;
                        for (int i13 = 0; i13 < 8; i13++) {
                            int i14 = 32768 & i11;
                            int i15 = i11 << 1;
                            if (i14 != 0) {
                                i15 ^= 4129;
                            }
                            i11 = i15 & 65535;
                        }
                    }
                    bArr[34] = (byte) (i11 >>> 8);
                    bArr[35] = (byte) i11;
                    return Base64.encodeToString(bArr, 11);
                }
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static TL_wallet.WalletTransactionPeer i(TLRPC.User user, String str, String str2) {
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

    public static k2 j(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        return new k2(new JSONObject().put("messages", new JSONArray().put(new JSONObject().put("address", stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? e0(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static boolean l0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            String r02 = r0(str);
            if (r02 != null && r02.equals(r0(str2))) {
                return true;
            }
        }
        return false;
    }

    public static void n(String str) {
        org.telegram.messenger.a8.d("[gram-wallet] " + str);
    }

    public static void o(String str, Throwable th2) {
        org.telegram.messenger.a8.e("[gram-wallet] " + str, th2);
    }

    public static void p(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() < 2) {
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList.get(i7);
            if (wallettransaction != null && !TextUtils.isEmpty(wallettransaction.id)) {
                int i10 = i7 + 1;
                while (i10 < arrayList.size()) {
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) arrayList.get(i10);
                    if (wallettransaction2 != null && TextUtils.equals(wallettransaction2.id, wallettransaction.id)) {
                        int i11 = i10 - 1;
                        arrayList.remove(i10);
                        if (wallettransaction.nft != null || wallettransaction2.nft == null) {
                            wallettransaction.amount += wallettransaction2.amount;
                            wallettransaction2 = wallettransaction;
                            wallettransaction = wallettransaction2;
                        } else {
                            wallettransaction2.amount += wallettransaction.amount;
                            arrayList.set(i7, wallettransaction2);
                        }
                        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                        if ((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift) && !(wallettransaction2.peer instanceof TL_wallet.walletTransactionPeerOnchainGift)) {
                            wallettransaction2.peer = walletTransactionPeer;
                        }
                        wallettransaction = wallettransaction2;
                        i10 = i11;
                    }
                    i10++;
                }
            }
        }
    }

    public static byte[][] p0(byte[] bArr, SecureRandom secureRandom) {
        if (bArr.length != 215) {
            throw new IllegalArgumentException("INVALID_MNEMONIC_BACKUP_SIZE");
        }
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, ks.s3);
        try {
            secureRandom.nextBytes(bArr2[0]);
            secureRandom.nextBytes(bArr2[1]);
            for (int i7 = 0; i7 < bArr.length; i7++) {
                bArr2[2][i7] = (byte) ((bArr[i7] ^ bArr2[0][i7]) ^ bArr2[1][i7]);
            }
            return bArr2;
        } catch (RuntimeException e10) {
            for (byte[] bArr3 : bArr2) {
                Arrays.fill(bArr3, (byte) 0);
            }
            throw e10;
        }
    }

    public static SpannableStringBuilder q(String str, CharSequence charSequence, int i7) {
        String replace = charSequence.toString().replace((char) 8211, '-');
        String M0 = gd.M0(i7, null);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                M0 = gd.K0((int) ((parseLong < -2147483647L || parseLong > 2147483647L) ? Math.abs(parseLong % 100) + 100 : Math.abs(parseLong)), str);
            } catch (NumberFormatException unused) {
            }
        }
        return org.telegram.messenger.g0.K2(M0, charSequence, "%1$s");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(5:9|(2:11|(1:16))|29|30|31)|32|33|34|35|(4:37|(1:39)|40|41)|31) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String r0(String str) {
        int i7;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LruCache lruCache = T;
        String str2 = (String) lruCache.get(str);
        if (str2 == null) {
            str2 = "";
            if (str.length() == 64) {
                for (0; i7 < 64; i7 + 1) {
                    char charAt = str.charAt(i7);
                    i7 = ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f') || (charAt >= 'A' && charAt <= 'F')) ? i7 + 1 : 0;
                }
                str2 = str.toLowerCase(Locale.ROOT);
                lruCache.put(str, str2);
            }
            byte[] decode = Base64.decode(str.replace('-', '+').replace('_', '/'), 0);
            if (decode.length == 32) {
                StringBuilder sb2 = new StringBuilder(64);
                for (byte b10 : decode) {
                    sb2.append(Character.forDigit((b10 >> 4) & 15, 16));
                    sb2.append(Character.forDigit(b10 & 15, 16));
                }
                str2 = sb2.toString();
            }
            lruCache.put(str, str2);
        }
        if (str2.isEmpty()) {
            return null;
        }
        return str2;
    }

    public static SpannableStringBuilder s(long j3, boolean z10) {
        return q("GramCapital", t(j3, z10), 2131749344);
    }

    public static ArrayList s0(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = new ArrayList(5);
        if (wallettransaction != null) {
            if (!TextUtils.isEmpty(wallettransaction.id)) {
                arrayList.add("i" + wallettransaction.id);
            }
            b(arrayList, 't', wallettransaction.tx_hash);
            b(arrayList, 'm', wallettransaction.messageHash);
            if (!wallettransaction.incoming) {
                b(arrayList, 'g', wallettransaction.gaslessMessageBodyHash);
                b(arrayList, 'n', wallettransaction.normalMessageBodyHash);
            }
        }
        return arrayList;
    }

    public static String t(long j3, boolean z10) {
        if ((j3 > -10000000 && j3 < 10000000) || z10) {
            return pb.P0(j3);
        }
        if (U == null) {
            U = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return U.format(j3 / 1.0E9d);
    }

    public static boolean t0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, wallettransaction2.id)) || l0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || l0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            return true;
        }
        if (wallettransaction.incoming || wallettransaction2.incoming) {
            return false;
        }
        return l0(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) || l0(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash);
    }

    public static String u(long j3, boolean z10) {
        boolean z11 = j3 <= -1000000000 || j3 >= 1000000000;
        if (z10 && z11) {
            return t(j3, true);
        }
        BigDecimal scale = BigDecimal.valueOf(j3, 9).setScale(z10 ? 4 : z11 ? 2 : 3, RoundingMode.DOWN);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
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
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) decode[1]);
            sb2.append(':');
            for (int i7 = 2; i7 < 34; i7++) {
                sb2.append(Character.forDigit((decode[i7] >> 4) & 15, 16));
                sb2.append(Character.forDigit(decode[i7] & 15, 16));
            }
            return sb2.toString();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static SpannableStringBuilder v(String str, float f10) {
        int i7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i7 = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), i7, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder w(long j3) {
        return x(j3, false);
    }

    public static SpannableStringBuilder x(long j3, boolean z10) {
        return q("Grams", t(j3, z10), 2131749315);
    }

    public final long A() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).balance;
        }
        return 0L;
    }

    public final l0 B() {
        if (this.o == null) {
            this.o = new l0(this);
        }
        return this.o;
    }

    public final byte[] E() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).public_key;
        }
        return null;
    }

    public final void F(boolean z10, boolean z11, boolean z12, q10 q10Var) {
        P("getSecretPhrase: whenReady...");
        x0(new org.telegram.messenger.k4(this, q10Var, z12, z10, z11, 2));
    }

    public final t0 H() {
        if (this.n == null) {
            this.n = new t0(this);
        }
        return this.n;
    }

    public final void I(boolean z10, boolean z11, r0 r0Var, x10 x10Var) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(r0Var)) {
                x10Var.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(r0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(r0Var);
            r0 b10 = r0Var.b();
            P("import wallet: requesting proof challenge");
            n3.a(this.a, null, new s(this, b10, x10Var, secretPhraseToAnchorPublicKey, 1), null, null, new v(this, x10Var, secretPhraseToPublicKey, b10), z10, z11, new m.b3(new m(b10, 1), null));
        } catch (Exception unused2) {
            x10Var.a("INVALID_PHRASE");
        }
    }

    public final void K() {
        t0 t0Var = this.n;
        if (t0Var != null) {
            t0Var.g();
        }
        if (this.C >= 0) {
            return;
        }
        h0();
    }

    public final boolean M() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f;
        return tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
    }

    public final boolean N() {
        return (!(this.e instanceof TL_wallet.TL_walletState) || this.b == null || this.c == null) ? false : true;
    }

    public final boolean O(TL_wallet.nftItem nftitem) {
        if (nftitem == null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.y)) {
            return c(nftitem.address, this.y);
        }
        TL_stars.StarGift starGift = nftitem.gift;
        return (starGift instanceof TL_stars.TL_starGiftUnique) && TextUtils.equals(((TL_stars.TL_starGiftUnique) starGift).slug, this.z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
    
        r0 = r5.c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R() {
        z0 z0Var;
        boolean z10;
        if (!(this.e instanceof TL_wallet.TL_walletState) || z0Var == null) {
            return false;
        }
        z0Var.getClass();
        synchronized (z0.g) {
            try {
                try {
                    z10 = z0Var.s().c;
                } catch (Exception e10) {
                    z0Var.m(e10);
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final boolean S() {
        return this.m && !bz.s.isEmpty();
    }

    public final void T() {
        ks.f(this.a).k(ks.c4, this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:215|216|(4:218|219|220|(6:222|(2:224|(1:226))|227|95|(2:97|98)(8:99|(1:101)(4:181|(2:183|(1:207)(7:189|(1:193)|194|(1:205)(1:200)|201|202|(1:204)))|210|211)|(1:103)|104|(3:106|(1:108)(1:167)|(6:110|(3:112|(1:114)|115)|116|(1:118)|119|120)(13:121|(3:123|(2:125|(3:132|133|134)(1:141))|144)|145|(1:147)|148|(1:150)(1:166)|151|(1:165)(1:155)|156|(1:158)|(1:162)|163|164))(1:180)|169|(2:171|(1:(2:173|(2:175|176)(1:177))(2:178|179)))(0)|(0)(0))|84))(1:417)|228|229|230|231|232|233|234|235|(3:237|(7:241|(3:246|(2:248|249)(2:250|(2:255|(2:257|258)(1:259)))|245)|243|244|245|238|239)|260)(1:406)|261|(1:403)(1:278)|(1:402)(4:282|283|284|(5:286|(5:(1:300)(1:396)|301|(2:303|(1:305))(1:395)|306|(1:308)(29:309|310|311|312|313|314|(2:319|(3:321|322|323)(2:328|329))|330|(1:332)(1:391)|333|(1:335)(3:388|389|390)|(1:337)(1:387)|338|(2:382|383)(1:(1:381)(1:343))|344|(1:348)|(1:350)(1:380)|351|(3:355|(3:358|(2:360|361)(1:377)|356)|378)|379|362|(1:364)(1:376)|365|(2:374|375)(2:369|370)|371|(3:373|(0)(0)|84)|327|(0)(0)|84))|95|(0)(0)|84))|397|(0)|(0)(0)|301|(0)(0)|306|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x057c, code lost:
    
        if (r0 != null) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0484, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0485, code lost:
    
        r37 = r1;
        r39 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0489, code lost:
    
        r38 = r8;
        r40 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x048f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0490, code lost:
    
        r37 = r1;
        r39 = r6;
        r36 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0342 A[Catch: Exception -> 0x02a2, TryCatch #8 {Exception -> 0x02a2, blocks: (B:239:0x0265, B:241:0x026b, B:246:0x0274, B:250:0x027f, B:253:0x0286, B:255:0x0292, B:257:0x029e, B:264:0x02b1, B:266:0x02b7, B:268:0x02bd, B:270:0x02c7, B:272:0x02d1, B:274:0x02d7, B:276:0x02e3, B:290:0x030d, B:292:0x0315, B:294:0x031b, B:296:0x0323, B:301:0x0338, B:303:0x0342, B:306:0x0359, B:309:0x0367, B:313:0x0372, B:317:0x037a, B:319:0x0380, B:329:0x0392, B:330:0x0398, B:333:0x039e, B:338:0x03de, B:344:0x040b, B:346:0x040f, B:348:0x0415, B:350:0x041a, B:351:0x0423, B:355:0x042e, B:356:0x0432, B:358:0x0438, B:361:0x0444, B:362:0x044a, B:364:0x0451, B:365:0x045d, B:367:0x0461, B:376:0x0457, B:380:0x041f, B:341:0x03ef, B:343:0x03fb, B:381:0x0405, B:386:0x03ea, B:387:0x03d8, B:396:0x0331, B:383:0x03e2), top: B:238:0x0265, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0367 A[Catch: Exception -> 0x02a2, TRY_LEAVE, TryCatch #8 {Exception -> 0x02a2, blocks: (B:239:0x0265, B:241:0x026b, B:246:0x0274, B:250:0x027f, B:253:0x0286, B:255:0x0292, B:257:0x029e, B:264:0x02b1, B:266:0x02b7, B:268:0x02bd, B:270:0x02c7, B:272:0x02d1, B:274:0x02d7, B:276:0x02e3, B:290:0x030d, B:292:0x0315, B:294:0x031b, B:296:0x0323, B:301:0x0338, B:303:0x0342, B:306:0x0359, B:309:0x0367, B:313:0x0372, B:317:0x037a, B:319:0x0380, B:329:0x0392, B:330:0x0398, B:333:0x039e, B:338:0x03de, B:344:0x040b, B:346:0x040f, B:348:0x0415, B:350:0x041a, B:351:0x0423, B:355:0x042e, B:356:0x0432, B:358:0x0438, B:361:0x0444, B:362:0x044a, B:364:0x0451, B:365:0x045d, B:367:0x0461, B:376:0x0457, B:380:0x041f, B:341:0x03ef, B:343:0x03fb, B:381:0x0405, B:386:0x03ea, B:387:0x03d8, B:396:0x0331, B:383:0x03e2), top: B:238:0x0265, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0331 A[Catch: Exception -> 0x02a2, TryCatch #8 {Exception -> 0x02a2, blocks: (B:239:0x0265, B:241:0x026b, B:246:0x0274, B:250:0x027f, B:253:0x0286, B:255:0x0292, B:257:0x029e, B:264:0x02b1, B:266:0x02b7, B:268:0x02bd, B:270:0x02c7, B:272:0x02d1, B:274:0x02d7, B:276:0x02e3, B:290:0x030d, B:292:0x0315, B:294:0x031b, B:296:0x0323, B:301:0x0338, B:303:0x0342, B:306:0x0359, B:309:0x0367, B:313:0x0372, B:317:0x037a, B:319:0x0380, B:329:0x0392, B:330:0x0398, B:333:0x039e, B:338:0x03de, B:344:0x040b, B:346:0x040f, B:348:0x0415, B:350:0x041a, B:351:0x0423, B:355:0x042e, B:356:0x0432, B:358:0x0438, B:361:0x0444, B:362:0x044a, B:364:0x0451, B:365:0x045d, B:367:0x0461, B:376:0x0457, B:380:0x041f, B:341:0x03ef, B:343:0x03fb, B:381:0x0405, B:386:0x03ea, B:387:0x03d8, B:396:0x0331, B:383:0x03e2), top: B:238:0x0265, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04cf  */
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
        int i7;
        ArrayList arrayList;
        TL_wallet.walletTransaction wallettransaction;
        JSONArray jSONArray;
        HashMap hashMap;
        ArrayList arrayList2;
        String str9;
        HashSet hashSet;
        t0 t0Var;
        HashMap hashMap2;
        ArrayList arrayList3;
        String j3;
        HashMap hashMap3;
        String str10;
        String str11;
        t0 t0Var2;
        ArrayList arrayList4;
        HashMap hashMap4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        HashSet hashSet2;
        TL_wallet.walletTransaction wallettransaction2;
        TL_wallet.walletTransaction wallettransaction3;
        int i10;
        TL_wallet.walletTransaction wallettransaction4;
        TL_wallet.nftItem nftitem;
        String str12;
        int i11;
        int i12;
        JSONObject jSONObject2;
        String j10;
        String string;
        JSONObject jSONObject3;
        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress;
        String str13;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        int i13;
        JSONArray jSONArray2;
        JSONObject optJSONObject3;
        JSONObject jSONObject4 = jSONObject;
        i1 i1Var = this.t;
        if (i1Var == null || !TextUtils.equals(i1Var.b, y())) {
            return;
        }
        String optString2 = jSONObject4.optString(TeXSymbolParser.TYPE_ATTR);
        String str14 = "finality";
        String optString3 = jSONObject4.optString("finality");
        P("streaming " + optString2 + ", finality: " + optString3);
        if ("account_state_change".equals(optString2) && "finalized".equals(optString3) && (this.e instanceof TL_wallet.TL_walletState) && (optJSONObject3 = jSONObject4.optJSONObject("state")) != null) {
            try {
                long parseLong = Long.parseLong(optJSONObject3.getString("balance"));
                if (parseLong >= 0 && ((TL_wallet.TL_walletState) this.e).balance != parseLong) {
                    P("streaming updates balance to " + parseLong);
                    this.k = System.currentTimeMillis();
                    this.l = true;
                    ((TL_wallet.TL_walletState) this.e).balance = parseLong;
                    V();
                    T();
                    t0 t0Var3 = this.n;
                    if (t0Var3 != null) {
                        t0Var3.g();
                    }
                }
            } catch (Exception unused) {
                n("Invalid streaming balance");
            }
        }
        t0 t0Var4 = this.n;
        if (t0Var4 != null) {
            ArrayList arrayList7 = t0Var4.b;
            HashSet hashSet3 = t0Var4.d;
            HashMap hashMap5 = t0Var4.e;
            u0 u0Var = t0Var4.m;
            int i14 = 1;
            ArrayList arrayList8 = u0Var.p;
            HashMap hashMap6 = t0Var4.f;
            String optString4 = jSONObject4.optString(TeXSymbolParser.TYPE_ATTR);
            str = optString2;
            String str15 = "trace_external_hash_norm";
            str3 = "trace_invalidated";
            if ("trace_invalidated".equals(optString4)) {
                String optString5 = jSONObject4.optString("trace_external_hash_norm");
                if (!TextUtils.isEmpty(optString5)) {
                    ArrayList arrayList9 = new ArrayList(hashMap5.keySet());
                    int size = arrayList9.size();
                    int i15 = 0;
                    boolean z10 = false;
                    while (i15 < size) {
                        Object obj = arrayList9.get(i15);
                        i15++;
                        String str16 = (String) obj;
                        if (l0((String) hashMap5.get(str16), optString5)) {
                            hashMap5.remove(str16);
                            hashSet3.remove(str16);
                            TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) hashMap6.remove(str16);
                            int size2 = arrayList7.size() - 1;
                            while (size2 >= 0) {
                                String str17 = optString5;
                                if (arrayList7.get(size2) == wallettransaction5 || TextUtils.equals(((TL_wallet.walletTransaction) arrayList7.get(size2)).id, str16)) {
                                    arrayList7.remove(size2);
                                    z10 = true;
                                }
                                size2--;
                                optString5 = str17;
                            }
                        }
                    }
                    if (z10) {
                        t0Var4.k();
                        t0Var4.i();
                    }
                }
            } else if ("transactions".equals(optString4) && (((equals = "finalized".equals((optString = jSONObject4.optString("finality")))) || "confirmed".equals(optString)) && (optJSONArray = jSONObject4.optJSONArray("transactions")) != null)) {
                str2 = "finalized";
                ArrayList arrayList10 = new ArrayList();
                str6 = optString3;
                str7 = "confirmed";
                int i16 = 0;
                TL_wallet.walletTransaction wallettransaction6 = null;
                boolean z11 = false;
                while (i16 < optJSONArray.length()) {
                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(i16);
                    if (optJSONObject4 != null) {
                        i7 = i16;
                        if (optJSONObject4.optBoolean("emulated")) {
                            str8 = str14;
                        } else {
                            jSONArray = optJSONArray;
                            if ("pending".equals(optJSONObject4.optString(str14)) || (j3 = t0.j(optJSONObject4)) == null) {
                                str8 = str14;
                                arrayList = arrayList8;
                                wallettransaction = wallettransaction6;
                                arrayList2 = arrayList7;
                                str9 = str15;
                                t0Var = t0Var4;
                                hashMap = hashMap5;
                                hashSet = hashSet3;
                                hashMap2 = hashMap6;
                                arrayList3 = arrayList10;
                                jSONObject4 = jSONObject;
                                arrayList10 = arrayList3;
                                hashMap6 = hashMap2;
                                t0Var4 = t0Var;
                                hashSet3 = hashSet;
                                str15 = str9;
                                hashMap5 = hashMap;
                                str14 = str8;
                                wallettransaction6 = wallettransaction;
                                i14 = 1;
                                arrayList8 = arrayList;
                                arrayList7 = arrayList2;
                                optJSONArray = jSONArray;
                                i16 = i7 + 1;
                            } else {
                                str8 = str14;
                                wallettransaction = wallettransaction6;
                                try {
                                    str10 = str15;
                                } catch (Exception e10) {
                                    e = e10;
                                    hashMap3 = hashMap6;
                                    str10 = str15;
                                }
                                try {
                                } catch (Exception e11) {
                                    e = e11;
                                    hashMap3 = hashMap6;
                                    str11 = j3;
                                    t0Var2 = t0Var4;
                                    arrayList4 = arrayList8;
                                    hashMap4 = hashMap5;
                                    arrayList5 = arrayList10;
                                    arrayList6 = arrayList7;
                                    hashSet2 = hashSet3;
                                    wallettransaction2 = null;
                                    o("stream transaction parse failed", e);
                                    wallettransaction3 = wallettransaction2;
                                    if (wallettransaction3 == null) {
                                    }
                                    jSONObject4 = jSONObject;
                                    arrayList10 = arrayList3;
                                    hashMap6 = hashMap2;
                                    t0Var4 = t0Var;
                                    hashSet3 = hashSet;
                                    str15 = str9;
                                    hashMap5 = hashMap;
                                    str14 = str8;
                                    wallettransaction6 = wallettransaction;
                                    i14 = 1;
                                    arrayList8 = arrayList;
                                    arrayList7 = arrayList2;
                                    optJSONArray = jSONArray;
                                    i16 = i7 + 1;
                                }
                                if (c(optJSONObject4.getString("account"), u0Var.y())) {
                                    JSONObject jSONObject5 = optJSONObject4.getJSONObject("description");
                                    if (!jSONObject5.optBoolean("destroyed")) {
                                        boolean optBoolean = jSONObject5.optBoolean("aborted");
                                        JSONObject optJSONObject5 = jSONObject5.optJSONObject("compute_ph");
                                        hashSet2 = hashSet3;
                                        if (optJSONObject5 != null) {
                                            hashMap4 = hashMap5;
                                            try {
                                            } catch (Exception e12) {
                                                e = e12;
                                                hashMap3 = hashMap6;
                                                str11 = j3;
                                                t0Var2 = t0Var4;
                                                arrayList4 = arrayList8;
                                                arrayList5 = arrayList10;
                                                arrayList6 = arrayList7;
                                                wallettransaction2 = null;
                                                o("stream transaction parse failed", e);
                                                wallettransaction3 = wallettransaction2;
                                                if (wallettransaction3 == null) {
                                                }
                                                jSONObject4 = jSONObject;
                                                arrayList10 = arrayList3;
                                                hashMap6 = hashMap2;
                                                t0Var4 = t0Var;
                                                hashSet3 = hashSet;
                                                str15 = str9;
                                                hashMap5 = hashMap;
                                                str14 = str8;
                                                wallettransaction6 = wallettransaction;
                                                i14 = 1;
                                                arrayList8 = arrayList;
                                                arrayList7 = arrayList2;
                                                optJSONArray = jSONArray;
                                                i16 = i7 + 1;
                                            }
                                            if (!optJSONObject5.optBoolean("skipped")) {
                                                if (optJSONObject5.optBoolean("success")) {
                                                    if (optJSONObject5.optInt("exit_code") != 0) {
                                                    }
                                                }
                                                hashMap3 = hashMap6;
                                                str11 = j3;
                                                t0Var2 = t0Var4;
                                                arrayList4 = arrayList8;
                                                arrayList5 = arrayList10;
                                                arrayList6 = arrayList7;
                                                wallettransaction3 = null;
                                                wallettransaction2 = null;
                                                if (wallettransaction3 == null) {
                                                    arrayList3 = arrayList5;
                                                    arrayList3.add(str11);
                                                    str9 = str10;
                                                    hashSet = hashSet2;
                                                    hashMap = hashMap4;
                                                    arrayList2 = arrayList6;
                                                    t0Var = t0Var2;
                                                    hashMap2 = hashMap3;
                                                    arrayList = arrayList4;
                                                } else {
                                                    String str18 = str11;
                                                    arrayList3 = arrayList5;
                                                    if (wallettransaction3.incoming) {
                                                        wallettransaction4 = wallettransaction2;
                                                        arrayList = arrayList4;
                                                        i10 = 0;
                                                    } else {
                                                        arrayList = arrayList4;
                                                        ArrayList arrayList11 = new ArrayList(arrayList);
                                                        int size3 = arrayList11.size();
                                                        int i17 = 0;
                                                        while (i17 < size3) {
                                                            Object obj2 = arrayList11.get(i17);
                                                            i17++;
                                                            wallettransaction4 = (TL_wallet.walletTransaction) obj2;
                                                            boolean l02 = l0(wallettransaction4.gaslessMessageBodyHash, wallettransaction3.gaslessMessageBodyHash);
                                                            boolean l03 = l0(wallettransaction4.normalMessageBodyHash, wallettransaction3.normalMessageBodyHash);
                                                            if (!wallettransaction4.incoming && (l02 || l03)) {
                                                                wallettransaction3.gasless = l02;
                                                                if (wallettransaction3.nft == null && (nftitem = wallettransaction4.nft) != null) {
                                                                    wallettransaction3.nft = nftitem;
                                                                    wallettransaction3.peer = wallettransaction4.peer;
                                                                    wallettransaction3.amount = wallettransaction4.amount;
                                                                    wallettransaction3.comment = wallettransaction4.comment;
                                                                }
                                                                if (wallettransaction4.pending || wallettransaction4.failed || TextUtils.isEmpty(wallettransaction4.id)) {
                                                                    u0Var.d(wallettransaction4, wallettransaction3);
                                                                } else {
                                                                    wallettransaction4.gasless = wallettransaction3.gasless;
                                                                }
                                                                i10 = 0;
                                                                wallettransaction4.pending = false;
                                                                wallettransaction4.failed = false;
                                                                wallettransaction4.phase = wallettransaction3.phase;
                                                                arrayList.remove(wallettransaction4);
                                                                x0 x0Var = (x0) u0Var.u.remove(wallettransaction4);
                                                                if (x0Var != null) {
                                                                    x0Var.c();
                                                                }
                                                            }
                                                        }
                                                        i10 = 0;
                                                        wallettransaction4 = wallettransaction2;
                                                    }
                                                    if (wallettransaction4 != null) {
                                                        wallettransaction = wallettransaction4;
                                                    }
                                                    hashMap2 = hashMap3;
                                                    TL_wallet.walletTransaction wallettransaction7 = (TL_wallet.walletTransaction) hashMap2.get(str18);
                                                    if (wallettransaction7 != null) {
                                                        t0Var = t0Var2;
                                                        if (t0Var.b(wallettransaction7)) {
                                                            arrayList2 = arrayList6;
                                                        } else {
                                                            arrayList2 = arrayList6;
                                                            wallettransaction7 = t0.d(wallettransaction7.id, arrayList2);
                                                        }
                                                        if (wallettransaction7 == null) {
                                                            hashMap2.put(str18, wallettransaction7);
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
                                                                z11 = true;
                                                            }
                                                            hashMap = hashMap4;
                                                            if (equals) {
                                                                hashMap.remove(str18);
                                                            }
                                                            str9 = str10;
                                                            hashSet = hashSet2;
                                                        } else {
                                                            hashMap = hashMap4;
                                                            if (wallettransaction4 == null) {
                                                                int size4 = arrayList.size();
                                                                int i18 = i10;
                                                                while (i18 < size4) {
                                                                    Object obj3 = arrayList.get(i18);
                                                                    i18++;
                                                                    TL_wallet.walletTransaction wallettransaction8 = (TL_wallet.walletTransaction) obj3;
                                                                    int i19 = size4;
                                                                    if (wallettransaction8.incoming == wallettransaction3.incoming && ((!TextUtils.isEmpty(wallettransaction8.id) && TextUtils.equals(wallettransaction8.id, wallettransaction3.id)) || l0(wallettransaction8.tx_hash, wallettransaction3.tx_hash) || l0(wallettransaction8.messageHash, wallettransaction3.messageHash))) {
                                                                        hashSet = hashSet2;
                                                                        hashSet.remove(str18);
                                                                        hashMap.remove(str18);
                                                                        str9 = str10;
                                                                        break;
                                                                    }
                                                                    size4 = i19;
                                                                }
                                                            }
                                                            hashSet = hashSet2;
                                                            if (wallettransaction4 != null) {
                                                                wallettransaction3 = wallettransaction4;
                                                            }
                                                            t0Var.f(wallettransaction3);
                                                            hashMap2.put(str18, wallettransaction3);
                                                            hashSet.add(str18);
                                                            if (equals) {
                                                                hashMap.remove(str18);
                                                                str9 = str10;
                                                            } else {
                                                                str9 = str10;
                                                                hashMap.put(str18, jSONObject4.optString(str9));
                                                            }
                                                            StringBuilder sb2 = new StringBuilder("stream inserted ");
                                                            sb2.append(str18);
                                                            String str19 = wallettransaction3.id;
                                                            if (str19 == null || TextUtils.equals(str19, str18)) {
                                                                str12 = "";
                                                            } else {
                                                                str12 = " as " + wallettransaction3.id;
                                                            }
                                                            sb2.append(str12);
                                                            P(sb2.toString());
                                                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction3.peer;
                                                            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                                                                String str20 = walletTransactionPeer.address;
                                                                u0Var.i0(new s(t0Var, wallettransaction3.id, str20, walletTransactionPeer.domain), str20);
                                                            }
                                                            if (wallettransaction4 == null && a(wallettransaction3)) {
                                                                h hVar = u0Var.I;
                                                                org.telegram.messenger.g0.r(hVar);
                                                                org.telegram.messenger.g0.h3(hVar, 300L);
                                                            }
                                                            z11 = true;
                                                        }
                                                    } else {
                                                        arrayList2 = arrayList6;
                                                        t0Var = t0Var2;
                                                    }
                                                    wallettransaction7 = t0.d(str18, arrayList2);
                                                    if (wallettransaction7 == null) {
                                                        int size5 = arrayList2.size();
                                                        int i20 = i10;
                                                        while (true) {
                                                            if (i20 >= size5) {
                                                                wallettransaction7 = wallettransaction2;
                                                                break;
                                                            }
                                                            Object obj4 = arrayList2.get(i20);
                                                            i20++;
                                                            TL_wallet.walletTransaction wallettransaction9 = (TL_wallet.walletTransaction) obj4;
                                                            if (t0(wallettransaction9, wallettransaction3)) {
                                                                wallettransaction7 = wallettransaction9;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    if (wallettransaction7 == null) {
                                                    }
                                                }
                                                jSONObject4 = jSONObject;
                                                arrayList10 = arrayList3;
                                                hashMap6 = hashMap2;
                                                t0Var4 = t0Var;
                                                hashSet3 = hashSet;
                                                str15 = str9;
                                                hashMap5 = hashMap;
                                                str14 = str8;
                                                wallettransaction6 = wallettransaction;
                                                i14 = 1;
                                                arrayList8 = arrayList;
                                                arrayList7 = arrayList2;
                                                optJSONArray = jSONArray;
                                                i16 = i7 + 1;
                                            }
                                        } else {
                                            hashMap4 = hashMap5;
                                        }
                                        String y10 = u0Var.y();
                                        JSONObject optJSONObject6 = optJSONObject4.optJSONObject("in_msg");
                                        arrayList6 = arrayList7;
                                        ArrayList arrayList12 = new ArrayList();
                                        t0Var2 = t0Var4;
                                        JSONArray optJSONArray2 = optJSONObject4.optJSONArray("out_msgs");
                                        hashMap3 = hashMap6;
                                        arrayList4 = arrayList8;
                                        str11 = j3;
                                        arrayList5 = arrayList10;
                                        if (optJSONArray2 != null) {
                                            int i21 = 0;
                                            i11 = 0;
                                            while (i21 < optJSONArray2.length()) {
                                                try {
                                                    JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i21);
                                                    if (optJSONObject7 != null) {
                                                        if (optJSONObject7.optBoolean("bounced")) {
                                                            jSONArray2 = optJSONArray2;
                                                            i11 = i14;
                                                        } else if (!optJSONObject7.isNull("value") && Long.parseLong(optJSONObject7.getString("value")) > 0) {
                                                            jSONArray2 = optJSONArray2;
                                                            if (!c(optJSONObject7.getString("destination"), y10)) {
                                                                arrayList12.add(optJSONObject7);
                                                            }
                                                        }
                                                        i21++;
                                                        optJSONArray2 = jSONArray2;
                                                    }
                                                    jSONArray2 = optJSONArray2;
                                                    i21++;
                                                    optJSONArray2 = jSONArray2;
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    wallettransaction2 = null;
                                                    o("stream transaction parse failed", e);
                                                    wallettransaction3 = wallettransaction2;
                                                    if (wallettransaction3 == null) {
                                                    }
                                                    jSONObject4 = jSONObject;
                                                    arrayList10 = arrayList3;
                                                    hashMap6 = hashMap2;
                                                    t0Var4 = t0Var;
                                                    hashSet3 = hashSet;
                                                    str15 = str9;
                                                    hashMap5 = hashMap;
                                                    str14 = str8;
                                                    wallettransaction6 = wallettransaction;
                                                    i14 = 1;
                                                    arrayList8 = arrayList;
                                                    arrayList7 = arrayList2;
                                                    optJSONArray = jSONArray;
                                                    i16 = i7 + 1;
                                                }
                                            }
                                        } else {
                                            i11 = 0;
                                        }
                                        boolean z12 = (i11 != 0 || optJSONObject6 == null || optJSONObject6.isNull("source") || optJSONObject6.isNull("value") || !c(optJSONObject6.getString("destination"), y10) || c(optJSONObject6.getString("source"), y10) || optJSONObject6.optBoolean("bounced") || Long.parseLong(optJSONObject6.getString("value")) <= 0 || !arrayList12.isEmpty()) ? 0 : i14;
                                        if (z12 == 0 && i11 == 0 && !optBoolean) {
                                            try {
                                                i13 = i14;
                                            } catch (Exception e14) {
                                                e = e14;
                                                wallettransaction2 = null;
                                                o("stream transaction parse failed", e);
                                                wallettransaction3 = wallettransaction2;
                                                if (wallettransaction3 == null) {
                                                }
                                                jSONObject4 = jSONObject;
                                                arrayList10 = arrayList3;
                                                hashMap6 = hashMap2;
                                                t0Var4 = t0Var;
                                                hashSet3 = hashSet;
                                                str15 = str9;
                                                hashMap5 = hashMap;
                                                str14 = str8;
                                                wallettransaction6 = wallettransaction;
                                                i14 = 1;
                                                arrayList8 = arrayList;
                                                arrayList7 = arrayList2;
                                                optJSONArray = jSONArray;
                                                i16 = i7 + 1;
                                            }
                                            if (arrayList12.size() == i13) {
                                                i12 = i13;
                                                if ((z12 == 0 || i12 != 0) && (i12 == 0 || ((optJSONObject2 = jSONObject5.optJSONObject("action")) != null && optJSONObject2.optBoolean("success") && !optJSONObject2.optBoolean("no_funds") && optJSONObject2.optInt("result_code") == 0))) {
                                                    JSONObject jSONObject6 = z12 == 0 ? optJSONObject6 : (JSONObject) arrayList12.get(0);
                                                    long parseLong2 = Long.parseLong(jSONObject6.getString("value"));
                                                    if (z12 == 0) {
                                                        jSONObject2 = optJSONObject6;
                                                        if (parseLong2 < ((org.telegram.messenger.l0) mp.u1(u0Var.a).A7.r0.b).c) {
                                                        }
                                                    } else {
                                                        jSONObject2 = optJSONObject6;
                                                    }
                                                    wallettransaction3 = new TL_wallet.walletTransaction();
                                                    j10 = t0.j(optJSONObject4);
                                                    wallettransaction3.id = j10;
                                                    if (j10 == null) {
                                                        wallettransaction3.tx_hash = optJSONObject4.getString("hash");
                                                        try {
                                                            wallettransaction3.messageHash = jSONObject6.optString("hash", null);
                                                            if (i12 != 0 && jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("message_content")) != null) {
                                                                if (jSONObject2.isNull("source")) {
                                                                    wallettransaction2 = null;
                                                                    try {
                                                                        wallettransaction3.normalMessageBodyHash = optJSONObject.optString("hash", null);
                                                                    } catch (Exception e15) {
                                                                        e = e15;
                                                                        o("stream transaction parse failed", e);
                                                                        wallettransaction3 = wallettransaction2;
                                                                        if (wallettransaction3 == null) {
                                                                        }
                                                                        jSONObject4 = jSONObject;
                                                                        arrayList10 = arrayList3;
                                                                        hashMap6 = hashMap2;
                                                                        t0Var4 = t0Var;
                                                                        hashSet3 = hashSet;
                                                                        str15 = str9;
                                                                        hashMap5 = hashMap;
                                                                        str14 = str8;
                                                                        wallettransaction6 = wallettransaction;
                                                                        i14 = 1;
                                                                        arrayList8 = arrayList;
                                                                        arrayList7 = arrayList2;
                                                                        optJSONArray = jSONArray;
                                                                        i16 = i7 + 1;
                                                                    }
                                                                } else {
                                                                    wallettransaction3.gaslessMessageBodyHash = optJSONObject.optString("hash", null);
                                                                }
                                                            }
                                                            wallettransaction3.incoming = z12;
                                                            if (z12 == 0) {
                                                                parseLong2 = -parseLong2;
                                                            }
                                                            wallettransaction3.amount = parseLong2;
                                                            wallettransaction3.date = optJSONObject4.getInt("now");
                                                            wallettransaction3.fee = Long.parseLong(optJSONObject4.getString("total_fees"));
                                                            wallettransaction3.feeUnknown = false;
                                                            wallettransaction3.failed = false;
                                                            wallettransaction3.pending = false;
                                                            wallettransaction3.phase = WalletEngine2.SendPhase.CONFIRMED;
                                                            wallettransaction3.comment_encrypted = WalletEngine2.isEncryptedComment(jSONObject6);
                                                            JSONObject optJSONObject8 = jSONObject6.optJSONObject("message_content");
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
                                                            String str21 = wallettransaction3.comment;
                                                            if (str21 != null && str21.isEmpty()) {
                                                                wallettransaction3.comment = null;
                                                            }
                                                            string = z12 != 0 ? jSONObject2.getString("source") : jSONObject6.getString("destination");
                                                            JSONObject optJSONObject10 = jSONObject4.optJSONObject("address_book");
                                                            if (optJSONObject10 != null && string != null) {
                                                                Iterator<String> keys = optJSONObject10.keys();
                                                                while (keys.hasNext()) {
                                                                    String next = keys.next();
                                                                    if (c(next, string)) {
                                                                        jSONObject3 = optJSONObject10.optJSONObject(next);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            jSONObject3 = null;
                                                            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                                            wallettransactionpeeraddress.address = jSONObject3 == null ? e0(string, false) : jSONObject3.optString("user_friendly", string);
                                                            if (jSONObject3 == null || jSONObject3.isNull("domain")) {
                                                                wallettransaction2 = null;
                                                                str13 = null;
                                                            } else {
                                                                wallettransaction2 = null;
                                                                str13 = jSONObject3.optString("domain", null);
                                                            }
                                                            wallettransactionpeeraddress.domain = str13;
                                                        } catch (Exception e16) {
                                                            e = e16;
                                                            wallettransaction2 = null;
                                                        }
                                                        if (c(wallettransactionpeeraddress.address, string)) {
                                                            wallettransaction3.peer = wallettransactionpeeraddress;
                                                            if (wallettransaction3 == null) {
                                                            }
                                                            jSONObject4 = jSONObject;
                                                            arrayList10 = arrayList3;
                                                            hashMap6 = hashMap2;
                                                            t0Var4 = t0Var;
                                                            hashSet3 = hashSet;
                                                            str15 = str9;
                                                            hashMap5 = hashMap;
                                                            str14 = str8;
                                                            wallettransaction6 = wallettransaction;
                                                            i14 = 1;
                                                            arrayList8 = arrayList;
                                                            arrayList7 = arrayList2;
                                                            optJSONArray = jSONArray;
                                                            i16 = i7 + 1;
                                                        }
                                                        wallettransaction3 = wallettransaction2;
                                                        if (wallettransaction3 == null) {
                                                        }
                                                        jSONObject4 = jSONObject;
                                                        arrayList10 = arrayList3;
                                                        hashMap6 = hashMap2;
                                                        t0Var4 = t0Var;
                                                        hashSet3 = hashSet;
                                                        str15 = str9;
                                                        hashMap5 = hashMap;
                                                        str14 = str8;
                                                        wallettransaction6 = wallettransaction;
                                                        i14 = 1;
                                                        arrayList8 = arrayList;
                                                        arrayList7 = arrayList2;
                                                        optJSONArray = jSONArray;
                                                        i16 = i7 + 1;
                                                    }
                                                }
                                                wallettransaction3 = null;
                                                wallettransaction2 = null;
                                                if (wallettransaction3 == null) {
                                                }
                                                jSONObject4 = jSONObject;
                                                arrayList10 = arrayList3;
                                                hashMap6 = hashMap2;
                                                t0Var4 = t0Var;
                                                hashSet3 = hashSet;
                                                str15 = str9;
                                                hashMap5 = hashMap;
                                                str14 = str8;
                                                wallettransaction6 = wallettransaction;
                                                i14 = 1;
                                                arrayList8 = arrayList;
                                                arrayList7 = arrayList2;
                                                optJSONArray = jSONArray;
                                                i16 = i7 + 1;
                                            }
                                        }
                                        i12 = 0;
                                        if (z12 == 0) {
                                        }
                                        if (z12 == 0) {
                                        }
                                        long parseLong22 = Long.parseLong(jSONObject6.getString("value"));
                                        if (z12 == 0) {
                                        }
                                        wallettransaction3 = new TL_wallet.walletTransaction();
                                        j10 = t0.j(optJSONObject4);
                                        wallettransaction3.id = j10;
                                        if (j10 == null) {
                                        }
                                    }
                                }
                                hashMap3 = hashMap6;
                                str11 = j3;
                                t0Var2 = t0Var4;
                                arrayList4 = arrayList8;
                                hashMap4 = hashMap5;
                                arrayList5 = arrayList10;
                                arrayList6 = arrayList7;
                                hashSet2 = hashSet3;
                                wallettransaction3 = null;
                                wallettransaction2 = null;
                                if (wallettransaction3 == null) {
                                }
                                jSONObject4 = jSONObject;
                                arrayList10 = arrayList3;
                                hashMap6 = hashMap2;
                                t0Var4 = t0Var;
                                hashSet3 = hashSet;
                                str15 = str9;
                                hashMap5 = hashMap;
                                str14 = str8;
                                wallettransaction6 = wallettransaction;
                                i14 = 1;
                                arrayList8 = arrayList;
                                arrayList7 = arrayList2;
                                optJSONArray = jSONArray;
                                i16 = i7 + 1;
                            }
                        }
                    } else {
                        str8 = str14;
                        i7 = i16;
                    }
                    arrayList = arrayList8;
                    wallettransaction = wallettransaction6;
                    jSONArray = optJSONArray;
                    arrayList2 = arrayList7;
                    str9 = str15;
                    t0Var = t0Var4;
                    hashMap = hashMap5;
                    hashSet = hashSet3;
                    hashMap2 = hashMap6;
                    arrayList3 = arrayList10;
                    jSONObject4 = jSONObject;
                    arrayList10 = arrayList3;
                    hashMap6 = hashMap2;
                    t0Var4 = t0Var;
                    hashSet3 = hashSet;
                    str15 = str9;
                    hashMap5 = hashMap;
                    str14 = str8;
                    wallettransaction6 = wallettransaction;
                    i14 = 1;
                    arrayList8 = arrayList;
                    arrayList7 = arrayList2;
                    optJSONArray = jSONArray;
                    i16 = i7 + 1;
                }
                t0 t0Var5 = t0Var4;
                TL_wallet.walletTransaction wallettransaction10 = wallettransaction6;
                HashMap hashMap7 = hashMap6;
                ArrayList arrayList13 = arrayList10;
                if (wallettransaction10 != null) {
                    int size6 = arrayList13.size();
                    int i22 = 0;
                    while (i22 < size6) {
                        Object obj5 = arrayList13.get(i22);
                        i22++;
                        String str22 = (String) obj5;
                        TL_wallet.walletTransaction wallettransaction11 = wallettransaction10;
                        if (!hashMap7.containsKey(str22)) {
                            hashMap7.put(str22, wallettransaction11);
                        }
                        wallettransaction10 = wallettransaction11;
                    }
                }
                if (z11) {
                    t0Var5.k();
                    t0Var5.i();
                }
                str4 = str6;
                str5 = str7;
            }
            str6 = optString3;
            str2 = "finalized";
            str7 = "confirmed";
            str4 = str6;
            str5 = str7;
        } else {
            str = optString2;
            str2 = "finalized";
            str3 = "trace_invalidated";
            str4 = optString3;
            str5 = "confirmed";
        }
        if (!str5.equals(str4) && !str2.equals(str4)) {
            if (!str3.equals(str)) {
                return;
            }
        }
        h hVar2 = this.H;
        org.telegram.messenger.g0.r(hVar2);
        org.telegram.messenger.g0.h3(hVar2, 250L);
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
        z0 z0Var = this.c;
        if (z0Var != null && !TextUtils.equals(z0Var.c, str)) {
            if (str == null) {
                P("received empty state, leaving wallet storage of " + this.c.c);
            } else {
                StringBuilder u10 = a8.p0.u("received new state of ", str, ", leaving wallet storage of ");
                u10.append(this.c.c);
                P(u10.toString());
            }
            this.c = null;
        }
        if (!TextUtils.isEmpty(str) && this.c == null) {
            P("setting up wallet storage of " + str);
            this.c = new z0(this.a, org.telegram.messenger.t0.b, str);
            P("storage public keys = " + this.c.n().length);
        }
        l0 l0Var = this.o;
        if (l0Var != null && !TextUtils.equals(l0Var.e, str)) {
            l0Var.e = str;
            l0Var.c();
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
                int i7 = this.a;
                this.d = str;
                this.b = new WalletEngine2(i7, str, bArr);
            } catch (Exception e10) {
                o("failed to create engine!", e10);
                this.d = null;
            }
        }
        int i10 = 0;
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null) {
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Runnable runnable = (Runnable) ((WeakReference) obj).get();
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                }
            }
            this.w.clear();
        }
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null && this.f != null) {
            ArrayList arrayList2 = this.x;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    org.telegram.messenger.g0.g3(runnable2);
                }
            }
            this.x.clear();
        }
        if (!TextUtils.equals(this.L, str)) {
            f0();
        }
        a0();
    }

    public final void W(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (TextUtils.isEmpty(str) || r0(str) == null) {
            return;
        }
        ArrayList arrayList = this.p;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
            String str2 = wallettransaction.messageHash;
            String str3 = tL_updateSentWalletTransaction.msg_hash;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && l0(str2, str3)) {
                e(wallettransaction, tL_updateSentWalletTransaction);
                return;
            }
        }
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            wallettransaction2.messageHash = tL_updateSentWalletTransaction.msg_hash;
            wallettransaction2.gasless = tL_updateSentWalletTransaction.gasless;
            wallettransaction2.pending = false;
            arrayList.add(0, wallettransaction2);
            H().k();
            H().i();
        }
    }

    public final void X(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f = tL_updateWalletGaslessInfo;
        V();
        T();
    }

    public final void Y(TL_update.TL_updateWalletState tL_updateWalletState) {
        w0(tL_updateWalletState.state);
    }

    public final void Z() {
        q0();
        this.p.clear();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            r0 r0Var = ((n0) obj).b;
            if (r0Var != null) {
                r0Var.close();
            }
        }
        arrayList.clear();
        t0 t0Var = this.n;
        if (t0Var != null) {
            t0Var.a();
            t0Var.b.clear();
            t0Var.d.clear();
            t0Var.e.clear();
            t0Var.f.clear();
            t0Var.g = "";
            t0Var.h = false;
            t0Var.k();
            this.n.k();
            this.n.i();
        }
        a0();
        this.f = null;
        g0();
    }

    public final void a0() {
        if (!TextUtils.equals(this.v, y())) {
            q0();
            this.v = y();
        }
        if (!N() || TextUtils.isEmpty(y())) {
            q0();
        } else {
            HashMap hashMap = this.u;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((x0) hashMap.get(wallettransaction)).b, wallettransaction.messageHash)) {
                    ((x0) hashMap.remove(wallettransaction)).c();
                }
            }
            ArrayList arrayList2 = this.p;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    String y10 = y();
                    x0 x0Var = new x0(this.a, str, y10, new l(this, wallettransaction2), new l(this, wallettransaction2));
                    hashMap.put(wallettransaction2, x0Var);
                    if (!x0Var.f && !TextUtils.isEmpty(str)) {
                        x0Var.f = true;
                        x0Var.h = 0;
                        x0Var.b();
                        if (!TextUtils.isEmpty(y10)) {
                            org.telegram.messenger.g0.h3(x0Var.m, 8000L);
                        }
                    }
                }
            }
        }
        boolean z10 = (!N() || TextUtils.isEmpty(y()) || this.G.isEmpty()) ? false : true;
        i1 i1Var = this.t;
        boolean z11 = i1Var != null && i1Var.d;
        if (z11 == z10 && (!z11 || i1Var == null || TextUtils.equals(i1Var.b, y()))) {
            return;
        }
        if (!z10) {
            i1 i1Var2 = this.t;
            if (i1Var2 != null) {
                i1Var2.h();
            }
            org.telegram.messenger.g0.r(this.H);
            return;
        }
        i1 i1Var3 = this.t;
        if (i1Var3 != null && !TextUtils.equals(i1Var3.b, y())) {
            this.t.h();
            this.t = null;
        }
        if (this.t == null) {
            this.t = new i1(this.a, y(), this);
        }
        i1 i1Var4 = this.t;
        boolean z12 = i1Var4.d;
        if (z12) {
            return;
        }
        String str2 = i1Var4.b;
        if (z12 || TextUtils.isEmpty(str2)) {
            i1Var4.d("start ignored: running=" + i1Var4.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
            return;
        }
        i1Var4.d("starting; address=" + str2);
        i1Var4.d = true;
        i1Var4.j = 0;
        i1Var4.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.nftItem nftitem;
        int size;
        l0 l0Var;
        wallettransaction.id = wallettransaction2.id;
        wallettransaction.incoming = wallettransaction2.incoming;
        wallettransaction.gasless = wallettransaction2.gasless;
        wallettransaction.failed = wallettransaction2.failed;
        wallettransaction.key_change = wallettransaction2.key_change;
        wallettransaction.comment_encrypted = wallettransaction2.comment_encrypted;
        boolean z10 = false;
        wallettransaction.comment_encrypted_preparing = false;
        wallettransaction.amount = wallettransaction2.amount;
        wallettransaction.fee = wallettransaction2.fee;
        wallettransaction.date = wallettransaction2.date;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if ((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift) && !(wallettransaction2.peer instanceof TL_wallet.walletTransactionPeerOnchainGift)) {
            z10 = true;
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction2.peer;
        if (walletTransactionPeer2 != null && walletTransactionPeer != null && c(walletTransactionPeer.address, walletTransactionPeer2.address)) {
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
                } else if (z10) {
                    wallettransaction.nft = null;
                }
                ArrayList arrayList = this.p;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) arrayList.get(size);
                    if (wallettransaction3 != wallettransaction && !wallettransaction3.pending && !TextUtils.isEmpty(wallettransaction2.id) && TextUtils.equals(wallettransaction3.id, wallettransaction2.id)) {
                        arrayList.remove(size);
                    }
                }
                h(wallettransaction, !wallettransaction2.failed, wallettransaction2.tx_hash);
                if (wallettransaction.nft != null || (l0Var = this.o) == null) {
                }
                l0.a(l0Var, wallettransaction);
                this.o.e();
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
        h(wallettransaction, !wallettransaction2.failed, wallettransaction2.tx_hash);
        if (wallettransaction.nft != null) {
        }
    }

    public final void d0(r0 r0Var, boolean z10, q10 q10Var) {
        r0 b10 = r0Var.b();
        P("requesting proof challenge");
        ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getProofChallenge(), new d3.b(1), new c0(this, b10, q10Var, z10, 0));
    }

    public final void e(TL_wallet.walletTransaction wallettransaction, TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        wallettransaction.messageHash = tL_updateSentWalletTransaction.msg_hash;
        wallettransaction.gasless = tL_updateSentWalletTransaction.gasless;
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            d(wallettransaction, wallettransaction2);
        } else {
            a0();
        }
    }

    public final boolean f() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled) {
            return true;
        }
        z0 z0Var = this.c;
        return z0Var != null && z0Var.f(tL_walletState.public_key);
    }

    public final void f0() {
        int i7;
        this.L = y();
        ArrayList o4 = z0.o(org.telegram.messenger.t0.b, j10.i(this.a).e());
        o4.remove(this.L);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            q0 q0Var = (q0) obj;
            hashMap.put(q0Var.a, q0Var);
        }
        this.J.clear();
        int size2 = o4.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = o4.get(i11);
            i11++;
            String str = (String) obj2;
            q0 q0Var2 = (q0) hashMap.get(str);
            if (q0Var2 == null) {
                q0Var2 = new q0(new z0(this.a, org.telegram.messenger.t0.b, str));
            }
            z0 z0Var = q0Var2.f;
            synchronized (z0.g) {
                try {
                    try {
                        i7 = z0Var.s().b;
                    } catch (Exception e10) {
                        z0Var.m(e10);
                        i7 = 0;
                    }
                } finally {
                }
            }
            q0Var2.b = i7;
            this.J.add(q0Var2);
            z(str, null);
            v0((j0) this.Q.get(str));
        }
        Collections.sort(this.J, new qw0(4));
    }

    public final boolean g() {
        z0 z0Var;
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        return !tL_walletState.backup_enabled && ((z0Var = this.c) == null || !z0Var.f(tL_walletState.public_key));
    }

    public final void g0() {
        P("requesting gasless info");
        this.D = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new d3.b(1), new i(this, 2));
    }

    public final void h(TL_wallet.walletTransaction wallettransaction, boolean z10, String str) {
        n0 n0Var;
        if (wallettransaction.pending) {
            t0 H = H();
            wallettransaction.failed = !z10;
            int i7 = 0;
            wallettransaction.pending = false;
            if (!TextUtils.isEmpty(str)) {
                wallettransaction.tx_hash = str;
            }
            if (wallettransaction.key_change) {
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                while (true) {
                    if (i7 >= size) {
                        n0Var = null;
                        break;
                    }
                    Object obj = arrayList.get(i7);
                    i7++;
                    n0Var = (n0) obj;
                    if (TextUtils.equals(n0Var.a, wallettransaction.messageHash)) {
                        break;
                    }
                }
                if (n0Var != null) {
                    if (z10) {
                        n0Var.a();
                    } else {
                        r0 r0Var = n0Var.b;
                        if (r0Var != null) {
                            r0Var.close();
                        }
                    }
                    arrayList.remove(n0Var);
                }
            }
            x10 x10Var = (x10) this.q.remove(wallettransaction);
            if (x10Var != null) {
                x10Var.a(Boolean.valueOf(z10));
            }
            P("completed pending transaction: msg_hash=" + wallettransaction.messageHash + ", body_hash=" + wallettransaction.gaslessMessageBodyHash + ", transaction_id=" + wallettransaction.id + ", tx_hash=" + wallettransaction.tx_hash + ", success=" + z10);
            H.k();
            H.i();
            a0();
        }
    }

    public final void h0() {
        P("requesting state");
        this.C = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getState(), new d3.b(1), new i(this, 1));
    }

    public final void i0(q10 q10Var, String str) {
        if (str == null) {
            q10Var.a(null, null);
            return;
        }
        HashMap hashMap = this.P;
        if (hashMap.containsKey(str)) {
            q10Var.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.a).sendRequestTyped(getuseraddresses, new d3.b(1), new j((Object) this, (Object) str, (Object) q10Var, 0));
    }

    public final void j0(TLRPC.User user, q10 q10Var) {
        if (user == null) {
            q10Var.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.id);
        HashMap hashMap = this.O;
        if (hashMap.containsKey(valueOf)) {
            q10Var.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.id;
        int i7 = this.a;
        arrayList.add(mp.u1(i7).s1(user));
        ConnectionsManager.getInstance(i7).sendRequestTyped(getuseraddresses, new d3.b(1), new j(this, (Object) q10Var, (Object) user, 1));
    }

    public final Runnable k(TL_stars.starGiftDepositPayload stargiftdepositpayload, q10 q10Var) {
        try {
            boolean[] zArr = new boolean[1];
            x0(new x(this, zArr, q10Var, j(stargiftdepositpayload), 1));
            return new y(1, zArr);
        } catch (Exception e10) {
            o("emulateDepositNFT: invalid payload", e10);
            org.telegram.messenger.g0.g3(new w(q10Var, e10, 1));
            return new cd0(8);
        }
    }

    public final void k0(String str, x10 x10Var) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        int i7 = 1;
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z10 = org.telegram.ui.web.v0.R0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i10 = this.a;
        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(i7), new bi.m6(this, str, x10Var), mp.u1(i10).Q3, 0);
    }

    public final Runnable l(p0 p0Var, q10 q10Var) {
        try {
            boolean[] zArr = new boolean[1];
            x0(new x(this, zArr, q10Var, c0(p0Var), 0));
            return new y(0, zArr);
        } catch (Exception e10) {
            o("emulatePreparedMessage: invalid message", e10);
            org.telegram.messenger.g0.g3(new w(q10Var, e10, 0));
            return new cd0(8);
        }
    }

    public final m m(String str, long j3, String str2, byte[] bArr, q10 q10Var) {
        g0 g0Var = new g0(this, str, j3, str2, bArr, q10Var);
        x0(g0Var);
        return new m(g0Var, 0);
    }

    public final void m0(TLRPC.User user, String str, long j3, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, x10 x10Var, x10 x10Var2) {
        n0(user, str, j3, str2, bArr, nftitem, str3, x10Var, x10Var2, null, null, null);
    }

    public final void n0(TLRPC.User user, String str, long j3, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, x10 x10Var, x10 x10Var2, k2 k2Var, k2 k2Var2, p0 p0Var) {
        String y10 = y();
        P("send to " + str + ", amount " + j3 + ", when ready...");
        x0(new n(this, str, x10Var, nftitem, y10, str2, bArr, j3, p0Var, k2Var, user, str3, x10Var2, k2Var2, 0));
    }

    public final void o0(p0 p0Var, x10 x10Var, x10 x10Var2, Runnable runnable) {
        k2 c02;
        try {
            k2 c03 = c0(p0Var);
            String str = ((j2) c03.b.get(0)).a;
            p0 p0Var2 = p0Var.f;
            if (p0Var2 != null) {
                try {
                    c02 = c0(p0Var2);
                } catch (Exception e10) {
                    o("sendPreparedMessage: invalid gasless message, sending the normal one", e10);
                }
                n0(null, str, p0Var.b, null, null, null, null, x10Var, new o(this, x10Var2, runnable, 1), c03, c02, p0Var);
            }
            c02 = null;
            n0(null, str, p0Var.b, null, null, null, null, x10Var, new o(this, x10Var2, runnable, 1), c03, c02, p0Var);
        } catch (Exception e11) {
            o("sendPreparedMessage: invalid message", e11);
            x10Var.a(e11.getMessage() == null ? "NULL_ERROR" : e11.getMessage());
        }
    }

    public final void q0() {
        HashMap hashMap = this.u;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).c();
        }
        hashMap.clear();
    }

    public final CharSequence r(long j3, boolean z10) {
        BigDecimal scale;
        int i7;
        g gVar = this.h;
        String g10 = gVar.g();
        TL_wallet.currencyRate j10 = gVar.j();
        if (j10 != null) {
            String str = j10.symbol;
            String str2 = j10.thousandsSeparator;
            String str3 = j10.decimalSeparator;
            boolean z11 = j10.symbolLeft;
            boolean z12 = j10.spaceBetween;
            boolean z13 = j10.dropZeros;
            int i10 = j10.exp;
            double d = j10.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d2 = d * ((org.telegram.messenger.i0) mp.u1(this.a).A7.l.b).a;
                int max = Math.max(0, Math.min(i10, 20));
                BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(BigDecimal.valueOf(d2)).movePointLeft(9);
                if (!z10 || movePointLeft.signum() == 0) {
                    scale = movePointLeft.setScale(max, RoundingMode.HALF_UP);
                    i7 = max;
                } else {
                    BigDecimal round = movePointLeft.round(new MathContext(3, RoundingMode.HALF_UP));
                    scale = round.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : round.stripTrailingZeros();
                    i7 = Math.max(max, Math.min(20, Math.max(0, scale.scale())));
                }
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z14 = !isEmpty;
                if (!isEmpty) {
                    decimalFormatSymbols.setGroupingSeparator(str2.charAt(0));
                }
                decimalFormatSymbols.setDecimalSeparator(TextUtils.isEmpty(str3) ? '.' : str3.charAt(0));
                DecimalFormat decimalFormat = new DecimalFormat("#,##0", decimalFormatSymbols);
                decimalFormat.setGroupingUsed(z14);
                if (z13) {
                    max = 0;
                }
                decimalFormat.setMinimumFractionDigits(max);
                decimalFormat.setMaximumFractionDigits(i7);
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                boolean z15 = scale.signum() < 0;
                String format = decimalFormat.format(scale.abs());
                if (!TextUtils.isEmpty(str)) {
                    g10 = str;
                }
                String str4 = z12 ? " " : "";
                String E = z11 ? a8.p0.E(g10, str4, format) : a8.p0.E(format, str4, g10);
                if (z15) {
                    E = p5.c.k("-", E);
                }
                int indexOf = E.indexOf(8387);
                if (indexOf < 0) {
                    return E;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(E);
                spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                return spannableStringBuilder;
            }
        }
        return "";
    }

    public final void v0(j0 j0Var) {
        if (j0Var == null) {
            return;
        }
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            q0 q0Var = (q0) obj;
            if (TextUtils.equals(q0Var.a, j0Var.a)) {
                q0Var.c = j0Var.b;
                q0Var.d = !j0Var.e;
                byte[] bArr = j0Var.c;
                q0Var.e = (bArr == null || bArr.length <= 0 || q0Var.f.f(bArr)) ? false : true;
            }
        }
    }

    public final void w0(TL_wallet.WalletState walletState) {
        boolean z10;
        t0 t0Var;
        if (walletState == null) {
            return;
        }
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.WalletState walletState2 = this.e;
            if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                z10 = true;
                this.e = walletState;
                V();
                T();
                if (z10 || (t0Var = this.n) == null) {
                }
                t0Var.g();
                return;
            }
        }
        z10 = false;
        this.e = walletState;
        V();
        T();
        if (z10) {
        }
    }

    public final void x0(Runnable runnable) {
        if (N()) {
            runnable.run();
        } else {
            this.w.add(new WeakReference(runnable));
        }
    }

    public final String y() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).address;
        }
        return null;
    }

    public final j0 z(final String str, r rVar) {
        HashMap hashMap = this.Q;
        j0 j0Var = (j0) hashMap.get(str);
        if (j0Var != null && !j0Var.e) {
            if (rVar != null) {
                j0Var.f.add(rVar);
            }
            return null;
        }
        int i7 = this.a;
        if (j0Var != null && j0Var.e && ConnectionsManager.getInstance(i7).getCurrentTime() < j0Var.d + ks.X4) {
            if (rVar != null) {
                rVar.a(j0Var);
            }
            return j0Var;
        }
        final j0 j0Var2 = new j0();
        j0Var2.b = -1L;
        ArrayList arrayList = new ArrayList();
        j0Var2.f = arrayList;
        j0Var2.a = str;
        j0Var2.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (rVar != null) {
            arrayList.add(rVar);
        }
        hashMap.put(str, j0Var2);
        final int i10 = 0;
        final int i11 = 1;
        Utilities.B(new p(this, str, j0Var2, i10), new x10(this) { // from class: org.telegram.ui.Wallet.q
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.x10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/walletInformation";
                        StringBuilder sb2 = new StringBuilder("address=");
                        String str2 = str;
                        sb2.append(Uri.encode(str2));
                        sb2.append("&use_v2=false");
                        performapirequest.query = sb2.toString();
                        u0 u0Var = this.b;
                        int i12 = u0Var.a;
                        ConnectionsManager.getInstance(i12).sendRequestTyped(performapirequest, new d3.b(1), new s(u0Var, j0Var2, str2, runnable, 0), mp.u1(i12).Q3, 0);
                        break;
                    default:
                        u0 u0Var2 = this.b;
                        j0 j0Var3 = j0Var2;
                        String str3 = str;
                        u0Var2.k0(str3, new r(u0Var2, j0Var3, str3, (Runnable) obj));
                        break;
                }
            }
        }, new x10(this) { // from class: org.telegram.ui.Wallet.q
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.x10
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/walletInformation";
                        StringBuilder sb2 = new StringBuilder("address=");
                        String str2 = str;
                        sb2.append(Uri.encode(str2));
                        sb2.append("&use_v2=false");
                        performapirequest.query = sb2.toString();
                        u0 u0Var = this.b;
                        int i12 = u0Var.a;
                        ConnectionsManager.getInstance(i12).sendRequestTyped(performapirequest, new d3.b(1), new s(u0Var, j0Var2, str2, runnable, 0), mp.u1(i12).Q3, 0);
                        break;
                    default:
                        u0 u0Var2 = this.b;
                        j0 j0Var3 = j0Var2;
                        String str3 = str;
                        u0Var2.k0(str3, new r(u0Var2, j0Var3, str3, (Runnable) obj));
                        break;
                }
            }
        });
        return null;
    }
}
