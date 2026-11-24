// default package

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.LruCache;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class na7 extends pf0 implements gk7 {
    public static volatile long o5 = 0;
    public static volatile long p5 = 0;
    public static final int q5 = 1050111;
    public static final int r5 = 31;
    public static volatile na7[] s5 = new na7[4];
    public static final Object[] t5 = new Object[4];
    public final vf6 A0;
    public final HashMap A1;
    public final am6 A2;
    public HashMap A3;
    public long A4;
    public final vf6 B0;
    public final vf6 B1;
    public final f67 B2;
    public HashMap B3;
    public final boolean B4;
    public int C0;
    public final vf6 C1;
    public long C2;
    public boolean C3;
    public final byte C4;
    public long D0;
    public final vf6 D1;
    public int D2;
    public boolean D3;
    public final byte D4;
    public final ArrayList E;
    public final SparseIntArray E0;
    public final vf6 E1;
    public byte E2;
    public ea7 E3;
    public ArrayList E4;
    public final ArrayList F;
    public final SparseIntArray F0;
    public final vf6 F1;
    public boolean F2;
    public ea7 F3;
    public final LongSparseIntArray F4;
    public final ArrayList G;
    public ArrayList G0;
    public final vf6 G1;
    public String G2;
    public int G3;
    public final LongSparseIntArray G4;
    public final ArrayList H;
    public ArrayList H0;
    public final vf6 H1;
    public final vf6 H2;
    public int H3;
    public final LongSparseIntArray H4;
    public final ArrayList I;
    public final ArrayList I0;
    public final ArrayList I1;
    public final HashMap I2;
    public int I3;
    public final vf6 I4;
    public final ArrayList J;
    public final SparseArray J0;
    public final vf6 J1;
    public String J2;
    public Set J3;
    public final HashSet J4;
    public final ArrayList K;
    public boolean K0;
    public final ArrayList K1;
    public vjb K2;
    public Set K3;
    public boolean K4;
    public final ArrayList L;
    public boolean L0;
    public final HashMap L1;
    public k7c L2;
    public long L3;
    public TLRPC.TL_exportedContactToken L4;
    public final ArrayList M;
    public final ArrayList M0;
    public boolean M1;
    public final l97 M2;
    public Set M3;
    public HashMap M4;
    public final t97[] N;
    public final vf6 N0;
    public int N1;
    public String N2;
    public long N3;
    public HashSet N4;
    public int O;
    public final LongSparseLongArray O0;
    public vf6 O1;
    public int O2;
    public Long O3;
    public vf6 O4;
    public final ConcurrentHashMap P;
    public final LongSparseIntArray P0;
    public vf6 P1;
    public final byte P2;
    public boolean P3;
    public boolean P4;
    public final ConcurrentHashMap Q;
    public final vf6 Q0;
    public c87 Q1;
    public int Q2;
    public boolean Q3;
    public boolean Q4;
    public final vf6 R;
    public final vf6 R0;
    public boolean R1;
    public int R2;
    public String R3;
    public final vf6 R4;
    public final vf6 S;
    public final vf6 S0;
    public final SparseIntArray S1;
    public int S2;
    public HashSet S3;
    public final HashSet S4;
    public final vf6 T;
    public final vf6 T0;
    public final SparseBooleanArray T1;
    public int T2;
    public int[] T3;
    public final f67 T4;
    public final LongSparseIntArray U;
    public final vf6 U0;
    public final SparseBooleanArray U1;
    public int U2;
    public long[] U3;
    public boolean U4;
    public final SparseArray V;
    public final ArrayList V0;
    public final SparseBooleanArray V1;
    public boolean V2;
    public int[][] V3;
    public TLRPC.messages_AvailableEffects V4;
    public final ConcurrentHashMap W;
    public final ArrayList W0;
    public boolean W1;
    public int W2;
    public final SharedPreferences W3;
    public final n97 W4;
    public vf6 X;
    public final ArrayList X0;
    public boolean X1;
    public final int X2;
    public final SharedPreferences X3;
    public boolean X4;
    public vf6 Y;
    public long Y0;
    public boolean Y1;
    public final int Y2;
    public final SharedPreferences Y3;
    public ArrayList Y4;
    public final vf6[] Z;
    public long Z0;
    public boolean Z1;
    public int Z2;
    public volatile boolean Z3;
    public long Z4;
    public int a;
    public final ConcurrentHashMap a0;
    public long a1;
    public boolean a2;
    public int a3;
    public int a4;
    public TL_account.contentSettings a5;
    public final ConcurrentHashMap b;
    public final LongSparseIntArray b0;
    public final vf6 b1;
    public boolean b2;
    public int b3;
    public lt2 b4;
    public boolean b5;
    public final ConcurrentHashMap c;
    public int c0;
    public final vf6 c1;
    public boolean c2;
    public int c3;
    public long c4;
    public final HashSet c5;
    public final ConcurrentHashMap d;
    public final SparseArray d0;
    public final vf6 d1;
    public long d2;
    public final int d3;
    public long d4;
    public final HashSet d5;
    public final ConcurrentHashMap e;
    public g2b e0;
    public final vf6 e1;
    public boolean e2;
    public final int e3;
    public f67 e4;
    public final f67 e5;
    public final ConcurrentHashMap f;
    public vp9 f0;
    public VoIPDebugToSend f1;
    public TLRPC.TL_messages_peerDialogs f2;
    public int f3;
    public final ConcurrentHashMap f4;
    public final LongSparseArray f5;
    public v4c g0;
    public final vf6 g1;
    public TLRPC.messages_Dialogs g2;
    public int g3;
    public final pub g4;
    public final HashMap g5;
    public final HashMap h;
    public boolean h0;
    public final HashSet h1;
    public final SparseIntArray h2;
    public int h3;
    public final o51 h4;
    public ha7 h5;
    public og1 i0;
    public final LongSparseLongArray i1;
    public ArrayList i2;
    public String i3;
    public final b1c i4;
    public boolean i5;
    public boolean j0;
    public final ConcurrentHashMap j1;
    public TLRPC.WebPage j2;
    public int j3;
    public ic j4;
    public ArrayList j5;
    public final vf6 k0;
    public final int k1;
    public int k2;
    public int k3;
    public final gr k4;
    public TLRPC.EmojiGameInfo k5;
    public final ArrayList l0;
    public final HashSet l1;
    public boolean l2;
    public boolean l3;
    public boolean l4;
    public final f67 l5;
    public final ArrayList m0;
    public final HashSet m1;
    public int m2;
    public boolean m3;
    public final SparseArray m4;
    public TL_account.TL_webBrowserSettings m5;
    public final ArrayList n;
    public final ArrayList n0;
    public final HashSet n1;
    public boolean n2;
    public boolean n3;
    public final HashSet n4;
    public final o97 n5;
    public final ArrayList o0;
    public final HashSet o1;
    public int o2;
    public String o3;
    public final HashMap o4;
    public final ArrayList p0;
    public final LongSparseLongArray p1;
    public int p2;
    public String p3;
    public final ArrayList p4;
    public final LongSparseIntArray q0;
    public final vf6 q1;
    public TLRPC.Dialog q2;
    public String q3;
    public t97 q4;
    public final vf6 r;
    public final vf6 r0;
    public final LongSparseIntArray r1;
    public boolean r2;
    public int r3;
    public final c77 r4;
    public final ArrayList s;
    public final LongSparseIntArray s0;
    public final SparseIntArray s1;
    public long s2;
    public String s3;
    public final c77 s4;
    public final vf6 t0;
    public final vf6 t1;
    public int t2;
    public String t3;
    public final c77 t4;
    public final vf6 u0;
    public final vf6 u1;
    public String u2;
    public Set u3;
    public final el6 u4;
    public final vf6 v0;
    public final vf6 v1;
    public String v2;
    public Set v3;
    public a61 v4;
    public final SparseArray w;
    public boolean w0;
    public final HashMap w1;
    public String w2;
    public TLRPC.TL_pendingSuggestion w3;
    public final f67 w4;
    public final vf6 x;
    public final LongSparseIntArray x0;
    public final vf6 x1;
    public boolean x2;
    public ArrayList x3;
    public final f67 x4;
    public final ArrayList y;
    public int y0;
    public final HashMap y1;
    public int y2;
    public HashSet y3;
    public final vf6 y4;
    public boolean z0;
    public final vf6 z1;
    public int z2;
    public String z3;
    public final vf6 z4;

    static {
        for (int i = 0; i < 4; i++) {
            t5[i] = new Object();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public na7(int i) {
        super(i);
        SharedPreferences k;
        int[] a;
        byte b = 2;
        this.b = new ConcurrentHashMap(100, 1.0f, 2);
        this.c = new ConcurrentHashMap(10, 1.0f, 2);
        byte b2 = 3;
        this.d = new ConcurrentHashMap(100, 1.0f, 3);
        this.e = new ConcurrentHashMap(100, 1.0f, 2);
        this.f = new ConcurrentHashMap(3, 1.0f, 2);
        this.h = new HashMap();
        this.n = new ArrayList();
        this.r = new vf6();
        this.s = new ArrayList();
        this.w = new SparseArray();
        this.x = new vf6();
        this.y = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new t97[2];
        this.O = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.P = new ConcurrentHashMap(100, 1.0f, 2);
        this.Q = new ConcurrentHashMap(100, 1.0f, 2);
        this.R = new vf6();
        this.S = new vf6();
        this.T = new vf6();
        this.U = new LongSparseIntArray();
        this.V = new SparseArray();
        this.W = new ConcurrentHashMap(20, 1.0f, 2);
        this.X = new vf6();
        this.Y = new vf6();
        byte b3 = 12;
        this.Z = new vf6[12];
        this.a0 = new ConcurrentHashMap(20, 1.0f, 2);
        this.b0 = new LongSparseIntArray();
        this.d0 = new SparseArray();
        this.k0 = new vf6();
        this.l0 = new ArrayList();
        this.m0 = new ArrayList();
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new LongSparseIntArray();
        this.r0 = new vf6();
        this.s0 = new LongSparseIntArray();
        this.t0 = new vf6();
        this.u0 = new vf6();
        this.v0 = new vf6();
        Object[] objArr = 0;
        this.w0 = false;
        this.x0 = new LongSparseIntArray();
        this.y0 = -1;
        this.A0 = new vf6();
        this.B0 = new vf6();
        this.E0 = new SparseIntArray();
        this.F0 = new SparseIntArray();
        this.G0 = new ArrayList();
        this.H0 = null;
        this.I0 = new ArrayList();
        this.J0 = new SparseArray();
        this.M0 = new ArrayList();
        this.N0 = new vf6();
        this.O0 = new LongSparseLongArray();
        this.P0 = new LongSparseIntArray();
        this.Q0 = new vf6();
        this.R0 = new vf6();
        this.S0 = new vf6();
        this.T0 = new vf6();
        this.U0 = new vf6();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.b1 = new vf6();
        this.c1 = new vf6();
        this.d1 = new vf6();
        this.e1 = new vf6();
        this.g1 = new vf6();
        this.h1 = new HashSet();
        this.i1 = new LongSparseLongArray();
        this.j1 = new ConcurrentHashMap();
        this.k1 = ConnectionsManager.generateClassGuid();
        this.l1 = new HashSet();
        this.m1 = new HashSet();
        this.n1 = new HashSet();
        this.o1 = new HashSet();
        this.p1 = new LongSparseLongArray();
        this.q1 = new vf6();
        this.r1 = new LongSparseIntArray();
        this.s1 = new SparseIntArray();
        this.t1 = new vf6();
        this.u1 = new vf6();
        this.v1 = new vf6();
        this.w1 = new HashMap();
        this.x1 = new vf6();
        this.y1 = new HashMap();
        this.z1 = new vf6();
        this.A1 = new HashMap();
        this.B1 = new vf6();
        this.C1 = new vf6();
        this.D1 = new vf6();
        this.E1 = new vf6();
        this.F1 = new vf6();
        this.G1 = new vf6();
        this.H1 = new vf6();
        this.I1 = new ArrayList();
        this.J1 = new vf6();
        this.K1 = new ArrayList();
        this.L1 = new HashMap();
        this.S1 = new SparseIntArray();
        this.T1 = new SparseBooleanArray();
        this.U1 = new SparseBooleanArray();
        this.V1 = new SparseBooleanArray();
        byte b4 = 1;
        this.Z1 = true;
        this.h2 = new SparseIntArray();
        this.i2 = new ArrayList();
        this.A2 = new am6(b);
        this.B2 = new f67(this, b3);
        this.H2 = new vf6();
        this.I2 = new HashMap();
        this.M2 = new l97(this);
        this.P2 = (byte) 100;
        this.x3 = new ArrayList();
        this.A3 = new HashMap();
        this.B3 = new HashMap();
        this.M3 = new HashSet();
        this.f4 = new ConcurrentHashMap();
        this.k4 = new gr(this.currentAccount);
        this.m4 = new SparseArray();
        HashSet hashSet = new HashSet();
        this.n4 = hashSet;
        this.o4 = new HashMap();
        this.p4 = new ArrayList();
        this.r4 = new c77(this, 0 == true ? 1 : 0);
        this.s4 = new c77(this, b4);
        this.t4 = new c77(this, b);
        this.u4 = new el6(this, (byte) 16);
        this.w4 = new f67(this, (byte) 17);
        this.x4 = new f67(this, (byte) 21);
        this.y4 = new vf6();
        this.z4 = new vf6();
        this.B4 = true;
        this.C4 = (byte) 2;
        this.D4 = (byte) 3;
        this.E4 = new ArrayList();
        this.F4 = new LongSparseIntArray();
        this.G4 = new LongSparseIntArray();
        this.H4 = new LongSparseIntArray();
        this.I4 = new vf6();
        this.J4 = new HashSet();
        this.R4 = new vf6();
        this.S4 = new HashSet();
        this.T4 = new f67(this, (byte) 22);
        this.W4 = new n97(this);
        this.c5 = new HashSet();
        this.d5 = new HashSet();
        this.e5 = new f67(this, (byte) 23);
        this.f5 = new LongSparseArray();
        this.g5 = new HashMap();
        this.l5 = new f67(this, (byte) 6);
        this.n5 = new o97(this);
        fl5.z();
        getMessagesStorage();
        getLocationController();
        gl.c3(new f67(this, (byte) 7));
        h();
        if (this.currentAccount == 0) {
            this.W3 = a.b.getSharedPreferences("Notifications", 0);
            k = a.b.getSharedPreferences("mainconfig", 0);
            this.X3 = k;
            this.Y3 = a.b.getSharedPreferences("emoji", 0);
        } else {
            this.W3 = oo1.k(new StringBuilder("Notifications"), this.currentAccount, a.b, 0);
            k = oo1.k(new StringBuilder("mainconfig"), this.currentAccount, a.b, 0);
            this.X3 = k;
            this.Y3 = oo1.k(new StringBuilder("emoji"), this.currentAccount, a.b, 0);
        }
        System.currentTimeMillis();
        this.C3 = k.getBoolean("remoteConfigLoaded", false);
        this.D3 = k.getBoolean("fpnvAllowed", false);
        this.z2 = k.getInt("secretWebpage2", 2);
        this.O2 = k.getInt("maxGroupCount", kk7.d3);
        this.Q2 = k.getInt("maxMegagroupCount", 10000);
        this.Y2 = k.getInt("maxRecentGifsCount", kk7.d3);
        this.W2 = k.getInt("maxRecentStickersCount", 30);
        this.X2 = k.getInt("maxFaveStickersCount", 5);
        this.R2 = k.getInt("maxEditTime", 3600);
        this.S2 = k.getInt("ratingDecay", 2419200);
        this.N2 = k.getString("linkPrefix", "t.me");
        hashSet.clear();
        String string = k.getString("unreadOnlyFilters", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split(",")) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.Z2 = this.X3.getInt("callReceiveTimeout", 20000);
        this.a3 = this.X3.getInt("callRingTimeout", 90000);
        this.b3 = this.X3.getInt("callConnectTimeout", 30000);
        this.c3 = this.X3.getInt("callPacketTimeout", 10000);
        this.h3 = this.X3.getInt("updateCheckDelay", 86400);
        this.d3 = this.X3.getInt("maxFolderPinnedDialogsCountDefault", 100);
        this.e3 = this.X3.getInt("maxFolderPinnedDialogsCountPremium", 100);
        this.j3 = this.X3.getInt("maxMessageLength", TLObject.FLAG_12);
        this.k3 = this.X3.getInt("maxCaptionLength", 1024);
        this.f3 = this.X3.getInt("mapProvider", 0);
        this.g3 = this.X3.getInt("availableMapProviders", 3);
        this.i3 = this.X3.getString("pk", null);
        this.t3 = this.X3.getString("installReferer", null);
        this.T2 = this.X3.getInt("revokeTimeLimit", ConnectionsManager.DEFAULT_DATACENTER_ID);
        this.U2 = this.X3.getInt("revokeTimePmLimit", ConnectionsManager.DEFAULT_DATACENTER_ID);
        this.V2 = this.X3.getBoolean("canRevokePmInbox", this.V2);
        this.m3 = this.X3.getBoolean("preloadFeaturedStickers", false);
        this.s2 = this.X3.getLong("proxy_dialog", 0L);
        this.m2 = this.X3.getInt("nextPromoInfoCheckTime", 0);
        this.t2 = this.X3.getInt("promo_dialog_type", 0);
        this.u2 = this.X3.getString("promo_psa_message", null);
        this.v2 = this.X3.getString("promo_psa_type", null);
        this.w2 = this.X3.getString("proxyDialogAddress", null);
        this.o3 = this.X3.getString("gifSearchBot", "gif");
        this.p3 = this.X3.getString("imageSearchBot", "pic");
        this.l3 = this.X3.getBoolean("blockedCountry", false);
        this.s3 = this.X3.getString("suggestedLangCode", "en");
        this.n3 = this.X3.getBoolean("showFiltersTooltip", false);
        this.u3 = this.X3.getStringSet("pendingSuggestions", null);
        this.v3 = this.X3.getStringSet("dismissedSuggestions", null);
        this.a4 = this.X3.getInt("transcribeButtonPressed", 0);
        this.L3 = this.X3.getLong("telegramAntispamUserId", -1L);
        Object[] objArr2 = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0;
        byte b5 = 11;
        this.S3 = (HashSet) Collection.-EL.stream(this.X3.getStringSet("whitelistedBots", new HashSet())).map(new xz(b5)).collect(Collectors.toCollection(new lm1((byte) 1)));
        String string2 = this.X3.getString("starsGroupcallMessageLimits", null);
        byte b6 = 8;
        if (string2 == null || string2.length() == 0) {
            a = de5.a();
        } else {
            try {
                a = DesugarArrays.stream(string2.split(",")).mapToInt(new mm(b6)).toArray();
            } catch (Exception e) {
                fa4.g(e, true);
                a = de5.a();
            }
        }
        this.T3 = a;
        this.R3 = this.X3.getString("storiesPosting", "enabled");
        this.E3 = ea7.b(0, this.X3.getString("peerColors", ""));
        this.F3 = ea7.b(1, this.X3.getString("profilePeerColors", ""));
        SharedPreferences sharedPreferences = this.X3;
        boolean z = w01.a;
        int i2 = sharedPreferences.getInt("transcribeAudioTrialWeeklyNumber", 0);
        this.G3 = i2;
        this.I3 = this.X3.getInt("transcribeAudioTrialCurrentNumber", i2);
        this.H3 = this.X3.getInt("transcribeAudioTrialCooldownUntil", 0);
        this.Q3 = this.X3.getBoolean("storyQualityFull", true);
        this.P3 = this.X3.getBoolean("savedViewAsChats", false);
        this.l4 = this.X3.getBoolean("folderTags", false);
        this.J3 = this.X3.getStringSet("webAppAllowedProtocols", new HashSet(Arrays.asList("http", "https")));
        this.K3 = this.X3.getStringSet("ignoreRestrictionReasons", new HashSet(Arrays.asList(new String[0])));
        this.M3 = this.X3.getStringSet("starrefStartParamPrefixes", new HashSet(Arrays.asList("_tgr_")));
        this.N3 = this.X3.getLong("paidReactionsAnonymousTime", 0L);
        this.U3 = DesugarArrays.stream(this.X3.getString("tonStakediceStakeSuggestedAmounts", "100000000,1000000000,2000000000,5000000000,10000000000,20000000000").split(",")).mapToLong(new td(b4)).toArray();
        this.V3 = (int[][]) DesugarArrays.stream(this.X3.getString("stargiftsCraftAttributesPermilles", "90,,80,200,,70,190,460,,60,180,450,1000").split(",,")).map(new xz(b3)).toArray(new z57((byte) 0));
        gr grVar = this.k4;
        SharedPreferences sharedPreferences2 = this.X3;
        grVar.getClass();
        String[] strArr = gr.G3;
        SharedPreferences.Editor editor = null;
        for (int i3 = 0; i3 < 4; i3++) {
            String str2 = strArr[i3];
            if (sharedPreferences2.contains(str2)) {
                editor = editor == null ? sharedPreferences2.edit() : editor;
                editor.remove(str2);
            }
        }
        if (editor != null) {
            editor.apply();
        }
        Iterator it = grVar.a.a.values().iterator();
        while (it.hasNext()) {
            ((fr2) it.next()).d(sharedPreferences2);
        }
        this.k4.B0.a(new f67(this, objArr == true ? 1 : 0));
        this.k4.t1.a(new f67(this, b4));
        f67 f67Var = new f67(this, b5);
        this.k4.y3.a(f67Var);
        this.k4.z3.a(f67Var);
        this.k4.A3.a(new am6(b2));
        this.k4.s0.a(new f67(this, (byte) 16));
        System.currentTimeMillis();
        this.O3 = null;
        if (System.currentTimeMillis() - this.N3 < 7200000) {
            boolean contains = this.X3.contains("paidReactionsDialogId");
            SharedPreferences sharedPreferences3 = this.X3;
            if (contains) {
                this.O3 = Long.valueOf(sharedPreferences3.getLong("paidReactionsDialogId", 0L));
            } else {
                this.O3 = Long.valueOf(sharedPreferences3.getBoolean("paidReactionsAnonymous", false) ? 2666000L : 0L);
            }
        }
        gl.c3(new f67(this, (byte) 8));
        w01.h = this.X3.getString("googleAuthClientId", w01.h);
        if (this.X3.contains("dcDomainName2")) {
            this.q3 = this.X3.getString("dcDomainName2", "apv3.stel.com");
        } else {
            this.q3 = objArr2 == true ? "tapv3.stel.com" : "apv3.stel.com";
        }
        if (this.X3.contains("webFileDatacenterId")) {
            this.r3 = this.X3.getInt("webFileDatacenterId", 4);
        } else {
            this.r3 = objArr2 != false ? 2 : 4;
        }
        SparseIntArray sparseIntArray = this.E0;
        String string3 = this.X3.getString("premiumFeaturesTypesToPosition", null);
        sparseIntArray.clear();
        if (string3 != null) {
            String[] split = string3.split("_");
            for (int i4 = 0; i4 < split.length; i4++) {
                sparseIntArray.put(Integer.parseInt(split[i4]), i4);
            }
        }
        SparseIntArray sparseIntArray2 = this.F0;
        String string4 = this.X3.getString("businessFeaturesTypesToPosition", null);
        sparseIntArray2.clear();
        if (string4 != null) {
            String[] split2 = string4.split("_");
            for (int i5 = 0; i5 < split2.length; i5++) {
                sparseIntArray2.put(Integer.parseInt(split2[i5]), i5);
            }
        }
        if (this.u3 != null) {
            this.u3 = new HashSet(this.u3);
        } else {
            this.u3 = new HashSet();
        }
        if (this.v3 != null) {
            this.v3 = new HashSet(this.v3);
        } else {
            this.v3 = new HashSet();
        }
        this.z3 = this.X3.getString("autologinToken", null);
        Set<String> stringSet = this.X3.getStringSet("diceEmojies", null);
        if (stringSet == null) {
            HashSet hashSet2 = new HashSet();
            this.y3 = hashSet2;
            hashSet2.add("🎲");
            this.y3.add("🎯");
        } else {
            this.y3 = new HashSet(stringSet);
        }
        String string5 = this.X3.getString("diceSuccess", null);
        if (string5 == null) {
            this.A3.put("🎯", new x97(62, 6));
        } else {
            try {
                byte[] decode = Base64.decode(string5, 0);
                if (decode != null) {
                    SerializedData serializedData = new SerializedData(decode);
                    int readInt32 = serializedData.readInt32(true);
                    for (int i6 = 0; i6 < readInt32; i6++) {
                        this.A3.put(serializedData.readString(true), new x97(serializedData.readInt32(true), serializedData.readInt32(true)));
                    }
                    serializedData.cleanup();
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
        String string6 = this.X3.getString("emojiSounds", null);
        if (string6 != null) {
            try {
                byte[] decode2 = Base64.decode(string6, 0);
                if (decode2 != null) {
                    SerializedData serializedData2 = new SerializedData(decode2);
                    int readInt322 = serializedData2.readInt32(true);
                    for (int i7 = 0; i7 < readInt322; i7++) {
                        HashMap hashMap = this.B3;
                        String readString = serializedData2.readString(true);
                        long readInt64 = serializedData2.readInt64(true);
                        long readInt642 = serializedData2.readInt64(true);
                        byte[] readByteArray = serializedData2.readByteArray(true);
                        y97 y97Var = new y97();
                        y97Var.a = readInt64;
                        y97Var.b = readInt642;
                        y97Var.c = readByteArray;
                        hashMap.put(readString, y97Var);
                    }
                    serializedData2.cleanup();
                }
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
        String string7 = this.X3.getString("gifSearchEmojies", null);
        if (string7 == null) {
            this.x3.add("👍");
            this.x3.add("👎");
            this.x3.add("😍");
            this.x3.add("😂");
            this.x3.add("😮");
            this.x3.add("🙄");
            this.x3.add("😥");
            this.x3.add("😡");
            this.x3.add("🥳");
            this.x3.add("😎");
        } else {
            try {
                byte[] decode3 = Base64.decode(string7, 0);
                if (decode3 != null) {
                    SerializedData serializedData3 = new SerializedData(decode3);
                    int readInt323 = serializedData3.readInt32(true);
                    for (int i8 = 0; i8 < readInt323; i8++) {
                        this.x3.add(serializedData3.readString(true));
                    }
                    serializedData3.cleanup();
                }
            } catch (Exception e4) {
                fa4.g(e4, true);
            }
        }
        gl.d3(new f67(this, (byte) 17), 2000L);
        gl.d3(new f67(this, (byte) 6), 2000L);
        gl.d3(new f67(this, (byte) 18), 400L);
        pub pubVar = new pub(i);
        pubVar.a = new vf6();
        pubVar.b = new vf6();
        pubVar.c = new LongSparseIntArray();
        pubVar.d = new LongSparseIntArray();
        pubVar.e = new vf6();
        pubVar.f = new vf6();
        pubVar.h = new LongSparseLongArray();
        pubVar.n = new LongSparseIntArray();
        new LongSparseIntArray();
        pubVar.r = new LongSparseIntArray();
        pubVar.s = new vf6();
        this.g4 = pubVar;
        this.h4 = new o51(i);
        this.i4 = new b1c(this);
        Utilities.e.c(new f67(this, (byte) 19));
    }

    public static boolean A2(TLRPC.User user) {
        return (user == null || !user.premium || E2(user)) ? false : true;
    }

    public static boolean E2(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        if (user.support) {
            return true;
        }
        long j = user.id;
        return j == 777000 || j == 333000 || j == 4240000 || j == 4244000 || j == 4245000 || j == 4246000 || j == 410000 || j == 420000 || j == 431000 || j == 431415000 || j == 434000 || j == 4243000 || j == 439000 || j == 449000 || j == 450000 || j == 452000 || j == 454000 || j == 4254000 || j == 455000 || j == 460000 || j == 470000 || j == 479000 || j == 796000 || j == 482000 || j == 490000 || j == 496000 || j == 497000 || j == 498000 || j == 4298000;
    }

    public static boolean K2(TLRPC.UserFull userFull) {
        if (userFull != null) {
            return userFull.noforwards_peer_enabled || userFull.noforwards_my_enabled;
        }
        return false;
    }

    public static long N1(TLRPC.Reaction reaction) {
        if (reaction == null) {
            return 0L;
        }
        long j = reaction.tag_long_id;
        if (j != 0) {
            return j;
        }
        if (!(reaction instanceof TLRPC.TL_reactionEmoji)) {
            if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                return 0L;
            }
            long j2 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            reaction.tag_long_id = j2;
            return j2;
        }
        int i = 0;
        String substring = Utilities.a(((TLRPC.TL_reactionEmoji) reaction).emoticon).substring(0, 16);
        int length = substring.length();
        if (length == 0) {
            throw new NumberFormatException("empty string");
        }
        if (substring.charAt(0) == '+' && length > 1) {
            i = 1;
        }
        long j3 = 0;
        while (i < length) {
            int digit = Character.digit(substring.charAt(i), 16);
            if (digit == -1) {
                throw new NumberFormatException(substring.toString());
            }
            if (j3 < 0 || j3 > 1152921504606846975L || (j3 == 1152921504606846975L && digit > 15)) {
                throw new NumberFormatException("Too large for unsigned long: ".concat(substring.toString()));
            }
            j3 = (j3 << 4) + digit;
            i++;
        }
        reaction.tag_long_id = j3;
        return j3;
    }

    public static /* synthetic */ String P2(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new z57((byte) 1)).collect(Collectors.joining(","));
    }

    public static long Q1(TLRPC.Update update) {
        if (update instanceof TL_update.TL_updateNewChannelMessage) {
            return ((TL_update.TL_updateNewChannelMessage) update).message.peer_id.channel_id;
        }
        if (update instanceof TL_update.TL_updateEditChannelMessage) {
            return ((TL_update.TL_updateEditChannelMessage) update).message.peer_id.channel_id;
        }
        if (update instanceof TL_update.TL_updateReadChannelOutbox) {
            return ((TL_update.TL_updateReadChannelOutbox) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelMessageViews) {
            return ((TL_update.TL_updateChannelMessageViews) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelMessageForwards) {
            return ((TL_update.TL_updateChannelMessageForwards) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelTooLong) {
            return ((TL_update.TL_updateChannelTooLong) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelReadMessagesContents) {
            return ((TL_update.TL_updateChannelReadMessagesContents) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelAvailableMessages) {
            return ((TL_update.TL_updateChannelAvailableMessages) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannel) {
            return ((TL_update.TL_updateChannel) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelWebPage) {
            return ((TL_update.TL_updateChannelWebPage) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateDeleteChannelMessages) {
            return ((TL_update.TL_updateDeleteChannelMessages) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateReadChannelInbox) {
            return ((TL_update.TL_updateReadChannelInbox) update).channel_id;
        }
        if (update instanceof TL_update.TL_updatePinnedForumTopic) {
            return ((TL_update.TL_updatePinnedForumTopic) update).peer.channel_id;
        }
        if (update instanceof TL_update.TL_updatePinnedForumTopics) {
            return ((TL_update.TL_updatePinnedForumTopics) update).peer.channel_id;
        }
        if (update instanceof TL_update.TL_updateReadChannelDiscussionInbox) {
            return ((TL_update.TL_updateReadChannelDiscussionInbox) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateReadChannelDiscussionOutbox) {
            return ((TL_update.TL_updateReadChannelDiscussionOutbox) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelUserTyping) {
            return ((TL_update.TL_updateChannelUserTyping) update).channel_id;
        }
        if (update instanceof TL_update.TL_updatePinnedChannelMessages) {
            return ((TL_update.TL_updatePinnedChannelMessages) update).channel_id;
        }
        if (update instanceof TL_update.TL_updateChannelViewForumAsMessages) {
            return ((TL_update.TL_updateChannelViewForumAsMessages) update).channel_id;
        }
        if (!w01.a) {
            return 0L;
        }
        fa4.d("trying to get unknown update channel_id for " + update);
        return 0L;
    }

    public static int R1(TLRPC.Update update) {
        if (update instanceof TL_update.TL_updateDeleteMessages) {
            return ((TL_update.TL_updateDeleteMessages) update).pts;
        }
        if (update instanceof TL_update.TL_updateNewChannelMessage) {
            return ((TL_update.TL_updateNewChannelMessage) update).pts;
        }
        if (update instanceof TL_update.TL_updateReadHistoryOutbox) {
            return ((TL_update.TL_updateReadHistoryOutbox) update).pts;
        }
        if (update instanceof TL_update.TL_updateNewMessage) {
            return ((TL_update.TL_updateNewMessage) update).pts;
        }
        if (update instanceof TL_update.TL_updateEditMessage) {
            return ((TL_update.TL_updateEditMessage) update).pts;
        }
        if (update instanceof TL_update.TL_updateWebPage) {
            return ((TL_update.TL_updateWebPage) update).pts;
        }
        if (update instanceof TL_update.TL_updateReadHistoryInbox) {
            return ((TL_update.TL_updateReadHistoryInbox) update).pts;
        }
        if (update instanceof TL_update.TL_updateChannelWebPage) {
            return ((TL_update.TL_updateChannelWebPage) update).pts;
        }
        if (update instanceof TL_update.TL_updateDeleteChannelMessages) {
            return ((TL_update.TL_updateDeleteChannelMessages) update).pts;
        }
        if (update instanceof TL_update.TL_updateEditChannelMessage) {
            return ((TL_update.TL_updateEditChannelMessage) update).pts;
        }
        if (update instanceof TL_update.TL_updateReadMessagesContents) {
            return ((TL_update.TL_updateReadMessagesContents) update).pts;
        }
        if (update instanceof TL_update.TL_updateChannelTooLong) {
            return ((TL_update.TL_updateChannelTooLong) update).pts;
        }
        if (update instanceof TL_update.TL_updateFolderPeers) {
            return ((TL_update.TL_updateFolderPeers) update).pts;
        }
        if (update instanceof TL_update.TL_updatePinnedChannelMessages) {
            return ((TL_update.TL_updatePinnedChannelMessages) update).pts;
        }
        if (update instanceof TL_update.TL_updatePinnedMessages) {
            return ((TL_update.TL_updatePinnedMessages) update).pts;
        }
        if (update instanceof TL_update.TL_updateMessageWidgetData) {
            return ((TL_update.TL_updateMessageWidgetData) update).pts;
        }
        return 0;
    }

    public static int S1(TLRPC.Update update) {
        if (update instanceof TL_update.TL_updateDeleteMessages) {
            return ((TL_update.TL_updateDeleteMessages) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateNewChannelMessage) {
            return ((TL_update.TL_updateNewChannelMessage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateReadHistoryOutbox) {
            return ((TL_update.TL_updateReadHistoryOutbox) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateNewMessage) {
            return ((TL_update.TL_updateNewMessage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateEditMessage) {
            return ((TL_update.TL_updateEditMessage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateWebPage) {
            return ((TL_update.TL_updateWebPage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateReadHistoryInbox) {
            return ((TL_update.TL_updateReadHistoryInbox) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateChannelWebPage) {
            return ((TL_update.TL_updateChannelWebPage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateDeleteChannelMessages) {
            return ((TL_update.TL_updateDeleteChannelMessages) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateEditChannelMessage) {
            return ((TL_update.TL_updateEditChannelMessage) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateReadMessagesContents) {
            return ((TL_update.TL_updateReadMessagesContents) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateFolderPeers) {
            return ((TL_update.TL_updateFolderPeers) update).pts_count;
        }
        if (update instanceof TL_update.TL_updatePinnedChannelMessages) {
            return ((TL_update.TL_updatePinnedChannelMessages) update).pts_count;
        }
        if (update instanceof TL_update.TL_updatePinnedMessages) {
            return ((TL_update.TL_updatePinnedMessages) update).pts_count;
        }
        if (update instanceof TL_update.TL_updateMessageWidgetData) {
            return ((TL_update.TL_updateMessageWidgetData) update).pts_count;
        }
        return 0;
    }

    public static int T1(TLRPC.Update update) {
        if ((update instanceof TL_update.TL_updateNewMessage) || (update instanceof TL_update.TL_updateReadMessagesContents) || (update instanceof TL_update.TL_updateReadHistoryInbox) || (update instanceof TL_update.TL_updateReadHistoryOutbox) || (update instanceof TL_update.TL_updateDeleteMessages) || (update instanceof TL_update.TL_updateWebPage) || (update instanceof TL_update.TL_updateEditMessage) || (update instanceof TL_update.TL_updateFolderPeers) || (update instanceof TL_update.TL_updatePinnedMessages) || (update instanceof TL_update.TL_updateMessageWidgetData)) {
            return 0;
        }
        if (update instanceof TL_update.TL_updateNewEncryptedMessage) {
            return 1;
        }
        return ((update instanceof TL_update.TL_updateNewChannelMessage) || (update instanceof TL_update.TL_updateDeleteChannelMessages) || (update instanceof TL_update.TL_updateEditChannelMessage) || (update instanceof TL_update.TL_updateChannelWebPage) || (update instanceof TL_update.TL_updatePinnedChannelMessages)) ? 2 : 3;
    }

    public static String X1(TLRPC.User user) {
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            return gl.A2(user.first_name);
        }
        String str2 = user.last_name;
        return (str2 == null || str2.length() <= 0) ? "" : gl.A2(user.last_name);
    }

    public static void X4(String str, d dVar) {
        if (dVar == null || dVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dVar.getResourceProvider(), dVar.getParentActivity());
        String M0 = k96.M0(2131751442, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        HashMap hashMap = new HashMap();
        int i = bkb.K5;
        hashMap.put("info1", Integer.valueOf(dVar.getThemedColor(i)));
        hashMap.put("info2", Integer.valueOf(dVar.getThemedColor(i)));
        alertDialog$Builder.l(R.raw.not_available, 52, dVar.getThemedColor(i), hashMap);
        hdVar.X = true;
        alertDialog$Builder.j(k96.M0(2131752029, null), null);
        hdVar.U = str;
        dVar.showDialog(hdVar);
    }

    public static SharedPreferences b1() {
        return q1(0).Y3;
    }

    public static TLRPC.TL_wallPaperSettings b2(vjb vjbVar) {
        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
        tL_wallPaperSettings.blur = vjbVar.i;
        tL_wallPaperSettings.motion = vjbVar.j;
        int i = vjbVar.d;
        if (i != 0) {
            tL_wallPaperSettings.background_color = i & 16777215;
            int i2 = tL_wallPaperSettings.flags;
            tL_wallPaperSettings.intensity = (int) (vjbVar.k * 100.0f);
            tL_wallPaperSettings.flags = i2 | 9;
        } else {
            float f = vjbVar.k;
            if (f > 0.0f) {
                tL_wallPaperSettings.intensity = (int) (f * 100.0f);
                tL_wallPaperSettings.flags |= 8;
            }
        }
        int i3 = vjbVar.e;
        if (i3 != 0) {
            tL_wallPaperSettings.second_background_color = i3 & 16777215;
            tL_wallPaperSettings.rotation = gl.q1(vjbVar.h, true);
            tL_wallPaperSettings.flags |= 16;
        }
        int i4 = vjbVar.f;
        if (i4 != 0) {
            tL_wallPaperSettings.third_background_color = i4 & 16777215;
            tL_wallPaperSettings.flags |= 32;
        }
        int i5 = vjbVar.g;
        if (i5 != 0) {
            tL_wallPaperSettings.fourth_background_color = i5 & 16777215;
            tL_wallPaperSettings.flags |= 64;
        }
        return tL_wallPaperSettings;
    }

    public static SharedPreferences c1() {
        return q1(0).X3;
    }

    public static boolean c2(String str, ArrayList arrayList) {
        String lowerCase = str.toLowerCase();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String lowerCase2 = ((TL_account.WebDomainException) arrayList.get(i)).domain.toLowerCase();
            if (TextUtils.equals(lowerCase2, lowerCase)) {
                return true;
            }
            if (lowerCase.endsWith("." + lowerCase2)) {
                return true;
            }
        }
        return false;
    }

    public static SharedPreferences d1() {
        return q1(0).W3;
    }

    public static TLRPC.InputMedia f5(TLRPC.MessageMedia messageMedia) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputMediaDocument.id = tL_inputDocument;
            TLRPC.Document document = messageMedia.document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            return tL_inputMediaDocument;
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
            return null;
        }
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputMediaPhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageMedia.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        return tL_inputMediaPhoto;
    }

    public static TLRPC.InputChannel g1(TLRPC.Chat chat) {
        if (!hc2.T(chat)) {
            return new TLRPC.TL_inputChannelEmpty();
        }
        if (chat.access_hash != 0 || chat.fromMessageDialogId == 0 || chat.fromMessageId == 0) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
            return tL_inputChannel;
        }
        TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
        tL_inputChannelFromMessage.channel_id = chat.id;
        tL_inputChannelFromMessage.peer = q1(y6c.t0).h1(chat.fromMessageDialogId);
        tL_inputChannelFromMessage.msg_id = chat.fromMessageId;
        return tL_inputChannelFromMessage;
    }

    public static void i0(ArrayList arrayList, TL_account.WebDomainException webDomainException) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            if (TL_account.WebDomainException.equalsByDomain((TL_account.WebDomainException) arrayList.get(i), webDomainException)) {
                arrayList.remove(i);
                i--;
                size--;
            }
            i++;
        }
    }

    public static TLRPC.InputPeer i1(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l1((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return j1((TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static TLRPC.InputPeer j1(TLRPC.Chat chat) {
        if (!hc2.T(chat)) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = chat.id;
            return tL_inputPeerChat;
        }
        if (chat == null || chat.access_hash != 0 || chat.fromMessageDialogId == 0 || chat.fromMessageId == 0) {
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = chat.id;
            tL_inputPeerChannel.access_hash = chat.access_hash;
            return tL_inputPeerChannel;
        }
        TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
        tL_inputPeerChannelFromMessage.channel_id = chat.id;
        tL_inputPeerChannelFromMessage.peer = q1(y6c.t0).h1(chat.fromMessageDialogId);
        tL_inputPeerChannelFromMessage.msg_id = chat.fromMessageId;
        return tL_inputPeerChannelFromMessage;
    }

    public static TLRPC.InputPeer l1(TLRPC.User user) {
        if (user == null || user.access_hash != 0 || user.fromMessageDialogId == 0 || user.fromMessageId == 0) {
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = user.id;
            tL_inputPeerUser.access_hash = user.access_hash;
            return tL_inputPeerUser;
        }
        TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
        tL_inputPeerUserFromMessage.user_id = user.id;
        tL_inputPeerUserFromMessage.peer = q1(y6c.t0).h1(user.fromMessageDialogId);
        tL_inputPeerUserFromMessage.msg_id = user.fromMessageId;
        return tL_inputPeerUserFromMessage;
    }

    public static TLRPC.TL_emojiStatusCollectible n0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = new TLRPC.TL_emojiStatusCollectible();
        tL_emojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        tL_emojiStatusCollectible.title = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
        if (stargiftattributemodel != null) {
            tL_emojiStatusCollectible.document_id = stargiftattributemodel.document.id;
        }
        if (stargiftattributepattern != null) {
            tL_emojiStatusCollectible.pattern_document_id = stargiftattributepattern.document.id;
        }
        if (stargiftattributebackdrop != null) {
            tL_emojiStatusCollectible.center_color = stargiftattributebackdrop.center_color;
            tL_emojiStatusCollectible.edge_color = stargiftattributebackdrop.edge_color;
            tL_emojiStatusCollectible.text_color = stargiftattributebackdrop.text_color;
            tL_emojiStatusCollectible.pattern_color = stargiftattributebackdrop.pattern_color;
        }
        return tL_emojiStatusCollectible;
    }

    public static TLRPC.InputWallPaper p1(vjb vjbVar) {
        if (vjbVar.l <= 0) {
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = vjbVar.c;
            return tL_inputWallPaperSlug;
        }
        TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
        tL_inputWallPaper.id = vjbVar.l;
        tL_inputWallPaper.access_hash = vjbVar.m;
        return tL_inputWallPaper;
    }

    public static boolean q0(TLRPC.MessageMedia messageMedia, TLRPC.MessageMedia messageMedia2) {
        return messageMedia instanceof TLRPC.TL_messageMediaDocument ? (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && messageMedia.document.id == messageMedia2.document.id : (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo.id == messageMedia2.photo.id;
    }

    public static na7 q1(int i) {
        na7 na7Var;
        na7 na7Var2 = s5[i];
        if (na7Var2 != null) {
            return na7Var2;
        }
        synchronized (t5[i]) {
            na7Var = s5[i];
            if (na7Var == null) {
                na7[] na7VarArr = s5;
                na7 na7Var3 = new na7(i);
                na7VarArr[i] = na7Var3;
                na7Var = na7Var3;
            }
        }
        return na7Var;
    }

    public static void r0(long j, TLObject tLObject, ArrayList arrayList) {
        int i = 0;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (user.access_hash == 0 && user.fromMessageDialogId == 0 && arrayList != null) {
                while (i < arrayList.size()) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                    if (cf3.n(message.from_id) == user.id) {
                        user.fromMessageDialogId = j;
                        user.fromMessageId = message.id;
                        return;
                    }
                    i++;
                }
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            if (chat.access_hash == 0 && chat.fromMessageDialogId == 0 && arrayList != null) {
                while (i < arrayList.size()) {
                    TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i);
                    if (cf3.n(message2.from_id) == (-chat.id)) {
                        chat.fromMessageDialogId = j;
                        chat.fromMessageId = message2.id;
                        return;
                    }
                    i++;
                }
            }
        }
    }

    public static SharedPreferences u1(int i) {
        return q1(i).W3;
    }

    public static ArrayList w0(TLRPC.Updates updates, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (updates != null) {
            if (cls.isInstance(updates.update)) {
                arrayList.add((TLRPC.Update) cls.cast(updates.update));
            }
            if (updates.updates != null) {
                for (int i = 0; i < updates.updates.size(); i++) {
                    TLRPC.Update update = updates.updates.get(i);
                    if (cls.isInstance(update)) {
                        arrayList.add((TLRPC.Update) cls.cast(update));
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList x0(TLRPC.Updates updates, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (updates != null) {
            if (cls.isInstance(updates.update)) {
                TLRPC.Update update = updates.update;
                updates.update = null;
                arrayList.add((TLRPC.Update) cls.cast(update));
            }
            if (updates.updates != null) {
                int i = 0;
                while (i < updates.updates.size()) {
                    if (cls.isInstance(updates.updates.get(i))) {
                        arrayList.add((TLRPC.Update) cls.cast(updates.updates.remove(i)));
                        i--;
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public static int x3(ArrayList arrayList) {
        TLRPC.Message message;
        int i;
        int i2 = TLObject.FLAG_31;
        for (int i3 = 0; arrayList != null && i3 < arrayList.size(); i3++) {
            k27 k27Var = (k27) arrayList.get(i3);
            if (k27Var != null && (message = k27Var.k) != null && (i = message.date) > i2) {
                i2 = i;
            }
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A(Bundle bundle, d dVar, k27 k27Var, pp1 pp1Var) {
        TLRPC.User user;
        TLRPC.Chat chat;
        hd hdVar;
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        if (dVar == null) {
            return true;
        }
        long j = bundle.getLong("user_id", 0L);
        long j2 = bundle.getLong("chat_id", 0L);
        int i = bundle.getInt("message_id", 0);
        if (j != 0) {
            user = V1(Long.valueOf(j));
            chat = null;
        } else if (j2 != 0) {
            chat = K0(Long.valueOf(j2));
            user = null;
        } else {
            user = null;
            chat = null;
        }
        if (user == null && chat == null) {
            return true;
        }
        String C1 = chat != null ? C1(chat.restriction_reason) : C1(user.restriction_reason);
        if (C1 != null) {
            X4(C1, dVar);
            return false;
        }
        if (i == 0 || k27Var == null || chat == null || chat.access_hash != 0) {
            if (i == 0 || k27Var == null || pp1Var == null) {
                return true;
            }
            pp1Var.d();
            pp1Var.b = p0(-j2, i, new xl3((Object) pp1Var, (Object) dVar, (Object) bundle, (byte) 20));
            return false;
        }
        long B0 = k27.B0(k27Var.k);
        if (cf3.B(B0)) {
            return true;
        }
        if (pp1Var != null) {
            pp1Var.d();
            hdVar = null;
        } else {
            hdVar = new hd(3, null, dVar.getParentActivity());
        }
        if (B0 < 0) {
            chat = K0(Long.valueOf(-B0));
        }
        if (B0 > 0 || !hc2.T(chat)) {
            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages2.id.add(Integer.valueOf(k27Var.e1()));
            tL_messages_getMessages = tL_messages_getMessages2;
        } else {
            TLRPC.Chat K0 = K0(Long.valueOf(-B0));
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = g1(K0);
            tL_channels_getMessages.id.add(Integer.valueOf(k27Var.e1()));
            tL_messages_getMessages = tL_channels_getMessages;
        }
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_getMessages, new fn0(this, (Object) hdVar, (Object) pp1Var, (Object) dVar, (Object) bundle, (byte) 11));
        if (hdVar == null) {
            pp1Var.b = new j45((Object) this, sendRequest, (Object) dVar, (byte) 12);
            pp1Var.d();
            return false;
        }
        hdVar.setOnCancelListener(new bg(this, sendRequest, dVar, (byte) 2));
        dVar.setVisibleDialog(hdVar);
        hdVar.show();
        return false;
    }

    public final String A0(long j, long j2) {
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        if (j == j2) {
            return "";
        }
        vf6 vf6Var = (vf6) this.q1.f(j);
        if (vf6Var != null && (channelParticipant2 = (TLRPC.ChannelParticipant) vf6Var.f(j2)) != null) {
            String str = channelParticipant2.rank;
            if (str != null) {
                return str;
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                return k96.M0(2131752195, null);
            }
            if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                return k96.M0(2131752196, null);
            }
        }
        TLRPC.ChatFull L0 = L0(j);
        if (L0 != null && L0.participants != null) {
            int i = 0;
            while (true) {
                if (i >= L0.participants.participants.size()) {
                    break;
                }
                TLRPC.ChatParticipant chatParticipant = L0.participants.participants.get(i);
                if (chatParticipant.user_id == j2) {
                    String str2 = chatParticipant.rank;
                    if (str2 != null) {
                        return str2;
                    }
                    if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                        return channelParticipant.rank;
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        return k96.M0(2131752195, null);
                    }
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        return k96.M0(2131752196, null);
                    }
                } else {
                    i++;
                }
            }
        }
        return null;
    }

    public final CharSequence A1(long j, long j2, boolean z) {
        vf6 vf6Var;
        TLRPC.User V1;
        TLRPC.UserStatus userStatus;
        if ((!z || !cf3.D(j) || (V1 = V1(Long.valueOf(j))) == null || (userStatus = V1.status) == null || userStatus.expires >= 0) && (vf6Var = (vf6) this.X.f(j)) != null) {
            return (CharSequence) vf6Var.f(j2);
        }
        return null;
    }

    public final void A3(String str, final d dVar, final int i, final c01 c01Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        if (str == null || dVar == null) {
            return;
        }
        TLObject a2 = a2(str);
        if (a2 instanceof TLRPC.User) {
            user = (TLRPC.User) a2;
            if (!user.min) {
                chat = null;
            }
            user = null;
            chat = null;
        } else {
            if (a2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) a2;
                if (!chat2.min) {
                    chat = chat2;
                    user = null;
                }
            }
            user = null;
            chat = null;
        }
        if (user != null) {
            B3(user, null, dVar, i);
            return;
        }
        if (chat != null) {
            B3(null, chat, dVar, 1);
            return;
        }
        if (dVar.getParentActivity() != null) {
            final hd[] hdVarArr = {new hd(3, null, dVar.getParentActivity())};
            final boolean[] zArr = {false};
            getMessagesController().Y1().a(str, null, new p8c() { // from class: q57
                @Override // p8c
                public final void a(Object obj) {
                    Long l = (Long) obj;
                    c01 c01Var2 = c01Var;
                    hd[] hdVarArr2 = hdVarArr;
                    try {
                        if (c01Var2 != null) {
                            c01Var2.b();
                        } else {
                            hdVarArr2[0].dismiss();
                        }
                    } catch (Exception unused) {
                    }
                    hdVarArr2[0] = null;
                    d dVar2 = dVar;
                    dVar2.setVisibleDialog(null);
                    if (zArr[0]) {
                        return;
                    }
                    if (l != null) {
                        long longValue = l.longValue();
                        na7 na7Var = na7.this;
                        if (longValue < 0) {
                            na7Var.B3(null, na7Var.K0(Long.valueOf(-l.longValue())), dVar2, 1);
                            return;
                        } else {
                            na7Var.B3(na7Var.V1(l), null, dVar2, i);
                            return;
                        }
                    }
                    if (dVar2.getParentActivity() != null) {
                        try {
                            if (dVar2 instanceof mu1) {
                                ((mu1) dVar2).Fb();
                            }
                            u21.b0(dVar2).t(k96.M0(2131747942, null), null).j();
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                    }
                }
            });
            if (c01Var == null) {
                gl.d3(new lo6((Object) hdVarArr, (Object) zArr, (Object) dVar, (byte) 13), 500L);
            } else {
                c01Var.b = new il1(zArr, (byte) 5);
                c01Var.d();
            }
        }
    }

    public final void A4(akb akbVar, zjb zjbVar, boolean z, boolean z2) {
        TLRPC.TL_theme tL_theme = zjbVar != null ? zjbVar.r : akbVar.G;
        if (tL_theme != null) {
            TL_account.saveTheme savetheme = new TL_account.saveTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            savetheme.theme = tL_inputTheme;
            savetheme.unsave = z2;
            getConnectionsManager().sendRequest(savetheme, new ce2((byte) 0));
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (z2) {
            return;
        }
        f2(akbVar, zjbVar, z);
    }

    public final void A5(boolean z, boolean z2) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings != null) {
            tL_webBrowserSettings.open_external_browser = z;
            tL_webBrowserSettings.display_close_button = z2;
            W4(tL_webBrowserSettings);
        }
        TL_account.updateWebBrowserSettings updatewebbrowsersettings = new TL_account.updateWebBrowserSettings();
        updatewebbrowsersettings.open_external_browser = z;
        updatewebbrowsersettings.display_close_button = z2;
        getConnectionsManager().sendRequestTyped(updatewebbrowsersettings, new hc((byte) 0), new k67(this, (byte) 1));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void B(long j, String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1809401834:
                if (str.equals("USER_BANNED_IN_CHANNEL")) {
                    c = 0;
                    break;
                }
                break;
            case -795226617:
                if (str.equals("CHANNEL_PRIVATE")) {
                    c = 1;
                    break;
                }
                break;
            case -471086771:
                if (str.equals("CHANNEL_PUBLIC_GROUP_NA")) {
                    c = 2;
                    break;
                }
                break;
        }
        int i = kk7.T;
        switch (c) {
            case 0:
                getNotificationCenter().k(i, Long.valueOf(j), 2);
                break;
            case 1:
                getNotificationCenter().k(i, Long.valueOf(j), 0);
                break;
            case 2:
                getNotificationCenter().k(i, Long.valueOf(j), 1);
                break;
        }
    }

    public final int B0() {
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.w;
            if (i >= sparseArray.size()) {
                return i2;
            }
            List list = (List) sparseArray.get(sparseArray.keyAt(i));
            if (list != null) {
                i2 = list.size() + i2;
            }
            i++;
        }
    }

    public final Integer B1(long j, long j2) {
        vf6 vf6Var = (vf6) this.Y.f(j);
        if (vf6Var == null) {
            return null;
        }
        return (Integer) vf6Var.f(j2);
    }

    public final boolean B2(long j, boolean z) {
        TLRPC.Dialog dialog = this.q2;
        if (dialog == null || dialog.id != j) {
            return false;
        }
        return !z || this.r2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B3(TLRPC.User user, TLRPC.Chat chat, d dVar, int i) {
        String C1;
        boolean z;
        if ((user == null && chat == null) || dVar == null) {
            return;
        }
        boolean z2 = false;
        if (chat != null) {
            C1 = C1(chat.restriction_reason);
        } else {
            C1 = C1(user.restriction_reason);
            if (i != 3 && user.bot) {
                if (LaunchActivity.Q().getLastStoryViewer() == null) {
                    i = 1;
                    z = true;
                } else {
                    z = false;
                    i = 1;
                }
                d Q = LaunchActivity.Q();
                boolean z3 = !(Q instanceof cj3) || (Q instanceof ah6);
                if (C1 == null) {
                    X4(C1, dVar);
                    return;
                }
                Bundle bundle = new Bundle();
                if (chat != null) {
                    bundle.putLong("chat_id", chat.id);
                } else {
                    bundle.putLong("user_id", user.id);
                }
                if (i == 0) {
                    dVar.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                if (i == 2) {
                    if (!hc2.c0(chat)) {
                        dVar.presentFragment(new mu1(bundle), !z3, true);
                        return;
                    } else {
                        HashSet hashSet = qvb.s1;
                        dVar.presentFragment(qvb.E0(dVar.getMessagesController(), dVar.getMessagesStorage(), bundle), !z3, true);
                        return;
                    }
                }
                if (!hc2.c0(chat)) {
                    mu1 mu1Var = new mu1(bundle);
                    if (z && !z3) {
                        z2 = true;
                    }
                    dVar.presentFragment(mu1Var, z2);
                    return;
                }
                HashSet hashSet2 = qvb.s1;
                d E0 = qvb.E0(dVar.getMessagesController(), dVar.getMessagesStorage(), bundle);
                if (z && !z3) {
                    z2 = true;
                }
                dVar.presentFragment(E0, z2);
                return;
            }
        }
        z = false;
        d Q2 = LaunchActivity.Q();
        if (Q2 instanceof cj3) {
        }
        if (C1 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0279 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0267 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B4(akb akbVar, zjb zjbVar) {
        String str;
        String str2;
        boolean z;
        int i;
        String str3;
        Throwable th;
        FileOutputStream fileOutputStream;
        boolean z2;
        char c;
        String str4;
        String str5;
        String str6;
        if (akbVar != null) {
            if (zjbVar != 0) {
                File f1 = gl.f1();
                f1.mkdirs();
                Locale locale = Locale.US;
                File file = new File(f1, zjbVar.b.k() + "_" + zjbVar.a + ".attheme");
                SparseIntArray R0 = bkb.R0(null, zjbVar.b.d, null);
                SparseIntArray clone = R0.clone();
                zjbVar.d(R0, clone);
                if (TextUtils.isEmpty(zjbVar.o)) {
                    z = true;
                    i = 0;
                    str3 = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (zjbVar.q) {
                        sb.append("motion");
                    }
                    int i2 = clone.get(bkb.De);
                    if (i2 == 0) {
                        i2 = -1;
                    }
                    int i3 = clone.get(bkb.Ee);
                    if (i3 == 0) {
                        i3 = 0;
                    }
                    int i4 = clone.get(bkb.Fe);
                    if (i4 == 0) {
                        i4 = 0;
                    }
                    int i5 = clone.get(bkb.Ge);
                    if (i5 == 0) {
                        i5 = 0;
                    }
                    int i6 = clone.get(bkb.He);
                    if (i6 == 0) {
                        i6 = 45;
                    }
                    i = 0;
                    String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i2 >> 16)) & 255), Integer.valueOf(((byte) (i2 >> 8)) & 255), Byte.valueOf((byte) (i2 & kk7.d4))).toLowerCase();
                    if (i3 != 0) {
                        c = 2;
                        z = true;
                        str4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i3 >> 16)) & 255), Integer.valueOf(((byte) (i3 >> 8)) & 255), Byte.valueOf((byte) (i3 & kk7.d4))).toLowerCase();
                    } else {
                        z = true;
                        c = 2;
                        str4 = null;
                    }
                    if (i4 != 0) {
                        Integer valueOf = Integer.valueOf(((byte) (i4 >> 16)) & 255);
                        Integer valueOf2 = Integer.valueOf(((byte) (i4 >> 8)) & 255);
                        Byte valueOf3 = Byte.valueOf((byte) (i4 & kk7.d4));
                        Object[] objArr = new Object[3];
                        objArr[0] = valueOf;
                        objArr[z ? 1 : 0] = valueOf2;
                        objArr[c] = valueOf3;
                        str5 = String.format("%02x%02x%02x", objArr).toLowerCase();
                    } else {
                        str5 = null;
                    }
                    if (i5 != 0) {
                        Integer valueOf4 = Integer.valueOf(((byte) (i5 >> 16)) & 255);
                        Integer valueOf5 = Integer.valueOf(((byte) (i5 >> 8)) & 255);
                        Byte valueOf6 = Byte.valueOf((byte) (i5 & kk7.d4));
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = valueOf4;
                        objArr2[z ? 1 : 0] = valueOf5;
                        objArr2[c] = valueOf6;
                        str6 = String.format("%02x%02x%02x", objArr2).toLowerCase();
                    } else {
                        str6 = null;
                    }
                    if (str4 != null) {
                        if (str5 == null) {
                            lowerCase = tb4.p(lowerCase, "-", str4) + "&rotation=" + i6;
                        } else if (str6 != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(lowerCase);
                            sb2.append("~");
                            sb2.append(str4);
                            sb2.append("~");
                            sb2.append(str5);
                            lowerCase = b00.j(sb2, "~", str6);
                        } else {
                            lowerCase = lowerCase + "~" + str4 + "~" + str5;
                        }
                    }
                    str3 = "https://attheme.org?slug=" + zjbVar.o + "&intensity=" + ((int) (zjbVar.p * 100.0f)) + "&bg_color=" + lowerCase;
                    if (sb.length() > 0) {
                        StringBuilder k = b00.k(str3, "&mode=");
                        k.append(sb.toString());
                        str3 = k.toString();
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                for (int i7 = i; i7 < clone.size(); i7++) {
                    int keyAt = clone.keyAt(i7);
                    int valueAt = clone.valueAt(i7);
                    if (str3 == null || (bkb.De != keyAt && bkb.Ee != keyAt && bkb.Fe != keyAt && bkb.Ge != keyAt)) {
                        ir2.w(sb3, keyAt, "=", valueAt, "\n");
                    }
                }
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        try {
                            fileOutputStream2.write(gl.g1(sb3.toString()));
                            if (!TextUtils.isEmpty(str3)) {
                                try {
                                    fileOutputStream2.write(gl.g1("WLS=" + str3 + "\n"));
                                } catch (Exception e) {
                                    e = e;
                                    fileOutputStream = fileOutputStream2;
                                    z2 = z;
                                    try {
                                        fa4.g(e, z2);
                                        if (fileOutputStream != null) {
                                        }
                                        str = file.getAbsolutePath();
                                        str2 = str;
                                        if (str2 == null) {
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileOutputStream != null) {
                                        }
                                    }
                                }
                            }
                            try {
                                fileOutputStream2.close();
                            } catch (Exception e2) {
                                fa4.g(e2, z);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                throw th;
                            }
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                                throw th;
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream2;
                        z2 = true;
                        fa4.g(e, z2);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e5) {
                                fa4.g(e5, z2);
                            }
                        }
                        str = file.getAbsolutePath();
                        str2 = str;
                        if (str2 == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    fileOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
                str = file.getAbsolutePath();
            } else {
                str = akbVar.b;
            }
            str2 = str;
            if (str2 == null || this.I2.containsKey(str2)) {
                return;
            }
            this.I2.put(str2, zjbVar != 0 ? zjbVar : akbVar);
            Utilities.e.c(new jw6(this, str2, zjbVar, akbVar, (byte) 6));
        }
    }

    public final void C(long j, boolean z) {
        TLRPC.Chat K0 = K0(Long.valueOf(j));
        if (!hc2.T(K0) || K0.creator) {
            return;
        }
        vf6 vf6Var = this.R0;
        if (vf6Var.h(j) < 0) {
            if (hc2.p0(K0)) {
                z = false;
            }
            boolean z2 = z;
            vf6Var.k(Boolean.TRUE, j);
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = f1(j);
            tL_channels_getParticipant.participant = h1(getUserConfig().e());
            getConnectionsManager().sendRequest(tL_channels_getParticipant, new j67((byte) 0, j, this, K0, z2));
        }
    }

    public final TLRPC.messages_AvailableEffects C0() {
        if (!this.U4) {
            this.U4 = true;
            this.W4.c(this.currentAccount, 0, new f97(this, (byte) 0));
        }
        return this.V4;
    }

    public final String C1(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.RestrictionReason restrictionReason = (TLRPC.RestrictionReason) arrayList.get(i);
            Set set = this.K3;
            if ((set == null || !set.contains(restrictionReason.reason)) && !"sensitive".equals(restrictionReason.reason)) {
                if (!"all".equals(restrictionReason.platform)) {
                    if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                        a.t();
                        if (!w01.a()) {
                        }
                    }
                    if (!"android-all".equals(restrictionReason.platform)) {
                    }
                }
                return restrictionReason.text;
            }
        }
        return null;
    }

    public final boolean C2(int i, long j, boolean z) {
        Boolean bool = (Boolean) this.g5.get(j + "_" + i);
        return bool != null && bool.booleanValue() == z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C3(int i) {
        ArrayList arrayList;
        byte b = 0;
        Object[] objArr = 0;
        byte b2 = 1;
        if (i == 1) {
            Context context = a.b;
            int i2 = this.currentAccount;
            long e = getUserConfig().e();
            if (e == 0) {
                Object obj = g15.g;
            } else {
                synchronized (g15.g) {
                    ArrayList o = g15.o(context, e);
                    int size = o.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = o.get(i3);
                        i3++;
                        new g15(i2, context, (String) obj2).C();
                    }
                }
            }
            if (getUserConfig().d && gba.f.length() == 0) {
                TL_account.unregisterDevice unregisterdevice = new TL_account.unregisterDevice();
                unregisterdevice.token = gba.f;
                unregisterdevice.token_type = gba.e;
                for (int i4 = 0; i4 < 4; i4++) {
                    y6c h = y6c.h(i4);
                    if (i4 != this.currentAccount && h.o()) {
                        unregisterdevice.other_uids.add(Long.valueOf(h.e()));
                    }
                }
                getConnectionsManager().sendRequest(unregisterdevice, new ce2(b));
            }
            getConnectionsManager().sendRequest(new TLRPC.TL_auth_logOut(), new y47(this, (byte) 20));
        } else {
            getConnectionsManager().cleanup(i == 2);
        }
        getUserConfig().b();
        bue.a(this.currentAccount);
        ArrayList arrayList2 = (ArrayList) getNotificationCenter().a.get(kk7.H2);
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(arrayList2.size());
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                gk7 gk7Var = (gk7) arrayList2.get(i5);
                if (gk7Var instanceof jk7) {
                    gk7Var = (gk7) ((jk7) gk7Var).b.get();
                }
                if (gk7Var != null) {
                    arrayList.add(gk7Var);
                }
            }
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                if (arrayList.get(i6) instanceof LaunchActivity) {
                    break;
                }
            }
        }
        if (y6c.t0 == this.currentAccount) {
            int i7 = 0;
            while (true) {
                if (i7 >= 4) {
                    i7 = -1;
                    break;
                } else if (y6c.h(i7).o()) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 != -1) {
                y6c.t0 = i7;
                y6c.h(0).u(false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.J();
                }
            }
        }
        getNotificationCenter().k(kk7.H2, new Object[0]);
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new cc7(messagesStorage, objArr == true ? 1 : 0, b2));
        M();
        qu2 contactsController = getContactsController();
        contactsController.getClass();
        try {
            contactsController.a = null;
            AccountManager accountManager = AccountManager.get(a.b);
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i8 = 0; i8 < accountsByType.length; i8++) {
                Account account = accountsByType[i8];
                int i9 = 0;
                while (true) {
                    if (i9 >= 4) {
                        try {
                            accountManager.removeAccount(accountsByType[i8], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    } else {
                        TLRPC.User f = y6c.h(i9).f();
                        if (f != null) {
                            if (!account.name.equals("" + f.id)) {
                            }
                        }
                        i9++;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void C4() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.n4.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(num);
        }
        this.X3.edit().putString("unreadOnlyFilters", sb.toString()).apply();
    }

    public final void D(int i, boolean z) {
        if (i >= 0) {
            SparseArray sparseArray = this.d0;
            q97 q97Var = (q97) sparseArray.get(i);
            if (q97Var != null) {
                if (q97Var.a) {
                    return;
                }
                if (System.currentTimeMillis() - q97Var.b <= this.k4.s1.f() * 1000 && !z) {
                    return;
                }
            }
            if (q97Var == null) {
                q97Var = new q97();
                q97Var.a = true;
                sparseArray.put(i, q97Var);
            }
            q97Var.a = false;
            TL_chatlists.TL_chatlists_getChatlistUpdates tL_chatlists_getChatlistUpdates = new TL_chatlists.TL_chatlists_getChatlistUpdates();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getChatlistUpdates.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = i;
            getConnectionsManager().sendRequest(tL_chatlists_getChatlistUpdates, new b97(this, i, q97Var, (byte) 9));
        }
    }

    public final void D0(boolean z) {
        if (!getUserConfig().o() || this.w0) {
            return;
        }
        this.w0 = true;
        TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
        tL_contacts_getBlocked.offset = z ? 0 : this.x0.size();
        tL_contacts_getBlocked.limit = z ? 20 : 100;
        getConnectionsManager().sendRequest(tL_contacts_getBlocked, new mi1((Object) this, z, (Object) tL_contacts_getBlocked, (byte) 8));
    }

    public final vp9 D1() {
        vp9 vp9Var = this.f0;
        if (vp9Var != null) {
            return vp9Var;
        }
        synchronized (t5[this.currentAccount]) {
            vp9 vp9Var2 = this.f0;
            if (vp9Var2 != null) {
                return vp9Var2;
            }
            vp9 vp9Var3 = new vp9(this.currentAccount);
            this.f0 = vp9Var3;
            return vp9Var3;
        }
    }

    public final boolean D2() {
        if (W1(getUserConfig().e()) == null) {
            return false;
        }
        return !r2.sponsored_enabled;
    }

    public final boolean D3(long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        NativeByteBuffer nativeByteBuffer;
        long y;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
        if (dialog != null) {
            if (dialog.pinned == z) {
                return true;
            }
            int i = dialog.folder_id;
            ArrayList U0 = U0(i);
            dialog.pinned = z;
            if (z) {
                int i2 = 0;
                for (int i3 = 0; i3 < U0.size(); i3++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) U0.get(i3);
                    if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                        if (!dialog2.pinned) {
                            if (dialog2.id != this.s2) {
                                break;
                            }
                        } else {
                            i2 = Math.max(dialog2.pinnedNum, i2);
                        }
                    }
                }
                dialog.pinnedNum = i2 + 1;
            } else {
                dialog.pinnedNum = 0;
            }
            NativeByteBuffer nativeByteBuffer2 = null;
            Z4(null);
            if (!z && !U0.isEmpty() && b00.f(1, U0) == dialog && !this.U1.get(i)) {
                tb4.v(1, U0);
            }
            getNotificationCenter().k(kk7.r, new Object[0]);
            if (!cf3.B(j) && j2 != -1) {
                TLRPC.TL_messages_toggleDialogPin tL_messages_toggleDialogPin = new TLRPC.TL_messages_toggleDialogPin();
                tL_messages_toggleDialogPin.pinned = z;
                TLRPC.InputPeer h1 = inputPeer == null ? h1(j) : inputPeer;
                if (!(h1 instanceof TLRPC.TL_inputPeerEmpty)) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer.peer = h1;
                    tL_messages_toggleDialogPin.peer = tL_inputDialogPeer;
                    if (j2 == 0) {
                        try {
                            nativeByteBuffer = new NativeByteBuffer(h1.getObjectSize() + 16);
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            nativeByteBuffer.writeInt32(4);
                            nativeByteBuffer.writeInt64(j);
                            nativeByteBuffer.writeBool(z);
                            h1.serializeToStream(nativeByteBuffer);
                        } catch (Exception e2) {
                            e = e2;
                            nativeByteBuffer2 = nativeByteBuffer;
                            fa4.g(e, true);
                            nativeByteBuffer = nativeByteBuffer2;
                            y = getMessagesStorage().y(nativeByteBuffer);
                            getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new x47(this, y, (byte) 11));
                            ad7 messagesStorage = getMessagesStorage();
                            messagesStorage.a.c(new bb7(messagesStorage, dialog.pinnedNum, j, (byte) 3));
                            return true;
                        }
                        y = getMessagesStorage().y(nativeByteBuffer);
                    } else {
                        y = j2;
                    }
                    getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new x47(this, y, (byte) 11));
                }
            }
            ad7 messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new bb7(messagesStorage2, dialog.pinnedNum, j, (byte) 3));
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D4(File file, vjb vjbVar, boolean z, long j) {
        TL_account.saveWallPaper savewallpaper;
        NativeByteBuffer nativeByteBuffer;
        TLRPC.WallPaper tL_wallPaper;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        NativeByteBuffer nativeByteBuffer2 = null;
        if (this.J2 != null) {
            File e = sqc.e(vjbVar.b);
            if (file != null && (file.getAbsolutePath().equals(this.J2) || file.equals(e))) {
                this.K2 = vjbVar;
                return;
            } else {
                getFileLoader().b(this.J2, false);
                this.J2 = null;
                this.K2 = null;
            }
        }
        if (file != null) {
            this.J2 = file.getAbsolutePath();
            this.K2 = vjbVar;
            getFileLoader().h0(false, 16777216, this.J2, true);
        } else if (!"d".equals(vjbVar.c) && !"c".equals(vjbVar.c) && vjbVar.l > 0 && !"t".equals(vjbVar.c)) {
            TLRPC.InputWallPaper p1 = p1(vjbVar);
            TLRPC.TL_wallPaperSettings b2 = b2(vjbVar);
            if (z) {
                TL_account.installWallPaper installwallpaper = new TL_account.installWallPaper();
                installwallpaper.wallpaper = p1;
                installwallpaper.settings = b2;
                savewallpaper = installwallpaper;
            } else {
                TL_account.saveWallPaper savewallpaper2 = new TL_account.saveWallPaper();
                savewallpaper2.wallpaper = p1;
                savewallpaper2.settings = b2;
                savewallpaper = savewallpaper2;
            }
            if (j == 0) {
                try {
                    nativeByteBuffer = new NativeByteBuffer(1024);
                    try {
                        nativeByteBuffer.writeInt32(21);
                        nativeByteBuffer.writeBool(vjbVar.i);
                        nativeByteBuffer.writeBool(vjbVar.j);
                        nativeByteBuffer.writeInt32(vjbVar.d);
                        nativeByteBuffer.writeInt32(vjbVar.e);
                        nativeByteBuffer.writeInt32(vjbVar.h);
                        nativeByteBuffer.writeDouble(vjbVar.k);
                        nativeByteBuffer.writeBool(z);
                        nativeByteBuffer.writeString(vjbVar.c);
                        nativeByteBuffer.writeString(vjbVar.b);
                        nativeByteBuffer.limit(nativeByteBuffer.position());
                    } catch (Exception e2) {
                        e = e2;
                        nativeByteBuffer2 = nativeByteBuffer;
                        fa4.g(e, true);
                        nativeByteBuffer = nativeByteBuffer2;
                        j = getMessagesStorage().y(nativeByteBuffer);
                        getConnectionsManager().sendRequest(savewallpaper, new x47(this, j, (byte) 8));
                        if ("c".equals(vjbVar.c)) {
                        }
                        if ("c".equals(vjbVar.c)) {
                        }
                        j2 = vjbVar.l;
                        if (j2 != 0) {
                        }
                        tL_wallPaper.dark = ye7.j(vjbVar.d, vjbVar.e, vjbVar.f, vjbVar.g);
                        tL_wallPaper.flags |= 4;
                        TLRPC.WallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                        tL_wallPaper.settings = tL_wallPaperSettings;
                        tL_wallPaperSettings.blur = vjbVar.i;
                        tL_wallPaperSettings.motion = vjbVar.j;
                        i = vjbVar.d;
                        if (i != 0) {
                        }
                        i2 = vjbVar.e;
                        if (i2 != 0) {
                        }
                        i3 = vjbVar.f;
                        if (i3 != 0) {
                        }
                        i4 = vjbVar.g;
                        if (i4 != 0) {
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(tL_wallPaper);
                        getMessagesStorage().m1(-3, arrayList);
                        getMessagesStorage().m0();
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                j = getMessagesStorage().y(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(savewallpaper, new x47(this, j, (byte) 8));
        }
        if (!("c".equals(vjbVar.c) && vjbVar.f == 0) && vjbVar.l <= 0) {
            if ("c".equals(vjbVar.c)) {
                tL_wallPaper = new TLRPC.TL_wallPaper();
                tL_wallPaper.slug = vjbVar.c;
                tL_wallPaper.document = new TLRPC.TL_documentEmpty();
            } else {
                tL_wallPaper = new TLRPC.TL_wallPaperNoFile();
            }
            j2 = vjbVar.l;
            if (j2 != 0) {
                long nextLong = Utilities.b.nextLong();
                tL_wallPaper.id = nextLong;
                if (nextLong > 0) {
                    tL_wallPaper.id = -nextLong;
                }
            } else {
                tL_wallPaper.id = j2;
            }
            tL_wallPaper.dark = ye7.j(vjbVar.d, vjbVar.e, vjbVar.f, vjbVar.g);
            tL_wallPaper.flags |= 4;
            TLRPC.WallPaperSettings tL_wallPaperSettings2 = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings2;
            tL_wallPaperSettings2.blur = vjbVar.i;
            tL_wallPaperSettings2.motion = vjbVar.j;
            i = vjbVar.d;
            if (i != 0) {
                tL_wallPaperSettings2.background_color = i;
                int i5 = tL_wallPaperSettings2.flags;
                tL_wallPaperSettings2.intensity = (int) (vjbVar.k * 100.0f);
                tL_wallPaperSettings2.flags = i5 | 9;
            }
            i2 = vjbVar.e;
            if (i2 != 0) {
                tL_wallPaperSettings2.second_background_color = i2;
                tL_wallPaperSettings2.rotation = gl.q1(vjbVar.h, true);
                tL_wallPaperSettings2 = tL_wallPaper.settings;
                tL_wallPaperSettings2.flags |= 16;
            }
            i3 = vjbVar.f;
            if (i3 != 0) {
                tL_wallPaperSettings2.third_background_color = i3;
                tL_wallPaperSettings2.flags |= 32;
            }
            i4 = vjbVar.g;
            if (i4 != 0) {
                tL_wallPaperSettings2.fourth_background_color = i4;
                tL_wallPaperSettings2.flags |= 64;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(tL_wallPaper);
            getMessagesStorage().m1(-3, arrayList2);
            getMessagesStorage().m0();
        }
    }

    public final boolean E(boolean z) {
        int i;
        int currentTime = getConnectionsManager().getCurrentTime();
        byte b = 0;
        if ((this.O1 == null && this.P1 == null) || (!z && ((i = this.N1) == 0 || i > currentTime))) {
            return false;
        }
        this.N1 = 0;
        if (this.Q1 != null && !z) {
            Utilities.d.a(this.Q1);
        }
        this.Q1 = null;
        vf6 vf6Var = this.O1;
        vf6 clone = vf6Var != null ? vf6Var.clone() : null;
        vf6 vf6Var2 = this.P1;
        gl.c3(new b57(this, clone, vf6Var2 != null ? vf6Var2.clone() : null, b));
        return true;
    }

    public final og1 E0() {
        og1 og1Var = this.i0;
        if (og1Var != null) {
            return og1Var;
        }
        synchronized (t5[this.currentAccount]) {
            og1 og1Var2 = this.i0;
            if (og1Var2 != null) {
                return og1Var2;
            }
            og1 og1Var3 = new og1(this.currentAccount);
            this.i0 = og1Var3;
            return og1Var3;
        }
    }

    public final ha7 E1() {
        ha7 ha7Var = this.h5;
        if (ha7Var != null) {
            return ha7Var;
        }
        ha7 ha7Var2 = new ha7(this.currentAccount);
        this.h5 = ha7Var2;
        return ha7Var2;
    }

    public final void E3(TLRPC.Chat chat, TLRPC.User user, int i, boolean z, boolean z2, boolean z3) {
        if (chat == null && user == null) {
            return;
        }
        TLRPC.TL_messages_updatePinnedMessage tL_messages_updatePinnedMessage = new TLRPC.TL_messages_updatePinnedMessage();
        tL_messages_updatePinnedMessage.peer = h1(chat != null ? -chat.id : user.id);
        tL_messages_updatePinnedMessage.id = i;
        tL_messages_updatePinnedMessage.unpin = z;
        tL_messages_updatePinnedMessage.silent = !z3;
        tL_messages_updatePinnedMessage.pm_oneside = z2;
        getConnectionsManager().sendRequest(tL_messages_updatePinnedMessage, new h87(this, i, chat, user, z));
    }

    public final void E4(String str, TLRPC.User user) {
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
        tL_messages_startBot.bot = o1(user);
        tL_messages_startBot.peer = h1(user.id);
        tL_messages_startBot.start_param = str;
        tL_messages_startBot.random_id = Utilities.b.nextLong();
        getConnectionsManager().sendRequest(tL_messages_startBot, new y47(this, (byte) 21));
    }

    public final void F(int i) {
        if (i == 0) {
            return;
        }
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new wa7(messagesStorage, i, (byte) 3));
    }

    public final int F0() {
        boolean p = getUserConfig().p();
        gr grVar = this.k4;
        return (p ? grVar.h1 : grVar.g1).f();
    }

    public final TLRPC.TL_messages_savedReactionsTags F1(long j, boolean z) {
        HashSet hashSet = this.N4;
        if (hashSet != null && hashSet.contains(Long.valueOf(j)) && !z) {
            vf6 vf6Var = this.O4;
            if (vf6Var == null) {
                return null;
            }
            return (TLRPC.TL_messages_savedReactionsTags) vf6Var.f(j);
        }
        HashSet hashSet2 = this.N4;
        if (hashSet2 == null) {
            hashSet2 = new HashSet();
            this.N4 = hashSet2;
        }
        hashSet2.add(Long.valueOf(j));
        getMessagesStorage().a.c(new r57(this, j, (byte) 8));
        return null;
    }

    public final boolean F2(long j) {
        String str = "dialog_bar_vis3" + j;
        SharedPreferences sharedPreferences = this.W3;
        return sharedPreferences.getInt(str, 0) == 2 && (ls6.v("dialog_bar_report", j, sharedPreferences, false) || ls6.v("dialog_bar_block", j, sharedPreferences, false));
    }

    public final boolean F3() {
        return this.k4.a3.f && !getUserConfig().p();
    }

    public final void F4(final TLObject tLObject, final ArrayList arrayList, final TLRPC.TL_messages_dialogs tL_messages_dialogs, final TLRPC.TL_messages_dialogs tL_messages_dialogs2, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final SparseArray sparseArray, final ArrayList arrayList5, final HashMap hashMap, final HashSet hashSet, final Runnable runnable) {
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() { // from class: t87
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                boolean z = tLObject2 instanceof TLRPC.TL_messages_chats;
                final ArrayList arrayList6 = arrayList3;
                final ArrayList arrayList7 = arrayList2;
                final TLRPC.TL_messages_dialogs tL_messages_dialogs3 = tL_messages_dialogs;
                final TLRPC.TL_messages_dialogs tL_messages_dialogs4 = tL_messages_dialogs2;
                if (z) {
                    arrayList6.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                } else if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    int size = vector.objects.size();
                    for (int i = 0; i < size; i++) {
                        arrayList7.add((TLRPC.User) vector.objects.get(i));
                    }
                } else if (tLObject2 instanceof TLRPC.TL_messages_peerDialogs) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject2;
                    tL_messages_dialogs3.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                    tL_messages_dialogs3.messages.addAll(tL_messages_peerDialogs.messages);
                    tL_messages_dialogs4.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                    tL_messages_dialogs4.messages.addAll(tL_messages_peerDialogs.messages);
                    arrayList7.addAll(tL_messages_peerDialogs.users);
                    arrayList6.addAll(tL_messages_peerDialogs.chats);
                }
                ArrayList arrayList8 = arrayList;
                arrayList8.remove(tLObject);
                if (arrayList8.isEmpty()) {
                    final ad7 messagesStorage = na7.this.getMessagesStorage();
                    co3 co3Var = messagesStorage.a;
                    final ArrayList arrayList9 = arrayList4;
                    final SparseArray sparseArray2 = sparseArray;
                    final ArrayList arrayList10 = arrayList5;
                    final HashMap hashMap2 = hashMap;
                    final HashSet hashSet2 = hashSet;
                    final Runnable runnable2 = runnable;
                    co3Var.c(new Runnable() { // from class: fc7
                        @Override // java.lang.Runnable
                        public final void run() {
                            ad7.this.V0(tL_messages_dialogs3, tL_messages_dialogs4, arrayList7, arrayList6, arrayList9, sparseArray2, arrayList10, hashMap2, hashSet2, runnable2);
                        }
                    });
                }
            }
        });
    }

    public final void G(TLRPC.Chat chat, TLRPC.User user, ba7 ba7Var) {
        TLRPC.ChatParticipant chatParticipant;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (chat.megagroup || hc2.T(chat)) {
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = f1(chat.id);
            tL_channels_getParticipant.participant = l1(user);
            getConnectionsManager().sendRequest(tL_channels_getParticipant, new n35(ba7Var, (byte) 11));
            return;
        }
        TLRPC.ChatFull L0 = L0(chat.id);
        if (L0 == null) {
            ba7Var.a(false, null, null);
            return;
        }
        TLRPC.ChatParticipants chatParticipants = L0.participants;
        if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                chatParticipant = L0.participants.participants.get(i);
                if (chatParticipant != null && chatParticipant.user_id == user.id) {
                    break;
                }
            }
        }
        chatParticipant = null;
        boolean z = chatParticipant != null;
        TLRPC.ChatParticipants chatParticipants2 = L0.participants;
        ba7Var.a(z, (chatParticipants2 == null || chatParticipants2.admin_id != user.id) ? null : zc2.d0(true), null);
    }

    public final void G0(long j) {
        H0(j, 0, 0L, null);
    }

    public final void G1() {
        F1(0L, false);
    }

    public final boolean G2() {
        return !"disabled".equals(this.k4.K2.f);
    }

    public final boolean G3() {
        return this.k4.a3.f;
    }

    public final void G4(long j, long j2) {
        H4(2, 0, j, j2, null);
    }

    public final void H(TLRPC.Dialog dialog, TLRPC.InputPeer inputPeer, long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (cf3.B(dialog.id)) {
            return;
        }
        long j2 = dialog.id;
        vf6 vf6Var = this.U0;
        if (vf6Var.h(j2) < 0) {
            TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
            if (inputPeer == null) {
                inputPeer = h1(dialog.id);
            }
            tL_messages_getHistory.peer = inputPeer;
            tL_messages_getHistory.limit = 1;
            vf6Var.k(Boolean.TRUE, dialog.id);
            if (w01.a) {
                ug8.q(dialog.id, new StringBuilder("checkLastDialogMessage for "));
            }
            if (j == 0) {
                try {
                    nativeByteBuffer = new NativeByteBuffer(tL_messages_getHistory.peer.getObjectSize() + 60);
                } catch (Exception e) {
                    nativeByteBuffer = null;
                    exc = e;
                }
                try {
                    nativeByteBuffer.writeInt32(14);
                    nativeByteBuffer.writeInt64(dialog.id);
                    nativeByteBuffer.writeInt32(dialog.top_message);
                    nativeByteBuffer.writeInt32(dialog.read_inbox_max_id);
                    nativeByteBuffer.writeInt32(dialog.read_outbox_max_id);
                    nativeByteBuffer.writeInt32(dialog.unread_count);
                    nativeByteBuffer.writeInt32(dialog.last_message_date);
                    nativeByteBuffer.writeInt32(dialog.pts);
                    nativeByteBuffer.writeInt32(dialog.flags);
                    nativeByteBuffer.writeBool(dialog.pinned);
                    nativeByteBuffer.writeInt32(dialog.pinnedNum);
                    nativeByteBuffer.writeInt32(dialog.unread_mentions_count);
                    nativeByteBuffer.writeBool(dialog.unread_mark);
                    nativeByteBuffer.writeInt32(dialog.folder_id);
                    tL_messages_getHistory.peer.serializeToStream(nativeByteBuffer);
                } catch (Exception e2) {
                    exc = e2;
                    fa4.g(exc, true);
                    j = getMessagesStorage().y(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_getHistory, new w47((Object) this, (Object) dialog, j, (byte) 12));
                }
                j = getMessagesStorage().y(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_getHistory, new w47((Object) this, (Object) dialog, j, (byte) 12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(final long j, final int i, long j2, TLRPC.InputChannel inputChannel) {
        int i2;
        int i3;
        TLRPC.InputChannel inputChannel2;
        NativeByteBuffer nativeByteBuffer;
        final long j3 = j2;
        Boolean bool = Boolean.FALSE;
        vf6 vf6Var = this.Q0;
        if (((Boolean) vf6Var.g(bool, j)).booleanValue()) {
            return;
        }
        Object[] objArr = 0;
        byte b = 3;
        LongSparseIntArray longSparseIntArray = this.P0;
        byte b2 = 1;
        if (i != 1) {
            int i4 = longSparseIntArray.get(j);
            byte b3 = 2;
            if (i4 == 0) {
                i4 = getMessagesStorage().M(j);
                if (i4 != 0) {
                    longSparseIntArray.put(j, i4);
                } else if (i == 2 || i == 3) {
                    gl.c3(new r57(this, j, b2));
                    return;
                }
            }
            if (i4 == 0) {
                gl.c3(new r57(this, j, b3));
                return;
            } else {
                i2 = i4;
                i3 = 100;
            }
        } else if (longSparseIntArray.get(j) != 0) {
            gl.c3(new r57(this, j, objArr == true ? 1 : 0));
            return;
        } else {
            i3 = 1;
            i2 = 1;
        }
        if (inputChannel == null) {
            TLRPC.Chat K0 = K0(Long.valueOf(j));
            if (K0 == null && (K0 = getMessagesStorage().O(j)) != null) {
                T3(K0, true);
            }
            inputChannel2 = g1(K0);
        } else {
            inputChannel2 = inputChannel;
        }
        if (inputChannel2.access_hash == 0) {
            if (j3 != 0) {
                getMessagesStorage().n1(j3);
            }
            gl.c3(new r57(this, j, b));
            return;
        }
        if (j3 == 0) {
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(inputChannel2.getObjectSize() + 16);
                try {
                    nativeByteBuffer.writeInt32(25);
                    nativeByteBuffer.writeInt64(j);
                    nativeByteBuffer.writeInt32(i);
                    inputChannel2.serializeToStream(nativeByteBuffer);
                } catch (Exception e) {
                    e = e;
                    nativeByteBuffer2 = nativeByteBuffer;
                    fa4.g(e, true);
                    nativeByteBuffer = nativeByteBuffer2;
                    j3 = getMessagesStorage().y(nativeByteBuffer);
                    vf6Var.k(Boolean.TRUE, j);
                    TLRPC.TL_updates_getChannelDifference tL_updates_getChannelDifference = new TLRPC.TL_updates_getChannelDifference();
                    tL_updates_getChannelDifference.channel = inputChannel2;
                    tL_updates_getChannelDifference.filter = new TLRPC.TL_channelMessagesFilterEmpty();
                    tL_updates_getChannelDifference.pts = i2;
                    tL_updates_getChannelDifference.limit = i3;
                    tL_updates_getChannelDifference.force = i != 3;
                    if (w01.a) {
                    }
                    getConnectionsManager().sendRequest(tL_updates_getChannelDifference, new RequestDelegate() { // from class: s57
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            TLRPC.Chat chat;
                            na7 na7Var = na7.this;
                            long j4 = j;
                            long j5 = j3;
                            if (tLObject == null) {
                                if (tL_error != null) {
                                    gl.c3(new y67(na7Var, tL_error, j4, (byte) 0));
                                    na7Var.Q0.e(j4);
                                    if (j5 != 0) {
                                        na7Var.getMessagesStorage().n1(j5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                            vf6 vf6Var2 = new vf6();
                            int i5 = 0;
                            for (int i6 = 0; i6 < updates_channeldifference.users.size(); i6++) {
                                TLRPC.User user = updates_channeldifference.users.get(i6);
                                vf6Var2.k(user, user.id);
                            }
                            int i7 = 0;
                            while (true) {
                                if (i7 >= updates_channeldifference.chats.size()) {
                                    chat = null;
                                    break;
                                }
                                chat = updates_channeldifference.chats.get(i7);
                                if (chat.id == j4) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            TLRPC.Chat chat2 = chat;
                            ArrayList arrayList = new ArrayList();
                            if (!updates_channeldifference.other_updates.isEmpty()) {
                                while (i5 < updates_channeldifference.other_updates.size()) {
                                    TLRPC.Update update = updates_channeldifference.other_updates.get(i5);
                                    if (update instanceof TL_update.TL_updateMessageID) {
                                        arrayList.add((TL_update.TL_updateMessageID) update);
                                        updates_channeldifference.other_updates.remove(i5);
                                        i5--;
                                    }
                                    i5++;
                                }
                            }
                            na7Var.getMessagesStorage().j1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                            gl.c3(new t67(na7Var, updates_channeldifference, (byte) 3));
                            na7Var.getMessagesStorage().a.c(new u57(na7Var, arrayList, j4, updates_channeldifference, chat2, vf6Var2, i, j5));
                        }
                    });
                }
            } catch (Exception e2) {
                e = e2;
            }
            j3 = getMessagesStorage().y(nativeByteBuffer);
        }
        vf6Var.k(Boolean.TRUE, j);
        TLRPC.TL_updates_getChannelDifference tL_updates_getChannelDifference2 = new TLRPC.TL_updates_getChannelDifference();
        tL_updates_getChannelDifference2.channel = inputChannel2;
        tL_updates_getChannelDifference2.filter = new TLRPC.TL_channelMessagesFilterEmpty();
        tL_updates_getChannelDifference2.pts = i2;
        tL_updates_getChannelDifference2.limit = i3;
        tL_updates_getChannelDifference2.force = i != 3;
        if (w01.a) {
            fa4.b("start getChannelDifference with pts = " + i2 + " channelId = " + j);
        }
        getConnectionsManager().sendRequest(tL_updates_getChannelDifference2, new RequestDelegate() { // from class: s57
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TLRPC.Chat chat;
                na7 na7Var = na7.this;
                long j4 = j;
                long j5 = j3;
                if (tLObject == null) {
                    if (tL_error != null) {
                        gl.c3(new y67(na7Var, tL_error, j4, (byte) 0));
                        na7Var.Q0.e(j4);
                        if (j5 != 0) {
                            na7Var.getMessagesStorage().n1(j5);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                vf6 vf6Var2 = new vf6();
                int i5 = 0;
                for (int i6 = 0; i6 < updates_channeldifference.users.size(); i6++) {
                    TLRPC.User user = updates_channeldifference.users.get(i6);
                    vf6Var2.k(user, user.id);
                }
                int i7 = 0;
                while (true) {
                    if (i7 >= updates_channeldifference.chats.size()) {
                        chat = null;
                        break;
                    }
                    chat = updates_channeldifference.chats.get(i7);
                    if (chat.id == j4) {
                        break;
                    } else {
                        i7++;
                    }
                }
                TLRPC.Chat chat2 = chat;
                ArrayList arrayList = new ArrayList();
                if (!updates_channeldifference.other_updates.isEmpty()) {
                    while (i5 < updates_channeldifference.other_updates.size()) {
                        TLRPC.Update update = updates_channeldifference.other_updates.get(i5);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            arrayList.add((TL_update.TL_updateMessageID) update);
                            updates_channeldifference.other_updates.remove(i5);
                            i5--;
                        }
                        i5++;
                    }
                }
                na7Var.getMessagesStorage().j1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                gl.c3(new t67(na7Var, updates_channeldifference, (byte) 3));
                na7Var.getMessagesStorage().a.c(new u57(na7Var, arrayList, j4, updates_channeldifference, chat2, vf6Var2, i, j5));
            }
        });
    }

    public final String H1(TLRPC.Reaction reaction) {
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags;
        boolean z;
        vf6 vf6Var = this.O4;
        if (vf6Var == null || (tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) vf6Var.f(0L)) == null) {
            return null;
        }
        for (int i = 0; i < tL_messages_savedReactionsTags.tags.size(); i++) {
            TLRPC.Reaction reaction2 = tL_messages_savedReactionsTags.tags.get(i).reaction;
            Paint paint = i19.S;
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                    z = TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                }
                z = false;
            } else {
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id) {
                    z = true;
                }
                z = false;
            }
            if (z) {
                return tL_messages_savedReactionsTags.tags.get(i).title;
            }
        }
        return null;
    }

    public final boolean H2() {
        return !"disabled".equals(this.k4.J2.f);
    }

    public final void H3() {
        int i = this.a4;
        if (i < 2) {
            this.a4 = i + 1;
            SharedPreferences sharedPreferences = this.X3;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("transcribeButtonPressed", this.a4).apply();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (hc2.M(K0(java.lang.Long.valueOf(r14)), L0(r14), false) != r12) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x007d, code lost:
    
        if (r11.status.expires > (getConnectionsManager().getCurrentTime() - 30)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H4(final int i, int i2, final long j, final long j2, String str) {
        TLRPC.Chat K0;
        if (i >= 0) {
            vf6[] vf6VarArr = this.Z;
            if (i < vf6VarArr.length && j != 0) {
                long e = y6c.h(y6c.t0).e();
                if (j != e) {
                    if (j < 0) {
                        long j3 = -j;
                    } else {
                        TLRPC.User V1 = V1(Long.valueOf(j));
                        if (V1 != null) {
                            if (V1.id != getUserConfig().e()) {
                                TLRPC.UserStatus userStatus = V1.status;
                                if (userStatus != null && userStatus.expires != -100) {
                                    if (!this.a0.containsKey(Long.valueOf(V1.id))) {
                                    }
                                }
                            }
                        }
                        vf6 vf6Var = vf6VarArr[i];
                        if (vf6Var == null) {
                            vf6Var = new vf6();
                            vf6VarArr[i] = vf6Var;
                        }
                        vf6 vf6Var2 = (vf6) vf6Var.f(j);
                        if (vf6Var2 == null) {
                            vf6Var2 = new vf6();
                            vf6Var.k(vf6Var2, j);
                        }
                        if (vf6Var2.f(j2) == null) {
                            if (!cf3.B(j)) {
                                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                                if (j2 != 0) {
                                    tL_messages_setTyping.top_msg_id = (int) j2;
                                    tL_messages_setTyping.flags |= 1;
                                }
                                TLRPC.InputPeer h1 = h1(j);
                                tL_messages_setTyping.peer = h1;
                                if ((!(h1 instanceof TLRPC.TL_inputPeerChannel) || ((K0 = K0(Long.valueOf(h1.channel_id))) != null && K0.megagroup)) && tL_messages_setTyping.peer != null) {
                                    if (i == 0) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageTypingAction();
                                    } else if (i == 1) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageRecordAudioAction();
                                    } else if (i == 2) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageCancelAction();
                                    } else if (i == 3) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageUploadDocumentAction();
                                    } else if (i == 4) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageUploadPhotoAction();
                                    } else if (i == 5) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageUploadVideoAction();
                                    } else if (i == 6) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageGamePlayAction();
                                    } else if (i == 7) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageRecordRoundAction();
                                    } else if (i == 8) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageUploadRoundAction();
                                    } else if (i == 9) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageUploadAudioAction();
                                    } else if (i == 10) {
                                        tL_messages_setTyping.action = new TLRPC.TL_sendMessageChooseStickerAction();
                                    } else if (i == 11) {
                                        TLRPC.TL_sendMessageEmojiInteractionSeen tL_sendMessageEmojiInteractionSeen = new TLRPC.TL_sendMessageEmojiInteractionSeen();
                                        tL_sendMessageEmojiInteractionSeen.emoticon = str;
                                        tL_messages_setTyping.action = tL_sendMessageEmojiInteractionSeen;
                                    }
                                    vf6Var2.k(Boolean.TRUE, j2);
                                    final byte b = 0;
                                    int sendRequest = getConnectionsManager().sendRequest(tL_messages_setTyping, new RequestDelegate(this) { // from class: a97
                                        public final /* synthetic */ na7 b;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            this.b = this;
                                        }

                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (b) {
                                                case 0:
                                                    final byte b2 = 0;
                                                    final na7 na7Var = this.b;
                                                    final byte b3 = i;
                                                    final long j4 = j;
                                                    final long j5 = j2;
                                                    gl.c3(new Runnable() { // from class: b67
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (b2) {
                                                                case 0:
                                                                    na7Var.w(j4, b3, j5);
                                                                    break;
                                                                default:
                                                                    na7Var.w(j4, b3, j5);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b4 = 1;
                                                    final na7 na7Var2 = this.b;
                                                    final byte b5 = i;
                                                    final long j6 = j;
                                                    final long j7 = j2;
                                                    gl.c3(new Runnable() { // from class: b67
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (b4) {
                                                                case 0:
                                                                    na7Var2.w(j6, b5, j7);
                                                                    break;
                                                                default:
                                                                    na7Var2.w(j6, b5, j7);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    }, 2);
                                    if (i2 != 0) {
                                        getConnectionsManager().bindRequestToGuid(sendRequest, i2);
                                        return true;
                                    }
                                    return true;
                                }
                            } else if (i == 0) {
                                TLRPC.EncryptedChat Y0 = Y0(Integer.valueOf((int) (j & 4294967295L)));
                                byte[] bArr = Y0.auth_key;
                                if (bArr != null && bArr.length > 1 && (Y0 instanceof TLRPC.TL_encryptedChat)) {
                                    TLRPC.TL_messages_setEncryptedTyping tL_messages_setEncryptedTyping = new TLRPC.TL_messages_setEncryptedTyping();
                                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                                    tL_messages_setEncryptedTyping.peer = tL_inputEncryptedChat;
                                    tL_inputEncryptedChat.chat_id = Y0.id;
                                    tL_inputEncryptedChat.access_hash = Y0.access_hash;
                                    tL_messages_setEncryptedTyping.typing = true;
                                    vf6Var2.k(Boolean.TRUE, j2);
                                    final byte b2 = 1;
                                    int sendRequest2 = getConnectionsManager().sendRequest(tL_messages_setEncryptedTyping, new RequestDelegate(this) { // from class: a97
                                        public final /* synthetic */ na7 b;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            this.b = this;
                                        }

                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (b2) {
                                                case 0:
                                                    final byte b22 = 0;
                                                    final na7 na7Var = this.b;
                                                    final int b3 = i;
                                                    final long j4 = j;
                                                    final long j5 = j2;
                                                    gl.c3(new Runnable() { // from class: b67
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (b22) {
                                                                case 0:
                                                                    na7Var.w(j4, b3, j5);
                                                                    break;
                                                                default:
                                                                    na7Var.w(j4, b3, j5);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b4 = 1;
                                                    final na7 na7Var2 = this.b;
                                                    final int b5 = i;
                                                    final long j6 = j;
                                                    final long j7 = j2;
                                                    gl.c3(new Runnable() { // from class: b67
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (b4) {
                                                                case 0:
                                                                    na7Var2.w(j6, b5, j7);
                                                                    break;
                                                                default:
                                                                    na7Var2.w(j6, b5, j7);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    }, 2);
                                    if (i2 != 0) {
                                        getConnectionsManager().bindRequestToGuid(sendRequest2, i2);
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void I(boolean z) {
        ea7 ea7Var;
        if (getUserConfig().f() != null) {
            if (!this.P4 && ((ea7Var = this.E3) == null || ea7Var.g() || z)) {
                this.P4 = true;
                TLRPC.TL_help_getPeerColors tL_help_getPeerColors = new TLRPC.TL_help_getPeerColors();
                ea7 ea7Var2 = this.E3;
                tL_help_getPeerColors.hash = ea7Var2 != null ? ea7Var2.b : 0;
                if (ea7Var2 != null && ea7Var2.g()) {
                    tL_help_getPeerColors.hash = 0;
                }
                getConnectionsManager().sendRequest(tL_help_getPeerColors, new y47(this, (byte) 22));
            }
            if (this.Q4) {
                return;
            }
            ea7 ea7Var3 = this.F3;
            if (ea7Var3 == null || ea7Var3.g() || z) {
                this.Q4 = true;
                TLRPC.TL_help_getPeerProfileColors tL_help_getPeerProfileColors = new TLRPC.TL_help_getPeerProfileColors();
                ea7 ea7Var4 = this.F3;
                tL_help_getPeerProfileColors.hash = ea7Var4 != null ? ea7Var4.b : 0;
                if (ea7Var4 != null && ea7Var4.g()) {
                    tL_help_getPeerProfileColors.hash = 0;
                }
                getConnectionsManager().sendRequest(tL_help_getPeerProfileColors, new y47(this, (byte) 23));
            }
        }
    }

    public final void I0(TLRPC.Chat chat, TLRPC.User user, p8c p8cVar) {
        if (chat == null) {
            p8cVar.a(null);
            return;
        }
        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
        tL_channels_getParticipant.channel = f1(chat.id);
        tL_channels_getParticipant.participant = l1(user);
        getConnectionsManager().sendRequest(tL_channels_getParticipant, new lg1(p8cVar, (byte) 1));
    }

    public final TLRPC.TL_channels_sendAsPeers I1(long j) {
        return J1(j, false);
    }

    public final boolean I2(long j) {
        if (j != 0 && !cf3.B(j) && j != getUserConfig().e()) {
            String str = "dialog_bar_vis3" + j;
            SharedPreferences sharedPreferences = this.W3;
            if (sharedPreferences.getInt(str, 0) == 2 && ls6.v("dialog_bar_report", j, sharedPreferences, false) && !ls6.v("dialog_bar_replied", j, sharedPreferences, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        r0.l(r12);
        r6.delete(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
    
        if (w01.a == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
    
        fa4.b("UPDATES CHANNEL " + r12 + " QUEUE PROCEED - OK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ed, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I3(int i, long j) {
        vf6 vf6Var = this.N0;
        ArrayList arrayList = (ArrayList) vf6Var.f(j);
        if (arrayList == null) {
            return;
        }
        LongSparseIntArray longSparseIntArray = this.P0;
        int i2 = longSparseIntArray.get(j);
        if (!arrayList.isEmpty() && i2 != 0) {
            Collections.sort(arrayList, new el6((byte) 12));
            if (i == 2) {
                longSparseIntArray.put(j, ((TLRPC.Updates) arrayList.get(0)).pts);
            }
            boolean z = false;
            while (true) {
                int size = arrayList.size();
                LongSparseLongArray longSparseLongArray = this.O0;
                if (size > 0) {
                    TLRPC.Updates updates = (TLRPC.Updates) arrayList.get(0);
                    int i3 = updates.pts;
                    boolean z2 = i3 <= i2 ? 2 : updates.pts_count + i2 != i3;
                    if (!z2) {
                        R3(updates, true);
                        if (arrayList.size() <= 0) {
                            break;
                        }
                        arrayList.remove(0);
                        z = true;
                    } else if (!z2) {
                        if (arrayList.size() <= 0) {
                            break;
                        } else {
                            arrayList.remove(0);
                        }
                    } else {
                        long j2 = longSparseLongArray.get(j);
                        if (j2 == 0 || (!z && Math.abs(System.currentTimeMillis() - j2) > 1500)) {
                            if (w01.a) {
                                fa4.b("HOLE IN CHANNEL " + j + " UPDATES QUEUE - getChannelDifference ");
                            }
                            longSparseLongArray.delete(j);
                            vf6Var.l(j);
                            G0(j);
                            return;
                        }
                        if (w01.a) {
                            fa4.b("HOLE IN CHANNEL " + j + " UPDATES QUEUE - will wait more time");
                        }
                        if (z) {
                            longSparseLongArray.put(j, System.currentTimeMillis());
                            return;
                        }
                        return;
                    }
                } else {
                    break;
                }
            }
        } else {
            vf6Var.l(j);
        }
    }

    public final void I4(int i, long j) {
        TLRPC.TL_channels_setBoostsToUnblockRestrictions tL_channels_setBoostsToUnblockRestrictions = new TLRPC.TL_channels_setBoostsToUnblockRestrictions();
        tL_channels_setBoostsToUnblockRestrictions.boosts = i;
        tL_channels_setBoostsToUnblockRestrictions.channel = f1(j);
        getConnectionsManager().sendRequest(tL_channels_setBoostsToUnblockRestrictions, new x47(this, j, (byte) 15));
    }

    public final void J(boolean z) {
        String str;
        boolean z2 = false;
        if (z && this.n2) {
            this.n2 = false;
        }
        if ((z || this.m2 <= getConnectionsManager().getCurrentTime()) && !this.n2) {
            if (this.o2 != 0) {
                getConnectionsManager().cancelRequest(this.o2, true);
                this.o2 = 0;
            }
            SharedPreferences c1 = c1();
            c1.getBoolean("proxy_enabled", false);
            String string = c1.getString("proxy_ip", "");
            String string2 = c1.getString("proxy_secret", "");
            if (this.s2 != 0 && this.t2 == 0 && (str = this.w2) != null) {
                if (!str.equals(string + string2)) {
                    z2 = true;
                }
            }
            int i = this.p2 + 1;
            this.p2 = i;
            this.n2 = true;
            this.o2 = getConnectionsManager().sendRequest(new TLRPC.TL_help_getPromoData(), new ae((Object) this, i, (Object) string, (Object) string2, (byte) 6));
            if (z2) {
                this.s2 = 0L;
                this.w2 = null;
                this.m2 = getConnectionsManager().getCurrentTime() + 3600;
                c1().edit().putLong("proxy_dialog", this.s2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.m2).commit();
                gl.c3(new c87(this, (byte) 16));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p97 J0(long j) {
        p97 p97Var;
        TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations;
        if (this.M4 == null) {
            this.M4 = new HashMap();
        }
        boolean p = getUserConfig().p();
        if (this.M4.containsKey(Long.valueOf(j))) {
            p97Var = (p97) this.M4.get(Long.valueOf(j));
            if (p97Var == null || p97Var.a == p) {
                return p97Var;
            }
        } else {
            p97Var = null;
        }
        if (j > 0) {
            TL_bots.getBotRecommendations getbotrecommendations = new TL_bots.getBotRecommendations();
            getbotrecommendations.bot = m1(j);
            tL_channels_getChannelRecommendations = getbotrecommendations;
        } else {
            TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations2 = new TLRPC.TL_channels_getChannelRecommendations();
            if (j != 0) {
                tL_channels_getChannelRecommendations2.flags |= 1;
                tL_channels_getChannelRecommendations2.channel = f1(-j);
            }
            tL_channels_getChannelRecommendations = tL_channels_getChannelRecommendations2;
        }
        this.M4.put(Long.valueOf(j), null);
        getConnectionsManager().sendRequest(tL_channels_getChannelRecommendations, new hn6(this, p, j, (byte) 1));
        return p97Var;
    }

    public final TLRPC.TL_channels_sendAsPeers J1(long j, boolean z) {
        TLRPC.Chat K0;
        vf6 vf6Var = z ? this.v1 : this.u1;
        ja7 ja7Var = (ja7) vf6Var.f(j);
        if (ja7Var != null) {
            return ja7Var.a;
        }
        if (!z && ((K0 = K0(Long.valueOf(-j))) == null || !hc2.k(K0))) {
            return null;
        }
        ja7 ja7Var2 = new ja7();
        vf6Var.k(ja7Var2, j);
        TLRPC.TL_channels_getSendAs tL_channels_getSendAs = new TLRPC.TL_channels_getSendAs();
        tL_channels_getSendAs.peer = h1(j);
        tL_channels_getSendAs.for_live_stories = z;
        getConnectionsManager().sendRequest(tL_channels_getSendAs, new js0(this, vf6Var, j, ja7Var2, z));
        return null;
    }

    public final TL_account.RequirementToContact J2(long j) {
        if (!getUserConfig().p() && getUserConfig().e() != j) {
            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.R4.f(j);
            if (requirementToContact != null) {
                return requirementToContact;
            }
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 == null || V1.contact_require_premium || V1.send_paid_messages_stars != 0) {
                TLRPC.UserFull W1 = W1(j);
                if (W1 != null) {
                    return l7c.q(W1);
                }
                m1(j);
                this.S4.add(Long.valueOf(j));
                f67 f67Var = this.T4;
                gl.r(f67Var);
                gl.d3(f67Var, 60L);
            }
        }
        return null;
    }

    public final boolean J3(TLRPC.Message message) {
        TLRPC.TL_messageReactions tL_messageReactions;
        if (message == null || cf3.n(message.peer_id) != getUserConfig().e() || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags || tL_messageReactions.results == null) {
            return false;
        }
        long Q1 = k27.Q1(getUserConfig().e(), message);
        boolean z = false;
        for (int i = 0; i < message.reactions.results.size(); i++) {
            if (y5(Q1, h19.d(message.reactions.results.get(i).reaction), false)) {
                z = true;
            }
        }
        return z;
    }

    public final void J4(int i, long j) {
        this.X3.edit().putInt("chatPendingRequests" + j, i).apply();
    }

    public final void K(long j, long j2, SparseBooleanArray sparseBooleanArray) {
        L(j, j2, sparseBooleanArray, false);
    }

    public final TLRPC.Chat K0(Long l) {
        return (TLRPC.Chat) this.b.get(l);
    }

    public final long K1(long j) {
        if (j > 0) {
            if (j == getUserConfig().e()) {
                return 0L;
            }
            TLRPC.UserFull W1 = W1(j);
            if (W1 != null) {
                return W1.send_paid_messages_stars;
            }
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 != null && V1.send_paid_messages_stars > 0) {
                return cf3.j(J2(V1.id));
            }
        } else if (j < 0) {
            long j2 = -j;
            TLRPC.Chat K0 = K0(Long.valueOf(j2));
            if (hc2.N(K0)) {
                return 0L;
            }
            if (hc2.p0(K0) && hc2.A(this.currentAccount, K0, 24)) {
                return 0L;
            }
            TLRPC.ChatFull L0 = L0(j2);
            if (L0 != null) {
                return L0.send_paid_messages_stars;
            }
            if (K0 != null) {
                return K0.send_paid_messages_stars;
            }
        }
        return 0L;
    }

    public final void K3(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2) {
        gl.c3(new lo6((Object) this, (Object) longSparseIntArray, (Object) longSparseIntArray2, (byte) 17));
    }

    public final void K4(boolean z) {
        TL_account.contentSettings contentsettings = this.a5;
        if (contentsettings != null) {
            if (!contentsettings.sensitive_can_change) {
                return;
            } else {
                contentsettings.sensitive_enabled = z;
            }
        }
        if (this.K3 == null) {
            this.K3 = new HashSet();
        }
        Set set = this.K3;
        if (z) {
            set.add("sensitive");
        } else {
            set.remove("sensitive");
        }
        SharedPreferences sharedPreferences = this.X3;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", this.K3).apply();
        }
        TL_account.setContentSettings setcontentsettings = new TL_account.setContentSettings();
        setcontentsettings.sensitive_enabled = z;
        getConnectionsManager().sendRequest(setcontentsettings, new ce2((byte) 2));
    }

    public final void L(final long j, final long j2, final SparseBooleanArray sparseBooleanArray, final boolean z) {
        String str;
        String str2;
        if (z) {
            str = "reaction_mentions";
            str2 = "reaction_mentions_topics";
        } else {
            str = "poll_votes_mentions";
            str2 = "poll_votes_mentions_topics";
        }
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = !z;
        getMessagesStorage().a.c(new Runnable() { // from class: d57
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x025f  */
            /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0256  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                SparseBooleanArray sparseBooleanArray2;
                na7 na7Var;
                int i;
                final long j3;
                long j4;
                int i2;
                final na7 na7Var2;
                long j5;
                int i3;
                int i4;
                SparseBooleanArray sparseBooleanArray3;
                SQLiteCursor queryFinalized;
                final ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                int i5 = 0;
                while (true) {
                    sparseBooleanArray2 = sparseBooleanArray;
                    if (i5 >= sparseBooleanArray2.size()) {
                        break;
                    }
                    int keyAt = sparseBooleanArray2.keyAt(i5);
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(keyAt);
                    i5++;
                }
                SparseBooleanArray sparseBooleanArray4 = new SparseBooleanArray();
                final long j6 = j2;
                na7 na7Var3 = na7.this;
                String str5 = str3;
                final long j7 = j;
                String str6 = str4;
                try {
                    if (j6 == 0) {
                        try {
                            SQLiteDatabase sQLiteDatabase = na7Var3.getMessagesStorage().b;
                            Locale locale = Locale.US;
                            na7Var = na7Var3;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT message_id, state FROM " + str5 + " WHERE message_id IN (" + ((Object) sb) + ") AND dialog_id = " + j7, new Object[0]);
                            i = 0;
                        } catch (SQLiteException e) {
                            e = e;
                            na7Var = na7Var3;
                            i = 0;
                            e.printStackTrace();
                            int i6 = i;
                            int i7 = i6;
                            int i8 = i7;
                            SparseBooleanArray sparseBooleanArray5 = sparseBooleanArray4;
                            while (i < sparseBooleanArray2.size()) {
                            }
                            int i9 = i6;
                            if (z) {
                            }
                            if (z2) {
                            }
                        }
                    } else {
                        na7Var = na7Var3;
                        SQLiteDatabase sQLiteDatabase2 = na7Var.getMessagesStorage().b;
                        Locale locale2 = Locale.US;
                        i = 0;
                        try {
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT message_id, state FROM " + str6 + " WHERE message_id IN (" + ((Object) sb) + ") AND dialog_id = " + j7 + " AND topic_id = " + j6, new Object[0]);
                        } catch (SQLiteException e2) {
                            e = e2;
                            e.printStackTrace();
                            int i62 = i;
                            int i72 = i62;
                            int i82 = i72;
                            SparseBooleanArray sparseBooleanArray52 = sparseBooleanArray4;
                            while (i < sparseBooleanArray2.size()) {
                            }
                            int i92 = i62;
                            if (z) {
                            }
                            if (z2) {
                            }
                        }
                    }
                    while (queryFinalized.next()) {
                        sparseBooleanArray4.put(queryFinalized.intValue(i), queryFinalized.intValue(1) == 1 ? 1 : i);
                    }
                    queryFinalized.dispose();
                } catch (SQLiteException e3) {
                    e = e3;
                }
                int i622 = i;
                int i722 = i622;
                int i822 = i722;
                SparseBooleanArray sparseBooleanArray522 = sparseBooleanArray4;
                while (i < sparseBooleanArray2.size()) {
                    int keyAt2 = sparseBooleanArray2.keyAt(i);
                    boolean valueAt = sparseBooleanArray2.valueAt(i);
                    if (sparseBooleanArray522.indexOfKey(keyAt2) >= 0) {
                        i3 = i622;
                        if (sparseBooleanArray522.get(keyAt2) != valueAt) {
                            i822 += valueAt ? 1 : -1;
                            i722 = 1;
                        }
                    } else {
                        i3 = 1;
                    }
                    if (valueAt) {
                        arrayList.add(Integer.valueOf(keyAt2));
                    }
                    if (j6 == 0) {
                        i4 = i;
                        try {
                            SQLiteDatabase sQLiteDatabase3 = na7Var.getMessagesStorage().b;
                            Locale locale3 = Locale.US;
                            sparseBooleanArray3 = sparseBooleanArray522;
                            try {
                                SQLitePreparedStatement executeFast = sQLiteDatabase3.executeFast("REPLACE INTO " + str5 + " VALUES(?, ?, ?)");
                                executeFast.requery();
                                executeFast.bindInteger(1, keyAt2);
                                executeFast.bindInteger(2, valueAt ? 1 : 0);
                                executeFast.bindLong(3, j7);
                                executeFast.step();
                                executeFast.dispose();
                            } catch (SQLiteException e4) {
                                e = e4;
                                e.printStackTrace();
                                i = i4 + 1;
                                i622 = i3;
                                sparseBooleanArray522 = sparseBooleanArray3;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            sparseBooleanArray3 = sparseBooleanArray522;
                        }
                    } else {
                        i4 = i;
                        sparseBooleanArray3 = sparseBooleanArray522;
                        SQLiteDatabase sQLiteDatabase4 = na7Var.getMessagesStorage().b;
                        Locale locale4 = Locale.US;
                        SQLitePreparedStatement executeFast2 = sQLiteDatabase4.executeFast("REPLACE INTO " + str6 + " VALUES(?, ?, ?, ?)");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, keyAt2);
                        executeFast2.bindInteger(2, valueAt ? 1 : 0);
                        executeFast2.bindLong(3, j7);
                        executeFast2.bindLong(4, j6);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    i = i4 + 1;
                    i622 = i3;
                    sparseBooleanArray522 = sparseBooleanArray3;
                }
                int i922 = i622;
                if (z) {
                    if (i922 == 0) {
                        j3 = j6;
                        j5 = j7;
                        na7Var2 = na7Var;
                        if (i722 != 0) {
                            i2 = i822;
                            b77 b77Var = new b77(na7Var2, j3, j5, i2, arrayList, (byte) 1);
                            arrayList = arrayList;
                            j4 = j5;
                            gl.c3(b77Var);
                        }
                    } else if (j6 == 0) {
                        TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                        na7Var2 = na7Var;
                        tL_inputDialogPeer.peer = na7Var2.h1(j7);
                        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(na7Var2.currentAccount);
                        final byte b = 3;
                        RequestDelegate requestDelegate = new RequestDelegate() { // from class: a77
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (b) {
                                    case 0:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                                            gl.c3(new b77(na7Var2, j7, tL_messages_peerDialogs.dialogs.size() != 0 ? tL_messages_peerDialogs.dialogs.get(0).unread_poll_votes_count : 0, j6, arrayList, (byte) 4));
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (tLObject != null) {
                                            gl.c3(new n57(na7Var2, j7, j6, arrayList));
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                            gl.c3(new b77(na7Var2, j7, j6, tL_messages_forumTopics.topics.size() != 0 ? tL_messages_forumTopics.topics.get(0).unread_poll_votes_count : 0, arrayList, (byte) 6));
                                            break;
                                        }
                                        break;
                                    case 3:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs2 = (TLRPC.TL_messages_peerDialogs) tLObject;
                                            gl.c3(new b77(na7Var2, j7, tL_messages_peerDialogs2.dialogs.size() != 0 ? tL_messages_peerDialogs2.dialogs.get(0).unread_reactions_count : 0, j6, arrayList, (byte) 2));
                                            break;
                                        }
                                        break;
                                    case 4:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                                            gl.c3(new b77(na7Var2, j7, j6, tL_messages_savedDialogs.dialogs.size() != 0 ? tL_messages_savedDialogs.dialogs.get(0).unread_reactions_count : 0, arrayList, (byte) 5));
                                            break;
                                        }
                                        break;
                                    default:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
                                            gl.c3(new b77(na7Var2, j7, j6, tL_messages_forumTopics2.topics.size() != 0 ? tL_messages_forumTopics2.topics.get(0).unread_reactions_count : 0, arrayList, (byte) 3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        arrayList = arrayList;
                        j5 = j7;
                        j3 = j6;
                        connectionsManager.sendRequest(tL_messages_getPeerDialogs, requestDelegate);
                    } else {
                        na7Var2 = na7Var;
                        if (na7Var2.x2(j7)) {
                            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
                            tL_messages_getSavedDialogsByID.ids.add(na7Var2.h1(j6));
                            tL_messages_getSavedDialogsByID.parent_peer = na7Var2.h1(j7);
                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(na7Var2.currentAccount);
                            final byte b2 = 4;
                            RequestDelegate requestDelegate2 = new RequestDelegate() { // from class: a77
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (b2) {
                                        case 0:
                                            if (tLObject != null) {
                                                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                                                gl.c3(new b77(na7Var2, j7, tL_messages_peerDialogs.dialogs.size() != 0 ? tL_messages_peerDialogs.dialogs.get(0).unread_poll_votes_count : 0, j6, arrayList, (byte) 4));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            if (tLObject != null) {
                                                gl.c3(new n57(na7Var2, j7, j6, arrayList));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            if (tLObject != null) {
                                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                                gl.c3(new b77(na7Var2, j7, j6, tL_messages_forumTopics.topics.size() != 0 ? tL_messages_forumTopics.topics.get(0).unread_poll_votes_count : 0, arrayList, (byte) 6));
                                                break;
                                            }
                                            break;
                                        case 3:
                                            if (tLObject != null) {
                                                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs2 = (TLRPC.TL_messages_peerDialogs) tLObject;
                                                gl.c3(new b77(na7Var2, j7, tL_messages_peerDialogs2.dialogs.size() != 0 ? tL_messages_peerDialogs2.dialogs.get(0).unread_reactions_count : 0, j6, arrayList, (byte) 2));
                                                break;
                                            }
                                            break;
                                        case 4:
                                            if (tLObject != null) {
                                                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                                                gl.c3(new b77(na7Var2, j7, j6, tL_messages_savedDialogs.dialogs.size() != 0 ? tL_messages_savedDialogs.dialogs.get(0).unread_reactions_count : 0, arrayList, (byte) 5));
                                                break;
                                            }
                                            break;
                                        default:
                                            if (tLObject != null) {
                                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
                                                gl.c3(new b77(na7Var2, j7, j6, tL_messages_forumTopics2.topics.size() != 0 ? tL_messages_forumTopics2.topics.get(0).unread_reactions_count : 0, arrayList, (byte) 3));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            arrayList = arrayList;
                            j5 = j7;
                            j3 = j6;
                            connectionsManager2.sendRequest(tL_messages_getSavedDialogsByID, requestDelegate2);
                        } else {
                            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
                            tL_messages_getForumTopicsByID.topics.add(Integer.valueOf((int) j6));
                            tL_messages_getForumTopicsByID.peer = na7Var2.getMessagesController().h1(j7);
                            ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(na7Var2.currentAccount);
                            final byte b3 = 5;
                            RequestDelegate requestDelegate3 = new RequestDelegate() { // from class: a77
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (b3) {
                                        case 0:
                                            if (tLObject != null) {
                                                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                                                gl.c3(new b77(na7Var2, j7, tL_messages_peerDialogs.dialogs.size() != 0 ? tL_messages_peerDialogs.dialogs.get(0).unread_poll_votes_count : 0, j6, arrayList, (byte) 4));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            if (tLObject != null) {
                                                gl.c3(new n57(na7Var2, j7, j6, arrayList));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            if (tLObject != null) {
                                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                                gl.c3(new b77(na7Var2, j7, j6, tL_messages_forumTopics.topics.size() != 0 ? tL_messages_forumTopics.topics.get(0).unread_poll_votes_count : 0, arrayList, (byte) 6));
                                                break;
                                            }
                                            break;
                                        case 3:
                                            if (tLObject != null) {
                                                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs2 = (TLRPC.TL_messages_peerDialogs) tLObject;
                                                gl.c3(new b77(na7Var2, j7, tL_messages_peerDialogs2.dialogs.size() != 0 ? tL_messages_peerDialogs2.dialogs.get(0).unread_reactions_count : 0, j6, arrayList, (byte) 2));
                                                break;
                                            }
                                            break;
                                        case 4:
                                            if (tLObject != null) {
                                                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                                                gl.c3(new b77(na7Var2, j7, j6, tL_messages_savedDialogs.dialogs.size() != 0 ? tL_messages_savedDialogs.dialogs.get(0).unread_reactions_count : 0, arrayList, (byte) 5));
                                                break;
                                            }
                                            break;
                                        default:
                                            if (tLObject != null) {
                                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
                                                gl.c3(new b77(na7Var2, j7, j6, tL_messages_forumTopics2.topics.size() != 0 ? tL_messages_forumTopics2.topics.get(0).unread_reactions_count : 0, arrayList, (byte) 3));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            arrayList = arrayList;
                            j5 = j7;
                            j3 = j6;
                            connectionsManager3.sendRequest(tL_messages_getForumTopicsByID, requestDelegate3);
                        }
                    }
                    j4 = j5;
                    i2 = i822;
                } else {
                    j3 = j6;
                    j4 = j7;
                    i2 = i822;
                    na7Var2 = na7Var;
                }
                if (z2) {
                    if (i922 == 0) {
                        if (i722 != 0) {
                            gl.c3(new b77(na7Var2, j3, j4, i2, arrayList, (byte) 0));
                            return;
                        }
                        return;
                    }
                    if (j6 == 0) {
                        TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs2 = new TLRPC.TL_messages_getPeerDialogs();
                        TLRPC.TL_inputDialogPeer tL_inputDialogPeer2 = new TLRPC.TL_inputDialogPeer();
                        tL_inputDialogPeer2.peer = na7Var2.h1(j4);
                        tL_messages_getPeerDialogs2.peers.add(tL_inputDialogPeer2);
                        final byte b4 = 0;
                        final na7 na7Var4 = na7Var2;
                        final long j8 = j4;
                        ConnectionsManager.getInstance(na7Var2.currentAccount).sendRequest(tL_messages_getPeerDialogs2, new RequestDelegate() { // from class: a77
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (b4) {
                                    case 0:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                                            gl.c3(new b77(na7Var4, j8, tL_messages_peerDialogs.dialogs.size() != 0 ? tL_messages_peerDialogs.dialogs.get(0).unread_poll_votes_count : 0, j3, arrayList, (byte) 4));
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (tLObject != null) {
                                            gl.c3(new n57(na7Var4, j8, j3, arrayList));
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                            gl.c3(new b77(na7Var4, j8, j3, tL_messages_forumTopics.topics.size() != 0 ? tL_messages_forumTopics.topics.get(0).unread_poll_votes_count : 0, arrayList, (byte) 6));
                                            break;
                                        }
                                        break;
                                    case 3:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs2 = (TLRPC.TL_messages_peerDialogs) tLObject;
                                            gl.c3(new b77(na7Var4, j8, tL_messages_peerDialogs2.dialogs.size() != 0 ? tL_messages_peerDialogs2.dialogs.get(0).unread_reactions_count : 0, j3, arrayList, (byte) 2));
                                            break;
                                        }
                                        break;
                                    case 4:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                                            gl.c3(new b77(na7Var4, j8, j3, tL_messages_savedDialogs.dialogs.size() != 0 ? tL_messages_savedDialogs.dialogs.get(0).unread_reactions_count : 0, arrayList, (byte) 5));
                                            break;
                                        }
                                        break;
                                    default:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
                                            gl.c3(new b77(na7Var4, j8, j3, tL_messages_forumTopics2.topics.size() != 0 ? tL_messages_forumTopics2.topics.get(0).unread_reactions_count : 0, arrayList, (byte) 3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    final long j9 = j4;
                    if (na7Var2.x2(j9)) {
                        TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID2 = new TLRPC.TL_messages_getSavedDialogsByID();
                        tL_messages_getSavedDialogsByID2.ids.add(na7Var2.h1(j3));
                        tL_messages_getSavedDialogsByID2.parent_peer = na7Var2.h1(j9);
                        final na7 na7Var5 = na7Var2;
                        final byte b5 = 1;
                        ConnectionsManager.getInstance(na7Var2.currentAccount).sendRequest(tL_messages_getSavedDialogsByID2, new RequestDelegate() { // from class: a77
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (b5) {
                                    case 0:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                                            gl.c3(new b77(na7Var5, j9, tL_messages_peerDialogs.dialogs.size() != 0 ? tL_messages_peerDialogs.dialogs.get(0).unread_poll_votes_count : 0, j3, arrayList, (byte) 4));
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (tLObject != null) {
                                            gl.c3(new n57(na7Var5, j9, j3, arrayList));
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                            gl.c3(new b77(na7Var5, j9, j3, tL_messages_forumTopics.topics.size() != 0 ? tL_messages_forumTopics.topics.get(0).unread_poll_votes_count : 0, arrayList, (byte) 6));
                                            break;
                                        }
                                        break;
                                    case 3:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs2 = (TLRPC.TL_messages_peerDialogs) tLObject;
                                            gl.c3(new b77(na7Var5, j9, tL_messages_peerDialogs2.dialogs.size() != 0 ? tL_messages_peerDialogs2.dialogs.get(0).unread_reactions_count : 0, j3, arrayList, (byte) 2));
                                            break;
                                        }
                                        break;
                                    case 4:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                                            gl.c3(new b77(na7Var5, j9, j3, tL_messages_savedDialogs.dialogs.size() != 0 ? tL_messages_savedDialogs.dialogs.get(0).unread_reactions_count : 0, arrayList, (byte) 5));
                                            break;
                                        }
                                        break;
                                    default:
                                        if (tLObject != null) {
                                            TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
                                            gl.c3(new b77(na7Var5, j9, j3, tL_messages_forumTopics2.topics.size() != 0 ? tL_messages_forumTopics2.topics.get(0).unread_reactions_count : 0, arrayList, (byte) 3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
                    tL_messages_getForumTopicsByID2.topics.add(Integer.valueOf((int) j3));
                    tL_messages_getForumTopicsByID2.peer = na7Var2.getMessagesController().h1(j9);
                    final na7 na7Var6 = na7Var2;
                    final byte b6 = 2;
                    ConnectionsManager.getInstance(na7Var2.currentAccount).sendRequest(tL_messages_getForumTopicsByID2, new RequestDelegate() { // from class: a77
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (b6) {
                                case 0:
                                    if (tLObject != null) {
                                        TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                                        gl.c3(new b77(na7Var6, j9, tL_messages_peerDialogs.dialogs.size() != 0 ? tL_messages_peerDialogs.dialogs.get(0).unread_poll_votes_count : 0, j3, arrayList, (byte) 4));
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (tLObject != null) {
                                        gl.c3(new n57(na7Var6, j9, j3, arrayList));
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (tLObject != null) {
                                        TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                        gl.c3(new b77(na7Var6, j9, j3, tL_messages_forumTopics.topics.size() != 0 ? tL_messages_forumTopics.topics.get(0).unread_poll_votes_count : 0, arrayList, (byte) 6));
                                        break;
                                    }
                                    break;
                                case 3:
                                    if (tLObject != null) {
                                        TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs2 = (TLRPC.TL_messages_peerDialogs) tLObject;
                                        gl.c3(new b77(na7Var6, j9, tL_messages_peerDialogs2.dialogs.size() != 0 ? tL_messages_peerDialogs2.dialogs.get(0).unread_reactions_count : 0, j3, arrayList, (byte) 2));
                                        break;
                                    }
                                    break;
                                case 4:
                                    if (tLObject != null) {
                                        TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                                        gl.c3(new b77(na7Var6, j9, j3, tL_messages_savedDialogs.dialogs.size() != 0 ? tL_messages_savedDialogs.dialogs.get(0).unread_reactions_count : 0, arrayList, (byte) 5));
                                        break;
                                    }
                                    break;
                                default:
                                    if (tLObject != null) {
                                        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
                                        gl.c3(new b77(na7Var6, j9, j3, tL_messages_forumTopics2.topics.size() != 0 ? tL_messages_forumTopics2.topics.get(0).unread_reactions_count : 0, arrayList, (byte) 3));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        });
    }

    public final TLRPC.ChatFull L0(long j) {
        return (TLRPC.ChatFull) this.c1.f(j);
    }

    public final ka7 L1(long j) {
        vf6 vf6Var = this.t1;
        ka7 ka7Var = (ka7) vf6Var.f(j);
        if (ka7Var != null && (ka7Var.d || Math.abs(SystemClock.elapsedRealtime() - ka7Var.c) <= 300000)) {
            return ka7Var;
        }
        if (j >= 0 ? !l7c.v(V1(Long.valueOf(j))) : !hc2.T(K0(Long.valueOf(-j)))) {
            return null;
        }
        ka7 ka7Var2 = new ka7();
        ka7Var2.d = true;
        vf6Var.k(ka7Var2, j);
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = h1(j);
        getConnectionsManager().sendRequest(tL_messages_getSponsoredMessages, new w47((Object) this, j, (Object) ka7Var2, (byte) 0));
        return null;
    }

    public final boolean L2(boolean z) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings == null) {
            return false;
        }
        return (z ? tL_webBrowserSettings.external_exceptions : tL_webBrowserSettings.inapp_exceptions).size() >= (getConnectionsManager().isTestBackend() ? 5 : 100);
    }

    public final void L3(long j, TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants) {
        vf6 vf6Var = new vf6(tL_channels_channelParticipants.participants.size());
        boolean z = false;
        for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
            TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
            vf6Var.k(channelParticipant, k27.B1(channelParticipant.peer));
        }
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new go6((Object) messagesStorage, j, (Object) vf6Var, (byte) 12));
        gl.c3(new b61((Object) this, j, (Object) vf6Var, z, (byte) 5));
    }

    public final void L4(long j, int i, ArrayList arrayList, int i2, Boolean bool, v72 v72Var, u72 u72Var) {
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        tL_messages_setChatAvailableReactions.peer = h1(-j);
        if (i == 2 || arrayList.isEmpty()) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        } else if (i == 0) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsAll();
        } else {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = new TLRPC.TL_chatReactionsSome();
            tL_messages_setChatAvailableReactions.available_reactions = tL_chatReactionsSome;
            tL_chatReactionsSome.reactions.addAll(arrayList);
        }
        if (bool != null) {
            tL_messages_setChatAvailableReactions.flags |= 2;
            tL_messages_setChatAvailableReactions.paid_enabled = bool.booleanValue();
        }
        tL_messages_setChatAvailableReactions.flags |= 1;
        tL_messages_setChatAvailableReactions.reactions_limit = i2;
        getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new yq2(this, j, tL_messages_setChatAvailableReactions, u72Var, v72Var, (byte) 1));
        TLRPC.ChatFull L0 = L0(j);
        if (L0 != null) {
            if (L0 instanceof TLRPC.TL_channelFull) {
                L0.flags2 |= TLObject.FLAG_13;
            } else {
                L0.flags |= TLObject.FLAG_20;
            }
            L0.reactions_limit = i2;
            if (bool != null) {
                L0.paid_reactions_available = bool.booleanValue();
            }
            getMessagesStorage().K1(L0, false);
        }
    }

    public final void M() {
        qu2 contactsController = getContactsController();
        contactsController.Z.clear();
        contactsController.a0.clear();
        contactsController.b0.clear();
        contactsController.f0.clear();
        contactsController.g0.clear();
        contactsController.h0.clear();
        contactsController.j0.clear();
        contactsController.i0.clear();
        contactsController.k0.clear();
        contactsController.x.clear();
        contactsController.l0.clear();
        contactsController.m0.clear();
        contactsController.c0.clear();
        contactsController.d0.clear();
        contactsController.e0.clear();
        contactsController.b = false;
        contactsController.e = false;
        contactsController.n = false;
        contactsController.h = false;
        contactsController.r = false;
        contactsController.w = "";
        contactsController.G = (byte) 0;
        contactsController.H = (byte) 0;
        contactsController.I = 0;
        Arrays.fill(contactsController.J, 0);
        contactsController.K = null;
        contactsController.L = null;
        contactsController.M = null;
        contactsController.N = null;
        contactsController.O = null;
        contactsController.P = null;
        contactsController.Q = null;
        contactsController.V = null;
        contactsController.W = null;
        contactsController.R = null;
        contactsController.S = null;
        byte b = 4;
        Utilities.e.c(new wt2(contactsController, b));
        MediaController.w().j();
        im7 notificationsController = getNotificationsController();
        notificationsController.w.clear();
        notificationsController.x.clear();
        notificationsController.R = false;
        im7.l0.c(new wl7(notificationsController, b));
        z3a sendMessagesHelper = getSendMessagesHelper();
        sendMessagesHelper.a.clear();
        sendMessagesHelper.b.clear();
        sendMessagesHelper.c.clear();
        sendMessagesHelper.d.clear();
        sendMessagesHelper.f.b();
        sendMessagesHelper.e.clear();
        sendMessagesHelper.h.b();
        sendMessagesHelper.n.clear();
        sendMessagesHelper.r.clear();
        sendMessagesHelper.w.clear();
        sendMessagesHelper.y.clear();
        sendMessagesHelper.E.b();
        sendMessagesHelper.F.clear();
        sendMessagesHelper.G.clear();
        sendMessagesHelper.H.n();
        bu9 secretChatHelper = getSecretChatHelper();
        secretChatHelper.a.clear();
        secretChatHelper.e.clear();
        secretChatHelper.b.clear();
        secretChatHelper.c.clear();
        secretChatHelper.d.clear();
        secretChatHelper.f.clear();
        secretChatHelper.h.clear();
        secretChatHelper.n = false;
        eb6 locationController = getLocationController();
        locationController.J.clear();
        locationController.K.b();
        locationController.c.b();
        locationController.H.b();
        locationController.d.b();
        eb6.s();
        Utilities.d.c(new va6(locationController, (byte) 2));
        hq6 mediaDataController = getMediaDataController();
        int i = 0;
        while (true) {
            ArrayList[] arrayListArr = mediaDataController.g0;
            if (i >= arrayListArr.length) {
                break;
            }
            ArrayList arrayList = arrayListArr[i];
            if (arrayList != null) {
                arrayList.clear();
            }
            mediaDataController.h0[i] = false;
            mediaDataController.i0[i] = false;
            i++;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            mediaDataController.Y[i2] = 0;
            mediaDataController.Z[i2] = 0;
            mediaDataController.H[i2].clear();
            mediaDataController.W[i2] = false;
            mediaDataController.X[i2] = false;
        }
        mediaDataController.q1.b();
        int[] iArr = mediaDataController.r0;
        iArr[0] = 0;
        long[] jArr = mediaDataController.q0;
        jArr[0] = 0;
        byte b2 = 1;
        iArr[1] = 0;
        jArr[1] = 0;
        mediaDataController.e0.clear();
        mediaDataController.f0.clear();
        mediaDataController.d0.b();
        mediaDataController.u0[0].b();
        mediaDataController.t0[0].clear();
        mediaDataController.u0[1].b();
        mediaDataController.t0[1].clear();
        mediaDataController.v0[0].clear();
        mediaDataController.v0[1].clear();
        mediaDataController.j0.clear();
        mediaDataController.J.b();
        mediaDataController.K.b();
        mediaDataController.O.clear();
        mediaDataController.R.clear();
        mediaDataController.S.b();
        mediaDataController.T.clear();
        boolean[] zArr = mediaDataController.x0;
        zArr[0] = false;
        boolean[] zArr2 = mediaDataController.y0;
        zArr2[0] = false;
        zArr[1] = false;
        zArr2[1] = false;
        mediaDataController.k0 = false;
        mediaDataController.l0 = false;
        mediaDataController.C1.clear();
        if (Build.VERSION.SDK_INT >= 25) {
            Utilities.e.c(new am6(b2));
        }
        mediaDataController.b0.clear();
        mediaDataController.o1 = false;
        mediaDataController.n1 = false;
        mediaDataController.j1.clear();
        mediaDataController.k1.clear();
        mediaDataController.l1.clear();
        mediaDataController.m1.clear();
        gl.c3(new un6(mediaDataController, (byte) 6));
        mediaDataController.u1.b();
        mediaDataController.v1.b();
        mediaDataController.w1.edit().clear().apply();
        mediaDataController.r1.b();
        mediaDataController.k().edit().clear().apply();
        mediaDataController.y1.clear();
        mediaDataController.A1.clear();
        mediaDataController.B1.b();
        getColorPalette().a();
        this.i4.h();
        D1().a();
        c cVar = c.R[this.currentAccount];
        if (cVar != null) {
            g15.A(cVar.M);
            cVar.J.clear();
            cVar.Q.clear();
            WalletEngine2 walletEngine2 = cVar.b;
            if (walletEngine2 != null) {
                walletEngine2.close();
                cVar.b = null;
                cVar.d = null;
            }
            t05 t05Var = cVar.o;
            if (t05Var != null) {
                t05Var.b();
            }
            int i3 = cVar.a;
            if (cVar.C >= 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(cVar.C, true);
                cVar.C = -1;
            }
            if (cVar.D >= 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(cVar.D, true);
                cVar.D = -1;
            }
            if (cVar.E >= 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(cVar.E, true);
                cVar.E = -1;
            }
            cVar.p0();
            cVar.G.clear();
            p15 p15Var = cVar.t;
            if (p15Var != null) {
                p15Var.h();
                cVar.t = null;
            }
            gl.r(cVar.H);
            gl.r(cVar.I);
            synchronized (c.class) {
                if (c.R[cVar.a] == cVar) {
                    c.R[cVar.a] = null;
                }
            }
        }
        g2b g2bVar = this.e0;
        if (g2bVar != null) {
            g2bVar.p();
        }
        v4c v4cVar = this.g0;
        if (v4cVar != null) {
            v4cVar.a();
        }
        this.n3 = false;
        cj3.D4[this.currentAccount] = false;
        this.W3.edit().clear().commit();
        this.Y3.edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).putLong("lastStickersLoadTimeMask", 0L).putLong("lastStickersLoadTimeFavs", 0L).commit();
        ls6.i(this.X3.edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("gifhint"), "reminderhint", "soundHint", "dcDomainName2", "webFileDatacenterId").remove("themehint").remove("showFiltersTooltip").remove("transcribeButtonPressed").commit();
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor editor = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        AppWidgetManager appWidgetManager = null;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("account") && ((Integer) entry.getValue()).intValue() == this.currentAccount) {
                Integer z = Utilities.z(key);
                int intValue = z.intValue();
                if (editor == null) {
                    editor = sharedPreferences.edit();
                    appWidgetManager = AppWidgetManager.getInstance(a.b);
                }
                editor.putBoolean("deleted" + intValue, true);
                if (sharedPreferences.getInt(TeXSymbolParser.TYPE_ATTR + intValue, 0) == 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(z);
                } else {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(z);
                }
            }
        }
        if (editor != null) {
            editor.commit();
        }
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                ChatsWidgetProvider.a(a.b, appWidgetManager, ((Integer) arrayList2.get(i4)).intValue());
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ContactsWidgetProvider.a(a.b, appWidgetManager, ((Integer) arrayList3.get(i5)).intValue());
            }
        }
        this.C1.b();
        this.D1.b();
        this.E1.b();
        this.F1.b();
        this.G1.b();
        this.w1.clear();
        this.x1.b();
        this.y1.clear();
        this.z1.b();
        this.A1.clear();
        this.B1.b();
        this.t1.b();
        this.u1.b();
        this.v1.b();
        this.R.b();
        this.P.clear();
        this.h2.clear();
        this.Q.clear();
        this.r.b();
        this.b1.b();
        this.c1.b();
        this.h.clear();
        this.m1.clear();
        this.e1.b();
        this.w.clear();
        this.x.b();
        this.G4.clear();
        this.F4.clear();
        this.I4.b();
        this.H4.clear();
        this.n.clear();
        this.s1.clear();
        this.A0.b();
        this.B0.b();
        this.C0 = 0;
        this.F.clear();
        this.E.clear();
        this.p4.clear();
        this.o4.clear();
        this.y.clear();
        this.O = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.G.clear();
        this.H.clear();
        this.I.clear();
        this.J.clear();
        this.M.clear();
        this.K.clear();
        this.L.clear();
        this.V.clear();
        this.T.b();
        this.q1.b();
        this.r1.clear();
        this.d.clear();
        this.e.clear();
        this.L2 = null;
        this.R4.b();
        this.S4.clear();
        this.b.clear();
        this.S.b();
        this.U.clear();
        this.W.clear();
        this.X.b();
        this.Y.b();
        this.a0.clear();
        this.k0.b();
        this.u0.b();
        this.v0.b();
        this.c0 = 0;
        t97[] t97VarArr = this.N;
        t97VarArr[1] = null;
        t97VarArr[0] = null;
        this.G0.clear();
        this.J0.clear();
        this.K0 = false;
        this.M0.clear();
        this.L0 = false;
        this.Z3 = false;
        Utilities.d.c(new c87(this, (byte) 13));
        this.n0.clear();
        this.o0.clear();
        this.p0.clear();
        this.x0.clear();
        int i6 = 0;
        while (true) {
            vf6[] vf6VarArr = this.Z;
            if (i6 >= vf6VarArr.length) {
                break;
            }
            vf6 vf6Var = vf6VarArr[i6];
            if (vf6Var != null) {
                vf6Var.b();
            }
            i6++;
        }
        this.h1.clear();
        this.i1.clear();
        this.j1.clear();
        this.H1.b();
        this.l1.clear();
        this.n1.clear();
        this.o1.clear();
        this.p1.clear();
        this.R1 = false;
        this.S1.clear();
        this.T1.clear();
        this.U1.clear();
        this.V1.clear();
        this.x2 = false;
        this.y2 = 0;
        this.m2 = 0;
        this.n2 = false;
        this.W1 = false;
        this.N1 = 0;
        this.O1 = null;
        this.P1 = null;
        this.M1 = false;
        this.w0 = false;
        this.y0 = -1;
        this.z0 = false;
        this.b2 = false;
        this.a2 = false;
        this.e2 = false;
        this.C2 = 0L;
        this.F2 = false;
        this.c2 = false;
        this.Z1 = true;
        this.G2 = null;
        this.J2 = null;
        this.K2 = null;
        this.I2.clear();
        this.R0.b();
        this.D2 = 0;
        this.E2 = (byte) 0;
        Utilities.d.c(new c87(this, (byte) 14));
        if (this.Q1 != null) {
            Utilities.d.a(this.Q1);
            this.Q1 = null;
        }
        h();
        gl.c3(new c87(this, (byte) 15));
    }

    public final int M0(long j) {
        TLRPC.ChatFull L0 = q1(this.currentAccount).L0(-j);
        return (L0 == null || (!(L0 instanceof TLRPC.TL_chatFull) ? (L0.flags2 & TLObject.FLAG_13) != 0 : (L0.flags & TLObject.FLAG_20) != 0)) ? this.k4.j3.f() : L0.reactions_limit;
    }

    public final g2b M1() {
        g2b g2bVar = this.e0;
        if (g2bVar != null) {
            return g2bVar;
        }
        synchronized (t5[this.currentAccount]) {
            g2b g2bVar2 = this.e0;
            if (g2bVar2 != null) {
                return g2bVar2;
            }
            g2b g2bVar3 = new g2b(this.currentAccount);
            this.e0 = g2bVar3;
            return g2bVar3;
        }
    }

    public final boolean M2() {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        return (tL_webBrowserSettings == null || tL_webBrowserSettings.open_external_browser) ? false : true;
    }

    public final void M3(final TLRPC.messages_Dialogs messages_dialogs, final ArrayList arrayList, final ArrayList arrayList2, final int i, final int i2, final int i3, final int i4, final boolean z, final boolean z2, final boolean z3) {
        Utilities.d.c(new Runnable() { // from class: g77
            /* JADX WARN: Code restructure failed: missing block: B:136:0x03be, code lost:
            
                if (r8 == r5.id) goto L160;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x015a, code lost:
            
                if (r7 == (-r4.id)) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
            
                if (r4.migrated_to != null) goto L58;
             */
            /* JADX WARN: Removed duplicated region for block: B:143:0x0407  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x0431  */
            /* JADX WARN: Removed duplicated region for block: B:157:0x045d  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x041d  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0196  */
            /* JADX WARN: Type inference failed for: r15v1 */
            /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r15v4 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                ArrayList arrayList3;
                SparseArray sparseArray;
                TLRPC.messages_Dialogs messages_dialogs2;
                vf6 vf6Var;
                ConcurrentHashMap concurrentHashMap;
                byte b;
                boolean z4;
                byte b2;
                ArrayList arrayList4;
                ?? r15;
                vf6 vf6Var2;
                vf6 vf6Var3;
                vf6 vf6Var4;
                TLRPC.Message message;
                vf6 vf6Var5;
                vf6 vf6Var6;
                vf6 vf6Var7;
                ConcurrentHashMap concurrentHashMap2;
                vf6 vf6Var8;
                ConcurrentHashMap concurrentHashMap3;
                ArrayList arrayList5;
                int i5;
                byte b3;
                ConcurrentHashMap concurrentHashMap4;
                ConcurrentHashMap concurrentHashMap5;
                byte b4;
                vf6 vf6Var9;
                vf6 vf6Var10;
                vf6 vf6Var11;
                vf6 vf6Var12;
                boolean z5;
                TLRPC.Chat chat;
                Integer num;
                Integer num2;
                TLRPC.Message message2;
                int i6;
                int i7;
                int i8;
                TLRPC.messages_Dialogs messages_dialogs3;
                int i9;
                vf6 vf6Var13;
                ConcurrentHashMap concurrentHashMap6;
                byte b5;
                int i10;
                long j;
                long j2;
                long j3;
                long j4;
                int i11;
                long j5;
                vf6 vf6Var14;
                ArrayList arrayList6;
                final na7 na7Var = na7.this;
                final int i12 = i;
                byte b6 = i4;
                final TLRPC.messages_Dialogs messages_dialogs4 = messages_dialogs;
                ArrayList arrayList7 = arrayList2;
                final boolean z6 = z;
                final byte b7 = i3;
                ArrayList arrayList8 = arrayList;
                final int i13 = i2;
                boolean z7 = z3;
                final boolean z8 = z2;
                ConcurrentHashMap concurrentHashMap7 = na7Var.Q;
                ConcurrentHashMap concurrentHashMap8 = na7Var.P;
                boolean z9 = na7Var.B4;
                if (na7Var.b2) {
                    arrayList3 = arrayList7;
                } else {
                    arrayList3 = arrayList7;
                    Utilities.d.c(new b57(na7Var, null, null, (byte) 2));
                    na7Var.b2 = true;
                }
                if (w01.a) {
                    StringBuilder p = ir2.p("loaded folderId ", i12, " loadType ", b6, " count ");
                    p.append(messages_dialogs4.dialogs.size());
                    fa4.b(p.toString());
                }
                final long[] g = na7Var.getUserConfig().g(i12);
                if (b6 == z9 && messages_dialogs4.dialogs.size() == 0) {
                    final ArrayList arrayList9 = arrayList3;
                    gl.c3(new Runnable() { // from class: u77
                        @Override // java.lang.Runnable
                        public final void run() {
                            na7 na7Var2 = na7.this;
                            SparseBooleanArray sparseBooleanArray = na7Var2.V1;
                            SparseBooleanArray sparseBooleanArray2 = na7Var2.U1;
                            na7Var2.b4(messages_dialogs4.users, true);
                            ArrayList arrayList10 = arrayList9;
                            if (arrayList10 != null) {
                                for (int i14 = 0; i14 < arrayList10.size(); i14++) {
                                    long j6 = ((TLRPC.UserFull) arrayList10.get(i14)).id;
                                    na7Var2.b1.k((TLRPC.UserFull) arrayList10.get(i14), j6);
                                    na7Var2.i4.M(j6);
                                }
                            }
                            SparseBooleanArray sparseBooleanArray3 = na7Var2.T1;
                            int i15 = i12;
                            sparseBooleanArray3.put(i15, false);
                            if (z6) {
                                sparseBooleanArray2.put(i15, false);
                                sparseBooleanArray.put(i15, false);
                            } else if (g[0] == 2147483647L) {
                                if (i15 == 0) {
                                    na7Var2.O = TLObject.FLAG_31;
                                }
                                sparseBooleanArray2.put(i15, true);
                                sparseBooleanArray.put(i15, true);
                            } else {
                                na7Var2.X2(i15, 0, b7, false, null);
                            }
                            na7Var2.getNotificationCenter().k(kk7.r, new Object[0]);
                        }
                    });
                    return;
                }
                long[] jArr = g;
                vf6 vf6Var15 = new vf6();
                vf6 vf6Var16 = new vf6();
                vf6 vf6Var17 = new vf6();
                vf6 vf6Var18 = new vf6();
                int i14 = 0;
                while (i14 < messages_dialogs4.users.size()) {
                    TLRPC.User user = messages_dialogs4.users.get(i14);
                    vf6Var17.k(user, user.id);
                    i14++;
                    z7 = z7;
                    concurrentHashMap7 = concurrentHashMap7;
                }
                final boolean z10 = z7;
                ConcurrentHashMap concurrentHashMap9 = concurrentHashMap7;
                int i15 = 0;
                vf6 vf6Var19 = vf6Var17;
                while (i15 < messages_dialogs4.chats.size()) {
                    TLRPC.Chat chat2 = messages_dialogs4.chats.get(i15);
                    vf6Var18.k(chat2, chat2.id);
                    i15++;
                    jArr = jArr;
                    vf6Var19 = vf6Var19;
                }
                long[] jArr2 = jArr;
                vf6 vf6Var20 = vf6Var19;
                if (arrayList8 != null) {
                    sparseArray = new SparseArray();
                    int size = arrayList8.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) arrayList8.get(i16);
                        sparseArray.put(encryptedChat.id, encryptedChat);
                    }
                } else {
                    sparseArray = null;
                }
                if (b6 == z9) {
                    na7Var.S1.put(i12, i13 + b7);
                }
                ArrayList arrayList10 = new ArrayList();
                int i17 = 0;
                TLRPC.Message message3 = null;
                vf6 vf6Var21 = vf6Var18;
                while (i17 < messages_dialogs4.messages.size()) {
                    TLRPC.Message message4 = messages_dialogs4.messages.get(i17);
                    vf6 vf6Var22 = vf6Var15;
                    int i18 = message4.date;
                    int i19 = i17;
                    if (i18 == 0) {
                        vf6Var14 = vf6Var21;
                    } else {
                        if (message3 == null || i18 < message3.date) {
                            message3 = message4;
                        }
                        TLRPC.Peer peer = message4.peer_id;
                        TLRPC.Message message5 = message3;
                        long j6 = peer.channel_id;
                        if (j6 != 0) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) vf6Var21.f(j6);
                            if (chat3 != null && chat3.left) {
                                long j7 = na7Var.s2;
                                if (j7 != 0) {
                                }
                                vf6Var14 = vf6Var21;
                            }
                            vf6Var14 = vf6Var21;
                            k27 k27Var = new k27(na7Var.currentAccount, message4, vf6Var20, vf6Var14, false, false);
                            arrayList10.add(k27Var);
                            long B0 = k27.B0(k27Var.k);
                            arrayList6 = (ArrayList) vf6Var16.f(B0);
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList(1);
                            }
                            arrayList6.add(k27Var);
                            vf6Var16.k(arrayList6, B0);
                        } else {
                            long j8 = peer.chat_id;
                            if (j8 != 0) {
                                TLRPC.Chat chat4 = (TLRPC.Chat) vf6Var21.f(j8);
                                if (chat4 != null) {
                                }
                            }
                            vf6Var14 = vf6Var21;
                            k27 k27Var2 = new k27(na7Var.currentAccount, message4, vf6Var20, vf6Var14, false, false);
                            arrayList10.add(k27Var2);
                            long B02 = k27.B0(k27Var2.k);
                            arrayList6 = (ArrayList) vf6Var16.f(B02);
                            if (arrayList6 == null) {
                            }
                            arrayList6.add(k27Var2);
                            vf6Var16.k(arrayList6, B02);
                        }
                        message3 = message5;
                    }
                    i17 = i19 + 1;
                    vf6Var21 = vf6Var14;
                    vf6Var15 = vf6Var22;
                }
                vf6 vf6Var23 = vf6Var15;
                vf6 vf6Var24 = vf6Var21;
                if (z10 || z8 || jArr2[0] == -1 || b6 != 0) {
                    messages_dialogs2 = messages_dialogs4;
                    vf6Var = vf6Var16;
                    concurrentHashMap = concurrentHashMap8;
                    b = z9 ? 1 : 0;
                    z4 = true;
                    b2 = b6;
                    arrayList4 = arrayList8;
                    r15 = 0;
                    vf6Var2 = vf6Var20;
                    vf6Var3 = vf6Var24;
                    vf6Var4 = vf6Var23;
                    message = message3;
                } else {
                    int m = na7Var.getUserConfig().m(i12);
                    if (message3 != null) {
                        b2 = b6;
                        if (message3.id != jArr2[0]) {
                            int size2 = m + messages_dialogs4.dialogs.size();
                            i8 = message3.id;
                            int i20 = message3.date;
                            TLRPC.Peer peer2 = message3.peer_id;
                            long j9 = peer2.channel_id;
                            if (j9 != 0) {
                                int i21 = 0;
                                while (true) {
                                    if (i21 >= messages_dialogs4.chats.size()) {
                                        i7 = i12;
                                        i11 = size2;
                                        j5 = 0;
                                        break;
                                    }
                                    TLRPC.Chat chat5 = messages_dialogs4.chats.get(i21);
                                    i7 = i12;
                                    i11 = size2;
                                    if (chat5.id == j9) {
                                        j5 = chat5.access_hash;
                                        break;
                                    } else {
                                        i21++;
                                        i12 = i7;
                                        size2 = i11;
                                    }
                                }
                                messages_dialogs3 = messages_dialogs4;
                                vf6Var13 = vf6Var16;
                                i10 = i20;
                                b5 = z9 ? 1 : 0;
                                j2 = 0;
                                int i22 = i11;
                                concurrentHashMap6 = concurrentHashMap8;
                                j3 = j9;
                                i9 = i22;
                                j4 = j5;
                                j = 0;
                            } else {
                                i7 = i12;
                                long j10 = peer2.chat_id;
                                if (j10 != 0) {
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 >= messages_dialogs4.chats.size()) {
                                            j4 = 0;
                                            break;
                                        }
                                        TLRPC.Chat chat6 = messages_dialogs4.chats.get(i23);
                                        if (chat6.id == j10) {
                                            j4 = chat6.access_hash;
                                            break;
                                        }
                                        i23++;
                                    }
                                    messages_dialogs3 = messages_dialogs4;
                                    vf6Var13 = vf6Var16;
                                    i10 = i20;
                                    b5 = z9 ? 1 : 0;
                                    i9 = size2;
                                    j2 = j10;
                                    concurrentHashMap6 = concurrentHashMap8;
                                    j = 0;
                                    j3 = 0;
                                } else {
                                    j = peer2.user_id;
                                    if (j != 0) {
                                        int i24 = 0;
                                        while (true) {
                                            if (i24 >= messages_dialogs4.users.size()) {
                                                j4 = 0;
                                                break;
                                            }
                                            TLRPC.User user2 = messages_dialogs4.users.get(i24);
                                            if (user2.id == j) {
                                                j4 = user2.access_hash;
                                                break;
                                            }
                                            i24++;
                                        }
                                        messages_dialogs3 = messages_dialogs4;
                                        vf6Var13 = vf6Var16;
                                        i10 = i20;
                                        b5 = z9 ? 1 : 0;
                                        j2 = 0;
                                        i9 = size2;
                                        concurrentHashMap6 = concurrentHashMap8;
                                        j3 = 0;
                                    } else {
                                        messages_dialogs3 = messages_dialogs4;
                                        vf6Var13 = vf6Var16;
                                        i10 = i20;
                                        b5 = z9 ? 1 : 0;
                                        j = 0;
                                        j2 = 0;
                                        j4 = 0;
                                        i9 = size2;
                                        concurrentHashMap6 = concurrentHashMap8;
                                        j3 = 0;
                                    }
                                }
                            }
                            arrayList4 = arrayList8;
                            r15 = 0;
                            vf6Var2 = vf6Var20;
                            vf6Var3 = vf6Var24;
                            concurrentHashMap = concurrentHashMap6;
                            vf6Var4 = vf6Var23;
                            b = b5;
                            vf6Var = vf6Var13;
                            messages_dialogs2 = messages_dialogs3;
                            z4 = true;
                            message = message3;
                            long j11 = j;
                            i12 = i7;
                            na7Var.getUserConfig().w(i12, i8, i10, j11, j2, j3, j4);
                            na7Var.getUserConfig().y(i12, i9);
                            na7Var.getUserConfig().u(false);
                        }
                    } else {
                        b2 = b6;
                    }
                    i7 = i12;
                    i8 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    messages_dialogs3 = messages_dialogs4;
                    i9 = m;
                    vf6Var13 = vf6Var16;
                    concurrentHashMap6 = concurrentHashMap8;
                    b5 = z9 ? 1 : 0;
                    i10 = 0;
                    j = 0;
                    j2 = 0;
                    j3 = 0;
                    j4 = 0;
                    arrayList4 = arrayList8;
                    r15 = 0;
                    vf6Var2 = vf6Var20;
                    vf6Var3 = vf6Var24;
                    concurrentHashMap = concurrentHashMap6;
                    vf6Var4 = vf6Var23;
                    b = b5;
                    vf6Var = vf6Var13;
                    messages_dialogs2 = messages_dialogs3;
                    z4 = true;
                    message = message3;
                    long j112 = j;
                    i12 = i7;
                    na7Var.getUserConfig().w(i12, i8, i10, j112, j2, j3, j4);
                    na7Var.getUserConfig().y(i12, i9);
                    na7Var.getUserConfig().u(false);
                }
                ArrayList arrayList11 = new ArrayList();
                int i25 = r15;
                final TLRPC.messages_Dialogs messages_dialogs5 = messages_dialogs2;
                while (i25 < messages_dialogs5.dialogs.size()) {
                    TLRPC.Dialog dialog = messages_dialogs5.dialogs.get(i25);
                    cf3.w(dialog);
                    long j12 = dialog.id;
                    if (j12 == 0 || (cf3.B(j12) && sparseArray != null && sparseArray.get((int) (dialog.id & 4294967295L)) == null)) {
                        arrayList5 = arrayList11;
                        i5 = i12;
                        b3 = b2;
                        concurrentHashMap4 = concurrentHashMap9;
                        concurrentHashMap5 = concurrentHashMap;
                        b4 = b;
                        vf6Var9 = vf6Var4;
                        vf6Var10 = vf6Var;
                        vf6Var11 = vf6Var3;
                    } else {
                        long j13 = na7Var.s2;
                        if (j13 != 0 && j13 == dialog.id) {
                            na7Var.q2 = dialog;
                        }
                        if (dialog.last_message_date == 0) {
                            vf6Var12 = vf6Var;
                            ArrayList arrayList12 = (ArrayList) vf6Var12.f(dialog.id);
                            if (arrayList12 != null) {
                                int i26 = Integer.MIN_VALUE;
                                for (int i27 = r15; i27 < arrayList12.size(); i27++) {
                                    k27 k27Var3 = (k27) arrayList12.get(i27);
                                    if (k27Var3 != null && (message2 = k27Var3.k) != null && (i6 = message2.date) > i26) {
                                        i26 = i6;
                                    }
                                }
                                if (i26 > Integer.MIN_VALUE) {
                                    dialog.last_message_date = i26;
                                }
                            }
                        } else {
                            vf6Var12 = vf6Var;
                        }
                        boolean x = cf3.x(dialog);
                        long j14 = dialog.id;
                        if (x) {
                            vf6Var11 = vf6Var3;
                            TLRPC.Chat chat7 = (TLRPC.Chat) vf6Var11.f(-j14);
                            if (chat7 != null) {
                                z5 = chat7.megagroup;
                                if (hc2.r0(chat7)) {
                                    long j15 = na7Var.s2;
                                    if (j15 != 0) {
                                    }
                                    arrayList5 = arrayList11;
                                    i5 = i12;
                                    vf6Var10 = vf6Var12;
                                    b3 = b2;
                                    concurrentHashMap4 = concurrentHashMap9;
                                    concurrentHashMap5 = concurrentHashMap;
                                    b4 = b;
                                    vf6Var9 = vf6Var4;
                                }
                            } else {
                                z5 = z4;
                            }
                            na7Var.P0.put(-dialog.id, dialog.pts);
                            vf6Var9 = vf6Var4;
                            vf6Var9.k(dialog, dialog.id);
                            if (z5) {
                                b3 = b2;
                                b4 = b;
                            } else {
                                b3 = b2;
                                b4 = b;
                                if (b3 == b4 && ((dialog.read_outbox_max_id == 0 || dialog.read_inbox_max_id == 0) && dialog.top_message != 0)) {
                                    arrayList11.add(dialog);
                                }
                            }
                            concurrentHashMap5 = concurrentHashMap;
                            num = (Integer) concurrentHashMap5.get(Long.valueOf(dialog.id));
                            if (num == null) {
                                num = 0;
                            }
                            arrayList5 = arrayList11;
                            i5 = i12;
                            concurrentHashMap5.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                            concurrentHashMap4 = concurrentHashMap9;
                            num2 = (Integer) concurrentHashMap4.get(Long.valueOf(dialog.id));
                            if (num2 == null) {
                                num2 = 0;
                            }
                            vf6Var10 = vf6Var12;
                            concurrentHashMap4.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                        } else {
                            vf6Var11 = vf6Var3;
                            if (!cf3.y(j14) || (chat = (TLRPC.Chat) vf6Var11.f(-dialog.id)) == null || (chat.migrated_to == null && !hc2.r0(chat))) {
                                z5 = z4;
                                vf6Var9 = vf6Var4;
                                vf6Var9.k(dialog, dialog.id);
                                if (z5) {
                                }
                                concurrentHashMap5 = concurrentHashMap;
                                num = (Integer) concurrentHashMap5.get(Long.valueOf(dialog.id));
                                if (num == null) {
                                }
                                arrayList5 = arrayList11;
                                i5 = i12;
                                concurrentHashMap5.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num.intValue(), dialog.read_inbox_max_id)));
                                concurrentHashMap4 = concurrentHashMap9;
                                num2 = (Integer) concurrentHashMap4.get(Long.valueOf(dialog.id));
                                if (num2 == null) {
                                }
                                vf6Var10 = vf6Var12;
                                concurrentHashMap4.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num2.intValue(), dialog.read_outbox_max_id)));
                            }
                            arrayList5 = arrayList11;
                            i5 = i12;
                            vf6Var10 = vf6Var12;
                            b3 = b2;
                            concurrentHashMap4 = concurrentHashMap9;
                            concurrentHashMap5 = concurrentHashMap;
                            b4 = b;
                            vf6Var9 = vf6Var4;
                        }
                    }
                    i25++;
                    concurrentHashMap9 = concurrentHashMap4;
                    vf6Var4 = vf6Var9;
                    b2 = b3;
                    b = b4;
                    vf6Var3 = vf6Var11;
                    concurrentHashMap = concurrentHashMap5;
                    arrayList11 = arrayList5;
                    i12 = i5;
                    vf6Var = vf6Var10;
                }
                final ArrayList arrayList13 = arrayList11;
                final int i28 = i12;
                final byte b8 = b2;
                ConcurrentHashMap concurrentHashMap10 = concurrentHashMap9;
                ConcurrentHashMap concurrentHashMap11 = concurrentHashMap;
                vf6 vf6Var25 = vf6Var4;
                final vf6 vf6Var26 = vf6Var;
                final vf6 vf6Var27 = vf6Var3;
                if (b8 != b) {
                    fl5.S(messages_dialogs5.messages);
                    int i29 = r15;
                    while (i29 < messages_dialogs5.messages.size()) {
                        TLRPC.Message message6 = messages_dialogs5.messages.get(i29);
                        TLRPC.MessageAction messageAction = message6.action;
                        if (messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) {
                            long j16 = messageAction.user_id;
                            vf6Var6 = vf6Var2;
                            TLRPC.User user3 = (TLRPC.User) vf6Var6.f(j16);
                            if (user3 != null && user3.bot) {
                                message6.reply_markup = new TLRPC.TL_replyKeyboardHide();
                                message6.flags |= 64;
                            }
                        } else {
                            vf6Var6 = vf6Var2;
                        }
                        TLRPC.MessageAction messageAction2 = message6.action;
                        if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                            vf6Var7 = vf6Var6;
                            concurrentHashMap2 = concurrentHashMap10;
                            vf6Var8 = vf6Var25;
                            message6.unread = r15;
                            message6.media_unread = r15;
                        } else {
                            if (message6.out) {
                                concurrentHashMap3 = concurrentHashMap10;
                                concurrentHashMap2 = concurrentHashMap3;
                            } else {
                                concurrentHashMap2 = concurrentHashMap10;
                                concurrentHashMap3 = concurrentHashMap11;
                            }
                            vf6Var7 = vf6Var6;
                            Integer num3 = (Integer) concurrentHashMap3.get(Long.valueOf(message6.dialog_id));
                            if (num3 == null) {
                                vf6Var8 = vf6Var25;
                                num3 = Integer.valueOf(na7Var.getMessagesStorage().S(message6.dialog_id, message6.out));
                                concurrentHashMap3.put(Long.valueOf(message6.dialog_id), num3);
                            } else {
                                vf6Var8 = vf6Var25;
                            }
                            message6.unread = num3.intValue() < message6.id ? z4 : r15;
                        }
                        i29++;
                        vf6Var2 = vf6Var7;
                        concurrentHashMap10 = concurrentHashMap2;
                        vf6Var25 = vf6Var8;
                    }
                    vf6Var5 = vf6Var25;
                    na7Var.getMessagesStorage().a1(messages_dialogs5, b8 == na7Var.D4 ? 3 : r15);
                } else {
                    vf6Var5 = vf6Var25;
                }
                if (b8 == na7Var.C4) {
                    TLRPC.Chat chat8 = messages_dialogs5.chats.get(r15);
                    na7Var.G0(chat8.id);
                    gl.c3(new z47(na7Var, chat8, (byte) 2));
                }
                final TLRPC.Message message7 = message;
                final ArrayList arrayList14 = arrayList3;
                final vf6 vf6Var28 = vf6Var5;
                final ArrayList arrayList15 = arrayList4;
                gl.c3(new Runnable() { // from class: v77
                    /* JADX WARN: Code restructure failed: missing block: B:115:0x02e7, code lost:
                    
                        if (r6.size() == r8.size()) goto L201;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:301:0x04d0  */
                    /* JADX WARN: Removed duplicated region for block: B:315:0x05b7  */
                    /* JADX WARN: Removed duplicated region for block: B:323:0x05e2  */
                    /* JADX WARN: Removed duplicated region for block: B:337:0x060c A[ORIG_RETURN, RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:348:0x04ed  */
                    /* JADX WARN: Type inference failed for: r14v13 */
                    /* JADX WARN: Type inference failed for: r14v46 */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        int i30;
                        byte b9;
                        byte b10;
                        boolean z11;
                        SparseBooleanArray sparseBooleanArray;
                        TLRPC.messages_Dialogs messages_dialogs6;
                        int i31;
                        boolean z12;
                        long j17;
                        boolean z13;
                        boolean z14;
                        int i32;
                        na7 na7Var2;
                        ArrayList arrayList16;
                        na7 na7Var3;
                        TLRPC.InputPeer tL_inputPeerChat;
                        SparseBooleanArray sparseBooleanArray2;
                        ArrayList arrayList17;
                        int i33;
                        int i34;
                        TLRPC.Dialog dialog2;
                        ArrayList arrayList18;
                        vf6 vf6Var29;
                        TLRPC.Dialog dialog3;
                        byte b11;
                        int i35;
                        byte b12;
                        int i36;
                        int i37;
                        byte b13;
                        ArrayList arrayList19;
                        int i38;
                        vf6 vf6Var30;
                        na7 na7Var4 = na7.this;
                        SparseBooleanArray sparseBooleanArray3 = na7Var4.V1;
                        byte b14 = na7Var4.C4;
                        byte b15 = na7Var4.D4;
                        SparseBooleanArray sparseBooleanArray4 = na7Var4.U1;
                        vf6 vf6Var31 = na7Var4.S;
                        ArrayList arrayList20 = na7Var4.y;
                        vf6 vf6Var32 = na7Var4.T;
                        SparseArray sparseArray2 = na7Var4.V;
                        vf6 vf6Var33 = na7Var4.R;
                        b1c b1cVar = na7Var4.i4;
                        boolean z15 = na7Var4.B4;
                        TLRPC.Message message8 = message7;
                        if (message8 != null) {
                            na7Var4.O = Math.min(na7Var4.O, message8.date);
                        } else {
                            na7Var4.O = TLObject.FLAG_31;
                        }
                        byte b16 = b8;
                        TLRPC.messages_Dialogs messages_dialogs7 = messages_dialogs5;
                        if (b16 != z15) {
                            na7Var4.n(messages_dialogs7.dialogs);
                            na7Var4.getMediaDataController().L0();
                        }
                        na7Var4.b4(messages_dialogs7.users, b16 == z15);
                        na7Var4.V3(messages_dialogs7.chats, b16 == z15);
                        ArrayList arrayList21 = arrayList14;
                        if (arrayList21 != null) {
                            int i39 = 0;
                            while (i39 < arrayList21.size()) {
                                long j18 = ((TLRPC.UserFull) arrayList21.get(i39)).id;
                                na7Var4.b1.k((TLRPC.UserFull) arrayList21.get(i39), j18);
                                b1cVar.M(j18);
                                i39++;
                                vf6Var32 = vf6Var32;
                                messages_dialogs7 = messages_dialogs7;
                                arrayList21 = arrayList21;
                            }
                        }
                        vf6 vf6Var34 = vf6Var32;
                        TLRPC.messages_Dialogs messages_dialogs8 = messages_dialogs7;
                        ArrayList arrayList22 = arrayList15;
                        if (arrayList22 != null) {
                            for (int i40 = 0; i40 < arrayList22.size(); i40++) {
                                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList22.get(i40);
                                if (encryptedChat2 instanceof TLRPC.TL_encryptedChat) {
                                    int i41 = encryptedChat2.layer;
                                    Typeface typeface = gl.a;
                                    if ((i41 & 65535) < 151) {
                                        na7Var4.getSecretChatHelper().w(encryptedChat2, null);
                                    }
                                }
                                na7Var4.X3(encryptedChat2, true);
                            }
                        }
                        boolean z16 = z8;
                        int i42 = i28;
                        if (!z16 && b16 != b15 && b16 != b14) {
                            na7Var4.T1.put(i42, false);
                        }
                        na7Var4.R1 = true;
                        int i43 = (!z16 || arrayList20.isEmpty()) ? 0 : ((TLRPC.Dialog) b00.f(1, arrayList20)).last_message_date;
                        int i44 = 0;
                        int i45 = 0;
                        boolean z17 = false;
                        byte b17 = z15;
                        while (true) {
                            vf6 vf6Var35 = vf6Var28;
                            i30 = i44;
                            b9 = b14;
                            b10 = b15;
                            if (i45 >= vf6Var35.m()) {
                                break;
                            }
                            long j19 = vf6Var35.j(i45);
                            TLRPC.Dialog dialog4 = (TLRPC.Dialog) vf6Var35.n(i45);
                            TLRPC.Dialog dialog5 = (TLRPC.Dialog) vf6Var33.f(j19);
                            if (!z16 || dialog5 == null) {
                                i33 = i45;
                            } else {
                                i33 = i45;
                                dialog5.folder_id = dialog4.folder_id;
                            }
                            if (!z16 || i43 == 0 || dialog4.last_message_date >= i43) {
                                if (b16 != b17) {
                                    dialog2 = dialog5;
                                    i34 = i43;
                                    na7Var4.getMediaDataController().B1(dialog4.id, 0L, dialog4.draft);
                                    if (dialog4.draft instanceof TLRPC.TL_draftMessage) {
                                        na7Var4.getMediaDataController().U1(dialog4.id, 0L, dialog4.draft, null, false);
                                    }
                                } else {
                                    i34 = i43;
                                    dialog2 = dialog5;
                                }
                                int i46 = dialog4.folder_id != i42 ? i30 + 1 : i30;
                                ArrayList arrayList23 = (ArrayList) vf6Var26.f(dialog4.id);
                                if (dialog2 == null) {
                                    vf6Var33.k(dialog4, j19);
                                    vf6Var31.k(arrayList23, j19);
                                    if (arrayList23 != null) {
                                        int i47 = 0;
                                        while (i47 < arrayList23.size()) {
                                            k27 k27Var4 = (k27) arrayList23.get(i47);
                                            if (k27Var4 != null) {
                                                arrayList19 = arrayList20;
                                                i38 = i47;
                                                if (k27Var4.k.peer_id.channel_id == 0) {
                                                    sparseArray2.put(k27Var4.e1(), k27Var4);
                                                    long j20 = k27Var4.k.random_id;
                                                    if (j20 != 0) {
                                                        vf6Var30 = vf6Var34;
                                                        vf6Var30.k(k27Var4, j20);
                                                        i47 = i38 + 1;
                                                        vf6Var34 = vf6Var30;
                                                        arrayList20 = arrayList19;
                                                    }
                                                }
                                            } else {
                                                arrayList19 = arrayList20;
                                                i38 = i47;
                                            }
                                            vf6Var30 = vf6Var34;
                                            i47 = i38 + 1;
                                            vf6Var34 = vf6Var30;
                                            arrayList20 = arrayList19;
                                        }
                                    }
                                    arrayList18 = arrayList20;
                                    vf6Var29 = vf6Var34;
                                    if (b1cVar.u(j19)) {
                                        b1cVar.d(j19);
                                    }
                                    i35 = i42;
                                    b11 = b17;
                                    b12 = b16;
                                    i44 = i46;
                                    z17 = true;
                                } else {
                                    arrayList18 = arrayList20;
                                    vf6Var29 = vf6Var34;
                                    if (b16 != b17) {
                                        dialog3 = dialog2;
                                        dialog3.notify_settings = dialog4.notify_settings;
                                    } else {
                                        dialog3 = dialog2;
                                    }
                                    dialog3.pinned = dialog4.pinned;
                                    dialog3.pinnedNum = dialog4.pinnedNum;
                                    ArrayList arrayList24 = (ArrayList) vf6Var31.f(j19);
                                    b11 = b17;
                                    int i48 = 0;
                                    while (true) {
                                        i35 = i42;
                                        if (arrayList24 == null) {
                                            break;
                                        }
                                        if (i48 < arrayList24.size()) {
                                            if (arrayList24.get(i48) != null && ((k27) arrayList24.get(i48)).Z) {
                                                break;
                                            }
                                            i48++;
                                            i42 = i35;
                                        } else if (dialog3.top_message <= 0) {
                                            vf6Var33.k(dialog4, j19);
                                            vf6Var31.k(arrayList23, j19);
                                            int i49 = 0;
                                            while (i49 < arrayList24.size()) {
                                                k27 k27Var5 = (k27) arrayList24.get(i49);
                                                if (k27Var5 == null) {
                                                    b13 = b16;
                                                } else {
                                                    b13 = b16;
                                                    if (k27Var5.k.peer_id.channel_id == 0) {
                                                        sparseArray2.remove(k27Var5.e1());
                                                    }
                                                    long j21 = k27Var5.k.random_id;
                                                    if (j21 != 0) {
                                                        vf6Var29.l(j21);
                                                    }
                                                }
                                                i49++;
                                                b16 = b13;
                                            }
                                            b12 = b16;
                                            if (arrayList23 != null) {
                                                int i50 = 0;
                                                while (i50 < arrayList23.size()) {
                                                    k27 k27Var6 = (k27) arrayList23.get(i50);
                                                    if (k27Var6 == null || k27Var6.k.peer_id.channel_id != 0) {
                                                        i37 = i50;
                                                    } else {
                                                        int i51 = 0;
                                                        while (true) {
                                                            if (i51 >= arrayList24.size()) {
                                                                i37 = i50;
                                                                break;
                                                            }
                                                            k27 k27Var7 = (k27) arrayList24.get(i51);
                                                            if (k27Var7 != null) {
                                                                i37 = i50;
                                                                if (k27Var7.e1() == k27Var6.e1()) {
                                                                    k27Var6.Z = k27Var7.Z;
                                                                    break;
                                                                }
                                                            } else {
                                                                i37 = i50;
                                                            }
                                                            i51++;
                                                            i50 = i37;
                                                        }
                                                        sparseArray2.put(k27Var6.e1(), k27Var6);
                                                        long j22 = k27Var6.k.random_id;
                                                        if (j22 != 0) {
                                                            vf6Var29.k(k27Var6, j22);
                                                        }
                                                    }
                                                    i50 = i37 + 1;
                                                }
                                            }
                                            if (b1cVar.u(j19)) {
                                                b1cVar.d(j19);
                                            }
                                        }
                                    }
                                    b12 = b16;
                                    if (dialog4.top_message < dialog3.top_message) {
                                        if ((arrayList24 == null) == (arrayList23 == null)) {
                                            if (arrayList24 != null) {
                                                if (arrayList23 != null) {
                                                }
                                            }
                                            i44 = i46;
                                        }
                                    }
                                    vf6Var33.k(dialog4, j19);
                                    vf6Var31.k(arrayList23, j19);
                                    if (arrayList24 != null) {
                                        for (int i52 = 0; i52 < arrayList24.size(); i52++) {
                                            k27 k27Var8 = (k27) arrayList24.get(i52);
                                            if (k27Var8 != null) {
                                                if (k27Var8.k.peer_id.channel_id == 0) {
                                                    sparseArray2.remove(k27Var8.e1());
                                                }
                                                long j23 = k27Var8.k.random_id;
                                                if (j23 != 0) {
                                                    vf6Var29.l(j23);
                                                }
                                            }
                                        }
                                    }
                                    if (arrayList23 != null) {
                                        int i53 = 0;
                                        while (i53 < arrayList23.size()) {
                                            k27 k27Var9 = (k27) arrayList23.get(i53);
                                            if (k27Var9 == null || k27Var9.k.peer_id.channel_id != 0) {
                                                i36 = i53;
                                            } else {
                                                int i54 = 0;
                                                while (arrayList24 != null && i54 < arrayList24.size()) {
                                                    k27 k27Var10 = (k27) arrayList24.get(i54);
                                                    if (k27Var10 != null) {
                                                        i36 = i53;
                                                        if (k27Var10.e1() == k27Var9.e1()) {
                                                            k27Var9.Z = k27Var10.Z;
                                                            break;
                                                        }
                                                    } else {
                                                        i36 = i53;
                                                    }
                                                    i54++;
                                                    i53 = i36;
                                                }
                                                i36 = i53;
                                                sparseArray2.put(k27Var9.e1(), k27Var9);
                                                long j24 = k27Var9.k.random_id;
                                                if (j24 != 0) {
                                                    vf6Var29.k(k27Var9, j24);
                                                }
                                            }
                                            i53 = i36 + 1;
                                        }
                                    }
                                    if (b1cVar.u(j19)) {
                                        b1cVar.d(j19);
                                    }
                                    i44 = i46;
                                }
                            } else {
                                i35 = i42;
                                arrayList18 = arrayList20;
                                i34 = i43;
                                b12 = b16;
                                vf6Var29 = vf6Var34;
                                i44 = i30;
                                b11 = b17;
                            }
                            b17 = b11;
                            b14 = b9;
                            b15 = b10;
                            arrayList20 = arrayList18;
                            b16 = b12;
                            i43 = i34;
                            vf6Var34 = vf6Var29;
                            i45 = i33 + 1;
                            i42 = i35;
                        }
                        int i55 = i42;
                        ArrayList arrayList25 = arrayList20;
                        byte b18 = b17;
                        byte b19 = b16;
                        long j25 = 0;
                        arrayList25.clear();
                        int m2 = vf6Var33.m();
                        int i56 = 0;
                        while (i56 < m2) {
                            TLRPC.Dialog dialog6 = (TLRPC.Dialog) vf6Var33.n(i56);
                            if (na7Var4.u0.h(dialog6.id) >= 0) {
                                arrayList17 = arrayList25;
                            } else {
                                arrayList17 = arrayList25;
                                arrayList17.add(dialog6);
                            }
                            i56++;
                            arrayList25 = arrayList17;
                        }
                        na7Var4.Z4(z16 ? vf6Var27 : null);
                        vf6 vf6Var36 = na7Var4.getMediaDataController().u1;
                        int m3 = vf6Var36.m();
                        int i57 = 0;
                        while (i57 < m3) {
                            long j26 = j25;
                            TLRPC.DraftMessage draftMessage = (TLRPC.DraftMessage) ((vf6) vf6Var36.n(i57)).f(j26);
                            if (draftMessage != null) {
                                na7Var4.W3(vf6Var36.j(i57), draftMessage);
                            }
                            i57++;
                            j25 = j26;
                        }
                        long j27 = j25;
                        byte b20 = b7;
                        boolean z18 = z10;
                        if (b19 == b9 || b19 == b10 || z16) {
                            z11 = z18;
                            sparseBooleanArray = sparseBooleanArray4;
                            messages_dialogs6 = messages_dialogs8;
                            i31 = i55;
                            z12 = true;
                        } else {
                            messages_dialogs6 = messages_dialogs8;
                            z11 = z18;
                            sparseBooleanArray = sparseBooleanArray4;
                            i31 = i55;
                            sparseBooleanArray.put(i31, (messages_dialogs6.dialogs.size() == 0 || messages_dialogs6.dialogs.size() != b20) && b19 == 0);
                            if (i30 <= 0 || i30 >= 20 || i31 != 0) {
                                sparseBooleanArray2 = sparseBooleanArray3;
                                z12 = true;
                            } else {
                                z12 = true;
                                sparseBooleanArray.put(1, true);
                                if (na7Var4.getUserConfig().g(i31)[0] == 2147483647L) {
                                    sparseBooleanArray2 = sparseBooleanArray3;
                                    sparseBooleanArray2.put(1, true);
                                } else {
                                    sparseBooleanArray2 = sparseBooleanArray3;
                                }
                            }
                            if (!z11) {
                                sparseBooleanArray2.put(i31, ((messages_dialogs6.dialogs.size() == 0 || messages_dialogs6.dialogs.size() != b20) && b19 == 0) ? z12 : false);
                            }
                        }
                        int m4 = na7Var4.getUserConfig().m(i31);
                        long[] g2 = na7Var4.getUserConfig().g(i31);
                        if (z11 || z16 || m4 >= 400) {
                            j17 = j27;
                            z13 = false;
                        } else {
                            long j28 = g2[0];
                            if (j28 != -1 && j28 != 2147483647L) {
                                i32 = 0;
                                z14 = z12;
                                j17 = j27;
                                na7Var4.X2(i31, 0, 100, false, null);
                                na7Var4.getNotificationCenter().k(kk7.r, new Object[i32]);
                                if (!z16) {
                                    na7Var4.getUserConfig().K = i13;
                                    na7Var4.getUserConfig().u(i32);
                                    na7Var4.X1 = i32;
                                    na7Var4.getNotificationCenter().k(kk7.O0, new Object[i32]);
                                } else if (!z17 && b19 == b18 && sparseBooleanArray.get(i31)) {
                                    na7Var4.X2(i31, 0, b20, false, null);
                                }
                                int i58 = na7Var4.getUserConfig().K;
                                int i59 = na7Var4.getUserConfig().L;
                                long j29 = na7Var4.getUserConfig().M;
                                long j30 = na7Var4.getUserConfig().N;
                                long j31 = na7Var4.getUserConfig().O;
                                long j32 = j17;
                                long j33 = na7Var4.getUserConfig().P;
                                if (!na7Var4.X1 || i58 == -1) {
                                    na7Var2 = na7Var4;
                                } else {
                                    na7Var4.X1 = z14;
                                    TLRPC.TL_messages_getDialogs tL_messages_getDialogs = new TLRPC.TL_messages_getDialogs();
                                    tL_messages_getDialogs.exclude_pinned = z14;
                                    tL_messages_getDialogs.limit = 100;
                                    tL_messages_getDialogs.offset_id = i58;
                                    tL_messages_getDialogs.offset_date = i59;
                                    if (w01.a) {
                                        StringBuilder m5 = de9.m(i58, "start migrate with id ", " date ");
                                        na7Var3 = na7Var4;
                                        m5.append(k96.D0().y0().format(i59 * 1000));
                                        fa4.b(m5.toString());
                                    } else {
                                        na7Var3 = na7Var4;
                                    }
                                    if (i58 == 0) {
                                        tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                                    } else {
                                        if (j31 != j32) {
                                            tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                                            tL_messages_getDialogs.offset_peer = tL_inputPeerChat;
                                            tL_inputPeerChat.channel_id = j31;
                                        } else if (j29 != j32) {
                                            tL_inputPeerChat = new TLRPC.TL_inputPeerUser();
                                            tL_messages_getDialogs.offset_peer = tL_inputPeerChat;
                                            tL_inputPeerChat.user_id = j29;
                                        } else {
                                            tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                            tL_messages_getDialogs.offset_peer = tL_inputPeerChat;
                                            tL_inputPeerChat.chat_id = j30;
                                        }
                                        tL_inputPeerChat.access_hash = j33;
                                    }
                                    na7Var2 = na7Var3;
                                    na7Var3.getConnectionsManager().sendRequest(tL_messages_getDialogs, new e97(na7Var2, i58, (byte) 2));
                                }
                                arrayList16 = arrayList13;
                                if (!arrayList16.isEmpty()) {
                                    na7Var2.e4(arrayList16, j32);
                                }
                                if (!na7Var2.W1 && !na7Var2.getUserConfig().x) {
                                    na7Var2.W1 = true;
                                    na7Var2.getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogUnreadMarks(), new y47(na7Var2, (byte) 13));
                                }
                                if (messages_dialogs6.dialogs == null) {
                                    for (int i60 = 0; i60 < messages_dialogs6.dialogs.size(); i60++) {
                                        long j34 = messages_dialogs6.dialogs.get(i60).id;
                                        if (na7Var2.r2(j34) || na7Var2.y2(j34)) {
                                            na7Var2.g4.n(0, -j34, true);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            j17 = j27;
                            z13 = false;
                        }
                        z14 = z12;
                        i32 = z13;
                        na7Var4.getNotificationCenter().k(kk7.r, new Object[i32]);
                        if (!z16) {
                        }
                        int i582 = na7Var4.getUserConfig().K;
                        int i592 = na7Var4.getUserConfig().L;
                        long j292 = na7Var4.getUserConfig().M;
                        long j302 = na7Var4.getUserConfig().N;
                        long j312 = na7Var4.getUserConfig().O;
                        long j322 = j17;
                        long j332 = na7Var4.getUserConfig().P;
                        if (na7Var4.X1) {
                        }
                        na7Var2 = na7Var4;
                        arrayList16 = arrayList13;
                        if (!arrayList16.isEmpty()) {
                        }
                        if (!na7Var2.W1) {
                            na7Var2.W1 = true;
                            na7Var2.getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogUnreadMarks(), new y47(na7Var2, (byte) 13));
                        }
                        if (messages_dialogs6.dialogs == null) {
                        }
                    }
                });
            }
        });
    }

    public final void M4(long j, TLRPC.TL_chatBannedRights tL_chatBannedRights, boolean z, d dVar) {
        if (tL_chatBannedRights == null) {
            return;
        }
        TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
        tL_messages_editChatDefaultBannedRights.peer = h1(-j);
        tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_messages_editChatDefaultBannedRights, new hc((byte) 0), new k87(this, j, dVar, tL_messages_editChatDefaultBannedRights, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(ga7 ga7Var) {
        TLRPC.TL_messages_readHistory tL_messages_readHistory;
        byte b = 0;
        if (ga7Var.b != 0 && ga7Var.c == 0) {
            TLRPC.TL_messages_readDiscussion tL_messages_readDiscussion = new TLRPC.TL_messages_readDiscussion();
            tL_messages_readDiscussion.msg_id = (int) ga7Var.b;
            tL_messages_readDiscussion.peer = h1(ga7Var.a);
            tL_messages_readDiscussion.read_max_id = ga7Var.d;
            getConnectionsManager().sendRequest(tL_messages_readDiscussion, new ce2(b));
            return;
        }
        boolean B = cf3.B(ga7Var.a);
        long j = ga7Var.a;
        byte b2 = 1;
        if (B) {
            TLRPC.EncryptedChat Y0 = Y0(Integer.valueOf((int) (j & 4294967295L)));
            byte[] bArr = Y0.auth_key;
            if (bArr == null || bArr.length <= 1 || !(Y0 instanceof TLRPC.TL_encryptedChat)) {
                return;
            }
            TLRPC.TL_messages_readEncryptedHistory tL_messages_readEncryptedHistory = new TLRPC.TL_messages_readEncryptedHistory();
            TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
            tL_messages_readEncryptedHistory.peer = tL_inputEncryptedChat;
            tL_inputEncryptedChat.chat_id = Y0.id;
            tL_inputEncryptedChat.access_hash = Y0.access_hash;
            tL_messages_readEncryptedHistory.max_date = ga7Var.e;
            getConnectionsManager().sendRequest(tL_messages_readEncryptedHistory, new ce2(b));
            return;
        }
        TLRPC.InputPeer h1 = h1(j);
        if (ga7Var.c != 0) {
            TLRPC.TL_messages_readSavedHistory tL_messages_readSavedHistory = new TLRPC.TL_messages_readSavedHistory();
            tL_messages_readSavedHistory.parent_peer = h1(ga7Var.a);
            tL_messages_readSavedHistory.peer = h1(ga7Var.c);
            tL_messages_readSavedHistory.max_id = ga7Var.d;
            tL_messages_readHistory = tL_messages_readSavedHistory;
        } else if (h1 instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_channels_readHistory tL_channels_readHistory = new TLRPC.TL_channels_readHistory();
            tL_channels_readHistory.channel = f1(-ga7Var.a);
            tL_channels_readHistory.max_id = ga7Var.d;
            tL_messages_readHistory = tL_channels_readHistory;
        } else {
            TLRPC.TL_messages_readHistory tL_messages_readHistory2 = new TLRPC.TL_messages_readHistory();
            tL_messages_readHistory2.peer = h1;
            tL_messages_readHistory2.max_id = ga7Var.d;
            tL_messages_readHistory = tL_messages_readHistory2;
        }
        getConnectionsManager().sendRequest(tL_messages_readHistory, new y47(this, b2));
    }

    public final r97 N0(long j) {
        LongSparseArray longSparseArray = this.f5;
        r97 r97Var = (r97) longSparseArray.get(j);
        if (r97Var != null) {
            return r97Var;
        }
        r97 r97Var2 = new r97(this.currentAccount, j);
        longSparseArray.put(j, r97Var2);
        return r97Var2;
    }

    public final boolean N2(String str) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings != null && str != null) {
            String J0 = gl.J0(str, false);
            if (J0 == null) {
                J0 = gl.J0("//".concat(str), false);
            }
            if (!(tL_webBrowserSettings.open_external_browser ? !c2(J0, tL_webBrowserSettings.inapp_exceptions) : c2(J0, tL_webBrowserSettings.external_exceptions))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x04ab, code lost:
    
        if (r4 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04cf, code lost:
    
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04be, code lost:
    
        if (r4 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04cd, code lost:
    
        if (r4 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x05d1, code lost:
    
        if ((((((r7[r24] & 255) << 24) + ((r7[2] & 255) << 16)) + ((r7[1] & 255) << 8)) + (r7[r18] & 255)) < 234) goto L266;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c A[LOOP:1: B:54:0x0144->B:56:0x014c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a A[LOOP:2: B:59:0x0162->B:61:0x016a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0398  */
    /* JADX WARN: Type inference failed for: r10v13, types: [k27] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r44v0 */
    /* JADX WARN: Type inference failed for: r44v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r44v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N3(final TLRPC.messages_Messages messages_messages, final int i, long j, final long j2, final int i2, final int i3, final int i4, final boolean z, final int i5, final int i6, final int i7, final int i8, final int i9, final int i10, final boolean z2, final int i11, long j3, final int i12, final boolean z3, final int i13, final boolean z4, final boolean z5, final qob qobVar) {
        long j4;
        long j5;
        boolean z6;
        boolean z7;
        vf6 vf6Var;
        vf6 vf6Var2;
        int i14;
        int i15;
        qob qobVar2;
        na7 na7Var;
        vf6 vf6Var3;
        vf6 vf6Var4;
        long j6;
        int size;
        long j7;
        long j8;
        int i16;
        vf6 vf6Var5;
        byte b;
        boolean z8;
        int i17;
        ?? r15;
        boolean z9;
        boolean z10;
        char c;
        byte b2;
        boolean z11;
        vf6 vf6Var6;
        vf6 vf6Var7;
        long j9;
        final long j10;
        long r;
        ArrayList<TLRPC.Message> arrayList;
        na7 na7Var2 = this;
        TLRPC.messages_Messages messages_messages2 = messages_messages;
        final long j11 = j;
        if (w01.a) {
            StringBuilder sb = new StringBuilder("processLoadedMessages size ");
            sb.append(messages_messages2.messages.size());
            sb.append(" in chat ");
            sb.append(j11);
            sb.append(" topic_id ");
            sb.append(j3);
            sb.append(" count ");
            j4 = 0;
            ir2.w(sb, i2, " max_id ", i3, " cache ");
            sb.append(z);
            sb.append(" guid ");
            sb.append(i5);
            sb.append(" load_type ");
            ir2.w(sb, i10, " last_message_id ", i7, " index ");
            ir2.w(sb, i12, " firstUnread ", i6, " unread_count ");
            ir2.w(sb, i8, " last_date ", i9, " queryFromServer ");
            sb.append(z3);
            sb.append(" isTopic ");
            sb.append(z5);
            sb.append(" mode ");
            b00.p(i11, sb);
        } else {
            j4 = 0;
        }
        pob d = qob.d(qobVar, "processLoadedMessages");
        if (i11 == 0 && (arrayList = messages_messages2.messages) != null && !ls6.v("dialog_bar_replied", j11, na7Var2.W3, false)) {
            int i18 = 0;
            while (true) {
                if (i18 >= arrayList.size()) {
                    break;
                }
                TLRPC.Message message = arrayList.get(i18);
                if (message != null && message.out && !(message instanceof TLRPC.TL_messageService) && message.peer_id != null && k27.B0(message) == j11) {
                    na7Var2.o3(j11);
                    break;
                }
                i18++;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (messages_messages2 instanceof TLRPC.TL_messages_channelMessages) {
            long j12 = -j11;
            if (i11 == 0 && j3 == j4) {
                LongSparseIntArray longSparseIntArray = na7Var2.P0;
                if (longSparseIntArray.get(j12) == 0 && na7Var2.getMessagesStorage().M(j12) == 0) {
                    longSparseIntArray.put(j12, messages_messages2.pts);
                    if (na7Var2.r0.h(j12) < 0 || na7Var2.q0.indexOfKey(j12) >= 0) {
                        j5 = j3;
                        z6 = true;
                        na7Var2.G0(j12);
                    } else {
                        z6 = true;
                        j5 = j3;
                        H0(j12, 2, 0L, null);
                        na7Var2 = this;
                    }
                    z7 = z6;
                    if (!z) {
                        fl5.S(messages_messages2.messages);
                    }
                    boolean z12 = (i4 == 0 || i3 != 0) ? false : z6;
                    vf6Var = new vf6();
                    vf6Var2 = new vf6();
                    for (i14 = 0; i14 < messages_messages2.users.size(); i14++) {
                        TLRPC.User user = messages_messages2.users.get(i14);
                        r0(j11, user, messages_messages2.messages);
                        vf6Var.k(user, user.id);
                    }
                    for (i15 = 0; i15 < messages_messages2.chats.size(); i15++) {
                        TLRPC.Chat chat = messages_messages2.chats.get(i15);
                        r0(j11, chat, messages_messages2.messages);
                        vf6Var2.k(chat, chat.id);
                    }
                    vf6 vf6Var8 = na7Var2.G1;
                    vf6 vf6Var9 = na7Var2.F1;
                    vf6 vf6Var10 = na7Var2.E1;
                    vf6 vf6Var11 = na7Var2.D1;
                    vf6 vf6Var12 = na7Var2.C1;
                    boolean z13 = z12;
                    boolean z14 = i11 == 1 ? !(i11 != 5 ? i11 != 9 ? i11 != 3 ? i != 0 || (z13 && SystemClock.elapsedRealtime() - ((Long) vf6Var8.g(0L, j11)).longValue() <= 60000 && !(z && z5)) : i != 0 || (z13 && SystemClock.elapsedRealtime() - ((Long) vf6Var9.g(0L, j5)).longValue() <= 60000 && !z) : SystemClock.elapsedRealtime() - ((Long) vf6Var10.g(0L, j11)).longValue() <= 60000 : SystemClock.elapsedRealtime() - ((Long) vf6Var11.g(0L, j5)).longValue() <= 60000) : SystemClock.elapsedRealtime() - ((Long) vf6Var12.g(0L, j11)).longValue() > 60000;
                    if (cf3.B(j11) && z && z14) {
                        if (i11 == 1) {
                            vf6Var12.k(Long.valueOf(SystemClock.elapsedRealtime()), j11);
                        } else if (i11 == 5) {
                            vf6Var11.k(Long.valueOf(SystemClock.elapsedRealtime()), j5);
                        } else if (i11 == 9) {
                            vf6Var10.k(Long.valueOf(SystemClock.elapsedRealtime()), j11);
                        } else if (i11 == 3) {
                            vf6Var9.k(Long.valueOf(SystemClock.elapsedRealtime()), j5);
                        } else if (i11 == 0) {
                            vf6Var8.k(Long.valueOf(SystemClock.elapsedRealtime()), j11);
                        }
                        if (i11 == 1) {
                            int size2 = messages_messages2.messages.size();
                            long j13 = 0;
                            for (int i19 = 0; i19 < size2; i19++) {
                                int i20 = messages_messages2.messages.get(i19).id;
                                if (i20 >= 0) {
                                    j13 = hq6.r(hq6.r(hq6.r(j13, i20), r6.edit_date), r6.date);
                                }
                            }
                            j10 = j13;
                            vf6Var7 = vf6Var;
                            j9 = 0;
                        } else if (i11 == 0 || i11 == 3) {
                            vf6Var7 = vf6Var;
                            j9 = 0;
                            int size3 = messages_messages2.messages.size();
                            long j14 = 0;
                            for (int i21 = 0; i21 < size3; i21++) {
                                TLRPC.Message message2 = messages_messages2.messages.get(i21);
                                if (message2.id >= 0) {
                                    long r2 = hq6.r(hq6.r(j14, Math.abs(cf3.n(message2.peer_id))), message2.id);
                                    if (message2.pinned) {
                                        r2 = hq6.r(r2, 1L);
                                    }
                                    int i22 = message2.date;
                                    if ((message2.flags & 32768) != 0) {
                                        i22 = message2.edit_date;
                                    }
                                    j14 = hq6.r(r2, i22);
                                }
                            }
                            j10 = j14;
                        } else if (i11 == 5) {
                            int size4 = messages_messages2.messages.size();
                            int i23 = 0;
                            long j15 = 0;
                            while (i23 < size4) {
                                TLRPC.Message message3 = messages_messages2.messages.get(i23);
                                int i24 = message3.id;
                                vf6 vf6Var13 = vf6Var;
                                if (i24 < 0) {
                                    r = j15;
                                } else {
                                    long r3 = hq6.r(j15, i24);
                                    r = (message3.flags & 32768) != 0 ? hq6.r(r3, message3.edit_date) : hq6.r(r3, 0L);
                                }
                                i23++;
                                j15 = r;
                                vf6Var = vf6Var13;
                            }
                            vf6Var7 = vf6Var;
                            j9 = 0;
                            j10 = j15;
                        } else {
                            vf6Var7 = vf6Var;
                            j9 = 0;
                            j10 = 0;
                        }
                        vf6Var4 = vf6Var2;
                        j6 = j9;
                        vf6Var3 = vf6Var7;
                        final long j16 = j5;
                        Runnable runnable = new Runnable() { // from class: m67
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i25 = i10;
                                boolean z15 = z3;
                                int i26 = i6;
                                na7.this.b3(j11, j2, false, i2, (i25 == 2 && z15) ? i26 : i3, i4, false, 0, i5, i25, i7, i11, j16, i12, i26, i8, i9, z15, i13, true, z4, z5, qobVar, j10);
                            }
                        };
                        na7Var = this;
                        j11 = j11;
                        qobVar2 = qobVar;
                        gl.c3(runnable);
                        messages_messages2 = messages_messages;
                        if (messages_messages2.messages.isEmpty()) {
                            return;
                        }
                    } else {
                        qobVar2 = qobVar;
                        na7Var = na7Var2;
                        vf6Var3 = vf6Var;
                        vf6Var4 = vf6Var2;
                        j6 = 0;
                    }
                    size = messages_messages2.messages.size();
                    if (z) {
                        Long valueOf = Long.valueOf(j11);
                        ConcurrentHashMap concurrentHashMap = na7Var.P;
                        Integer num = (Integer) concurrentHashMap.get(valueOf);
                        if (num == null) {
                            z9 = false;
                            num = Integer.valueOf(na7Var.getMessagesStorage().S(j11, false));
                            concurrentHashMap.put(Long.valueOf(j11), num);
                        } else {
                            z9 = false;
                        }
                        Long valueOf2 = Long.valueOf(j11);
                        ConcurrentHashMap concurrentHashMap2 = na7Var.Q;
                        Integer num2 = (Integer) concurrentHashMap2.get(valueOf2);
                        if (num2 == null) {
                            z10 = true;
                            num2 = Integer.valueOf(na7Var.getMessagesStorage().S(j11, true));
                            concurrentHashMap2.put(Long.valueOf(j11), num2);
                        } else {
                            z10 = true;
                        }
                        int i25 = z9;
                        while (i25 < size) {
                            TLRPC.Message message4 = messages_messages2.messages.get(i25);
                            if (i11 == 0) {
                                TLRPC.MessageAction messageAction = message4.action;
                                if (messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) {
                                    vf6Var6 = vf6Var3;
                                    TLRPC.User user2 = (TLRPC.User) vf6Var6.f(messageAction.user_id);
                                    if (user2 != null && user2.bot) {
                                        message4.reply_markup = new TLRPC.TL_replyKeyboardHide();
                                        message4.flags |= 64;
                                    }
                                } else {
                                    vf6Var6 = vf6Var3;
                                }
                                TLRPC.MessageAction messageAction2 = message4.action;
                                if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                                    message4.unread = z9;
                                    message4.media_unread = z9;
                                } else if (j3 == j6) {
                                    message4.unread = (message4.out ? num2 : num).intValue() < message4.id ? z10 : z9;
                                } else {
                                    message4.unread = z10;
                                }
                            } else {
                                vf6Var6 = vf6Var3;
                            }
                            i25++;
                            vf6Var3 = vf6Var6;
                        }
                        vf6 vf6Var14 = vf6Var3;
                        if (j3 == j6 || z5) {
                            c = '\b';
                            b2 = 3;
                        } else {
                            c = '\b';
                            b2 = 3;
                            if (i11 != 8 && i11 != 3 && i11 != 5 && i11 != 9) {
                                j7 = j3;
                                vf6Var5 = vf6Var14;
                                i16 = i11;
                                z8 = z9;
                                long j17 = j11;
                                b = 3;
                                z11 = z10;
                                j8 = j17;
                                if (i16 == b) {
                                    vp9 D1 = na7Var.D1();
                                    boolean p = D1.p(messages_messages2.messages);
                                    if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                                        if (!D1.q(messages_messages2.count, j7, z8)) {
                                        }
                                        p = z11;
                                    } else if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                                        if (!D1.q(messages_messages2.messages.size(), j7, z8)) {
                                        }
                                        p = z11;
                                    } else if (messages_messages2 instanceof TLRPC.TL_messages_channelMessages) {
                                        if (!D1.q(messages_messages2.count, j7, z8)) {
                                        }
                                        p = z11;
                                    }
                                    if (p) {
                                        gl.c3(new tp9(D1, b));
                                    }
                                }
                            }
                        }
                        vf6Var5 = vf6Var14;
                        long j18 = j11;
                        z11 = z10;
                        z8 = z9;
                        b = b2;
                        TLRPC.messages_Messages messages_messages3 = messages_messages2;
                        na7Var.getMessagesStorage().e1(i10, i3, i11, j18, j3, messages_messages3, z7);
                        messages_messages2 = messages_messages3;
                        j7 = j3;
                        i16 = i11;
                        j8 = j18;
                        if (i16 == b) {
                        }
                    } else {
                        j7 = j3;
                        j8 = j11;
                        i16 = i11;
                        vf6Var5 = vf6Var3;
                        b = 3;
                        z8 = false;
                    }
                    if (z4 && cf3.B(j8)) {
                        final TLRPC.messages_Messages messages_messages4 = messages_messages2;
                        final na7 na7Var3 = na7Var;
                        gl.c3(new Runnable() { // from class: n67
                            @Override // java.lang.Runnable
                            public final void run() {
                                na7.this.getNotificationCenter().k(kk7.G, Integer.valueOf(i5), Integer.valueOf(messages_messages4.messages.size()), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i7));
                            }
                        });
                        return;
                    }
                    final na7 na7Var4 = na7Var;
                    final ArrayList arrayList2 = new ArrayList();
                    final ArrayList arrayList3 = new ArrayList();
                    final HashMap hashMap = new HashMap();
                    i17 = z8;
                    int i26 = i17;
                    while (i17 < size) {
                        TLRPC.Message message5 = messages_messages2.messages.get(i17);
                        message5.dialog_id = j8;
                        k27 k27Var = new k27(na7Var4.currentAccount, message5, null, null, null, vf6Var5, vf6Var4, true, false, 0L, false, false, i16 == b ? 1 : i26, 0);
                        byte b3 = b;
                        k27Var.r1 = i16 == 1 ? 1 : i26;
                        arrayList2.add(k27Var);
                        if (z) {
                            if (message5.legacy && message5.layer < 234) {
                                arrayList3.add(Integer.valueOf(message5.id));
                            } else if ((k27.n1(message5) instanceof TLRPC.TL_messageMediaUnsupported) && k27.n1(message5).bytes != null) {
                                if (k27.n1(message5).bytes.length != 0 && (k27.n1(message5).bytes.length != 1 || k27.n1(message5).bytes[i26] >= 234)) {
                                    if (k27.n1(message5).bytes.length == 4) {
                                        byte[] bArr = k27.n1(message5).bytes;
                                        Pattern pattern = Utilities.a;
                                    }
                                }
                                if (!k27.c3(message5)) {
                                    arrayList3.add(Integer.valueOf(message5.id));
                                }
                            }
                            if (k27.n1(message5) instanceof TLRPC.TL_messageMediaWebPage) {
                                if (!(k27.n1(message5).webpage instanceof TLRPC.TL_webPagePending) || k27.n1(message5).webpage.date > na7Var4.getConnectionsManager().getCurrentTime()) {
                                    if (k27.n1(message5).webpage instanceof TLRPC.TL_webPageUrlPending) {
                                        ArrayList arrayList4 = (ArrayList) hashMap.get(k27.n1(message5).webpage.url);
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                            hashMap.put(k27.n1(message5).webpage.url, arrayList4);
                                        }
                                        arrayList4.add(k27Var);
                                    }
                                } else if (!k27.c3(message5)) {
                                    arrayList3.add(Integer.valueOf(message5.id));
                                }
                            }
                        }
                        i17++;
                        messages_messages2 = messages_messages;
                        b = b3;
                    }
                    na7Var4.getFileLoader().l(arrayList2);
                    if (gba.o() == 2) {
                        for (int i27 = i26; i27 < arrayList2.size(); i27++) {
                            ((k27) arrayList2.get(i27)).Q();
                        }
                    }
                    if (w01.a) {
                        fa4.b("process time=" + (SystemClock.elapsedRealtime() - elapsedRealtime) + " count=" + arrayList2.size() + " for dialog  " + j8);
                    }
                    if (i16 != 9) {
                        Collections.sort(arrayList2, new el6((byte) 13));
                        if (!arrayList2.isEmpty()) {
                            ((k27) b00.f(1, arrayList2)).k.welcomeTemplateFirst = true;
                            na7Var4.H2.k(arrayList2, j8);
                        }
                    } else if (i16 == 1) {
                        Collections.sort(arrayList2, new el6((byte) 14));
                    } else if (i16 == 5) {
                        Collections.sort(arrayList2, new el6((byte) 15));
                        int i28 = i26;
                        while (i28 < arrayList2.size()) {
                            ?? r10 = (k27) arrayList2.get(i28);
                            if (r10.d4()) {
                                int i29 = r10.k.reply_to.reply_to_msg_id;
                                int i30 = i26;
                                while (true) {
                                    if (i30 >= arrayList2.size()) {
                                        break;
                                    }
                                    if (i28 == i30 || arrayList2.get(i30) == r10 || ((k27) arrayList2.get(i30)).e1() != i29) {
                                        i30++;
                                        i26 = i26;
                                    } else {
                                        r10.C = (k27) arrayList2.get(i30);
                                        r10.m();
                                        TLRPC.MessageAction messageAction3 = r10.k.action;
                                        if (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) {
                                            r10.q0(null, null);
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionGameScore) {
                                            r10.m0(null);
                                        } else {
                                            r15 = i26;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionPaymentSent) {
                                                r10.p0(null, r15);
                                            } else if (messageAction3 instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                                r10.p0(null, true);
                                            }
                                        }
                                    }
                                }
                            }
                            r15 = i26;
                            i28++;
                            i26 = r15;
                        }
                    }
                    qob.a(d);
                    final pob d2 = qob.d(qobVar2, "processLoadedMessages: runOnUIThread");
                    final long j19 = j8;
                    final long j20 = j7;
                    final qob qobVar3 = qobVar2;
                    gl.c3(new Runnable() { // from class: o67
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:50:0x0232  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            char c2;
                            int i31;
                            final int i32;
                            int i33;
                            int i34;
                            final na7 na7Var5;
                            long j21;
                            long j22;
                            HashMap hashMap2;
                            TLRPC.TL_messages_getMessages tL_messages_getMessages;
                            qob.a(d2);
                            qob qobVar4 = qobVar3;
                            pob d3 = qob.d(qobVar4, "processLoadedMessages: post runOnUIThread");
                            TLRPC.messages_Messages messages_messages5 = messages_messages;
                            ArrayList<TLRPC.User> arrayList5 = messages_messages5.users;
                            na7 na7Var6 = na7.this;
                            final boolean z15 = z;
                            na7Var6.b4(arrayList5, z15);
                            na7Var6.V3(messages_messages5.chats, z15);
                            ArrayList<TLRPC.Document> arrayList6 = messages_messages5.animatedEmoji;
                            final boolean z16 = z4;
                            if (arrayList6 != null && z16) {
                                vl.g(na7Var6.currentAccount).d(messages_messages5.animatedEmoji);
                            }
                            char c3 = 2;
                            final int i35 = i11;
                            final int i36 = i10;
                            if (i35 == 1) {
                                c2 = 2;
                                i32 = 0;
                            } else {
                                boolean z17 = z3;
                                int i37 = i6;
                                if (z17 && i36 == 2) {
                                    i31 = Integer.MAX_VALUE;
                                    int i38 = 0;
                                    while (i38 < messages_messages5.messages.size()) {
                                        TLRPC.Message message6 = messages_messages5.messages.get(i38);
                                        char c4 = c3;
                                        if ((!message6.out || message6.from_scheduled) && (i33 = message6.id) > i37 && i33 < i31) {
                                            i31 = i33;
                                        }
                                        i38++;
                                        c3 = c4;
                                    }
                                    c2 = c3;
                                } else {
                                    c2 = 2;
                                    i31 = Integer.MAX_VALUE;
                                }
                                i32 = i31 == Integer.MAX_VALUE ? i37 : i31;
                            }
                            final int i39 = i2;
                            final long j23 = j19;
                            final ArrayList arrayList7 = arrayList2;
                            if (i35 == 1 && i39 == 1) {
                                kk7 notificationCenter = na7Var6.getNotificationCenter();
                                Long valueOf3 = Long.valueOf(j23);
                                Integer valueOf4 = Integer.valueOf(arrayList7.size());
                                i34 = 1;
                                Object[] objArr = new Object[3];
                                objArr[0] = valueOf3;
                                objArr[1] = valueOf4;
                                objArr[c2] = Boolean.FALSE;
                                notificationCenter.k(kk7.q1, objArr);
                            } else {
                                i34 = 1;
                            }
                            boolean B = cf3.B(j23);
                            final int i40 = i5;
                            final boolean z18 = z2;
                            final int i41 = i7;
                            final int i42 = i8;
                            final int i43 = i9;
                            final int i44 = i12;
                            final int i45 = i3;
                            final int i46 = i13;
                            if (B || i35 == 5) {
                                na7Var5 = na7Var6;
                                j21 = j23;
                                kk7 notificationCenter2 = na7Var5.getNotificationCenter();
                                Long valueOf5 = Long.valueOf(j21);
                                Integer valueOf6 = Integer.valueOf(i39);
                                Boolean valueOf7 = Boolean.valueOf(z15);
                                Integer valueOf8 = Integer.valueOf(i32);
                                Integer valueOf9 = Integer.valueOf(i41);
                                Integer valueOf10 = Integer.valueOf(i42);
                                Integer valueOf11 = Integer.valueOf(i43);
                                Integer valueOf12 = Integer.valueOf(i36);
                                Boolean valueOf13 = Boolean.valueOf(z18);
                                Integer valueOf14 = Integer.valueOf(i40);
                                Integer valueOf15 = Integer.valueOf(i44);
                                Integer valueOf16 = Integer.valueOf(i45);
                                Integer valueOf17 = Integer.valueOf(i46);
                                Integer valueOf18 = Integer.valueOf(i35);
                                i34 = i34;
                                Object[] objArr2 = new Object[15];
                                objArr2[0] = valueOf5;
                                objArr2[i34] = valueOf6;
                                objArr2[c2] = arrayList7;
                                objArr2[3] = valueOf7;
                                objArr2[4] = valueOf8;
                                objArr2[5] = valueOf9;
                                objArr2[6] = valueOf10;
                                objArr2[7] = valueOf11;
                                objArr2[8] = valueOf12;
                                objArr2[9] = valueOf13;
                                objArr2[10] = valueOf14;
                                objArr2[11] = valueOf15;
                                objArr2[12] = valueOf16;
                                objArr2[13] = valueOf17;
                                objArr2[14] = valueOf18;
                                notificationCenter2.k(kk7.C, objArr2);
                            } else {
                                final pob d4 = qob.d(qobVar4, "loadReplyMessagesForMessages");
                                hq6 mediaDataController = na7Var6.getMediaDataController();
                                final int i47 = i;
                                na7Var5 = na7Var6;
                                Runnable runnable2 = new Runnable() { // from class: x77
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        qob.a(d4);
                                        na7 na7Var7 = na7.this;
                                        boolean z19 = z16;
                                        int i48 = i40;
                                        boolean z20 = z15;
                                        boolean z21 = z18;
                                        int i49 = i41;
                                        if (z19) {
                                            na7Var7.getNotificationCenter().k(kk7.C, Long.valueOf(j23), Integer.valueOf(i39), arrayList7, Boolean.valueOf(z20), Integer.valueOf(i32), Integer.valueOf(i49), Integer.valueOf(i42), Integer.valueOf(i43), Integer.valueOf(i36), Boolean.valueOf(z21), Integer.valueOf(i48), Integer.valueOf(i44), Integer.valueOf(i45), Integer.valueOf(i46), Integer.valueOf(i35));
                                        } else {
                                            na7Var7.getNotificationCenter().k(kk7.G, Integer.valueOf(i48), Integer.valueOf(i47), Boolean.valueOf(z20), Boolean.valueOf(z21), Integer.valueOf(i49));
                                        }
                                    }
                                };
                                j21 = j23;
                                mediaDataController.Y0(arrayList7, j21, i35, j20, runnable2, i40, qobVar4);
                            }
                            ArrayList arrayList8 = arrayList3;
                            if (!arrayList8.isEmpty()) {
                                vf6 vf6Var15 = na7Var5.H1;
                                if (!arrayList8.isEmpty()) {
                                    int i48 = i34;
                                    final boolean z19 = i35 == i48 ? i48 : 0;
                                    final ArrayList<Integer> arrayList9 = new ArrayList<>();
                                    TLRPC.Chat K0 = cf3.y(j21) ? na7Var5.K0(Long.valueOf(-j21)) : null;
                                    if (hc2.T(K0)) {
                                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                                        tL_channels_getMessages.channel = na7.g1(K0);
                                        tL_channels_getMessages.id = arrayList9;
                                        tL_messages_getMessages = tL_channels_getMessages;
                                    } else {
                                        TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                                        tL_messages_getMessages2.id = arrayList9;
                                        tL_messages_getMessages = tL_messages_getMessages2;
                                    }
                                    TLRPC.TL_messages_getMessages tL_messages_getMessages3 = tL_messages_getMessages;
                                    ArrayList arrayList10 = (ArrayList) vf6Var15.f(j21);
                                    for (int i49 = 0; i49 < arrayList8.size(); i49++) {
                                        Integer num3 = (Integer) arrayList8.get(i49);
                                        if (arrayList10 == null || !arrayList10.contains(num3)) {
                                            arrayList9.add(num3);
                                        }
                                    }
                                    if (!arrayList9.isEmpty()) {
                                        if (arrayList10 == null) {
                                            arrayList10 = tb4.s(vf6Var15, j21);
                                        }
                                        arrayList10.addAll(arrayList9);
                                        ConnectionsManager connectionsManager = na7Var5.getConnectionsManager();
                                        final long j24 = j21;
                                        final na7 na7Var7 = na7Var5;
                                        RequestDelegate requestDelegate = new RequestDelegate() { // from class: l87
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                na7 na7Var8 = na7.this;
                                                ConcurrentHashMap concurrentHashMap3 = na7Var8.Q;
                                                ConcurrentHashMap concurrentHashMap4 = na7Var8.P;
                                                if (tL_error != null) {
                                                    return;
                                                }
                                                TLRPC.messages_Messages messages_messages6 = (TLRPC.messages_Messages) tLObject;
                                                vf6 vf6Var16 = new vf6();
                                                for (int i50 = 0; i50 < messages_messages6.users.size(); i50++) {
                                                    TLRPC.User user3 = messages_messages6.users.get(i50);
                                                    vf6Var16.k(user3, user3.id);
                                                }
                                                vf6 vf6Var17 = new vf6();
                                                for (int i51 = 0; i51 < messages_messages6.chats.size(); i51++) {
                                                    TLRPC.Chat chat2 = messages_messages6.chats.get(i51);
                                                    vf6Var17.k(chat2, chat2.id);
                                                }
                                                long j25 = j24;
                                                Integer num4 = (Integer) concurrentHashMap4.get(Long.valueOf(j25));
                                                if (num4 == null) {
                                                    num4 = Integer.valueOf(na7Var8.getMessagesStorage().S(j25, false));
                                                    concurrentHashMap4.put(Long.valueOf(j25), num4);
                                                }
                                                Integer num5 = num4;
                                                Integer num6 = (Integer) concurrentHashMap3.get(Long.valueOf(j25));
                                                boolean z20 = true;
                                                if (num6 == null) {
                                                    num6 = Integer.valueOf(na7Var8.getMessagesStorage().S(j25, true));
                                                    concurrentHashMap3.put(Long.valueOf(j25), num6);
                                                }
                                                Integer num7 = num6;
                                                ArrayList arrayList11 = new ArrayList();
                                                int i52 = 0;
                                                while (true) {
                                                    int size5 = messages_messages6.messages.size();
                                                    ArrayList<TLRPC.Message> arrayList12 = messages_messages6.messages;
                                                    if (i52 >= size5) {
                                                        fl5.S(arrayList12);
                                                        na7Var8.getMessagesStorage().e1(-1, 0, i35, j25, 0L, messages_messages6, false);
                                                        gl.c3(new m77((Object) na7Var8, j25, (Object) arrayList9, (Object) arrayList11, (byte) 18));
                                                        return;
                                                    }
                                                    TLRPC.Message message7 = arrayList12.get(i52);
                                                    message7.dialog_id = j25;
                                                    if (!z19) {
                                                        message7.unread = (message7.out ? num7 : num5).intValue() < message7.id ? z20 : false;
                                                    }
                                                    ArrayList arrayList13 = arrayList11;
                                                    arrayList13.add(new k27(na7Var8.currentAccount, message7, vf6Var16, vf6Var17, true, true));
                                                    i52++;
                                                    arrayList11 = arrayList13;
                                                    z20 = true;
                                                }
                                            }
                                        };
                                        j22 = j24;
                                        i35 = i35;
                                        connectionsManager.sendRequest(tL_messages_getMessages3, requestDelegate);
                                        hashMap2 = hashMap;
                                        if (!hashMap2.isEmpty()) {
                                            na7Var5.g4(j22, hashMap2, i35);
                                        }
                                        qob.a(d3);
                                        qob.b(qobVar4);
                                    }
                                }
                            }
                            j22 = j21;
                            hashMap2 = hashMap;
                            if (!hashMap2.isEmpty()) {
                            }
                            qob.a(d3);
                            qob.b(qobVar4);
                        }
                    });
                }
            }
        }
        j5 = j3;
        z6 = true;
        z7 = false;
        if (!z) {
        }
        if (i4 == 0) {
        }
        vf6Var = new vf6();
        vf6Var2 = new vf6();
        while (i14 < messages_messages2.users.size()) {
        }
        while (i15 < messages_messages2.chats.size()) {
        }
        vf6 vf6Var82 = na7Var2.G1;
        vf6 vf6Var92 = na7Var2.F1;
        vf6 vf6Var102 = na7Var2.E1;
        vf6 vf6Var112 = na7Var2.D1;
        vf6 vf6Var122 = na7Var2.C1;
        boolean z132 = z12;
        if (i11 == 1) {
        }
        if (cf3.B(j11)) {
        }
        qobVar2 = qobVar;
        na7Var = na7Var2;
        vf6Var3 = vf6Var;
        vf6Var4 = vf6Var2;
        j6 = 0;
        size = messages_messages2.messages.size();
        if (z) {
        }
        if (z4) {
        }
        final na7 na7Var42 = na7Var;
        final ArrayList arrayList22 = new ArrayList();
        final ArrayList arrayList32 = new ArrayList();
        final HashMap hashMap2 = new HashMap();
        i17 = z8;
        int i262 = i17;
        while (i17 < size) {
        }
        na7Var42.getFileLoader().l(arrayList22);
        if (gba.o() == 2) {
        }
        if (w01.a) {
        }
        if (i16 != 9) {
        }
        qob.a(d);
        final pob d22 = qob.d(qobVar2, "processLoadedMessages: runOnUIThread");
        final long j192 = j8;
        final long j202 = j7;
        final qob qobVar32 = qobVar2;
        gl.c3(new Runnable() { // from class: o67
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0232  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                char c2;
                int i31;
                final int i32;
                int i33;
                int i34;
                final na7 na7Var5;
                long j21;
                long j22;
                HashMap hashMap22;
                TLRPC.TL_messages_getMessages tL_messages_getMessages;
                qob.a(d22);
                qob qobVar4 = qobVar32;
                pob d3 = qob.d(qobVar4, "processLoadedMessages: post runOnUIThread");
                TLRPC.messages_Messages messages_messages5 = messages_messages;
                ArrayList<TLRPC.User> arrayList5 = messages_messages5.users;
                na7 na7Var6 = na7.this;
                final boolean z15 = z;
                na7Var6.b4(arrayList5, z15);
                na7Var6.V3(messages_messages5.chats, z15);
                ArrayList<TLRPC.Document> arrayList6 = messages_messages5.animatedEmoji;
                final boolean z16 = z4;
                if (arrayList6 != null && z16) {
                    vl.g(na7Var6.currentAccount).d(messages_messages5.animatedEmoji);
                }
                char c3 = 2;
                final int i35 = i11;
                final int i36 = i10;
                if (i35 == 1) {
                    c2 = 2;
                    i32 = 0;
                } else {
                    boolean z17 = z3;
                    int i37 = i6;
                    if (z17 && i36 == 2) {
                        i31 = Integer.MAX_VALUE;
                        int i38 = 0;
                        while (i38 < messages_messages5.messages.size()) {
                            TLRPC.Message message6 = messages_messages5.messages.get(i38);
                            char c4 = c3;
                            if ((!message6.out || message6.from_scheduled) && (i33 = message6.id) > i37 && i33 < i31) {
                                i31 = i33;
                            }
                            i38++;
                            c3 = c4;
                        }
                        c2 = c3;
                    } else {
                        c2 = 2;
                        i31 = Integer.MAX_VALUE;
                    }
                    i32 = i31 == Integer.MAX_VALUE ? i37 : i31;
                }
                final int i39 = i2;
                final long j23 = j192;
                final ArrayList arrayList7 = arrayList22;
                if (i35 == 1 && i39 == 1) {
                    kk7 notificationCenter = na7Var6.getNotificationCenter();
                    Long valueOf3 = Long.valueOf(j23);
                    Integer valueOf4 = Integer.valueOf(arrayList7.size());
                    i34 = 1;
                    Object[] objArr = new Object[3];
                    objArr[0] = valueOf3;
                    objArr[1] = valueOf4;
                    objArr[c2] = Boolean.FALSE;
                    notificationCenter.k(kk7.q1, objArr);
                } else {
                    i34 = 1;
                }
                boolean B = cf3.B(j23);
                final int i40 = i5;
                final boolean z18 = z2;
                final int i41 = i7;
                final int i42 = i8;
                final int i43 = i9;
                final int i44 = i12;
                final int i45 = i3;
                final int i46 = i13;
                if (B || i35 == 5) {
                    na7Var5 = na7Var6;
                    j21 = j23;
                    kk7 notificationCenter2 = na7Var5.getNotificationCenter();
                    Long valueOf5 = Long.valueOf(j21);
                    Integer valueOf6 = Integer.valueOf(i39);
                    Boolean valueOf7 = Boolean.valueOf(z15);
                    Integer valueOf8 = Integer.valueOf(i32);
                    Integer valueOf9 = Integer.valueOf(i41);
                    Integer valueOf10 = Integer.valueOf(i42);
                    Integer valueOf11 = Integer.valueOf(i43);
                    Integer valueOf12 = Integer.valueOf(i36);
                    Boolean valueOf13 = Boolean.valueOf(z18);
                    Integer valueOf14 = Integer.valueOf(i40);
                    Integer valueOf15 = Integer.valueOf(i44);
                    Integer valueOf16 = Integer.valueOf(i45);
                    Integer valueOf17 = Integer.valueOf(i46);
                    Integer valueOf18 = Integer.valueOf(i35);
                    i34 = i34;
                    Object[] objArr2 = new Object[15];
                    objArr2[0] = valueOf5;
                    objArr2[i34] = valueOf6;
                    objArr2[c2] = arrayList7;
                    objArr2[3] = valueOf7;
                    objArr2[4] = valueOf8;
                    objArr2[5] = valueOf9;
                    objArr2[6] = valueOf10;
                    objArr2[7] = valueOf11;
                    objArr2[8] = valueOf12;
                    objArr2[9] = valueOf13;
                    objArr2[10] = valueOf14;
                    objArr2[11] = valueOf15;
                    objArr2[12] = valueOf16;
                    objArr2[13] = valueOf17;
                    objArr2[14] = valueOf18;
                    notificationCenter2.k(kk7.C, objArr2);
                } else {
                    final pob d4 = qob.d(qobVar4, "loadReplyMessagesForMessages");
                    hq6 mediaDataController = na7Var6.getMediaDataController();
                    final int i47 = i;
                    na7Var5 = na7Var6;
                    Runnable runnable2 = new Runnable() { // from class: x77
                        @Override // java.lang.Runnable
                        public final void run() {
                            qob.a(d4);
                            na7 na7Var7 = na7.this;
                            boolean z19 = z16;
                            int i48 = i40;
                            boolean z20 = z15;
                            boolean z21 = z18;
                            int i49 = i41;
                            if (z19) {
                                na7Var7.getNotificationCenter().k(kk7.C, Long.valueOf(j23), Integer.valueOf(i39), arrayList7, Boolean.valueOf(z20), Integer.valueOf(i32), Integer.valueOf(i49), Integer.valueOf(i42), Integer.valueOf(i43), Integer.valueOf(i36), Boolean.valueOf(z21), Integer.valueOf(i48), Integer.valueOf(i44), Integer.valueOf(i45), Integer.valueOf(i46), Integer.valueOf(i35));
                            } else {
                                na7Var7.getNotificationCenter().k(kk7.G, Integer.valueOf(i48), Integer.valueOf(i47), Boolean.valueOf(z20), Boolean.valueOf(z21), Integer.valueOf(i49));
                            }
                        }
                    };
                    j21 = j23;
                    mediaDataController.Y0(arrayList7, j21, i35, j202, runnable2, i40, qobVar4);
                }
                ArrayList arrayList8 = arrayList32;
                if (!arrayList8.isEmpty()) {
                    vf6 vf6Var15 = na7Var5.H1;
                    if (!arrayList8.isEmpty()) {
                        int i48 = i34;
                        final boolean z19 = i35 == i48 ? i48 : 0;
                        final ArrayList arrayList9 = new ArrayList<>();
                        TLRPC.Chat K0 = cf3.y(j21) ? na7Var5.K0(Long.valueOf(-j21)) : null;
                        if (hc2.T(K0)) {
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = na7.g1(K0);
                            tL_channels_getMessages.id = arrayList9;
                            tL_messages_getMessages = tL_channels_getMessages;
                        } else {
                            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages2.id = arrayList9;
                            tL_messages_getMessages = tL_messages_getMessages2;
                        }
                        TLRPC.TL_messages_getMessages tL_messages_getMessages3 = tL_messages_getMessages;
                        ArrayList arrayList10 = (ArrayList) vf6Var15.f(j21);
                        for (int i49 = 0; i49 < arrayList8.size(); i49++) {
                            Integer num3 = (Integer) arrayList8.get(i49);
                            if (arrayList10 == null || !arrayList10.contains(num3)) {
                                arrayList9.add(num3);
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            if (arrayList10 == null) {
                                arrayList10 = tb4.s(vf6Var15, j21);
                            }
                            arrayList10.addAll(arrayList9);
                            ConnectionsManager connectionsManager = na7Var5.getConnectionsManager();
                            final long j24 = j21;
                            final na7 na7Var7 = na7Var5;
                            RequestDelegate requestDelegate = new RequestDelegate() { // from class: l87
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    na7 na7Var8 = na7.this;
                                    ConcurrentHashMap concurrentHashMap3 = na7Var8.Q;
                                    ConcurrentHashMap concurrentHashMap4 = na7Var8.P;
                                    if (tL_error != null) {
                                        return;
                                    }
                                    TLRPC.messages_Messages messages_messages6 = (TLRPC.messages_Messages) tLObject;
                                    vf6 vf6Var16 = new vf6();
                                    for (int i50 = 0; i50 < messages_messages6.users.size(); i50++) {
                                        TLRPC.User user3 = messages_messages6.users.get(i50);
                                        vf6Var16.k(user3, user3.id);
                                    }
                                    vf6 vf6Var17 = new vf6();
                                    for (int i51 = 0; i51 < messages_messages6.chats.size(); i51++) {
                                        TLRPC.Chat chat2 = messages_messages6.chats.get(i51);
                                        vf6Var17.k(chat2, chat2.id);
                                    }
                                    long j25 = j24;
                                    Integer num4 = (Integer) concurrentHashMap4.get(Long.valueOf(j25));
                                    if (num4 == null) {
                                        num4 = Integer.valueOf(na7Var8.getMessagesStorage().S(j25, false));
                                        concurrentHashMap4.put(Long.valueOf(j25), num4);
                                    }
                                    Integer num5 = num4;
                                    Integer num6 = (Integer) concurrentHashMap3.get(Long.valueOf(j25));
                                    boolean z20 = true;
                                    if (num6 == null) {
                                        num6 = Integer.valueOf(na7Var8.getMessagesStorage().S(j25, true));
                                        concurrentHashMap3.put(Long.valueOf(j25), num6);
                                    }
                                    Integer num7 = num6;
                                    ArrayList arrayList11 = new ArrayList();
                                    int i52 = 0;
                                    while (true) {
                                        int size5 = messages_messages6.messages.size();
                                        ArrayList<TLRPC.Message> arrayList12 = messages_messages6.messages;
                                        if (i52 >= size5) {
                                            fl5.S(arrayList12);
                                            na7Var8.getMessagesStorage().e1(-1, 0, i35, j25, 0L, messages_messages6, false);
                                            gl.c3(new m77((Object) na7Var8, j25, (Object) arrayList9, (Object) arrayList11, (byte) 18));
                                            return;
                                        }
                                        TLRPC.Message message7 = arrayList12.get(i52);
                                        message7.dialog_id = j25;
                                        if (!z19) {
                                            message7.unread = (message7.out ? num7 : num5).intValue() < message7.id ? z20 : false;
                                        }
                                        ArrayList arrayList13 = arrayList11;
                                        arrayList13.add(new k27(na7Var8.currentAccount, message7, vf6Var16, vf6Var17, true, true));
                                        i52++;
                                        arrayList11 = arrayList13;
                                        z20 = true;
                                    }
                                }
                            };
                            j22 = j24;
                            i35 = i35;
                            connectionsManager.sendRequest(tL_messages_getMessages3, requestDelegate);
                            hashMap22 = hashMap2;
                            if (!hashMap22.isEmpty()) {
                                na7Var5.g4(j22, hashMap22, i35);
                            }
                            qob.a(d3);
                            qob.b(qobVar4);
                        }
                    }
                }
                j22 = j21;
                hashMap22 = hashMap2;
                if (!hashMap22.isEmpty()) {
                }
                qob.a(d3);
                qob.b(qobVar4);
            }
        });
    }

    public final void N4(int i, long j) {
        TLRPC.UserFull userFull;
        TLRPC.TL_messages_setHistoryTTL tL_messages_setHistoryTTL = new TLRPC.TL_messages_setHistoryTTL();
        tL_messages_setHistoryTTL.peer = h1(j);
        tL_messages_setHistoryTTL.period = i;
        getConnectionsManager().sendRequest(tL_messages_setHistoryTTL, new y47(this, (byte) 2));
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j);
        if (dialog != null) {
            dialog.ttl_period = i;
        }
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new bb7(messagesStorage, i, j, (byte) 0));
        TLRPC.ChatFull chatFull = null;
        if (j > 0) {
            userFull = W1(j);
            if (userFull != null) {
                userFull.ttl_period = i;
                userFull.flags |= TLObject.FLAG_14;
            }
        } else {
            TLRPC.ChatFull L0 = L0(-j);
            if (L0 != null) {
                L0.ttl_period = i;
                boolean z = L0 instanceof TLRPC.TL_channelFull;
                int i2 = L0.flags;
                if (z) {
                    L0.flags = i2 | 16777216;
                } else {
                    L0.flags = i2 | TLObject.FLAG_14;
                }
            }
            chatFull = L0;
            userFull = null;
        }
        if (chatFull != null) {
            kk7 notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(kk7.S, chatFull, 0, bool, bool);
        } else if (userFull != null) {
            getNotificationCenter().k(kk7.D0, Long.valueOf(j), userFull);
        }
    }

    public final void O(Activity activity, TLRPC.Chat chat, d dVar, sc7 sc7Var) {
        TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = new TLRPC.TL_channels_convertToGigagroup();
        tL_channels_convertToGigagroup.channel = g1(chat);
        hd hdVar = activity != null ? new hd(3, null, activity) : null;
        int sendRequest = getConnectionsManager().sendRequest(tL_channels_convertToGigagroup, new kn0((Object) this, (Object) activity, (Object) hdVar, (Object) sc7Var, (Object) dVar, (Object) tL_channels_convertToGigagroup, (byte) 2));
        if (hdVar != null) {
            hdVar.setOnCancelListener(new k77(this, sendRequest, (byte) 1));
            try {
                hdVar.q(400L);
            } catch (Exception unused) {
            }
        }
    }

    public final c86 O0(long j) {
        TLRPC.Chat K0;
        c86 c86Var = new c86();
        ArrayList arrayList = (ArrayList) this.x.f(j);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
                long j2 = dialog.id;
                if (j2 >= 0 || (K0 = K0(Long.valueOf(-j2))) == null || !(K0.forum || (K0.monoforum && hc2.A(this.currentAccount, K0, 24)))) {
                    int i2 = c86Var.a;
                    int i3 = dialog.unread_count;
                    c86Var.a = i2 + i3;
                    c86Var.b += dialog.unread_mentions_count;
                    c86Var.c += dialog.unread_reactions_count;
                    c86Var.d += dialog.unread_poll_votes_count;
                    boolean z = c86Var.e;
                    if (!z && i3 > 0) {
                        c86Var.e = z | (!n2(dialog.id, 0L, null));
                    }
                } else {
                    q1(this.currentAccount).g4.h(K0.id);
                    int i4 = c86Var.a;
                    int[] iArr = pub.w;
                    int i5 = iArr[0];
                    c86Var.a = i4 + i5;
                    c86Var.b += iArr[1];
                    c86Var.c += iArr[2];
                    c86Var.d += iArr[4];
                    boolean z2 = c86Var.e;
                    if (!z2 && i5 > 0) {
                        c86Var.e = z2 | (iArr[3] != 0);
                    }
                }
            }
        }
        return c86Var;
    }

    public final ic O1() {
        ic icVar = this.j4;
        if (icVar != null) {
            return icVar;
        }
        ic icVar2 = new ic(this.currentAccount);
        this.j4 = icVar2;
        return icVar2;
    }

    public final boolean O2() {
        if (M2()) {
            return false;
        }
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        return tL_webBrowserSettings == null || tL_webBrowserSettings.display_close_button;
    }

    public final void O3(int i, int i2, long j) {
        if (w01.a) {
            ug8.q(j, ir2.p("processNewChannelDifferenceParams pts = ", i, " pts_count = ", i2, " channeldId = "));
        }
        LongSparseIntArray longSparseIntArray = this.P0;
        int i3 = longSparseIntArray.get(j);
        if (i3 == 0) {
            i3 = getMessagesStorage().M(j);
            if (i3 == 0) {
                i3 = 1;
            }
            longSparseIntArray.put(j, i3);
        }
        if (i3 + i2 == i) {
            if (w01.a) {
                fa4.b("APPLY CHANNEL PTS");
            }
            longSparseIntArray.put(j, i);
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new bb7(messagesStorage, i, j, (byte) 5));
            return;
        }
        if (i3 != i) {
            LongSparseLongArray longSparseLongArray = this.O0;
            long j2 = longSparseLongArray.get(j);
            if (!((Boolean) this.Q0.g(Boolean.FALSE, j)).booleanValue() && j2 != 0 && Math.abs(System.currentTimeMillis() - j2) > 1500) {
                G0(j);
                return;
            }
            if (w01.a) {
                fa4.b("ADD CHANNEL UPDATE TO QUEUE pts = " + i + " pts_count = " + i2);
            }
            if (j2 == 0) {
                longSparseLongArray.put(j, System.currentTimeMillis());
            }
            la7 la7Var = new la7();
            la7Var.pts = i;
            la7Var.pts_count = i2;
            la7Var.chat_id = j;
            vf6 vf6Var = this.N0;
            ArrayList arrayList = (ArrayList) vf6Var.f(j);
            if (arrayList == null) {
                arrayList = tb4.s(vf6Var, j);
            }
            arrayList.add(la7Var);
        }
    }

    public final void O4(t97 t97Var, boolean z) {
        if (t97Var != null) {
            Integer valueOf = Integer.valueOf(t97Var.a);
            HashSet hashSet = this.n4;
            if (z != hashSet.contains(valueOf)) {
                int i = t97Var.a;
                if (z) {
                    hashSet.add(Integer.valueOf(i));
                } else {
                    hashSet.remove(Integer.valueOf(i));
                }
                C4();
                Z4(null);
                getNotificationCenter().k(kk7.O2, Integer.valueOf(t97Var.a));
            }
        }
    }

    public final void P(Context context, long j, d dVar, vc7 vc7Var, n92 n92Var) {
        TLRPC.TL_messages_migrateChat tL_messages_migrateChat = new TLRPC.TL_messages_migrateChat();
        tL_messages_migrateChat.chat_id = j;
        hd hdVar = context != null ? new hd(3, null, context) : null;
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_migrateChat, new j77(this, context, hdVar, vc7Var, j, n92Var, dVar, tL_messages_migrateChat));
        if (hdVar != null) {
            hdVar.setOnCancelListener(new k77(this, sendRequest, (byte) 0));
            try {
                hdVar.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void P0(p8c p8cVar) {
        if (this.a5 != null && System.currentTimeMillis() - this.Z4 < 3600000) {
            if (p8cVar != null) {
                p8cVar.a(this.a5);
                return;
            }
            return;
        }
        ArrayList arrayList = this.Y4;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.Y4 = arrayList;
        }
        if (p8cVar != null) {
            arrayList.add(p8cVar);
        }
        if (this.X4) {
            return;
        }
        this.X4 = true;
        getConnectionsManager().sendRequest(new TL_account.getContentSettings(), new y47(this, (byte) 25));
    }

    public final v4c P1() {
        v4c v4cVar = this.g0;
        if (v4cVar != null) {
            return v4cVar;
        }
        synchronized (t5[this.currentAccount]) {
            v4c v4cVar2 = this.g0;
            if (v4cVar2 != null) {
                return v4cVar2;
            }
            v4c v4cVar3 = new v4c(this.currentAccount);
            this.g0 = v4cVar3;
            return v4cVar3;
        }
    }

    public final void P3(int i, int i2, int i3) {
        if (w01.a) {
            b00.p(i3, ir2.p("processNewDifferenceParams seq = -1 pts = ", i, " date = ", i2, " pts_count = "));
        }
        if (i != -1) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.G();
            if (messagesStorage.r + i3 == i) {
                if (w01.a) {
                    fa4.b("APPLY PTS");
                }
                getMessagesStorage().F1(i);
                ad7 messagesStorage2 = getMessagesStorage();
                ad7 messagesStorage3 = getMessagesStorage();
                messagesStorage3.G();
                int i4 = messagesStorage3.w;
                ad7 messagesStorage4 = getMessagesStorage();
                messagesStorage4.G();
                int i5 = messagesStorage4.r;
                ad7 messagesStorage5 = getMessagesStorage();
                messagesStorage5.G();
                int i6 = messagesStorage5.n;
                ad7 messagesStorage6 = getMessagesStorage();
                messagesStorage6.G();
                messagesStorage2.x1(i4, i5, i6, messagesStorage6.s);
                return;
            }
            ad7 messagesStorage7 = getMessagesStorage();
            messagesStorage7.G();
            if (messagesStorage7.r != i) {
                if (!this.Y1 && this.Z0 != 0 && Math.abs(System.currentTimeMillis() - this.Z0) > 1500) {
                    V0();
                    return;
                }
                if (w01.a) {
                    fa4.b("ADD UPDATE TO QUEUE pts = " + i + " pts_count = " + i3);
                }
                if (this.Z0 == 0) {
                    this.Z0 = System.currentTimeMillis();
                }
                la7 la7Var = new la7();
                la7Var.pts = i;
                la7Var.pts_count = i3;
                this.W0.add(la7Var);
            }
        }
    }

    public final void P4(long j, long j2) {
        this.X3.edit().putLong(ls6.n(j, "forumlasttopic"), j2).apply();
    }

    public final int Q(String str, ArrayList arrayList, String str2, int i, boolean z, Location location, String str3, int i2, d dVar) {
        if (i == 0 && !z) {
            TLRPC.TL_messages_createChat tL_messages_createChat = new TLRPC.TL_messages_createChat();
            tL_messages_createChat.title = str;
            if (i2 >= 0) {
                tL_messages_createChat.ttl_period = i2;
                tL_messages_createChat.flags |= 1;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.User V1 = V1((Long) arrayList.get(i3));
                if (V1 != null) {
                    tL_messages_createChat.users.add(o1(V1));
                }
            }
            return getConnectionsManager().sendRequest(tL_messages_createChat, new k45(this, dVar, tL_messages_createChat, (byte) 17), 2);
        }
        if (!z && i != 2 && i != 4 && i != 5) {
            return 0;
        }
        TLRPC.TL_channels_createChannel tL_channels_createChannel = new TLRPC.TL_channels_createChannel();
        tL_channels_createChannel.title = str;
        if (str2 == null) {
            str2 = "";
        }
        tL_channels_createChannel.about = str2;
        tL_channels_createChannel.for_import = z;
        if (z || i == 4 || i == 5) {
            tL_channels_createChannel.megagroup = true;
        } else {
            tL_channels_createChannel.broadcast = true;
        }
        tL_channels_createChannel.forum = i == 5;
        if (location != null) {
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_channels_createChannel.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = location.getLatitude();
            tL_channels_createChannel.geo_point._long = location.getLongitude();
            tL_channels_createChannel.address = str3;
            tL_channels_createChannel.flags |= 4;
        }
        return getConnectionsManager().sendRequest(tL_channels_createChannel, new k45(this, dVar, tL_channels_createChannel, (byte) 18), 2);
    }

    public final TLRPC.Dialog Q0(long j) {
        return (TLRPC.Dialog) this.R.f(j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Q2(TLRPC.TL_help_appConfig tL_help_appConfig) {
        boolean z;
        int i;
        char c;
        gr grVar;
        int i2;
        boolean z2;
        int i3;
        int i4;
        TLRPC.TL_jsonObject tL_jsonObject;
        boolean z3;
        HashMap hashMap;
        int i5;
        int i6;
        long parseLong;
        boolean z4;
        int i7;
        boolean y4;
        HashMap hashMap2;
        TLRPC.TL_jsonObject tL_jsonObject2;
        int i8;
        int i9;
        int i10;
        int intValue;
        char c2;
        int i11;
        int i12;
        ArrayList<TLRPC.TL_jsonObjectValue> arrayList;
        char c3;
        int i13;
        if (tL_help_appConfig != null) {
            TLRPC.JSONValue jSONValue = tL_help_appConfig.config;
            if (jSONValue instanceof TLRPC.TL_jsonObject) {
                TLRPC.TL_jsonObject tL_jsonObject3 = (TLRPC.TL_jsonObject) jSONValue;
                SharedPreferences sharedPreferences = this.X3;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                this.K3 = new HashSet();
                sharedPreferences.edit().remove("ignoreRestrictionReasons").apply();
                gr grVar2 = this.k4;
                qr2 qr2Var = grVar2.a;
                HashMap hashMap3 = qr2Var.a;
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                int size = tL_jsonObject3.value.size();
                for (int i14 = 0; i14 < size; i14++) {
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject3.value.get(i14);
                    fr2 fr2Var = (fr2) hashMap3.get(tL_jsonObjectValue.key);
                    if (fr2Var != null && tL_jsonObjectValue.value != null) {
                        hashSet.add(fr2Var);
                        if (fr2Var.b(edit, tL_jsonObjectValue.value) && !arrayList2.contains(fr2Var)) {
                            arrayList2.add(fr2Var);
                        }
                    }
                }
                for (fr2 fr2Var2 : hashMap3.values()) {
                    if (!hashSet.contains(fr2Var2) && fr2Var2.c(edit)) {
                        arrayList2.add(fr2Var2);
                    }
                }
                qr2Var.c.addAll(arrayList2);
                boolean z5 = !arrayList2.isEmpty();
                int size2 = tL_jsonObject3.value.size();
                boolean z6 = z5;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                TLRPC.TL_jsonObject tL_jsonObject4 = null;
                boolean z7 = false;
                while (i15 < size2) {
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue2 = tL_jsonObject3.value.get(i15);
                    String str = tL_jsonObjectValue2.key;
                    str.getClass();
                    switch (str.hashCode()) {
                        case -2031587591:
                            if (str.equals("telegram_antispam_user_id")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1688620344:
                            if (str.equals("dialog_filters_tooltip")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1318497457:
                            if (str.equals("ignore_restriction_reasons")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1133154193:
                            if (str.equals("lite_app_options")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1086302656:
                            if (str.equals("lite_device_class")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1032177933:
                            if (str.equals("emojies_send_dice")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -538467216:
                            if (str.equals("ton_stakedice_stake_suggested_amounts")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -381432266:
                            if (str.equals("premium_promo_order")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -297801185:
                            if (str.equals("business_promo_order")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -232883529:
                            if (str.equals("emojies_send_dice_success")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 59202071:
                            if (str.equals("stargifts_craft_attribute_permilles")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 222975416:
                            if (str.equals("gif_search_emojies")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 280936278:
                            if (str.equals("stories_posting")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 812427767:
                            if (str.equals("login_google_oauth_client_id")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 992898905:
                            if (str.equals("inapp_update_check_delay")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1181024400:
                            if (str.equals("stars_groupcall_message_limits")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1366527782:
                            if (str.equals("transcribe_audio_trial_cooldown_until")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1468149675:
                            if (str.equals("transcribe_audio_trial_weekly_number")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1520575749:
                            if (str.equals("whitelisted_bots")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1637671355:
                            if (str.equals("web_app_allowed_protocols")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1850325103:
                            if (str.equals("emojies_sounds")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1953570861:
                            if (str.equals("starref_start_param_prefixes")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    TLRPC.TL_jsonObject tL_jsonObject5 = tL_jsonObject3;
                    switch (c) {
                        case 0:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue2.value;
                            if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                                try {
                                    parseLong = Long.parseLong(((TLRPC.TL_jsonString) jSONValue2).value);
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                                if (parseLong != this.L3) {
                                    this.L3 = parseLong;
                                    edit.putLong("telegramAntispamUserId", parseLong);
                                    z6 = true;
                                    tL_jsonObject4 = tL_jsonObject;
                                    z7 = z3;
                                    i16 = i4;
                                    break;
                                }
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                        case 1:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue3 = tL_jsonObjectValue2.value;
                            if ((jSONValue3 instanceof TLRPC.TL_jsonBool) && (z4 = ((TLRPC.TL_jsonBool) jSONValue3).value) != this.n3) {
                                this.n3 = z4;
                                edit.putBoolean("showFiltersTooltip", z4);
                                getNotificationCenter().k(kk7.Q2, new Object[0]);
                                z6 = true;
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 2:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            HashSet hashSet2 = new HashSet();
                            TLRPC.JSONValue jSONValue4 = tL_jsonObjectValue2.value;
                            if (jSONValue4 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue4;
                                int size3 = tL_jsonArray.value.size();
                                for (int i18 = 0; i18 < size3; i18++) {
                                    TLRPC.JSONValue jSONValue5 = tL_jsonArray.value.get(i18);
                                    if (jSONValue5 instanceof TLRPC.TL_jsonString) {
                                        hashSet2.add(((TLRPC.TL_jsonString) jSONValue5).value.toLowerCase());
                                    }
                                }
                            }
                            if (!this.K3.equals(hashSet2)) {
                                this.K3 = hashSet2;
                                edit.putStringSet("ignoreRestrictionReasons", hashSet2);
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                z6 = true;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 3:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue6 = tL_jsonObjectValue2.value;
                            if (jSONValue6 instanceof TLRPC.TL_jsonObject) {
                                tL_jsonObject4 = (TLRPC.TL_jsonObject) jSONValue6;
                                z6 = z2;
                                z7 = z3;
                                i16 = i4;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                        case 4:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue7 = tL_jsonObjectValue2.value;
                            if ((jSONValue7 instanceof TLRPC.TL_jsonNumber) && (i7 = (int) ((TLRPC.TL_jsonNumber) jSONValue7).value) > 0) {
                                gba.v(i7 - 1);
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 5:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            HashSet hashSet3 = new HashSet();
                            TLRPC.JSONValue jSONValue8 = tL_jsonObjectValue2.value;
                            if (jSONValue8 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray2 = (TLRPC.TL_jsonArray) jSONValue8;
                                int size4 = tL_jsonArray2.value.size();
                                for (int i19 = 0; i19 < size4; i19++) {
                                    TLRPC.JSONValue jSONValue9 = tL_jsonArray2.value.get(i19);
                                    if (jSONValue9 instanceof TLRPC.TL_jsonString) {
                                        hashSet3.add(((TLRPC.TL_jsonString) jSONValue9).value.replace("️", ""));
                                    }
                                }
                            }
                            if (!this.y3.equals(hashSet3)) {
                                this.y3 = hashSet3;
                                edit.putStringSet("diceEmojies", hashSet3);
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                z6 = true;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 6:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue10 = tL_jsonObjectValue2.value;
                            if (jSONValue10 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray3 = (TLRPC.TL_jsonArray) jSONValue10;
                                long[] jArr = new long[tL_jsonArray3.value.size()];
                                for (int i20 = 0; i20 < tL_jsonArray3.value.size(); i20++) {
                                    if (tL_jsonArray3.value.get(i20) instanceof TLRPC.TL_jsonNumber) {
                                        jArr[i20] = (long) ((TLRPC.TL_jsonNumber) tL_jsonArray3.value.get(i20)).value;
                                    }
                                }
                                if (!Arrays.equals(jArr, this.U3)) {
                                    this.U3 = jArr;
                                    edit.putString("tonStakediceStakeSuggestedAmounts", (String) DesugarArrays.stream(jArr).mapToObj(new q77()).collect(Collectors.joining(",")));
                                    z6 = true;
                                    tL_jsonObject4 = tL_jsonObject;
                                    z7 = z3;
                                    i16 = i4;
                                    break;
                                }
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                        case 7:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue11 = tL_jsonObjectValue2.value;
                            if (jSONValue11 instanceof TLRPC.TL_jsonArray) {
                                y4 = y4("premiumFeaturesTypesToPosition", this.E0, edit, ((TLRPC.TL_jsonArray) jSONValue11).value);
                                z6 = z2 | y4;
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                        case '\b':
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue12 = tL_jsonObjectValue2.value;
                            if (jSONValue12 instanceof TLRPC.TL_jsonArray) {
                                y4 = y4("businessFeaturesTypesToPosition", this.F0, edit, ((TLRPC.TL_jsonArray) jSONValue12).value);
                                z6 = z2 | y4;
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                        case '\t':
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            try {
                                hashMap2 = new HashMap();
                                TLRPC.JSONValue jSONValue13 = tL_jsonObjectValue2.value;
                                if (jSONValue13 instanceof TLRPC.TL_jsonObject) {
                                    TLRPC.TL_jsonObject tL_jsonObject6 = (TLRPC.TL_jsonObject) jSONValue13;
                                    int size5 = tL_jsonObject6.value.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        TLRPC.TL_jsonObjectValue tL_jsonObjectValue3 = tL_jsonObject6.value.get(i21);
                                        TLRPC.JSONValue jSONValue14 = tL_jsonObjectValue3.value;
                                        if (jSONValue14 instanceof TLRPC.TL_jsonObject) {
                                            TLRPC.TL_jsonObject tL_jsonObject7 = (TLRPC.TL_jsonObject) jSONValue14;
                                            int size6 = tL_jsonObject7.value.size();
                                            int i22 = 0;
                                            int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                            int i24 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                            while (i22 < size6) {
                                                TLRPC.TL_jsonObjectValue tL_jsonObjectValue4 = tL_jsonObject7.value.get(i22);
                                                TLRPC.TL_jsonObject tL_jsonObject8 = tL_jsonObject6;
                                                if (tL_jsonObjectValue4.value instanceof TLRPC.TL_jsonNumber) {
                                                    i10 = size5;
                                                    if ("value".equals(tL_jsonObjectValue4.key)) {
                                                        i24 = (int) ((TLRPC.TL_jsonNumber) tL_jsonObjectValue4.value).value;
                                                    } else if ("frame_start".equals(tL_jsonObjectValue4.key)) {
                                                        i23 = (int) ((TLRPC.TL_jsonNumber) tL_jsonObjectValue4.value).value;
                                                    }
                                                } else {
                                                    i10 = size5;
                                                }
                                                i22++;
                                                tL_jsonObject6 = tL_jsonObject8;
                                                size5 = i10;
                                            }
                                            tL_jsonObject2 = tL_jsonObject6;
                                            i8 = size5;
                                            if (i23 != Integer.MAX_VALUE && (i9 = i24) != Integer.MAX_VALUE) {
                                                hashMap2.put(tL_jsonObjectValue3.key.replace("️", ""), new x97(i23, i9));
                                            }
                                        } else {
                                            tL_jsonObject2 = tL_jsonObject6;
                                            i8 = size5;
                                        }
                                        i21++;
                                        tL_jsonObject6 = tL_jsonObject2;
                                        size5 = i8;
                                    }
                                }
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                            if (!this.A3.equals(hashMap2)) {
                                this.A3 = hashMap2;
                                SerializedData serializedData = new SerializedData();
                                serializedData.writeInt32(this.A3.size());
                                for (Map.Entry entry : this.A3.entrySet()) {
                                    serializedData.writeString((String) entry.getKey());
                                    x97 x97Var = (x97) entry.getValue();
                                    serializedData.writeInt32(x97Var.a);
                                    serializedData.writeInt32(x97Var.b);
                                }
                                edit.putString("diceSuccess", Base64.encodeToString(serializedData.toByteArray(), 0));
                                serializedData.cleanup();
                                z6 = true;
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case '\n':
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue15 = tL_jsonObjectValue2.value;
                            if (jSONValue15 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray4 = (TLRPC.TL_jsonArray) jSONValue15;
                                int[][] iArr = new int[tL_jsonArray4.value.size()][];
                                for (int i25 = 0; i25 < tL_jsonArray4.value.size(); i25++) {
                                    if (tL_jsonArray4.value.get(i25) instanceof TLRPC.TL_jsonArray) {
                                        TLRPC.TL_jsonArray tL_jsonArray5 = (TLRPC.TL_jsonArray) tL_jsonArray4.value.get(i25);
                                        iArr[i25] = new int[tL_jsonArray5.value.size()];
                                        for (int i26 = 0; i26 < tL_jsonArray5.value.size(); i26++) {
                                            if (tL_jsonArray5.value.get(i26) instanceof TLRPC.TL_jsonNumber) {
                                                iArr[i25][i26] = (int) ((TLRPC.TL_jsonNumber) tL_jsonArray5.value.get(i26)).value;
                                            }
                                        }
                                    }
                                }
                                if (!Arrays.deepEquals(iArr, this.V3)) {
                                    this.V3 = iArr;
                                    edit.putString("stargiftsCraftAttributesPermilles", (String) DesugarArrays.stream(iArr).map(new xz((byte) 14)).collect(Collectors.joining(",,")));
                                    tL_jsonObject4 = tL_jsonObject;
                                    z7 = z3;
                                    i16 = i4;
                                    z6 = true;
                                    break;
                                }
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 11:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            ArrayList arrayList3 = new ArrayList();
                            TLRPC.JSONValue jSONValue16 = tL_jsonObjectValue2.value;
                            if (jSONValue16 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray6 = (TLRPC.TL_jsonArray) jSONValue16;
                                int size7 = tL_jsonArray6.value.size();
                                for (int i27 = 0; i27 < size7; i27++) {
                                    TLRPC.JSONValue jSONValue17 = tL_jsonArray6.value.get(i27);
                                    if (jSONValue17 instanceof TLRPC.TL_jsonString) {
                                        arrayList3.add(((TLRPC.TL_jsonString) jSONValue17).value.replace("️", ""));
                                    }
                                }
                            }
                            if (!this.x3.equals(arrayList3)) {
                                this.x3 = arrayList3;
                                SerializedData serializedData2 = new SerializedData();
                                serializedData2.writeInt32(this.x3.size());
                                int size8 = this.x3.size();
                                for (int i28 = 0; i28 < size8; i28++) {
                                    serializedData2.writeString((String) this.x3.get(i28));
                                }
                                edit.putString("gifSearchEmojies", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                serializedData2.cleanup();
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                z6 = true;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case '\f':
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue18 = tL_jsonObjectValue2.value;
                            if (jSONValue18 instanceof TLRPC.TL_jsonString) {
                                TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue18;
                                if (TextUtils.equals(tL_jsonString.value, this.R3)) {
                                    z6 = z2;
                                    z7 = z3;
                                } else {
                                    String str2 = tL_jsonString.value;
                                    this.R3 = str2;
                                    edit.putString("storiesPosting", str2);
                                    z6 = true;
                                    z7 = true;
                                }
                                tL_jsonObject4 = tL_jsonObject;
                                i16 = i4;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                        case '\r':
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue19 = tL_jsonObjectValue2.value;
                            if (jSONValue19 instanceof TLRPC.TL_jsonString) {
                                String str3 = ((TLRPC.TL_jsonString) jSONValue19).value;
                                if (!Objects.equals(w01.h, str3)) {
                                    w01.h = str3;
                                    edit.putString("googleAuthClientId", str3);
                                    z6 = true;
                                    tL_jsonObject4 = tL_jsonObject;
                                    z7 = z3;
                                    i16 = i4;
                                    break;
                                }
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                        case 14:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue20 = tL_jsonObjectValue2.value;
                            if (jSONValue20 instanceof TLRPC.TL_jsonNumber) {
                                double d = ((TLRPC.TL_jsonNumber) jSONValue20).value;
                                if (d != this.h3) {
                                    int i29 = (int) d;
                                    this.h3 = i29;
                                    edit.putInt("updateCheckDelay", i29);
                                }
                                z6 = z2;
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                break;
                            } else {
                                if ((jSONValue20 instanceof TLRPC.TL_jsonString) && (intValue = Utilities.z(((TLRPC.TL_jsonString) jSONValue20).value).intValue()) != this.h3) {
                                    this.h3 = intValue;
                                    edit.putInt("updateCheckDelay", intValue);
                                }
                                z6 = z2;
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                            }
                            z6 = true;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 15:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue21 = tL_jsonObjectValue2.value;
                            if (jSONValue21 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray7 = (TLRPC.TL_jsonArray) jSONValue21;
                                int size9 = tL_jsonArray7.value.size() * 7;
                                int[] iArr2 = new int[size9];
                                int i30 = 0;
                                while (i30 < tL_jsonArray7.value.size()) {
                                    TLRPC.JSONValue jSONValue22 = tL_jsonArray7.value.get(i30);
                                    if (jSONValue22 instanceof TLRPC.TL_jsonObject) {
                                        ArrayList<TLRPC.TL_jsonObjectValue> arrayList4 = ((TLRPC.TL_jsonObject) jSONValue22).value;
                                        int size10 = arrayList4.size();
                                        int i31 = 0;
                                        while (i31 < size10) {
                                            int i32 = i31 + 1;
                                            TLRPC.TL_jsonObjectValue tL_jsonObjectValue5 = arrayList4.get(i31);
                                            TLRPC.JSONValue jSONValue23 = tL_jsonObjectValue5.value;
                                            if (jSONValue23 instanceof TLRPC.TL_jsonNumber) {
                                                int i33 = (int) ((TLRPC.TL_jsonNumber) jSONValue23).value;
                                                String str4 = tL_jsonObjectValue5.key;
                                                str4.getClass();
                                                switch (str4.hashCode()) {
                                                    case -1544802595:
                                                        if (str4.equals("text_length_max")) {
                                                            c3 = 0;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -1186480213:
                                                        if (str4.equals("pin_period")) {
                                                            c3 = 1;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case 109757537:
                                                        if (str4.equals("stars")) {
                                                            c3 = 2;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case 1686749675:
                                                        if (str4.equals("emoji_max")) {
                                                            c3 = 3;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    default:
                                                        c3 = 65535;
                                                        break;
                                                }
                                                switch (c3) {
                                                    case 0:
                                                        i13 = 2;
                                                        break;
                                                    case 1:
                                                        i13 = 1;
                                                        break;
                                                    case 2:
                                                        i13 = 0;
                                                        break;
                                                    case 3:
                                                        i13 = 3;
                                                        break;
                                                    default:
                                                        i13 = -1;
                                                        break;
                                                }
                                                if (i13 >= 0) {
                                                    iArr2[(i30 * 7) + i13] = i33;
                                                }
                                            } else if (jSONValue23 instanceof TLRPC.TL_jsonString) {
                                                String str5 = ((TLRPC.TL_jsonString) jSONValue23).value;
                                                String str6 = tL_jsonObjectValue5.key;
                                                str6.getClass();
                                                switch (str6.hashCode()) {
                                                    case -1354842834:
                                                        if (str6.equals("color1")) {
                                                            c2 = 0;
                                                            break;
                                                        }
                                                        c2 = 65535;
                                                        break;
                                                    case -1354842833:
                                                        if (str6.equals("color2")) {
                                                            c2 = 1;
                                                            break;
                                                        }
                                                        c2 = 65535;
                                                        break;
                                                    case -628825439:
                                                        if (str6.equals("color_bg")) {
                                                            c2 = 2;
                                                            break;
                                                        }
                                                        c2 = 65535;
                                                        break;
                                                    default:
                                                        c2 = 65535;
                                                        break;
                                                }
                                                switch (c2) {
                                                    case 0:
                                                        i11 = 4;
                                                        break;
                                                    case 1:
                                                        i11 = 5;
                                                        break;
                                                    case 2:
                                                        i11 = 6;
                                                        break;
                                                    default:
                                                        i11 = -1;
                                                        break;
                                                }
                                                if (i11 >= 0) {
                                                    try {
                                                        i12 = i30;
                                                        arrayList = arrayList4;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        i12 = i30;
                                                        arrayList = arrayList4;
                                                    }
                                                    try {
                                                        iArr2[(i12 * 7) + i11] = (int) Long.parseLong("FF" + str5, 16);
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        fa4.g(e, true);
                                                        i31 = i32;
                                                        i30 = i12;
                                                        arrayList4 = arrayList;
                                                    }
                                                    i31 = i32;
                                                    i30 = i12;
                                                    arrayList4 = arrayList;
                                                }
                                            }
                                            i12 = i30;
                                            arrayList = arrayList4;
                                            i31 = i32;
                                            i30 = i12;
                                            arrayList4 = arrayList;
                                        }
                                    }
                                    i30++;
                                }
                                int[] iArr3 = this.T3;
                                if (iArr3 != null && size9 == iArr3.length) {
                                    for (int i34 = 0; i34 < size9; i34++) {
                                        if (iArr2[i34] == iArr3[i34]) {
                                        }
                                    }
                                }
                                this.T3 = iArr2;
                                edit.putString("starsGroupcallMessageLimits", (String) DesugarArrays.stream(iArr2).mapToObj(new z57((byte) 1)).collect(Collectors.joining(",")));
                                z6 = true;
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 16:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue24 = tL_jsonObjectValue2.value;
                            if (jSONValue24 instanceof TLRPC.TL_jsonNumber) {
                                i17 = (int) ((TLRPC.TL_jsonNumber) jSONValue24).value;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 17:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            TLRPC.JSONValue jSONValue25 = tL_jsonObjectValue2.value;
                            if (jSONValue25 instanceof TLRPC.TL_jsonNumber) {
                                i16 = (int) ((TLRPC.TL_jsonNumber) jSONValue25).value;
                                z6 = z2;
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 18:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            HashSet hashSet4 = new HashSet();
                            TLRPC.JSONValue jSONValue26 = tL_jsonObjectValue2.value;
                            if (jSONValue26 instanceof TLRPC.TL_jsonArray) {
                                ArrayList<TLRPC.JSONValue> arrayList5 = ((TLRPC.TL_jsonArray) jSONValue26).value;
                                for (int i35 = 0; i35 < arrayList5.size(); i35++) {
                                    if (arrayList5.get(i35) instanceof TLRPC.TL_jsonNumber) {
                                        hashSet4.add(Long.valueOf((long) ((TLRPC.TL_jsonNumber) arrayList5.get(i35)).value));
                                    }
                                }
                            }
                            if (!hashSet4.equals(this.S3)) {
                                this.S3 = hashSet4;
                                edit.putStringSet("whitelistedBots", (Set) Collection.-EL.stream(hashSet4).map(new xz((byte) 13)).collect(Collectors.toCollection(new lm1((byte) 1))));
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                z6 = true;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 19:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            HashSet hashSet5 = new HashSet();
                            TLRPC.JSONValue jSONValue27 = tL_jsonObjectValue2.value;
                            if (jSONValue27 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray8 = (TLRPC.TL_jsonArray) jSONValue27;
                                int size11 = tL_jsonArray8.value.size();
                                for (int i36 = 0; i36 < size11; i36++) {
                                    TLRPC.JSONValue jSONValue28 = tL_jsonArray8.value.get(i36);
                                    if (jSONValue28 instanceof TLRPC.TL_jsonString) {
                                        hashSet5.add(((TLRPC.TL_jsonString) jSONValue28).value.toLowerCase());
                                    }
                                }
                            }
                            if (!this.J3.equals(hashSet5)) {
                                this.J3 = hashSet5;
                                edit.putStringSet("webAppAllowedProtocols", hashSet5);
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                                z6 = true;
                                break;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 20:
                            try {
                                hashMap = new HashMap();
                                TLRPC.JSONValue jSONValue29 = tL_jsonObjectValue2.value;
                                if (jSONValue29 instanceof TLRPC.TL_jsonObject) {
                                    TLRPC.TL_jsonObject tL_jsonObject9 = (TLRPC.TL_jsonObject) jSONValue29;
                                    int size12 = tL_jsonObject9.value.size();
                                    i2 = size2;
                                    int i37 = 0;
                                    while (i37 < size12) {
                                        z2 = z6;
                                        try {
                                            TLRPC.TL_jsonObjectValue tL_jsonObjectValue6 = tL_jsonObject9.value.get(i37);
                                            int i38 = i37;
                                            TLRPC.JSONValue jSONValue30 = tL_jsonObjectValue6.value;
                                            TLRPC.TL_jsonObject tL_jsonObject10 = tL_jsonObject9;
                                            if (jSONValue30 instanceof TLRPC.TL_jsonObject) {
                                                TLRPC.TL_jsonObject tL_jsonObject11 = (TLRPC.TL_jsonObject) jSONValue30;
                                                int size13 = tL_jsonObject11.value.size();
                                                grVar = grVar2;
                                                i5 = size12;
                                                i3 = i15;
                                                i4 = i16;
                                                tL_jsonObject = tL_jsonObject4;
                                                z3 = z7;
                                                long j = 0;
                                                long j2 = 0;
                                                String str7 = null;
                                                int i39 = 0;
                                                while (i39 < size13) {
                                                    int i40 = size13;
                                                    try {
                                                        TLRPC.TL_jsonObjectValue tL_jsonObjectValue7 = tL_jsonObject11.value.get(i39);
                                                        TLRPC.TL_jsonObject tL_jsonObject12 = tL_jsonObject11;
                                                        if (tL_jsonObjectValue7.value instanceof TLRPC.TL_jsonString) {
                                                            i6 = i39;
                                                            if ("id".equals(tL_jsonObjectValue7.key)) {
                                                                j2 = Utilities.A(((TLRPC.TL_jsonString) tL_jsonObjectValue7.value).value).longValue();
                                                            } else if ("access_hash".equals(tL_jsonObjectValue7.key)) {
                                                                j = Utilities.A(((TLRPC.TL_jsonString) tL_jsonObjectValue7.value).value).longValue();
                                                            } else if ("file_reference_base64".equals(tL_jsonObjectValue7.key)) {
                                                                str7 = ((TLRPC.TL_jsonString) tL_jsonObjectValue7.value).value;
                                                            }
                                                        } else {
                                                            i6 = i39;
                                                        }
                                                        i39 = i6 + 1;
                                                        size13 = i40;
                                                        tL_jsonObject11 = tL_jsonObject12;
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        fa4.g(e, true);
                                                        z6 = z2;
                                                        tL_jsonObject4 = tL_jsonObject;
                                                        z7 = z3;
                                                        i16 = i4;
                                                        i15 = i3 + 1;
                                                        tL_jsonObject3 = tL_jsonObject5;
                                                        size2 = i2;
                                                        grVar2 = grVar;
                                                    }
                                                }
                                                if (j2 != 0 && j != 0 && str7 != null) {
                                                    String replace = tL_jsonObjectValue6.key.replace("️", "");
                                                    y97 y97Var = new y97();
                                                    y97Var.a = j2;
                                                    y97Var.b = j;
                                                    y97Var.c = Base64.decode(str7, 8);
                                                    hashMap.put(replace, y97Var);
                                                }
                                            } else {
                                                grVar = grVar2;
                                                i5 = size12;
                                                i3 = i15;
                                                i4 = i16;
                                                tL_jsonObject = tL_jsonObject4;
                                                z3 = z7;
                                            }
                                            i37 = i38 + 1;
                                            tL_jsonObject9 = tL_jsonObject10;
                                            size12 = i5;
                                            z6 = z2;
                                            tL_jsonObject4 = tL_jsonObject;
                                            z7 = z3;
                                            i15 = i3;
                                            i16 = i4;
                                            grVar2 = grVar;
                                        } catch (Exception e6) {
                                            e = e6;
                                            grVar = grVar2;
                                            i3 = i15;
                                            i4 = i16;
                                            tL_jsonObject = tL_jsonObject4;
                                            z3 = z7;
                                            fa4.g(e, true);
                                            z6 = z2;
                                            tL_jsonObject4 = tL_jsonObject;
                                            z7 = z3;
                                            i16 = i4;
                                            i15 = i3 + 1;
                                            tL_jsonObject3 = tL_jsonObject5;
                                            size2 = i2;
                                            grVar2 = grVar;
                                        }
                                    }
                                } else {
                                    i2 = size2;
                                }
                                grVar = grVar2;
                                z2 = z6;
                                i3 = i15;
                                i4 = i16;
                                tL_jsonObject = tL_jsonObject4;
                                z3 = z7;
                            } catch (Exception e7) {
                                e = e7;
                                grVar = grVar2;
                                i2 = size2;
                                z2 = z6;
                            }
                            if (!this.B3.equals(hashMap)) {
                                this.B3 = hashMap;
                                SerializedData serializedData3 = new SerializedData();
                                serializedData3.writeInt32(this.B3.size());
                                for (Map.Entry entry2 : this.B3.entrySet()) {
                                    serializedData3.writeString((String) entry2.getKey());
                                    y97 y97Var2 = (y97) entry2.getValue();
                                    serializedData3.writeInt64(y97Var2.a);
                                    serializedData3.writeInt64(y97Var2.b);
                                    serializedData3.writeByteArray(y97Var2.c);
                                }
                                edit.putString("emojiSounds", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                serializedData3.cleanup();
                                z6 = true;
                                tL_jsonObject4 = tL_jsonObject;
                                z7 = z3;
                                i16 = i4;
                            }
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                        case 21:
                            HashSet hashSet6 = new HashSet();
                            TLRPC.JSONValue jSONValue31 = tL_jsonObjectValue2.value;
                            if (jSONValue31 instanceof TLRPC.TL_jsonArray) {
                                TLRPC.TL_jsonArray tL_jsonArray9 = (TLRPC.TL_jsonArray) jSONValue31;
                                int size14 = tL_jsonArray9.value.size();
                                int i41 = 0;
                                while (i41 < size14) {
                                    TLRPC.JSONValue jSONValue32 = tL_jsonArray9.value.get(i41);
                                    TLRPC.TL_jsonArray tL_jsonArray10 = tL_jsonArray9;
                                    if (jSONValue32 instanceof TLRPC.TL_jsonString) {
                                        hashSet6.add(((TLRPC.TL_jsonString) jSONValue32).value.toLowerCase());
                                    }
                                    i41++;
                                    tL_jsonArray9 = tL_jsonArray10;
                                }
                            }
                            if (!this.M3.equals(hashSet6)) {
                                this.M3 = hashSet6;
                                edit.putStringSet("starrefStartParamPrefixes", hashSet6);
                                grVar = grVar2;
                                i2 = size2;
                                i3 = i15;
                                z6 = true;
                                break;
                            }
                        default:
                            grVar = grVar2;
                            i2 = size2;
                            z2 = z6;
                            i3 = i15;
                            i4 = i16;
                            tL_jsonObject = tL_jsonObject4;
                            z3 = z7;
                            z6 = z2;
                            tL_jsonObject4 = tL_jsonObject;
                            z7 = z3;
                            i16 = i4;
                            break;
                    }
                    i15 = i3 + 1;
                    tL_jsonObject3 = tL_jsonObject5;
                    size2 = i2;
                    grVar2 = grVar;
                }
                gr grVar3 = grVar2;
                boolean z8 = z6;
                int i42 = i16;
                TLRPC.TL_jsonObject tL_jsonObject13 = tL_jsonObject4;
                boolean z9 = z7;
                if (i42 != this.G3) {
                    this.G3 = i42;
                    edit.putInt("transcribeAudioTrialWeeklyNumber", i42);
                    if (this.I3 <= 0 && (i17 == 0 || getConnectionsManager().getCurrentTime() > i17)) {
                        this.I3 = i42;
                        edit.putInt("transcribeAudioTrialCurrentNumber", i42);
                    } else if (this.I3 > i42) {
                        this.I3 = i42;
                        edit.putInt("transcribeAudioTrialCurrentNumber", i42);
                    }
                    z = true;
                } else {
                    z = z8;
                }
                if (i17 != this.H3) {
                    this.H3 = i17;
                    edit.putInt("transcribeAudioTrialCooldownUntil", i17);
                    gl.c3(new f67(this, (byte) 8));
                    z = true;
                }
                if (z) {
                    edit.apply();
                    gl.c3(new f67(this, (byte) 24));
                }
                if (tL_jsonObject13 != null) {
                    for (int i43 = 0; i43 < tL_jsonObject13.value.size(); i43++) {
                        TLRPC.TL_jsonObjectValue tL_jsonObjectValue8 = tL_jsonObject13.value.get(i43);
                        if ("settings_mask".equals(tL_jsonObjectValue8.key)) {
                            TLRPC.JSONValue jSONValue33 = tL_jsonObjectValue8.value;
                            if (jSONValue33 instanceof TLRPC.TL_jsonArray) {
                                ArrayList<TLRPC.JSONValue> arrayList6 = ((TLRPC.TL_jsonArray) jSONValue33).value;
                                try {
                                    e66.a = (int) ((TLRPC.TL_jsonNumber) arrayList6.get(0)).value;
                                    e66.b = (int) ((TLRPC.TL_jsonNumber) arrayList6.get(1)).value;
                                    e66.c = (int) ((TLRPC.TL_jsonNumber) arrayList6.get(2)).value;
                                } catch (Exception e8) {
                                    fa4.g(e8, true);
                                }
                            }
                        }
                        if ("battery_low".equals(tL_jsonObjectValue8.key)) {
                            TLRPC.JSONValue jSONValue34 = tL_jsonObjectValue8.value;
                            if (jSONValue34 instanceof TLRPC.TL_jsonArray) {
                                ArrayList<TLRPC.JSONValue> arrayList7 = ((TLRPC.TL_jsonArray) jSONValue34).value;
                                try {
                                    e66.d = (int) ((TLRPC.TL_jsonNumber) arrayList7.get(0)).value;
                                    e66.e = (int) ((TLRPC.TL_jsonNumber) arrayList7.get(1)).value;
                                    e66.f = (int) ((TLRPC.TL_jsonNumber) arrayList7.get(2)).value;
                                } catch (Exception e9) {
                                    fa4.g(e9, true);
                                }
                            }
                        }
                    }
                    i = 0;
                    e66.g();
                } else {
                    i = 0;
                }
                qr2 qr2Var2 = grVar3.a;
                qr2Var2.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList8 = qr2Var2.c;
                int size15 = arrayList8.size();
                for (int i44 = i; i44 < size15; i44++) {
                    linkedHashSet.addAll(((fr2) arrayList8.get(i44)).c);
                }
                arrayList8.clear();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    try {
                        ((Runnable) it.next()).run();
                    } catch (Exception e10) {
                        fa4.g(e10, true);
                    }
                }
                if (z9) {
                    gl.c3(new f67(this, (byte) 25));
                }
            }
        }
        f67 f67Var = this.w4;
        gl.r(f67Var);
        gl.d3(f67Var, 240010L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v24 org.telegram.messenger.support.LongSparseIntArray, still in use, count: 2, list:
          (r0v24 org.telegram.messenger.support.LongSparseIntArray) from 0x1cef: IF  (r0v24 org.telegram.messenger.support.LongSparseIntArray) == (null org.telegram.messenger.support.LongSparseIntArray)  -> B:1287:0x1cf1 A[HIDDEN]
          (r0v24 org.telegram.messenger.support.LongSparseIntArray) from 0x1cf6: PHI (r0v7 org.telegram.messenger.support.LongSparseIntArray) = (r0v24 org.telegram.messenger.support.LongSparseIntArray) binds: [B:1286:0x1cef] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:1030:0x1796  */
    /* JADX WARN: Removed duplicated region for block: B:1049:0x17b6  */
    /* JADX WARN: Removed duplicated region for block: B:1089:0x186f  */
    /* JADX WARN: Removed duplicated region for block: B:1091:0x1875  */
    /* JADX WARN: Removed duplicated region for block: B:1094:0x1880  */
    /* JADX WARN: Removed duplicated region for block: B:1109:0x18e1  */
    /* JADX WARN: Removed duplicated region for block: B:1130:0x194b  */
    /* JADX WARN: Removed duplicated region for block: B:1136:0x1976  */
    /* JADX WARN: Removed duplicated region for block: B:1138:0x1983  */
    /* JADX WARN: Removed duplicated region for block: B:1142:0x1997  */
    /* JADX WARN: Removed duplicated region for block: B:1150:0x19d9  */
    /* JADX WARN: Removed duplicated region for block: B:1158:0x1a19  */
    /* JADX WARN: Removed duplicated region for block: B:1163:0x19f1  */
    /* JADX WARN: Removed duplicated region for block: B:1176:0x19c4  */
    /* JADX WARN: Removed duplicated region for block: B:1178:0x19cb  */
    /* JADX WARN: Removed duplicated region for block: B:1179:0x198a  */
    /* JADX WARN: Removed duplicated region for block: B:1180:0x1979  */
    /* JADX WARN: Removed duplicated region for block: B:1190:0x17ad  */
    /* JADX WARN: Removed duplicated region for block: B:1193:0x1690  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x1582  */
    /* JADX WARN: Removed duplicated region for block: B:873:0x1590  */
    /* JADX WARN: Removed duplicated region for block: B:958:0x1665  */
    /* JADX WARN: Removed duplicated region for block: B:966:0x1693  */
    /* JADX WARN: Removed duplicated region for block: B:987:0x170e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q3(java.util.ArrayList r97, final java.util.ArrayList r98, final java.util.ArrayList r99, boolean r100, final int r101) {
        /*
            Method dump skipped, instructions count: 7857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: na7.Q3(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public final void Q4(long j, boolean z, boolean z2) {
        if (!z) {
            ArrayList arrayList = this.n0;
            if (!z2) {
                arrayList.remove(Long.valueOf(j));
                SparseArray sparseArray = (SparseArray) this.B0.f(j);
                if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        ((k27) sparseArray.valueAt(i)).v0 = false;
                    }
                }
            } else if (arrayList.contains(Long.valueOf(j))) {
                return;
            } else {
                arrayList.add(Long.valueOf(j));
            }
        }
        Utilities.d.c(new mo1(this, z, z2, j, (byte) 3));
    }

    public final long R(int i, long j) {
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2 = null;
        try {
            nativeByteBuffer = new NativeByteBuffer(16);
        } catch (Exception e) {
            e = e;
        }
        try {
            nativeByteBuffer.writeInt32(kk7.m1);
            nativeByteBuffer.writeInt64(j);
            nativeByteBuffer.writeInt32(i);
        } catch (Exception e2) {
            e = e2;
            nativeByteBuffer2 = nativeByteBuffer;
            fa4.g(e, true);
            nativeByteBuffer = nativeByteBuffer2;
            return getMessagesStorage().y(nativeByteBuffer);
        }
        return getMessagesStorage().y(nativeByteBuffer);
    }

    public final ArrayList R0() {
        ArrayList arrayList = this.H0;
        return arrayList != null ? arrayList : this.G0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x060c, code lost:
    
        if (r3.w == r36.seq_start) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0630, code lost:
    
        if (w01.a == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0632, code lost:
    
        if (r2 == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0634, code lost:
    
        r2 = new java.lang.StringBuilder("need get diff TL_updatesCombined, seq: ");
        r3 = r0.getMessagesStorage();
        r3.G();
        r2.append(r3.w);
        r2.append(r9);
        b00.p(r36.seq_start, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0650, code lost:
    
        r2 = new java.lang.StringBuilder("need get diff TL_updates, seq: ");
        r3 = r0.getMessagesStorage();
        r3.G();
        r2.append(r3.w);
        r2.append(r9);
        b00.p(r36.seq, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x066d, code lost:
    
        if (r0.Y1 != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0675, code lost:
    
        if (r0.Y0 == 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0684, code lost:
    
        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - r0.Y0) <= 1500) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0686, code lost:
    
        r8 = r1;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x068f, code lost:
    
        if (r0.Y0 != 0) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0691, code lost:
    
        r0.Y0 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0699, code lost:
    
        if (w01.a == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x069b, code lost:
    
        fa4.b("add TL_updates/Combined to queue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x06a0, code lost:
    
        r0.V0.add(r36);
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x062c, code lost:
    
        if (r4 != r3.w) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x049b, code lost:
    
        r0 = r8.pts_count + r2;
        r3 = r8.pts;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x04a0, code lost:
    
        if (r0 != r3) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x04a2, code lost:
    
        r0 = r35;
        r21 = r2;
        r10 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x04b5, code lost:
    
        if (r0.Q3(r8.updates, r36.users, r36.chats, false, r36.date) != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x04b9, code lost:
    
        if (w01.a == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x04bb, code lost:
    
        fa4.b("need get channel diff inner TL_updates, channel_id = " + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x04cc, code lost:
    
        if (r12 != null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x04ce, code lost:
    
        r12 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x04dd, code lost:
    
        if (r12.contains(java.lang.Long.valueOf(r10)) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x04df, code lost:
    
        r12.add(java.lang.Long.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x04e8, code lost:
    
        r15.put(r10, r8.pts);
        r1 = r0.getMessagesStorage();
        r1.a.c(new bb7(r1, r8.pts, r10, 5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0509, code lost:
    
        r0 = r35;
        r21 = r2;
        r10 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x050f, code lost:
    
        if (r2 == r3) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0513, code lost:
    
        if (w01.a == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0515, code lost:
    
        fa4.b(r1 + " need get channel diff, pts: " + r2 + r9 + r8.pts + " count = " + r8.pts_count + " channelId = " + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0544, code lost:
    
        r1 = r0.O0;
        r2 = r1.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0558, code lost:
    
        if (((java.lang.Boolean) r0.Q0.g(java.lang.Boolean.FALSE, r10)).booleanValue() != false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x055e, code lost:
    
        if (r2 == 0) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x056b, code lost:
    
        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - r2) <= 1500) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x056d, code lost:
    
        if (r12 != null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x056f, code lost:
    
        r12 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x057e, code lost:
    
        if (r12.contains(java.lang.Long.valueOf(r10)) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0580, code lost:
    
        r12.add(java.lang.Long.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x058d, code lost:
    
        if (r2 != 0) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x058f, code lost:
    
        r1.put(r10, java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0598, code lost:
    
        if (w01.a == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x059a, code lost:
    
        fa4.b("add to queue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x059d, code lost:
    
        r1 = r20;
        r2 = (java.util.ArrayList) r1.f(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x05a5, code lost:
    
        if (r2 != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x05a7, code lost:
    
        r2 = tb4.s(r1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x05ab, code lost:
    
        r2.add(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05d7 A[LOOP:5: B:270:0x019f->B:296:0x05d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05ec A[EDGE_INSN: B:297:0x05ec->B:298:0x05ec BREAK  A[LOOP:5: B:270:0x019f->B:296:0x05d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0855 A[EDGE_INSN: B:99:0x0855->B:100:0x0855 BREAK  A[LOOP:2: B:78:0x0814->B:87:0x0852], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R3(TLRPC.Updates updates, boolean z) {
        String str;
        vf6 vf6Var;
        ArrayList arrayList;
        long j;
        long j2;
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z2;
        long j3;
        TLRPC.User user2;
        TLRPC.Chat chat2;
        boolean z3;
        TLRPC.User user3;
        boolean z4;
        boolean z5;
        boolean z6;
        TLRPC.User user4;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        ArrayList arrayList2;
        TLRPC.UserStatus userStatus;
        int i;
        TLRPC.Chat K0;
        int i2;
        boolean z11;
        String str2;
        vf6 vf6Var2;
        int i3;
        vf6 vf6Var3;
        long j4;
        boolean z12;
        TLRPC.TL_updates tL_updates;
        long j5;
        TLRPC.Update update;
        int R1;
        int S1;
        long j6;
        boolean z13;
        long j7;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        na7 na7Var = this;
        boolean z14 = updates instanceof TLRPC.TL_updates;
        byte b = 0;
        int i4 = 1;
        if (z14 || (updates instanceof TLRPC.TL_updatesCombined)) {
            int i5 = 0;
            boolean z15 = false;
            while (i5 < updates.updates.size()) {
                TLRPC.Update update2 = updates.updates.get(i5);
                if (update2 instanceof TL_update.TL_updateMessageID) {
                    na7Var.getMessagesStorage().a.c(new oh6((Object) na7Var, update2, (byte) 22));
                    updates.updates.remove(i5);
                    i5--;
                    z15 = true;
                }
                i5++;
            }
            if (z15) {
                na7Var.getMessagesStorage().a.c(new y77(na7Var, updates, z, b));
                return;
            }
        }
        boolean z16 = updates instanceof TLRPC.TL_updateShort;
        vf6 vf6Var4 = na7Var.N0;
        if (!z16) {
            boolean z17 = updates instanceof TLRPC.TL_updateShortChatMessage;
            ArrayList arrayList6 = na7Var.W0;
            String str3 = " ";
            if (z17) {
                str = " ";
                vf6Var = vf6Var4;
                arrayList = arrayList6;
                j = 1500;
                j2 = updates.from_id;
            } else {
                if (!(updates instanceof TLRPC.TL_updateShortMessage)) {
                    boolean z18 = updates instanceof TLRPC.TL_updatesCombined;
                    LongSparseIntArray longSparseIntArray = na7Var.P0;
                    if (z18 || z14) {
                        int i6 = 0;
                        vf6 vf6Var5 = null;
                        while (i6 < updates.chats.size()) {
                            TLRPC.Chat chat3 = updates.chats.get(i6);
                            if ((chat3 instanceof TLRPC.TL_channel) && chat3.min) {
                                arrayList5 = arrayList6;
                                TLRPC.Chat K02 = na7Var.K0(Long.valueOf(chat3.id));
                                if (K02 == null || K02.min) {
                                    K02 = na7Var.getMessagesStorage().O(updates.chat_id);
                                    na7Var.T3(K02, true);
                                }
                                if (K02 == null || K02.min) {
                                    if (vf6Var5 == null) {
                                        vf6Var5 = new vf6();
                                    }
                                    vf6Var5.k(chat3, chat3.id);
                                }
                            } else {
                                arrayList5 = arrayList6;
                            }
                            i6++;
                            arrayList6 = arrayList5;
                        }
                        ArrayList arrayList7 = arrayList6;
                        if (vf6Var5 != null) {
                            for (int i7 = 0; i7 < updates.updates.size(); i7++) {
                                TLRPC.Update update3 = updates.updates.get(i7);
                                if (update3 instanceof TL_update.TL_updateNewChannelMessage) {
                                    long j8 = ((TL_update.TL_updateNewChannelMessage) update3).message.peer_id.channel_id;
                                    if (vf6Var5.h(j8) >= 0) {
                                        if (w01.a) {
                                            fa4.b("need get diff because of min channel " + j8);
                                        }
                                        i2 = 1;
                                        if (i2 != 0) {
                                            na7Var.getMessagesStorage().j1(updates.users, updates.chats, true, true);
                                            Collections.sort(updates.updates, na7Var.u4);
                                            int i8 = i2;
                                            z11 = false;
                                            arrayList2 = null;
                                            while (true) {
                                                if (updates.updates.size() <= 0) {
                                                    str2 = str3;
                                                    vf6Var2 = vf6Var4;
                                                    i3 = i8;
                                                    break;
                                                }
                                                TLRPC.Update update4 = updates.updates.get(b);
                                                if (T1(update4) != 0) {
                                                    str2 = str3;
                                                    vf6Var3 = vf6Var4;
                                                    i3 = i8;
                                                    ArrayList arrayList8 = arrayList7;
                                                    long j9 = 0;
                                                    if (T1(update4) != 1) {
                                                        long j10 = 0;
                                                        if (T1(update4) != 2) {
                                                            vf6Var2 = vf6Var3;
                                                            break;
                                                        }
                                                        long Q1 = Q1(update4);
                                                        int i9 = longSparseIntArray.get(Q1);
                                                        if (i9 == 0) {
                                                            i9 = na7Var.getMessagesStorage().M(Q1);
                                                            if (i9 == 0) {
                                                                int i10 = 0;
                                                                while (true) {
                                                                    if (i10 >= updates.chats.size()) {
                                                                        j6 = Q1;
                                                                        z13 = false;
                                                                        break;
                                                                    }
                                                                    TLRPC.Chat chat4 = updates.chats.get(i10);
                                                                    j6 = Q1;
                                                                    if (chat4.id == j6) {
                                                                        na7Var.g3(j10, chat4);
                                                                        z13 = true;
                                                                        break;
                                                                    } else {
                                                                        i10++;
                                                                        Q1 = j6;
                                                                        j10 = 0;
                                                                    }
                                                                }
                                                                z12 = z13;
                                                                j4 = j6;
                                                                tL_updates = new TLRPC.TL_updates();
                                                                tL_updates.updates.add(update4);
                                                                tL_updates.pts = R1(update4);
                                                                tL_updates.pts_count = S1(update4);
                                                                while (true) {
                                                                    if (1 < updates.updates.size()) {
                                                                        j5 = j4;
                                                                        break;
                                                                    }
                                                                    update = updates.updates.get(1);
                                                                    R1 = R1(update);
                                                                    S1 = S1(update);
                                                                    j5 = j4;
                                                                    if (T1(update) != 2 || j5 != Q1(update) || tL_updates.pts + S1 != R1) {
                                                                        break;
                                                                    }
                                                                    tL_updates.updates.add(update);
                                                                    tL_updates.pts = R1;
                                                                    tL_updates.pts_count += S1;
                                                                    updates.updates.remove(1);
                                                                    j4 = j5;
                                                                }
                                                                na7Var = this;
                                                                arrayList7 = arrayList8;
                                                                vf6Var2 = vf6Var3;
                                                                long j11 = j5;
                                                                if (w01.a) {
                                                                    fa4.b("need load unknown channel = " + j11);
                                                                }
                                                                i8 = i3;
                                                                if (updates.updates.size() > 0) {
                                                                }
                                                            } else {
                                                                j4 = Q1;
                                                                longSparseIntArray.put(j4, i9);
                                                            }
                                                        } else {
                                                            j4 = Q1;
                                                        }
                                                        z12 = false;
                                                        tL_updates = new TLRPC.TL_updates();
                                                        tL_updates.updates.add(update4);
                                                        tL_updates.pts = R1(update4);
                                                        tL_updates.pts_count = S1(update4);
                                                        while (true) {
                                                            if (1 < updates.updates.size()) {
                                                            }
                                                            tL_updates.updates.add(update);
                                                            tL_updates.pts = R1;
                                                            tL_updates.pts_count += S1;
                                                            updates.updates.remove(1);
                                                            j4 = j5;
                                                        }
                                                        na7Var = this;
                                                        arrayList7 = arrayList8;
                                                        vf6Var2 = vf6Var3;
                                                        long j112 = j5;
                                                        if (w01.a) {
                                                        }
                                                        i8 = i3;
                                                        if (updates.updates.size() > 0) {
                                                        }
                                                    } else {
                                                        TLRPC.TL_updates tL_updates2 = new TLRPC.TL_updates();
                                                        tL_updates2.updates.add(update4);
                                                        tL_updates2.pts = update4 instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update4).qts : 0;
                                                        while (true) {
                                                            if (1 >= updates.updates.size()) {
                                                                j7 = j9;
                                                                break;
                                                            }
                                                            TLRPC.Update update5 = updates.updates.get(1);
                                                            int i11 = update5 instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update5).qts : 0;
                                                            j7 = j9;
                                                            if (T1(update5) != 1 || tL_updates2.pts + 1 != i11) {
                                                                break;
                                                            }
                                                            tL_updates2.updates.add(update5);
                                                            tL_updates2.pts = i11;
                                                            updates.updates.remove(1);
                                                            j9 = j7;
                                                        }
                                                        ad7 messagesStorage = na7Var.getMessagesStorage();
                                                        messagesStorage.G();
                                                        if (messagesStorage.s != 0) {
                                                            ad7 messagesStorage2 = na7Var.getMessagesStorage();
                                                            messagesStorage2.G();
                                                            if (tL_updates2.updates.size() + messagesStorage2.s != tL_updates2.pts) {
                                                                ad7 messagesStorage3 = na7Var.getMessagesStorage();
                                                                messagesStorage3.G();
                                                                if (messagesStorage3.r != tL_updates2.pts) {
                                                                    if (w01.a) {
                                                                        StringBuilder sb = new StringBuilder();
                                                                        sb.append(update4);
                                                                        sb.append(" need get diff, qts: ");
                                                                        ad7 messagesStorage4 = na7Var.getMessagesStorage();
                                                                        messagesStorage4.G();
                                                                        sb.append(messagesStorage4.s);
                                                                        sb.append(str2);
                                                                        b00.p(tL_updates2.pts, sb);
                                                                    }
                                                                    if (na7Var.Y1 || na7Var.a1 == j7 || Math.abs(System.currentTimeMillis() - na7Var.a1) <= 1500) {
                                                                        if (na7Var.a1 == j7) {
                                                                            na7Var.a1 = System.currentTimeMillis();
                                                                        }
                                                                        if (w01.a) {
                                                                            fa4.b("add to queue");
                                                                        }
                                                                        na7Var.X0.add(tL_updates2);
                                                                    } else {
                                                                        arrayList3 = arrayList8;
                                                                        i8 = 1;
                                                                        arrayList7 = arrayList3;
                                                                        vf6Var2 = vf6Var3;
                                                                        if (updates.updates.size() > 0) {
                                                                            break;
                                                                        }
                                                                        updates.updates.remove(0);
                                                                        vf6Var4 = vf6Var2;
                                                                        b = 0;
                                                                        str3 = str2;
                                                                        i4 = 1;
                                                                    }
                                                                }
                                                                arrayList3 = arrayList8;
                                                                i8 = i3;
                                                                arrayList7 = arrayList3;
                                                                vf6Var2 = vf6Var3;
                                                                if (updates.updates.size() > 0) {
                                                                }
                                                            }
                                                        }
                                                        arrayList3 = arrayList8;
                                                        na7Var.Q3(tL_updates2.updates, updates.users, updates.chats, false, updates.date);
                                                        na7Var.getMessagesStorage().G1(tL_updates2.pts);
                                                        i8 = i3;
                                                        z11 = true;
                                                        arrayList7 = arrayList3;
                                                        vf6Var2 = vf6Var3;
                                                        if (updates.updates.size() > 0) {
                                                        }
                                                    }
                                                } else {
                                                    TLRPC.TL_updates tL_updates3 = new TLRPC.TL_updates();
                                                    tL_updates3.updates.add(update4);
                                                    tL_updates3.pts = R1(update4);
                                                    tL_updates3.pts_count = S1(update4);
                                                    while (i4 < updates.updates.size()) {
                                                        TLRPC.Update update6 = updates.updates.get(i4);
                                                        int R12 = R1(update6);
                                                        int S12 = S1(update6);
                                                        if (T1(update6) != 0 || tL_updates3.pts + S12 != R12) {
                                                            break;
                                                        }
                                                        tL_updates3.updates.add(update6);
                                                        tL_updates3.pts = R12;
                                                        tL_updates3.pts_count += S12;
                                                        updates.updates.remove(i4);
                                                    }
                                                    ad7 messagesStorage5 = na7Var.getMessagesStorage();
                                                    messagesStorage5.G();
                                                    if (messagesStorage5.r + tL_updates3.pts_count == tL_updates3.pts) {
                                                        vf6Var3 = vf6Var4;
                                                        str2 = str3;
                                                        i3 = i8;
                                                        if (na7Var.Q3(tL_updates3.updates, updates.users, updates.chats, false, updates.date)) {
                                                            na7Var.getMessagesStorage().F1(tL_updates3.pts);
                                                            arrayList4 = arrayList7;
                                                        } else {
                                                            if (w01.a) {
                                                                StringBuilder sb2 = new StringBuilder("need get diff inner TL_updates, pts: ");
                                                                ad7 messagesStorage6 = na7Var.getMessagesStorage();
                                                                messagesStorage6.G();
                                                                sb2.append(messagesStorage6.r);
                                                                sb2.append(str2);
                                                                b00.p(updates.seq, sb2);
                                                            }
                                                            arrayList4 = arrayList7;
                                                            i3 = 1;
                                                        }
                                                    } else {
                                                        str2 = str3;
                                                        vf6Var3 = vf6Var4;
                                                        i3 = i8;
                                                        ad7 messagesStorage7 = na7Var.getMessagesStorage();
                                                        messagesStorage7.G();
                                                        if (messagesStorage7.r != tL_updates3.pts) {
                                                            if (w01.a) {
                                                                StringBuilder sb3 = new StringBuilder();
                                                                sb3.append(update4);
                                                                sb3.append(" need get diff, pts: ");
                                                                ad7 messagesStorage8 = na7Var.getMessagesStorage();
                                                                messagesStorage8.G();
                                                                sb3.append(messagesStorage8.r);
                                                                sb3.append(str2);
                                                                sb3.append(tL_updates3.pts);
                                                                sb3.append(" count = ");
                                                                b00.p(tL_updates3.pts_count, sb3);
                                                            }
                                                            if (na7Var.Y1 || na7Var.Z0 == 0 || Math.abs(System.currentTimeMillis() - na7Var.Z0) <= 1500) {
                                                                if (na7Var.Z0 == 0) {
                                                                    na7Var.Z0 = System.currentTimeMillis();
                                                                }
                                                                if (w01.a) {
                                                                    fa4.b("add to queue");
                                                                }
                                                                arrayList4 = arrayList7;
                                                                arrayList4.add(tL_updates3);
                                                            }
                                                            arrayList4 = arrayList7;
                                                            i3 = 1;
                                                        }
                                                        arrayList4 = arrayList7;
                                                    }
                                                    arrayList7 = arrayList4;
                                                }
                                                vf6Var2 = vf6Var3;
                                                i8 = i3;
                                                if (updates.updates.size() > 0) {
                                                }
                                            }
                                            i8 = i3;
                                            boolean z19 = updates instanceof TLRPC.TL_updatesCombined;
                                            if (z19) {
                                                ad7 messagesStorage9 = na7Var.getMessagesStorage();
                                                messagesStorage9.G();
                                                if (messagesStorage9.w + 1 != updates.seq_start) {
                                                    ad7 messagesStorage10 = na7Var.getMessagesStorage();
                                                    messagesStorage10.G();
                                                }
                                                vf6Var = vf6Var2;
                                                na7Var.Q3(updates.updates, updates.users, updates.chats, false, updates.date);
                                                if (updates.seq != 0) {
                                                    if (updates.date != 0) {
                                                        na7Var.getMessagesStorage().E1(updates.date);
                                                    }
                                                    na7Var.getMessagesStorage().H1(updates.seq);
                                                }
                                                i4 = i8;
                                            } else {
                                                ad7 messagesStorage11 = na7Var.getMessagesStorage();
                                                messagesStorage11.G();
                                                int i12 = messagesStorage11.w + 1;
                                                int i13 = updates.seq;
                                                if (i12 != i13 && i13 != 0) {
                                                    ad7 messagesStorage12 = na7Var.getMessagesStorage();
                                                    messagesStorage12.G();
                                                }
                                                vf6Var = vf6Var2;
                                                na7Var.Q3(updates.updates, updates.users, updates.chats, false, updates.date);
                                                if (updates.seq != 0) {
                                                }
                                                i4 = i8;
                                            }
                                        } else {
                                            vf6Var = vf6Var4;
                                            i4 = i2;
                                            arrayList2 = null;
                                            z11 = false;
                                        }
                                        z10 = z11;
                                        z8 = false;
                                    }
                                }
                            }
                        }
                        i2 = 0;
                        if (i2 != 0) {
                        }
                        z10 = z11;
                        z8 = false;
                    } else if (updates instanceof TLRPC.TL_updatesTooLong) {
                        if (w01.a) {
                            fa4.b("need get diff TL_updatesTooLong");
                        }
                        z10 = false;
                        arrayList2 = null;
                        vf6Var = vf6Var4;
                        z8 = false;
                    } else if (updates instanceof ma7) {
                        na7Var.getMessagesStorage().H1(updates.seq);
                    } else if (updates instanceof la7) {
                        long j12 = updates.chat_id;
                        if (j12 != 0) {
                            longSparseIntArray.put(j12, updates.pts);
                            ad7 messagesStorage13 = na7Var.getMessagesStorage();
                            messagesStorage13.a.c(new bb7(messagesStorage13, updates.pts, updates.chat_id, (byte) 5));
                        } else {
                            na7Var.getMessagesStorage().F1(updates.pts);
                        }
                    }
                    na7Var.getSecretChatHelper().m();
                    if (!z) {
                        for (int i14 = 0; i14 < vf6Var.m(); i14++) {
                            long j13 = vf6Var.j(i14);
                            if (arrayList2 == null || !arrayList2.contains(Long.valueOf(j13))) {
                                na7Var.I3(0, j13);
                            } else {
                                na7Var.G0(j13);
                            }
                        }
                        if (i4 != 0) {
                            na7Var.V0();
                        } else {
                            for (int i15 = 0; i15 < 3; i15++) {
                                na7Var.S3(i15, 0);
                            }
                        }
                    }
                    if (z10) {
                        TLRPC.TL_messages_receivedQueue tL_messages_receivedQueue = new TLRPC.TL_messages_receivedQueue();
                        ad7 messagesStorage14 = na7Var.getMessagesStorage();
                        messagesStorage14.G();
                        tL_messages_receivedQueue.max_qts = messagesStorage14.s;
                        na7Var.getConnectionsManager().sendRequest(tL_messages_receivedQueue, null);
                    }
                    if (z8) {
                        gl.c3(new c87(na7Var, (byte) 17));
                    }
                    ad7 messagesStorage15 = na7Var.getMessagesStorage();
                    ad7 messagesStorage16 = na7Var.getMessagesStorage();
                    messagesStorage16.G();
                    int i16 = messagesStorage16.w;
                    ad7 messagesStorage17 = na7Var.getMessagesStorage();
                    messagesStorage17.G();
                    int i17 = messagesStorage17.r;
                    ad7 messagesStorage18 = na7Var.getMessagesStorage();
                    messagesStorage18.G();
                    int i18 = messagesStorage18.n;
                    ad7 messagesStorage19 = na7Var.getMessagesStorage();
                    messagesStorage19.G();
                    messagesStorage15.x1(i16, i17, i18, messagesStorage19.s);
                }
                j2 = updates.user_id;
                str = " ";
                vf6Var = vf6Var4;
                arrayList = arrayList6;
                j = 1500;
            }
            long j14 = j2;
            TLRPC.User V1 = na7Var.V1(Long.valueOf(j14));
            fa4.b("update message short userId = " + j14);
            if (V1 == null || V1.min) {
                V1 = na7Var.getMessagesStorage().h0(j14);
                if (V1 != null && V1.min) {
                    V1 = null;
                }
                na7Var.a4(V1, true, false);
            }
            TLRPC.MessageFwdHeader messageFwdHeader = updates.fwd_from;
            if (messageFwdHeader != null) {
                TLRPC.Peer peer = messageFwdHeader.from_id;
                if (peer instanceof TLRPC.TL_peerUser) {
                    user = na7Var.V1(Long.valueOf(peer.user_id));
                    if (user == null) {
                        user = na7Var.getMessagesStorage().h0(updates.fwd_from.from_id.user_id);
                        na7Var.a4(user, true, false);
                    }
                    chat = null;
                } else {
                    if (peer instanceof TLRPC.TL_peerChannel) {
                        K0 = na7Var.K0(Long.valueOf(peer.channel_id));
                        if (K0 == null) {
                            K0 = na7Var.getMessagesStorage().O(updates.fwd_from.from_id.channel_id);
                            na7Var.T3(K0, true);
                        }
                    } else if (peer instanceof TLRPC.TL_peerChat) {
                        K0 = na7Var.K0(Long.valueOf(peer.chat_id));
                        if (K0 == null) {
                            K0 = na7Var.getMessagesStorage().O(updates.fwd_from.from_id.chat_id);
                            na7Var.T3(K0, true);
                        }
                    }
                    chat = K0;
                    user = null;
                }
                z2 = true;
                j3 = updates.via_bot_id;
                if (j3 == 0) {
                    user3 = na7Var.V1(Long.valueOf(j3));
                    if (user3 == null) {
                        user2 = user;
                        chat2 = chat;
                        user3 = na7Var.getMessagesStorage().h0(updates.via_bot_id);
                        na7Var.a4(user3, true, false);
                    } else {
                        user2 = user;
                        chat2 = chat;
                    }
                    z3 = true;
                } else {
                    user2 = user;
                    chat2 = chat;
                    z3 = false;
                    user3 = null;
                }
                z4 = updates instanceof TLRPC.TL_updateShortMessage;
                if (z4) {
                    boolean z20 = z3;
                    z5 = z4;
                    TLRPC.Chat K03 = na7Var.K0(Long.valueOf(updates.chat_id));
                    if (K03 == null) {
                        z6 = z2;
                        user4 = user3;
                        K03 = na7Var.getMessagesStorage().O(updates.chat_id);
                        na7Var.T3(K03, true);
                    } else {
                        z6 = z2;
                        user4 = user3;
                    }
                    z7 = K03 == null || V1 == null || (z6 && user2 == null && chat2 == null) || (z20 && user4 == null);
                } else {
                    z7 = V1 == null || (z2 && user2 == null && chat2 == null) || (z3 && user3 == null);
                    z5 = z4;
                }
                if (!z7 && !updates.entities.isEmpty()) {
                    i = 0;
                    while (true) {
                        if (i < updates.entities.size()) {
                            break;
                        }
                        TLRPC.MessageEntity messageEntity = updates.entities.get(i);
                        if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            long j15 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                            TLRPC.User V12 = na7Var.V1(Long.valueOf(j15));
                            if (V12 == null || V12.min) {
                                TLRPC.User h0 = na7Var.getMessagesStorage().h0(j15);
                                if (h0 != null && h0.min) {
                                    h0 = null;
                                }
                                if (h0 == null) {
                                    z7 = true;
                                    break;
                                }
                                na7Var.a4(V1, true, false);
                            }
                        }
                        i++;
                    }
                }
                if (!updates.out || V1 == null || (userStatus = V1.status) == null || userStatus.expires > 0 || Math.abs(na7Var.getConnectionsManager().getCurrentTime() - updates.date) >= 30) {
                    z8 = false;
                } else {
                    na7Var.a0.put(Long.valueOf(V1.id), Integer.valueOf(updates.date));
                    z8 = true;
                }
                if (z7) {
                    ad7 messagesStorage20 = na7Var.getMessagesStorage();
                    messagesStorage20.G();
                    if (messagesStorage20.r + updates.pts_count == updates.pts) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = updates.id;
                        long e = na7Var.getUserConfig().e();
                        if (z5) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_message.from_id = tL_peerUser;
                            if (updates.out) {
                                tL_peerUser.user_id = e;
                            } else {
                                tL_peerUser.user_id = j14;
                            }
                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                            tL_message.peer_id = tL_peerUser2;
                            tL_peerUser2.user_id = j14;
                            tL_message.dialog_id = j14;
                        } else {
                            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                            tL_message.from_id = tL_peerUser3;
                            tL_peerUser3.user_id = j14;
                            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                            tL_message.peer_id = tL_peerChat;
                            long j16 = updates.chat_id;
                            tL_peerChat.chat_id = j16;
                            tL_message.dialog_id = -j16;
                        }
                        tL_message.fwd_from = updates.fwd_from;
                        tL_message.silent = updates.silent;
                        tL_message.out = updates.out;
                        tL_message.mentioned = updates.mentioned;
                        tL_message.media_unread = updates.media_unread;
                        tL_message.entities = updates.entities;
                        tL_message.message = updates.message;
                        tL_message.date = updates.date;
                        tL_message.via_bot_id = updates.via_bot_id;
                        tL_message.flags = updates.flags | 256;
                        tL_message.reply_to = updates.reply_to;
                        tL_message.ttl_period = updates.ttl_period;
                        tL_message.media = new TLRPC.TL_messageMediaEmpty();
                        ConcurrentHashMap concurrentHashMap = tL_message.out ? na7Var.Q : na7Var.P;
                        Integer num = (Integer) concurrentHashMap.get(Long.valueOf(tL_message.dialog_id));
                        if (num == null) {
                            num = Integer.valueOf(na7Var.getMessagesStorage().S(tL_message.dialog_id, tL_message.out));
                            concurrentHashMap.put(Long.valueOf(tL_message.dialog_id), num);
                        }
                        tL_message.unread = num.intValue() < tL_message.id;
                        if (tL_message.dialog_id == e) {
                            tL_message.unread = false;
                            tL_message.media_unread = false;
                            z9 = true;
                            tL_message.out = true;
                        } else {
                            z9 = true;
                        }
                        na7Var.getMessagesStorage().F1(updates.pts);
                        boolean contains = na7Var.l0.contains(Long.valueOf(tL_message.dialog_id));
                        k27 k27Var = new k27(na7Var.currentAccount, tL_message, contains, contains);
                        boolean z21 = z9;
                        ArrayList t = tb4.t(k27Var);
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.add(tL_message);
                        if (z5) {
                            boolean z22 = (updates.out || !na7Var.u5(t, updates.user_id)) ? false : z21;
                            if (z22) {
                                na7Var.t5();
                            }
                            na7Var = this;
                            gl.c3(new b61((byte) 7, j14, (gk7) this, (Object) t, z22));
                        } else {
                            boolean u5 = na7Var.u5(t, -updates.chat_id);
                            if (u5) {
                                na7Var.t5();
                            }
                            gl.c3(new d97(na7Var, u5, updates, t));
                        }
                        if (!k27Var.k.out) {
                            na7Var.getMessagesStorage().a.c(new f57(na7Var, t, (byte) 7));
                        }
                        na7Var.getMessagesStorage().g1(arrayList9, false, true, false, 0, false, 0, 0L);
                    } else {
                        ad7 messagesStorage21 = na7Var.getMessagesStorage();
                        messagesStorage21.G();
                        if (messagesStorage21.r != updates.pts) {
                            if (w01.a) {
                                StringBuilder sb4 = new StringBuilder("need get diff short message, pts: ");
                                ad7 messagesStorage22 = na7Var.getMessagesStorage();
                                messagesStorage22.G();
                                sb4.append(messagesStorage22.r);
                                sb4.append(str);
                                sb4.append(updates.pts);
                                sb4.append(" count = ");
                                b00.p(updates.pts_count, sb4);
                            }
                            if (na7Var.Y1 || na7Var.Z0 == 0 || Math.abs(System.currentTimeMillis() - na7Var.Z0) <= j) {
                                if (na7Var.Z0 == 0) {
                                    na7Var.Z0 = System.currentTimeMillis();
                                }
                                if (w01.a) {
                                    fa4.b("add to queue");
                                }
                                arrayList.add(updates);
                            } else {
                                i4 = 1;
                            }
                        }
                    }
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                z10 = false;
                arrayList2 = null;
                na7Var.getSecretChatHelper().m();
                if (!z) {
                }
                if (z10) {
                }
                if (z8) {
                }
                ad7 messagesStorage152 = na7Var.getMessagesStorage();
                ad7 messagesStorage162 = na7Var.getMessagesStorage();
                messagesStorage162.G();
                int i162 = messagesStorage162.w;
                ad7 messagesStorage172 = na7Var.getMessagesStorage();
                messagesStorage172.G();
                int i172 = messagesStorage172.r;
                ad7 messagesStorage182 = na7Var.getMessagesStorage();
                messagesStorage182.G();
                int i182 = messagesStorage182.n;
                ad7 messagesStorage192 = na7Var.getMessagesStorage();
                messagesStorage192.G();
                messagesStorage152.x1(i162, i172, i182, messagesStorage192.s);
            }
            user = null;
            chat = null;
            z2 = false;
            j3 = updates.via_bot_id;
            if (j3 == 0) {
            }
            z4 = updates instanceof TLRPC.TL_updateShortMessage;
            if (z4) {
            }
            if (!z7) {
                i = 0;
                while (true) {
                    if (i < updates.entities.size()) {
                    }
                    i++;
                }
            }
            if (updates.out) {
            }
            z8 = false;
            if (z7) {
            }
            z10 = false;
            arrayList2 = null;
            na7Var.getSecretChatHelper().m();
            if (!z) {
            }
            if (z10) {
            }
            if (z8) {
            }
            ad7 messagesStorage1522 = na7Var.getMessagesStorage();
            ad7 messagesStorage1622 = na7Var.getMessagesStorage();
            messagesStorage1622.G();
            int i1622 = messagesStorage1622.w;
            ad7 messagesStorage1722 = na7Var.getMessagesStorage();
            messagesStorage1722.G();
            int i1722 = messagesStorage1722.r;
            ad7 messagesStorage1822 = na7Var.getMessagesStorage();
            messagesStorage1822.G();
            int i1822 = messagesStorage1822.n;
            ad7 messagesStorage1922 = na7Var.getMessagesStorage();
            messagesStorage1922.G();
            messagesStorage1522.x1(i1622, i1722, i1822, messagesStorage1922.s);
        }
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(updates.update);
        na7Var.Q3(arrayList10, null, null, false, updates.date);
        z10 = false;
        i4 = 0;
        arrayList2 = null;
        vf6Var = vf6Var4;
        z8 = false;
        na7Var.getSecretChatHelper().m();
        if (!z) {
        }
        if (z10) {
        }
        if (z8) {
        }
        ad7 messagesStorage15222 = na7Var.getMessagesStorage();
        ad7 messagesStorage16222 = na7Var.getMessagesStorage();
        messagesStorage16222.G();
        int i16222 = messagesStorage16222.w;
        ad7 messagesStorage17222 = na7Var.getMessagesStorage();
        messagesStorage17222.G();
        int i17222 = messagesStorage17222.r;
        ad7 messagesStorage18222 = na7Var.getMessagesStorage();
        messagesStorage18222.G();
        int i18222 = messagesStorage18222.n;
        ad7 messagesStorage19222 = na7Var.getMessagesStorage();
        messagesStorage19222.G();
        messagesStorage15222.x1(i16222, i17222, i18222, messagesStorage19222.s);
    }

    public final void R4(long j, boolean z, boolean z2) {
        ArrayList arrayList = z ? this.p0 : this.o0;
        if (!z2) {
            arrayList.remove(Long.valueOf(j));
        } else {
            if (arrayList.contains(Long.valueOf(j))) {
                return;
            }
            arrayList.add(Long.valueOf(j));
        }
    }

    public final void S(long j, long j2) {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.H(new yb7(messagesStorage, 0, j, j2, (byte) 1));
        TLRPC.TL_messages_deleteParticipantReactions tL_messages_deleteParticipantReactions = new TLRPC.TL_messages_deleteParticipantReactions();
        tL_messages_deleteParticipantReactions.peer = h1(j);
        tL_messages_deleteParticipantReactions.participant = h1(j2);
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReactions, new np0((byte) 0));
    }

    public final w97 S0(long j) {
        vf6 vf6Var = this.z4;
        w97 w97Var = (w97) vf6Var.f(j);
        if (w97Var != null) {
            return w97Var;
        }
        w97 w97Var2 = new w97(this, j);
        vf6Var.k(w97Var2, j);
        return w97Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:312:0x06e3, code lost:
    
        if (r4 == r5) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x06e7, code lost:
    
        if (r14 == r13) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0cb5, code lost:
    
        if (r0.getCallState() == 0) goto L552;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1000:0x16d6  */
    /* JADX WARN: Removed duplicated region for block: B:1083:0x182d  */
    /* JADX WARN: Removed duplicated region for block: B:1093:0x18a8  */
    /* JADX WARN: Removed duplicated region for block: B:1107:0x1908  */
    /* JADX WARN: Removed duplicated region for block: B:1109:0x1918  */
    /* JADX WARN: Removed duplicated region for block: B:1111:0x191c  */
    /* JADX WARN: Removed duplicated region for block: B:1114:0x1922  */
    /* JADX WARN: Removed duplicated region for block: B:1123:0x195e  */
    /* JADX WARN: Removed duplicated region for block: B:1126:0x1971  */
    /* JADX WARN: Removed duplicated region for block: B:1129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1131:0x1915  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0d9c  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x123e  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x1449 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:994:0x16ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S2(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, vf6 vf6Var, int i2, LongSparseIntArray longSparseIntArray, vf6 vf6Var2, vf6 vf6Var3, ArrayList arrayList5, vf6 vf6Var4, vf6 vf6Var5, r34 r34Var, vf6 vf6Var6, boolean z, ArrayList arrayList6, ArrayList arrayList7, vf6 vf6Var7, vf6 vf6Var8, vf6 vf6Var9, ArrayList arrayList8) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        vf6 vf6Var10;
        boolean z3;
        vf6 vf6Var11;
        int i8;
        int i9;
        int i10;
        k27 k27Var;
        int i11;
        boolean z4;
        vf6 vf6Var12;
        int i12;
        int i13;
        int i14;
        int i15;
        long j;
        char c;
        boolean z5;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList9;
        ArrayList arrayList10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        ArrayList arrayList11;
        int i25;
        int i26;
        int i27;
        int i28;
        ConferenceCall conferenceCall;
        TLRPC.ChatFull L0;
        TLRPC.UserFull userFull;
        long j2;
        TLRPC.Dialog dialog;
        long j3;
        long j4;
        int i29;
        boolean z6;
        boolean z7;
        boolean z8;
        long j5;
        TLRPC.ChatFull L02;
        int i30;
        int i31;
        TLRPC.Dialog dialog2;
        fc2 e1;
        SharedPreferences.Editor editor;
        long j6;
        long j7;
        boolean z9;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        TLRPC.User user;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i32;
        boolean z10;
        int i33;
        long j8;
        String str;
        ArrayList<TLRPC.TL_username> arrayList12;
        int i34;
        na7 na7Var = this;
        ArrayList arrayList13 = arrayList;
        int i35 = kk7.D0;
        int i36 = kk7.z;
        int i37 = kk7.y;
        int i38 = kk7.l0;
        int i39 = kk7.i0;
        if (arrayList13 != null) {
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            int size = arrayList13.size();
            int i40 = i;
            int i41 = 0;
            SharedPreferences.Editor editor2 = null;
            int i42 = 0;
            z2 = false;
            while (i41 < size) {
                TLRPC.Update update = (TLRPC.Update) arrayList13.get(i41);
                int i43 = i35;
                if (update instanceof TL_update.TL_updateMessageID) {
                    i16 = i36;
                    i17 = i37;
                    na7Var.getMessagesStorage().a.c(new oh6((Object) na7Var, update, (byte) 22));
                } else {
                    i16 = i36;
                    i17 = i37;
                    int i44 = 5;
                    if (update instanceof TL_update.TL_updatePrivacy) {
                        TL_update.TL_updatePrivacy tL_updatePrivacy = (TL_update.TL_updatePrivacy) update;
                        TLRPC.PrivacyKey privacyKey = tL_updatePrivacy.key;
                        if (privacyKey instanceof TLRPC.TL_privacyKeyStatusTimestamp) {
                            na7Var.getContactsController().M(0, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyChatInvite) {
                            na7Var.getContactsController().M(1, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyPhoneCall) {
                            na7Var.getContactsController().M(2, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyPhoneP2P) {
                            na7Var.getContactsController().M(3, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyProfilePhoto) {
                            na7Var.getContactsController().M(4, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyForwards) {
                            na7Var.getContactsController().M(5, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyPhoneNumber) {
                            na7Var.getContactsController().M(6, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyAddedByPhone) {
                            na7Var.getContactsController().M(7, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyVoiceMessages) {
                            na7Var.getContactsController().M(8, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyAbout) {
                            na7Var.getContactsController().M(9, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyBirthday) {
                            na7Var.getContactsController().M(11, tL_updatePrivacy.rules);
                        } else if (privacyKey instanceof TLRPC.TL_privacyKeyStarGiftsAutoSave) {
                            na7Var.getContactsController().M(12, tL_updatePrivacy.rules);
                        }
                    } else if (update instanceof TL_update.TL_updateStarGiftAuctionState) {
                        kt4.c(na7Var.currentAccount).h((TL_update.TL_updateStarGiftAuctionState) update);
                    } else if (update instanceof TL_update.TL_updateStarGiftAuctionUserState) {
                        kt4.c(na7Var.currentAccount).i((TL_update.TL_updateStarGiftAuctionUserState) update);
                    } else if (update instanceof TL_update.TL_updateStarsRevenueStatus) {
                        ct0.g(na7Var.currentAccount).q((TL_update.TL_updateStarsRevenueStatus) update);
                    } else {
                        if (update instanceof TL_update.TL_updateUserStatus) {
                            TL_update.TL_updateUserStatus tL_updateUserStatus = (TL_update.TL_updateUserStatus) update;
                            TLRPC.User V1 = na7Var.V1(Long.valueOf(tL_updateUserStatus.user_id));
                            TLRPC.UserStatus userStatus = tL_updateUserStatus.status;
                            if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                                userStatus.expires = -100;
                            } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                                userStatus.expires = -101;
                            } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                                userStatus.expires = -102;
                            }
                            i18 = size;
                            if (V1 != null) {
                                V1.id = tL_updateUserStatus.user_id;
                                V1.status = userStatus;
                            }
                            TLRPC.TL_user tL_user = new TLRPC.TL_user();
                            tL_user.id = tL_updateUserStatus.user_id;
                            tL_user.status = tL_updateUserStatus.status;
                            arrayList15.add(tL_user);
                            if (tL_updateUserStatus.user_id == na7Var.getUserConfig().e()) {
                                na7Var.getNotificationsController().V(tL_updateUserStatus.status.expires);
                            }
                        } else {
                            i18 = size;
                            if (update instanceof TL_update.TL_updateMonoForumNoPaidException) {
                                TL_update.TL_updateMonoForumNoPaidException tL_updateMonoForumNoPaidException = (TL_update.TL_updateMonoForumNoPaidException) update;
                                gta.t(na7Var.currentAccount).Z(tL_updateMonoForumNoPaidException.channel_id, cf3.n(tL_updateMonoForumNoPaidException.saved_peer_id), tL_updateMonoForumNoPaidException.exception);
                            } else if (update instanceof TL_update.TL_updatePeerWallpaper) {
                                je2.e(na7Var.currentAccount).m((TL_update.TL_updatePeerWallpaper) update);
                            } else if (update instanceof TL_update.TL_updateUserEmojiStatus) {
                                TL_update.TL_updateUserEmojiStatus tL_updateUserEmojiStatus = (TL_update.TL_updateUserEmojiStatus) update;
                                TLRPC.User V12 = na7Var.V1(Long.valueOf(tL_updateUserEmojiStatus.user_id));
                                if (V12 != null) {
                                    V12.id = tL_updateUserEmojiStatus.user_id;
                                    V12.emoji_status = tL_updateUserEmojiStatus.emoji_status;
                                    if (l7c.D(V12)) {
                                        na7Var.getNotificationCenter().k(kk7.o5, V12);
                                    }
                                }
                                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                                tL_user2.id = tL_updateUserEmojiStatus.user_id;
                                tL_user2.emoji_status = tL_updateUserEmojiStatus.emoji_status;
                                arrayList14.add(tL_user2);
                            } else if (update instanceof TL_update.TL_updateUserName) {
                                TL_update.TL_updateUserName tL_updateUserName = (TL_update.TL_updateUserName) update;
                                TLRPC.User V13 = na7Var.V1(Long.valueOf(tL_updateUserName.user_id));
                                if (V13 != null) {
                                    if (!l7c.y(V13)) {
                                        V13.first_name = tL_updateUserName.first_name;
                                        V13.last_name = tL_updateUserName.last_name;
                                    }
                                    if (V13.usernames != null) {
                                        for (int i45 = 0; i45 < V13.usernames.size(); i45++) {
                                            TLRPC.TL_username tL_username = V13.usernames.get(i45);
                                            if (tL_username != null && !TextUtils.isEmpty(tL_username.username)) {
                                                na7Var.e.remove(tL_username.username);
                                            }
                                        }
                                    }
                                    int i46 = 0;
                                    while (true) {
                                        int size2 = tL_updateUserName.usernames.size();
                                        arrayList12 = tL_updateUserName.usernames;
                                        if (i46 >= size2) {
                                            break;
                                        }
                                        String str2 = arrayList12.get(i46).username;
                                        if (!TextUtils.isEmpty(str2) && tL_updateUserName.usernames.get(i46).active) {
                                            na7Var.e.put(str2, V13);
                                        }
                                        i46++;
                                    }
                                    if (arrayList12 != null) {
                                        int size3 = arrayList12.size();
                                        i34 = 1;
                                        if (size3 > 1) {
                                            str = null;
                                            V13.username = null;
                                            V13.usernames = tL_updateUserName.usernames;
                                        }
                                    } else {
                                        i34 = 1;
                                    }
                                    str = null;
                                    ArrayList<TLRPC.TL_username> arrayList16 = tL_updateUserName.usernames;
                                    V13.username = (arrayList16 == null || arrayList16.size() != i34) ? null : tL_updateUserName.usernames.get(0).username;
                                    V13.usernames.clear();
                                } else {
                                    str = null;
                                }
                                TLRPC.TL_user tL_user3 = new TLRPC.TL_user();
                                tL_user3.id = tL_updateUserName.user_id;
                                tL_user3.first_name = tL_updateUserName.first_name;
                                tL_user3.last_name = tL_updateUserName.last_name;
                                ArrayList<TLRPC.TL_username> arrayList17 = tL_updateUserName.usernames;
                                tL_user3.username = (arrayList17 == null || arrayList17.size() != 1) ? str : tL_updateUserName.usernames.get(0).username;
                                arrayList14.add(tL_user3);
                            } else {
                                if (update instanceof TL_update.TL_updateDialogPinned) {
                                    TL_update.TL_updateDialogPinned tL_updateDialogPinned = (TL_update.TL_updateDialogPinned) update;
                                    TLRPC.DialogPeer dialogPeer = tL_updateDialogPinned.peer;
                                    arrayList9 = arrayList14;
                                    i19 = i41;
                                    i20 = i38;
                                    arrayList10 = arrayList15;
                                    i21 = i43;
                                    i22 = i16;
                                    i23 = i17;
                                    i24 = i39;
                                    if (!na7Var.D3(dialogPeer instanceof TLRPC.TL_dialogPeer ? cf3.n(((TLRPC.TL_dialogPeer) dialogPeer).peer) : 0L, tL_updateDialogPinned.pinned, null, -1L)) {
                                        na7Var.getUserConfig().x(tL_updateDialogPinned.folder_id, false);
                                        na7Var.getUserConfig().u(false);
                                        na7Var.d3(tL_updateDialogPinned.folder_id);
                                    }
                                    i25 = i40;
                                } else {
                                    arrayList9 = arrayList14;
                                    arrayList10 = arrayList15;
                                    i19 = i41;
                                    i20 = i38;
                                    i21 = i43;
                                    i22 = i16;
                                    i23 = i17;
                                    i24 = i39;
                                    if (update instanceof TL_update.TL_updatePinnedDialogs) {
                                        TL_update.TL_updatePinnedDialogs tL_updatePinnedDialogs = (TL_update.TL_updatePinnedDialogs) update;
                                        na7Var.getUserConfig().x(tL_updatePinnedDialogs.folder_id, false);
                                        na7Var.getUserConfig().u(false);
                                        if ((tL_updatePinnedDialogs.flags & 1) != 0) {
                                            ArrayList arrayList18 = new ArrayList();
                                            ArrayList<TLRPC.DialogPeer> arrayList19 = tL_updatePinnedDialogs.order;
                                            int size4 = arrayList19.size();
                                            int i47 = 0;
                                            while (i47 < size4) {
                                                TLRPC.DialogPeer dialogPeer2 = arrayList19.get(i47);
                                                if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                                                    TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer2).peer;
                                                    i33 = i40;
                                                    long j9 = peer.user_id;
                                                    if (j9 != 0) {
                                                        j8 = j9;
                                                    } else {
                                                        long j10 = peer.chat_id;
                                                        j8 = j10 != 0 ? -j10 : -peer.channel_id;
                                                    }
                                                } else {
                                                    i33 = i40;
                                                    j8 = 0;
                                                }
                                                i47 = mue.c(i47, 1, j8, arrayList18);
                                                i40 = i33;
                                            }
                                        }
                                        na7Var.d3(tL_updatePinnedDialogs.folder_id);
                                        i25 = i40;
                                    } else {
                                        int i48 = i40;
                                        if (update instanceof TL_update.TL_updateUserPhoto) {
                                            TL_update.TL_updateUserPhoto tL_updateUserPhoto = (TL_update.TL_updateUserPhoto) update;
                                            TLRPC.User V14 = na7Var.V1(Long.valueOf(tL_updateUserPhoto.user_id));
                                            if (V14 != null) {
                                                V14.photo = tL_updateUserPhoto.photo;
                                            }
                                            TLRPC.TL_user tL_user4 = new TLRPC.TL_user();
                                            tL_user4.id = tL_updateUserPhoto.user_id;
                                            tL_user4.photo = tL_updateUserPhoto.photo;
                                            arrayList11 = arrayList9;
                                            arrayList11.add(tL_user4);
                                            if (l7c.D(V14)) {
                                                na7Var.getNotificationCenter().k(i24, new Object[0]);
                                            }
                                        } else {
                                            arrayList11 = arrayList9;
                                            if (update instanceof TL_update.TL_updateNewStoryReaction) {
                                                TL_update.TL_updateNewStoryReaction tL_updateNewStoryReaction = (TL_update.TL_updateNewStoryReaction) update;
                                                long n = cf3.n(tL_updateNewStoryReaction.peer);
                                                int i49 = tL_updateNewStoryReaction.story_id;
                                                TLRPC.Message message = new TLRPC.Message();
                                                message.id = -i49;
                                                message.dialog_id = n;
                                                message.peer_id = na7Var.w1(n);
                                                message.date = na7Var.getConnectionsManager().getCurrentTime();
                                                TLRPC.User V15 = na7Var.getMessagesController().V1(Long.valueOf(message.dialog_id));
                                                if (V15 == null || !u1(na7Var.currentAccount).getBoolean("EnableReactionsPreview", true)) {
                                                    z10 = false;
                                                    message.message = k96.Z(2131746330, new Object[0]);
                                                } else {
                                                    h19 a = h19.d(tL_updateNewStoryReaction.reaction).a();
                                                    if (a.f != null) {
                                                        message.message = k96.Z(2131746331, l7c.j(V15), a.f);
                                                        z10 = false;
                                                    } else {
                                                        z10 = false;
                                                        message.message = k96.Z(2131746330, new Object[0]);
                                                    }
                                                }
                                                ArrayList arrayList20 = new ArrayList();
                                                k27 k27Var2 = new k27(na7Var.currentAccount, message, z10, z10);
                                                k27Var2.J = true;
                                                k27Var2.a = (byte) 1;
                                                if (V15 == null || l7c.z(V15)) {
                                                    k27Var2.c = k96.L0(2131746329);
                                                } else {
                                                    k27Var2.c = l7c.j(V15);
                                                }
                                                arrayList20.add(k27Var2);
                                                na7Var.getNotificationsController().K(arrayList20, true, false, null);
                                            } else if (update instanceof TL_update.TL_updateStarsBalance) {
                                                TL_update.TL_updateStarsBalance tL_updateStarsBalance = (TL_update.TL_updateStarsBalance) update;
                                                boolean z11 = tL_updateStarsBalance.balance instanceof TL_stars.TL_starsTonAmount;
                                                gta.v(na7Var.currentAccount, z11).i0(tL_updateStarsBalance.balance);
                                                gta.v(na7Var.currentAccount, z11).P(false);
                                            } else if (update instanceof TL_update.TL_updateUser) {
                                                TL_update.TL_updateUser tL_updateUser = (TL_update.TL_updateUser) update;
                                                TLRPC.User V16 = na7Var.V1(Long.valueOf(tL_updateUser.user_id));
                                                if (arrayList2 != null) {
                                                    int i50 = 0;
                                                    while (i50 < arrayList2.size()) {
                                                        user = (TLRPC.User) arrayList2.get(i50);
                                                        if (user != null) {
                                                            i32 = i50;
                                                            if (user.id == tL_updateUser.user_id) {
                                                                break;
                                                            }
                                                        } else {
                                                            i32 = i50;
                                                        }
                                                        i50 = i32 + 1;
                                                    }
                                                }
                                                user = null;
                                                if (user != null && (userProfilePhoto = user.photo) != null) {
                                                    if (V16 != null) {
                                                        V16.photo = userProfilePhoto;
                                                    }
                                                    TLRPC.TL_user tL_user5 = new TLRPC.TL_user();
                                                    tL_user5.id = user.id;
                                                    tL_user5.photo = user.photo;
                                                    arrayList11.add(tL_user5);
                                                }
                                                if (l7c.D(V16)) {
                                                    na7Var.getNotificationCenter().k(i24, new Object[0]);
                                                }
                                            } else if (update instanceof TL_update.TL_updateUserPhone) {
                                                TL_update.TL_updateUserPhone tL_updateUserPhone = (TL_update.TL_updateUserPhone) update;
                                                TLRPC.User V17 = na7Var.V1(Long.valueOf(tL_updateUserPhone.user_id));
                                                if (V17 != null) {
                                                    V17.phone = tL_updateUserPhone.phone;
                                                    Utilities.h.c(new c57(na7Var, V17, (byte) 2));
                                                    if (l7c.D(V17)) {
                                                        na7Var.getNotificationCenter().k(i24, new Object[0]);
                                                    }
                                                }
                                                TLRPC.TL_user tL_user6 = new TLRPC.TL_user();
                                                tL_user6.id = tL_updateUserPhone.user_id;
                                                tL_user6.phone = tL_updateUserPhone.phone;
                                                arrayList11.add(tL_user6);
                                            } else {
                                                byte b = 26;
                                                if (update instanceof TL_update.TL_updateNotifySettings) {
                                                    TL_update.TL_updateNotifySettings tL_updateNotifySettings = (TL_update.TL_updateNotifySettings) update;
                                                    if (tL_updateNotifySettings.notify_settings instanceof TLRPC.TL_peerNotifySettings) {
                                                        i42 |= 32;
                                                        if (editor2 == null) {
                                                            editor2 = na7Var.W3.edit();
                                                        }
                                                        SharedPreferences.Editor editor3 = editor2;
                                                        na7Var.getConnectionsManager().getCurrentTime();
                                                        TLRPC.NotifyPeer notifyPeer = tL_updateNotifySettings.peer;
                                                        if (notifyPeer instanceof TLRPC.TL_notifyPeer) {
                                                            editor = editor3;
                                                            TLRPC.Peer peer2 = ((TLRPC.TL_notifyPeer) notifyPeer).peer;
                                                            long j11 = peer2.user_id;
                                                            if (j11 == 0) {
                                                                long j12 = peer2.chat_id;
                                                                if (j12 == 0) {
                                                                    j12 = peer2.channel_id;
                                                                }
                                                                j11 = -j12;
                                                            }
                                                            j6 = j11;
                                                            j7 = 0;
                                                        } else if (notifyPeer instanceof TLRPC.TL_notifyForumTopic) {
                                                            TLRPC.TL_notifyForumTopic tL_notifyForumTopic = (TLRPC.TL_notifyForumTopic) notifyPeer;
                                                            TLRPC.Peer peer3 = tL_notifyForumTopic.peer;
                                                            j6 = peer3.user_id;
                                                            if (j6 == 0) {
                                                                long j13 = peer3.chat_id;
                                                                j6 = j13 != 0 ? -j13 : -peer3.channel_id;
                                                            }
                                                            editor = editor3;
                                                            j7 = tL_notifyForumTopic.top_msg_id;
                                                        } else {
                                                            if (notifyPeer instanceof TLRPC.TL_notifyChats) {
                                                                TLRPC.PeerNotifySettings peerNotifySettings = tL_updateNotifySettings.notify_settings;
                                                                if ((peerNotifySettings.flags & 1) != 0) {
                                                                    editor3.putBoolean("EnablePreviewGroup", peerNotifySettings.show_previews);
                                                                }
                                                                if ((tL_updateNotifySettings.notify_settings.flags & 4) != 0) {
                                                                    int i51 = na7Var.W3.getInt("EnableGroup2", 0);
                                                                    int i52 = tL_updateNotifySettings.notify_settings.mute_until;
                                                                    if (i51 != i52) {
                                                                        editor3.putInt("EnableGroup2", i52);
                                                                        editor3.putBoolean("overwrite_group", true);
                                                                        gl.c3(new f67(na7Var, (byte) 13));
                                                                    }
                                                                }
                                                                editor = editor3;
                                                                na7Var.getNotificationsController().h0.a(tL_updateNotifySettings.notify_settings.android_sound, editor, 0L, 0L, 0);
                                                            } else {
                                                                if (notifyPeer instanceof TLRPC.TL_notifyUsers) {
                                                                    TLRPC.PeerNotifySettings peerNotifySettings2 = tL_updateNotifySettings.notify_settings;
                                                                    if ((peerNotifySettings2.flags & 1) != 0) {
                                                                        editor3.putBoolean("EnablePreviewAll", peerNotifySettings2.show_previews);
                                                                    }
                                                                    int i53 = tL_updateNotifySettings.notify_settings.flags;
                                                                    if (na7Var.W3.contains("EnableAllStories")) {
                                                                        z9 = true;
                                                                        bool = Boolean.valueOf(na7Var.W3.getBoolean("EnableAllStories", true));
                                                                    } else {
                                                                        z9 = true;
                                                                        bool = null;
                                                                    }
                                                                    Boolean valueOf = na7Var.W3.contains("EnableHideStoriesSenders") ? Boolean.valueOf(na7Var.W3.getBoolean("EnableHideStoriesSenders", z9)) : null;
                                                                    TLRPC.PeerNotifySettings peerNotifySettings3 = tL_updateNotifySettings.notify_settings;
                                                                    if ((peerNotifySettings3.flags & 64) != 0) {
                                                                        boolean z12 = !peerNotifySettings3.stories_muted;
                                                                        Boolean valueOf2 = Boolean.valueOf(z12);
                                                                        editor3.putBoolean("EnableAllStories", z12);
                                                                        bool2 = valueOf2;
                                                                    } else {
                                                                        bool2 = null;
                                                                    }
                                                                    TLRPC.PeerNotifySettings peerNotifySettings4 = tL_updateNotifySettings.notify_settings;
                                                                    if ((peerNotifySettings4.flags & 128) != 0) {
                                                                        boolean z13 = peerNotifySettings4.stories_hide_sender;
                                                                        bool3 = Boolean.valueOf(z13);
                                                                        editor3.putBoolean("EnableHideStoriesSenders", z13);
                                                                    } else {
                                                                        bool3 = null;
                                                                    }
                                                                    if ((bool == null) == (bool2 == null)) {
                                                                        if ((valueOf == null) == (bool3 == null)) {
                                                                            if (bool != null) {
                                                                            }
                                                                            if (valueOf != null) {
                                                                            }
                                                                            na7Var.getNotificationsController().h0.a(tL_updateNotifySettings.notify_settings.android_sound, editor3, 0L, 0L, 1);
                                                                            if ((tL_updateNotifySettings.notify_settings.flags & 4) != 0) {
                                                                                int i54 = na7Var.W3.getInt("EnableAll2", 0);
                                                                                int i55 = tL_updateNotifySettings.notify_settings.mute_until;
                                                                                if (i54 != i55) {
                                                                                    editor3.putInt("EnableAll2", i55);
                                                                                    editor3.putBoolean("overwrite_private", true);
                                                                                    gl.c3(new f67(na7Var, (byte) 14));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    editor3.putBoolean("overwrite_stories", true);
                                                                    na7Var.getNotificationsController().h0.a(tL_updateNotifySettings.notify_settings.android_sound, editor3, 0L, 0L, 1);
                                                                    if ((tL_updateNotifySettings.notify_settings.flags & 4) != 0) {
                                                                    }
                                                                } else if (notifyPeer instanceof TLRPC.TL_notifyBroadcasts) {
                                                                    TLRPC.PeerNotifySettings peerNotifySettings5 = tL_updateNotifySettings.notify_settings;
                                                                    if ((peerNotifySettings5.flags & 1) != 0) {
                                                                        editor3.putBoolean("EnablePreviewChannel", peerNotifySettings5.show_previews);
                                                                    }
                                                                    if ((tL_updateNotifySettings.notify_settings.flags & 4) != 0) {
                                                                        int i56 = na7Var.W3.getInt("EnableChannel2", 0);
                                                                        int i57 = tL_updateNotifySettings.notify_settings.mute_until;
                                                                        if (i56 != i57) {
                                                                            editor3.putInt("EnableChannel2", i57);
                                                                            editor3.putBoolean("overwrite_channel", true);
                                                                            gl.c3(new f67(na7Var, (byte) 15));
                                                                        }
                                                                    }
                                                                    editor = editor3;
                                                                    na7Var.getNotificationsController().h0.a(tL_updateNotifySettings.notify_settings.android_sound, editor, 0L, 0L, 2);
                                                                }
                                                                editor = editor3;
                                                            }
                                                            ad7 messagesStorage = na7Var.getMessagesStorage();
                                                            messagesStorage.a.c(new vb7(messagesStorage, b));
                                                            editor2 = editor;
                                                        }
                                                        long j14 = j6;
                                                        wm7 wm7Var = na7Var.getNotificationsController().h0;
                                                        TLRPC.PeerNotifySettings peerNotifySettings6 = tL_updateNotifySettings.notify_settings;
                                                        wm7Var.getClass();
                                                        if (peerNotifySettings6 != null) {
                                                            Utilities.e.c(new n30((Object) wm7Var, j14, j7, (Object) peerNotifySettings6, (byte) 12));
                                                        }
                                                        ad7 messagesStorage2 = na7Var.getMessagesStorage();
                                                        messagesStorage2.a.c(new vb7(messagesStorage2, b));
                                                        editor2 = editor;
                                                    }
                                                } else if (update instanceof TL_update.TL_updateNewAuthorization) {
                                                    na7Var.P1().b((TL_update.TL_updateNewAuthorization) update);
                                                } else if (update instanceof TL_update.TL_updateNewBotConnection) {
                                                    na7Var.P1().c((TL_update.TL_updateNewBotConnection) update);
                                                } else {
                                                    if (update instanceof TL_update.TL_updateChannel) {
                                                        TL_update.TL_updateChannel tL_updateChannel = (TL_update.TL_updateChannel) update;
                                                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) na7Var.R.f(-tL_updateChannel.channel_id);
                                                        TLRPC.Chat K0 = na7Var.K0(Long.valueOf(tL_updateChannel.channel_id));
                                                        if (K0 != null) {
                                                            if (dialog3 == null && (K0 instanceof TLRPC.TL_channel) && !K0.left) {
                                                                Utilities.d.c(new oh6((Object) na7Var, (Object) tL_updateChannel, (byte) 29));
                                                            } else if (hc2.r0(K0) && dialog3 != null && ((dialog2 = na7Var.q2) == null || dialog2.id != dialog3.id)) {
                                                                na7Var.T(0, dialog3.id, false);
                                                            }
                                                            if (((K0 instanceof TLRPC.TL_channelForbidden) || K0.kicked) && (e1 = na7Var.e1(K0.id, false, null)) != null) {
                                                                TL_update.TL_updateGroupCall tL_updateGroupCall = new TL_update.TL_updateGroupCall();
                                                                tL_updateGroupCall.flags |= 2;
                                                                tL_updateGroupCall.peer = na7Var.w1(-K0.id);
                                                                TLRPC.TL_groupCallDiscarded tL_groupCallDiscarded = new TLRPC.TL_groupCallDiscarded();
                                                                tL_updateGroupCall.call = tL_groupCallDiscarded;
                                                                TLRPC.GroupCall groupCall = e1.b;
                                                                tL_groupCallDiscarded.id = groupCall.id;
                                                                tL_groupCallDiscarded.access_hash = groupCall.access_hash;
                                                                e1.p(tL_groupCallDiscarded);
                                                                if (VoIPService.getSharedInstance() != null) {
                                                                    VoIPService.getSharedInstance().onGroupCallUpdated(tL_updateGroupCall.call);
                                                                }
                                                            }
                                                        }
                                                        i29 = i48 | TLObject.FLAG_13;
                                                        na7Var.Y2(0, tL_updateChannel.channel_id, true);
                                                    } else {
                                                        i25 = i48;
                                                        if (update instanceof TL_update.TL_updateChat) {
                                                            TL_update.TL_updateChat tL_updateChat = (TL_update.TL_updateChat) update;
                                                            TLRPC.Chat K02 = na7Var.K0(Long.valueOf(tL_updateChat.chat_id));
                                                            if (K02 != null && ((K02 instanceof TLRPC.TL_chatForbidden) || K02.kicked)) {
                                                                fc2 e12 = na7Var.e1(K02.id, false, null);
                                                                if (e12 != null) {
                                                                    TL_update.TL_updateGroupCall tL_updateGroupCall2 = new TL_update.TL_updateGroupCall();
                                                                    tL_updateGroupCall2.flags |= 2;
                                                                    tL_updateGroupCall2.peer = na7Var.w1(-K02.id);
                                                                    TLRPC.TL_groupCallDiscarded tL_groupCallDiscarded2 = new TLRPC.TL_groupCallDiscarded();
                                                                    tL_updateGroupCall2.call = tL_groupCallDiscarded2;
                                                                    TLRPC.GroupCall groupCall2 = e12.b;
                                                                    tL_groupCallDiscarded2.id = groupCall2.id;
                                                                    tL_groupCallDiscarded2.access_hash = groupCall2.access_hash;
                                                                    e12.p(tL_groupCallDiscarded2);
                                                                    if (VoIPService.getSharedInstance() != null) {
                                                                        VoIPService.getSharedInstance().onGroupCallUpdated(tL_updateGroupCall2.call);
                                                                    }
                                                                }
                                                                TLRPC.Dialog dialog4 = (TLRPC.Dialog) na7Var.R.f(-K02.id);
                                                                if (dialog4 != null) {
                                                                    i31 = 0;
                                                                    na7Var.T(0, dialog4.id, false);
                                                                    i29 = i25 | TLObject.FLAG_13;
                                                                    na7Var.Y2(i31, tL_updateChat.chat_id, true);
                                                                }
                                                            }
                                                            i31 = 0;
                                                            i29 = i25 | TLObject.FLAG_13;
                                                            na7Var.Y2(i31, tL_updateChat.chat_id, true);
                                                        } else {
                                                            if (update instanceof TL_update.TL_updateChatDefaultBannedRights) {
                                                                TL_update.TL_updateChatDefaultBannedRights tL_updateChatDefaultBannedRights = (TL_update.TL_updateChatDefaultBannedRights) update;
                                                                TLRPC.Peer peer4 = tL_updateChatDefaultBannedRights.peer;
                                                                long j15 = peer4.channel_id;
                                                                if (j15 == 0) {
                                                                    j15 = peer4.chat_id;
                                                                }
                                                                TLRPC.Chat K03 = na7Var.K0(Long.valueOf(j15));
                                                                if (K03 != null) {
                                                                    K03.default_banned_rights = tL_updateChatDefaultBannedRights.default_banned_rights;
                                                                    gl.c3(new z47(na7Var, K03, (byte) 1));
                                                                }
                                                            } else if (update instanceof TL_update.TL_updateBotCommands) {
                                                                TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) update;
                                                                na7Var.getMediaDataController().l2(k27.B1(tL_updateBotCommands.peer), tL_updateBotCommands);
                                                            } else if (update instanceof TL_update.TL_updateStickerSets) {
                                                                na7Var.getMediaDataController().b1(0, false, true);
                                                            } else if (update instanceof TL_update.TL_updateStickerSetsOrder) {
                                                                TL_update.TL_updateStickerSetsOrder tL_updateStickerSetsOrder = (TL_update.TL_updateStickerSetsOrder) update;
                                                                if (tL_updateStickerSetsOrder.masks) {
                                                                    i44 = 1;
                                                                } else if (!tL_updateStickerSetsOrder.emojis) {
                                                                    i44 = 0;
                                                                }
                                                                na7Var.getMediaDataController().R1(i44, tL_updateStickerSetsOrder.order);
                                                            } else {
                                                                boolean z14 = update instanceof TL_update.TL_updateRecentReactions;
                                                                if (z14) {
                                                                    na7Var.getMediaDataController().W0(true);
                                                                } else if (z14) {
                                                                    na7Var.getMediaDataController().a1(true);
                                                                } else if (update instanceof TL_update.TL_updateSavedReactionTags) {
                                                                    na7Var.F1(0L, true);
                                                                } else if (update instanceof TL_update.TL_updateSentWalletTransaction) {
                                                                    c.C(na7Var.currentAccount).V((TL_update.TL_updateSentWalletTransaction) update);
                                                                } else if (update instanceof TL_update.TL_updateWalletGaslessInfo) {
                                                                    c.C(na7Var.currentAccount).W((TL_update.TL_updateWalletGaslessInfo) update);
                                                                } else if (update instanceof TL_update.TL_updateWalletState) {
                                                                    c.C(na7Var.currentAccount).X((TL_update.TL_updateWalletState) update);
                                                                } else if (update instanceof TL_update.TL_updateWalletTonConnectSession) {
                                                                    c.C(na7Var.currentAccount).g.p(((TL_update.TL_updateWalletTonConnectSession) update).session);
                                                                } else if (update instanceof TL_update.TL_updateFavedStickers) {
                                                                    na7Var.getMediaDataController().X0(false, false, true, 2);
                                                                } else if (update instanceof TL_update.TL_updateContactsReset) {
                                                                    na7Var.getContactsController().l();
                                                                } else if (update instanceof TL_update.TL_updateNewStickerSet) {
                                                                    na7Var.getMediaDataController().b(((TL_update.TL_updateNewStickerSet) update).stickerset);
                                                                } else if (update instanceof TL_update.TL_updateSavedGifs) {
                                                                    na7Var.Y3.edit().putLong("lastGifLoadTime", 0L).commit();
                                                                } else if (update instanceof TL_update.TL_updateRecentStickers) {
                                                                    na7Var.Y3.edit().putLong("lastStickersLoadTime", 0L).commit();
                                                                } else {
                                                                    if (update instanceof TL_update.TL_updateDraftMessage) {
                                                                        TL_update.TL_updateDraftMessage tL_updateDraftMessage = (TL_update.TL_updateDraftMessage) update;
                                                                        TLRPC.Peer peer5 = tL_updateDraftMessage.peer;
                                                                        long j16 = peer5.user_id;
                                                                        if (j16 == 0) {
                                                                            long j17 = peer5.channel_id;
                                                                            j16 = j17 != 0 ? -j17 : -peer5.chat_id;
                                                                        }
                                                                        long j18 = j16;
                                                                        TLRPC.Peer peer6 = tL_updateDraftMessage.saved_peer_id;
                                                                        long n2 = peer6 != null ? cf3.n(peer6) : tL_updateDraftMessage.top_msg_id;
                                                                        na7Var.getMediaDataController().B1(j18, n2, tL_updateDraftMessage.draft);
                                                                        na7Var.getMediaDataController().U1(j18, n2, tL_updateDraftMessage.draft, null, true);
                                                                        i28 = i21;
                                                                        i16 = i22;
                                                                        i26 = i23;
                                                                        z2 = true;
                                                                    } else if (update instanceof TL_stories.TL_updateStoriesStealthMode) {
                                                                        na7Var.M1().h0(((TL_stories.TL_updateStoriesStealthMode) update).stealth_mode);
                                                                    } else if (update instanceof TL_update.TL_updateReadFeaturedStickers) {
                                                                        na7Var.getMediaDataController().e1(false, false);
                                                                    } else if (update instanceof TL_update.TL_updateReadFeaturedEmojiStickers) {
                                                                        na7Var.getMediaDataController().e1(true, false);
                                                                    } else if (update instanceof TL_update.TL_updateMoveStickerSetToTop) {
                                                                        TL_update.TL_updateMoveStickerSetToTop tL_updateMoveStickerSetToTop = (TL_update.TL_updateMoveStickerSetToTop) update;
                                                                        na7Var.getMediaDataController().i1(tL_updateMoveStickerSetToTop.stickerset, tL_updateMoveStickerSetToTop.emojis, tL_updateMoveStickerSetToTop.masks);
                                                                    } else if (update instanceof TL_update.TL_updatePinnedForumTopic) {
                                                                        TL_update.TL_updatePinnedForumTopic tL_updatePinnedForumTopic = (TL_update.TL_updatePinnedForumTopic) update;
                                                                        long j19 = -cf3.n(tL_updatePinnedForumTopic.peer);
                                                                        ArrayList g = na7Var.g4.g(j19);
                                                                        g.remove(Integer.valueOf(tL_updatePinnedForumTopic.topic_id));
                                                                        if (tL_updatePinnedForumTopic.pinned) {
                                                                            g.add(0, Integer.valueOf(tL_updatePinnedForumTopic.topic_id));
                                                                        }
                                                                        na7Var.g4.a(j19, g, true);
                                                                    } else if (update instanceof TL_update.TL_updatePinnedForumTopics) {
                                                                        TL_update.TL_updatePinnedForumTopics tL_updatePinnedForumTopics = (TL_update.TL_updatePinnedForumTopics) update;
                                                                        long n3 = cf3.n(tL_updatePinnedForumTopics.peer);
                                                                        int i58 = tL_updatePinnedForumTopics.flags & 1;
                                                                        pub pubVar = na7Var.g4;
                                                                        long j20 = -n3;
                                                                        if (i58 != 0) {
                                                                            pubVar.a(j20, tL_updatePinnedForumTopics.order, true);
                                                                        } else {
                                                                            pubVar.getClass();
                                                                            gl.c3(new ko2((Object) pubVar, j20, (boolean) (null == true ? 1 : 0), (byte) 4));
                                                                        }
                                                                    } else if (update instanceof TL_update.TL_updateEditForumTopic) {
                                                                        TL_update.TL_updateEditForumTopic tL_updateEditForumTopic = (TL_update.TL_updateEditForumTopic) update;
                                                                        na7Var.g4.r(cf3.n(tL_updateEditForumTopic.peer), tL_updateEditForumTopic);
                                                                    } else if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                                                                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                                                                        fc2 fc2Var = (fc2) na7Var.d1.f(tL_updateGroupCallParticipants.call.id);
                                                                        if (fc2Var != null) {
                                                                            fc2Var.q(tL_updateGroupCallParticipants, false);
                                                                        }
                                                                        if (VoIPService.getSharedInstance() != null) {
                                                                            VoIPService.getSharedInstance().onGroupCallParticipantsUpdate(tL_updateGroupCallParticipants);
                                                                        }
                                                                    } else if (update instanceof TL_update.TL_updateGroupCall) {
                                                                        TL_update.TL_updateGroupCall tL_updateGroupCall3 = (TL_update.TL_updateGroupCall) update;
                                                                        if (tL_updateGroupCall3.live_story) {
                                                                            na7Var.getNotificationCenter().k(kk7.w2, Long.valueOf(cf3.n(tL_updateGroupCall3.peer)), tL_updateGroupCall3.call);
                                                                        }
                                                                        fc2 fc2Var2 = (fc2) na7Var.d1.f(tL_updateGroupCall3.call.id);
                                                                        if (fc2Var2 != null) {
                                                                            fc2Var2.p(tL_updateGroupCall3.call);
                                                                            TLRPC.Chat K04 = na7Var.K0(Long.valueOf(fc2Var2.c));
                                                                            if (K04 != null) {
                                                                                K04.call_active = tL_updateGroupCall3.call instanceof TLRPC.TL_groupCall;
                                                                            }
                                                                        } else {
                                                                            TLRPC.Peer peer7 = tL_updateGroupCall3.peer;
                                                                            if (peer7 != null && (L02 = na7Var.L0((j5 = -cf3.n(peer7)))) != null) {
                                                                                TLRPC.InputGroupCall inputGroupCall = L02.call;
                                                                                if (inputGroupCall != null) {
                                                                                    i30 = inputGroupCall.id != tL_updateGroupCall3.call.id ? 0 : 0;
                                                                                }
                                                                                na7Var.Y2(i30, j5, true);
                                                                            }
                                                                        }
                                                                        if (VoIPService.getSharedInstance() != null) {
                                                                            VoIPService.getSharedInstance().onGroupCallUpdated(tL_updateGroupCall3.call);
                                                                        }
                                                                    } else if (update instanceof TL_update.TL_updatePhoneCall) {
                                                                        TL_phone.PhoneCall phoneCall = ((TL_update.TL_updatePhoneCall) update).phone_call;
                                                                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                                                                        if (w01.a) {
                                                                            fa4.b("Received call in update: " + phoneCall);
                                                                            ug8.q(phoneCall.id, new StringBuilder("call id "));
                                                                        }
                                                                        VoIPDebugToSend voIPDebugToSend = na7Var.f1;
                                                                        if (voIPDebugToSend != null && (phoneCall instanceof TL_phone.TL_phoneCallDiscarded)) {
                                                                            TL_phone.TL_phoneCallDiscarded tL_phoneCallDiscarded = (TL_phone.TL_phoneCallDiscarded) phoneCall;
                                                                            voIPDebugToSend.done(tL_phoneCallDiscarded.id, tL_phoneCallDiscarded.need_debug);
                                                                        }
                                                                        if (phoneCall instanceof TL_phone.phoneCallRequested) {
                                                                            if ((na7Var.a3 / 1000) + phoneCall.date >= na7Var.getConnectionsManager().getCurrentTime()) {
                                                                                if (pl7.c(a.b).a()) {
                                                                                    z6 = false;
                                                                                } else if (!a.x && a.w) {
                                                                                    z6 = true;
                                                                                } else if (w01.a) {
                                                                                    fa4.b("Ignoring incoming call because notifications are disabled in system");
                                                                                }
                                                                                TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
                                                                                try {
                                                                                } catch (Throwable th) {
                                                                                    fa4.f(th);
                                                                                }
                                                                                if (Build.VERSION.SDK_INT >= 31) {
                                                                                    if (rr.b(a.b, "android.permission.READ_PHONE_STATE") == 0) {
                                                                                        z8 = telephonyManager.getCallStateForSubscription() == 0;
                                                                                    }
                                                                                    z7 = true;
                                                                                    fa4.d("updatePhoneCall: svc=" + sharedInstance + " callIShouldHavePutIntoIntent=" + VoIPService.callIShouldHavePutIntoIntent + " callStateIsIdle=" + z7);
                                                                                    if (sharedInstance != null && VoIPService.callIShouldHavePutIntoIntent == null && z7) {
                                                                                        if (w01.a) {
                                                                                            ug8.q(phoneCall.id, new StringBuilder("Starting service for call "));
                                                                                        }
                                                                                        VoIPService.callIShouldHavePutIntoIntent = phoneCall;
                                                                                        fa4.d("set VoIPService.callIShouldHavePutIntoIntent = " + phoneCall);
                                                                                        Intent intent = new Intent(a.b, (Class<?>) VoIPService.class);
                                                                                        intent.putExtra("is_outgoing", false);
                                                                                        intent.putExtra("user_id", phoneCall.participant_id == na7Var.getUserConfig().e() ? phoneCall.admin_id : phoneCall.participant_id);
                                                                                        intent.putExtra("account", na7Var.currentAccount);
                                                                                        intent.putExtra("notifications_disabled", z6);
                                                                                        try {
                                                                                            int i59 = Build.VERSION.SDK_INT;
                                                                                            if (i59 >= 33) {
                                                                                                intent.putExtra("accept", true);
                                                                                                VoIPPreNotificationService.show(a.b, intent, phoneCall);
                                                                                            } else if (z6 || i59 < 26) {
                                                                                                a.b.startService(intent);
                                                                                            } else {
                                                                                                a.b.startForegroundService(intent);
                                                                                            }
                                                                                            if (a.x || !a.w) {
                                                                                                na7Var.Z3 = true;
                                                                                            }
                                                                                        } catch (Throwable th2) {
                                                                                            fa4.f(th2);
                                                                                        }
                                                                                    } else if (sharedInstance != null || sharedInstance.getAccount() == na7Var.currentAccount || sharedInstance.getUser() == null || sharedInstance.getUser().id != na7Var.getUserConfig().e()) {
                                                                                        if (w01.a) {
                                                                                            fa4.b("Auto-declining call " + phoneCall.id + " because there's already active one");
                                                                                        }
                                                                                        TL_phone.discardCall discardcall = new TL_phone.discardCall();
                                                                                        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
                                                                                        discardcall.peer = tL_inputPhoneCall;
                                                                                        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
                                                                                        tL_inputPhoneCall.id = phoneCall.id;
                                                                                        discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
                                                                                        fa4.d("discardCall " + discardcall.reason);
                                                                                        na7Var.getConnectionsManager().sendRequest(discardcall, new y47(na7Var, (byte) 8));
                                                                                    }
                                                                                }
                                                                                z7 = z8;
                                                                                fa4.d("updatePhoneCall: svc=" + sharedInstance + " callIShouldHavePutIntoIntent=" + VoIPService.callIShouldHavePutIntoIntent + " callStateIsIdle=" + z7);
                                                                                if (sharedInstance != null) {
                                                                                }
                                                                                if (sharedInstance != null) {
                                                                                }
                                                                                if (w01.a) {
                                                                                }
                                                                                TL_phone.discardCall discardcall2 = new TL_phone.discardCall();
                                                                                TLRPC.TL_inputPhoneCall tL_inputPhoneCall2 = new TLRPC.TL_inputPhoneCall();
                                                                                discardcall2.peer = tL_inputPhoneCall2;
                                                                                tL_inputPhoneCall2.access_hash = phoneCall.access_hash;
                                                                                tL_inputPhoneCall2.id = phoneCall.id;
                                                                                discardcall2.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
                                                                                fa4.d("discardCall " + discardcall2.reason);
                                                                                na7Var.getConnectionsManager().sendRequest(discardcall2, new y47(na7Var, (byte) 8));
                                                                            } else if (w01.a) {
                                                                                fa4.b("ignoring too old call");
                                                                            }
                                                                        } else if (sharedInstance == null || sharedInstance.getAccount() != na7Var.currentAccount || phoneCall == null) {
                                                                            if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
                                                                                VoIPPreNotificationService.dismiss(a.b, false);
                                                                            }
                                                                            if (VoIPService.callIShouldHavePutIntoIntent != null) {
                                                                                if (w01.a) {
                                                                                    fa4.b("Updated the call while the service is starting");
                                                                                }
                                                                                if (phoneCall.id == VoIPService.callIShouldHavePutIntoIntent.id) {
                                                                                    if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
                                                                                        phoneCall = null;
                                                                                    }
                                                                                    VoIPService.callIShouldHavePutIntoIntent = phoneCall;
                                                                                    fa4.d("(2) set VoIPService.callIShouldHavePutIntoIntent = " + VoIPService.callIShouldHavePutIntoIntent);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            sharedInstance.onCallUpdated(phoneCall);
                                                                        }
                                                                    } else if (update instanceof TL_update.TL_updateDialogUnreadMark) {
                                                                        TL_update.TL_updateDialogUnreadMark tL_updateDialogUnreadMark = (TL_update.TL_updateDialogUnreadMark) update;
                                                                        TLRPC.DialogPeer dialogPeer3 = tL_updateDialogUnreadMark.peer;
                                                                        if (dialogPeer3 instanceof TLRPC.TL_dialogPeer) {
                                                                            TLRPC.Peer peer8 = ((TLRPC.TL_dialogPeer) dialogPeer3).peer;
                                                                            long j21 = peer8.user_id;
                                                                            if (j21 != 0) {
                                                                                j4 = j21;
                                                                            } else {
                                                                                long j22 = peer8.chat_id;
                                                                                j4 = j22 != 0 ? -j22 : -peer8.channel_id;
                                                                            }
                                                                        } else {
                                                                            j4 = 0;
                                                                        }
                                                                        na7Var.getMessagesStorage().C1(j4, tL_updateDialogUnreadMark.unread);
                                                                        TLRPC.Dialog dialog5 = (TLRPC.Dialog) na7Var.R.f(j4);
                                                                        if (dialog5 != null) {
                                                                            boolean z15 = dialog5.unread_mark;
                                                                            boolean z16 = tL_updateDialogUnreadMark.unread;
                                                                            if (z15 != z16) {
                                                                                dialog5.unread_mark = z16;
                                                                                if (dialog5.unread_count == 0) {
                                                                                    na7Var.m2(j4, 0L);
                                                                                }
                                                                                i29 = i25 | 256;
                                                                                i42 |= 64;
                                                                            }
                                                                        }
                                                                        i29 = i25;
                                                                    } else if (update instanceof TL_update.TL_updateMessagePoll) {
                                                                        TL_update.TL_updateMessagePoll tL_updateMessagePoll = (TL_update.TL_updateMessagePoll) update;
                                                                        na7Var.getNotificationCenter().k(kk7.e1, Long.valueOf(tL_updateMessagePoll.poll_id), tL_updateMessagePoll.poll, tL_updateMessagePoll.results);
                                                                    } else if (update instanceof TL_update.TL_updatePeerSettings) {
                                                                        TL_update.TL_updatePeerSettings tL_updatePeerSettings = (TL_update.TL_updatePeerSettings) update;
                                                                        TLRPC.Peer peer9 = tL_updatePeerSettings.peer;
                                                                        na7Var.x4(peer9 instanceof TLRPC.TL_peerUser ? peer9.user_id : -(peer9 instanceof TLRPC.TL_peerChat ? peer9.chat_id : peer9.channel_id), tL_updatePeerSettings.settings);
                                                                    } else if (update instanceof TL_update.TL_updatePeerLocated) {
                                                                        na7Var.getNotificationCenter().k(kk7.h1, update);
                                                                    } else if (update instanceof TL_update.TL_updateMessageReactions) {
                                                                        TL_update.TL_updateMessageReactions tL_updateMessageReactions = (TL_update.TL_updateMessageReactions) update;
                                                                        long B1 = k27.B1(tL_updateMessageReactions.peer);
                                                                        long A = gta.t(na7Var.currentAccount).A(tL_updateMessageReactions.msg_id, B1);
                                                                        if (A != 0) {
                                                                            j3 = B1;
                                                                            k27.g(na7Var.currentAccount, tL_updateMessageReactions.reactions, (int) A, gta.t(na7Var.currentAccount).y(zsa.a(tL_updateMessageReactions.msg_id, B1), tL_updateMessageReactions.reactions), true);
                                                                        } else {
                                                                            j3 = B1;
                                                                        }
                                                                        na7Var.getNotificationCenter().k(kk7.n1, Long.valueOf(j3), Integer.valueOf(tL_updateMessageReactions.msg_id), tL_updateMessageReactions.reactions);
                                                                    } else if (update instanceof TL_update.TL_updateMessageExtendedMedia) {
                                                                        TL_update.TL_updateMessageExtendedMedia tL_updateMessageExtendedMedia = (TL_update.TL_updateMessageExtendedMedia) update;
                                                                        na7Var.getNotificationCenter().k(kk7.o1, Long.valueOf(cf3.n(tL_updateMessageExtendedMedia.peer)), Integer.valueOf(tL_updateMessageExtendedMedia.msg_id), tL_updateMessageExtendedMedia.extended_media);
                                                                    } else if (update instanceof TL_update.TL_updateTheme) {
                                                                        bkb.G1(null, null, (TLRPC.TL_theme) ((TL_update.TL_updateTheme) update).theme, na7Var.currentAccount, true);
                                                                    } else if (update instanceof TL_update.TL_updateDialogFilter) {
                                                                        na7Var.e3(true, null);
                                                                    } else if (update instanceof TL_update.TL_updateDialogFilterOrder) {
                                                                        na7Var.e3(true, null);
                                                                    } else if (update instanceof TL_update.TL_updateDialogFilters) {
                                                                        na7Var.e3(true, null);
                                                                    } else if (update instanceof TL_update.TL_updateRecentEmojiStatuses) {
                                                                        na7Var.getNotificationCenter().k(kk7.B1, new Object[0]);
                                                                    } else if (update instanceof TL_update.TL_updateWebViewResultSent) {
                                                                        na7Var.getNotificationCenter().k(kk7.y1, Long.valueOf(((TL_update.TL_updateWebViewResultSent) update).query_id));
                                                                    } else if (update instanceof TL_update.TL_updateAttachMenuBots) {
                                                                        na7Var.getMediaDataController().F0();
                                                                    } else if (update instanceof TL_update.TL_updateJoinChatWebViewDecision) {
                                                                        TL_update.TL_updateJoinChatWebViewDecision tL_updateJoinChatWebViewDecision = (TL_update.TL_updateJoinChatWebViewDecision) update;
                                                                        bq0.b(na7Var.currentAccount).a(cf3.n(tL_updateJoinChatWebViewDecision.peer), tL_updateJoinChatWebViewDecision.query_id, tL_updateJoinChatWebViewDecision.result);
                                                                    } else if (update instanceof TL_bots.TL_updateBotMenuButton) {
                                                                        TL_bots.TL_updateBotMenuButton tL_updateBotMenuButton = (TL_bots.TL_updateBotMenuButton) update;
                                                                        na7Var.getNotificationCenter().k(kk7.S2, Long.valueOf(tL_updateBotMenuButton.bot_id), tL_updateBotMenuButton.button);
                                                                    } else {
                                                                        if (update instanceof TL_update.TL_updateReadChannelDiscussionInbox) {
                                                                            TL_update.TL_updateReadChannelDiscussionInbox tL_updateReadChannelDiscussionInbox = (TL_update.TL_updateReadChannelDiscussionInbox) update;
                                                                            i26 = i23;
                                                                            na7Var.getNotificationCenter().k(i26, Long.valueOf(-tL_updateReadChannelDiscussionInbox.channel_id), Integer.valueOf(tL_updateReadChannelDiscussionInbox.top_msg_id), Integer.valueOf(tL_updateReadChannelDiscussionInbox.read_max_id), 0);
                                                                            if ((tL_updateReadChannelDiscussionInbox.flags & 1) != 0) {
                                                                                na7Var.getMessagesStorage().a2(tL_updateReadChannelDiscussionInbox.read_max_id, 0, tL_updateReadChannelDiscussionInbox.broadcast_id, tL_updateReadChannelDiscussionInbox.broadcast_post);
                                                                                na7Var.getNotificationCenter().k(kk7.A, Long.valueOf(tL_updateReadChannelDiscussionInbox.broadcast_id), Integer.valueOf(tL_updateReadChannelDiscussionInbox.broadcast_post), Integer.valueOf(tL_updateReadChannelDiscussionInbox.read_max_id));
                                                                            }
                                                                        } else {
                                                                            i26 = i23;
                                                                            if (update instanceof TL_update.TL_updateReadChannelDiscussionOutbox) {
                                                                                TL_update.TL_updateReadChannelDiscussionOutbox tL_updateReadChannelDiscussionOutbox = (TL_update.TL_updateReadChannelDiscussionOutbox) update;
                                                                                na7Var.getNotificationCenter().k(i26, Long.valueOf(-tL_updateReadChannelDiscussionOutbox.channel_id), Integer.valueOf(tL_updateReadChannelDiscussionOutbox.top_msg_id), 0, Integer.valueOf(tL_updateReadChannelDiscussionOutbox.read_max_id));
                                                                            } else {
                                                                                if (update instanceof TL_update.TL_updateReadMonoForumInbox) {
                                                                                    TL_update.TL_updateReadMonoForumInbox tL_updateReadMonoForumInbox = (TL_update.TL_updateReadMonoForumInbox) update;
                                                                                    i27 = i22;
                                                                                    na7Var.getNotificationCenter().k(i27, Long.valueOf(-tL_updateReadMonoForumInbox.channel_id), Long.valueOf(cf3.n(tL_updateReadMonoForumInbox.saved_peer_id)), Integer.valueOf(tL_updateReadMonoForumInbox.read_max_id), 0);
                                                                                    na7Var.getMessagesStorage().a2(tL_updateReadMonoForumInbox.read_max_id, 0, tL_updateReadMonoForumInbox.channel_id, cf3.n(tL_updateReadMonoForumInbox.saved_peer_id));
                                                                                } else {
                                                                                    i27 = i22;
                                                                                    if (update instanceof TL_update.TL_updateReadMonoForumOutbox) {
                                                                                        TL_update.TL_updateReadMonoForumOutbox tL_updateReadMonoForumOutbox = (TL_update.TL_updateReadMonoForumOutbox) update;
                                                                                        na7Var.getNotificationCenter().k(i27, Long.valueOf(-tL_updateReadMonoForumOutbox.channel_id), Long.valueOf(cf3.n(tL_updateReadMonoForumOutbox.saved_peer_id)), 0, Integer.valueOf(tL_updateReadMonoForumOutbox.read_max_id));
                                                                                    } else if (update instanceof TL_update.TL_updatePeerHistoryTTL) {
                                                                                        TL_update.TL_updatePeerHistoryTTL tL_updatePeerHistoryTTL = (TL_update.TL_updatePeerHistoryTTL) update;
                                                                                        long B12 = k27.B1(tL_updatePeerHistoryTTL.peer);
                                                                                        if (B12 > 0) {
                                                                                            TLRPC.UserFull W1 = na7Var.W1(B12);
                                                                                            if (W1 != null) {
                                                                                                int i60 = tL_updatePeerHistoryTTL.ttl_period;
                                                                                                W1.ttl_period = i60;
                                                                                                int i61 = W1.flags;
                                                                                                if (i60 == 0) {
                                                                                                    W1.flags = i61 & (-16385);
                                                                                                } else {
                                                                                                    W1.flags = i61 | TLObject.FLAG_14;
                                                                                                }
                                                                                            }
                                                                                            i16 = i27;
                                                                                            userFull = W1;
                                                                                            L0 = null;
                                                                                        } else {
                                                                                            i16 = i27;
                                                                                            L0 = na7Var.L0(-B12);
                                                                                            if (L0 != null) {
                                                                                                int i62 = tL_updatePeerHistoryTTL.ttl_period;
                                                                                                L0.ttl_period = i62;
                                                                                                boolean z17 = L0 instanceof TLRPC.TL_channelFull;
                                                                                                int i63 = L0.flags;
                                                                                                if (z17) {
                                                                                                    if (i62 == 0) {
                                                                                                        L0.flags = i63 & (-16777217);
                                                                                                    } else {
                                                                                                        L0.flags = i63 | 16777216;
                                                                                                    }
                                                                                                } else if (i62 == 0) {
                                                                                                    L0.flags = i63 & (-16385);
                                                                                                } else {
                                                                                                    L0.flags = i63 | TLObject.FLAG_14;
                                                                                                }
                                                                                            }
                                                                                            userFull = null;
                                                                                        }
                                                                                        if (L0 != null) {
                                                                                            kk7 notificationCenter = na7Var.getNotificationCenter();
                                                                                            int i64 = kk7.S;
                                                                                            j2 = B12;
                                                                                            Boolean bool4 = Boolean.FALSE;
                                                                                            notificationCenter.k(i64, L0, 0, bool4, bool4);
                                                                                            na7Var.getMessagesStorage().K1(L0, false);
                                                                                        } else {
                                                                                            j2 = B12;
                                                                                            if (userFull != null) {
                                                                                                i28 = i21;
                                                                                                na7Var.getNotificationCenter().k(i28, Long.valueOf(j2), userFull);
                                                                                                na7Var.getMessagesStorage().g2(userFull, false);
                                                                                                ad7 messagesStorage3 = na7Var.getMessagesStorage();
                                                                                                messagesStorage3.a.c(new bb7(messagesStorage3, tL_updatePeerHistoryTTL.ttl_period, j2, (byte) 0));
                                                                                                dialog = (TLRPC.Dialog) na7Var.R.f(j2);
                                                                                                if (dialog == null) {
                                                                                                    dialog.ttl_period = tL_updatePeerHistoryTTL.ttl_period;
                                                                                                    na7Var.getNotificationCenter().k(2, 0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        i28 = i21;
                                                                                        ad7 messagesStorage32 = na7Var.getMessagesStorage();
                                                                                        messagesStorage32.a.c(new bb7(messagesStorage32, tL_updatePeerHistoryTTL.ttl_period, j2, (byte) 0));
                                                                                        dialog = (TLRPC.Dialog) na7Var.R.f(j2);
                                                                                        if (dialog == null) {
                                                                                        }
                                                                                    } else {
                                                                                        i16 = i27;
                                                                                        i28 = i21;
                                                                                        if (update instanceof TL_update.TL_updatePendingJoinRequests) {
                                                                                            na7Var.getMemberRequestsController().b((TL_update.TL_updatePendingJoinRequests) update);
                                                                                        } else if (update instanceof TL_update.TL_updateSavedRingtones) {
                                                                                            na7Var.getMediaDataController().A0.g(true);
                                                                                        } else if (update instanceof TL_update.TL_updateTranscribeAudio) {
                                                                                            fa4.d("Received legacy TL_updateTranscribeAudio update");
                                                                                        } else if (update instanceof TL_update.TL_updateTranscribedAudio) {
                                                                                            TL_update.TL_updateTranscribedAudio tL_updateTranscribedAudio = (TL_update.TL_updateTranscribedAudio) update;
                                                                                            if (w01.a) {
                                                                                                StringBuilder sb = new StringBuilder("Transcription update received, pending=");
                                                                                                sb.append(tL_updateTranscribedAudio.pending);
                                                                                                sb.append(" id=");
                                                                                                sb.append(tL_updateTranscribedAudio.transcription_id);
                                                                                                sb.append(" text=");
                                                                                                de9.s(tL_updateTranscribedAudio.text, sb);
                                                                                            }
                                                                                            if ((!tL_updateTranscribedAudio.pending || !TextUtils.isEmpty(tL_updateTranscribedAudio.text)) && (tL_updateTranscribedAudio.pending || !uyb.f(null, tL_updateTranscribedAudio.transcription_id, tL_updateTranscribedAudio.text))) {
                                                                                                na7Var.getMessagesStorage().Y1(tL_updateTranscribedAudio.msg_id, cf3.n(tL_updateTranscribedAudio.peer), tL_updateTranscribedAudio.transcription_id, tL_updateTranscribedAudio.text, !tL_updateTranscribedAudio.pending);
                                                                                                na7Var.getNotificationCenter().k(kk7.z1, null, Long.valueOf(tL_updateTranscribedAudio.transcription_id), tL_updateTranscribedAudio.text, null, Boolean.valueOf(!tL_updateTranscribedAudio.pending));
                                                                                            }
                                                                                        } else if (update instanceof TL_update.TL_updateSentStoryReaction) {
                                                                                            TL_update.TL_updateSentStoryReaction tL_updateSentStoryReaction = (TL_update.TL_updateSentStoryReaction) update;
                                                                                            na7Var.M1().t0(cf3.n(tL_updateSentStoryReaction.peer), tL_updateSentStoryReaction.story_id, tL_updateSentStoryReaction.reaction);
                                                                                        } else if (update instanceof TL_update.TL_updateChannelViewForumAsMessages) {
                                                                                            TL_update.TL_updateChannelViewForumAsMessages tL_updateChannelViewForumAsMessages = (TL_update.TL_updateChannelViewForumAsMessages) update;
                                                                                            TLRPC.ChatFull L03 = na7Var.L0(tL_updateChannelViewForumAsMessages.channel_id);
                                                                                            if (L03 != null) {
                                                                                                boolean z18 = L03.view_forum_as_messages;
                                                                                                boolean z19 = tL_updateChannelViewForumAsMessages.enabled;
                                                                                                if (z18 != z19) {
                                                                                                    L03.view_forum_as_messages = z19;
                                                                                                    int i65 = L03.flags2;
                                                                                                    if (z19) {
                                                                                                        L03.flags2 = i65 | 64;
                                                                                                    } else {
                                                                                                        L03.flags2 = i65 & (-65);
                                                                                                    }
                                                                                                    na7Var.getMessagesStorage().K1(L03, false);
                                                                                                }
                                                                                            } else {
                                                                                                na7Var.getMessagesController().Y2(0, tL_updateChannelViewForumAsMessages.channel_id, true);
                                                                                            }
                                                                                            TLRPC.Dialog Q0 = na7Var.Q0(-tL_updateChannelViewForumAsMessages.channel_id);
                                                                                            if (Q0 != null) {
                                                                                                boolean z20 = Q0.view_forum_as_messages;
                                                                                                boolean z21 = tL_updateChannelViewForumAsMessages.enabled;
                                                                                                if (z20 != z21) {
                                                                                                    Q0.view_forum_as_messages = z21;
                                                                                                    ad7 messagesStorage4 = na7Var.getMessagesStorage();
                                                                                                    messagesStorage4.a.c(new ab7(messagesStorage4, -tL_updateChannelViewForumAsMessages.channel_id, tL_updateChannelViewForumAsMessages.enabled, (byte) 1));
                                                                                                }
                                                                                            } else {
                                                                                                ad7 messagesStorage5 = na7Var.getMessagesStorage();
                                                                                                messagesStorage5.a.c(new ab7(messagesStorage5, -tL_updateChannelViewForumAsMessages.channel_id, tL_updateChannelViewForumAsMessages.enabled, (byte) 1));
                                                                                            }
                                                                                        } else if ((update instanceof TL_update.TL_updatePinnedSavedDialogs) || (update instanceof TL_update.TL_updateSavedDialogPinned)) {
                                                                                            na7Var.D1().h(update);
                                                                                        } else if (!ox8.f(na7Var.currentAccount).j(update, null, 0)) {
                                                                                            if (update instanceof TL_update.TL_updatePaidReactionPrivacy) {
                                                                                                SharedPreferences.Editor edit = na7Var.X3.edit();
                                                                                                long currentTimeMillis = System.currentTimeMillis();
                                                                                                na7Var.N3 = currentTimeMillis;
                                                                                                SharedPreferences.Editor putLong = edit.putLong("paidReactionsAnonymousTime", currentTimeMillis);
                                                                                                long dialogId = ((TL_update.TL_updatePaidReactionPrivacy) update).privacy.getDialogId();
                                                                                                na7Var.O3 = Long.valueOf(dialogId);
                                                                                                putLong.putLong("paidReactionsDialogId", dialogId).apply();
                                                                                                na7Var.b5 = false;
                                                                                            } else if (update instanceof TL_update.TL_updateGroupCallChainBlocks) {
                                                                                                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                                                                                if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                                                                                                    conferenceCall.applyUpdate(null, (TL_update.TL_updateGroupCallChainBlocks) update, true, null);
                                                                                                }
                                                                                            } else if (update instanceof TL_update.TL_updateChatParticipantRank) {
                                                                                                TL_update.TL_updateChatParticipantRank tL_updateChatParticipantRank = (TL_update.TL_updateChatParticipantRank) update;
                                                                                                na7Var.v5(tL_updateChatParticipantRank.chat_id, tL_updateChatParticipantRank.rank, tL_updateChatParticipantRank.user_id);
                                                                                            } else if (update instanceof TL_update.TL_updateAiComposeTones) {
                                                                                                ic icVar = na7Var.j4;
                                                                                                if (icVar != null) {
                                                                                                    icVar.a();
                                                                                                }
                                                                                            } else if (update instanceof TL_update.TL_updateWebBrowserSettings) {
                                                                                                na7Var.r((TL_update.TL_updateWebBrowserSettings) update);
                                                                                            } else if (update instanceof TL_update.TL_updateWebBrowserException) {
                                                                                                na7Var.q((TL_update.TL_updateWebBrowserException) update);
                                                                                            } else {
                                                                                                a aVar = a.a;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i16 = i27;
                                                                                i28 = i21;
                                                                            }
                                                                        }
                                                                        i28 = i21;
                                                                        i16 = i22;
                                                                    }
                                                                    arrayList14 = arrayList11;
                                                                    i39 = i24;
                                                                    i35 = i28;
                                                                    i37 = i26;
                                                                    i36 = i16;
                                                                    size = i18;
                                                                    i38 = i20;
                                                                    arrayList15 = arrayList10;
                                                                    arrayList13 = arrayList;
                                                                    i41 = i19 + 1;
                                                                    i40 = i25;
                                                                }
                                                            }
                                                            i28 = i21;
                                                            i16 = i22;
                                                            i26 = i23;
                                                            arrayList14 = arrayList11;
                                                            i39 = i24;
                                                            i35 = i28;
                                                            i37 = i26;
                                                            i36 = i16;
                                                            size = i18;
                                                            i38 = i20;
                                                            arrayList15 = arrayList10;
                                                            arrayList13 = arrayList;
                                                            i41 = i19 + 1;
                                                            i40 = i25;
                                                        }
                                                    }
                                                    i25 = i29;
                                                    i28 = i21;
                                                    i16 = i22;
                                                    i26 = i23;
                                                    arrayList14 = arrayList11;
                                                    i39 = i24;
                                                    i35 = i28;
                                                    i37 = i26;
                                                    i36 = i16;
                                                    size = i18;
                                                    i38 = i20;
                                                    arrayList15 = arrayList10;
                                                    arrayList13 = arrayList;
                                                    i41 = i19 + 1;
                                                    i40 = i25;
                                                }
                                            }
                                        }
                                        i25 = i48;
                                        i28 = i21;
                                        i16 = i22;
                                        i26 = i23;
                                        arrayList14 = arrayList11;
                                        i39 = i24;
                                        i35 = i28;
                                        i37 = i26;
                                        i36 = i16;
                                        size = i18;
                                        i38 = i20;
                                        arrayList15 = arrayList10;
                                        arrayList13 = arrayList;
                                        i41 = i19 + 1;
                                        i40 = i25;
                                    }
                                }
                                i28 = i21;
                                i16 = i22;
                                i26 = i23;
                                arrayList11 = arrayList9;
                                arrayList14 = arrayList11;
                                i39 = i24;
                                i35 = i28;
                                i37 = i26;
                                i36 = i16;
                                size = i18;
                                i38 = i20;
                                arrayList15 = arrayList10;
                                arrayList13 = arrayList;
                                i41 = i19 + 1;
                                i40 = i25;
                            }
                        }
                        arrayList11 = arrayList14;
                        arrayList10 = arrayList15;
                        i19 = i41;
                        i25 = i40;
                        i20 = i38;
                        i24 = i39;
                        i28 = i43;
                        i26 = i17;
                        arrayList14 = arrayList11;
                        i39 = i24;
                        i35 = i28;
                        i37 = i26;
                        i36 = i16;
                        size = i18;
                        i38 = i20;
                        arrayList15 = arrayList10;
                        arrayList13 = arrayList;
                        i41 = i19 + 1;
                        i40 = i25;
                    }
                }
                arrayList10 = arrayList15;
                i18 = size;
                i19 = i41;
                i25 = i40;
                i20 = i38;
                i24 = i39;
                i28 = i43;
                i26 = i17;
                arrayList11 = arrayList14;
                arrayList14 = arrayList11;
                i39 = i24;
                i35 = i28;
                i37 = i26;
                i36 = i16;
                size = i18;
                i38 = i20;
                arrayList15 = arrayList10;
                arrayList13 = arrayList;
                i41 = i19 + 1;
                i40 = i25;
            }
            i3 = i35;
            ArrayList arrayList21 = arrayList14;
            ArrayList arrayList22 = arrayList15;
            i6 = i40;
            i4 = i38;
            i5 = 9;
            if (editor2 != null) {
                editor2.commit();
                z5 = false;
                na7Var.getNotificationCenter().k(kk7.e0, new Object[0]);
            } else {
                z5 = false;
            }
            na7Var.getMessagesStorage().h2(arrayList22, true);
            na7Var.getMessagesStorage().h2(arrayList21, z5);
            i7 = i42;
        } else {
            i3 = i35;
            i4 = i38;
            i5 = 9;
            i6 = i;
            i7 = 0;
            z2 = false;
        }
        if (arrayList3 != null) {
            int size5 = arrayList3.size();
            int i66 = 0;
            while (i66 < size5) {
                Object obj = arrayList3.get(i66);
                i66++;
                TLRPC.Message message2 = (TLRPC.Message) obj;
                long B13 = k27.B1(message2.peer_id);
                long B14 = k27.B1(message2.from_id);
                TLRPC.UserFull W12 = na7Var.W1(B13);
                if (W12 != null) {
                    TLRPC.MessageAction messageAction = message2.action;
                    if (messageAction instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                        if (!((TLRPC.TL_messageActionNoForwardsToggle) messageAction).new_value) {
                            W12.noforwards_peer_enabled = false;
                            W12.noforwards_my_enabled = false;
                            c = 1;
                        } else if (B14 == B13) {
                            c = 1;
                            W12.noforwards_peer_enabled = true;
                        } else {
                            c = 1;
                            W12.noforwards_my_enabled = true;
                        }
                        kk7 notificationCenter2 = na7Var.getNotificationCenter();
                        Object[] objArr = new Object[2];
                        objArr[0] = Long.valueOf(B13);
                        objArr[c] = W12;
                        notificationCenter2.k(i3, objArr);
                        na7Var.getMessagesStorage().g2(W12, false);
                    }
                }
            }
        }
        if (arrayList4 != null) {
            int size6 = arrayList4.size();
            for (int i67 = 0; i67 < size6; i67++) {
                na7Var.getMediaDataController().v0(((Long) arrayList4.get(i67)).longValue());
            }
        }
        if (vf6Var != null) {
            int m = vf6Var.m();
            for (int i68 = 0; i68 < m; i68++) {
                fc2 fc2Var3 = (fc2) na7Var.e1.f(vf6Var.j(i68));
                if (fc2Var3 != null) {
                    na7Var.getAccountInstance();
                    fc2Var3.r(i2, (ArrayList) vf6Var.n(i68));
                }
            }
        }
        if (longSparseIntArray != null) {
            int size7 = longSparseIntArray.size();
            for (int i69 = 0; i69 < size7; i69++) {
                p3a A2 = na7Var.getSendMessagesHelper().A(longSparseIntArray.keyAt(i69));
                if (A2 != null) {
                    A2.b(longSparseIntArray.valueAt(i69));
                }
            }
        }
        if (vf6Var2 != null) {
            int i70 = 1;
            na7Var.getNotificationCenter().k(kk7.v0, vf6Var2);
            int i71 = 0;
            while (i71 < 3) {
                if (i71 == i70) {
                    vf6Var12 = na7Var.z1;
                    i12 = 1;
                } else if (i71 == 2) {
                    vf6Var12 = na7Var.B1;
                    i12 = 3;
                } else {
                    vf6Var12 = na7Var.x1;
                    i12 = 0;
                }
                int m2 = vf6Var2.m();
                int i72 = 0;
                while (i72 < m2) {
                    long j23 = vf6Var2.j(i72);
                    ArrayList arrayList23 = (ArrayList) vf6Var12.f(j23);
                    vf6Var12.l(j23);
                    if (arrayList23 != null) {
                        TLRPC.WebPage webPage = (TLRPC.WebPage) vf6Var2.n(i72);
                        ArrayList arrayList24 = new ArrayList();
                        if ((webPage instanceof TLRPC.TL_webPage) || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            int size8 = arrayList23.size();
                            j = 0;
                            int i73 = 0;
                            while (i73 < size8) {
                                int i74 = i71;
                                ((k27) arrayList23.get(i73)).k.media.webpage = webPage;
                                if (i73 == 0) {
                                    j = ((k27) arrayList23.get(i73)).A0();
                                    fl5.R(((k27) arrayList23.get(i73)).k);
                                }
                                arrayList24.add(((k27) arrayList23.get(i73)).k);
                                i73++;
                                i71 = i74;
                            }
                        } else {
                            vf6Var12.k(arrayList23, webPage.id);
                            j = 0;
                        }
                        i13 = i71;
                        if (!arrayList24.isEmpty()) {
                            int i75 = i12;
                            na7Var.getMessagesStorage().f1(na7Var.getDownloadController().l(), i75, 0L, arrayList24, true);
                            i14 = i75;
                            kk7 notificationCenter3 = na7Var.getNotificationCenter();
                            Object[] objArr2 = {Long.valueOf(j), arrayList23};
                            i15 = i4;
                            notificationCenter3.k(i15, objArr2);
                            i72++;
                            i12 = i14;
                            i4 = i15;
                            i71 = i13;
                        }
                    } else {
                        i13 = i71;
                    }
                    i14 = i12;
                    i15 = i4;
                    i72++;
                    i12 = i14;
                    i4 = i15;
                    i71 = i13;
                }
                i71++;
                i70 = 1;
            }
        }
        int i76 = i4;
        if (i7 != 0) {
            int i77 = 0;
            while (true) {
                t97[] t97VarArr = na7Var.N;
                if (i77 >= t97VarArr.length) {
                    break;
                }
                t97 t97Var = t97VarArr[i77];
                if (t97Var != null && (t97Var.g & i7) != 0) {
                    z2 = true;
                    break;
                }
                i77++;
            }
            if (!z2 && (i7 & 64) != 0 && na7Var.j0()) {
                z2 = true;
            }
        }
        if (vf6Var3 != null) {
            int m3 = vf6Var3.m();
            boolean z22 = false;
            for (int i78 = 0; i78 < m3; i78++) {
                if (na7Var.r5(0, vf6Var3.j(i78), (ArrayList) vf6Var3.n(i78))) {
                    z22 = true;
                }
            }
            if (na7Var.o(arrayList5) || (!z22 && z2)) {
                na7Var.Z4(null);
            }
        } else {
            boolean o = na7Var.o(arrayList5);
            if (!z2 && !o) {
                vf6Var10 = vf6Var4;
                z3 = false;
                if (vf6Var10 != null) {
                    int m4 = vf6Var10.m();
                    for (int i79 = 0; i79 < m4; i79++) {
                        na7Var.r5(1, vf6Var10.j(i79), (ArrayList) vf6Var10.n(i79));
                    }
                }
                vf6Var11 = vf6Var5;
                if (vf6Var11 != null) {
                    int m5 = vf6Var11.m();
                    boolean z23 = z3;
                    int i80 = 0;
                    while (i80 < m5) {
                        long j24 = vf6Var11.j(i80);
                        ArrayList arrayList25 = (ArrayList) vf6Var11.n(i80);
                        int size9 = arrayList25.size();
                        SparseBooleanArray sparseBooleanArray = null;
                        int i81 = 0;
                        while (i81 < size9) {
                            k27 k27Var3 = (k27) arrayList25.get(i81);
                            if (j24 > 0) {
                                if (sparseBooleanArray == null) {
                                    sparseBooleanArray = new SparseBooleanArray();
                                }
                                int e13 = k27Var3.e1();
                                TLRPC.Message message3 = k27Var3.k;
                                if (message3 == null) {
                                    i11 = m5;
                                } else {
                                    TLRPC.TL_messageReactions tL_messageReactions = message3.reactions;
                                    i11 = m5;
                                    if (tL_messageReactions != null) {
                                        for (int i82 = 0; i82 < tL_messageReactions.recent_reactions.size(); i82++) {
                                            if (tL_messageReactions.recent_reactions.get(i82).unread) {
                                                z4 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z4 = false;
                                sparseBooleanArray.put(e13, z4);
                                TLRPC.Message message4 = k27Var3.k;
                                if ((message4 instanceof TLRPC.TL_messageService) && (message4.action instanceof TLRPC.TL_messageActionConferenceCall) && VoIPService.getSharedInstance() != null) {
                                    VoIPService.getSharedInstance().processMessageUpdate(k27Var3);
                                }
                            } else {
                                i11 = m5;
                            }
                            i81++;
                            m5 = i11;
                        }
                        int i83 = m5;
                        if (j24 > 0) {
                            L(j24, 0L, sparseBooleanArray, true);
                            na7Var = this;
                        } else {
                            na7Var = this;
                        }
                        ArrayList arrayList26 = (ArrayList) na7Var.S.f(j24);
                        if (arrayList26 != null) {
                            for (int i84 = 0; i84 < arrayList26.size(); i84++) {
                                k27 k27Var4 = (k27) arrayList26.get(i84);
                                int size10 = arrayList25.size();
                                for (int i85 = 0; i85 < size10; i85++) {
                                    k27 k27Var5 = (k27) arrayList25.get(i85);
                                    if (k27Var4.e1() == k27Var5.e1()) {
                                        arrayList26.set(i84, k27Var5);
                                        TLRPC.Peer peer10 = k27Var5.k.peer_id;
                                        if (peer10 != null && peer10.channel_id == 0) {
                                            na7Var.V.put(k27Var5.e1(), k27Var5);
                                        }
                                    } else if (k27Var4.A0() == k27Var5.A0() && (k27Var4.k.action instanceof TLRPC.TL_messageActionPinMessage) && (k27Var = k27Var4.C) != null && k27Var.e1() == k27Var5.e1()) {
                                        k27Var4.C = k27Var5;
                                        k27Var4.q0(null, null);
                                    }
                                    z23 = true;
                                    break;
                                }
                            }
                        }
                        na7Var.getMediaDataController().Y0(arrayList25, j24, 0, 0L, null, 0, null);
                        na7Var.getNotificationCenter().k(i76, Long.valueOf(j24), arrayList25, Boolean.FALSE);
                        i80++;
                        m5 = i83;
                        vf6Var11 = vf6Var5;
                    }
                    z3 = z23;
                }
                if (r34Var != null) {
                    int m6 = r34Var.a.c.m();
                    for (int i86 = 0; i86 < m6; i86++) {
                        na7Var.getNotificationCenter().k(1, Long.valueOf(r34Var.a.c.j(i86)), r34Var.a.c.n(i86), Boolean.FALSE, Integer.valueOf(i5));
                    }
                    int m7 = r34Var.b.c.m();
                    for (int i87 = 0; i87 < m7; i87++) {
                        na7Var.getNotificationCenter().k(i76, Long.valueOf(r34Var.b.c.j(i87)), r34Var.b.c.n(i87), Boolean.FALSE);
                    }
                }
                if (vf6Var6 != null) {
                    int m8 = vf6Var6.m();
                    for (int i88 = 0; i88 < m8; i88++) {
                        long j25 = vf6Var6.j(i88);
                        ArrayList arrayList27 = (ArrayList) vf6Var6.n(i88);
                        if (arrayList27 != null) {
                            ArrayList arrayList28 = new ArrayList(arrayList27.size());
                            int size11 = arrayList27.size();
                            int i89 = 0;
                            while (i89 < size11) {
                                Object obj2 = arrayList27.get(i89);
                                i89++;
                                arrayList28.add(Integer.valueOf((((Integer) obj2).intValue() & (-1879048193)) | 1610612736));
                            }
                            na7Var.getNotificationCenter().k(kk7.v, arrayList28, Long.valueOf(-j25), Boolean.FALSE);
                        }
                    }
                }
                if (z3) {
                    i8 = 0;
                } else {
                    i8 = 0;
                    na7Var.getNotificationCenter().k(kk7.r, new Object[0]);
                }
                if (z) {
                    i6 |= 64;
                }
                if (arrayList6 != null) {
                    i6 |= kk7.M1;
                }
                if (arrayList7 != null) {
                    int size12 = arrayList7.size();
                    for (int i90 = i8; i90 < size12; i90++) {
                        na7Var.getMessagesStorage().L1((TLRPC.ChatParticipants) arrayList7.get(i90));
                    }
                }
                if (vf6Var7 != null && vf6Var8 == null && vf6Var9 == null) {
                    i9 = 1;
                    i10 = 2;
                } else {
                    i9 = 1;
                    i10 = 2;
                    na7Var.getNotificationCenter().k(kk7.N0, vf6Var7, vf6Var8, vf6Var9, Boolean.TRUE);
                }
                if (i6 != 0) {
                    kk7 notificationCenter4 = na7Var.getNotificationCenter();
                    Object[] objArr3 = new Object[i9];
                    objArr3[0] = Integer.valueOf(i6);
                    notificationCenter4.k(i10, objArr3);
                }
                if (arrayList8 == null) {
                    fl5.z().L(arrayList8);
                    return;
                }
                return;
            }
            na7Var.Z4(null);
        }
        vf6Var10 = vf6Var4;
        z3 = true;
        if (vf6Var10 != null) {
        }
        vf6Var11 = vf6Var5;
        if (vf6Var11 != null) {
        }
        if (r34Var != null) {
        }
        if (vf6Var6 != null) {
        }
        if (z3) {
        }
        if (z) {
        }
        if (arrayList6 != null) {
        }
        if (arrayList7 != null) {
        }
        if (vf6Var7 != null) {
        }
        i9 = 1;
        i10 = 2;
        na7Var.getNotificationCenter().k(kk7.N0, vf6Var7, vf6Var8, vf6Var9, Boolean.TRUE);
        if (i6 != 0) {
        }
        if (arrayList8 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r8.w < r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c3, code lost:
    
        if ((r7.r + r6.pts_count) == r6.pts) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e9, code lost:
    
        if ((r6.updates.size() + r7.s) != r6.pts) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S3(int i, int i2) {
        ArrayList arrayList;
        boolean z;
        if (i == 0) {
            el6 el6Var = new el6(this, (byte) 20);
            arrayList = this.V0;
            Collections.sort(arrayList, el6Var);
        } else if (i == 1) {
            el6 el6Var2 = new el6((byte) 21);
            arrayList = this.W0;
            Collections.sort(arrayList, el6Var2);
        } else if (i == 2) {
            el6 el6Var3 = new el6((byte) 22);
            arrayList = this.X0;
            Collections.sort(arrayList, el6Var3);
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            if (i2 == 2) {
                TLRPC.Updates updates = (TLRPC.Updates) arrayList.get(0);
                if (i == 0) {
                    getMessagesStorage().H1(updates instanceof TLRPC.TL_updatesCombined ? updates.seq_start : updates.seq);
                } else if (i == 1) {
                    getMessagesStorage().F1(updates.pts);
                } else {
                    getMessagesStorage().G1(updates.pts);
                }
            }
            boolean z2 = false;
            while (arrayList.size() > 0) {
                TLRPC.Updates updates2 = (TLRPC.Updates) arrayList.get(0);
                if (i == 0) {
                    int i3 = updates2 instanceof TLRPC.TL_updatesCombined ? updates2.seq_start : updates2.seq;
                    ad7 messagesStorage = getMessagesStorage();
                    messagesStorage.G();
                    if (messagesStorage.w + 1 != i3) {
                        ad7 messagesStorage2 = getMessagesStorage();
                        messagesStorage2.G();
                        if (messagesStorage2.w != i3) {
                            ad7 messagesStorage3 = getMessagesStorage();
                            messagesStorage3.G();
                        }
                    }
                    z = false;
                } else if (i == 1) {
                    int i4 = updates2.pts;
                    ad7 messagesStorage4 = getMessagesStorage();
                    messagesStorage4.G();
                    if (i4 > messagesStorage4.r) {
                        ad7 messagesStorage5 = getMessagesStorage();
                        messagesStorage5.G();
                    }
                    z = 2;
                } else {
                    if (i == 2) {
                        int i5 = updates2.pts;
                        ad7 messagesStorage6 = getMessagesStorage();
                        messagesStorage6.G();
                        if (i5 > messagesStorage6.s) {
                            ad7 messagesStorage7 = getMessagesStorage();
                            messagesStorage7.G();
                        }
                        z = 2;
                    }
                    z = false;
                }
                if (!z) {
                    R3(updates2, true);
                    arrayList.remove(0);
                    z2 = true;
                } else {
                    if (z) {
                        if (U1(i) == 0 || (!z2 && Math.abs(System.currentTimeMillis() - U1(i)) > 1500)) {
                            if (w01.a) {
                                fa4.b("HOLE IN UPDATES QUEUE - getDifference");
                            }
                            U4(i, 0L);
                            arrayList.clear();
                            V0();
                            return;
                        }
                        if (w01.a) {
                            fa4.b("HOLE IN UPDATES QUEUE - will wait more time");
                        }
                        if (z2) {
                            U4(i, System.currentTimeMillis());
                            return;
                        }
                        return;
                    }
                    arrayList.remove(0);
                }
            }
            arrayList.clear();
            if (w01.a) {
                fa4.b("UPDATES QUEUE PROCEED - OK");
            }
        }
        U4(i, 0L);
    }

    public final void S4(long j, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights tL_chatBannedRights, boolean z, d dVar, q21 q21Var) {
        if ((user == null && chat == null) || tL_chatBannedRights == null) {
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.channel = f1(j);
        if (user != null) {
            tL_channels_editBanned.participant = l1(user);
        } else {
            tL_channels_editBanned.participant = j1(chat);
        }
        tL_channels_editBanned.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequest(tL_channels_editBanned, new i45(this, j, q21Var, dVar, tL_channels_editBanned, z));
    }

    public final void T(int i, long j, boolean z) {
        U(j, 1, i, 0, z, null, 0L);
    }

    public final int T0(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return 0;
        }
        int i = dialog.unread_count;
        TLRPC.Chat K0 = K0(Long.valueOf(-dialog.id));
        if (K0 == null || !(K0.forum || K0.monoforum)) {
            return i;
        }
        this.g4.h(-dialog.id);
        return pub.w[0];
    }

    public final int T2(final long j, final long j2, final boolean z, boolean z2, final i8c i8cVar) {
        TL_communities.TL_communities_togglePeerLink tL_communities_togglePeerLink = new TL_communities.TL_communities_togglePeerLink();
        tL_communities_togglePeerLink.community = f1(j2);
        tL_communities_togglePeerLink.peer = h1(j);
        tL_communities_togglePeerLink.deleted = z;
        tL_communities_togglePeerLink.visible = !z2;
        tL_communities_togglePeerLink.hidden = z2;
        return getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLink, new hc((byte) 0), new i8c() { // from class: r87
            @Override // i8c
            public final void a(Object obj, Object obj2) {
                TLRPC.Chat K0;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                na7 na7Var = na7.this;
                long j3 = j;
                i8c i8cVar2 = i8cVar;
                if (tL_error != null && TextUtils.equals("CHANNEL_ALREADY_LINKED", tL_error.text) && (K0 = na7Var.K0(Long.valueOf(-j3))) != null) {
                    na7Var.T2(j3, K0.linked_community_id, true, false, i8cVar2);
                    return;
                }
                boolean z3 = bool instanceof TLRPC.TL_boolTrue;
                long j4 = j2;
                if (z3) {
                    boolean z4 = z;
                    if (j3 > 0) {
                        TLRPC.User V1 = na7Var.V1(Long.valueOf(j3));
                        if (V1 != null) {
                            V1.linked_community_id = z4 ? 0L : j4;
                            V1.flags2 = fod.b(V1.flags2, TLObject.FLAG_21, !z4);
                        }
                    } else {
                        TLRPC.Chat K02 = na7Var.K0(Long.valueOf(-j3));
                        if (K02 != null) {
                            K02.linked_community_id = z4 ? 0L : j4;
                            K02.flags2 = fod.b(K02.flags2, TLObject.FLAG_20, !z4);
                        }
                    }
                }
                na7Var.Y2(0, j4, true);
                i8cVar2.a(bool, tL_error);
            }
        });
    }

    public final void T3(TLRPC.Chat chat, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (chat != null) {
            Long valueOf = Long.valueOf(chat.id);
            ConcurrentHashMap concurrentHashMap = this.b;
            TLRPC.Chat chat2 = (TLRPC.Chat) concurrentHashMap.get(valueOf);
            if (chat2 != chat) {
                ConcurrentHashMap concurrentHashMap2 = this.e;
                if (chat2 != null && !TextUtils.isEmpty(chat2.username)) {
                    concurrentHashMap2.remove(chat2.username.toLowerCase());
                }
                if (chat2 != null && chat2.usernames != null) {
                    for (int i5 = 0; i5 < chat2.usernames.size(); i5++) {
                        TLRPC.TL_username tL_username = chat2.usernames.get(i5);
                        if (tL_username != null && !TextUtils.isEmpty(tL_username.username)) {
                            concurrentHashMap2.remove(tL_username.username.toLowerCase());
                        }
                    }
                }
                if (!TextUtils.isEmpty(chat.username)) {
                    concurrentHashMap2.put(chat.username.toLowerCase(), chat);
                }
                if (chat.usernames != null) {
                    for (int i6 = 0; i6 < chat.usernames.size(); i6++) {
                        TLRPC.TL_username tL_username2 = chat.usernames.get(i6);
                        if (tL_username2 != null && !TextUtils.isEmpty(tL_username2.username) && tL_username2.active) {
                            concurrentHashMap2.put(tL_username2.username.toLowerCase(), chat);
                        }
                    }
                }
                p5(-chat.id, chat.emoji_status);
                if (chat2 != null && chat2.access_hash == 0) {
                    long j = chat.fromMessageDialogId;
                    if (j != 0 && (i4 = chat.fromMessageId) != 0) {
                        chat2.fromMessageDialogId = j;
                        chat2.fromMessageId = i4;
                    }
                }
                byte b = 3;
                byte b2 = 4;
                if (!chat.min) {
                    if (!z) {
                        if (chat2 != null) {
                            if (chat.version != chat2.version) {
                                this.p1.delete(chat.id);
                            }
                            int i7 = chat2.participants_count;
                            if (i7 != 0 && chat.participants_count == 0) {
                                chat.participants_count = i7;
                                chat.flags |= 131072;
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat2.banned_rights;
                            int i8 = tL_chatBannedRights != null ? tL_chatBannedRights.flags : 0;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                            int i9 = tL_chatBannedRights2 != null ? tL_chatBannedRights2.flags : 0;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat2.default_banned_rights;
                            int i10 = tL_chatBannedRights3 != null ? tL_chatBannedRights3.flags : 0;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = chat.default_banned_rights;
                            int i11 = tL_chatBannedRights4 != null ? tL_chatBannedRights4.flags : 0;
                            chat2.default_banned_rights = tL_chatBannedRights4;
                            int i12 = chat2.flags;
                            if (tL_chatBannedRights4 == null) {
                                i2 = i12 & (-262145);
                                chat2.flags = i2;
                            } else {
                                i2 = i12 | 262144;
                                chat2.flags = i2;
                            }
                            chat2.banned_rights = tL_chatBannedRights2;
                            if (tL_chatBannedRights2 == null) {
                                i3 = i2 & (-32769);
                                chat2.flags = i3;
                            } else {
                                i3 = i2 | 32768;
                                chat2.flags = i3;
                            }
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                            chat2.admin_rights = tL_chatAdminRights;
                            if (tL_chatAdminRights == null) {
                                chat2.flags = i3 & (-16385);
                            } else {
                                chat2.flags = i3 | TLObject.FLAG_14;
                            }
                            if (chat.stories_hidden_min) {
                                chat.stories_hidden = chat2.stories_hidden;
                            }
                            if (i8 != i9 || i10 != i11) {
                                gl.c3(new z47(this, chat, b));
                            }
                        }
                        concurrentHashMap.put(Long.valueOf(chat.id), chat);
                    } else if (chat2 == null) {
                        concurrentHashMap.put(Long.valueOf(chat.id), chat);
                    } else if (chat2.min) {
                        chat.title = chat2.title;
                        chat.photo = chat2.photo;
                        chat.broadcast = chat2.broadcast;
                        chat.verified = chat2.verified;
                        chat.megagroup = chat2.megagroup;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights5 = chat2.default_banned_rights;
                        if (tL_chatBannedRights5 != null) {
                            chat.default_banned_rights = tL_chatBannedRights5;
                            chat.flags |= 262144;
                        }
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chat2.admin_rights;
                        if (tL_chatAdminRights2 != null) {
                            chat.admin_rights = tL_chatAdminRights2;
                            chat.flags |= TLObject.FLAG_14;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights6 = chat2.banned_rights;
                        if (tL_chatBannedRights6 != null) {
                            chat.banned_rights = tL_chatBannedRights6;
                            chat.flags |= 32768;
                        }
                        String str = chat2.username;
                        if (str != null) {
                            chat.username = str;
                            i = chat.flags | 64;
                            chat.flags = i;
                        } else {
                            i = chat.flags & (-65);
                            chat.flags = i;
                            chat.username = null;
                        }
                        int i13 = chat2.participants_count;
                        if (i13 != 0 && chat.participants_count == 0) {
                            chat.participants_count = i13;
                            chat.flags = i | 131072;
                        }
                        concurrentHashMap.put(Long.valueOf(chat.id), chat);
                    }
                    f(chat);
                } else if (chat2 == null) {
                    concurrentHashMap.put(Long.valueOf(chat.id), chat);
                    f(chat);
                } else if (!z) {
                    LruCache lruCache = Y1().b;
                    String str2 = chat2.username;
                    if (str2 != null && !TextUtils.equals(str2, chat.username)) {
                        lruCache.remove(chat2.username);
                        String str3 = chat.username;
                        if (str3 != null) {
                            lruCache.put(str3, new j7c(-chat.id));
                        }
                    }
                    chat2.title = chat.title;
                    chat2.photo = chat.photo;
                    chat2.broadcast = chat.broadcast;
                    chat2.verified = chat.verified;
                    chat2.megagroup = chat.megagroup;
                    chat2.call_not_empty = chat.call_not_empty;
                    chat2.call_active = chat.call_active;
                    chat2.monoforum = chat.monoforum;
                    chat2.broadcast_messages_allowed = chat.broadcast_messages_allowed;
                    if ((chat.flags2 & 262144) != 0) {
                        chat2.linked_monoforum_id = chat.linked_monoforum_id;
                        chat2.flags2 |= 262144;
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = chat.default_banned_rights;
                    if (tL_chatBannedRights7 != null) {
                        chat2.default_banned_rights = tL_chatBannedRights7;
                        chat2.flags |= 262144;
                    }
                    TLRPC.TL_chatAdminRights tL_chatAdminRights3 = chat.admin_rights;
                    if (tL_chatAdminRights3 != null) {
                        chat2.admin_rights = tL_chatAdminRights3;
                        chat2.flags |= TLObject.FLAG_14;
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = chat.banned_rights;
                    if (tL_chatBannedRights8 != null) {
                        chat2.banned_rights = tL_chatBannedRights8;
                        chat2.flags |= 32768;
                    }
                    String str4 = chat.username;
                    if (str4 != null) {
                        chat2.username = str4;
                        chat2.flags |= 64;
                    } else {
                        chat2.flags &= -65;
                        chat2.username = null;
                    }
                    int i14 = chat.participants_count;
                    if (i14 != 0) {
                        chat2.participants_count = i14;
                    }
                    f(chat2);
                    boolean z2 = chat2.forum;
                    boolean z3 = chat.forum;
                    if (z2 != z3) {
                        chat2.forum = z3;
                        int i15 = chat2.flags;
                        if (z3) {
                            chat2.flags = i15 | TLObject.FLAG_30;
                        } else {
                            chat2.flags = i15 & (-1073741825);
                        }
                        getNotificationCenter().k(kk7.t5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                    }
                }
                if (chat2 != null && chat2.forum != chat.forum) {
                    gl.c3(new z47(this, chat, b2));
                }
                if (chat2 != null && chat2.collapsed_in_dialogs != chat.collapsed_in_dialogs) {
                    gl.c3(new z47(this, chat, (byte) 5));
                }
                if (chat instanceof TLRPC.TL_community) {
                    long j2 = chat.id;
                    if (L0(j2) == null) {
                        getMessagesStorage().C0(j2, false, null, false, false, 0);
                        Y2(0, j2, false);
                    }
                }
            }
        }
    }

    public final void T4(boolean z) {
        if (this.P3 != z) {
            SharedPreferences.Editor edit = this.X3.edit();
            this.P3 = z;
            edit.putBoolean("savedViewAsChats", z).apply();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0480  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(long j, int i, int i2, int i3, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        vf6 vf6Var;
        int i4;
        long j3;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        long y;
        boolean z5;
        ArrayList arrayList;
        int i7;
        int i8;
        boolean z6;
        TLRPC.Chat K0;
        int i9;
        int i10;
        if (i2 == 2) {
            if (j == getUserConfig().e()) {
                D1().b();
            }
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new bb7(messagesStorage, i2, j, (byte) 1));
            return;
        }
        long j4 = j;
        int i11 = 0;
        while (true) {
            vf6Var = this.u1;
            if (i11 >= vf6Var.m()) {
                break;
            }
            ja7 ja7Var = (ja7) vf6Var.n(i11);
            if (ja7Var.a != null) {
                int i12 = 0;
                while (true) {
                    if (i12 >= ja7Var.a.chats.size()) {
                        break;
                    }
                    if (ja7Var.a.chats.get(i12).id == (-j4)) {
                        ja7Var.a.chats.remove(i12);
                        break;
                    }
                    i12++;
                }
                for (int i13 = 0; i13 < ja7Var.a.peers.size(); i13++) {
                    long j5 = -j4;
                    if (ja7Var.a.peers.get(i13).peer.channel_id == j5 || ja7Var.a.peers.get(i13).peer.chat_id == j5) {
                        ja7Var.a.peers.remove(i13);
                        break;
                    }
                }
            }
            i11++;
        }
        vf6Var.l(j4);
        this.v1.l(j4);
        if (i == 1 && i3 == 0) {
            ad7 messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new go6((Object) messagesStorage2, j, (Object) new o87(this, j4, i2, z, inputPeer, j2), (byte) 19));
            return;
        }
        if (i2 == 0 || i2 == 3) {
            hq6 mediaDataController = getMediaDataController();
            Pattern pattern = hq6.U1;
            mediaDataController.k2(0, j4);
        }
        if (i != 0) {
            if (w01.a) {
                fa4.b("delete dialog with id " + j4);
            }
            if (j4 == getUserConfig().e()) {
                D1().b();
            }
            ad7 messagesStorage3 = getMessagesStorage();
            messagesStorage3.a.c(new bb7(messagesStorage3, i2, j4, (byte) 1));
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j4);
            if (i2 == 0 || i2 == 3) {
                z5 = true;
                getNotificationCenter().k(kk7.x1, Long.valueOf(j4), 0);
                getNotificationsController().f(j4, 0L);
                if (xt5.F1 == this.currentAccount && (arrayList = xt5.C1) != null && j4 <= 0) {
                    int size = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        if (k27.B1((TLRPC.Peer) xt5.C1.get(i14)) == j4) {
                            xt5.C1.remove(i14);
                            break;
                        }
                        i14++;
                    }
                    if (xt5.C1.isEmpty()) {
                        xt5.C1 = null;
                    }
                }
            } else {
                z5 = true;
            }
            if (i2 == 0) {
                i4 = i2;
                getMediaDataController().F(j, 0L, false);
                j4 = j;
            } else {
                i4 = i2;
            }
            if (dialog != null) {
                i7 = i == 2 ? Math.max(Math.max(Math.max(0, dialog.top_message), dialog.read_inbox_max_id), dialog.read_outbox_max_id) : i3;
                if (i4 == 0 || i4 == 3) {
                    TLRPC.Dialog dialog2 = this.q2;
                    j3 = 0;
                    z6 = (dialog2 == null || dialog2.id != j4) ? false : z5;
                    if (z6) {
                        boolean z7 = z5;
                        this.r2 = z7;
                        long j6 = dialog2.id;
                        if (j6 < 0 && (K0 = K0(Long.valueOf(-j6))) != null) {
                            K0.left = z7;
                        }
                        Z4(null);
                    } else {
                        i4(dialog);
                        int i15 = dialog.folder_id;
                        SparseIntArray sparseIntArray = this.S1;
                        int i16 = sparseIntArray.get(i15, 0);
                        if (i16 > 0) {
                            sparseIntArray.put(dialog.folder_id, i16 - 1);
                        }
                    }
                } else {
                    dialog.unread_count = 0;
                    z6 = false;
                    j3 = 0;
                }
                if (!z6) {
                    long j7 = dialog.id;
                    vf6 vf6Var2 = this.S;
                    ArrayList arrayList2 = (ArrayList) vf6Var2.f(j7);
                    vf6Var2.l(dialog.id);
                    vf6 vf6Var3 = this.T;
                    SparseArray sparseArray = this.V;
                    if (arrayList2 == null || arrayList2.size() <= 0 || arrayList2.get(0) == null) {
                        i9 = dialog.top_message;
                        k27 k27Var = (k27) sparseArray.get(i9);
                        if (k27Var != null && k27Var.k.peer_id.channel_id == j3) {
                            sparseArray.remove(dialog.top_message);
                        }
                        if (k27Var != null) {
                            long j8 = k27Var.k.random_id;
                            if (j8 != j3) {
                                vf6Var3.l(j8);
                            }
                        }
                    } else {
                        i9 = ((k27) arrayList2.get(0)).e1();
                        int i17 = 0;
                        while (i17 < arrayList2.size()) {
                            k27 k27Var2 = (k27) arrayList2.get(i17);
                            if (k27Var2 != null && k27Var2.e1() > i9) {
                                i9 = k27Var2.e1();
                            }
                            if (k27Var2 != null) {
                                i10 = i17;
                                if (k27Var2.k.peer_id.channel_id == j3) {
                                    sparseArray.remove(k27Var2.e1());
                                }
                            } else {
                                i10 = i17;
                            }
                            if (k27Var2 != null) {
                                long j9 = k27Var2.k.random_id;
                                if (j9 != j3) {
                                    vf6Var3.l(j9);
                                }
                            }
                            i17 = i10 + 1;
                        }
                    }
                    if (i4 != 1 || cf3.B(j4) || i9 <= 0) {
                        dialog.top_message = 0;
                    } else {
                        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                        tL_messageService.id = dialog.top_message;
                        tL_messageService.out = getUserConfig().e() == j4;
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_messageService.from_id = tL_peerUser;
                        tL_peerUser.user_id = getUserConfig().e();
                        tL_messageService.flags |= 256;
                        tL_messageService.action = new TLRPC.TL_messageActionHistoryClear();
                        tL_messageService.date = dialog.last_message_date;
                        tL_messageService.dialog_id = j4;
                        tL_messageService.peer_id = w1(j);
                        boolean contains = this.l0.contains(Long.valueOf(tL_messageService.dialog_id));
                        ArrayList t = tb4.t(new k27(this.currentAccount, tL_messageService, contains, contains));
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(tL_messageService);
                        r5(0, j4, t);
                        getMessagesStorage().g1(arrayList3, false, true, false, 0, false, 0, 0L);
                    }
                }
                i8 = 2;
            } else {
                j3 = 0;
                i7 = i3;
                i8 = 2;
                z6 = false;
            }
            if (i == i8) {
                Integer num = (Integer) this.P.get(Long.valueOf(j4));
                if (num != null) {
                    i7 = Math.max(num.intValue(), i7);
                }
                Integer num2 = (Integer) this.Q.get(Long.valueOf(j4));
                if (num2 != null) {
                    i7 = Math.max(num2.intValue(), i7);
                }
            }
            if (!this.j0) {
                int i18 = kk7.r;
                if (z6) {
                    getNotificationCenter().k(i18, Boolean.TRUE);
                } else {
                    getNotificationCenter().k(i18, new Object[0]);
                    getNotificationCenter().k(kk7.d0, Long.valueOf(j4), Boolean.FALSE, null);
                }
            }
            getMessagesStorage().a.c(new r57(this, j4, (byte) 19));
            i5 = i7;
            i6 = 3;
        } else {
            i4 = i2;
            j3 = 0;
            i5 = i3;
            i6 = 3;
        }
        if (i4 == i6) {
            return;
        }
        if (cf3.B(j4)) {
            int i19 = (int) (j & 4294967295L);
            if (i4 == 1) {
                getSecretChatHelper().r(Y0(Integer.valueOf(i19)), null);
                return;
            } else {
                getSecretChatHelper().f(i19, z);
                return;
            }
        }
        TLRPC.InputPeer h1 = inputPeer == null ? h1(j) : inputPeer;
        boolean z8 = h1 instanceof TLRPC.TL_inputPeerChannel;
        int i20 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (z8 && i4 == 0) {
            z2 = false;
        } else {
            if (i5 <= 0 || i5 == Integer.MAX_VALUE) {
                z2 = false;
            } else {
                LongSparseIntArray longSparseIntArray = this.U;
                z2 = false;
                longSparseIntArray.put(j4, Math.max(longSparseIntArray.get(j4, 0), i5));
            }
            if (j2 == j3) {
                try {
                    nativeByteBuffer2 = new NativeByteBuffer(h1.getObjectSize() + 28);
                    try {
                        nativeByteBuffer2.writeInt32(13);
                        nativeByteBuffer2.writeInt64(j4);
                        nativeByteBuffer2.writeBool(i != 0 ? true : z2);
                        nativeByteBuffer2.writeInt32(i4);
                        nativeByteBuffer2.writeInt32(i5);
                        z3 = z;
                    } catch (Exception e) {
                        e = e;
                        z3 = z;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z3 = z;
                    z4 = true;
                    nativeByteBuffer = null;
                }
                try {
                    nativeByteBuffer2.writeBool(z3);
                    h1.serializeToStream(nativeByteBuffer2);
                } catch (Exception e3) {
                    e = e3;
                    nativeByteBuffer = nativeByteBuffer2;
                    z4 = true;
                    fa4.g(e, z4);
                    nativeByteBuffer2 = nativeByteBuffer;
                    y = getMessagesStorage().y(nativeByteBuffer2);
                    if (!z8) {
                    }
                }
                y = getMessagesStorage().y(nativeByteBuffer2);
                if (!z8) {
                    TLRPC.TL_messages_deleteHistory tL_messages_deleteHistory = new TLRPC.TL_messages_deleteHistory();
                    tL_messages_deleteHistory.peer = h1;
                    if (i5 > 0) {
                        i20 = i5;
                    }
                    tL_messages_deleteHistory.max_id = i20;
                    if (i4 != 0) {
                        z2 = true;
                    }
                    tL_messages_deleteHistory.just_clear = z2;
                    tL_messages_deleteHistory.revoke = z3;
                    getConnectionsManager().sendRequest(tL_messages_deleteHistory, new s87(this, y, j4, i4, i5, z3, h1), 64);
                    return;
                }
                if (i4 == 0) {
                    if (y != j3) {
                        getMessagesStorage().n1(y);
                        return;
                    }
                    return;
                }
                TLRPC.TL_channels_deleteHistory tL_channels_deleteHistory = new TLRPC.TL_channels_deleteHistory();
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_deleteHistory.channel = tL_inputChannel;
                tL_channels_deleteHistory.for_everyone = z3;
                tL_inputChannel.channel_id = h1.channel_id;
                tL_inputChannel.access_hash = h1.access_hash;
                if (i5 <= 0) {
                    i5 = Integer.MAX_VALUE;
                }
                tL_channels_deleteHistory.max_id = i5;
                getConnectionsManager().sendRequest(tL_channels_deleteHistory, new x47(this, y, (byte) 16), 64);
                return;
            }
        }
        z3 = z;
        y = j2;
        if (!z8) {
        }
    }

    public final ArrayList U0(int i) {
        ArrayList arrayList = (ArrayList) this.w.get(i);
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public final long U1(int i) {
        if (i == 0) {
            return this.Y0;
        }
        if (i == 1) {
            return this.Z0;
        }
        if (i == 2) {
            return this.a1;
        }
        return 0L;
    }

    public final void U2(boolean z) {
        gl.r(this.w4);
        l97 l97Var = this.M2;
        if (z) {
            l97Var.d(this.currentAccount, 0);
        }
        l97Var.c(this.currentAccount, 0, new f97(this, (byte) 1));
    }

    public final void U3(TLRPC.ChatFull chatFull) {
        this.c1.k(chatFull, chatFull.id);
        this.i4.M(-chatFull.id);
    }

    public final void U4(int i, long j) {
        if (i == 0) {
            this.Y0 = j;
        } else if (i == 1) {
            this.Z0 = j;
        } else if (i == 2) {
            this.a1 = j;
        }
    }

    public final void V(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j, int i, boolean z, int i2) {
        W(arrayList, arrayList2, encryptedChat, j, z, i2, false, 0L, null, i);
    }

    public final void V0() {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        int i = messagesStorage.r;
        ad7 messagesStorage2 = getMessagesStorage();
        messagesStorage2.G();
        int i2 = messagesStorage2.n;
        ad7 messagesStorage3 = getMessagesStorage();
        messagesStorage3.G();
        W0(i, i2, messagesStorage3.s, false);
    }

    public final TLRPC.User V1(Long l) {
        return l.longValue() == 0 ? y6c.h(this.currentAccount).f() : (TLRPC.User) this.d.get(l);
    }

    public final void V2(long j, boolean z) {
        LongSparseIntArray longSparseIntArray = this.r1;
        if ((SystemClock.elapsedRealtime() / 1000) - longSparseIntArray.get(j) < 60) {
            return;
        }
        longSparseIntArray.put(j, (int) (SystemClock.elapsedRealtime() / 1000));
        if (z) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new ua7(messagesStorage, j, (byte) 7));
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = f1(j);
        tL_channels_getParticipants.limit = 100;
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new x47(this, j, (byte) 2));
    }

    public final void V3(ArrayList arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            T3((TLRPC.Chat) arrayList.get(i), z);
        }
    }

    public final void V4(final long j, final TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, final boolean z, final d dVar, boolean z2, boolean z3, String str2, final Runnable runnable, final z97 z97Var) {
        if (user == null || tL_chatAdminRights == null) {
            return;
        }
        final TLRPC.Chat K0 = K0(Long.valueOf(j));
        final boolean Y = hc2.Y(K0);
        boolean z4 = true;
        if (hc2.T(K0)) {
            final TLRPC.TL_channels_editAdmin tL_channels_editAdmin = new TLRPC.TL_channels_editAdmin();
            tL_channels_editAdmin.channel = g1(K0);
            tL_channels_editAdmin.user_id = o1(user);
            tL_channels_editAdmin.admin_rights = tL_chatAdminRights;
            if (!TextUtils.isEmpty(str)) {
                tL_channels_editAdmin.flags |= 1;
                tL_channels_editAdmin.rank = str;
            }
            RequestDelegate requestDelegate = new RequestDelegate() { // from class: t77
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    na7 na7Var = na7.this;
                    if (tL_error == null) {
                        na7Var.R3((TLRPC.Updates) tLObject, false);
                        gl.d3(new a87(na7Var, j, runnable, (byte) 0), 1000L);
                        return;
                    }
                    boolean equals = "USER_PRIVACY_RESTRICTED".equals(tL_error.text);
                    z97 z97Var2 = z97Var;
                    if (equals) {
                        TLRPC.Chat chat = K0;
                        if (!hc2.Y(chat) && hc2.y(3, chat)) {
                            gl.c3(new b87((Object) na7Var, (Object) user, (Object) chat, (Object) z97Var2, (Object) tL_error, (byte) 0));
                            return;
                        }
                    }
                    gl.c3(new d87(na7Var, tL_error, dVar, tL_channels_editAdmin, z, Y));
                    if (z97Var2 != null) {
                        gl.c3(new e87(z97Var2, tL_error, (byte) 0));
                    }
                }
            };
            if (user.bot || !z2) {
                getConnectionsManager().sendRequest(tL_channels_editAdmin, requestDelegate);
                return;
            } else {
                j(j, user, 0, str2, dVar, true, new lo6((Object) this, (Object) tL_channels_editAdmin, (Object) requestDelegate, (byte) 18), z97Var, null);
                return;
            }
        }
        TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = new TLRPC.TL_messages_editChatAdmin();
        tL_messages_editChatAdmin.chat_id = j;
        tL_messages_editChatAdmin.user_id = o1(user);
        if (!z3 && !tL_chatAdminRights.change_info && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.manage_call) {
            z4 = false;
        }
        boolean z5 = z4;
        tL_messages_editChatAdmin.is_admin = z5;
        wg3 wg3Var = new wg3(this, j, runnable, dVar, tL_messages_editChatAdmin, z97Var);
        if (z5 || z2 || !TextUtils.isEmpty(str2)) {
            j(j, user, 0, str2, dVar, true, new lo6((Object) this, (Object) tL_messages_editChatAdmin, (Object) wg3Var, (byte) 19), z97Var, null);
        } else {
            getConnectionsManager().sendRequest(tL_messages_editChatAdmin, wg3Var);
        }
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j, boolean z, int i, boolean z2, long j2, TLObject tLObject, int i2) {
        X(arrayList, arrayList2, encryptedChat, j, z, i, z2, j2, tLObject, i2, false, 0);
    }

    public final void W0(int i, int i2, int i3, boolean z) {
        c4(gba.e, gba.f);
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        byte b = 1;
        if (messagesStorage.r == 0) {
            if (this.a2) {
                return;
            }
            this.a2 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new y47(this, (byte) 24));
            return;
        }
        if (z || !this.Y1) {
            this.Y1 = true;
            TLRPC.TL_updates_getDifference tL_updates_getDifference = new TLRPC.TL_updates_getDifference();
            tL_updates_getDifference.pts = i;
            tL_updates_getDifference.date = i2;
            tL_updates_getDifference.qts = i3;
            if (this.Z1) {
                tL_updates_getDifference.flags |= 1;
                if (a.n()) {
                    tL_updates_getDifference.pts_total_limit = 5000;
                } else {
                    tL_updates_getDifference.pts_total_limit = 1000;
                }
                this.Z1 = false;
            }
            if (tL_updates_getDifference.date == 0) {
                tL_updates_getDifference.date = getConnectionsManager().getCurrentTime();
            }
            if (w01.a) {
                StringBuilder p = ir2.p("start getDifference with date = ", i2, " pts = ", i, " qts = ");
                p.append(i3);
                fa4.b(p.toString());
                fa4.b("getDifference: isUpdating = true");
            }
            getConnectionsManager().setIsUpdating(true);
            getConnectionsManager().sendRequest(tL_updates_getDifference, new fl6(this, i2, i3, b));
        }
    }

    public final TLRPC.UserFull W1(long j) {
        return (TLRPC.UserFull) this.b1.f(j);
    }

    public final void W2(Long l, hy3 hy3Var, int i) {
        HashSet hashSet = this.n1;
        if (hy3Var == null && (hashSet.contains(l) || this.o1.contains(l))) {
            return;
        }
        hashSet.add(l);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        l.getClass();
        tL_channels_getParticipants.channel = g1(K0(l));
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = i;
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new k45(this, l, hy3Var, (byte) 16));
    }

    public final void W3(long j, TLRPC.DraftMessage draftMessage) {
        vf6 vf6Var = this.R;
        if (vf6Var.h(j) < 0) {
            if (!hc2.o0(this.currentAccount, j) || hc2.z(this.currentAccount, 24, j)) {
                hq6 mediaDataController = getMediaDataController();
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                if (size > 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(size - 1);
                    if (draftMessage.date < cf3.i(dialog, mediaDataController.T(dialog.id, 0L))) {
                        return;
                    }
                }
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = j;
                tL_dialog.draft = draftMessage;
                tL_dialog.folder_id = ((Integer) mediaDataController.t1.g(0, j)).intValue();
                tL_dialog.flags = (j >= 0 || !hc2.T(K0(Long.valueOf(-j)))) ? 0 : 1;
                vf6Var.k(tL_dialog, j);
                arrayList.add(tL_dialog);
                Z4(null);
            }
        }
    }

    public final void W4(TL_account.TL_webBrowserSettings tL_webBrowserSettings) {
        this.m5 = tL_webBrowserSettings;
        int i = this.currentAccount;
        long j = tL_webBrowserSettings.hash;
        this.n5.g(i, null, tL_webBrowserSettings);
        getNotificationCenter().k(kk7.T5, new Object[0]);
    }

    public final void X(ArrayList arrayList, ArrayList arrayList2, TLRPC.EncryptedChat encryptedChat, long j, boolean z, int i, boolean z2, long j2, TLObject tLObject, int i2, boolean z3, int i3) {
        int i4;
        byte b;
        byte b2;
        byte b3;
        long j3;
        ArrayList<Integer> arrayList3;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        NativeByteBuffer nativeByteBuffer3;
        long y;
        TLRPC.TL_messages_deleteMessages tL_messages_deleteMessages;
        boolean z4;
        NativeByteBuffer nativeByteBuffer4;
        NativeByteBuffer nativeByteBuffer5;
        long y2;
        TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages;
        boolean z5;
        NativeByteBuffer nativeByteBuffer6;
        NativeByteBuffer nativeByteBuffer7;
        long y3;
        TLRPC.TL_messages_deleteQuickReplyMessages tL_messages_deleteQuickReplyMessages;
        boolean z6;
        NativeByteBuffer nativeByteBuffer8;
        NativeByteBuffer nativeByteBuffer9;
        long y4;
        TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages;
        long j4;
        byte b4;
        long j5 = j;
        boolean z7 = i == 1;
        byte b5 = 5;
        boolean z8 = i == 5;
        boolean z9 = i == 9;
        if ((arrayList == null || arrayList.isEmpty()) && j2 == 0) {
            return;
        }
        if (j2 == 0) {
            if (j5 == 0 || !cf3.y(j5)) {
                j4 = 0;
            } else {
                TLRPC.Chat K0 = K0(Long.valueOf(-j5));
                j4 = hc2.T(K0) ? K0.id : 0L;
            }
            if (z2) {
                arrayList3 = null;
            } else {
                ArrayList<Integer> arrayList4 = new ArrayList<>();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Integer num = (Integer) arrayList.get(i5);
                    if (num.intValue() > 0) {
                        arrayList4.add(num);
                    }
                }
                arrayList3 = arrayList4;
            }
            if (z7) {
                getMessagesStorage().M0(j5, arrayList, true, false, 1, 0);
                j5 = j;
                i4 = i2;
                b = 5;
            } else if (z8) {
                if (i == 5) {
                    ox8 f = ox8.f(this.currentAccount);
                    int size2 = arrayList.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        Integer num2 = (Integer) obj;
                        num2.getClass();
                        ArrayList arrayList5 = f.c;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList5.size()) {
                                b4 = b5;
                                break;
                            }
                            nx8 nx8Var = (nx8) arrayList5.get(i7);
                            b4 = b5;
                            if (nx8Var.h.contains(num2)) {
                                nx8Var.h.remove(num2);
                                if (nx8Var.a() <= 0) {
                                    arrayList5.remove(nx8Var);
                                }
                                kk7.f(f.a).k(kk7.E1, new Object[0]);
                            } else {
                                i7++;
                                b5 = b4;
                            }
                        }
                        b5 = b4;
                    }
                }
                b = b5;
                j5 = j;
                i4 = i2;
                getMessagesStorage().M0(j5, arrayList, true, false, 5, i4);
            } else {
                b = 5;
                if (z9) {
                    j5 = j;
                    i4 = i2;
                    getMessagesStorage().M0(j5, arrayList, true, false, 9, i4);
                } else {
                    if (j4 == 0) {
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            k27 k27Var = (k27) this.V.get(((Integer) arrayList.get(i8)).intValue());
                            if (k27Var != null) {
                                k27Var.Z = true;
                            }
                        }
                    } else {
                        n3(arrayList, j);
                    }
                    i4 = i2;
                    getMessagesStorage().M0(j, arrayList, true, z, 0, i4);
                    j5 = j;
                    j3 = j4;
                    getMessagesStorage().O1(j5, j3, arrayList, null);
                    kk7 notificationCenter = getNotificationCenter();
                    Long valueOf = Long.valueOf(j3);
                    Boolean valueOf2 = Boolean.valueOf(z7);
                    Boolean valueOf3 = Boolean.valueOf(z3);
                    Integer valueOf4 = Integer.valueOf(i3);
                    Object[] objArr = new Object[6];
                    objArr[0] = arrayList;
                    objArr[1] = valueOf;
                    objArr[2] = valueOf2;
                    b3 = 3;
                    objArr[3] = Boolean.FALSE;
                    b2 = 4;
                    objArr[4] = valueOf3;
                    objArr[b] = valueOf4;
                    notificationCenter.k(kk7.v, objArr);
                }
            }
            j3 = j4;
            kk7 notificationCenter2 = getNotificationCenter();
            Long valueOf5 = Long.valueOf(j3);
            Boolean valueOf22 = Boolean.valueOf(z7);
            Boolean valueOf32 = Boolean.valueOf(z3);
            Integer valueOf42 = Integer.valueOf(i3);
            Object[] objArr2 = new Object[6];
            objArr2[0] = arrayList;
            objArr2[1] = valueOf5;
            objArr2[2] = valueOf22;
            b3 = 3;
            objArr2[3] = Boolean.FALSE;
            b2 = 4;
            objArr2[4] = valueOf32;
            objArr2[b] = valueOf42;
            notificationCenter2.k(kk7.v, objArr2);
        } else {
            i4 = i2;
            b = 5;
            b2 = 4;
            b3 = 3;
            j3 = tLObject instanceof TLRPC.TL_channels_deleteMessages ? ((TLRPC.TL_channels_deleteMessages) tLObject).channel.channel_id : 0L;
            arrayList3 = null;
        }
        if (z2) {
            return;
        }
        if (z7) {
            if (tLObject instanceof TLRPC.TL_messages_deleteScheduledMessages) {
                tL_messages_deleteScheduledMessages = (TLRPC.TL_messages_deleteScheduledMessages) tLObject;
                y4 = j2;
            } else {
                TLRPC.TL_messages_deleteScheduledMessages tL_messages_deleteScheduledMessages2 = new TLRPC.TL_messages_deleteScheduledMessages();
                tL_messages_deleteScheduledMessages2.id = arrayList3;
                tL_messages_deleteScheduledMessages2.peer = h1(j5);
                try {
                    nativeByteBuffer9 = new NativeByteBuffer(tL_messages_deleteScheduledMessages2.getObjectSize() + 12);
                } catch (Exception e) {
                    e = e;
                    z6 = true;
                    nativeByteBuffer8 = null;
                }
                try {
                    nativeByteBuffer9.writeInt32(24);
                    nativeByteBuffer9.writeInt64(j5);
                    tL_messages_deleteScheduledMessages2.serializeToStream(nativeByteBuffer9);
                } catch (Exception e2) {
                    e = e2;
                    nativeByteBuffer8 = nativeByteBuffer9;
                    z6 = true;
                    fa4.g(e, z6);
                    nativeByteBuffer9 = nativeByteBuffer8;
                    y4 = getMessagesStorage().y(nativeByteBuffer9);
                    tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
                    getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new x47(this, y4, b3));
                    return;
                }
                y4 = getMessagesStorage().y(nativeByteBuffer9);
                tL_messages_deleteScheduledMessages = tL_messages_deleteScheduledMessages2;
            }
            getConnectionsManager().sendRequest(tL_messages_deleteScheduledMessages, new x47(this, y4, b3));
            return;
        }
        if (z8) {
            if (tLObject instanceof TLRPC.TL_messages_deleteQuickReplyMessages) {
                tL_messages_deleteQuickReplyMessages = (TLRPC.TL_messages_deleteQuickReplyMessages) tLObject;
                y3 = j2;
            } else {
                TLRPC.TL_messages_deleteQuickReplyMessages tL_messages_deleteQuickReplyMessages2 = new TLRPC.TL_messages_deleteQuickReplyMessages();
                tL_messages_deleteQuickReplyMessages2.id = arrayList3;
                tL_messages_deleteQuickReplyMessages2.shortcut_id = i4;
                try {
                    nativeByteBuffer7 = new NativeByteBuffer(tL_messages_deleteQuickReplyMessages2.getObjectSize() + 16);
                } catch (Exception e3) {
                    e = e3;
                    z5 = true;
                    nativeByteBuffer6 = null;
                }
                try {
                    nativeByteBuffer7.writeInt32(kk7.n1);
                    nativeByteBuffer7.writeInt64(j5);
                    nativeByteBuffer7.writeInt32(i4);
                    tL_messages_deleteQuickReplyMessages2.serializeToStream(nativeByteBuffer7);
                } catch (Exception e4) {
                    e = e4;
                    nativeByteBuffer6 = nativeByteBuffer7;
                    z5 = true;
                    fa4.g(e, z5);
                    nativeByteBuffer7 = nativeByteBuffer6;
                    y3 = getMessagesStorage().y(nativeByteBuffer7);
                    tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
                    getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new x47(this, y3, b2));
                    return;
                }
                y3 = getMessagesStorage().y(nativeByteBuffer7);
                tL_messages_deleteQuickReplyMessages = tL_messages_deleteQuickReplyMessages2;
            }
            getConnectionsManager().sendRequest(tL_messages_deleteQuickReplyMessages, new x47(this, y3, b2));
            return;
        }
        if (j3 != 0) {
            if (tLObject != null) {
                tL_channels_deleteMessages = (TLRPC.TL_channels_deleteMessages) tLObject;
                y2 = j2;
            } else {
                TLRPC.TL_channels_deleteMessages tL_channels_deleteMessages2 = new TLRPC.TL_channels_deleteMessages();
                tL_channels_deleteMessages2.id = arrayList3;
                tL_channels_deleteMessages2.channel = f1(j3);
                try {
                    nativeByteBuffer5 = new NativeByteBuffer(tL_channels_deleteMessages2.getObjectSize() + 12);
                } catch (Exception e5) {
                    e = e5;
                    z4 = true;
                    nativeByteBuffer4 = null;
                }
                try {
                    nativeByteBuffer5.writeInt32(24);
                    nativeByteBuffer5.writeInt64(j5);
                    tL_channels_deleteMessages2.serializeToStream(nativeByteBuffer5);
                } catch (Exception e6) {
                    e = e6;
                    nativeByteBuffer4 = nativeByteBuffer5;
                    z4 = true;
                    fa4.g(e, z4);
                    nativeByteBuffer5 = nativeByteBuffer4;
                    y2 = getMessagesStorage().y(nativeByteBuffer5);
                    tL_channels_deleteMessages = tL_channels_deleteMessages2;
                    getConnectionsManager().sendRequest(tL_channels_deleteMessages, new t57(this, j3, y2, (byte) 0));
                    return;
                }
                y2 = getMessagesStorage().y(nativeByteBuffer5);
                tL_channels_deleteMessages = tL_channels_deleteMessages2;
            }
            getConnectionsManager().sendRequest(tL_channels_deleteMessages, new t57(this, j3, y2, (byte) 0));
            return;
        }
        if (arrayList2 == null || encryptedChat == null || arrayList2.isEmpty()) {
            nativeByteBuffer = null;
        } else {
            nativeByteBuffer = null;
            getSecretChatHelper().t(encryptedChat, arrayList2, null);
        }
        if (tLObject instanceof TLRPC.TL_messages_deleteMessages) {
            tL_messages_deleteMessages = (TLRPC.TL_messages_deleteMessages) tLObject;
            y = j2;
        } else {
            TLRPC.TL_messages_deleteMessages tL_messages_deleteMessages2 = new TLRPC.TL_messages_deleteMessages();
            tL_messages_deleteMessages2.id = arrayList3;
            tL_messages_deleteMessages2.revoke = z;
            try {
                nativeByteBuffer3 = new NativeByteBuffer(tL_messages_deleteMessages2.getObjectSize() + 12);
            } catch (Exception e7) {
                e = e7;
                nativeByteBuffer2 = nativeByteBuffer;
            }
            try {
                nativeByteBuffer3.writeInt32(24);
                nativeByteBuffer3.writeInt64(j5);
                tL_messages_deleteMessages2.serializeToStream(nativeByteBuffer3);
            } catch (Exception e8) {
                e = e8;
                nativeByteBuffer2 = nativeByteBuffer3;
                fa4.g(e, true);
                nativeByteBuffer3 = nativeByteBuffer2;
                y = getMessagesStorage().y(nativeByteBuffer3);
                tL_messages_deleteMessages = tL_messages_deleteMessages2;
                getConnectionsManager().sendRequest(tL_messages_deleteMessages, new x47(this, y, b));
            }
            y = getMessagesStorage().y(nativeByteBuffer3);
            tL_messages_deleteMessages = tL_messages_deleteMessages2;
        }
        getConnectionsManager().sendRequest(tL_messages_deleteMessages, new x47(this, y, b));
    }

    public final TLRPC.TL_availableEffect X0(long j) {
        C0();
        if (this.V4 == null) {
            return null;
        }
        for (int i = 0; i < this.V4.effects.size(); i++) {
            if (this.V4.effects.get(i).id == j) {
                return this.V4.effects.get(i);
            }
        }
        return null;
    }

    public final void X2(final int i, int i2, final int i3, boolean z, final w57 w57Var) {
        long j;
        TLRPC.InputPeer tL_inputPeerChat;
        vf6 vf6Var;
        int m;
        SparseBooleanArray sparseBooleanArray = this.T1;
        if (sparseBooleanArray.get(i) || this.e2) {
            return;
        }
        sparseBooleanArray.put(i, true);
        int i4 = kk7.r;
        getNotificationCenter().k(i4, new Object[0]);
        if (w01.a) {
            StringBuilder p = ir2.p("folderId = ", i, " load cacheOffset = ", i2, " count = ");
            p.append(i3);
            p.append(" cache = ");
            p.append(z);
            fa4.b(p.toString());
        }
        long[] jArr = null;
        if (z) {
            final ad7 messagesStorage = getMessagesStorage();
            final int i5 = i2 == 0 ? 0 : this.S1.get(i, 0);
            if (i == 0 && i2 == 0 && (m = (vf6Var = messagesStorage.getMediaDataController().u1).m()) > 0) {
                jArr = new long[m];
                for (int i6 = 0; i6 < m; i6++) {
                    if (((vf6) vf6Var.n(i6)).f(0L) != null) {
                        jArr[i6] = vf6Var.j(i6);
                    }
                }
            }
            final long[] jArr2 = jArr;
            messagesStorage.a.c(new Runnable() { // from class: mc7
                @Override // java.lang.Runnable
                public final void run() {
                    ad7.this.y0(i, i5, i3, jArr2);
                }
            });
            return;
        }
        TLRPC.TL_messages_getDialogs tL_messages_getDialogs = new TLRPC.TL_messages_getDialogs();
        tL_messages_getDialogs.limit = i3;
        tL_messages_getDialogs.exclude_pinned = true;
        if (i != 0) {
            tL_messages_getDialogs.flags |= 2;
            tL_messages_getDialogs.folder_id = i;
        }
        long[] g = getUserConfig().g(i);
        long j2 = g[0];
        if (j2 == -1) {
            ArrayList U0 = U0(i);
            int size = U0.size() - 1;
            while (true) {
                if (size < 0) {
                    tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    break;
                }
                TLRPC.Dialog dialog = (TLRPC.Dialog) U0.get(size);
                if (!dialog.pinned && !cf3.B(dialog.id) && dialog.top_message > 0) {
                    ArrayList arrayList = (ArrayList) this.S.f(dialog.id);
                    k27 k27Var = null;
                    if (arrayList != null) {
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            k27 k27Var2 = (k27) arrayList.get(i7);
                            if (k27Var2 != null && (k27Var == null || k27Var2.e1() > k27Var.e1())) {
                                k27Var = (k27) arrayList.get(i7);
                            }
                        }
                    }
                    if (k27Var != null && k27Var.e1() > 0) {
                        TLRPC.Message message = k27Var.k;
                        tL_messages_getDialogs.offset_date = message.date;
                        tL_messages_getDialogs.offset_id = message.id;
                        TLRPC.Peer peer = message.peer_id;
                        long j3 = peer.channel_id;
                        if (j3 == 0) {
                            j3 = peer.chat_id;
                            if (j3 == 0) {
                                j = peer.user_id;
                                tL_messages_getDialogs.offset_peer = h1(j);
                            }
                        }
                        j = -j3;
                        tL_messages_getDialogs.offset_peer = h1(j);
                    }
                }
                size--;
            }
        } else {
            if (j2 == 2147483647L) {
                this.U1.put(i, true);
                this.V1.put(i, true);
                sparseBooleanArray.put(i, false);
                getNotificationCenter().k(i4, new Object[0]);
                return;
            }
            int i8 = (int) j2;
            tL_messages_getDialogs.offset_id = i8;
            tL_messages_getDialogs.offset_date = (int) g[1];
            if (i8 == 0) {
                tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                if (g[4] != 0) {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                    tL_messages_getDialogs.offset_peer = tL_inputPeerChat;
                    tL_inputPeerChat.channel_id = g[4];
                } else if (g[2] != 0) {
                    TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                    tL_messages_getDialogs.offset_peer = tL_inputPeerUser;
                    tL_inputPeerUser.user_id = g[2];
                    tL_inputPeerChat = tL_inputPeerUser;
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_messages_getDialogs.offset_peer = tL_inputPeerChat;
                    tL_inputPeerChat.chat_id = g[3];
                }
                tL_inputPeerChat.access_hash = g[5];
            }
        }
        getConnectionsManager().sendRequest(tL_messages_getDialogs, new RequestDelegate() { // from class: h67
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    na7.this.M3(messages_dialogs, null, null, i, 0, i3, 0, false, false, false);
                    w57 w57Var2 = w57Var;
                    if (w57Var2 == null || !messages_dialogs.dialogs.isEmpty()) {
                        return;
                    }
                    gl.c3(w57Var2);
                }
            }
        });
    }

    public final void X3(TLRPC.EncryptedChat encryptedChat, boolean z) {
        if (encryptedChat == null) {
            return;
        }
        int i = encryptedChat.id;
        ConcurrentHashMap concurrentHashMap = this.c;
        if (z) {
            concurrentHashMap.putIfAbsent(Integer.valueOf(i), encryptedChat);
        } else {
            concurrentHashMap.put(Integer.valueOf(i), encryptedChat);
        }
    }

    public final void Y(long j, long j2, ArrayList arrayList) {
        getMessagesStorage().a.c(new n57(this, arrayList, j2, j));
    }

    public final TLRPC.EncryptedChat Y0(Integer num) {
        return (TLRPC.EncryptedChat) this.c.get(num);
    }

    public final k7c Y1() {
        k7c k7cVar = this.L2;
        if (k7cVar != null) {
            return k7cVar;
        }
        k7c k7cVar2 = new k7c(this.currentAccount);
        this.L2 = k7cVar2;
        return k7cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r10.Q.get(java.lang.Long.valueOf(r2)) == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y2(final int i, final long j, boolean z) {
        TLRPC.TL_messages_getFullChat tL_messages_getFullChat;
        boolean z2 = this.p1.get(j, 0L) > 0;
        Long valueOf = Long.valueOf(j);
        HashSet hashSet = this.l1;
        if (hashSet.contains(valueOf)) {
            return;
        }
        if (z || !z2) {
            hashSet.add(Long.valueOf(j));
            final long j2 = -j;
            final TLRPC.Chat K0 = K0(Long.valueOf(j));
            if (hc2.T(K0)) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = g1(K0);
                V2(j, !z2);
                tL_messages_getFullChat = tL_channels_getFullChannel;
            } else {
                TLRPC.TL_messages_getFullChat tL_messages_getFullChat2 = new TLRPC.TL_messages_getFullChat();
                tL_messages_getFullChat2.chat_id = j;
                if (this.P.get(Long.valueOf(j2)) != null) {
                    tL_messages_getFullChat = tL_messages_getFullChat2;
                }
                e4(null, j2);
                tL_messages_getFullChat = tL_messages_getFullChat2;
            }
            int sendRequest = getConnectionsManager().sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: m87
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    na7 na7Var = na7.this;
                    ConcurrentHashMap concurrentHashMap = na7Var.Q;
                    ConcurrentHashMap concurrentHashMap2 = na7Var.P;
                    long j3 = j;
                    if (tL_error != null) {
                        gl.c3(new y67(na7Var, tL_error, j3, (byte) 1));
                        return;
                    }
                    TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
                    na7Var.getMessagesStorage().j1(tL_messages_chatFull.users, tL_messages_chatFull.chats, true, true);
                    na7Var.getMessagesStorage().K1(tL_messages_chatFull.full_chat, false);
                    g2b M1 = na7Var.M1();
                    TL_stories.PeerStories peerStories = tL_messages_chatFull.full_chat.stories;
                    long j4 = j2;
                    M1.p0(j4, peerStories);
                    je2.e(na7Var.currentAccount).p(-j3, tL_messages_chatFull.full_chat.wallpaper);
                    if (hc2.T(K0)) {
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(j4));
                        if (num == null) {
                            num = Integer.valueOf(na7Var.getMessagesStorage().S(j4, false));
                        }
                        concurrentHashMap2.put(Long.valueOf(j4), Integer.valueOf(Math.max(tL_messages_chatFull.full_chat.read_inbox_max_id, num.intValue())));
                        if (tL_messages_chatFull.full_chat.read_inbox_max_id > num.intValue()) {
                            ArrayList arrayList = new ArrayList();
                            TL_update.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TL_update.TL_updateReadChannelInbox();
                            tL_updateReadChannelInbox.channel_id = j3;
                            TLRPC.ChatFull chatFull = tL_messages_chatFull.full_chat;
                            tL_updateReadChannelInbox.max_id = chatFull.read_inbox_max_id;
                            tL_updateReadChannelInbox.still_unread_count = chatFull.unread_count;
                            arrayList.add(tL_updateReadChannelInbox);
                            na7Var.Q3(arrayList, null, null, false, 0);
                        }
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(j4));
                        if (num2 == null) {
                            num2 = Integer.valueOf(na7Var.getMessagesStorage().S(j4, true));
                        }
                        concurrentHashMap.put(Long.valueOf(j4), Integer.valueOf(Math.max(tL_messages_chatFull.full_chat.read_outbox_max_id, num2.intValue())));
                        if (tL_messages_chatFull.full_chat.read_outbox_max_id > num2.intValue()) {
                            ArrayList arrayList2 = new ArrayList();
                            TL_update.TL_updateReadChannelOutbox tL_updateReadChannelOutbox = new TL_update.TL_updateReadChannelOutbox();
                            tL_updateReadChannelOutbox.channel_id = j3;
                            tL_updateReadChannelOutbox.max_id = tL_messages_chatFull.full_chat.read_outbox_max_id;
                            arrayList2.add(tL_updateReadChannelOutbox);
                            na7Var.Q3(arrayList2, null, null, false, 0);
                        }
                    }
                    gl.c3(new tb2(na7Var, j3, tL_messages_chatFull, i, j4));
                }
            });
            if (i != 0) {
                getConnectionsManager().bindRequestToGuid(sendRequest, i);
            }
        }
    }

    public final void Y3(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            X3((TLRPC.EncryptedChat) arrayList.get(i), true);
        }
    }

    public final boolean Y4() {
        if (this.a5 != null && System.currentTimeMillis() - this.Z4 < 3600000) {
            return this.a5.sensitive_enabled;
        }
        Set set = this.K3;
        return set == null || set.contains("sensitive");
    }

    public final void Z(long j, long j2, int i, int i2, boolean z, vm1 vm1Var) {
        TLRPC.TL_messages_deleteHistory tL_messages_deleteHistory = new TLRPC.TL_messages_deleteHistory();
        tL_messages_deleteHistory.peer = h1(j);
        tL_messages_deleteHistory.flags = 12;
        tL_messages_deleteHistory.min_date = i;
        tL_messages_deleteHistory.max_date = i2;
        tL_messages_deleteHistory.revoke = z;
        getConnectionsManager().sendRequest(tL_messages_deleteHistory, new s87(this, j, i, i2, j2, z, vm1Var));
    }

    public final TLRPC.EncryptedChat Z0(int i, boolean z) {
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c.get(Integer.valueOf(i));
        if (encryptedChat != null) {
            if (!z) {
                return encryptedChat;
            }
            if (!(encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) && !(encryptedChat instanceof TLRPC.TL_encryptedChatRequested)) {
                return encryptedChat;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList();
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.a.c(new m77((Object) messagesStorage, i, (Object) arrayList, (Object) countDownLatch, (byte) 26));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (arrayList.size() != 2) {
            return encryptedChat;
        }
        TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList.get(0);
        TLRPC.User user = (TLRPC.User) arrayList.get(1);
        X3(encryptedChat2, false);
        a4(user, true, false);
        return encryptedChat2;
    }

    public final TLObject Z1(long j) {
        Long valueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap.containsKey(valueOf)) {
            return (TLObject) concurrentHashMap.get(Long.valueOf(j));
        }
        long j2 = -j;
        Long valueOf2 = Long.valueOf(j2);
        ConcurrentHashMap concurrentHashMap2 = this.b;
        if (concurrentHashMap2.containsKey(valueOf2)) {
            return (TLObject) concurrentHashMap2.get(Long.valueOf(j2));
        }
        return null;
    }

    public final void Z2(TLRPC.User user, int i, boolean z, p8c p8cVar) {
        if (user != null) {
            HashSet hashSet = this.h1;
            if (p8cVar == null) {
                if (hashSet.contains(Long.valueOf(user.id))) {
                    return;
                }
                if (!z && this.i1.get(user.id) > 0) {
                    return;
                }
            }
            hashSet.add(Long.valueOf(user.id));
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.id = o1(user);
            long j = user.id;
            if (this.P.get(Long.valueOf(j)) == null || this.Q.get(Long.valueOf(j)) == null) {
                e4(null, j);
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_users_getFullUser, new c97(this, user, j, p8cVar, i)), i);
        }
    }

    public final void Z3(long j, fc2 fc2Var) {
        this.d1.k(fc2Var, fc2Var.b.id);
        this.e1.k(fc2Var, j);
        TLRPC.ChatFull L0 = L0(j);
        if (L0 != null) {
            L0.call = fc2Var.h(fc2Var.a);
        }
        getNotificationCenter().k(kk7.v2, Long.valueOf(j), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
        Y2(0, j, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0317, code lost:
    
        if (r6 < r29.O) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04c9, code lost:
    
        if ((r3 > r19 ? hc2.v0(r2, q1(r2).V1(java.lang.Long.valueOf(r3))) : hc2.X(r2, q1(r2).K0(java.lang.Long.valueOf(-r3)))) == false) goto L268;
     */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x047f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z4(vf6 vf6Var) {
        boolean z;
        TLRPC.EncryptedChat Y0;
        TLRPC.Chat K0;
        ArrayList arrayList;
        TLRPC.EncryptedChat Y02;
        TLRPC.User f;
        TLRPC.Dialog dialog;
        long j;
        long j2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Chat chat;
        boolean z2;
        boolean z3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Message message;
        int i;
        TLRPC.Chat K02;
        LongSparseIntArray longSparseIntArray;
        vf6 vf6Var2;
        LongSparseIntArray longSparseIntArray2;
        if (vf6Var == null && a.x) {
            return;
        }
        this.F.clear();
        this.G.clear();
        this.I.clear();
        this.H.clear();
        this.J.clear();
        this.M.clear();
        this.K.clear();
        this.L.clear();
        this.E.clear();
        vf6 vf6Var3 = this.R;
        LongSparseIntArray longSparseIntArray3 = this.F4;
        longSparseIntArray3.clear();
        LongSparseIntArray longSparseIntArray4 = this.G4;
        longSparseIntArray4.clear();
        vf6 vf6Var4 = this.I4;
        vf6Var4.b();
        LongSparseIntArray longSparseIntArray5 = this.H4;
        longSparseIntArray5.clear();
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= size) {
                break;
            }
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i2);
            if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                long j3 = dialog2.community_id;
                TLRPC.Chat K03 = K0(Long.valueOf(j3));
                if ((K03 == null || K03.collapsed_in_dialogs) && vf6Var4.f(j3) == null) {
                    vf6Var4.k(dialog2, j3);
                    i2++;
                } else {
                    arrayList2.remove(i2);
                    i2--;
                    size--;
                    i2++;
                }
            } else {
                long j4 = dialog2.id;
                if (j4 < 0) {
                    TLRPC.Chat K04 = K0(Long.valueOf(-j4));
                    if (hc2.Y(K04)) {
                        arrayList2.remove(i2);
                        i2--;
                        size--;
                    } else if (hc2.X(this.currentAccount, K04)) {
                        long j5 = K04.linked_community_id;
                        longSparseIntArray3.put(j5, Math.max(longSparseIntArray3.get(j5), dialog2.last_message_date));
                        longSparseIntArray4.put(j5, T0(dialog2) + longSparseIntArray4.get(j5));
                        if (dialog2.unread_mark) {
                            longSparseIntArray5.put(j5, 1);
                        }
                    }
                } else if (j4 > 0) {
                    TLRPC.User V1 = V1(Long.valueOf(j4));
                    if (hc2.v0(this.currentAccount, V1)) {
                        long j6 = V1.linked_community_id;
                        longSparseIntArray3.put(j6, Math.max(longSparseIntArray3.get(j6), dialog2.last_message_date));
                        longSparseIntArray4.put(j6, T0(dialog2) + longSparseIntArray4.get(j6));
                        if (dialog2.unread_mark) {
                            longSparseIntArray5.put(j6, 1);
                        }
                    }
                }
                i2++;
            }
        }
        long j7 = 0;
        int size2 = longSparseIntArray3.size();
        int i3 = 0;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = null;
        while (i3 < size2) {
            boolean z4 = z;
            long keyAt = longSparseIntArray3.keyAt(i3);
            int valueAt = longSparseIntArray3.valueAt(i3);
            long j8 = j7;
            int i4 = longSparseIntArray4.get(keyAt);
            boolean z5 = longSparseIntArray5.get(keyAt) > 0 ? z4 : false;
            LongSparseIntArray longSparseIntArray6 = longSparseIntArray3;
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) vf6Var4.f(keyAt);
            if (dialog3 != null) {
                dialog3.unread_count = i4;
                dialog3.last_message_date = valueAt;
                dialog3.unread_mark = z5;
                longSparseIntArray = longSparseIntArray4;
                vf6Var2 = vf6Var4;
                longSparseIntArray2 = longSparseIntArray5;
            } else {
                longSparseIntArray = longSparseIntArray4;
                long j9 = -keyAt;
                vf6Var2 = vf6Var4;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) vf6Var3.f(j9);
                longSparseIntArray2 = longSparseIntArray5;
                if (dialog4 instanceof TLRPC.TL_dialogCommunity) {
                    dialog4.unread_count = i4;
                    dialog4.last_message_date = valueAt;
                    dialog4.unread_mark = z5;
                    arrayList2.add(dialog4);
                } else {
                    TLRPC.TL_dialogCommunity tL_dialogCommunity = new TLRPC.TL_dialogCommunity();
                    tL_dialogCommunity.community_id = keyAt;
                    if (dialog4 != null) {
                        tL_dialogCommunity.pinned = dialog4.pinned;
                        tL_dialogCommunity.pinnedNum = dialog4.pinnedNum;
                        tL_dialogCommunity.notify_settings = dialog4.notify_settings;
                    } else {
                        tL_dialogCommunity.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                    tL_dialogCommunity.unread_mark = z5;
                    tL_dialogCommunity.last_message_date = valueAt;
                    tL_dialogCommunity.unread_count = i4;
                    cf3.w(tL_dialogCommunity);
                    vf6Var3.k(tL_dialogCommunity, j9);
                    arrayList2.add(tL_dialogCommunity);
                    if (dialog4 == null) {
                        if (tL_messages_dialogs == null) {
                            tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        }
                        tL_messages_dialogs.dialogs.add(tL_dialogCommunity);
                    }
                }
            }
            i3++;
            z = z4;
            j7 = j8;
            longSparseIntArray4 = longSparseIntArray;
            longSparseIntArray3 = longSparseIntArray6;
            longSparseIntArray5 = longSparseIntArray2;
            vf6Var4 = vf6Var2;
        }
        boolean z6 = z;
        long j10 = j7;
        if (tL_messages_dialogs != null) {
            getMessagesStorage().a1(tL_messages_dialogs, 2);
        }
        for (int i5 = 0; i5 < this.w.size(); i5++) {
            ArrayList arrayList3 = (ArrayList) this.w.valueAt(i5);
            if (arrayList3 != null) {
                arrayList3.clear();
            }
        }
        for (int i6 = 0; i6 < this.x.m(); i6++) {
            ArrayList arrayList4 = (ArrayList) this.x.n(i6);
            if (arrayList4 != null) {
                arrayList4.clear();
            }
        }
        long e = getUserConfig().e();
        t97[] t97VarArr = this.N;
        if (t97VarArr[0] != null || t97VarArr[z6 ? 1 : 0] != null) {
            int i7 = 0;
            while (true) {
                t97[] t97VarArr2 = this.N;
                if (i7 >= t97VarArr2.length) {
                    break;
                }
                t97 t97Var = t97VarArr2[i7];
                this.q4 = t97Var;
                if (t97Var != null) {
                    ArrayList arrayList5 = t97Var.k;
                    ArrayList arrayList6 = t97Var.l;
                    arrayList5.clear();
                    arrayList6.clear();
                    boolean t0 = t0(this.q4);
                    try {
                        Collections.sort(this.y, this.r4);
                    } catch (Exception e2) {
                        fa4.g(e2, z6);
                    }
                    int size3 = this.y.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        TLRPC.Dialog dialog5 = (TLRPC.Dialog) this.y.get(i8);
                        boolean z7 = dialog5 instanceof TLRPC.TL_dialogCommunity;
                        if ((dialog5 instanceof TLRPC.TL_dialog) || z7) {
                            long j11 = dialog5.id;
                            if (!z7 || (K0 = K0(Long.valueOf(-j11))) == null || K0.collapsed_in_dialogs) {
                                if (cf3.B(j11) && (Y0 = Y0(Integer.valueOf((int) (j11 & 4294967295L)))) != null) {
                                    j11 = Y0.user_id;
                                }
                                if (this.q4.b(getAccountInstance(), j11, dialog5, t0 && w2(dialog5, j11))) {
                                    if (v(dialog5)) {
                                        arrayList6.add(dialog5);
                                    }
                                    arrayList5.add(dialog5);
                                }
                            }
                        }
                    }
                }
                i7++;
                z6 = true;
            }
        }
        try {
            Collections.sort(this.y, this.s4);
        } catch (Exception unused) {
        }
        this.r2 = true;
        TLRPC.Dialog dialog6 = this.q2;
        if (dialog6 != null) {
            long j12 = dialog6.id;
            if (j12 < j10 && (K02 = K0(Long.valueOf(-j12))) != null && !K02.left) {
                this.r2 = false;
            }
        }
        int size4 = this.y.size();
        boolean z8 = false;
        int i9 = 0;
        while (i9 < size4) {
            TLRPC.Dialog dialog7 = (TLRPC.Dialog) this.y.get(i9);
            if (dialog7 instanceof TLRPC.TL_dialog) {
                ArrayList arrayList7 = (ArrayList) this.S.f(dialog7.id);
                if (arrayList7 != null) {
                    int i10 = Integer.MIN_VALUE;
                    for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                        k27 k27Var = (k27) arrayList7.get(i11);
                        if (k27Var != null && (message = k27Var.k) != null && (i = message.date) > i10) {
                            i10 = i;
                        }
                    }
                    if (i10 > Integer.MIN_VALUE) {
                    }
                }
                if (!cf3.B(dialog7.id)) {
                    this.F.add(dialog7);
                    boolean x = cf3.x(dialog7);
                    long j13 = dialog7.id;
                    if (x) {
                        TLRPC.Chat K05 = K0(Long.valueOf(-j13));
                        if (K05 != null && ((z2 = K05.creator) || (((z3 = K05.megagroup) && (((tL_chatAdminRights3 = K05.admin_rights) != null && (tL_chatAdminRights3.post_messages || tL_chatAdminRights3.add_admins)) || (tL_chatBannedRights = K05.default_banned_rights) == null || !tL_chatBannedRights.invite_users)) || (!z3 && (tL_chatAdminRights2 = K05.admin_rights) != null && tL_chatAdminRights2.add_admins)))) {
                            if (!z2) {
                                boolean z9 = K05.megagroup;
                                TLRPC.TL_chatAdminRights tL_chatAdminRights4 = K05.admin_rights;
                                if (!z9 ? tL_chatAdminRights4 == null : tL_chatAdminRights4 == null) {
                                    this.G.add(dialog7);
                                }
                            }
                            if (K05.megagroup) {
                                this.I.add(dialog7);
                            } else {
                                this.H.add(dialog7);
                            }
                        }
                        if (K05 == null || !K05.megagroup) {
                            this.J.add(dialog7);
                        } else {
                            this.M.add(dialog7);
                        }
                    } else if (j13 < j10) {
                        if (vf6Var == null || (chat = (TLRPC.Chat) vf6Var.f(-j13)) == null || chat.migrated_to == null) {
                            TLRPC.Chat K06 = K0(Long.valueOf(-dialog7.id));
                            if (K06 != null && (((tL_chatAdminRights = K06.admin_rights) != null && (tL_chatAdminRights.add_admins || tL_chatAdminRights.invite_users)) || K06.creator)) {
                                if (K06.creator) {
                                    this.I.add(dialog7);
                                } else {
                                    this.G.add(dialog7);
                                }
                            }
                            this.M.add(dialog7);
                        } else {
                            this.y.remove(i9);
                            i9--;
                            size4--;
                        }
                    } else if (j13 != e) {
                        this.K.add(dialog7);
                        if (!l7c.A(dialog7.id) && dialog7.id != 489000) {
                            this.L.add(dialog7);
                        }
                    }
                }
                if (v(dialog7) && dialog7.folder_id == 0) {
                    long j14 = dialog7.id;
                    ArrayList arrayList8 = this.E;
                    if (j14 == e) {
                        arrayList8.add(0, dialog7);
                        z8 = true;
                    } else {
                        arrayList8.add(dialog7);
                    }
                }
                boolean z10 = z8;
                if (T0(dialog7) == 0 || dialog7.unread_mark) {
                    n2(dialog7.id, 0L, null);
                }
                dialog = this.q2;
                if (dialog == null && dialog7.id == dialog.id && this.r2) {
                    this.y.remove(i9);
                    i9--;
                    size4--;
                } else {
                    vf6 vf6Var5 = this.x;
                    j = dialog7.id;
                    if (j <= j10) {
                        TLRPC.User V12 = V1(Long.valueOf(j));
                        if (V12 != null) {
                            j2 = V12.linked_community_id;
                            if (j2 != j10) {
                                ArrayList arrayList9 = (ArrayList) vf6Var5.f(j2);
                                if (arrayList9 == null) {
                                    arrayList9 = tb4.s(vf6Var5, j2);
                                }
                                arrayList9.add(dialog7);
                                int i12 = this.currentAccount;
                                long j15 = dialog7.id;
                            }
                        }
                        d(-1, dialog7);
                    } else {
                        TLRPC.Chat K07 = K0(Long.valueOf(-j));
                        if (K07 != null) {
                            j2 = K07.linked_community_id;
                            if (j2 != j10) {
                            }
                        }
                        d(-1, dialog7);
                    }
                }
                z8 = z10;
            } else {
                if (dialog7 instanceof TLRPC.TL_dialogCommunity) {
                    TLRPC.Chat K08 = K0(Long.valueOf(-dialog7.id));
                    if (K08 != null && K08.collapsed_in_dialogs) {
                        this.E.add(dialog7);
                    }
                }
                boolean z102 = z8;
                if (T0(dialog7) == 0) {
                }
                n2(dialog7.id, 0L, null);
                dialog = this.q2;
                if (dialog == null) {
                }
                vf6 vf6Var52 = this.x;
                j = dialog7.id;
                if (j <= j10) {
                }
                z8 = z102;
            }
            i9++;
        }
        TLRPC.Dialog dialog8 = this.q2;
        if (dialog8 != null && this.r2) {
            this.y.add(0, dialog8);
            d(-2, this.q2);
        }
        if (!z8 && (f = getUserConfig().f()) != null) {
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.id = f.id;
            tL_dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_dialog.peer = tL_peerUser;
            tL_peerUser.user_id = f.id;
            this.E.add(0, tL_dialog);
        }
        for (int i13 = 0; i13 < this.w.size(); i13++) {
            int keyAt2 = this.w.keyAt(i13);
            if (((ArrayList) this.w.valueAt(i13)).isEmpty()) {
                this.w.remove(keyAt2);
            }
        }
        for (int i14 = 0; i14 < this.x.m(); i14++) {
            long j16 = this.x.j(i14);
            if (((ArrayList) this.x.n(i14)).isEmpty()) {
                this.x.l(j16);
            }
        }
        this.h0 = this.w.get(1, null) != null;
        int i15 = 0;
        while (true) {
            t97[] t97VarArr3 = this.N;
            if (i15 >= t97VarArr3.length) {
                break;
            }
            t97 t97Var2 = t97VarArr3[i15];
            if (q2(t97Var2)) {
                ArrayList arrayList10 = t97Var2.k;
                for (int size5 = arrayList10.size() - 1; size5 >= 0; size5--) {
                    TLRPC.Dialog dialog9 = (TLRPC.Dialog) arrayList10.get(size5);
                    if (!p2(dialog9)) {
                        if (!w2(dialog9, (!cf3.B(dialog9.id) || (Y02 = Y0(Integer.valueOf((int) (dialog9.id & 4294967295L)))) == null) ? dialog9.id : Y02.user_id)) {
                            arrayList10.remove(size5);
                        }
                    }
                }
            }
            i15++;
        }
        this.p4.clear();
        if (!j2() || (arrayList = (ArrayList) this.w.get(0)) == null) {
            return;
        }
        int size6 = arrayList.size();
        for (int i16 = 0; i16 < size6; i16++) {
            TLRPC.Dialog dialog10 = (TLRPC.Dialog) arrayList.get(i16);
            if ((dialog10 instanceof TLRPC.TL_dialogFolder) || p2(dialog10) || w2(dialog10, dialog10.id)) {
                this.p4.add(dialog10);
            }
        }
    }

    public final void a(long j, boolean z) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
        if (dialog == null) {
            return;
        }
        if (z) {
            this.v0.k(dialog, j);
        } else {
            this.u0.k(dialog, j);
            this.y.remove(dialog);
            Z4(null);
        }
        getNotificationCenter().k(kk7.r, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(final long j, TLRPC.InputPeer inputPeer, boolean z, final te1 te1Var) {
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.Chat K0 = K0(Long.valueOf(j));
        final boolean z2 = (inputPeer instanceof TLRPC.TL_inputPeerUser) && l7c.D(getMessagesController().V1(Long.valueOf(inputPeer.user_id)));
        final boolean T = hc2.T(K0);
        if (!T) {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser2.chat_id = j;
            tL_messages_deleteChatUser2.user_id = n1(inputPeer);
            tL_messages_deleteChatUser2.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser2;
        } else if (z2) {
            boolean z3 = K0.creator;
            TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
            tL_channels_leaveChannel.channel = g1(K0);
            tL_messages_deleteChatUser = tL_channels_leaveChannel;
        } else {
            TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
            tL_channels_editBanned.channel = g1(K0);
            tL_channels_editBanned.participant = inputPeer;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
            tL_channels_editBanned.banned_rights = tL_chatBannedRights;
            tL_chatBannedRights.view_messages = true;
            tL_chatBannedRights.send_media = true;
            tL_chatBannedRights.send_messages = true;
            tL_chatBannedRights.send_stickers = true;
            tL_chatBannedRights.send_gifs = true;
            tL_chatBannedRights.send_games = true;
            tL_chatBannedRights.send_inline = true;
            tL_chatBannedRights.embed_links = true;
            tL_chatBannedRights.pin_messages = true;
            tL_chatBannedRights.send_polls = true;
            tL_chatBannedRights.invite_users = true;
            tL_chatBannedRights.change_info = true;
            tL_chatBannedRights.edit_rank = true;
            tL_chatBannedRights.send_reactions = true;
            tL_messages_deleteChatUser = tL_channels_editBanned;
        }
        if (z2) {
            T(0, -j, z);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new RequestDelegate() { // from class: y87
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    na7 na7Var = na7.this;
                    na7Var.R3((TLRPC.Updates) tLObject, false);
                    if (T && !z2) {
                        gl.d3(new r57(na7Var, j, (byte) 22), 1000L);
                    }
                    te1 te1Var2 = te1Var;
                    if (te1Var2 != null) {
                        gl.c3(te1Var2);
                    }
                }
            }
        }, 64);
    }

    public final String a1(long j) {
        if (j > 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 != null) {
                return qu2.m(0, V1.first_name, V1.last_name);
            }
            return null;
        }
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        if (K0 != null) {
            return K0.title;
        }
        return null;
    }

    public final TLObject a2(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (TLObject) this.e.get(str.toLowerCase());
    }

    public final void a3(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, long j3, int i8, int i9, boolean z3) {
        b3(j, j2, z, i, i2, i3, z2, i4, i5, i6, 0, i7, j3, i9, j3 != 0 ? i8 : 0, 0, 0, false, 0, true, true, z3, null, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a4(TLRPC.User user, boolean z, boolean z2) {
        boolean z3;
        TLRPC.User user2;
        ConcurrentHashMap concurrentHashMap;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        long j;
        int i;
        String str;
        int i2;
        String str2;
        byte b = 0;
        if (user != null) {
            if (z) {
                long j2 = user.id;
                if (j2 / 1000 != 333 && j2 != 777000) {
                    z3 = true;
                    Long valueOf = Long.valueOf(user.id);
                    ConcurrentHashMap concurrentHashMap2 = this.d;
                    user2 = (TLRPC.User) concurrentHashMap2.get(valueOf);
                    if (user2 == user || z2) {
                        concurrentHashMap = this.e;
                        if (user2 != null && !TextUtils.isEmpty(user2.username)) {
                            concurrentHashMap.remove(user2.username.toLowerCase());
                        }
                        if (user2 != null && user2.usernames != null) {
                            for (i2 = 0; i2 < user2.usernames.size(); i2++) {
                                TLRPC.TL_username tL_username = user2.usernames.get(i2);
                                if (tL_username != null && (str2 = tL_username.username) != null) {
                                    concurrentHashMap.remove(str2.toLowerCase());
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(user.username)) {
                            concurrentHashMap.put(user.username.toLowerCase(), user);
                        }
                        if (user.usernames != null) {
                            for (int i3 = 0; i3 < user.usernames.size(); i3++) {
                                TLRPC.TL_username tL_username2 = user.usernames.get(i3);
                                if (tL_username2 != null && (str = tL_username2.username) != null && tL_username2.active) {
                                    concurrentHashMap.put(str.toLowerCase(), user);
                                }
                            }
                        }
                        p5(user.id, user.emoji_status);
                        if (user2 != null && user2.access_hash == 0) {
                            j = user.fromMessageDialogId;
                            if (j != 0 && (i = user.fromMessageId) != 0) {
                                user2.fromMessageDialogId = j;
                                user2.fromMessageId = i;
                            }
                        }
                        if (!user.min) {
                            if (user2 == null) {
                                concurrentHashMap2.put(Long.valueOf(user.id), user);
                                return false;
                            }
                            if (!z3) {
                                Y1().b(user2, user);
                                if (user.bot) {
                                    String str3 = user.username;
                                    if (str3 != null) {
                                        user2.username = str3;
                                        user2.flags |= 8;
                                    } else {
                                        user2.flags &= -9;
                                        user2.username = null;
                                    }
                                }
                                if (user.apply_min_photo) {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                    if (userProfilePhoto != null) {
                                        user2.photo = userProfilePhoto;
                                        user2.flags |= 32;
                                        return false;
                                    }
                                    user2.flags &= -33;
                                    user2.photo = null;
                                    return false;
                                }
                            }
                        } else if (!z3) {
                            concurrentHashMap2.put(Long.valueOf(user.id), user);
                            if (user.id == getUserConfig().e()) {
                                getUserConfig().v(user);
                                getUserConfig().u(true);
                            }
                            Y1().b(user2, user);
                            if (user.bot) {
                                Long valueOf2 = Long.valueOf(user.id);
                                ConcurrentHashMap concurrentHashMap3 = this.j1;
                                Integer num = (Integer) concurrentHashMap3.get(valueOf2);
                                if (num != null && user.bot_info_version > num.intValue()) {
                                    concurrentHashMap3.put(Long.valueOf(user.id), Integer.valueOf(user.bot_info_version));
                                    gl.c3(new c57(this, user, b));
                                }
                            }
                            if (user2 != null && (userStatus = user.status) != null && (userStatus2 = user2.status) != null && userStatus.expires != userStatus2.expires) {
                                return true;
                            }
                        } else {
                            if (user2 == null) {
                                concurrentHashMap2.put(Long.valueOf(user.id), user);
                                return false;
                            }
                            if (user2.min) {
                                if (user2.bot) {
                                    String str4 = user2.username;
                                    if (str4 != null) {
                                        user.username = str4;
                                        user.flags |= 8;
                                    } else {
                                        user.flags &= -9;
                                        user.username = null;
                                    }
                                }
                                if (user2.apply_min_photo) {
                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                    if (userProfilePhoto2 != null) {
                                        user.photo = userProfilePhoto2;
                                        user.flags |= 32;
                                    } else {
                                        user.flags &= -33;
                                        user.photo = null;
                                    }
                                }
                                concurrentHashMap2.put(Long.valueOf(user.id), user);
                            }
                        }
                    }
                }
            }
            z3 = false;
            Long valueOf3 = Long.valueOf(user.id);
            ConcurrentHashMap concurrentHashMap22 = this.d;
            user2 = (TLRPC.User) concurrentHashMap22.get(valueOf3);
            if (user2 == user) {
            }
            concurrentHashMap = this.e;
            if (user2 != null) {
                concurrentHashMap.remove(user2.username.toLowerCase());
            }
            if (user2 != null) {
                while (i2 < user2.usernames.size()) {
                }
            }
            if (!TextUtils.isEmpty(user.username)) {
            }
            if (user.usernames != null) {
            }
            p5(user.id, user.emoji_status);
            if (user2 != null) {
                j = user.fromMessageDialogId;
                if (j != 0) {
                    user2.fromMessageDialogId = j;
                    user2.fromMessageId = i;
                }
            }
            if (!user.min) {
            }
        }
        return false;
    }

    public final boolean a5() {
        return !this.k4.O2.f;
    }

    public final int b(int i, int i2, long j) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        return c(arrayList, i, i2, null, 0L);
    }

    public final void b0(long j, TLRPC.User user) {
        c0(j, user, null, false, false);
    }

    public final void b3(final long j, final long j2, final boolean z, final int i, final int i2, final int i3, boolean z2, final int i4, final int i5, final int i6, final int i7, final int i8, final long j3, final int i9, final int i10, final int i11, final int i12, final boolean z3, final int i13, boolean z4, final boolean z5, final boolean z6, qob qobVar, long j4) {
        int i14;
        qob qobVar2;
        TLRPC.TL_forumTopic f;
        if (w01.a) {
            StringBuilder o = ug8.o(j, "load messages in chat ", " topic_id ");
            o.append(j3);
            o.append(" count ");
            o.append(i);
            o.append(" max_id ");
            o.append(i2);
            o.append(" cache ");
            o.append(z2);
            o.append(" mindate = ");
            i14 = i4;
            o.append(i14);
            o.append(" guid ");
            o.append(i5);
            o.append(" load_type ");
            o.append(i6);
            o.append(" last_message_id ");
            o.append(i7);
            o.append(" mode ");
            o.append(i8);
            o.append(" index ");
            o.append(i9);
            o.append(" firstUnread ");
            o.append(i10);
            o.append(" unread_count ");
            o.append(i11);
            o.append(" last_date ");
            o.append(i12);
            o.append(" queryFromServer ");
            o.append(z3);
            o.append(" isTopic ");
            o.append(z6);
            fa4.b(o.toString());
        } else {
            i14 = i4;
        }
        if (w01.a && qobVar == null && i8 == 0) {
            qobVar2 = new qob("MessageLoaderLogger dialogId=" + j + " index=" + i9 + " count=" + i);
        } else {
            qobVar2 = qobVar;
        }
        if ((j3 == 0 || z6 || i8 == 8 || i8 == 3 || i8 == 5 || i8 == 9) && i8 != 2 && (z2 || cf3.B(j))) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.a.c(new ta7(messagesStorage, qob.d(qobVar2, "MessagesStorage.getMessages: storageQueue.postRunnable"), qobVar2, j, j2, i, i2, i3, i14, i5, i6, i8, j3, i9, z5, z6));
            return;
        }
        qob qobVar3 = qobVar2;
        TLRPC.Chat K0 = j < 0 ? K0(Long.valueOf(-j)) : null;
        if (i8 == 9) {
            TL_ephemeral.TL_getWelcomeMessages tL_getWelcomeMessages = new TL_ephemeral.TL_getWelcomeMessages();
            tL_getWelcomeMessages.peer = h1(j);
            tL_getWelcomeMessages.hash = j4;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequestTyped(tL_getWelcomeMessages, new i8c() { // from class: c67
                @Override // i8c
                public final void a(Object obj, Object obj2) {
                    TL_ephemeral.WelcomeMessages welcomeMessages = (TL_ephemeral.WelcomeMessages) obj;
                    if (welcomeMessages == null || (welcomeMessages instanceof TL_ephemeral.TL_welcomeMessagesNotModified)) {
                        return;
                    }
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    ArrayList<TL_ephemeral.EphemeralMessage> arrayList = welcomeMessages.messages;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TL_ephemeral.EphemeralMessage ephemeralMessage = arrayList.get(i15);
                        i15++;
                        tL_messages_messages.messages.add(t34.b(ephemeralMessage));
                    }
                    na7.this.N3(tL_messages_messages, tL_messages_messages.messages.size(), j, j2, i, i2, i3, false, i5, i10, i7, i11, i12, i6, false, i8, j3, i9, z3, i13, z5, z6, null);
                }
            }), i5);
            return;
        }
        if (i8 == 5) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = (int) j3;
            tL_messages_getQuickReplyMessages.hash = j4;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new d67(this, j, j2, i, i2, i3, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6)), i5);
            return;
        }
        if (j3 == 0) {
            if (i8 == 2) {
                return;
            }
            if (i8 == 1) {
                TLRPC.TL_messages_getScheduledHistory tL_messages_getScheduledHistory = new TLRPC.TL_messages_getScheduledHistory();
                tL_messages_getScheduledHistory.peer = h1(j);
                tL_messages_getScheduledHistory.hash = j4;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getScheduledHistory, new d67(this, i2, i3, j, j2, i, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6)), i5);
                return;
            }
            if (!hc2.p0(K0) && z4 && ((i6 == 3 || i6 == 2) && i7 == 0)) {
                final TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.InputPeer h1 = h1(j);
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = h1;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() { // from class: g67
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        na7 na7Var = na7.this;
                        int i15 = i5;
                        if (tLObject == null) {
                            gl.c3(new q76(na7Var, i15, tL_messages_getPeerDialogs, tL_error, (byte) 9));
                            return;
                        }
                        TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                        if (tL_messages_peerDialogs.dialogs.isEmpty()) {
                            return;
                        }
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(0);
                        if (dialog.top_message != 0) {
                            TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                            tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                            tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                            tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                            tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                            na7Var.getMessagesStorage().a1(tL_messages_dialogs, 2);
                        }
                        na7Var.b3(j, j2, z, i, i2, i3, false, i4, i15, i6, dialog.top_message, 0, j3, i9, i10, dialog.unread_count, i12, z3, dialog.unread_mentions_count, false, z5, z6, null, 0L);
                    }
                });
                return;
            }
            TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
            tL_messages_getHistory.peer = h1(j);
            if (i6 == 4) {
                tL_messages_getHistory.add_offset = (-i) + 5;
            } else if (i6 == 3) {
                tL_messages_getHistory.add_offset = (-i) / 2;
            } else if (i6 == 1) {
                tL_messages_getHistory.add_offset = (-i) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tL_messages_getHistory.add_offset = (-i) + 6;
            } else if (j < 0 && i2 != 0 && hc2.T(K0)) {
                tL_messages_getHistory.add_offset = -1;
                tL_messages_getHistory.limit++;
            }
            tL_messages_getHistory.limit = i;
            tL_messages_getHistory.offset_id = i2;
            tL_messages_getHistory.offset_date = i3;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getHistory, new e67(this, j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tL_messages_getHistory, (byte) 2)), i5);
            return;
        }
        if (i8 == 3 || hc2.p0(K0)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = h1(j3);
            if (hc2.p0(K0)) {
                tL_messages_getSavedHistory.parent_peer = h1(j);
            }
            if (i6 == 4) {
                tL_messages_getSavedHistory.add_offset = (-i) + 5;
            } else if (i6 == 3) {
                tL_messages_getSavedHistory.add_offset = (-i) / 2;
            } else if (i6 == 1) {
                tL_messages_getSavedHistory.add_offset = (-i) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tL_messages_getSavedHistory.add_offset = (-i) + 6;
            } else if (j < 0 && i2 != 0 && hc2.T(K0)) {
                tL_messages_getSavedHistory.add_offset = -1;
                tL_messages_getSavedHistory.limit++;
            }
            tL_messages_getSavedHistory.limit = i;
            tL_messages_getSavedHistory.offset_id = i2;
            tL_messages_getSavedHistory.offset_date = i3;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSavedHistory, new e67(this, j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tL_messages_getSavedHistory, (byte) 0)), i5);
            return;
        }
        if (z4 && z6 && i6 == 2 && i7 == 0 && (f = this.g4.f(-j, j3)) != null) {
            b3(j, j2, z, i, i2, i3, false, i4, i5, i6, f.top_message, i8, j3, i9, i10, f.unread_count, i12, z3, f.unread_mentions_count, false, z5, z6, qobVar3, 0L);
            return;
        }
        if (i8 == 0) {
            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies.peer = h1(j);
            tL_messages_getReplies.msg_id = (int) j3;
            tL_messages_getReplies.offset_date = i3;
            if (i6 == 4) {
                tL_messages_getReplies.add_offset = (-i) + 5;
            } else if (i6 == 3) {
                tL_messages_getReplies.add_offset = (-i) / 2;
            } else if (i6 == 1) {
                tL_messages_getReplies.add_offset = (-i) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tL_messages_getReplies.add_offset = (-i) + 10;
            } else if (j < 0 && i2 != 0 && hc2.T(K0)) {
                tL_messages_getReplies.add_offset = -1;
                tL_messages_getReplies.limit++;
            }
            tL_messages_getReplies.limit = i;
            tL_messages_getReplies.offset_id = i2;
            tL_messages_getReplies.hash = j4;
            System.currentTimeMillis();
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getReplies, new e67(this, i, i2, i3, i10, i6, j, j2, i5, i7, i11, i12, i8, j3, i9, z3, i13, z5, z6, tL_messages_getReplies)), i5);
        }
    }

    public final void b4(ArrayList arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            if (a4((TLRPC.User) arrayList.get(i), z, false)) {
                z2 = true;
            }
        }
        if (z2) {
            gl.c3(new c87(this, (byte) 12));
        }
    }

    public final void b5(TLRPC.Chat chat, int i, boolean z, sm1 sm1Var) {
        if (chat == null) {
            return;
        }
        Utilities.d.c(new pj3(this, chat, z, i, sm1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(ArrayList arrayList, int i, int i2, ArrayList arrayList2, long j) {
        byte b;
        long j2;
        NativeByteBuffer nativeByteBuffer;
        TLRPC.Dialog dialog;
        boolean[] zArr;
        int i3;
        int i4;
        int i5 = i;
        TLRPC.TL_folders_editPeerFolders tL_folders_editPeerFolders = new TLRPC.TL_folders_editPeerFolders();
        boolean[] zArr2 = null;
        if (j == 0) {
            long e = getUserConfig().e();
            int size = arrayList.size();
            int i6 = 0;
            boolean z = false;
            int i7 = 0;
            boolean[] zArr3 = null;
            while (i6 < size) {
                long longValue = ((Long) arrayList.get(i6)).longValue();
                if ((cf3.y(longValue) || cf3.D(longValue) || cf3.B(longValue)) && !((i5 == 1 && (longValue == e || longValue == 777000 || B2(longValue, false))) || (dialog = (TLRPC.Dialog) this.R.f(longValue)) == null)) {
                    dialog.folder_id = i5;
                    if (i2 > 0) {
                        dialog.pinned = true;
                        dialog.pinnedNum = i2;
                    } else {
                        dialog.pinned = false;
                        dialog.pinnedNum = 0;
                    }
                    if (zArr3 == null) {
                        boolean[] zArr4 = new boolean[1];
                        this.h0 = true;
                        o0(i5, zArr4);
                        zArr = zArr4;
                    } else {
                        zArr = zArr3;
                    }
                    if (cf3.B(longValue)) {
                        i3 = size;
                        int i8 = i5;
                        i4 = i6;
                        getMessagesStorage().D1(null, null, longValue, i8);
                        i5 = i8;
                    } else {
                        i3 = size;
                        i4 = i6;
                        TLRPC.TL_inputFolderPeer tL_inputFolderPeer = new TLRPC.TL_inputFolderPeer();
                        tL_inputFolderPeer.folder_id = i5;
                        tL_inputFolderPeer.peer = h1(longValue);
                        tL_folders_editPeerFolders.folder_peers.add(tL_inputFolderPeer);
                        i7 = tL_inputFolderPeer.getObjectSize() + i7;
                    }
                    zArr3 = zArr;
                    z = true;
                } else {
                    i3 = size;
                    i4 = i6;
                }
                i6 = i4 + 1;
                size = i3;
            }
            b = 12;
            if (!z) {
                return 0;
            }
            Z4(null);
            getNotificationCenter().k(kk7.r, new Object[0]);
            if (i7 != 0) {
                try {
                    nativeByteBuffer = new NativeByteBuffer(i7 + 12);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    nativeByteBuffer.writeInt32(17);
                    nativeByteBuffer.writeInt32(i5);
                    nativeByteBuffer.writeInt32(tL_folders_editPeerFolders.folder_peers.size());
                    int size2 = tL_folders_editPeerFolders.folder_peers.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        tL_folders_editPeerFolders.folder_peers.get(i9).serializeToStream(nativeByteBuffer);
                    }
                } catch (Exception e3) {
                    e = e3;
                    zArr2 = nativeByteBuffer;
                    fa4.g(e, true);
                    nativeByteBuffer = zArr2;
                    j2 = getMessagesStorage().y(nativeByteBuffer);
                    zArr2 = zArr3;
                    if (!tL_folders_editPeerFolders.folder_peers.isEmpty()) {
                    }
                    if (zArr2 != null) {
                    }
                }
                j2 = getMessagesStorage().y(nativeByteBuffer);
            } else {
                j2 = 0;
            }
            zArr2 = zArr3;
        } else {
            b = 12;
            tL_folders_editPeerFolders.folder_peers = arrayList2;
            j2 = j;
        }
        if (!tL_folders_editPeerFolders.folder_peers.isEmpty()) {
            getConnectionsManager().sendRequest(tL_folders_editPeerFolders, new x47(this, j2, b));
            getMessagesStorage().D1(null, tL_folders_editPeerFolders.folder_peers, 0L, i5);
        }
        if (zArr2 != null) {
            return 0;
        }
        return zArr2[0] ? 2 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(long j, TLRPC.User user, TLRPC.Chat chat, boolean z, boolean z2) {
        TLRPC.InputPeer l1;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2;
        if (user != null) {
            l1 = l1(user);
        } else if (chat == null) {
            return;
        } else {
            l1 = j1(chat);
        }
        TLRPC.Chat K0 = K0(Long.valueOf(j));
        boolean T = hc2.T(K0);
        byte b = 0;
        if (T) {
            if (!l7c.D(user)) {
                if (hc2.Y(K0)) {
                    TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
                    tL_communities_toggleParticipantBanned.participant = l1;
                    tL_communities_toggleParticipantBanned.community = g1(K0);
                    tL_messages_deleteChatUser2 = tL_communities_toggleParticipantBanned;
                } else {
                    TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                    tL_channels_editBanned.channel = g1(K0);
                    tL_channels_editBanned.participant = l1;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                    tL_channels_editBanned.banned_rights = tL_chatBannedRights;
                    tL_chatBannedRights.view_messages = true;
                    tL_chatBannedRights.send_media = true;
                    tL_chatBannedRights.send_messages = true;
                    tL_chatBannedRights.send_stickers = true;
                    tL_chatBannedRights.send_gifs = true;
                    tL_chatBannedRights.send_games = true;
                    tL_chatBannedRights.send_inline = true;
                    tL_chatBannedRights.embed_links = true;
                    tL_chatBannedRights.pin_messages = true;
                    tL_chatBannedRights.send_polls = true;
                    tL_chatBannedRights.invite_users = true;
                    tL_chatBannedRights.change_info = true;
                    tL_chatBannedRights.edit_rank = true;
                    tL_chatBannedRights.send_reactions = true;
                    tL_messages_deleteChatUser2 = tL_channels_editBanned;
                }
                tL_messages_deleteChatUser = tL_messages_deleteChatUser2;
            } else if (K0.creator && z) {
                TLRPC.TL_channels_deleteChannel tL_channels_deleteChannel = new TLRPC.TL_channels_deleteChannel();
                tL_channels_deleteChannel.channel = g1(K0);
                tL_messages_deleteChatUser = tL_channels_deleteChannel;
            } else {
                TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                tL_channels_leaveChannel.channel = g1(K0);
                tL_messages_deleteChatUser = tL_channels_leaveChannel;
            }
        } else if (z) {
            TLRPC.TL_messages_deleteChat tL_messages_deleteChat = new TLRPC.TL_messages_deleteChat();
            tL_messages_deleteChat.chat_id = j;
            getConnectionsManager().sendRequest(tL_messages_deleteChat, new ce2(b));
            return;
        } else {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser3 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser3.chat_id = j;
            tL_messages_deleteChatUser3.user_id = o1(user);
            tL_messages_deleteChatUser3.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser3;
        }
        if (l7c.D(user)) {
            T(0, -j, z2);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new j67(this, T, user, j), 64);
    }

    public final void c3(TLRPC.User user, TLRPC.Chat chat, boolean z) {
        long j;
        if (user != null) {
            j = user.id;
        } else if (chat == null) {
            return;
        } else {
            j = -chat.id;
        }
        vf6 vf6Var = this.k0;
        if (vf6Var.h(j) < 0) {
            if (w01.a) {
                fa4.b("request spam button for " + j);
            }
            int i = this.W3.getInt("dialog_bar_vis3" + j, 0);
            byte b = 1;
            if (!z && (i == 1 || i == 3)) {
                if (w01.a) {
                    fa4.b("dialog bar already hidden for " + j);
                    return;
                }
                return;
            }
            vf6Var.k(Boolean.TRUE, j);
            TLRPC.TL_messages_getPeerSettings tL_messages_getPeerSettings = new TLRPC.TL_messages_getPeerSettings();
            if (user != null) {
                tL_messages_getPeerSettings.peer = h1(user.id);
            } else {
                tL_messages_getPeerSettings.peer = h1(-chat.id);
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerSettings, new x47(this, j, b));
        }
    }

    public final void c4(int i, String str) {
        if (TextUtils.isEmpty(str) || this.c2 || getUserConfig().e() == 0) {
            return;
        }
        if (getUserConfig().d && str.equals(gba.f)) {
            return;
        }
        this.c2 = true;
        this.d2 = SystemClock.elapsedRealtime();
        if (gba.k == null) {
            gba.k = new byte[256];
            Utilities.b.nextBytes(gba.k);
            gba.x();
        }
        TL_account.registerDevice registerdevice = new TL_account.registerDevice();
        registerdevice.token_type = i;
        registerdevice.token = str;
        byte b = 0;
        registerdevice.no_muted = false;
        registerdevice.secret = gba.k;
        for (int i2 = 0; i2 < 4; i2++) {
            y6c h = y6c.h(i2);
            if (i2 != this.currentAccount && h.o()) {
                long e = h.e();
                registerdevice.other_uids.add(Long.valueOf(e));
                if (w01.a) {
                    b00.p(this.currentAccount, ug8.o(e, "add other uid = ", " for account "));
                }
            }
        }
        getConnectionsManager().sendRequest(registerdevice, new b97(this, i, str, b));
    }

    public final boolean c5() {
        String str = this.R3;
        int hashCode = str.hashCode();
        if (hashCode == -1609594047) {
            return str.equals("enabled");
        }
        if (hashCode == -318452137) {
            if (str.equals("premium")) {
                return getUserConfig().p();
            }
            return false;
        }
        if (hashCode != 270940796) {
            return false;
        }
        str.equals("disabled");
        return false;
    }

    public final void d(int i, TLRPC.Dialog dialog) {
        int i2 = dialog instanceof TLRPC.TL_dialogFolder ? 0 : dialog.folder_id;
        SparseArray sparseArray = this.w;
        ArrayList arrayList = (ArrayList) sparseArray.get(i2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i2, arrayList);
        }
        if (i == -1) {
            arrayList.add(dialog);
            return;
        }
        if (i != -2) {
            arrayList.add(i, dialog);
        } else if (arrayList.isEmpty() || !(arrayList.get(0) instanceof TLRPC.TL_dialogFolder)) {
            arrayList.add(0, dialog);
        } else {
            arrayList.add(1, dialog);
        }
    }

    public final void d0(long j, int i, long j2) {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        messagesStorage.H(new yb7(messagesStorage, i, j, j2, (byte) 1));
        TLRPC.TL_messages_deleteParticipantReaction tL_messages_deleteParticipantReaction = new TLRPC.TL_messages_deleteParticipantReaction();
        tL_messages_deleteParticipantReaction.peer = h1(j);
        tL_messages_deleteParticipantReaction.participant = h1(j2);
        tL_messages_deleteParticipantReaction.msg_id = i;
        getConnectionsManager().sendRequestTyped(tL_messages_deleteParticipantReaction, new hc((byte) 0), new k67(this, (byte) 2));
    }

    public final void d2(long j, TLRPC.User user, TLRPC.Chat chat) {
        if (user == null && chat == null) {
            return;
        }
        SharedPreferences.Editor edit = this.W3.edit();
        edit.putInt("dialog_bar_vis3" + j, 3);
        edit.remove("dialog_bar_invite" + j);
        edit.commit();
        if (cf3.B(j)) {
            return;
        }
        TLRPC.TL_messages_hidePeerSettingsBar tL_messages_hidePeerSettingsBar = new TLRPC.TL_messages_hidePeerSettingsBar();
        if (user != null) {
            tL_messages_hidePeerSettingsBar.peer = h1(user.id);
        } else {
            tL_messages_hidePeerSettingsBar.peer = h1(-chat.id);
        }
        getConnectionsManager().sendRequest(tL_messages_hidePeerSettingsBar, new ce2((byte) 0));
    }

    public final void d3(int i) {
        SparseIntArray sparseIntArray = this.h2;
        if (sparseIntArray.indexOfKey(i) < 0) {
            byte b = 0;
            if (getUserConfig().j().getBoolean("2pinnedDialogsLoaded" + i, false)) {
                return;
            }
            sparseIntArray.put(i, 1);
            TLRPC.TL_messages_getPinnedDialogs tL_messages_getPinnedDialogs = new TLRPC.TL_messages_getPinnedDialogs();
            tL_messages_getPinnedDialogs.folder_id = i;
            getConnectionsManager().sendRequest(tL_messages_getPinnedDialogs, new e97(this, i, b));
        }
    }

    public final void d4(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.o4;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num != null) {
            if (num.intValue() > 1) {
                hashMap.put(Long.valueOf(j), Integer.valueOf(num.intValue() - 1));
                return;
            }
            hashMap.remove(Long.valueOf(j));
            if (p2((TLRPC.Dialog) this.R.f(j)) || !j0()) {
                return;
            }
            Z4(null);
            getNotificationCenter().k(kk7.P2, Long.valueOf(j));
        }
    }

    public final boolean d5() {
        String str = this.k4.M1.f;
        int hashCode = str.hashCode();
        if (hashCode == -1609594047) {
            return str.equals("enabled");
        }
        if (hashCode == -318452137) {
            if (str.equals("premium")) {
                return getUserConfig().p();
            }
            return false;
        }
        if (hashCode != 270940796) {
            return false;
        }
        str.equals("disabled");
        return false;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k27 k27Var;
        akb akbVar;
        TLRPC.InputFile inputFile;
        zjb zjbVar;
        TLRPC.InputFile inputFile2;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_inputThemeSettings tL_inputThemeSettings;
        na7 na7Var = this;
        int i3 = kk7.T1;
        HashMap hashMap = na7Var.I2;
        TLRPC.BaseTheme baseTheme = null;
        if (i == i3) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile3 = (TLRPC.InputFile) objArr[1];
            String str2 = na7Var.G2;
            if (str2 == null || !str2.equals(str)) {
                String str3 = na7Var.J2;
                if (str3 == null || !str3.equals(str)) {
                    Object obj = hashMap.get(str);
                    if (obj instanceof akb) {
                        akbVar = (akb) obj;
                        if (str.equals(akbVar.I)) {
                            akbVar.K = inputFile3;
                            akbVar.I = null;
                        } else if (str.equals(akbVar.J)) {
                            akbVar.L = inputFile3;
                            akbVar.J = null;
                        }
                        inputFile = akbVar.K;
                        inputFile2 = akbVar.L;
                        zjbVar = null;
                    } else if (obj instanceof zjb) {
                        zjb zjbVar2 = (zjb) obj;
                        if (str.equals(zjbVar2.u)) {
                            zjbVar2.w = inputFile3;
                            zjbVar2.u = null;
                        } else if (str.equals(zjbVar2.v)) {
                            zjbVar2.x = inputFile3;
                            zjbVar2.v = null;
                        }
                        akb akbVar2 = zjbVar2.b;
                        TLRPC.InputFile inputFile4 = zjbVar2.w;
                        inputFile2 = zjbVar2.x;
                        zjbVar = zjbVar2;
                        akbVar = akbVar2;
                        inputFile = inputFile4;
                    } else {
                        akbVar = null;
                        inputFile = null;
                        zjbVar = null;
                        inputFile2 = null;
                    }
                    hashMap.remove(str);
                    if (inputFile2 != null && inputFile != null) {
                        new File(str);
                        TL_account.uploadTheme uploadtheme = new TL_account.uploadTheme();
                        uploadtheme.mime_type = "application/x-tgtheme-android";
                        uploadtheme.file_name = "theme.attheme";
                        uploadtheme.file = inputFile2;
                        inputFile2.name = "theme.attheme";
                        uploadtheme.thumb = inputFile;
                        inputFile.name = "theme-preview.jpg";
                        uploadtheme.flags |= 1;
                        if (zjbVar != null) {
                            zjbVar.x = null;
                            zjbVar.w = null;
                            tL_theme = zjbVar.r;
                            TLRPC.TL_inputThemeSettings tL_inputThemeSettings2 = new TLRPC.TL_inputThemeSettings();
                            String str4 = akbVar.a;
                            int i4 = bkb.a;
                            if ("Blue".equals(str4)) {
                                baseTheme = new TLRPC.TL_baseThemeClassic();
                            } else if ("Day".equals(str4)) {
                                baseTheme = new TLRPC.TL_baseThemeDay();
                            } else if ("Dark Blue".equals(str4)) {
                                baseTheme = new TLRPC.TL_baseThemeTinted();
                            } else if ("Arctic Blue".equals(str4)) {
                                baseTheme = new TLRPC.TL_baseThemeArctic();
                            } else if ("Night".equals(str4)) {
                                baseTheme = new TLRPC.TL_baseThemeNight();
                            }
                            tL_inputThemeSettings2.base_theme = baseTheme;
                            tL_inputThemeSettings2.accent_color = zjbVar.c;
                            int i5 = zjbVar.d;
                            if (i5 != 0) {
                                tL_inputThemeSettings2.flags |= 8;
                                tL_inputThemeSettings2.outbox_accent_color = i5;
                            }
                            int i6 = zjbVar.e;
                            if (i6 != 0) {
                                tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i6));
                                tL_inputThemeSettings2.flags |= 1;
                                int i7 = zjbVar.f;
                                if (i7 != 0) {
                                    tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i7));
                                    int i8 = zjbVar.g;
                                    if (i8 != 0) {
                                        tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i8));
                                        int i9 = zjbVar.h;
                                        if (i9 != 0) {
                                            tL_inputThemeSettings2.message_colors.add(Integer.valueOf(i9));
                                        }
                                    }
                                }
                                tL_inputThemeSettings2.message_colors_animated = zjbVar.i;
                            }
                            tL_inputThemeSettings2.flags |= 2;
                            tL_inputThemeSettings2.wallpaper_settings = new TLRPC.TL_wallPaperSettings();
                            if (TextUtils.isEmpty(zjbVar.o)) {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = 0L;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperNoFile;
                            } else {
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = zjbVar.o;
                                tL_inputThemeSettings2.wallpaper = tL_inputWallPaperSlug;
                                TLRPC.WallPaperSettings wallPaperSettings = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings.intensity = (int) (zjbVar.p * 100.0f);
                                wallPaperSettings.flags |= 8;
                            }
                            TLRPC.WallPaperSettings wallPaperSettings2 = tL_inputThemeSettings2.wallpaper_settings;
                            wallPaperSettings2.motion = zjbVar.q;
                            long j = zjbVar.j;
                            if (j != 0) {
                                wallPaperSettings2.background_color = (int) j;
                                wallPaperSettings2.flags |= 1;
                            }
                            long j2 = zjbVar.k;
                            if (j2 != 0) {
                                wallPaperSettings2.second_background_color = (int) j2;
                                wallPaperSettings2.flags |= 16;
                                wallPaperSettings2.rotation = gl.q1(zjbVar.n, true);
                            }
                            long j3 = zjbVar.l;
                            if (j3 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings3 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings3.third_background_color = (int) j3;
                                wallPaperSettings3.flags |= 32;
                            }
                            long j4 = zjbVar.m;
                            if (j4 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = tL_inputThemeSettings2.wallpaper_settings;
                                wallPaperSettings4.fourth_background_color = (int) j4;
                                wallPaperSettings4.flags |= 64;
                            }
                            tL_inputThemeSettings = tL_inputThemeSettings2;
                        } else {
                            akbVar.L = null;
                            akbVar.K = null;
                            tL_theme = akbVar.G;
                            tL_inputThemeSettings = null;
                        }
                        akb akbVar3 = akbVar;
                        na7Var = this;
                        getConnectionsManager().sendRequest(uploadtheme, new fn0(na7Var, (Object) tL_theme, (Object) akbVar3, (Object) tL_inputThemeSettings, (Object) zjbVar, (byte) 10));
                    }
                } else {
                    TL_account.uploadWallPaper uploadwallpaper = new TL_account.uploadWallPaper();
                    uploadwallpaper.file = inputFile3;
                    uploadwallpaper.mime_type = "image/jpeg";
                    vjb vjbVar = na7Var.K2;
                    String str5 = na7Var.J2;
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                    tL_wallPaperSettings.blur = vjbVar.i;
                    tL_wallPaperSettings.motion = vjbVar.j;
                    uploadwallpaper.settings = tL_wallPaperSettings;
                    vjb vjbVar2 = na7Var.K2;
                    vjbVar2.r = 1.0f;
                    vjbVar2.s = new ArrayList();
                    na7Var.K2.s.add(Integer.valueOf(na7Var.getConnectionsManager().sendRequest(uploadwallpaper, new rt0((Object) na7Var, (Object) vjbVar, (Object) tL_wallPaperSettings, str5, (byte) 11))));
                }
                na7Var = this;
            } else {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                tL_photos_uploadProfilePhoto.file = inputFile3;
                tL_photos_uploadProfilePhoto.flags |= 1;
                na7Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new y47(na7Var, (byte) 19));
            }
        } else if (i == kk7.U1) {
            String str6 = (String) objArr[0];
            String str7 = na7Var.G2;
            if (str7 == null || !str7.equals(str6)) {
                String str8 = na7Var.J2;
                if (str8 == null || !str8.equals(str6)) {
                    Object remove = hashMap.remove(str6);
                    boolean z = remove instanceof akb;
                    int i10 = kk7.M2;
                    if (z) {
                        akb akbVar4 = (akb) remove;
                        akbVar4.L = null;
                        akbVar4.K = null;
                        na7Var.getNotificationCenter().k(i10, akbVar4, null);
                    } else if (remove instanceof zjb) {
                        zjb zjbVar3 = (zjb) remove;
                        zjbVar3.u = null;
                        na7Var.getNotificationCenter().k(i10, zjbVar3.b, zjbVar3);
                    }
                } else {
                    na7Var.J2 = null;
                    na7Var.K2 = null;
                }
            } else {
                na7Var.G2 = null;
            }
        }
        if (i == kk7.V1) {
            String str9 = (String) objArr[0];
            String str10 = na7Var.J2;
            if (str10 == null || !str10.equals(str9)) {
                return;
            }
            na7Var.K2.r = ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue();
            return;
        }
        int i11 = kk7.J;
        SparseArray sparseArray = na7Var.V;
        if (i != i11) {
            if (i != kk7.k0) {
                if (i == kk7.h5) {
                    na7Var.U2(false);
                    na7Var.getContactsController().J(true);
                    if ((!na7Var.Q3 || na7Var.getUserConfig().p()) && !na7Var.getUserConfig().p()) {
                        return;
                    }
                    na7Var.getNotificationCenter().k(kk7.n3, new Object[0]);
                    return;
                }
                return;
            }
            TLRPC.Message message = (TLRPC.Message) objArr[0];
            if (message.peer_id.channel_id != 0 || (k27Var = (k27) sparseArray.get(message.id)) == null) {
                return;
            }
            k27Var.k.media = k27.n1(message);
            if (k27.n1(message).ttl_seconds != 0) {
                if ((k27.n1(message).photo instanceof TLRPC.TL_photoEmpty) || (k27.n1(message).document instanceof TLRPC.TL_documentEmpty)) {
                    k27Var.K5();
                    na7Var.getNotificationCenter().k(kk7.e0, new Object[0]);
                    return;
                }
                return;
            }
            return;
        }
        if (((Boolean) objArr[6]).booleanValue()) {
            return;
        }
        Integer num = (Integer) objArr[0];
        Integer num2 = (Integer) objArr[1];
        Long l = (Long) objArr[3];
        ArrayList arrayList = (ArrayList) na7Var.S.f(l.longValue());
        for (int i12 = 0; arrayList != null && i12 < arrayList.size(); i12++) {
            k27 k27Var2 = (k27) arrayList.get(i12);
            if (k27Var2 != null && (k27Var2.e1() == num.intValue() || k27Var2.k.local_id == num.intValue())) {
                k27Var2.k.id = num2.intValue();
                k27Var2.k.send_state = 0;
            }
            k27 k27Var3 = (k27) sparseArray.get(num.intValue());
            if (k27Var3 != null) {
                sparseArray.remove(num.intValue());
                sparseArray.put(num2.intValue(), k27Var3);
            }
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) na7Var.R.f(l.longValue());
        if (dialog != null && dialog.top_message == num.intValue()) {
            dialog.top_message = num2.intValue();
            na7Var.getNotificationCenter().k(kk7.r, new Object[0]);
        }
        if (cf3.y(l.longValue())) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) na7Var.c1.f(-l.longValue());
            TLRPC.Chat K0 = na7Var.K0(Long.valueOf(-l.longValue()));
            if (K0 == null || hc2.N(K0) || k27.f3(num2.intValue()) || chatFull == null || chatFull.slowmode_seconds == 0) {
                return;
            }
            chatFull.slowmode_next_send_date = na7Var.getConnectionsManager().getCurrentTime() + chatFull.slowmode_seconds;
            chatFull.flags |= 262144;
            na7Var.getMessagesStorage().K1(chatFull, false);
        }
    }

    public final void e(k27 k27Var, TLRPC.SuggestedPost suggestedPost) {
        k27 k27Var2 = k27Var;
        if (k27Var2 == null || k27Var2.k == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(k27Var2);
        z3a sendMessagesHelper = getSendMessagesHelper();
        long B0 = k27.B0(k27Var2.k);
        boolean z = !k27.l3(k27Var2.k);
        TLRPC.Message message = k27Var2.k;
        if (message.suggested_post == null) {
            k27Var2 = null;
        }
        sendMessagesHelper.p0(arrayList, B0, z, false, true, 0, 0, k27Var2, -1, 0L, cf3.n(message.saved_peer_id), u47.b(suggestedPost));
    }

    public final void e0(long j, int i, TLRPC.InputPeer inputPeer) {
        long m = cf3.m(inputPeer);
        int[] iArr = {i};
        sb2 sb2Var = new sb2(this, m, j, inputPeer, i, iArr);
        if (iArr[0] > 0 || m != 0) {
            sb2Var.run();
            return;
        }
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new go6((Object) messagesStorage, j, (Object) new kt1(iArr, sb2Var, (byte) 1), (byte) 16));
    }

    public final fc2 e1(long j, boolean z, qz5 qz5Var) {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.ChatFull L0 = L0(j);
        if (L0 == null || (inputGroupCall = L0.call) == null) {
            return null;
        }
        fc2 fc2Var = (fc2) this.d1.f(inputGroupCall.id);
        if (fc2Var == null && z) {
            Long valueOf = Long.valueOf(j);
            HashSet hashSet = this.m1;
            if (!hashSet.contains(valueOf)) {
                hashSet.add(Long.valueOf(j));
                if (L0.call != null) {
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = L0.call;
                    getgroupcall.limit = 20;
                    getConnectionsManager().sendRequest(getgroupcall, new w47((Object) this, j, (Object) qz5Var, (byte) 11));
                }
            }
        }
        if (fc2Var == null || !(fc2Var.b instanceof TLRPC.TL_groupCallDiscarded)) {
            return fc2Var;
        }
        return null;
    }

    public final void e2() {
        if (this.q2 == null) {
            return;
        }
        TLRPC.TL_help_hidePromoData tL_help_hidePromoData = new TLRPC.TL_help_hidePromoData();
        tL_help_hidePromoData.peer = h1(this.q2.id);
        getConnectionsManager().sendRequest(tL_help_hidePromoData, new ce2((byte) 0));
        Utilities.d.c(new f67(this, (byte) 26));
        m4();
    }

    public final void e3(boolean z, a61 a61Var) {
        if (a61Var != null) {
            this.v4 = a61Var;
        }
        if (getUserConfig().o()) {
            if (z) {
                getUserConfig().Q = false;
                getUserConfig().u(false);
            } else if (getUserConfig().Q) {
                return;
            }
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogFilters(), new y47(this, (byte) 18));
        }
    }

    public final void e4(ArrayList arrayList, long j) {
        if (j == 0 && (arrayList == null || arrayList.isEmpty())) {
            return;
        }
        TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
        byte b = 0;
        vf6 vf6Var = this.y4;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.InputPeer h1 = h1(((TLRPC.Dialog) arrayList.get(i)).id);
                if (!(h1 instanceof TLRPC.TL_inputPeerChannel) || h1.access_hash != 0) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer.peer = h1;
                    long m = cf3.m(h1);
                    Long l = (Long) vf6Var.f(m);
                    if (l == null || System.currentTimeMillis() - l.longValue() > 240000) {
                        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                        vf6Var.k(Long.valueOf(System.currentTimeMillis()), m);
                    }
                }
            }
        } else {
            TLRPC.InputPeer h12 = h1(j);
            if ((h12 instanceof TLRPC.TL_inputPeerChannel) && h12.access_hash == 0) {
                return;
            }
            TLRPC.TL_inputDialogPeer tL_inputDialogPeer2 = new TLRPC.TL_inputDialogPeer();
            tL_inputDialogPeer2.peer = h12;
            long m2 = cf3.m(h12);
            Long l2 = (Long) vf6Var.f(m2);
            if (l2 == null || System.currentTimeMillis() - l2.longValue() > 240000) {
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer2);
                vf6Var.k(Long.valueOf(System.currentTimeMillis()), m2);
            }
        }
        if (tL_messages_getPeerDialogs.peers.isEmpty()) {
            return;
        }
        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new y47(this, b));
    }

    public final boolean e5(TLRPC.User user) {
        if (user != null && user.id == this.k4.c3.f()) {
            return true;
        }
        String str = this.k4.M1.f;
        int hashCode = str.hashCode();
        if (hashCode != -1609594047) {
            if (hashCode != -318452137) {
                if (hashCode == 270940796) {
                    str.equals("disabled");
                    return false;
                }
            } else if (str.equals("premium") && user != null && user.premium) {
                return true;
            }
        } else if (str.equals("enabled")) {
            return true;
        }
        return false;
    }

    public final void f(TLRPC.Chat chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            gl.c3(new z47(this, chat, (byte) 0));
        } else {
            g(chat);
        }
    }

    public final void f0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2) {
        S(-chat.id, user != null ? user.id : chat2 != null ? chat2.id : 0L);
    }

    public final TLRPC.InputChannel f1(long j) {
        return g1(K0(Long.valueOf(j)));
    }

    public final void f2(akb akbVar, zjb zjbVar, boolean z) {
        TLRPC.TL_theme tL_theme;
        String str;
        if (zjbVar != null) {
            tL_theme = zjbVar.r;
            str = zjbVar.o;
        } else {
            tL_theme = akbVar.G;
            str = akbVar.e;
        }
        byte b = 0;
        boolean z2 = zjbVar == null && akbVar.h;
        boolean z3 = zjbVar != null ? zjbVar.q : akbVar.n;
        TL_account.installTheme installtheme = new TL_account.installTheme();
        installtheme.dark = z;
        if (tL_theme != null) {
            installtheme.format = "android";
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            installtheme.theme = tL_inputTheme;
            installtheme.flags |= 2;
        }
        getConnectionsManager().sendRequest(installtheme, new ce2(b));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TL_account.installWallPaper installwallpaper = new TL_account.installWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = str;
        installwallpaper.wallpaper = tL_inputWallPaperSlug;
        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
        installwallpaper.settings = tL_wallPaperSettings;
        tL_wallPaperSettings.blur = z2;
        tL_wallPaperSettings.motion = z3;
        getConnectionsManager().sendRequest(installwallpaper, new ce2(b));
    }

    public final void f3() {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSuggestedDialogFilters(), new y47(this, (byte) 26));
    }

    public final void f4(TLRPC.InputPeer inputPeer, long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 4);
            } catch (Exception e) {
                nativeByteBuffer = null;
                exc = e;
            }
            try {
                nativeByteBuffer.writeInt32(22);
                inputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                exc = e2;
                fa4.g(exc, true);
                j = getMessagesStorage().y(nativeByteBuffer);
                long j2 = j;
                TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
                tL_messages_getUnreadMentions.peer = inputPeer;
                tL_messages_getUnreadMentions.limit = 1;
                getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new w47((Object) this, (Object) inputPeer, j2, (byte) 10));
            }
            j = getMessagesStorage().y(nativeByteBuffer);
        }
        long j22 = j;
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions2 = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions2.peer = inputPeer;
        tL_messages_getUnreadMentions2.limit = 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions2, new w47((Object) this, (Object) inputPeer, j22, (byte) 10));
    }

    public final void g(TLRPC.Chat chat) {
        Long valueOf = Long.valueOf(chat.id);
        HashMap hashMap = this.h;
        TLRPC.Chat chat2 = (TLRPC.Chat) hashMap.get(valueOf);
        boolean z = chat.call_active;
        int i = kk7.z2;
        if (z && chat.call_not_empty && chat.migrated_to == null && !hc2.r0(chat)) {
            if (chat2 == null) {
                hashMap.put(Long.valueOf(chat.id), chat);
                getNotificationCenter().k(i, new Object[0]);
                return;
            }
            return;
        }
        if (chat2 == null) {
            return;
        }
        hashMap.remove(Long.valueOf(chat.id));
        getNotificationCenter().k(i, new Object[0]);
    }

    public final void g0(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, int i) {
        long j = user != null ? user.id : chat2 != null ? chat2.id : 0L;
        if (i == 0) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new sa7(messagesStorage, -chat.id, j, (byte) 3));
        }
        TLRPC.TL_channels_deleteParticipantHistory tL_channels_deleteParticipantHistory = new TLRPC.TL_channels_deleteParticipantHistory();
        tL_channels_deleteParticipantHistory.channel = g1(chat);
        tL_channels_deleteParticipantHistory.participant = user != null ? l1(user) : j1(chat2);
        getConnectionsManager().sendRequest(tL_channels_deleteParticipantHistory, new rt0((Object) this, (Object) chat, (Object) user, (Object) chat2, (byte) 10));
    }

    public final void g2(int i) {
        this.d0.remove(i);
        getNotificationCenter().k(kk7.B5, Integer.valueOf(i));
    }

    public final void g3(long j, TLRPC.Chat chat) {
        TLRPC.InputPeer tL_inputPeerChannel;
        NativeByteBuffer nativeByteBuffer;
        Exception exc;
        if (chat instanceof TLRPC.TL_channel) {
            long j2 = chat.id;
            vf6 vf6Var = this.S0;
            if (vf6Var.h(j2) < 0) {
                long j3 = chat.access_hash;
                if (j3 == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannel.channel_id = chat.id;
                    tL_inputPeerChannel.peer = h1(chat.fromMessageDialogId);
                    tL_inputPeerChannel.msg_id = chat.fromMessageId;
                } else if (j3 == 0) {
                    if (j != 0) {
                        getMessagesStorage().n1(j);
                        return;
                    }
                    return;
                } else {
                    tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                    tL_inputPeerChannel.channel_id = chat.id;
                    tL_inputPeerChannel.access_hash = chat.access_hash;
                }
                vf6Var.k(Boolean.TRUE, chat.id);
                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = tL_inputPeerChannel;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                if (j == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize() + 4);
                    } catch (Exception e) {
                        nativeByteBuffer = null;
                        exc = e;
                    }
                    try {
                        nativeByteBuffer.writeInt32(0);
                        chat.serializeToStream(nativeByteBuffer);
                    } catch (Exception e2) {
                        exc = e2;
                        fa4.g(exc, true);
                        j = getMessagesStorage().y(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new w47((Object) this, j, (Object) chat, (byte) 5));
                    }
                    j = getMessagesStorage().y(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new w47((Object) this, j, (Object) chat, (byte) 5));
            }
        }
    }

    public final void g4(long j, HashMap hashMap, int i) {
        HashMap hashMap2;
        vf6 vf6Var;
        boolean z = i == 1;
        boolean z2 = i == 3;
        if (z) {
            hashMap2 = this.y1;
            vf6Var = this.z1;
        } else if (z2) {
            hashMap2 = this.A1;
            vf6Var = this.B1;
        } else {
            hashMap2 = this.w1;
            vf6Var = this.x1;
        }
        HashMap hashMap3 = hashMap2;
        vf6 vf6Var2 = vf6Var;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            ArrayList arrayList = (ArrayList) entry.getValue();
            ArrayList arrayList2 = (ArrayList) hashMap3.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap3.put(str, arrayList2);
            }
            arrayList2.addAll(arrayList);
            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
            getwebpagepreview.message = str;
            getConnectionsManager().sendRequest(getwebpagepreview, new oz4(this, hashMap3, str, vf6Var2, j, i));
        }
    }

    public final void g5(long j, boolean z, boolean z2, boolean z3) {
        TLRPC.TL_channels_toggleForum tL_channels_toggleForum = new TLRPC.TL_channels_toggleForum();
        tL_channels_toggleForum.channel = f1(j);
        tL_channels_toggleForum.enabled = z;
        tL_channels_toggleForum.tabs = z2;
        tL_channels_toggleForum.sidebar = z3;
        getConnectionsManager().sendRequest(tL_channels_toggleForum, new y47(this, (byte) 16), 64);
        getNotificationCenter().k(kk7.t5, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    public final void h() {
        TLRPC.TL_userForeign_old2 tL_userForeign_old2 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old2.phone = "333";
        tL_userForeign_old2.id = 333000L;
        tL_userForeign_old2.first_name = "Telegram";
        tL_userForeign_old2.last_name = "";
        tL_userForeign_old2.status = null;
        tL_userForeign_old2.photo = new TLRPC.TL_userProfilePhotoEmpty();
        a4(tL_userForeign_old2, true, false);
        TLRPC.TL_userForeign_old2 tL_userForeign_old22 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old22.phone = "42777";
        tL_userForeign_old22.id = 777000L;
        tL_userForeign_old22.verified = true;
        tL_userForeign_old22.first_name = "Telegram";
        tL_userForeign_old22.last_name = "Notifications";
        tL_userForeign_old22.status = null;
        tL_userForeign_old22.photo = new TLRPC.TL_userProfilePhotoEmpty();
        a4(tL_userForeign_old22, true, false);
    }

    public final void h0(TLRPC.TL_inputPhoto tL_inputPhoto) {
        TLRPC.Photo photo;
        long e = getUserConfig().e();
        if (tL_inputPhoto != null) {
            TLRPC.TL_photos_deletePhotos tL_photos_deletePhotos = new TLRPC.TL_photos_deletePhotos();
            tL_photos_deletePhotos.id.add(tL_inputPhoto);
            S0(e).e(tL_inputPhoto.id);
            getConnectionsManager().sendRequest(tL_photos_deletePhotos, null);
            return;
        }
        w97 S0 = S0(e);
        ArrayList arrayList = S0.b;
        if (arrayList.size() > 0 && (photo = (TLRPC.Photo) arrayList.get(0)) != null) {
            S0.e(photo.id);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        TLRPC.User V1 = V1(Long.valueOf(getUserConfig().e()));
        if (V1 == null) {
            V1 = getUserConfig().f();
        }
        if (V1 == null) {
            return;
        }
        if (V1.photo != null) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new sa7(messagesStorage, V1.id, V1.photo.photo_id, (byte) 4));
        }
        getNotificationCenter().k(kk7.i0, new Object[0]);
        getNotificationCenter().k(2, Integer.valueOf(q5));
        getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new x47(this, e, (byte) 9));
    }

    public final TLRPC.InputPeer h1(long j) {
        if (j == getUserConfig().e()) {
            return new TLRPC.TL_inputPeerSelf();
        }
        if (j >= 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 != null && V1.access_hash == 0) {
                long j2 = V1.fromMessageDialogId;
                if (j2 != 0 && j2 != j && V1.fromMessageId != 0) {
                    TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
                    tL_inputPeerUserFromMessage.user_id = j;
                    tL_inputPeerUserFromMessage.peer = h1(V1.fromMessageDialogId);
                    tL_inputPeerUserFromMessage.msg_id = V1.fromMessageId;
                    return tL_inputPeerUserFromMessage;
                }
            }
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = j;
            if (V1 != null) {
                tL_inputPeerUser.access_hash = V1.access_hash;
            }
            return tL_inputPeerUser;
        }
        long j3 = -j;
        TLRPC.Chat K0 = K0(Long.valueOf(j3));
        if (!hc2.T(K0)) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = j3;
            return tL_inputPeerChat;
        }
        if (K0 != null && K0.access_hash == 0) {
            long j4 = K0.fromMessageDialogId;
            if (j4 != 0 && j4 != j && K0.fromMessageId != 0) {
                TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChannelFromMessage.channel_id = j3;
                tL_inputPeerChannelFromMessage.peer = h1(K0.fromMessageDialogId);
                tL_inputPeerChannelFromMessage.msg_id = K0.fromMessageId;
                return tL_inputPeerChannelFromMessage;
            }
        }
        TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
        tL_inputPeerChannel.channel_id = j3;
        tL_inputPeerChannel.access_hash = K0.access_hash;
        return tL_inputPeerChannel;
    }

    public final void h2() {
        this.a5 = null;
        this.Z4 = 0L;
    }

    public final void h3(TLRPC.InputPeer inputPeer, long j) {
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null) {
            long m = cf3.m(inputPeer);
            vf6 vf6Var = this.T0;
            if (vf6Var.h(m) >= 0) {
                return;
            }
            vf6Var.k(Boolean.TRUE, m);
            if (w01.a) {
                fa4.b("load unknown dialog " + m);
            }
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
            tL_inputDialogPeer.peer = inputPeer;
            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
            if (j == 0) {
                NativeByteBuffer nativeByteBuffer2 = null;
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 4);
                } catch (Exception e) {
                    exc = e;
                }
                try {
                    nativeByteBuffer.writeInt32(15);
                    inputPeer.serializeToStream(nativeByteBuffer);
                } catch (Exception e2) {
                    exc = e2;
                    nativeByteBuffer2 = nativeByteBuffer;
                    fa4.g(exc, true);
                    nativeByteBuffer = nativeByteBuffer2;
                    j = getMessagesStorage().y(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new t57(this, j, m, (byte) 1));
                }
                j = getMessagesStorage().y(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new t57(this, j, m, (byte) 1));
        }
    }

    public final void h4(ArrayList arrayList, long j) {
        int i = 0;
        int i2 = this.U.get(j, 0);
        if (i2 != 0) {
            int size = arrayList.size();
            while (i < size) {
                if (((TLRPC.Message) arrayList.get(i)).id <= i2) {
                    arrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public final void h5(long j, boolean z) {
        TLRPC.TL_channels_togglePreHistoryHidden tL_channels_togglePreHistoryHidden = new TLRPC.TL_channels_togglePreHistoryHidden();
        tL_channels_togglePreHistoryHidden.channel = f1(j);
        tL_channels_togglePreHistoryHidden.enabled = z;
        getConnectionsManager().sendRequest(tL_channels_togglePreHistoryHidden, new y47(this, (byte) 11), 64);
    }

    public final void i(ArrayList arrayList, long j) {
        int i;
        vf6 vf6Var = this.B0;
        SparseArray sparseArray = (SparseArray) vf6Var.f(j);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            vf6Var.k(sparseArray, j);
            this.C0++;
        }
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((k27) sparseArray.valueAt(i2)).v0 = false;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int size2 = arrayList.size();
        int i3 = Integer.MAX_VALUE;
        boolean z = false;
        for (int i4 = 0; i4 < size2; i4++) {
            k27 k27Var = (k27) arrayList.get(i4);
            if (k27Var.D == 17) {
                TLRPC.MessageMedia messageMedia = k27Var.k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    if (!poll.closed && (i = poll.close_date) != 0) {
                        if (i <= currentTime) {
                            z = true;
                        } else {
                            i3 = Math.min(i3, i - currentTime);
                        }
                    }
                    int e1 = k27Var.e1();
                    k27 k27Var2 = (k27) sparseArray.get(e1);
                    if (k27Var2 != null) {
                        k27Var2.v0 = true;
                    } else {
                        sparseArray.put(e1, k27Var);
                    }
                }
            }
        }
        if (z) {
            this.D0 = 0L;
        } else if (i3 < 5) {
            this.D0 = Math.min(this.D0, System.currentTimeMillis() - ((5 - i3) * 1000));
        }
    }

    public final void i2(int i, long j) {
        if (this.h1.contains(Long.valueOf(j))) {
            return;
        }
        LongSparseLongArray longSparseLongArray = this.i1;
        int indexOfKey = longSparseLongArray.indexOfKey(j);
        if (indexOfKey >= 0) {
            longSparseLongArray.removeAt(indexOfKey);
        }
        Z2(V1(Long.valueOf(j)), i, true, null);
    }

    public final void i3(int i, TLRPC.User user, boolean z) {
        ad7 messagesStorage = getMessagesStorage();
        if (user == null) {
            messagesStorage.getClass();
        } else {
            messagesStorage.a.c(new bs1((Object) messagesStorage, (TLObject) user, z, i, (byte) 8));
        }
    }

    public final void i4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        long j = dialog.id;
        if (this.F.remove(dialog) && cf3.x(dialog)) {
            Utilities.d.c(new r57(this, j, (byte) 9));
        }
        this.y.remove(dialog);
        this.H.remove(dialog);
        this.I.remove(dialog);
        this.G.remove(dialog);
        this.J.remove(dialog);
        this.M.remove(dialog);
        this.K.remove(dialog);
        this.L.remove(dialog);
        this.E.remove(dialog);
        int i = 0;
        while (true) {
            t97[] t97VarArr = this.N;
            if (i >= t97VarArr.length) {
                break;
            }
            t97 t97Var = t97VarArr[i];
            if (t97Var != null) {
                t97Var.k.remove(dialog);
                this.N[i].l.remove(dialog);
            }
            i++;
        }
        this.p4.remove(dialog);
        this.R.l(j);
        ArrayList arrayList = (ArrayList) this.w.get(dialog.folder_id);
        if (arrayList != null) {
            arrayList.remove(dialog);
        }
        j4(dialog);
    }

    public final void i5(final long j, final long j2, boolean z, boolean z2, final boolean z3, final Runnable runnable, final Runnable runnable2) {
        TLRPC.TL_channels_toggleJoinRequest tL_channels_toggleJoinRequest = new TLRPC.TL_channels_toggleJoinRequest();
        tL_channels_toggleJoinRequest.channel = f1(j);
        tL_channels_toggleJoinRequest.enabled = z;
        tL_channels_toggleJoinRequest.apply_to_invites = z2;
        if (z3) {
            tL_channels_toggleJoinRequest.guard_bot = j2 != 0 ? m1(j2) : new TLRPC.TL_inputUserEmpty();
        }
        getConnectionsManager().sendRequest(tL_channels_toggleJoinRequest, new RequestDelegate() { // from class: j87
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Runnable runnable3 = runnable;
                if (tLObject != null) {
                    final na7 na7Var = na7.this;
                    na7Var.R3((TLRPC.Updates) tLObject, false);
                    final boolean z4 = z3;
                    final long j3 = j;
                    final long j4 = j2;
                    gl.d3(new Runnable() { // from class: u87
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLRPC.ChatFull L0;
                            na7 na7Var2 = na7.this;
                            if (z4 && (L0 = na7Var2.L0(j3)) != null) {
                                int i = L0.flags2;
                                long j5 = j4;
                                L0.flags2 = fod.b(i, TLObject.FLAG_23, j5 != 0);
                                L0.guard_bot_id = j5;
                                na7Var2.getMessagesStorage().K1(L0, false);
                                kk7 notificationCenter = na7Var2.getNotificationCenter();
                                Boolean bool = Boolean.FALSE;
                                notificationCenter.k(kk7.S, L0, 0, bool, bool);
                            }
                            na7Var2.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                        }
                    }, 100L);
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
                if (tL_error == null || "CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                } else {
                    Runnable runnable4 = runnable2;
                    if (runnable4 != null) {
                        runnable4.run();
                    }
                }
            }
        }, 64);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(final long j, final TLRPC.User user, int i, String str, final d dVar, final boolean z, final Runnable runnable, final z97 z97Var, final p8c p8cVar) {
        TLRPC.TL_messages_addChatUser tL_messages_addChatUser;
        if (user == null) {
            if (z97Var != null) {
                z97Var.b(null);
            }
            if (p8cVar != null) {
                p8cVar.a(null);
                return;
            }
            return;
        }
        final TLRPC.Chat K0 = K0(Long.valueOf(j));
        final boolean T = hc2.T(K0);
        final boolean z2 = T && K0.megagroup;
        final TLRPC.InputUser o1 = o1(user);
        if (str != null && (!T || z2)) {
            TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
            tL_messages_startBot.bot = o1;
            if (T) {
                tL_messages_startBot.peer = h1(-j);
            } else {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_messages_startBot.peer = tL_inputPeerChat;
                tL_inputPeerChat.chat_id = j;
            }
            tL_messages_startBot.start_param = str;
            tL_messages_startBot.random_id = Utilities.b.nextLong();
            tL_messages_addChatUser = tL_messages_startBot;
        } else if (!T) {
            TLRPC.TL_messages_addChatUser tL_messages_addChatUser2 = new TLRPC.TL_messages_addChatUser();
            tL_messages_addChatUser2.chat_id = j;
            tL_messages_addChatUser2.fwd_limit = i;
            tL_messages_addChatUser2.user_id = o1;
            tL_messages_addChatUser = tL_messages_addChatUser2;
        } else if (o1 instanceof TLRPC.TL_inputUserSelf) {
            Long valueOf = Long.valueOf(j);
            ArrayList arrayList = this.n;
            if (arrayList.contains(valueOf)) {
                if (z97Var != null) {
                    z97Var.b(null);
                    return;
                }
                return;
            } else {
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                tL_channels_joinChannel.channel = f1(j);
                arrayList.add(Long.valueOf(j));
                tL_messages_addChatUser = tL_channels_joinChannel;
            }
        } else {
            TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
            tL_channels_inviteToChannel.channel = f1(j);
            tL_channels_inviteToChannel.users.add(o1);
            tL_messages_addChatUser = tL_channels_inviteToChannel;
        }
        final TLRPC.TL_messages_addChatUser tL_messages_addChatUser3 = tL_messages_addChatUser;
        getConnectionsManager().sendRequest(tL_messages_addChatUser3, new RequestDelegate() { // from class: f77
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                TLRPC.Updates updates;
                boolean z3;
                final na7 na7Var = na7.this;
                final boolean z4 = T;
                final TLRPC.InputUser inputUser = o1;
                long j2 = j;
                if (z4 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    gl.c3(new r57(na7Var, j2, (byte) 12));
                }
                p8c p8cVar2 = p8cVar;
                Runnable runnable2 = runnable;
                TLRPC.User user2 = user;
                if (tL_error != null) {
                    if ("JOIN_GUARD_TIMEOUT".equals(tL_error.text)) {
                        gl.c3(new t67(p8cVar2, runnable2, (byte) 9));
                        return;
                    }
                    if ("PRIVACY_PREMIUM_REQUIRED".equals(tL_error.text)) {
                        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
                        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
                        TLRPC.TL_missingInvitee tL_missingInvitee = new TLRPC.TL_missingInvitee();
                        tL_missingInvitee.user_id = user2.id;
                        tL_missingInvitee.premium_would_allow_invite = true;
                        tL_missingInvitee.premium_required_for_pm = true;
                        tL_messages_invitedUsers.missing_invitees.add(tL_missingInvitee);
                        gl.c3(new m77((Object) na7Var, (Object) p8cVar2, (Object) tL_messages_invitedUsers, j2, (byte) 0));
                        return;
                    }
                    gl.c3(new mn0(p8cVar2, (byte) 10));
                    if ("USER_ALREADY_PARTICIPANT".equals(tL_error.text) && z) {
                        if (runnable2 != null) {
                            gl.c3(runnable2);
                            return;
                        }
                        return;
                    }
                    final z97 z97Var2 = z97Var;
                    final d dVar2 = dVar;
                    final TLObject tLObject2 = tL_messages_addChatUser3;
                    final boolean z5 = z2;
                    if (z97Var2 != null) {
                        gl.c3(new zo6(na7Var, z97Var2, tL_error, dVar2, tLObject2, z4, z5, (byte) 1));
                    }
                    gl.c3(new Runnable() { // from class: n77
                        @Override // java.lang.Runnable
                        public final void run() {
                            na7 na7Var2 = na7.this;
                            z97 z97Var3 = z97Var2;
                            boolean z6 = z4;
                            if (z97Var3 == null) {
                                ij.c0(na7Var2.currentAccount, tL_error, dVar2, tLObject2, Boolean.valueOf(z6 && !z5));
                            }
                            if (z6 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                                na7Var2.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                            }
                        }
                    });
                    return;
                }
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = null;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    updates = ((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates;
                } else {
                    if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        gl.c3(new de2(na7Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j2, (byte) 3));
                        return;
                    }
                    if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                        tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) tLObject;
                        updates = tL_messages_invitedUsers2.updates;
                    } else {
                        if (!(tLObject instanceof TLRPC.Updates)) {
                            fa4.d("unexpected " + tLObject + " in addUserToChat");
                            gl.c3(new mn0(p8cVar2, (byte) 11));
                            return;
                        }
                        updates = (TLRPC.Updates) tLObject;
                    }
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= updates.updates.size()) {
                        z3 = false;
                        break;
                    }
                    TLRPC.Update update = updates.updates.get(i2);
                    if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                        z3 = true;
                        break;
                    }
                    i2++;
                }
                na7Var.R3(updates, false);
                if (tL_messages_invitedUsers2 != null && !tL_messages_invitedUsers2.missing_invitees.isEmpty()) {
                    gl.c3(new o77((Object) na7Var, (Object) updates, (Object) p8cVar2, (Object) tL_messages_invitedUsers2, j2, (byte) 0));
                    return;
                }
                if (z4) {
                    if (!z3 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                        na7Var.z0(j2, true);
                    }
                    gl.d3(new r57(na7Var, j2, (byte) 14), 1000L);
                }
                if (z4 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    na7Var.getMessagesStorage().O1(-j2, j2, new ArrayList(), null);
                }
                if (runnable2 != null) {
                    gl.c3(runnable2);
                }
                if (p8cVar2 != null) {
                    gl.c3(new mn0(p8cVar2, (byte) 9));
                }
                if (l7c.D(user2) && !hc2.V(K0) && z3) {
                    gl.c3(new r57(na7Var, j2, (byte) 13));
                }
            }
        });
    }

    public final boolean j0() {
        int i = 0;
        while (true) {
            t97[] t97VarArr = this.N;
            if (i >= t97VarArr.length) {
                return j2();
            }
            if (t0(t97VarArr[i])) {
                return true;
            }
            i++;
        }
    }

    public final boolean j2() {
        return this.G0.size() > 1 && this.n4.contains(0);
    }

    public final void j3() {
        gl.r(this.l5);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        o97 o97Var = this.n5;
        if (tL_webBrowserSettings == null) {
            o97Var.e(this.currentAccount, null, new k67(this, (byte) 0));
        }
        o97Var.d(this.currentAccount, null);
        o97Var.c(this.currentAccount, null, new f97(this, (byte) 2));
    }

    public final void j4(TLRPC.Dialog dialog) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j = dialog.id;
        vf6 vf6Var = this.x;
        if (j > 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 != null) {
                long j2 = V1.linked_community_id;
                if (j2 == 0 || (arrayList2 = (ArrayList) vf6Var.f(j2)) == null) {
                    return;
                }
                arrayList2.remove(dialog);
                return;
            }
            return;
        }
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        if (K0 != null) {
            long j3 = K0.linked_community_id;
            if (j3 == 0 || (arrayList = (ArrayList) vf6Var.f(j3)) == null) {
                return;
            }
            arrayList.remove(dialog);
        }
    }

    public final void j5(long j, int i, boolean z, vn2 vn2Var) {
        TLRPC.TL_messages_toggleNoForwards tL_messages_toggleNoForwards = new TLRPC.TL_messages_toggleNoForwards();
        tL_messages_toggleNoForwards.peer = h1(j);
        tL_messages_toggleNoForwards.enabled = z;
        if (i > 0) {
            tL_messages_toggleNoForwards.request_msg_id = i;
            tL_messages_toggleNoForwards.flags |= 1;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_toggleNoForwards, null, new ae2((Object) this, (Object) vn2Var, (byte) 29), 64);
    }

    public final void k(long j, TLRPC.User user, String str, d dVar, Runnable runnable) {
        j(j, user, 0, str, dVar, false, runnable, null, null);
    }

    public final void k0(int i, long j, SparseArray sparseArray) {
        Utilities.d.c(new w57(this, i, (byte) 1));
        if (sparseArray != null) {
            gl.c3(new go6((Object) this, j, (Object) sparseArray, (byte) 3));
        }
    }

    public final TLRPC.InputPeer k1(TLRPC.Peer peer) {
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = peer.chat_id;
            return tL_inputPeerChat;
        }
        if (!(peer instanceof TLRPC.TL_peerChannel)) {
            TLRPC.User V1 = V1(Long.valueOf(peer.user_id));
            if (V1 == null || V1.access_hash != 0 || V1.fromMessageDialogId == 0 || V1.fromMessageId == 0) {
                TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                tL_inputPeerUser.user_id = peer.user_id;
                if (V1 != null) {
                    tL_inputPeerUser.access_hash = V1.access_hash;
                }
                return tL_inputPeerUser;
            }
            TLRPC.TL_inputPeerUserFromMessage tL_inputPeerUserFromMessage = new TLRPC.TL_inputPeerUserFromMessage();
            tL_inputPeerUserFromMessage.user_id = peer.user_id;
            tL_inputPeerUserFromMessage.peer = h1(V1.fromMessageDialogId);
            tL_inputPeerUserFromMessage.msg_id = V1.fromMessageId;
            return tL_inputPeerUserFromMessage;
        }
        TLRPC.Chat K0 = K0(Long.valueOf(peer.channel_id));
        if (K0 != null && K0.access_hash == 0) {
            long j = K0.fromMessageDialogId;
            if (j != 0 && j != peer.channel_id && K0.fromMessageId != 0) {
                TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChannelFromMessage.channel_id = peer.channel_id;
                tL_inputPeerChannelFromMessage.peer = h1(K0.fromMessageDialogId);
                tL_inputPeerChannelFromMessage.msg_id = K0.fromMessageId;
                return tL_inputPeerChannelFromMessage;
            }
        }
        TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
        tL_inputPeerChannel.channel_id = peer.channel_id;
        if (K0 != null) {
            tL_inputPeerChannel.access_hash = K0.access_hash;
        }
        return tL_inputPeerChannel;
    }

    public final boolean k2(TLRPC.Chat chat) {
        TLRPC.Chat K0;
        if (chat == null) {
            return false;
        }
        TLRPC.InputChannel inputChannel = chat.migrated_to;
        return (inputChannel == null || (K0 = K0(Long.valueOf(inputChannel.channel_id))) == null) ? chat.noforwards : K0.noforwards;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k3() {
        boolean z;
        if (!getUserConfig().p()) {
            int size = this.G0.size() - 1;
            gr grVar = this.k4;
            if (size > grVar.Z0.f()) {
                int size2 = (this.G0.size() - 1) - grVar.Z0.f();
                ArrayList arrayList = new ArrayList(this.G0);
                Collections.reverse(arrayList);
                z = false;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i < size2) {
                        if (!((t97) arrayList.get(i)).p) {
                            z = true;
                        }
                        ((t97) arrayList.get(i)).p = true;
                    } else {
                        if (((t97) arrayList.get(i)).p) {
                            z = true;
                        }
                        ((t97) arrayList.get(i)).p = false;
                    }
                }
                if (z) {
                    return;
                }
                getNotificationCenter().k(kk7.N2, new Object[0]);
                return;
            }
        }
        z = false;
        if (z) {
        }
    }

    public final void k4(t97 t97Var) {
        this.G0.remove(t97Var);
        this.J0.remove(t97Var.a);
        Integer valueOf = Integer.valueOf(t97Var.a);
        HashSet hashSet = this.n4;
        if (hashSet.remove(valueOf)) {
            C4();
        }
        if (hashSet.contains(0)) {
            Z4(null);
        }
        getNotificationCenter().k(kk7.N2, new Object[0]);
    }

    public final void k5(long j, boolean z) {
        TL_communities.TL_communities_toggleCommunityCollapsedInDialogs tL_communities_toggleCommunityCollapsedInDialogs = new TL_communities.TL_communities_toggleCommunityCollapsedInDialogs();
        tL_communities_toggleCommunityCollapsedInDialogs.community = f1(j);
        tL_communities_toggleCommunityCollapsedInDialogs.collapsed = z;
        TLRPC.Chat K0 = K0(Long.valueOf(j));
        byte b = 2;
        byte b2 = 0;
        if (K0 != null) {
            K0.collapsed_in_dialogs = z;
            T3(K0, true);
            Z4(null);
            getNotificationCenter().k(kk7.V5, Long.valueOf(j), Boolean.valueOf(z));
            getNotificationCenter().k(kk7.r, new Object[0]);
        }
        getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_toggleCommunityCollapsedInDialogs, new hc(b2), new np0(b));
    }

    public final void l(TLRPC.Chat chat, d dVar, ArrayList arrayList, int i, vs2 vs2Var, vs2 vs2Var2, pc7 pc7Var) {
        int size = arrayList.size();
        int[] iArr = {0};
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        TLRPC.Chat chat2 = chat;
        long j = chat2.id;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i2);
            j(j, user, i, null, dVar, false, new t67(vs2Var, user, (byte) 13), new dx6((Object) vs2Var2, (Object) user, (byte) 4), new e77(this, tL_messages_invitedUsers, iArr, size, chat2, pc7Var));
            a4(user, false, false);
            chat2 = chat;
        }
    }

    public final void l0(boolean z) {
        TLRPC.UserFull W1 = W1(getUserConfig().e());
        if (W1 != null) {
            W1.sponsored_enabled = false;
            getMessagesStorage().g2(W1, false);
            if (z) {
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = false;
                getConnectionsManager().sendRequest(togglesponsoredmessages, null);
            }
        }
    }

    public final boolean l2(long j) {
        if (j < 0) {
            return hc2.Y(K0(Long.valueOf(-j)));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r20 != Integer.MAX_VALUE) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        if (r20 != Integer.MAX_VALUE) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x007c, code lost:
    
        r16 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l3(final long j, final int i, int i2, final int i3, boolean z, final long j2, int i4, final boolean z2, int i5) {
        boolean z3 = false;
        boolean z4 = true;
        if (j2 == 0) {
            boolean z5 = getNotificationsController().U;
            if (cf3.B(j)) {
                if (i3 != 0) {
                    TLRPC.EncryptedChat Y0 = Y0(Integer.valueOf((int) (j & 4294967295L)));
                    ad7 messagesStorage = getMessagesStorage();
                    messagesStorage.a.c(new ac7(messagesStorage, j, i, i5, messagesStorage.H, i2, (byte) 2));
                    getMessagesStorage().a.c(new y57(this, j, i3, z, i4, i2, (byte) 1));
                    if (Y0 != null && Y0.ttl > 0) {
                        int max = Math.max(getConnectionsManager().getCurrentTime(), i3);
                        ad7 messagesStorage2 = getMessagesStorage();
                        messagesStorage2.a.c(new xb7(messagesStorage2, Y0.id, null, 0, i3, max));
                    }
                    final long j3 = (j2 == 0 || !x2(j)) ? 0L : j2;
                    if (z4) {
                        Utilities.d.c(new Runnable() { // from class: g97
                            @Override // java.lang.Runnable
                            public final void run() {
                                ga7 ga7Var;
                                na7 na7Var = na7.this;
                                vf6 vf6Var = na7Var.J1;
                                HashMap hashMap = na7Var.L1;
                                long j4 = j2;
                                long j5 = j;
                                if (j4 != 0) {
                                    ga7Var = (ga7) hashMap.get(j5 + "_" + j4);
                                } else {
                                    ga7Var = (ga7) vf6Var.f(j5);
                                }
                                boolean z6 = z2;
                                if (ga7Var == null) {
                                    ga7Var = new ga7();
                                    ga7Var.a = j5;
                                    ga7Var.b = j4;
                                    ga7Var.c = j3;
                                    ga7Var.f = SystemClock.elapsedRealtime() + 5000;
                                    if (!z6) {
                                        if (j4 != 0) {
                                            hashMap.put(j5 + "_" + j4, ga7Var);
                                            na7Var.K1.add(ga7Var);
                                        } else {
                                            vf6Var.k(ga7Var, j5);
                                            na7Var.I1.add(ga7Var);
                                        }
                                    }
                                }
                                ga7Var.e = i3;
                                ga7Var.d = i;
                                if (z6) {
                                    na7Var.N(ga7Var);
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 0) {
                return;
            }
            Integer num = (Integer) this.P.get(Long.valueOf(j));
            if (num == null) {
                num = 0;
            }
            this.P.put(Long.valueOf(j), Integer.valueOf(Math.max(num.intValue(), i)));
            ad7 messagesStorage3 = getMessagesStorage();
            messagesStorage3.a.c(new ac7(messagesStorage3, j, i, i5, messagesStorage3.H, i2, (byte) 2));
            getMessagesStorage().a.c(new i67(this, j, i4, i, z, (byte) 1));
        }
    }

    public final void l4(int i) {
        long j = i | 2305843009213693952L;
        vf6 vf6Var = this.R;
        TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var.f(j);
        if (dialog == null) {
            return;
        }
        vf6Var.l(j);
        this.y.remove(dialog);
        Z4(null);
        getNotificationCenter().k(kk7.r, new Object[0]);
        getNotificationCenter().k(kk7.c0, Integer.valueOf(i));
    }

    public final void l5(Runnable runnable, long j) {
        TLRPC.Chat K0;
        TLRPC.TL_contacts_unblock tL_contacts_unblock = new TLRPC.TL_contacts_unblock();
        TLRPC.User user = null;
        if (j > 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 == null) {
                return;
            }
            user = V1;
            K0 = null;
        } else {
            K0 = K0(Long.valueOf(-j));
            if (K0 == null) {
                return;
            }
        }
        this.y0--;
        this.x0.delete(j);
        if (user != null) {
            tL_contacts_unblock.id = l1(user);
        } else {
            tL_contacts_unblock.id = j1(K0);
        }
        getNotificationCenter().k(kk7.f0, new Object[0]);
        getConnectionsManager().sendRequest(tL_contacts_unblock, new n35(runnable, (byte) 10));
    }

    public final void m(String str, boolean z) {
        TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
        togglewebbrowsersettingsexception.flags |= 1;
        togglewebbrowsersettingsexception.open_external_browser = z;
        togglewebbrowsersettingsexception.url = str;
        getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new k67(this, (byte) 4));
    }

    public final void m0(long j, int i, long j2) {
        getMessagesStorage().n1(j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new jc7(messagesStorage, arrayList, j2, (byte) 2));
    }

    public final TLRPC.InputUser m1(long j) {
        return o1(V1(Long.valueOf(j)));
    }

    public final boolean m2(long j, long j2) {
        return n2(j, j2, null);
    }

    public final void m3(long j, TLRPC.InputPeer inputPeer, long j2) {
        na7 na7Var;
        long j3;
        Exception exc;
        NativeByteBuffer nativeByteBuffer;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
        NativeByteBuffer nativeByteBuffer2 = null;
        if (dialog != null) {
            dialog.unread_mark = true;
            if (dialog.unread_count == 0) {
                na7Var = this;
                j3 = j;
                na7Var.n2(j3, 0L, null);
            } else {
                na7Var = this;
                j3 = j;
            }
            na7Var.getNotificationCenter().k(2, 256);
            na7Var.getMessagesStorage().C1(j3, true);
            if (na7Var.j0()) {
                na7Var.Z4(null);
                na7Var.getNotificationCenter().k(kk7.r, new Object[0]);
            }
        } else {
            na7Var = this;
            j3 = j;
        }
        if (cf3.B(j3)) {
            return;
        }
        TLRPC.TL_messages_markDialogUnread tL_messages_markDialogUnread = new TLRPC.TL_messages_markDialogUnread();
        tL_messages_markDialogUnread.unread = true;
        if (inputPeer == null) {
            inputPeer = na7Var.h1(j3);
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
            return;
        }
        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
        tL_inputDialogPeer.peer = inputPeer;
        tL_messages_markDialogUnread.peer = tL_inputDialogPeer;
        if (j2 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 12);
            } catch (Exception e) {
                exc = e;
            }
            try {
                nativeByteBuffer.writeInt32(9);
                nativeByteBuffer.writeInt64(j3);
                inputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                exc = e2;
                nativeByteBuffer2 = nativeByteBuffer;
                fa4.g(exc, true);
                nativeByteBuffer = nativeByteBuffer2;
                j2 = na7Var.getMessagesStorage().y(nativeByteBuffer);
                na7Var.getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new x47(na7Var, j2, (byte) 10));
            }
            j2 = na7Var.getMessagesStorage().y(nativeByteBuffer);
        }
        na7Var.getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new x47(na7Var, j2, (byte) 10));
    }

    public final void m4() {
        TLRPC.Dialog dialog = this.q2;
        if (dialog == null) {
            return;
        }
        long j = dialog.id;
        if (j < 0) {
            TLRPC.Chat K0 = K0(Long.valueOf(-j));
            if (hc2.r0(K0) || K0.restricted) {
                i4(this.q2);
            }
        } else {
            i4(dialog);
        }
        this.q2 = null;
        Z4(null);
        getNotificationCenter().k(kk7.r, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m5(long j, TLRPC.EmojiStatus emojiStatus, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus;
        boolean z = j == 0 || j == getUserConfig().e();
        TLRPC.EmojiStatus n0 = ((emojiStatus instanceof TLRPC.TL_inputEmojiStatusCollectible) && ug8.A(tL_starGiftUnique)) ? n0(tL_starGiftUnique) : emojiStatus;
        if (z) {
            TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
            updateemojistatus.emoji_status = emojiStatus;
            TLRPC.User f = getUserConfig().f();
            tL_channels_updateEmojiStatus = updateemojistatus;
            if (f != null) {
                f.emoji_status = n0;
                getNotificationCenter().k(kk7.o5, f);
                tL_channels_updateEmojiStatus = updateemojistatus;
            }
        } else {
            TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus2 = new TLRPC.TL_channels_updateEmojiStatus();
            long j2 = -j;
            tL_channels_updateEmojiStatus2.channel = f1(j2);
            tL_channels_updateEmojiStatus2.emoji_status = emojiStatus;
            TLRPC.Chat K0 = K0(Long.valueOf(j2));
            tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            if (K0 != null) {
                K0.flags |= 512;
                K0.emoji_status = n0;
                T3(K0, true);
                tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            }
        }
        getMessagesController().p5(j, n0);
        getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_19));
        getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, null);
    }

    public final void n(ArrayList arrayList) {
        SharedPreferences.Editor edit = q1(this.currentAccount).W3.edit();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
            if (dialog.peer != null && (dialog.notify_settings instanceof TLRPC.TL_peerNotifySettings)) {
                wm7 wm7Var = getNotificationsController().h0;
                wm7Var.getClass();
                long B1 = k27.B1(dialog.peer);
                if ((dialog.notify_settings.flags & 2) != 0) {
                    edit.putBoolean(ls6.n(B1, "silent_"), dialog.notify_settings.silent);
                } else {
                    edit.remove("silent_" + B1);
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(wm7Var.a);
                TLRPC.PeerNotifySettings peerNotifySettings = dialog.notify_settings;
                if ((peerNotifySettings.flags & 4) == 0) {
                    edit.remove("notify2_" + B1);
                } else if (peerNotifySettings.mute_until <= connectionsManager.getCurrentTime()) {
                    edit.putInt("notify2_" + B1, 0);
                } else if (dialog.notify_settings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                    edit.putInt("notify2_" + B1, 2);
                    dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    edit.putInt("notify2_" + B1, 3);
                    edit.putInt(ls6.n(B1, "notifyuntil_"), dialog.notify_settings.mute_until);
                }
            }
        }
        edit.apply();
    }

    public final TLRPC.InputUser n1(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (inputPeer.access_hash == 0) {
            TLRPC.User V1 = V1(Long.valueOf(inputPeer.user_id));
            if (V1.access_hash == 0 && V1.fromMessageDialogId != 0 && V1.fromMessageId != 0) {
                TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
                tL_inputUserFromMessage.user_id = inputPeer.user_id;
                tL_inputUserFromMessage.peer = h1(V1.fromMessageDialogId);
                tL_inputUserFromMessage.msg_id = V1.fromMessageId;
                return tL_inputUserFromMessage;
            }
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = inputPeer.user_id;
        tL_inputUser.access_hash = inputPeer.access_hash;
        return tL_inputUser;
    }

    public final boolean n2(long j, long j2, TLRPC.Chat chat) {
        Boolean bool;
        StringBuilder sb = new StringBuilder("notify2_");
        boolean z = false;
        sb.append(im7.p(j, j2, false));
        String sb2 = sb.toString();
        SharedPreferences sharedPreferences = this.W3;
        int i = sharedPreferences.getInt(sb2, -1);
        if (i == -1) {
            if (chat != null) {
                if (hc2.T(chat) && !chat.megagroup) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            return j2 != 0 ? n2(j, 0L, chat) : !getNotificationsController().x(j, bool, false, false);
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            if (sharedPreferences.getInt("notifyuntil_" + im7.p(j, j2, false), 0) >= getConnectionsManager().getCurrentTime()) {
                return true;
            }
        }
        return false;
    }

    public final void n3(ArrayList arrayList, long j) {
        ArrayList arrayList2 = (ArrayList) this.S.f(j);
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                k27 k27Var = (k27) arrayList2.get(i);
                if (k27Var != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < arrayList.size()) {
                            if (k27Var.e1() == ((Integer) arrayList.get(i2)).intValue()) {
                                k27Var.Z = true;
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    public final void n4(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        byte b = 0;
        if (j == 0) {
            TLRPC.TL_pendingSuggestion tL_pendingSuggestion = this.w3;
            int i = kk7.r1;
            if (tL_pendingSuggestion != null && TextUtils.equals(str, tL_pendingSuggestion.suggestion)) {
                this.w3 = null;
                getNotificationCenter().k(i, new Object[0]);
            } else {
                if (!this.u3.remove(str) && this.v3.contains(str)) {
                    return;
                }
                this.v3.add(str);
                SharedPreferences.Editor edit = this.X3.edit();
                edit.putStringSet("pendingSuggestions", this.u3);
                edit.putStringSet("dismissedSuggestions", this.v3);
                edit.commit();
                getNotificationCenter().k(i, new Object[0]);
            }
        }
        TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
        tL_help_dismissSuggestion.suggestion = str;
        if (j == 0) {
            tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_help_dismissSuggestion.peer = h1(j);
        }
        getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ce2(b));
    }

    public final void n5(TLRPC.EmojiStatus emojiStatus, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        m5(0L, emojiStatus, tL_starGiftUnique);
    }

    public final boolean o(ArrayList arrayList) {
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            TL_update.TL_updateFolderPeers tL_updateFolderPeers = (TL_update.TL_updateFolderPeers) arrayList.get(i);
            int size2 = tL_updateFolderPeers.folder_peers.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.TL_folderPeer tL_folderPeer = tL_updateFolderPeers.folder_peers.get(i2);
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(cf3.n(tL_folderPeer.peer));
                if (dialog != null) {
                    int i3 = dialog.folder_id;
                    int i4 = tL_folderPeer.folder_id;
                    if (i3 != i4) {
                        dialog.pinned = false;
                        dialog.pinnedNum = 0;
                        dialog.folder_id = i4;
                        this.h0 = true;
                        z();
                    }
                }
            }
            getMessagesStorage().D1(((TL_update.TL_updateFolderPeers) arrayList.get(i)).folder_peers, null, 0L, 0);
            i++;
            z = true;
        }
        return z;
    }

    public final void o0(int i, boolean[] zArr) {
        ArrayList arrayList;
        if (i == 0) {
            return;
        }
        long j = i | 2305843009213693952L;
        vf6 vf6Var = this.R;
        if (((TLRPC.Dialog) vf6Var.f(j)) instanceof TLRPC.TL_dialogFolder) {
            zArr[0] = false;
            return;
        }
        zArr[0] = true;
        TLRPC.TL_dialogFolder tL_dialogFolder = new TLRPC.TL_dialogFolder();
        tL_dialogFolder.id = j;
        tL_dialogFolder.peer = new TLRPC.TL_peerUser();
        TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
        tL_dialogFolder.folder = tL_folder;
        tL_folder.id = i;
        tL_folder.title = k96.M0(2131754133, null);
        tL_dialogFolder.pinned = true;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList = this.y;
            if (i2 >= arrayList.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i2);
            if (dialog.pinned) {
                i3 = Math.max(dialog.pinnedNum, i3);
            } else if (dialog.id != this.s2) {
                break;
            }
            i2++;
        }
        tL_dialogFolder.pinnedNum = i3 + 1;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
        tL_messages_dialogs.dialogs.add(tL_dialogFolder);
        getMessagesStorage().a1(tL_messages_dialogs, 1);
        vf6Var.k(tL_dialogFolder, j);
        arrayList.add(0, tL_dialogFolder);
    }

    public final TLRPC.InputUser o1(TLRPC.User user) {
        if (user == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (user.id == getUserConfig().e()) {
            return new TLRPC.TL_inputUserSelf();
        }
        if (user.access_hash != 0 || user.fromMessageDialogId == 0 || user.fromMessageId == 0) {
            TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
            tL_inputUser.user_id = user.id;
            tL_inputUser.access_hash = user.access_hash;
            return tL_inputUser;
        }
        TLRPC.TL_inputUserFromMessage tL_inputUserFromMessage = new TLRPC.TL_inputUserFromMessage();
        tL_inputUserFromMessage.user_id = user.id;
        tL_inputUserFromMessage.peer = h1(user.fromMessageDialogId);
        tL_inputUserFromMessage.msg_id = user.fromMessageId;
        return tL_inputUserFromMessage;
    }

    public final boolean o2(long j, long j2) {
        return this.W3.getBoolean("sound_enabled_" + im7.p(j, j2, false), true);
    }

    public final void o3(long j) {
        this.W3.edit().putBoolean("dialog_bar_replied" + j, true).apply();
        gl.c3(new r57(this, j, (byte) 10));
    }

    public final void o4(h19 h19Var, String str) {
        int i;
        h19 h19Var2;
        boolean z;
        boolean z2;
        long j;
        int i2;
        long r;
        String str2;
        vf6 vf6Var = this.O4;
        if (vf6Var != null) {
            long j2 = 0;
            TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) vf6Var.f(0L);
            if (tL_messages_savedReactionsTags == null) {
                vf6 vf6Var2 = this.O4;
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
                vf6Var2.k(tL_messages_savedReactionsTags2, 0L);
                tL_messages_savedReactionsTags = tL_messages_savedReactionsTags2;
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = 1;
                if (i4 >= tL_messages_savedReactionsTags.tags.size()) {
                    h19Var2 = h19Var;
                    z = false;
                    z2 = false;
                    break;
                }
                TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i4);
                h19Var2 = h19Var;
                if (h19Var2.f(tL_savedReactionTag.reaction)) {
                    boolean isEmpty = TextUtils.isEmpty(str);
                    String str3 = tL_savedReactionTag.title;
                    if (isEmpty) {
                        z = str3 != null;
                        tL_savedReactionTag.flags &= -2;
                        tL_savedReactionTag.title = null;
                    } else {
                        z = !TextUtils.equals(str3, str);
                        tL_savedReactionTag.flags |= 1;
                        tL_savedReactionTag.title = str;
                    }
                    z2 = true;
                } else {
                    i4++;
                }
            }
            if (!z2) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = new TLRPC.TL_savedReactionTag();
                tL_savedReactionTag2.reaction = h19Var2.g();
                if (!TextUtils.isEmpty(str)) {
                    tL_savedReactionTag2.title = str;
                }
                tL_savedReactionTag2.count = 1;
                tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                z = true;
            }
            if (z) {
                TLRPC.TL_messages_updateSavedReactionTag tL_messages_updateSavedReactionTag = new TLRPC.TL_messages_updateSavedReactionTag();
                tL_messages_updateSavedReactionTag.reaction = h19Var2.g();
                if (!TextUtils.isEmpty(str)) {
                    tL_messages_updateSavedReactionTag.flags |= 1;
                    tL_messages_updateSavedReactionTag.title = str;
                }
                getConnectionsManager().sendRequest(tL_messages_updateSavedReactionTag, null);
                Collections.sort(tL_messages_savedReactionsTags.tags, new el6(this, (byte) 17));
                long j3 = 0;
                int i5 = 0;
                while (i5 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag3 = tL_messages_savedReactionsTags.tags.get(i5);
                    if (tL_savedReactionTag3.count <= 0) {
                        j = j2;
                    } else {
                        TLRPC.Reaction reaction = tL_savedReactionTag3.reaction;
                        int i6 = -1;
                        j = j2;
                        int i7 = 16;
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String substring = Utilities.a(((TLRPC.TL_reactionEmoji) reaction).emoticon).substring(i3, 16);
                            int length = substring.length();
                            if (length == 0) {
                                throw new NumberFormatException("empty string");
                            }
                            int i8 = (substring.charAt(i3) != '+' || length <= i) ? i3 : i;
                            long j4 = j3;
                            long j5 = j;
                            while (i8 < length) {
                                int digit = Character.digit(substring.charAt(i8), 16);
                                if (digit == i6) {
                                    throw new NumberFormatException(substring.toString());
                                }
                                if (j5 < j || j5 > 1152921504606846975L || (j5 == 1152921504606846975L && digit > 15)) {
                                    throw new NumberFormatException("Too large for unsigned long: ".concat(substring.toString()));
                                }
                                j5 = (j5 << 4) + digit;
                                i8++;
                                i = i;
                                substring = substring;
                                i6 = -1;
                            }
                            i2 = i;
                            r = hq6.r(j4, j5);
                        } else {
                            long j6 = j3;
                            i2 = i;
                            r = reaction instanceof TLRPC.TL_reactionCustomEmoji ? hq6.r(j6, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id) : j6;
                        }
                        if ((tL_savedReactionTag3.flags & i2) != 0 && (str2 = tL_savedReactionTag3.title) != null) {
                            String substring2 = Utilities.a(str2).substring(0, 16);
                            int length2 = substring2.length();
                            if (length2 == 0) {
                                throw new NumberFormatException("empty string");
                            }
                            int i9 = (substring2.charAt(0) != '+' || length2 <= i2) ? 0 : 1;
                            long j7 = j;
                            while (i9 < length2) {
                                int digit2 = Character.digit(substring2.charAt(i9), i7);
                                if (digit2 == -1) {
                                    throw new NumberFormatException(substring2.toString());
                                }
                                if (j7 < j || j7 > 1152921504606846975L || (j7 == 1152921504606846975L && digit2 > 15)) {
                                    throw new NumberFormatException("Too large for unsigned long: ".concat(substring2.toString()));
                                }
                                j7 = (j7 << 4) + digit2;
                                i9++;
                                substring2 = substring2;
                                i7 = 16;
                            }
                            r = hq6.r(r, j7);
                        }
                        j3 = hq6.r(r, tL_savedReactionTag3.count);
                    }
                    i5++;
                    j2 = j;
                    i3 = 0;
                    i = 1;
                }
                tL_messages_savedReactionsTags.hash = j3;
                z4(j2, tL_messages_savedReactionsTags);
                getNotificationCenter().k(kk7.i3, Long.valueOf(j2));
            }
        }
    }

    public final void o5() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        ConcurrentHashMap concurrentHashMap = this.f4;
        Iterator it = concurrentHashMap.keySet().iterator();
        Long l = null;
        while (it.hasNext()) {
            if (((Integer) concurrentHashMap.get(it.next())).intValue() > currentTimeMillis) {
                l = Long.valueOf(Math.min(l == null ? Long.MAX_VALUE : l.longValue(), r6 - currentTimeMillis));
            } else {
                it.remove();
            }
        }
        if (l == null) {
            f67 f67Var = this.e4;
            if (f67Var != null) {
                this.d4 = -1L;
                this.c4 = -1L;
                gl.r(f67Var);
                return;
            }
            return;
        }
        long longValue = l.longValue() + 2;
        long j = currentTimeMillis;
        if (j + longValue != this.d4 + this.c4) {
            gl.r(this.e4);
            this.d4 = j;
            this.c4 = longValue;
            f67 f67Var2 = new f67(this, (byte) 9);
            this.e4 = f67Var2;
            gl.d3(f67Var2, longValue * 1000);
        }
    }

    public final void p(ArrayList arrayList, ArrayList arrayList2, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        this.u3 = arrayList != null ? new HashSet(arrayList) : new HashSet();
        if (arrayList2 != null) {
            this.v3 = new HashSet(arrayList2);
        }
        this.w3 = tL_pendingSuggestion;
        getNotificationCenter().k(kk7.r1, new Object[0]);
        SharedPreferences.Editor edit = this.X3.edit();
        edit.putStringSet("pendingSuggestions", this.u3);
        edit.putStringSet("dismissedSuggestions", this.v3);
        edit.apply();
    }

    public final Runnable p0(long j, int i, ca7 ca7Var) {
        int i2;
        int i3;
        na7 na7Var;
        SharedPreferences sharedPreferences = q1(this.currentAccount).W3;
        if (i == 0) {
            i2 = sharedPreferences.getInt("diditem" + j, 0);
        } else {
            i2 = i;
        }
        int generateClassGuid = ConnectionsManager.generateClassGuid();
        long j2 = cf3.y(j) ? -j : 0L;
        if (j2 != 0 && getMessagesController().K0(Long.valueOf(j2)) == null) {
            boolean[] zArr = new boolean[1];
            Runnable[] runnableArr = new Runnable[1];
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new u57(this, zArr, messagesStorage, j2, runnableArr, j, i2, ca7Var));
            return new v57(zArr, runnableArr, (byte) 0);
        }
        int i4 = gl.O1() ? 30 : 20;
        int i5 = i2;
        m97 m97Var = new m97(this, generateClassGuid, i4, i5, j, ca7Var);
        getNotificationCenter().a(m97Var, kk7.G);
        getNotificationCenter().a(m97Var, kk7.H);
        if (i5 != 0) {
            na7Var = this;
            i3 = generateClassGuid;
            na7Var.b3(j, 0L, true, i4, i5, 0, true, 0, i3, 3, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            i3 = generateClassGuid;
            na7Var = this;
            na7Var.b3(j, 0L, true, i4, i5, 0, true, 0, i3, 2, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
        return new w57(na7Var, i3, (byte) 0);
    }

    public final boolean p2(TLRPC.Dialog dialog) {
        if (dialog != null) {
            if (!dialog.unread_mark) {
                boolean z = dialog instanceof TLRPC.TL_dialogCommunity;
                long j = dialog.id;
                if (z) {
                    c86 O0 = O0(-j);
                    if (O0.a > 0 || O0.b > 0) {
                    }
                } else {
                    TLRPC.Chat K0 = j < 0 ? K0(Long.valueOf(-j)) : null;
                    if (K0 != null && (K0.forum || (K0.monoforum && hc2.A(this.currentAccount, K0, 24)))) {
                        long j2 = K0.id;
                        pub pubVar = this.g4;
                        if (pubVar.l(j2) != null) {
                            pubVar.h(K0.id);
                            int[] iArr = pub.w;
                            if (iArr[0] > 0 || (iArr[1] > 0 && !K0.monoforum)) {
                            }
                        } else if (dialog.unread_count > 0 || (dialog.unread_mentions_count > 0 && !K0.monoforum)) {
                        }
                    } else if (dialog.unread_count > 0 || (dialog.unread_mentions_count > 0 && !hc2.p0(K0))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void p3(long j, int i, long j2) {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new yb7(messagesStorage, i, -j, j2, (byte) 0));
        if (j == 0) {
            TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            tL_messages_readMessageContents.id.add(Integer.valueOf(i));
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new y47(this, (byte) 15));
        } else {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = f1(j);
            tL_channels_readMessageContents.id.add(Integer.valueOf(i));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new ce2((byte) 0));
        }
    }

    public final void p4(int i, long j, ArrayList arrayList) {
        NativeByteBuffer nativeByteBuffer;
        int objectSize;
        TLRPC.TL_messages_reorderPinnedDialogs tL_messages_reorderPinnedDialogs = new TLRPC.TL_messages_reorderPinnedDialogs();
        tL_messages_reorderPinnedDialogs.folder_id = i;
        tL_messages_reorderPinnedDialogs.force = true;
        byte b = 0;
        if (j == 0) {
            ArrayList U0 = U0(i);
            if (U0.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = U0.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) U0.get(i3);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    boolean z = dialog.pinned;
                    long j2 = dialog.id;
                    if (!z) {
                        if (j2 != this.s2) {
                            break;
                        }
                    } else {
                        arrayList2.add(Long.valueOf(j2));
                        arrayList3.add(Integer.valueOf(dialog.pinnedNum));
                        if (!cf3.B(dialog.id)) {
                            TLRPC.InputPeer h1 = h1(dialog.id);
                            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-dialog.id));
                            if (hc2.Y(K0)) {
                                TLRPC.TL_inputDialogPeerCommunity tL_inputDialogPeerCommunity = new TLRPC.TL_inputDialogPeerCommunity();
                                tL_inputDialogPeerCommunity.community = getMessagesController().f1(K0.id);
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeerCommunity);
                                objectSize = tL_inputDialogPeerCommunity.getObjectSize();
                            } else {
                                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                                tL_inputDialogPeer.peer = h1;
                                tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeer);
                                objectSize = tL_inputDialogPeer.getObjectSize();
                            }
                            i2 += objectSize;
                        }
                    }
                }
            }
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new ya7(messagesStorage, arrayList2, arrayList3, b));
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(i2 + 12);
            } catch (Exception e) {
                e = e;
            }
            try {
                nativeByteBuffer.writeInt32(16);
                nativeByteBuffer.writeInt32(i);
                nativeByteBuffer.writeInt32(tL_messages_reorderPinnedDialogs.order.size());
                int size2 = tL_messages_reorderPinnedDialogs.order.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    tL_messages_reorderPinnedDialogs.order.get(i4).serializeToStream(nativeByteBuffer);
                }
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer2 = nativeByteBuffer;
                fa4.g(e, true);
                nativeByteBuffer = nativeByteBuffer2;
                j = getMessagesStorage().y(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new x47(this, j, b));
            }
            j = getMessagesStorage().y(nativeByteBuffer);
        } else {
            tL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new x47(this, j, b));
    }

    public final void p5(long j, TLRPC.EmojiStatus emojiStatus) {
        int g = cf3.g(emojiStatus);
        ConcurrentHashMap concurrentHashMap = this.f4;
        if (g != 0) {
            concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(g));
        } else if (!concurrentHashMap.containsKey(Long.valueOf(j))) {
            return;
        } else {
            concurrentHashMap.remove(Long.valueOf(j));
        }
        o5();
    }

    public final void q(TL_update.TL_updateWebBrowserException tL_updateWebBrowserException) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings == null) {
            return;
        }
        if (tL_updateWebBrowserException.delete) {
            if (fod.a(tL_updateWebBrowserException.flags, 1)) {
                boolean z = tL_updateWebBrowserException.open_external_browser;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.m5;
                if (z) {
                    i0(tL_webBrowserSettings2.external_exceptions, tL_updateWebBrowserException.exception);
                } else {
                    i0(tL_webBrowserSettings2.inapp_exceptions, tL_updateWebBrowserException.exception);
                }
            } else {
                i0(this.m5.external_exceptions, tL_updateWebBrowserException.exception);
                i0(this.m5.inapp_exceptions, tL_updateWebBrowserException.exception);
            }
        } else if (tL_updateWebBrowserException.open_external_browser) {
            ArrayList<TL_account.WebDomainException> arrayList = tL_webBrowserSettings.external_exceptions;
            TL_account.WebDomainException webDomainException = tL_updateWebBrowserException.exception;
            i0(arrayList, webDomainException);
            arrayList.add(webDomainException);
            i0(this.m5.inapp_exceptions, tL_updateWebBrowserException.exception);
        } else {
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings.inapp_exceptions;
            TL_account.WebDomainException webDomainException2 = tL_updateWebBrowserException.exception;
            i0(arrayList2, webDomainException2);
            arrayList2.add(webDomainException2);
            i0(this.m5.external_exceptions, tL_updateWebBrowserException.exception);
        }
        W4(this.m5);
    }

    public final boolean q2(t97 t97Var) {
        if (t97Var == null || (t97Var.g & 64) != 0) {
            return false;
        }
        return this.n4.contains(Integer.valueOf(t97Var.a));
    }

    public final void q3(long j, long j2) {
        if (cf3.B(j) || j == getUserConfig().e()) {
            return;
        }
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new yb7(messagesStorage, j2, j, 0, (byte) 7));
        TLRPC.TL_messages_readMentions tL_messages_readMentions = new TLRPC.TL_messages_readMentions();
        tL_messages_readMentions.peer = h1(j);
        if (j2 != 0) {
            tL_messages_readMentions.top_msg_id = (int) j2;
            tL_messages_readMentions.flags |= 1;
        }
        getConnectionsManager().sendRequest(tL_messages_readMentions, null);
    }

    public final void q4(int i, long j, boolean z) {
        zsa zsaVar = new zsa(j, i);
        HashSet hashSet = this.c5;
        if (hashSet.contains(zsaVar)) {
            return;
        }
        hashSet.add(zsaVar);
        this.d5.add(new Pair(zsaVar, new AtomicBoolean(z)));
        f67 f67Var = this.e5;
        gl.r(f67Var);
        gl.c3(f67Var);
    }

    public final void q5(t97 t97Var) {
        t97 t97Var2;
        TLRPC.EncryptedChat Y0;
        TLRPC.Chat K0;
        ArrayList arrayList = this.y;
        if (t97Var != null) {
            ArrayList arrayList2 = t97Var.k;
            ArrayList arrayList3 = t97Var.l;
            arrayList2.clear();
            arrayList3.clear();
            this.q4 = t97Var;
            try {
                Collections.sort(arrayList, this.r4);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
                boolean z = dialog instanceof TLRPC.TL_dialogCommunity;
                if ((dialog instanceof TLRPC.TL_dialog) || z) {
                    long j = dialog.id;
                    if (!z || (K0 = K0(Long.valueOf(-j))) == null || K0.collapsed_in_dialogs) {
                        if (cf3.B(j) && (Y0 = Y0(Integer.valueOf((int) (4294967295L & j)))) != null) {
                            j = Y0.user_id;
                        }
                        long j2 = j;
                        t97Var2 = t97Var;
                        if (t97Var2.b(getAccountInstance(), j2, dialog, false)) {
                            if (v(dialog)) {
                                arrayList3.add(dialog);
                            }
                            arrayList2.add(dialog);
                        }
                        i++;
                        t97Var = t97Var2;
                    }
                }
                t97Var2 = t97Var;
                i++;
                t97Var = t97Var2;
            }
            try {
                Collections.sort(arrayList, this.s4);
            } catch (Exception unused) {
            }
        }
    }

    public final void r(TL_update.TL_updateWebBrowserSettings tL_updateWebBrowserSettings) {
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.m5;
        if (tL_webBrowserSettings == null) {
            return;
        }
        tL_webBrowserSettings.open_external_browser = tL_updateWebBrowserSettings.open_external_browser;
        tL_webBrowserSettings.display_close_button = tL_updateWebBrowserSettings.display_close_button;
        W4(tL_webBrowserSettings);
    }

    public final int r1() {
        boolean p = getUserConfig().p();
        gr grVar = this.k4;
        return (p ? grVar.h0 : grVar.g0).f();
    }

    public final boolean r2(long j) {
        if (j >= 0) {
            return l7c.w(V1(Long.valueOf(j)));
        }
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        return K0 != null && K0.forum;
    }

    public final void r3(long j, int i, long j2) {
        TLRPC.EncryptedChat Y0;
        if (j2 == 0 || j == 0) {
            return;
        }
        if ((i > 0 || i == Integer.MIN_VALUE) && cf3.B(j) && (Y0 = Y0(Integer.valueOf((int) (j & 4294967295L)))) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(j2));
            getSecretChatHelper().u(Y0, arrayList, null);
            if (i > 0) {
                int currentTime = getConnectionsManager().getCurrentTime();
                ad7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new xb7(messagesStorage, Y0.id, arrayList, 0, currentTime, currentTime));
            }
        }
    }

    public final void r4(long j, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z) {
        if (user == null && chat == null && encryptedChat == null) {
            return;
        }
        SharedPreferences.Editor edit = this.W3.edit();
        edit.putInt("dialog_bar_vis3" + j, 3);
        edit.commit();
        byte b = 0;
        if (cf3.B(j)) {
            if (encryptedChat == null || encryptedChat.access_hash == 0) {
                return;
            }
            TLRPC.TL_messages_reportEncryptedSpam tL_messages_reportEncryptedSpam = new TLRPC.TL_messages_reportEncryptedSpam();
            TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
            tL_messages_reportEncryptedSpam.peer = tL_inputEncryptedChat;
            tL_inputEncryptedChat.chat_id = encryptedChat.id;
            tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
            getConnectionsManager().sendRequest(tL_messages_reportEncryptedSpam, new ce2(b), 2);
            return;
        }
        if (!z) {
            TLRPC.TL_messages_reportSpam tL_messages_reportSpam = new TLRPC.TL_messages_reportSpam();
            if (chat != null) {
                tL_messages_reportSpam.peer = h1(-chat.id);
            } else if (user != null) {
                tL_messages_reportSpam.peer = h1(user.id);
            }
            getConnectionsManager().sendRequest(tL_messages_reportSpam, new ce2(b), 2);
            return;
        }
        TL_account.reportPeer reportpeer = new TL_account.reportPeer();
        if (chat != null) {
            reportpeer.peer = h1(-chat.id);
        } else if (user != null) {
            reportpeer.peer = h1(user.id);
        }
        reportpeer.message = "";
        reportpeer.reason = new TLRPC.TL_inputReportReasonGeoIrrelevant();
        getConnectionsManager().sendRequest(reportpeer, new ce2(b), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00a1, code lost:
    
        if (r15.e1() >= r6.e1()) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0097, code lost:
    
        if (r6.e1() < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
    
        if (r11.date > r6.k.date) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r5(int i, long j, ArrayList arrayList) {
        long j2;
        k27 k27Var;
        boolean z;
        na7 na7Var;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        TLRPC.Chat K0;
        nx8 nx8Var;
        TLRPC.Message message;
        k27 k27Var2;
        TLRPC.ChatFull L0;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Message message2;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        boolean z5 = i == 1;
        Object[] objArr = i == 5;
        Object[] objArr2 = i == 9;
        boolean B = cf3.B(j);
        if (z5 || objArr == true || objArr2 == true) {
            j2 = 0;
            k27Var = null;
            z = false;
        } else {
            if (!ls6.v("dialog_bar_replied", j, this.W3, false)) {
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    k27 k27Var3 = (k27) arrayList.get(i3);
                    if (k27Var3 != null && !k27Var3.r1 && (message2 = k27Var3.k) != null && message2.out && !(message2 instanceof TLRPC.TL_messageService) && message2.peer_id != null && k27.B0(message2) == j) {
                        o3(j);
                        break;
                    }
                    i3++;
                }
            }
            boolean z6 = false;
            z = false;
            long j3 = 0;
            k27 k27Var4 = null;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                k27 k27Var5 = (k27) arrayList.get(i4);
                if (k27Var4 != null) {
                    if (!B) {
                        if (k27Var5.e1() <= k27Var4.e1()) {
                            if (k27Var5.e1() < 0) {
                            }
                            message = k27Var5.k;
                        }
                    }
                }
                message = k27Var5.k;
                long j4 = message.peer_id.channel_id;
                if (j4 != 0) {
                    j3 = j4;
                }
                k27Var4 = k27Var5;
                if ((message.action instanceof TLRPC.TL_messageActionGroupCall) && (L0 = L0(message.peer_id.channel_id)) != null && ((inputGroupCall = L0.call) == null || inputGroupCall.id != k27Var5.k.action.call.id)) {
                    Y2(0, k27Var5.k.peer_id.channel_id, true);
                }
                if (!z6 && !k27Var5.N3()) {
                    z6 = true;
                }
                if (k27Var5.N3() && !k27Var5.n4() && !k27.l3(k27Var5.k)) {
                    if (k27Var5.L3()) {
                        if (k27.V2(k27Var5.k.media.document) ? getMessagesController().k4.K0.f : true) {
                            hq6 mediaDataController = getMediaDataController();
                            TLRPC.Message message3 = k27Var5.k;
                            mediaDataController.c(message3.media.document, message3.date, k27Var5.X1);
                        }
                    } else if (!k27Var5.G2() && (k27Var5.s4() || k27Var5.J2())) {
                        hq6 mediaDataController2 = getMediaDataController();
                        TLRPC.Message message4 = k27Var5.k;
                        k27Var2 = k27Var5;
                        mediaDataController2.d(0, k27Var2, message4.media.document, message4.date, false);
                        if (k27Var2.N3() && k27Var2.p4()) {
                            z = true;
                        }
                    }
                }
                k27Var2 = k27Var5;
                if (k27Var2.N3()) {
                    z = true;
                }
            }
            k27Var = k27Var4;
            j2 = j3;
        }
        getMediaDataController().Y0(arrayList, j, i, 0L, null, 0, null);
        final long j5 = j;
        if (i == 5) {
            ox8 f = ox8.f(this.currentAccount);
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                k27 k27Var6 = (k27) obj;
                if (k27Var6.n4() && f.c(k27.I1(k27Var6.k)) == null && k27.J1(k27Var6.k) != null && f.d(k27.J1(k27Var6.k)) == null) {
                    String J1 = k27.J1(k27Var6.k);
                    ArrayList arrayList2 = f.c;
                    int size2 = arrayList2.size();
                    int i6 = size;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size2) {
                            nx8Var = null;
                            break;
                        }
                        Object obj2 = arrayList2.get(i7);
                        int i8 = i7 + 1;
                        nx8Var = (nx8) obj2;
                        if (TextUtils.equals(J1, nx8Var.b)) {
                            break;
                        }
                        i7 = i8;
                    }
                    if (nx8Var == null) {
                        nx8Var = new nx8();
                        nx8Var.g = true;
                        nx8Var.b = k27.J1(k27Var6.k);
                        nx8Var.a = -1;
                        nx8Var.e = k27Var6;
                        nx8Var.d = k27Var6.e1();
                        f.c.add(nx8Var);
                    }
                    nx8Var.h.add(Integer.valueOf(k27Var6.e1()));
                    gl.c3(new sr8(f, (byte) 6));
                    size = i6;
                }
            }
        }
        if (i == 0) {
            int size3 = arrayList.size();
            ArrayList arrayList3 = null;
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList.get(i9);
                i9++;
                k27 k27Var7 = (k27) obj3;
                if (k27Var7.e1() > 0 && (k27Var7.k.action instanceof TLRPC.TL_messageActionGramTransfer)) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(k27Var7);
                }
            }
            if (arrayList3 != null) {
                getNotificationCenter().k(kk7.l0, Long.valueOf(j5), arrayList3);
            }
        }
        getNotificationCenter().k(1, Long.valueOf(j5), arrayList, Boolean.valueOf(z5), Integer.valueOf(i));
        if (k27Var != null && !z5) {
            TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) this.R.f(j5);
            if (!(k27Var.k.action instanceof TLRPC.TL_messageActionChatMigrateTo)) {
                if (tL_dialog == null) {
                    TLRPC.Chat K02 = K0(Long.valueOf(j2));
                    if ((j2 == 0 || K02 != null) && (K02 == null || (!hc2.r0(K02) && !K02.min))) {
                        if (w01.a) {
                            StringBuilder o = ug8.o(j5, "not found dialog with id ", " dictCount = ");
                            o.append(this.R.m());
                            o.append(" allCount = ");
                            o.append(this.y.size());
                            fa4.b(o.toString());
                        }
                        final TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                        tL_dialog2.id = j5;
                        final int e1 = k27Var.e1();
                        tL_dialog2.top_message = e1;
                        tL_dialog2.last_message_date = k27Var.k.date;
                        tL_dialog2.flags = hc2.T(K02) ? 1 : 0;
                        if (this.b0.get(j5, 0) > 0) {
                            tL_dialog2.unread_count = this.b0.get(j5);
                            this.b0.delete(j5);
                            n2(j5, 0L, null);
                            if (j0()) {
                                z3 = true;
                                this.R.k(tL_dialog2, j5);
                                this.y.add(tL_dialog2);
                                ArrayList arrayList4 = new ArrayList();
                                for (i2 = 0; i2 < arrayList.size(); i2++) {
                                    k27 k27Var8 = (k27) arrayList.get(i2);
                                    if (k27Var8 != null && (k27Var8.e1() == k27Var.e1() || (k27Var8.z2() && k27Var.z2() && k27Var8.d1() == k27Var.d1()))) {
                                        arrayList4.add(k27Var8);
                                        if (k27Var8.k.peer_id.channel_id == 0) {
                                            this.V.put(k27Var8.e1(), k27Var8);
                                            long j6 = k27Var8.k.random_id;
                                            if (j6 != 0) {
                                                this.T.k(k27Var8, j6);
                                            }
                                        }
                                    }
                                }
                                this.S.k(arrayList4, j5);
                                this.i4.c(j5);
                                if (z3) {
                                    Z4(null);
                                    getNotificationCenter().k(kk7.r, new Object[0]);
                                }
                                ad7 messagesStorage = getMessagesStorage();
                                uc7 uc7Var = new uc7() { // from class: h97
                                    @Override // uc7
                                    public final void a(int i10) {
                                        na7 na7Var2 = na7.this;
                                        if (i10 != -1) {
                                            if (i10 != 0) {
                                                tL_dialog2.folder_id = i10;
                                                na7Var2.Z4(null);
                                                na7Var2.getNotificationCenter().k(kk7.r, Boolean.TRUE);
                                                return;
                                            }
                                            return;
                                        }
                                        if (e1 > 0) {
                                            long j7 = j5;
                                            if (cf3.B(j7)) {
                                                return;
                                            }
                                            na7Var2.h3(na7Var2.h1(j7), 0L);
                                        }
                                    }
                                };
                                na7Var = this;
                                j5 = j;
                                messagesStorage.a.c(new dc7(messagesStorage, j, uc7Var, (byte) 1));
                                z2 = true;
                            }
                        }
                        z3 = false;
                        this.R.k(tL_dialog2, j5);
                        this.y.add(tL_dialog2);
                        ArrayList arrayList42 = new ArrayList();
                        while (i2 < arrayList.size()) {
                        }
                        this.S.k(arrayList42, j5);
                        this.i4.c(j5);
                        if (z3) {
                        }
                        ad7 messagesStorage2 = getMessagesStorage();
                        uc7 uc7Var2 = new uc7() { // from class: h97
                            @Override // uc7
                            public final void a(int i10) {
                                na7 na7Var2 = na7.this;
                                if (i10 != -1) {
                                    if (i10 != 0) {
                                        tL_dialog2.folder_id = i10;
                                        na7Var2.Z4(null);
                                        na7Var2.getNotificationCenter().k(kk7.r, Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                }
                                if (e1 > 0) {
                                    long j7 = j5;
                                    if (cf3.B(j7)) {
                                        return;
                                    }
                                    na7Var2.h3(na7Var2.h1(j7), 0L);
                                }
                            }
                        };
                        na7Var = this;
                        j5 = j;
                        messagesStorage2.a.c(new dc7(messagesStorage2, j, uc7Var2, (byte) 1));
                        z2 = true;
                    }
                } else {
                    na7Var = this;
                    if ((tL_dialog.top_message <= 0 || k27Var.e1() <= 0 || k27Var.e1() <= tL_dialog.top_message) && ((tL_dialog.top_message >= 0 || k27Var.e1() >= 0 || k27Var.e1() >= tL_dialog.top_message) && na7Var.S.h(j5) >= 0 && tL_dialog.top_message >= 0 && tL_dialog.last_message_date > k27Var.k.date)) {
                        z2 = false;
                    } else {
                        k27 k27Var9 = (k27) na7Var.V.get(tL_dialog.top_message);
                        if (k27Var9 != null && k27Var9.k.peer_id.channel_id == 0) {
                            na7Var.V.remove(tL_dialog.top_message);
                        }
                        if (k27Var9 != null) {
                            long j7 = k27Var9.k.random_id;
                            if (j7 != 0) {
                                na7Var.T.l(j7);
                            }
                        }
                        tL_dialog.top_message = k27Var.e1();
                        tL_dialog.last_message_date = k27Var.k.date;
                        ArrayList arrayList5 = new ArrayList(1);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            k27 k27Var10 = (k27) arrayList.get(i10);
                            if (k27Var10 != null && (k27Var10.e1() == k27Var.e1() || (k27Var10.z2() && k27Var.z2() && k27Var10.d1() == k27Var.d1()))) {
                                arrayList5.add(k27Var10);
                            }
                        }
                        na7Var.S.k(arrayList5, j5);
                        na7Var.i4.c(j5);
                        if (k27Var.k.peer_id.channel_id == 0) {
                            na7Var.V.put(k27Var.e1(), k27Var);
                            long j8 = k27Var.k.random_id;
                            if (j8 != 0) {
                                na7Var.T.k(k27Var, j8);
                            }
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    na7Var.Z4(null);
                }
                if (z) {
                    na7Var.getMediaDataController().x0(j5);
                }
                return z2;
            }
            if (tL_dialog != null) {
                this.y.remove(tL_dialog);
                this.F.remove(tL_dialog);
                this.G.remove(tL_dialog);
                this.I.remove(tL_dialog);
                this.H.remove(tL_dialog);
                this.J.remove(tL_dialog);
                this.M.remove(tL_dialog);
                int i11 = 0;
                while (true) {
                    t97[] t97VarArr = this.N;
                    if (i11 >= t97VarArr.length) {
                        break;
                    }
                    t97 t97Var = t97VarArr[i11];
                    if (t97Var != null) {
                        t97Var.k.remove(tL_dialog);
                        this.N[i11].l.remove(tL_dialog);
                    }
                    i11++;
                }
                this.p4.remove(tL_dialog);
                this.K.remove(tL_dialog);
                this.L.remove(tL_dialog);
                this.E.remove(tL_dialog);
                this.R.l(tL_dialog.id);
                this.P.remove(Long.valueOf(tL_dialog.id));
                this.Q.remove(Long.valueOf(tL_dialog.id));
                int i12 = this.S1.get(tL_dialog.folder_id, 0);
                if (i12 > 0) {
                    this.S1.put(tL_dialog.folder_id, i12 - 1);
                }
                this.S.l(tL_dialog.id);
                ArrayList arrayList6 = (ArrayList) this.w.get(tL_dialog.folder_id);
                if (arrayList6 != null) {
                    arrayList6.remove(tL_dialog);
                }
                j4(tL_dialog);
                k27 k27Var11 = (k27) this.V.get(tL_dialog.top_message);
                if (k27Var11 != null && k27Var11.k.peer_id.channel_id == 0) {
                    this.V.remove(tL_dialog.top_message);
                }
                if (k27Var11 != null) {
                    long j9 = k27Var11.k.random_id;
                    if (j9 != 0) {
                        this.T.l(j9);
                    }
                }
                z4 = false;
                tL_dialog.top_message = 0;
                getNotificationsController().N(tL_dialog.id);
                getNotificationCenter().k(kk7.O0, new Object[0]);
            } else {
                z4 = false;
            }
            if (!cf3.y(j5)) {
                return z4;
            }
            fc2 e12 = e1(-j5, z4, null);
            if (e12 != null && (K0 = K0(Long.valueOf(k27Var.k.action.channel_id))) != null) {
                e12.c = K0.id;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null && sharedInstance.getAccount() == e12.C.a && sharedInstance.getChat() != null && sharedInstance.getChat().id == (-e12.c)) {
                    sharedInstance.migrateToChat(K0);
                    return false;
                }
            }
        }
        return false;
    }

    public final void s(int i, int i2, long j, String str, boolean z) {
        String str2 = j + "_" + i;
        HashMap hashMap = this.g5;
        if (hashMap.containsKey(str2)) {
            return;
        }
        TLRPC.TL_messages_toggleSuggestedPostApproval tL_messages_toggleSuggestedPostApproval = new TLRPC.TL_messages_toggleSuggestedPostApproval();
        tL_messages_toggleSuggestedPostApproval.reject = z;
        tL_messages_toggleSuggestedPostApproval.peer = getMessagesController().h1(j);
        tL_messages_toggleSuggestedPostApproval.msg_id = i;
        if (i2 > 0) {
            tL_messages_toggleSuggestedPostApproval.schedule_date = i2;
            tL_messages_toggleSuggestedPostApproval.flags |= 1;
        }
        if (z && !TextUtils.isEmpty(str)) {
            tL_messages_toggleSuggestedPostApproval.reject_comment = str;
        }
        hashMap.put(j + "_" + i, Boolean.valueOf(!z));
        getConnectionsManager().sendRequest(tL_messages_toggleSuggestedPostApproval, new jt(this, j, i));
    }

    public final void s0(TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs) {
        TLRPC.InputPeer tL_inputPeerUser;
        int size = tL_messages_peerDialogs.dialogs.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i2);
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                TLRPC.TL_dialogFolder tL_dialogFolder = (TLRPC.TL_dialogFolder) dialog;
                long n = cf3.n(dialog.peer);
                if (tL_dialogFolder.top_message != 0 && n != 0) {
                    int size2 = tL_messages_peerDialogs.messages.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        TLRPC.Message message = tL_messages_peerDialogs.messages.get(i3);
                        if (n == k27.B0(message) && dialog.top_message == message.id) {
                            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                            tL_dialog.peer = dialog.peer;
                            tL_dialog.top_message = dialog.top_message;
                            tL_dialog.folder_id = tL_dialogFolder.folder.id;
                            tL_dialog.flags |= 16;
                            tL_messages_peerDialogs.dialogs.add(tL_dialog);
                            TLRPC.Peer peer = dialog.peer;
                            if (peer instanceof TLRPC.TL_peerChannel) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerUser.channel_id = dialog.peer.channel_id;
                                int size3 = tL_messages_peerDialogs.chats.size();
                                while (true) {
                                    if (i >= size3) {
                                        break;
                                    }
                                    TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i);
                                    if (chat.id == tL_inputPeerUser.channel_id) {
                                        tL_inputPeerUser.access_hash = chat.access_hash;
                                        break;
                                    }
                                    i++;
                                }
                            } else if (!(peer instanceof TLRPC.TL_peerChat)) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                                tL_inputPeerUser.user_id = dialog.peer.user_id;
                                int size4 = tL_messages_peerDialogs.users.size();
                                while (true) {
                                    if (i >= size4) {
                                        break;
                                    }
                                    TLRPC.User user = tL_messages_peerDialogs.users.get(i);
                                    if (user.id == tL_inputPeerUser.user_id) {
                                        tL_inputPeerUser.access_hash = user.access_hash;
                                        break;
                                    }
                                    i++;
                                }
                            } else {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerUser.chat_id = dialog.peer.chat_id;
                            }
                            h3(tL_inputPeerUser, 0L);
                            return;
                        }
                    }
                    return;
                }
                tL_messages_peerDialogs.dialogs.remove(tL_dialogFolder);
            }
        }
    }

    public final TLRPC.Chat s1(long j) {
        TLRPC.Chat K0;
        TLRPC.Chat K02;
        TLRPC.Chat K03 = K0(Long.valueOf(j));
        if (K03 != null && (K02 = K0(Long.valueOf(K03.linked_monoforum_id))) != null) {
            return K02;
        }
        Long l = (Long) this.f.get(Long.valueOf(j));
        if (l == null || (K0 = K0(l)) == null) {
            return null;
        }
        return K0;
    }

    public final boolean s2(k27 k27Var) {
        return k27Var != null && r2(k27.B0(k27Var.k));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s3(long j, int i, TLRPC.InputChannel inputChannel, int i2, long j2, boolean z) {
        long j3;
        NativeByteBuffer nativeByteBuffer;
        if (i == 0 || i2 < 0) {
            return;
        }
        TLRPC.InputChannel f1 = (cf3.y(j) && inputChannel == null) ? f1(j) : inputChannel;
        if (j2 == 0) {
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(20 + (f1 != null ? f1.getObjectSize() : 0));
            } catch (Exception e) {
                e = e;
            }
            try {
                nativeByteBuffer.writeInt32(z ? 23 : 101);
                nativeByteBuffer.writeInt64(j);
                nativeByteBuffer.writeInt32(i);
                nativeByteBuffer.writeInt32(i2);
                if (f1 != null) {
                    f1.serializeToStream(nativeByteBuffer);
                }
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer2 = nativeByteBuffer;
                fa4.g(e, true);
                nativeByteBuffer = nativeByteBuffer2;
                j3 = getMessagesStorage().y(nativeByteBuffer);
                int currentTime = getConnectionsManager().getCurrentTime();
                if (z) {
                }
                if (f1 != null) {
                }
            }
            j3 = getMessagesStorage().y(nativeByteBuffer);
        } else {
            j3 = j2;
        }
        int currentTime2 = getConnectionsManager().getCurrentTime();
        if (z) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new ac7(messagesStorage, currentTime2, currentTime2, i2, i, j));
        }
        if (f1 != null) {
            TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            tL_messages_readMessageContents.id.add(Integer.valueOf(i));
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new x47(this, j3, (byte) 7));
        } else {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = f1;
            tL_channels_readMessageContents.id.add(Integer.valueOf(i));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new x47(this, j3, (byte) 6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s4(boolean z, final int i, final int i2, final int i3, final int i4) {
        TLRPC.messages_Dialogs messages_dialogs;
        TLRPC.messages_Dialogs messages_dialogs2;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        int i5;
        vf6 vf6Var;
        TLRPC.User user;
        na7 na7Var;
        Integer num;
        TLRPC.Chat chat;
        ArrayList arrayList;
        TLRPC.Message message;
        int i6;
        TLRPC.Chat chat2;
        ArrayList arrayList2;
        final na7 na7Var2 = this;
        Integer num2 = 0;
        if (z) {
            if (na7Var2.e2) {
                return;
            }
            na7Var2.getUserConfig().x(1, false);
            na7Var2.e2 = true;
            final byte b = 0;
            na7Var2.getConnectionsManager().sendRequest(new TLRPC.TL_messages_getPinnedDialogs(), new RequestDelegate(na7Var2) { // from class: z67
                public final /* synthetic */ na7 b;

                {
                    this.b = na7Var2;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (b) {
                        case 0:
                            if (tLObject != null) {
                                na7 na7Var3 = this.b;
                                na7Var3.f2 = (TLRPC.TL_messages_peerDialogs) tLObject;
                                for (int i7 = 0; i7 < na7Var3.f2.dialogs.size(); i7++) {
                                    na7Var3.f2.dialogs.get(i7).pinned = true;
                                }
                                na7Var3.s4(false, i, i2, i3, i4);
                                break;
                            }
                            break;
                        default:
                            if (tL_error == null) {
                                na7 na7Var4 = this.b;
                                na7Var4.g2 = (TLRPC.messages_Dialogs) tLObject;
                                na7Var4.s4(false, i, i2, i3, i4);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_messages_getDialogs tL_messages_getDialogs = new TLRPC.TL_messages_getDialogs();
            tL_messages_getDialogs.limit = 100;
            tL_messages_getDialogs.exclude_pinned = true;
            tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
            final byte b2 = 1;
            getConnectionsManager().sendRequest(tL_messages_getDialogs, new RequestDelegate(this) { // from class: z67
                public final /* synthetic */ na7 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (b2) {
                        case 0:
                            if (tLObject != null) {
                                na7 na7Var3 = this.b;
                                na7Var3.f2 = (TLRPC.TL_messages_peerDialogs) tLObject;
                                for (int i7 = 0; i7 < na7Var3.f2.dialogs.size(); i7++) {
                                    na7Var3.f2.dialogs.get(i7).pinned = true;
                                }
                                na7Var3.s4(false, i, i2, i3, i4);
                                break;
                            }
                            break;
                        default:
                            if (tL_error == null) {
                                na7 na7Var4 = this.b;
                                na7Var4.g2 = (TLRPC.messages_Dialogs) tLObject;
                                na7Var4.s4(false, i, i2, i3, i4);
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (na7Var2.f2 == null || (messages_dialogs = na7Var2.g2) == null) {
            return;
        }
        int size = messages_dialogs.messages.size();
        final int size2 = na7Var2.g2.dialogs.size();
        na7Var2.s0(na7Var2.f2);
        na7Var2.g2.dialogs.addAll(na7Var2.f2.dialogs);
        na7Var2.g2.messages.addAll(na7Var2.f2.messages);
        na7Var2.g2.users.addAll(na7Var2.f2.users);
        na7Var2.g2.chats.addAll(na7Var2.f2.chats);
        vf6 vf6Var2 = new vf6();
        final vf6 vf6Var3 = new vf6();
        vf6 vf6Var4 = new vf6();
        vf6 vf6Var5 = new vf6();
        for (int i7 = 0; i7 < na7Var2.g2.users.size(); i7++) {
            TLRPC.User user2 = na7Var2.g2.users.get(i7);
            vf6Var4.k(user2, user2.id);
        }
        for (int i8 = 0; i8 < na7Var2.g2.chats.size(); i8++) {
            TLRPC.Chat chat3 = na7Var2.g2.chats.get(i8);
            vf6Var5.k(chat3, chat3.id);
        }
        int i9 = 0;
        TLRPC.Message message2 = null;
        while (i9 < na7Var2.g2.messages.size()) {
            TLRPC.Message message3 = na7Var2.g2.messages.get(i9);
            if (i9 < size && (message2 == null || message3.date < message2.date)) {
                message2 = message3;
            }
            TLRPC.Peer peer = message3.peer_id;
            int i10 = i9;
            long j = peer.channel_id;
            if (j != 0) {
                TLRPC.Chat chat4 = (TLRPC.Chat) vf6Var5.f(j);
                if (chat4 != null && chat4.left) {
                }
                k27 k27Var = new k27(na7Var2.currentAccount, message3, vf6Var4, vf6Var5, false, true);
                long B0 = k27.B0(k27Var.k);
                arrayList2 = (ArrayList) vf6Var3.f(B0);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                }
                arrayList2.add(k27Var);
                vf6Var3.k(arrayList2, B0);
            } else {
                long j2 = peer.chat_id;
                if (j2 != 0 && (chat2 = (TLRPC.Chat) vf6Var5.f(j2)) != null && chat2.migrated_to != null) {
                }
                k27 k27Var2 = new k27(na7Var2.currentAccount, message3, vf6Var4, vf6Var5, false, true);
                long B02 = k27.B0(k27Var2.k);
                arrayList2 = (ArrayList) vf6Var3.f(B02);
                if (arrayList2 == null) {
                }
                arrayList2.add(k27Var2);
                vf6Var3.k(arrayList2, B02);
            }
            i9 = i10 + 1;
        }
        int i11 = 0;
        while (true) {
            int size3 = na7Var2.g2.dialogs.size();
            messages_dialogs2 = na7Var2.g2;
            concurrentHashMap = na7Var2.Q;
            concurrentHashMap2 = na7Var2.P;
            if (i11 >= size3) {
                break;
            }
            TLRPC.Dialog dialog = messages_dialogs2.dialogs.get(i11);
            cf3.w(dialog);
            long j3 = dialog.id;
            if (j3 != 0) {
                if (dialog.last_message_date == 0 && (arrayList = (ArrayList) vf6Var3.f(j3)) != null) {
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        k27 k27Var3 = (k27) arrayList.get(i13);
                        if (k27Var3 != null && (message = k27Var3.k) != null && (i6 = message.date) > i12) {
                            i12 = i6;
                        }
                    }
                    if (i12 > Integer.MIN_VALUE) {
                        dialog.last_message_date = i12;
                    }
                }
                boolean x = cf3.x(dialog);
                long j4 = dialog.id;
                if (x) {
                    TLRPC.Chat chat5 = (TLRPC.Chat) vf6Var5.f(-j4);
                    if (chat5 == null || !chat5.left) {
                        na7Var = this;
                        num = num2;
                        na7Var.P0.put(-dialog.id, dialog.pts);
                    }
                } else {
                    na7Var = this;
                    num = num2;
                    if (cf3.y(j4) && (chat = (TLRPC.Chat) vf6Var5.f(-dialog.id)) != null && chat.migrated_to != null) {
                        i11++;
                        na7Var2 = na7Var;
                        num2 = num;
                    }
                }
                vf6Var2.k(dialog, dialog.id);
                Integer num3 = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                if (num3 == null) {
                    num3 = num;
                }
                concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num3.intValue(), dialog.read_inbox_max_id)));
                Integer num4 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                if (num4 == null) {
                    num4 = num;
                }
                concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num4.intValue(), dialog.read_outbox_max_id)));
                i11++;
                na7Var2 = na7Var;
                num2 = num;
            }
            na7Var = this;
            num = num2;
            i11++;
            na7Var2 = na7Var;
            num2 = num;
        }
        fl5.S(messages_dialogs2.messages);
        int i14 = 0;
        while (i14 < na7Var2.g2.messages.size()) {
            TLRPC.Message message4 = na7Var2.g2.messages.get(i14);
            TLRPC.MessageAction messageAction = message4.action;
            if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) vf6Var4.f(messageAction.user_id)) != null && user.bot) {
                message4.reply_markup = new TLRPC.TL_replyKeyboardHide();
                message4.flags |= 64;
            }
            TLRPC.MessageAction messageAction2 = message4.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) || (messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                i5 = size;
                vf6Var = vf6Var2;
                message4.unread = false;
                message4.media_unread = false;
            } else {
                ConcurrentHashMap concurrentHashMap3 = message4.out ? concurrentHashMap : concurrentHashMap2;
                Integer num5 = (Integer) concurrentHashMap3.get(Long.valueOf(message4.dialog_id));
                if (num5 == null) {
                    i5 = size;
                    vf6Var = vf6Var2;
                    num5 = Integer.valueOf(na7Var2.getMessagesStorage().S(message4.dialog_id, message4.out));
                    concurrentHashMap3.put(Long.valueOf(message4.dialog_id), num5);
                } else {
                    i5 = size;
                    vf6Var = vf6Var2;
                }
                message4.unread = num5.intValue() < message4.id;
            }
            i14++;
            size = i5;
            vf6Var2 = vf6Var;
        }
        final int i15 = size;
        final vf6 vf6Var6 = vf6Var2;
        final ad7 messagesStorage = na7Var2.getMessagesStorage();
        final TLRPC.messages_Dialogs messages_dialogs3 = na7Var2.g2;
        final TLRPC.Message message5 = message2;
        messagesStorage.a.c(new Runnable(messages_dialogs3, size2, i, i2, i3, i4, message5, i15, vf6Var6, vf6Var3) { // from class: rb7
            public final /* synthetic */ TLRPC.messages_Dialogs b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int h;
            public final /* synthetic */ TLRPC.Message n;
            public final /* synthetic */ vf6 r;
            public final /* synthetic */ vf6 s;

            {
                this.r = vf6Var6;
                this.s = vf6Var3;
            }

            /* JADX WARN: Removed duplicated region for block: B:123:0x03c6  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x03cb  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                SQLiteCursor sQLiteCursor;
                boolean z2;
                SQLiteDatabase sQLiteDatabase;
                long j5;
                long j6;
                long j7;
                long j8;
                long j9;
                long j10;
                ArrayList arrayList3;
                ad7 ad7Var = ad7.this;
                final TLRPC.messages_Dialogs messages_dialogs4 = this.b;
                int i16 = this.c;
                int i17 = this.d;
                final int i18 = this.e;
                final int i19 = this.f;
                final int i20 = this.h;
                TLRPC.Message message6 = this.n;
                vf6 vf6Var7 = this.r;
                final vf6 vf6Var8 = this.s;
                try {
                    ArrayList arrayList4 = new ArrayList();
                    int size4 = messages_dialogs4.dialogs.size() - i16;
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    int i21 = i16;
                    while (i21 < messages_dialogs4.dialogs.size()) {
                        arrayList6.add(Long.valueOf(messages_dialogs4.dialogs.get(i21).id));
                        i21++;
                        vf6Var7 = vf6Var7;
                    }
                    final vf6 vf6Var9 = vf6Var7;
                    int i22 = 0;
                    SQLiteCursor queryFinalized = ad7Var.b.queryFinalized("SELECT did, pinned FROM dialogs WHERE 1", new Object[0]);
                    int i23 = 0;
                    while (queryFinalized.next()) {
                        try {
                            TLRPC.Message message7 = message6;
                            long longValue = queryFinalized.longValue(i22);
                            int i24 = i17;
                            int intValue = queryFinalized.intValue(1);
                            if (!cf3.B(longValue)) {
                                arrayList4.add(Long.valueOf(longValue));
                                if (intValue > 0) {
                                    i23 = Math.max(intValue, i23);
                                    longSparseIntArray.put(longValue, intValue);
                                    arrayList5.add(Long.valueOf(longValue));
                                }
                            }
                            message6 = message7;
                            i17 = i24;
                            i22 = 0;
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = queryFinalized;
                            z2 = true;
                            try {
                                ad7Var.n(e, z2);
                                SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteDatabase = ad7Var.b;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.commitTransaction();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = queryFinalized;
                            sQLiteDatabase = ad7Var.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    int i25 = i17;
                    TLRPC.Message message8 = message6;
                    Collections.sort(arrayList5, new nc4(longSparseIntArray, (byte) 2));
                    while (arrayList5.size() < size4) {
                        arrayList5.add(0, 0L);
                    }
                    queryFinalized.dispose();
                    String str = "(" + TextUtils.join(",", arrayList4) + ")";
                    ad7Var.b.beginTransaction();
                    ad7Var.b.executeFast("DELETE FROM chat_pinned_count WHERE uid IN " + str).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid IN " + str).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM dialogs WHERE did IN " + str).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM messages_v2 WHERE uid IN " + str).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM polls_v2 WHERE 1").stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM widget_state WHERE uid IN " + str).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM widget_heights WHERE uid IN " + str).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM bot_keyboard WHERE uid IN " + str).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid IN " + str).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM media_v4 WHERE uid IN " + str).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM messages_holes WHERE uid IN " + str).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM media_holes_v2 WHERE uid IN " + str).stepThis().dispose();
                    ad7Var.b.commitTransaction();
                    int i26 = 0;
                    while (i26 < size4) {
                        TLRPC.Dialog dialog2 = messages_dialogs4.dialogs.get(i16 + i26);
                        if (!(dialog2 instanceof TLRPC.TL_dialog) || dialog2.pinned) {
                            int indexOf = arrayList5.indexOf(Long.valueOf(dialog2.id));
                            int indexOf2 = arrayList6.indexOf(Long.valueOf(dialog2.id));
                            if (indexOf == -1 || indexOf2 == -1) {
                                arrayList3 = arrayList6;
                            } else if (indexOf == indexOf2) {
                                arrayList3 = arrayList6;
                                int i27 = longSparseIntArray.get(dialog2.id, -1);
                                if (i27 != -1) {
                                    dialog2.pinnedNum = i27;
                                }
                            } else {
                                arrayList3 = arrayList6;
                                int i28 = longSparseIntArray.get(((Long) arrayList5.get(indexOf2)).longValue(), -1);
                                if (i28 != -1) {
                                    dialog2.pinnedNum = i28;
                                }
                            }
                            if (dialog2.pinnedNum == 0) {
                                dialog2.pinnedNum = (size4 - i26) + i23;
                            }
                        } else {
                            arrayList3 = arrayList6;
                        }
                        i26++;
                        arrayList6 = arrayList3;
                    }
                    ad7Var.b1(messages_dialogs4, 0);
                    ad7Var.y1(i25, i18, i19, i20);
                    int m = ad7Var.getUserConfig().m(0) + messages_dialogs4.dialogs.size();
                    int i29 = message8.id;
                    int i30 = message8.date;
                    TLRPC.Peer peer2 = message8.peer_id;
                    long j11 = peer2.channel_id;
                    if (j11 != 0) {
                        int i31 = 0;
                        while (true) {
                            if (i31 >= messages_dialogs4.chats.size()) {
                                j10 = 0;
                                break;
                            }
                            TLRPC.Chat chat6 = messages_dialogs4.chats.get(i31);
                            if (chat6.id == j11) {
                                j10 = chat6.access_hash;
                                break;
                            }
                            i31++;
                        }
                        j7 = j11;
                        j8 = j10;
                        j5 = 0;
                        j6 = 0;
                    } else {
                        long j12 = peer2.chat_id;
                        if (j12 != 0) {
                            int i32 = 0;
                            while (true) {
                                if (i32 >= messages_dialogs4.chats.size()) {
                                    j9 = 0;
                                    break;
                                }
                                TLRPC.Chat chat7 = messages_dialogs4.chats.get(i32);
                                if (chat7.id == j12) {
                                    j9 = chat7.access_hash;
                                    break;
                                }
                                i32++;
                            }
                            j6 = j12;
                            j8 = j9;
                            j5 = 0;
                            j7 = 0;
                        } else {
                            long j13 = peer2.user_id;
                            if (j13 != 0) {
                                for (int i33 = 0; i33 < messages_dialogs4.users.size(); i33++) {
                                    TLRPC.User user3 = messages_dialogs4.users.get(i33);
                                    if (user3.id == j13) {
                                        j5 = j13;
                                        j8 = user3.access_hash;
                                        j6 = 0;
                                        j7 = 0;
                                        break;
                                    }
                                }
                                j5 = j13;
                                j6 = 0;
                            } else {
                                j5 = 0;
                                j6 = 0;
                            }
                            j7 = j6;
                            j8 = j7;
                        }
                    }
                    int i34 = 0;
                    while (i34 < 2) {
                        int i35 = i29;
                        int i36 = i30;
                        int i37 = i34;
                        ad7Var.getUserConfig().w(i37, i35, i36, j5, j6, j7, j8);
                        ad7Var.getUserConfig().y(i37, m);
                        i34 = i37 + 1;
                        i29 = i35;
                        i30 = i36;
                    }
                    ad7Var.getUserConfig().w = false;
                    ad7Var.getUserConfig().u(false);
                    final na7 messagesController = ad7Var.getMessagesController();
                    messagesController.getClass();
                    Utilities.d.c(new Runnable() { // from class: v87
                        @Override // java.lang.Runnable
                        public final void run() {
                            na7 na7Var3 = na7.this;
                            na7Var3.Y1 = false;
                            na7Var3.getMessagesStorage().F1(i18);
                            na7Var3.getMessagesStorage().E1(i19);
                            na7Var3.getMessagesStorage().G1(i20);
                            na7Var3.V0();
                            gl.c3(new jw6(na7Var3, messages_dialogs4, vf6Var9, vf6Var8, (byte) 8));
                        }
                    });
                    SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                    }
                } catch (Exception e2) {
                    e = e2;
                    z2 = true;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
            }
        });
        na7Var2.f2 = null;
        na7Var2.g2 = null;
    }

    public final void s5(boolean z) {
        if (this.G0.isEmpty()) {
            return;
        }
        if (z) {
            for (int i = 0; i < this.G0.size(); i++) {
                ((t97) this.G0.get(i)).p = false;
            }
        } else {
            if (!((t97) this.G0.get(0)).d()) {
                int i2 = 1;
                while (true) {
                    if (i2 >= this.G0.size()) {
                        break;
                    }
                    if (((t97) this.G0.get(i2)).d()) {
                        this.G0.add(0, (t97) this.G0.remove(i2));
                        break;
                    }
                    i2++;
                }
            }
            k3();
        }
        getMessagesStorage().v1();
        getNotificationCenter().k(kk7.N2, new Object[0]);
        M1().x.b();
    }

    public final void t(long j) {
        TLRPC.Chat K0;
        TLRPC.User user = null;
        if (j > 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            if (V1 == null) {
                return;
            }
            user = V1;
            K0 = null;
        } else {
            K0 = K0(Long.valueOf(-j));
            if (K0 == null) {
                return;
            }
        }
        LongSparseIntArray longSparseIntArray = this.x0;
        if (longSparseIntArray.indexOfKey(j) >= 0) {
            return;
        }
        longSparseIntArray.put(j, 1);
        if (user != null) {
            if (user.bot) {
                getMediaDataController().O1(j);
            } else {
                getMediaDataController().Q1(j);
            }
        }
        int i = this.y0;
        if (i >= 0) {
            this.y0 = i + 1;
        }
        byte b = 0;
        getNotificationCenter().k(kk7.f0, new Object[0]);
        TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
        if (user != null) {
            tL_contacts_block.id = l1(user);
        } else {
            tL_contacts_block.id = j1(K0);
        }
        getConnectionsManager().sendRequest(tL_contacts_block, new ce2(b));
    }

    public final boolean t0(t97 t97Var) {
        if (t97Var == null) {
            return false;
        }
        if ((t97Var.g & 64) == 0) {
            return this.n4.contains(Integer.valueOf(t97Var.a));
        }
        return true;
    }

    public final void t1(final long j, final long j2, final int i, final boolean z, final vs2 vs2Var) {
        String str;
        String str2;
        if (z) {
            str = "reaction_mentions";
            str2 = "reaction_mentions_topics";
        } else {
            str = "poll_votes_mentions";
            str2 = "poll_votes_mentions_topics";
        }
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = !z;
        getMessagesStorage().a.c(new Runnable() { // from class: l77
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                boolean z3;
                boolean z4;
                TLRPC.TL_messages_getUnreadPollVotes tL_messages_getUnreadPollVotes;
                SQLiteCursor queryFinalized;
                int i2;
                String str5 = str4;
                String str6 = str3;
                long j3 = j2;
                na7 na7Var = na7.this;
                long j4 = j;
                boolean z5 = z;
                vs2 vs2Var2 = vs2Var;
                try {
                    if (j3 != 0) {
                        SQLiteDatabase sQLiteDatabase = na7Var.getMessagesStorage().b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT message_id FROM " + str5 + " WHERE state = 1 AND dialog_id = " + j4 + " AND topic_id = " + j3 + " LIMIT 1", new Object[0]);
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = na7Var.getMessagesStorage().b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT message_id FROM " + str6 + " WHERE state = 1 AND dialog_id = " + j4 + " LIMIT 1", new Object[0]);
                    }
                    if (queryFinalized.next()) {
                        i2 = queryFinalized.intValue(0);
                        z4 = false;
                    } else {
                        i2 = 0;
                        z4 = true;
                    }
                    try {
                        queryFinalized.dispose();
                        if (i2 != 0) {
                            if (z5) {
                                ad7 messagesStorage = na7Var.getMessagesStorage();
                                messagesStorage.getClass();
                                messagesStorage.H(new yb7(messagesStorage, j4, j3, i2, (byte) 6));
                            }
                            if (z2) {
                                ad7 messagesStorage2 = na7Var.getMessagesStorage();
                                messagesStorage2.getClass();
                                messagesStorage2.H(new yb7(messagesStorage2, j4, j3, i2, (byte) 5));
                            }
                            gl.c3(new f87(vs2Var2, i2, (byte) 0));
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z3 = z4;
                        e.printStackTrace();
                        z4 = z3;
                        if (z4) {
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    z3 = true;
                }
                if (z4) {
                    return;
                }
                int i3 = i;
                if (z5) {
                    TLRPC.TL_messages_getUnreadReactions tL_messages_getUnreadReactions = new TLRPC.TL_messages_getUnreadReactions();
                    tL_messages_getUnreadReactions.peer = na7Var.getMessagesController().h1(j4);
                    tL_messages_getUnreadReactions.limit = 1;
                    tL_messages_getUnreadReactions.add_offset = i3 - 1;
                    tL_messages_getUnreadPollVotes = tL_messages_getUnreadReactions;
                    tL_messages_getUnreadPollVotes = tL_messages_getUnreadReactions;
                    if (na7Var.x2(j4) && j3 != 0) {
                        tL_messages_getUnreadReactions.saved_peer_id = na7Var.h1(j3);
                        tL_messages_getUnreadReactions.flags |= 2;
                        tL_messages_getUnreadPollVotes = tL_messages_getUnreadReactions;
                    }
                } else {
                    TLRPC.TL_messages_getUnreadPollVotes tL_messages_getUnreadPollVotes2 = new TLRPC.TL_messages_getUnreadPollVotes();
                    tL_messages_getUnreadPollVotes2.peer = na7Var.getMessagesController().h1(j4);
                    tL_messages_getUnreadPollVotes2.limit = 1;
                    tL_messages_getUnreadPollVotes2.add_offset = i3 - 1;
                    tL_messages_getUnreadPollVotes = tL_messages_getUnreadPollVotes2;
                }
                na7Var.getConnectionsManager().sendRequestTyped(tL_messages_getUnreadPollVotes, new hc((byte) 0), new ur4((Object) vs2Var2, (byte) 18));
            }
        });
    }

    public final boolean t2() {
        gr grVar = this.k4;
        return (grVar.X2.f() == 0 || grVar.Y2.f() == 0) ? false : true;
    }

    public final void t3(k27 k27Var) {
        if (k27Var.r1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (k27Var.k.mentioned) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new yb7(messagesStorage, k27Var.e1(), -k27Var.k.peer_id.channel_id, k27.B0(k27Var.k), (byte) 0));
        }
        arrayList.add(Integer.valueOf(k27Var.e1()));
        long B0 = k27.B0(k27Var.k);
        byte b = 0;
        getMessagesStorage().P0(0, 0, B0, arrayList);
        getNotificationCenter().k(kk7.B0, Long.valueOf(B0), arrayList);
        int e1 = k27Var.e1();
        TLRPC.Message message = k27Var.k;
        if (e1 < 0) {
            r3(k27.B0(message), TLObject.FLAG_31, k27Var.k.random_id);
            return;
        }
        if (message.peer_id.channel_id == 0) {
            TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            tL_messages_readMessageContents.id.add(Integer.valueOf(k27Var.e1()));
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new y47(this, (byte) 5));
        } else {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            tL_channels_readMessageContents.channel = f1(k27Var.k.peer_id.channel_id);
            tL_channels_readMessageContents.id.add(Integer.valueOf(k27Var.e1()));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new ce2(b));
        }
    }

    public final boolean t4(long j) {
        if (j == 0) {
            return false;
        }
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.o4;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num != null) {
            hashMap.put(Long.valueOf(j), Integer.valueOf(num.intValue() + 1));
            return true;
        }
        if (!p2((TLRPC.Dialog) this.R.f(j))) {
            return false;
        }
        hashMap.put(Long.valueOf(j), 1);
        return true;
    }

    public final void t5() {
        Iterator it;
        Iterator it2;
        String a0;
        String a02;
        String str;
        int i;
        String a03;
        int i2;
        int i3;
        String a04;
        vf6 vf6Var = new vf6();
        vf6 vf6Var2 = new vf6();
        Iterator it3 = this.W.entrySet().iterator();
        while (true) {
            int i4 = 1;
            if (!it3.hasNext()) {
                this.c0 = vf6Var.m();
                gl.c3(new b57(this, vf6Var, vf6Var2, (byte) 1));
                return;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            Long l = (Long) entry.getKey();
            boolean B = cf3.B(l.longValue());
            Iterator it4 = ((ConcurrentHashMap) entry.getValue()).entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it4.next();
                Integer num = (Integer) entry2.getKey();
                ArrayList arrayList = (ArrayList) entry2.getValue();
                vf6 vf6Var3 = new vf6();
                vf6 vf6Var4 = new vf6();
                vf6Var.k(vf6Var3, l.longValue());
                vf6Var2.k(vf6Var4, l.longValue());
                if (l.longValue() > 0 || B || arrayList.size() == i4) {
                    it = it3;
                    it2 = it4;
                    fa7 fa7Var = (fa7) arrayList.get(0);
                    TLRPC.User V1 = V1(Long.valueOf(fa7Var.b));
                    if (V1 == null) {
                        it3 = it;
                        it4 = it2;
                        i4 = 1;
                    } else {
                        boolean z = l.longValue() < 0 && !B;
                        TLRPC.SendMessageAction sendMessageAction = fa7Var.c;
                        if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordAudioAction) {
                            str = z ? k96.a0("IsRecordingAudio", null, 2131748907, X1(V1)) : k96.M0(2131746158, null);
                            i = 1;
                        } else {
                            if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordRoundAction) {
                                str = z ? k96.a0("IsRecordingRound", null, 2131748906, X1(V1)) : k96.M0(2131746157, null);
                            } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadRoundAction) {
                                str = z ? k96.a0("IsSendingVideo", null, 2131748898, X1(V1)) : k96.M0(2131745383, null);
                            } else {
                                if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadAudioAction) {
                                    a03 = z ? k96.a0("IsSendingAudio", null, 2131748902, X1(V1)) : k96.M0(2131745390, null);
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadVideoAction) {
                                    a03 = z ? k96.a0("IsSendingVideo", null, 2131748898, X1(V1)) : k96.M0(2131745383, null);
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageRecordVideoAction) {
                                    a03 = z ? k96.a0("IsRecordingVideo", null, 2131748905, X1(V1)) : k96.M0(2131746154, null);
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadDocumentAction) {
                                    a03 = z ? k96.a0("IsSendingFile", null, 2131748901, X1(V1)) : k96.M0(2131745389, null);
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageUploadPhotoAction) {
                                    a03 = z ? k96.a0("IsSendingPhoto", null, 2131748899, X1(V1)) : k96.M0(2131745386, null);
                                } else if (sendMessageAction instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                    i = 3;
                                    str = z ? k96.a0("IsSendingGame", null, 2131748900, X1(V1)) : k96.M0(2131745388, null);
                                } else {
                                    if (sendMessageAction instanceof TLRPC.TL_sendMessageGeoLocationAction) {
                                        a0 = z ? k96.a0("IsSelectingLocation", null, 2131748903, X1(V1)) : k96.M0(2131745454, null);
                                    } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseContactAction) {
                                        a0 = z ? k96.a0("IsSelectingContact", null, 2131748904, X1(V1)) : k96.M0(2131745455, null);
                                    } else {
                                        if (sendMessageAction instanceof TLRPC.TL_sendMessageEmojiInteractionSeen) {
                                            String str2 = ((TLRPC.TL_sendMessageEmojiInteractionSeen) sendMessageAction).emoticon;
                                            a02 = z ? k96.a0("IsEnjoyngAnimations", null, 2131748908, X1(V1), str2) : k96.a0("EnjoyngAnimations", null, 2131751113, str2);
                                        } else if (sendMessageAction instanceof TLRPC.TL_sendMessageChooseStickerAction) {
                                            a02 = z ? k96.a0("IsChoosingSticker", null, 2131748909, X1(V1)) : k96.M0(2131752094, null);
                                        } else {
                                            a0 = z ? k96.a0("IsTypingGroup", null, 2131748896, X1(V1)) : k96.M0(2131743679, null);
                                        }
                                        str = a02;
                                        i = 5;
                                    }
                                    str = a0;
                                    i = 0;
                                }
                                str = a03;
                                i = 2;
                            }
                            i = 4;
                        }
                        i2 = i;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    int size = arrayList.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 >= size) {
                            it = it3;
                            it2 = it4;
                            i3 = i6;
                            break;
                        }
                        Object obj = arrayList.get(i5);
                        i5++;
                        it = it3;
                        it2 = it4;
                        TLRPC.User V12 = V1(Long.valueOf(((fa7) obj).b));
                        if (V12 != null) {
                            if (sb.length() != 0) {
                                sb.append(", ");
                            }
                            sb.append(X1(V12));
                            i6++;
                        }
                        i3 = i6;
                        if (i3 == 2) {
                            break;
                        }
                        i6 = i3;
                        it3 = it;
                        it4 = it2;
                    }
                    if (sb.length() != 0) {
                        if (i3 == 1) {
                            a04 = k96.a0("IsTypingGroup", null, 2131748896, sb.toString());
                        } else if (arrayList.size() > 2) {
                            try {
                                a04 = String.format(k96.J0(arrayList.size() - 2, "AndMoreTypingGroup"), sb.toString(), Integer.valueOf(arrayList.size() - 2));
                            } catch (Exception unused) {
                                a04 = "LOC_ERR: AndMoreTypingGroup";
                            }
                        } else {
                            a04 = k96.a0("AreTypingGroup", null, 2131754118, sb.toString());
                        }
                        str = a04;
                        i2 = 0;
                    } else {
                        i2 = 0;
                        str = null;
                    }
                }
                if (str != null) {
                    Paint paint = bkb.F0;
                    if (paint == null) {
                        paint = new Paint();
                        paint.setTypeface(gl.o());
                        paint.setTextSize(gl.L(14.0f));
                    }
                    vf6Var3.k(vu3.m(str, paint.getFontMetricsInt(), false, null, 0), num.intValue());
                    vf6Var4.k(Integer.valueOf(i2), num.intValue());
                }
                it3 = it;
                it4 = it2;
                i4 = 1;
            }
        }
    }

    public final c5a u(long j) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatFull L0 = L0(j);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        if (L0 != null && (arrayList = L0.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                long n = cf3.n(communityPeer2.peer);
                TLRPC.Chat K0 = K0(Long.valueOf(-n));
                TLRPC.User V1 = V1(Long.valueOf(n));
                if (K0 != null || V1 != null) {
                    arrayList2.add(new s97(K0, Q0(n), V1, communityPeer2));
                }
            }
        }
        c5a c5aVar = new c5a((byte) 8);
        ArrayList arrayList3 = (ArrayList) c5aVar.d;
        ArrayList arrayList4 = (ArrayList) c5aVar.e;
        ArrayList arrayList5 = (ArrayList) c5aVar.c;
        ArrayList arrayList6 = (ArrayList) c5aVar.b;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            s97 s97Var = (s97) obj;
            int c = no2.c(s97Var.b, s97Var.d, s97Var.c, s97Var.a);
            if (c == 1) {
                arrayList6.add(s97Var);
            } else if (c == 2) {
                arrayList5.add(s97Var);
            } else if (c == 4) {
                arrayList4.add(s97Var);
            } else if (c == 3) {
                arrayList3.add(s97Var);
            }
        }
        c77 c77Var = this.t4;
        Collections.sort(arrayList6, c77Var);
        Collections.sort(arrayList5, c77Var);
        Collections.sort(arrayList3, c77Var);
        Collections.sort(arrayList4, c77Var);
        return c5aVar;
    }

    public final ArrayList u0(ArrayList arrayList) {
        if (!F3()) {
            return arrayList;
        }
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC.TL_messages_stickerSet v0 = q1(this.currentAccount).v0((TLRPC.TL_messages_stickerSet) arrayList.get(i));
            if (v0 == null) {
                arrayList.remove(i);
                i--;
            } else {
                arrayList.set(i, v0);
            }
            i++;
        }
        return arrayList;
    }

    public final boolean u2(long j) {
        ArrayList arrayList = this.I0;
        return !arrayList.isEmpty() && arrayList.contains(Long.valueOf(j));
    }

    public final void u3(long j, long j2) {
        long j3;
        ArrayList l;
        pub pubVar = this.g4;
        byte b = 0;
        if (j2 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
            if (dialog != null) {
                dialog.unread_poll_votes_count = 0;
            }
            if ((r2(j) || y2(j)) && (l = pubVar.l((j3 = -j))) != null) {
                for (int i = 0; i < l.size(); i++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_poll_votes_count = 0;
                    }
                }
                pubVar.y(j3, true);
            }
        } else {
            long j4 = -j;
            TLRPC.TL_forumTopic f = pubVar.f(j4, j2);
            if (f != null && f.unread_poll_votes_count > 0) {
                f.unread_poll_votes_count = 0;
                pubVar.y(j4, true);
            }
        }
        getMessagesStorage().e2(0, j, j2, false);
        TLRPC.TL_messages_readPollVotes tL_messages_readPollVotes = new TLRPC.TL_messages_readPollVotes();
        tL_messages_readPollVotes.peer = h1(j);
        if (j2 != 0 && !x2(j)) {
            tL_messages_readPollVotes.top_msg_id = (int) j2;
            tL_messages_readPollVotes.flags |= 1;
        }
        getConnectionsManager().sendRequest(tL_messages_readPollVotes, new ce2(b));
        kk7.f(this.currentAccount).k(2, Integer.valueOf(TLObject.FLAG_20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u4(k27 k27Var) {
        if (k27Var == null) {
            return;
        }
        ad7 messagesStorage = getMessagesStorage();
        long B0 = k27.B0(k27Var.k);
        int P0 = k27Var.P0();
        messagesStorage.getClass();
        vf6 vf6Var = new vf6(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(P0));
        vf6Var.k(arrayList, B0);
        Object[] objArr = 0;
        messagesStorage.H(new mn6((Object) messagesStorage, (Object) vf6Var, false, (byte) 3));
        TL_ephemeral.TL_deleteMessage tL_deleteMessage = new TL_ephemeral.TL_deleteMessage();
        tL_deleteMessage.peer = h1(k27.B0(k27Var.k));
        TLRPC.Message message = k27Var.k;
        tL_deleteMessage.receiver_id = m1(message != null ? message.ephemeralReceiverBotId : 0L);
        tL_deleteMessage.id = k27Var.P0();
        getConnectionsManager().sendRequestTyped(tL_deleteMessage, new np0(objArr == true ? 1 : 0));
    }

    public final boolean u5(ArrayList arrayList, long j) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.W;
        if (j > 0) {
            if (((ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j))) != null) {
                concurrentHashMap.remove(Long.valueOf(j));
                return true;
            }
        } else if (j < 0) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                k27 k27Var = (k27) obj;
                if (k27Var.p3() && !arrayList2.contains(Long.valueOf(k27Var.k.from_id.user_id))) {
                    arrayList2.add(Long.valueOf(k27Var.k.from_id.user_id));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Long.valueOf(j));
            if (concurrentHashMap2 != null) {
                ArrayList arrayList3 = null;
                z = false;
                for (Map.Entry entry : concurrentHashMap2.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    ArrayList arrayList4 = (ArrayList) entry.getValue();
                    int i2 = 0;
                    while (i2 < arrayList4.size()) {
                        if (arrayList2.contains(Long.valueOf(((fa7) arrayList4.get(i2)).b))) {
                            arrayList4.remove(i2);
                            i2--;
                            if (arrayList4.isEmpty()) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(num);
                            }
                            z = true;
                        }
                        i2++;
                    }
                }
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        concurrentHashMap2.remove(arrayList3.get(i3));
                    }
                    if (concurrentHashMap2.isEmpty()) {
                        concurrentHashMap.remove(Long.valueOf(j));
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean v(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        if (cf3.B(dialog.id)) {
            return true;
        }
        boolean x = cf3.x(dialog);
        long j = dialog.id;
        if (!x) {
            if (j > 0) {
                return !hc2.v0(this.currentAccount, V1(Long.valueOf(j)));
            }
            return true;
        }
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        if (hc2.X(this.currentAccount, K0)) {
            return false;
        }
        return (K0 == null || !K0.megagroup) ? hc2.N(K0) && hc2.w(5, K0) : !K0.gigagroup || hc2.N(K0);
    }

    public final TLRPC.TL_messages_stickerSet v0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (F3() && tL_messages_stickerSet != null) {
            int i = 0;
            for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
                try {
                    if (k27.W3(tL_messages_stickerSet.documents.get(i2))) {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        nativeByteBuffer.position(0);
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = new TLRPC.TL_messages_stickerSet();
                        nativeByteBuffer.readInt32(true);
                        tL_messages_stickerSet2.readParams(nativeByteBuffer, true);
                        nativeByteBuffer.reuse();
                        while (i < tL_messages_stickerSet2.documents.size()) {
                            try {
                                if (k27.W3(tL_messages_stickerSet2.documents.get(i))) {
                                    tL_messages_stickerSet2.documents.remove(i);
                                    tL_messages_stickerSet2.packs.remove(i);
                                    i--;
                                    if (tL_messages_stickerSet2.documents.isEmpty()) {
                                        return null;
                                    }
                                }
                                i++;
                            } catch (Exception e) {
                                e = e;
                                tL_messages_stickerSet = tL_messages_stickerSet2;
                                e.printStackTrace();
                                return tL_messages_stickerSet;
                            }
                        }
                        return tL_messages_stickerSet2;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            return tL_messages_stickerSet;
        }
        return tL_messages_stickerSet;
    }

    public final Long v1() {
        if (this.O3 == null && !this.b5) {
            this.b5 = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getPaidReactionPrivacy(), null);
        }
        return this.O3;
    }

    public final boolean v2(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (chat != null && user != null) {
            if (l7c.D(user)) {
                return !hc2.r0(chat);
            }
            TLRPC.ChatFull L0 = L0(chat.id);
            if (L0 != null && (chatParticipants = L0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.ChatParticipant chatParticipant = arrayList.get(i);
                    if (chatParticipant != null && chatParticipant.user_id == user.id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void v3(long j, long j2) {
        long j3;
        ArrayList l;
        pub pubVar = this.g4;
        byte b = 0;
        if (j2 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.R.f(j);
            if (dialog != null) {
                dialog.unread_reactions_count = 0;
            }
            if ((r2(j) || y2(j)) && (l = pubVar.l((j3 = -j))) != null) {
                for (int i = 0; i < l.size(); i++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i);
                    if (tL_forumTopic != null) {
                        tL_forumTopic.unread_reactions_count = 0;
                    }
                }
                pubVar.y(j3, true);
            }
        } else {
            long j4 = -j;
            TLRPC.TL_forumTopic f = pubVar.f(j4, j2);
            if (f != null && f.unread_reactions_count > 0) {
                f.unread_reactions_count = 0;
                pubVar.y(j4, true);
            }
        }
        getMessagesStorage().f2(0, j, j2, false);
        TLRPC.TL_messages_readReactions tL_messages_readReactions = new TLRPC.TL_messages_readReactions();
        tL_messages_readReactions.peer = h1(j);
        if (j2 != 0) {
            if (x2(j)) {
                tL_messages_readReactions.saved_peer_id = h1(j2);
                tL_messages_readReactions.flags |= 2;
            } else {
                tL_messages_readReactions.top_msg_id = (int) j2;
                tL_messages_readReactions.flags |= 1;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_readReactions, new ce2(b));
        kk7.f(this.currentAccount).k(2, Integer.valueOf(TLObject.FLAG_20));
    }

    public final boolean v4() {
        String str = this.k4.e0.f;
        int hashCode = str.hashCode();
        if (hashCode == -1609594047) {
            return str.equals("enabled");
        }
        if (hashCode == -318452137) {
            if (str.equals("premium")) {
                return getUserConfig().p();
            }
            return false;
        }
        if (hashCode != 270940796) {
            return false;
        }
        str.equals("disabled");
        return false;
    }

    public final void v5(long j, String str, long j2) {
        TLRPC.ChannelParticipant channelParticipant;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        String str2 = str;
        K0(Long.valueOf(j));
        vf6 vf6Var = (vf6) this.q1.f(j);
        if (vf6Var != null && (channelParticipant = (TLRPC.ChannelParticipant) vf6Var.f(j2)) != null) {
            channelParticipant.rank = str2;
        }
        TLRPC.ChatFull L0 = L0(j);
        if (L0 != null && L0.participants != null) {
            for (int i = 0; i < L0.participants.participants.size(); i++) {
                TLRPC.ChatParticipant chatParticipant = L0.participants.participants.get(i);
                chatParticipant.setRank(j2, str2);
                if (chatParticipant.user_id == j2) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        if (channelParticipant2 != null) {
                            channelParticipant2.rank = str2;
                        }
                    } else {
                        chatParticipant.rank = str2;
                    }
                }
            }
        }
        kk7.f(this.currentAccount).k(2, 0);
        kk7.f(this.currentAccount).k(kk7.Y3, Long.valueOf(j), Long.valueOf(j2), str2);
        ad7 Y = ad7.Y(this.currentAccount);
        Y.a.c(new sb7(Y, -j, j2, str2, (byte) 0));
    }

    public final void w(long j, int i, long j2) {
        vf6 vf6Var;
        vf6 vf6Var2;
        if (i >= 0) {
            vf6[] vf6VarArr = this.Z;
            if (i >= vf6VarArr.length || (vf6Var = vf6VarArr[i]) == null || (vf6Var2 = (vf6) vf6Var.f(j)) == null) {
                return;
            }
            vf6Var2.l(j2);
            if (vf6Var2.m() == 0) {
                vf6Var.l(j);
            }
        }
    }

    public final TLRPC.Peer w1(long j) {
        if (j >= 0) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = j;
            return tL_peerUser;
        }
        long j2 = -j;
        if (hc2.T(K0(Long.valueOf(j2)))) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            tL_peerChannel.channel_id = j2;
            return tL_peerChannel;
        }
        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
        tL_peerChat.chat_id = j2;
        return tL_peerChat;
    }

    public final boolean w2(TLRPC.Dialog dialog, long j) {
        long j2;
        HashMap hashMap = this.o4;
        if (hashMap.isEmpty()) {
            return false;
        }
        if (hashMap.containsKey(Long.valueOf(dialog.id)) || hashMap.containsKey(Long.valueOf(j))) {
            return true;
        }
        if (!(dialog instanceof TLRPC.TL_dialogCommunity)) {
            return false;
        }
        for (Long l : hashMap.keySet()) {
            if (l.longValue() > 0) {
                TLRPC.User V1 = V1(l);
                if (V1 != null) {
                    j2 = V1.linked_community_id;
                }
                j2 = 0;
            } else {
                TLRPC.Chat K0 = K0(Long.valueOf(-l.longValue()));
                if (K0 != null) {
                    j2 = K0.linked_community_id;
                }
                j2 = 0;
            }
            if (j2 != 0 && (-j2) == dialog.id) {
                return true;
            }
        }
        return false;
    }

    public final boolean w3(TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChannelParticipant channelParticipant;
        if (tL_chatAdminRights == null) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = null;
        if (chat != null && user != null) {
            if (l7c.D(user)) {
                tL_chatAdminRights2 = chat.admin_rights;
            } else {
                TLRPC.ChatFull L0 = L0(chat.id);
                if (L0 != null && (chatParticipants = L0.participants) != null && (arrayList = chatParticipants.participants) != null) {
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            break;
                        }
                        TLRPC.ChatParticipant chatParticipant = arrayList.get(i);
                        if (chatParticipant == null || chatParticipant.user_id != user.id) {
                            i++;
                        } else if ((chatParticipant instanceof TLRPC.TL_chatChannelParticipant) && (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) != null) {
                            tL_chatAdminRights2 = channelParticipant.admin_rights;
                        }
                    }
                }
            }
        }
        if ((!tL_chatAdminRights.change_info || (tL_chatAdminRights2 != null && tL_chatAdminRights2.change_info)) && ((!tL_chatAdminRights.post_messages || (tL_chatAdminRights2 != null && tL_chatAdminRights2.post_messages)) && ((!tL_chatAdminRights.edit_messages || (tL_chatAdminRights2 != null && tL_chatAdminRights2.edit_messages)) && ((!tL_chatAdminRights.delete_messages || (tL_chatAdminRights2 != null && tL_chatAdminRights2.delete_messages)) && ((!tL_chatAdminRights.ban_users || (tL_chatAdminRights2 != null && tL_chatAdminRights2.ban_users)) && ((!tL_chatAdminRights.invite_users || (tL_chatAdminRights2 != null && tL_chatAdminRights2.invite_users)) && ((!tL_chatAdminRights.pin_messages || (tL_chatAdminRights2 != null && tL_chatAdminRights2.pin_messages)) && ((!tL_chatAdminRights.add_admins || (tL_chatAdminRights2 != null && tL_chatAdminRights2.add_admins)) && ((!tL_chatAdminRights.anonymous || (tL_chatAdminRights2 != null && tL_chatAdminRights2.anonymous)) && ((!tL_chatAdminRights.manage_call || (tL_chatAdminRights2 != null && tL_chatAdminRights2.manage_call)) && ((!tL_chatAdminRights.other || (tL_chatAdminRights2 != null && tL_chatAdminRights2.other)) && (!tL_chatAdminRights.manage_linked_peers || (tL_chatAdminRights2 != null && tL_chatAdminRights2.manage_linked_peers))))))))))))) {
            if (!tL_chatAdminRights.manage_topics) {
                return true;
            }
            if (tL_chatAdminRights2 != null && tL_chatAdminRights2.manage_topics) {
                return true;
            }
        }
        return false;
    }

    public final void w4(Object obj, TLRPC.Document document) {
        if (obj == null || !k27.s3(document, false)) {
            return;
        }
        TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_messages_saveGif.id = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        tL_messages_saveGif.unsave = false;
        getConnectionsManager().sendRequest(tL_messages_saveGif, new k45(this, obj, tL_messages_saveGif, (byte) 19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        throw new java.lang.NumberFormatException("Too large for unsigned long: ".concat(r12.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0143, code lost:
    
        throw new java.lang.NumberFormatException("Too large for unsigned long: ".concat(r4.toString()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w5(long j) {
        long j2;
        int i;
        int i2;
        String str;
        vf6 vf6Var = this.O4;
        if (vf6Var == null) {
            return;
        }
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) vf6Var.f(j);
        long j3 = 0;
        if (tL_messages_savedReactionsTags == null) {
            if (j == 0) {
                return;
            }
            vf6 vf6Var2 = this.O4;
            TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
            vf6Var2.k(tL_messages_savedReactionsTags2, j);
            tL_messages_savedReactionsTags = tL_messages_savedReactionsTags2;
        }
        Collections.sort(tL_messages_savedReactionsTags.tags, new el6(this, (byte) 18));
        int i3 = 0;
        long j4 = 0;
        int i4 = 0;
        loop0: while (true) {
            int i5 = 1;
            if (i4 >= tL_messages_savedReactionsTags.tags.size()) {
                tL_messages_savedReactionsTags.hash = j4;
                z4(j, tL_messages_savedReactionsTags);
                getNotificationCenter().k(kk7.i3, Long.valueOf(j));
                return;
            }
            TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i4);
            if (tL_savedReactionTag.count <= 0) {
                j2 = j3;
                i = i4;
            } else {
                TLRPC.Reaction reaction = tL_savedReactionTag.reaction;
                j2 = j3;
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    String substring = Utilities.a(((TLRPC.TL_reactionEmoji) reaction).emoticon).substring(i3, 16);
                    int length = substring.length();
                    if (length == 0) {
                        throw new NumberFormatException("empty string");
                    }
                    int i6 = (substring.charAt(i3) != '+' || length <= 1) ? i3 : 1;
                    i = i4;
                    long j5 = j2;
                    while (true) {
                        i2 = i5;
                        if (i6 >= length) {
                            j4 = hq6.r(j4, j5);
                            break;
                        }
                        int digit = Character.digit(substring.charAt(i6), 16);
                        if (digit == -1) {
                            throw new NumberFormatException(substring.toString());
                        }
                        if (j5 < j2 || j5 > 1152921504606846975L || (j5 == 1152921504606846975L && digit > 15)) {
                            break loop0;
                        }
                        j5 = (j5 << 4) + digit;
                        i6++;
                        i5 = i2;
                    }
                } else {
                    i = i4;
                    i2 = 1;
                    if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                        j4 = hq6.r(j4, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                    }
                }
                if (j == j2 && (tL_savedReactionTag.flags & 1) != 0 && (str = tL_savedReactionTag.title) != null) {
                    String substring2 = Utilities.a(str).substring(0, 16);
                    int length2 = substring2.length();
                    if (length2 == 0) {
                        throw new NumberFormatException("empty string");
                    }
                    long j6 = j2;
                    for (int i7 = (substring2.charAt(0) != '+' || length2 <= i2) ? 0 : 1; i7 < length2; i7++) {
                        int digit2 = Character.digit(substring2.charAt(i7), 16);
                        if (digit2 == -1) {
                            throw new NumberFormatException(substring2.toString());
                        }
                        if (j6 < j2 || j6 > 1152921504606846975L || (j6 == 1152921504606846975L && digit2 > 15)) {
                            break loop0;
                        }
                        j6 = (j6 << 4) + digit2;
                    }
                    j4 = hq6.r(j4, j6);
                }
                j4 = hq6.r(j4, tL_savedReactionTag.count);
            }
            i4 = i + 1;
            j3 = j2;
            i3 = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(long j, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, iu4 iu4Var) {
        TLRPC.InputChatPhoto inputChatPhoto;
        TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto;
        if (tL_inputChatPhoto != null) {
            inputChatPhoto = tL_inputChatPhoto;
        } else if (inputFile == null && inputFile2 == null && videoSize == null) {
            inputChatPhoto = new TLRPC.TL_inputChatPhotoEmpty();
        } else {
            TLRPC.TL_inputChatUploadedPhoto tL_inputChatUploadedPhoto = new TLRPC.TL_inputChatUploadedPhoto();
            if (inputFile != null) {
                tL_inputChatUploadedPhoto.file = inputFile;
                tL_inputChatUploadedPhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_inputChatUploadedPhoto.video = inputFile2;
                int i = tL_inputChatUploadedPhoto.flags;
                tL_inputChatUploadedPhoto.video_start_ts = d;
                tL_inputChatUploadedPhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_inputChatUploadedPhoto.video_emoji_markup = videoSize;
                tL_inputChatUploadedPhoto.flags |= 8;
            }
            inputChatPhoto = tL_inputChatUploadedPhoto;
        }
        if (hc2.S(this.currentAccount, j)) {
            TLRPC.TL_channels_editPhoto tL_channels_editPhoto = new TLRPC.TL_channels_editPhoto();
            tL_channels_editPhoto.channel = f1(j);
            tL_channels_editPhoto.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_channels_editPhoto;
        } else {
            TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto2 = new TLRPC.TL_messages_editChatPhoto();
            tL_messages_editChatPhoto2.chat_id = j;
            tL_messages_editChatPhoto2.photo = inputChatPhoto;
            tL_messages_editChatPhoto = tL_messages_editChatPhoto2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatPhoto, new p77(this, tL_inputChatPhoto, fileLocation, fileLocation2, str, j, iu4Var), 64);
    }

    public final String x1(long j) {
        return y1(j, false);
    }

    public final boolean x2(long j) {
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        return K0 != null && K0.monoforum;
    }

    public final void x4(long j, TLRPC.PeerSettings peerSettings) {
        if (peerSettings == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.W3;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (peerSettings.business_bot_id != 0) {
            edit.putLong(ls6.n(j, "dialog_botid"), peerSettings.business_bot_id);
            edit.putString("dialog_boturl" + j, peerSettings.business_bot_manage_url);
            edit.putInt("dialog_botflags" + j, (peerSettings.business_bot_paused ? 1 : 0) + (peerSettings.business_bot_can_reply ? 2 : 0));
        } else {
            edit.remove("dialog_botid" + j).remove("dialog_boturl" + j).remove("dialog_botflags" + j);
        }
        edit.putLong(ls6.n(j, "dialog_bar_paying_"), peerSettings.charge_paid_message_stars);
        int i = sharedPreferences.getInt("dialog_bar_vis3" + j, 0);
        int i2 = kk7.P0;
        if (i == 3) {
            edit.apply();
            getNotificationCenter().k(i2, Long.valueOf(j));
            return;
        }
        boolean z = peerSettings.flags == 0;
        if (w01.a) {
            StringBuilder o = ug8.o(j, "peer settings loaded for ", " add = ");
            o.append(peerSettings.add_contact);
            o.append(" block = ");
            o.append(peerSettings.block_contact);
            o.append(" spam = ");
            o.append(peerSettings.report_spam);
            o.append(" share = ");
            o.append(peerSettings.share_contact);
            o.append(" geo = ");
            o.append(peerSettings.report_geo);
            o.append(" hide = ");
            o.append(z);
            o.append(" distance = ");
            o.append(peerSettings.geo_distance);
            o.append(" invite = ");
            o.append(peerSettings.invite_members);
            fa4.b(o.toString());
        }
        edit.putInt(ls6.n(j, "dialog_bar_vis3"), z ? 1 : 2);
        edit.putBoolean("dialog_bar_share" + j, peerSettings.share_contact);
        edit.putBoolean("dialog_bar_report" + j, peerSettings.report_spam);
        edit.putBoolean("dialog_bar_add" + j, peerSettings.add_contact);
        edit.putBoolean("dialog_bar_block" + j, peerSettings.block_contact);
        edit.putBoolean("dialog_bar_exception" + j, peerSettings.need_contacts_exception);
        edit.putBoolean("dialog_bar_location" + j, peerSettings.report_geo);
        edit.putBoolean("dialog_bar_archived" + j, peerSettings.autoarchived);
        edit.putBoolean("dialog_bar_invite" + j, peerSettings.invite_members);
        edit.putString("dialog_bar_chat_with_admin_title" + j, peerSettings.request_chat_title);
        edit.putBoolean("dialog_bar_chat_with_channel" + j, peerSettings.request_chat_broadcast);
        edit.putInt("dialog_bar_chat_with_date" + j, peerSettings.request_chat_date);
        if (sharedPreferences.getInt("dialog_bar_distance" + j, -1) != -2) {
            if ((peerSettings.flags & 64) != 0) {
                edit.putInt(ls6.n(j, "dialog_bar_distance"), peerSettings.geo_distance);
            } else {
                edit.remove("dialog_bar_distance" + j);
            }
        }
        if (j == getUserConfig().e()) {
            peerSettings.business_bot_id = 1271266957L;
            peerSettings.business_bot_manage_url = "https://telegram.org/";
        }
        edit.apply();
        this.g1.k(peerSettings, j);
        getNotificationCenter().k(i2, Long.valueOf(j));
    }

    public final void x5(HashSet hashSet) {
        w5(0L);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            w5(((Long) it.next()).longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(long j, String str, zm2 zm2Var) {
        TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle;
        if (hc2.S(this.currentAccount, j)) {
            TLRPC.TL_channels_editTitle tL_channels_editTitle = new TLRPC.TL_channels_editTitle();
            tL_channels_editTitle.channel = f1(j);
            tL_channels_editTitle.title = str;
            tL_messages_editChatTitle = tL_channels_editTitle;
        } else {
            TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle2 = new TLRPC.TL_messages_editChatTitle();
            tL_messages_editChatTitle2.chat_id = j;
            tL_messages_editChatTitle2.title = str;
            tL_messages_editChatTitle = tL_messages_editChatTitle2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatTitle, new rv3(this, zm2Var, (byte) 29), 64);
    }

    public final void y0() {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        int i = messagesStorage.w;
        ad7 messagesStorage2 = getMessagesStorage();
        messagesStorage2.G();
        int i2 = messagesStorage2.r;
        ad7 messagesStorage3 = getMessagesStorage();
        messagesStorage3.G();
        int i3 = messagesStorage3.n;
        ad7 messagesStorage4 = getMessagesStorage();
        messagesStorage4.G();
        s4(true, i, i2, i3, messagesStorage4.s);
        im7 notificationsController = getNotificationsController();
        notificationsController.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        im7.l0.c(new wl7(notificationsController, (byte) 9));
    }

    public final String y1(long j, boolean z) {
        if (j >= 0) {
            TLRPC.User V1 = V1(Long.valueOf(j));
            return z ? gl.C2(gl.A2(l7c.k(V1, true))) : gl.C2(gl.A2(l7c.r(V1)));
        }
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        return gl.C2(gl.A2(K0 == null ? "" : K0.title));
    }

    public final boolean y2(long j) {
        TLRPC.Chat K0 = K0(Long.valueOf(-j));
        return hc2.p0(K0) && hc2.A(this.currentAccount, K0, 24);
    }

    public final void y3(t97 t97Var) {
        for (int i = 0; i < 2; i++) {
            if (this.N[i] == t97Var) {
                Z4(null);
                getNotificationCenter().k(kk7.r, Boolean.TRUE);
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean y4(String str, SparseIntArray sparseIntArray, SharedPreferences.Editor editor, ArrayList arrayList) {
        char c;
        StringBuilder sb = new StringBuilder();
        sparseIntArray.clear();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= arrayList.size()) {
                int length = sb.length();
                SharedPreferences sharedPreferences = this.X3;
                if (length <= 0) {
                    editor.remove(str);
                    return sharedPreferences.getString(str, null) != null;
                }
                String sb2 = sb.toString();
                boolean z = !sb2.equals(sharedPreferences.getString(str, null));
                editor.putString(str, sb2);
                return z;
            }
            String str2 = arrayList.get(i) instanceof TLRPC.TL_jsonString ? ((TLRPC.TL_jsonString) arrayList.get(i)).value : null;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -2145993328:
                        if (str2.equals("animated_userpics")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -2080028929:
                        if (str2.equals("infinite_reactions")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -2022719725:
                        if (str2.equals("stories__caption")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1975141450:
                        if (str2.equals("away_message")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1953490480:
                        if (str2.equals("business_hours")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1952597715:
                        if (str2.equals("business_intro")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1949982086:
                        if (str2.equals("business_links")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1924078036:
                        if (str2.equals("stories__quality")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1919626711:
                        if (str2.equals("stories__save_stories_to_gallery")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1884266413:
                        if (str2.equals("stories")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1833928446:
                        if (str2.equals("effects")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1777612460:
                        if (str2.equals("business_location")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1761847571:
                        if (str2.equals("peer_colors")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1755514268:
                        if (str2.equals("voice_to_text")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1529105743:
                        if (str2.equals("wallpapers")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1516580016:
                        if (str2.equals("message_privacy")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1425144150:
                        if (str2.equals("animated_emoji")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1225497630:
                        if (str2.equals("translations")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1146830912:
                        if (str2.equals("business")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1040323278:
                        if (str2.equals("no_ads")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1023650261:
                        if (str2.equals("more_upload")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case -969043445:
                        if (str2.equals("emoji_status")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -730864243:
                        if (str2.equals("profile_badge")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case -448825858:
                        if (str2.equals("faster_download")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -294265343:
                        if (str2.equals("greeting_message")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -165039170:
                        if (str2.equals("premium_stickers")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case -96210874:
                        if (str2.equals("double_limits")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3565638:
                        if (str2.equals("todo")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 98352451:
                        if (str2.equals("gifts")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 110781770:
                        if (str2.equals("folder_tags")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 234735554:
                        if (str2.equals("stories__expiration_durations")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case 388416338:
                        if (str2.equals("stories__stealth_mode")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case 480338102:
                        if (str2.equals("quick_replies")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case 622623867:
                        if (str2.equals("ai_compose")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case 629542059:
                        if (str2.equals("business_bots")) {
                            c = '\"';
                            break;
                        }
                        c = 65535;
                        break;
                    case 705083174:
                        if (str2.equals("stories__priority_order")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1054743185:
                        if (str2.equals("pm_noforwards")) {
                            c = '$';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1080006662:
                        if (str2.equals("stories__links_and_formatting")) {
                            c = '%';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1219849581:
                        if (str2.equals("advanced_chat_management")) {
                            c = '&';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1438966047:
                        if (str2.equals("stories__permanent_views_history")) {
                            c = '\'';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1488814760:
                        if (str2.equals("rich_formatting")) {
                            c = '(';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1537309393:
                        if (str2.equals("saved_tags")) {
                            c = ')';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1832801148:
                        if (str2.equals("app_icons")) {
                            c = '*';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2013274756:
                        if (str2.equals("last_seen")) {
                            c = '+';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i2 = 7;
                        break;
                    case 1:
                        i2 = 4;
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 33;
                        break;
                    case 4:
                        i2 = 30;
                        break;
                    case 5:
                        i2 = 36;
                        break;
                    case 6:
                        i2 = 37;
                        break;
                    case 7:
                        i2 = 25;
                        break;
                    case '\b':
                        i2 = 18;
                        break;
                    case '\t':
                        i2 = 14;
                        break;
                    case '\n':
                        i2 = 38;
                        break;
                    case 11:
                        i2 = 29;
                        break;
                    case '\f':
                        i2 = 23;
                        break;
                    case '\r':
                        i2 = 8;
                        break;
                    case 14:
                        i2 = 22;
                        break;
                    case 15:
                        i2 = 27;
                        break;
                    case 16:
                        i2 = 11;
                        break;
                    case 17:
                        i2 = 13;
                        break;
                    case 18:
                        i2 = 28;
                        break;
                    case 19:
                        i2 = 3;
                        break;
                    case 20:
                        break;
                    case 21:
                        i2 = 12;
                        break;
                    case 22:
                        i2 = 6;
                        break;
                    case 23:
                        i2 = 2;
                        break;
                    case 24:
                        i2 = 32;
                        break;
                    case 25:
                        i2 = 5;
                        break;
                    case 26:
                        i2 = 0;
                        break;
                    case 27:
                        i2 = 39;
                        break;
                    case 28:
                        i2 = 40;
                        break;
                    case 29:
                        i2 = 35;
                        break;
                    case kk7.S /* 30 */:
                        i2 = 17;
                        break;
                    case 31:
                        i2 = 15;
                        break;
                    case ' ':
                        i2 = 31;
                        break;
                    case '!':
                        i2 = 42;
                        break;
                    case '\"':
                        i2 = 34;
                        break;
                    case '#':
                        i2 = 20;
                        break;
                    case '$':
                        i2 = 41;
                        break;
                    case '%':
                        i2 = 19;
                        break;
                    case '&':
                        i2 = 9;
                        break;
                    case '\'':
                        i2 = 16;
                        break;
                    case '(':
                        i2 = 43;
                        break;
                    case ')':
                        i2 = 24;
                        break;
                    case '*':
                        i2 = 10;
                        break;
                    case '+':
                        i2 = 26;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
                if (i2 >= 0) {
                    sparseIntArray.put(i2, i);
                    if (sb.length() > 0) {
                        sb.append('_');
                    }
                    sb.append(i2);
                }
            }
            i++;
        }
    }

    public final boolean y5(long j, h19 h19Var, boolean z) {
        if (this.O4 == null) {
            return false;
        }
        int i = 0;
        boolean z2 = false;
        while (i < 2) {
            long j2 = i == 0 ? 0L : j;
            if (i != 1 || j2 != 0) {
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.O4.f(j2);
                if (tL_messages_savedReactionsTags == null) {
                    if (j2 != 0) {
                        vf6 vf6Var = this.O4;
                        tL_messages_savedReactionsTags = new TLRPC.TL_messages_savedReactionsTags();
                        vf6Var.k(tL_messages_savedReactionsTags, j2);
                    }
                }
                int i2 = 0;
                boolean z3 = false;
                while (i2 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i2);
                    if (h19Var.f(tL_savedReactionTag.reaction)) {
                        int i3 = tL_savedReactionTag.count;
                        int max = Math.max(0, (z ? 1 : -1) + i3);
                        tL_savedReactionTag.count = max;
                        if (max <= 0) {
                            tL_messages_savedReactionsTags.tags.remove(i2);
                            i2--;
                        } else if (max == i3) {
                            z3 = true;
                        }
                        z2 = true;
                        z3 = true;
                    }
                    i2++;
                }
                if (!z3 && z) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag2 = new TLRPC.TL_savedReactionTag();
                    tL_savedReactionTag2.reaction = h19Var.g();
                    tL_savedReactionTag2.count = 1;
                    tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                    z2 = true;
                }
            }
            i++;
        }
        return z2;
    }

    public final void z() {
        if (this.h0 || !M1().h.isEmpty()) {
            boolean[] zArr = {false};
            o0(1, zArr);
            if (zArr[0]) {
                Z4(null);
                getNotificationCenter().k(kk7.r, new Object[0]);
            }
        } else {
            l4(1);
        }
        getNotificationCenter().k(2, 0);
    }

    public final void z0(long j, boolean z) {
        TLRPC.Chat K0 = K0(Long.valueOf(j));
        if (K0 == null || !hc2.S(this.currentAccount, j)) {
            return;
        }
        if ((hc2.r0(K0) && !z) || K0.creator || hc2.p0(K0)) {
            return;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.flags = 256;
        int i = getUserConfig().i();
        tL_messageService.id = i;
        tL_messageService.local_id = i;
        if (!(K0 instanceof TLRPC.TL_channel) || z) {
            tL_messageService.date = getConnectionsManager().getCurrentTime();
        } else {
            tL_messageService.date = K0.date;
        }
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_messageService.peer_id = tL_peerChannel;
        tL_peerChannel.channel_id = j;
        tL_messageService.dialog_id = -j;
        tL_messageService.post = true;
        TLRPC.TL_messageActionChatAddUser tL_messageActionChatAddUser = new TLRPC.TL_messageActionChatAddUser();
        tL_messageService.action = tL_messageActionChatAddUser;
        tL_messageActionChatAddUser.users.add(Long.valueOf(getUserConfig().e()));
        getUserConfig().u(false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(tL_messageService);
        arrayList.add(new k27(this.currentAccount, tL_messageService, true, false));
        getMessagesStorage().g1(arrayList2, true, true, false, 0, false, 0, 0L);
        gl.c3(new m57(this, j, arrayList, (byte) 4));
    }

    public final TLRPC.PeerSettings z1(long j) {
        TLRPC.PeerSettings peerSettings;
        TLRPC.UserFull W1 = W1(j);
        return (W1 == null || (peerSettings = W1.settings) == null) ? (TLRPC.PeerSettings) this.g1.f(j) : peerSettings;
    }

    public final boolean z2(long j) {
        return j > 0 ? K2(W1(j)) : k2(K0(Long.valueOf(-j)));
    }

    public final void z3(d dVar, TLRPC.User user, String str, int i, c01 c01Var, boolean z, boolean z2) {
        if (user == null) {
            return;
        }
        boolean[] zArr = {false};
        if (c01Var != null) {
            c01Var.b = new il1(zArr, (byte) 6);
            c01Var.d();
        }
        TL_bots.BotInfo[] botInfoArr = {r1};
        d77 d77Var = new d77(this, dVar, c01Var, zArr, user, str, z, z2, botInfoArr);
        hq6 mediaDataController = getMediaDataController();
        long j = user.id;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) mediaDataController.y1.get(j + "_" + j);
        if (user.bot_has_main_app) {
            d77Var.run();
        } else {
            if (botInfo != null) {
                d77Var.run();
                return;
            }
            hq6 mediaDataController2 = getMediaDataController();
            long j2 = user.id;
            mediaDataController2.I0(j2, j2, false, i, new e77(this, zArr, botInfoArr, user, i, d77Var));
        }
    }

    public final void z4(long j, TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags) {
        getMessagesStorage().a.c(new go6((Object) this, j, (Object) tL_messages_savedReactionsTags, (byte) 7));
    }

    public final void z5(TLObject tLObject, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        concurrentHashMap.remove(str);
        if (z) {
            concurrentHashMap.put(str.toLowerCase(), tLObject);
        }
    }
}
