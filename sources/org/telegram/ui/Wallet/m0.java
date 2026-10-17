package org.telegram.ui.Wallet;

import ai.ld;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.fr0;
import org.telegram.ui.lg0;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class m0 {
    public static volatile m0[] O = new m0[4];
    public static final long[] P = {1500, 2500, 4000, 6000, 10000, 15000, 20000};
    public static DecimalFormat Q;
    public int C;
    public final g F;
    public final ArrayList G;
    public final List H;
    public String I;
    public final g J;
    public final HashMap K;
    public final HashMap L;
    public final HashMap M;
    public final HashMap N;
    public final int a;
    public WalletEngine2 b;
    public q0 c;
    public String d;
    public TL_wallet.WalletState e;
    public TL_update.TL_updateWalletGaslessInfo f;
    public final f2 g;
    public final f h;
    public Boolean i;
    public String j;
    public long k;
    public boolean l;
    public boolean m;
    public l0 n;
    public e0 o;
    public a1 s;
    public String u;
    public String x;
    public int y;
    public final g z;
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

    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.ui.Wallet.g] */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.telegram.ui.Wallet.g] */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.ui.Wallet.g] */
    public m0(int i10) {
        final int i11 = 0;
        this.z = new Runnable(this) { // from class: org.telegram.ui.Wallet.g
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e0 e0Var;
                l0 l0Var;
                TL_wallet.nftItem nftitem;
                switch (i11) {
                    case 0:
                        m0 m0Var = this.b;
                        if (!TextUtils.isEmpty(m0Var.x) && (e0Var = m0Var.o) != null && e0Var.d(m0Var.x) && (l0Var = m0Var.n) != null) {
                            ArrayList arrayList = l0Var.b;
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && m0.a(nftitem.address, m0Var.x)) {
                                    break;
                                }
                            }
                        }
                        if (m0Var.o == null) {
                            m0Var.o = new e0(m0Var);
                        }
                        e0 e0Var2 = m0Var.o;
                        if (!e0Var2.j) {
                            e0Var2.b();
                            e0Var2.f(true);
                        }
                        m0Var.A().f();
                        m0Var.C();
                        int i13 = m0Var.y;
                        if (i13 < 7) {
                            g gVar = m0Var.z;
                            m0Var.y = i13 + 1;
                            AndroidUtilities.runOnUIThread(gVar, m0.P[i13]);
                            break;
                        }
                        break;
                    case 1:
                        m0 m0Var2 = this.b;
                        a1 a1Var = m0Var2.s;
                        if (a1Var != null && a1Var.d) {
                            m0Var2.C();
                            break;
                        }
                        break;
                    default:
                        m0 m0Var3 = this.b;
                        m0Var3.U();
                        m0Var3.J();
                        break;
                }
            }
        };
        this.C = -1;
        final int i12 = 1;
        this.F = new Runnable(this) { // from class: org.telegram.ui.Wallet.g
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e0 e0Var;
                l0 l0Var;
                TL_wallet.nftItem nftitem;
                switch (i12) {
                    case 0:
                        m0 m0Var = this.b;
                        if (!TextUtils.isEmpty(m0Var.x) && (e0Var = m0Var.o) != null && e0Var.d(m0Var.x) && (l0Var = m0Var.n) != null) {
                            ArrayList arrayList = l0Var.b;
                            int size = arrayList.size();
                            int i122 = 0;
                            while (i122 < size) {
                                Object obj = arrayList.get(i122);
                                i122++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && m0.a(nftitem.address, m0Var.x)) {
                                    break;
                                }
                            }
                        }
                        if (m0Var.o == null) {
                            m0Var.o = new e0(m0Var);
                        }
                        e0 e0Var2 = m0Var.o;
                        if (!e0Var2.j) {
                            e0Var2.b();
                            e0Var2.f(true);
                        }
                        m0Var.A().f();
                        m0Var.C();
                        int i13 = m0Var.y;
                        if (i13 < 7) {
                            g gVar = m0Var.z;
                            m0Var.y = i13 + 1;
                            AndroidUtilities.runOnUIThread(gVar, m0.P[i13]);
                            break;
                        }
                        break;
                    case 1:
                        m0 m0Var2 = this.b;
                        a1 a1Var = m0Var2.s;
                        if (a1Var != null && a1Var.d) {
                            m0Var2.C();
                            break;
                        }
                        break;
                    default:
                        m0 m0Var3 = this.b;
                        m0Var3.U();
                        m0Var3.J();
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = DesugarCollections.unmodifiableList(arrayList);
        final int i13 = 2;
        this.J = new Runnable(this) { // from class: org.telegram.ui.Wallet.g
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e0 e0Var;
                l0 l0Var;
                TL_wallet.nftItem nftitem;
                switch (i13) {
                    case 0:
                        m0 m0Var = this.b;
                        if (!TextUtils.isEmpty(m0Var.x) && (e0Var = m0Var.o) != null && e0Var.d(m0Var.x) && (l0Var = m0Var.n) != null) {
                            ArrayList arrayList2 = l0Var.b;
                            int size = arrayList2.size();
                            int i122 = 0;
                            while (i122 < size) {
                                Object obj = arrayList2.get(i122);
                                i122++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && m0.a(nftitem.address, m0Var.x)) {
                                    break;
                                }
                            }
                        }
                        if (m0Var.o == null) {
                            m0Var.o = new e0(m0Var);
                        }
                        e0 e0Var2 = m0Var.o;
                        if (!e0Var2.j) {
                            e0Var2.b();
                            e0Var2.f(true);
                        }
                        m0Var.A().f();
                        m0Var.C();
                        int i132 = m0Var.y;
                        if (i132 < 7) {
                            g gVar = m0Var.z;
                            m0Var.y = i132 + 1;
                            AndroidUtilities.runOnUIThread(gVar, m0.P[i132]);
                            break;
                        }
                        break;
                    case 1:
                        m0 m0Var2 = this.b;
                        a1 a1Var = m0Var2.s;
                        if (a1Var != null && a1Var.d) {
                            m0Var2.C();
                            break;
                        }
                        break;
                    default:
                        m0 m0Var3 = this.b;
                        m0Var3.U();
                        m0Var3.J();
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
            this.m = v().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e) {
            j("failed to load prefs", e);
        }
        this.h = new f(this);
        W();
        V();
        F("requesting has walt balance");
        this.C = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new org.telegram.messenger.a(), new i(this, i11));
        this.g = new f2(this);
        g gVar = this.J;
        Object obj = q0.f;
        synchronized (q0.class) {
            try {
                Iterator it = q0.i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        q0.i.remove(weakReference);
                    } else if (runnable == gVar) {
                        i11 = 1;
                    }
                }
                if (gVar != null && i11 == 0) {
                    q0.i.add(new WeakReference(gVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        U();
    }

    public static void F(String str) {
        FileLog.d("[gram-wallet] " + str);
    }

    public static boolean G(MessageObject messageObject, TL_wallet.walletTransaction wallettransaction) {
        if (messageObject != null && messageObject.messageOwner != null && wallettransaction != null && messageObject.isOutOwner()) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j10 = wallettransaction.random_id;
                if (j10 != 0 && message.random_id == j10) {
                    return true;
                }
                if (wallettransaction.localMessageId != 0 && messageObject.getId() == wallettransaction.localMessageId) {
                    return true;
                }
                if (!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer.transaction_id)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] R(byte[] bArr) {
        byte[] bArr2 = new byte[215];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z10 = false;
            int i10 = 0;
            for (byte b10 : bArr) {
                if (j0.f(b10)) {
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

    public static String T(String str, boolean z10) {
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

    public static boolean a(String str, String str2) {
        String g02 = g0(str);
        return g02 != null && g02.equals(g0(str2));
    }

    public static boolean a0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            try {
                return Arrays.equals(e0(str), e0(str2));
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    public static byte[][] c0(byte[] bArr, SecureRandom secureRandom) {
        if (bArr.length != 215) {
            throw new IllegalArgumentException("INVALID_MNEMONIC_BACKUP_SIZE");
        }
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, 215);
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

    public static byte[] e0(String str) {
        if (!str.matches("[0-9a-fA-F]{64}")) {
            byte[] decode = Base64.decode(str.replace('-', '+').replace('_', '/'), 0);
            if (decode.length == 32) {
                return decode;
            }
            throw new IllegalArgumentException("Invalid transaction hash");
        }
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 32; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) Integer.parseInt(str.substring(i11, i11 + 2), 16);
        }
        return bArr;
    }

    public static TL_wallet.WalletTransactionPeer f(TLRPC.User user, String str, String str2) {
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

    public static boolean f0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, wallettransaction2.id)) || a0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || a0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            return true;
        }
        if (wallettransaction.incoming || wallettransaction2.incoming) {
            return false;
        }
        return a0(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) || a0(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash);
    }

    public static e2 g(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        return new e2(new JSONObject().put("messages", new JSONArray().put(new JSONObject().put("address", stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? T(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static String g0(String str) {
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

    public static void i(String str) {
        FileLog.e("[gram-wallet] " + str);
    }

    public static void j(String str, Throwable th2) {
        FileLog.e("[gram-wallet] " + str, th2);
    }

    public static SpannableStringBuilder k(String str, CharSequence charSequence, int i10) {
        String replace = charSequence.toString().replace((char) 8211, '-');
        String string = LocaleController.getString(i10);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                string = LocaleController.getPluralString(str, (int) ((parseLong < -2147483647L || parseLong > 2147483647L) ? Math.abs(parseLong % 100) + 100 : Math.abs(parseLong)));
            } catch (NumberFormatException unused) {
            }
        }
        return AndroidUtilities.replaceCharSequence("%1$s", string, charSequence);
    }

    public static SpannableStringBuilder m(long j10, boolean z10) {
        return k("GramCapital", n(j10, z10), R.string.GramCapital_other);
    }

    public static String n(long j10, boolean z10) {
        if ((j10 > -10000000 && j10 < 10000000) || z10) {
            return ld.N0(j10);
        }
        if (Q == null) {
            Q = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return Q.format(j10 / 1.0E9d);
    }

    public static String o(long j10, boolean z10) {
        if (j10 <= -1000000000 || j10 >= 1000000000) {
            return n(j10, z10);
        }
        BigDecimal scale = BigDecimal.valueOf(j10, 9).setScale((z10 || (j10 > -10000000 && j10 < 10000000)) ? 4 : 2, RoundingMode.DOWN);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public static SpannableStringBuilder p(String str, float f7) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i10 = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), i10, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder q(long j10) {
        return r(j10, false);
    }

    public static SpannableStringBuilder r(long j10, boolean z10) {
        return k("Grams", n(j10, z10), R.string.Grams_other);
    }

    public static Context v() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        return (U == null || U.getContext() == null) ? ApplicationLoader.applicationContext : U.getContext();
    }

    public static m0 w(int i10) {
        m0 m0Var;
        m0 m0Var2 = O[i10];
        if (m0Var2 != null) {
            return m0Var2;
        }
        synchronized (m0.class) {
            try {
                m0Var = O[i10];
                if (m0Var == null) {
                    m0[] m0VarArr = O;
                    m0 m0Var3 = new m0(i10);
                    m0VarArr[i10] = m0Var3;
                    m0Var = m0Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m0Var;
    }

    public static TL_update.TL_updateSentWalletTransaction z(TLRPC.Updates updates) {
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

    public final l0 A() {
        if (this.n == null) {
            this.n = new l0(this);
        }
        return this.n;
    }

    public final void B(boolean z10, boolean z11, j0 j0Var, Utilities.Callback callback) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(j0Var)) {
                callback.run("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(j0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(j0Var);
            j0 b10 = j0Var.b();
            F("import wallet: requesting proof challenge");
            s2.a(this.a, null, new q(this, b10, callback, secretPhraseToAnchorPublicKey, 2), null, null, new v(this, callback, secretPhraseToPublicKey, b10), z10, z11, new pa0(new n(b10, 2), 1));
        } catch (Exception unused2) {
            callback.run("INVALID_PHRASE");
        }
    }

    public final void C() {
        l0 l0Var = this.n;
        if (l0Var != null) {
            l0Var.f();
        }
        if (this.A >= 0) {
            return;
        }
        W();
    }

    public final boolean D() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f;
        return tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
    }

    public final boolean E() {
        return (!(this.e instanceof TL_wallet.TL_walletState) || this.b == null || this.c == null) ? false : true;
    }

    public final boolean H() {
        q0 q0Var;
        boolean z10;
        if (!(this.e instanceof TL_wallet.TL_walletState) || (q0Var = this.c) == null) {
            return false;
        }
        q0Var.getClass();
        synchronized (q0.f) {
            try {
                try {
                    z10 = q0Var.r().c;
                } catch (Exception e) {
                    FileLog.e(e);
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final boolean I() {
        return this.m && !SharedConfig.passcodeHash.isEmpty();
    }

    public final void J() {
        NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletUpdate, this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:219|220|(4:222|223|224|(6:226|(2:228|(1:230))|231|98|99|(1:101)(7:102|(1:104)(5:184|(2:186|(1:211)(8:192|(1:196)|197|(1:209)(1:203)|204|205|(1:207)|208))|214|215|208)|105|(2:107|(2:108|(2:110|(1:113)(1:112))(2:169|170)))(1:183)|172|(2:174|(1:(2:176|(2:178|179)(1:180))(2:181|182)))(0)|(6:115|(3:117|(1:119)|120)|121|(1:123)|124|125)(12:126|(3:128|(2:130|(3:138|139|140)(1:147))|150)|151|(1:153)|154|(1:156)(1:168)|157|(1:167)(1:161)|162|(1:164)|165|166))))(1:419)|232|233|234|235|236|237|238|239|(3:241|(7:245|(3:250|(2:252|253)(2:254|(2:259|(2:261|262)(1:263)))|249)|247|248|249|242|243)|264)(1:407)|265|(1:404)(1:282)|(1:403)(4:286|287|288|(4:290|(3:(1:304)(1:397)|305|(1:307)(2:308|(1:310)(28:311|312|313|314|315|316|(2:321|(3:323|324|325)(2:330|331))|332|(1:334)(1:393)|335|(1:337)(3:390|391|392)|(1:339)(1:389)|340|(2:384|385)(1:(1:383)(1:345))|346|(1:350)|(1:352)(1:382)|353|(3:357|(3:360|(2:362|363)(1:379)|358)|380)|381|364|(1:366)(1:378)|367|(2:376|377)(2:371|372)|373|(2:375|(0)(0))|329|(0)(0))))|99|(0)(0)))|398|(0)|(0)(0)|305|(0)(0)|99|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0572, code lost:
    
        if (r0 != null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x047b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x047c, code lost:
    
        r37 = r8;
        r35 = r9;
        r36 = r11;
        r34 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0486, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0487, code lost:
    
        r33 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0350 A[Catch: Exception -> 0x029f, TryCatch #1 {Exception -> 0x029f, blocks: (B:243:0x0262, B:245:0x0268, B:250:0x0271, B:254:0x027c, B:257:0x0283, B:259:0x028f, B:261:0x029b, B:268:0x02ae, B:270:0x02b4, B:272:0x02ba, B:274:0x02c4, B:276:0x02ce, B:278:0x02d4, B:280:0x02e0, B:294:0x030a, B:296:0x0312, B:298:0x0318, B:300:0x0320, B:305:0x0335, B:308:0x0350, B:311:0x035e, B:315:0x0369, B:319:0x0371, B:321:0x0377, B:331:0x0389, B:332:0x038f, B:335:0x0395, B:340:0x03d5, B:346:0x0402, B:348:0x0406, B:350:0x040c, B:352:0x0411, B:353:0x041a, B:357:0x0425, B:358:0x0429, B:360:0x042f, B:363:0x043b, B:364:0x0441, B:366:0x0448, B:367:0x0454, B:369:0x0458, B:378:0x044e, B:382:0x0416, B:343:0x03e6, B:345:0x03f2, B:383:0x03fc, B:388:0x03e1, B:389:0x03cf, B:397:0x032e, B:385:0x03d9), top: B:242:0x0262, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x032e A[Catch: Exception -> 0x029f, TryCatch #1 {Exception -> 0x029f, blocks: (B:243:0x0262, B:245:0x0268, B:250:0x0271, B:254:0x027c, B:257:0x0283, B:259:0x028f, B:261:0x029b, B:268:0x02ae, B:270:0x02b4, B:272:0x02ba, B:274:0x02c4, B:276:0x02ce, B:278:0x02d4, B:280:0x02e0, B:294:0x030a, B:296:0x0312, B:298:0x0318, B:300:0x0320, B:305:0x0335, B:308:0x0350, B:311:0x035e, B:315:0x0369, B:319:0x0371, B:321:0x0377, B:331:0x0389, B:332:0x038f, B:335:0x0395, B:340:0x03d5, B:346:0x0402, B:348:0x0406, B:350:0x040c, B:352:0x0411, B:353:0x041a, B:357:0x0425, B:358:0x0429, B:360:0x042f, B:363:0x043b, B:364:0x0441, B:366:0x0448, B:367:0x0454, B:369:0x0458, B:378:0x044e, B:382:0x0416, B:343:0x03e6, B:345:0x03f2, B:383:0x03fc, B:388:0x03e1, B:389:0x03cf, B:397:0x032e, B:385:0x03d9), top: B:242:0x0262, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(JSONObject jSONObject) {
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
        HashMap hashMap;
        ArrayList arrayList;
        String str8;
        String str9;
        HashMap hashMap2;
        int i10;
        String str10;
        JSONArray jSONArray;
        ArrayList arrayList2;
        HashSet hashSet;
        String str11;
        l0 l0Var;
        String i11;
        HashMap hashMap3;
        String str12;
        l0 l0Var2;
        ArrayList arrayList3;
        HashMap hashMap4;
        String str13;
        ArrayList arrayList4;
        HashSet hashSet2;
        TL_wallet.walletTransaction wallettransaction;
        TL_wallet.walletTransaction wallettransaction2;
        int i12;
        TL_wallet.walletTransaction wallettransaction3;
        String str14;
        TL_wallet.nftItem nftitem;
        String str15;
        int i13;
        int i14;
        long parseLong;
        String string;
        JSONObject jSONObject2;
        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress;
        String str16;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        int i15;
        JSONArray jSONArray2;
        JSONObject optJSONObject3;
        a1 a1Var = this.s;
        if (a1Var == null || !TextUtils.equals(a1Var.b, s())) {
            return;
        }
        String optString2 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
        String str17 = "finality";
        String optString3 = jSONObject.optString("finality");
        F("streaming " + optString2 + ", finality: " + optString3);
        if ("account_state_change".equals(optString2) && "finalized".equals(optString3) && (this.e instanceof TL_wallet.TL_walletState) && (optJSONObject3 = jSONObject.optJSONObject("state")) != null) {
            try {
                long parseLong2 = Long.parseLong(optJSONObject3.getString("balance"));
                if (parseLong2 >= 0 && ((TL_wallet.TL_walletState) this.e).balance != parseLong2) {
                    F("streaming updates balance to " + parseLong2);
                    this.k = System.currentTimeMillis();
                    this.l = true;
                    ((TL_wallet.TL_walletState) this.e).balance = parseLong2;
                    L();
                    J();
                    l0 l0Var3 = this.n;
                    if (l0Var3 != null) {
                        l0Var3.f();
                    }
                }
            } catch (Exception unused) {
                i("Invalid streaming balance");
            }
        }
        l0 l0Var4 = this.n;
        String str18 = "confirmed";
        if (l0Var4 != null) {
            ArrayList arrayList5 = l0Var4.b;
            HashSet hashSet3 = l0Var4.d;
            HashMap hashMap5 = l0Var4.f;
            m0 m0Var = l0Var4.l;
            int i16 = 1;
            ArrayList arrayList6 = m0Var.p;
            HashMap hashMap6 = l0Var4.e;
            String optString4 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
            str = optString2;
            String str19 = "trace_external_hash_norm";
            if ("trace_invalidated".equals(optString4)) {
                String optString5 = jSONObject.optString("trace_external_hash_norm");
                if (!TextUtils.isEmpty(optString5)) {
                    ArrayList arrayList7 = new ArrayList(hashMap6.keySet());
                    int size = arrayList7.size();
                    boolean z10 = false;
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList7.get(i17);
                        i17++;
                        String str20 = (String) obj;
                        if (a0((String) hashMap6.get(str20), optString5)) {
                            hashMap6.remove(str20);
                            hashSet3.remove(str20);
                            TL_wallet.walletTransaction wallettransaction4 = (TL_wallet.walletTransaction) hashMap5.remove(str20);
                            String str21 = optString5;
                            int size2 = arrayList5.size() - 1;
                            while (size2 >= 0) {
                                ArrayList arrayList8 = arrayList7;
                                if (arrayList5.get(size2) == wallettransaction4 || TextUtils.equals(((TL_wallet.walletTransaction) arrayList5.get(size2)).id, str20)) {
                                    arrayList5.remove(size2);
                                    z10 = true;
                                }
                                size2--;
                                arrayList7 = arrayList8;
                            }
                            optString5 = str21;
                        }
                    }
                    if (z10) {
                        l0Var4.j();
                        l0Var4.h();
                    }
                }
                str6 = optString3;
                str2 = "finalized";
                str7 = "confirmed";
                str3 = "trace_invalidated";
            } else {
                str3 = "trace_invalidated";
                if ("transactions".equals(optString4) && (((equals = "finalized".equals((optString = jSONObject.optString("finality")))) || "confirmed".equals(optString)) && (optJSONArray = jSONObject.optJSONArray("transactions")) != null)) {
                    str2 = "finalized";
                    int i18 = 0;
                    boolean z11 = false;
                    while (i18 < optJSONArray.length()) {
                        JSONObject optJSONObject4 = optJSONArray.optJSONObject(i18);
                        if (optJSONObject4 != null) {
                            i10 = i18;
                            if (optJSONObject4.optBoolean("emulated")) {
                                ArrayList arrayList9 = arrayList6;
                                hashMap = hashMap6;
                                arrayList = arrayList9;
                                str8 = str17;
                                str9 = optString3;
                                l0Var = l0Var4;
                                hashMap2 = hashMap5;
                                str10 = str18;
                                jSONArray = optJSONArray;
                                arrayList2 = arrayList5;
                                hashSet = hashSet3;
                                str11 = str19;
                            } else {
                                jSONArray = optJSONArray;
                                if ("pending".equals(optJSONObject4.optString(str17)) || (i11 = l0.i(optJSONObject4)) == null) {
                                    ArrayList arrayList10 = arrayList6;
                                    hashMap = hashMap6;
                                    arrayList = arrayList10;
                                    str11 = str19;
                                    str8 = str17;
                                    str9 = optString3;
                                    l0Var = l0Var4;
                                    hashMap2 = hashMap5;
                                    str10 = str18;
                                    arrayList2 = arrayList5;
                                    hashSet = hashSet3;
                                } else {
                                    str8 = str17;
                                    str9 = optString3;
                                    try {
                                        str10 = str18;
                                        try {
                                        } catch (Exception e) {
                                            e = e;
                                            hashMap3 = hashMap6;
                                            str12 = str19;
                                            l0Var2 = l0Var4;
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        hashMap3 = hashMap6;
                                        str12 = str19;
                                        l0Var2 = l0Var4;
                                        arrayList3 = arrayList6;
                                        hashMap4 = hashMap5;
                                        str13 = i11;
                                        str10 = str18;
                                    }
                                    if (a(optJSONObject4.getString("account"), m0Var.s())) {
                                        JSONObject jSONObject3 = optJSONObject4.getJSONObject("description");
                                        if (!jSONObject3.optBoolean("destroyed")) {
                                            boolean optBoolean = jSONObject3.optBoolean("aborted");
                                            JSONObject optJSONObject5 = jSONObject3.optJSONObject("compute_ph");
                                            str12 = str19;
                                            if (optJSONObject5 != null) {
                                                l0Var2 = l0Var4;
                                                try {
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    hashMap3 = hashMap6;
                                                    arrayList3 = arrayList6;
                                                    hashMap4 = hashMap5;
                                                    str13 = i11;
                                                    arrayList4 = arrayList5;
                                                    hashSet2 = hashSet3;
                                                    wallettransaction = null;
                                                    j("stream transaction parse failed", e);
                                                    wallettransaction2 = wallettransaction;
                                                    if (wallettransaction2 == null) {
                                                    }
                                                }
                                                if (!optJSONObject5.optBoolean("skipped")) {
                                                    if (optJSONObject5.optBoolean("success")) {
                                                        if (optJSONObject5.optInt("exit_code") != 0) {
                                                        }
                                                    }
                                                    hashMap3 = hashMap6;
                                                    arrayList3 = arrayList6;
                                                    hashMap4 = hashMap5;
                                                    str13 = i11;
                                                    arrayList4 = arrayList5;
                                                    hashSet2 = hashSet3;
                                                    wallettransaction2 = null;
                                                    wallettransaction = null;
                                                    if (wallettransaction2 == null) {
                                                        str11 = str12;
                                                        l0Var = l0Var2;
                                                        hashSet = hashSet2;
                                                        hashMap = hashMap3;
                                                        arrayList2 = arrayList4;
                                                        hashMap2 = hashMap4;
                                                        arrayList = arrayList3;
                                                    } else {
                                                        if (wallettransaction2.incoming) {
                                                            wallettransaction3 = wallettransaction;
                                                            hashMap2 = hashMap4;
                                                            str14 = str13;
                                                            arrayList = arrayList3;
                                                            i12 = 0;
                                                        } else {
                                                            arrayList = arrayList3;
                                                            ArrayList arrayList11 = new ArrayList(arrayList);
                                                            int size3 = arrayList11.size();
                                                            int i19 = 0;
                                                            while (i19 < size3) {
                                                                Object obj2 = arrayList11.get(i19);
                                                                i19++;
                                                                wallettransaction3 = (TL_wallet.walletTransaction) obj2;
                                                                boolean a02 = a0(wallettransaction3.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash);
                                                                boolean a03 = a0(wallettransaction3.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash);
                                                                if (!wallettransaction3.incoming && (a02 || a03)) {
                                                                    wallettransaction2.gasless = a02;
                                                                    if (wallettransaction2.nft == null && (nftitem = wallettransaction3.nft) != null) {
                                                                        wallettransaction2.nft = nftitem;
                                                                        wallettransaction2.peer = wallettransaction3.peer;
                                                                        wallettransaction2.amount = wallettransaction3.amount;
                                                                        wallettransaction2.comment = wallettransaction3.comment;
                                                                    }
                                                                    if (wallettransaction3.pending || wallettransaction3.failed || TextUtils.isEmpty(wallettransaction3.id)) {
                                                                        m0Var.b(wallettransaction3, wallettransaction2);
                                                                    } else {
                                                                        wallettransaction3.gasless = wallettransaction2.gasless;
                                                                    }
                                                                    i12 = 0;
                                                                    wallettransaction3.pending = false;
                                                                    wallettransaction3.failed = false;
                                                                    wallettransaction3.phase = wallettransaction2.phase;
                                                                    arrayList.remove(wallettransaction3);
                                                                    o0 o0Var = (o0) m0Var.t.remove(wallettransaction3);
                                                                    if (o0Var != null) {
                                                                        o0Var.b();
                                                                    }
                                                                    hashMap2 = hashMap4;
                                                                    str14 = str13;
                                                                }
                                                            }
                                                            i12 = 0;
                                                            wallettransaction3 = wallettransaction;
                                                            hashMap2 = hashMap4;
                                                            str14 = str13;
                                                        }
                                                        TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) hashMap2.get(str14);
                                                        if (wallettransaction5 != null) {
                                                            int i20 = i12;
                                                            while (true) {
                                                                if (i20 < arrayList4.size()) {
                                                                    arrayList2 = arrayList4;
                                                                    if (arrayList2.get(i20) == wallettransaction5) {
                                                                        break;
                                                                    }
                                                                    i20++;
                                                                    arrayList4 = arrayList2;
                                                                } else {
                                                                    arrayList2 = arrayList4;
                                                                    wallettransaction5 = l0.c(wallettransaction5.id, arrayList2);
                                                                }
                                                            }
                                                        } else {
                                                            arrayList2 = arrayList4;
                                                        }
                                                        wallettransaction5 = l0.c(str14, arrayList2);
                                                        if (wallettransaction5 == null) {
                                                            int size4 = arrayList2.size();
                                                            int i21 = i12;
                                                            while (true) {
                                                                if (i21 >= size4) {
                                                                    wallettransaction5 = wallettransaction;
                                                                    break;
                                                                }
                                                                Object obj3 = arrayList2.get(i21);
                                                                i21++;
                                                                TL_wallet.walletTransaction wallettransaction6 = (TL_wallet.walletTransaction) obj3;
                                                                if (f0(wallettransaction6, wallettransaction2)) {
                                                                    wallettransaction5 = wallettransaction6;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        if (wallettransaction5 != null) {
                                                            hashMap2.put(str14, wallettransaction5);
                                                            if (wallettransaction3 != null) {
                                                                wallettransaction5.gasless = wallettransaction2.gasless;
                                                                wallettransaction5.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                                                                wallettransaction5.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                                                                TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                                                if (nftitem2 != null) {
                                                                    wallettransaction5.nft = nftitem2;
                                                                    wallettransaction5.peer = wallettransaction2.peer;
                                                                    wallettransaction5.amount = wallettransaction2.amount;
                                                                    wallettransaction5.comment = wallettransaction2.comment;
                                                                }
                                                                z11 = true;
                                                            }
                                                            hashMap = hashMap3;
                                                            if (equals) {
                                                                hashMap.remove(str14);
                                                            }
                                                            str11 = str12;
                                                            l0Var = l0Var2;
                                                            hashSet = hashSet2;
                                                        } else {
                                                            hashMap = hashMap3;
                                                            if (wallettransaction3 == null) {
                                                                int size5 = arrayList.size();
                                                                int i22 = i12;
                                                                while (i22 < size5) {
                                                                    Object obj4 = arrayList.get(i22);
                                                                    i22++;
                                                                    TL_wallet.walletTransaction wallettransaction7 = (TL_wallet.walletTransaction) obj4;
                                                                    if (wallettransaction7.incoming == wallettransaction2.incoming && ((!TextUtils.isEmpty(wallettransaction7.id) && TextUtils.equals(wallettransaction7.id, wallettransaction2.id)) || a0(wallettransaction7.tx_hash, wallettransaction2.tx_hash) || a0(wallettransaction7.messageHash, wallettransaction2.messageHash))) {
                                                                        hashSet = hashSet2;
                                                                        hashSet.remove(str14);
                                                                        hashMap.remove(str14);
                                                                        str11 = str12;
                                                                        l0Var = l0Var2;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            hashSet = hashSet2;
                                                            if (wallettransaction3 != null) {
                                                                wallettransaction2 = wallettransaction3;
                                                            }
                                                            l0Var = l0Var2;
                                                            l0Var.e(wallettransaction2);
                                                            hashMap2.put(str14, wallettransaction2);
                                                            hashSet.add(str14);
                                                            if (equals) {
                                                                hashMap.remove(str14);
                                                                str11 = str12;
                                                            } else {
                                                                str11 = str12;
                                                                hashMap.put(str14, jSONObject.optString(str11));
                                                            }
                                                            StringBuilder sb2 = new StringBuilder("stream inserted ");
                                                            sb2.append(str14);
                                                            String str22 = wallettransaction2.id;
                                                            if (str22 == null || TextUtils.equals(str22, str14)) {
                                                                str15 = "";
                                                            } else {
                                                                str15 = " as " + wallettransaction2.id;
                                                            }
                                                            sb2.append(str15);
                                                            F(sb2.toString());
                                                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                                                            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                                                                String str23 = walletTransactionPeer.address;
                                                                m0Var.X(str23, new q(l0Var, wallettransaction2.id, str23, walletTransactionPeer.domain));
                                                            }
                                                            z11 = true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                l0Var2 = l0Var4;
                                            }
                                            String s10 = m0Var.s();
                                            JSONObject optJSONObject6 = optJSONObject4.optJSONObject("in_msg");
                                            hashSet2 = hashSet3;
                                            ArrayList arrayList12 = new ArrayList();
                                            hashMap3 = hashMap6;
                                            JSONArray optJSONArray2 = optJSONObject4.optJSONArray("out_msgs");
                                            arrayList4 = arrayList5;
                                            hashMap4 = hashMap5;
                                            str13 = i11;
                                            arrayList3 = arrayList6;
                                            if (optJSONArray2 != null) {
                                                int i23 = 0;
                                                i13 = 0;
                                                while (i23 < optJSONArray2.length()) {
                                                    try {
                                                        JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i23);
                                                        if (optJSONObject7 != null) {
                                                            if (optJSONObject7.optBoolean("bounced")) {
                                                                jSONArray2 = optJSONArray2;
                                                                i13 = i16;
                                                            } else if (!optJSONObject7.isNull("value") && Long.parseLong(optJSONObject7.getString("value")) > 0) {
                                                                jSONArray2 = optJSONArray2;
                                                                if (!a(optJSONObject7.getString("destination"), s10)) {
                                                                    arrayList12.add(optJSONObject7);
                                                                }
                                                            }
                                                            i23++;
                                                            optJSONArray2 = jSONArray2;
                                                        }
                                                        jSONArray2 = optJSONArray2;
                                                        i23++;
                                                        optJSONArray2 = jSONArray2;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        wallettransaction = null;
                                                        j("stream transaction parse failed", e);
                                                        wallettransaction2 = wallettransaction;
                                                        if (wallettransaction2 == null) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                i13 = 0;
                                            }
                                            boolean z12 = (i13 != 0 || optJSONObject6 == null || optJSONObject6.isNull("source") || optJSONObject6.isNull("value") || !a(optJSONObject6.getString("destination"), s10) || a(optJSONObject6.getString("source"), s10) || optJSONObject6.optBoolean("bounced") || Long.parseLong(optJSONObject6.getString("value")) <= 0 || !arrayList12.isEmpty()) ? 0 : i16;
                                            if (z12 == 0 && i13 == 0 && !optBoolean) {
                                                try {
                                                    i15 = i16;
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    wallettransaction = null;
                                                    j("stream transaction parse failed", e);
                                                    wallettransaction2 = wallettransaction;
                                                    if (wallettransaction2 == null) {
                                                    }
                                                }
                                                if (arrayList12.size() == i15) {
                                                    i14 = i15;
                                                    if ((z12 == 0 || i14 != 0) && (i14 == 0 || ((optJSONObject2 = jSONObject3.optJSONObject("action")) != null && optJSONObject2.optBoolean("success") && !optJSONObject2.optBoolean("no_funds") && optJSONObject2.optInt("result_code") == 0))) {
                                                        JSONObject jSONObject4 = z12 == 0 ? optJSONObject6 : (JSONObject) arrayList12.get(0);
                                                        parseLong = Long.parseLong(jSONObject4.getString("value"));
                                                        if (parseLong < MessagesController.getInstance(m0Var.a).config.walletTransferMinNanos.get()) {
                                                            wallettransaction2 = new TL_wallet.walletTransaction();
                                                            String i24 = l0.i(optJSONObject4);
                                                            wallettransaction2.id = i24;
                                                            if (i24 != null) {
                                                                wallettransaction2.tx_hash = optJSONObject4.getString("hash");
                                                                try {
                                                                    wallettransaction2.messageHash = jSONObject4.optString("hash", null);
                                                                    if (i14 != 0 && optJSONObject6 != null && (optJSONObject = optJSONObject6.optJSONObject("message_content")) != null) {
                                                                        if (optJSONObject6.isNull("source")) {
                                                                            wallettransaction = null;
                                                                            try {
                                                                                wallettransaction2.normalMessageBodyHash = optJSONObject.optString("hash", null);
                                                                            } catch (Exception e13) {
                                                                                e = e13;
                                                                                j("stream transaction parse failed", e);
                                                                                wallettransaction2 = wallettransaction;
                                                                                if (wallettransaction2 == null) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            wallettransaction2.gaslessMessageBodyHash = optJSONObject.optString("hash", null);
                                                                        }
                                                                    }
                                                                    wallettransaction2.incoming = z12;
                                                                    if (z12 == 0) {
                                                                        parseLong = -parseLong;
                                                                    }
                                                                    wallettransaction2.amount = parseLong;
                                                                    wallettransaction2.date = optJSONObject4.getInt("now");
                                                                    wallettransaction2.fee = Long.parseLong(optJSONObject4.getString("total_fees"));
                                                                    wallettransaction2.feeUnknown = false;
                                                                    wallettransaction2.failed = false;
                                                                    wallettransaction2.pending = false;
                                                                    wallettransaction2.phase = WalletEngine2.SendPhase.CONFIRMED;
                                                                    wallettransaction2.comment_encrypted = WalletEngine2.isEncryptedComment(jSONObject4);
                                                                    JSONObject optJSONObject8 = jSONObject4.optJSONObject("message_content");
                                                                    String optString6 = optJSONObject8 == null ? null : optJSONObject8.optString("body", null);
                                                                    JSONObject optJSONObject9 = optJSONObject8 == null ? null : optJSONObject8.optJSONObject("decoded");
                                                                    if (wallettransaction2.comment_encrypted) {
                                                                        try {
                                                                            wallettransaction2.comment = WalletEngine2.encryptedCommentPayload(optString6);
                                                                        } catch (Exception unused2) {
                                                                            wallettransaction2.comment_encrypted = false;
                                                                        }
                                                                    } else if (optJSONObject9 == null || !"text_comment".equals(optJSONObject9.optString(TeXSymbolParser.TYPE_ATTR))) {
                                                                        wallettransaction2.comment = WalletEngine2.textCommentFromBody(optString6);
                                                                    } else {
                                                                        wallettransaction2.comment = optJSONObject9.optString("comment", null);
                                                                    }
                                                                    String str24 = wallettransaction2.comment;
                                                                    if (str24 != null && str24.isEmpty()) {
                                                                        wallettransaction2.comment = null;
                                                                    }
                                                                    string = z12 != 0 ? optJSONObject6.getString("source") : jSONObject4.getString("destination");
                                                                    JSONObject optJSONObject10 = jSONObject.optJSONObject("address_book");
                                                                    if (optJSONObject10 != null && string != null) {
                                                                        Iterator<String> keys = optJSONObject10.keys();
                                                                        while (keys.hasNext()) {
                                                                            String next = keys.next();
                                                                            if (a(next, string)) {
                                                                                jSONObject2 = optJSONObject10.optJSONObject(next);
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    jSONObject2 = null;
                                                                    wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                                                    wallettransactionpeeraddress.address = jSONObject2 == null ? T(string, false) : jSONObject2.optString("user_friendly", string);
                                                                    if (jSONObject2 == null || jSONObject2.isNull("domain")) {
                                                                        wallettransaction = null;
                                                                        str16 = null;
                                                                    } else {
                                                                        wallettransaction = null;
                                                                        str16 = jSONObject2.optString("domain", null);
                                                                    }
                                                                    wallettransactionpeeraddress.domain = str16;
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    wallettransaction = null;
                                                                }
                                                                if (a(wallettransactionpeeraddress.address, string)) {
                                                                    wallettransaction2.peer = wallettransactionpeeraddress;
                                                                    if (wallettransaction2 == null) {
                                                                    }
                                                                }
                                                                wallettransaction2 = wallettransaction;
                                                                if (wallettransaction2 == null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    wallettransaction2 = null;
                                                    wallettransaction = null;
                                                    if (wallettransaction2 == null) {
                                                    }
                                                }
                                            }
                                            i14 = 0;
                                            if (z12 == 0) {
                                            }
                                            if (z12 == 0) {
                                            }
                                            parseLong = Long.parseLong(jSONObject4.getString("value"));
                                            if (parseLong < MessagesController.getInstance(m0Var.a).config.walletTransferMinNanos.get()) {
                                            }
                                            wallettransaction2 = null;
                                            wallettransaction = null;
                                            if (wallettransaction2 == null) {
                                            }
                                        }
                                    }
                                    hashMap3 = hashMap6;
                                    str12 = str19;
                                    l0Var2 = l0Var4;
                                    arrayList3 = arrayList6;
                                    hashMap4 = hashMap5;
                                    str13 = i11;
                                    arrayList4 = arrayList5;
                                    hashSet2 = hashSet3;
                                    wallettransaction2 = null;
                                    wallettransaction = null;
                                    if (wallettransaction2 == null) {
                                    }
                                }
                            }
                            HashMap hashMap7 = hashMap;
                            arrayList6 = arrayList;
                            hashMap6 = hashMap7;
                            arrayList5 = arrayList2;
                            l0Var4 = l0Var;
                            hashSet3 = hashSet;
                            str19 = str11;
                            optJSONArray = jSONArray;
                            optString3 = str9;
                            str18 = str10;
                            i16 = 1;
                            i18 = i10 + 1;
                            hashMap5 = hashMap2;
                            str17 = str8;
                        } else {
                            ArrayList arrayList13 = arrayList6;
                            hashMap = hashMap6;
                            arrayList = arrayList13;
                            str8 = str17;
                            str9 = optString3;
                            hashMap2 = hashMap5;
                            i10 = i18;
                            str10 = str18;
                            jSONArray = optJSONArray;
                            arrayList2 = arrayList5;
                            hashSet = hashSet3;
                            str11 = str19;
                            l0Var = l0Var4;
                        }
                        HashMap hashMap72 = hashMap;
                        arrayList6 = arrayList;
                        hashMap6 = hashMap72;
                        arrayList5 = arrayList2;
                        l0Var4 = l0Var;
                        hashSet3 = hashSet;
                        str19 = str11;
                        optJSONArray = jSONArray;
                        optString3 = str9;
                        str18 = str10;
                        i16 = 1;
                        i18 = i10 + 1;
                        hashMap5 = hashMap2;
                        str17 = str8;
                    }
                    str6 = optString3;
                    l0 l0Var5 = l0Var4;
                    str7 = str18;
                    if (z11) {
                        l0Var5.j();
                        l0Var5.h();
                    }
                } else {
                    str6 = optString3;
                    str2 = "finalized";
                    str7 = "confirmed";
                }
            }
            str4 = str6;
            str5 = str7;
        } else {
            str = optString2;
            str2 = "finalized";
            str3 = "trace_invalidated";
            str4 = optString3;
            str5 = "confirmed";
        }
        if (str5.equals(str4) || str2.equals(str4) || str3.equals(str)) {
            g gVar = this.F;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 250L);
        }
    }

    public final void L() {
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
        q0 q0Var = this.c;
        if (q0Var != null && !TextUtils.equals(q0Var.c, str)) {
            if (str == null) {
                F("received empty state, leaving wallet storage of " + this.c.c);
            } else {
                StringBuilder v = a1.g.v("received new state of ", str, ", leaving wallet storage of ");
                v.append(this.c.c);
                F(v.toString());
            }
            this.c = null;
        }
        if (!TextUtils.isEmpty(str) && this.c == null) {
            F("setting up wallet storage of " + str);
            this.c = new q0(ApplicationLoader.applicationContext, str, this.a);
            F("storage public keys = " + this.c.m().length);
        }
        e0 e0Var = this.o;
        if (e0Var != null && !TextUtils.equals(e0Var.e, str)) {
            e0Var.e = str;
            e0Var.c();
        }
        if (this.b != null && !TextUtils.equals(this.d, str)) {
            this.b.close();
            this.b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.b == null || !TextUtils.equals(this.d, str))) {
            if (this.b != null) {
                F("closing wallet-engine of " + this.d);
                this.b.close();
                this.b = null;
            }
            F("creating wallet-engine for " + str);
            try {
                int i10 = this.a;
                this.d = str;
                this.b = new WalletEngine2(i10, str, bArr);
            } catch (Exception e) {
                j("failed to create engine!", e);
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
                    AndroidUtilities.runOnUIThread(runnable);
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
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
            this.w.clear();
        }
        if (!TextUtils.equals(this.I, str)) {
            U();
        }
        Q();
    }

    public final void M(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            e0(str);
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
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && a0(str2, str3)) {
                    c(wallettransaction, tL_updateSentWalletTransaction);
                    return;
                }
            }
            TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
            if (wallettransaction2 != null) {
                wallettransaction2.messageHash = tL_updateSentWalletTransaction.msg_hash;
                wallettransaction2.gasless = tL_updateSentWalletTransaction.gasless;
                wallettransaction2.pending = false;
                arrayList.add(0, wallettransaction2);
                A().j();
                A().h();
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void N(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f = tL_updateWalletGaslessInfo;
        L();
        J();
    }

    public final void O(TL_update.TL_updateWalletState tL_updateWalletState) {
        i0(tL_updateWalletState.state);
    }

    public final void P() {
        d0();
        this.p.clear();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j0 j0Var = ((g0) obj).b;
            if (j0Var != null) {
                j0Var.close();
            }
        }
        arrayList.clear();
        l0 l0Var = this.n;
        if (l0Var != null) {
            l0Var.a();
            l0Var.b.clear();
            l0Var.d.clear();
            l0Var.e.clear();
            l0Var.f.clear();
            l0Var.g = "";
            l0Var.h = false;
            l0Var.j();
            this.n.j();
            this.n.h();
        }
        Q();
        this.f = null;
        V();
    }

    public final void Q() {
        if (!TextUtils.equals(this.u, s())) {
            d0();
            this.u = s();
        }
        boolean E = E();
        int i10 = this.a;
        if (!E || TextUtils.isEmpty(s())) {
            d0();
        } else {
            HashMap hashMap = this.t;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((o0) hashMap.get(wallettransaction)).b, wallettransaction.messageHash)) {
                    ((o0) hashMap.remove(wallettransaction)).b();
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
                    o0 o0Var = new o0(i10, str, new fr0(24, this, wallettransaction2));
                    hashMap.put(wallettransaction2, o0Var);
                    if (!o0Var.d && !TextUtils.isEmpty(str)) {
                        o0Var.d = true;
                        o0Var.f = 0;
                        o0Var.a();
                    }
                }
            }
        }
        boolean z10 = (!E() || TextUtils.isEmpty(s()) || this.E.isEmpty()) ? false : true;
        a1 a1Var = this.s;
        boolean z11 = a1Var != null && a1Var.d;
        if (z11 == z10 && (!z11 || a1Var == null || TextUtils.equals(a1Var.b, s()))) {
            return;
        }
        if (!z10) {
            a1 a1Var2 = this.s;
            if (a1Var2 != null) {
                a1Var2.h();
            }
            AndroidUtilities.cancelRunOnUIThread(this.F);
            return;
        }
        a1 a1Var3 = this.s;
        if (a1Var3 != null && !TextUtils.equals(a1Var3.b, s())) {
            this.s.h();
            this.s = null;
        }
        if (this.s == null) {
            this.s = new a1(i10, s(), this);
        }
        a1 a1Var4 = this.s;
        boolean z12 = a1Var4.d;
        if (z12) {
            return;
        }
        String str2 = a1Var4.b;
        if (z12 || TextUtils.isEmpty(str2)) {
            a1Var4.d("start ignored: running=" + a1Var4.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
            return;
        }
        a1Var4.d("starting; address=" + str2);
        a1Var4.d = true;
        a1Var4.j = 0;
        a1Var4.e();
    }

    public final void S(j0 j0Var, boolean z10, Utilities.Callback2 callback2) {
        j0 b10 = j0Var.b();
        F("requesting proof challenge");
        ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getProofChallenge(), new org.telegram.messenger.a(), new w(this, b10, callback2, z10, 0));
    }

    public final void U() {
        int i10;
        this.I = s();
        ArrayList n10 = q0.n(ApplicationLoader.applicationContext, UserConfig.getInstance(this.a).getClientUserId());
        n10.remove(this.I);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            i0 i0Var = (i0) obj;
            hashMap.put(i0Var.a, i0Var);
        }
        this.G.clear();
        int size2 = n10.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = n10.get(i12);
            i12++;
            String str = (String) obj2;
            i0 i0Var2 = (i0) hashMap.get(str);
            if (i0Var2 == null) {
                i0Var2 = new i0(new q0(ApplicationLoader.applicationContext, str, this.a));
            }
            q0 q0Var = i0Var2.f;
            synchronized (q0.f) {
                try {
                    try {
                        i10 = q0Var.r().b;
                    } catch (Exception e) {
                        FileLog.e(e);
                        i10 = 0;
                    }
                } finally {
                }
            }
            i0Var2.b = i10;
            this.G.add(i0Var2);
            t(str, null);
            h0((d0) this.N.get(str));
        }
        Collections.sort(this.G, new lg0(9));
    }

    public final void V() {
        F("requesting gasless info");
        this.B = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new org.telegram.messenger.a(), new i(this, 2));
    }

    public final void W() {
        F("requesting state");
        this.A = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getState(), new org.telegram.messenger.a(), new i(this, 1));
    }

    public final void X(String str, Utilities.Callback2 callback2) {
        if (str == null) {
            callback2.run(null, null);
            return;
        }
        HashMap hashMap = this.M;
        if (hashMap.containsKey(str)) {
            callback2.run((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.a).sendRequestTyped(getuseraddresses, new org.telegram.messenger.a(), new k((Object) this, (Object) str, (Object) callback2, 0));
    }

    public final void Y(TLRPC.User user, Utilities.Callback2 callback2) {
        if (user == null) {
            callback2.run(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.id);
        HashMap hashMap = this.L;
        if (hashMap.containsKey(valueOf)) {
            callback2.run((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.id;
        int i10 = this.a;
        arrayList.add(MessagesController.getInstance(i10).getInputUser(user));
        ConnectionsManager.getInstance(i10).sendRequestTyped(getuseraddresses, new org.telegram.messenger.a(), new k(this, (Object) callback2, (Object) user, 1));
    }

    public final void Z(String str, Utilities.Callback callback) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z10 = org.telegram.ui.web.a1.P0;
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
        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new org.telegram.messenger.a(), new ai.q5(this, str, callback), MessagesController.getInstance(i10).webFileDatacenterId, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.nftItem nftitem;
        int size;
        e0 e0Var;
        g0 g0Var;
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
        if (walletTransactionPeer2 != null && walletTransactionPeer != null && a(walletTransactionPeer.address, walletTransactionPeer2.address)) {
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
                    l0 A = A();
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
                                g0Var = null;
                                break;
                            }
                            Object obj = arrayList2.get(i10);
                            i10++;
                            g0Var = (g0) obj;
                            if (TextUtils.equals(g0Var.a, wallettransaction.messageHash)) {
                                break;
                            }
                        }
                        if (g0Var != null) {
                            if (z10) {
                                j0 j0Var = g0Var.b;
                                if (j0Var != null) {
                                    j0Var.close();
                                }
                            } else {
                                g0Var.a();
                            }
                            arrayList2.remove(g0Var);
                        }
                    }
                    Utilities.Callback callback = (Utilities.Callback) this.q.remove(wallettransaction);
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z11));
                    }
                    F("completed pending transaction: msg_hash=" + wallettransaction.messageHash + ", body_hash=" + wallettransaction.gaslessMessageBodyHash + ", transaction_id=" + wallettransaction.id + ", tx_hash=" + wallettransaction.tx_hash + ", success=" + z11);
                    A.j();
                    A.h();
                    Q();
                }
                if (wallettransaction.nft != null || (e0Var = this.o) == null) {
                }
                e0.a(e0Var, wallettransaction);
                e0 e0Var2 = this.o;
                if (e0Var2.j) {
                    return;
                }
                e0Var2.b();
                e0Var2.f(true);
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

    public final void b0(TLRPC.User user, String str, long j10, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, Utilities.Callback callback, Utilities.Callback callback2, e2 e2Var) {
        String s10 = s();
        F("send to " + str + ", amount " + j10 + ", when ready...");
        j0(new r(this, str, callback, nftitem, s10, str2, bArr, j10, user, str3, callback2, e2Var, 0));
    }

    public final void c(TL_wallet.walletTransaction wallettransaction, TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        wallettransaction.messageHash = tL_updateSentWalletTransaction.msg_hash;
        wallettransaction.gasless = tL_updateSentWalletTransaction.gasless;
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            b(wallettransaction, wallettransaction2);
        } else {
            Q();
        }
    }

    public final boolean d() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled) {
            return true;
        }
        q0 q0Var = this.c;
        return q0Var != null && q0Var.f(tL_walletState.public_key);
    }

    public final void d0() {
        HashMap hashMap = this.t;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((o0) it.next()).b();
        }
        hashMap.clear();
    }

    public final boolean e() {
        q0 q0Var;
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        return !tL_walletState.backup_enabled && ((q0Var = this.c) == null || !q0Var.f(tL_walletState.public_key));
    }

    public final n h(String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        a0 a0Var = new a0(this, str, j10, str2, bArr, callback2);
        j0(a0Var);
        return new n(a0Var, 0);
    }

    public final void h0(d0 d0Var) {
        if (d0Var == null) {
            return;
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = (i0) obj;
            if (TextUtils.equals(i0Var.a, d0Var.a)) {
                i0Var.c = d0Var.b;
                i0Var.d = !d0Var.e;
                byte[] bArr = d0Var.c;
                i0Var.e = (bArr == null || bArr.length <= 0 || i0Var.f.f(bArr)) ? false : true;
            }
        }
    }

    public final void i0(TL_wallet.WalletState walletState) {
        boolean z10;
        l0 l0Var;
        if (walletState == null) {
            return;
        }
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.WalletState walletState2 = this.e;
            if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                z10 = true;
                this.e = walletState;
                L();
                J();
                if (z10 || (l0Var = this.n) == null) {
                }
                l0Var.f();
                return;
            }
        }
        z10 = false;
        this.e = walletState;
        L();
        J();
        if (z10) {
        }
    }

    public final void j0(Runnable runnable) {
        if (E()) {
            runnable.run();
        } else {
            this.v.add(new WeakReference(runnable));
        }
    }

    public final CharSequence l(long j10, boolean z10) {
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
                double d10 = MessagesController.getInstance(this.a).config.tonUsdRate.get() * d;
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
                String D = z11 ? a1.g.D(g10, str4, format) : a1.g.D(format, str4, g10);
                if (z15) {
                    D = r.c.g("-", D);
                }
                int indexOf = D.indexOf(8387);
                if (indexOf < 0) {
                    return D;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(D);
                spannableStringBuilder.setSpan(new c61(AndroidUtilities.getTypeface("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                return spannableStringBuilder;
            }
        }
        return "";
    }

    public final String s() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).address;
        }
        return null;
    }

    public final d0 t(final String str, f8 f8Var) {
        HashMap hashMap = this.N;
        d0 d0Var = (d0) hashMap.get(str);
        if (d0Var != null && !d0Var.e) {
            if (f8Var != null) {
                d0Var.f.add(f8Var);
            }
            return null;
        }
        int i10 = this.a;
        if (d0Var != null && d0Var.e && ConnectionsManager.getInstance(i10).getCurrentTime() < d0Var.d + 300) {
            if (f8Var != null) {
                f8Var.run(d0Var);
            }
            return d0Var;
        }
        final d0 d0Var2 = new d0();
        d0Var2.b = -1L;
        ArrayList arrayList = new ArrayList();
        d0Var2.f = arrayList;
        d0Var2.a = str;
        d0Var2.d = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (f8Var != null) {
            arrayList.add(f8Var);
        }
        hashMap.put(str, d0Var2);
        final int i11 = 1;
        final int i12 = 0;
        Utilities.raceCallbacks(new h(this, str, d0Var2, i11), new Utilities.Callback(this) { // from class: org.telegram.ui.Wallet.m
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
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
                        m0 m0Var = this.b;
                        int i13 = m0Var.a;
                        ConnectionsManager.getInstance(i13).sendRequestTyped(performapirequest, new org.telegram.messenger.a(), new q(m0Var, d0Var2, str2, runnable, 0), MessagesController.getInstance(i13).webFileDatacenterId, 0);
                        break;
                    default:
                        m0 m0Var2 = this.b;
                        d0 d0Var3 = d0Var2;
                        String str3 = str;
                        m0Var2.Z(str3, new o(m0Var2, d0Var3, str3, (Runnable) obj));
                        break;
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.Wallet.m
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
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
                        m0 m0Var = this.b;
                        int i13 = m0Var.a;
                        ConnectionsManager.getInstance(i13).sendRequestTyped(performapirequest, new org.telegram.messenger.a(), new q(m0Var, d0Var2, str2, runnable, 0), MessagesController.getInstance(i13).webFileDatacenterId, 0);
                        break;
                    default:
                        m0 m0Var2 = this.b;
                        d0 d0Var3 = d0Var2;
                        String str3 = str;
                        m0Var2.Z(str3, new o(m0Var2, d0Var3, str3, (Runnable) obj));
                        break;
                }
            }
        });
        return null;
    }

    public final long u() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).balance;
        }
        return 0L;
    }

    public final byte[] x() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).public_key;
        }
        return null;
    }

    public final void y(Utilities.Callback2 callback2, boolean z10, boolean z11) {
        F("getSecretPhrase: whenReady...");
        j0(new e2.o0(this, callback2, z10, z11, 4));
    }
}
