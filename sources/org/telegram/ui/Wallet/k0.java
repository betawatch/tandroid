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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.x41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.aa0;
import org.telegram.ui.ep0;
import org.telegram.ui.ex0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k0 {
    public static volatile k0[] O = new k0[4];
    public static final long[] P = {1500, 2500, 4000, 6000, 10000, 15000, 20000};
    public static final LruCache Q = new LruCache(TLObject.FLAG_12);
    public static DecimalFormat R;
    public int C;
    public final h F;
    public final ArrayList G;
    public final List H;
    public String I;
    public final h J;
    public final HashMap K;
    public final HashMap L;
    public final HashMap M;
    public final HashMap N;
    public final int a;
    public WalletEngine2 b;
    public p0 c;
    public String d;
    public TL_wallet.WalletState e;
    public TL_update.TL_updateWalletGaslessInfo f;
    public final e2 g;
    public final f h;
    public Boolean i;
    public String j;
    public long k;
    public boolean l;
    public boolean m;
    public j0 n;
    public c0 o;
    public z0 s;
    public String u;
    public String x;
    public int y;
    public final h z;
    public final ArrayList p = new ArrayList();
    public final HashMap q = new HashMap();
    public final ArrayList r = new ArrayList();
    public final HashMap t = new HashMap();
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public int A = -1;
    public int B = -1;
    public int D = 0;
    public final HashSet E = new HashSet();

    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.ui.Wallet.h] */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.telegram.ui.Wallet.h] */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.ui.Wallet.h] */
    public k0(int i10) {
        final int i11 = 0;
        this.z = new Runnable(this) { // from class: org.telegram.ui.Wallet.h
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c0 c0Var;
                j0 j0Var;
                TL_wallet.nftItem nftitem;
                switch (i11) {
                    case 0:
                        k0 k0Var = this.b;
                        if (!TextUtils.isEmpty(k0Var.x) && (c0Var = k0Var.o) != null && c0Var.d(k0Var.x) && (j0Var = k0Var.n) != null) {
                            ArrayList arrayList = j0Var.b;
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, k0Var.x)) {
                                    break;
                                }
                            }
                        }
                        if (k0Var.o == null) {
                            k0Var.o = new c0(k0Var);
                        }
                        c0 c0Var2 = k0Var.o;
                        if (!c0Var2.j) {
                            c0Var2.b();
                            c0Var2.f(true);
                        }
                        k0Var.B().g();
                        k0Var.E();
                        int i13 = k0Var.y;
                        long[] jArr = k0.P;
                        if (i13 < 7) {
                            h hVar = k0Var.z;
                            k0Var.y = i13 + 1;
                            org.telegram.messenger.i0.h3(hVar, jArr[i13]);
                            break;
                        }
                        break;
                    case 1:
                        k0 k0Var2 = this.b;
                        z0 z0Var = k0Var2.s;
                        if (z0Var != null && z0Var.d) {
                            k0Var2.E();
                            break;
                        }
                        break;
                    default:
                        k0 k0Var3 = this.b;
                        k0Var3.W();
                        k0Var3.L();
                        break;
                }
            }
        };
        this.C = -1;
        final int i12 = 1;
        this.F = new Runnable(this) { // from class: org.telegram.ui.Wallet.h
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c0 c0Var;
                j0 j0Var;
                TL_wallet.nftItem nftitem;
                switch (i12) {
                    case 0:
                        k0 k0Var = this.b;
                        if (!TextUtils.isEmpty(k0Var.x) && (c0Var = k0Var.o) != null && c0Var.d(k0Var.x) && (j0Var = k0Var.n) != null) {
                            ArrayList arrayList = j0Var.b;
                            int size = arrayList.size();
                            int i122 = 0;
                            while (i122 < size) {
                                Object obj = arrayList.get(i122);
                                i122++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, k0Var.x)) {
                                    break;
                                }
                            }
                        }
                        if (k0Var.o == null) {
                            k0Var.o = new c0(k0Var);
                        }
                        c0 c0Var2 = k0Var.o;
                        if (!c0Var2.j) {
                            c0Var2.b();
                            c0Var2.f(true);
                        }
                        k0Var.B().g();
                        k0Var.E();
                        int i13 = k0Var.y;
                        long[] jArr = k0.P;
                        if (i13 < 7) {
                            h hVar = k0Var.z;
                            k0Var.y = i13 + 1;
                            org.telegram.messenger.i0.h3(hVar, jArr[i13]);
                            break;
                        }
                        break;
                    case 1:
                        k0 k0Var2 = this.b;
                        z0 z0Var = k0Var2.s;
                        if (z0Var != null && z0Var.d) {
                            k0Var2.E();
                            break;
                        }
                        break;
                    default:
                        k0 k0Var3 = this.b;
                        k0Var3.W();
                        k0Var3.L();
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = DesugarCollections.unmodifiableList(arrayList);
        final int i13 = 2;
        this.J = new Runnable(this) { // from class: org.telegram.ui.Wallet.h
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c0 c0Var;
                j0 j0Var;
                TL_wallet.nftItem nftitem;
                switch (i13) {
                    case 0:
                        k0 k0Var = this.b;
                        if (!TextUtils.isEmpty(k0Var.x) && (c0Var = k0Var.o) != null && c0Var.d(k0Var.x) && (j0Var = k0Var.n) != null) {
                            ArrayList arrayList2 = j0Var.b;
                            int size = arrayList2.size();
                            int i122 = 0;
                            while (i122 < size) {
                                Object obj = arrayList2.get(i122);
                                i122++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, k0Var.x)) {
                                    break;
                                }
                            }
                        }
                        if (k0Var.o == null) {
                            k0Var.o = new c0(k0Var);
                        }
                        c0 c0Var2 = k0Var.o;
                        if (!c0Var2.j) {
                            c0Var2.b();
                            c0Var2.f(true);
                        }
                        k0Var.B().g();
                        k0Var.E();
                        int i132 = k0Var.y;
                        long[] jArr = k0.P;
                        if (i132 < 7) {
                            h hVar = k0Var.z;
                            k0Var.y = i132 + 1;
                            org.telegram.messenger.i0.h3(hVar, jArr[i132]);
                            break;
                        }
                        break;
                    case 1:
                        k0 k0Var2 = this.b;
                        z0 z0Var = k0Var2.s;
                        if (z0Var != null && z0Var.d) {
                            k0Var2.E();
                            break;
                        }
                        break;
                    default:
                        k0 k0Var3 = this.b;
                        k0Var3.W();
                        k0Var3.L();
                        break;
                }
            }
        };
        this.K = new HashMap();
        this.L = new HashMap();
        this.M = new HashMap();
        this.N = new HashMap();
        this.a = i10;
        try {
            this.m = w().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e) {
            k("failed to load prefs", e);
        }
        this.h = new f(this);
        Y();
        X();
        H("requesting has walt balance");
        this.C = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new a3.b(i12), new i(this, i11));
        this.g = new e2(this);
        h hVar = this.J;
        Object obj = p0.f;
        synchronized (p0.class) {
            try {
                Iterator it = p0.i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        p0.i.remove(weakReference);
                    } else if (runnable == hVar) {
                        i11 = 1;
                    }
                }
                if (hVar != null && i11 == 0) {
                    p0.i.add(new WeakReference(hVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        W();
    }

    public static TL_update.TL_updateSentWalletTransaction A(TLRPC.Updates updates) {
        if (updates == null) {
            return null;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateSentWalletTransaction) {
            return (TL_update.TL_updateSentWalletTransaction) update;
        }
        ArrayList<TLRPC.Update> arrayList = updates.updates;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Update update2 = arrayList.get(i10);
            i10++;
            TLRPC.Update update3 = update2;
            if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                return (TL_update.TL_updateSentWalletTransaction) update3;
            }
        }
        return null;
    }

    public static void D(IdentityHashMap identityHashMap, HashMap hashMap, int i10, TL_wallet.walletTransaction wallettransaction, boolean z10) {
        TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
        if (z10) {
            if (treeSet == null) {
                treeSet = new TreeSet();
                identityHashMap.put(wallettransaction, treeSet);
            }
            treeSet.add(Integer.valueOf(i10));
        } else if (treeSet != null) {
            treeSet.remove(Integer.valueOf(i10));
        }
        ArrayList h02 = h0(wallettransaction);
        int size = h02.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = h02.get(i11);
            i11++;
            String str = (String) obj;
            TreeSet treeSet2 = (TreeSet) hashMap.get(str);
            if (z10) {
                if (treeSet2 == null) {
                    treeSet2 = new TreeSet();
                    hashMap.put(str, treeSet2);
                }
                treeSet2.add(Integer.valueOf(i10));
            } else if (treeSet2 != null) {
                treeSet2.remove(Integer.valueOf(i10));
            }
        }
    }

    public static void H(String str) {
        org.telegram.messenger.f8.b("[gram-wallet] " + str);
    }

    public static boolean I(jj jjVar, TL_wallet.walletTransaction wallettransaction) {
        if (jjVar != null && jjVar.k != null && wallettransaction != null && jjVar.P3()) {
            TLRPC.Message message = jjVar.k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j10 = wallettransaction.random_id;
                if (j10 != 0 && message.random_id == j10) {
                    return true;
                }
                if (wallettransaction.localMessageId != 0 && jjVar.f1() == wallettransaction.localMessageId) {
                    return true;
                }
                if (!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer.transaction_id)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] T(byte[] bArr) {
        byte[] bArr2 = new byte[zs.s3];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z10 = false;
            int i10 = 0;
            for (byte b10 : bArr) {
                if (h0.e(b10)) {
                    z10 = i10 > 0;
                } else {
                    if (z10) {
                        if (i10 == 215) {
                            throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                        }
                        int i11 = i10 + 1;
                        bArr2[i10] = 32;
                        i10 = i11;
                        z10 = false;
                    }
                    if (i10 == 215) {
                        throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                    }
                    bArr2[i10] = b10;
                    i10++;
                }
            }
            return bArr2;
        } catch (RuntimeException e) {
            Arrays.fill(bArr2, (byte) 0);
            throw e;
        }
    }

    public static String V(String str, boolean z10) {
        try {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int parseInt = Integer.parseInt(str.substring(0, indexOf));
                String substring = str.substring(indexOf + 1);
                if (substring.length() == 64) {
                    byte[] bArr = new byte[36];
                    bArr[0] = z10 ? (byte) 17 : (byte) 81;
                    bArr[1] = (byte) parseInt;
                    for (int i10 = 0; i10 < 32; i10++) {
                        int i11 = i10 * 2;
                        bArr[i10 + 2] = (byte) Integer.parseInt(substring.substring(i11, i11 + 2), 16);
                    }
                    int i12 = 0;
                    for (int i13 = 0; i13 < 34; i13++) {
                        i12 ^= (bArr[i13] & 255) << 8;
                        for (int i14 = 0; i14 < 8; i14++) {
                            int i15 = 32768 & i12;
                            int i16 = i12 << 1;
                            if (i15 != 0) {
                                i16 ^= 4129;
                            }
                            i12 = i16 & 65535;
                        }
                    }
                    bArr[34] = (byte) (i12 >>> 8);
                    bArr[35] = (byte) i12;
                    return Base64.encodeToString(bArr, 11);
                }
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static void a(ArrayList arrayList, char c10, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String g02 = g0(str);
        if (g02 != null) {
            str2 = c10 + "x" + g02;
        } else {
            str2 = c10 + "r" + str;
        }
        arrayList.add(str2);
    }

    public static boolean b(String str, String str2) {
        String j02 = j0(str);
        return j02 != null && j02.equals(j0(str2));
    }

    public static boolean c0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            String g02 = g0(str);
            if (g02 != null && g02.equals(g0(str2))) {
                return true;
            }
        }
        return false;
    }

    public static byte[][] e0(byte[] bArr, SecureRandom secureRandom) {
        if (bArr.length != 215) {
            throw new IllegalArgumentException("INVALID_MNEMONIC_BACKUP_SIZE");
        }
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, zs.s3);
        try {
            secureRandom.nextBytes(bArr2[0]);
            secureRandom.nextBytes(bArr2[1]);
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr2[2][i10] = (byte) ((bArr[i10] ^ bArr2[0][i10]) ^ bArr2[1][i10]);
            }
            return bArr2;
        } catch (RuntimeException e) {
            for (byte[] bArr3 : bArr2) {
                Arrays.fill(bArr3, (byte) 0);
            }
            throw e;
        }
    }

    public static TL_wallet.WalletTransactionPeer g(TLRPC.User user, String str, String str2) {
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

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(5:9|(2:11|(1:16))|29|30|31)|32|33|34|35|(4:37|(1:39)|40|41)|31) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String g0(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LruCache lruCache = Q;
        String str2 = (String) lruCache.get(str);
        if (str2 == null) {
            str2 = "";
            if (str.length() == 64) {
                for (0; i10 < 64; i10 + 1) {
                    char charAt = str.charAt(i10);
                    i10 = ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f') || (charAt >= 'A' && charAt <= 'F')) ? i10 + 1 : 0;
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

    public static d2 h(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        return new d2(new JSONObject().put("messages", new JSONArray().put(new JSONObject().put("address", stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? V(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static ArrayList h0(TL_wallet.walletTransaction wallettransaction) {
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

    public static boolean i0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, wallettransaction2.id)) || c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || c0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            return true;
        }
        if (wallettransaction.incoming || wallettransaction2.incoming) {
            return false;
        }
        return c0(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) || c0(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash);
    }

    public static void j(String str) {
        org.telegram.messenger.f8.d("[gram-wallet] " + str);
    }

    public static String j0(String str) {
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
            for (int i10 = 2; i10 < 34; i10++) {
                sb2.append(Character.forDigit((decode[i10] >> 4) & 15, 16));
                sb2.append(Character.forDigit(decode[i10] & 15, 16));
            }
            return sb2.toString();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void k(String str, Throwable th2) {
        org.telegram.messenger.f8.e("[gram-wallet] " + str, th2);
    }

    public static SpannableStringBuilder l(String str, CharSequence charSequence, int i10) {
        String replace = charSequence.toString().replace((char) 8211, '-');
        String L0 = cd.L0(i10, null);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                L0 = cd.J0((int) ((parseLong < -2147483647L || parseLong > 2147483647L) ? Math.abs(parseLong % 100) + 100 : Math.abs(parseLong)), str);
            } catch (NumberFormatException unused) {
            }
        }
        return org.telegram.messenger.i0.J2(L0, charSequence, "%1$s");
    }

    public static SpannableStringBuilder n(long j10, boolean z10) {
        return l("GramCapital", o(j10, z10), 2131749528);
    }

    public static String o(long j10, boolean z10) {
        if ((j10 > -10000000 && j10 < 10000000) || z10) {
            return rh.h8.O0(j10);
        }
        if (R == null) {
            R = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return R.format(j10 / 1.0E9d);
    }

    public static String p(long j10, boolean z10) {
        boolean z11 = j10 <= -1000000000 || j10 >= 1000000000;
        if (z10 && z11) {
            return o(j10, true);
        }
        BigDecimal scale = BigDecimal.valueOf(j10, 9).setScale(z10 ? 4 : z11 ? 2 : 3, RoundingMode.DOWN);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public static SpannableStringBuilder q(String str, float f7) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i10 = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), i10, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder r(long j10) {
        return s(j10, false);
    }

    public static SpannableStringBuilder s(long j10, boolean z10) {
        return l("Grams", o(j10, z10), 2131749516);
    }

    public static Context w() {
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        return (T == null || T.getContext() == null) ? org.telegram.messenger.w0.b : T.getContext();
    }

    public static k0 x(int i10) {
        k0 k0Var;
        k0 k0Var2 = O[i10];
        if (k0Var2 != null) {
            return k0Var2;
        }
        synchronized (k0.class) {
            try {
                k0Var = O[i10];
                if (k0Var == null) {
                    k0[] k0VarArr = O;
                    k0 k0Var3 = new k0(i10);
                    k0VarArr[i10] = k0Var3;
                    k0Var = k0Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k0Var;
    }

    public final j0 B() {
        if (this.n == null) {
            this.n = new j0(this);
        }
        return this.n;
    }

    public final void C(boolean z10, boolean z11, h0 h0Var, q20 q20Var) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(h0Var)) {
                q20Var.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(h0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(h0Var);
            h0 b10 = h0Var.b();
            H("import wallet: requesting proof challenge");
            h3.a(this.a, null, new q(this, b10, q20Var, secretPhraseToAnchorPublicKey, 2), null, null, new s(this, q20Var, secretPhraseToPublicKey, b10), z10, z11, new aa0(new l(b10, 2), 1));
        } catch (Exception unused2) {
            q20Var.a("INVALID_PHRASE");
        }
    }

    public final void E() {
        j0 j0Var = this.n;
        if (j0Var != null) {
            j0Var.g();
        }
        if (this.A >= 0) {
            return;
        }
        Y();
    }

    public final boolean F() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f;
        return tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
    }

    public final boolean G() {
        return (!(this.e instanceof TL_wallet.TL_walletState) || this.b == null || this.c == null) ? false : true;
    }

    public final boolean J() {
        p0 p0Var;
        boolean z10;
        if (!(this.e instanceof TL_wallet.TL_walletState) || (p0Var = this.c) == null) {
            return false;
        }
        synchronized (p0.f) {
            try {
                try {
                    z10 = p0Var.r().c;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final boolean K() {
        return this.m && !tz.s.isEmpty();
    }

    public final void L() {
        zs.f(this.a).k(zs.a4, this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:211|212|(4:214|215|216|(5:218|(2:220|(1:222))|223|96|(4:98|83|84|85)(9:99|(1:101)(4:177|(2:179|(1:203)(7:185|(1:189)|190|(1:201)(1:196)|197|198|(1:200)))|206|207)|(1:103)|104|(4:106|(1:108)(1:163)|(6:110|(3:112|(1:114)|115)|116|(1:118)|119|120)(12:121|(3:123|(2:125|(3:132|133|134)(1:141))|144)|145|(1:147)|148|(1:150)(1:162)|151|(1:161)(1:155)|156|(1:158)|159|160)|85)(1:176)|165|(2:167|(1:(2:169|(2:171|172)(1:173))(2:174|175)))(0)|(0)(0)|85)))(1:410)|224|225|226|227|228|229|230|231|(3:233|(7:237|(3:242|(2:244|245)(2:246|(2:251|(2:253|254)(1:255)))|241)|239|240|241|234|235)|256)(1:399)|257|(1:396)(1:274)|(1:395)(4:278|279|280|(4:282|(3:(1:296)(1:389)|297|(1:299)(2:300|(1:302)(28:303|304|305|306|307|308|(2:313|(3:315|316|317)(2:322|323))|324|(1:326)(1:385)|327|(1:329)(3:382|383|384)|(1:331)(1:381)|332|(2:376|377)(1:(1:375)(1:337))|338|(1:342)|(1:344)(1:374)|345|(3:349|(3:352|(2:354|355)(1:371)|350)|372)|373|356|(1:358)(1:370)|359|(2:368|369)(2:363|364)|365|(2:367|(0)(0))|321|(0)(0))))|96|(0)(0)))|390|(0)|(0)(0)|297|(0)(0)|96|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0577, code lost:
    
        if (r0 != null) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x047f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0480, code lost:
    
        r37 = r1;
        r39 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0484, code lost:
    
        r38 = r10;
        r40 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x048a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x048b, code lost:
    
        r37 = r1;
        r39 = r6;
        r36 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0354 A[Catch: Exception -> 0x02a2, TryCatch #8 {Exception -> 0x02a2, blocks: (B:235:0x0265, B:237:0x026b, B:242:0x0274, B:246:0x027f, B:249:0x0286, B:251:0x0292, B:253:0x029e, B:260:0x02b1, B:262:0x02b7, B:264:0x02bd, B:266:0x02c7, B:268:0x02d1, B:270:0x02d7, B:272:0x02e3, B:286:0x030d, B:288:0x0315, B:290:0x031b, B:292:0x0323, B:297:0x0338, B:300:0x0354, B:303:0x0362, B:307:0x036d, B:311:0x0375, B:313:0x037b, B:323:0x038d, B:324:0x0393, B:327:0x0399, B:332:0x03d9, B:338:0x0406, B:340:0x040a, B:342:0x0410, B:344:0x0415, B:345:0x041e, B:349:0x0429, B:350:0x042d, B:352:0x0433, B:355:0x043f, B:356:0x0445, B:358:0x044c, B:359:0x0458, B:361:0x045c, B:370:0x0452, B:374:0x041a, B:335:0x03ea, B:337:0x03f6, B:375:0x0400, B:380:0x03e5, B:381:0x03d3, B:389:0x0331, B:377:0x03dd), top: B:234:0x0265, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0331 A[Catch: Exception -> 0x02a2, TryCatch #8 {Exception -> 0x02a2, blocks: (B:235:0x0265, B:237:0x026b, B:242:0x0274, B:246:0x027f, B:249:0x0286, B:251:0x0292, B:253:0x029e, B:260:0x02b1, B:262:0x02b7, B:264:0x02bd, B:266:0x02c7, B:268:0x02d1, B:270:0x02d7, B:272:0x02e3, B:286:0x030d, B:288:0x0315, B:290:0x031b, B:292:0x0323, B:297:0x0338, B:300:0x0354, B:303:0x0362, B:307:0x036d, B:311:0x0375, B:313:0x037b, B:323:0x038d, B:324:0x0393, B:327:0x0399, B:332:0x03d9, B:338:0x0406, B:340:0x040a, B:342:0x0410, B:344:0x0415, B:345:0x041e, B:349:0x0429, B:350:0x042d, B:352:0x0433, B:355:0x043f, B:356:0x0445, B:358:0x044c, B:359:0x0458, B:361:0x045c, B:370:0x0452, B:374:0x041a, B:335:0x03ea, B:337:0x03f6, B:375:0x0400, B:380:0x03e5, B:381:0x03d3, B:389:0x0331, B:377:0x03dd), top: B:234:0x0265, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(JSONObject jSONObject) {
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
        int i10;
        ArrayList arrayList;
        TL_wallet.walletTransaction wallettransaction;
        JSONArray jSONArray;
        HashMap hashMap;
        ArrayList arrayList2;
        String str9;
        HashSet hashSet;
        j0 j0Var;
        HashMap hashMap2;
        ArrayList arrayList3;
        String j10;
        HashMap hashMap3;
        String str10;
        String str11;
        j0 j0Var2;
        HashMap hashMap4;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        HashSet hashSet2;
        TL_wallet.walletTransaction wallettransaction2;
        TL_wallet.walletTransaction wallettransaction3;
        int i11;
        TL_wallet.walletTransaction wallettransaction4;
        TL_wallet.nftItem nftitem;
        String str12;
        int i12;
        int i13;
        long parseLong;
        String string;
        JSONObject jSONObject2;
        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress;
        String str13;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        int i14;
        JSONArray jSONArray2;
        JSONObject optJSONObject3;
        z0 z0Var = this.s;
        if (z0Var == null || !TextUtils.equals(z0Var.b, t())) {
            return;
        }
        String optString2 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
        String str14 = "finality";
        String optString3 = jSONObject.optString("finality");
        H("streaming " + optString2 + ", finality: " + optString3);
        if ("account_state_change".equals(optString2) && "finalized".equals(optString3) && (this.e instanceof TL_wallet.TL_walletState) && (optJSONObject3 = jSONObject.optJSONObject("state")) != null) {
            try {
                long parseLong2 = Long.parseLong(optJSONObject3.getString("balance"));
                if (parseLong2 >= 0 && ((TL_wallet.TL_walletState) this.e).balance != parseLong2) {
                    H("streaming updates balance to " + parseLong2);
                    this.k = System.currentTimeMillis();
                    this.l = true;
                    ((TL_wallet.TL_walletState) this.e).balance = parseLong2;
                    N();
                    L();
                    j0 j0Var3 = this.n;
                    if (j0Var3 != null) {
                        j0Var3.g();
                    }
                }
            } catch (Exception unused) {
                j("Invalid streaming balance");
            }
        }
        j0 j0Var4 = this.n;
        if (j0Var4 != null) {
            ArrayList arrayList7 = j0Var4.b;
            HashSet hashSet3 = j0Var4.d;
            k0 k0Var = j0Var4.l;
            ArrayList arrayList8 = k0Var.p;
            int i15 = 1;
            HashMap hashMap5 = j0Var4.e;
            HashMap hashMap6 = j0Var4.f;
            String optString4 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
            str = optString2;
            String str15 = "trace_external_hash_norm";
            str3 = "trace_invalidated";
            if ("trace_invalidated".equals(optString4)) {
                String optString5 = jSONObject.optString("trace_external_hash_norm");
                if (!TextUtils.isEmpty(optString5)) {
                    ArrayList arrayList9 = new ArrayList(hashMap5.keySet());
                    int size = arrayList9.size();
                    int i16 = 0;
                    boolean z10 = false;
                    while (i16 < size) {
                        Object obj = arrayList9.get(i16);
                        i16++;
                        String str16 = (String) obj;
                        if (c0((String) hashMap5.get(str16), optString5)) {
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
                        j0Var4.k();
                        j0Var4.i();
                    }
                }
            } else if ("transactions".equals(optString4) && (((equals = "finalized".equals((optString = jSONObject.optString("finality")))) || "confirmed".equals(optString)) && (optJSONArray = jSONObject.optJSONArray("transactions")) != null)) {
                str2 = "finalized";
                ArrayList arrayList10 = new ArrayList();
                str6 = optString3;
                str7 = "confirmed";
                int i17 = 0;
                TL_wallet.walletTransaction wallettransaction6 = null;
                boolean z11 = false;
                while (i17 < optJSONArray.length()) {
                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(i17);
                    if (optJSONObject4 != null) {
                        i10 = i17;
                        if (optJSONObject4.optBoolean("emulated")) {
                            str8 = str14;
                        } else {
                            jSONArray = optJSONArray;
                            if ("pending".equals(optJSONObject4.optString(str14)) || (j10 = j0.j(optJSONObject4)) == null) {
                                str8 = str14;
                                arrayList = arrayList8;
                                wallettransaction = wallettransaction6;
                                arrayList2 = arrayList7;
                                hashSet = hashSet3;
                                hashMap = hashMap5;
                                j0Var = j0Var4;
                                hashMap2 = hashMap6;
                                arrayList3 = arrayList10;
                                str9 = str15;
                                wallettransaction6 = wallettransaction;
                                hashSet3 = hashSet;
                                str15 = str9;
                                str14 = str8;
                                i15 = 1;
                                arrayList10 = arrayList3;
                                arrayList8 = arrayList;
                                hashMap6 = hashMap2;
                                j0Var4 = j0Var;
                                hashMap5 = hashMap;
                                i17 = i10 + 1;
                                arrayList7 = arrayList2;
                                optJSONArray = jSONArray;
                            } else {
                                str8 = str14;
                                wallettransaction = wallettransaction6;
                                try {
                                    str10 = str15;
                                } catch (Exception e) {
                                    e = e;
                                    hashMap3 = hashMap6;
                                    str10 = str15;
                                }
                                try {
                                } catch (Exception e7) {
                                    e = e7;
                                    hashMap3 = hashMap6;
                                    str11 = j10;
                                    j0Var2 = j0Var4;
                                    hashMap4 = hashMap5;
                                    arrayList4 = arrayList8;
                                    arrayList5 = arrayList10;
                                    arrayList6 = arrayList7;
                                    hashSet2 = hashSet3;
                                    wallettransaction2 = null;
                                    k("stream transaction parse failed", e);
                                    wallettransaction3 = wallettransaction2;
                                    if (wallettransaction3 != null) {
                                    }
                                }
                                if (b(optJSONObject4.getString("account"), k0Var.t())) {
                                    JSONObject jSONObject3 = optJSONObject4.getJSONObject("description");
                                    if (!jSONObject3.optBoolean("destroyed")) {
                                        boolean optBoolean = jSONObject3.optBoolean("aborted");
                                        JSONObject optJSONObject5 = jSONObject3.optJSONObject("compute_ph");
                                        hashSet2 = hashSet3;
                                        if (optJSONObject5 != null) {
                                            hashMap4 = hashMap5;
                                            try {
                                            } catch (Exception e10) {
                                                e = e10;
                                                hashMap3 = hashMap6;
                                                str11 = j10;
                                                j0Var2 = j0Var4;
                                                arrayList4 = arrayList8;
                                                arrayList5 = arrayList10;
                                                arrayList6 = arrayList7;
                                                wallettransaction2 = null;
                                                k("stream transaction parse failed", e);
                                                wallettransaction3 = wallettransaction2;
                                                if (wallettransaction3 != null) {
                                                }
                                            }
                                            if (!optJSONObject5.optBoolean("skipped")) {
                                                if (optJSONObject5.optBoolean("success")) {
                                                    if (optJSONObject5.optInt("exit_code") != 0) {
                                                    }
                                                }
                                                hashMap3 = hashMap6;
                                                str11 = j10;
                                                j0Var2 = j0Var4;
                                                arrayList4 = arrayList8;
                                                arrayList5 = arrayList10;
                                                arrayList6 = arrayList7;
                                                wallettransaction3 = null;
                                                wallettransaction2 = null;
                                                if (wallettransaction3 != null) {
                                                    arrayList3 = arrayList5;
                                                    arrayList3.add(str11);
                                                    str9 = str10;
                                                    hashSet = hashSet2;
                                                    hashMap = hashMap4;
                                                    arrayList2 = arrayList6;
                                                    j0Var = j0Var2;
                                                    hashMap2 = hashMap3;
                                                    arrayList = arrayList4;
                                                    wallettransaction6 = wallettransaction;
                                                    hashSet3 = hashSet;
                                                    str15 = str9;
                                                    str14 = str8;
                                                    i15 = 1;
                                                    arrayList10 = arrayList3;
                                                    arrayList8 = arrayList;
                                                    hashMap6 = hashMap2;
                                                    j0Var4 = j0Var;
                                                    hashMap5 = hashMap;
                                                    i17 = i10 + 1;
                                                    arrayList7 = arrayList2;
                                                    optJSONArray = jSONArray;
                                                } else {
                                                    String str18 = str11;
                                                    arrayList3 = arrayList5;
                                                    if (wallettransaction3.incoming) {
                                                        wallettransaction4 = wallettransaction2;
                                                        arrayList = arrayList4;
                                                        i11 = 0;
                                                    } else {
                                                        arrayList = arrayList4;
                                                        ArrayList arrayList11 = new ArrayList(arrayList);
                                                        int size3 = arrayList11.size();
                                                        int i18 = 0;
                                                        while (i18 < size3) {
                                                            Object obj2 = arrayList11.get(i18);
                                                            i18++;
                                                            wallettransaction4 = (TL_wallet.walletTransaction) obj2;
                                                            boolean c02 = c0(wallettransaction4.gaslessMessageBodyHash, wallettransaction3.gaslessMessageBodyHash);
                                                            boolean c03 = c0(wallettransaction4.normalMessageBodyHash, wallettransaction3.normalMessageBodyHash);
                                                            if (!wallettransaction4.incoming && (c02 || c03)) {
                                                                wallettransaction3.gasless = c02;
                                                                if (wallettransaction3.nft == null && (nftitem = wallettransaction4.nft) != null) {
                                                                    wallettransaction3.nft = nftitem;
                                                                    wallettransaction3.peer = wallettransaction4.peer;
                                                                    wallettransaction3.amount = wallettransaction4.amount;
                                                                    wallettransaction3.comment = wallettransaction4.comment;
                                                                }
                                                                if (wallettransaction4.pending || wallettransaction4.failed || TextUtils.isEmpty(wallettransaction4.id)) {
                                                                    k0Var.c(wallettransaction4, wallettransaction3);
                                                                } else {
                                                                    wallettransaction4.gasless = wallettransaction3.gasless;
                                                                }
                                                                i11 = 0;
                                                                wallettransaction4.pending = false;
                                                                wallettransaction4.failed = false;
                                                                wallettransaction4.phase = wallettransaction3.phase;
                                                                arrayList.remove(wallettransaction4);
                                                                m0 m0Var = (m0) k0Var.t.remove(wallettransaction4);
                                                                if (m0Var != null) {
                                                                    m0Var.b();
                                                                }
                                                            }
                                                        }
                                                        i11 = 0;
                                                        wallettransaction4 = wallettransaction2;
                                                    }
                                                    if (wallettransaction4 != null) {
                                                        wallettransaction = wallettransaction4;
                                                    }
                                                    hashMap2 = hashMap3;
                                                    TL_wallet.walletTransaction wallettransaction7 = (TL_wallet.walletTransaction) hashMap2.get(str18);
                                                    if (wallettransaction7 != null) {
                                                        j0Var = j0Var2;
                                                        if (j0Var.b(wallettransaction7)) {
                                                            arrayList2 = arrayList6;
                                                        } else {
                                                            arrayList2 = arrayList6;
                                                            wallettransaction7 = j0.d(wallettransaction7.id, arrayList2);
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
                                                            wallettransaction6 = wallettransaction;
                                                            str9 = str10;
                                                            hashSet = hashSet2;
                                                        } else {
                                                            hashMap = hashMap4;
                                                            if (wallettransaction4 == null) {
                                                                int size4 = arrayList.size();
                                                                int i19 = i11;
                                                                while (i19 < size4) {
                                                                    Object obj3 = arrayList.get(i19);
                                                                    i19++;
                                                                    TL_wallet.walletTransaction wallettransaction8 = (TL_wallet.walletTransaction) obj3;
                                                                    int i20 = size4;
                                                                    if (wallettransaction8.incoming == wallettransaction3.incoming && ((!TextUtils.isEmpty(wallettransaction8.id) && TextUtils.equals(wallettransaction8.id, wallettransaction3.id)) || c0(wallettransaction8.tx_hash, wallettransaction3.tx_hash) || c0(wallettransaction8.messageHash, wallettransaction3.messageHash))) {
                                                                        hashSet = hashSet2;
                                                                        hashSet.remove(str18);
                                                                        hashMap.remove(str18);
                                                                        wallettransaction6 = wallettransaction;
                                                                        str9 = str10;
                                                                        break;
                                                                    }
                                                                    size4 = i20;
                                                                }
                                                            }
                                                            hashSet = hashSet2;
                                                            if (wallettransaction4 != null) {
                                                                wallettransaction3 = wallettransaction4;
                                                            }
                                                            j0Var.f(wallettransaction3);
                                                            hashMap2.put(str18, wallettransaction3);
                                                            hashSet.add(str18);
                                                            if (equals) {
                                                                hashMap.remove(str18);
                                                                str9 = str10;
                                                            } else {
                                                                str9 = str10;
                                                                hashMap.put(str18, jSONObject.optString(str9));
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
                                                            H(sb2.toString());
                                                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction3.peer;
                                                            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                                                                String str20 = walletTransactionPeer.address;
                                                                k0Var.Z(new q(j0Var, wallettransaction3.id, str20, walletTransactionPeer.domain), str20);
                                                            }
                                                            wallettransaction6 = wallettransaction;
                                                            z11 = true;
                                                        }
                                                        hashSet3 = hashSet;
                                                        str15 = str9;
                                                        str14 = str8;
                                                        i15 = 1;
                                                        arrayList10 = arrayList3;
                                                        arrayList8 = arrayList;
                                                        hashMap6 = hashMap2;
                                                        j0Var4 = j0Var;
                                                        hashMap5 = hashMap;
                                                        i17 = i10 + 1;
                                                        arrayList7 = arrayList2;
                                                        optJSONArray = jSONArray;
                                                    } else {
                                                        arrayList2 = arrayList6;
                                                        j0Var = j0Var2;
                                                    }
                                                    wallettransaction7 = j0.d(str18, arrayList2);
                                                    if (wallettransaction7 == null) {
                                                        int size5 = arrayList2.size();
                                                        int i21 = i11;
                                                        while (true) {
                                                            if (i21 >= size5) {
                                                                wallettransaction7 = wallettransaction2;
                                                                break;
                                                            }
                                                            Object obj4 = arrayList2.get(i21);
                                                            i21++;
                                                            TL_wallet.walletTransaction wallettransaction9 = (TL_wallet.walletTransaction) obj4;
                                                            if (i0(wallettransaction9, wallettransaction3)) {
                                                                wallettransaction7 = wallettransaction9;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    if (wallettransaction7 == null) {
                                                    }
                                                    hashSet3 = hashSet;
                                                    str15 = str9;
                                                    str14 = str8;
                                                    i15 = 1;
                                                    arrayList10 = arrayList3;
                                                    arrayList8 = arrayList;
                                                    hashMap6 = hashMap2;
                                                    j0Var4 = j0Var;
                                                    hashMap5 = hashMap;
                                                    i17 = i10 + 1;
                                                    arrayList7 = arrayList2;
                                                    optJSONArray = jSONArray;
                                                }
                                            }
                                        } else {
                                            hashMap4 = hashMap5;
                                        }
                                        String t10 = k0Var.t();
                                        JSONObject optJSONObject6 = optJSONObject4.optJSONObject("in_msg");
                                        arrayList6 = arrayList7;
                                        ArrayList arrayList12 = new ArrayList();
                                        j0Var2 = j0Var4;
                                        JSONArray optJSONArray2 = optJSONObject4.optJSONArray("out_msgs");
                                        hashMap3 = hashMap6;
                                        arrayList4 = arrayList8;
                                        str11 = j10;
                                        arrayList5 = arrayList10;
                                        if (optJSONArray2 != null) {
                                            int i22 = 0;
                                            i12 = 0;
                                            while (i22 < optJSONArray2.length()) {
                                                try {
                                                    JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i22);
                                                    if (optJSONObject7 != null) {
                                                        if (optJSONObject7.optBoolean("bounced")) {
                                                            jSONArray2 = optJSONArray2;
                                                            i12 = i15;
                                                        } else if (!optJSONObject7.isNull("value") && Long.parseLong(optJSONObject7.getString("value")) > 0) {
                                                            jSONArray2 = optJSONArray2;
                                                            if (!b(optJSONObject7.getString("destination"), t10)) {
                                                                arrayList12.add(optJSONObject7);
                                                            }
                                                        }
                                                        i22++;
                                                        optJSONArray2 = jSONArray2;
                                                    }
                                                    jSONArray2 = optJSONArray2;
                                                    i22++;
                                                    optJSONArray2 = jSONArray2;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    wallettransaction2 = null;
                                                    k("stream transaction parse failed", e);
                                                    wallettransaction3 = wallettransaction2;
                                                    if (wallettransaction3 != null) {
                                                    }
                                                }
                                            }
                                        } else {
                                            i12 = 0;
                                        }
                                        boolean z12 = (i12 != 0 || optJSONObject6 == null || optJSONObject6.isNull("source") || optJSONObject6.isNull("value") || !b(optJSONObject6.getString("destination"), t10) || b(optJSONObject6.getString("source"), t10) || optJSONObject6.optBoolean("bounced") || Long.parseLong(optJSONObject6.getString("value")) <= 0 || !arrayList12.isEmpty()) ? 0 : i15;
                                        if (z12 == 0 && i12 == 0 && !optBoolean) {
                                            try {
                                                i14 = i15;
                                            } catch (Exception e12) {
                                                e = e12;
                                                wallettransaction2 = null;
                                                k("stream transaction parse failed", e);
                                                wallettransaction3 = wallettransaction2;
                                                if (wallettransaction3 != null) {
                                                }
                                            }
                                            if (arrayList12.size() == i14) {
                                                i13 = i14;
                                                if ((z12 == 0 || i13 != 0) && (i13 == 0 || ((optJSONObject2 = jSONObject3.optJSONObject("action")) != null && optJSONObject2.optBoolean("success") && !optJSONObject2.optBoolean("no_funds") && optJSONObject2.optInt("result_code") == 0))) {
                                                    JSONObject jSONObject4 = z12 == 0 ? optJSONObject6 : (JSONObject) arrayList12.get(0);
                                                    parseLong = Long.parseLong(jSONObject4.getString("value"));
                                                    if (parseLong < vp.r1(k0Var.a).y7.l0.a.c) {
                                                        wallettransaction3 = new TL_wallet.walletTransaction();
                                                        String j11 = j0.j(optJSONObject4);
                                                        wallettransaction3.id = j11;
                                                        if (j11 != null) {
                                                            wallettransaction3.tx_hash = optJSONObject4.getString("hash");
                                                            try {
                                                                wallettransaction3.messageHash = jSONObject4.optString("hash", null);
                                                                if (i13 != 0 && optJSONObject6 != null && (optJSONObject = optJSONObject6.optJSONObject("message_content")) != null) {
                                                                    if (optJSONObject6.isNull("source")) {
                                                                        wallettransaction2 = null;
                                                                        try {
                                                                            wallettransaction3.normalMessageBodyHash = optJSONObject.optString("hash", null);
                                                                        } catch (Exception e13) {
                                                                            e = e13;
                                                                            k("stream transaction parse failed", e);
                                                                            wallettransaction3 = wallettransaction2;
                                                                            if (wallettransaction3 != null) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        wallettransaction3.gaslessMessageBodyHash = optJSONObject.optString("hash", null);
                                                                    }
                                                                }
                                                                wallettransaction3.incoming = z12;
                                                                if (z12 == 0) {
                                                                    parseLong = -parseLong;
                                                                }
                                                                wallettransaction3.amount = parseLong;
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
                                                                String str21 = wallettransaction3.comment;
                                                                if (str21 != null && str21.isEmpty()) {
                                                                    wallettransaction3.comment = null;
                                                                }
                                                                string = z12 != 0 ? optJSONObject6.getString("source") : jSONObject4.getString("destination");
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
                                                                wallettransactionpeeraddress.address = jSONObject2 == null ? V(string, false) : jSONObject2.optString("user_friendly", string);
                                                                if (jSONObject2 == null || jSONObject2.isNull("domain")) {
                                                                    wallettransaction2 = null;
                                                                    str13 = null;
                                                                } else {
                                                                    wallettransaction2 = null;
                                                                    str13 = jSONObject2.optString("domain", null);
                                                                }
                                                                wallettransactionpeeraddress.domain = str13;
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                                wallettransaction2 = null;
                                                            }
                                                            if (b(wallettransactionpeeraddress.address, string)) {
                                                                wallettransaction3.peer = wallettransactionpeeraddress;
                                                                if (wallettransaction3 != null) {
                                                                }
                                                            }
                                                            wallettransaction3 = wallettransaction2;
                                                            if (wallettransaction3 != null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                wallettransaction3 = null;
                                                wallettransaction2 = null;
                                                if (wallettransaction3 != null) {
                                                }
                                            }
                                        }
                                        i13 = 0;
                                        if (z12 == 0) {
                                        }
                                        if (z12 == 0) {
                                        }
                                        parseLong = Long.parseLong(jSONObject4.getString("value"));
                                        if (parseLong < vp.r1(k0Var.a).y7.l0.a.c) {
                                        }
                                        wallettransaction3 = null;
                                        wallettransaction2 = null;
                                        if (wallettransaction3 != null) {
                                        }
                                    }
                                }
                                hashMap3 = hashMap6;
                                str11 = j10;
                                j0Var2 = j0Var4;
                                hashMap4 = hashMap5;
                                arrayList4 = arrayList8;
                                arrayList5 = arrayList10;
                                arrayList6 = arrayList7;
                                hashSet2 = hashSet3;
                                wallettransaction3 = null;
                                wallettransaction2 = null;
                                if (wallettransaction3 != null) {
                                }
                            }
                        }
                    } else {
                        str8 = str14;
                        i10 = i17;
                    }
                    arrayList = arrayList8;
                    wallettransaction = wallettransaction6;
                    jSONArray = optJSONArray;
                    arrayList2 = arrayList7;
                    hashSet = hashSet3;
                    hashMap = hashMap5;
                    j0Var = j0Var4;
                    hashMap2 = hashMap6;
                    arrayList3 = arrayList10;
                    str9 = str15;
                    wallettransaction6 = wallettransaction;
                    hashSet3 = hashSet;
                    str15 = str9;
                    str14 = str8;
                    i15 = 1;
                    arrayList10 = arrayList3;
                    arrayList8 = arrayList;
                    hashMap6 = hashMap2;
                    j0Var4 = j0Var;
                    hashMap5 = hashMap;
                    i17 = i10 + 1;
                    arrayList7 = arrayList2;
                    optJSONArray = jSONArray;
                }
                j0 j0Var5 = j0Var4;
                TL_wallet.walletTransaction wallettransaction10 = wallettransaction6;
                HashMap hashMap7 = hashMap6;
                ArrayList arrayList13 = arrayList10;
                if (wallettransaction10 != null) {
                    int size6 = arrayList13.size();
                    int i23 = 0;
                    while (i23 < size6) {
                        Object obj5 = arrayList13.get(i23);
                        i23++;
                        String str22 = (String) obj5;
                        TL_wallet.walletTransaction wallettransaction11 = wallettransaction10;
                        if (!hashMap7.containsKey(str22)) {
                            hashMap7.put(str22, wallettransaction11);
                        }
                        wallettransaction10 = wallettransaction11;
                    }
                }
                if (z11) {
                    j0Var5.k();
                    j0Var5.i();
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
        h hVar = this.F;
        org.telegram.messenger.i0.r(hVar);
        org.telegram.messenger.i0.h3(hVar, 250L);
    }

    public final void N() {
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
        p0 p0Var = this.c;
        if (p0Var != null && !TextUtils.equals(p0Var.c, str)) {
            if (str == null) {
                H("received empty state, leaving wallet storage of " + this.c.c);
            } else {
                StringBuilder u10 = a1.g.u("received new state of ", str, ", leaving wallet storage of ");
                u10.append(this.c.c);
                H(u10.toString());
            }
            this.c = null;
        }
        if (!TextUtils.isEmpty(str) && this.c == null) {
            H("setting up wallet storage of " + str);
            this.c = new p0(this.a, org.telegram.messenger.w0.b, str);
            H("storage public keys = " + this.c.m().length);
        }
        c0 c0Var = this.o;
        if (c0Var != null && !TextUtils.equals(c0Var.e, str)) {
            c0Var.e = str;
            c0Var.c();
        }
        if (this.b != null && !TextUtils.equals(this.d, str)) {
            this.b.close();
            this.b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.b == null || !TextUtils.equals(this.d, str))) {
            if (this.b != null) {
                H("closing wallet-engine of " + this.d);
                this.b.close();
                this.b = null;
            }
            H("creating wallet-engine for " + str);
            try {
                int i10 = this.a;
                this.d = str;
                this.b = new WalletEngine2(i10, str, bArr);
            } catch (Exception e) {
                k("failed to create engine!", e);
                this.d = null;
            }
        }
        int i11 = 0;
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                Runnable runnable = (Runnable) ((WeakReference) obj).get();
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                }
            }
            this.v.clear();
        }
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null && this.f != null) {
            ArrayList arrayList2 = this.w;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    org.telegram.messenger.i0.g3(runnable2);
                }
            }
            this.w.clear();
        }
        if (!TextUtils.equals(this.I, str)) {
            W();
        }
        S();
    }

    public final void O(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (TextUtils.isEmpty(str) || g0(str) == null) {
            return;
        }
        ArrayList arrayList = this.p;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
            String str2 = wallettransaction.messageHash;
            String str3 = tL_updateSentWalletTransaction.msg_hash;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && c0(str2, str3)) {
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
            B().k();
            B().i();
        }
    }

    public final void P(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f = tL_updateWalletGaslessInfo;
        N();
        L();
    }

    public final void Q(TL_update.TL_updateWalletState tL_updateWalletState) {
        l0(tL_updateWalletState.state);
    }

    public final void R() {
        f0();
        this.p.clear();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = ((e0) obj).b;
            if (h0Var != null) {
                h0Var.close();
            }
        }
        arrayList.clear();
        j0 j0Var = this.n;
        if (j0Var != null) {
            j0Var.a();
            j0Var.b.clear();
            j0Var.d.clear();
            j0Var.e.clear();
            j0Var.f.clear();
            j0Var.g = "";
            j0Var.h = false;
            j0Var.k();
            this.n.k();
            this.n.i();
        }
        S();
        this.f = null;
        X();
    }

    public final void S() {
        if (!TextUtils.equals(this.u, t())) {
            f0();
            this.u = t();
        }
        boolean G = G();
        int i10 = this.a;
        if (!G || TextUtils.isEmpty(t())) {
            f0();
        } else {
            HashMap hashMap = this.t;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((m0) hashMap.get(wallettransaction)).b, wallettransaction.messageHash)) {
                    ((m0) hashMap.remove(wallettransaction)).b();
                }
            }
            ArrayList arrayList2 = this.p;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    m0 m0Var = new m0(i10, str, new ep0(23, this, wallettransaction2));
                    hashMap.put(wallettransaction2, m0Var);
                    if (!m0Var.d && !TextUtils.isEmpty(str)) {
                        m0Var.d = true;
                        m0Var.f = 0;
                        m0Var.a();
                    }
                }
            }
        }
        boolean z10 = (!G() || TextUtils.isEmpty(t()) || this.E.isEmpty()) ? false : true;
        z0 z0Var = this.s;
        boolean z11 = z0Var != null && z0Var.d;
        if (z11 == z10 && (!z11 || z0Var == null || TextUtils.equals(z0Var.b, t()))) {
            return;
        }
        if (!z10) {
            z0 z0Var2 = this.s;
            if (z0Var2 != null) {
                z0Var2.h();
            }
            org.telegram.messenger.i0.r(this.F);
            return;
        }
        z0 z0Var3 = this.s;
        if (z0Var3 != null && !TextUtils.equals(z0Var3.b, t())) {
            this.s.h();
            this.s = null;
        }
        if (this.s == null) {
            this.s = new z0(i10, t(), this);
        }
        z0 z0Var4 = this.s;
        boolean z12 = z0Var4.d;
        if (z12) {
            return;
        }
        String str2 = z0Var4.b;
        if (z12 || TextUtils.isEmpty(str2)) {
            z0Var4.d("start ignored: running=" + z0Var4.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
            return;
        }
        z0Var4.d("starting; address=" + str2);
        z0Var4.d = true;
        z0Var4.j = 0;
        z0Var4.e();
    }

    public final void U(h0 h0Var, boolean z10, j20 j20Var) {
        h0 b10 = h0Var.b();
        H("requesting proof challenge");
        ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getProofChallenge(), new a3.b(1), new v(this, b10, j20Var, z10, 0));
    }

    public final void W() {
        int i10;
        this.I = t();
        ArrayList n10 = p0.n(org.telegram.messenger.w0.b, d20.i(this.a).e());
        n10.remove(this.I);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            g0 g0Var = (g0) obj;
            hashMap.put(g0Var.a, g0Var);
        }
        this.G.clear();
        int size2 = n10.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = n10.get(i12);
            i12++;
            String str = (String) obj2;
            g0 g0Var2 = (g0) hashMap.get(str);
            if (g0Var2 == null) {
                g0Var2 = new g0(new p0(this.a, org.telegram.messenger.w0.b, str));
            }
            p0 p0Var = g0Var2.f;
            synchronized (p0.f) {
                try {
                    try {
                        i10 = p0Var.r().b;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        i10 = 0;
                    }
                } finally {
                }
            }
            g0Var2.b = i10;
            this.G.add(g0Var2);
            u(str, null);
            k0((b0) this.N.get(str));
        }
        Collections.sort(this.G, new ex0(5));
    }

    public final void X() {
        H("requesting gasless info");
        this.B = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new a3.b(1), new i(this, 2));
    }

    public final void Y() {
        H("requesting state");
        this.A = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getState(), new a3.b(1), new i(this, 1));
    }

    public final void Z(j20 j20Var, String str) {
        if (str == null) {
            j20Var.a(null, null);
            return;
        }
        HashMap hashMap = this.M;
        if (hashMap.containsKey(str)) {
            j20Var.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.a).sendRequestTyped(getuseraddresses, new a3.b(1), new j((Object) this, (Object) str, (Object) j20Var, 0));
    }

    public final void a0(TLRPC.User user, j20 j20Var) {
        if (user == null) {
            j20Var.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.id);
        HashMap hashMap = this.L;
        if (hashMap.containsKey(valueOf)) {
            j20Var.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.id;
        int i10 = this.a;
        arrayList.add(vp.r1(i10).p1(user));
        ConnectionsManager.getInstance(i10).sendRequestTyped(getuseraddresses, new a3.b(1), new j(this, (Object) j20Var, (Object) user, 2));
    }

    public final void b0(String str, q20 q20Var) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        int i10 = 1;
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z10 = org.telegram.ui.web.z0.Q0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i11 = this.a;
        ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new a3.b(i10), new ih.s(this, str, q20Var), vp.r1(i11).P3, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.nftItem nftitem;
        int size;
        c0 c0Var;
        e0 e0Var;
        wallettransaction.id = wallettransaction2.id;
        wallettransaction.incoming = wallettransaction2.incoming;
        wallettransaction.gasless = wallettransaction2.gasless;
        wallettransaction.failed = wallettransaction2.failed;
        wallettransaction.key_change = wallettransaction2.key_change;
        wallettransaction.comment_encrypted = wallettransaction2.comment_encrypted;
        int i10 = 0;
        wallettransaction.comment_encrypted_preparing = false;
        wallettransaction.amount = wallettransaction2.amount;
        wallettransaction.fee = wallettransaction2.fee;
        wallettransaction.date = wallettransaction2.date;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
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
                if (nftitem != null) {
                    wallettransaction.nft = nftitem;
                }
                ArrayList arrayList = this.p;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) arrayList.get(size);
                    if (wallettransaction3 != wallettransaction && !wallettransaction3.pending && !TextUtils.isEmpty(wallettransaction2.id) && TextUtils.equals(wallettransaction3.id, wallettransaction2.id)) {
                        arrayList.remove(size);
                    }
                }
                boolean z10 = wallettransaction2.failed;
                boolean z11 = !z10;
                String str = wallettransaction2.tx_hash;
                if (wallettransaction.pending) {
                    j0 B = B();
                    wallettransaction.failed = z10;
                    wallettransaction.pending = false;
                    if (!TextUtils.isEmpty(str)) {
                        wallettransaction.tx_hash = str;
                    }
                    if (wallettransaction.key_change) {
                        ArrayList arrayList2 = this.r;
                        int size2 = arrayList2.size();
                        while (true) {
                            if (i10 >= size2) {
                                e0Var = null;
                                break;
                            }
                            Object obj = arrayList2.get(i10);
                            i10++;
                            e0Var = (e0) obj;
                            if (TextUtils.equals(e0Var.a, wallettransaction.messageHash)) {
                                break;
                            }
                        }
                        if (e0Var != null) {
                            if (z10) {
                                h0 h0Var = e0Var.b;
                                if (h0Var != null) {
                                    h0Var.close();
                                }
                            } else {
                                e0Var.a();
                            }
                            arrayList2.remove(e0Var);
                        }
                    }
                    q20 q20Var = (q20) this.q.remove(wallettransaction);
                    if (q20Var != null) {
                        q20Var.a(Boolean.valueOf(z11));
                    }
                    H("completed pending transaction: msg_hash=" + wallettransaction.messageHash + ", body_hash=" + wallettransaction.gaslessMessageBodyHash + ", transaction_id=" + wallettransaction.id + ", tx_hash=" + wallettransaction.tx_hash + ", success=" + z11);
                    B.k();
                    B.i();
                    S();
                }
                if (wallettransaction.nft != null || (c0Var = this.o) == null) {
                }
                c0.a(c0Var, wallettransaction);
                c0 c0Var2 = this.o;
                if (c0Var2.j) {
                    return;
                }
                c0Var2.b();
                c0Var2.f(true);
                return;
            }
        }
        walletTransactionPeer = walletTransactionPeer2;
        wallettransaction.peer = walletTransactionPeer;
        wallettransaction.comment = wallettransaction2.comment;
        wallettransaction.tx_hash = wallettransaction2.tx_hash;
        nftitem = wallettransaction2.nft;
        if (nftitem != null) {
        }
        ArrayList arrayList3 = this.p;
        while (size >= 0) {
        }
        boolean z102 = wallettransaction2.failed;
        boolean z112 = !z102;
        String str2 = wallettransaction2.tx_hash;
        if (wallettransaction.pending) {
        }
        if (wallettransaction.nft != null) {
        }
    }

    public final void d(TL_wallet.walletTransaction wallettransaction, TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        wallettransaction.messageHash = tL_updateSentWalletTransaction.msg_hash;
        wallettransaction.gasless = tL_updateSentWalletTransaction.gasless;
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            c(wallettransaction, wallettransaction2);
        } else {
            S();
        }
    }

    public final void d0(TLRPC.User user, String str, long j10, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, q20 q20Var, q20 q20Var2, d2 d2Var) {
        String t10 = t();
        H("send to " + str + ", amount " + j10 + ", when ready...");
        m0(new o(this, str, q20Var, nftitem, t10, str2, bArr, j10, d2Var, user, str3, q20Var2, 0));
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
        p0 p0Var = this.c;
        return p0Var != null && p0Var.f(tL_walletState.public_key);
    }

    public final boolean f() {
        p0 p0Var;
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        return !tL_walletState.backup_enabled && ((p0Var = this.c) == null || !p0Var.f(tL_walletState.public_key));
    }

    public final void f0() {
        HashMap hashMap = this.t;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((m0) it.next()).b();
        }
        hashMap.clear();
    }

    public final l i(String str, long j10, String str2, byte[] bArr, j20 j20Var) {
        y yVar = new y(this, str, j10, str2, bArr, j20Var);
        m0(yVar);
        return new l(yVar, 0);
    }

    public final void k0(b0 b0Var) {
        if (b0Var == null) {
            return;
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g0 g0Var = (g0) obj;
            if (TextUtils.equals(g0Var.a, b0Var.a)) {
                g0Var.c = b0Var.b;
                g0Var.d = !b0Var.e;
                byte[] bArr = b0Var.c;
                g0Var.e = (bArr == null || bArr.length <= 0 || g0Var.f.f(bArr)) ? false : true;
            }
        }
    }

    public final void l0(TL_wallet.WalletState walletState) {
        boolean z10;
        j0 j0Var;
        if (walletState == null) {
            return;
        }
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.WalletState walletState2 = this.e;
            if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                z10 = true;
                this.e = walletState;
                N();
                L();
                if (z10 || (j0Var = this.n) == null) {
                }
                j0Var.g();
                return;
            }
        }
        z10 = false;
        this.e = walletState;
        N();
        L();
        if (z10) {
        }
    }

    public final CharSequence m(long j10, boolean z10) {
        BigDecimal scale;
        int i10;
        f fVar = this.h;
        String g10 = fVar.g();
        TL_wallet.currencyRate j11 = fVar.j();
        if (j11 != null) {
            String str = j11.symbol;
            String str2 = j11.thousandsSeparator;
            String str3 = j11.decimalSeparator;
            boolean z11 = j11.symbolLeft;
            boolean z12 = j11.spaceBetween;
            boolean z13 = j11.dropZeros;
            int i11 = j11.exp;
            double d = j11.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d10 = d * ((org.telegram.messenger.k0) vp.r1(this.a).y7.l.b).a;
                int max = Math.max(0, Math.min(i11, 20));
                BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(BigDecimal.valueOf(d10)).movePointLeft(9);
                if (!z10 || movePointLeft.signum() == 0) {
                    scale = movePointLeft.setScale(max, RoundingMode.HALF_UP);
                    i10 = max;
                } else {
                    BigDecimal round = movePointLeft.round(new MathContext(3, RoundingMode.HALF_UP));
                    scale = round.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : round.stripTrailingZeros();
                    i10 = Math.max(max, Math.min(20, Math.max(0, scale.scale())));
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
                decimalFormat.setMaximumFractionDigits(i10);
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                boolean z15 = scale.signum() < 0;
                String format = decimalFormat.format(scale.abs());
                if (!TextUtils.isEmpty(str)) {
                    g10 = str;
                }
                String str4 = z12 ? " " : "";
                String C = z11 ? a1.g.C(g10, str4, format) : a1.g.C(format, str4, g10);
                if (z15) {
                    C = sc.e.h("-", C);
                }
                int indexOf = C.indexOf(8387);
                if (indexOf < 0) {
                    return C;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C);
                spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                return spannableStringBuilder;
            }
        }
        return "";
    }

    public final void m0(Runnable runnable) {
        if (G()) {
            runnable.run();
        } else {
            this.v.add(new WeakReference(runnable));
        }
    }

    public final String t() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).address;
        }
        return null;
    }

    public final b0 u(final String str, p pVar) {
        HashMap hashMap = this.N;
        b0 b0Var = (b0) hashMap.get(str);
        if (b0Var != null && !b0Var.e) {
            if (pVar != null) {
                b0Var.f.add(pVar);
            }
            return null;
        }
        int i10 = this.a;
        if (b0Var != null && b0Var.e && ConnectionsManager.getInstance(i10).getCurrentTime() < b0Var.d + zs.X4) {
            if (pVar != null) {
                pVar.a(b0Var);
            }
            return b0Var;
        }
        final b0 b0Var2 = new b0();
        b0Var2.b = -1L;
        ArrayList arrayList = new ArrayList();
        b0Var2.f = arrayList;
        b0Var2.a = str;
        b0Var2.d = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (pVar != null) {
            arrayList.add(pVar);
        }
        hashMap.put(str, b0Var2);
        final int i11 = 1;
        final int i12 = 0;
        Utilities.B(new g(this, str, b0Var2, i11), new q20(this) { // from class: org.telegram.ui.Wallet.n
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/walletInformation";
                        StringBuilder sb2 = new StringBuilder("address=");
                        String str2 = str;
                        sb2.append(Uri.encode(str2));
                        sb2.append("&use_v2=false");
                        performapirequest.query = sb2.toString();
                        k0 k0Var = this.b;
                        int i13 = k0Var.a;
                        ConnectionsManager.getInstance(i13).sendRequestTyped(performapirequest, new a3.b(1), new q(k0Var, b0Var2, str2, runnable, 0), vp.r1(i13).P3, 0);
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        b0 b0Var3 = b0Var2;
                        String str3 = str;
                        k0Var2.b0(str3, new p(k0Var2, b0Var3, str3, (Runnable) obj));
                        break;
                }
            }
        }, new q20(this) { // from class: org.telegram.ui.Wallet.n
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q20
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
                        k0 k0Var = this.b;
                        int i13 = k0Var.a;
                        ConnectionsManager.getInstance(i13).sendRequestTyped(performapirequest, new a3.b(1), new q(k0Var, b0Var2, str2, runnable, 0), vp.r1(i13).P3, 0);
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        b0 b0Var3 = b0Var2;
                        String str3 = str;
                        k0Var2.b0(str3, new p(k0Var2, b0Var3, str3, (Runnable) obj));
                        break;
                }
            }
        });
        return null;
    }

    public final long v() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).balance;
        }
        return 0L;
    }

    public final byte[] y() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).public_key;
        }
        return null;
    }

    public final void z(j20 j20Var, boolean z10, boolean z11) {
        H("getSecretPhrase: whenReady...");
        m0(new e2.n0(this, j20Var, z10, z11, 5));
    }
}
