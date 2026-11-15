package di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.h00;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.r80;
import org.telegram.ui.uv0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u8 {
    public static volatile u8[][] S = (u8[][]) Array.newInstance((Class<?>) u8.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public s8 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public p8 N;
    public final int a;
    public final boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public long g;
    public boolean h;
    public boolean i;
    public ArrayList j;
    public boolean k;
    public boolean l;
    public ArrayList m;
    public boolean n;
    public boolean o;
    public ArrayList p;
    public String w;
    public boolean x;
    public boolean y;
    public TL_stars.StarsAmount f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] r = new boolean[3];
    public final String[] s = new String[3];
    public final boolean[] t = new boolean[3];
    public final boolean[] u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList z = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final LongSparseArray K = new LongSparseArray();
    public final LongSparseArray L = new LongSparseArray();
    public final ConcurrentHashMap M = new ConcurrentHashMap();
    public final ConcurrentHashMap O = new ConcurrentHashMap();
    public final ConcurrentHashMap P = new ConcurrentHashMap();
    public final Set Q = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentHashMap R = new ConcurrentHashMap();

    static {
        for (int i7 = 0; i7 < 2; i7++) {
            for (int i10 = 0; i10 < 4; i10++) {
                T[i7][i10] = new Object();
            }
        }
    }

    public u8(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
    }

    public static org.telegram.ui.ActionBar.e6 I() {
        org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
        if (T2 != null) {
            return T2.getResourceProvider();
        }
        return null;
    }

    public static u8 L(int i7) {
        return y(i7, true);
    }

    public static boolean T(int i7, cg.a aVar) {
        return aVar == null || x(i7, aVar.a).s().b >= aVar.b;
    }

    public static void a(u8 u8Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = u8Var.I;
        ArrayList arrayList2 = u8Var.J;
        int i7 = u8Var.a;
        ArrayList arrayList3 = u8Var.H;
        u8Var.C = false;
        u8Var.D = true;
        if (!(starGifts instanceof TL_stars.TL_starGifts)) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i10 = u8Var.F;
                long currentTimeMillis = System.currentTimeMillis();
                u8Var.G = currentTimeMillis;
                vr a02 = vr.a0(i7);
                a02.a.c(new w7(i10, 0, currentTimeMillis, a02, arrayList3));
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        np.s1(i7).Y3(tL_starGifts.users, false);
        np.s1(i7).S3(tL_starGifts.chats, false);
        vr.a0(i7).m1(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList3.clear();
        arrayList3.addAll(tL_starGifts.gifts);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new bg.d(4)), new bg.d(5)));
        arrayList.clear();
        arrayList.addAll(arrayList3);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(6)));
        u8Var.F = tL_starGifts.hash;
        u8Var.G = System.currentTimeMillis();
        ns.f(i7).k(ns.F3, new Object[0]);
        ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
        int i11 = u8Var.F;
        long j3 = u8Var.G;
        vr a03 = vr.a0(i7);
        a03.a.c(new w7(i11, 0, j3, a03, arrayList4));
    }

    public static /* synthetic */ void b(u8 u8Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i7 = u8Var.a;
        np.s1(i7).Y3(arrayList2, true);
        np.s1(i7).S3(arrayList3, true);
        u8Var.E = true;
        ArrayList arrayList4 = u8Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = u8Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new bg.d(1)), new bg.d(2)));
        ArrayList arrayList6 = u8Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new bg.d(3)));
        u8Var.F = num.intValue();
        u8Var.G = l10.longValue();
        u8Var.C = false;
        ns.f(i7).k(ns.F3, new Object[0]);
        u8Var.U();
    }

    public static void c0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = hd.M0(2131745060, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = hd.M0(2131745061, null);
        i5.c.C(null, 2131747831, alertDialog$Builder, null);
    }

    public static void e(String str) {
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        ((Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.cc.X() : org.telegram.ui.Components.cc.a0(Q)).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, str)).j();
    }

    public static boolean k(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i7 = savedStarGift.flags;
        if ((i7 & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            return ((i7 & 8) == 0 || (savedStarGift2.flags & 8) == 0 || savedStarGift.msg_id != savedStarGift2.msg_id) ? false : true;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute l(ArrayList arrayList, Class cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                return (TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute);
            }
        }
        return null;
    }

    public static ArrayList m(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                arrayList2.add((TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute));
            }
        }
        return arrayList2;
    }

    public static long o(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            return ((TLRPC.TL_messages_sendMultiMedia) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return ((TLRPC.TL_messages_sendInlineBotResult) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            return ((TLRPC.TL_messages_forwardMessages) tLObject).allow_paid_stars / r4.id.size();
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        }
        return 0L;
    }

    public static Context t(org.telegram.ui.ActionBar.e2 e2Var) {
        if (e2Var != null && e2Var.getContext() != null) {
            return e2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.H1;
        }
        if (org.telegram.messenger.t0.b != null) {
            return org.telegram.messenger.t0.b;
        }
        return null;
    }

    public static u8 w(int i7) {
        return y(i7, false);
    }

    public static u8 x(int i7, cg.b bVar) {
        return y(i7, bVar == cg.b.b);
    }

    public static u8 y(int i7, boolean z10) {
        u8 u8Var;
        u8 u8Var2 = S[z10 ? 1 : 0][i7];
        if (u8Var2 != null) {
            return u8Var2;
        }
        synchronized (T[z10 ? 1 : 0][i7]) {
            try {
                u8Var = S[z10 ? 1 : 0][i7];
                if (u8Var == null) {
                    u8[] u8VarArr = S[z10 ? 1 : 0];
                    u8 u8Var3 = new u8(i7, z10);
                    u8VarArr[i7] = u8Var3;
                    u8Var = u8Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u8Var;
    }

    public final long A(n8 n8Var, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l10;
        s8 s8Var = this.B;
        if (s8Var != null && s8Var.a.equals(n8Var) && (l10 = this.B.n) != null) {
            return l10.longValue();
        }
        Long l11 = null;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                TLRPC.MessageReactor messageReactor = arrayList.get(i7);
                i7++;
                TLRPC.MessageReactor messageReactor2 = messageReactor;
                if (messageReactor2 != null && messageReactor2.my) {
                    if (messageReactor2.anonymous) {
                        l11 = 2666000L;
                        break;
                    }
                    TLRPC.Peer peer = messageReactor2.peer_id;
                    if (peer != null) {
                        l11 = Long.valueOf(org.telegram.messenger.m5.o(peer));
                        break;
                    }
                }
            }
        }
        if (l11 != null) {
            return l11.longValue();
        }
        Long y12 = np.s1(this.a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final long B(gj gjVar) {
        Long l10;
        s8 s8Var = this.B;
        if (s8Var != null && s8Var.a.equals(n8.b(gjVar)) && (l10 = this.B.n) != null) {
            return l10.longValue();
        }
        Long z12 = gjVar == null ? null : gjVar.z1();
        if (z12 != null) {
            return z12.longValue();
        }
        Long y12 = np.s1(this.a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final void C(long j3, long j10, z10 z10Var) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i7 = this.a;
        getpaidmessagesrevenue.user_id = np.s1(i7).o1(j3);
        if (j10 != 0) {
            getpaidmessagesrevenue.parent_peer = np.s1(i7).j1(j10);
        }
        ConnectionsManager.getInstance(i7).sendRequest(getpaidmessagesrevenue, new v7(z10Var, 0));
    }

    public final long D(int i7, long j3) {
        s8 s8Var = this.B;
        if (s8Var == null) {
            return 0L;
        }
        n8 n8Var = s8Var.a;
        if (n8Var.a == j3 && n8Var.b == i7 && s8Var.l) {
            return s8Var.h;
        }
        return 0L;
    }

    public final long E(gj gjVar) {
        TLRPC.Message message;
        if (gjVar == null || (message = gjVar.k) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || gjVar.k3()) && gjVar.k.fwd_from != null) ? D(gjVar.k.fwd_from.saved_from_msg_id, gjVar.Z0()) : D(gjVar.e1(), gj.B0(gjVar.k));
    }

    public final j8 F(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        j8 j8Var = (j8) longSparseArray.get(j3);
        if (j8Var != null || !z10) {
            return j8Var;
        }
        j8 j8Var2 = new j8(this.a, j3);
        longSparseArray.put(j3, j8Var2);
        return j8Var2;
    }

    public final l8 G(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        l8 l8Var = (l8) longSparseArray.get(j3);
        if (l8Var != null || !z10) {
            return l8Var;
        }
        l8 l8Var2 = new l8(this.a, j3, true);
        longSparseArray.put(j3, l8Var2);
        return l8Var2;
    }

    public final void H(TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, z10 z10Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        org.telegram.ui.ActionBar.e6 I = I();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            r(new f2(this, z10Var, starGift, j3));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = np.s1(this.a).j1(j3);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = ki.x2.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new bi.v2(8, this, z10Var));
    }

    public final TL_stars.StarGift J(long j3) {
        U();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 >= arrayList.size()) {
                return null;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i7);
            if (starGift.id == j3) {
                return starGift;
            }
            i7++;
        }
    }

    public final void K(long j3, z10 z10Var) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j3));
        if (stargiftupgradepreview != null) {
            z10Var.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j3;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new o2(this, j3, z10Var, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, z10 z10Var) {
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.b, null);
        t1Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new bi.l1(this, t1Var, inputSavedStarGift, z10Var, 4));
    }

    public final boolean N(int i7) {
        return this.e && !this.q[i7].isEmpty();
    }

    public final void O() {
        this.e = false;
        p();
        this.e = true;
    }

    public final void P(long j3) {
        l8 G = G(j3, false);
        if (G != null) {
            G.j(false);
        }
        j8 j8Var = (j8) this.K.get(j3);
        if (j8Var != null) {
            j8Var.g();
        }
    }

    public final void Q(TLRPC.UserFull userFull) {
        if (userFull == null) {
            return;
        }
        long j3 = userFull.id;
        l8 G = G(j3, false);
        if (G != null && G.n != userFull.stargifts_count) {
            G.j(false);
        }
        j8 j8Var = (j8) this.K.get(j3);
        if (j8Var != null) {
            j8Var.g();
        }
    }

    public final void R() {
        if (this.x) {
            return;
        }
        this.v.clear();
        this.w = null;
        this.x = false;
        this.y = false;
        V();
    }

    public final void S(boolean z10) {
        for (int i7 = 0; i7 < 3; i7++) {
            boolean[] zArr = this.t;
            if (!zArr[i7]) {
                this.q[i7].clear();
                this.s[i7] = null;
                zArr[i7] = false;
                this.u[i7] = false;
                if (z10) {
                    W(i7);
                }
            }
        }
    }

    public final void U() {
        if (this.C) {
            return;
        }
        if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
            this.C = true;
            boolean z10 = this.E;
            int i7 = this.a;
            if (z10) {
                int i10 = this.F;
                ai.g0 g0Var = new ai.g0(this, 11);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i10;
                ConnectionsManager.getInstance(i7).sendRequest(getstargifts, new ai.e1(g0Var, 3));
                return;
            }
            a1.c cVar = new a1.c(this, 27);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            vr a02 = vr.a0(i7);
            a02.a.c(new ai.b(a02, arrayList3, arrayList2, arrayList, cVar, 5));
        }
    }

    public final void V() {
        if (this.b || this.x || this.y) {
            return;
        }
        this.x = true;
        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
        String str = this.w;
        tL_getStarsSubscriptions.offset = str;
        if (str == null) {
            tL_getStarsSubscriptions.offset = "";
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new p7(this, 1));
    }

    public final void W(int i7) {
        boolean[] zArr = this.t;
        if (zArr[i7] || this.u[i7]) {
            return;
        }
        zArr[i7] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = this.b;
        tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
        tL_payments_getStarsTransactions.inbound = i7 == 1;
        tL_payments_getStarsTransactions.outbound = i7 == 2;
        String str = this.s[i7];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new u1(this, i7, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03c3  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, z10 z10Var) {
        long j3;
        String str;
        boolean z10;
        org.telegram.ui.ActionBar.u2 u2Var;
        b8 b8Var;
        c8 c8Var;
        ViewGroup viewGroup;
        gj gjVar2;
        int i7;
        float f10;
        int i10;
        int i11;
        long j10;
        int i12;
        long j11;
        TLRPC.Message message;
        int i13;
        String str2;
        String str3;
        String G;
        String G2;
        int i14;
        TLRPC.User a22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        int[] iArr;
        String M0;
        TLRPC.Message message2;
        int i15;
        int i16;
        ra raVar;
        FrameLayout frameLayout;
        org.telegram.messenger.gc gcVar;
        boolean z11;
        org.telegram.messenger.gc gcVar2;
        b8 b8Var2;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        np.s1(this.a).Y3(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.e6 I = I();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            r(new bi.p1(this, (Object) runnable, gjVar, inputInvoice, tL_payments_paymentFormStars, z10Var, 6));
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        int i17 = 0;
        long j12 = 0;
        while (i17 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i17);
            i17++;
            j12 += tL_labeledPrice.amount;
        }
        if (gjVar == null || gjVar.D != 29) {
            j3 = tL_payments_paymentFormStars.bot_id;
        } else {
            TLRPC.Message message3 = gjVar.k;
            TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
            j3 = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? gj.B0(message3) : org.telegram.messenger.m5.o(peer2);
        }
        long j13 = j3;
        if (j13 >= 0) {
            TLRPC.User a23 = np.s1(this.a).a2(Long.valueOf(j13));
            str = q10.p(a23);
            z10 = !q10.t(a23);
        } else {
            TLRPC.Chat M02 = np.s1(this.a).M0(Long.valueOf(-j13));
            str = M02 == null ? "" : M02.title;
            z10 = false;
        }
        String str4 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i18 = tL_payments_paymentFormStars.invoice.subscription_period;
        long j14 = j12;
        boolean[] zArr = {false};
        int i19 = this.a;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        b8 b8Var3 = new b8(this, j14, zArr, z10Var, context2, I, z10, str, gjVar, inputInvoice, tL_payments_paymentFormStars, i18, j13);
        c8 c8Var2 = new c8(this, zArr, z10Var);
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context2, I, false);
        TLRPC.User a24 = np.s1(i19).a2(Long.valueOf(j13));
        LinearLayout f11 = org.telegram.messenger.k5.f(context2, 1);
        f11.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.addView(new qa(context2, 40, 0, 0), c8.ja.c(-1.0f, -1));
        if (gjVar == null || (message2 = gjVar.k) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            u2Var = k10;
            b8Var = b8Var3;
            c8Var = c8Var2;
            viewGroup = frameLayout2;
            gjVar2 = gjVar;
            i7 = i18;
            f10 = 20.0f;
            if (webDocument != null) {
                FrameLayout frameLayout3 = new FrameLayout(context2);
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context2);
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
                i9Var.p(org.telegram.messenger.gc.p(k20.c(webDocument)), "80_80", null, null);
                frameLayout3.addView(i9Var, c8.ja.e(80, 80, 48));
                viewGroup.addView(frameLayout3, c8.ja.e(80, 87, 17));
                TextView textView = new TextView(context2);
                textView.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
                i10 = 1;
                textView.setTextSize(1, 13.0f);
                i11 = -1;
                textView.setTextColor(-1);
                j10 = j14;
                textView.setText(lb.U0(i5.c.l((int) j14, ',', new StringBuilder("XTR ")), 0.85f, null));
                i12 = 0;
                textView.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
                textView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(16.0f), -1133566));
                FrameLayout frameLayout4 = new FrameLayout(context2);
                int L = org.telegram.messenger.g0.L(20.0f);
                int i20 = org.telegram.ui.ActionBar.j6.h5;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i20, I));
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i20);
                frameLayout4.setBackground(d02);
                org.telegram.ui.ActionBar.q6.j(frameLayout4, d02, M, null, I);
                frameLayout4.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                frameLayout4.addView(textView, c8.ja.r(-2, 16, ns.E1));
                frameLayout3.addView(frameLayout4, c8.ja.a(-2.0f, 18.66f, 81));
                ab abVar = new ab(i19, context2, I);
                c8.na.a(abVar);
                abVar.setOnClickListener(new fa(abVar, i10));
                viewGroup.addView(abVar, c8.ja.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f11.addView(viewGroup, c8.ja.r(i11, ns.C1, 7));
                TextView g10 = org.telegram.messenger.k5.g(context2, i10, f10);
                g10.setTypeface(org.telegram.messenger.g0.o());
                int i21 = org.telegram.ui.ActionBar.j6.j5;
                org.telegram.ui.ActionBar.q6.U(g10, i21, I);
                if (i7 <= 0) {
                    if (webDocument != null) {
                        M0 = str4;
                        iArr = null;
                    } else {
                        iArr = null;
                        M0 = hd.M0(2131745115, null);
                    }
                    g10.setText(org.telegram.messenger.j6.m(M0, g10.getPaint().getFontMetricsInt(), i12, iArr, i12));
                } else {
                    g10.setText(org.telegram.messenger.j6.m(webDocument != null ? str4 : hd.M0(2131745122, null), g10.getPaint().getFontMetricsInt(), i12, null, i12));
                }
                ns.i(g10);
                g10.setGravity(17);
                f11.addView(g10, c8.ja.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                if (webDocument != null) {
                    LinearLayout f12 = org.telegram.messenger.k5.f(context2, i12);
                    int L2 = org.telegram.messenger.g0.L(28.0f);
                    int i22 = org.telegram.ui.ActionBar.j6.a7;
                    ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(L2, org.telegram.ui.ActionBar.j6.w0(i22, I));
                    org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i22);
                    f12.setBackground(d03);
                    org.telegram.ui.ActionBar.q6.j(f12, d03, M2, null, I);
                    org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context2);
                    i9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                    org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                    t8Var.r(a24);
                    i9Var2.f(a24, t8Var);
                    f12.addView(i9Var2, c8.ja.o(28, 28));
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(i10, 13.0f);
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.G6, I);
                    textView2.setText(q10.p(a24));
                    f12.addView(textView2, c8.ja.t(-2, -2, 16, 6, 0, 10, 0));
                    f11.addView(f12, c8.ja.t(-2, 28, 1, 0, 8, 0, 2));
                }
                TextView textView3 = new TextView(context2);
                textView3.setTextSize(i10, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView3, i21, I);
                if (gjVar2 == null && (message = gjVar2.k) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    long B0 = gj.B0(message);
                    TLRPC.Message message4 = gjVar2.k;
                    if (message4 != null && (messageFwdHeader = message4.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        B0 = org.telegram.messenger.m5.o(peer);
                    }
                    if (B0 < 0 && gjVar2.Z0() > 0 && (a22 = np.s1(i19).a2(Long.valueOf(gjVar2.Z0()))) != null && a22.bot) {
                        B0 = a22.id;
                    }
                    if (B0 >= 0) {
                        TLRPC.User a25 = np.s1(i19).a2(Long.valueOf(B0));
                        str2 = q10.p(a25);
                        i13 = (a25 == null || !a25.bot) ? i12 : i10;
                    } else {
                        TLRPC.Chat M03 = np.s1(i19).M0(Long.valueOf(-B0));
                        String str5 = M03 != null ? M03.title : "";
                        i13 = i12;
                        str2 = str5;
                    }
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) gjVar2.k.media;
                    int i23 = i12;
                    int i24 = i23;
                    int i25 = i24;
                    while (i23 < tL_messageMediaPaidMedia.extended_media.size()) {
                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i23);
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                            if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                i14 = i10;
                            }
                            i14 = i12;
                        } else {
                            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                i14 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                            }
                            i14 = i12;
                        }
                        if (i14 != 0) {
                            i24++;
                        } else {
                            i25++;
                        }
                        i23++;
                    }
                    if (i24 == 0) {
                        String str6 = i13 != 0 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                        long j15 = j10;
                        int i26 = (int) j15;
                        Object[] objArr = new Object[2];
                        objArr[i12] = i25 == i10 ? hd.M0(2131745131, null) : hd.G(i25, "StarsConfirmPurchaseMedia_Photos", new Object[i12]);
                        objArr[i10] = str2;
                        G2 = hd.G(i26, str6, objArr);
                        j11 = j15;
                    } else {
                        j11 = j10;
                        if (i25 == 0) {
                            String str7 = i13 == 0 ? "StarsConfirmPurchaseMediaOne2" : "StarsConfirmPurchaseMediaBotOne2";
                            int i27 = (int) j11;
                            Object[] objArr2 = new Object[2];
                            objArr2[i12] = i24 == i10 ? hd.M0(2131745130, null) : hd.G(i24, "StarsConfirmPurchaseMedia_Videos", new Object[i12]);
                            objArr2[i10] = str2;
                            G2 = hd.G(i27, str7, objArr2);
                        } else {
                            String str8 = i13 != 0 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                            int i28 = (int) j11;
                            if (i25 == i10) {
                                str3 = null;
                                G = hd.M0(2131745131, null);
                            } else {
                                str3 = null;
                                G = hd.G(i25, "StarsConfirmPurchaseMedia_Photos", new Object[i12]);
                            }
                            String M04 = i24 == 1 ? hd.M0(2131745130, str3) : hd.G(i24, "StarsConfirmPurchaseMedia_Videos", new Object[i12]);
                            Object[] objArr3 = new Object[3];
                            objArr3[i12] = G;
                            objArr3[1] = M04;
                            objArr3[2] = str2;
                            G2 = hd.G(i28, str8, objArr3);
                        }
                    }
                    textView3.setText(org.telegram.messenger.g0.X2(G2));
                } else {
                    j11 = j10;
                    if (i7 <= 0) {
                        String p10 = q10.p(a24);
                        Object[] objArr4 = new Object[2];
                        objArr4[i12] = str4;
                        objArr4[1] = p10;
                        textView3.setText(org.telegram.messenger.g0.X2(hd.K("StarsConfirmSubscriptionText2", (int) j11, ',', objArr4)));
                    } else {
                        String p11 = q10.p(a24);
                        Object[] objArr5 = new Object[2];
                        objArr5[i12] = str4;
                        objArr5[1] = p11;
                        textView3.setText(org.telegram.messenger.g0.X2(hd.K("StarsConfirmPurchaseText2", (int) j11, ',', objArr5)));
                    }
                }
                textView3.setMaxWidth(hi.l3.a(textView3.getText(), textView3.getPaint()));
                textView3.setGravity(17);
                f11.addView(textView3, c8.ja.t(-2, -2, 1, 0, 6, 0, 18));
                hi.d dVar = new hi.d(context2, I, true);
                if (i7 <= 0) {
                    dVar.i(lb.T0(org.telegram.messenger.g0.X2(hd.H(',', "StarsConfirmSubscriptionButton", (int) j11))), i12, true);
                } else {
                    dVar.i(lb.T0(org.telegram.messenger.g0.X2(hd.H(',', "StarsConfirmPurchaseButton", (int) j11))), i12, true);
                }
                f11.addView(dVar, c8.ja.c(48.0f, -1));
                z70 z70Var = new z70(context2, I);
                org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.z6, I);
                org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, I);
                z70Var.setTextSize(1, 14.0f);
                z70Var.setText(org.telegram.messenger.g0.U2(hd.M0(i7 <= 0 ? 2131745119 : 2131745126, null), new ai.a(context2, 7)));
                z70Var.setGravity(17);
                f11.addView(z70Var, c8.ja.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                u2Var2.O = f11;
                dVar.setOnClickListener(new ah.g(b8Var, u2Var2, dVar, 8));
                u2Var2.setOnDismissListener(new q9(c8Var, 2));
                u2Var2.O();
                u2Var2.show();
            }
            org.telegram.ui.Components.i9 i9Var3 = new org.telegram.ui.Components.i9(context2);
            i9Var3.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
            org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            t8Var2.r(a24);
            i9Var3.f(a24, t8Var2);
            viewGroup.addView(i9Var3, c8.ja.e(80, 80, 17));
        } else {
            ra raVar2 = new ra(context2);
            raVar2.I = new Path();
            raVar2.J = new RectF();
            raVar2.K = i5.c.g(context2, R.drawable.large_locked_post);
            raVar2.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) gjVar.k.media;
            if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                u2Var = k10;
                c8Var = c8Var2;
                viewGroup = frameLayout2;
                b8Var = b8Var3;
                gjVar2 = gjVar;
                i7 = i18;
                i15 = 17;
                i16 = 80;
                f10 = 20.0f;
            } else {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                    gcVar2 = org.telegram.messenger.gc.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, gjVar.k);
                    raVar = raVar2;
                    c8Var = c8Var2;
                    frameLayout = frameLayout2;
                    b8Var2 = b8Var3;
                    gcVar = null;
                    z11 = true;
                } else {
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            raVar = raVar2;
                            c8Var = c8Var2;
                            frameLayout = frameLayout2;
                            gcVar = null;
                            z11 = true;
                            gcVar2 = org.telegram.messenger.gc.i(org.telegram.messenger.w7.w(messageMedia.photo.sizes, org.telegram.messenger.g0.L(80.0f), true, null, false), messageMedia.photo);
                        } else {
                            raVar = raVar2;
                            c8Var = c8Var2;
                            frameLayout = frameLayout2;
                            gcVar = null;
                            z11 = true;
                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                gcVar2 = org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(messageMedia.document.thumbs, org.telegram.messenger.g0.L(80.0f), true, null, false), messageMedia.document);
                            }
                        }
                        b8Var2 = b8Var3;
                    } else {
                        raVar = raVar2;
                        c8Var = c8Var2;
                        frameLayout = frameLayout2;
                        gcVar = null;
                        z11 = true;
                    }
                    gcVar2 = gcVar;
                    b8Var2 = b8Var3;
                }
                b8Var = b8Var2;
                viewGroup = frameLayout;
                i15 = 17;
                f10 = 20.0f;
                raVar2 = raVar;
                u2Var = k10;
                i7 = i18;
                i16 = 80;
                raVar2.m(gcVar2, "80_80_b2", null, null, null, gjVar);
                gjVar2 = gjVar;
            }
            viewGroup.addView(raVar2, c8.ja.e(i16, i16, i15));
        }
        j10 = j14;
        i10 = 1;
        i11 = -1;
        i12 = 0;
        ab abVar2 = new ab(i19, context2, I);
        c8.na.a(abVar2);
        abVar2.setOnClickListener(new fa(abVar2, i10));
        viewGroup.addView(abVar2, c8.ja.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        f11.addView(viewGroup, c8.ja.r(i11, ns.C1, 7));
        TextView g102 = org.telegram.messenger.k5.g(context2, i10, f10);
        g102.setTypeface(org.telegram.messenger.g0.o());
        int i212 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(g102, i212, I);
        if (i7 <= 0) {
        }
        ns.i(g102);
        g102.setGravity(17);
        f11.addView(g102, c8.ja.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
        if (webDocument != null) {
        }
        TextView textView32 = new TextView(context2);
        textView32.setTextSize(i10, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView32, i212, I);
        if (gjVar2 == null) {
        }
        j11 = j10;
        if (i7 <= 0) {
        }
        textView32.setMaxWidth(hi.l3.a(textView32.getText(), textView32.getPaint()));
        textView32.setGravity(17);
        f11.addView(textView32, c8.ja.t(-2, -2, 1, 0, 6, 0, 18));
        hi.d dVar2 = new hi.d(context2, I, true);
        if (i7 <= 0) {
        }
        f11.addView(dVar2, c8.ja.c(48.0f, -1));
        z70 z70Var2 = new z70(context2, I);
        org.telegram.ui.ActionBar.q6.U(z70Var2, org.telegram.ui.ActionBar.j6.z6, I);
        org.telegram.ui.ActionBar.q6.G(z70Var2, org.telegram.ui.ActionBar.j6.Xc, I);
        z70Var2.setTextSize(1, 14.0f);
        z70Var2.setText(org.telegram.messenger.g0.U2(hd.M0(i7 <= 0 ? 2131745119 : 2131745126, null), new ai.a(context2, 7)));
        z70Var2.setGravity(17);
        f11.addView(z70Var2, c8.ja.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
        org.telegram.ui.ActionBar.u2 u2Var22 = u2Var;
        u2Var22.O = f11;
        dVar2.setOnClickListener(new ah.g(b8Var, u2Var22, dVar2, 8));
        u2Var22.setOnDismissListener(new q9(c8Var, 2));
        u2Var22.O();
        u2Var22.show();
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, s10 s10Var) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = org.telegram.messenger.t0.b;
        org.telegram.ui.ActionBar.e6 I = I();
        if (context == null) {
            return;
        }
        long j3 = chatInvite.subscription_pricing.amount;
        String str2 = chatInvite.title;
        TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
        tL_inputInvoiceChatInviteSubscription.hash = str;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new p6(this, s10Var, j3, str2, context, I, chatInvite, str));
    }

    public final void Z(final gj gjVar, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final z10 z10Var) {
        long j3;
        String str;
        TLRPC.User a22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = org.telegram.messenger.t0.b;
        final org.telegram.ui.ActionBar.e6 I = I();
        if (context == null) {
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        final long j10 = 0;
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
            i7++;
            j10 += tL_labeledPrice.amount;
        }
        if (gjVar != null) {
            TLRPC.Message message = gjVar.k;
            j3 = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? gj.B0(message) : org.telegram.messenger.m5.o(peer);
            if (j3 < 0 && gjVar.Z0() > 0 && (a22 = np.s1(this.a).a2(Long.valueOf(gjVar.Z0()))) != null && a22.bot) {
                j3 = a22.id;
            }
        } else {
            j3 = tL_payments_paymentFormStars.bot_id;
        }
        final long j11 = j3;
        if (j11 >= 0) {
            str = q10.p(np.s1(this.a).a2(Long.valueOf(j11)));
        } else {
            TLRPC.Chat M0 = np.s1(this.a).M0(Long.valueOf(-j11));
            str = M0 == null ? "" : M0.title;
        }
        final String str2 = str;
        final String str3 = tL_payments_paymentFormStars.title;
        final int i10 = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: di.x6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u8 u8Var = u8.this;
                final z10 z10Var2 = z10Var;
                final gj gjVar2 = gjVar;
                final Context context2 = context;
                final long j12 = j10;
                final String str4 = str2;
                final int i11 = i10;
                final String str5 = str3;
                final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                final long j13 = j11;
                final org.telegram.ui.ActionBar.e6 e6Var = I;
                final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.c7
                    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
                    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        LaunchActivity launchActivity;
                        r80 r80Var;
                        TLRPC.Message message2;
                        u8 u8Var2 = u8.this;
                        TLObject tLObject2 = tLObject;
                        z10 z10Var3 = z10Var2;
                        gj gjVar3 = gjVar2;
                        Context context3 = context2;
                        long j14 = j12;
                        String str6 = str4;
                        int i12 = i11;
                        String str7 = str5;
                        TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                        long j15 = j13;
                        TLRPC.TL_error tL_error2 = tL_error;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                        org.telegram.ui.Components.cc X = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.cc.X() : org.telegram.ui.Components.cc.a0(Q);
                        boolean z12 = tLObject2 instanceof TLRPC.TL_payments_paymentResult;
                        int i13 = 0;
                        if (!z12) {
                            if (tL_error2 != null) {
                                z10 = false;
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (np.s1(u8Var2.a).k7) {
                                        z10Var3.a(Boolean.FALSE);
                                        u8.c0(context3, e6Var2);
                                        return;
                                    } else {
                                        boolean[] zArr = {false};
                                        bb bbVar = new bb(context3, e6Var2, j14, 0, str6, new bi.p1(u8Var2, (Object) zArr, gjVar3, inputInvoice3, tL_payments_paymentFormStars3, z10Var3, 4), j15);
                                        bbVar.setOnDismissListener(new j7(z10Var3, zArr));
                                        bbVar.show();
                                        return;
                                    }
                                }
                            } else {
                                z10 = false;
                            }
                            if (tL_error2 == null || !"FORM_EXPIRED".equals(tL_error2.text)) {
                                org.telegram.ui.Components.cc ccVar = X;
                                z10Var3.a(Boolean.FALSE);
                                ccVar.Q(R.raw.error, 36, hd.a0(null, null, 2131743878, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                if (gjVar3 != null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia.peer = np.s1(u8Var2.a).j1(j15);
                                    tL_messages_getExtendedMedia.id.add(Integer.valueOf(gjVar3.e1()));
                                    ConnectionsManager.getInstance(u8Var2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            JSONObject u10 = ki.x2.u(e6Var2, z10);
                            if (u10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                tL_dataJSON.data = u10.toString();
                                tL_payments_getPaymentForm.flags |= 1;
                            }
                            tL_payments_getPaymentForm.invoice = inputInvoice3;
                            ConnectionsManager.getInstance(u8Var2.a).sendRequest(tL_payments_getPaymentForm, new k7(u8Var2, gjVar3, inputInvoice3, z10Var3, X, 0));
                            return;
                        }
                        z10Var3.a(Boolean.TRUE);
                        Utilities.d.c(new i7(u8Var2, (TLRPC.TL_payments_paymentResult) tLObject2, i13));
                        if (gjVar3 != null && (message2 = gjVar3.k) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            Drawable g10 = i5.c.g(context3, R.drawable.star_small_inner);
                            String M02 = hd.M0(2131745088, null);
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.G((int) j14, "StarsMediaPurchaseCompletedInfo", str6));
                            X.getClass();
                            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(X.W(), X.c);
                            ubVar.a.setImageDrawable(g10);
                            ubVar.b.setText(M02);
                            ubVar.c.setText(X2);
                            X.b(ubVar, 2750).j();
                        } else {
                            if (i12 <= 0) {
                                z11 = true;
                                X.I(R.raw.stars_send, hd.M0(2131745052, null), org.telegram.messenger.g0.X2(hd.G((int) j14, "StarsPurchaseCompletedInfo", str7, str6))).j();
                                launchActivity = LaunchActivity.H1;
                                if (launchActivity != null && (r80Var = launchActivity.w0) != null) {
                                    r80Var.c(z11);
                                }
                                if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                    u8Var2.S(true);
                                }
                                if (gjVar3 == null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia2.peer = np.s1(u8Var2.a).j1(j15);
                                    tL_messages_getExtendedMedia2.id.add(Integer.valueOf(gjVar3.e1()));
                                    ConnectionsManager.getInstance(u8Var2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                    return;
                                }
                                return;
                            }
                            X.I(R.raw.stars_send, hd.M0(2131745154, null), org.telegram.messenger.g0.X2(hd.G((int) j14, "StarsBotSubscriptionCompletedInfo", str7, str6))).j();
                        }
                        z11 = true;
                        launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            r80Var.c(z11);
                        }
                        if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                        }
                        u8Var2.S(true);
                        if (gjVar3 == null) {
                        }
                    }
                });
            }
        });
    }

    public final void a0(long j3, long j10, boolean z10) {
        int i7 = this.a;
        h00 h00Var = np.s1(i7).r7;
        TLRPC.TL_forumTopic f10 = h00Var.f(j3, j10);
        if (f10 != null) {
            f10.nopaid_messages_exception = z10;
            a0.h hVar = h00Var.a;
            if (((ArrayList) hVar.f(j3)) != null) {
                h00Var.getMessagesStorage().C1(h00Var.getConnectionsManager().getCurrentTime(), -j3, (List) hVar.f(j3), true);
            }
            ns.f(i7).k(ns.N3, Long.valueOf(j10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s8 b0(final gj gjVar, final an anVar, final long j3, boolean z10, boolean z11, final Long l10) {
        String str;
        long j10;
        final u8 u8Var;
        gj gjVar2;
        TLRPC.ReactionCount reactionCount;
        boolean z12;
        String str2;
        n8 b10 = n8.b(gjVar);
        int i7 = this.a;
        u8 y10 = y(i7, false);
        Context t6 = t(anVar);
        if (t6 == null) {
            return null;
        }
        str = "";
        if (z11 && y10.e && y10.q(null, false, false).amount <= 0) {
            long a10 = anVar.a();
            if (a10 >= 0) {
                str = q10.k(anVar.getMessagesController().a2(Long.valueOf(a10)));
            } else {
                TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-a10));
                if (M0 != null) {
                    str = M0.title;
                }
            }
            final int i10 = 0;
            new bb(t6, anVar.getResourceProvider(), j3, 5, str, new Runnable(this) { // from class: di.q7
                public final /* synthetic */ u8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.b0(gjVar, anVar, j3, true, true, l10);
                            break;
                        default:
                            this.b.b0(gjVar, anVar, j3, true, true, l10);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        s8 s8Var = this.B;
        if (s8Var == null || !s8Var.a.equals(b10)) {
            s8 s8Var2 = this.B;
            if (s8Var2 != null) {
                s8Var2.b();
            }
            ConnectionsManager.getInstance(i7).getCurrentTime();
            j10 = 0;
            u8Var = this;
            s8 s8Var3 = new s8(u8Var, b10, gjVar, anVar, z10);
            u8Var.B = s8Var3;
            s8Var3.n = l10;
        } else {
            j10 = 0;
            u8Var = this;
        }
        if (u8Var.B.h + j3 > np.s1(i7).a6) {
            u8Var.B.b();
            ConnectionsManager.getInstance(i7).getCurrentTime();
            u8Var.B = new s8(u8Var, b10, gjVar, anVar, z10);
        }
        final long j11 = u8Var.B.h + j3;
        if (z11 && y10.e) {
            if (y10.q(null, false, false).amount < j11) {
                u8Var.B.a();
                long a11 = anVar.a();
                if (a11 >= j10) {
                    str2 = q10.k(anVar.getMessagesController().a2(Long.valueOf(a11)));
                } else {
                    TLRPC.Chat M02 = anVar.getMessagesController().M0(Long.valueOf(-a11));
                    str2 = M02 != null ? M02.title : "";
                }
                final int i11 = 1;
                new bb(t6, anVar.getResourceProvider(), j11, 5, str2, new Runnable(u8Var) { // from class: di.q7
                    public final /* synthetic */ u8 b;

                    {
                        this.b = u8Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.b0(gjVar, anVar, j11, true, true, l10);
                                break;
                            default:
                                this.b.b0(gjVar, anVar, j11, true, true, l10);
                                break;
                        }
                    }
                }, 0L).show();
                return null;
            }
            gjVar2 = gjVar;
            reactionCount = null;
        } else {
            gjVar2 = gjVar;
            reactionCount = null;
        }
        s8 s8Var4 = u8Var.B;
        if (gjVar2 != null) {
            TLRPC.Message message = gjVar2.k;
            if (message.reactions == null) {
                message.reactions = new TLRPC.TL_messageReactions();
                TLRPC.Message message2 = gjVar2.k;
                message2.reactions.reactions_as_tags = gj.B0(message2) == m10.i(gjVar2.K1).e();
                gjVar2.k.reactions.can_see_list = gjVar2.o3() || gjVar2.p3();
            }
            for (int i12 = 0; i12 < gjVar2.k.reactions.results.size(); i12++) {
                if (!(gjVar2.k.reactions.results.get(i12).reaction instanceof TLRPC.TL_reactionPaid)) {
                }
            }
            z12 = true;
            q8 q8Var = s8Var4.p;
            u8 u8Var2 = s8Var4.q;
            int i13 = u8Var2.a;
            org.telegram.ui.Components.rb rbVar = s8Var4.e;
            gj gjVar3 = s8Var4.b;
            if (!s8Var4.i || s8Var4.j) {
                boolean z13 = org.telegram.messenger.r2.a;
            } else {
                s8Var4.h += j3;
                System.currentTimeMillis();
                rbVar.c.a();
                rbVar.c.c(org.telegram.messenger.g0.X2(hd.G((int) s8Var4.h, "StarsSentText", new Object[0])), true, true);
                if (s8Var4.m) {
                    s8Var4.f.b = 5000L;
                    org.telegram.messenger.g0.r(q8Var);
                    org.telegram.messenger.g0.i3(q8Var, 5000L);
                }
                int i14 = ns.o1;
                if (z12) {
                    s8Var4.l = true;
                    gjVar3.f((int) j3, s8Var4.c(), true);
                    u8Var2.g += j3;
                    ns.f(i13).k(i14, Long.valueOf(gj.B0(gjVar3.k)), Integer.valueOf(gjVar3.e1()), gjVar3.k.reactions);
                    ns.f(i13).k(ns.y3, new Object[0]);
                } else {
                    s8Var4.l = false;
                    TLRPC.Message message3 = gjVar3.k;
                    if (message3.reactions == null) {
                        message3.reactions = new TLRPC.TL_messageReactions();
                        TLRPC.Message message4 = gjVar3.k;
                        message4.reactions.reactions_as_tags = gj.B0(message4) == m10.i(gjVar3.K1).e();
                        gjVar3.k.reactions.can_see_list = gjVar3.o3() || gjVar3.p3();
                    }
                    for (int i15 = 0; i15 < gjVar3.k.reactions.results.size(); i15++) {
                        if (gjVar3.k.reactions.results.get(i15).reaction instanceof TLRPC.TL_reactionPaid) {
                            reactionCount = gjVar3.k.reactions.results.get(i15);
                        }
                    }
                    if (reactionCount == null) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
                        tL_reactionCount.count = 1;
                        tL_reactionCount.chosen = true;
                        gjVar3.k.reactions.results.add(0, tL_reactionCount);
                        s8Var4.k--;
                    }
                    ns.f(i13).k(i14, Long.valueOf(gj.B0(gjVar3.k)), Integer.valueOf(gjVar3.e1()), gjVar3.k.reactions);
                    s8Var4.k += j3;
                }
                rbVar.b.setText(s8Var4.d());
            }
            s8 s8Var5 = u8Var.B;
            s8Var5.n = l10;
            return s8Var5;
        }
        if (!z10) {
            z12 = false;
            q8 q8Var2 = s8Var4.p;
            u8 u8Var22 = s8Var4.q;
            int i132 = u8Var22.a;
            org.telegram.ui.Components.rb rbVar2 = s8Var4.e;
            gj gjVar32 = s8Var4.b;
            if (s8Var4.i) {
            }
            boolean z132 = org.telegram.messenger.r2.a;
            s8 s8Var52 = u8Var.B;
            s8Var52.n = l10;
            return s8Var52;
        }
        z12 = true;
        q8 q8Var22 = s8Var4.p;
        u8 u8Var222 = s8Var4.q;
        int i1322 = u8Var222.a;
        org.telegram.ui.Components.rb rbVar22 = s8Var4.e;
        gj gjVar322 = s8Var4.b;
        if (s8Var4.i) {
        }
        boolean z1322 = org.telegram.messenger.r2.a;
        s8 s8Var522 = u8Var.B;
        s8Var522.n = l10;
        return s8Var522;
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            int e12 = ((gj) obj).e1();
            hashSet.add(Integer.valueOf(e12));
            if (this.Q.remove(Integer.valueOf(e12))) {
                this.R.put(Integer.valueOf(e12), new aa.r(this, hashSet, runnable, 25));
                z10 = true;
            }
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        if (r10.a == r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007b, code lost:
    
        if (r0.intValue() >= 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0082, code lost:
    
        if (r1 >= 100) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(gj gjVar) {
        boolean z10;
        t7 t7Var;
        org.telegram.ui.ActionBar.e2 T2;
        p8 p8Var;
        TLRPC.Message message = gjVar.k;
        if (message == null) {
            return;
        }
        long j3 = message.paid_message_stars;
        if (j3 <= 0 || gj.c3(message)) {
            return;
        }
        p8 p8Var2 = this.N;
        int i7 = 1;
        int i10 = 0;
        if (p8Var2 == null || p8Var2.g <= 0 || !p8Var2.m || p8Var2.n || p8Var2.o) {
            if (!org.telegram.ui.Components.t4.a0(this.a, gj.B0(gjVar.k))) {
                Long l10 = (Long) this.O.get(Long.valueOf(gj.B0(gjVar.k)));
                if (l10 == null || System.currentTimeMillis() - l10.longValue() <= 5000) {
                    Integer num = (Integer) this.P.get(Long.valueOf(gj.B0(gjVar.k)));
                    if (num != null) {
                    }
                }
            }
            z10 = false;
            int e12 = gjVar.e1();
            if (z10) {
                this.Q.add(Integer.valueOf(e12));
            }
            long B0 = gj.B0(gjVar.k);
            ai.u2 u2Var = new ai.u2(i7, this, z10);
            t7Var = new t7(this, z10, e12, i10);
            T2 = LaunchActivity.T();
            p8Var = this.N;
            if (p8Var != null && (p8Var.o || p8Var.n)) {
                this.N = null;
            }
            if (this.N != null) {
                if (T2 != null && !T2.isRemovingFromStack()) {
                    p8 p8Var3 = this.N;
                    if (p8Var3.b == B0) {
                    }
                }
                this.N.a();
                this.N = null;
            }
            if (T2 != null || T2.isRemovingFromStack()) {
                t7Var.run();
            }
            if (this.N == null) {
                this.N = new p8(T2, B0);
            }
            p8 p8Var4 = this.N;
            org.telegram.ui.Components.rb rbVar = p8Var4.d;
            org.telegram.ui.Components.vb vbVar = p8Var4.e;
            o8 o8Var = p8Var4.p;
            if (p8Var4.n || p8Var4.o) {
                t7Var.run();
                return;
            }
            p8Var4.g++;
            p8Var4.k.add(gjVar);
            p8Var4.h += j3;
            p8Var4.i = u2Var;
            p8Var4.j.add(t7Var);
            if (p8Var4.m && !z10) {
                p8Var4.m = false;
                org.telegram.messenger.g0.r(o8Var);
                org.telegram.ui.Components.xb xbVar = p8Var4.c;
                xbVar.j = 5000;
                xbVar.i(true);
                if (System.currentTimeMillis() - p8Var4.l > 500) {
                    vbVar.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                } else {
                    vbVar.setAlpha(0.0f);
                    vbVar.setVisibility(8);
                }
            }
            t8 t8Var = p8Var4.f;
            if (t8Var != null && p8Var4.m) {
                t8Var.b = 3000L;
                org.telegram.messenger.g0.r(o8Var);
                org.telegram.messenger.g0.i3(o8Var, 3000L);
            }
            org.telegram.ui.Components.h6 h6Var = rbVar.b;
            int i11 = p8Var4.g;
            h6Var.setText(i11 == 1 ? hd.M0(2131747703, null) : hd.G(i11, "PaidMessageSentTitle", new Object[0]));
            rbVar.c.setText(org.telegram.messenger.g0.X2(hd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) p8Var4.h))));
            rbVar.a.d();
            return;
        }
        z10 = true;
        int e122 = gjVar.e1();
        if (z10) {
        }
        long B02 = gj.B0(gjVar.k);
        ai.u2 u2Var2 = new ai.u2(i7, this, z10);
        t7Var = new t7(this, z10, e122, i10);
        T2 = LaunchActivity.T();
        p8Var = this.N;
        if (p8Var != null) {
            this.N = null;
        }
        if (this.N != null) {
        }
        if (T2 != null) {
        }
        t7Var.run();
    }

    public final void d0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gj gjVar = (gj) list.get(0);
        long B0 = gj.B0(gjVar.k);
        int i7 = this.a;
        if (B0 >= 0) {
            np.s1(i7).W2(np.s1(i7).a2(Long.valueOf(B0)), 0, true, null);
        } else {
            np.s1(i7).V2(0, -B0, true);
        }
        org.telegram.ui.Components.cc.a0(LaunchActivity.T()).Q(R.raw.error, 36, lb.T0(TextUtils.concat(hd.G((int) gjVar.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", hd.G((int) gjVar.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
    }

    public final void e0(LaunchActivity launchActivity, long j3, String str) {
        if (this.e) {
            f0(launchActivity, j3, str);
        } else {
            r(new f2(this, (Object) launchActivity, j3, (Object) str, 6));
        }
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, s10 s10Var, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i7 = this.a;
        if (np.s1(i7).k7) {
            org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
            if (Q == null || Q.getContext() == null) {
                c0(activity, null);
                return;
            } else {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            }
        }
        boolean z10 = ((org.telegram.messenger.h0) np.s1(i7).y7.h0.b).c && inputPeer != null;
        if ((!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k()) || z10) {
            if (!org.telegram.messenger.r1.i().k()) {
                s10Var.a(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            f5.a aVar = new f5.a();
            aVar.c = "inapp";
            aVar.b = tL_starsTopupOption.store_product;
            f5.p a10 = aVar.a();
            org.telegram.messenger.a8.b("StarsController.buy starts queryProductDetails");
            org.telegram.messenger.r1.i().o(Arrays.asList(a10), new a1.d(s10Var, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity, 2));
            return;
        }
        TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
        tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
        tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
        tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
        tL_inputStorePaymentStarsTopup2.spend_purpose_peer = inputPeer;
        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup2;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = ki.x2.u(I(), false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getPaymentForm, new bi.j6(this, s10Var, tL_inputInvoiceStars, 3));
    }

    public final void f0(LaunchActivity launchActivity, long j3, String str) {
        if (p().amount < j3 && j3 > 0) {
            new bb(launchActivity, null, j3, 4, str, new ai.o(10), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
        if (T2 == null) {
            return;
        }
        org.telegram.ui.Components.xb K = org.telegram.ui.Components.cc.a0(T2).K(R.raw.stars_topup, hd.M0(2131744964, null), hd.M0(2131744963, null), new ai.o(9));
        K.j = 5000;
        K.k(true);
    }

    public final void g(final long j3, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final s10 s10Var) {
        int i7;
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.e6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new bi.r1(this, s10Var, j3, tLObject, tL_textWithEntities, 4));
                return;
            }
            if (z10) {
                i7 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i7 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String l10 = org.telegram.messenger.m5.l(this.a, j3);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = np.s1(this.a).o1(j3);
            tL_inputInvoicePremiumGiftStars.months = i7;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.x2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: di.y6
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final u8 u8Var = u8.this;
                    final s10 s10Var2 = s10Var;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.e6 e6Var = I;
                    final String str = l10;
                    final long j10 = j3;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: di.e7
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            s10 s10Var3 = s10Var2;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                u8.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                s10Var3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i10 = 0;
                            long j11 = 0;
                            while (i10 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                                i10++;
                                j11 += tL_labeledPrice.amount;
                            }
                            u8 u8Var2 = u8.this;
                            ConnectionsManager.getInstance(u8Var2.a).sendRequest(tL_payments_sendStarsForm, new h7(u8Var2, s10Var3, context3, e6Var, j11, str, j10, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(final long j3, final long j10, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i7 = this.a;
        togglenopaidmessagesexception.user_id = np.s1(i7).o1(j3);
        if (j10 != 0) {
            togglenopaidmessagesexception.parent_peer = np.s1(i7).j1(j10);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i7).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: di.r7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new y7(u8.this, tLObject, j10, j3, z11));
            }
        });
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, s10 s10Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.e6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new bi.r1(this, s10Var, tL_payments_paymentFormStarGift, starGift, j3, 5));
            return;
        }
        String l10 = org.telegram.messenger.m5.l(this.a, j3);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = np.s1(this.a).j1(j3);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        int i7 = 0;
        JSONObject u10 = ki.x2.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
        int size = arrayList.size();
        long j10 = 0;
        while (i7 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
            i7++;
            j10 += tL_labeledPrice.amount;
            size = size;
            context2 = context2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new h7(this, s10Var, context2, I, j10, l10, tL_payments_paymentFormStarGift, starGift, j3));
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, s10 s10Var) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.b;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.e6 I = I();
            long j3 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i7 = m10.t0;
                boolean[] zArr = {false};
                e8 e8Var = new e8(this, j3, i7, zArr, s10Var, context2, I, chatInvite, str);
                s2 s2Var = new s2(this, zArr, s10Var);
                org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context2, I, false);
                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new qa(context2, 40, 0, 0), c8.ja.c(-1.0f, -1));
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context2);
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                t8Var.s(chatInvite.color);
                String str2 = chatInvite.title;
                t8Var.A = true;
                t8Var.n = 0;
                t8Var.m = false;
                org.telegram.ui.Components.t8.a(str2, null, null, t8Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    i9Var.j(org.telegram.messenger.gc.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(80.0f), false, null, false), chatInvite.photo), "80_80", t8Var, chatInvite);
                } else {
                    i9Var.setImageDrawable(t8Var);
                }
                frameLayout.addView(i9Var, c8.ja.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i10 = org.telegram.ui.ActionBar.j6.h5;
                org.telegram.ui.ActionBar.q6.x(frameLayout, drawable, i10, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, c8.ja.e(26, 26, 17));
                imageView.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, c8.ja.e(26, 26, 17));
                imageView2.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView2.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                ab abVar = new ab(i7, context2, I);
                c8.na.a(abVar);
                abVar.setOnClickListener(new fa(abVar, 0));
                frameLayout.addView(abVar, c8.ja.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f10.addView(frameLayout, c8.ja.r(-1, ns.C1, 7));
                TextView g10 = org.telegram.messenger.k5.g(context2, 1, 20.0f);
                g10.setTypeface(org.telegram.messenger.g0.o());
                int i11 = org.telegram.ui.ActionBar.j6.j5;
                i20.q(g10, i11, I, null, 2131745012);
                g10.setGravity(17);
                TextView f11 = i20.f(f10, g10, c8.ja.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f11.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(f11, i11, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i12 = tL_starsSubscriptionPricing.period;
                if (i12 == 2592000) {
                    f11.setText(org.telegram.messenger.g0.X2(hd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    f11.setText(org.telegram.messenger.g0.X2(hd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, i12 == 300 ? "5 minutes" : "a minute")));
                }
                f11.setMaxWidth(hi.l3.a(f11.getText(), f11.getPaint()));
                f11.setGravity(17);
                f10.addView(f11, c8.ja.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.q6.U(textView, i11, I);
                    textView.setText(org.telegram.messenger.j6.m(chatInvite.about, textView.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setGravity(17);
                    f10.addView(textView, c8.ja.t(-2, -2, 1, 0, 6, 0, 22));
                }
                hi.d dVar = new hi.d(context2, I, true);
                dVar.i(hd.M0(2131745021, null), false, true);
                f10.addView(dVar, c8.ja.o(-1, 48));
                z70 z70Var = new z70(context2, I);
                z70Var.setText(org.telegram.messenger.g0.U2(hd.M0(2131745020, null), new ai.a(context2, 6)));
                z70Var.setGravity(17);
                z70Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.B6, I);
                org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, I);
                f10.addView(z70Var, c8.ja.t(-1, -2, 49, 14, 14, 14, 6));
                k10.O = f10;
                dVar.setOnClickListener(new ah.g(e8Var, k10, dVar, 7));
                k10.setOnDismissListener(new q9(s2Var, 1));
                k10.Q(i10);
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1() && T2 != null && !org.telegram.messenger.g0.u1(T2)) {
                    k10.a0(T2);
                }
                k10.show();
            }
        }
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final bi.f6 f6Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.e6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new Runnable() { // from class: di.n6
                @Override // java.lang.Runnable
                public final void run() {
                    u8 u8Var = u8.this;
                    boolean z12 = u8Var.e;
                    bi.f6 f6Var2 = f6Var;
                    if (z12) {
                        u8Var.i(starGift, z10, z11, j3, tL_textWithEntities, f6Var2);
                    } else {
                        u8.e("NO_BALANCE");
                        f6Var2.a(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String l10 = org.telegram.messenger.m5.l(this.a, j3);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z10;
        tL_inputInvoiceStarGift.peer = np.s1(this.a).j1(j3);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z11;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = ki.x2.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: di.o6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u8 u8Var = u8.this;
                final bi.f6 f6Var2 = f6Var;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.e6 e6Var = I;
                final String str = l10;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z12 = z10;
                final boolean z13 = z11;
                final long j10 = j3;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.f7
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final bi.f6 f6Var3 = f6Var2;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            u8.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            f6Var3.a(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                        int size = arrayList.size();
                        int i7 = 0;
                        final long j11 = 0;
                        while (i7 < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                            i7++;
                            j11 += tL_labeledPrice.amount;
                        }
                        final u8 u8Var2 = u8.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(u8Var2.a);
                        final Context context4 = context3;
                        final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z15 = z12;
                        final boolean z16 = z13;
                        final long j12 = j10;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: di.n7
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final u8 u8Var3 = u8.this;
                                final bi.f6 f6Var4 = f6Var3;
                                final Context context5 = context4;
                                final org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                                final long j13 = j11;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z17 = z15;
                                final boolean z18 = z16;
                                final long j14 = j12;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.v6
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r11v10 */
                                    /* JADX WARN: Type inference failed for: r11v8 */
                                    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str4;
                                        SpannableStringBuilder spannableStringBuilder;
                                        r80 r80Var;
                                        ?? r11;
                                        u8 u8Var4 = u8.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        bi.f6 f6Var5 = f6Var4;
                                        Context context6 = context5;
                                        org.telegram.ui.ActionBar.e6 e6Var4 = e6Var3;
                                        long j15 = j13;
                                        String str5 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z19 = z17;
                                        boolean z20 = z18;
                                        long j16 = j14;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                                        org.telegram.ui.Components.cc X = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.cc.X() : org.telegram.ui.Components.cc.a0(Q);
                                        boolean z21 = tLObject4 instanceof TLRPC.TL_payments_paymentResult;
                                        int i10 = 1;
                                        if (!z21) {
                                            if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                if (np.s1(u8Var4.a).k7) {
                                                    f6Var5.a(Boolean.FALSE, null);
                                                    u8.c0(context6, e6Var4);
                                                    return;
                                                } else {
                                                    boolean[] zArr = {false};
                                                    bb bbVar = new bb(context6, e6Var4, j15, 6, str5, new o7(u8Var4, zArr, starGift5, z19, z20, j16, tL_textWithEntities5, f6Var5), 0L);
                                                    bbVar.setOnDismissListener(new a3(f6Var5, zArr, i10));
                                                    bbVar.show();
                                                    return;
                                                }
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                f6Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                f6Var5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            } else {
                                                f6Var5.a(Boolean.FALSE, null);
                                                X.Q(R.raw.error, 36, hd.a0(null, null, 2131743878, tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS")).j();
                                                return;
                                            }
                                        }
                                        Utilities.d.c(new i7(u8Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 2));
                                        u8Var4.D = false;
                                        u8Var4.E = true;
                                        u8Var4.G = 0L;
                                        u8Var4.U();
                                        u8Var4.P(j16);
                                        u8Var4.S(true);
                                        f6Var5.a(Boolean.TRUE, null);
                                        org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(u8Var4.a).b();
                                        if (b10 != null && b10.a(j16)) {
                                            np.s1(u8Var4.a).f7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j16, false).apply();
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            str4 = str5;
                                            spannableStringBuilder = null;
                                        } else {
                                            int i11 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i11;
                                            spannableStringBuilder = org.telegram.messenger.g0.X2(hd.H(',', "Gift2SentRemainsLimit", Math.max(0, i11)));
                                            str4 = str5;
                                        }
                                        if (j16 < 0) {
                                            long j17 = -j16;
                                            TLRPC.ChatFull N0 = np.s1(u8Var4.a).N0(j17);
                                            if (N0 != null) {
                                                N0.stargifts_count++;
                                                N0.flags2 |= 262144;
                                                np.s1(u8Var4.a).R3(N0);
                                            }
                                            if (Q instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) Q;
                                                if (profileActivity.a() == j16) {
                                                    uv0 uv0Var = profileActivity.O;
                                                    if (uv0Var != null) {
                                                        uv0Var.P1(true);
                                                        profileActivity.O.k1(14);
                                                        r11 = 0;
                                                        profileActivity.W4(false);
                                                    } else {
                                                        r11 = 0;
                                                    }
                                                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(Q);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String M0 = hd.M0(2131745109, null);
                                                    if (spannableStringBuilder == null) {
                                                        Object[] objArr = new Object[1];
                                                        objArr[r11] = str4;
                                                        spannableStringBuilder = org.telegram.messenger.g0.X2(hd.G((int) j15, "StarsGiftCompletedChannelText", objArr));
                                                    }
                                                    a02.s(document, M0, spannableStringBuilder).k(r11);
                                                }
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", j17);
                                            bundle.putBoolean("open_gifts", true);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                            profileActivity2.whenFullyVisible(new bi.r1(profileActivity2, starGift5, spannableStringBuilder, j15, str4, 6));
                                            Q.presentFragment(profileActivity2);
                                        } else if ((Q instanceof an) && ((an) Q).a() == j16) {
                                            org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(Q);
                                            TLRPC.Document document2 = starGift5.sticker;
                                            String M02 = hd.M0(2131745109, null);
                                            if (spannableStringBuilder == null) {
                                                spannableStringBuilder = org.telegram.messenger.g0.X2(hd.G((int) j15, "StarsGiftCompletedText", new Object[0]));
                                            }
                                            a03.s(document2, M02, spannableStringBuilder).k(true);
                                        } else {
                                            ns f10 = ns.f(u8Var4.a);
                                            int i12 = ns.v;
                                            Long valueOf = Long.valueOf(j16);
                                            Boolean bool = Boolean.FALSE;
                                            f10.k(i12, valueOf, bool);
                                            ns.f(u8Var4.a).k(ns.u, Long.valueOf(j16), bool);
                                            an ua2 = an.ua(j16);
                                            ua2.whenFullyVisible(new f2(ua2, starGift5, spannableStringBuilder, j15, 5));
                                            Q.presentFragment(ua2);
                                        }
                                        np.s1(u8Var4.a).f7.edit().putBoolean("show_gift_for_" + j16, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j16, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || (r80Var = launchActivity.w0) == null) {
                                            return;
                                        }
                                        r80Var.c(true);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public final void i0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f.equals(starsAmount);
        int i7 = ns.y3;
        int i10 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            ns.f(i10).k(i7, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            ns.f(i10).k(i7, new Object[0]);
        }
    }

    public final boolean j() {
        if (!this.b) {
            return false;
        }
        org.telegram.messenger.t0.u();
        if (!org.telegram.messenger.r2.a()) {
            org.telegram.messenger.t0.r();
            TL_stars.StarsAmount p10 = p();
            if (p10.nanos == 0 && p10.amount == 0) {
                return false;
            }
        }
        return true;
    }

    public final void j0(final gj gjVar, final long j3, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (gjVar == null) {
            runnable.run();
            return;
        }
        final long B0 = gj.B0(gjVar.k);
        final int e12 = gjVar.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) gjVar.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i7 = this.a;
        tL_messages_editMessage.peer = np.s1(i7).j1(B0);
        int i10 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i10;
        tL_messages_editMessage.schedule_date = gjVar.k.date;
        tL_messages_editMessage.id = e12;
        tL_messages_editMessage.flags = i10 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j3;
        int i11 = 0;
        while (i11 < tL_messageMediaPaidMedia2.extended_media.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i11);
            if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
                runnable.run();
                return;
            }
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.id = tL_inputDocument;
                    tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaDocument);
                }
            }
            i11++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: di.z7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new f8(u8.this, tLObject, runnable, tL_error, z10, B0, e12, gjVar, j3));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j3) {
        TL_stars.StarGift starGift;
        int i7 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i7 >= longSparseArray.size()) {
                return null;
            }
            l8 l8Var = (l8) longSparseArray.valueAt(i7);
            for (int i10 = 0; i10 < l8Var.l.size(); i10++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) l8Var.l.get(i10);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.id == j3) {
                    return savedStarGift;
                }
            }
            i7++;
        }
    }

    public final TL_stars.StarsAmount p() {
        return q(null, true, false);
    }

    public final TL_stars.StarsAmount q(Runnable runnable, boolean z10, boolean z11) {
        if (((!this.e || System.currentTimeMillis() - this.c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new bi.v2(9, this, runnable));
        }
        if (!z10 || this.g <= 0) {
            return this.f;
        }
        cg.a m10 = cg.a.m(this.f);
        return cg.a.g(Math.max(0L, m10.a() - this.g), m10.a).o();
    }

    public final void r(Runnable runnable) {
        q(runnable, true, false);
    }

    public final cg.a s() {
        cg.a l10 = cg.a.l(p());
        if (l10 == null) {
            return cg.a.i(0L, this.b ? cg.b.b : cg.b.a);
        }
        return l10;
    }

    public final ArrayList u() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new p7(this, 3));
        return this.m;
    }

    public final ArrayList v() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new p7(this, 4));
        return this.p;
    }

    public final ArrayList z() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new p7(this, 2));
        return this.j;
    }
}
