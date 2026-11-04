package ci;

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
import b8.mf;
import b8.pf;
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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c00;
import org.telegram.messenger.e20;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.s70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.mv0;
import org.telegram.ui.p80;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e9 {
    public static volatile e9[][] S = (e9[][]) Array.newInstance((Class<?>) e9.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public c9 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public z8 N;
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
        for (int i3 = 0; i3 < 2; i3++) {
            for (int i10 = 0; i10 < 4; i10++) {
                T[i3][i10] = new Object();
            }
        }
    }

    public e9(int i3, boolean z10) {
        this.a = i3;
        this.b = z10;
    }

    public static org.telegram.ui.ActionBar.e6 I() {
        org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
        if (T2 != null) {
            return T2.getResourceProvider();
        }
        return null;
    }

    public static e9 L(int i3) {
        return y(i3, true);
    }

    public static boolean T(int i3, dg.a aVar) {
        return aVar == null || x(i3, aVar.a).s().b >= aVar.b;
    }

    public static void a(e9 e9Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = e9Var.I;
        ArrayList arrayList2 = e9Var.J;
        int i3 = e9Var.a;
        ArrayList arrayList3 = e9Var.H;
        e9Var.C = false;
        e9Var.D = true;
        if (!(starGifts instanceof TL_stars.TL_starGifts)) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i10 = e9Var.F;
                long currentTimeMillis = System.currentTimeMillis();
                e9Var.G = currentTimeMillis;
                qr a02 = qr.a0(i3);
                a02.a.c(new f8(i10, 0, currentTimeMillis, a02, arrayList3));
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        hp.s1(i3).Y3(tL_starGifts.users, false);
        hp.s1(i3).S3(tL_starGifts.chats, false);
        qr.a0(i3).m1(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList3.clear();
        arrayList3.addAll(tL_starGifts.gifts);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new cg.d(4)), new cg.d(5)));
        arrayList.clear();
        arrayList.addAll(arrayList3);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new cg.d(6)));
        e9Var.F = tL_starGifts.hash;
        e9Var.G = System.currentTimeMillis();
        hs.f(i3).k(hs.F3, new Object[0]);
        ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
        int i11 = e9Var.F;
        long j10 = e9Var.G;
        qr a03 = qr.a0(i3);
        a03.a.c(new f8(i11, 0, j10, a03, arrayList4));
    }

    public static /* synthetic */ void b(e9 e9Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i3 = e9Var.a;
        hp.s1(i3).Y3(arrayList2, true);
        hp.s1(i3).S3(arrayList3, true);
        e9Var.E = true;
        ArrayList arrayList4 = e9Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = e9Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new cg.d(1)), new cg.d(2)));
        ArrayList arrayList6 = e9Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new cg.d(3)));
        e9Var.F = num.intValue();
        e9Var.G = l10.longValue();
        e9Var.C = false;
        hs.f(i3).k(hs.F3, new Object[0]);
        e9Var.U();
    }

    public static void c0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = bd.M0(2131745070, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = bd.M0(2131745071, null);
        k2.p1.B(null, 2131747839, alertDialog$Builder, null);
    }

    public static void e(String str) {
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        ((Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.fc.X() : org.telegram.ui.Components.fc.a0(Q)).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, str)).j();
    }

    public static boolean k(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i3 = savedStarGift.flags;
        if ((i3 & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            return ((i3 & 8) == 0 || (savedStarGift2.flags & 8) == 0 || savedStarGift.msg_id != savedStarGift2.msg_id) ? false : true;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute l(ArrayList arrayList, Class cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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

    public static Context t(org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var != null && d2Var.getContext() != null) {
            return d2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.K1;
        }
        if (org.telegram.messenger.t0.b != null) {
            return org.telegram.messenger.t0.b;
        }
        return null;
    }

    public static e9 w(int i3) {
        return y(i3, false);
    }

    public static e9 x(int i3, dg.b bVar) {
        return y(i3, bVar == dg.b.b);
    }

    public static e9 y(int i3, boolean z10) {
        e9 e9Var;
        e9 e9Var2 = S[z10 ? 1 : 0][i3];
        if (e9Var2 != null) {
            return e9Var2;
        }
        synchronized (T[z10 ? 1 : 0][i3]) {
            try {
                e9Var = S[z10 ? 1 : 0][i3];
                if (e9Var == null) {
                    e9[] e9VarArr = S[z10 ? 1 : 0];
                    e9 e9Var3 = new e9(i3, z10);
                    e9VarArr[i3] = e9Var3;
                    e9Var = e9Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e9Var;
    }

    public final long A(x8 x8Var, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l10;
        c9 c9Var = this.B;
        if (c9Var != null && c9Var.a.equals(x8Var) && (l10 = this.B.n) != null) {
            return l10.longValue();
        }
        Long l11 = null;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                TLRPC.MessageReactor messageReactor = arrayList.get(i3);
                i3++;
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
        Long y12 = hp.s1(this.a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final long B(zi ziVar) {
        Long l10;
        c9 c9Var = this.B;
        if (c9Var != null && c9Var.a.equals(x8.b(ziVar)) && (l10 = this.B.n) != null) {
            return l10.longValue();
        }
        Long A1 = ziVar == null ? null : ziVar.A1();
        if (A1 != null) {
            return A1.longValue();
        }
        Long y12 = hp.s1(this.a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, u10 u10Var) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i3 = this.a;
        getpaidmessagesrevenue.user_id = hp.s1(i3).o1(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = hp.s1(i3).j1(j11);
        }
        ConnectionsManager.getInstance(i3).sendRequest(getpaidmessagesrevenue, new e8(u10Var, 0));
    }

    public final long D(int i3, long j10) {
        c9 c9Var = this.B;
        if (c9Var == null) {
            return 0L;
        }
        x8 x8Var = c9Var.a;
        if (x8Var.a == j10 && x8Var.b == i3 && c9Var.l) {
            return c9Var.h;
        }
        return 0L;
    }

    public final long E(zi ziVar) {
        TLRPC.Message message;
        if (ziVar == null || (message = ziVar.k) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || ziVar.l3()) && ziVar.k.fwd_from != null) ? D(ziVar.k.fwd_from.saved_from_msg_id, ziVar.Z0()) : D(ziVar.f1(), zi.B0(ziVar.k));
    }

    public final s8 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        s8 s8Var = (s8) longSparseArray.get(j10);
        if (s8Var != null || !z10) {
            return s8Var;
        }
        s8 s8Var2 = new s8(this.a, j10);
        longSparseArray.put(j10, s8Var2);
        return s8Var2;
    }

    public final v8 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        v8 v8Var = (v8) longSparseArray.get(j10);
        if (v8Var != null || !z10) {
            return v8Var;
        }
        v8 v8Var2 = new v8(this.a, j10, true);
        longSparseArray.put(j10, v8Var2);
        return v8Var2;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, u10 u10Var) {
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        org.telegram.ui.ActionBar.e6 I = I();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            r(new l2(this, u10Var, starGift, j10));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = hp.s1(this.a).j1(j10);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = ii.a3.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new ai.f3(8, this, u10Var));
    }

    public final TL_stars.StarGift J(long j10) {
        U();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i3 >= arrayList.size()) {
                return null;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i3);
            if (starGift.id == j10) {
                return starGift;
            }
            i3++;
        }
    }

    public final void K(long j10, u10 u10Var) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j10));
        if (stargiftupgradepreview != null) {
            u10Var.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j10;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new u2(this, j10, u10Var, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, u10 u10Var) {
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, org.telegram.messenger.t0.b, null);
        s1Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new ai.q1(this, s1Var, inputSavedStarGift, u10Var, 4));
    }

    public final boolean N(int i3) {
        return this.e && !this.q[i3].isEmpty();
    }

    public final void O() {
        this.e = false;
        p();
        this.e = true;
    }

    public final void P(long j10) {
        v8 G = G(j10, false);
        if (G != null) {
            G.j(false);
        }
        s8 s8Var = (s8) this.K.get(j10);
        if (s8Var != null) {
            s8Var.g();
        }
    }

    public final void Q(TLRPC.UserFull userFull) {
        if (userFull == null) {
            return;
        }
        long j10 = userFull.id;
        v8 G = G(j10, false);
        if (G != null && G.n != userFull.stargifts_count) {
            G.j(false);
        }
        s8 s8Var = (s8) this.K.get(j10);
        if (s8Var != null) {
            s8Var.g();
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
        for (int i3 = 0; i3 < 3; i3++) {
            boolean[] zArr = this.t;
            if (!zArr[i3]) {
                this.q[i3].clear();
                this.s[i3] = null;
                zArr[i3] = false;
                this.u[i3] = false;
                if (z10) {
                    W(i3);
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
            int i3 = this.a;
            if (z10) {
                int i10 = this.F;
                ai.v2 v2Var = new ai.v2(this, 11);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i10;
                ConnectionsManager.getInstance(i3).sendRequest(getstargifts, new d0(v2Var, 2));
                return;
            }
            a1.c cVar = new a1.c(this, 16);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            qr a02 = qr.a0(i3);
            a02.a.c(new ai.t6(a02, arrayList3, arrayList2, arrayList, cVar, 4));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new x7(this, 1));
    }

    public final void W(int i3) {
        boolean[] zArr = this.t;
        if (zArr[i3] || this.u[i3]) {
            return;
        }
        zArr[i3] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = this.b;
        tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
        tL_payments_getStarsTransactions.inbound = i3 == 1;
        tL_payments_getStarsTransactions.outbound = i3 == 2;
        String str = this.s[i3];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new a2(this, i3, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03c3  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(zi ziVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, u10 u10Var) {
        long j10;
        String str;
        boolean z10;
        org.telegram.ui.ActionBar.t2 t2Var;
        k8 k8Var;
        l8 l8Var;
        ViewGroup viewGroup;
        zi ziVar2;
        int i3;
        float f10;
        ?? r22;
        int i10;
        long j11;
        int i11;
        long j12;
        TLRPC.Message message;
        boolean z11;
        String str2;
        int i12;
        String G;
        String G2;
        String str3;
        char c2;
        String G3;
        boolean z12;
        TLRPC.User a22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        int[] iArr;
        String M0;
        TLRPC.Message message2;
        int i13;
        int i14;
        cb cbVar;
        FrameLayout frameLayout;
        org.telegram.messenger.ac acVar;
        boolean z13;
        org.telegram.messenger.ac acVar2;
        k8 k8Var2;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        hp.s1(this.a).Y3(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.e6 I = I();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            r(new ai.w1(this, (Object) runnable, ziVar, inputInvoice, tL_payments_paymentFormStars, u10Var, 6));
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        int i15 = 0;
        long j13 = 0;
        while (i15 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i15);
            i15++;
            j13 += tL_labeledPrice.amount;
        }
        if (ziVar == null || ziVar.D != 29) {
            j10 = tL_payments_paymentFormStars.bot_id;
        } else {
            TLRPC.Message message3 = ziVar.k;
            TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
            j10 = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? zi.B0(message3) : org.telegram.messenger.m5.o(peer2);
        }
        long j14 = j10;
        if (j14 >= 0) {
            TLRPC.User a23 = hp.s1(this.a).a2(Long.valueOf(j14));
            str = l10.p(a23);
            z10 = !l10.t(a23);
        } else {
            TLRPC.Chat M02 = hp.s1(this.a).M0(Long.valueOf(-j14));
            str = M02 == null ? "" : M02.title;
            z10 = false;
        }
        String str4 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i16 = tL_payments_paymentFormStars.invoice.subscription_period;
        long j15 = j13;
        boolean[] zArr = {false};
        int i17 = this.a;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        k8 k8Var3 = new k8(this, j15, zArr, u10Var, context2, I, z10, str, ziVar, inputInvoice, tL_payments_paymentFormStars, i16, j14);
        l8 l8Var2 = new l8(this, zArr, u10Var);
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context2, I, false);
        TLRPC.User a24 = hp.s1(i17).a2(Long.valueOf(j14));
        LinearLayout f11 = org.telegram.messenger.k5.f(context2, 1);
        f11.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.addView(new bb(context2, 40, 0, 0), mf.c(-1.0f, -1));
        if (ziVar == null || (message2 = ziVar.k) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            t2Var = l10;
            k8Var = k8Var3;
            l8Var = l8Var2;
            viewGroup = frameLayout2;
            ziVar2 = ziVar;
            i3 = i16;
            f10 = 20.0f;
            if (webDocument != null) {
                FrameLayout frameLayout3 = new FrameLayout(context2);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context2);
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
                k9Var.p(org.telegram.messenger.ac.p(e20.c(webDocument)), "80_80", null, null);
                frameLayout3.addView(k9Var, mf.e(80, 80, 48));
                viewGroup.addView(frameLayout3, mf.e(80, 87, 17));
                TextView textView = new TextView(context2);
                textView.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
                r22 = 1;
                textView.setTextSize(1, 13.0f);
                i10 = -1;
                textView.setTextColor(-1);
                j11 = j15;
                textView.setText(wb.U0(k2.p1.l((int) j15, ',', new StringBuilder("XTR ")), 0.85f, null));
                i11 = 0;
                textView.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
                textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(16.0f), -1133566));
                FrameLayout frameLayout4 = new FrameLayout(context2);
                int L = org.telegram.messenger.g0.L(20.0f);
                int i18 = org.telegram.ui.ActionBar.k6.h5;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i18, I));
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
                frameLayout4.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(frameLayout4, d02, N, null, I);
                frameLayout4.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                frameLayout4.addView(textView, mf.r(-2, 16, hs.E1));
                frameLayout3.addView(frameLayout4, mf.a(-2.0f, 18.66f, 81));
                lb lbVar = new lb(i17, context2, I);
                pf.a(lbVar);
                lbVar.setOnClickListener(new qa(lbVar, r22));
                viewGroup.addView(lbVar, mf.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f11.addView(viewGroup, mf.r(i10, hs.C1, 7));
                TextView g7 = org.telegram.messenger.k5.g(context2, r22, f10);
                g7.setTypeface(org.telegram.messenger.g0.o());
                int i19 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.V(g7, i19, I);
                if (i3 <= 0) {
                    if (webDocument != null) {
                        M0 = str4;
                        iArr = null;
                    } else {
                        iArr = null;
                        M0 = bd.M0(2131745125, null);
                    }
                    g7.setText(org.telegram.messenger.i6.m(M0, g7.getPaint().getFontMetricsInt(), i11, iArr, i11));
                } else {
                    g7.setText(org.telegram.messenger.i6.m(webDocument != null ? str4 : bd.M0(2131745132, null), g7.getPaint().getFontMetricsInt(), i11, null, i11));
                }
                hs.i(g7);
                g7.setGravity(17);
                f11.addView(g7, mf.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                if (webDocument != null) {
                    LinearLayout f12 = org.telegram.messenger.k5.f(context2, i11);
                    int L2 = org.telegram.messenger.g0.L(28.0f);
                    int i20 = org.telegram.ui.ActionBar.k6.a7;
                    Drawable d03 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i20, I));
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i20);
                    f12.setBackground(d03);
                    org.telegram.ui.ActionBar.r6.k(f12, d03, N2, null, I);
                    org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context2);
                    k9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                    org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                    u8Var.r(a24);
                    k9Var2.e(a24, u8Var);
                    f12.addView(k9Var2, mf.o(28, 28));
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(r22, 13.0f);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.G6, I);
                    textView2.setText(l10.p(a24));
                    f12.addView(textView2, mf.t(-2, -2, 16, 6, 0, 10, 0));
                    f11.addView(f12, mf.t(-2, 28, 1, 0, 8, 0, 2));
                }
                TextView textView3 = new TextView(context2);
                textView3.setTextSize(r22, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView3, i19, I);
                if (ziVar2 == null && (message = ziVar2.k) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    long B0 = zi.B0(message);
                    TLRPC.Message message4 = ziVar2.k;
                    if (message4 != null && (messageFwdHeader = message4.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        B0 = org.telegram.messenger.m5.o(peer);
                    }
                    if (B0 < 0 && ziVar2.Z0() > 0 && (a22 = hp.s1(i17).a2(Long.valueOf(ziVar2.Z0()))) != null && a22.bot) {
                        B0 = a22.id;
                    }
                    if (B0 >= 0) {
                        TLRPC.User a25 = hp.s1(i17).a2(Long.valueOf(B0));
                        str2 = l10.p(a25);
                        z11 = (a25 == null || !a25.bot) ? i11 : r22;
                    } else {
                        TLRPC.Chat M03 = hp.s1(i17).M0(Long.valueOf(-B0));
                        String str5 = M03 != null ? M03.title : "";
                        z11 = i11;
                        str2 = str5;
                    }
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) ziVar2.k.media;
                    int i21 = i11;
                    int i22 = i21;
                    int i23 = i22;
                    while (i21 < tL_messageMediaPaidMedia.extended_media.size()) {
                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i21);
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                            if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                z12 = r22;
                            }
                            z12 = i11;
                        } else {
                            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                z12 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                            }
                            z12 = i11;
                        }
                        if (z12) {
                            i22++;
                        } else {
                            i23++;
                        }
                        i21++;
                    }
                    if (i22 == 0) {
                        str3 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                        long j16 = j11;
                        int i24 = (int) j16;
                        Object[] objArr = new Object[2];
                        objArr[i11] = i23 == r22 ? bd.M0(2131745141, null) : bd.G(i23, "StarsConfirmPurchaseMedia_Photos", new Object[i11]);
                        objArr[r22] = str2;
                        G2 = bd.G(i24, str3, objArr);
                        j12 = j16;
                    } else {
                        j12 = j11;
                        if (i23 == 0) {
                            str3 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                            int i25 = (int) j12;
                            if (i22 == r22) {
                                G3 = bd.M0(2131745140, null);
                                c2 = 0;
                            } else {
                                c2 = 0;
                                G3 = bd.G(i22, "StarsConfirmPurchaseMedia_Videos", new Object[0]);
                            }
                            Object[] objArr2 = new Object[2];
                            objArr2[c2] = G3;
                            objArr2[r22] = str2;
                            G2 = bd.G(i25, str3, objArr2);
                        } else {
                            String str6 = z11 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                            int i26 = (int) j12;
                            if (i23 == r22) {
                                G = bd.M0(2131745141, null);
                                i12 = 0;
                            } else {
                                i12 = 0;
                                G = bd.G(i23, "StarsConfirmPurchaseMedia_Photos", new Object[0]);
                            }
                            String M04 = i22 == r22 ? bd.M0(2131745140, null) : bd.G(i22, "StarsConfirmPurchaseMedia_Videos", new Object[i12]);
                            Object[] objArr3 = new Object[3];
                            objArr3[i12] = G;
                            objArr3[r22] = M04;
                            objArr3[2] = str2;
                            G2 = bd.G(i26, str6, objArr3);
                        }
                    }
                    textView3.setText(org.telegram.messenger.g0.X2(G2));
                } else {
                    j12 = j11;
                    if (i3 <= 0) {
                        String p10 = l10.p(a24);
                        Object[] objArr4 = new Object[2];
                        objArr4[0] = str4;
                        objArr4[r22] = p10;
                        textView3.setText(org.telegram.messenger.g0.X2(bd.K("StarsConfirmSubscriptionText2", (int) j12, ',', objArr4)));
                    } else {
                        String p11 = l10.p(a24);
                        Object[] objArr5 = new Object[2];
                        objArr5[0] = str4;
                        objArr5[r22] = p11;
                        textView3.setText(org.telegram.messenger.g0.X2(bd.K("StarsConfirmPurchaseText2", (int) j12, ',', objArr5)));
                    }
                }
                textView3.setMaxWidth(gi.l3.a(textView3.getText(), textView3.getPaint()));
                textView3.setGravity(17);
                f11.addView(textView3, mf.t(-2, -2, 1, 0, 6, 0, 18));
                gi.d dVar = new gi.d(context2, I, r22);
                if (i3 <= 0) {
                    dVar.i(wb.T0(org.telegram.messenger.g0.X2(bd.H(',', "StarsConfirmSubscriptionButton", (int) j12))), false, r22);
                } else {
                    dVar.i(wb.T0(org.telegram.messenger.g0.X2(bd.H(',', "StarsConfirmPurchaseButton", (int) j12))), false, r22);
                }
                f11.addView(dVar, mf.c(48.0f, -1));
                s70 s70Var = new s70(context2, I);
                org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.z6, I);
                org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, I);
                s70Var.setTextSize(r22, 14.0f);
                s70Var.setText(org.telegram.messenger.g0.U2(bd.M0(i3 <= 0 ? 2131745129 : 2131745136, null), new ai.s1(context2, 6)));
                s70Var.setGravity(17);
                f11.addView(s70Var, mf.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                t2Var2.O = f11;
                dVar.setOnClickListener(new ai.h(k8Var, t2Var2, dVar, 8));
                t2Var2.setOnDismissListener(new ba(l8Var, 2));
                t2Var2.N();
                t2Var2.show();
            }
            org.telegram.ui.Components.k9 k9Var3 = new org.telegram.ui.Components.k9(context2);
            k9Var3.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
            org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            u8Var2.r(a24);
            k9Var3.e(a24, u8Var2);
            viewGroup.addView(k9Var3, mf.e(80, 80, 17));
        } else {
            cb cbVar2 = new cb(context2);
            cbVar2.I = new Path();
            cbVar2.J = new RectF();
            cbVar2.K = k2.p1.g(context2, R.drawable.large_locked_post);
            cbVar2.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) ziVar.k.media;
            if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                t2Var = l10;
                l8Var = l8Var2;
                viewGroup = frameLayout2;
                k8Var = k8Var3;
                ziVar2 = ziVar;
                i3 = i16;
                i13 = 17;
                i14 = 80;
                f10 = 20.0f;
            } else {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                    acVar2 = org.telegram.messenger.ac.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, ziVar.k);
                    cbVar = cbVar2;
                    l8Var = l8Var2;
                    frameLayout = frameLayout2;
                    k8Var2 = k8Var3;
                    acVar = null;
                    z13 = true;
                } else {
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            cbVar = cbVar2;
                            l8Var = l8Var2;
                            frameLayout = frameLayout2;
                            acVar = null;
                            z13 = true;
                            acVar2 = org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(messageMedia.photo.sizes, org.telegram.messenger.g0.L(80.0f), true, null, false), messageMedia.photo);
                        } else {
                            cbVar = cbVar2;
                            l8Var = l8Var2;
                            frameLayout = frameLayout2;
                            acVar = null;
                            z13 = true;
                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                acVar2 = org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(messageMedia.document.thumbs, org.telegram.messenger.g0.L(80.0f), true, null, false), messageMedia.document);
                            }
                        }
                        k8Var2 = k8Var3;
                    } else {
                        cbVar = cbVar2;
                        l8Var = l8Var2;
                        frameLayout = frameLayout2;
                        acVar = null;
                        z13 = true;
                    }
                    acVar2 = acVar;
                    k8Var2 = k8Var3;
                }
                k8Var = k8Var2;
                viewGroup = frameLayout;
                i13 = 17;
                f10 = 20.0f;
                cbVar2 = cbVar;
                t2Var = l10;
                i3 = i16;
                i14 = 80;
                cbVar2.m(acVar2, "80_80_b2", null, null, null, ziVar);
                ziVar2 = ziVar;
            }
            viewGroup.addView(cbVar2, mf.e(i14, i14, i13));
        }
        j11 = j15;
        r22 = 1;
        i10 = -1;
        i11 = 0;
        lb lbVar2 = new lb(i17, context2, I);
        pf.a(lbVar2);
        lbVar2.setOnClickListener(new qa(lbVar2, r22));
        viewGroup.addView(lbVar2, mf.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        f11.addView(viewGroup, mf.r(i10, hs.C1, 7));
        TextView g72 = org.telegram.messenger.k5.g(context2, r22, f10);
        g72.setTypeface(org.telegram.messenger.g0.o());
        int i192 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(g72, i192, I);
        if (i3 <= 0) {
        }
        hs.i(g72);
        g72.setGravity(17);
        f11.addView(g72, mf.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
        if (webDocument != null) {
        }
        TextView textView32 = new TextView(context2);
        textView32.setTextSize(r22, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView32, i192, I);
        if (ziVar2 == null) {
        }
        j12 = j11;
        if (i3 <= 0) {
        }
        textView32.setMaxWidth(gi.l3.a(textView32.getText(), textView32.getPaint()));
        textView32.setGravity(17);
        f11.addView(textView32, mf.t(-2, -2, 1, 0, 6, 0, 18));
        gi.d dVar2 = new gi.d(context2, I, r22);
        if (i3 <= 0) {
        }
        f11.addView(dVar2, mf.c(48.0f, -1));
        s70 s70Var2 = new s70(context2, I);
        org.telegram.ui.ActionBar.r6.V(s70Var2, org.telegram.ui.ActionBar.k6.z6, I);
        org.telegram.ui.ActionBar.r6.H(s70Var2, org.telegram.ui.ActionBar.k6.Uc, I);
        s70Var2.setTextSize(r22, 14.0f);
        s70Var2.setText(org.telegram.messenger.g0.U2(bd.M0(i3 <= 0 ? 2131745129 : 2131745136, null), new ai.s1(context2, 6)));
        s70Var2.setGravity(17);
        f11.addView(s70Var2, mf.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
        org.telegram.ui.ActionBar.t2 t2Var22 = t2Var;
        t2Var22.O = f11;
        dVar2.setOnClickListener(new ai.h(k8Var, t2Var22, dVar2, 8));
        t2Var22.setOnDismissListener(new ba(l8Var, 2));
        t2Var22.N();
        t2Var22.show();
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, n10 n10Var) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = org.telegram.messenger.t0.b;
        org.telegram.ui.ActionBar.e6 I = I();
        if (context == null) {
            return;
        }
        long j10 = chatInvite.subscription_pricing.amount;
        String str2 = chatInvite.title;
        TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
        tL_inputInvoiceChatInviteSubscription.hash = str;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new y6(this, n10Var, j10, str2, context, I, chatInvite, str));
    }

    public final void Z(final zi ziVar, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final u10 u10Var) {
        long j10;
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
        final long j11 = 0;
        int i3 = 0;
        while (i3 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
            i3++;
            j11 += tL_labeledPrice.amount;
        }
        if (ziVar != null) {
            TLRPC.Message message = ziVar.k;
            j10 = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? zi.B0(message) : org.telegram.messenger.m5.o(peer);
            if (j10 < 0 && ziVar.Z0() > 0 && (a22 = hp.s1(this.a).a2(Long.valueOf(ziVar.Z0()))) != null && a22.bot) {
                j10 = a22.id;
            }
        } else {
            j10 = tL_payments_paymentFormStars.bot_id;
        }
        final long j12 = j10;
        if (j12 >= 0) {
            str = l10.p(hp.s1(this.a).a2(Long.valueOf(j12)));
        } else {
            TLRPC.Chat M0 = hp.s1(this.a).M0(Long.valueOf(-j12));
            str = M0 == null ? "" : M0.title;
        }
        final String str2 = str;
        final String str3 = tL_payments_paymentFormStars.title;
        final int i10 = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: ci.g7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final e9 e9Var = e9.this;
                final u10 u10Var2 = u10Var;
                final zi ziVar2 = ziVar;
                final Context context2 = context;
                final long j13 = j11;
                final String str4 = str2;
                final int i11 = i10;
                final String str5 = str3;
                final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                final long j14 = j12;
                final org.telegram.ui.ActionBar.e6 e6Var = I;
                final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.k7
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
                        p80 p80Var;
                        TLRPC.Message message2;
                        e9 e9Var2 = e9.this;
                        TLObject tLObject2 = tLObject;
                        u10 u10Var3 = u10Var2;
                        zi ziVar3 = ziVar2;
                        Context context3 = context2;
                        long j15 = j13;
                        String str6 = str4;
                        int i12 = i11;
                        String str7 = str5;
                        TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                        long j16 = j14;
                        TLRPC.TL_error tL_error2 = tL_error;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                        org.telegram.ui.Components.fc X = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.fc.X() : org.telegram.ui.Components.fc.a0(Q);
                        boolean z12 = tLObject2 instanceof TLRPC.TL_payments_paymentResult;
                        int i13 = 0;
                        if (!z12) {
                            if (tL_error2 != null) {
                                z10 = false;
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (hp.s1(e9Var2.a).j7) {
                                        u10Var3.a(Boolean.FALSE);
                                        e9.c0(context3, e6Var2);
                                        return;
                                    } else {
                                        boolean[] zArr = {false};
                                        mb mbVar = new mb(context3, e6Var2, j15, 0, str6, new ai.w1(e9Var2, (Object) zArr, ziVar3, inputInvoice3, tL_payments_paymentFormStars3, u10Var3, 4), j16);
                                        mbVar.setOnDismissListener(new r7(u10Var3, zArr));
                                        mbVar.show();
                                        return;
                                    }
                                }
                            } else {
                                z10 = false;
                            }
                            if (tL_error2 == null || !"FORM_EXPIRED".equals(tL_error2.text)) {
                                org.telegram.ui.Components.fc fcVar = X;
                                u10Var3.a(Boolean.FALSE);
                                fcVar.Q(R.raw.error, 36, bd.a0(null, null, 2131743888, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                if (ziVar3 != null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia.peer = hp.s1(e9Var2.a).j1(j16);
                                    tL_messages_getExtendedMedia.id.add(Integer.valueOf(ziVar3.f1()));
                                    ConnectionsManager.getInstance(e9Var2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            JSONObject u10 = ii.a3.u(e6Var2, z10);
                            if (u10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                tL_dataJSON.data = u10.toString();
                                tL_payments_getPaymentForm.flags |= 1;
                            }
                            tL_payments_getPaymentForm.invoice = inputInvoice3;
                            ConnectionsManager.getInstance(e9Var2.a).sendRequest(tL_payments_getPaymentForm, new s7(e9Var2, ziVar3, inputInvoice3, u10Var3, X, 0));
                            return;
                        }
                        u10Var3.a(Boolean.TRUE);
                        Utilities.d.c(new q7(e9Var2, (TLRPC.TL_payments_paymentResult) tLObject2, i13));
                        if (ziVar3 != null && (message2 = ziVar3.k) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            Drawable g7 = k2.p1.g(context3, R.drawable.star_small_inner);
                            String M02 = bd.M0(2131745098, null);
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.G((int) j15, "StarsMediaPurchaseCompletedInfo", str6));
                            X.getClass();
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(X.W(), X.c);
                            xbVar.a.setImageDrawable(g7);
                            xbVar.b.setText(M02);
                            xbVar.c.setText(X2);
                            X.b(xbVar, 2750).j();
                        } else {
                            if (i12 <= 0) {
                                z11 = true;
                                X.I(R.raw.stars_send, bd.M0(2131745062, null), org.telegram.messenger.g0.X2(bd.G((int) j15, "StarsPurchaseCompletedInfo", str7, str6))).j();
                                launchActivity = LaunchActivity.K1;
                                if (launchActivity != null && (p80Var = launchActivity.y0) != null) {
                                    p80Var.c(z11);
                                }
                                if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                    e9Var2.S(true);
                                }
                                if (ziVar3 == null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia2.peer = hp.s1(e9Var2.a).j1(j16);
                                    tL_messages_getExtendedMedia2.id.add(Integer.valueOf(ziVar3.f1()));
                                    ConnectionsManager.getInstance(e9Var2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                    return;
                                }
                                return;
                            }
                            X.I(R.raw.stars_send, bd.M0(2131745164, null), org.telegram.messenger.g0.X2(bd.G((int) j15, "StarsBotSubscriptionCompletedInfo", str7, str6))).j();
                        }
                        z11 = true;
                        launchActivity = LaunchActivity.K1;
                        if (launchActivity != null) {
                            p80Var.c(z11);
                        }
                        if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                        }
                        e9Var2.S(true);
                        if (ziVar3 == null) {
                        }
                    }
                });
            }
        });
    }

    public final void a0(long j10, long j11, boolean z10) {
        int i3 = this.a;
        c00 c00Var = hp.s1(i3).q7;
        TLRPC.TL_forumTopic f10 = c00Var.f(j10, j11);
        if (f10 != null) {
            f10.nopaid_messages_exception = z10;
            a0.h hVar = c00Var.a;
            if (((ArrayList) hVar.f(j10)) != null) {
                c00Var.getMessagesStorage().C1(c00Var.getConnectionsManager().getCurrentTime(), -j10, (List) hVar.f(j10), true);
            }
            hs.f(i3).k(hs.N3, Long.valueOf(j11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c9 b0(final zi ziVar, final wm wmVar, final long j10, boolean z10, boolean z11, final Long l10) {
        String str;
        long j11;
        final e9 e9Var;
        zi ziVar2;
        TLRPC.ReactionCount reactionCount;
        boolean z12;
        String str2;
        x8 b10 = x8.b(ziVar);
        int i3 = this.a;
        e9 y9 = y(i3, false);
        Context t10 = t(wmVar);
        if (t10 == null) {
            return null;
        }
        str = "";
        if (z11 && y9.e && y9.q(null, false, false).amount <= 0) {
            long a10 = wmVar.a();
            if (a10 >= 0) {
                str = l10.k(wmVar.getMessagesController().a2(Long.valueOf(a10)));
            } else {
                TLRPC.Chat M0 = wmVar.getMessagesController().M0(Long.valueOf(-a10));
                if (M0 != null) {
                    str = M0.title;
                }
            }
            final int i10 = 0;
            new mb(t10, wmVar.getResourceProvider(), j10, 5, str, new Runnable(this) { // from class: ci.y7
                public final /* synthetic */ e9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.b0(ziVar, wmVar, j10, true, true, l10);
                            break;
                        default:
                            this.b.b0(ziVar, wmVar, j10, true, true, l10);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        c9 c9Var = this.B;
        if (c9Var == null || !c9Var.a.equals(b10)) {
            c9 c9Var2 = this.B;
            if (c9Var2 != null) {
                c9Var2.b();
            }
            ConnectionsManager.getInstance(i3).getCurrentTime();
            j11 = 0;
            e9Var = this;
            c9 c9Var3 = new c9(e9Var, b10, ziVar, wmVar, z10);
            e9Var.B = c9Var3;
            c9Var3.n = l10;
        } else {
            j11 = 0;
            e9Var = this;
        }
        if (e9Var.B.h + j10 > hp.s1(i3).Z5) {
            e9Var.B.b();
            ConnectionsManager.getInstance(i3).getCurrentTime();
            e9Var.B = new c9(e9Var, b10, ziVar, wmVar, z10);
        }
        final long j12 = e9Var.B.h + j10;
        if (z11 && y9.e) {
            if (y9.q(null, false, false).amount < j12) {
                e9Var.B.a();
                long a11 = wmVar.a();
                if (a11 >= j11) {
                    str2 = l10.k(wmVar.getMessagesController().a2(Long.valueOf(a11)));
                } else {
                    TLRPC.Chat M02 = wmVar.getMessagesController().M0(Long.valueOf(-a11));
                    str2 = M02 != null ? M02.title : "";
                }
                final int i11 = 1;
                new mb(t10, wmVar.getResourceProvider(), j12, 5, str2, new Runnable(e9Var) { // from class: ci.y7
                    public final /* synthetic */ e9 b;

                    {
                        this.b = e9Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.b0(ziVar, wmVar, j12, true, true, l10);
                                break;
                            default:
                                this.b.b0(ziVar, wmVar, j12, true, true, l10);
                                break;
                        }
                    }
                }, 0L).show();
                return null;
            }
            ziVar2 = ziVar;
            reactionCount = null;
        } else {
            ziVar2 = ziVar;
            reactionCount = null;
        }
        c9 c9Var4 = e9Var.B;
        if (ziVar2 != null) {
            TLRPC.Message message = ziVar2.k;
            if (message.reactions == null) {
                message.reactions = new TLRPC.TL_messageReactions();
                TLRPC.Message message2 = ziVar2.k;
                message2.reactions.reactions_as_tags = zi.B0(message2) == h10.i(ziVar2.I1).e();
                ziVar2.k.reactions.can_see_list = ziVar2.p3() || ziVar2.q3();
            }
            for (int i12 = 0; i12 < ziVar2.k.reactions.results.size(); i12++) {
                if (!(ziVar2.k.reactions.results.get(i12).reaction instanceof TLRPC.TL_reactionPaid)) {
                }
            }
            z12 = true;
            a9 a9Var = c9Var4.p;
            e9 e9Var2 = c9Var4.q;
            int i13 = e9Var2.a;
            org.telegram.ui.Components.ub ubVar = c9Var4.e;
            zi ziVar3 = c9Var4.b;
            if (!c9Var4.i || c9Var4.j) {
                boolean z13 = org.telegram.messenger.r2.a;
            } else {
                c9Var4.h += j10;
                System.currentTimeMillis();
                ubVar.c.a();
                ubVar.c.c(org.telegram.messenger.g0.X2(bd.G((int) c9Var4.h, "StarsSentText", new Object[0])), true, true);
                if (c9Var4.m) {
                    c9Var4.f.b = 5000L;
                    org.telegram.messenger.g0.r(a9Var);
                    org.telegram.messenger.g0.i3(a9Var, 5000L);
                }
                int i14 = hs.o1;
                if (z12) {
                    c9Var4.l = true;
                    ziVar3.f((int) j10, c9Var4.c(), true);
                    e9Var2.g += j10;
                    hs.f(i13).k(i14, Long.valueOf(zi.B0(ziVar3.k)), Integer.valueOf(ziVar3.f1()), ziVar3.k.reactions);
                    hs.f(i13).k(hs.y3, new Object[0]);
                } else {
                    c9Var4.l = false;
                    TLRPC.Message message3 = ziVar3.k;
                    if (message3.reactions == null) {
                        message3.reactions = new TLRPC.TL_messageReactions();
                        TLRPC.Message message4 = ziVar3.k;
                        message4.reactions.reactions_as_tags = zi.B0(message4) == h10.i(ziVar3.I1).e();
                        ziVar3.k.reactions.can_see_list = ziVar3.p3() || ziVar3.q3();
                    }
                    for (int i15 = 0; i15 < ziVar3.k.reactions.results.size(); i15++) {
                        if (ziVar3.k.reactions.results.get(i15).reaction instanceof TLRPC.TL_reactionPaid) {
                            reactionCount = ziVar3.k.reactions.results.get(i15);
                        }
                    }
                    if (reactionCount == null) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
                        tL_reactionCount.count = 1;
                        tL_reactionCount.chosen = true;
                        ziVar3.k.reactions.results.add(0, tL_reactionCount);
                        c9Var4.k--;
                    }
                    hs.f(i13).k(i14, Long.valueOf(zi.B0(ziVar3.k)), Integer.valueOf(ziVar3.f1()), ziVar3.k.reactions);
                    c9Var4.k += j10;
                }
                ubVar.b.setText(c9Var4.d());
            }
            c9 c9Var5 = e9Var.B;
            c9Var5.n = l10;
            return c9Var5;
        }
        if (!z10) {
            z12 = false;
            a9 a9Var2 = c9Var4.p;
            e9 e9Var22 = c9Var4.q;
            int i132 = e9Var22.a;
            org.telegram.ui.Components.ub ubVar2 = c9Var4.e;
            zi ziVar32 = c9Var4.b;
            if (c9Var4.i) {
            }
            boolean z132 = org.telegram.messenger.r2.a;
            c9 c9Var52 = e9Var.B;
            c9Var52.n = l10;
            return c9Var52;
        }
        z12 = true;
        a9 a9Var22 = c9Var4.p;
        e9 e9Var222 = c9Var4.q;
        int i1322 = e9Var222.a;
        org.telegram.ui.Components.ub ubVar22 = c9Var4.e;
        zi ziVar322 = c9Var4.b;
        if (c9Var4.i) {
        }
        boolean z1322 = org.telegram.messenger.r2.a;
        c9 c9Var522 = e9Var.B;
        c9Var522.n = l10;
        return c9Var522;
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int f12 = ((zi) obj).f1();
            hashSet.add(Integer.valueOf(f12));
            if (this.Q.remove(Integer.valueOf(f12))) {
                this.R.put(Integer.valueOf(f12), new ai.k3(this, hashSet, runnable, 22));
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
    public final void d(zi ziVar) {
        boolean z10;
        c8 c8Var;
        org.telegram.ui.ActionBar.d2 T2;
        z8 z8Var;
        TLRPC.Message message = ziVar.k;
        if (message == null) {
            return;
        }
        long j10 = message.paid_message_stars;
        if (j10 <= 0 || zi.d3(message)) {
            return;
        }
        z8 z8Var2 = this.N;
        int i3 = 0;
        if (z8Var2 == null || z8Var2.g <= 0 || !z8Var2.m || z8Var2.n || z8Var2.o) {
            if (!org.telegram.ui.Components.t4.c0(this.a, zi.B0(ziVar.k))) {
                Long l10 = (Long) this.O.get(Long.valueOf(zi.B0(ziVar.k)));
                if (l10 == null || System.currentTimeMillis() - l10.longValue() <= 5000) {
                    Integer num = (Integer) this.P.get(Long.valueOf(zi.B0(ziVar.k)));
                    if (num != null) {
                    }
                }
            }
            z10 = false;
            int f12 = ziVar.f1();
            if (z10) {
                this.Q.add(Integer.valueOf(f12));
            }
            long B0 = zi.B0(ziVar.k);
            b8 b8Var = new b8(i3, this, z10);
            c8Var = new c8(this, z10, f12, i3);
            T2 = LaunchActivity.T();
            z8Var = this.N;
            if (z8Var != null && (z8Var.o || z8Var.n)) {
                this.N = null;
            }
            if (this.N != null) {
                if (T2 != null && !T2.isRemovingFromStack()) {
                    z8 z8Var3 = this.N;
                    if (z8Var3.b == B0) {
                    }
                }
                this.N.a();
                this.N = null;
            }
            if (T2 != null || T2.isRemovingFromStack()) {
                c8Var.run();
            }
            if (this.N == null) {
                this.N = new z8(T2, B0);
            }
            z8 z8Var4 = this.N;
            org.telegram.ui.Components.ub ubVar = z8Var4.d;
            org.telegram.ui.Components.yb ybVar = z8Var4.e;
            y8 y8Var = z8Var4.p;
            if (z8Var4.n || z8Var4.o) {
                c8Var.run();
                return;
            }
            z8Var4.g++;
            z8Var4.k.add(ziVar);
            z8Var4.h += j10;
            z8Var4.i = b8Var;
            z8Var4.j.add(c8Var);
            if (z8Var4.m && !z10) {
                z8Var4.m = false;
                org.telegram.messenger.g0.r(y8Var);
                org.telegram.ui.Components.ac acVar = z8Var4.c;
                acVar.j = 5000;
                acVar.i(true);
                if (System.currentTimeMillis() - z8Var4.l > 500) {
                    ybVar.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                } else {
                    ybVar.setAlpha(0.0f);
                    ybVar.setVisibility(8);
                }
            }
            d9 d9Var = z8Var4.f;
            if (d9Var != null && z8Var4.m) {
                d9Var.b = 3000L;
                org.telegram.messenger.g0.r(y8Var);
                org.telegram.messenger.g0.i3(y8Var, 3000L);
            }
            org.telegram.ui.Components.h6 h6Var = ubVar.b;
            int i10 = z8Var4.g;
            h6Var.setText(i10 == 1 ? bd.M0(2131747711, null) : bd.G(i10, "PaidMessageSentTitle", new Object[0]));
            ubVar.c.setText(org.telegram.messenger.g0.X2(bd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) z8Var4.h))));
            ubVar.a.d();
            return;
        }
        z10 = true;
        int f122 = ziVar.f1();
        if (z10) {
        }
        long B02 = zi.B0(ziVar.k);
        b8 b8Var2 = new b8(i3, this, z10);
        c8Var = new c8(this, z10, f122, i3);
        T2 = LaunchActivity.T();
        z8Var = this.N;
        if (z8Var != null) {
            this.N = null;
        }
        if (this.N != null) {
        }
        if (T2 != null) {
        }
        c8Var.run();
    }

    public final void d0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zi ziVar = (zi) list.get(0);
        long B0 = zi.B0(ziVar.k);
        int i3 = this.a;
        if (B0 >= 0) {
            hp.s1(i3).W2(hp.s1(i3).a2(Long.valueOf(B0)), 0, true, null);
        } else {
            hp.s1(i3).V2(0, -B0, true);
        }
        org.telegram.ui.Components.fc.a0(LaunchActivity.T()).Q(R.raw.error, 36, wb.T0(TextUtils.concat(bd.G((int) ziVar.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", bd.G((int) ziVar.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
    }

    public final void e0(LaunchActivity launchActivity, long j10, String str) {
        if (this.e) {
            f0(launchActivity, j10, str);
        } else {
            r(new l2(this, (Object) launchActivity, j10, (Object) str, 6));
        }
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, n10 n10Var, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i3 = this.a;
        if (hp.s1(i3).j7) {
            org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
            if (Q == null || Q.getContext() == null) {
                c0(activity, null);
                return;
            } else {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            }
        }
        boolean z10 = ((org.telegram.messenger.h0) hp.s1(i3).x7.h0.b).c && inputPeer != null;
        if ((!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k()) || z10) {
            if (!org.telegram.messenger.r1.i().k()) {
                n10Var.a(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            e5.a aVar = new e5.a();
            aVar.c = "inapp";
            aVar.b = tL_starsTopupOption.store_product;
            e5.o a10 = aVar.a();
            org.telegram.messenger.a8.b("StarsController.buy starts queryProductDetails");
            org.telegram.messenger.r1.i().o(Arrays.asList(a10), new a1.d(n10Var, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity, 1));
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
        JSONObject u10 = ii.a3.u(I(), false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getPaymentForm, new ai.r6(this, n10Var, tL_inputInvoiceStars, 3));
    }

    public final void f0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new mb(launchActivity, null, j10, 4, str, new ai.y1(6), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
        if (T2 == null) {
            return;
        }
        org.telegram.ui.Components.ac K = org.telegram.ui.Components.fc.a0(T2).K(R.raw.stars_topup, bd.M0(2131744974, null), bd.M0(2131744973, null), new ai.y1(5));
        K.j = 5000;
        K.k(true);
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final n10 n10Var) {
        int i3;
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.e6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new ai.z1(this, n10Var, j10, tLObject, tL_textWithEntities, 4));
                return;
            }
            if (z10) {
                i3 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i3 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String l10 = org.telegram.messenger.m5.l(this.a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = hp.s1(this.a).o1(j10);
            tL_inputInvoicePremiumGiftStars.months = i3;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ii.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: ci.h7
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final e9 e9Var = e9.this;
                    final n10 n10Var2 = n10Var;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.e6 e6Var = I;
                    final String str = l10;
                    final long j11 = j10;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.m7
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            n10 n10Var3 = n10Var2;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                e9.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                n10Var3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i10 = 0;
                            long j12 = 0;
                            while (i10 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                                i10++;
                                j12 += tL_labeledPrice.amount;
                            }
                            e9 e9Var2 = e9.this;
                            ConnectionsManager.getInstance(e9Var2.a).sendRequest(tL_payments_sendStarsForm, new p7(e9Var2, n10Var3, context3, e6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(final long j10, final long j11, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i3 = this.a;
        togglenopaidmessagesexception.user_id = hp.s1(i3).o1(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = hp.s1(i3).j1(j11);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i3).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: ci.z7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new h8(e9.this, tLObject, j11, j10, z11));
            }
        });
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, n10 n10Var) {
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.e6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new ai.z1(this, n10Var, tL_payments_paymentFormStarGift, starGift, j10, 5));
            return;
        }
        String l10 = org.telegram.messenger.m5.l(this.a, j10);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = hp.s1(this.a).j1(j10);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        int i3 = 0;
        JSONObject u10 = ii.a3.u(I, false);
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
        long j11 = 0;
        while (i3 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
            i3++;
            j11 += tL_labeledPrice.amount;
            size = size;
            context2 = context2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new p7(this, n10Var, context2, I, j11, l10, tL_payments_paymentFormStarGift, starGift, j10));
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, n10 n10Var) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.K1;
            if (context == null) {
                context = org.telegram.messenger.t0.b;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.e6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i3 = h10.t0;
                boolean[] zArr = {false};
                n8 n8Var = new n8(this, j10, i3, zArr, n10Var, context2, I, chatInvite, str);
                e0 e0Var = new e0(this, zArr, n10Var);
                org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context2, I, false);
                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new bb(context2, 40, 0, 0), mf.c(-1.0f, -1));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context2);
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                u8Var.s(chatInvite.color);
                String str2 = chatInvite.title;
                u8Var.A = true;
                u8Var.n = 0;
                u8Var.m = false;
                org.telegram.ui.Components.u8.a(str2, null, null, u8Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    k9Var.j(org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(80.0f), false, null, false), chatInvite.photo), "80_80", u8Var, chatInvite);
                } else {
                    k9Var.setImageDrawable(u8Var);
                }
                frameLayout.addView(k9Var, mf.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i10 = org.telegram.ui.ActionBar.k6.h5;
                org.telegram.ui.ActionBar.r6.y(frameLayout, drawable, i10, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, mf.e(26, 26, 17));
                imageView.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, mf.e(26, 26, 17));
                imageView2.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView2.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                lb lbVar = new lb(i3, context2, I);
                pf.a(lbVar);
                lbVar.setOnClickListener(new qa(lbVar, 0));
                frameLayout.addView(lbVar, mf.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f10.addView(frameLayout, mf.r(-1, hs.C1, 7));
                TextView g7 = org.telegram.messenger.k5.g(context2, 1, 20.0f);
                g7.setTypeface(org.telegram.messenger.g0.o());
                int i11 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.messenger.camera.q.o(g7, i11, I, null, 2131745022);
                g7.setGravity(17);
                TextView f11 = org.telegram.messenger.camera.q.f(f10, g7, mf.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f11.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(f11, i11, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i12 = tL_starsSubscriptionPricing.period;
                if (i12 == 2592000) {
                    f11.setText(org.telegram.messenger.g0.X2(bd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    f11.setText(org.telegram.messenger.g0.X2(bd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, i12 == 300 ? "5 minutes" : "a minute")));
                }
                f11.setMaxWidth(gi.l3.a(f11.getText(), f11.getPaint()));
                f11.setGravity(17);
                f10.addView(f11, mf.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView, i11, I);
                    textView.setText(org.telegram.messenger.i6.m(chatInvite.about, textView.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setGravity(17);
                    f10.addView(textView, mf.t(-2, -2, 1, 0, 6, 0, 22));
                }
                gi.d dVar = new gi.d(context2, I, true);
                dVar.i(bd.M0(2131745031, null), false, true);
                f10.addView(dVar, mf.o(-1, 48));
                s70 s70Var = new s70(context2, I);
                s70Var.setText(org.telegram.messenger.g0.U2(bd.M0(2131745030, null), new ai.s1(context2, 5)));
                s70Var.setGravity(17);
                s70Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.B6, I);
                org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, I);
                f10.addView(s70Var, mf.t(-1, -2, 49, 14, 14, 14, 6));
                l10.O = f10;
                dVar.setOnClickListener(new ai.h(n8Var, l10, dVar, 7));
                l10.setOnDismissListener(new ba(e0Var, 1));
                l10.P(i10);
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1() && T2 != null && !org.telegram.messenger.g0.u1(T2)) {
                    l10.a0(T2);
                }
                l10.show();
            }
        }
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final ai.n6 n6Var) {
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.e6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new Runnable() { // from class: ci.w6
                @Override // java.lang.Runnable
                public final void run() {
                    e9 e9Var = e9.this;
                    boolean z12 = e9Var.e;
                    ai.n6 n6Var2 = n6Var;
                    if (z12) {
                        e9Var.i(starGift, z10, z11, j10, tL_textWithEntities, n6Var2);
                    } else {
                        e9.e("NO_BALANCE");
                        n6Var2.a(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String l10 = org.telegram.messenger.m5.l(this.a, j10);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z10;
        tL_inputInvoiceStarGift.peer = hp.s1(this.a).j1(j10);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z11;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = ii.a3.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: ci.x6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final e9 e9Var = e9.this;
                final ai.n6 n6Var2 = n6Var;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.e6 e6Var = I;
                final String str = l10;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z12 = z10;
                final boolean z13 = z11;
                final long j11 = j10;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.n7
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final ai.n6 n6Var3 = n6Var2;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            e9.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            n6Var3.a(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                        int size = arrayList.size();
                        int i3 = 0;
                        final long j12 = 0;
                        while (i3 < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
                            i3++;
                            j12 += tL_labeledPrice.amount;
                        }
                        final e9 e9Var2 = e9.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e9Var2.a);
                        final Context context4 = context3;
                        final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z15 = z12;
                        final boolean z16 = z13;
                        final long j13 = j11;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: ci.v7
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final e9 e9Var3 = e9.this;
                                final ai.n6 n6Var4 = n6Var3;
                                final Context context5 = context4;
                                final org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                                final long j14 = j12;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z17 = z15;
                                final boolean z18 = z16;
                                final long j15 = j13;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.e7
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r11v10 */
                                    /* JADX WARN: Type inference failed for: r11v8 */
                                    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str4;
                                        SpannableStringBuilder spannableStringBuilder;
                                        p80 p80Var;
                                        ?? r11;
                                        e9 e9Var4 = e9.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        ai.n6 n6Var5 = n6Var4;
                                        Context context6 = context5;
                                        org.telegram.ui.ActionBar.e6 e6Var4 = e6Var3;
                                        long j16 = j14;
                                        String str5 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z19 = z17;
                                        boolean z20 = z18;
                                        long j17 = j15;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                                        org.telegram.ui.Components.fc X = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.fc.X() : org.telegram.ui.Components.fc.a0(Q);
                                        boolean z21 = tLObject4 instanceof TLRPC.TL_payments_paymentResult;
                                        int i10 = 1;
                                        if (!z21) {
                                            if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                if (hp.s1(e9Var4.a).j7) {
                                                    n6Var5.a(Boolean.FALSE, null);
                                                    e9.c0(context6, e6Var4);
                                                    return;
                                                } else {
                                                    boolean[] zArr = {false};
                                                    mb mbVar = new mb(context6, e6Var4, j16, 6, str5, new w7(e9Var4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, n6Var5), 0L);
                                                    mbVar.setOnDismissListener(new h3(n6Var5, zArr, i10));
                                                    mbVar.show();
                                                    return;
                                                }
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                n6Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                n6Var5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            } else {
                                                n6Var5.a(Boolean.FALSE, null);
                                                X.Q(R.raw.error, 36, bd.a0(null, null, 2131743888, tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS")).j();
                                                return;
                                            }
                                        }
                                        Utilities.d.c(new q7(e9Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 2));
                                        e9Var4.D = false;
                                        e9Var4.E = true;
                                        e9Var4.G = 0L;
                                        e9Var4.U();
                                        e9Var4.P(j17);
                                        e9Var4.S(true);
                                        n6Var5.a(Boolean.TRUE, null);
                                        org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(e9Var4.a).b();
                                        if (b10 != null && b10.a(j17)) {
                                            hp.s1(e9Var4.a).e7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            str4 = str5;
                                            spannableStringBuilder = null;
                                        } else {
                                            int i11 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i11;
                                            spannableStringBuilder = org.telegram.messenger.g0.X2(bd.H(',', "Gift2SentRemainsLimit", Math.max(0, i11)));
                                            str4 = str5;
                                        }
                                        if (j17 < 0) {
                                            long j18 = -j17;
                                            TLRPC.ChatFull N0 = hp.s1(e9Var4.a).N0(j18);
                                            if (N0 != null) {
                                                N0.stargifts_count++;
                                                N0.flags2 |= 262144;
                                                hp.s1(e9Var4.a).R3(N0);
                                            }
                                            if (Q instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) Q;
                                                if (profileActivity.a() == j17) {
                                                    mv0 mv0Var = profileActivity.O;
                                                    if (mv0Var != null) {
                                                        mv0Var.N1(true);
                                                        profileActivity.O.i1(14);
                                                        r11 = 0;
                                                        profileActivity.U4(false);
                                                    } else {
                                                        r11 = 0;
                                                    }
                                                    org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(Q);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String M0 = bd.M0(2131745119, null);
                                                    if (spannableStringBuilder == null) {
                                                        Object[] objArr = new Object[1];
                                                        objArr[r11] = str4;
                                                        spannableStringBuilder = org.telegram.messenger.g0.X2(bd.G((int) j16, "StarsGiftCompletedChannelText", objArr));
                                                    }
                                                    a02.s(document, M0, spannableStringBuilder).k(r11);
                                                }
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", j18);
                                            bundle.putBoolean("open_gifts", true);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                            profileActivity2.whenFullyVisible(new ai.z1(profileActivity2, starGift5, spannableStringBuilder, j16, str4, 6));
                                            Q.presentFragment(profileActivity2);
                                        } else if ((Q instanceof wm) && ((wm) Q).a() == j17) {
                                            org.telegram.ui.Components.fc a03 = org.telegram.ui.Components.fc.a0(Q);
                                            TLRPC.Document document2 = starGift5.sticker;
                                            String M02 = bd.M0(2131745119, null);
                                            if (spannableStringBuilder == null) {
                                                spannableStringBuilder = org.telegram.messenger.g0.X2(bd.G((int) j16, "StarsGiftCompletedText", new Object[0]));
                                            }
                                            a03.s(document2, M02, spannableStringBuilder).k(true);
                                        } else {
                                            hs f10 = hs.f(e9Var4.a);
                                            int i12 = hs.v;
                                            Long valueOf = Long.valueOf(j17);
                                            Boolean bool = Boolean.FALSE;
                                            f10.k(i12, valueOf, bool);
                                            hs.f(e9Var4.a).k(hs.u, Long.valueOf(j17), bool);
                                            wm ra2 = wm.ra(j17);
                                            ra2.whenFullyVisible(new l2(ra2, starGift5, spannableStringBuilder, j16, 5));
                                            Q.presentFragment(ra2);
                                        }
                                        hp.s1(e9Var4.a).e7.edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.K1;
                                        if (launchActivity == null || (p80Var = launchActivity.y0) == null) {
                                            return;
                                        }
                                        p80Var.c(true);
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
        int i3 = hs.y3;
        int i10 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            hs.f(i10).k(i3, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            hs.f(i10).k(i3, new Object[0]);
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

    public final void j0(final zi ziVar, final long j10, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (ziVar == null) {
            runnable.run();
            return;
        }
        final long B0 = zi.B0(ziVar.k);
        final int f12 = ziVar.f1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) ziVar.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i3 = this.a;
        tL_messages_editMessage.peer = hp.s1(i3).j1(B0);
        int i10 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i10;
        tL_messages_editMessage.schedule_date = ziVar.k.date;
        tL_messages_editMessage.id = f12;
        tL_messages_editMessage.flags = i10 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j10;
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
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: ci.i8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new o8(e9.this, tLObject, runnable, tL_error, z10, B0, f12, ziVar, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i3 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i3 >= longSparseArray.size()) {
                return null;
            }
            v8 v8Var = (v8) longSparseArray.valueAt(i3);
            for (int i10 = 0; i10 < v8Var.l.size(); i10++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v8Var.l.get(i10);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.id == j10) {
                    return savedStarGift;
                }
            }
            i3++;
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new ai.f3(9, this, runnable));
        }
        if (!z10 || this.g <= 0) {
            return this.f;
        }
        dg.a m10 = dg.a.m(this.f);
        return dg.a.g(Math.max(0L, m10.a() - this.g), m10.a).o();
    }

    public final void r(Runnable runnable) {
        q(runnable, true, false);
    }

    public final dg.a s() {
        dg.a l10 = dg.a.l(p());
        if (l10 == null) {
            return dg.a.i(0L, this.b ? dg.b.b : dg.b.a);
        }
        return l10;
    }

    public final ArrayList u() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new x7(this, 3));
        return this.m;
    }

    public final ArrayList v() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new x7(this, 4));
        return this.p;
    }

    public final ArrayList z() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new x7(this, 2));
        return this.j;
    }
}
