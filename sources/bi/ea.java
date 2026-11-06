package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.k00;
import org.telegram.messenger.m20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.r80;
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ea {
    public static volatile ea[][] S = (ea[][]) Array.newInstance((Class<?>) ea.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public ca B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public z9 N;
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

    public ea(int i7, boolean z9) {
        this.a = i7;
        this.b = z9;
    }

    public static org.telegram.ui.ActionBar.f6 I() {
        org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
        if (T2 != null) {
            return T2.getResourceProvider();
        }
        return null;
    }

    public static ea L(int i7) {
        return y(i7, true);
    }

    public static boolean T(int i7, cg.a aVar) {
        return aVar == null || x(i7, aVar.a).s().b >= aVar.b;
    }

    public static void a(ea eaVar, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = eaVar.I;
        ArrayList arrayList2 = eaVar.J;
        int i7 = eaVar.a;
        ArrayList arrayList3 = eaVar.H;
        eaVar.C = false;
        eaVar.D = true;
        if (!(starGifts instanceof TL_stars.TL_starGifts)) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i10 = eaVar.F;
                long currentTimeMillis = System.currentTimeMillis();
                eaVar.G = currentTimeMillis;
                yr a02 = yr.a0(i7);
                a02.a.c(new f9(i10, 0, currentTimeMillis, a02, arrayList3));
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        qp.s1(i7).Y3(tL_starGifts.users, false);
        qp.s1(i7).S3(tL_starGifts.chats, false);
        yr.a0(i7).m1(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList3.clear();
        arrayList3.addAll(tL_starGifts.gifts);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new bg.d(4)), new bg.d(5)));
        arrayList.clear();
        arrayList.addAll(arrayList3);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(6)));
        eaVar.F = tL_starGifts.hash;
        eaVar.G = System.currentTimeMillis();
        qs.f(i7).k(qs.F3, new Object[0]);
        ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
        int i11 = eaVar.F;
        long j3 = eaVar.G;
        yr a03 = yr.a0(i7);
        a03.a.c(new f9(i11, 0, j3, a03, arrayList4));
    }

    public static /* synthetic */ void b(ea eaVar, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i7 = eaVar.a;
        qp.s1(i7).Y3(arrayList2, true);
        qp.s1(i7).S3(arrayList3, true);
        eaVar.E = true;
        ArrayList arrayList4 = eaVar.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = eaVar.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new bg.d(1)), new bg.d(2)));
        ArrayList arrayList6 = eaVar.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new bg.d(3)));
        eaVar.F = num.intValue();
        eaVar.G = l10.longValue();
        eaVar.C = false;
        qs.f(i7).k(qs.F3, new Object[0]);
        eaVar.U();
    }

    public static void c0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        String M0 = org.telegram.messenger.hd.M0(2131745061, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131745062, null);
        jg.g.C(null, 2131747830, alertDialog$Builder, null);
    }

    public static void e(String str) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        ((Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.hc.X() : org.telegram.ui.Components.hc.a0(Q)).Q(R.raw.error, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, str)).j();
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

    public static Context t(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var != null && f2Var.getContext() != null) {
            return f2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.G1;
        }
        if (org.telegram.messenger.t0.b != null) {
            return org.telegram.messenger.t0.b;
        }
        return null;
    }

    public static ea w(int i7) {
        return y(i7, false);
    }

    public static ea x(int i7, cg.b bVar) {
        return y(i7, bVar == cg.b.b);
    }

    public static ea y(int i7, boolean z9) {
        ea eaVar;
        ea eaVar2 = S[z9 ? 1 : 0][i7];
        if (eaVar2 != null) {
            return eaVar2;
        }
        synchronized (T[z9 ? 1 : 0][i7]) {
            try {
                eaVar = S[z9 ? 1 : 0][i7];
                if (eaVar == null) {
                    ea[] eaVarArr = S[z9 ? 1 : 0];
                    ea eaVar3 = new ea(i7, z9);
                    eaVarArr[i7] = eaVar3;
                    eaVar = eaVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eaVar;
    }

    public final long A(x9 x9Var, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l10;
        ca caVar = this.B;
        if (caVar != null && caVar.a.equals(x9Var) && (l10 = this.B.n) != null) {
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
        Long y12 = qp.s1(this.a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final long B(ij ijVar) {
        Long l10;
        ca caVar = this.B;
        if (caVar != null && caVar.a.equals(x9.b(ijVar)) && (l10 = this.B.n) != null) {
            return l10.longValue();
        }
        Long A1 = ijVar == null ? null : ijVar.A1();
        if (A1 != null) {
            return A1.longValue();
        }
        Long y12 = qp.s1(this.a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final void C(long j3, long j10, c20 c20Var) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i7 = this.a;
        getpaidmessagesrevenue.user_id = qp.s1(i7).o1(j3);
        if (j10 != 0) {
            getpaidmessagesrevenue.parent_peer = qp.s1(i7).j1(j10);
        }
        ConnectionsManager.getInstance(i7).sendRequest(getpaidmessagesrevenue, new e9(c20Var, 0));
    }

    public final long D(int i7, long j3) {
        ca caVar = this.B;
        if (caVar == null) {
            return 0L;
        }
        x9 x9Var = caVar.a;
        if (x9Var.a == j3 && x9Var.b == i7 && caVar.l) {
            return caVar.h;
        }
        return 0L;
    }

    public final long E(ij ijVar) {
        TLRPC.Message message;
        if (ijVar == null || (message = ijVar.k) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || ijVar.l3()) && ijVar.k.fwd_from != null) ? D(ijVar.k.fwd_from.saved_from_msg_id, ijVar.Z0()) : D(ijVar.f1(), ij.B0(ijVar.k));
    }

    public final t9 F(long j3, boolean z9) {
        LongSparseArray longSparseArray = this.K;
        t9 t9Var = (t9) longSparseArray.get(j3);
        if (t9Var != null || !z9) {
            return t9Var;
        }
        t9 t9Var2 = new t9(this.a, j3);
        longSparseArray.put(j3, t9Var2);
        return t9Var2;
    }

    public final v9 G(long j3, boolean z9) {
        LongSparseArray longSparseArray = this.L;
        v9 v9Var = (v9) longSparseArray.get(j3);
        if (v9Var != null || !z9) {
            return v9Var;
        }
        v9 v9Var2 = new v9(this.a, j3, true);
        longSparseArray.put(j3, v9Var2);
        return v9Var2;
    }

    public final void H(TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z9, c20 c20Var) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        org.telegram.ui.ActionBar.f6 I = I();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            r(new w2(this, c20Var, starGift, j3));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = qp.s1(this.a).j1(j3);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z9;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = hi.a3.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new j(6, this, c20Var));
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

    public final void K(long j3, c20 c20Var) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j3));
        if (stargiftupgradepreview != null) {
            c20Var.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j3;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new h3(this, j3, c20Var, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, c20 c20Var) {
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.b, null);
        u1Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new g2(this, u1Var, inputSavedStarGift, c20Var, 3));
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
        v9 G = G(j3, false);
        if (G != null) {
            G.j(false);
        }
        t9 t9Var = (t9) this.K.get(j3);
        if (t9Var != null) {
            t9Var.g();
        }
    }

    public final void Q(TLRPC.UserFull userFull) {
        if (userFull == null) {
            return;
        }
        long j3 = userFull.id;
        v9 G = G(j3, false);
        if (G != null && G.n != userFull.stargifts_count) {
            G.j(false);
        }
        t9 t9Var = (t9) this.K.get(j3);
        if (t9Var != null) {
            t9Var.g();
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

    public final void S(boolean z9) {
        for (int i7 = 0; i7 < 3; i7++) {
            boolean[] zArr = this.t;
            if (!zArr[i7]) {
                this.q[i7].clear();
                this.s[i7] = null;
                zArr[i7] = false;
                this.u[i7] = false;
                if (z9) {
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
            boolean z9 = this.E;
            int i7 = this.a;
            if (z9) {
                int i10 = this.F;
                ai.i iVar = new ai.i(this, 7);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i10;
                ConnectionsManager.getInstance(i7).sendRequest(getstargifts, new j0(iVar, 2));
                return;
            }
            a1.c cVar = new a1.c(this, 15);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            yr a02 = yr.a0(i7);
            a02.a.c(new u0(a02, arrayList3, arrayList2, arrayList, cVar, 3));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new x8(this, 1));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new j2(this, i7, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03c4  */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(ij ijVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, c20 c20Var) {
        long j3;
        String str;
        boolean z9;
        org.telegram.ui.ActionBar.v2 v2Var;
        k9 k9Var;
        l9 l9Var;
        ViewGroup viewGroup;
        ij ijVar2;
        int i7;
        float f10;
        ?? r22;
        int i10;
        long j10;
        int i11;
        long j11;
        TLRPC.Message message;
        boolean z10;
        String str2;
        int i12;
        String G;
        String G2;
        String str3;
        char c10;
        String G3;
        boolean z11;
        TLRPC.User a22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        int[] iArr;
        String M0;
        TLRPC.Message message2;
        int i13;
        int i14;
        ic icVar;
        FrameLayout frameLayout;
        org.telegram.messenger.hc hcVar;
        boolean z12;
        org.telegram.messenger.hc hcVar2;
        k9 k9Var2;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        qp.s1(this.a).Y3(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.f6 I = I();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            r(new a3(this, runnable, ijVar, inputInvoice, tL_payments_paymentFormStars, c20Var, 5));
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        int i15 = 0;
        long j12 = 0;
        while (i15 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i15);
            i15++;
            j12 += tL_labeledPrice.amount;
        }
        if (ijVar == null || ijVar.D != 29) {
            j3 = tL_payments_paymentFormStars.bot_id;
        } else {
            TLRPC.Message message3 = ijVar.k;
            TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
            j3 = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? ij.B0(message3) : org.telegram.messenger.m5.o(peer2);
        }
        long j13 = j3;
        if (j13 >= 0) {
            TLRPC.User a23 = qp.s1(this.a).a2(Long.valueOf(j13));
            str = t10.p(a23);
            z9 = !t10.t(a23);
        } else {
            TLRPC.Chat M02 = qp.s1(this.a).M0(Long.valueOf(-j13));
            str = M02 == null ? "" : M02.title;
            z9 = false;
        }
        String str4 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i16 = tL_payments_paymentFormStars.invoice.subscription_period;
        long j14 = j12;
        boolean[] zArr = {false};
        int i17 = this.a;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        k9 k9Var3 = new k9(this, j14, zArr, c20Var, context2, I, z9, str, ijVar, inputInvoice, tL_payments_paymentFormStars, i16, j13);
        l9 l9Var2 = new l9(this, zArr, c20Var);
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context2, I, false);
        TLRPC.User a24 = qp.s1(i17).a2(Long.valueOf(j13));
        LinearLayout f11 = org.telegram.messenger.k5.f(context2, 1);
        f11.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.addView(new gc(context2, 40, 0, 0), c8.ha.c(-1.0f, -1));
        if (ijVar == null || (message2 = ijVar.k) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            v2Var = l10;
            k9Var = k9Var3;
            l9Var = l9Var2;
            viewGroup = frameLayout2;
            ijVar2 = ijVar;
            i7 = i16;
            f10 = 20.0f;
            if (webDocument != null) {
                FrameLayout frameLayout3 = new FrameLayout(context2);
                org.telegram.ui.Components.l9 l9Var3 = new org.telegram.ui.Components.l9(context2);
                l9Var3.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
                l9Var3.p(org.telegram.messenger.hc.p(m20.c(webDocument)), "80_80", null, null);
                frameLayout3.addView(l9Var3, c8.ha.e(80, 80, 48));
                viewGroup.addView(frameLayout3, c8.ha.e(80, 87, 17));
                TextView textView = new TextView(context2);
                textView.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
                r22 = 1;
                textView.setTextSize(1, 13.0f);
                i10 = -1;
                textView.setTextColor(-1);
                j10 = j14;
                textView.setText(dd.U0(jg.g.m((int) j14, ',', new StringBuilder("XTR ")), 0.85f, null));
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
                frameLayout4.addView(textView, c8.ha.r(-2, 16, qs.E1));
                frameLayout3.addView(frameLayout4, c8.ha.a(-2.0f, 18.66f, 81));
                sc scVar = new sc(i17, context2, I);
                c8.ka.a(scVar);
                scVar.setOnClickListener(new tb(scVar, r22));
                viewGroup.addView(scVar, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f11.addView(viewGroup, c8.ha.r(i10, qs.C1, 7));
                TextView g10 = org.telegram.messenger.k5.g(context2, r22, f10);
                g10.setTypeface(org.telegram.messenger.g0.o());
                int i19 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.V(g10, i19, I);
                if (i7 <= 0) {
                    if (webDocument != null) {
                        M0 = str4;
                        iArr = null;
                    } else {
                        iArr = null;
                        M0 = org.telegram.messenger.hd.M0(2131745116, null);
                    }
                    g10.setText(org.telegram.messenger.i6.m(M0, g10.getPaint().getFontMetricsInt(), i11, iArr, i11));
                } else {
                    g10.setText(org.telegram.messenger.i6.m(webDocument != null ? str4 : org.telegram.messenger.hd.M0(2131745123, null), g10.getPaint().getFontMetricsInt(), i11, null, i11));
                }
                qs.i(g10);
                g10.setGravity(17);
                f11.addView(g10, c8.ha.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                if (webDocument != null) {
                    LinearLayout f12 = org.telegram.messenger.k5.f(context2, i11);
                    int L2 = org.telegram.messenger.g0.L(28.0f);
                    int i20 = org.telegram.ui.ActionBar.k6.a7;
                    Drawable d03 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i20, I));
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i20);
                    f12.setBackground(d03);
                    org.telegram.ui.ActionBar.r6.k(f12, d03, N2, null, I);
                    org.telegram.ui.Components.l9 l9Var4 = new org.telegram.ui.Components.l9(context2);
                    l9Var4.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                    org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                    w8Var.r(a24);
                    l9Var4.e(a24, w8Var);
                    f12.addView(l9Var4, c8.ha.o(28, 28));
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(r22, 13.0f);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.G6, I);
                    textView2.setText(t10.p(a24));
                    f12.addView(textView2, c8.ha.t(-2, -2, 16, 6, 0, 10, 0));
                    f11.addView(f12, c8.ha.t(-2, 28, 1, 0, 8, 0, 2));
                }
                TextView textView3 = new TextView(context2);
                textView3.setTextSize(r22, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView3, i19, I);
                if (ijVar2 == null && (message = ijVar2.k) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    long B0 = ij.B0(message);
                    TLRPC.Message message4 = ijVar2.k;
                    if (message4 != null && (messageFwdHeader = message4.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        B0 = org.telegram.messenger.m5.o(peer);
                    }
                    if (B0 < 0 && ijVar2.Z0() > 0 && (a22 = qp.s1(i17).a2(Long.valueOf(ijVar2.Z0()))) != null && a22.bot) {
                        B0 = a22.id;
                    }
                    if (B0 >= 0) {
                        TLRPC.User a25 = qp.s1(i17).a2(Long.valueOf(B0));
                        str2 = t10.p(a25);
                        z10 = (a25 == null || !a25.bot) ? i11 : r22;
                    } else {
                        TLRPC.Chat M03 = qp.s1(i17).M0(Long.valueOf(-B0));
                        String str5 = M03 != null ? M03.title : "";
                        z10 = i11;
                        str2 = str5;
                    }
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) ijVar2.k.media;
                    int i21 = i11;
                    int i22 = i21;
                    int i23 = i22;
                    while (i21 < tL_messageMediaPaidMedia.extended_media.size()) {
                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i21);
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                            if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                z11 = r22;
                            }
                            z11 = i11;
                        } else {
                            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                z11 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                            }
                            z11 = i11;
                        }
                        if (z11) {
                            i22++;
                        } else {
                            i23++;
                        }
                        i21++;
                    }
                    if (i22 == 0) {
                        str3 = z10 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                        long j15 = j10;
                        int i24 = (int) j15;
                        Object[] objArr = new Object[2];
                        objArr[i11] = i23 == r22 ? org.telegram.messenger.hd.M0(2131745132, null) : org.telegram.messenger.hd.G(i23, "StarsConfirmPurchaseMedia_Photos", new Object[i11]);
                        objArr[r22] = str2;
                        G2 = org.telegram.messenger.hd.G(i24, str3, objArr);
                        j11 = j15;
                    } else {
                        j11 = j10;
                        if (i23 == 0) {
                            str3 = z10 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                            int i25 = (int) j11;
                            if (i22 == r22) {
                                G3 = org.telegram.messenger.hd.M0(2131745131, null);
                                c10 = 0;
                            } else {
                                c10 = 0;
                                G3 = org.telegram.messenger.hd.G(i22, "StarsConfirmPurchaseMedia_Videos", new Object[0]);
                            }
                            Object[] objArr2 = new Object[2];
                            objArr2[c10] = G3;
                            objArr2[r22] = str2;
                            G2 = org.telegram.messenger.hd.G(i25, str3, objArr2);
                        } else {
                            String str6 = z10 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                            int i26 = (int) j11;
                            if (i23 == r22) {
                                G = org.telegram.messenger.hd.M0(2131745132, null);
                                i12 = 0;
                            } else {
                                i12 = 0;
                                G = org.telegram.messenger.hd.G(i23, "StarsConfirmPurchaseMedia_Photos", new Object[0]);
                            }
                            String M04 = i22 == r22 ? org.telegram.messenger.hd.M0(2131745131, null) : org.telegram.messenger.hd.G(i22, "StarsConfirmPurchaseMedia_Videos", new Object[i12]);
                            Object[] objArr3 = new Object[3];
                            objArr3[i12] = G;
                            objArr3[r22] = M04;
                            objArr3[2] = str2;
                            G2 = org.telegram.messenger.hd.G(i26, str6, objArr3);
                        }
                    }
                    textView3.setText(org.telegram.messenger.g0.X2(G2));
                } else {
                    j11 = j10;
                    if (i7 <= 0) {
                        String p10 = t10.p(a24);
                        Object[] objArr4 = new Object[2];
                        objArr4[0] = str4;
                        objArr4[r22] = p10;
                        textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("StarsConfirmSubscriptionText2", (int) j11, ',', objArr4)));
                    } else {
                        String p11 = t10.p(a24);
                        Object[] objArr5 = new Object[2];
                        objArr5[0] = str4;
                        objArr5[r22] = p11;
                        textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("StarsConfirmPurchaseText2", (int) j11, ',', objArr5)));
                    }
                }
                textView3.setMaxWidth(fi.m3.a(textView3.getText(), textView3.getPaint()));
                textView3.setGravity(17);
                f11.addView(textView3, c8.ha.t(-2, -2, 1, 0, 6, 0, 18));
                fi.d dVar = new fi.d(context2, I, r22);
                if (i7 <= 0) {
                    dVar.i(dd.T0(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "StarsConfirmSubscriptionButton", (int) j11))), false, r22);
                } else {
                    dVar.i(dd.T0(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "StarsConfirmPurchaseButton", (int) j11))), false, r22);
                }
                f11.addView(dVar, c8.ha.c(48.0f, -1));
                w70 w70Var = new w70(context2, I);
                org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.z6, I);
                org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, I);
                w70Var.setTextSize(r22, 14.0f);
                w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(i7 <= 0 ? 2131745120 : 2131745127, null), new pa(context2, 5)));
                w70Var.setGravity(17);
                f11.addView(w70Var, c8.ha.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                v2Var2.N = f11;
                dVar.setOnClickListener(new ah.g(k9Var, v2Var2, dVar, 3));
                v2Var2.setOnDismissListener(new eb(l9Var, 2));
                v2Var2.N();
                v2Var2.show();
            }
            org.telegram.ui.Components.l9 l9Var5 = new org.telegram.ui.Components.l9(context2);
            l9Var5.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
            org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            w8Var2.r(a24);
            l9Var5.e(a24, w8Var2);
            viewGroup.addView(l9Var5, c8.ha.e(80, 80, 17));
        } else {
            ic icVar2 = new ic(context2);
            icVar2.H = new Path();
            icVar2.I = new RectF();
            icVar2.J = jg.g.h(context2, R.drawable.large_locked_post);
            icVar2.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) ijVar.k.media;
            if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                v2Var = l10;
                l9Var = l9Var2;
                viewGroup = frameLayout2;
                k9Var = k9Var3;
                ijVar2 = ijVar;
                i7 = i16;
                i13 = 17;
                i14 = 80;
                f10 = 20.0f;
            } else {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                    hcVar2 = org.telegram.messenger.hc.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, ijVar.k);
                    icVar = icVar2;
                    l9Var = l9Var2;
                    frameLayout = frameLayout2;
                    k9Var2 = k9Var3;
                    hcVar = null;
                    z12 = true;
                } else {
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            icVar = icVar2;
                            l9Var = l9Var2;
                            frameLayout = frameLayout2;
                            hcVar = null;
                            z12 = true;
                            hcVar2 = org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(messageMedia.photo.sizes, org.telegram.messenger.g0.L(80.0f), true, null, false), messageMedia.photo);
                        } else {
                            icVar = icVar2;
                            l9Var = l9Var2;
                            frameLayout = frameLayout2;
                            hcVar = null;
                            z12 = true;
                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                hcVar2 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(messageMedia.document.thumbs, org.telegram.messenger.g0.L(80.0f), true, null, false), messageMedia.document);
                            }
                        }
                        k9Var2 = k9Var3;
                    } else {
                        icVar = icVar2;
                        l9Var = l9Var2;
                        frameLayout = frameLayout2;
                        hcVar = null;
                        z12 = true;
                    }
                    hcVar2 = hcVar;
                    k9Var2 = k9Var3;
                }
                k9Var = k9Var2;
                viewGroup = frameLayout;
                i13 = 17;
                f10 = 20.0f;
                icVar2 = icVar;
                v2Var = l10;
                i7 = i16;
                i14 = 80;
                icVar2.m(hcVar2, "80_80_b2", null, null, null, ijVar);
                ijVar2 = ijVar;
            }
            viewGroup.addView(icVar2, c8.ha.e(i14, i14, i13));
        }
        j10 = j14;
        r22 = 1;
        i10 = -1;
        i11 = 0;
        sc scVar2 = new sc(i17, context2, I);
        c8.ka.a(scVar2);
        scVar2.setOnClickListener(new tb(scVar2, r22));
        viewGroup.addView(scVar2, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        f11.addView(viewGroup, c8.ha.r(i10, qs.C1, 7));
        TextView g102 = org.telegram.messenger.k5.g(context2, r22, f10);
        g102.setTypeface(org.telegram.messenger.g0.o());
        int i192 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(g102, i192, I);
        if (i7 <= 0) {
        }
        qs.i(g102);
        g102.setGravity(17);
        f11.addView(g102, c8.ha.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
        if (webDocument != null) {
        }
        TextView textView32 = new TextView(context2);
        textView32.setTextSize(r22, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView32, i192, I);
        if (ijVar2 == null) {
        }
        j11 = j10;
        if (i7 <= 0) {
        }
        textView32.setMaxWidth(fi.m3.a(textView32.getText(), textView32.getPaint()));
        textView32.setGravity(17);
        f11.addView(textView32, c8.ha.t(-2, -2, 1, 0, 6, 0, 18));
        fi.d dVar2 = new fi.d(context2, I, r22);
        if (i7 <= 0) {
        }
        f11.addView(dVar2, c8.ha.c(48.0f, -1));
        w70 w70Var2 = new w70(context2, I);
        org.telegram.ui.ActionBar.r6.V(w70Var2, org.telegram.ui.ActionBar.k6.z6, I);
        org.telegram.ui.ActionBar.r6.H(w70Var2, org.telegram.ui.ActionBar.k6.Uc, I);
        w70Var2.setTextSize(r22, 14.0f);
        w70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(i7 <= 0 ? 2131745120 : 2131745127, null), new pa(context2, 5)));
        w70Var2.setGravity(17);
        f11.addView(w70Var2, c8.ha.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
        org.telegram.ui.ActionBar.v2 v2Var22 = v2Var;
        v2Var22.N = f11;
        dVar2.setOnClickListener(new ah.g(k9Var, v2Var22, dVar2, 3));
        v2Var22.setOnDismissListener(new eb(l9Var, 2));
        v2Var22.N();
        v2Var22.show();
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, v10 v10Var) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = org.telegram.messenger.t0.b;
        org.telegram.ui.ActionBar.f6 I = I();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new x7(this, v10Var, j3, str2, context, I, chatInvite, str));
    }

    public final void Z(final ij ijVar, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final c20 c20Var) {
        long j3;
        String str;
        TLRPC.User a22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = org.telegram.messenger.t0.b;
        final org.telegram.ui.ActionBar.f6 I = I();
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
        if (ijVar != null) {
            TLRPC.Message message = ijVar.k;
            j3 = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? ij.B0(message) : org.telegram.messenger.m5.o(peer);
            if (j3 < 0 && ijVar.Z0() > 0 && (a22 = qp.s1(this.a).a2(Long.valueOf(ijVar.Z0()))) != null && a22.bot) {
                j3 = a22.id;
            }
        } else {
            j3 = tL_payments_paymentFormStars.bot_id;
        }
        final long j11 = j3;
        if (j11 >= 0) {
            str = t10.p(qp.s1(this.a).a2(Long.valueOf(j11)));
        } else {
            TLRPC.Chat M0 = qp.s1(this.a).M0(Long.valueOf(-j11));
            str = M0 == null ? "" : M0.title;
        }
        final String str2 = str;
        final String str3 = tL_payments_paymentFormStars.title;
        final int i10 = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: bi.f8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final ea eaVar = ea.this;
                final c20 c20Var2 = c20Var;
                final ij ijVar2 = ijVar;
                final Context context2 = context;
                final long j12 = j10;
                final String str4 = str2;
                final int i11 = i10;
                final String str5 = str3;
                final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                final long j13 = j11;
                final org.telegram.ui.ActionBar.f6 f6Var = I;
                final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.j8
                    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
                    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        boolean z9;
                        boolean z10;
                        LaunchActivity launchActivity;
                        r80 r80Var;
                        TLRPC.Message message2;
                        ea eaVar2 = ea.this;
                        TLObject tLObject2 = tLObject;
                        c20 c20Var3 = c20Var2;
                        ij ijVar3 = ijVar2;
                        Context context3 = context2;
                        long j14 = j12;
                        String str6 = str4;
                        int i12 = i11;
                        String str7 = str5;
                        TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                        long j15 = j13;
                        TLRPC.TL_error tL_error2 = tL_error;
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                        org.telegram.ui.Components.hc X = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.hc.X() : org.telegram.ui.Components.hc.a0(Q);
                        boolean z11 = tLObject2 instanceof TLRPC.TL_payments_paymentResult;
                        int i13 = 0;
                        if (!z11) {
                            if (tL_error2 != null) {
                                z9 = false;
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (qp.s1(eaVar2.a).j7) {
                                        c20Var3.a(Boolean.FALSE);
                                        ea.c0(context3, f6Var2);
                                        return;
                                    } else {
                                        boolean[] zArr = {false};
                                        tc tcVar = new tc(context3, f6Var2, j14, 0, str6, new a3(eaVar2, zArr, ijVar3, inputInvoice3, tL_payments_paymentFormStars3, c20Var3, 3), j15);
                                        tcVar.setOnDismissListener(new q8(c20Var3, zArr));
                                        tcVar.show();
                                        return;
                                    }
                                }
                            } else {
                                z9 = false;
                            }
                            if (tL_error2 == null || !"FORM_EXPIRED".equals(tL_error2.text)) {
                                org.telegram.ui.Components.hc hcVar = X;
                                c20Var3.a(Boolean.FALSE);
                                hcVar.Q(R.raw.error, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                if (ijVar3 != null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia.peer = qp.s1(eaVar2.a).j1(j15);
                                    tL_messages_getExtendedMedia.id.add(Integer.valueOf(ijVar3.f1()));
                                    ConnectionsManager.getInstance(eaVar2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            JSONObject u10 = hi.a3.u(f6Var2, z9);
                            if (u10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                tL_dataJSON.data = u10.toString();
                                tL_payments_getPaymentForm.flags |= 1;
                            }
                            tL_payments_getPaymentForm.invoice = inputInvoice3;
                            ConnectionsManager.getInstance(eaVar2.a).sendRequest(tL_payments_getPaymentForm, new r8(eaVar2, ijVar3, inputInvoice3, c20Var3, X, 0));
                            return;
                        }
                        c20Var3.a(Boolean.TRUE);
                        Utilities.d.c(new p8(eaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, i13));
                        if (ijVar3 != null && (message2 = ijVar3.k) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            Drawable h = jg.g.h(context3, R.drawable.star_small_inner);
                            String M02 = org.telegram.messenger.hd.M0(2131745089, null);
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) j14, "StarsMediaPurchaseCompletedInfo", str6));
                            X.getClass();
                            org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(X.W(), X.c);
                            zbVar.a.setImageDrawable(h);
                            zbVar.b.setText(M02);
                            zbVar.c.setText(X2);
                            X.b(zbVar, 2750).j();
                        } else {
                            if (i12 <= 0) {
                                z10 = true;
                                X.I(R.raw.stars_send, org.telegram.messenger.hd.M0(2131745053, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) j14, "StarsPurchaseCompletedInfo", str7, str6))).j();
                                launchActivity = LaunchActivity.G1;
                                if (launchActivity != null && (r80Var = launchActivity.v0) != null) {
                                    r80Var.c(z10);
                                }
                                if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                    eaVar2.S(true);
                                }
                                if (ijVar3 == null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia2.peer = qp.s1(eaVar2.a).j1(j15);
                                    tL_messages_getExtendedMedia2.id.add(Integer.valueOf(ijVar3.f1()));
                                    ConnectionsManager.getInstance(eaVar2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                    return;
                                }
                                return;
                            }
                            X.I(R.raw.stars_send, org.telegram.messenger.hd.M0(2131745155, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) j14, "StarsBotSubscriptionCompletedInfo", str7, str6))).j();
                        }
                        z10 = true;
                        launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            r80Var.c(z10);
                        }
                        if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                        }
                        eaVar2.S(true);
                        if (ijVar3 == null) {
                        }
                    }
                });
            }
        });
    }

    public final void a0(long j3, long j10, boolean z9) {
        int i7 = this.a;
        k00 k00Var = qp.s1(i7).q7;
        TLRPC.TL_forumTopic f10 = k00Var.f(j3, j10);
        if (f10 != null) {
            f10.nopaid_messages_exception = z9;
            a0.h hVar = k00Var.a;
            if (((ArrayList) hVar.f(j3)) != null) {
                k00Var.getMessagesStorage().C1(k00Var.getConnectionsManager().getCurrentTime(), -j3, (List) hVar.f(j3), true);
            }
            qs.f(i7).k(qs.N3, Long.valueOf(j10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ca b0(final ij ijVar, final an anVar, final long j3, boolean z9, boolean z10, final Long l10) {
        String str;
        long j10;
        final ea eaVar;
        ij ijVar2;
        TLRPC.ReactionCount reactionCount;
        boolean z11;
        String str2;
        x9 b10 = x9.b(ijVar);
        int i7 = this.a;
        ea y10 = y(i7, false);
        Context t6 = t(anVar);
        if (t6 == null) {
            return null;
        }
        str = "";
        if (z10 && y10.e && y10.q(null, false, false).amount <= 0) {
            long a10 = anVar.a();
            if (a10 >= 0) {
                str = t10.k(anVar.getMessagesController().a2(Long.valueOf(a10)));
            } else {
                TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-a10));
                if (M0 != null) {
                    str = M0.title;
                }
            }
            final int i10 = 0;
            new tc(t6, anVar.getResourceProvider(), j3, 5, str, new Runnable(this) { // from class: bi.y8
                public final /* synthetic */ ea b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.b0(ijVar, anVar, j3, true, true, l10);
                            break;
                        default:
                            this.b.b0(ijVar, anVar, j3, true, true, l10);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        ca caVar = this.B;
        if (caVar == null || !caVar.a.equals(b10)) {
            ca caVar2 = this.B;
            if (caVar2 != null) {
                caVar2.b();
            }
            ConnectionsManager.getInstance(i7).getCurrentTime();
            j10 = 0;
            eaVar = this;
            ca caVar3 = new ca(eaVar, b10, ijVar, anVar, z9);
            eaVar.B = caVar3;
            caVar3.n = l10;
        } else {
            j10 = 0;
            eaVar = this;
        }
        if (eaVar.B.h + j3 > qp.s1(i7).Z5) {
            eaVar.B.b();
            ConnectionsManager.getInstance(i7).getCurrentTime();
            eaVar.B = new ca(eaVar, b10, ijVar, anVar, z9);
        }
        final long j11 = eaVar.B.h + j3;
        if (z10 && y10.e) {
            if (y10.q(null, false, false).amount < j11) {
                eaVar.B.a();
                long a11 = anVar.a();
                if (a11 >= j10) {
                    str2 = t10.k(anVar.getMessagesController().a2(Long.valueOf(a11)));
                } else {
                    TLRPC.Chat M02 = anVar.getMessagesController().M0(Long.valueOf(-a11));
                    str2 = M02 != null ? M02.title : "";
                }
                final int i11 = 1;
                new tc(t6, anVar.getResourceProvider(), j11, 5, str2, new Runnable(eaVar) { // from class: bi.y8
                    public final /* synthetic */ ea b;

                    {
                        this.b = eaVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.b0(ijVar, anVar, j11, true, true, l10);
                                break;
                            default:
                                this.b.b0(ijVar, anVar, j11, true, true, l10);
                                break;
                        }
                    }
                }, 0L).show();
                return null;
            }
            ijVar2 = ijVar;
            reactionCount = null;
        } else {
            ijVar2 = ijVar;
            reactionCount = null;
        }
        ca caVar4 = eaVar.B;
        if (ijVar2 != null) {
            TLRPC.Message message = ijVar2.k;
            if (message.reactions == null) {
                message.reactions = new TLRPC.TL_messageReactions();
                TLRPC.Message message2 = ijVar2.k;
                message2.reactions.reactions_as_tags = ij.B0(message2) == p10.i(ijVar2.I1).e();
                ijVar2.k.reactions.can_see_list = ijVar2.p3() || ijVar2.q3();
            }
            for (int i12 = 0; i12 < ijVar2.k.reactions.results.size(); i12++) {
                if (!(ijVar2.k.reactions.results.get(i12).reaction instanceof TLRPC.TL_reactionPaid)) {
                }
            }
            z11 = true;
            aa aaVar = caVar4.p;
            ea eaVar2 = caVar4.q;
            int i13 = eaVar2.a;
            org.telegram.ui.Components.wb wbVar = caVar4.e;
            ij ijVar3 = caVar4.b;
            if (!caVar4.i || caVar4.j) {
                boolean z12 = org.telegram.messenger.r2.a;
            } else {
                caVar4.h += j3;
                System.currentTimeMillis();
                wbVar.c.a();
                wbVar.c.c(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) caVar4.h, "StarsSentText", new Object[0])), true, true);
                if (caVar4.m) {
                    caVar4.f.b = 5000L;
                    org.telegram.messenger.g0.r(aaVar);
                    org.telegram.messenger.g0.i3(aaVar, 5000L);
                }
                int i14 = qs.o1;
                if (z11) {
                    caVar4.l = true;
                    ijVar3.f((int) j3, caVar4.c(), true);
                    eaVar2.g += j3;
                    qs.f(i13).k(i14, Long.valueOf(ij.B0(ijVar3.k)), Integer.valueOf(ijVar3.f1()), ijVar3.k.reactions);
                    qs.f(i13).k(qs.y3, new Object[0]);
                } else {
                    caVar4.l = false;
                    TLRPC.Message message3 = ijVar3.k;
                    if (message3.reactions == null) {
                        message3.reactions = new TLRPC.TL_messageReactions();
                        TLRPC.Message message4 = ijVar3.k;
                        message4.reactions.reactions_as_tags = ij.B0(message4) == p10.i(ijVar3.I1).e();
                        ijVar3.k.reactions.can_see_list = ijVar3.p3() || ijVar3.q3();
                    }
                    for (int i15 = 0; i15 < ijVar3.k.reactions.results.size(); i15++) {
                        if (ijVar3.k.reactions.results.get(i15).reaction instanceof TLRPC.TL_reactionPaid) {
                            reactionCount = ijVar3.k.reactions.results.get(i15);
                        }
                    }
                    if (reactionCount == null) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
                        tL_reactionCount.count = 1;
                        tL_reactionCount.chosen = true;
                        ijVar3.k.reactions.results.add(0, tL_reactionCount);
                        caVar4.k--;
                    }
                    qs.f(i13).k(i14, Long.valueOf(ij.B0(ijVar3.k)), Integer.valueOf(ijVar3.f1()), ijVar3.k.reactions);
                    caVar4.k += j3;
                }
                wbVar.b.setText(caVar4.d());
            }
            ca caVar5 = eaVar.B;
            caVar5.n = l10;
            return caVar5;
        }
        if (!z9) {
            z11 = false;
            aa aaVar2 = caVar4.p;
            ea eaVar22 = caVar4.q;
            int i132 = eaVar22.a;
            org.telegram.ui.Components.wb wbVar2 = caVar4.e;
            ij ijVar32 = caVar4.b;
            if (caVar4.i) {
            }
            boolean z122 = org.telegram.messenger.r2.a;
            ca caVar52 = eaVar.B;
            caVar52.n = l10;
            return caVar52;
        }
        z11 = true;
        aa aaVar22 = caVar4.p;
        ea eaVar222 = caVar4.q;
        int i1322 = eaVar222.a;
        org.telegram.ui.Components.wb wbVar22 = caVar4.e;
        ij ijVar322 = caVar4.b;
        if (caVar4.i) {
        }
        boolean z1222 = org.telegram.messenger.r2.a;
        ca caVar522 = eaVar.B;
        caVar522.n = l10;
        return caVar522;
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z9 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            int f12 = ((ij) obj).f1();
            hashSet.add(Integer.valueOf(f12));
            if (this.Q.remove(Integer.valueOf(f12))) {
                this.R.put(Integer.valueOf(f12), new aa.s(this, hashSet, runnable, 19));
                z9 = true;
            }
        }
        return !z9;
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
    public final void d(ij ijVar) {
        boolean z9;
        c9 c9Var;
        org.telegram.ui.ActionBar.f2 T2;
        z9 z9Var;
        TLRPC.Message message = ijVar.k;
        if (message == null) {
            return;
        }
        long j3 = message.paid_message_stars;
        if (j3 <= 0 || ij.d3(message)) {
            return;
        }
        z9 z9Var2 = this.N;
        int i7 = 0;
        if (z9Var2 == null || z9Var2.g <= 0 || !z9Var2.m || z9Var2.n || z9Var2.o) {
            if (!org.telegram.ui.Components.v4.a0(this.a, ij.B0(ijVar.k))) {
                Long l10 = (Long) this.O.get(Long.valueOf(ij.B0(ijVar.k)));
                if (l10 == null || System.currentTimeMillis() - l10.longValue() <= 5000) {
                    Integer num = (Integer) this.P.get(Long.valueOf(ij.B0(ijVar.k)));
                    if (num != null) {
                    }
                }
            }
            z9 = false;
            int f12 = ijVar.f1();
            if (z9) {
                this.Q.add(Integer.valueOf(f12));
            }
            long B0 = ij.B0(ijVar.k);
            b9 b9Var = new b9(i7, this, z9);
            c9Var = new c9(this, z9, f12, i7);
            T2 = LaunchActivity.T();
            z9Var = this.N;
            if (z9Var != null && (z9Var.o || z9Var.n)) {
                this.N = null;
            }
            if (this.N != null) {
                if (T2 != null && !T2.isRemovingFromStack()) {
                    z9 z9Var3 = this.N;
                    if (z9Var3.b == B0) {
                    }
                }
                this.N.a();
                this.N = null;
            }
            if (T2 != null || T2.isRemovingFromStack()) {
                c9Var.run();
            }
            if (this.N == null) {
                this.N = new z9(T2, B0);
            }
            z9 z9Var4 = this.N;
            org.telegram.ui.Components.wb wbVar = z9Var4.d;
            org.telegram.ui.Components.ac acVar = z9Var4.e;
            y9 y9Var = z9Var4.p;
            if (z9Var4.n || z9Var4.o) {
                c9Var.run();
                return;
            }
            z9Var4.g++;
            z9Var4.k.add(ijVar);
            z9Var4.h += j3;
            z9Var4.i = b9Var;
            z9Var4.j.add(c9Var);
            if (z9Var4.m && !z9) {
                z9Var4.m = false;
                org.telegram.messenger.g0.r(y9Var);
                org.telegram.ui.Components.cc ccVar = z9Var4.c;
                ccVar.j = 5000;
                ccVar.i(true);
                if (System.currentTimeMillis() - z9Var4.l > 500) {
                    acVar.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                } else {
                    acVar.setAlpha(0.0f);
                    acVar.setVisibility(8);
                }
            }
            da daVar = z9Var4.f;
            if (daVar != null && z9Var4.m) {
                daVar.b = 3000L;
                org.telegram.messenger.g0.r(y9Var);
                org.telegram.messenger.g0.i3(y9Var, 3000L);
            }
            org.telegram.ui.Components.j6 j6Var = wbVar.b;
            int i10 = z9Var4.g;
            j6Var.setText(i10 == 1 ? org.telegram.messenger.hd.M0(2131747702, null) : org.telegram.messenger.hd.G(i10, "PaidMessageSentTitle", new Object[0]));
            wbVar.c.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) z9Var4.h))));
            wbVar.a.d();
            return;
        }
        z9 = true;
        int f122 = ijVar.f1();
        if (z9) {
        }
        long B02 = ij.B0(ijVar.k);
        b9 b9Var2 = new b9(i7, this, z9);
        c9Var = new c9(this, z9, f122, i7);
        T2 = LaunchActivity.T();
        z9Var = this.N;
        if (z9Var != null) {
            this.N = null;
        }
        if (this.N != null) {
        }
        if (T2 != null) {
        }
        c9Var.run();
    }

    public final void d0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ij ijVar = (ij) list.get(0);
        long B0 = ij.B0(ijVar.k);
        int i7 = this.a;
        if (B0 >= 0) {
            qp.s1(i7).W2(qp.s1(i7).a2(Long.valueOf(B0)), 0, true, null);
        } else {
            qp.s1(i7).V2(0, -B0, true);
        }
        org.telegram.ui.Components.hc.a0(LaunchActivity.T()).Q(R.raw.error, 36, dd.T0(TextUtils.concat(org.telegram.messenger.hd.G((int) ijVar.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", org.telegram.messenger.hd.G((int) ijVar.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
    }

    public final void e0(LaunchActivity launchActivity, long j3, String str) {
        if (this.e) {
            f0(launchActivity, j3, str);
        } else {
            r(new w2(this, (Object) launchActivity, j3, (Object) str, 6));
        }
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, v10 v10Var, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i7 = this.a;
        if (qp.s1(i7).j7) {
            org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
            if (Q == null || Q.getContext() == null) {
                c0(activity, null);
                return;
            } else {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            }
        }
        boolean z9 = ((org.telegram.messenger.h0) qp.s1(i7).x7.h0.b).c && inputPeer != null;
        if ((!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k()) || z9) {
            if (!org.telegram.messenger.r1.i().k()) {
                v10Var.a(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            f5.a aVar = new f5.a();
            aVar.b = "inapp";
            aVar.a = tL_starsTopupOption.store_product;
            f5.o a10 = aVar.a();
            org.telegram.messenger.a8.b("StarsController.buy starts queryProductDetails");
            org.telegram.messenger.r1.i().o(Arrays.asList(a10), new a1.d(v10Var, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity, 2));
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
        JSONObject u10 = hi.a3.u(I(), false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getPaymentForm, new f2(this, v10Var, tL_inputInvoiceStars, 2));
    }

    public final void f0(LaunchActivity launchActivity, long j3, String str) {
        if (p().amount < j3 && j3 > 0) {
            new tc(launchActivity, null, j3, 4, str, new ai.m0(5), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
        if (T2 == null) {
            return;
        }
        org.telegram.ui.Components.cc K = org.telegram.ui.Components.hc.a0(T2).K(R.raw.stars_topup, org.telegram.messenger.hd.M0(2131744965, null), org.telegram.messenger.hd.M0(2131744964, null), new ai.m0(4));
        K.j = 5000;
        K.k(true);
    }

    public final void g(final long j3, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final v10 v10Var) {
        int i7;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.f6 I = I();
        boolean z9 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z9 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new i0(this, v10Var, j3, tLObject, tL_textWithEntities, 3));
                return;
            }
            if (z9) {
                i7 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i7 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String l10 = org.telegram.messenger.m5.l(this.a, j3);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = qp.s1(this.a).o1(j3);
            tL_inputInvoicePremiumGiftStars.months = i7;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = hi.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: bi.g8
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final ea eaVar = ea.this;
                    final v10 v10Var2 = v10Var;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.f6 f6Var = I;
                    final String str = l10;
                    final long j10 = j3;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.l8
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z10 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            v10 v10Var3 = v10Var2;
                            if (!z10) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                ea.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                v10Var3.a(Boolean.FALSE, null);
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
                            ea eaVar2 = ea.this;
                            ConnectionsManager.getInstance(eaVar2.a).sendRequest(tL_payments_sendStarsForm, new o8(eaVar2, v10Var3, context3, f6Var, j11, str, j10, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(final long j3, final long j10, boolean z9, final boolean z10) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i7 = this.a;
        togglenopaidmessagesexception.user_id = qp.s1(i7).o1(j3);
        if (j10 != 0) {
            togglenopaidmessagesexception.parent_peer = qp.s1(i7).j1(j10);
        }
        togglenopaidmessagesexception.refund_charged = z9;
        togglenopaidmessagesexception.require_payment = !z10;
        ConnectionsManager.getInstance(i7).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: bi.z8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new h9(ea.this, tLObject, j10, j3, z10));
            }
        });
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z9, v10 v10Var) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.f6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new i0(this, v10Var, tL_payments_paymentFormStarGift, starGift, j3, 4));
            return;
        }
        String l10 = org.telegram.messenger.m5.l(this.a, j3);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = qp.s1(this.a).j1(j3);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z9;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        int i7 = 0;
        JSONObject u10 = hi.a3.u(I, false);
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new o8(this, v10Var, context2, I, j10, l10, tL_payments_paymentFormStarGift, starGift, j3));
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, v10 v10Var) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = org.telegram.messenger.t0.b;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.f6 I = I();
            long j3 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i7 = p10.s0;
                boolean[] zArr = {false};
                n9 n9Var = new n9(this, j3, i7, zArr, v10Var, context2, I, chatInvite, str);
                a4 a4Var = new a4(this, zArr, v10Var);
                org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context2, I, false);
                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new gc(context2, 40, 0, 0), c8.ha.c(-1.0f, -1));
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context2);
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                w8Var.s(chatInvite.color);
                String str2 = chatInvite.title;
                w8Var.A = true;
                w8Var.n = 0;
                w8Var.m = false;
                org.telegram.ui.Components.w8.a(str2, null, null, w8Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    l9Var.j(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(80.0f), false, null, false), chatInvite.photo), "80_80", w8Var, chatInvite);
                } else {
                    l9Var.setImageDrawable(w8Var);
                }
                frameLayout.addView(l9Var, c8.ha.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i10 = org.telegram.ui.ActionBar.k6.h5;
                org.telegram.ui.ActionBar.r6.y(frameLayout, drawable, i10, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, c8.ha.e(26, 26, 17));
                imageView.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, c8.ha.e(26, 26, 17));
                imageView2.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView2.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                sc scVar = new sc(i7, context2, I);
                c8.ka.a(scVar);
                scVar.setOnClickListener(new tb(scVar, 0));
                frameLayout.addView(scVar, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f10.addView(frameLayout, c8.ha.r(-1, qs.C1, 7));
                TextView g10 = org.telegram.messenger.k5.g(context2, 1, 20.0f);
                g10.setTypeface(org.telegram.messenger.g0.o());
                int i11 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.messenger.camera.q.o(g10, i11, I, null, 2131745013);
                g10.setGravity(17);
                TextView f11 = org.telegram.messenger.camera.q.f(f10, g10, c8.ha.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f11.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(f11, i11, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i12 = tL_starsSubscriptionPricing.period;
                if (i12 == 2592000) {
                    f11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    f11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, i12 == 300 ? "5 minutes" : "a minute")));
                }
                f11.setMaxWidth(fi.m3.a(f11.getText(), f11.getPaint()));
                f11.setGravity(17);
                f10.addView(f11, c8.ha.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView, i11, I);
                    textView.setText(org.telegram.messenger.i6.m(chatInvite.about, textView.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setGravity(17);
                    f10.addView(textView, c8.ha.t(-2, -2, 1, 0, 6, 0, 22));
                }
                fi.d dVar = new fi.d(context2, I, true);
                dVar.i(org.telegram.messenger.hd.M0(2131745022, null), false, true);
                f10.addView(dVar, c8.ha.o(-1, 48));
                w70 w70Var = new w70(context2, I);
                w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131745021, null), new pa(context2, 4)));
                w70Var.setGravity(17);
                w70Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.B6, I);
                org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, I);
                f10.addView(w70Var, c8.ha.t(-1, -2, 49, 14, 14, 14, 6));
                l10.N = f10;
                dVar.setOnClickListener(new ah.g(n9Var, l10, dVar, 2));
                l10.setOnDismissListener(new eb(a4Var, 1));
                l10.P(i10);
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1() && T2 != null && !org.telegram.messenger.g0.u1(T2)) {
                    l10.a0(T2);
                }
                l10.show();
            }
        }
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z9, final boolean z10, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final zh.p3 p3Var) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.f6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new Runnable() { // from class: bi.v7
                @Override // java.lang.Runnable
                public final void run() {
                    ea eaVar = ea.this;
                    boolean z11 = eaVar.e;
                    zh.p3 p3Var2 = p3Var;
                    if (z11) {
                        eaVar.i(starGift, z9, z10, j3, tL_textWithEntities, p3Var2);
                    } else {
                        ea.e("NO_BALANCE");
                        p3Var2.a(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String l10 = org.telegram.messenger.m5.l(this.a, j3);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z9;
        tL_inputInvoiceStarGift.peer = qp.s1(this.a).j1(j3);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z10;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = hi.a3.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: bi.w7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final ea eaVar = ea.this;
                final zh.p3 p3Var2 = p3Var;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.f6 f6Var = I;
                final String str = l10;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z11 = z9;
                final boolean z12 = z10;
                final long j10 = j3;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.m8
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z13 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final zh.p3 p3Var3 = p3Var2;
                        if (!z13) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            ea.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            p3Var3.a(Boolean.FALSE, null);
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
                        final ea eaVar2 = ea.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(eaVar2.a);
                        final Context context4 = context3;
                        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z14 = z11;
                        final boolean z15 = z12;
                        final long j12 = j10;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: bi.u8
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final ea eaVar3 = ea.this;
                                final zh.p3 p3Var4 = p3Var3;
                                final Context context5 = context4;
                                final org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                                final long j13 = j11;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z16 = z14;
                                final boolean z17 = z15;
                                final long j14 = j12;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.d8
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
                                        ea eaVar4 = ea.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        zh.p3 p3Var5 = p3Var4;
                                        Context context6 = context5;
                                        org.telegram.ui.ActionBar.f6 f6Var4 = f6Var3;
                                        long j15 = j13;
                                        String str5 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z18 = z16;
                                        boolean z19 = z17;
                                        long j16 = j14;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                                        org.telegram.ui.Components.hc X = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.hc.X() : org.telegram.ui.Components.hc.a0(Q);
                                        boolean z20 = tLObject4 instanceof TLRPC.TL_payments_paymentResult;
                                        int i10 = 1;
                                        if (!z20) {
                                            if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                if (qp.s1(eaVar4.a).j7) {
                                                    p3Var5.a(Boolean.FALSE, null);
                                                    ea.c0(context6, f6Var4);
                                                    return;
                                                } else {
                                                    boolean[] zArr = {false};
                                                    tc tcVar = new tc(context6, f6Var4, j15, 6, str5, new v8(eaVar4, zArr, starGift5, z18, z19, j16, tL_textWithEntities5, p3Var5), 0L);
                                                    tcVar.setOnDismissListener(new u3(p3Var5, zArr, i10));
                                                    tcVar.show();
                                                    return;
                                                }
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                p3Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                p3Var5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            } else {
                                                p3Var5.a(Boolean.FALSE, null);
                                                X.Q(R.raw.error, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS")).j();
                                                return;
                                            }
                                        }
                                        Utilities.d.c(new p8(eaVar4, (TLRPC.TL_payments_paymentResult) tLObject4, 2));
                                        eaVar4.D = false;
                                        eaVar4.E = true;
                                        eaVar4.G = 0L;
                                        eaVar4.U();
                                        eaVar4.P(j16);
                                        eaVar4.S(true);
                                        p3Var5.a(Boolean.TRUE, null);
                                        org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(eaVar4.a).b();
                                        if (b10 != null && b10.a(j16)) {
                                            qp.s1(eaVar4.a).e7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j16, false).apply();
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            str4 = str5;
                                            spannableStringBuilder = null;
                                        } else {
                                            int i11 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i11;
                                            spannableStringBuilder = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "Gift2SentRemainsLimit", Math.max(0, i11)));
                                            str4 = str5;
                                        }
                                        if (j16 < 0) {
                                            long j17 = -j16;
                                            TLRPC.ChatFull N0 = qp.s1(eaVar4.a).N0(j17);
                                            if (N0 != null) {
                                                N0.stargifts_count++;
                                                N0.flags2 |= 262144;
                                                qp.s1(eaVar4.a).R3(N0);
                                            }
                                            if (Q instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) Q;
                                                if (profileActivity.a() == j16) {
                                                    vv0 vv0Var = profileActivity.N;
                                                    if (vv0Var != null) {
                                                        vv0Var.N1(true);
                                                        profileActivity.N.i1(14);
                                                        r11 = 0;
                                                        profileActivity.U4(false);
                                                    } else {
                                                        r11 = 0;
                                                    }
                                                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(Q);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String M0 = org.telegram.messenger.hd.M0(2131745110, null);
                                                    if (spannableStringBuilder == null) {
                                                        Object[] objArr = new Object[1];
                                                        objArr[r11] = str4;
                                                        spannableStringBuilder = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) j15, "StarsGiftCompletedChannelText", objArr));
                                                    }
                                                    a02.s(document, M0, spannableStringBuilder).k(r11);
                                                }
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", j17);
                                            bundle.putBoolean("open_gifts", true);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                            profileActivity2.whenFullyVisible(new i0(profileActivity2, starGift5, spannableStringBuilder, j15, str4, 5));
                                            Q.presentFragment(profileActivity2);
                                        } else if ((Q instanceof an) && ((an) Q).a() == j16) {
                                            org.telegram.ui.Components.hc a03 = org.telegram.ui.Components.hc.a0(Q);
                                            TLRPC.Document document2 = starGift5.sticker;
                                            String M02 = org.telegram.messenger.hd.M0(2131745110, null);
                                            if (spannableStringBuilder == null) {
                                                spannableStringBuilder = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) j15, "StarsGiftCompletedText", new Object[0]));
                                            }
                                            a03.s(document2, M02, spannableStringBuilder).k(true);
                                        } else {
                                            qs f10 = qs.f(eaVar4.a);
                                            int i12 = qs.v;
                                            Long valueOf = Long.valueOf(j16);
                                            Boolean bool = Boolean.FALSE;
                                            f10.k(i12, valueOf, bool);
                                            qs.f(eaVar4.a).k(qs.u, Long.valueOf(j16), bool);
                                            an ra2 = an.ra(j16);
                                            ra2.whenFullyVisible(new w2(ra2, starGift5, spannableStringBuilder, j15, 5));
                                            Q.presentFragment(ra2);
                                        }
                                        qp.s1(eaVar4.a).e7.edit().putBoolean("show_gift_for_" + j16, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j16, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        if (launchActivity == null || (r80Var = launchActivity.v0) == null) {
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
        int i7 = qs.y3;
        int i10 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            qs.f(i10).k(i7, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            qs.f(i10).k(i7, new Object[0]);
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

    public final void j0(final ij ijVar, final long j3, final Runnable runnable, final boolean z9) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (ijVar == null) {
            runnable.run();
            return;
        }
        final long B0 = ij.B0(ijVar.k);
        final int f12 = ijVar.f1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) ijVar.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i7 = this.a;
        tL_messages_editMessage.peer = qp.s1(i7).j1(B0);
        int i10 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i10;
        tL_messages_editMessage.schedule_date = ijVar.k.date;
        tL_messages_editMessage.id = f12;
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
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: bi.i9
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new o9(ea.this, tLObject, runnable, tL_error, z9, B0, f12, ijVar, j3));
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
            v9 v9Var = (v9) longSparseArray.valueAt(i7);
            for (int i10 = 0; i10 < v9Var.l.size(); i10++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v9Var.l.get(i10);
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

    public final TL_stars.StarsAmount q(Runnable runnable, boolean z9, boolean z10) {
        if (((!this.e || System.currentTimeMillis() - this.c > 60000) && !this.d) || z10) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new j(7, this, runnable));
        }
        if (!z9 || this.g <= 0) {
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
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new x8(this, 3));
        return this.m;
    }

    public final ArrayList v() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new x8(this, 4));
        return this.p;
    }

    public final ArrayList z() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new x8(this, 2));
        return this.j;
    }
}
