package org.telegram.ui.Wallet;

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
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ib0;
import org.telegram.ui.ls0;
import org.telegram.ui.mb1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k0 {
    public static volatile k0[] K = new k0[4];
    public static DecimalFormat L;
    public final g B;
    public final ArrayList C;
    public final List D;
    public String E;
    public final g F;
    public final HashMap G;
    public final HashMap H;
    public final HashMap I;
    public final HashMap J;
    public final int a;
    public WalletEngine2 b;
    public p0 c;
    public String d;
    public TL_wallet.WalletState e;
    public TL_update.TL_updateWalletGaslessInfo f;
    public final d2 g;
    public final f h;
    public Boolean i;
    public String j;
    public long k;
    public boolean l;
    public boolean m;
    public j0 n;
    public c0 o;
    public z0 r;
    public String t;
    public int y;
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final HashMap s = new HashMap();
    public final ArrayList u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int w = -1;
    public int x = -1;
    public int z = 0;
    public final HashSet A = new HashSet();

    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Wallet.g] */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.telegram.ui.Wallet.g] */
    public k0(int i10) {
        this.y = -1;
        final int i11 = 0;
        this.B = new Runnable(this) { // from class: org.telegram.ui.Wallet.g
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        k0 k0Var = this.b;
                        z0 z0Var = k0Var.r;
                        if (z0Var != null && z0Var.d) {
                            k0Var.B();
                            break;
                        }
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        k0Var2.S();
                        k0Var2.I();
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.C = arrayList;
        this.D = DesugarCollections.unmodifiableList(arrayList);
        final int i12 = 1;
        this.F = new Runnable(this) { // from class: org.telegram.ui.Wallet.g
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        k0 k0Var = this.b;
                        z0 z0Var = k0Var.r;
                        if (z0Var != null && z0Var.d) {
                            k0Var.B();
                            break;
                        }
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        k0Var2.S();
                        k0Var2.I();
                        break;
                }
            }
        };
        this.G = new HashMap();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = new HashMap();
        this.a = i10;
        try {
            this.m = u().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e7) {
            j("failed to load prefs", e7);
        }
        this.h = new f(this);
        U();
        T();
        E("requesting has walt balance");
        this.y = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new org.telegram.messenger.a(), new h(this, i11));
        this.g = new d2(this);
        g gVar = this.F;
        Object obj = p0.f;
        synchronized (p0.class) {
            try {
                Iterator it = p0.i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        p0.i.remove(weakReference);
                    } else if (runnable == gVar) {
                        i11 = 1;
                    }
                }
                if (gVar != null && i11 == 0) {
                    p0.i.add(new WeakReference(gVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        S();
    }

    public static void E(String str) {
        FileLog.d("[gram-wallet] " + str);
    }

    public static boolean F(MessageObject messageObject, TL_wallet.walletTransaction wallettransaction) {
        if (messageObject != null && messageObject.messageOwner != null && wallettransaction != null && messageObject.isOutOwner()) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j3 = wallettransaction.random_id;
                if (j3 != 0 && message.random_id == j3) {
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

    public static byte[] Q(byte[] bArr) {
        byte[] bArr2 = new byte[215];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z10 = false;
            int i10 = 0;
            for (byte b10 : bArr) {
                if (h0.f(b10)) {
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
        } catch (RuntimeException e7) {
            Arrays.fill(bArr2, (byte) 0);
            throw e7;
        }
    }

    public static boolean Y(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            try {
                return Arrays.equals(c0(str), c0(str2));
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    public static String a(String str) {
        try {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int parseInt = Integer.parseInt(str.substring(0, indexOf));
                String substring = str.substring(indexOf + 1);
                if (substring.length() == 64) {
                    byte[] bArr = new byte[36];
                    bArr[0] = 81;
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

    public static byte[][] a0(byte[] bArr, SecureRandom secureRandom) {
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
        } catch (RuntimeException e7) {
            for (byte[] bArr3 : bArr2) {
                Arrays.fill(bArr3, (byte) 0);
            }
            throw e7;
        }
    }

    public static boolean b(String str, String str2) {
        String e02 = e0(str);
        return e02 != null && e02.equals(e0(str2));
    }

    public static byte[] c0(String str) {
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

    public static boolean d0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, wallettransaction2.id)) || Y(wallettransaction.tx_hash, wallettransaction2.tx_hash) || Y(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            return true;
        }
        if (wallettransaction.incoming || wallettransaction2.incoming) {
            return false;
        }
        return Y(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) || Y(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash);
    }

    public static String e0(String str) {
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

    public static SpannableStringBuilder m(long j3, boolean z10) {
        return k("GramCapital", n(j3, z10), R.string.GramCapital_other);
    }

    public static String n(long j3, boolean z10) {
        if ((j3 > -10000000 && j3 < 10000000) || z10) {
            return yh.p7.N0(j3);
        }
        if (L == null) {
            L = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return L.format(j3 / 1.0E9d);
    }

    public static SpannableStringBuilder o(String str, float f7) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i10 = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), i10, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder p(long j3) {
        return q(j3, false);
    }

    public static SpannableStringBuilder q(long j3, boolean z10) {
        return k("Grams", n(j3, z10), R.string.Grams_other);
    }

    public static Context u() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        return (U == null || U.getContext() == null) ? ApplicationLoader.applicationContext : U.getContext();
    }

    public static k0 v(int i10) {
        k0 k0Var;
        k0 k0Var2 = K[i10];
        if (k0Var2 != null) {
            return k0Var2;
        }
        synchronized (k0.class) {
            try {
                k0Var = K[i10];
                if (k0Var == null) {
                    k0[] k0VarArr = K;
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

    public static TL_update.TL_updateSentWalletTransaction y(TLRPC.Updates updates) {
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

    public final void A(boolean z10, boolean z11, h0 h0Var, Utilities.Callback callback) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(h0Var)) {
                callback.run("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(h0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(h0Var);
            h0 b10 = h0Var.b();
            E("import wallet: requesting proof challenge");
            q2.a(this.a, null, new n(this, b10, callback, secretPhraseToAnchorPublicKey, 2), null, null, new u(this, callback, secretPhraseToPublicKey, b10), z10, z11, new ib0(new m(b10, 2), 1));
        } catch (Exception unused2) {
            callback.run("INVALID_PHRASE");
        }
    }

    public final void B() {
        j0 j0Var = this.n;
        if (j0Var != null) {
            j0Var.d();
        }
        if (this.w >= 0) {
            return;
        }
        U();
    }

    public final boolean C() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f;
        return tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
    }

    public final boolean D() {
        return (!(this.e instanceof TL_wallet.TL_walletState) || this.b == null || this.c == null) ? false : true;
    }

    public final boolean G() {
        p0 p0Var;
        boolean z10;
        if (!(this.e instanceof TL_wallet.TL_walletState) || (p0Var = this.c) == null) {
            return false;
        }
        p0Var.getClass();
        synchronized (p0.f) {
            try {
                try {
                    z10 = p0Var.r().c;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final boolean H() {
        return this.m && !SharedConfig.passcodeHash.isEmpty();
    }

    public final void I() {
        NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletUpdate, this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:175|176|(4:178|179|180|(6:182|(2:184|(1:186))|187|94|95|(4:97|81|82|83)(5:98|(1:100)(4:147|(3:149|(2:154|155)(6:158|(1:162)|163|(1:165)|166|167)|156)|170|171)|101|(5:(3:104|(1:106)|107)|108|(1:110)|111|112)(8:113|(3:115|(2:117|(3:125|126|127)(1:134))|137)|138|(1:140)(1:146)|141|(1:143)|144|145)|83)))(1:376)|188|189|190|191|192|193|194|195|(3:197|(7:201|(3:206|(2:208|209)(2:210|(2:215|(2:217|218)(1:219)))|205)|203|204|205|198|199)|220)(1:364)|221|(1:361)(1:238)|(1:360)(4:242|243|244|(4:246|(3:(1:260)(1:354)|261|(1:263)(2:264|(1:266)(28:267|268|269|270|271|272|(2:277|(3:279|280|281)(2:286|287))|288|(1:290)(1:350)|291|(1:293)(3:347|348|349)|(1:295)(1:346)|296|(2:341|342)(1:(1:340)(1:301))|302|(1:306)|(1:308)(1:339)|309|(3:313|(3:316|(2:318|319)(1:336)|314)|337)|338|320|(1:322)(1:335)|323|(2:333|334)(2:327|328)|329|(3:331|332|(0)(0))|285|(0)(0))))|95|(0)(0)))|355|(0)|(0)(0)|261|(0)(0)|95|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x045c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x045d, code lost:
    
        r35 = r4;
        r34 = r8;
        r37 = r10;
        r36 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0467, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0468, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:260:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0331 A[Catch: Exception -> 0x0282, TryCatch #8 {Exception -> 0x0282, blocks: (B:199:0x0245, B:201:0x024b, B:206:0x0254, B:210:0x025f, B:213:0x0266, B:215:0x0272, B:217:0x027e, B:224:0x028f, B:226:0x0295, B:228:0x029b, B:230:0x02a5, B:232:0x02af, B:234:0x02b5, B:236:0x02c1, B:250:0x02eb, B:252:0x02f3, B:254:0x02f9, B:256:0x0301, B:261:0x0316, B:264:0x0331, B:267:0x033f, B:271:0x034a, B:275:0x0352, B:277:0x0358, B:287:0x036a, B:288:0x0370, B:291:0x0376, B:296:0x03b6, B:302:0x03e3, B:304:0x03e7, B:306:0x03ed, B:308:0x03f2, B:309:0x03fb, B:313:0x0406, B:314:0x040a, B:316:0x0410, B:319:0x041c, B:320:0x0422, B:322:0x0429, B:323:0x0434, B:325:0x0438, B:335:0x042e, B:339:0x03f7, B:299:0x03c7, B:301:0x03d3, B:340:0x03dd, B:345:0x03c2, B:346:0x03b0, B:354:0x030f, B:342:0x03ba), top: B:198:0x0245, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x030f A[Catch: Exception -> 0x0282, TryCatch #8 {Exception -> 0x0282, blocks: (B:199:0x0245, B:201:0x024b, B:206:0x0254, B:210:0x025f, B:213:0x0266, B:215:0x0272, B:217:0x027e, B:224:0x028f, B:226:0x0295, B:228:0x029b, B:230:0x02a5, B:232:0x02af, B:234:0x02b5, B:236:0x02c1, B:250:0x02eb, B:252:0x02f3, B:254:0x02f9, B:256:0x0301, B:261:0x0316, B:264:0x0331, B:267:0x033f, B:271:0x034a, B:275:0x0352, B:277:0x0358, B:287:0x036a, B:288:0x0370, B:291:0x0376, B:296:0x03b6, B:302:0x03e3, B:304:0x03e7, B:306:0x03ed, B:308:0x03f2, B:309:0x03fb, B:313:0x0406, B:314:0x040a, B:316:0x0410, B:319:0x041c, B:320:0x0422, B:322:0x0429, B:323:0x0434, B:325:0x0438, B:335:0x042e, B:339:0x03f7, B:299:0x03c7, B:301:0x03d3, B:340:0x03dd, B:345:0x03c2, B:346:0x03b0, B:354:0x030f, B:342:0x03ba), top: B:198:0x0245, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0499  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(JSONObject jSONObject) {
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
        String str9;
        String str10;
        String str11;
        int i10;
        String str12;
        j0 j0Var;
        HashMap hashMap;
        HashSet hashSet;
        ArrayList arrayList;
        ArrayList arrayList2;
        String g10;
        String str13;
        String str14;
        j0 j0Var2;
        HashMap hashMap2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet2;
        TL_wallet.walletTransaction wallettransaction;
        TL_wallet.walletTransaction wallettransaction2;
        boolean z10;
        int i11;
        String str15;
        TL_wallet.nftItem nftitem;
        int i12;
        int i13;
        long parseLong;
        String string;
        JSONObject jSONObject2;
        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress;
        String str16;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        int i14;
        int i15;
        JSONObject optJSONObject3;
        z0 z0Var = this.r;
        if (z0Var == null || !TextUtils.equals(z0Var.b, r())) {
            return;
        }
        String optString2 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
        String str17 = "finality";
        String optString3 = jSONObject.optString("finality");
        E("streaming " + optString2 + ", finality: " + optString3);
        String str18 = "finalized";
        if ("account_state_change".equals(optString2) && "finalized".equals(optString3) && (this.e instanceof TL_wallet.TL_walletState) && (optJSONObject3 = jSONObject.optJSONObject("state")) != null) {
            try {
                long parseLong2 = Long.parseLong(optJSONObject3.getString("balance"));
                if (parseLong2 >= 0 && ((TL_wallet.TL_walletState) this.e).balance != parseLong2) {
                    E("streaming updates balance to " + parseLong2);
                    this.k = System.currentTimeMillis();
                    this.l = true;
                    ((TL_wallet.TL_walletState) this.e).balance = parseLong2;
                    K();
                    I();
                    j0 j0Var3 = this.n;
                    if (j0Var3 != null) {
                        j0Var3.d();
                    }
                }
            } catch (Exception unused) {
                i("Invalid streaming balance");
            }
        }
        j0 j0Var4 = this.n;
        String str19 = "confirmed";
        if (j0Var4 != null) {
            ArrayList arrayList5 = j0Var4.b;
            HashSet hashSet3 = j0Var4.d;
            k0 k0Var = j0Var4.j;
            ArrayList arrayList6 = k0Var.p;
            int i16 = 1;
            HashMap hashMap3 = j0Var4.e;
            String optString4 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
            String str20 = "trace_external_hash_norm";
            str = optString2;
            if ("trace_invalidated".equals(optString4)) {
                String optString5 = jSONObject.optString("trace_external_hash_norm");
                if (!TextUtils.isEmpty(optString5)) {
                    ArrayList arrayList7 = new ArrayList(hashMap3.keySet());
                    int size = arrayList7.size();
                    int i17 = 0;
                    boolean z11 = false;
                    while (i17 < size) {
                        Object obj = arrayList7.get(i17);
                        i17++;
                        String str21 = (String) obj;
                        if (Y((String) hashMap3.get(str21), optString5)) {
                            hashMap3.remove(str21);
                            hashSet3.remove(str21);
                            for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                                if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList5.get(size2)).id, str21)) {
                                    arrayList5.remove(size2);
                                    z11 = true;
                                }
                            }
                        }
                    }
                    if (z11) {
                        j0Var4.h();
                        j0Var4.f();
                    }
                }
            } else if ("transactions".equals(optString4) && (((equals = "finalized".equals((optString = jSONObject.optString("finality")))) || "confirmed".equals(optString)) && (optJSONArray = jSONObject.optJSONArray("transactions")) != null)) {
                str3 = "trace_invalidated";
                int i18 = 0;
                boolean z12 = false;
                while (i18 < optJSONArray.length()) {
                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(i18);
                    JSONArray jSONArray = optJSONArray;
                    if (optJSONObject4 == null || optJSONObject4.optBoolean("emulated")) {
                        str8 = str17;
                        str9 = optString3;
                        str10 = str18;
                        str11 = str19;
                        i10 = i18;
                    } else {
                        i10 = i18;
                        if ("pending".equals(optJSONObject4.optString(str17)) || (g10 = j0.g(optJSONObject4)) == null) {
                            str8 = str17;
                            str9 = optString3;
                            str10 = str18;
                            str11 = str19;
                        } else {
                            str8 = str17;
                            str10 = str18;
                            try {
                                str9 = optString3;
                                try {
                                } catch (Exception e7) {
                                    e = e7;
                                    str13 = str20;
                                    str14 = g10;
                                    j0Var2 = j0Var4;
                                    hashMap2 = hashMap3;
                                    arrayList3 = arrayList6;
                                    str11 = str19;
                                    arrayList4 = arrayList5;
                                    hashSet2 = hashSet3;
                                    wallettransaction = null;
                                    j("stream transaction parse failed", e);
                                    wallettransaction2 = wallettransaction;
                                    if (wallettransaction2 != null) {
                                    }
                                }
                            } catch (Exception e10) {
                                e = e10;
                                str13 = str20;
                                str14 = g10;
                                str9 = optString3;
                            }
                            if (b(optJSONObject4.getString("account"), k0Var.r())) {
                                JSONObject jSONObject3 = optJSONObject4.getJSONObject("description");
                                if (!jSONObject3.optBoolean("destroyed")) {
                                    boolean optBoolean = jSONObject3.optBoolean("aborted");
                                    JSONObject optJSONObject5 = jSONObject3.optJSONObject("compute_ph");
                                    str11 = str19;
                                    if (optJSONObject5 != null) {
                                        str13 = str20;
                                        try {
                                        } catch (Exception e11) {
                                            e = e11;
                                            str14 = g10;
                                            j0Var2 = j0Var4;
                                            hashMap2 = hashMap3;
                                            arrayList3 = arrayList6;
                                            arrayList4 = arrayList5;
                                            hashSet2 = hashSet3;
                                            wallettransaction = null;
                                            j("stream transaction parse failed", e);
                                            wallettransaction2 = wallettransaction;
                                            if (wallettransaction2 != null) {
                                            }
                                        }
                                        if (!optJSONObject5.optBoolean("skipped")) {
                                            if (optJSONObject5.optBoolean("success")) {
                                                if (optJSONObject5.optInt("exit_code") != 0) {
                                                }
                                            }
                                            str14 = g10;
                                            j0Var2 = j0Var4;
                                            hashMap2 = hashMap3;
                                            arrayList3 = arrayList6;
                                            arrayList4 = arrayList5;
                                            hashSet2 = hashSet3;
                                            wallettransaction2 = null;
                                            if (wallettransaction2 != null) {
                                                str12 = str13;
                                                j0Var = j0Var2;
                                                hashSet = hashSet2;
                                                hashMap = hashMap2;
                                                arrayList = arrayList4;
                                                arrayList2 = arrayList3;
                                                i18 = i10 + 1;
                                                arrayList5 = arrayList;
                                                hashSet3 = hashSet;
                                                hashMap3 = hashMap;
                                                j0Var4 = j0Var;
                                                optJSONArray = jSONArray;
                                                str17 = str8;
                                                str18 = str10;
                                                optString3 = str9;
                                                i16 = 1;
                                                arrayList6 = arrayList2;
                                                str20 = str12;
                                                str19 = str11;
                                            } else {
                                                if (wallettransaction2.incoming) {
                                                    arrayList2 = arrayList3;
                                                    z10 = false;
                                                    str15 = str14;
                                                    arrayList = arrayList4;
                                                    i11 = 0;
                                                } else {
                                                    arrayList2 = arrayList3;
                                                    ArrayList arrayList8 = new ArrayList(arrayList2);
                                                    int size3 = arrayList8.size();
                                                    int i19 = 0;
                                                    z10 = false;
                                                    while (i19 < size3) {
                                                        Object obj2 = arrayList8.get(i19);
                                                        i19++;
                                                        TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj2;
                                                        boolean Y = Y(wallettransaction3.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash);
                                                        boolean Y2 = Y(wallettransaction3.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash);
                                                        if (!wallettransaction3.incoming && (Y || Y2)) {
                                                            wallettransaction2.gasless = Y;
                                                            if (wallettransaction2.nft == null && (nftitem = wallettransaction3.nft) != null) {
                                                                wallettransaction2.nft = nftitem;
                                                                wallettransaction2.peer = wallettransaction3.peer;
                                                                wallettransaction2.amount = wallettransaction3.amount;
                                                                wallettransaction2.comment = wallettransaction3.comment;
                                                            }
                                                            k0Var.c(wallettransaction3, wallettransaction2);
                                                            wallettransaction3.pending = false;
                                                            wallettransaction3.failed = false;
                                                            wallettransaction3.phase = wallettransaction2.phase;
                                                            arrayList2.remove(wallettransaction3);
                                                            m0 m0Var = (m0) k0Var.s.remove(wallettransaction3);
                                                            if (m0Var != null) {
                                                                m0Var.b();
                                                            }
                                                            z10 = true;
                                                        }
                                                    }
                                                    i11 = 0;
                                                    str15 = str14;
                                                    arrayList = arrayList4;
                                                }
                                                TL_wallet.walletTransaction b10 = j0.b(str15, arrayList);
                                                if (b10 != null) {
                                                    if (z10) {
                                                        b10.gasless = wallettransaction2.gasless;
                                                        b10.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                                                        b10.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                                                        TL_wallet.nftItem nftitem2 = wallettransaction2.nft;
                                                        if (nftitem2 != null) {
                                                            b10.nft = nftitem2;
                                                            b10.peer = wallettransaction2.peer;
                                                            b10.amount = wallettransaction2.amount;
                                                            b10.comment = wallettransaction2.comment;
                                                        }
                                                        z12 = true;
                                                    }
                                                    hashMap = hashMap2;
                                                    if (equals) {
                                                        hashMap.remove(str15);
                                                    }
                                                    str12 = str13;
                                                    j0Var = j0Var2;
                                                    hashSet = hashSet2;
                                                } else {
                                                    hashMap = hashMap2;
                                                    if (!z10) {
                                                        int size4 = arrayList2.size();
                                                        int i20 = i11;
                                                        while (i20 < size4) {
                                                            Object obj3 = arrayList2.get(i20);
                                                            i20++;
                                                            TL_wallet.walletTransaction wallettransaction4 = (TL_wallet.walletTransaction) obj3;
                                                            if (wallettransaction4.incoming == wallettransaction2.incoming && ((!TextUtils.isEmpty(wallettransaction4.id) && TextUtils.equals(wallettransaction4.id, wallettransaction2.id)) || Y(wallettransaction4.tx_hash, wallettransaction2.tx_hash) || Y(wallettransaction4.messageHash, wallettransaction2.messageHash))) {
                                                                hashSet = hashSet2;
                                                                hashSet.remove(str15);
                                                                hashMap.remove(str15);
                                                                str12 = str13;
                                                                j0Var = j0Var2;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    hashSet = hashSet2;
                                                    j0Var = j0Var2;
                                                    j0Var.c(wallettransaction2);
                                                    hashSet.add(str15);
                                                    if (equals) {
                                                        hashMap.remove(str15);
                                                        str12 = str13;
                                                    } else {
                                                        str12 = str13;
                                                        hashMap.put(str15, jSONObject.optString(str12));
                                                    }
                                                    E("stream inserted ".concat(str15));
                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                                                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                                                        String str22 = walletTransactionPeer.address;
                                                        k0Var.V(str22, new n(j0Var, wallettransaction2.id, str22, walletTransactionPeer.domain));
                                                    }
                                                    z12 = true;
                                                }
                                                i18 = i10 + 1;
                                                arrayList5 = arrayList;
                                                hashSet3 = hashSet;
                                                hashMap3 = hashMap;
                                                j0Var4 = j0Var;
                                                optJSONArray = jSONArray;
                                                str17 = str8;
                                                str18 = str10;
                                                optString3 = str9;
                                                i16 = 1;
                                                arrayList6 = arrayList2;
                                                str20 = str12;
                                                str19 = str11;
                                            }
                                        }
                                    } else {
                                        str13 = str20;
                                    }
                                    String r10 = k0Var.r();
                                    JSONObject optJSONObject6 = optJSONObject4.optJSONObject("in_msg");
                                    j0Var2 = j0Var4;
                                    ArrayList arrayList9 = new ArrayList();
                                    hashSet2 = hashSet3;
                                    JSONArray optJSONArray2 = optJSONObject4.optJSONArray("out_msgs");
                                    hashMap2 = hashMap3;
                                    str14 = g10;
                                    arrayList4 = arrayList5;
                                    arrayList3 = arrayList6;
                                    if (optJSONArray2 != null) {
                                        int i21 = 0;
                                        i12 = 0;
                                        while (i21 < optJSONArray2.length()) {
                                            try {
                                                JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i21);
                                                if (optJSONObject7 != null) {
                                                    if (optJSONObject7.optBoolean("bounced")) {
                                                        i15 = i21;
                                                        i12 = i16;
                                                    } else if (!optJSONObject7.isNull("value") && Long.parseLong(optJSONObject7.getString("value")) > 0) {
                                                        i15 = i21;
                                                        if (!b(optJSONObject7.getString("destination"), r10)) {
                                                            arrayList9.add(optJSONObject7);
                                                        }
                                                    }
                                                    i21 = i15 + 1;
                                                }
                                                i15 = i21;
                                                i21 = i15 + 1;
                                            } catch (Exception e12) {
                                                e = e12;
                                                wallettransaction = null;
                                                j("stream transaction parse failed", e);
                                                wallettransaction2 = wallettransaction;
                                                if (wallettransaction2 != null) {
                                                }
                                            }
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                    boolean z13 = (i12 != 0 || optJSONObject6 == null || optJSONObject6.isNull("source") || optJSONObject6.isNull("value") || !b(optJSONObject6.getString("destination"), r10) || b(optJSONObject6.getString("source"), r10) || optJSONObject6.optBoolean("bounced") || Long.parseLong(optJSONObject6.getString("value")) <= 0 || !arrayList9.isEmpty()) ? 0 : i16;
                                    if (z13 == 0 && i12 == 0 && !optBoolean) {
                                        try {
                                            i14 = i16;
                                        } catch (Exception e13) {
                                            e = e13;
                                            wallettransaction = null;
                                            j("stream transaction parse failed", e);
                                            wallettransaction2 = wallettransaction;
                                            if (wallettransaction2 != null) {
                                            }
                                        }
                                        if (arrayList9.size() == i14) {
                                            i13 = i14;
                                            if ((z13 == 0 || i13 != 0) && (i13 == 0 || ((optJSONObject2 = jSONObject3.optJSONObject("action")) != null && optJSONObject2.optBoolean("success") && !optJSONObject2.optBoolean("no_funds") && optJSONObject2.optInt("result_code") == 0))) {
                                                JSONObject jSONObject4 = z13 == 0 ? optJSONObject6 : (JSONObject) arrayList9.get(0);
                                                parseLong = Long.parseLong(jSONObject4.getString("value"));
                                                if (parseLong < MessagesController.getInstance(k0Var.a).config.walletTransferMinNanos.get()) {
                                                    TL_wallet.walletTransaction wallettransaction5 = new TL_wallet.walletTransaction();
                                                    String g11 = j0.g(optJSONObject4);
                                                    wallettransaction5.id = g11;
                                                    if (g11 != null) {
                                                        wallettransaction5.tx_hash = optJSONObject4.getString("hash");
                                                        try {
                                                            wallettransaction5.messageHash = jSONObject4.optString("hash", null);
                                                            if (i13 != 0 && optJSONObject6 != null && (optJSONObject = optJSONObject6.optJSONObject("message_content")) != null) {
                                                                if (optJSONObject6.isNull("source")) {
                                                                    wallettransaction = null;
                                                                    try {
                                                                        wallettransaction5.normalMessageBodyHash = optJSONObject.optString("hash", null);
                                                                    } catch (Exception e14) {
                                                                        e = e14;
                                                                        j("stream transaction parse failed", e);
                                                                        wallettransaction2 = wallettransaction;
                                                                        if (wallettransaction2 != null) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    wallettransaction5.gaslessMessageBodyHash = optJSONObject.optString("hash", null);
                                                                }
                                                            }
                                                            wallettransaction5.incoming = z13;
                                                            if (z13 == 0) {
                                                                parseLong = -parseLong;
                                                            }
                                                            wallettransaction5.amount = parseLong;
                                                            wallettransaction5.date = optJSONObject4.getInt("now");
                                                            wallettransaction5.fee = Long.parseLong(optJSONObject4.getString("total_fees"));
                                                            wallettransaction5.feeUnknown = false;
                                                            wallettransaction5.failed = false;
                                                            wallettransaction5.pending = false;
                                                            wallettransaction5.phase = WalletEngine2.SendPhase.CONFIRMED;
                                                            wallettransaction5.comment_encrypted = WalletEngine2.isEncryptedComment(jSONObject4);
                                                            JSONObject optJSONObject8 = jSONObject4.optJSONObject("message_content");
                                                            String optString6 = optJSONObject8 == null ? null : optJSONObject8.optString("body", null);
                                                            JSONObject optJSONObject9 = optJSONObject8 == null ? null : optJSONObject8.optJSONObject("decoded");
                                                            if (wallettransaction5.comment_encrypted) {
                                                                try {
                                                                    wallettransaction5.comment = WalletEngine2.encryptedCommentPayload(optString6);
                                                                } catch (Exception unused2) {
                                                                    wallettransaction5.comment_encrypted = false;
                                                                }
                                                            } else if (optJSONObject9 == null || !"text_comment".equals(optJSONObject9.optString(TeXSymbolParser.TYPE_ATTR))) {
                                                                wallettransaction5.comment = WalletEngine2.textCommentFromBody(optString6);
                                                            } else {
                                                                wallettransaction5.comment = optJSONObject9.optString("comment", null);
                                                            }
                                                            String str23 = wallettransaction5.comment;
                                                            if (str23 != null && str23.isEmpty()) {
                                                                wallettransaction5.comment = null;
                                                            }
                                                            string = z13 != 0 ? optJSONObject6.getString("source") : jSONObject4.getString("destination");
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
                                                            wallettransactionpeeraddress.address = jSONObject2 == null ? a(string) : jSONObject2.optString("user_friendly", string);
                                                            if (jSONObject2 == null || jSONObject2.isNull("domain")) {
                                                                wallettransaction = null;
                                                                str16 = null;
                                                            } else {
                                                                wallettransaction = null;
                                                                str16 = jSONObject2.optString("domain", null);
                                                            }
                                                            wallettransactionpeeraddress.domain = str16;
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            wallettransaction = null;
                                                        }
                                                        if (b(wallettransactionpeeraddress.address, string)) {
                                                            wallettransaction5.peer = wallettransactionpeeraddress;
                                                            wallettransaction2 = wallettransaction5;
                                                            if (wallettransaction2 != null) {
                                                            }
                                                        }
                                                        wallettransaction2 = wallettransaction;
                                                        if (wallettransaction2 != null) {
                                                        }
                                                    }
                                                }
                                            }
                                            wallettransaction2 = null;
                                            if (wallettransaction2 != null) {
                                            }
                                        }
                                    }
                                    i13 = 0;
                                    if (z13 == 0) {
                                    }
                                    if (z13 == 0) {
                                    }
                                    parseLong = Long.parseLong(jSONObject4.getString("value"));
                                    if (parseLong < MessagesController.getInstance(k0Var.a).config.walletTransferMinNanos.get()) {
                                    }
                                    wallettransaction2 = null;
                                    if (wallettransaction2 != null) {
                                    }
                                }
                            }
                            str13 = str20;
                            str14 = g10;
                            j0Var2 = j0Var4;
                            hashMap2 = hashMap3;
                            arrayList3 = arrayList6;
                            str11 = str19;
                            arrayList4 = arrayList5;
                            hashSet2 = hashSet3;
                            wallettransaction2 = null;
                            if (wallettransaction2 != null) {
                            }
                        }
                    }
                    arrayList = arrayList5;
                    hashSet = hashSet3;
                    str12 = str20;
                    arrayList2 = arrayList6;
                    j0Var = j0Var4;
                    hashMap = hashMap3;
                    i18 = i10 + 1;
                    arrayList5 = arrayList;
                    hashSet3 = hashSet;
                    hashMap3 = hashMap;
                    j0Var4 = j0Var;
                    optJSONArray = jSONArray;
                    str17 = str8;
                    str18 = str10;
                    optString3 = str9;
                    i16 = 1;
                    arrayList6 = arrayList2;
                    str20 = str12;
                    str19 = str11;
                }
                str6 = optString3;
                j0 j0Var5 = j0Var4;
                str2 = str18;
                str7 = str19;
                if (z12) {
                    j0Var5.h();
                    j0Var5.f();
                }
                str4 = str6;
                str5 = str7;
            }
            str6 = optString3;
            str2 = "finalized";
            str7 = "confirmed";
            str3 = "trace_invalidated";
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
        g gVar = this.B;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar, 250L);
    }

    public final void K() {
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
                E("received empty state, leaving wallet storage of " + this.c.c);
            } else {
                StringBuilder w10 = a1.g.w("received new state of ", str, ", leaving wallet storage of ");
                w10.append(this.c.c);
                E(w10.toString());
            }
            this.c = null;
        }
        if (!TextUtils.isEmpty(str) && this.c == null) {
            E("setting up wallet storage of " + str);
            this.c = new p0(ApplicationLoader.applicationContext, str, this.a);
            E("storage public keys = " + this.c.m().length);
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
                E("closing wallet-engine of " + this.d);
                this.b.close();
                this.b = null;
            }
            E("creating wallet-engine for " + str);
            try {
                int i10 = this.a;
                this.d = str;
                this.b = new WalletEngine2(i10, str, bArr);
            } catch (Exception e7) {
                j("failed to create engine!", e7);
                this.d = null;
            }
        }
        int i11 = 0;
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null) {
            ArrayList arrayList = this.u;
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
            this.u.clear();
        }
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null && this.f != null) {
            ArrayList arrayList2 = this.v;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
            this.v.clear();
        }
        if (!TextUtils.equals(this.E, str)) {
            S();
        }
        P();
    }

    public final void L(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            c0(str);
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
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && Y(str2, str3)) {
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
                z().h();
                z().f();
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void M(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f = tL_updateWalletGaslessInfo;
        K();
        I();
    }

    public final void N(TL_update.TL_updateWalletState tL_updateWalletState) {
        g0(tL_updateWalletState.state);
    }

    public final void O() {
        b0();
        this.p.clear();
        ArrayList arrayList = this.q;
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
            j0Var.f = "";
            j0Var.g = false;
            j0Var.h();
            this.n.h();
            this.n.f();
        }
        P();
        this.f = null;
        T();
    }

    public final void P() {
        if (!TextUtils.equals(this.t, r())) {
            b0();
            this.t = r();
        }
        boolean D = D();
        int i10 = this.a;
        if (!D || TextUtils.isEmpty(r())) {
            b0();
        } else {
            HashMap hashMap = this.s;
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
                    m0 m0Var = new m0(i10, str, new ls0(21, this, wallettransaction2));
                    hashMap.put(wallettransaction2, m0Var);
                    if (!m0Var.d && !TextUtils.isEmpty(str)) {
                        m0Var.d = true;
                        m0Var.f = 0;
                        m0Var.a();
                    }
                }
            }
        }
        boolean z10 = (!D() || TextUtils.isEmpty(r()) || this.A.isEmpty()) ? false : true;
        z0 z0Var = this.r;
        boolean z11 = z0Var != null && z0Var.d;
        if (z11 == z10 && (!z11 || z0Var == null || TextUtils.equals(z0Var.b, r()))) {
            return;
        }
        if (!z10) {
            z0 z0Var2 = this.r;
            if (z0Var2 != null) {
                z0Var2.h();
            }
            AndroidUtilities.cancelRunOnUIThread(this.B);
            return;
        }
        z0 z0Var3 = this.r;
        if (z0Var3 != null && !TextUtils.equals(z0Var3.b, r())) {
            this.r.h();
            this.r = null;
        }
        if (this.r == null) {
            this.r = new z0(i10, r(), this);
        }
        z0 z0Var4 = this.r;
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

    public final void R(h0 h0Var, boolean z10, Utilities.Callback2 callback2) {
        h0 b10 = h0Var.b();
        E("requesting proof challenge");
        ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getProofChallenge(), new org.telegram.messenger.a(), new v(this, b10, callback2, z10, 0));
    }

    public final void S() {
        int i10;
        this.E = r();
        ArrayList n10 = p0.n(ApplicationLoader.applicationContext, UserConfig.getInstance(this.a).getClientUserId());
        n10.remove(this.E);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            g0 g0Var = (g0) obj;
            hashMap.put(g0Var.a, g0Var);
        }
        this.C.clear();
        int size2 = n10.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = n10.get(i12);
            i12++;
            String str = (String) obj2;
            g0 g0Var2 = (g0) hashMap.get(str);
            if (g0Var2 == null) {
                g0Var2 = new g0(new p0(ApplicationLoader.applicationContext, str, this.a));
            }
            p0 p0Var = g0Var2.f;
            synchronized (p0.f) {
                try {
                    try {
                        i10 = p0Var.r().b;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        i10 = 0;
                    }
                } finally {
                }
            }
            g0Var2.b = i10;
            this.C.add(g0Var2);
            s(str, null);
            f0((b0) this.J.get(str));
        }
        Collections.sort(this.C, new mb1(2));
    }

    public final void T() {
        E("requesting gasless info");
        this.x = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new org.telegram.messenger.a(), new h(this, 2));
    }

    public final void U() {
        E("requesting state");
        this.w = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getState(), new org.telegram.messenger.a(), new h(this, 1));
    }

    public final void V(String str, Utilities.Callback2 callback2) {
        if (str == null) {
            callback2.run(null, null);
            return;
        }
        HashMap hashMap = this.I;
        if (hashMap.containsKey(str)) {
            callback2.run((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.a).sendRequestTyped(getuseraddresses, new org.telegram.messenger.a(), new i((Object) this, (Object) str, (Object) callback2, 0));
    }

    public final void W(TLRPC.User user, Utilities.Callback2 callback2) {
        if (user == null) {
            callback2.run(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.id);
        HashMap hashMap = this.H;
        if (hashMap.containsKey(valueOf)) {
            callback2.run((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.id;
        int i10 = this.a;
        arrayList.add(MessagesController.getInstance(i10).getInputUser(user));
        ConnectionsManager.getInstance(i10).sendRequestTyped(getuseraddresses, new org.telegram.messenger.a(), new i(this, (Object) callback2, (Object) user, 1));
    }

    public final void X(String str, Utilities.Callback callback) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z10 = org.telegram.ui.web.b1.P0;
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
        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new org.telegram.messenger.a(), new ai.m0(this, str, callback), MessagesController.getInstance(i10).webFileDatacenterId, 0);
    }

    public final void Z(TLRPC.User user, String str, long j3, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, Utilities.Callback callback, Utilities.Callback callback2) {
        String r10 = r();
        E("send to " + str + ", amount " + j3 + ", when ready...");
        h0(new p(this, str, callback, nftitem, r10, str2, bArr, j3, user, str3, callback2, 0));
    }

    public final void b0() {
        HashMap hashMap = this.s;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((m0) it.next()).b();
        }
        hashMap.clear();
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
                    j0 z12 = z();
                    wallettransaction.failed = z10;
                    wallettransaction.pending = false;
                    if (!TextUtils.isEmpty(str)) {
                        wallettransaction.tx_hash = str;
                    }
                    if (wallettransaction.key_change) {
                        ArrayList arrayList2 = this.q;
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
                    E("completed pending transaction: msg_hash=" + wallettransaction.messageHash + ", body_hash=" + wallettransaction.gaslessMessageBodyHash + ", transaction_id=" + wallettransaction.id + ", tx_hash=" + wallettransaction.tx_hash + ", success=" + z11);
                    z12.h();
                    z12.f();
                    P();
                }
                if (wallettransaction.nft != null || (c0Var = this.o) == null) {
                }
                c0.a(c0Var, wallettransaction);
                c0 c0Var2 = this.o;
                if (c0Var2.j) {
                    return;
                }
                c0Var2.b();
                c0Var2.e(true);
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
            P();
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

    public final void f0(b0 b0Var) {
        if (b0Var == null) {
            return;
        }
        ArrayList arrayList = this.C;
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

    public final void g0(TL_wallet.WalletState walletState) {
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
                K();
                I();
                if (z10 || (j0Var = this.n) == null) {
                }
                j0Var.d();
                return;
            }
        }
        z10 = false;
        this.e = walletState;
        K();
        I();
        if (z10) {
        }
    }

    public final m h(String str, long j3, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        y yVar = new y(this, str, j3, str2, bArr, callback2);
        h0(yVar);
        return new m(yVar, 0);
    }

    public final void h0(Runnable runnable) {
        if (D()) {
            runnable.run();
        } else {
            this.u.add(new WeakReference(runnable));
        }
    }

    public final CharSequence l(long j3, boolean z10) {
        BigDecimal scale;
        int i10;
        f fVar = this.h;
        String g10 = fVar.g();
        TL_wallet.currencyRate j10 = fVar.j();
        if (j10 != null) {
            String str = j10.symbol;
            String str2 = j10.thousandsSeparator;
            String str3 = j10.decimalSeparator;
            boolean z11 = j10.symbolLeft;
            boolean z12 = j10.spaceBetween;
            boolean z13 = j10.dropZeros;
            int i11 = j10.exp;
            double d = j10.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d10 = MessagesController.getInstance(this.a).config.tonUsdRate.get() * d;
                int max = Math.max(0, Math.min(i11, 20));
                BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(BigDecimal.valueOf(d10)).movePointLeft(9);
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
                    D = sc.v.i("-", D);
                }
                int indexOf = D.indexOf(8387);
                if (indexOf < 0) {
                    return D;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(D);
                spannableStringBuilder.setSpan(new m61(AndroidUtilities.getTypeface("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                return spannableStringBuilder;
            }
        }
        return "";
    }

    public final String r() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).address;
        }
        return null;
    }

    public final b0 s(final String str, g7 g7Var) {
        HashMap hashMap = this.J;
        b0 b0Var = (b0) hashMap.get(str);
        if (b0Var != null && !b0Var.e) {
            if (g7Var != null) {
                b0Var.f.add(g7Var);
            }
            return null;
        }
        int i10 = this.a;
        if (b0Var != null && b0Var.e && ConnectionsManager.getInstance(i10).getCurrentTime() < b0Var.d + 300) {
            if (g7Var != null) {
                g7Var.run(b0Var);
            }
            return b0Var;
        }
        final b0 b0Var2 = new b0();
        b0Var2.b = -1L;
        ArrayList arrayList = new ArrayList();
        b0Var2.f = arrayList;
        b0Var2.a = str;
        b0Var2.d = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (g7Var != null) {
            arrayList.add(g7Var);
        }
        hashMap.put(str, b0Var2);
        final int i11 = 0;
        final int i12 = 1;
        Utilities.raceCallbacks(new k(this, str, b0Var2, i11), new Utilities.Callback(this) { // from class: org.telegram.ui.Wallet.l
            public final /* synthetic */ k0 b;

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
                        k0 k0Var = this.b;
                        int i13 = k0Var.a;
                        ConnectionsManager.getInstance(i13).sendRequestTyped(performapirequest, new org.telegram.messenger.a(), new n(k0Var, b0Var2, str2, runnable, 0), MessagesController.getInstance(i13).webFileDatacenterId, 0);
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        b0 b0Var3 = b0Var2;
                        String str3 = str;
                        k0Var2.X(str3, new q(k0Var2, b0Var3, str3, (Runnable) obj));
                        break;
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.Wallet.l
            public final /* synthetic */ k0 b;

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
                        k0 k0Var = this.b;
                        int i13 = k0Var.a;
                        ConnectionsManager.getInstance(i13).sendRequestTyped(performapirequest, new org.telegram.messenger.a(), new n(k0Var, b0Var2, str2, runnable, 0), MessagesController.getInstance(i13).webFileDatacenterId, 0);
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        b0 b0Var3 = b0Var2;
                        String str3 = str;
                        k0Var2.X(str3, new q(k0Var2, b0Var3, str3, (Runnable) obj));
                        break;
                }
            }
        });
        return null;
    }

    public final long t() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).balance;
        }
        return 0L;
    }

    public final byte[] w() {
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            return ((TL_wallet.TL_walletState) walletState).public_key;
        }
        return null;
    }

    public final void x(Utilities.Callback2 callback2, boolean z10, boolean z11) {
        E("getSecretPhrase: whenReady...");
        h0(new org.telegram.messenger.camera.i(this, callback2, z10, z11, 3));
    }

    public final j0 z() {
        if (this.n == null) {
            this.n = new j0(this);
        }
        return this.n;
    }
}
