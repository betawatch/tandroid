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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gta {
    public static volatile gta[][] S = (gta[][]) Array.newInstance((Class<?>) gta.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public eta B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public bta N;
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

    public gta(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static wjb F() {
        d S2 = LaunchActivity.S();
        if (S2 != null) {
            return S2.getResourceProvider();
        }
        return null;
    }

    public static gta I(int i) {
        return v(i, true);
    }

    public static boolean Q(int i, nj njVar) {
        return njVar == null || u(i, njVar.a).p().b >= njVar.b;
    }

    public static void c(String str) {
        d Q = LaunchActivity.Q();
        ((Q == null || Q.visibleDialog != null) ? u21.Y() : u21.b0(Q)).Q(R.raw.error, 36, u21.W(str)).j();
    }

    public static void c0(Context context, wjb wjbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(2131744823, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131744824, null);
        b00.t(null, 2131747638, alertDialog$Builder, null);
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

    public static gta t(int i) {
        return v(i, false);
    }

    public static gta u(int i, oj ojVar) {
        return v(i, ojVar == oj.b);
    }

    public static gta v(int i, boolean z) {
        gta gtaVar;
        gta gtaVar2 = S[z ? 1 : 0][i];
        if (gtaVar2 != null) {
            return gtaVar2;
        }
        synchronized (T[z ? 1 : 0][i]) {
            gtaVar = S[z ? 1 : 0][i];
            if (gtaVar == null) {
                gta[] gtaVarArr = S[z ? 1 : 0];
                gta gtaVar3 = new gta(i, z);
                gtaVarArr[i] = gtaVar3;
                gtaVar = gtaVar3;
            }
        }
        return gtaVar;
    }

    public final long A(int i, long j) {
        eta etaVar = this.B;
        if (etaVar == null) {
            return 0L;
        }
        zsa zsaVar = etaVar.a;
        if (zsaVar.a == j && zsaVar.b == i && etaVar.l) {
            return etaVar.h;
        }
        return 0L;
    }

    public final long B(k27 k27Var) {
        TLRPC.Message message;
        if (k27Var == null || (message = k27Var.k) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || k27Var.k3()) && k27Var.k.fwd_from != null) ? A(k27Var.k.fwd_from.saved_from_msg_id, k27Var.Z0()) : A(k27Var.e1(), k27.B0(k27Var.k));
    }

    public final wsa C(long j, boolean z) {
        LongSparseArray longSparseArray = this.K;
        wsa wsaVar = (wsa) longSparseArray.get(j);
        if (wsaVar != null || !z) {
            return wsaVar;
        }
        wsa wsaVar2 = new wsa(this.a, j);
        longSparseArray.put(j, wsaVar2);
        return wsaVar2;
    }

    public final xsa D(long j, boolean z) {
        LongSparseArray longSparseArray = this.L;
        xsa xsaVar = (xsa) longSparseArray.get(j);
        if (xsaVar != null || !z) {
            return xsaVar;
        }
        xsa xsaVar2 = new xsa(this.a, j, true);
        longSparseArray.put(j, xsaVar2);
        return xsaVar2;
    }

    public final void E(TL_stars.StarGift starGift, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, p8c p8cVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        wjb F = F();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            o(new ms0(this, p8cVar, starGift, j, tL_textWithEntities, z, (byte) 7));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = na7.q1(this.a).h1(j);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        byte b = 1;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = ow0.u(F, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new apa(this, p8cVar, b));
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

    public final void H(long j, p8c p8cVar) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j));
        if (stargiftupgradepreview != null) {
            p8cVar.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new w47((Object) this, j, (Object) p8cVar, (byte) 16));
    }

    public final void J(TL_stars.InputSavedStarGift inputSavedStarGift, p8c p8cVar) {
        hd hdVar = new hd(3, null, a.b);
        hdVar.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new rt0((Object) this, (Object) hdVar, (Object) inputSavedStarGift, (Object) p8cVar, (byte) 22));
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
        xsa D = D(j, false);
        if (D != null) {
            D.k(false);
        }
        wsa wsaVar = (wsa) this.K.get(j);
        if (wsaVar != null) {
            wsaVar.g();
        }
    }

    public final void N(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j = userFull.id;
            xsa D = D(j, false);
            if (D != null && D.n != userFull.stargifts_count) {
                D.k(false);
            }
            wsa wsaVar = (wsa) this.K.get(j);
            if (wsaVar != null) {
                wsaVar.g();
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
        na7.q1(i).b4(arrayList2, true);
        na7.q1(i).V3(arrayList3, true);
        this.E = true;
        ArrayList arrayList4 = this.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = this.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new mm((byte) 14)), new mm((byte) 15)));
        ArrayList arrayList6 = this.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new mm((byte) 16)));
        this.F = num.intValue();
        this.G = l.longValue();
        this.C = false;
        kk7.f(i).k(kk7.G3, new Object[0]);
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
                ad7 Y = ad7.Y(i);
                Y.a.c(new lb7(Y, arrayList, i2, currentTimeMillis));
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        na7.q1(i).b4(tL_starGifts.users, false);
        na7.q1(i).V3(tL_starGifts.chats, false);
        ad7.Y(i).j1(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList.clear();
        arrayList.addAll(tL_starGifts.gifts);
        ArrayList arrayList2 = this.J;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new mm((byte) 17)), new mm((byte) 18)));
        ArrayList arrayList3 = this.I;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        Collections.sort(arrayList3, Comparator$-CC.comparingInt(new mm((byte) 19)));
        this.F = tL_starGifts.hash;
        this.G = System.currentTimeMillis();
        kk7.f(i).k(kk7.G3, new Object[0]);
        ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
        int i3 = this.F;
        long j = this.G;
        ad7 Y2 = ad7.Y(i);
        Y2.a.c(new lb7(Y2, arrayList4, i3, j));
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
                ae9 ae9Var = new ae9(this, (byte) 10);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i2;
                ConnectionsManager.getInstance(i).sendRequest(getstargifts, new wx9(ae9Var, (byte) 2));
                return;
            }
            wh9 wh9Var = new wh9(this, (byte) 23);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ad7 Y = ad7.Y(i);
            Y.a.c(new ex7((Object) Y, (Object) arrayList3, (Object) arrayList2, (Object) arrayList, (Object) wh9Var, (byte) 26));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new hsa(this, (byte) 1));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new l12(this, i, (byte) 6));
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
    public final void W(k27 k27Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, p8c p8cVar) {
        long j;
        boolean z;
        long j2;
        String str;
        boolean z2;
        fx0 fx0Var;
        q79 q79Var;
        qsa qsaVar;
        k27 k27Var2;
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
        TLRPC.User V1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        int[] iArr;
        String M0;
        ViewGroup viewGroup2;
        TLRPC.Message message2;
        int i5;
        int i6;
        ViewGroup viewGroup3;
        rua ruaVar;
        ViewGroup viewGroup4;
        gl5 gl5Var;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        na7.q1(this.a).b4(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        Context context2 = context;
        wjb F = F();
        if (context2 != null) {
            if (!this.e) {
                o(new foa(this, runnable, k27Var, inputInvoice, tL_payments_paymentFormStars, p8cVar, (byte) 5));
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
            if (k27Var == null || k27Var.D != 29) {
                j = tL_payments_paymentFormStars.bot_id;
            } else {
                TLRPC.Message message3 = k27Var.k;
                TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
                j = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? k27.B0(message3) : cf3.n(peer2);
            }
            long j4 = j;
            int i8 = this.a;
            if (j4 >= 0) {
                TLRPC.User V12 = na7.q1(i8).V1(Long.valueOf(j4));
                String r = l7c.r(V12);
                z2 = !l7c.v(V12);
                str = r;
                z = false;
                j2 = j3;
            } else {
                na7 q1 = na7.q1(i8);
                z = false;
                j2 = j3;
                TLRPC.Chat K0 = q1.K0(Long.valueOf(-j4));
                str = K0 == null ? "" : K0.title;
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
            qsa qsaVar2 = new qsa(this, j5, zArr, p8cVar, context2, F, z2, str, k27Var, inputInvoice, tL_payments_paymentFormStars, i9, j4);
            q79 q79Var2 = new q79(this, zArr, p8cVar);
            fx0 h = de9.h(1, F, context2, false);
            TLRPC.User V13 = na7.q1(i10).V1(Long.valueOf(j4));
            LinearLayout j6 = de9.j(context2, 1);
            j6.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(8.0f));
            ViewGroup frameLayout = new FrameLayout(context2);
            frameLayout.addView(new qua(context2, 40, 0), nme.c(-1.0f, -1));
            if (k27Var == null || (message2 = k27Var.k) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                fx0Var = h;
                q79Var = q79Var2;
                qsaVar = qsaVar2;
                k27Var2 = k27Var;
                i = i9;
                f = 20.0f;
                ViewGroup viewGroup5 = frameLayout;
                if (webDocument != null) {
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    be0 be0Var = new be0(context2);
                    be0Var.setRoundRadius(gl.L(18.0f));
                    be0Var.p(gl5.p(usc.c(webDocument)), "80_80", null, null);
                    frameLayout2.addView(be0Var, nme.e(80, 80, 48));
                    viewGroup5.addView(frameLayout2, nme.e(80, 87, 17));
                    TextView textView = new TextView(context2);
                    textView.setTypeface(gl.n1("fonts/num.otf"));
                    r2 = 1;
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(-1);
                    textView.setText(jva.T0("XTR ".concat(k96.E((int) j5, ',')), 0.85f, null));
                    textView.setPadding(gl.L(5.33f), 0, gl.L(5.33f), 0);
                    textView.setBackground(bkb.b0(gl.L(16.0f), -1133566));
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    int L = gl.L(20.0f);
                    int i11 = bkb.g5;
                    ShapeDrawable b0 = bkb.b0(L, bkb.v0(i11, F));
                    vkb M = zkb.M(i11);
                    frameLayout3.setBackground(b0);
                    zkb.j(frameLayout3, b0, M, null, F);
                    frameLayout3.setPadding(gl.L(1.33f), gl.L(1.33f), gl.L(1.33f), gl.L(1.33f));
                    frameLayout3.addView(textView, nme.r(-2, 16, kk7.D1));
                    frameLayout2.addView(frameLayout3, nme.a(-2.0f, 18.66f, 81));
                    viewGroup = viewGroup5;
                    yua yuaVar = new yua(i10, F, context2);
                    ote.a(yuaVar);
                    yuaVar.setOnClickListener(new fua(yuaVar, r2));
                    viewGroup.addView(yuaVar, nme.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                    j6.addView(viewGroup, nme.r(-1, kk7.B1, 7));
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(r2, f);
                    textView2.setTypeface(gl.o());
                    int i12 = bkb.i5;
                    zkb.X(textView2, i12, F);
                    if (i <= 0) {
                        if (webDocument != null) {
                            M0 = str4;
                            iArr = null;
                        } else {
                            iArr = null;
                            M0 = k96.M0(2131744878, null);
                        }
                        textView2.setText(vu3.m(M0, textView2.getPaint().getFontMetricsInt(), false, iArr, 0));
                    } else {
                        textView2.setText(vu3.m(webDocument != null ? str4 : k96.M0(2131744885, null), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    }
                    kk7.i(textView2);
                    textView2.setGravity(17);
                    j6.addView(textView2, nme.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                    if (webDocument != null) {
                        LinearLayout j7 = de9.j(context2, 0);
                        int L2 = gl.L(28.0f);
                        int i13 = bkb.Z6;
                        Drawable b02 = bkb.b0(L2, bkb.v0(i13, F));
                        vkb M2 = zkb.M(i13);
                        j7.setBackground(b02);
                        zkb.j(j7, b02, M2, null, F);
                        be0 be0Var2 = new be0(context2);
                        be0Var2.setRoundRadius(gl.L(14.0f));
                        pb0 pb0Var = new pb0((wjb) null);
                        pb0Var.q(V13);
                        be0Var2.f(V13, pb0Var);
                        j7.addView(be0Var2, nme.o(28, 28));
                        TextView textView3 = new TextView(context2);
                        textView3.setTextSize(r2, 13.0f);
                        zkb.X(textView3, bkb.F6, F);
                        textView3.setText(l7c.r(V13));
                        j7.addView(textView3, nme.t(-2, -2, 16, 6, 0, 10, 0));
                        j6.addView(j7, nme.t(-2, 28, 1, 0, 8, 0, 2));
                    }
                    TextView textView4 = new TextView(context2);
                    textView4.setTextSize(r2, 14.0f);
                    zkb.X(textView4, i12, F);
                    if (k27Var2 == null && (message = k27Var2.k) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                        long B0 = k27.B0(message);
                        TLRPC.Message message4 = k27Var2.k;
                        if (message4 != null && (messageFwdHeader = message4.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                            B0 = cf3.n(peer);
                        }
                        if (B0 < 0 && k27Var2.Z0() > 0 && (V1 = na7.q1(i10).V1(Long.valueOf(k27Var2.Z0()))) != null && V1.bot) {
                            B0 = V1.id;
                        }
                        if (B0 >= 0) {
                            TLRPC.User V14 = na7.q1(i10).V1(Long.valueOf(B0));
                            str2 = l7c.r(V14);
                            if (V14 != null && V14.bot) {
                                z3 = r2;
                                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) k27Var2.k.media;
                                i3 = 0;
                                int i14 = 0;
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
                                        i14++;
                                    }
                                }
                                if (i3 != 0) {
                                    str3 = z3 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                    int i15 = (int) j5;
                                    if (i14 == r2) {
                                        G4 = k96.M0(2131744894, null);
                                        c2 = 0;
                                    } else {
                                        c2 = 0;
                                        G4 = k96.G(i14, "StarsConfirmPurchaseMedia_Photos", new Object[0]);
                                    }
                                    Object[] objArr = new Object[2];
                                    objArr[c2] = G4;
                                    objArr[r2] = str2;
                                    G2 = k96.G(i15, str3, objArr);
                                } else if (i14 == 0) {
                                    str3 = z3 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                    int i16 = (int) j5;
                                    if (i3 == r2) {
                                        G3 = k96.M0(2131744893, null);
                                        c = 0;
                                    } else {
                                        c = 0;
                                        G3 = k96.G(i3, "StarsConfirmPurchaseMedia_Videos", new Object[0]);
                                    }
                                    Object[] objArr2 = new Object[2];
                                    objArr2[c] = G3;
                                    objArr2[r2] = str2;
                                    G2 = k96.G(i16, str3, objArr2);
                                } else {
                                    String str5 = z3 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                                    int i17 = (int) j5;
                                    if (i14 == r2) {
                                        G = k96.M0(2131744894, null);
                                        i4 = 0;
                                    } else {
                                        i4 = 0;
                                        G = k96.G(i14, "StarsConfirmPurchaseMedia_Photos", new Object[0]);
                                    }
                                    String M02 = i3 == r2 ? k96.M0(2131744893, null) : k96.G(i3, "StarsConfirmPurchaseMedia_Videos", new Object[i4]);
                                    Object[] objArr3 = new Object[3];
                                    objArr3[i4] = G;
                                    objArr3[r2] = M02;
                                    objArr3[2] = str2;
                                    G2 = k96.G(i17, str5, objArr3);
                                }
                                textView4.setText(gl.S2(G2));
                            }
                        } else {
                            TLRPC.Chat K02 = na7.q1(i10).K0(Long.valueOf(-B0));
                            str2 = K02 != null ? K02.title : "";
                        }
                        z3 = false;
                        tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) k27Var2.k.media;
                        i3 = 0;
                        int i142 = 0;
                        while (i2 < tL_messageMediaPaidMedia.extended_media.size()) {
                        }
                        if (i3 != 0) {
                        }
                        textView4.setText(gl.S2(G2));
                    } else if (i <= 0) {
                        String r3 = l7c.r(V13);
                        Object[] objArr4 = new Object[2];
                        objArr4[0] = str4;
                        objArr4[r2] = r3;
                        textView4.setText(gl.S2(k96.K("StarsConfirmSubscriptionText2", (int) j5, ',', objArr4)));
                    } else {
                        String r4 = l7c.r(V13);
                        Object[] objArr5 = new Object[2];
                        objArr5[0] = str4;
                        objArr5[r2] = r4;
                        textView4.setText(gl.S2(k96.K("StarsConfirmPurchaseText2", (int) j5, ',', objArr5)));
                    }
                    textView4.setMaxWidth(je5.a(textView4.getText(), textView4.getPaint()));
                    textView4.setGravity(17);
                    j6.addView(textView4, nme.t(-2, -2, 1, 0, 6, 0, 18));
                    u41 u41Var = new u41(F, context2, r2);
                    if (i <= 0) {
                        u41Var.i(jva.S0(gl.S2(k96.H(',', "StarsConfirmSubscriptionButton", (int) j5))), false, r2);
                    } else {
                        u41Var.i(jva.S0(gl.S2(k96.H(',', "StarsConfirmPurchaseButton", (int) j5))), false, r2);
                    }
                    j6.addView(u41Var, nme.c(48.0f, -1));
                    l46 l46Var = new l46(context2, F);
                    zkb.X(l46Var, bkb.y6, F);
                    zkb.G(l46Var, bkb.Wc, F);
                    l46Var.setTextSize(r2, 14.0f);
                    l46Var.setText(gl.N2(k96.M0(i <= 0 ? 2131744882 : 2131744889, null), -1, 0, new vf1(context2, (byte) 20), null));
                    l46Var.setGravity(17);
                    j6.addView(l46Var, nme.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                    fx0 fx0Var2 = fx0Var;
                    fx0Var2.O = j6;
                    u41Var.setOnClickListener(new hu4(qsaVar, fx0Var2, u41Var, (byte) 22));
                    fx0Var2.setOnDismissListener(new ph8(q79Var, (byte) 9));
                    fx0Var2.K();
                    fx0Var2.show();
                }
                be0 be0Var3 = new be0(context2);
                be0Var3.setRoundRadius(gl.L(80.0f));
                pb0 pb0Var2 = new pb0((wjb) null);
                pb0Var2.q(V13);
                be0Var3.f(V13, pb0Var2);
                viewGroup5.addView(be0Var3, nme.e(80, 80, 17));
                viewGroup2 = viewGroup5;
            } else {
                rua ruaVar2 = new rua(context2);
                ruaVar2.I = new Path();
                ruaVar2.J = new RectF();
                ruaVar2.K = b00.d(context2, R.drawable.large_locked_post);
                ruaVar2.setRoundRadius(gl.L(24.0f));
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) k27Var.k.media;
                if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                    fx0Var = h;
                    q79Var = q79Var2;
                    qsaVar = qsaVar2;
                    k27Var2 = k27Var;
                    i = i9;
                    i5 = 17;
                    i6 = 80;
                    f = 20.0f;
                    viewGroup3 = frameLayout;
                } else {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        gl5Var = gl5.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, k27Var.k);
                        ruaVar = ruaVar2;
                        q79Var = q79Var2;
                    } else {
                        if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                ruaVar = ruaVar2;
                                q79Var = q79Var2;
                                gl5Var = gl5.i(ba4.w(messageMedia.photo.sizes, gl.L(80.0f), true, null, false), messageMedia.photo);
                            } else {
                                ruaVar = ruaVar2;
                                q79Var = q79Var2;
                                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                    gl5Var = gl5.c(ba4.w(messageMedia.document.thumbs, gl.L(80.0f), true, null, false), messageMedia.document);
                                }
                            }
                        } else {
                            ruaVar = ruaVar2;
                            q79Var = q79Var2;
                        }
                        viewGroup4 = frameLayout;
                        gl5Var = null;
                        fx0Var = h;
                        qsaVar = qsaVar2;
                        i = i9;
                        i5 = 17;
                        i6 = 80;
                        f = 20.0f;
                        viewGroup3 = viewGroup4;
                        ruaVar2 = ruaVar;
                        ruaVar2.j(gl5Var, "80_80_b2", null, null, null, k27Var);
                        k27Var2 = k27Var;
                    }
                    viewGroup4 = frameLayout;
                    fx0Var = h;
                    qsaVar = qsaVar2;
                    i = i9;
                    i5 = 17;
                    i6 = 80;
                    f = 20.0f;
                    viewGroup3 = viewGroup4;
                    ruaVar2 = ruaVar;
                    ruaVar2.j(gl5Var, "80_80_b2", null, null, null, k27Var);
                    k27Var2 = k27Var;
                }
                viewGroup3.addView(ruaVar2, nme.e(i6, i6, i5));
                viewGroup2 = viewGroup3;
            }
            r2 = 1;
            viewGroup = viewGroup2;
            yua yuaVar2 = new yua(i10, F, context2);
            ote.a(yuaVar2);
            yuaVar2.setOnClickListener(new fua(yuaVar2, r2));
            viewGroup.addView(yuaVar2, nme.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
            j6.addView(viewGroup, nme.r(-1, kk7.B1, 7));
            TextView textView22 = new TextView(context2);
            textView22.setTextSize(r2, f);
            textView22.setTypeface(gl.o());
            int i122 = bkb.i5;
            zkb.X(textView22, i122, F);
            if (i <= 0) {
            }
            kk7.i(textView22);
            textView22.setGravity(17);
            j6.addView(textView22, nme.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
            if (webDocument != null) {
            }
            TextView textView42 = new TextView(context2);
            textView42.setTextSize(r2, 14.0f);
            zkb.X(textView42, i122, F);
            if (k27Var2 == null) {
            }
            if (i <= 0) {
            }
            textView42.setMaxWidth(je5.a(textView42.getText(), textView42.getPaint()));
            textView42.setGravity(17);
            j6.addView(textView42, nme.t(-2, -2, 1, 0, 6, 0, 18));
            u41 u41Var2 = new u41(F, context2, r2);
            if (i <= 0) {
            }
            j6.addView(u41Var2, nme.c(48.0f, -1));
            l46 l46Var2 = new l46(context2, F);
            zkb.X(l46Var2, bkb.y6, F);
            zkb.G(l46Var2, bkb.Wc, F);
            l46Var2.setTextSize(r2, 14.0f);
            l46Var2.setText(gl.N2(k96.M0(i <= 0 ? 2131744882 : 2131744889, null), -1, 0, new vf1(context2, (byte) 20), null));
            l46Var2.setGravity(17);
            j6.addView(l46Var2, nme.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
            fx0 fx0Var22 = fx0Var;
            fx0Var22.O = j6;
            u41Var2.setOnClickListener(new hu4(qsaVar, fx0Var22, u41Var2, (byte) 22));
            fx0Var22.setOnDismissListener(new ph8(q79Var, (byte) 9));
            fx0Var22.K();
            fx0Var22.show();
        }
    }

    public final void X(final k27 k27Var, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final p8c p8cVar) {
        long j;
        String str;
        TLRPC.User V1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = a.b;
            final wjb F = F();
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
            if (k27Var != null) {
                TLRPC.Message message = k27Var.k;
                j = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? k27.B0(message) : cf3.n(peer);
                if (j < 0 && k27Var.Z0() > 0 && (V1 = na7.q1(this.a).V1(Long.valueOf(k27Var.Z0()))) != null && V1.bot) {
                    j = V1.id;
                }
            } else {
                j = tL_payments_paymentFormStars.bot_id;
            }
            final long j3 = j;
            int i2 = this.a;
            if (j3 >= 0) {
                str = l7c.r(na7.q1(i2).V1(Long.valueOf(j3)));
            } else {
                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-j3));
                str = K0 == null ? "" : K0.title;
            }
            final String str2 = str;
            final String str3 = tL_payments_paymentFormStars.title;
            final int i3 = tL_payments_paymentFormStars.invoice.subscription_period;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
            tL_payments_sendStarsForm.invoice = inputInvoice;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: tra
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final gta gtaVar = gta.this;
                    final p8c p8cVar2 = p8cVar;
                    final k27 k27Var2 = k27Var;
                    final Context context2 = context;
                    final long j4 = j2;
                    final String str4 = str2;
                    final int i4 = i3;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j5 = j3;
                    final wjb wjbVar = F;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    gl.c3(new Runnable() { // from class: wra
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
                        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            k27 k27Var3;
                            boolean z;
                            LaunchActivity launchActivity;
                            vz5 vz5Var;
                            TLRPC.Message message2;
                            gta gtaVar2 = gta.this;
                            TLObject tLObject2 = tLObject;
                            p8c p8cVar3 = p8cVar2;
                            k27 k27Var4 = k27Var2;
                            Context context3 = context2;
                            long j6 = j4;
                            String str6 = str4;
                            int i5 = i4;
                            String str7 = str5;
                            TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                            long j7 = j5;
                            TLRPC.TL_error tL_error2 = tL_error;
                            wjb wjbVar2 = wjbVar;
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                            d Q = LaunchActivity.Q();
                            u21 Y = (Q == null || Q.visibleDialog != null) ? u21.Y() : u21.b0(Q);
                            byte b = 0;
                            if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                                if (tL_error2 == null) {
                                    k27Var3 = k27Var4;
                                } else {
                                    if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                        if (!na7.q1(gtaVar2.a).a5()) {
                                            p8cVar3.a(Boolean.FALSE);
                                            gta.c0(context3, wjbVar2);
                                            return;
                                        } else {
                                            boolean[] zArr = {false};
                                            zua zuaVar = new zua(context3, wjbVar2, j6, 0, str6, new foa(gtaVar2, zArr, k27Var4, inputInvoice3, tL_payments_paymentFormStars3, p8cVar3, (byte) 3), j7);
                                            zuaVar.setOnDismissListener(new mx0(p8cVar3, zArr));
                                            zuaVar.show();
                                            return;
                                        }
                                    }
                                    k27Var3 = k27Var4;
                                    if ("FORM_EXPIRED".equals(tL_error2.text)) {
                                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                        JSONObject u = ow0.u(wjbVar2, false);
                                        if (u != null) {
                                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                            tL_dataJSON.data = u.toString();
                                            tL_payments_getPaymentForm.flags |= 1;
                                        }
                                        tL_payments_getPaymentForm.invoice = inputInvoice3;
                                        ConnectionsManager.getInstance(gtaVar2.a).sendRequest(tL_payments_getPaymentForm, new fn0((Object) gtaVar2, (Object) k27Var3, (Object) inputInvoice3, (Object) p8cVar3, (Object) Y, (byte) 17));
                                        return;
                                    }
                                }
                                p8cVar3.a(Boolean.FALSE);
                                Y.Q(R.raw.error, 36, k96.a0(null, null, 2131743639, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                if (k27Var3 != null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia.peer = na7.q1(gtaVar2.a).h1(j7);
                                    tL_messages_getExtendedMedia.id.add(Integer.valueOf(k27Var3.e1()));
                                    ConnectionsManager.getInstance(gtaVar2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                    return;
                                }
                                return;
                            }
                            p8cVar3.a(Boolean.TRUE);
                            Utilities.d.c(new bsa(gtaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, b));
                            if (k27Var4 != null && (message2 = k27Var4.k) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                Drawable d = b00.d(context3, R.drawable.star_small_inner);
                                String M0 = k96.M0(2131744851, null);
                                SpannableStringBuilder S2 = gl.S2(k96.G((int) j6, "StarsMediaPurchaseCompletedInfo", str6));
                                Y.getClass();
                                j21 j21Var = new j21(Y.X(), Y.c);
                                j21Var.a.setImageDrawable(d);
                                j21Var.b.setText(M0);
                                j21Var.c.setText(S2);
                                Y.b(j21Var, 2750).j();
                            } else {
                                if (i5 <= 0) {
                                    z = true;
                                    Y.I(R.raw.stars_send, k96.M0(2131744815, null), gl.S2(k96.G((int) j6, "StarsPurchaseCompletedInfo", str7, str6))).j();
                                    launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null && (vz5Var = launchActivity.w0) != null) {
                                        vz5Var.c(z);
                                    }
                                    if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                        gtaVar2.P(true);
                                    }
                                    if (k27Var4 == null) {
                                        TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                        tL_messages_getExtendedMedia2.peer = na7.q1(gtaVar2.a).h1(j7);
                                        tL_messages_getExtendedMedia2.id.add(Integer.valueOf(k27Var4.e1()));
                                        ConnectionsManager.getInstance(gtaVar2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                        return;
                                    }
                                    return;
                                }
                                Y.I(R.raw.stars_send, k96.M0(2131744917, null), gl.S2(k96.G((int) j6, "StarsBotSubscriptionCompletedInfo", str7, str6))).j();
                            }
                            z = true;
                            launchActivity = LaunchActivity.H1;
                            if (launchActivity != null) {
                                vz5Var.c(z);
                            }
                            if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                            }
                            gtaVar2.P(true);
                            if (k27Var4 == null) {
                            }
                        }
                    });
                }
            });
        }
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, i8c i8cVar) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = a.b;
        wjb F = F();
        if (context != null) {
            long j = chatInvite.subscription_pricing.amount;
            String str2 = chatInvite.title;
            TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
            tL_inputInvoiceChatInviteSubscription.hash = str;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new j77(this, i8cVar, j, str2, context, F, chatInvite, str));
        }
    }

    public final void Z(long j, long j2, boolean z) {
        int i = this.a;
        pub pubVar = na7.q1(i).g4;
        TLRPC.TL_forumTopic f = pubVar.f(j, j2);
        if (f != null) {
            f.nopaid_messages_exception = z;
            vf6 vf6Var = pubVar.a;
            if (((ArrayList) vf6Var.f(j)) != null) {
                pubVar.getMessagesStorage().z1(pubVar.getConnectionsManager().getCurrentTime(), -j, (List) vf6Var.f(j), true);
            }
            kk7.f(i).k(kk7.P3, Long.valueOf(j2));
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
            int e1 = ((k27) obj).e1();
            hashSet.add(Integer.valueOf(e1));
            if (this.Q.remove(Integer.valueOf(e1))) {
                this.R.put(Integer.valueOf(e1), new q3a((Object) this, (Object) hashSet, (Object) runnable, (byte) 21));
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
            ((xsa) longSparseArray.valueAt(i2)).o(tL_starGiftUnique);
            i2++;
        }
        while (true) {
            LongSparseArray longSparseArray2 = this.K;
            if (i >= longSparseArray2.size()) {
                return;
            }
            wsa wsaVar = (wsa) longSparseArray2.valueAt(i);
            xsa xsaVar = wsaVar.g;
            if (xsaVar != null) {
                xsaVar.o(tL_starGiftUnique);
            }
            Iterator it = wsaVar.h.values().iterator();
            while (it.hasNext()) {
                ((xsa) it.next()).o(tL_starGiftUnique);
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
    public final void b(k27 k27Var) {
        boolean z;
        z54 z54Var;
        d S2;
        bta btaVar;
        TLRPC.Message message = k27Var.k;
        if (message != null) {
            long j = message.paid_message_stars;
            if (j <= 0 || k27.c3(message)) {
                return;
            }
            bta btaVar2 = this.N;
            if (btaVar2 == null || btaVar2.g <= 0 || !btaVar2.m || btaVar2.n || btaVar2.o) {
                if (!ij.a0(this.a, k27.B0(k27Var.k))) {
                    Long l = (Long) this.O.get(Long.valueOf(k27.B0(k27Var.k)));
                    if (l == null || System.currentTimeMillis() - l.longValue() <= 5000) {
                        Integer num = (Integer) this.P.get(Long.valueOf(k27.B0(k27Var.k)));
                        if (num != null) {
                        }
                    }
                }
                z = false;
                int e1 = k27Var.e1();
                if (z) {
                    this.Q.add(Integer.valueOf(e1));
                }
                long B0 = k27.B0(k27Var.k);
                ra raVar = new ra((byte) 7, this, z);
                z54Var = new z54((Object) this, z, e1, (byte) 5);
                S2 = LaunchActivity.S();
                btaVar = this.N;
                if (btaVar != null && (btaVar.o || btaVar.n)) {
                    this.N = null;
                    btaVar = null;
                }
                if (btaVar != null) {
                    if (S2 != null && !S2.isRemovingFromStack()) {
                        bta btaVar3 = this.N;
                        if (btaVar3.b == B0) {
                        }
                    }
                    this.N.a();
                    this.N = null;
                }
                if (S2 != null || S2.isRemovingFromStack()) {
                    z54Var.run();
                }
                bta btaVar4 = this.N;
                if (btaVar4 == null) {
                    btaVar4 = new bta(S2, B0);
                    this.N = btaVar4;
                }
                k21 k21Var = btaVar4.e;
                g21 g21Var = btaVar4.d;
                ata ataVar = btaVar4.p;
                if (btaVar4.n || btaVar4.o) {
                    z54Var.run();
                    return;
                }
                btaVar4.g++;
                btaVar4.k.add(k27Var);
                btaVar4.h += j;
                btaVar4.i = raVar;
                btaVar4.j.add(z54Var);
                if (btaVar4.m && !z) {
                    btaVar4.m = false;
                    gl.r(ataVar);
                    m21 m21Var = btaVar4.c;
                    m21Var.j = 5000;
                    m21Var.i(true);
                    if (System.currentTimeMillis() - btaVar4.l > 500) {
                        k21Var.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                    } else {
                        k21Var.setAlpha(0.0f);
                        k21Var.setVisibility(8);
                    }
                }
                fta ftaVar = btaVar4.f;
                if (ftaVar != null && btaVar4.m) {
                    ftaVar.b = 3000L;
                    gl.r(ataVar);
                    gl.d3(ataVar, 3000L);
                }
                hn hnVar = g21Var.b;
                int i = btaVar4.g;
                hnVar.setText(i == 1 ? k96.M0(2131747510, null) : k96.G(i, "PaidMessageSentTitle", new Object[0]));
                g21Var.c.setText(gl.S2(k96.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) btaVar4.h))));
                g21Var.a.d();
                return;
            }
            z = true;
            int e12 = k27Var.e1();
            if (z) {
            }
            long B02 = k27.B0(k27Var.k);
            ra raVar2 = new ra((byte) 7, this, z);
            z54Var = new z54((Object) this, z, e12, (byte) 5);
            S2 = LaunchActivity.S();
            btaVar = this.N;
            if (btaVar != null) {
                this.N = null;
                btaVar = null;
            }
            if (btaVar != null) {
            }
            if (S2 != null) {
            }
            z54Var.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final eta b0(final k27 k27Var, final mu1 mu1Var, final long j, boolean z, boolean z2, final Long l) {
        String str;
        boolean z3;
        String str2;
        zsa b = zsa.b(k27Var);
        int i = this.a;
        gta v = v(i, false);
        Context q = q(mu1Var);
        if (q == null) {
            return null;
        }
        str = "";
        if (z2 && v.e && v.n(null, false, false).amount <= 0) {
            long a = mu1Var.a();
            if (a >= 0) {
                str = l7c.l(mu1Var.getMessagesController().V1(Long.valueOf(a)));
            } else {
                TLRPC.Chat K0 = mu1Var.getMessagesController().K0(Long.valueOf(-a));
                if (K0 != null) {
                    str = K0.title;
                }
            }
            final byte b2 = 0;
            new zua(q, mu1Var.getResourceProvider(), j, 5, str, new Runnable(this) { // from class: isa
                public final /* synthetic */ gta b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b2) {
                        case 0:
                            this.b.b0(k27Var, mu1Var, j, true, true, l);
                            break;
                        default:
                            this.b.b0(k27Var, mu1Var, j, true, true, l);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        eta etaVar = this.B;
        if (etaVar == null || !etaVar.a.equals(b)) {
            eta etaVar2 = this.B;
            if (etaVar2 != null) {
                etaVar2.b();
            }
            ConnectionsManager.getInstance(i).getCurrentTime();
            eta etaVar3 = new eta(this, b, k27Var, mu1Var, z);
            this.B = etaVar3;
            etaVar3.n = l;
        }
        if (this.B.h + j > na7.q1(i).k4.y2.f()) {
            this.B.b();
            ConnectionsManager.getInstance(i).getCurrentTime();
            this.B = new eta(this, b, k27Var, mu1Var, z);
        }
        final long j2 = this.B.h + j;
        if (z2 && v.e && v.n(null, false, false).amount < j2) {
            this.B.a();
            long a2 = mu1Var.a();
            if (a2 >= 0) {
                str2 = l7c.l(mu1Var.getMessagesController().V1(Long.valueOf(a2)));
            } else {
                TLRPC.Chat K02 = mu1Var.getMessagesController().K0(Long.valueOf(-a2));
                str2 = K02 != null ? K02.title : "";
            }
            final byte b3 = 1;
            new zua(q, mu1Var.getResourceProvider(), j2, 5, str2, new Runnable(this) { // from class: isa
                public final /* synthetic */ gta b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b3) {
                        case 0:
                            this.b.b0(k27Var, mu1Var, j2, true, true, l);
                            break;
                        default:
                            this.b.b0(k27Var, mu1Var, j2, true, true, l);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        eta etaVar4 = this.B;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
            if (message.reactions == null) {
                message.reactions = new TLRPC.TL_messageReactions();
                TLRPC.Message message2 = k27Var.k;
                message2.reactions.reactions_as_tags = k27.B0(message2) == y6c.h(k27Var.K1).e();
                k27Var.k.reactions.can_see_list = k27Var.o3() || k27Var.p3();
            }
            for (int i2 = 0; i2 < k27Var.k.reactions.results.size(); i2++) {
                if (!(k27Var.k.reactions.results.get(i2).reaction instanceof TLRPC.TL_reactionPaid)) {
                }
            }
            z3 = true;
            cta ctaVar = etaVar4.p;
            gta gtaVar = etaVar4.q;
            int i3 = gtaVar.a;
            g21 g21Var = etaVar4.e;
            k27 k27Var2 = etaVar4.b;
            if (!etaVar4.i || etaVar4.j) {
                boolean z4 = w01.a;
            } else {
                etaVar4.h += j;
                System.currentTimeMillis();
                g21Var.c.a();
                g21Var.c.c(gl.S2(k96.G((int) etaVar4.h, "StarsSentText", new Object[0])), true, true);
                if (etaVar4.m) {
                    etaVar4.f.b = 5000L;
                    gl.r(ctaVar);
                    gl.d3(ctaVar, 5000L);
                }
                int i4 = kk7.n1;
                if (z3) {
                    etaVar4.l = true;
                    k27Var2.f((int) j, etaVar4.c(), true);
                    gtaVar.g += j;
                    kk7.f(i3).k(i4, Long.valueOf(k27.B0(k27Var2.k)), Integer.valueOf(k27Var2.e1()), k27Var2.k.reactions);
                    kk7.f(i3).k(kk7.z3, new Object[0]);
                } else {
                    etaVar4.l = false;
                    TLRPC.Message message3 = k27Var2.k;
                    if (message3.reactions == null) {
                        message3.reactions = new TLRPC.TL_messageReactions();
                        TLRPC.Message message4 = k27Var2.k;
                        message4.reactions.reactions_as_tags = k27.B0(message4) == y6c.h(k27Var2.K1).e();
                        k27Var2.k.reactions.can_see_list = k27Var2.o3() || k27Var2.p3();
                    }
                    TLRPC.ReactionCount reactionCount = null;
                    for (int i5 = 0; i5 < k27Var2.k.reactions.results.size(); i5++) {
                        if (k27Var2.k.reactions.results.get(i5).reaction instanceof TLRPC.TL_reactionPaid) {
                            reactionCount = k27Var2.k.reactions.results.get(i5);
                        }
                    }
                    if (reactionCount == null) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
                        tL_reactionCount.count = 1;
                        tL_reactionCount.chosen = true;
                        k27Var2.k.reactions.results.add(0, tL_reactionCount);
                        etaVar4.k--;
                    }
                    kk7.f(i3).k(i4, Long.valueOf(k27.B0(k27Var2.k)), Integer.valueOf(k27Var2.e1()), k27Var2.k.reactions);
                    etaVar4.k += j;
                }
                g21Var.b.setText(etaVar4.d());
            }
            eta etaVar5 = this.B;
            etaVar5.n = l;
            return etaVar5;
        }
        if (!z) {
            z3 = false;
            cta ctaVar2 = etaVar4.p;
            gta gtaVar2 = etaVar4.q;
            int i32 = gtaVar2.a;
            g21 g21Var2 = etaVar4.e;
            k27 k27Var22 = etaVar4.b;
            if (etaVar4.i) {
            }
            boolean z42 = w01.a;
            eta etaVar52 = this.B;
            etaVar52.n = l;
            return etaVar52;
        }
        z3 = true;
        cta ctaVar22 = etaVar4.p;
        gta gtaVar22 = etaVar4.q;
        int i322 = gtaVar22.a;
        g21 g21Var22 = etaVar4.e;
        k27 k27Var222 = etaVar4.b;
        if (etaVar4.i) {
        }
        boolean z422 = w01.a;
        eta etaVar522 = this.B;
        etaVar522.n = l;
        return etaVar522;
    }

    public final void d(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, i8c i8cVar, TLRPC.InputPeer inputPeer) {
        int i = this.a;
        if (activity == null) {
            return;
        }
        if (!na7.q1(i).a5()) {
            d Q = LaunchActivity.Q();
            if (Q == null || Q.getContext() == null) {
                c0(activity, null);
                return;
            } else {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            }
        }
        boolean z = na7.q1(this.a).k4.l0.f && inputPeer != null;
        if ((!w01.b() && ci0.h().j()) || z) {
            if (!ci0.h().j()) {
                i8cVar.a(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            i5 i5Var = new i5();
            i5Var.b = "inapp";
            i5Var.a = tL_starsTopupOption.store_product;
            yw8 a = i5Var.a();
            fa4.b("StarsController.buy starts queryProductDetails");
            ci0.h().o(Arrays.asList(a), new lt((Object) i8cVar, (Object) tL_inputStorePaymentStarsTopup, (Object) tL_starsTopupOption, (Object) activity, (byte) 22));
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
        JSONObject u = ow0.u(F(), false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getPaymentForm, new ck8((Object) this, (Object) i8cVar, (Object) tL_inputInvoiceStars, (byte) 17));
    }

    public final void d0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k27 k27Var = (k27) list.get(0);
        long B0 = k27.B0(k27Var.k);
        int i = this.a;
        if (B0 >= 0) {
            na7.q1(i).Z2(na7.q1(i).V1(Long.valueOf(B0)), 0, true, null);
        } else {
            na7.q1(i).Y2(0, -B0, true);
        }
        u21.b0(LaunchActivity.S()).Q(R.raw.error, 36, jva.S0(TextUtils.concat(k96.G((int) k27Var.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", k96.G((int) k27Var.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
    }

    public final void e(final long j, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final i8c i8cVar) {
        int i;
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final wjb F = F();
        boolean z = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                o(new o77((Object) this, (Object) i8cVar, j, (Object) tLObject, (Object) tL_textWithEntities, (byte) 17));
                return;
            }
            if (z) {
                i = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String k = cf3.k(this.a, j);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = na7.q1(this.a).m1(j);
            tL_inputInvoicePremiumGiftStars.months = i;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = ow0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: ura
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final gta gtaVar = gta.this;
                    final i8c i8cVar2 = i8cVar;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final wjb wjbVar = F;
                    final String str = k;
                    final long j2 = j;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    gl.c3(new Runnable() { // from class: yra
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z2 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            final i8c i8cVar3 = i8cVar2;
                            if (!z2) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                gta.c(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                i8cVar3.a(Boolean.FALSE, null);
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
                            final gta gtaVar2 = gta.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(gtaVar2.a);
                            final Context context4 = context3;
                            final wjb wjbVar2 = wjbVar;
                            final String str2 = str;
                            final long j4 = j2;
                            final TLObject tLObject5 = tLObject3;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: dsa
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject6, final TLRPC.TL_error tL_error3) {
                                    final gta gtaVar3 = gta.this;
                                    final i8c i8cVar4 = i8cVar3;
                                    final Context context5 = context4;
                                    final wjb wjbVar3 = wjbVar2;
                                    final long j5 = j3;
                                    final String str3 = str2;
                                    final long j6 = j4;
                                    final TLObject tLObject7 = tLObject5;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    gl.c3(new Runnable() { // from class: jsa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            vz5 vz5Var;
                                            int i3;
                                            gta gtaVar4 = gta.this;
                                            TLObject tLObject8 = tLObject6;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            i8c i8cVar5 = i8cVar4;
                                            Context context6 = context5;
                                            wjb wjbVar4 = wjbVar3;
                                            long j7 = j5;
                                            String str4 = str3;
                                            long j8 = j6;
                                            TLObject tLObject9 = tLObject7;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            d Q = LaunchActivity.Q();
                                            u21 Y = (Q == null || Q.visibleDialog != null) ? u21.Y() : u21.b0(Q);
                                            if (!(tLObject8 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 == null) {
                                                    i3 = 1;
                                                } else {
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!na7.q1(gtaVar4.a).a5()) {
                                                            i8cVar5.a(Boolean.FALSE, null);
                                                            gta.c0(context6, wjbVar4);
                                                            return;
                                                        } else {
                                                            boolean[] zArr = {false};
                                                            zua zuaVar = new zua(context6, wjbVar4, j7, 6, str4, new fl1((Object) gtaVar4, (Object) zArr, j8, (Object) tLObject9, (Object) tL_textWithEntities5, (Object) i8cVar5, (byte) 4), 0L);
                                                            zuaVar.setOnDismissListener(new csa((byte) 1, i8cVar5, zArr));
                                                            zuaVar.show();
                                                            return;
                                                        }
                                                    }
                                                    i3 = 1;
                                                    if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        i8cVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                        return;
                                                    }
                                                }
                                                i8cVar5.a(Boolean.FALSE, null);
                                                Object[] objArr = new Object[i3];
                                                objArr[0] = tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS";
                                                Y.Q(R.raw.error, 36, k96.a0(null, null, 2131743639, objArr)).j();
                                                return;
                                            }
                                            Utilities.d.c(new bsa(gtaVar4, (TLRPC.TL_payments_paymentResult) tLObject8, (byte) 3));
                                            gtaVar4.P(true);
                                            i8cVar5.a(Boolean.TRUE, null);
                                            mj0 b = oj0.a(gtaVar4.a).b();
                                            if (b != null && b.a(j8)) {
                                                na7.q1(gtaVar4.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                            }
                                            na7.q1(gtaVar4.a).X3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity == null || (vz5Var = launchActivity.w0) == null) {
                                                return;
                                            }
                                            vz5Var.c(true);
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
            o(new mx8((Object) this, (Object) launchActivity, j, (Object) str, (byte) 8));
        }
    }

    public final void f(final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z, final i8c i8cVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final wjb F = F();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            o(new ks0(this, i8cVar, tL_payments_paymentFormStarGift, starGift, j, tL_textWithEntities, z));
            return;
        }
        final String k = cf3.k(this.a, j);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = na7.q1(this.a).h1(j);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = ow0.u(F, false);
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: asa
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final gta gtaVar = gta.this;
                final i8c i8cVar2 = i8cVar;
                final Context context3 = context2;
                final wjb wjbVar = F;
                final long j4 = j3;
                final String str = k;
                final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = tL_payments_paymentFormStarGift;
                final TL_stars.StarGift starGift2 = starGift;
                final long j5 = j;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                final boolean z2 = z;
                gl.c3(new Runnable() { // from class: fsa
                    @Override // java.lang.Runnable
                    public final void run() {
                        vz5 vz5Var;
                        final gta gtaVar2 = gta.this;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final i8c i8cVar3 = i8cVar2;
                        Context context4 = context3;
                        wjb wjbVar2 = wjbVar;
                        long j6 = j4;
                        String str2 = str;
                        final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift3 = tL_payments_paymentFormStarGift2;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final long j7 = j5;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        final boolean z3 = z2;
                        d Q = LaunchActivity.Q();
                        u21 Y = (Q == null || Q.visibleDialog != null) ? u21.Y() : u21.b0(Q);
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null) {
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!na7.q1(gtaVar2.a).a5()) {
                                        i8cVar3.a(Boolean.FALSE, null);
                                        gta.c0(context4, wjbVar2);
                                        return;
                                    } else {
                                        final boolean[] zArr = {false};
                                        zua zuaVar = new zua(context4, wjbVar2, j6, 6, str2, new Runnable() { // from class: msa
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zArr[0] = true;
                                                gta.this.f(tL_payments_paymentFormStarGift3, starGift3, j7, tL_textWithEntities3, z3, i8cVar3);
                                            }
                                        }, 0L);
                                        zuaVar.setOnDismissListener(new csa((byte) 2, i8cVar3, zArr));
                                        zuaVar.show();
                                        return;
                                    }
                                }
                                if ("STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                                    i8cVar3.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                    return;
                                }
                            }
                            i8cVar3.a(Boolean.FALSE, null);
                            Y.Q(R.raw.error, 36, k96.a0(null, null, 2131743639, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                            return;
                        }
                        Utilities.d.c(new bsa(gtaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, (byte) 4));
                        gtaVar2.D = false;
                        gtaVar2.E = true;
                        gtaVar2.G = 0L;
                        gtaVar2.T();
                        gtaVar2.M(j7);
                        gtaVar2.P(true);
                        i8cVar3.a(Boolean.TRUE, null);
                        mj0 b = oj0.a(gtaVar2.a).b();
                        if (b != null && b.a(j7)) {
                            na7.q1(gtaVar2.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j7, false).apply();
                        }
                        na7.q1(gtaVar2.a).X3.edit().putBoolean("show_gift_for_" + j7, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j7, true).apply();
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity == null || (vz5Var = launchActivity.w0) == null) {
                            return;
                        }
                        vz5Var.c(true);
                    }
                });
            }
        });
    }

    public final void f0(LaunchActivity launchActivity, long j, String str) {
        if (m().amount < j && j > 0) {
            new zua(launchActivity, null, j, 4, str, new jc((byte) 10), 0L).show();
            return;
        }
        d S2 = LaunchActivity.S();
        if (S2 == null) {
            return;
        }
        m21 K = u21.b0(S2).K(R.raw.stars_topup, k96.M0(2131744727, null), k96.M0(2131744726, null), new am6((byte) 29));
        K.j = 5000;
        K.k(true);
    }

    public final void g(final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final w0a w0aVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final wjb F = F();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            o(new Runnable() { // from class: mra
                @Override // java.lang.Runnable
                public final void run() {
                    gta gtaVar = gta.this;
                    boolean z3 = gtaVar.e;
                    w0a w0aVar2 = w0aVar;
                    if (z3) {
                        gtaVar.g(starGift, z, z2, j, tL_textWithEntities, w0aVar2);
                    } else {
                        gta.c("NO_BALANCE");
                        w0aVar2.a(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String k = cf3.k(this.a, j);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z;
        tL_inputInvoiceStarGift.peer = na7.q1(this.a).h1(j);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z2;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = ow0.u(F, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: nra
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final gta gtaVar = gta.this;
                final w0a w0aVar2 = w0aVar;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final wjb wjbVar = F;
                final String str = k;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z3 = z;
                final boolean z4 = z2;
                final long j2 = j;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                gl.c3(new Runnable() { // from class: zra
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z5 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final w0a w0aVar3 = w0aVar2;
                        if (!z5) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            gta.c(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            w0aVar3.a(Boolean.FALSE, null);
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
                        final gta gtaVar2 = gta.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(gtaVar2.a);
                        final Context context4 = context3;
                        final wjb wjbVar2 = wjbVar;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z6 = z3;
                        final boolean z7 = z4;
                        final long j4 = j2;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: esa
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final gta gtaVar3 = gta.this;
                                final w0a w0aVar4 = w0aVar3;
                                final Context context5 = context4;
                                final wjb wjbVar3 = wjbVar2;
                                final long j5 = j3;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z8 = z6;
                                final boolean z9 = z7;
                                final long j6 = j4;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                gl.c3(new Runnable() { // from class: rra
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r10v6 */
                                    /* JADX WARN: Type inference failed for: r10v7, types: [boolean] */
                                    /* JADX WARN: Type inference failed for: r10v8 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str4;
                                        SpannableStringBuilder spannableStringBuilder;
                                        vz5 vz5Var;
                                        ?? r10;
                                        gta gtaVar4 = gta.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        w0a w0aVar5 = w0aVar4;
                                        Context context6 = context5;
                                        wjb wjbVar4 = wjbVar3;
                                        long j7 = j5;
                                        String str5 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z10 = z8;
                                        boolean z11 = z9;
                                        long j8 = j6;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        d Q = LaunchActivity.Q();
                                        u21 Y = (Q == null || Q.visibleDialog != null) ? u21.Y() : u21.b0(Q);
                                        if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                            if (tL_error4 != null) {
                                                if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (!na7.q1(gtaVar4.a).a5()) {
                                                        w0aVar5.a(Boolean.FALSE, null);
                                                        gta.c0(context6, wjbVar4);
                                                        return;
                                                    } else {
                                                        boolean[] zArr = {false};
                                                        zua zuaVar = new zua(context6, wjbVar4, j7, 6, str5, new gsa(gtaVar4, zArr, starGift5, z10, z11, j8, tL_textWithEntities5, w0aVar5), 0L);
                                                        zuaVar.setOnDismissListener(new cf(w0aVar5, zArr, (byte) 16));
                                                        zuaVar.show();
                                                        return;
                                                    }
                                                }
                                                if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    w0aVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if ("STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    w0aVar5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                }
                                            }
                                            w0aVar5.a(Boolean.FALSE, null);
                                            Y.Q(R.raw.error, 36, k96.a0(null, null, 2131743639, tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS")).j();
                                            return;
                                        }
                                        Utilities.d.c(new bsa(gtaVar4, (TLRPC.TL_payments_paymentResult) tLObject4, (byte) 2));
                                        gtaVar4.D = false;
                                        gtaVar4.E = true;
                                        gtaVar4.G = 0L;
                                        gtaVar4.T();
                                        gtaVar4.M(j8);
                                        gtaVar4.P(true);
                                        w0aVar5.a(Boolean.TRUE, null);
                                        mj0 b = oj0.a(gtaVar4.a).b();
                                        if (b != null && b.a(j8)) {
                                            na7.q1(gtaVar4.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            str4 = str5;
                                            spannableStringBuilder = null;
                                        } else {
                                            int i2 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i2;
                                            spannableStringBuilder = gl.S2(k96.H(',', "Gift2SentRemainsLimit", Math.max(0, i2)));
                                            str4 = str5;
                                        }
                                        if (j8 < 0) {
                                            long j9 = -j8;
                                            TLRPC.ChatFull L0 = na7.q1(gtaVar4.a).L0(j9);
                                            if (L0 != null) {
                                                L0.stargifts_count++;
                                                L0.flags2 |= 262144;
                                                na7.q1(gtaVar4.a).U3(L0);
                                            }
                                            if (Q instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) Q;
                                                if (profileActivity.a() == j8) {
                                                    vn8 vn8Var = profileActivity.O;
                                                    if (vn8Var != null) {
                                                        vn8Var.N1(true);
                                                        profileActivity.O.f1(14);
                                                        r10 = 0;
                                                        profileActivity.j3(false);
                                                    } else {
                                                        r10 = 0;
                                                    }
                                                    u21 b0 = u21.b0(Q);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String M0 = k96.M0(2131744872, null);
                                                    if (spannableStringBuilder == null) {
                                                        Object[] objArr = new Object[1];
                                                        objArr[r10] = str4;
                                                        spannableStringBuilder = gl.S2(k96.G((int) j7, "StarsGiftCompletedChannelText", objArr));
                                                    }
                                                    b0.s(document, M0, spannableStringBuilder).k(r10);
                                                }
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", j9);
                                            bundle.putBoolean("open_gifts", true);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                            profileActivity2.whenFullyVisible(new o77((Object) profileActivity2, (Object) starGift5, (Object) spannableStringBuilder, j7, (Object) str4, (byte) 18));
                                            Q.presentFragment(profileActivity2);
                                        } else if ((Q instanceof mu1) && ((mu1) Q).a() == j8) {
                                            u21 b02 = u21.b0(Q);
                                            TLRPC.Document document2 = starGift5.sticker;
                                            String M02 = k96.M0(2131744872, null);
                                            if (spannableStringBuilder == null) {
                                                spannableStringBuilder = gl.S2(k96.G((int) j7, "StarsGiftCompletedText", new Object[0]));
                                            }
                                            b02.s(document2, M02, spannableStringBuilder).k(true);
                                        } else {
                                            kk7 f = kk7.f(gtaVar4.a);
                                            int i3 = kk7.u;
                                            Long valueOf = Long.valueOf(j8);
                                            Boolean bool = Boolean.FALSE;
                                            f.k(i3, valueOf, bool);
                                            kk7.f(gtaVar4.a).k(kk7.t, Long.valueOf(j8), bool);
                                            mu1 W9 = mu1.W9(j8);
                                            W9.whenFullyVisible(new mx8((Object) W9, (Object) starGift5, (Object) spannableStringBuilder, j7, (byte) 7));
                                            Q.presentFragment(W9);
                                        }
                                        na7.q1(gtaVar4.a).X3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || (vz5Var = launchActivity.w0) == null) {
                                            return;
                                        }
                                        vz5Var.c(true);
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
        togglenopaidmessagesexception.user_id = na7.q1(i).m1(j);
        if (j2 != 0) {
            togglenopaidmessagesexception.parent_peer = na7.q1(i).h1(j2);
        }
        togglenopaidmessagesexception.refund_charged = z;
        togglenopaidmessagesexception.require_payment = !z2;
        ConnectionsManager.getInstance(i).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: ksa
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gl.c3(new nb7(gta.this, tLObject, j2, j, z2));
            }
        });
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, i8c i8cVar) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        Context context2 = context;
        wjb F = F();
        long j = chatInvite.subscription_pricing.amount;
        if (context2 != null) {
            int i = y6c.t0;
            byte b = 0;
            boolean[] zArr = {false};
            ssa ssaVar = new ssa(this, j, i, zArr, i8cVar, context2, F, chatInvite, str);
            t7a t7aVar = new t7a(this, zArr, i8cVar);
            fx0 h = de9.h(1, F, context2, false);
            LinearLayout j2 = de9.j(context2, 1);
            j2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(8.0f));
            FrameLayout frameLayout = new FrameLayout(context2);
            frameLayout.addView(new qua(context2, 40, 0), nme.c(-1.0f, -1));
            be0 be0Var = new be0(context2);
            be0Var.setRoundRadius(gl.L(80.0f));
            pb0 pb0Var = new pb0((wjb) null);
            pb0Var.r(chatInvite.color);
            String str2 = chatInvite.title;
            pb0Var.A = true;
            pb0Var.n = (byte) 0;
            pb0Var.m = false;
            pb0.a(str2, null, null, pb0Var.q);
            TLRPC.Photo photo = chatInvite.photo;
            if (photo != null) {
                be0Var.m(gl5.i(ba4.w(photo.sizes, gl.L(80.0f), false, null, false), chatInvite.photo), "80_80", pb0Var, chatInvite);
            } else {
                be0Var.setImageDrawable(pb0Var);
            }
            frameLayout.addView(be0Var, nme.e(80, 80, 17));
            Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
            int i2 = bkb.g5;
            zkb.x(frameLayout, drawable, i2, F, PorterDuff.Mode.SRC_IN);
            Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            frameLayout.addView(imageView, nme.e(26, 26, 17));
            imageView.setTranslationX(gl.L(26.0f));
            imageView.setTranslationY(gl.L(26.0f));
            imageView.setScaleX(1.2f);
            imageView.setScaleY(1.2f);
            ImageView imageView2 = new ImageView(context2);
            imageView2.setImageDrawable(drawable2);
            frameLayout.addView(imageView2, nme.e(26, 26, 17));
            imageView2.setTranslationX(gl.L(26.0f));
            imageView2.setTranslationY(gl.L(26.0f));
            yua yuaVar = new yua(i, F, context2);
            ote.a(yuaVar);
            yuaVar.setOnClickListener(new fua(yuaVar, b));
            frameLayout.addView(yuaVar, nme.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
            j2.addView(frameLayout, nme.r(-1, kk7.B1, 7));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(gl.o());
            int i3 = bkb.i5;
            ug8.x(textView, i3, F, null, 2131744775);
            textView.setGravity(17);
            TextView m = ug8.m(j2, textView, nme.t(-2, -2, 1, 0, 8, 0, 0), context2);
            m.setTextSize(1, 14.0f);
            zkb.X(m, i3, F);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
            int i4 = tL_starsSubscriptionPricing.period;
            if (i4 == 2592000) {
                m.setText(gl.S2(k96.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
            } else {
                m.setText(gl.S2(k96.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, i4 == 300 ? "5 minutes" : "a minute")));
            }
            m.setMaxWidth(je5.a(m.getText(), m.getPaint()));
            m.setGravity(17);
            j2.addView(m, nme.t(-2, -2, 1, 0, 6, 0, 22));
            if (!TextUtils.isEmpty(chatInvite.about)) {
                TextView textView2 = new TextView(context2);
                textView2.setTextSize(1, 14.0f);
                zkb.X(textView2, i3, F);
                textView2.setText(vu3.m(chatInvite.about, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setGravity(17);
                j2.addView(textView2, nme.t(-2, -2, 1, 0, 6, 0, 22));
            }
            u41 u41Var = new u41(F, context2, true);
            u41Var.i(k96.M0(2131744784, null), false, true);
            j2.addView(u41Var, nme.o(-1, 48));
            l46 l46Var = new l46(context2, F);
            l46Var.setText(gl.N2(k96.M0(2131744783, null), -1, 0, new vf1(context2, (byte) 19), null));
            l46Var.setGravity(17);
            l46Var.setTextSize(1, 13.0f);
            zkb.X(l46Var, bkb.A6, F);
            zkb.G(l46Var, bkb.Wc, F);
            j2.addView(l46Var, nme.t(-1, -2, 49, 14, 14, 14, 6));
            h.O = j2;
            u41Var.setOnClickListener(new hu4(ssaVar, h, u41Var, (byte) 21));
            h.setOnDismissListener(new ph8(t7aVar, (byte) 8));
            h.M(i2);
            d S2 = LaunchActivity.S();
            if (!gl.O1() && S2 != null && !gl.s1(S2)) {
                h.X(S2);
            }
            h.show();
        }
    }

    public final void i0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f.equals(starsAmount);
        int i = kk7.z3;
        int i2 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            kk7.f(i2).k(i, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            kk7.f(i2).k(i, new Object[0]);
        }
    }

    public final void j0(final k27 k27Var, final long j, final Runnable runnable, final boolean z) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (k27Var == null) {
            runnable.run();
            return;
        }
        final long B0 = k27.B0(k27Var.k);
        final int e1 = k27Var.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) k27Var.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i = this.a;
        tL_messages_editMessage.peer = na7.q1(i).h1(B0);
        int i2 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i2;
        tL_messages_editMessage.schedule_date = k27Var.k.date;
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
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: osa
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gl.c3(new xa7(gta.this, tLObject, runnable, tL_error, z, B0, e1, k27Var, j));
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
            xsa xsaVar = (xsa) longSparseArray.valueAt(i);
            for (int i2 = 0; i2 < xsaVar.l.size(); i2++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) xsaVar.l.get(i2);
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new apa(this, runnable, (byte) 2));
        }
        if (!z || this.g <= 0) {
            return this.f;
        }
        nj n = nj.n(this.f);
        return nj.h(Math.max(0L, n.a() - this.g), n.a).q();
    }

    public final void o(Runnable runnable) {
        n(runnable, true, false);
    }

    public final nj p() {
        nj m = nj.m(m());
        if (m == null) {
            return nj.j(0L, this.b ? oj.b : oj.a);
        }
        return m;
    }

    public final ArrayList r() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new hsa(this, (byte) 3));
        return this.m;
    }

    public final ArrayList s() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new hsa(this, (byte) 4));
        return this.p;
    }

    public final ArrayList w() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new hsa(this, (byte) 2));
        return this.j;
    }

    public final long x(k27 k27Var) {
        Long l;
        eta etaVar = this.B;
        if (etaVar != null && etaVar.a.equals(zsa.b(k27Var)) && (l = this.B.n) != null) {
            return l.longValue();
        }
        Long z1 = k27Var == null ? null : k27Var.z1();
        if (z1 != null) {
            return z1.longValue();
        }
        Long v1 = na7.q1(this.a).v1();
        if (v1 != null) {
            return v1.longValue();
        }
        return 0L;
    }

    public final long y(zsa zsaVar, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l;
        eta etaVar = this.B;
        if (etaVar != null && etaVar.a.equals(zsaVar) && (l = this.B.n) != null) {
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
                        l2 = Long.valueOf(cf3.n(peer));
                        break;
                    }
                }
            }
        }
        if (l2 != null) {
            return l2.longValue();
        }
        Long v1 = na7.q1(this.a).v1();
        if (v1 != null) {
            return v1.longValue();
        }
        return 0L;
    }

    public final void z(long j, long j2, p8c p8cVar) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i = this.a;
        getpaidmessagesrevenue.user_id = na7.q1(i).m1(j);
        if (j2 != 0) {
            getpaidmessagesrevenue.parent_peer = na7.q1(i).h1(j2);
        }
        ConnectionsManager.getInstance(i).sendRequest(getpaidmessagesrevenue, new lg1(p8cVar, (byte) 2));
    }
}
