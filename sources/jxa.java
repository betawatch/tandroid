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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jxa {
    public static volatile jxa[][] S = (jxa[][]) Array.newInstance((Class<?>) jxa.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public hxa B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public exa N;
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

    public jxa(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static vnb F() {
        e S2 = LaunchActivity.S();
        if (S2 != null) {
            return S2.getResourceProvider();
        }
        return null;
    }

    public static jxa I(int i) {
        return v(i, true);
    }

    public static boolean R(int i, oj ojVar) {
        return ojVar == null || u(i, ojVar.a).p().b >= ojVar.b;
    }

    public static void c(String str) {
        e Q = LaunchActivity.Q();
        ((Q == null || Q.visibleDialog != null) ? d31.Y() : d31.b0(Q)).Q(R.raw.error, 36, d31.W(str)).j();
    }

    public static void d0(Context context, vnb vnbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131744717, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131744718, null);
        c00.u(null, 2131747558, alertDialog$Builder, null);
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

    public static Context q(e eVar) {
        if (eVar != null && eVar.getContext() != null) {
            return eVar.getContext();
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

    public static jxa t(int i) {
        return v(i, false);
    }

    public static jxa u(int i, pj pjVar) {
        return v(i, pjVar == pj.b);
    }

    public static jxa v(int i, boolean z) {
        jxa jxaVar;
        jxa jxaVar2 = S[z ? 1 : 0][i];
        if (jxaVar2 != null) {
            return jxaVar2;
        }
        synchronized (T[z ? 1 : 0][i]) {
            jxaVar = S[z ? 1 : 0][i];
            if (jxaVar == null) {
                jxa[] jxaVarArr = S[z ? 1 : 0];
                jxa jxaVar3 = new jxa(i, z);
                jxaVarArr[i] = jxaVar3;
                jxaVar = jxaVar3;
            }
        }
        return jxaVar;
    }

    public final long A(int i, long j) {
        hxa hxaVar = this.B;
        if (hxaVar == null) {
            return 0L;
        }
        cxa cxaVar = hxaVar.a;
        if (cxaVar.a == j && cxaVar.b == i && hxaVar.l) {
            return hxaVar.h;
        }
        return 0L;
    }

    public final long B(r47 r47Var) {
        TLRPC.Message message;
        if (r47Var == null || (message = r47Var.k) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || r47Var.k3()) && r47Var.k.fwd_from != null) ? A(r47Var.k.fwd_from.saved_from_msg_id, r47Var.Z0()) : A(r47Var.e1(), r47.B0(r47Var.k));
    }

    public final zwa C(long j, boolean z) {
        LongSparseArray longSparseArray = this.K;
        zwa zwaVar = (zwa) longSparseArray.get(j);
        if (zwaVar != null || !z) {
            return zwaVar;
        }
        zwa zwaVar2 = new zwa(this.a, j);
        longSparseArray.put(j, zwaVar2);
        return zwaVar2;
    }

    public final axa D(long j, boolean z) {
        LongSparseArray longSparseArray = this.L;
        axa axaVar = (axa) longSparseArray.get(j);
        if (axaVar != null || !z) {
            return axaVar;
        }
        axa axaVar2 = new axa(this.a, j, true);
        longSparseArray.put(j, axaVar2);
        return axaVar2;
    }

    public final void E(TL_stars.StarGift starGift, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, pcc pccVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        vnb F = F();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            o(new us0((Object) this, (Object) pccVar, (Object) starGift, j, (Object) tL_textWithEntities, z, (byte) 8));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = uc7.s1(this.a).j1(j);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = xw0.u(F, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new isa(this, pccVar, (byte) 3));
    }

    public final TL_stars.StarGift G(long j) {
        U();
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

    public final void H(long j, pcc pccVar) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j));
        if (stargiftupgradepreview != null) {
            pccVar.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new p87((Object) this, j, (Object) pccVar, (byte) 17));
    }

    public final void J(TL_stars.InputSavedStarGift inputSavedStarGift, pcc pccVar) {
        id idVar = new id(3, null, a.b);
        idVar.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new au0((Object) this, (Object) idVar, (Object) inputSavedStarGift, (Object) pccVar, (byte) 21));
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
        axa D = D(j, false);
        if (D != null) {
            D.k(false);
        }
        zwa zwaVar = (zwa) this.K.get(j);
        if (zwaVar != null) {
            zwaVar.g();
        }
    }

    public final void N(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j = userFull.id;
            axa D = D(j, false);
            if (D != null && D.n != userFull.stargifts_count) {
                D.k(false);
            }
            zwa zwaVar = (zwa) this.K.get(j);
            if (zwaVar != null) {
                zwaVar.g();
            }
        }
    }

    public final void O(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i >= longSparseArray.size()) {
                break;
            }
            if (((axa) longSparseArray.valueAt(i)).j(str)) {
                arrayList.add(Long.valueOf(longSparseArray.keyAt(i)));
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            LongSparseArray longSparseArray2 = this.K;
            if (i2 >= longSparseArray2.size()) {
                break;
            }
            zwa zwaVar = (zwa) longSparseArray2.valueAt(i2);
            axa axaVar = zwaVar.g;
            boolean z = axaVar != null && axaVar.j(str);
            Iterator it = zwaVar.h.values().iterator();
            while (it.hasNext()) {
                z = z || ((axa) it.next()).j(str);
            }
            if (z && !arrayList.contains(Long.valueOf(longSparseArray2.keyAt(i2)))) {
                arrayList.add(Long.valueOf(longSparseArray2.keyAt(i2)));
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            M(((Long) arrayList.get(i3)).longValue());
        }
    }

    public final void P() {
        if (this.x) {
            return;
        }
        this.v.clear();
        this.w = null;
        this.x = false;
        this.y = false;
        V();
    }

    public final void Q(boolean z) {
        for (int i = 0; i < 3; i++) {
            boolean[] zArr = this.t;
            if (!zArr[i]) {
                this.q[i].clear();
                this.s[i] = null;
                zArr[i] = false;
                this.u[i] = false;
                if (z) {
                    W(i);
                }
            }
        }
    }

    public final /* synthetic */ void S(ArrayList arrayList, Integer num, Long l, ArrayList arrayList2, ArrayList arrayList3) {
        int i = this.a;
        uc7.s1(i).j4(arrayList2, true);
        uc7.s1(i).c4(arrayList3, true);
        this.E = true;
        ArrayList arrayList4 = this.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = this.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new nm((byte) 14)), new nm((byte) 15)));
        ArrayList arrayList6 = this.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new nm((byte) 16)));
        this.F = num.intValue();
        this.G = l.longValue();
        this.C = false;
        jn7.f(i).k(jn7.H3, new Object[0]);
        U();
    }

    public final void T(TL_stars.StarGifts starGifts) {
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
                jf7 Y = jf7.Y(i);
                Y.a.c(new od7(Y, arrayList, i2, currentTimeMillis));
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        uc7.s1(i).j4(tL_starGifts.users, false);
        uc7.s1(i).c4(tL_starGifts.chats, false);
        jf7.Y(i).j1(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList.clear();
        arrayList.addAll(tL_starGifts.gifts);
        ArrayList arrayList2 = this.J;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new nm((byte) 17)), new nm((byte) 18)));
        ArrayList arrayList3 = this.I;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        Collections.sort(arrayList3, Comparator$-CC.comparingInt(new nm((byte) 19)));
        this.F = tL_starGifts.hash;
        this.G = System.currentTimeMillis();
        jn7.f(i).k(jn7.H3, new Object[0]);
        ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
        int i3 = this.F;
        long j = this.G;
        jf7 Y2 = jf7.Y(i);
        Y2.a.c(new od7(Y2, arrayList4, i3, j));
    }

    public final void U() {
        if (this.C) {
            return;
        }
        if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
            this.C = true;
            boolean z = this.E;
            int i = this.a;
            if (z) {
                int i2 = this.F;
                sh9 sh9Var = new sh9(this, (byte) 10);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i2;
                ConnectionsManager.getInstance(i).sendRequest(getstargifts, new yp9(sh9Var, (byte) 3));
                return;
            }
            hja hjaVar = new hja(this, (byte) 6);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            jf7 Y = jf7.Y(i);
            Y.a.c(new cp7((Object) Y, (Object) arrayList3, (Object) arrayList2, (Object) arrayList, (Object) hjaVar, (byte) 28));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new lwa(this, (byte) 0));
    }

    public final void W(int i) {
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new b22(this, i, (byte) 6));
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
    public final void X(r47 r47Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, pcc pccVar) {
        long j;
        boolean z;
        long j2;
        String str;
        boolean z2;
        nx0 nx0Var;
        db9 db9Var;
        twa twaVar;
        r47 r47Var2;
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
        TLRPC.User X1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        int[] iArr;
        String M0;
        ViewGroup viewGroup2;
        TLRPC.Message message2;
        int i5;
        int i6;
        ViewGroup viewGroup3;
        vya vyaVar;
        ViewGroup viewGroup4;
        jn5 jn5Var;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        uc7.s1(this.a).j4(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        Context context2 = context;
        vnb F = F();
        if (context2 != null) {
            if (!this.e) {
                o(new esa(this, runnable, r47Var, inputInvoice, tL_payments_paymentFormStars, pccVar, (byte) 4));
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
            if (r47Var == null || r47Var.D != 29) {
                j = tL_payments_paymentFormStars.bot_id;
            } else {
                TLRPC.Message message3 = r47Var.k;
                TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
                j = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? r47.B0(message3) : wf3.n(peer2);
            }
            long j4 = j;
            int i8 = this.a;
            if (j4 >= 0) {
                TLRPC.User X12 = uc7.s1(i8).X1(Long.valueOf(j4));
                String r = lbc.r(X12);
                z2 = !lbc.v(X12);
                str = r;
                z = false;
                j2 = j3;
            } else {
                uc7 s1 = uc7.s1(i8);
                z = false;
                j2 = j3;
                TLRPC.Chat M02 = s1.M0(Long.valueOf(-j4));
                str = M02 == null ? "" : M02.title;
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
            twa twaVar2 = new twa(this, j5, zArr, pccVar, context2, F, z2, str, r47Var, inputInvoice, tL_payments_paymentFormStars, i9, j4);
            db9 db9Var2 = new db9(this, zArr, pccVar);
            nx0 h = uh9.h(1, F, context2, false);
            TLRPC.User X13 = uc7.s1(i10).X1(Long.valueOf(j4));
            LinearLayout j6 = uh9.j(context2, 1);
            j6.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(8.0f));
            ViewGroup frameLayout = new FrameLayout(context2);
            frameLayout.addView(new uya(context2, 40, 0), tre.c(-1.0f, -1));
            if (r47Var == null || (message2 = r47Var.k) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                nx0Var = h;
                db9Var = db9Var2;
                twaVar = twaVar2;
                r47Var2 = r47Var;
                i = i9;
                f = 20.0f;
                ViewGroup viewGroup5 = frameLayout;
                if (webDocument != null) {
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    de0 de0Var = new de0(context2);
                    de0Var.setRoundRadius(hl.L(18.0f));
                    de0Var.p(jn5.p(jxc.c(webDocument)), "80_80", null, null);
                    frameLayout2.addView(de0Var, tre.e(80, 80, 48));
                    viewGroup5.addView(frameLayout2, tre.e(80, 87, 17));
                    TextView textView = new TextView(context2);
                    textView.setTypeface(hl.n1("fonts/num.otf"));
                    r2 = 1;
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(-1);
                    textView.setText(nza.U0("XTR ".concat(ob6.E((int) j5, ',')), 0.85f, null));
                    textView.setPadding(hl.L(5.33f), 0, hl.L(5.33f), 0);
                    textView.setBackground(aob.b0(hl.L(16.0f), -1133566));
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    int L = hl.L(20.0f);
                    int i11 = aob.h5;
                    ShapeDrawable b0 = aob.b0(L, aob.v0(i11, F));
                    uob M = yob.M(i11);
                    frameLayout3.setBackground(b0);
                    yob.j(frameLayout3, b0, M, null, F);
                    frameLayout3.setPadding(hl.L(1.33f), hl.L(1.33f), hl.L(1.33f), hl.L(1.33f));
                    frameLayout3.addView(textView, tre.r(-2, 16, jn7.D1));
                    frameLayout2.addView(frameLayout3, tre.a(-2.0f, 18.66f, 81));
                    viewGroup = viewGroup5;
                    cza czaVar = new cza(i10, F, context2);
                    iye.a(czaVar);
                    czaVar.setOnClickListener(new jya(czaVar, r2));
                    viewGroup.addView(czaVar, tre.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                    j6.addView(viewGroup, tre.r(-1, jn7.B1, 7));
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(r2, f);
                    textView2.setTypeface(hl.o());
                    int i12 = aob.j5;
                    yob.X(textView2, i12, F);
                    if (i <= 0) {
                        if (webDocument != null) {
                            M0 = str4;
                            iArr = null;
                        } else {
                            iArr = null;
                            M0 = ob6.M0(2131744772, null);
                        }
                        textView2.setText(pv3.m(M0, textView2.getPaint().getFontMetricsInt(), false, iArr, 0));
                    } else {
                        textView2.setText(pv3.m(webDocument != null ? str4 : ob6.M0(2131744779, null), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    }
                    jn7.i(textView2);
                    textView2.setGravity(17);
                    j6.addView(textView2, tre.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                    if (webDocument != null) {
                        LinearLayout j7 = uh9.j(context2, 0);
                        int L2 = hl.L(28.0f);
                        int i13 = aob.a7;
                        Drawable b02 = aob.b0(L2, aob.v0(i13, F));
                        uob M2 = yob.M(i13);
                        j7.setBackground(b02);
                        yob.j(j7, b02, M2, null, F);
                        de0 de0Var2 = new de0(context2);
                        de0Var2.setRoundRadius(hl.L(14.0f));
                        rb0 rb0Var = new rb0((vnb) null);
                        rb0Var.q(X13);
                        de0Var2.f(X13, rb0Var);
                        j7.addView(de0Var2, tre.o(28, 28));
                        TextView textView3 = new TextView(context2);
                        textView3.setTextSize(r2, 13.0f);
                        yob.X(textView3, aob.G6, F);
                        textView3.setText(lbc.r(X13));
                        j7.addView(textView3, tre.t(-2, -2, 16, 6, 0, 10, 0));
                        j6.addView(j7, tre.t(-2, 28, 1, 0, 8, 0, 2));
                    }
                    TextView textView4 = new TextView(context2);
                    textView4.setTextSize(r2, 14.0f);
                    yob.X(textView4, i12, F);
                    if (r47Var2 == null && (message = r47Var2.k) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                        long B0 = r47.B0(message);
                        TLRPC.Message message4 = r47Var2.k;
                        if (message4 != null && (messageFwdHeader = message4.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                            B0 = wf3.n(peer);
                        }
                        if (B0 < 0 && r47Var2.Z0() > 0 && (X1 = uc7.s1(i10).X1(Long.valueOf(r47Var2.Z0()))) != null && X1.bot) {
                            B0 = X1.id;
                        }
                        if (B0 >= 0) {
                            TLRPC.User X14 = uc7.s1(i10).X1(Long.valueOf(B0));
                            str2 = lbc.r(X14);
                            if (X14 != null && X14.bot) {
                                z3 = r2;
                                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) r47Var2.k.media;
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
                                        G4 = ob6.M0(2131744788, null);
                                        c2 = 0;
                                    } else {
                                        c2 = 0;
                                        G4 = ob6.G(i14, "StarsConfirmPurchaseMedia_Photos", new Object[0]);
                                    }
                                    Object[] objArr = new Object[2];
                                    objArr[c2] = G4;
                                    objArr[r2] = str2;
                                    G2 = ob6.G(i15, str3, objArr);
                                } else if (i14 == 0) {
                                    str3 = z3 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                    int i16 = (int) j5;
                                    if (i3 == r2) {
                                        G3 = ob6.M0(2131744787, null);
                                        c = 0;
                                    } else {
                                        c = 0;
                                        G3 = ob6.G(i3, "StarsConfirmPurchaseMedia_Videos", new Object[0]);
                                    }
                                    Object[] objArr2 = new Object[2];
                                    objArr2[c] = G3;
                                    objArr2[r2] = str2;
                                    G2 = ob6.G(i16, str3, objArr2);
                                } else {
                                    String str5 = z3 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                                    int i17 = (int) j5;
                                    if (i14 == r2) {
                                        G = ob6.M0(2131744788, null);
                                        i4 = 0;
                                    } else {
                                        i4 = 0;
                                        G = ob6.G(i14, "StarsConfirmPurchaseMedia_Photos", new Object[0]);
                                    }
                                    String M03 = i3 == r2 ? ob6.M0(2131744787, null) : ob6.G(i3, "StarsConfirmPurchaseMedia_Videos", new Object[i4]);
                                    Object[] objArr3 = new Object[3];
                                    objArr3[i4] = G;
                                    objArr3[r2] = M03;
                                    objArr3[2] = str2;
                                    G2 = ob6.G(i17, str5, objArr3);
                                }
                                textView4.setText(hl.S2(G2));
                            }
                        } else {
                            TLRPC.Chat M04 = uc7.s1(i10).M0(Long.valueOf(-B0));
                            str2 = M04 != null ? M04.title : "";
                        }
                        z3 = false;
                        tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) r47Var2.k.media;
                        i3 = 0;
                        int i142 = 0;
                        while (i2 < tL_messageMediaPaidMedia.extended_media.size()) {
                        }
                        if (i3 != 0) {
                        }
                        textView4.setText(hl.S2(G2));
                    } else if (i <= 0) {
                        String r3 = lbc.r(X13);
                        Object[] objArr4 = new Object[2];
                        objArr4[0] = str4;
                        objArr4[r2] = r3;
                        textView4.setText(hl.S2(ob6.K("StarsConfirmSubscriptionText2", (int) j5, ',', objArr4)));
                    } else {
                        String r4 = lbc.r(X13);
                        Object[] objArr5 = new Object[2];
                        objArr5[0] = str4;
                        objArr5[r2] = r4;
                        textView4.setText(hl.S2(ob6.K("StarsConfirmPurchaseText2", (int) j5, ',', objArr5)));
                    }
                    textView4.setMaxWidth(kg5.a(textView4.getText(), textView4.getPaint()));
                    textView4.setGravity(17);
                    j6.addView(textView4, tre.t(-2, -2, 1, 0, 6, 0, 18));
                    c51 c51Var = new c51(F, context2, r2);
                    if (i <= 0) {
                        c51Var.i(nza.T0(hl.S2(ob6.H(',', "StarsConfirmSubscriptionButton", (int) j5))), false, r2);
                    } else {
                        c51Var.i(nza.T0(hl.S2(ob6.H(',', "StarsConfirmPurchaseButton", (int) j5))), false, r2);
                    }
                    j6.addView(c51Var, tre.c(48.0f, -1));
                    p66 p66Var = new p66(context2, F);
                    yob.X(p66Var, aob.z6, F);
                    yob.G(p66Var, aob.Xc, F);
                    p66Var.setTextSize(r2, 14.0f);
                    p66Var.setText(hl.N2(ob6.M0(i <= 0 ? 2131744776 : 2131744783, null), -1, 0, new xf1(context2, (byte) 20), null));
                    p66Var.setGravity(17);
                    j6.addView(p66Var, tre.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                    nx0 nx0Var2 = nx0Var;
                    nx0Var2.O = j6;
                    c51Var.setOnClickListener(new lw4(twaVar, nx0Var2, c51Var, (byte) 23));
                    nx0Var2.setOnDismissListener(new dl8(db9Var, (byte) 9));
                    nx0Var2.J();
                    nx0Var2.show();
                }
                de0 de0Var3 = new de0(context2);
                de0Var3.setRoundRadius(hl.L(80.0f));
                rb0 rb0Var2 = new rb0((vnb) null);
                rb0Var2.q(X13);
                de0Var3.f(X13, rb0Var2);
                viewGroup5.addView(de0Var3, tre.e(80, 80, 17));
                viewGroup2 = viewGroup5;
            } else {
                vya vyaVar2 = new vya(context2);
                vyaVar2.I = new Path();
                vyaVar2.J = new RectF();
                vyaVar2.K = c00.e(context2, R.drawable.large_locked_post);
                vyaVar2.setRoundRadius(hl.L(24.0f));
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) r47Var.k.media;
                if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                    nx0Var = h;
                    db9Var = db9Var2;
                    twaVar = twaVar2;
                    r47Var2 = r47Var;
                    i = i9;
                    i5 = 17;
                    i6 = 80;
                    f = 20.0f;
                    viewGroup3 = frameLayout;
                } else {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        jn5Var = jn5.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, r47Var.k);
                        vyaVar = vyaVar2;
                        db9Var = db9Var2;
                    } else {
                        if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                vyaVar = vyaVar2;
                                db9Var = db9Var2;
                                jn5Var = jn5.i(xb4.w(messageMedia.photo.sizes, hl.L(80.0f), true, null, false), messageMedia.photo);
                            } else {
                                vyaVar = vyaVar2;
                                db9Var = db9Var2;
                                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                    jn5Var = jn5.c(xb4.w(messageMedia.document.thumbs, hl.L(80.0f), true, null, false), messageMedia.document);
                                }
                            }
                        } else {
                            vyaVar = vyaVar2;
                            db9Var = db9Var2;
                        }
                        viewGroup4 = frameLayout;
                        jn5Var = null;
                        nx0Var = h;
                        twaVar = twaVar2;
                        i = i9;
                        i5 = 17;
                        i6 = 80;
                        f = 20.0f;
                        viewGroup3 = viewGroup4;
                        vyaVar2 = vyaVar;
                        vyaVar2.j(jn5Var, "80_80_b2", null, null, null, r47Var);
                        r47Var2 = r47Var;
                    }
                    viewGroup4 = frameLayout;
                    nx0Var = h;
                    twaVar = twaVar2;
                    i = i9;
                    i5 = 17;
                    i6 = 80;
                    f = 20.0f;
                    viewGroup3 = viewGroup4;
                    vyaVar2 = vyaVar;
                    vyaVar2.j(jn5Var, "80_80_b2", null, null, null, r47Var);
                    r47Var2 = r47Var;
                }
                viewGroup3.addView(vyaVar2, tre.e(i6, i6, i5));
                viewGroup2 = viewGroup3;
            }
            r2 = 1;
            viewGroup = viewGroup2;
            cza czaVar2 = new cza(i10, F, context2);
            iye.a(czaVar2);
            czaVar2.setOnClickListener(new jya(czaVar2, r2));
            viewGroup.addView(czaVar2, tre.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
            j6.addView(viewGroup, tre.r(-1, jn7.B1, 7));
            TextView textView22 = new TextView(context2);
            textView22.setTextSize(r2, f);
            textView22.setTypeface(hl.o());
            int i122 = aob.j5;
            yob.X(textView22, i122, F);
            if (i <= 0) {
            }
            jn7.i(textView22);
            textView22.setGravity(17);
            j6.addView(textView22, tre.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
            if (webDocument != null) {
            }
            TextView textView42 = new TextView(context2);
            textView42.setTextSize(r2, 14.0f);
            yob.X(textView42, i122, F);
            if (r47Var2 == null) {
            }
            if (i <= 0) {
            }
            textView42.setMaxWidth(kg5.a(textView42.getText(), textView42.getPaint()));
            textView42.setGravity(17);
            j6.addView(textView42, tre.t(-2, -2, 1, 0, 6, 0, 18));
            c51 c51Var2 = new c51(F, context2, r2);
            if (i <= 0) {
            }
            j6.addView(c51Var2, tre.c(48.0f, -1));
            p66 p66Var2 = new p66(context2, F);
            yob.X(p66Var2, aob.z6, F);
            yob.G(p66Var2, aob.Xc, F);
            p66Var2.setTextSize(r2, 14.0f);
            p66Var2.setText(hl.N2(ob6.M0(i <= 0 ? 2131744776 : 2131744783, null), -1, 0, new xf1(context2, (byte) 20), null));
            p66Var2.setGravity(17);
            j6.addView(p66Var2, tre.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
            nx0 nx0Var22 = nx0Var;
            nx0Var22.O = j6;
            c51Var2.setOnClickListener(new lw4(twaVar, nx0Var22, c51Var2, (byte) 23));
            nx0Var22.setOnDismissListener(new dl8(db9Var, (byte) 9));
            nx0Var22.J();
            nx0Var22.show();
        }
    }

    public final void Y(final r47 r47Var, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final pcc pccVar) {
        long j;
        String str;
        TLRPC.User X1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = a.b;
            final vnb F = F();
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
            if (r47Var != null) {
                TLRPC.Message message = r47Var.k;
                j = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? r47.B0(message) : wf3.n(peer);
                if (j < 0 && r47Var.Z0() > 0 && (X1 = uc7.s1(this.a).X1(Long.valueOf(r47Var.Z0()))) != null && X1.bot) {
                    j = X1.id;
                }
            } else {
                j = tL_payments_paymentFormStars.bot_id;
            }
            final long j3 = j;
            int i2 = this.a;
            if (j3 >= 0) {
                str = lbc.r(uc7.s1(i2).X1(Long.valueOf(j3)));
            } else {
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j3));
                str = M0 == null ? "" : M0.title;
            }
            final String str2 = str;
            final String str3 = tL_payments_paymentFormStars.title;
            final int i3 = tL_payments_paymentFormStars.invoice.subscription_period;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
            tL_payments_sendStarsForm.invoice = inputInvoice;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: vva
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final jxa jxaVar = jxa.this;
                    final pcc pccVar2 = pccVar;
                    final r47 r47Var2 = r47Var;
                    final Context context2 = context;
                    final long j4 = j2;
                    final String str4 = str2;
                    final int i4 = i3;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j5 = j3;
                    final vnb vnbVar = F;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    hl.c3(new Runnable() { // from class: yva
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
                        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            r47 r47Var3;
                            boolean z;
                            LaunchActivity launchActivity;
                            y16 y16Var;
                            TLRPC.Message message2;
                            jxa jxaVar2 = jxa.this;
                            TLObject tLObject2 = tLObject;
                            pcc pccVar3 = pccVar2;
                            r47 r47Var4 = r47Var2;
                            Context context3 = context2;
                            long j6 = j4;
                            String str6 = str4;
                            int i5 = i4;
                            String str7 = str5;
                            TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                            long j7 = j5;
                            TLRPC.TL_error tL_error2 = tL_error;
                            vnb vnbVar2 = vnbVar;
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                            e Q = LaunchActivity.Q();
                            d31 Y = (Q == null || Q.visibleDialog != null) ? d31.Y() : d31.b0(Q);
                            byte b = 0;
                            if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                                if (tL_error2 == null) {
                                    r47Var3 = r47Var4;
                                } else {
                                    if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                        if (!uc7.s1(jxaVar2.a).i5()) {
                                            pccVar3.a(Boolean.FALSE);
                                            jxa.d0(context3, vnbVar2);
                                            return;
                                        } else {
                                            boolean[] zArr = {false};
                                            dza dzaVar = new dza(context3, vnbVar2, j6, 0, str6, new esa(jxaVar2, zArr, r47Var4, inputInvoice3, tL_payments_paymentFormStars3, pccVar3, (byte) 3), j7);
                                            dzaVar.setOnDismissListener(new ux0(pccVar3, zArr));
                                            dzaVar.show();
                                            return;
                                        }
                                    }
                                    r47Var3 = r47Var4;
                                    if ("FORM_EXPIRED".equals(tL_error2.text)) {
                                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                        JSONObject u = xw0.u(vnbVar2, false);
                                        if (u != null) {
                                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                            tL_dataJSON.data = u.toString();
                                            tL_payments_getPaymentForm.flags |= 1;
                                        }
                                        tL_payments_getPaymentForm.invoice = inputInvoice3;
                                        ConnectionsManager.getInstance(jxaVar2.a).sendRequest(tL_payments_getPaymentForm, new in0((Object) jxaVar2, (Object) r47Var3, (Object) inputInvoice3, (Object) pccVar3, (Object) Y, (byte) 17));
                                        return;
                                    }
                                }
                                pccVar3.a(Boolean.FALSE);
                                Y.Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                if (r47Var3 != null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia.peer = uc7.s1(jxaVar2.a).j1(j7);
                                    tL_messages_getExtendedMedia.id.add(Integer.valueOf(r47Var3.e1()));
                                    ConnectionsManager.getInstance(jxaVar2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                    return;
                                }
                                return;
                            }
                            pccVar3.a(Boolean.TRUE);
                            Utilities.d.c(new fwa(jxaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, b));
                            if (r47Var4 != null && (message2 = r47Var4.k) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                Drawable e = c00.e(context3, R.drawable.star_small_inner);
                                String M02 = ob6.M0(2131744745, null);
                                SpannableStringBuilder S2 = hl.S2(ob6.G((int) j6, "StarsMediaPurchaseCompletedInfo", str6));
                                Y.getClass();
                                s21 s21Var = new s21(Y.X(), Y.c);
                                s21Var.a.setImageDrawable(e);
                                s21Var.b.setText(M02);
                                s21Var.c.setText(S2);
                                Y.b(s21Var, 2750).j();
                            } else {
                                if (i5 <= 0) {
                                    z = true;
                                    Y.I(R.raw.stars_send, ob6.M0(2131744709, null), hl.S2(ob6.G((int) j6, "StarsPurchaseCompletedInfo", str7, str6))).j();
                                    launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null && (y16Var = launchActivity.w0) != null) {
                                        y16Var.c(z);
                                    }
                                    if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                        jxaVar2.Q(true);
                                    }
                                    if (r47Var4 == null) {
                                        TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                        tL_messages_getExtendedMedia2.peer = uc7.s1(jxaVar2.a).j1(j7);
                                        tL_messages_getExtendedMedia2.id.add(Integer.valueOf(r47Var4.e1()));
                                        ConnectionsManager.getInstance(jxaVar2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                        return;
                                    }
                                    return;
                                }
                                Y.I(R.raw.stars_send, ob6.M0(2131744811, null), hl.S2(ob6.G((int) j6, "StarsBotSubscriptionCompletedInfo", str7, str6))).j();
                            }
                            z = true;
                            launchActivity = LaunchActivity.H1;
                            if (launchActivity != null) {
                                y16Var.c(z);
                            }
                            if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                            }
                            jxaVar2.Q(true);
                            if (r47Var4 == null) {
                            }
                        }
                    });
                }
            });
        }
    }

    public final void Z(String str, TLRPC.ChatInvite chatInvite, icc iccVar) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = a.b;
        vnb F = F();
        if (context != null) {
            long j = chatInvite.subscription_pricing.amount;
            String str2 = chatInvite.title;
            TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
            tL_inputInvoiceChatInviteSubscription.hash = str;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new p97(this, iccVar, j, str2, context, F, chatInvite, str));
        }
    }

    public final boolean a(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || l(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        byte b = 0;
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int e1 = ((r47) obj).e1();
            hashSet.add(Integer.valueOf(e1));
            if (this.Q.remove(Integer.valueOf(e1))) {
                this.R.put(Integer.valueOf(e1), new pwa(this, hashSet, runnable, b));
                z = true;
            }
        }
        return !z;
    }

    public final void a0(long j, long j2, boolean z) {
        int i = this.a;
        qyb qybVar = uc7.s1(i).g4;
        TLRPC.TL_forumTopic f = qybVar.f(j, j2);
        if (f != null) {
            f.nopaid_messages_exception = z;
            zh6 zh6Var = qybVar.a;
            if (((ArrayList) zh6Var.f(j)) != null) {
                qybVar.getMessagesStorage().z1(qybVar.getConnectionsManager().getCurrentTime(), -j, (List) zh6Var.f(j), true);
            }
            jn7.f(i).k(jn7.Q3, Long.valueOf(j2));
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
    public final void b(r47 r47Var) {
        boolean z;
        t64 t64Var;
        e S2;
        exa exaVar;
        TLRPC.Message message = r47Var.k;
        if (message != null) {
            long j = message.paid_message_stars;
            if (j <= 0 || r47.c3(message)) {
                return;
            }
            exa exaVar2 = this.N;
            if (exaVar2 == null || exaVar2.g <= 0 || !exaVar2.m || exaVar2.n || exaVar2.o) {
                if (!jj.a0(this.a, r47.B0(r47Var.k))) {
                    Long l = (Long) this.O.get(Long.valueOf(r47.B0(r47Var.k)));
                    if (l == null || System.currentTimeMillis() - l.longValue() <= 5000) {
                        Integer num = (Integer) this.P.get(Long.valueOf(r47.B0(r47Var.k)));
                        if (num != null) {
                        }
                    }
                }
                z = false;
                int e1 = r47Var.e1();
                if (z) {
                    this.Q.add(Integer.valueOf(e1));
                }
                long B0 = r47.B0(r47Var.k);
                sa saVar = new sa((byte) 7, this, z);
                t64Var = new t64((Object) this, z, e1, (byte) 5);
                S2 = LaunchActivity.S();
                exaVar = this.N;
                if (exaVar != null && (exaVar.o || exaVar.n)) {
                    this.N = null;
                    exaVar = null;
                }
                if (exaVar != null) {
                    if (S2 != null && !S2.isRemovingFromStack()) {
                        exa exaVar3 = this.N;
                        if (exaVar3.b == B0) {
                        }
                    }
                    this.N.a();
                    this.N = null;
                }
                if (S2 != null || S2.isRemovingFromStack()) {
                    t64Var.run();
                }
                exa exaVar4 = this.N;
                if (exaVar4 == null) {
                    exaVar4 = new exa(S2, B0);
                    this.N = exaVar4;
                }
                t21 t21Var = exaVar4.e;
                p21 p21Var = exaVar4.d;
                dxa dxaVar = exaVar4.p;
                if (exaVar4.n || exaVar4.o) {
                    t64Var.run();
                    return;
                }
                exaVar4.g++;
                exaVar4.k.add(r47Var);
                exaVar4.h += j;
                exaVar4.i = saVar;
                exaVar4.j.add(t64Var);
                if (exaVar4.m && !z) {
                    exaVar4.m = false;
                    hl.r(dxaVar);
                    v21 v21Var = exaVar4.c;
                    v21Var.j = 5000;
                    v21Var.i(true);
                    if (System.currentTimeMillis() - exaVar4.l > 500) {
                        t21Var.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                    } else {
                        t21Var.setAlpha(0.0f);
                        t21Var.setVisibility(8);
                    }
                }
                ixa ixaVar = exaVar4.f;
                if (ixaVar != null && exaVar4.m) {
                    ixaVar.b = 3000L;
                    hl.r(dxaVar);
                    hl.d3(dxaVar, 3000L);
                }
                in inVar = p21Var.b;
                int i = exaVar4.g;
                inVar.setText(i == 1 ? ob6.M0(2131747430, null) : ob6.G(i, "PaidMessageSentTitle", new Object[0]));
                p21Var.c.setText(hl.S2(ob6.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) exaVar4.h))));
                p21Var.a.d();
                return;
            }
            z = true;
            int e12 = r47Var.e1();
            if (z) {
            }
            long B02 = r47.B0(r47Var.k);
            sa saVar2 = new sa((byte) 7, this, z);
            t64Var = new t64((Object) this, z, e12, (byte) 5);
            S2 = LaunchActivity.S();
            exaVar = this.N;
            if (exaVar != null) {
                this.N = null;
                exaVar = null;
            }
            if (exaVar != null) {
            }
            if (S2 != null) {
            }
            t64Var.run();
        }
    }

    public final void b0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
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
            ((axa) longSparseArray.valueAt(i2)).o(tL_starGiftUnique);
            i2++;
        }
        while (true) {
            LongSparseArray longSparseArray2 = this.K;
            if (i >= longSparseArray2.size()) {
                return;
            }
            zwa zwaVar = (zwa) longSparseArray2.valueAt(i);
            axa axaVar = zwaVar.g;
            if (axaVar != null) {
                axaVar.o(tL_starGiftUnique);
            }
            Iterator it = zwaVar.h.values().iterator();
            while (it.hasNext()) {
                ((axa) it.next()).o(tL_starGiftUnique);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hxa c0(final r47 r47Var, final zu1 zu1Var, final long j, boolean z, boolean z2, final Long l) {
        String str;
        boolean z3;
        String str2;
        cxa b = cxa.b(r47Var);
        int i = this.a;
        jxa v = v(i, false);
        Context q = q(zu1Var);
        if (q == null) {
            return null;
        }
        str = "";
        if (z2 && v.e && v.n(null, false, false).amount <= 0) {
            long a = zu1Var.a();
            if (a >= 0) {
                str = lbc.l(zu1Var.getMessagesController().X1(Long.valueOf(a)));
            } else {
                TLRPC.Chat M0 = zu1Var.getMessagesController().M0(Long.valueOf(-a));
                if (M0 != null) {
                    str = M0.title;
                }
            }
            final byte b2 = 0;
            new dza(q, zu1Var.getResourceProvider(), j, 5, str, new Runnable(this) { // from class: rwa
                public final /* synthetic */ jxa b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b2) {
                        case 0:
                            this.b.c0(r47Var, zu1Var, j, true, true, l);
                            break;
                        default:
                            this.b.c0(r47Var, zu1Var, j, true, true, l);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        hxa hxaVar = this.B;
        if (hxaVar == null || !hxaVar.a.equals(b)) {
            hxa hxaVar2 = this.B;
            if (hxaVar2 != null) {
                hxaVar2.b();
            }
            ConnectionsManager.getInstance(i).getCurrentTime();
            hxa hxaVar3 = new hxa(this, b, r47Var, zu1Var, z);
            this.B = hxaVar3;
            hxaVar3.n = l;
        }
        if (this.B.h + j > uc7.s1(i).k4.G2.f()) {
            this.B.b();
            ConnectionsManager.getInstance(i).getCurrentTime();
            this.B = new hxa(this, b, r47Var, zu1Var, z);
        }
        final long j2 = this.B.h + j;
        if (z2 && v.e && v.n(null, false, false).amount < j2) {
            this.B.a();
            long a2 = zu1Var.a();
            if (a2 >= 0) {
                str2 = lbc.l(zu1Var.getMessagesController().X1(Long.valueOf(a2)));
            } else {
                TLRPC.Chat M02 = zu1Var.getMessagesController().M0(Long.valueOf(-a2));
                str2 = M02 != null ? M02.title : "";
            }
            final byte b3 = 1;
            new dza(q, zu1Var.getResourceProvider(), j2, 5, str2, new Runnable(this) { // from class: rwa
                public final /* synthetic */ jxa b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b3) {
                        case 0:
                            this.b.c0(r47Var, zu1Var, j2, true, true, l);
                            break;
                        default:
                            this.b.c0(r47Var, zu1Var, j2, true, true, l);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        hxa hxaVar4 = this.B;
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
            if (message.reactions == null) {
                message.reactions = new TLRPC.TL_messageReactions();
                TLRPC.Message message2 = r47Var.k;
                message2.reactions.reactions_as_tags = r47.B0(message2) == yac.h(r47Var.K1).e();
                r47Var.k.reactions.can_see_list = r47Var.o3() || r47Var.p3();
            }
            for (int i2 = 0; i2 < r47Var.k.reactions.results.size(); i2++) {
                if (!(r47Var.k.reactions.results.get(i2).reaction instanceof TLRPC.TL_reactionPaid)) {
                }
            }
            z3 = true;
            fxa fxaVar = hxaVar4.p;
            jxa jxaVar = hxaVar4.q;
            int i3 = jxaVar.a;
            p21 p21Var = hxaVar4.e;
            r47 r47Var2 = hxaVar4.b;
            if (!hxaVar4.i || hxaVar4.j) {
                boolean z4 = f11.a;
            } else {
                hxaVar4.h += j;
                System.currentTimeMillis();
                p21Var.c.a();
                p21Var.c.c(hl.S2(ob6.G((int) hxaVar4.h, "StarsSentText", new Object[0])), true, true);
                if (hxaVar4.m) {
                    hxaVar4.f.b = 5000L;
                    hl.r(fxaVar);
                    hl.d3(fxaVar, 5000L);
                }
                int i4 = jn7.o1;
                if (z3) {
                    hxaVar4.l = true;
                    r47Var2.f((int) j, hxaVar4.c(), true);
                    jxaVar.g += j;
                    jn7.f(i3).k(i4, Long.valueOf(r47.B0(r47Var2.k)), Integer.valueOf(r47Var2.e1()), r47Var2.k.reactions);
                    jn7.f(i3).k(jn7.A3, new Object[0]);
                } else {
                    hxaVar4.l = false;
                    TLRPC.Message message3 = r47Var2.k;
                    if (message3.reactions == null) {
                        message3.reactions = new TLRPC.TL_messageReactions();
                        TLRPC.Message message4 = r47Var2.k;
                        message4.reactions.reactions_as_tags = r47.B0(message4) == yac.h(r47Var2.K1).e();
                        r47Var2.k.reactions.can_see_list = r47Var2.o3() || r47Var2.p3();
                    }
                    TLRPC.ReactionCount reactionCount = null;
                    for (int i5 = 0; i5 < r47Var2.k.reactions.results.size(); i5++) {
                        if (r47Var2.k.reactions.results.get(i5).reaction instanceof TLRPC.TL_reactionPaid) {
                            reactionCount = r47Var2.k.reactions.results.get(i5);
                        }
                    }
                    if (reactionCount == null) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
                        tL_reactionCount.count = 1;
                        tL_reactionCount.chosen = true;
                        r47Var2.k.reactions.results.add(0, tL_reactionCount);
                        hxaVar4.k--;
                    }
                    jn7.f(i3).k(i4, Long.valueOf(r47.B0(r47Var2.k)), Integer.valueOf(r47Var2.e1()), r47Var2.k.reactions);
                    hxaVar4.k += j;
                }
                p21Var.b.setText(hxaVar4.d());
            }
            hxa hxaVar5 = this.B;
            hxaVar5.n = l;
            return hxaVar5;
        }
        if (!z) {
            z3 = false;
            fxa fxaVar2 = hxaVar4.p;
            jxa jxaVar2 = hxaVar4.q;
            int i32 = jxaVar2.a;
            p21 p21Var2 = hxaVar4.e;
            r47 r47Var22 = hxaVar4.b;
            if (hxaVar4.i) {
            }
            boolean z42 = f11.a;
            hxa hxaVar52 = this.B;
            hxaVar52.n = l;
            return hxaVar52;
        }
        z3 = true;
        fxa fxaVar22 = hxaVar4.p;
        jxa jxaVar22 = hxaVar4.q;
        int i322 = jxaVar22.a;
        p21 p21Var22 = hxaVar4.e;
        r47 r47Var222 = hxaVar4.b;
        if (hxaVar4.i) {
        }
        boolean z422 = f11.a;
        hxa hxaVar522 = this.B;
        hxaVar522.n = l;
        return hxaVar522;
    }

    public final void d(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, icc iccVar, TLRPC.InputPeer inputPeer) {
        int i = this.a;
        if (activity == null) {
            return;
        }
        if (!uc7.s1(i).i5()) {
            e Q = LaunchActivity.Q();
            if (Q == null || Q.getContext() == null) {
                d0(activity, null);
                return;
            } else {
                d0(Q.getContext(), Q.getResourceProvider());
                return;
            }
        }
        boolean z = uc7.s1(this.a).k4.t0.f && inputPeer != null;
        if ((!f11.b() && di0.h().j()) || z) {
            if (!di0.h().j()) {
                iccVar.a(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            we3 we3Var = new we3();
            we3Var.b = "inapp";
            we3Var.a = tL_starsTopupOption.store_product;
            j09 a = we3Var.a();
            cc4.b("StarsController.buy starts queryProductDetails");
            di0.h().o(Arrays.asList(a), new pt((Object) iccVar, (Object) tL_inputStorePaymentStarsTopup, (Object) tL_starsTopupOption, (Object) activity, (byte) 25));
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
        JSONObject u = xw0.u(F(), false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getPaymentForm, new qn8((Object) this, (Object) iccVar, (Object) tL_inputInvoiceStars, (byte) 17));
    }

    public final void e(final long j, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final icc iccVar) {
        int i;
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final vnb F = F();
        boolean z = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                o(new da7((Object) this, (Object) iccVar, j, (Object) tLObject, (Object) tL_textWithEntities, (byte) 18));
                return;
            }
            if (z) {
                i = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String k = wf3.k(this.a, j);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = uc7.s1(this.a).o1(j);
            tL_inputInvoicePremiumGiftStars.months = i;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = xw0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: wva
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final jxa jxaVar = jxa.this;
                    final icc iccVar2 = iccVar;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final vnb vnbVar = F;
                    final String str = k;
                    final long j2 = j;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    hl.c3(new Runnable() { // from class: awa
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z2 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            final icc iccVar3 = iccVar2;
                            if (!z2) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                jxa.c(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                iccVar3.a(Boolean.FALSE, null);
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
                            final jxa jxaVar2 = jxa.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jxaVar2.a);
                            final Context context4 = context3;
                            final vnb vnbVar2 = vnbVar;
                            final String str2 = str;
                            final long j4 = j2;
                            final TLObject tLObject5 = tLObject3;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: hwa
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject6, final TLRPC.TL_error tL_error3) {
                                    final jxa jxaVar3 = jxa.this;
                                    final icc iccVar4 = iccVar3;
                                    final Context context5 = context4;
                                    final vnb vnbVar3 = vnbVar2;
                                    final long j5 = j3;
                                    final String str3 = str2;
                                    final long j6 = j4;
                                    final TLObject tLObject7 = tLObject5;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    hl.c3(new Runnable() { // from class: mwa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            y16 y16Var;
                                            int i3;
                                            jxa jxaVar4 = jxa.this;
                                            TLObject tLObject8 = tLObject6;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            icc iccVar5 = iccVar4;
                                            Context context6 = context5;
                                            vnb vnbVar4 = vnbVar3;
                                            long j7 = j5;
                                            String str4 = str3;
                                            long j8 = j6;
                                            TLObject tLObject9 = tLObject7;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            e Q = LaunchActivity.Q();
                                            d31 Y = (Q == null || Q.visibleDialog != null) ? d31.Y() : d31.b0(Q);
                                            if (!(tLObject8 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 == null) {
                                                    i3 = 1;
                                                } else {
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!uc7.s1(jxaVar4.a).i5()) {
                                                            iccVar5.a(Boolean.FALSE, null);
                                                            jxa.d0(context6, vnbVar4);
                                                            return;
                                                        } else {
                                                            boolean[] zArr = {false};
                                                            dza dzaVar = new dza(context6, vnbVar4, j7, 6, str4, new nm1((Object) jxaVar4, (Object) zArr, j8, (Object) tLObject9, (Object) tL_textWithEntities5, (Object) iccVar5, (byte) 4), 0L);
                                                            dzaVar.setOnDismissListener(new gwa((byte) 1, iccVar5, zArr));
                                                            dzaVar.show();
                                                            return;
                                                        }
                                                    }
                                                    i3 = 1;
                                                    if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        iccVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                        return;
                                                    }
                                                }
                                                iccVar5.a(Boolean.FALSE, null);
                                                Object[] objArr = new Object[i3];
                                                objArr[0] = tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS";
                                                Y.Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, objArr)).j();
                                                return;
                                            }
                                            Utilities.d.c(new fwa(jxaVar4, (TLRPC.TL_payments_paymentResult) tLObject8, (byte) 3));
                                            jxaVar4.Q(true);
                                            iccVar5.a(Boolean.TRUE, null);
                                            nj0 b = pj0.a(jxaVar4.a).b();
                                            if (b != null && b.a(j8)) {
                                                uc7.s1(jxaVar4.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                            }
                                            uc7.s1(jxaVar4.a).X3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity == null || (y16Var = launchActivity.w0) == null) {
                                                return;
                                            }
                                            y16Var.c(true);
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

    public final void e0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r47 r47Var = (r47) list.get(0);
        long B0 = r47.B0(r47Var.k);
        int i = this.a;
        if (B0 >= 0) {
            uc7.s1(i).f3(uc7.s1(i).X1(Long.valueOf(B0)), 0, true, null);
        } else {
            uc7.s1(i).e3(0, -B0, true);
        }
        d31.b0(LaunchActivity.S()).Q(R.raw.error, 36, nza.T0(TextUtils.concat(ob6.G((int) r47Var.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", ob6.G((int) r47Var.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
    }

    public final void f(final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z, final icc iccVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final vnb F = F();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            o(new ss0(this, iccVar, tL_payments_paymentFormStarGift, starGift, j, tL_textWithEntities, z));
            return;
        }
        final String k = wf3.k(this.a, j);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = uc7.s1(this.a).j1(j);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = xw0.u(F, false);
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: ewa
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final jxa jxaVar = jxa.this;
                final icc iccVar2 = iccVar;
                final Context context3 = context2;
                final vnb vnbVar = F;
                final long j4 = j3;
                final String str = k;
                final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = tL_payments_paymentFormStarGift;
                final TL_stars.StarGift starGift2 = starGift;
                final long j5 = j;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                final boolean z2 = z;
                hl.c3(new Runnable() { // from class: jwa
                    @Override // java.lang.Runnable
                    public final void run() {
                        y16 y16Var;
                        final jxa jxaVar2 = jxa.this;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final icc iccVar3 = iccVar2;
                        Context context4 = context3;
                        vnb vnbVar2 = vnbVar;
                        long j6 = j4;
                        String str2 = str;
                        final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift3 = tL_payments_paymentFormStarGift2;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final long j7 = j5;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        final boolean z3 = z2;
                        e Q = LaunchActivity.Q();
                        d31 Y = (Q == null || Q.visibleDialog != null) ? d31.Y() : d31.b0(Q);
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null) {
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!uc7.s1(jxaVar2.a).i5()) {
                                        iccVar3.a(Boolean.FALSE, null);
                                        jxa.d0(context4, vnbVar2);
                                        return;
                                    } else {
                                        final boolean[] zArr = {false};
                                        dza dzaVar = new dza(context4, vnbVar2, j6, 6, str2, new Runnable() { // from class: owa
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zArr[0] = true;
                                                jxa.this.f(tL_payments_paymentFormStarGift3, starGift3, j7, tL_textWithEntities3, z3, iccVar3);
                                            }
                                        }, 0L);
                                        dzaVar.setOnDismissListener(new gwa((byte) 2, iccVar3, zArr));
                                        dzaVar.show();
                                        return;
                                    }
                                }
                                if ("STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                                    iccVar3.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                    return;
                                }
                            }
                            iccVar3.a(Boolean.FALSE, null);
                            Y.Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                            return;
                        }
                        Utilities.d.c(new fwa(jxaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, (byte) 4));
                        jxaVar2.D = false;
                        jxaVar2.E = true;
                        jxaVar2.G = 0L;
                        jxaVar2.U();
                        jxaVar2.M(j7);
                        jxaVar2.Q(true);
                        iccVar3.a(Boolean.TRUE, null);
                        nj0 b = pj0.a(jxaVar2.a).b();
                        if (b != null && b.a(j7)) {
                            uc7.s1(jxaVar2.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j7, false).apply();
                        }
                        uc7.s1(jxaVar2.a).X3.edit().putBoolean("show_gift_for_" + j7, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j7, true).apply();
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity == null || (y16Var = launchActivity.w0) == null) {
                            return;
                        }
                        y16Var.c(true);
                    }
                });
            }
        });
    }

    public final void f0(LaunchActivity launchActivity, long j, String str) {
        if (this.e) {
            g0(launchActivity, j, str);
        } else {
            o(new y09((Object) this, (Object) launchActivity, j, (Object) str, (byte) 8));
        }
    }

    public final void g(final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final p4a p4aVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final vnb F = F();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            o(new Runnable() { // from class: pva
                @Override // java.lang.Runnable
                public final void run() {
                    jxa jxaVar = jxa.this;
                    boolean z3 = jxaVar.e;
                    p4a p4aVar2 = p4aVar;
                    if (z3) {
                        jxaVar.g(starGift, z, z2, j, tL_textWithEntities, p4aVar2);
                    } else {
                        jxa.c("NO_BALANCE");
                        p4aVar2.a(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String k = wf3.k(this.a, j);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z;
        tL_inputInvoiceStarGift.peer = uc7.s1(this.a).j1(j);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z2;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = xw0.u(F, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: qva
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final jxa jxaVar = jxa.this;
                final p4a p4aVar2 = p4aVar;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final vnb vnbVar = F;
                final String str = k;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z3 = z;
                final boolean z4 = z2;
                final long j2 = j;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                hl.c3(new Runnable() { // from class: dwa
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z5 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final p4a p4aVar3 = p4aVar2;
                        if (!z5) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            jxa.c(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            p4aVar3.a(Boolean.FALSE, null);
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
                        final jxa jxaVar2 = jxa.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jxaVar2.a);
                        final Context context4 = context3;
                        final vnb vnbVar2 = vnbVar;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z6 = z3;
                        final boolean z7 = z4;
                        final long j4 = j2;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: iwa
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final jxa jxaVar3 = jxa.this;
                                final p4a p4aVar4 = p4aVar3;
                                final Context context5 = context4;
                                final vnb vnbVar3 = vnbVar2;
                                final long j5 = j3;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z8 = z6;
                                final boolean z9 = z7;
                                final long j6 = j4;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                hl.c3(new Runnable() { // from class: uva
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r10v6 */
                                    /* JADX WARN: Type inference failed for: r10v7, types: [boolean] */
                                    /* JADX WARN: Type inference failed for: r10v8 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str4;
                                        SpannableStringBuilder spannableStringBuilder;
                                        y16 y16Var;
                                        ?? r10;
                                        jxa jxaVar4 = jxa.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        p4a p4aVar5 = p4aVar4;
                                        Context context6 = context5;
                                        vnb vnbVar4 = vnbVar3;
                                        long j7 = j5;
                                        String str5 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z10 = z8;
                                        boolean z11 = z9;
                                        long j8 = j6;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        e Q = LaunchActivity.Q();
                                        d31 Y = (Q == null || Q.visibleDialog != null) ? d31.Y() : d31.b0(Q);
                                        if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                            if (tL_error4 != null) {
                                                if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (!uc7.s1(jxaVar4.a).i5()) {
                                                        p4aVar5.a(Boolean.FALSE, null);
                                                        jxa.d0(context6, vnbVar4);
                                                        return;
                                                    } else {
                                                        boolean[] zArr = {false};
                                                        dza dzaVar = new dza(context6, vnbVar4, j7, 6, str5, new kwa(jxaVar4, zArr, starGift5, z10, z11, j8, tL_textWithEntities5, p4aVar5), 0L);
                                                        dzaVar.setOnDismissListener(new gf(p4aVar5, zArr, (byte) 16));
                                                        dzaVar.show();
                                                        return;
                                                    }
                                                }
                                                if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    p4aVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if ("STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    p4aVar5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                }
                                            }
                                            p4aVar5.a(Boolean.FALSE, null);
                                            Y.Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS")).j();
                                            return;
                                        }
                                        Utilities.d.c(new fwa(jxaVar4, (TLRPC.TL_payments_paymentResult) tLObject4, (byte) 2));
                                        jxaVar4.D = false;
                                        jxaVar4.E = true;
                                        jxaVar4.G = 0L;
                                        jxaVar4.U();
                                        jxaVar4.M(j8);
                                        jxaVar4.Q(true);
                                        p4aVar5.a(Boolean.TRUE, null);
                                        nj0 b = pj0.a(jxaVar4.a).b();
                                        if (b != null && b.a(j8)) {
                                            uc7.s1(jxaVar4.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            str4 = str5;
                                            spannableStringBuilder = null;
                                        } else {
                                            int i2 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i2;
                                            spannableStringBuilder = hl.S2(ob6.H(',', "Gift2SentRemainsLimit", Math.max(0, i2)));
                                            str4 = str5;
                                        }
                                        if (j8 < 0) {
                                            long j9 = -j8;
                                            TLRPC.ChatFull N0 = uc7.s1(jxaVar4.a).N0(j9);
                                            if (N0 != null) {
                                                N0.stargifts_count++;
                                                N0.flags2 |= 262144;
                                                uc7.s1(jxaVar4.a).b4(N0);
                                            }
                                            if (Q instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) Q;
                                                if (profileActivity.a() == j8) {
                                                    gr8 gr8Var = profileActivity.O;
                                                    if (gr8Var != null) {
                                                        gr8Var.N1(true);
                                                        profileActivity.O.f1(14);
                                                        r10 = 0;
                                                        profileActivity.k3(false);
                                                    } else {
                                                        r10 = 0;
                                                    }
                                                    d31 b0 = d31.b0(Q);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String M0 = ob6.M0(2131744766, null);
                                                    if (spannableStringBuilder == null) {
                                                        Object[] objArr = new Object[1];
                                                        objArr[r10] = str4;
                                                        spannableStringBuilder = hl.S2(ob6.G((int) j7, "StarsGiftCompletedChannelText", objArr));
                                                    }
                                                    b0.s(document, M0, spannableStringBuilder).k(r10);
                                                }
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", j9);
                                            bundle.putBoolean("open_gifts", true);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                            profileActivity2.whenFullyVisible(new da7((Object) profileActivity2, (Object) starGift5, (Object) spannableStringBuilder, j7, (Object) str4, (byte) 19));
                                            Q.presentFragment(profileActivity2);
                                        } else if ((Q instanceof zu1) && ((zu1) Q).a() == j8) {
                                            d31 b02 = d31.b0(Q);
                                            TLRPC.Document document2 = starGift5.sticker;
                                            String M02 = ob6.M0(2131744766, null);
                                            if (spannableStringBuilder == null) {
                                                spannableStringBuilder = hl.S2(ob6.G((int) j7, "StarsGiftCompletedText", new Object[0]));
                                            }
                                            b02.s(document2, M02, spannableStringBuilder).k(true);
                                        } else {
                                            jn7 f = jn7.f(jxaVar4.a);
                                            int i3 = jn7.u;
                                            Long valueOf = Long.valueOf(j8);
                                            Boolean bool = Boolean.FALSE;
                                            f.k(i3, valueOf, bool);
                                            jn7.f(jxaVar4.a).k(jn7.t, Long.valueOf(j8), bool);
                                            zu1 ha = zu1.ha(j8);
                                            ha.whenFullyVisible(new y09((Object) ha, (Object) starGift5, (Object) spannableStringBuilder, j7, (byte) 7));
                                            Q.presentFragment(ha);
                                        }
                                        uc7.s1(jxaVar4.a).X3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || (y16Var = launchActivity.w0) == null) {
                                            return;
                                        }
                                        y16Var.c(true);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public final void g0(LaunchActivity launchActivity, long j, String str) {
        if (m().amount < j && j > 0) {
            new dza(launchActivity, null, j, 4, str, new kc((byte) 10), 0L).show();
            return;
        }
        e S2 = LaunchActivity.S();
        if (S2 == null) {
            return;
        }
        v21 K = d31.b0(S2).K(R.raw.stars_topup, ob6.M0(2131744621, null), ob6.M0(2131744620, null), new osa((byte) 2));
        K.j = 5000;
        K.k(true);
    }

    public final void h0(final long j, final long j2, boolean z, final boolean z2) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i = this.a;
        togglenopaidmessagesexception.user_id = uc7.s1(i).o1(j);
        if (j2 != 0) {
            togglenopaidmessagesexception.parent_peer = uc7.s1(i).j1(j2);
        }
        togglenopaidmessagesexception.refund_charged = z;
        togglenopaidmessagesexception.require_payment = !z2;
        ConnectionsManager.getInstance(i).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: nwa
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                hl.c3(new qd7(jxa.this, tLObject, j2, j, z2));
            }
        });
    }

    public final void i0(String str, TLRPC.ChatInvite chatInvite, icc iccVar) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        Context context2 = context;
        vnb F = F();
        long j = chatInvite.subscription_pricing.amount;
        if (context2 != null) {
            int i = yac.t0;
            byte b = 0;
            boolean[] zArr = {false};
            wwa wwaVar = new wwa(this, j, i, zArr, iccVar, context2, F, chatInvite, str);
            ida idaVar = new ida(this, zArr, iccVar);
            nx0 h = uh9.h(1, F, context2, false);
            LinearLayout j2 = uh9.j(context2, 1);
            j2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(8.0f));
            FrameLayout frameLayout = new FrameLayout(context2);
            frameLayout.addView(new uya(context2, 40, 0), tre.c(-1.0f, -1));
            de0 de0Var = new de0(context2);
            de0Var.setRoundRadius(hl.L(80.0f));
            rb0 rb0Var = new rb0((vnb) null);
            rb0Var.r(chatInvite.color);
            String str2 = chatInvite.title;
            rb0Var.A = true;
            rb0Var.n = (byte) 0;
            rb0Var.m = false;
            rb0.a(str2, null, null, rb0Var.q);
            TLRPC.Photo photo = chatInvite.photo;
            if (photo != null) {
                de0Var.m(jn5.i(xb4.w(photo.sizes, hl.L(80.0f), false, null, false), chatInvite.photo), "80_80", rb0Var, chatInvite);
            } else {
                de0Var.setImageDrawable(rb0Var);
            }
            frameLayout.addView(de0Var, tre.e(80, 80, 17));
            Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
            int i2 = aob.h5;
            yob.x(frameLayout, drawable, i2, F, PorterDuff.Mode.SRC_IN);
            Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            frameLayout.addView(imageView, tre.e(26, 26, 17));
            imageView.setTranslationX(hl.L(26.0f));
            imageView.setTranslationY(hl.L(26.0f));
            imageView.setScaleX(1.2f);
            imageView.setScaleY(1.2f);
            ImageView imageView2 = new ImageView(context2);
            imageView2.setImageDrawable(drawable2);
            frameLayout.addView(imageView2, tre.e(26, 26, 17));
            imageView2.setTranslationX(hl.L(26.0f));
            imageView2.setTranslationY(hl.L(26.0f));
            cza czaVar = new cza(i, F, context2);
            iye.a(czaVar);
            czaVar.setOnClickListener(new jya(czaVar, b));
            frameLayout.addView(czaVar, tre.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
            j2.addView(frameLayout, tre.r(-1, jn7.B1, 7));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(hl.o());
            int i3 = aob.j5;
            ik8.x(textView, i3, F, null, 2131744669);
            textView.setGravity(17);
            TextView m = ik8.m(j2, textView, tre.t(-2, -2, 1, 0, 8, 0, 0), context2);
            m.setTextSize(1, 14.0f);
            yob.X(m, i3, F);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
            int i4 = tL_starsSubscriptionPricing.period;
            if (i4 == 2592000) {
                m.setText(hl.S2(ob6.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
            } else {
                m.setText(hl.S2(ob6.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, i4 == 300 ? "5 minutes" : "a minute")));
            }
            m.setMaxWidth(kg5.a(m.getText(), m.getPaint()));
            m.setGravity(17);
            j2.addView(m, tre.t(-2, -2, 1, 0, 6, 0, 22));
            if (!TextUtils.isEmpty(chatInvite.about)) {
                TextView textView2 = new TextView(context2);
                textView2.setTextSize(1, 14.0f);
                yob.X(textView2, i3, F);
                textView2.setText(pv3.m(chatInvite.about, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setGravity(17);
                j2.addView(textView2, tre.t(-2, -2, 1, 0, 6, 0, 22));
            }
            c51 c51Var = new c51(F, context2, true);
            c51Var.i(ob6.M0(2131744678, null), false, true);
            j2.addView(c51Var, tre.o(-1, 48));
            p66 p66Var = new p66(context2, F);
            p66Var.setText(hl.N2(ob6.M0(2131744677, null), -1, 0, new xf1(context2, (byte) 19), null));
            p66Var.setGravity(17);
            p66Var.setTextSize(1, 13.0f);
            yob.X(p66Var, aob.B6, F);
            yob.G(p66Var, aob.Xc, F);
            j2.addView(p66Var, tre.t(-1, -2, 49, 14, 14, 14, 6));
            h.O = j2;
            c51Var.setOnClickListener(new lw4(wwaVar, h, c51Var, (byte) 22));
            h.setOnDismissListener(new dl8(idaVar, (byte) 8));
            h.L(i2);
            e S2 = LaunchActivity.S();
            if (!hl.O1() && S2 != null && !hl.s1(S2)) {
                h.X(S2);
            }
            h.show();
        }
    }

    public final void j0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f.equals(starsAmount);
        int i = jn7.A3;
        int i2 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            jn7.f(i2).k(i, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            jn7.f(i2).k(i, new Object[0]);
        }
    }

    public final TL_stars.SavedStarGift k(long j) {
        TL_stars.StarGift starGift;
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i >= longSparseArray.size()) {
                return null;
            }
            axa axaVar = (axa) longSparseArray.valueAt(i);
            for (int i2 = 0; i2 < axaVar.l.size(); i2++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) axaVar.l.get(i2);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.id == j) {
                    return savedStarGift;
                }
            }
            i++;
        }
    }

    public final void k0(final r47 r47Var, final long j, final Runnable runnable, final boolean z) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (r47Var == null) {
            runnable.run();
            return;
        }
        final long B0 = r47.B0(r47Var.k);
        final int e1 = r47Var.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) r47Var.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i = this.a;
        tL_messages_editMessage.peer = uc7.s1(i).j1(B0);
        int i2 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i2;
        tL_messages_editMessage.schedule_date = r47Var.k.date;
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
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: qwa
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                hl.c3(new af7(jxa.this, tLObject, runnable, tL_error, z, B0, e1, r47Var, j));
            }
        });
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new isa(this, runnable, (byte) 2));
        }
        if (!z || this.g <= 0) {
            return this.f;
        }
        oj n = oj.n(this.f);
        return oj.h(Math.max(0L, n.a() - this.g), n.a).q();
    }

    public final void o(Runnable runnable) {
        n(runnable, true, false);
    }

    public final oj p() {
        oj m = oj.m(m());
        if (m == null) {
            return oj.j(0L, this.b ? pj.b : pj.a);
        }
        return m;
    }

    public final ArrayList r() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new lwa(this, (byte) 3));
        return this.m;
    }

    public final ArrayList s() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new lwa(this, (byte) 4));
        return this.p;
    }

    public final ArrayList w() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new lwa(this, (byte) 1));
        return this.j;
    }

    public final long x(r47 r47Var) {
        Long l;
        hxa hxaVar = this.B;
        if (hxaVar != null && hxaVar.a.equals(cxa.b(r47Var)) && (l = this.B.n) != null) {
            return l.longValue();
        }
        Long z1 = r47Var == null ? null : r47Var.z1();
        if (z1 != null) {
            return z1.longValue();
        }
        Long x1 = uc7.s1(this.a).x1();
        if (x1 != null) {
            return x1.longValue();
        }
        return 0L;
    }

    public final long y(cxa cxaVar, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l;
        hxa hxaVar = this.B;
        if (hxaVar != null && hxaVar.a.equals(cxaVar) && (l = this.B.n) != null) {
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
                        l2 = Long.valueOf(wf3.n(peer));
                        break;
                    }
                }
            }
        }
        if (l2 != null) {
            return l2.longValue();
        }
        Long x1 = uc7.s1(this.a).x1();
        if (x1 != null) {
            return x1.longValue();
        }
        return 0L;
    }

    public final void z(long j, long j2, pcc pccVar) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i = this.a;
        getpaidmessagesrevenue.user_id = uc7.s1(i).o1(j);
        if (j2 != 0) {
            getpaidmessagesrevenue.parent_peer = uc7.s1(i).j1(j2);
        }
        ConnectionsManager.getInstance(i).sendRequest(getpaidmessagesrevenue, new ug1(pccVar, (byte) 2));
    }
}
