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
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e00;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.k80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.u80;
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x8 {
    public static volatile x8[][] S = (x8[][]) Array.newInstance((Class<?>) x8.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public v8 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public s8 N;
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

    public x8(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
    }

    public static org.telegram.ui.ActionBar.i6 I() {
        org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
        if (T2 != null) {
            return T2.getResourceProvider();
        }
        return null;
    }

    public static boolean S(int i7, cg.a aVar) {
        return aVar == null || x(i7, aVar.a).s().b >= aVar.b;
    }

    public static void a(x8 x8Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = x8Var.I;
        ArrayList arrayList2 = x8Var.J;
        int i7 = x8Var.a;
        ArrayList arrayList3 = x8Var.H;
        x8Var.C = false;
        x8Var.D = true;
        if (!(starGifts instanceof TL_stars.TL_starGifts)) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i10 = x8Var.F;
                long currentTimeMillis = System.currentTimeMillis();
                x8Var.G = currentTimeMillis;
                tr a02 = tr.a0(i7);
                a02.a.c(new bi.q3(i10, 1, currentTimeMillis, a02, arrayList3));
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        mp.u1(i7).f4(tL_starGifts.users, false);
        mp.u1(i7).Z3(tL_starGifts.chats, false);
        tr.a0(i7).m1(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList3.clear();
        arrayList3.addAll(tL_starGifts.gifts);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new bg.d(4)), new bg.d(5)));
        arrayList.clear();
        arrayList.addAll(arrayList3);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(6)));
        x8Var.F = tL_starGifts.hash;
        x8Var.G = System.currentTimeMillis();
        ks.f(i7).k(ks.H3, new Object[0]);
        ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
        int i11 = x8Var.F;
        long j3 = x8Var.G;
        tr a03 = tr.a0(i7);
        a03.a.c(new bi.q3(i11, 1, j3, a03, arrayList4));
    }

    public static /* synthetic */ void b(x8 x8Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i7 = x8Var.a;
        mp.u1(i7).f4(arrayList2, true);
        mp.u1(i7).Z3(arrayList3, true);
        x8Var.E = true;
        ArrayList arrayList4 = x8Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = x8Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new bg.d(1)), new bg.d(2)));
        ArrayList arrayList6 = x8Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new bg.d(3)));
        x8Var.F = num.intValue();
        x8Var.G = l10.longValue();
        x8Var.C = false;
        ks.f(i7).k(ks.H3, new Object[0]);
        x8Var.T();
    }

    public static void c0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = gd.M0(2131744825, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = gd.M0(2131744826, null);
        org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
    }

    public static void e(String str) {
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        ((Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.lc.Y() : org.telegram.ui.Components.lc.b0(Q)).Q(R.raw.error, 36, org.telegram.ui.Components.lc.W(str)).j();
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

    public static Context t(org.telegram.ui.ActionBar.h2 h2Var) {
        if (h2Var != null && h2Var.getContext() != null) {
            return h2Var.getContext();
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

    public static x8 w(int i7) {
        return y(i7, false);
    }

    public static x8 x(int i7, cg.b bVar) {
        return y(i7, bVar == cg.b.b);
    }

    public static x8 y(int i7, boolean z10) {
        x8 x8Var;
        x8 x8Var2 = S[z10 ? 1 : 0][i7];
        if (x8Var2 != null) {
            return x8Var2;
        }
        synchronized (T[z10 ? 1 : 0][i7]) {
            try {
                x8Var = S[z10 ? 1 : 0][i7];
                if (x8Var == null) {
                    x8[] x8VarArr = S[z10 ? 1 : 0];
                    x8 x8Var3 = new x8(i7, z10);
                    x8VarArr[i7] = x8Var3;
                    x8Var = x8Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x8Var;
    }

    public final long A(q8 q8Var, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l10;
        v8 v8Var = this.B;
        if (v8Var != null && v8Var.a.equals(q8Var) && (l10 = this.B.n) != null) {
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
                        l11 = Long.valueOf(org.telegram.messenger.n5.o(peer));
                        break;
                    }
                }
            }
        }
        if (l11 != null) {
            return l11.longValue();
        }
        Long A1 = mp.u1(this.a).A1();
        if (A1 != null) {
            return A1.longValue();
        }
        return 0L;
    }

    public final long B(fj fjVar) {
        Long l10;
        v8 v8Var = this.B;
        if (v8Var != null && v8Var.a.equals(q8.b(fjVar)) && (l10 = this.B.n) != null) {
            return l10.longValue();
        }
        Long z12 = fjVar == null ? null : fjVar.z1();
        if (z12 != null) {
            return z12.longValue();
        }
        Long A1 = mp.u1(this.a).A1();
        if (A1 != null) {
            return A1.longValue();
        }
        return 0L;
    }

    public final void C(long j3, long j10, x10 x10Var) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i7 = this.a;
        getpaidmessagesrevenue.user_id = mp.u1(i7).q1(j3);
        if (j10 != 0) {
            getpaidmessagesrevenue.parent_peer = mp.u1(i7).l1(j10);
        }
        ConnectionsManager.getInstance(i7).sendRequest(getpaidmessagesrevenue, new y7(x10Var, 0));
    }

    public final long D(int i7, long j3) {
        v8 v8Var = this.B;
        if (v8Var == null) {
            return 0L;
        }
        q8 q8Var = v8Var.a;
        if (q8Var.a == j3 && q8Var.b == i7 && v8Var.l) {
            return v8Var.h;
        }
        return 0L;
    }

    public final long E(fj fjVar) {
        TLRPC.Message message;
        if (fjVar == null || (message = fjVar.k) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || fjVar.k3()) && fjVar.k.fwd_from != null) ? D(fjVar.k.fwd_from.saved_from_msg_id, fjVar.Z0()) : D(fjVar.e1(), fj.B0(fjVar.k));
    }

    public final m8 F(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        m8 m8Var = (m8) longSparseArray.get(j3);
        if (m8Var != null || !z10) {
            return m8Var;
        }
        m8 m8Var2 = new m8(this.a, j3);
        longSparseArray.put(j3, m8Var2);
        return m8Var2;
    }

    public final o8 G(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        o8 o8Var = (o8) longSparseArray.get(j3);
        if (o8Var != null || !z10) {
            return o8Var;
        }
        o8 o8Var2 = new o8(this.a, j3, true);
        longSparseArray.put(j3, o8Var2);
        return o8Var2;
    }

    public final void H(TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, x10 x10Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        org.telegram.ui.ActionBar.i6 I = I();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            r(new m(this, x10Var, starGift, j3, tL_textWithEntities, z10));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = mp.u1(this.a).l1(j3);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = ki.t2.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new bi.k1(9, this, x10Var));
    }

    public final TL_stars.StarGift J(long j3) {
        T();
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

    public final void K(long j3, x10 x10Var) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j3));
        if (stargiftupgradepreview != null) {
            x10Var.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j3;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new p2(this, j3, x10Var, 1));
    }

    public final void L(TL_stars.InputSavedStarGift inputSavedStarGift, x10 x10Var) {
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.b, null);
        u1Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new bi.g2(this, u1Var, inputSavedStarGift, x10Var, 4));
    }

    public final boolean M(int i7) {
        return this.e && !this.q[i7].isEmpty();
    }

    public final void N() {
        this.e = false;
        p();
        this.e = true;
    }

    public final void O(long j3) {
        o8 G = G(j3, false);
        if (G != null) {
            G.k(false);
        }
        m8 m8Var = (m8) this.K.get(j3);
        if (m8Var != null) {
            m8Var.g();
        }
    }

    public final void P(TLRPC.UserFull userFull) {
        if (userFull == null) {
            return;
        }
        long j3 = userFull.id;
        o8 G = G(j3, false);
        if (G != null && G.n != userFull.stargifts_count) {
            G.k(false);
        }
        m8 m8Var = (m8) this.K.get(j3);
        if (m8Var != null) {
            m8Var.g();
        }
    }

    public final void Q() {
        if (this.x) {
            return;
        }
        this.v.clear();
        this.w = null;
        this.x = false;
        this.y = false;
        U();
    }

    public final void R(boolean z10) {
        for (int i7 = 0; i7 < 3; i7++) {
            boolean[] zArr = this.t;
            if (!zArr[i7]) {
                this.q[i7].clear();
                this.s[i7] = null;
                zArr[i7] = false;
                this.u[i7] = false;
                if (z10) {
                    V(i7);
                }
            }
        }
    }

    public final void T() {
        if (this.C) {
            return;
        }
        if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
            this.C = true;
            boolean z10 = this.E;
            int i7 = this.a;
            if (z10) {
                int i10 = this.F;
                ai.g0 g0Var = new ai.g0(this, 12);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i10;
                ConnectionsManager.getInstance(i7).sendRequest(getstargifts, new ai.e1(g0Var, 3));
                return;
            }
            a1.c cVar = new a1.c(this, 27);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            tr a02 = tr.a0(i7);
            a02.a.c(new ai.b(a02, arrayList3, arrayList2, arrayList, cVar, 6));
        }
    }

    public final void U() {
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new s7(this, 1));
    }

    public final void V(int i7) {
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new w1(this, i7, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03c7  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, x10 x10Var) {
        long j3;
        String str;
        boolean z10;
        org.telegram.ui.ActionBar.x2 x2Var;
        e8 e8Var;
        f8 f8Var;
        ViewGroup viewGroup;
        fj fjVar2;
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
        TLRPC.User c22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        int[] iArr;
        String M0;
        TLRPC.Message message2;
        int i15;
        int i16;
        va vaVar;
        FrameLayout frameLayout;
        org.telegram.messenger.fc fcVar;
        boolean z11;
        org.telegram.messenger.fc fcVar2;
        e8 e8Var2;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        mp.u1(this.a).f4(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.i6 I = I();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            r(new bi.h2(this, (Object) runnable, fjVar, inputInvoice, tL_payments_paymentFormStars, x10Var, 6));
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
        if (fjVar == null || fjVar.D != 29) {
            j3 = tL_payments_paymentFormStars.bot_id;
        } else {
            TLRPC.Message message3 = fjVar.k;
            TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
            j3 = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? fj.B0(message3) : org.telegram.messenger.n5.o(peer2);
        }
        long j13 = j3;
        if (j13 >= 0) {
            TLRPC.User c23 = mp.u1(this.a).c2(Long.valueOf(j13));
            str = o10.q(c23);
            z10 = !o10.u(c23);
        } else {
            TLRPC.Chat O0 = mp.u1(this.a).O0(Long.valueOf(-j13));
            str = O0 == null ? "" : O0.title;
            z10 = false;
        }
        String str4 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i18 = tL_payments_paymentFormStars.invoice.subscription_period;
        long j14 = j12;
        boolean[] zArr = {false};
        int i19 = this.a;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        e8 e8Var3 = new e8(this, j14, zArr, x10Var, context2, I, z10, str, fjVar, inputInvoice, tL_payments_paymentFormStars, i18, j13);
        f8 f8Var2 = new f8(this, zArr, x10Var);
        org.telegram.ui.ActionBar.x2 j15 = org.telegram.messenger.f3.j(1, context2, I, false);
        TLRPC.User c24 = mp.u1(i19).c2(Long.valueOf(j13));
        LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.addView(new ua(context2, 40, 0, 0), c8.ma.c(-1.0f, -1));
        if (fjVar == null || (message2 = fjVar.k) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            x2Var = j15;
            e8Var = e8Var3;
            f8Var = f8Var2;
            viewGroup = frameLayout2;
            fjVar2 = fjVar;
            i7 = i18;
            f10 = 20.0f;
            if (webDocument != null) {
                FrameLayout frameLayout3 = new FrameLayout(context2);
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context2);
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
                q9Var.p(org.telegram.messenger.fc.p(h20.c(webDocument)), "80_80", null, null);
                frameLayout3.addView(q9Var, c8.ma.e(80, 80, 48));
                viewGroup.addView(frameLayout3, c8.ma.e(80, 87, 17));
                TextView textView = new TextView(context2);
                textView.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
                i10 = 1;
                textView.setTextSize(1, 13.0f);
                i11 = -1;
                textView.setTextColor(-1);
                j10 = j14;
                textView.setText(pb.U0(i5.c.l((int) j14, ',', new StringBuilder("XTR ")), 0.85f, null));
                i12 = 0;
                textView.setPadding(org.telegram.messenger.g0.L(5.33f), 0, org.telegram.messenger.g0.L(5.33f), 0);
                textView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(16.0f), -1133566));
                FrameLayout frameLayout4 = new FrameLayout(context2);
                int L = org.telegram.messenger.g0.L(20.0f);
                int i20 = org.telegram.ui.ActionBar.n6.h5;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i20, I));
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i20);
                frameLayout4.setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(frameLayout4, d02, M, null, I);
                frameLayout4.setPadding(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                frameLayout4.addView(textView, c8.ma.r(-2, 16, ks.E1));
                frameLayout3.addView(frameLayout4, c8.ma.a(-2.0f, 18.66f, 81));
                eb ebVar = new eb(i19, context2, I);
                c8.ra.a(ebVar);
                ebVar.setOnClickListener(new ja(ebVar, i10));
                viewGroup.addView(ebVar, c8.ma.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                g10.addView(viewGroup, c8.ma.r(i11, ks.C1, 7));
                TextView textView2 = new TextView(context2);
                textView2.setTextSize(i10, f10);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                int i21 = org.telegram.ui.ActionBar.n6.j5;
                org.telegram.ui.ActionBar.u6.U(textView2, i21, I);
                if (i7 <= 0) {
                    if (webDocument != null) {
                        M0 = str4;
                        iArr = null;
                    } else {
                        iArr = null;
                        M0 = gd.M0(2131744880, null);
                    }
                    textView2.setText(org.telegram.messenger.j6.m(M0, textView2.getPaint().getFontMetricsInt(), i12, iArr, i12));
                } else {
                    textView2.setText(org.telegram.messenger.j6.m(webDocument != null ? str4 : gd.M0(2131744887, null), textView2.getPaint().getFontMetricsInt(), i12, null, i12));
                }
                ks.i(textView2);
                textView2.setGravity(17);
                g10.addView(textView2, c8.ma.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                if (webDocument != null) {
                    LinearLayout g11 = org.telegram.messenger.f3.g(context2, i12);
                    int L2 = org.telegram.messenger.g0.L(28.0f);
                    int i22 = org.telegram.ui.ActionBar.n6.a7;
                    ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i22, I));
                    org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i22);
                    g11.setBackground(d03);
                    org.telegram.ui.ActionBar.u6.j(g11, d03, M2, null, I);
                    org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context2);
                    q9Var2.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                    org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                    b9Var.r(c24);
                    q9Var2.f(c24, b9Var);
                    g11.addView(q9Var2, c8.ma.o(28, 28));
                    TextView textView3 = new TextView(context2);
                    textView3.setTextSize(i10, 13.0f);
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.G6, I);
                    textView3.setText(o10.q(c24));
                    g11.addView(textView3, c8.ma.t(-2, -2, 16, 6, 0, 10, 0));
                    g10.addView(g11, c8.ma.t(-2, 28, 1, 0, 8, 0, 2));
                }
                TextView textView4 = new TextView(context2);
                textView4.setTextSize(i10, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView4, i21, I);
                if (fjVar2 == null && (message = fjVar2.k) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    long B0 = fj.B0(message);
                    TLRPC.Message message4 = fjVar2.k;
                    if (message4 != null && (messageFwdHeader = message4.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        B0 = org.telegram.messenger.n5.o(peer);
                    }
                    if (B0 < 0 && fjVar2.Z0() > 0 && (c22 = mp.u1(i19).c2(Long.valueOf(fjVar2.Z0()))) != null && c22.bot) {
                        B0 = c22.id;
                    }
                    if (B0 >= 0) {
                        TLRPC.User c25 = mp.u1(i19).c2(Long.valueOf(B0));
                        str2 = o10.q(c25);
                        i13 = (c25 == null || !c25.bot) ? i12 : i10;
                    } else {
                        TLRPC.Chat O02 = mp.u1(i19).O0(Long.valueOf(-B0));
                        String str5 = O02 != null ? O02.title : "";
                        i13 = i12;
                        str2 = str5;
                    }
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) fjVar2.k.media;
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
                        long j16 = j10;
                        int i26 = (int) j16;
                        Object[] objArr = new Object[2];
                        objArr[i12] = i25 == i10 ? gd.M0(2131744896, null) : gd.G(i25, "StarsConfirmPurchaseMedia_Photos", new Object[i12]);
                        objArr[i10] = str2;
                        G2 = gd.G(i26, str6, objArr);
                        j11 = j16;
                    } else {
                        j11 = j10;
                        if (i25 == 0) {
                            String str7 = i13 == 0 ? "StarsConfirmPurchaseMediaOne2" : "StarsConfirmPurchaseMediaBotOne2";
                            int i27 = (int) j11;
                            Object[] objArr2 = new Object[2];
                            objArr2[i12] = i24 == i10 ? gd.M0(2131744895, null) : gd.G(i24, "StarsConfirmPurchaseMedia_Videos", new Object[i12]);
                            objArr2[i10] = str2;
                            G2 = gd.G(i27, str7, objArr2);
                        } else {
                            String str8 = i13 != 0 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                            int i28 = (int) j11;
                            if (i25 == i10) {
                                str3 = null;
                                G = gd.M0(2131744896, null);
                            } else {
                                str3 = null;
                                G = gd.G(i25, "StarsConfirmPurchaseMedia_Photos", new Object[i12]);
                            }
                            String M02 = i24 == 1 ? gd.M0(2131744895, str3) : gd.G(i24, "StarsConfirmPurchaseMedia_Videos", new Object[i12]);
                            Object[] objArr3 = new Object[3];
                            objArr3[i12] = G;
                            objArr3[1] = M02;
                            objArr3[2] = str2;
                            G2 = gd.G(i28, str8, objArr3);
                        }
                    }
                    textView4.setText(org.telegram.messenger.g0.W2(G2));
                } else {
                    j11 = j10;
                    if (i7 <= 0) {
                        String q10 = o10.q(c24);
                        Object[] objArr4 = new Object[2];
                        objArr4[i12] = str4;
                        objArr4[1] = q10;
                        textView4.setText(org.telegram.messenger.g0.W2(gd.K("StarsConfirmSubscriptionText2", (int) j11, ',', objArr4)));
                    } else {
                        String q11 = o10.q(c24);
                        Object[] objArr5 = new Object[2];
                        objArr5[i12] = str4;
                        objArr5[1] = q11;
                        textView4.setText(org.telegram.messenger.g0.W2(gd.K("StarsConfirmPurchaseText2", (int) j11, ',', objArr5)));
                    }
                }
                textView4.setMaxWidth(hi.m3.a(textView4.getText(), textView4.getPaint()));
                textView4.setGravity(17);
                g10.addView(textView4, c8.ma.t(-2, -2, 1, 0, 6, 0, 18));
                hi.d dVar = new hi.d(context2, I, true);
                if (i7 <= 0) {
                    dVar.i(pb.T0(org.telegram.messenger.g0.W2(gd.H(',', "StarsConfirmSubscriptionButton", (int) j11))), i12, true);
                } else {
                    dVar.i(pb.T0(org.telegram.messenger.g0.W2(gd.H(',', "StarsConfirmPurchaseButton", (int) j11))), i12, true);
                }
                g10.addView(dVar, c8.ma.c(48.0f, -1));
                k80 k80Var = new k80(context2, I);
                org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.z6, I);
                org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, I);
                k80Var.setTextSize(1, 14.0f);
                k80Var.setText(org.telegram.messenger.g0.T2(gd.M0(i7 <= 0 ? 2131744884 : 2131744891, null), new ai.a(context2, 7)));
                k80Var.setGravity(17);
                g10.addView(k80Var, c8.ma.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                x2Var2.O = g10;
                dVar.setOnClickListener(new ah.h(e8Var, x2Var2, dVar, 8));
                x2Var2.setOnDismissListener(new t9(f8Var, 2));
                x2Var2.O();
                x2Var2.show();
            }
            org.telegram.ui.Components.q9 q9Var3 = new org.telegram.ui.Components.q9(context2);
            q9Var3.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
            org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            b9Var2.r(c24);
            q9Var3.f(c24, b9Var2);
            viewGroup.addView(q9Var3, c8.ma.e(80, 80, 17));
        } else {
            va vaVar2 = new va(context2);
            vaVar2.I = new Path();
            vaVar2.J = new RectF();
            vaVar2.K = i5.c.g(context2, R.drawable.large_locked_post);
            vaVar2.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) fjVar.k.media;
            if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                x2Var = j15;
                f8Var = f8Var2;
                viewGroup = frameLayout2;
                e8Var = e8Var3;
                fjVar2 = fjVar;
                i7 = i18;
                i15 = 17;
                i16 = 80;
                f10 = 20.0f;
            } else {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                    fcVar2 = org.telegram.messenger.fc.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, fjVar.k);
                    vaVar = vaVar2;
                    f8Var = f8Var2;
                    frameLayout = frameLayout2;
                    e8Var2 = e8Var3;
                    fcVar = null;
                    z11 = true;
                } else {
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            vaVar = vaVar2;
                            f8Var = f8Var2;
                            frameLayout = frameLayout2;
                            fcVar = null;
                            z11 = true;
                            fcVar2 = org.telegram.messenger.fc.i(org.telegram.messenger.w7.w(messageMedia.photo.sizes, org.telegram.messenger.g0.L(80.0f), true, null, false), messageMedia.photo);
                        } else {
                            vaVar = vaVar2;
                            f8Var = f8Var2;
                            frameLayout = frameLayout2;
                            fcVar = null;
                            z11 = true;
                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                fcVar2 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(messageMedia.document.thumbs, org.telegram.messenger.g0.L(80.0f), true, null, false), messageMedia.document);
                            }
                        }
                        e8Var2 = e8Var3;
                    } else {
                        vaVar = vaVar2;
                        f8Var = f8Var2;
                        frameLayout = frameLayout2;
                        fcVar = null;
                        z11 = true;
                    }
                    fcVar2 = fcVar;
                    e8Var2 = e8Var3;
                }
                e8Var = e8Var2;
                viewGroup = frameLayout;
                i15 = 17;
                f10 = 20.0f;
                vaVar2 = vaVar;
                x2Var = j15;
                i7 = i18;
                i16 = 80;
                vaVar2.m(fcVar2, "80_80_b2", null, null, null, fjVar);
                fjVar2 = fjVar;
            }
            viewGroup.addView(vaVar2, c8.ma.e(i16, i16, i15));
        }
        j10 = j14;
        i10 = 1;
        i11 = -1;
        i12 = 0;
        eb ebVar2 = new eb(i19, context2, I);
        c8.ra.a(ebVar2);
        ebVar2.setOnClickListener(new ja(ebVar2, i10));
        viewGroup.addView(ebVar2, c8.ma.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        g10.addView(viewGroup, c8.ma.r(i11, ks.C1, 7));
        TextView textView22 = new TextView(context2);
        textView22.setTextSize(i10, f10);
        textView22.setTypeface(org.telegram.messenger.g0.o());
        int i212 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(textView22, i212, I);
        if (i7 <= 0) {
        }
        ks.i(textView22);
        textView22.setGravity(17);
        g10.addView(textView22, c8.ma.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
        if (webDocument != null) {
        }
        TextView textView42 = new TextView(context2);
        textView42.setTextSize(i10, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView42, i212, I);
        if (fjVar2 == null) {
        }
        j11 = j10;
        if (i7 <= 0) {
        }
        textView42.setMaxWidth(hi.m3.a(textView42.getText(), textView42.getPaint()));
        textView42.setGravity(17);
        g10.addView(textView42, c8.ma.t(-2, -2, 1, 0, 6, 0, 18));
        hi.d dVar2 = new hi.d(context2, I, true);
        if (i7 <= 0) {
        }
        g10.addView(dVar2, c8.ma.c(48.0f, -1));
        k80 k80Var2 = new k80(context2, I);
        org.telegram.ui.ActionBar.u6.U(k80Var2, org.telegram.ui.ActionBar.n6.z6, I);
        org.telegram.ui.ActionBar.u6.G(k80Var2, org.telegram.ui.ActionBar.n6.Xc, I);
        k80Var2.setTextSize(1, 14.0f);
        k80Var2.setText(org.telegram.messenger.g0.T2(gd.M0(i7 <= 0 ? 2131744884 : 2131744891, null), new ai.a(context2, 7)));
        k80Var2.setGravity(17);
        g10.addView(k80Var2, c8.ma.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
        org.telegram.ui.ActionBar.x2 x2Var22 = x2Var;
        x2Var22.O = g10;
        dVar2.setOnClickListener(new ah.h(e8Var, x2Var22, dVar2, 8));
        x2Var22.setOnDismissListener(new t9(f8Var, 2));
        x2Var22.O();
        x2Var22.show();
    }

    public final void X(String str, TLRPC.ChatInvite chatInvite, q10 q10Var) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = org.telegram.messenger.t0.b;
        org.telegram.ui.ActionBar.i6 I = I();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new s6(this, q10Var, j3, str2, context, I, chatInvite, str));
    }

    public final void Y(final fj fjVar, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final x10 x10Var) {
        long j3;
        String str;
        TLRPC.User c22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = org.telegram.messenger.t0.b;
        final org.telegram.ui.ActionBar.i6 I = I();
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
        if (fjVar != null) {
            TLRPC.Message message = fjVar.k;
            j3 = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? fj.B0(message) : org.telegram.messenger.n5.o(peer);
            if (j3 < 0 && fjVar.Z0() > 0 && (c22 = mp.u1(this.a).c2(Long.valueOf(fjVar.Z0()))) != null && c22.bot) {
                j3 = c22.id;
            }
        } else {
            j3 = tL_payments_paymentFormStars.bot_id;
        }
        final long j11 = j3;
        if (j11 >= 0) {
            str = o10.q(mp.u1(this.a).c2(Long.valueOf(j11)));
        } else {
            TLRPC.Chat O0 = mp.u1(this.a).O0(Long.valueOf(-j11));
            str = O0 == null ? "" : O0.title;
        }
        final String str2 = str;
        final String str3 = tL_payments_paymentFormStars.title;
        final int i10 = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: di.a7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final x8 x8Var = x8.this;
                final x10 x10Var2 = x10Var;
                final fj fjVar2 = fjVar;
                final Context context2 = context;
                final long j12 = j10;
                final String str4 = str2;
                final int i11 = i10;
                final String str5 = str3;
                final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                final long j13 = j11;
                final org.telegram.ui.ActionBar.i6 i6Var = I;
                final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.f7
                    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
                    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        boolean z10;
                        LaunchActivity launchActivity;
                        u80 u80Var;
                        TLRPC.Message message2;
                        x8 x8Var2 = x8.this;
                        TLObject tLObject2 = tLObject;
                        x10 x10Var3 = x10Var2;
                        fj fjVar3 = fjVar2;
                        Context context3 = context2;
                        long j14 = j12;
                        String str6 = str4;
                        int i12 = i11;
                        String str7 = str5;
                        TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                        long j15 = j13;
                        TLRPC.TL_error tL_error2 = tL_error;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                        org.telegram.ui.Components.lc Y = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.lc.Y() : org.telegram.ui.Components.lc.b0(Q);
                        int i13 = 0;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                if (mp.u1(x8Var2.a).m7) {
                                    x10Var3.a(Boolean.FALSE);
                                    x8.c0(context3, i6Var2);
                                    return;
                                } else {
                                    boolean[] zArr = {false};
                                    fb fbVar = new fb(context3, i6Var2, j14, 0, str6, new bi.h2(x8Var2, (Object) zArr, fjVar3, inputInvoice3, tL_payments_paymentFormStars3, x10Var3, 4), j15);
                                    fbVar.setOnDismissListener(new u1(x10Var3, zArr, 1));
                                    fbVar.show();
                                    return;
                                }
                            }
                            if (tL_error2 == null || !"FORM_EXPIRED".equals(tL_error2.text)) {
                                org.telegram.ui.Components.lc lcVar = Y;
                                x10Var3.a(Boolean.FALSE);
                                lcVar.Q(R.raw.error, 36, gd.a0(null, null, 2131743641, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                if (fjVar3 != null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia.peer = mp.u1(x8Var2.a).l1(j15);
                                    tL_messages_getExtendedMedia.id.add(Integer.valueOf(fjVar3.e1()));
                                    ConnectionsManager.getInstance(x8Var2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            JSONObject u10 = ki.t2.u(i6Var2, false);
                            if (u10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                tL_dataJSON.data = u10.toString();
                                tL_payments_getPaymentForm.flags = 1 | tL_payments_getPaymentForm.flags;
                            }
                            tL_payments_getPaymentForm.invoice = inputInvoice3;
                            ConnectionsManager.getInstance(x8Var2.a).sendRequest(tL_payments_getPaymentForm, new m7(x8Var2, fjVar3, inputInvoice3, x10Var3, Y, 0));
                            return;
                        }
                        x10Var3.a(Boolean.TRUE);
                        Utilities.d.c(new l7(x8Var2, (TLRPC.TL_payments_paymentResult) tLObject2, i13));
                        if (fjVar3 != null && (message2 = fjVar3.k) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            Drawable g10 = i5.c.g(context3, R.drawable.star_small_inner);
                            String M0 = gd.M0(2131744853, null);
                            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.G((int) j14, "StarsMediaPurchaseCompletedInfo", str6));
                            Y.getClass();
                            org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(Y.X(), Y.c);
                            dcVar.a.setImageDrawable(g10);
                            dcVar.b.setText(M0);
                            dcVar.c.setText(W2);
                            Y.b(dcVar, 2750).j();
                        } else {
                            if (i12 <= 0) {
                                z10 = true;
                                Y.I(R.raw.stars_send, gd.M0(2131744817, null), org.telegram.messenger.g0.W2(gd.G((int) j14, "StarsPurchaseCompletedInfo", str7, str6))).j();
                                launchActivity = LaunchActivity.H1;
                                if (launchActivity != null && (u80Var = launchActivity.w0) != null) {
                                    u80Var.c(z10);
                                }
                                if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                    x8Var2.R(true);
                                }
                                if (fjVar3 == null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia2.peer = mp.u1(x8Var2.a).l1(j15);
                                    tL_messages_getExtendedMedia2.id.add(Integer.valueOf(fjVar3.e1()));
                                    ConnectionsManager.getInstance(x8Var2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                    return;
                                }
                                return;
                            }
                            Y.I(R.raw.stars_send, gd.M0(2131744919, null), org.telegram.messenger.g0.W2(gd.G((int) j14, "StarsBotSubscriptionCompletedInfo", str7, str6))).j();
                        }
                        z10 = true;
                        launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            u80Var.c(z10);
                        }
                        if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                        }
                        x8Var2.R(true);
                        if (fjVar3 == null) {
                        }
                    }
                });
            }
        });
    }

    public final void Z(long j3, long j10, boolean z10) {
        int i7 = this.a;
        e00 e00Var = mp.u1(i7).t7;
        TLRPC.TL_forumTopic f10 = e00Var.f(j3, j10);
        if (f10 != null) {
            f10.nopaid_messages_exception = z10;
            a0.h hVar = e00Var.a;
            if (((ArrayList) hVar.f(j3)) != null) {
                e00Var.getMessagesStorage().C1(e00Var.getConnectionsManager().getCurrentTime(), -j3, (List) hVar.f(j3), true);
            }
            ks.f(i7).k(ks.Q3, Long.valueOf(j10));
        }
    }

    public final void a0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null || TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 >= longSparseArray.size()) {
                break;
            }
            ((o8) longSparseArray.valueAt(i10)).o(tL_starGiftUnique);
            i10++;
        }
        while (true) {
            LongSparseArray longSparseArray2 = this.K;
            if (i7 >= longSparseArray2.size()) {
                return;
            }
            m8 m8Var = (m8) longSparseArray2.valueAt(i7);
            o8 o8Var = m8Var.g;
            if (o8Var != null) {
                o8Var.o(tL_starGiftUnique);
            }
            Iterator it = m8Var.h.values().iterator();
            while (it.hasNext()) {
                ((o8) it.next()).o(tL_starGiftUnique);
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v8 b0(final fj fjVar, final bn bnVar, final long j3, boolean z10, boolean z11, final Long l10) {
        String str;
        long j10;
        final x8 x8Var;
        fj fjVar2;
        TLRPC.ReactionCount reactionCount;
        boolean z12;
        String str2;
        q8 b10 = q8.b(fjVar);
        int i7 = this.a;
        x8 y10 = y(i7, false);
        Context t6 = t(bnVar);
        if (t6 == null) {
            return null;
        }
        str = "";
        if (z11 && y10.e && y10.q(null, false, false).amount <= 0) {
            long a10 = bnVar.a();
            if (a10 >= 0) {
                str = o10.l(bnVar.getMessagesController().c2(Long.valueOf(a10)));
            } else {
                TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-a10));
                if (O0 != null) {
                    str = O0.title;
                }
            }
            final int i10 = 0;
            new fb(t6, bnVar.getResourceProvider(), j3, 5, str, new Runnable(this) { // from class: di.t7
                public final /* synthetic */ x8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.b0(fjVar, bnVar, j3, true, true, l10);
                            break;
                        default:
                            this.b.b0(fjVar, bnVar, j3, true, true, l10);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        v8 v8Var = this.B;
        if (v8Var == null || !v8Var.a.equals(b10)) {
            v8 v8Var2 = this.B;
            if (v8Var2 != null) {
                v8Var2.b();
            }
            ConnectionsManager.getInstance(i7).getCurrentTime();
            j10 = 0;
            x8Var = this;
            v8 v8Var3 = new v8(x8Var, b10, fjVar, bnVar, z10);
            x8Var.B = v8Var3;
            v8Var3.n = l10;
        } else {
            j10 = 0;
            x8Var = this;
        }
        if (x8Var.B.h + j3 > mp.u1(i7).c6) {
            x8Var.B.b();
            ConnectionsManager.getInstance(i7).getCurrentTime();
            x8Var.B = new v8(x8Var, b10, fjVar, bnVar, z10);
        }
        final long j11 = x8Var.B.h + j3;
        if (z11 && y10.e) {
            if (y10.q(null, false, false).amount < j11) {
                x8Var.B.a();
                long a11 = bnVar.a();
                if (a11 >= j10) {
                    str2 = o10.l(bnVar.getMessagesController().c2(Long.valueOf(a11)));
                } else {
                    TLRPC.Chat O02 = bnVar.getMessagesController().O0(Long.valueOf(-a11));
                    str2 = O02 != null ? O02.title : "";
                }
                final int i11 = 1;
                new fb(t6, bnVar.getResourceProvider(), j11, 5, str2, new Runnable(x8Var) { // from class: di.t7
                    public final /* synthetic */ x8 b;

                    {
                        this.b = x8Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.b0(fjVar, bnVar, j11, true, true, l10);
                                break;
                            default:
                                this.b.b0(fjVar, bnVar, j11, true, true, l10);
                                break;
                        }
                    }
                }, 0L).show();
                return null;
            }
            fjVar2 = fjVar;
            reactionCount = null;
        } else {
            fjVar2 = fjVar;
            reactionCount = null;
        }
        v8 v8Var4 = x8Var.B;
        if (fjVar2 != null) {
            TLRPC.Message message = fjVar2.k;
            if (message.reactions == null) {
                message.reactions = new TLRPC.TL_messageReactions();
                TLRPC.Message message2 = fjVar2.k;
                message2.reactions.reactions_as_tags = fj.B0(message2) == j10.i(fjVar2.K1).e();
                fjVar2.k.reactions.can_see_list = fjVar2.o3() || fjVar2.p3();
            }
            for (int i12 = 0; i12 < fjVar2.k.reactions.results.size(); i12++) {
                if (!(fjVar2.k.reactions.results.get(i12).reaction instanceof TLRPC.TL_reactionPaid)) {
                }
            }
            z12 = true;
            t8 t8Var = v8Var4.p;
            x8 x8Var2 = v8Var4.q;
            int i13 = x8Var2.a;
            org.telegram.ui.Components.ac acVar = v8Var4.e;
            fj fjVar3 = v8Var4.b;
            if (!v8Var4.i || v8Var4.j) {
                boolean z13 = org.telegram.messenger.s2.a;
            } else {
                v8Var4.h += j3;
                System.currentTimeMillis();
                acVar.c.a();
                acVar.c.c(org.telegram.messenger.g0.W2(gd.G((int) v8Var4.h, "StarsSentText", new Object[0])), true, true);
                if (v8Var4.m) {
                    v8Var4.f.b = 5000L;
                    org.telegram.messenger.g0.r(t8Var);
                    org.telegram.messenger.g0.h3(t8Var, 5000L);
                }
                int i14 = ks.o1;
                if (z12) {
                    v8Var4.l = true;
                    fjVar3.f((int) j3, v8Var4.c(), true);
                    x8Var2.g += j3;
                    ks.f(i13).k(i14, Long.valueOf(fj.B0(fjVar3.k)), Integer.valueOf(fjVar3.e1()), fjVar3.k.reactions);
                    ks.f(i13).k(ks.A3, new Object[0]);
                } else {
                    v8Var4.l = false;
                    TLRPC.Message message3 = fjVar3.k;
                    if (message3.reactions == null) {
                        message3.reactions = new TLRPC.TL_messageReactions();
                        TLRPC.Message message4 = fjVar3.k;
                        message4.reactions.reactions_as_tags = fj.B0(message4) == j10.i(fjVar3.K1).e();
                        fjVar3.k.reactions.can_see_list = fjVar3.o3() || fjVar3.p3();
                    }
                    for (int i15 = 0; i15 < fjVar3.k.reactions.results.size(); i15++) {
                        if (fjVar3.k.reactions.results.get(i15).reaction instanceof TLRPC.TL_reactionPaid) {
                            reactionCount = fjVar3.k.reactions.results.get(i15);
                        }
                    }
                    if (reactionCount == null) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
                        tL_reactionCount.count = 1;
                        tL_reactionCount.chosen = true;
                        fjVar3.k.reactions.results.add(0, tL_reactionCount);
                        v8Var4.k--;
                    }
                    ks.f(i13).k(i14, Long.valueOf(fj.B0(fjVar3.k)), Integer.valueOf(fjVar3.e1()), fjVar3.k.reactions);
                    v8Var4.k += j3;
                }
                acVar.b.setText(v8Var4.d());
            }
            v8 v8Var5 = x8Var.B;
            v8Var5.n = l10;
            return v8Var5;
        }
        if (!z10) {
            z12 = false;
            t8 t8Var2 = v8Var4.p;
            x8 x8Var22 = v8Var4.q;
            int i132 = x8Var22.a;
            org.telegram.ui.Components.ac acVar2 = v8Var4.e;
            fj fjVar32 = v8Var4.b;
            if (v8Var4.i) {
            }
            boolean z132 = org.telegram.messenger.s2.a;
            v8 v8Var52 = x8Var.B;
            v8Var52.n = l10;
            return v8Var52;
        }
        z12 = true;
        t8 t8Var22 = v8Var4.p;
        x8 x8Var222 = v8Var4.q;
        int i1322 = x8Var222.a;
        org.telegram.ui.Components.ac acVar22 = v8Var4.e;
        fj fjVar322 = v8Var4.b;
        if (v8Var4.i) {
        }
        boolean z1322 = org.telegram.messenger.s2.a;
        v8 v8Var522 = x8Var.B;
        v8Var522.n = l10;
        return v8Var522;
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
            int e12 = ((fj) obj).e1();
            hashSet.add(Integer.valueOf(e12));
            if (this.Q.remove(Integer.valueOf(e12))) {
                this.R.put(Integer.valueOf(e12), new aa.r(this, hashSet, runnable, 29));
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
    public final void d(fj fjVar) {
        boolean z10;
        x7 x7Var;
        org.telegram.ui.ActionBar.h2 T2;
        s8 s8Var;
        TLRPC.Message message = fjVar.k;
        if (message == null) {
            return;
        }
        long j3 = message.paid_message_stars;
        if (j3 <= 0 || fj.c3(message)) {
            return;
        }
        s8 s8Var2 = this.N;
        int i7 = 1;
        int i10 = 0;
        if (s8Var2 == null || s8Var2.g <= 0 || !s8Var2.m || s8Var2.n || s8Var2.o) {
            if (!org.telegram.ui.Components.b5.a0(this.a, fj.B0(fjVar.k))) {
                Long l10 = (Long) this.O.get(Long.valueOf(fj.B0(fjVar.k)));
                if (l10 == null || System.currentTimeMillis() - l10.longValue() <= 5000) {
                    Integer num = (Integer) this.P.get(Long.valueOf(fj.B0(fjVar.k)));
                    if (num != null) {
                    }
                }
            }
            z10 = false;
            int e12 = fjVar.e1();
            if (z10) {
                this.Q.add(Integer.valueOf(e12));
            }
            long B0 = fj.B0(fjVar.k);
            ai.u2 u2Var = new ai.u2(i7, this, z10);
            x7Var = new x7(this, z10, e12, i10);
            T2 = LaunchActivity.T();
            s8Var = this.N;
            if (s8Var != null && (s8Var.o || s8Var.n)) {
                this.N = null;
            }
            if (this.N != null) {
                if (T2 != null && !T2.isRemovingFromStack()) {
                    s8 s8Var3 = this.N;
                    if (s8Var3.b == B0) {
                    }
                }
                this.N.a();
                this.N = null;
            }
            if (T2 != null || T2.isRemovingFromStack()) {
                x7Var.run();
            }
            if (this.N == null) {
                this.N = new s8(T2, B0);
            }
            s8 s8Var4 = this.N;
            org.telegram.ui.Components.ac acVar = s8Var4.d;
            org.telegram.ui.Components.ec ecVar = s8Var4.e;
            r8 r8Var = s8Var4.p;
            if (s8Var4.n || s8Var4.o) {
                x7Var.run();
                return;
            }
            s8Var4.g++;
            s8Var4.k.add(fjVar);
            s8Var4.h += j3;
            s8Var4.i = u2Var;
            s8Var4.j.add(x7Var);
            if (s8Var4.m && !z10) {
                s8Var4.m = false;
                org.telegram.messenger.g0.r(r8Var);
                org.telegram.ui.Components.gc gcVar = s8Var4.c;
                gcVar.j = 5000;
                gcVar.i(true);
                if (System.currentTimeMillis() - s8Var4.l > 500) {
                    ecVar.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                } else {
                    ecVar.setAlpha(0.0f);
                    ecVar.setVisibility(8);
                }
            }
            w8 w8Var = s8Var4.f;
            if (w8Var != null && s8Var4.m) {
                w8Var.b = 3000L;
                org.telegram.messenger.g0.r(r8Var);
                org.telegram.messenger.g0.h3(r8Var, 3000L);
            }
            org.telegram.ui.Components.n6 n6Var = acVar.b;
            int i11 = s8Var4.g;
            n6Var.setText(i11 == 1 ? gd.M0(2131747510, null) : gd.G(i11, "PaidMessageSentTitle", new Object[0]));
            acVar.c.setText(org.telegram.messenger.g0.W2(gd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) s8Var4.h))));
            acVar.a.d();
            return;
        }
        z10 = true;
        int e122 = fjVar.e1();
        if (z10) {
        }
        long B02 = fj.B0(fjVar.k);
        ai.u2 u2Var2 = new ai.u2(i7, this, z10);
        x7Var = new x7(this, z10, e122, i10);
        T2 = LaunchActivity.T();
        s8Var = this.N;
        if (s8Var != null) {
            this.N = null;
        }
        if (this.N != null) {
        }
        if (T2 != null) {
        }
        x7Var.run();
    }

    public final void d0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fj fjVar = (fj) list.get(0);
        long B0 = fj.B0(fjVar.k);
        int i7 = this.a;
        if (B0 >= 0) {
            mp.u1(i7).c3(mp.u1(i7).c2(Long.valueOf(B0)), 0, true, null);
        } else {
            mp.u1(i7).b3(0, -B0, true);
        }
        org.telegram.ui.Components.lc.b0(LaunchActivity.T()).Q(R.raw.error, 36, pb.T0(TextUtils.concat(gd.G((int) fjVar.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", gd.G((int) fjVar.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
    }

    public final void e0(LaunchActivity launchActivity, long j3, String str) {
        if (this.e) {
            f0(launchActivity, j3, str);
        } else {
            r(new i2(this, (Object) launchActivity, j3, (Object) str, 5));
        }
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, q10 q10Var, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i7 = this.a;
        if (mp.u1(i7).m7) {
            org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
            if (Q == null || Q.getContext() == null) {
                c0(activity, null);
                return;
            } else {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            }
        }
        boolean z10 = ((org.telegram.messenger.h0) mp.u1(i7).A7.n0.b).c && inputPeer != null;
        if ((!org.telegram.messenger.s2.b() && org.telegram.messenger.r1.i().k()) || z10) {
            if (!org.telegram.messenger.r1.i().k()) {
                q10Var.a(Boolean.FALSE, "INVOICE DISABLED");
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
            org.telegram.messenger.r1.i().o(Arrays.asList(a10), new a1.d(q10Var, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity, 2));
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
        JSONObject u10 = ki.t2.u(I(), false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getPaymentForm, new bi.m1(this, q10Var, tL_inputInvoiceStars, 5));
    }

    public final void f0(LaunchActivity launchActivity, long j3, String str) {
        if (p().amount < j3 && j3 > 0) {
            new fb(launchActivity, null, j3, 4, str, new ai.o(12), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
        if (T2 == null) {
            return;
        }
        org.telegram.ui.Components.gc K = org.telegram.ui.Components.lc.b0(T2).K(R.raw.stars_topup, gd.M0(2131744729, null), gd.M0(2131744728, null), new ai.o(11));
        K.j = 5000;
        K.k(true);
    }

    public final void g(final long j3, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final q10 q10Var) {
        int i7;
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.i6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new bi.k2(this, q10Var, j3, tLObject, tL_textWithEntities, 4));
                return;
            }
            if (z10) {
                i7 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i7 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String l10 = org.telegram.messenger.n5.l(this.a, j3);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = mp.u1(this.a).q1(j3);
            tL_inputInvoicePremiumGiftStars.months = i7;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.t2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: di.b7
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final x8 x8Var = x8.this;
                    final q10 q10Var2 = q10Var;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.i6 i6Var = I;
                    final String str = l10;
                    final long j10 = j3;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.g3(new Runnable() { // from class: di.h7
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            final q10 q10Var3 = q10Var2;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                x8.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                q10Var3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i10 = 0;
                            final long j11 = 0;
                            while (i10 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                                i10++;
                                j11 += tL_labeledPrice.amount;
                            }
                            final x8 x8Var2 = x8.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(x8Var2.a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                            final String str2 = str;
                            final long j12 = j10;
                            final TLObject tLObject5 = tLObject3;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: di.o7
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject6, final TLRPC.TL_error tL_error3) {
                                    final x8 x8Var3 = x8.this;
                                    final q10 q10Var4 = q10Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                    final long j13 = j11;
                                    final String str3 = str2;
                                    final long j14 = j12;
                                    final TLObject tLObject7 = tLObject5;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: di.u7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            u80 u80Var;
                                            x8 x8Var4 = x8.this;
                                            TLObject tLObject8 = tLObject6;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            q10 q10Var5 = q10Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.i6 i6Var4 = i6Var3;
                                            long j15 = j13;
                                            String str4 = str3;
                                            long j16 = j14;
                                            TLObject tLObject9 = tLObject7;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                                            org.telegram.ui.Components.lc Y = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.lc.Y() : org.telegram.ui.Components.lc.b0(Q);
                                            if (!(tLObject8 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 == null || !"BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        q10Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                        return;
                                                    } else {
                                                        q10Var5.a(Boolean.FALSE, null);
                                                        Y.Q(R.raw.error, 36, gd.a0(null, null, 2131743641, tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS")).j();
                                                        return;
                                                    }
                                                }
                                                if (mp.u1(x8Var4.a).m7) {
                                                    q10Var5.a(Boolean.FALSE, null);
                                                    x8.c0(context6, i6Var4);
                                                    return;
                                                } else {
                                                    boolean[] zArr = {false};
                                                    fb fbVar = new fb(context6, i6Var4, j15, 6, str4, new a3(x8Var4, zArr, j16, tLObject9, tL_textWithEntities5, q10Var5), 0L);
                                                    fbVar.setOnDismissListener(new n7(1, q10Var5, zArr));
                                                    fbVar.show();
                                                    return;
                                                }
                                            }
                                            Utilities.d.c(new l7(x8Var4, (TLRPC.TL_payments_paymentResult) tLObject8, 3));
                                            x8Var4.R(true);
                                            q10Var5.a(Boolean.TRUE, null);
                                            org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(x8Var4.a).b();
                                            if (b10 != null && b10.a(j16)) {
                                                mp.u1(x8Var4.a).h7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j16, false).apply();
                                            }
                                            mp.u1(x8Var4.a).h7.edit().putBoolean("show_gift_for_" + j16, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j16, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity == null || (u80Var = launchActivity.w0) == null) {
                                                return;
                                            }
                                            u80Var.c(true);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }
    }

    public final void g0(final long j3, final long j10, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i7 = this.a;
        togglenopaidmessagesexception.user_id = mp.u1(i7).q1(j3);
        if (j10 != 0) {
            togglenopaidmessagesexception.parent_peer = mp.u1(i7).l1(j10);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i7).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: di.v7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.g3(new b8(x8.this, tLObject, j10, j3, z11));
            }
        });
    }

    public final void h(final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final q10 q10Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.i6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new k(this, q10Var, tL_payments_paymentFormStarGift, starGift, j3, tL_textWithEntities, z10));
            return;
        }
        final String l10 = org.telegram.messenger.n5.l(this.a, j3);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = mp.u1(this.a).l1(j3);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = ki.t2.u(I, false);
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
        for (int i7 = 0; i7 < size; i7++) {
            j10 += arrayList.get(i7).amount;
            context2 = context2;
        }
        final long j11 = j10;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: di.k7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final x8 x8Var = x8.this;
                final q10 q10Var2 = q10Var;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.i6 i6Var = I;
                final long j12 = j11;
                final String str = l10;
                final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = tL_payments_paymentFormStarGift;
                final TL_stars.StarGift starGift2 = starGift;
                final long j13 = j3;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                final boolean z11 = z10;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.q7
                    @Override // java.lang.Runnable
                    public final void run() {
                        u80 u80Var;
                        final x8 x8Var2 = x8.this;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final q10 q10Var3 = q10Var2;
                        Context context4 = context3;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        long j14 = j12;
                        String str2 = str;
                        final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift3 = tL_payments_paymentFormStarGift2;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final long j15 = j13;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        final boolean z12 = z11;
                        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                        org.telegram.ui.Components.lc Y = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.lc.Y() : org.telegram.ui.Components.lc.b0(Q);
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                                    q10Var3.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                    return;
                                } else {
                                    q10Var3.a(Boolean.FALSE, null);
                                    Y.Q(R.raw.error, 36, gd.a0(null, null, 2131743641, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                    return;
                                }
                            }
                            if (mp.u1(x8Var2.a).m7) {
                                q10Var3.a(Boolean.FALSE, null);
                                x8.c0(context4, i6Var2);
                                return;
                            } else {
                                final boolean[] zArr = {false};
                                fb fbVar = new fb(context4, i6Var2, j14, 6, str2, new Runnable() { // from class: di.z7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        x8 x8Var3 = x8.this;
                                        x8Var3.getClass();
                                        zArr[0] = true;
                                        x8Var3.h(tL_payments_paymentFormStarGift3, starGift3, j15, tL_textWithEntities3, z12, q10Var3);
                                    }
                                }, 0L);
                                fbVar.setOnDismissListener(new n7(2, q10Var3, zArr));
                                fbVar.show();
                                return;
                            }
                        }
                        Utilities.d.c(new l7(x8Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 4));
                        x8Var2.D = false;
                        x8Var2.E = true;
                        x8Var2.G = 0L;
                        x8Var2.T();
                        x8Var2.O(j15);
                        x8Var2.R(true);
                        q10Var3.a(Boolean.TRUE, null);
                        org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(x8Var2.a).b();
                        if (b10 != null && b10.a(j15)) {
                            mp.u1(x8Var2.a).h7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j15, false).apply();
                        }
                        mp.u1(x8Var2.a).h7.edit().putBoolean("show_gift_for_" + j15, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j15, true).apply();
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity == null || (u80Var = launchActivity.w0) == null) {
                            return;
                        }
                        u80Var.c(true);
                    }
                });
            }
        });
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, q10 q10Var) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.b;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.i6 I = I();
            long j3 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i7 = j10.t0;
                boolean[] zArr = {false};
                h8 h8Var = new h8(this, j3, i7, zArr, q10Var, context2, I, chatInvite, str);
                w2 w2Var = new w2(this, zArr, q10Var);
                org.telegram.ui.ActionBar.x2 j10 = org.telegram.messenger.f3.j(1, context2, I, false);
                LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
                g10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new ua(context2, 40, 0, 0), c8.ma.c(-1.0f, -1));
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context2);
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                b9Var.s(chatInvite.color);
                String str2 = chatInvite.title;
                b9Var.A = true;
                b9Var.n = 0;
                b9Var.m = false;
                org.telegram.ui.Components.b9.a(str2, null, null, b9Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    q9Var.j(org.telegram.messenger.fc.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(80.0f), false, null, false), chatInvite.photo), "80_80", b9Var, chatInvite);
                } else {
                    q9Var.setImageDrawable(b9Var);
                }
                frameLayout.addView(q9Var, c8.ma.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i10 = org.telegram.ui.ActionBar.n6.h5;
                org.telegram.ui.ActionBar.u6.x(frameLayout, drawable, i10, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, c8.ma.e(26, 26, 17));
                imageView.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, c8.ma.e(26, 26, 17));
                imageView2.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView2.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                eb ebVar = new eb(i7, context2, I);
                c8.ra.a(ebVar);
                ebVar.setOnClickListener(new ja(ebVar, 0));
                frameLayout.addView(ebVar, c8.ma.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                g10.addView(frameLayout, c8.ma.r(-1, ks.C1, 7));
                TextView textView = new TextView(context2);
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                int i11 = org.telegram.ui.ActionBar.n6.j5;
                n10.r(textView, i11, I, null, 2131744777);
                textView.setGravity(17);
                TextView f10 = n10.f(g10, textView, c8.ma.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f10.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(f10, i11, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i12 = tL_starsSubscriptionPricing.period;
                if (i12 == 2592000) {
                    f10.setText(org.telegram.messenger.g0.W2(gd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    f10.setText(org.telegram.messenger.g0.W2(gd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, i12 == 300 ? "5 minutes" : "a minute")));
                }
                f10.setMaxWidth(hi.m3.a(f10.getText(), f10.getPaint()));
                f10.setGravity(17);
                g10.addView(f10, c8.ma.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.u6.U(textView2, i11, I);
                    textView2.setText(org.telegram.messenger.j6.m(chatInvite.about, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    textView2.setGravity(17);
                    g10.addView(textView2, c8.ma.t(-2, -2, 1, 0, 6, 0, 22));
                }
                hi.d dVar = new hi.d(context2, I, true);
                dVar.i(gd.M0(2131744786, null), false, true);
                g10.addView(dVar, c8.ma.o(-1, 48));
                k80 k80Var = new k80(context2, I);
                k80Var.setText(org.telegram.messenger.g0.T2(gd.M0(2131744785, null), new ai.a(context2, 6)));
                k80Var.setGravity(17);
                k80Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.B6, I);
                org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, I);
                g10.addView(k80Var, c8.ma.t(-1, -2, 49, 14, 14, 14, 6));
                j10.O = g10;
                dVar.setOnClickListener(new ah.h(h8Var, j10, dVar, 7));
                j10.setOnDismissListener(new t9(w2Var, 1));
                j10.Q(i10);
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1() && T2 != null && !org.telegram.messenger.g0.u1(T2)) {
                    j10.a0(T2);
                }
                j10.show();
            }
        }
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final bi.l8 l8Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.i6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new Runnable() { // from class: di.q6
                @Override // java.lang.Runnable
                public final void run() {
                    x8 x8Var = x8.this;
                    boolean z12 = x8Var.e;
                    bi.l8 l8Var2 = l8Var;
                    if (z12) {
                        x8Var.i(starGift, z10, z11, j3, tL_textWithEntities, l8Var2);
                    } else {
                        x8.e("NO_BALANCE");
                        l8Var2.a(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String l10 = org.telegram.messenger.n5.l(this.a, j3);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z10;
        tL_inputInvoiceStarGift.peer = mp.u1(this.a).l1(j3);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z11;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = ki.t2.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: di.r6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final x8 x8Var = x8.this;
                final bi.l8 l8Var2 = l8Var;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.i6 i6Var = I;
                final String str = l10;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z12 = z10;
                final boolean z13 = z11;
                final long j10 = j3;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.i7
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final bi.l8 l8Var3 = l8Var2;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            x8.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            l8Var3.a(Boolean.FALSE, null);
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
                        final x8 x8Var2 = x8.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(x8Var2.a);
                        final Context context4 = context3;
                        final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z15 = z12;
                        final boolean z16 = z13;
                        final long j12 = j10;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: di.p7
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final x8 x8Var3 = x8.this;
                                final bi.l8 l8Var4 = l8Var3;
                                final Context context5 = context4;
                                final org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                final long j13 = j11;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z17 = z15;
                                final boolean z18 = z16;
                                final long j14 = j12;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.y6
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r5v17 */
                                    /* JADX WARN: Type inference failed for: r5v18, types: [boolean] */
                                    /* JADX WARN: Type inference failed for: r5v20 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str4;
                                        SpannableStringBuilder spannableStringBuilder;
                                        u80 u80Var;
                                        ?? r52;
                                        x8 x8Var4 = x8.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        bi.l8 l8Var5 = l8Var4;
                                        Context context6 = context5;
                                        org.telegram.ui.ActionBar.i6 i6Var4 = i6Var3;
                                        long j15 = j13;
                                        String str5 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z19 = z17;
                                        boolean z20 = z18;
                                        long j16 = j14;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                                        org.telegram.ui.Components.lc Y = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.lc.Y() : org.telegram.ui.Components.lc.b0(Q);
                                        if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                            if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                if (mp.u1(x8Var4.a).m7) {
                                                    l8Var5.a(Boolean.FALSE, null);
                                                    x8.c0(context6, i6Var4);
                                                    return;
                                                } else {
                                                    boolean[] zArr = {false};
                                                    fb fbVar = new fb(context6, i6Var4, j15, 6, str5, new r7(x8Var4, zArr, starGift5, z19, z20, j16, tL_textWithEntities5, l8Var5), 0L);
                                                    fbVar.setOnDismissListener(new u1(l8Var5, zArr, 2));
                                                    fbVar.show();
                                                    return;
                                                }
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                l8Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                l8Var5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            } else {
                                                l8Var5.a(Boolean.FALSE, null);
                                                Y.Q(R.raw.error, 36, gd.a0(null, null, 2131743641, tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS")).j();
                                                return;
                                            }
                                        }
                                        Utilities.d.c(new l7(x8Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 2));
                                        x8Var4.D = false;
                                        x8Var4.E = true;
                                        x8Var4.G = 0L;
                                        x8Var4.T();
                                        x8Var4.O(j16);
                                        x8Var4.R(true);
                                        l8Var5.a(Boolean.TRUE, null);
                                        org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(x8Var4.a).b();
                                        if (b10 != null && b10.a(j16)) {
                                            mp.u1(x8Var4.a).h7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j16, false).apply();
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            str4 = str5;
                                            spannableStringBuilder = null;
                                        } else {
                                            int i10 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i10;
                                            str4 = str5;
                                            spannableStringBuilder = org.telegram.messenger.g0.W2(gd.H(',', "Gift2SentRemainsLimit", Math.max(0, i10)));
                                        }
                                        if (j16 < 0) {
                                            long j17 = -j16;
                                            TLRPC.ChatFull P0 = mp.u1(x8Var4.a).P0(j17);
                                            if (P0 != null) {
                                                P0.stargifts_count++;
                                                P0.flags2 |= 262144;
                                                mp.u1(x8Var4.a).Y3(P0);
                                            }
                                            if (Q instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) Q;
                                                if (profileActivity.a() == j16) {
                                                    vv0 vv0Var = profileActivity.O;
                                                    if (vv0Var != null) {
                                                        vv0Var.P1(true);
                                                        profileActivity.O.k1(14);
                                                        r52 = 0;
                                                        profileActivity.X4(false);
                                                    } else {
                                                        r52 = 0;
                                                    }
                                                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(Q);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String M0 = gd.M0(2131744874, null);
                                                    if (spannableStringBuilder == null) {
                                                        Object[] objArr = new Object[1];
                                                        objArr[r52] = str4;
                                                        spannableStringBuilder = org.telegram.messenger.g0.W2(gd.G((int) j15, "StarsGiftCompletedChannelText", objArr));
                                                    }
                                                    b02.s(document, M0, spannableStringBuilder).k(r52);
                                                }
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", j17);
                                            bundle.putBoolean("open_gifts", true);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                            profileActivity2.whenFullyVisible(new bi.k2(profileActivity2, starGift5, spannableStringBuilder, j15, str4, 5));
                                            Q.presentFragment(profileActivity2);
                                        } else if ((Q instanceof bn) && ((bn) Q).a() == j16) {
                                            org.telegram.ui.Components.lc b03 = org.telegram.ui.Components.lc.b0(Q);
                                            TLRPC.Document document2 = starGift5.sticker;
                                            String M02 = gd.M0(2131744874, null);
                                            if (spannableStringBuilder == null) {
                                                spannableStringBuilder = org.telegram.messenger.g0.W2(gd.G((int) j15, "StarsGiftCompletedText", new Object[0]));
                                            }
                                            b03.s(document2, M02, spannableStringBuilder).k(true);
                                        } else {
                                            ks f10 = ks.f(x8Var4.a);
                                            int i11 = ks.v;
                                            Long valueOf = Long.valueOf(j16);
                                            Boolean bool = Boolean.FALSE;
                                            f10.k(i11, valueOf, bool);
                                            ks.f(x8Var4.a).k(ks.u, Long.valueOf(j16), bool);
                                            bn ua2 = bn.ua(j16);
                                            ua2.whenFullyVisible(new i2(ua2, starGift5, spannableStringBuilder, j15, 4));
                                            Q.presentFragment(ua2);
                                        }
                                        mp.u1(x8Var4.a).h7.edit().putBoolean("show_gift_for_" + j16, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j16, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || (u80Var = launchActivity.w0) == null) {
                                            return;
                                        }
                                        u80Var.c(true);
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
        int i7 = ks.A3;
        int i10 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            ks.f(i10).k(i7, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            ks.f(i10).k(i7, new Object[0]);
        }
    }

    public final boolean j() {
        if (!this.b) {
            return false;
        }
        org.telegram.messenger.t0.u();
        if (!org.telegram.messenger.s2.a()) {
            org.telegram.messenger.t0.r();
            TL_stars.StarsAmount p10 = p();
            if (p10.nanos == 0 && p10.amount == 0) {
                return false;
            }
        }
        return true;
    }

    public final void j0(final fj fjVar, final long j3, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (fjVar == null) {
            runnable.run();
            return;
        }
        final long B0 = fj.B0(fjVar.k);
        final int e12 = fjVar.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) fjVar.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i7 = this.a;
        tL_messages_editMessage.peer = mp.u1(i7).l1(B0);
        int i10 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i10;
        tL_messages_editMessage.schedule_date = fjVar.k.date;
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
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: di.c8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.g3(new i8(x8.this, tLObject, runnable, tL_error, z10, B0, e12, fjVar, j3));
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
            o8 o8Var = (o8) longSparseArray.valueAt(i7);
            for (int i10 = 0; i10 < o8Var.l.size(); i10++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) o8Var.l.get(i10);
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new bi.k1(10, this, runnable));
        }
        if (!z10 || this.g <= 0) {
            return this.f;
        }
        cg.a n10 = cg.a.n(this.f);
        return cg.a.h(Math.max(0L, n10.a() - this.g), n10.a).q();
    }

    public final void r(Runnable runnable) {
        q(runnable, true, false);
    }

    public final cg.a s() {
        cg.a m10 = cg.a.m(p());
        if (m10 == null) {
            return cg.a.j(0L, this.b ? cg.b.b : cg.b.a);
        }
        return m10;
    }

    public final ArrayList u() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new s7(this, 3));
        return this.m;
    }

    public final ArrayList v() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new s7(this, 4));
        return this.p;
    }

    public final ArrayList z() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new s7(this, 2));
        return this.j;
    }
}
