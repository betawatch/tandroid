// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jva {
    public static volatile jva[][] S = (jva[][]) Array.newInstance((Class<?>) jva.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public hva B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public eva N;
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
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                T[i][i2] = new Object();
            }
        }
    }

    public jva(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static ylb F() {
        d S2 = LaunchActivity.S();
        if (S2 != null) {
            return S2.getResourceProvider();
        }
        return null;
    }

    public static jva I(int i) {
        return v(i, true);
    }

    public static boolean Q(int i, nk nkVar) {
        return nkVar == null || u(i, nkVar.a).p().b >= nkVar.b;
    }

    public static void c(String str) {
        d Q = LaunchActivity.Q();
        ((Q == null || Q.visibleDialog != null) ? c41.Y() : c41.b0(Q)).Q(R.raw.error, 36, c41.W(str)).j();
    }

    public static void c0(Context context, ylb ylbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131744749, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131744750, null);
        b10.t(null, 2131747564, alertDialog$Builder, null);
    }

    public static boolean h(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i = savedStarGift.flags;
        if ((i & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            return ((i & 8) == 0 || (savedStarGift2.flags & 8) == 0 || savedStarGift.msg_id != savedStarGift2.msg_id) ? false : true;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute i(ArrayList arrayList, Class cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                return (TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute);
            }
        }
        return null;
    }

    public static ArrayList j(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                arrayList2.add((TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute));
            }
        }
        return arrayList2;
    }

    public static long l(TLObject tLObject) {
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

    public static Context q(d dVar) {
        if (dVar != null && dVar.getContext() != null) {
            return dVar.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.H1;
        }
        if (a.b != null) {
            return a.b;
        }
        return null;
    }

    public static jva t(int i) {
        return v(i, false);
    }

    public static jva u(int i, ok okVar) {
        return v(i, okVar == ok.b);
    }

    public static jva v(int i, boolean z) {
        jva jvaVar;
        jva jvaVar2 = S[z ? 1 : 0][i];
        if (jvaVar2 != null) {
            return jvaVar2;
        }
        synchronized (T[z ? 1 : 0][i]) {
            jvaVar = S[z ? 1 : 0][i];
            if (jvaVar == null) {
                jva[] jvaVarArr = S[z ? 1 : 0];
                jva jvaVar3 = new jva(i, z);
                jvaVarArr[i] = jvaVar3;
                jvaVar = jvaVar3;
            }
        }
        return jvaVar;
    }

    public final long A(int i, long j) {
        hva hvaVar = this.B;
        if (hvaVar == null) {
            return 0L;
        }
        cva cvaVar = hvaVar.a;
        if (cvaVar.a == j && cvaVar.b == i && hvaVar.l) {
            return hvaVar.h;
        }
        return 0L;
    }

    public final long B(k47 k47Var) {
        TLRPC.Message message;
        if (k47Var == null || (message = k47Var.k) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || k47Var.k3()) && k47Var.k.fwd_from != null) ? A(k47Var.k.fwd_from.saved_from_msg_id, k47Var.Z0()) : A(k47Var.e1(), k47.B0(k47Var.k));
    }

    public final yua C(long j, boolean z) {
        LongSparseArray longSparseArray = this.K;
        yua yuaVar = (yua) longSparseArray.get(j);
        if (yuaVar != null || !z) {
            return yuaVar;
        }
        yua yuaVar2 = new yua(this.a, j);
        longSparseArray.put(j, yuaVar2);
        return yuaVar2;
    }

    public final ava D(long j, boolean z) {
        LongSparseArray longSparseArray = this.L;
        ava avaVar = (ava) longSparseArray.get(j);
        if (avaVar != null || !z) {
            return avaVar;
        }
        ava avaVar2 = new ava(this.a, j, true);
        longSparseArray.put(j, avaVar2);
        return avaVar2;
    }

    public final void E(TL_stars.StarGift starGift, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, qac qacVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        ylb F = F();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            o(new ut0(this, qacVar, starGift, j, tL_textWithEntities, z, (byte) 7));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = oc7.r1(this.a).i1(j);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        byte b = 1;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = wx0.u(F, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new ara(this, qacVar, b));
    }

    public final TL_stars.StarGift G(long j) {
        T();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                return null;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i);
            if (starGift.id == j) {
                return starGift;
            }
            i++;
        }
    }

    public final void H(long j, qac qacVar) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j));
        if (stargiftupgradepreview != null) {
            qacVar.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new jb7((Object) this, j, (Object) qacVar, (byte) 16));
    }

    public final void J(TL_stars.InputSavedStarGift inputSavedStarGift, qac qacVar) {
        he heVar = new he(3, null, a.b);
        heVar.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new av0((Object) this, (Object) heVar, (Object) inputSavedStarGift, (Object) qacVar, (byte) 22));
    }

    public final boolean K(int i) {
        return this.e && !this.q[i].isEmpty();
    }

    public final void L() {
        this.e = false;
        m();
        this.e = true;
    }

    public final void M(long j) {
        ava D = D(j, false);
        if (D != null) {
            D.k(false);
        }
        yua yuaVar = (yua) this.K.get(j);
        if (yuaVar != null) {
            yuaVar.g();
        }
    }

    public final void N(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j = userFull.id;
            ava D = D(j, false);
            if (D != null && D.n != userFull.stargifts_count) {
                D.k(false);
            }
            yua yuaVar = (yua) this.K.get(j);
            if (yuaVar != null) {
                yuaVar.g();
            }
        }
    }

    public final void O() {
        if (this.x) {
            return;
        }
        this.v.clear();
        this.w = null;
        this.x = false;
        this.y = false;
        U();
    }

    public final void P(boolean z) {
        for (int i = 0; i < 3; i++) {
            boolean[] zArr = this.t;
            if (!zArr[i]) {
                this.q[i].clear();
                this.s[i] = null;
                zArr[i] = false;
                this.u[i] = false;
                if (z) {
                    V(i);
                }
            }
        }
    }

    public final /* synthetic */ void R(ArrayList arrayList, Integer num, Long l, ArrayList arrayList2, ArrayList arrayList3) {
        int i = this.a;
        oc7.r1(i).d4(arrayList2, true);
        oc7.r1(i).X3(arrayList3, true);
        this.E = true;
        ArrayList arrayList4 = this.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = this.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new mn((byte) 14)), new mn((byte) 15)));
        ArrayList arrayList6 = this.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new mn((byte) 16)));
        this.F = num.intValue();
        this.G = l.longValue();
        this.C = false;
        nm7.f(i).k(nm7.H3, new Object[0]);
        T();
    }

    public final void S(TL_stars.StarGifts starGifts) {
        this.C = false;
        this.D = true;
        boolean z = starGifts instanceof TL_stars.TL_starGifts;
        int i = this.a;
        ArrayList arrayList = this.H;
        if (!z) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i2 = this.F;
                long currentTimeMillis = System.currentTimeMillis();
                this.G = currentTimeMillis;
                cf7 Y = cf7.Y(i);
                Y.a.c(new md7(Y, arrayList, i2, currentTimeMillis));
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        oc7.r1(i).d4(tL_starGifts.users, false);
        oc7.r1(i).X3(tL_starGifts.chats, false);
        cf7.Y(i).j1(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList.clear();
        arrayList.addAll(tL_starGifts.gifts);
        ArrayList arrayList2 = this.J;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new mn((byte) 17)), new mn((byte) 18)));
        ArrayList arrayList3 = this.I;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        Collections.sort(arrayList3, Comparator$-CC.comparingInt(new mn((byte) 19)));
        this.F = tL_starGifts.hash;
        this.G = System.currentTimeMillis();
        nm7.f(i).k(nm7.H3, new Object[0]);
        ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
        int i3 = this.F;
        long j = this.G;
        cf7 Y2 = cf7.Y(i);
        Y2.a.c(new md7(Y2, arrayList4, i3, j));
    }

    public final void T() {
        if (this.C) {
            return;
        }
        if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
            this.C = true;
            boolean z = this.E;
            int i = this.a;
            if (z) {
                int i2 = this.F;
                eg9 eg9Var = new eg9(this, (byte) 10);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i2;
                ConnectionsManager.getInstance(i).sendRequest(getstargifts, new go9(eg9Var, (byte) 3));
                return;
            }
            yf9 yf9Var = new yf9(this, (byte) 27);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            cf7 Y = cf7.Y(i);
            Y.a.c(new hz7((Object) Y, (Object) arrayList3, (Object) arrayList2, (Object) arrayList, (Object) yf9Var, (byte) 26));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new jua(this, (byte) 1));
    }

    public final void V(int i) {
        boolean[] zArr = this.t;
        if (zArr[i] || this.u[i]) {
            return;
        }
        zArr[i] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = this.b;
        tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
        tL_payments_getStarsTransactions.inbound = i == 1;
        tL_payments_getStarsTransactions.outbound = i == 2;
        String str = this.s[i];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new w22(this, i, (byte) 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04c1  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(k47 k47Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, qac qacVar) {
        long j;
        boolean z;
        long j2;
        String str;
        boolean z2;
        my0 my0Var;
        s99 s99Var;
        sua suaVar;
        k47 k47Var2;
        int i;
        float f;
        ?? r2;
        ViewGroup viewGroup;
        TLRPC.Message message;
        String str2;
        boolean z3;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i2;
        int i3;
        int i4;
        String G;
        String G2;
        String str3;
        char c;
        String G3;
        char c2;
        String G4;
        boolean z4;
        TLRPC.User W1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        int[] iArr;
        String M0;
        ViewGroup viewGroup2;
        TLRPC.Message message2;
        int i5;
        int i6;
        ViewGroup viewGroup3;
        vwa vwaVar;
        ViewGroup viewGroup4;
        gn5 gn5Var;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        oc7.r1(this.a).d4(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        Context context2 = context;
        ylb F = F();
        if (context2 != null) {
            if (!this.e) {
                o(new fqa(this, runnable, k47Var, inputInvoice, tL_payments_paymentFormStars, qacVar, (byte) 5));
                return;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
            int size = arrayList.size();
            int i7 = 0;
            long j3 = 0;
            while (i7 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                i7++;
                j3 += tL_labeledPrice.amount;
            }
            if (k47Var == null || k47Var.D != 29) {
                j = tL_payments_paymentFormStars.bot_id;
            } else {
                TLRPC.Message message3 = k47Var.k;
                TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
                j = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? k47.B0(message3) : pg3.n(peer2);
            }
            long j4 = j;
            int i8 = this.a;
            if (j4 >= 0) {
                TLRPC.User W12 = oc7.r1(i8).W1(Long.valueOf(j4));
                String r = m9c.r(W12);
                z2 = !m9c.v(W12);
                str = r;
                z = false;
                j2 = j3;
            } else {
                oc7 r1 = oc7.r1(i8);
                z = false;
                j2 = j3;
                TLRPC.Chat L0 = r1.L0(Long.valueOf(-j4));
                str = L0 == null ? "" : L0.title;
                z2 = false;
            }
            String str4 = tL_payments_paymentFormStars.title;
            runnable.run();
            int i9 = tL_payments_paymentFormStars.invoice.subscription_period;
            boolean[] zArr = new boolean[1];
            zArr[z ? 1 : 0] = z;
            int i10 = this.a;
            TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
            long j5 = j2;
            sua suaVar2 = new sua(this, j5, zArr, qacVar, context2, F, z2, str, k47Var, inputInvoice, tL_payments_paymentFormStars, i9, j4);
            s99 s99Var2 = new s99(this, zArr, qacVar);
            my0 h = hg9.h(1, F, context2, false);
            TLRPC.User W13 = oc7.r1(i10).W1(Long.valueOf(j4));
            LinearLayout i11 = hg9.i(context2, 1);
            i11.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(8.0f));
            ViewGroup frameLayout = new FrameLayout(context2);
            frameLayout.addView(new uwa(context2, 40, 0), qoe.c(-1.0f, -1));
            if (k47Var == null || (message2 = k47Var.k) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                my0Var = h;
                s99Var = s99Var2;
                suaVar = suaVar2;
                k47Var2 = k47Var;
                i = i9;
                f = 20.0f;
                ViewGroup viewGroup5 = frameLayout;
                if (webDocument != null) {
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    bf0 bf0Var = new bf0(context2);
                    bf0Var.setRoundRadius(gm.L(18.0f));
                    bf0Var.p(gn5.p(vuc.c(webDocument)), "80_80", null, null);
                    frameLayout2.addView(bf0Var, qoe.e(80, 80, 48));
                    viewGroup5.addView(frameLayout2, qoe.e(80, 87, 17));
                    TextView textView = new TextView(context2);
                    textView.setTypeface(gm.n1("fonts/num.otf"));
                    r2 = 1;
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(-1);
                    textView.setText(nxa.U0("XTR ".concat(jb6.E((int) j5, ',')), 0.85f, null));
                    textView.setPadding(gm.L(5.33f), 0, gm.L(5.33f), 0);
                    textView.setBackground(cmb.b0(gm.L(16.0f), -1133566));
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    int L = gm.L(20.0f);
                    int i12 = cmb.g5;
                    ShapeDrawable b0 = cmb.b0(L, cmb.v0(i12, F));
                    wmb M = anb.M(i12);
                    frameLayout3.setBackground(b0);
                    anb.j(frameLayout3, b0, M, null, F);
                    frameLayout3.setPadding(gm.L(1.33f), gm.L(1.33f), gm.L(1.33f), gm.L(1.33f));
                    frameLayout3.addView(textView, qoe.r(-2, 16, nm7.D1));
                    frameLayout2.addView(frameLayout3, qoe.a(-2.0f, 18.66f, 81));
                    viewGroup = viewGroup5;
                    cxa cxaVar = new cxa(i10, F, context2);
                    rve.a(cxaVar);
                    cxaVar.setOnClickListener(new jwa(cxaVar, r2));
                    viewGroup.addView(cxaVar, qoe.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                    i11.addView(viewGroup, qoe.r(-1, nm7.B1, 7));
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(r2, f);
                    textView2.setTypeface(gm.o());
                    int i13 = cmb.i5;
                    anb.X(textView2, i13, F);
                    if (i <= 0) {
                        if (webDocument != null) {
                            M0 = str4;
                            iArr = null;
                        } else {
                            iArr = null;
                            M0 = jb6.M0(2131744804, null);
                        }
                        textView2.setText(gw3.m(M0, textView2.getPaint().getFontMetricsInt(), false, iArr, 0));
                    } else {
                        textView2.setText(gw3.m(webDocument != null ? str4 : jb6.M0(2131744811, null), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    }
                    nm7.i(textView2);
                    textView2.setGravity(17);
                    i11.addView(textView2, qoe.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                    if (webDocument != null) {
                        LinearLayout i14 = hg9.i(context2, 0);
                        int L2 = gm.L(28.0f);
                        int i15 = cmb.Z6;
                        Drawable b02 = cmb.b0(L2, cmb.v0(i15, F));
                        wmb M2 = anb.M(i15);
                        i14.setBackground(b02);
                        anb.j(i14, b02, M2, null, F);
                        bf0 bf0Var2 = new bf0(context2);
                        bf0Var2.setRoundRadius(gm.L(14.0f));
                        pc0 pc0Var = new pc0((ylb) null);
                        pc0Var.q(W13);
                        bf0Var2.f(W13, pc0Var);
                        i14.addView(bf0Var2, qoe.o(28, 28));
                        TextView textView3 = new TextView(context2);
                        textView3.setTextSize(r2, 13.0f);
                        anb.X(textView3, cmb.F6, F);
                        textView3.setText(m9c.r(W13));
                        i14.addView(textView3, qoe.t(-2, -2, 16, 6, 0, 10, 0));
                        i11.addView(i14, qoe.t(-2, 28, 1, 0, 8, 0, 2));
                    }
                    TextView textView4 = new TextView(context2);
                    textView4.setTextSize(r2, 14.0f);
                    anb.X(textView4, i13, F);
                    if (k47Var2 == null && (message = k47Var2.k) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                        long B0 = k47.B0(message);
                        TLRPC.Message message4 = k47Var2.k;
                        if (message4 != null && (messageFwdHeader = message4.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                            B0 = pg3.n(peer);
                        }
                        if (B0 < 0 && k47Var2.Z0() > 0 && (W1 = oc7.r1(i10).W1(Long.valueOf(k47Var2.Z0()))) != null && W1.bot) {
                            B0 = W1.id;
                        }
                        if (B0 >= 0) {
                            TLRPC.User W14 = oc7.r1(i10).W1(Long.valueOf(B0));
                            str2 = m9c.r(W14);
                            if (W14 != null && W14.bot) {
                                z3 = r2;
                                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) k47Var2.k.media;
                                i3 = 0;
                                int i16 = 0;
                                for (i2 = 0; i2 < tL_messageMediaPaidMedia.extended_media.size(); i2++) {
                                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i2);
                                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                                        if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                            z4 = r2;
                                        }
                                        z4 = false;
                                    } else {
                                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                            z4 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                                        }
                                        z4 = false;
                                    }
                                    if (z4) {
                                        i3++;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (i3 != 0) {
                                    str3 = z3 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                    int i17 = (int) j5;
                                    if (i16 == r2) {
                                        G4 = jb6.M0(2131744820, null);
                                        c2 = 0;
                                    } else {
                                        c2 = 0;
                                        G4 = jb6.G(i16, "StarsConfirmPurchaseMedia_Photos", new Object[0]);
                                    }
                                    Object[] objArr = new Object[2];
                                    objArr[c2] = G4;
                                    objArr[r2] = str2;
                                    G2 = jb6.G(i17, str3, objArr);
                                } else if (i16 == 0) {
                                    str3 = z3 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                    int i18 = (int) j5;
                                    if (i3 == r2) {
                                        G3 = jb6.M0(2131744819, null);
                                        c = 0;
                                    } else {
                                        c = 0;
                                        G3 = jb6.G(i3, "StarsConfirmPurchaseMedia_Videos", new Object[0]);
                                    }
                                    Object[] objArr2 = new Object[2];
                                    objArr2[c] = G3;
                                    objArr2[r2] = str2;
                                    G2 = jb6.G(i18, str3, objArr2);
                                } else {
                                    String str5 = z3 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                                    int i19 = (int) j5;
                                    if (i16 == r2) {
                                        G = jb6.M0(2131744820, null);
                                        i4 = 0;
                                    } else {
                                        i4 = 0;
                                        G = jb6.G(i16, "StarsConfirmPurchaseMedia_Photos", new Object[0]);
                                    }
                                    String M02 = i3 == r2 ? jb6.M0(2131744819, null) : jb6.G(i3, "StarsConfirmPurchaseMedia_Videos", new Object[i4]);
                                    Object[] objArr3 = new Object[3];
                                    objArr3[i4] = G;
                                    objArr3[r2] = M02;
                                    objArr3[2] = str2;
                                    G2 = jb6.G(i19, str5, objArr3);
                                }
                                textView4.setText(gm.S2(G2));
                            }
                        } else {
                            TLRPC.Chat L02 = oc7.r1(i10).L0(Long.valueOf(-B0));
                            str2 = L02 != null ? L02.title : "";
                        }
                        z3 = false;
                        tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) k47Var2.k.media;
                        i3 = 0;
                        int i162 = 0;
                        while (i2 < tL_messageMediaPaidMedia.extended_media.size()) {
                        }
                        if (i3 != 0) {
                        }
                        textView4.setText(gm.S2(G2));
                    } else if (i <= 0) {
                        String r3 = m9c.r(W13);
                        Object[] objArr4 = new Object[2];
                        objArr4[0] = str4;
                        objArr4[r2] = r3;
                        textView4.setText(gm.S2(jb6.K("StarsConfirmSubscriptionText2", (int) j5, ',', objArr4)));
                    } else {
                        String r4 = m9c.r(W13);
                        Object[] objArr5 = new Object[2];
                        objArr5[0] = str4;
                        objArr5[r2] = r4;
                        textView4.setText(gm.S2(jb6.K("StarsConfirmPurchaseText2", (int) j5, ',', objArr5)));
                    }
                    textView4.setMaxWidth(hg5.a(textView4.getText(), textView4.getPaint()));
                    textView4.setGravity(17);
                    i11.addView(textView4, qoe.t(-2, -2, 1, 0, 6, 0, 18));
                    b61 b61Var = new b61(F, context2, r2);
                    if (i <= 0) {
                        b61Var.i(nxa.T0(gm.S2(jb6.H(',', "StarsConfirmSubscriptionButton", (int) j5))), false, r2);
                    } else {
                        b61Var.i(nxa.T0(gm.S2(jb6.H(',', "StarsConfirmPurchaseButton", (int) j5))), false, r2);
                    }
                    i11.addView(b61Var, qoe.c(48.0f, -1));
                    l66 l66Var = new l66(context2, F);
                    anb.X(l66Var, cmb.y6, F);
                    anb.G(l66Var, cmb.Wc, F);
                    l66Var.setTextSize(r2, 14.0f);
                    l66Var.setText(gm.N2(jb6.M0(i <= 0 ? 2131744808 : 2131744815, null), -1, 0, new dh1(context2, (byte) 20), null));
                    l66Var.setGravity(17);
                    i11.addView(l66Var, qoe.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                    my0 my0Var2 = my0Var;
                    my0Var2.O = i11;
                    b61Var.setOnClickListener(new jw4(suaVar, my0Var2, b61Var, (byte) 22));
                    my0Var2.setOnDismissListener(new qj8(s99Var, (byte) 9));
                    my0Var2.J();
                    my0Var2.show();
                }
                bf0 bf0Var3 = new bf0(context2);
                bf0Var3.setRoundRadius(gm.L(80.0f));
                pc0 pc0Var2 = new pc0((ylb) null);
                pc0Var2.q(W13);
                bf0Var3.f(W13, pc0Var2);
                viewGroup5.addView(bf0Var3, qoe.e(80, 80, 17));
                viewGroup2 = viewGroup5;
            } else {
                vwa vwaVar2 = new vwa(context2);
                vwaVar2.I = new Path();
                vwaVar2.J = new RectF();
                vwaVar2.K = b10.d(context2, R.drawable.large_locked_post);
                vwaVar2.setRoundRadius(gm.L(24.0f));
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) k47Var.k.media;
                if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                    my0Var = h;
                    s99Var = s99Var2;
                    suaVar = suaVar2;
                    k47Var2 = k47Var;
                    i = i9;
                    i5 = 17;
                    i6 = 80;
                    f = 20.0f;
                    viewGroup3 = frameLayout;
                } else {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        gn5Var = gn5.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, k47Var.k);
                        vwaVar = vwaVar2;
                        s99Var = s99Var2;
                    } else {
                        if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                vwaVar = vwaVar2;
                                s99Var = s99Var2;
                                gn5Var = gn5.i(bc4.w(messageMedia.photo.sizes, gm.L(80.0f), true, null, false), messageMedia.photo);
                            } else {
                                vwaVar = vwaVar2;
                                s99Var = s99Var2;
                                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                    gn5Var = gn5.c(bc4.w(messageMedia.document.thumbs, gm.L(80.0f), true, null, false), messageMedia.document);
                                }
                            }
                        } else {
                            vwaVar = vwaVar2;
                            s99Var = s99Var2;
                        }
                        viewGroup4 = frameLayout;
                        gn5Var = null;
                        my0Var = h;
                        suaVar = suaVar2;
                        i = i9;
                        i5 = 17;
                        i6 = 80;
                        f = 20.0f;
                        viewGroup3 = viewGroup4;
                        vwaVar2 = vwaVar;
                        vwaVar2.j(gn5Var, "80_80_b2", null, null, null, k47Var);
                        k47Var2 = k47Var;
                    }
                    viewGroup4 = frameLayout;
                    my0Var = h;
                    suaVar = suaVar2;
                    i = i9;
                    i5 = 17;
                    i6 = 80;
                    f = 20.0f;
                    viewGroup3 = viewGroup4;
                    vwaVar2 = vwaVar;
                    vwaVar2.j(gn5Var, "80_80_b2", null, null, null, k47Var);
                    k47Var2 = k47Var;
                }
                viewGroup3.addView(vwaVar2, qoe.e(i6, i6, i5));
                viewGroup2 = viewGroup3;
            }
            r2 = 1;
            viewGroup = viewGroup2;
            cxa cxaVar2 = new cxa(i10, F, context2);
            rve.a(cxaVar2);
            cxaVar2.setOnClickListener(new jwa(cxaVar2, r2));
            viewGroup.addView(cxaVar2, qoe.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
            i11.addView(viewGroup, qoe.r(-1, nm7.B1, 7));
            TextView textView22 = new TextView(context2);
            textView22.setTextSize(r2, f);
            textView22.setTypeface(gm.o());
            int i132 = cmb.i5;
            anb.X(textView22, i132, F);
            if (i <= 0) {
            }
            nm7.i(textView22);
            textView22.setGravity(17);
            i11.addView(textView22, qoe.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
            if (webDocument != null) {
            }
            TextView textView42 = new TextView(context2);
            textView42.setTextSize(r2, 14.0f);
            anb.X(textView42, i132, F);
            if (k47Var2 == null) {
            }
            if (i <= 0) {
            }
            textView42.setMaxWidth(hg5.a(textView42.getText(), textView42.getPaint()));
            textView42.setGravity(17);
            i11.addView(textView42, qoe.t(-2, -2, 1, 0, 6, 0, 18));
            b61 b61Var2 = new b61(F, context2, r2);
            if (i <= 0) {
            }
            i11.addView(b61Var2, qoe.c(48.0f, -1));
            l66 l66Var2 = new l66(context2, F);
            anb.X(l66Var2, cmb.y6, F);
            anb.G(l66Var2, cmb.Wc, F);
            l66Var2.setTextSize(r2, 14.0f);
            l66Var2.setText(gm.N2(jb6.M0(i <= 0 ? 2131744808 : 2131744815, null), -1, 0, new dh1(context2, (byte) 20), null));
            l66Var2.setGravity(17);
            i11.addView(l66Var2, qoe.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
            my0 my0Var22 = my0Var;
            my0Var22.O = i11;
            b61Var2.setOnClickListener(new jw4(suaVar, my0Var22, b61Var2, (byte) 22));
            my0Var22.setOnDismissListener(new qj8(s99Var, (byte) 9));
            my0Var22.J();
            my0Var22.show();
        }
    }

    public final void X(final k47 k47Var, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final qac qacVar) {
        long j;
        String str;
        TLRPC.User W1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = a.b;
            final ylb F = F();
            if (context == null) {
                return;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
            int size = arrayList.size();
            final long j2 = 0;
            int i = 0;
            while (i < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                i++;
                j2 += tL_labeledPrice.amount;
            }
            if (k47Var != null) {
                TLRPC.Message message = k47Var.k;
                j = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? k47.B0(message) : pg3.n(peer);
                if (j < 0 && k47Var.Z0() > 0 && (W1 = oc7.r1(this.a).W1(Long.valueOf(k47Var.Z0()))) != null && W1.bot) {
                    j = W1.id;
                }
            } else {
                j = tL_payments_paymentFormStars.bot_id;
            }
            final long j3 = j;
            int i2 = this.a;
            if (j3 >= 0) {
                str = m9c.r(oc7.r1(i2).W1(Long.valueOf(j3)));
            } else {
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j3));
                str = L0 == null ? "" : L0.title;
            }
            final String str2 = str;
            final String str3 = tL_payments_paymentFormStars.title;
            final int i3 = tL_payments_paymentFormStars.invoice.subscription_period;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
            tL_payments_sendStarsForm.invoice = inputInvoice;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: uta
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final jva jvaVar = jva.this;
                    final qac qacVar2 = qacVar;
                    final k47 k47Var2 = k47Var;
                    final Context context2 = context;
                    final long j4 = j2;
                    final String str4 = str2;
                    final int i4 = i3;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j5 = j3;
                    final ylb ylbVar = F;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    gm.c3(new Runnable() { // from class: yta
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
                        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            k47 k47Var3;
                            boolean z;
                            LaunchActivity launchActivity;
                            v16 v16Var;
                            TLRPC.Message message2;
                            jva jvaVar2 = jva.this;
                            TLObject tLObject2 = tLObject;
                            qac qacVar3 = qacVar2;
                            k47 k47Var4 = k47Var2;
                            Context context3 = context2;
                            long j6 = j4;
                            String str6 = str4;
                            int i5 = i4;
                            String str7 = str5;
                            TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                            long j7 = j5;
                            TLRPC.TL_error tL_error2 = tL_error;
                            ylb ylbVar2 = ylbVar;
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                            d Q = LaunchActivity.Q();
                            c41 Y = (Q == null || Q.visibleDialog != null) ? c41.Y() : c41.b0(Q);
                            byte b = 0;
                            if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                                if (tL_error2 == null) {
                                    k47Var3 = k47Var4;
                                } else {
                                    if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                        if (!oc7.r1(jvaVar2.a).c5()) {
                                            qacVar3.a(Boolean.FALSE);
                                            jva.c0(context3, ylbVar2);
                                            return;
                                        } else {
                                            boolean[] zArr = {false};
                                            dxa dxaVar = new dxa(context3, ylbVar2, j6, 0, str6, new fqa(jvaVar2, zArr, k47Var4, inputInvoice3, tL_payments_paymentFormStars3, qacVar3, (byte) 3), j7);
                                            dxaVar.setOnDismissListener(new ty0(qacVar3, zArr));
                                            dxaVar.show();
                                            return;
                                        }
                                    }
                                    k47Var3 = k47Var4;
                                    if ("FORM_EXPIRED".equals(tL_error2.text)) {
                                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                        JSONObject u = wx0.u(ylbVar2, false);
                                        if (u != null) {
                                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                            tL_dataJSON.data = u.toString();
                                            tL_payments_getPaymentForm.flags |= 1;
                                        }
                                        tL_payments_getPaymentForm.invoice = inputInvoice3;
                                        ConnectionsManager.getInstance(jvaVar2.a).sendRequest(tL_payments_getPaymentForm, new fo0((Object) jvaVar2, (Object) k47Var3, (Object) inputInvoice3, (Object) qacVar3, (Object) Y, (byte) 17));
                                        return;
                                    }
                                }
                                qacVar3.a(Boolean.FALSE);
                                Y.Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                if (k47Var3 != null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia.peer = oc7.r1(jvaVar2.a).i1(j7);
                                    tL_messages_getExtendedMedia.id.add(Integer.valueOf(k47Var3.e1()));
                                    ConnectionsManager.getInstance(jvaVar2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                    return;
                                }
                                return;
                            }
                            qacVar3.a(Boolean.TRUE);
                            Utilities.d.c(new dua(jvaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, b));
                            if (k47Var4 != null && (message2 = k47Var4.k) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                Drawable d = b10.d(context3, R.drawable.star_small_inner);
                                String M0 = jb6.M0(2131744777, null);
                                SpannableStringBuilder S2 = gm.S2(jb6.G((int) j6, "StarsMediaPurchaseCompletedInfo", str6));
                                Y.getClass();
                                r31 r31Var = new r31(Y.X(), Y.c);
                                r31Var.a.setImageDrawable(d);
                                r31Var.b.setText(M0);
                                r31Var.c.setText(S2);
                                Y.b(r31Var, 2750).j();
                            } else {
                                if (i5 <= 0) {
                                    z = true;
                                    Y.I(R.raw.stars_send, jb6.M0(2131744741, null), gm.S2(jb6.G((int) j6, "StarsPurchaseCompletedInfo", str7, str6))).j();
                                    launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null && (v16Var = launchActivity.w0) != null) {
                                        v16Var.c(z);
                                    }
                                    if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                        jvaVar2.P(true);
                                    }
                                    if (k47Var4 == null) {
                                        TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                        tL_messages_getExtendedMedia2.peer = oc7.r1(jvaVar2.a).i1(j7);
                                        tL_messages_getExtendedMedia2.id.add(Integer.valueOf(k47Var4.e1()));
                                        ConnectionsManager.getInstance(jvaVar2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                        return;
                                    }
                                    return;
                                }
                                Y.I(R.raw.stars_send, jb6.M0(2131744843, null), gm.S2(jb6.G((int) j6, "StarsBotSubscriptionCompletedInfo", str7, str6))).j();
                            }
                            z = true;
                            launchActivity = LaunchActivity.H1;
                            if (launchActivity != null) {
                                v16Var.c(z);
                            }
                            if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                            }
                            jvaVar2.P(true);
                            if (k47Var4 == null) {
                            }
                        }
                    });
                }
            });
        }
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, jac jacVar) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = a.b;
        ylb F = F();
        if (context != null) {
            long j = chatInvite.subscription_pricing.amount;
            String str2 = chatInvite.title;
            TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
            tL_inputInvoiceChatInviteSubscription.hash = str;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new m97(this, jacVar, j, str2, context, F, chatInvite, str));
        }
    }

    public final void Z(long j, long j2, boolean z) {
        int i = this.a;
        qwb qwbVar = oc7.r1(i).g4;
        TLRPC.TL_forumTopic f = qwbVar.f(j, j2);
        if (f != null) {
            f.nopaid_messages_exception = z;
            vh6 vh6Var = qwbVar.a;
            if (((ArrayList) vh6Var.f(j)) != null) {
                qwbVar.getMessagesStorage().z1(qwbVar.getConnectionsManager().getCurrentTime(), -j, (List) vh6Var.f(j), true);
            }
            nm7.f(i).k(nm7.Q3, Long.valueOf(j2));
        }
    }

    public final boolean a(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || l(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int e1 = ((k47) obj).e1();
            hashSet.add(Integer.valueOf(e1));
            if (this.Q.remove(Integer.valueOf(e1))) {
                this.R.put(Integer.valueOf(e1), new hw9((Object) this, (Object) hashSet, (Object) runnable, (byte) 24));
                z = true;
            }
        }
        return !z;
    }

    public final void a0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null || TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i2 >= longSparseArray.size()) {
                break;
            }
            ((ava) longSparseArray.valueAt(i2)).o(tL_starGiftUnique);
            i2++;
        }
        while (true) {
            LongSparseArray longSparseArray2 = this.K;
            if (i >= longSparseArray2.size()) {
                return;
            }
            yua yuaVar = (yua) longSparseArray2.valueAt(i);
            ava avaVar = yuaVar.g;
            if (avaVar != null) {
                avaVar.o(tL_starGiftUnique);
            }
            Iterator it = yuaVar.h.values().iterator();
            while (it.hasNext()) {
                ((ava) it.next()).o(tL_starGiftUnique);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        if (r10.a == r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0072, code lost:
    
        if (r0.intValue() >= 3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0078, code lost:
    
        if (r1 >= 100) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(k47 k47Var) {
        boolean z;
        i74 i74Var;
        d S2;
        eva evaVar;
        TLRPC.Message message = k47Var.k;
        if (message != null) {
            long j = message.paid_message_stars;
            if (j <= 0 || k47.c3(message)) {
                return;
            }
            eva evaVar2 = this.N;
            if (evaVar2 == null || evaVar2.g <= 0 || !evaVar2.m || evaVar2.n || evaVar2.o) {
                if (!ik.a0(this.a, k47.B0(k47Var.k))) {
                    Long l = (Long) this.O.get(Long.valueOf(k47.B0(k47Var.k)));
                    if (l == null || System.currentTimeMillis() - l.longValue() <= 5000) {
                        Integer num = (Integer) this.P.get(Long.valueOf(k47.B0(k47Var.k)));
                        if (num != null) {
                        }
                    }
                }
                z = false;
                int e1 = k47Var.e1();
                if (z) {
                    this.Q.add(Integer.valueOf(e1));
                }
                long B0 = k47.B0(k47Var.k);
                ra raVar = new ra((byte) 7, this, z);
                i74Var = new i74((Object) this, z, e1, (byte) 5);
                S2 = LaunchActivity.S();
                evaVar = this.N;
                if (evaVar != null && (evaVar.o || evaVar.n)) {
                    this.N = null;
                    evaVar = null;
                }
                if (evaVar != null) {
                    if (S2 != null && !S2.isRemovingFromStack()) {
                        eva evaVar3 = this.N;
                        if (evaVar3.b == B0) {
                        }
                    }
                    this.N.a();
                    this.N = null;
                }
                if (S2 != null || S2.isRemovingFromStack()) {
                    i74Var.run();
                }
                eva evaVar4 = this.N;
                if (evaVar4 == null) {
                    evaVar4 = new eva(S2, B0);
                    this.N = evaVar4;
                }
                s31 s31Var = evaVar4.e;
                o31 o31Var = evaVar4.d;
                dva dvaVar = evaVar4.p;
                if (evaVar4.n || evaVar4.o) {
                    i74Var.run();
                    return;
                }
                evaVar4.g++;
                evaVar4.k.add(k47Var);
                evaVar4.h += j;
                evaVar4.i = raVar;
                evaVar4.j.add(i74Var);
                if (evaVar4.m && !z) {
                    evaVar4.m = false;
                    gm.r(dvaVar);
                    u31 u31Var = evaVar4.c;
                    u31Var.j = 5000;
                    u31Var.i(true);
                    if (System.currentTimeMillis() - evaVar4.l > 500) {
                        s31Var.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                    } else {
                        s31Var.setAlpha(0.0f);
                        s31Var.setVisibility(8);
                    }
                }
                iva ivaVar = evaVar4.f;
                if (ivaVar != null && evaVar4.m) {
                    ivaVar.b = 3000L;
                    gm.r(dvaVar);
                    gm.d3(dvaVar, 3000L);
                }
                io ioVar = o31Var.b;
                int i = evaVar4.g;
                ioVar.setText(i == 1 ? jb6.M0(2131747436, null) : jb6.G(i, "PaidMessageSentTitle", new Object[0]));
                o31Var.c.setText(gm.S2(jb6.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) evaVar4.h))));
                o31Var.a.d();
                return;
            }
            z = true;
            int e12 = k47Var.e1();
            if (z) {
            }
            long B02 = k47.B0(k47Var.k);
            ra raVar2 = new ra((byte) 7, this, z);
            i74Var = new i74((Object) this, z, e12, (byte) 5);
            S2 = LaunchActivity.S();
            evaVar = this.N;
            if (evaVar != null) {
                this.N = null;
                evaVar = null;
            }
            if (evaVar != null) {
            }
            if (S2 != null) {
            }
            i74Var.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hva b0(final k47 k47Var, final yv1 yv1Var, final long j, boolean z, boolean z2, final Long l) {
        String str;
        boolean z3;
        String str2;
        cva b = cva.b(k47Var);
        int i = this.a;
        jva v = v(i, false);
        Context q = q(yv1Var);
        if (q == null) {
            return null;
        }
        str = "";
        if (z2 && v.e && v.n(null, false, false).amount <= 0) {
            long a = yv1Var.a();
            if (a >= 0) {
                str = m9c.l(yv1Var.getMessagesController().W1(Long.valueOf(a)));
            } else {
                TLRPC.Chat L0 = yv1Var.getMessagesController().L0(Long.valueOf(-a));
                if (L0 != null) {
                    str = L0.title;
                }
            }
            final byte b2 = 0;
            new dxa(q, yv1Var.getResourceProvider(), j, 5, str, new Runnable(this) { // from class: kua
                public final /* synthetic */ jva b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b2) {
                        case 0:
                            this.b.b0(k47Var, yv1Var, j, true, true, l);
                            break;
                        default:
                            this.b.b0(k47Var, yv1Var, j, true, true, l);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        hva hvaVar = this.B;
        if (hvaVar == null || !hvaVar.a.equals(b)) {
            hva hvaVar2 = this.B;
            if (hvaVar2 != null) {
                hvaVar2.b();
            }
            ConnectionsManager.getInstance(i).getCurrentTime();
            hva hvaVar3 = new hva(this, b, k47Var, yv1Var, z);
            this.B = hvaVar3;
            hvaVar3.n = l;
        }
        if (this.B.h + j > oc7.r1(i).l4.y2.f()) {
            this.B.b();
            ConnectionsManager.getInstance(i).getCurrentTime();
            this.B = new hva(this, b, k47Var, yv1Var, z);
        }
        final long j2 = this.B.h + j;
        if (z2 && v.e && v.n(null, false, false).amount < j2) {
            this.B.a();
            long a2 = yv1Var.a();
            if (a2 >= 0) {
                str2 = m9c.l(yv1Var.getMessagesController().W1(Long.valueOf(a2)));
            } else {
                TLRPC.Chat L02 = yv1Var.getMessagesController().L0(Long.valueOf(-a2));
                str2 = L02 != null ? L02.title : "";
            }
            final byte b3 = 1;
            new dxa(q, yv1Var.getResourceProvider(), j2, 5, str2, new Runnable(this) { // from class: kua
                public final /* synthetic */ jva b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b3) {
                        case 0:
                            this.b.b0(k47Var, yv1Var, j2, true, true, l);
                            break;
                        default:
                            this.b.b0(k47Var, yv1Var, j2, true, true, l);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        hva hvaVar4 = this.B;
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
            if (message.reactions == null) {
                message.reactions = new TLRPC.TL_messageReactions();
                TLRPC.Message message2 = k47Var.k;
                message2.reactions.reactions_as_tags = k47.B0(message2) == z8c.h(k47Var.K1).e();
                k47Var.k.reactions.can_see_list = k47Var.o3() || k47Var.p3();
            }
            for (int i2 = 0; i2 < k47Var.k.reactions.results.size(); i2++) {
                if (!(k47Var.k.reactions.results.get(i2).reaction instanceof TLRPC.TL_reactionPaid)) {
                }
            }
            z3 = true;
            fva fvaVar = hvaVar4.p;
            jva jvaVar = hvaVar4.q;
            int i3 = jvaVar.a;
            o31 o31Var = hvaVar4.e;
            k47 k47Var2 = hvaVar4.b;
            if (!hvaVar4.i || hvaVar4.j) {
                boolean z4 = e21.a;
            } else {
                hvaVar4.h += j;
                System.currentTimeMillis();
                o31Var.c.a();
                o31Var.c.c(gm.S2(jb6.G((int) hvaVar4.h, "StarsSentText", new Object[0])), true, true);
                if (hvaVar4.m) {
                    hvaVar4.f.b = 5000L;
                    gm.r(fvaVar);
                    gm.d3(fvaVar, 5000L);
                }
                int i4 = nm7.o1;
                if (z3) {
                    hvaVar4.l = true;
                    k47Var2.f((int) j, hvaVar4.c(), true);
                    jvaVar.g += j;
                    nm7.f(i3).k(i4, Long.valueOf(k47.B0(k47Var2.k)), Integer.valueOf(k47Var2.e1()), k47Var2.k.reactions);
                    nm7.f(i3).k(nm7.A3, new Object[0]);
                } else {
                    hvaVar4.l = false;
                    TLRPC.Message message3 = k47Var2.k;
                    if (message3.reactions == null) {
                        message3.reactions = new TLRPC.TL_messageReactions();
                        TLRPC.Message message4 = k47Var2.k;
                        message4.reactions.reactions_as_tags = k47.B0(message4) == z8c.h(k47Var2.K1).e();
                        k47Var2.k.reactions.can_see_list = k47Var2.o3() || k47Var2.p3();
                    }
                    TLRPC.ReactionCount reactionCount = null;
                    for (int i5 = 0; i5 < k47Var2.k.reactions.results.size(); i5++) {
                        if (k47Var2.k.reactions.results.get(i5).reaction instanceof TLRPC.TL_reactionPaid) {
                            reactionCount = k47Var2.k.reactions.results.get(i5);
                        }
                    }
                    if (reactionCount == null) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
                        tL_reactionCount.count = 1;
                        tL_reactionCount.chosen = true;
                        k47Var2.k.reactions.results.add(0, tL_reactionCount);
                        hvaVar4.k--;
                    }
                    nm7.f(i3).k(i4, Long.valueOf(k47.B0(k47Var2.k)), Integer.valueOf(k47Var2.e1()), k47Var2.k.reactions);
                    hvaVar4.k += j;
                }
                o31Var.b.setText(hvaVar4.d());
            }
            hva hvaVar5 = this.B;
            hvaVar5.n = l;
            return hvaVar5;
        }
        if (!z) {
            z3 = false;
            fva fvaVar2 = hvaVar4.p;
            jva jvaVar2 = hvaVar4.q;
            int i32 = jvaVar2.a;
            o31 o31Var2 = hvaVar4.e;
            k47 k47Var22 = hvaVar4.b;
            if (hvaVar4.i) {
            }
            boolean z42 = e21.a;
            hva hvaVar52 = this.B;
            hvaVar52.n = l;
            return hvaVar52;
        }
        z3 = true;
        fva fvaVar22 = hvaVar4.p;
        jva jvaVar22 = hvaVar4.q;
        int i322 = jvaVar22.a;
        o31 o31Var22 = hvaVar4.e;
        k47 k47Var222 = hvaVar4.b;
        if (hvaVar4.i) {
        }
        boolean z422 = e21.a;
        hva hvaVar522 = this.B;
        hvaVar522.n = l;
        return hvaVar522;
    }

    public final void d(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, jac jacVar, TLRPC.InputPeer inputPeer) {
        int i = this.a;
        if (activity == null) {
            return;
        }
        if (!oc7.r1(i).c5()) {
            d Q = LaunchActivity.Q();
            if (Q == null || Q.getContext() == null) {
                c0(activity, null);
                return;
            } else {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            }
        }
        boolean z = oc7.r1(this.a).l4.l0.f && inputPeer != null;
        if ((!e21.b() && cj0.h().j()) || z) {
            if (!cj0.h().j()) {
                jacVar.a(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            i5 i5Var = new i5();
            i5Var.b = "inapp";
            i5Var.a = tL_starsTopupOption.store_product;
            zy8 a = i5Var.a();
            fc4.b("StarsController.buy starts queryProductDetails");
            cj0.h().o(Arrays.asList(a), new lu((Object) jacVar, (Object) tL_inputStorePaymentStarsTopup, (Object) tL_starsTopupOption, (Object) activity, (byte) 22));
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
        JSONObject u = wx0.u(F(), false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getPaymentForm, new fm8((Object) this, (Object) jacVar, (Object) tL_inputInvoiceStars, (byte) 17));
    }

    public final void d0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k47 k47Var = (k47) list.get(0);
        long B0 = k47.B0(k47Var.k);
        int i = this.a;
        if (B0 >= 0) {
            oc7.r1(i).b3(oc7.r1(i).W1(Long.valueOf(B0)), 0, true, null);
        } else {
            oc7.r1(i).a3(0, -B0, true);
        }
        c41.b0(LaunchActivity.S()).Q(R.raw.error, 36, nxa.T0(TextUtils.concat(jb6.G((int) k47Var.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", jb6.G((int) k47Var.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
    }

    public final void e(final long j, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final jac jacVar) {
        int i;
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final ylb F = F();
        boolean z = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                o(new r97((Object) this, (Object) jacVar, j, (Object) tLObject, (Object) tL_textWithEntities, (byte) 17));
                return;
            }
            if (z) {
                i = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String k = pg3.k(this.a, j);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = oc7.r1(this.a).n1(j);
            tL_inputInvoicePremiumGiftStars.months = i;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = wx0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: vta
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final jva jvaVar = jva.this;
                    final jac jacVar2 = jacVar;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final ylb ylbVar = F;
                    final String str = k;
                    final long j2 = j;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    gm.c3(new Runnable() { // from class: aua
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z2 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            final jac jacVar3 = jacVar2;
                            if (!z2) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                jva.c(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                jacVar3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i2 = 0;
                            final long j3 = 0;
                            while (i2 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i2);
                                i2++;
                                j3 += tL_labeledPrice.amount;
                            }
                            final jva jvaVar2 = jva.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jvaVar2.a);
                            final Context context4 = context3;
                            final ylb ylbVar2 = ylbVar;
                            final String str2 = str;
                            final long j4 = j2;
                            final TLObject tLObject5 = tLObject3;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: fua
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject6, final TLRPC.TL_error tL_error3) {
                                    final jva jvaVar3 = jva.this;
                                    final jac jacVar4 = jacVar3;
                                    final Context context5 = context4;
                                    final ylb ylbVar3 = ylbVar2;
                                    final long j5 = j3;
                                    final String str3 = str2;
                                    final long j6 = j4;
                                    final TLObject tLObject7 = tLObject5;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    gm.c3(new Runnable() { // from class: lua
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            v16 v16Var;
                                            int i3;
                                            jva jvaVar4 = jva.this;
                                            TLObject tLObject8 = tLObject6;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            jac jacVar5 = jacVar4;
                                            Context context6 = context5;
                                            ylb ylbVar4 = ylbVar3;
                                            long j7 = j5;
                                            String str4 = str3;
                                            long j8 = j6;
                                            TLObject tLObject9 = tLObject7;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            d Q = LaunchActivity.Q();
                                            c41 Y = (Q == null || Q.visibleDialog != null) ? c41.Y() : c41.b0(Q);
                                            if (!(tLObject8 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 == null) {
                                                    i3 = 1;
                                                } else {
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!oc7.r1(jvaVar4.a).c5()) {
                                                            jacVar5.a(Boolean.FALSE, null);
                                                            jva.c0(context6, ylbVar4);
                                                            return;
                                                        } else {
                                                            boolean[] zArr = {false};
                                                            dxa dxaVar = new dxa(context6, ylbVar4, j7, 6, str4, new om1((Object) jvaVar4, (Object) zArr, j8, (Object) tLObject9, (Object) tL_textWithEntities5, (Object) jacVar5, (byte) 4), 0L);
                                                            dxaVar.setOnDismissListener(new eua((byte) 1, jacVar5, zArr));
                                                            dxaVar.show();
                                                            return;
                                                        }
                                                    }
                                                    i3 = 1;
                                                    if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        jacVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                        return;
                                                    }
                                                }
                                                jacVar5.a(Boolean.FALSE, null);
                                                Object[] objArr = new Object[i3];
                                                objArr[0] = tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS";
                                                Y.Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, objArr)).j();
                                                return;
                                            }
                                            Utilities.d.c(new dua(jvaVar4, (TLRPC.TL_payments_paymentResult) tLObject8, (byte) 3));
                                            jvaVar4.P(true);
                                            jacVar5.a(Boolean.TRUE, null);
                                            mk0 b = ok0.a(jvaVar4.a).b();
                                            if (b != null && b.a(j8)) {
                                                oc7.r1(jvaVar4.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                            }
                                            oc7.r1(jvaVar4.a).X3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity == null || (v16Var = launchActivity.w0) == null) {
                                                return;
                                            }
                                            v16Var.c(true);
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

    public final void e0(LaunchActivity launchActivity, long j, String str) {
        if (this.e) {
            f0(launchActivity, j, str);
        } else {
            o(new nz8((Object) this, (Object) launchActivity, j, (Object) str, (byte) 8));
        }
    }

    public final void f(final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z, final jac jacVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final ylb F = F();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            o(new st0(this, jacVar, tL_payments_paymentFormStarGift, starGift, j, tL_textWithEntities, z));
            return;
        }
        final String k = pg3.k(this.a, j);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = oc7.r1(this.a).i1(j);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = wx0.u(F, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 += arrayList.get(i).amount;
            context2 = context2;
        }
        final long j3 = j2;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: cua
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final jva jvaVar = jva.this;
                final jac jacVar2 = jacVar;
                final Context context3 = context2;
                final ylb ylbVar = F;
                final long j4 = j3;
                final String str = k;
                final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = tL_payments_paymentFormStarGift;
                final TL_stars.StarGift starGift2 = starGift;
                final long j5 = j;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                final boolean z2 = z;
                gm.c3(new Runnable() { // from class: hua
                    @Override // java.lang.Runnable
                    public final void run() {
                        v16 v16Var;
                        final jva jvaVar2 = jva.this;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final jac jacVar3 = jacVar2;
                        Context context4 = context3;
                        ylb ylbVar2 = ylbVar;
                        long j6 = j4;
                        String str2 = str;
                        final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift3 = tL_payments_paymentFormStarGift2;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final long j7 = j5;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        final boolean z3 = z2;
                        d Q = LaunchActivity.Q();
                        c41 Y = (Q == null || Q.visibleDialog != null) ? c41.Y() : c41.b0(Q);
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null) {
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!oc7.r1(jvaVar2.a).c5()) {
                                        jacVar3.a(Boolean.FALSE, null);
                                        jva.c0(context4, ylbVar2);
                                        return;
                                    } else {
                                        final boolean[] zArr = {false};
                                        dxa dxaVar = new dxa(context4, ylbVar2, j6, 6, str2, new Runnable() { // from class: oua
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zArr[0] = true;
                                                jva.this.f(tL_payments_paymentFormStarGift3, starGift3, j7, tL_textWithEntities3, z3, jacVar3);
                                            }
                                        }, 0L);
                                        dxaVar.setOnDismissListener(new eua((byte) 2, jacVar3, zArr));
                                        dxaVar.show();
                                        return;
                                    }
                                }
                                if ("STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                                    jacVar3.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                    return;
                                }
                            }
                            jacVar3.a(Boolean.FALSE, null);
                            Y.Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                            return;
                        }
                        Utilities.d.c(new dua(jvaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, (byte) 4));
                        jvaVar2.D = false;
                        jvaVar2.E = true;
                        jvaVar2.G = 0L;
                        jvaVar2.T();
                        jvaVar2.M(j7);
                        jvaVar2.P(true);
                        jacVar3.a(Boolean.TRUE, null);
                        mk0 b = ok0.a(jvaVar2.a).b();
                        if (b != null && b.a(j7)) {
                            oc7.r1(jvaVar2.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j7, false).apply();
                        }
                        oc7.r1(jvaVar2.a).X3.edit().putBoolean("show_gift_for_" + j7, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j7, true).apply();
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity == null || (v16Var = launchActivity.w0) == null) {
                            return;
                        }
                        v16Var.c(true);
                    }
                });
            }
        });
    }

    public final void f0(LaunchActivity launchActivity, long j, String str) {
        if (m().amount < j && j > 0) {
            new dxa(launchActivity, null, j, 4, str, new jd((byte) 10), 0L).show();
            return;
        }
        d S2 = LaunchActivity.S();
        if (S2 == null) {
            return;
        }
        u31 K = c41.b0(S2).K(R.raw.stars_topup, jb6.M0(2131744653, null), jb6.M0(2131744652, null), new bo6((byte) 29));
        K.j = 5000;
        K.k(true);
    }

    public final void g(final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final y2a y2aVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final ylb F = F();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            o(new Runnable() { // from class: nta
                @Override // java.lang.Runnable
                public final void run() {
                    jva jvaVar = jva.this;
                    boolean z3 = jvaVar.e;
                    y2a y2aVar2 = y2aVar;
                    if (z3) {
                        jvaVar.g(starGift, z, z2, j, tL_textWithEntities, y2aVar2);
                    } else {
                        jva.c("NO_BALANCE");
                        y2aVar2.a(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String k = pg3.k(this.a, j);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z;
        tL_inputInvoiceStarGift.peer = oc7.r1(this.a).i1(j);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z2;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = wx0.u(F, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: ota
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final jva jvaVar = jva.this;
                final y2a y2aVar2 = y2aVar;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final ylb ylbVar = F;
                final String str = k;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z3 = z;
                final boolean z4 = z2;
                final long j2 = j;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                gm.c3(new Runnable() { // from class: bua
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z5 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final y2a y2aVar3 = y2aVar2;
                        if (!z5) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            jva.c(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            y2aVar3.a(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                        int size = arrayList.size();
                        int i = 0;
                        final long j3 = 0;
                        while (i < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                            i++;
                            j3 += tL_labeledPrice.amount;
                        }
                        final jva jvaVar2 = jva.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jvaVar2.a);
                        final Context context4 = context3;
                        final ylb ylbVar2 = ylbVar;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z6 = z3;
                        final boolean z7 = z4;
                        final long j4 = j2;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: gua
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final jva jvaVar3 = jva.this;
                                final y2a y2aVar4 = y2aVar3;
                                final Context context5 = context4;
                                final ylb ylbVar3 = ylbVar2;
                                final long j5 = j3;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z8 = z6;
                                final boolean z9 = z7;
                                final long j6 = j4;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                gm.c3(new Runnable() { // from class: sta
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r10v6 */
                                    /* JADX WARN: Type inference failed for: r10v7, types: [boolean] */
                                    /* JADX WARN: Type inference failed for: r10v8 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str4;
                                        SpannableStringBuilder spannableStringBuilder;
                                        v16 v16Var;
                                        ?? r10;
                                        jva jvaVar4 = jva.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        y2a y2aVar5 = y2aVar4;
                                        Context context6 = context5;
                                        ylb ylbVar4 = ylbVar3;
                                        long j7 = j5;
                                        String str5 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z10 = z8;
                                        boolean z11 = z9;
                                        long j8 = j6;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        d Q = LaunchActivity.Q();
                                        c41 Y = (Q == null || Q.visibleDialog != null) ? c41.Y() : c41.b0(Q);
                                        if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                            if (tL_error4 != null) {
                                                if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (!oc7.r1(jvaVar4.a).c5()) {
                                                        y2aVar5.a(Boolean.FALSE, null);
                                                        jva.c0(context6, ylbVar4);
                                                        return;
                                                    } else {
                                                        boolean[] zArr = {false};
                                                        dxa dxaVar = new dxa(context6, ylbVar4, j7, 6, str5, new iua(jvaVar4, zArr, starGift5, z10, z11, j8, tL_textWithEntities5, y2aVar5), 0L);
                                                        dxaVar.setOnDismissListener(new dg(y2aVar5, zArr, (byte) 16));
                                                        dxaVar.show();
                                                        return;
                                                    }
                                                }
                                                if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    y2aVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if ("STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    y2aVar5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                }
                                            }
                                            y2aVar5.a(Boolean.FALSE, null);
                                            Y.Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS")).j();
                                            return;
                                        }
                                        Utilities.d.c(new dua(jvaVar4, (TLRPC.TL_payments_paymentResult) tLObject4, (byte) 2));
                                        jvaVar4.D = false;
                                        jvaVar4.E = true;
                                        jvaVar4.G = 0L;
                                        jvaVar4.T();
                                        jvaVar4.M(j8);
                                        jvaVar4.P(true);
                                        y2aVar5.a(Boolean.TRUE, null);
                                        mk0 b = ok0.a(jvaVar4.a).b();
                                        if (b != null && b.a(j8)) {
                                            oc7.r1(jvaVar4.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            str4 = str5;
                                            spannableStringBuilder = null;
                                        } else {
                                            int i2 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i2;
                                            spannableStringBuilder = gm.S2(jb6.H(',', "Gift2SentRemainsLimit", Math.max(0, i2)));
                                            str4 = str5;
                                        }
                                        if (j8 < 0) {
                                            long j9 = -j8;
                                            TLRPC.ChatFull M0 = oc7.r1(jvaVar4.a).M0(j9);
                                            if (M0 != null) {
                                                M0.stargifts_count++;
                                                M0.flags2 |= 262144;
                                                oc7.r1(jvaVar4.a).W3(M0);
                                            }
                                            if (Q instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) Q;
                                                if (profileActivity.a() == j8) {
                                                    wp8 wp8Var = profileActivity.O;
                                                    if (wp8Var != null) {
                                                        wp8Var.N1(true);
                                                        profileActivity.O.f1(14);
                                                        r10 = 0;
                                                        profileActivity.n3(false);
                                                    } else {
                                                        r10 = 0;
                                                    }
                                                    c41 b0 = c41.b0(Q);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String M02 = jb6.M0(2131744798, null);
                                                    if (spannableStringBuilder == null) {
                                                        Object[] objArr = new Object[1];
                                                        objArr[r10] = str4;
                                                        spannableStringBuilder = gm.S2(jb6.G((int) j7, "StarsGiftCompletedChannelText", objArr));
                                                    }
                                                    b0.s(document, M02, spannableStringBuilder).k(r10);
                                                }
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", j9);
                                            bundle.putBoolean("open_gifts", true);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                            profileActivity2.whenFullyVisible(new r97((Object) profileActivity2, (Object) starGift5, (Object) spannableStringBuilder, j7, (Object) str4, (byte) 18));
                                            Q.presentFragment(profileActivity2);
                                        } else if ((Q instanceof yv1) && ((yv1) Q).a() == j8) {
                                            c41 b02 = c41.b0(Q);
                                            TLRPC.Document document2 = starGift5.sticker;
                                            String M03 = jb6.M0(2131744798, null);
                                            if (spannableStringBuilder == null) {
                                                spannableStringBuilder = gm.S2(jb6.G((int) j7, "StarsGiftCompletedText", new Object[0]));
                                            }
                                            b02.s(document2, M03, spannableStringBuilder).k(true);
                                        } else {
                                            nm7 f = nm7.f(jvaVar4.a);
                                            int i3 = nm7.u;
                                            Long valueOf = Long.valueOf(j8);
                                            Boolean bool = Boolean.FALSE;
                                            f.k(i3, valueOf, bool);
                                            nm7.f(jvaVar4.a).k(nm7.t, Long.valueOf(j8), bool);
                                            yv1 ga = yv1.ga(j8);
                                            ga.whenFullyVisible(new nz8((Object) ga, (Object) starGift5, (Object) spannableStringBuilder, j7, (byte) 7));
                                            Q.presentFragment(ga);
                                        }
                                        oc7.r1(jvaVar4.a).X3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || (v16Var = launchActivity.w0) == null) {
                                            return;
                                        }
                                        v16Var.c(true);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public final void g0(final long j, final long j2, boolean z, final boolean z2) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i = this.a;
        togglenopaidmessagesexception.user_id = oc7.r1(i).n1(j);
        if (j2 != 0) {
            togglenopaidmessagesexception.parent_peer = oc7.r1(i).i1(j2);
        }
        togglenopaidmessagesexception.refund_charged = z;
        togglenopaidmessagesexception.require_payment = !z2;
        ConnectionsManager.getInstance(i).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: mua
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gm.c3(new od7(jva.this, tLObject, j2, j, z2));
            }
        });
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, jac jacVar) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        Context context2 = context;
        ylb F = F();
        long j = chatInvite.subscription_pricing.amount;
        if (context2 != null) {
            int i = z8c.t0;
            byte b = 0;
            boolean[] zArr = {false};
            uua uuaVar = new uua(this, j, i, zArr, jacVar, context2, F, chatInvite, str);
            e6a e6aVar = new e6a(this, zArr, jacVar);
            my0 h = hg9.h(1, F, context2, false);
            LinearLayout i2 = hg9.i(context2, 1);
            i2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(8.0f));
            FrameLayout frameLayout = new FrameLayout(context2);
            frameLayout.addView(new uwa(context2, 40, 0), qoe.c(-1.0f, -1));
            bf0 bf0Var = new bf0(context2);
            bf0Var.setRoundRadius(gm.L(80.0f));
            pc0 pc0Var = new pc0((ylb) null);
            pc0Var.r(chatInvite.color);
            String str2 = chatInvite.title;
            pc0Var.A = true;
            pc0Var.n = (byte) 0;
            pc0Var.m = false;
            pc0.a(str2, null, null, pc0Var.q);
            TLRPC.Photo photo = chatInvite.photo;
            if (photo != null) {
                bf0Var.m(gn5.i(bc4.w(photo.sizes, gm.L(80.0f), false, null, false), chatInvite.photo), "80_80", pc0Var, chatInvite);
            } else {
                bf0Var.setImageDrawable(pc0Var);
            }
            frameLayout.addView(bf0Var, qoe.e(80, 80, 17));
            Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
            int i3 = cmb.g5;
            anb.x(frameLayout, drawable, i3, F, PorterDuff.Mode.SRC_IN);
            Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            frameLayout.addView(imageView, qoe.e(26, 26, 17));
            imageView.setTranslationX(gm.L(26.0f));
            imageView.setTranslationY(gm.L(26.0f));
            imageView.setScaleX(1.2f);
            imageView.setScaleY(1.2f);
            ImageView imageView2 = new ImageView(context2);
            imageView2.setImageDrawable(drawable2);
            frameLayout.addView(imageView2, qoe.e(26, 26, 17));
            imageView2.setTranslationX(gm.L(26.0f));
            imageView2.setTranslationY(gm.L(26.0f));
            cxa cxaVar = new cxa(i, F, context2);
            rve.a(cxaVar);
            cxaVar.setOnClickListener(new jwa(cxaVar, b));
            frameLayout.addView(cxaVar, qoe.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
            i2.addView(frameLayout, qoe.r(-1, nm7.B1, 7));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(gm.o());
            int i4 = cmb.i5;
            wi8.x(textView, i4, F, null, 2131744701);
            textView.setGravity(17);
            TextView m = wi8.m(i2, textView, qoe.t(-2, -2, 1, 0, 8, 0, 0), context2);
            m.setTextSize(1, 14.0f);
            anb.X(m, i4, F);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
            int i5 = tL_starsSubscriptionPricing.period;
            if (i5 == 2592000) {
                m.setText(gm.S2(jb6.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
            } else {
                m.setText(gm.S2(jb6.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, i5 == 300 ? "5 minutes" : "a minute")));
            }
            m.setMaxWidth(hg5.a(m.getText(), m.getPaint()));
            m.setGravity(17);
            i2.addView(m, qoe.t(-2, -2, 1, 0, 6, 0, 22));
            if (!TextUtils.isEmpty(chatInvite.about)) {
                TextView textView2 = new TextView(context2);
                textView2.setTextSize(1, 14.0f);
                anb.X(textView2, i4, F);
                textView2.setText(gw3.m(chatInvite.about, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setGravity(17);
                i2.addView(textView2, qoe.t(-2, -2, 1, 0, 6, 0, 22));
            }
            b61 b61Var = new b61(F, context2, true);
            b61Var.i(jb6.M0(2131744710, null), false, true);
            i2.addView(b61Var, qoe.o(-1, 48));
            l66 l66Var = new l66(context2, F);
            l66Var.setText(gm.N2(jb6.M0(2131744709, null), -1, 0, new dh1(context2, (byte) 19), null));
            l66Var.setGravity(17);
            l66Var.setTextSize(1, 13.0f);
            anb.X(l66Var, cmb.A6, F);
            anb.G(l66Var, cmb.Wc, F);
            i2.addView(l66Var, qoe.t(-1, -2, 49, 14, 14, 14, 6));
            h.O = i2;
            b61Var.setOnClickListener(new jw4(uuaVar, h, b61Var, (byte) 21));
            h.setOnDismissListener(new qj8(e6aVar, (byte) 8));
            h.L(i3);
            d S2 = LaunchActivity.S();
            if (!gm.O1() && S2 != null && !gm.s1(S2)) {
                h.X(S2);
            }
            h.show();
        }
    }

    public final void i0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f.equals(starsAmount);
        int i = nm7.A3;
        int i2 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            nm7.f(i2).k(i, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            nm7.f(i2).k(i, new Object[0]);
        }
    }

    public final void j0(final k47 k47Var, final long j, final Runnable runnable, final boolean z) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (k47Var == null) {
            runnable.run();
            return;
        }
        final long B0 = k47.B0(k47Var.k);
        final int e1 = k47Var.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) k47Var.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i = this.a;
        tL_messages_editMessage.peer = oc7.r1(i).i1(B0);
        int i2 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i2;
        tL_messages_editMessage.schedule_date = k47Var.k.date;
        tL_messages_editMessage.id = e1;
        tL_messages_editMessage.flags = i2 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j;
        int i3 = 0;
        while (i3 < tL_messageMediaPaidMedia2.extended_media.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i3);
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
            i3++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: qua
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gm.c3(new yc7(jva.this, tLObject, runnable, tL_error, z, B0, e1, k47Var, j));
            }
        });
    }

    public final TL_stars.SavedStarGift k(long j) {
        TL_stars.StarGift starGift;
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i >= longSparseArray.size()) {
                return null;
            }
            ava avaVar = (ava) longSparseArray.valueAt(i);
            for (int i2 = 0; i2 < avaVar.l.size(); i2++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) avaVar.l.get(i2);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.id == j) {
                    return savedStarGift;
                }
            }
            i++;
        }
    }

    public final TL_stars.StarsAmount m() {
        return n(null, true, false);
    }

    public final TL_stars.StarsAmount n(Runnable runnable, boolean z, boolean z2) {
        if (((!this.e || System.currentTimeMillis() - this.c > 60000) && !this.d) || z2) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new ara(this, runnable, (byte) 2));
        }
        if (!z || this.g <= 0) {
            return this.f;
        }
        nk n = nk.n(this.f);
        return nk.h(Math.max(0L, n.a() - this.g), n.a).q();
    }

    public final void o(Runnable runnable) {
        n(runnable, true, false);
    }

    public final nk p() {
        nk m = nk.m(m());
        if (m == null) {
            return nk.j(0L, this.b ? ok.b : ok.a);
        }
        return m;
    }

    public final ArrayList r() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new jua(this, (byte) 3));
        return this.m;
    }

    public final ArrayList s() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new jua(this, (byte) 4));
        return this.p;
    }

    public final ArrayList w() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new jua(this, (byte) 2));
        return this.j;
    }

    public final long x(k47 k47Var) {
        Long l;
        hva hvaVar = this.B;
        if (hvaVar != null && hvaVar.a.equals(cva.b(k47Var)) && (l = this.B.n) != null) {
            return l.longValue();
        }
        Long z1 = k47Var == null ? null : k47Var.z1();
        if (z1 != null) {
            return z1.longValue();
        }
        Long w1 = oc7.r1(this.a).w1();
        if (w1 != null) {
            return w1.longValue();
        }
        return 0L;
    }

    public final long y(cva cvaVar, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l;
        hva hvaVar = this.B;
        if (hvaVar != null && hvaVar.a.equals(cvaVar) && (l = this.B.n) != null) {
            return l.longValue();
        }
        Long l2 = null;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                TLRPC.MessageReactor messageReactor = arrayList.get(i);
                i++;
                TLRPC.MessageReactor messageReactor2 = messageReactor;
                if (messageReactor2 != null && messageReactor2.my) {
                    if (messageReactor2.anonymous) {
                        l2 = 2666000L;
                        break;
                    }
                    TLRPC.Peer peer = messageReactor2.peer_id;
                    if (peer != null) {
                        l2 = Long.valueOf(pg3.n(peer));
                        break;
                    }
                }
            }
        }
        if (l2 != null) {
            return l2.longValue();
        }
        Long w1 = oc7.r1(this.a).w1();
        if (w1 != null) {
            return w1.longValue();
        }
        return 0L;
    }

    public final void z(long j, long j2, qac qacVar) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i = this.a;
        getpaidmessagesrevenue.user_id = oc7.r1(i).n1(j);
        if (j2 != 0) {
            getpaidmessagesrevenue.parent_peer = oc7.r1(i).i1(j2);
        }
        ConnectionsManager.getInstance(i).sendRequest(getpaidmessagesrevenue, new th1(qacVar, (byte) 2));
    }
}
