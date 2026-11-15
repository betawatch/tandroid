package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class m10 extends c1 {
    public static int t0;
    public static volatile m10[] u0 = new m10[4];
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public long M;
    public long N;
    public long O;
    public long P;
    public boolean Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public final Object a;
    public TLRPC.TL_help_termsOfService a0;
    public volatile boolean b;
    public long b0;
    public TLRPC.User c;
    public String c0;
    public boolean d;
    public String d0;
    public int e;
    public String e0;
    public int f;
    public String f0;
    public long g0;
    public int h;
    public long h0;
    public long i0;
    public long j0;
    public volatile byte[] k0;
    public volatile byte[] l0;
    public volatile long m0;
    public long n;
    public LongSparseArray n0;
    public LongSparseArray o0;
    public LongSparseArray p0;
    public int q0;
    public int r;
    public boolean r0;
    public int s;
    public long s0;
    public boolean w;
    public boolean x;
    public TL_account.tmpPassword y;

    public m10(int i7) {
        super(i7);
        this.a = new Object();
        this.e = -210000;
        this.f = -1;
        this.x = true;
        this.K = -1;
        this.L = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.V = true;
        this.W = true;
        this.q0 = 0;
        this.r0 = false;
    }

    public static int c() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i(c.a(i10).a).p()) {
                i7++;
            }
        }
        return i7;
    }

    public static m10 i(int i7) {
        m10 m10Var;
        m10 m10Var2 = u0[i7];
        if (m10Var2 != null) {
            return m10Var2;
        }
        synchronized (m10.class) {
            try {
                m10Var = u0[i7];
                if (m10Var == null) {
                    m10[] m10VarArr = u0;
                    m10 m10Var3 = new m10(i7);
                    m10VarArr[i7] = m10Var3;
                    m10Var = m10Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m10Var;
    }

    public static int l() {
        int i7 = -1;
        while (i7 < 4) {
            int i10 = i7 < 0 ? t0 : i7;
            if (i(i10).p() && !ConnectionsManager.getInstance(i10).isTestBackend()) {
                return i10;
            }
            i7++;
        }
        return t0;
    }

    public static boolean o() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (i(c.a(i7).a).p() && i(c.a(i7).a).getUserConfig().q()) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(int i7) {
        return i7 >= 0 && i7 < 4 && i(i7).p();
    }

    public final void A(int i7, LongSparseArray longSparseArray) {
        if (i7 == 1) {
            this.n0 = longSparseArray;
            b6.n(t0.b.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0), this.n0);
            return;
        }
        if (i7 == 2) {
            this.p0 = longSparseArray;
            b6.n(t0.b.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0), this.p0);
            return;
        }
        if (i7 == 4) {
            this.o0 = longSparseArray;
            b6.n(t0.b.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0), this.o0);
        }
    }

    public final void a(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            final int i7 = 0;
            g0.h3(new Runnable(this) { // from class: org.telegram.messenger.k10
                public final /* synthetic */ m10 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            m10 m10Var = this.b;
                            m10Var.getMessagesController().n5(user2.premium);
                            ns.f(m10Var.currentAccount).k(ns.f5, new Object[0]);
                            ns.e().k(ns.h5, new Object[0]);
                            m10Var.getMediaDataController().R0(false);
                            m10Var.getMediaDataController().S0(false, null);
                            fi.s6 P1 = m10Var.getMessagesController().P1();
                            P1.R = false;
                            P1.S = null;
                            break;
                        default:
                            m10 m10Var2 = this.b;
                            m10Var2.getMessagesController().n5(user2.premium);
                            ns.f(m10Var2.currentAccount).k(ns.f5, new Object[0]);
                            m10Var2.getMediaDataController().R0(true);
                            break;
                    }
                }
            });
        } else if (user == null) {
            final int i10 = 1;
            g0.h3(new Runnable(this) { // from class: org.telegram.messenger.k10
                public final /* synthetic */ m10 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            m10 m10Var = this.b;
                            m10Var.getMessagesController().n5(user2.premium);
                            ns.f(m10Var.currentAccount).k(ns.f5, new Object[0]);
                            ns.e().k(ns.h5, new Object[0]);
                            m10Var.getMediaDataController().R0(false);
                            m10Var.getMediaDataController().S0(false, null);
                            fi.s6 P1 = m10Var.getMessagesController().P1();
                            P1.R = false;
                            P1.S = null;
                            break;
                        default:
                            m10 m10Var2 = this.b;
                            m10Var2.getMessagesController().n5(user2.premium);
                            ns.f(m10Var2.currentAccount).k(ns.f5, new Object[0]);
                            m10Var2.getMediaDataController().R0(true);
                            break;
                    }
                }
            });
        }
    }

    public final void b() {
        k().edit().clear().apply();
        this.R = 0;
        this.S = 0;
        this.c = null;
        this.n = 0L;
        this.d = false;
        this.h = 0;
        this.e = -210000;
        this.f = -1;
        this.T = false;
        this.U = false;
        this.K = -1;
        this.L = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.w = false;
        this.I = true;
        this.V = true;
        this.X = false;
        this.W = true;
        this.x = true;
        this.J = true;
        this.a0 = null;
        this.Q = false;
        this.Y = false;
        this.Z = (int) (System.currentTimeMillis() / 1000);
        this.r = ((int) (System.currentTimeMillis() / 1000)) - 82800;
        this.s = ((int) (System.currentTimeMillis() / 1000)) - 90000;
        u();
        int i7 = 0;
        while (true) {
            if (i7 >= 4) {
                gz.z = false;
                gz.x = false;
                gz.r = 0;
                gz.t = 0L;
                gz.u = 0L;
                gz.v = 0;
                gz.s = "";
                gz.w = new byte[0];
                gz.y = 3600;
                gz.B = 0;
                gz.D = true;
                gz.g0 = true;
                gz.C = false;
                gz.A = false;
                gz.J = 0;
                gz.K = 0;
                gz.L = 0L;
                gz.M = 0;
                gz.N = 0L;
                gz.O = 0;
                gz.P = false;
                gz.Q = false;
                gz.c1 = 3;
                gz.d1 = 3;
                gz.e1 = 3;
                gz.e0 = 2;
                gz.S = 0;
                gz.y();
                break;
            }
            if (i(c.a(i7).a).p()) {
                break;
            } else {
                i7++;
            }
        }
        v(true);
    }

    public final String d() {
        String str;
        synchronized (this.a) {
            try {
                TLRPC.User user = this.c;
                if (user == null || (str = user.phone) == null) {
                    str = "";
                }
            } finally {
            }
        }
        return str;
    }

    public final long e() {
        long j3;
        synchronized (this.a) {
            try {
                TLRPC.User user = this.c;
                j3 = user != null ? user.id : 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j3;
    }

    public final TLRPC.User f() {
        TLRPC.User user;
        synchronized (this.a) {
            user = this.c;
        }
        return user;
    }

    public final long[] g(int i7) {
        SharedPreferences k10 = k();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        sb2.append(i7 == 0 ? "" : Integer.valueOf(i7));
        int i10 = k10.getInt(sb2.toString(), this.J ? 0 : -1);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetDate");
        sb3.append(i7 == 0 ? "" : Integer.valueOf(i7));
        int i11 = k10.getInt(sb3.toString(), this.J ? 0 : -1);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetUserId");
        sb4.append(i7 == 0 ? "" : Integer.valueOf(i7));
        long b12 = g0.b1(k10, sb4.toString(), this.J ? 0L : -1L);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChatId");
        sb5.append(i7 == 0 ? "" : Integer.valueOf(i7));
        long b13 = g0.b1(k10, sb5.toString(), this.J ? 0L : -1L);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetChannelId");
        sb6.append(i7 == 0 ? "" : Integer.valueOf(i7));
        long b14 = g0.b1(k10, sb6.toString(), this.J ? 0L : -1L);
        StringBuilder sb7 = new StringBuilder("2dialogsLoadOffsetAccess");
        sb7.append(i7 != 0 ? Integer.valueOf(i7) : "");
        return new long[]{i10, i11, b12, b13, b14, k10.getLong(sb7.toString(), this.J ? 0L : -1L)};
    }

    public final int h() {
        return this.q0;
    }

    public final int j() {
        int i7;
        synchronized (this.a) {
            i7 = this.e;
            this.e = i7 - 1;
        }
        return i7;
    }

    public final SharedPreferences k() {
        if (this.currentAccount == 0) {
            return t0.b.getSharedPreferences("userconfing", 0);
        }
        return t0.b.getSharedPreferences("userconfig" + this.currentAccount, 0);
    }

    public final LongSparseArray m(int i7) {
        if (i7 == 1) {
            if (this.n0 == null) {
                this.n0 = b6.l(t0.b.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.n0;
        }
        if (i7 == 2) {
            if (this.p0 == null) {
                this.p0 = b6.l(t0.b.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0));
            }
            return this.p0;
        }
        if (i7 != 4) {
            return null;
        }
        if (this.o0 == null) {
            this.o0 = b6.l(t0.b.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0));
        }
        return this.o0;
    }

    public final int n(int i7) {
        SharedPreferences k10 = k();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        sb2.append(i7 == 0 ? "" : Integer.valueOf(i7));
        return k10.getInt(sb2.toString(), 0);
    }

    public final boolean p() {
        boolean z10;
        synchronized (this.a) {
            z10 = this.c != null;
        }
        return z10;
    }

    public final boolean q() {
        TLRPC.User user = this.c;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:9|(1:11)|12|(16:17|18|19|20|(1:24)|26|(1:28)|29|(1:33)|34|(1:38)|39|(1:41)|42|43|44)|47|18|19|20|(2:22|24)|26|(0)|29|(2:31|33)|34|(2:36|38)|39|(0)|42|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0154, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0155, code lost:
    
        org.telegram.messenger.a8.g(r2, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0162 A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000c, B:11:0x0015, B:12:0x001d, B:14:0x00ec, B:18:0x00f8, B:20:0x0133, B:22:0x013b, B:24:0x0141, B:26:0x0158, B:28:0x0162, B:29:0x018a, B:31:0x0192, B:33:0x0198, B:34:0x01aa, B:36:0x01b2, B:38:0x01b8, B:39:0x01ca, B:41:0x01ce, B:42:0x01d7, B:43:0x01d9, B:46:0x0155), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ce A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000c, B:11:0x0015, B:12:0x001d, B:14:0x00ec, B:18:0x00f8, B:20:0x0133, B:22:0x013b, B:24:0x0141, B:26:0x0158, B:28:0x0162, B:29:0x018a, B:31:0x0192, B:33:0x0198, B:34:0x01aa, B:36:0x01b2, B:38:0x01b8, B:39:0x01ca, B:41:0x01ce, B:42:0x01d7, B:43:0x01d9, B:46:0x0155), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        boolean z10;
        int i7;
        String string;
        String string2;
        TLRPC.User user;
        byte[] decode;
        byte[] decode2;
        String string3;
        byte[] decode3;
        synchronized (this.a) {
            try {
                if (this.b) {
                    return;
                }
                SharedPreferences k10 = k();
                if (this.currentAccount == 0) {
                    t0 = k10.getInt("selectedAccount", 0);
                }
                this.d = k10.getBoolean("registeredForPush", false);
                this.e = k10.getInt("lastSendMessageId", -210000);
                this.h = k10.getInt("contactsSavedCount", 0);
                this.f = k10.getInt("lastBroadcastId", -1);
                this.r = k10.getInt("lastContactsSyncTime", ((int) (System.currentTimeMillis() / 1000)) - 82800);
                this.s = k10.getInt("lastHintsSyncTime", ((int) (System.currentTimeMillis() / 1000)) - 90000);
                this.w = k10.getBoolean("draftsLoaded", false);
                this.x = k10.getBoolean("unreadDialogsLoaded", false);
                this.I = k10.getBoolean("contactsReimported", false);
                this.E = k10.getInt("ratingLoadTime", 0);
                this.F = k10.getInt("botRatingLoadTime", 0);
                this.G = k10.getInt("botGuestRatingLoadTime", 0);
                this.H = k10.getInt("webappRatingLoadTime", 0);
                this.Z = k10.getInt("loginTime", this.currentAccount);
                this.V = k10.getBoolean("syncContacts", true);
                this.X = k10.getBoolean("showCallsTab", false);
                this.W = k10.getBoolean("suggestContacts", true);
                this.Y = k10.getBoolean("hasSecureData", false);
                this.T = k10.getBoolean("notificationsSettingsLoaded4", false);
                this.U = k10.getBoolean("notificationsSignUpSettingsLoaded", false);
                this.b0 = k10.getLong("autoDownloadConfigLoadTime", 0L);
                if (!k10.contains("2dialogsLoadOffsetId") && !k10.getBoolean("hasValidDialogLoadIds", false)) {
                    z10 = false;
                    this.J = z10;
                    this.R = k10.getInt("sharingMyLocationUntil", 0);
                    this.S = k10.getInt("lastMyLocationShareTime", 0);
                    this.Q = k10.getBoolean("filtersLoaded", false);
                    this.c0 = k10.getString("premiumGiftsStickerPack", null);
                    this.g0 = k10.getLong("lastUpdatedPremiumGiftsStickerPack", 0L);
                    this.e0 = k10.getString("genericAnimationsStickerPack", null);
                    this.i0 = k10.getLong("lastUpdatedGenericAnimations", 0L);
                    string3 = k10.getString("terms", null);
                    if (string3 != null && (decode3 = Base64.decode(string3, 0)) != null) {
                        SerializedData serializedData = new SerializedData(decode3);
                        this.a0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                        serializedData.cleanup();
                    }
                    i7 = k10.getInt("6migrateOffsetId", 0);
                    this.K = i7;
                    if (i7 != -1) {
                        this.L = k10.getInt("6migrateOffsetDate", 0);
                        this.M = g0.b1(k10, "6migrateOffsetUserId", 0L);
                        this.N = g0.b1(k10, "6migrateOffsetChatId", 0L);
                        this.O = g0.b1(k10, "6migrateOffsetChannelId", 0L);
                        this.P = k10.getLong("6migrateOffsetAccess", 0L);
                    }
                    string = k10.getString("tmpPassword", null);
                    if (string != null && (decode2 = Base64.decode(string, 0)) != null) {
                        SerializedData serializedData2 = new SerializedData(decode2);
                        this.y = TL_account.tmpPassword.TLdeserialize(serializedData2, serializedData2.readInt32(false), false);
                        serializedData2.cleanup();
                    }
                    string2 = k10.getString("user", null);
                    if (string2 != null && (decode = Base64.decode(string2, 0)) != null) {
                        SerializedData serializedData3 = new SerializedData(decode);
                        this.c = TLRPC.User.TLdeserialize(serializedData3, serializedData3.readInt32(false), false);
                        serializedData3.cleanup();
                    }
                    user = this.c;
                    if (user != null) {
                        a(null, user);
                        this.n = this.c.id;
                    }
                    this.b = true;
                }
                z10 = true;
                this.J = z10;
                this.R = k10.getInt("sharingMyLocationUntil", 0);
                this.S = k10.getInt("lastMyLocationShareTime", 0);
                this.Q = k10.getBoolean("filtersLoaded", false);
                this.c0 = k10.getString("premiumGiftsStickerPack", null);
                this.g0 = k10.getLong("lastUpdatedPremiumGiftsStickerPack", 0L);
                this.e0 = k10.getString("genericAnimationsStickerPack", null);
                this.i0 = k10.getLong("lastUpdatedGenericAnimations", 0L);
                string3 = k10.getString("terms", null);
                if (string3 != null) {
                    SerializedData serializedData4 = new SerializedData(decode3);
                    this.a0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData4, serializedData4.readInt32(false), false);
                    serializedData4.cleanup();
                }
                i7 = k10.getInt("6migrateOffsetId", 0);
                this.K = i7;
                if (i7 != -1) {
                }
                string = k10.getString("tmpPassword", null);
                if (string != null) {
                    SerializedData serializedData22 = new SerializedData(decode2);
                    this.y = TL_account.tmpPassword.TLdeserialize(serializedData22, serializedData22.readInt32(false), false);
                    serializedData22.cleanup();
                }
                string2 = k10.getString("user", null);
                if (string2 != null) {
                    SerializedData serializedData32 = new SerializedData(decode);
                    this.c = TLRPC.User.TLdeserialize(serializedData32, serializedData32.readInt32(false), false);
                    serializedData32.cleanup();
                }
                user = this.c;
                if (user != null) {
                }
                this.b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t() {
        if (this.r0 || System.currentTimeMillis() - this.s0 < 60000) {
            return;
        }
        this.r0 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new s1(this, 8));
    }

    public final void u() {
        this.m0 = 0L;
        if (this.k0 != null) {
            Arrays.fill(this.k0, (byte) 0);
            this.k0 = null;
        }
        if (this.l0 != null) {
            Arrays.fill(this.l0, (byte) 0);
            this.l0 = null;
        }
    }

    public final void v(boolean z10) {
        ns.f(this.currentAccount).d(new l10(0, this, z10));
    }

    public final void w(TLRPC.User user) {
        synchronized (this.a) {
            TLRPC.User user2 = this.c;
            this.c = user;
            this.n = user.id;
            a(user2, user);
        }
    }

    public final void x(int i7, int i10, int i11, long j3, long j10, long j11, long j12) {
        SharedPreferences.Editor edit = k().edit();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        sb2.append(i7 == 0 ? "" : Integer.valueOf(i7));
        edit.putInt(sb2.toString(), i10);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetDate");
        sb3.append(i7 == 0 ? "" : Integer.valueOf(i7));
        edit.putInt(sb3.toString(), i11);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetUserId");
        sb4.append(i7 == 0 ? "" : Integer.valueOf(i7));
        edit.putLong(sb4.toString(), j3);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChatId");
        sb5.append(i7 == 0 ? "" : Integer.valueOf(i7));
        edit.putLong(sb5.toString(), j10);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetChannelId");
        sb6.append(i7 == 0 ? "" : Integer.valueOf(i7));
        edit.putLong(sb6.toString(), j11);
        StringBuilder sb7 = new StringBuilder("2dialogsLoadOffsetAccess");
        sb7.append(i7 != 0 ? Integer.valueOf(i7) : "");
        edit.putLong(sb7.toString(), j12);
        edit.putBoolean("hasValidDialogLoadIds", true);
        edit.commit();
    }

    public final void y(int i7, boolean z10) {
        k().edit().putBoolean("2pinnedDialogsLoaded" + i7, z10).commit();
    }

    public final void z(int i7, int i10) {
        SharedPreferences.Editor edit = k().edit();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        sb2.append(i7 == 0 ? "" : Integer.valueOf(i7));
        edit.putInt(sb2.toString(), i10).commit();
    }
}
