package hh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hz0;
import org.telegram.ui.pa0;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u7 {
    public static volatile u7[][] S = (u7[][]) Array.newInstance((Class<?>) u7.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public t7 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public q7 N;
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
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                T[i10][i11] = new Object();
            }
        }
    }

    public u7(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    public static org.telegram.ui.ActionBar.c6 I() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            return U.getResourceProvider();
        }
        return null;
    }

    public static u7 L(int i10) {
        return y(i10, true);
    }

    public static boolean U(int i10, hf.a aVar) {
        return aVar == null || x(i10, aVar.a).s().b >= aVar.b;
    }

    public static /* synthetic */ void a(u7 u7Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = u7Var.I;
        ArrayList arrayList2 = u7Var.J;
        int i10 = u7Var.a;
        ArrayList arrayList3 = u7Var.H;
        u7Var.C = false;
        u7Var.D = true;
        if (!(starGifts instanceof TL_stars.TL_starGifts)) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i11 = u7Var.F;
                long currentTimeMillis = System.currentTimeMillis();
                u7Var.G = currentTimeMillis;
                u7Var.c0(i11, currentTimeMillis, arrayList3);
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        MessagesController.getInstance(i10).putUsers(tL_starGifts.users, false);
        MessagesController.getInstance(i10).putChats(tL_starGifts.chats, false);
        MessagesStorage.getInstance(i10).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList3.clear();
        arrayList3.addAll(tL_starGifts.gifts);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new gf.d(4)), new gf.d(5)));
        arrayList.clear();
        arrayList.addAll(arrayList3);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new gf.d(6)));
        u7Var.F = tL_starGifts.hash;
        u7Var.G = System.currentTimeMillis();
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        u7Var.c0(u7Var.F, u7Var.G, tL_starGifts.gifts);
    }

    public static /* synthetic */ void b(u7 u7Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = u7Var.a;
        MessagesController.getInstance(i10).putUsers(arrayList2, true);
        MessagesController.getInstance(i10).putChats(arrayList3, true);
        u7Var.E = true;
        ArrayList arrayList4 = u7Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = u7Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new gf.d(1)), new gf.d(2)));
        ArrayList arrayList6 = u7Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new gf.d(3)));
        u7Var.F = num.intValue();
        u7Var.G = l10.longValue();
        u7Var.C = false;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        u7Var.V();
    }

    public static void e(String str) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{str}, (R == null || R.visibleDialog != null) ? mc.X() : mc.a0(R), R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.StarsNotAvailableText);
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    public static boolean k(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i10 = savedStarGift.flags;
        if ((i10 & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            return ((i10 & 8) == 0 || (savedStarGift2.flags & 8) == 0 || savedStarGift.msg_id != savedStarGift2.msg_id) ? false : true;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute l(ArrayList arrayList, Class cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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

    public static Context t(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getContext() != null) {
            return n2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.C1;
        }
        if (ApplicationLoader.applicationContext != null) {
            return ApplicationLoader.applicationContext;
        }
        return null;
    }

    public static u7 w(int i10) {
        return y(i10, false);
    }

    public static u7 x(int i10, hf.b bVar) {
        return y(i10, bVar == hf.b.b);
    }

    public static u7 y(int i10, boolean z10) {
        u7 u7Var;
        u7 u7Var2 = S[z10 ? 1 : 0][i10];
        if (u7Var2 != null) {
            return u7Var2;
        }
        synchronized (T[z10 ? 1 : 0][i10]) {
            try {
                u7Var = S[z10 ? 1 : 0][i10];
                if (u7Var == null) {
                    u7[] u7VarArr = S[z10 ? 1 : 0];
                    u7 u7Var3 = new u7(i10, z10);
                    u7VarArr[i10] = u7Var3;
                    u7Var = u7Var3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u7Var;
    }

    public final long A(o7 o7Var, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l10;
        t7 t7Var = this.B;
        if (t7Var != null && t7Var.a.equals(o7Var) && (l10 = this.B.n) != null) {
            return l10.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(tL_messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final long B(MessageObject messageObject) {
        Long l10;
        t7 t7Var = this.B;
        if (t7Var != null && t7Var.a.equals(o7.b(messageObject)) && (l10 = this.B.n) != null) {
            return l10.longValue();
        }
        Long myPaidReactionPeer = messageObject == null ? null : messageObject.getMyPaidReactionPeer();
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i10 = this.a;
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new w6(0, callback));
    }

    public final long D(int i10, long j10) {
        t7 t7Var = this.B;
        if (t7Var == null) {
            return 0L;
        }
        o7 o7Var = t7Var.a;
        if (o7Var.a == j10 && o7Var.b == i10 && t7Var.l) {
            return t7Var.h;
        }
        return 0L;
    }

    public final long E(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null) ? D(messageObject.messageOwner.fwd_from.saved_from_msg_id, messageObject.getFromChatId()) : D(messageObject.getId(), messageObject.getDialogId());
    }

    public final k7 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        k7 k7Var = (k7) longSparseArray.get(j10);
        if (k7Var != null || !z10) {
            return k7Var;
        }
        k7 k7Var2 = new k7(this.a, j10);
        longSparseArray.put(j10, k7Var2);
        return k7Var2;
    }

    public final m7 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        m7 m7Var = (m7) longSparseArray.get(j10);
        if (m7Var != null || !z10) {
            return m7Var;
        }
        m7 m7Var2 = new m7(this.a, j10, true);
        longSparseArray.put(j10, m7Var2);
        return m7Var2;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback callback) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.c6 I = I();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            r(new e2(this, callback, starGift, j10));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.a).getInputPeer(j10);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject p6 = nh.b3.p(I, false);
        if (p6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new cg.g0(8, this, callback));
    }

    public final TL_stars.StarGift J(long j10) {
        V();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
            if (starGift.id == j10) {
                return starGift;
            }
            i10++;
        }
    }

    public final void K(long j10, Utilities.Callback callback) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j10));
        if (stargiftupgradepreview != null) {
            callback.run(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j10;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new cg.c0(this, j10, callback, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new gh.f1(this, b2Var, inputSavedStarGift, callback, 3));
    }

    public final boolean N() {
        return O(0);
    }

    public final boolean O(int i10) {
        return this.e && !this.q[i10].isEmpty();
    }

    public final void P() {
        this.e = false;
        p();
        this.e = true;
    }

    public final void Q(long j10) {
        m7 G = G(j10, false);
        if (G != null) {
            G.i(false);
        }
        k7 k7Var = (k7) this.K.get(j10);
        if (k7Var != null) {
            k7Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j10 = userFull.id;
        m7 G = G(j10, false);
        if (G != null && G.n != userFull.stargifts_count) {
            G.i(false);
        }
        k7 k7Var = (k7) this.K.get(j10);
        if (k7Var != null) {
            k7Var.g();
        }
    }

    public final void S() {
        if (this.x) {
            return;
        }
        this.v.clear();
        this.w = null;
        this.x = false;
        this.y = false;
        W();
    }

    public final void T(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.t;
            if (!zArr[i10]) {
                this.q[i10].clear();
                this.s[i10] = null;
                zArr[i10] = false;
                this.u[i10] = false;
                if (z10) {
                    X(i10);
                }
            }
        }
    }

    public final void V() {
        if (this.C) {
            return;
        }
        if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
            this.C = true;
            boolean z10 = this.E;
            int i10 = this.a;
            if (z10) {
                int i11 = this.F;
                ag.n0 n0Var = new ag.n0(this, 16);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new cf.a(n0Var, 8));
                return;
            }
            h3.x xVar = new h3.x(this, 9);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new cg.k0(messagesStorage, arrayList3, arrayList2, arrayList, xVar, 9));
        }
    }

    public final void W() {
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new l6(this, 1));
    }

    public final void X(int i10) {
        boolean[] zArr = this.t;
        if (zArr[i10] || this.u[i10]) {
            return;
        }
        zArr[i10] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = this.b;
        tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
        tL_payments_getStarsTransactions.inbound = i10 == 1;
        tL_payments_getStarsTransactions.outbound = i10 == 2;
        String str = this.s[i10];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new u1(this, i10, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04c2  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, Utilities.Callback callback) {
        long j10;
        String str;
        boolean z10;
        org.telegram.ui.ActionBar.e3 e3Var;
        m6 m6Var;
        n6 n6Var;
        ViewGroup viewGroup;
        MessageObject messageObject2;
        int i10;
        float f10;
        int i11;
        long j11;
        int i12;
        long j12;
        TLRPC.Message message;
        String str2;
        boolean z11;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i13;
        int i14;
        char c10;
        String formatPluralString;
        String formatPluralString2;
        char c11;
        String formatPluralString3;
        boolean z12;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message2;
        int i15;
        int i16;
        o9 o9Var;
        LinearLayout linearLayout;
        ImageLocation imageLocation;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        MessagesController.getInstance(this.a).putUsers(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.c6 I = I();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            r(new gh.i1(this, (Object) runnable, messageObject, inputInvoice, tL_payments_paymentFormStars, callback, 4));
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        long j13 = 0;
        int i17 = 0;
        while (i17 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i17);
            i17++;
            j13 += tL_labeledPrice.amount;
        }
        if (messageObject == null || messageObject.type != 29) {
            j10 = tL_payments_paymentFormStars.bot_id;
        } else {
            TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.messageOwner.fwd_from;
            j10 = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? messageObject.getDialogId() : DialogObject.getPeerDialogId(peer2);
        }
        long j14 = j10;
        if (j14 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.a).getUser(Long.valueOf(j14));
            String userName = UserObject.getUserName(user2);
            UserObject.isBot(user2);
            str = userName;
            z10 = !UserObject.isBot(user2);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.a).getChat(Long.valueOf(-j14));
            str = chat == null ? "" : chat.title;
            z10 = false;
        }
        String str3 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i18 = tL_payments_paymentFormStars.invoice.subscription_period;
        long j15 = j13;
        boolean[] zArr = {false};
        int i19 = this.a;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        m6 m6Var2 = new m6(this, j15, zArr, callback, context2, I, z10, str, messageObject, inputInvoice, tL_payments_paymentFormStars, i18, j14);
        n6 n6Var2 = new n6(this, zArr, callback);
        org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(context2, I, false, false);
        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j14));
        LinearLayout g10 = org.telegram.messenger.y1.g(context2, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.addView(new m9(context2, 40, 0), h7.z5.c(-1.0f, -1));
        if (messageObject == null || (message2 = messageObject.messageOwner) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            e3Var = o10;
            m6Var = m6Var2;
            n6Var = n6Var2;
            viewGroup = g10;
            messageObject2 = messageObject;
            i10 = i18;
            if (webDocument != null) {
                FrameLayout frameLayout2 = new FrameLayout(context2);
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context2);
                n9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
                n9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "80_80", null, null);
                frameLayout2.addView(n9Var, h7.z5.e(80, 80, 48));
                frameLayout.addView(frameLayout2, h7.z5.e(80, 87, 17));
                TextView textView = new TextView(context2);
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                f10 = 13.0f;
                textView.setTextSize(1, 13.0f);
                i11 = -1;
                textView.setTextColor(-1);
                j11 = j15;
                textView.setText(oa.R0(i0.a.m((int) j15, ',', new StringBuilder("XTR ")), 0.85f, null));
                i12 = 0;
                textView.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
                textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(16.0f), -1133566));
                FrameLayout frameLayout3 = new FrameLayout(context2);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, I)));
                frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                frameLayout3.addView(textView, h7.z5.q(-2, 16, 119));
                frameLayout2.addView(frameLayout3, h7.z5.a(-2.0f, 18.66f, 81));
                da daVar = new da(context2, i19, I);
                h7.b6.a(daVar);
                daVar.setOnClickListener(new k8(daVar, i12));
                frameLayout.addView(daVar, h7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                viewGroup.addView(frameLayout, h7.z5.q(i11, 117, 7));
                TextView h = org.telegram.messenger.y1.h(context2, 1, 20.0f);
                h.setTypeface(AndroidUtilities.bold());
                int i20 = org.telegram.ui.ActionBar.g6.j5;
                h.setTextColor(org.telegram.ui.ActionBar.g6.v0(i20, I));
                if (i10 <= 0) {
                    h.setText(Emoji.replaceEmoji(webDocument != null ? str3 : LocaleController.getString(R.string.StarsConfirmSubscriptionTitle), h.getPaint().getFontMetricsInt(), i12));
                } else {
                    h.setText(Emoji.replaceEmoji(webDocument != null ? str3 : LocaleController.getString(R.string.StarsConfirmPurchaseTitle), h.getPaint().getFontMetricsInt(), i12));
                }
                NotificationCenter.listenEmojiLoading(h);
                h.setGravity(17);
                viewGroup.addView(h, h7.z5.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                if (webDocument != null) {
                    LinearLayout g11 = org.telegram.messenger.y1.g(context2, i12);
                    g11.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, I)));
                    org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context2);
                    n9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
                    org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                    y8Var.r(user3);
                    n9Var2.e(user3, y8Var);
                    g11.addView(n9Var2, h7.z5.n(28, 28));
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, f10);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, I));
                    textView2.setText(UserObject.getUserName(user3));
                    g11.addView(textView2, h7.z5.t(-2, -2, 16, 6, 0, 10, 0));
                    viewGroup.addView(g11, h7.z5.t(-2, 28, 1, 0, 8, 0, 2));
                }
                TextView h10 = org.telegram.messenger.y1.h(context2, 1, 14.0f);
                h10.setTextColor(org.telegram.ui.ActionBar.g6.v0(i20, I));
                if (messageObject2 == null && (message = messageObject2.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    long dialogId = messageObject2.getDialogId();
                    TLRPC.Message message3 = messageObject2.messageOwner;
                    if (message3 != null && (messageFwdHeader = message3.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        dialogId = DialogObject.getPeerDialogId(peer);
                    }
                    if (dialogId < 0 && messageObject2.getFromChatId() > 0 && (user = MessagesController.getInstance(i19).getUser(Long.valueOf(messageObject2.getFromChatId()))) != null && user.bot) {
                        dialogId = user.id;
                    }
                    if (dialogId >= 0) {
                        TLRPC.User user4 = MessagesController.getInstance(i19).getUser(Long.valueOf(dialogId));
                        str2 = UserObject.getUserName(user4);
                        if (user4 != null && user4.bot) {
                            z11 = true;
                            tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                            i14 = 0;
                            int i21 = 0;
                            for (i13 = 0; i13 < tL_messageMediaPaidMedia.extended_media.size(); i13++) {
                                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i13);
                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                                    if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                        z12 = true;
                                    }
                                    z12 = false;
                                } else {
                                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                        z12 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                                    }
                                    z12 = false;
                                }
                                if (z12) {
                                    i14++;
                                } else {
                                    i21++;
                                }
                            }
                            if (i14 != 0) {
                                String str4 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                long j16 = j11;
                                int i22 = (int) j16;
                                if (i21 == 1) {
                                    formatPluralString3 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                                    c11 = 1;
                                } else {
                                    c11 = 1;
                                    formatPluralString3 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i21, new Object[i12]);
                                }
                                Object[] objArr = new Object[2];
                                objArr[i12] = formatPluralString3;
                                objArr[c11] = str2;
                                formatPluralString2 = LocaleController.formatPluralString(str4, i22, objArr);
                                j12 = j16;
                            } else {
                                j12 = j11;
                                if (i21 == 0) {
                                    String str5 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                    int i23 = (int) j12;
                                    Object[] objArr2 = new Object[2];
                                    objArr2[i12] = i14 == 1 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i14, new Object[i12]);
                                    objArr2[1] = str2;
                                    formatPluralString2 = LocaleController.formatPluralString(str5, i23, objArr2);
                                } else {
                                    String str6 = z11 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                                    int i24 = (int) j12;
                                    if (i21 == 1) {
                                        formatPluralString = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                                        c10 = 2;
                                    } else {
                                        c10 = 2;
                                        formatPluralString = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i21, new Object[i12]);
                                    }
                                    String string = i14 == 1 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i14, new Object[i12]);
                                    Object[] objArr3 = new Object[3];
                                    objArr3[i12] = formatPluralString;
                                    objArr3[1] = string;
                                    objArr3[c10] = str2;
                                    formatPluralString2 = LocaleController.formatPluralString(str6, i24, objArr3);
                                }
                            }
                            h10.setText(AndroidUtilities.replaceTags(formatPluralString2));
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i19).getChat(Long.valueOf(-dialogId));
                        str2 = chat2 != null ? chat2.title : "";
                    }
                    z11 = false;
                    tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                    i14 = 0;
                    int i212 = 0;
                    while (i13 < tL_messageMediaPaidMedia.extended_media.size()) {
                    }
                    if (i14 != 0) {
                    }
                    h10.setText(AndroidUtilities.replaceTags(formatPluralString2));
                } else {
                    j12 = j11;
                    if (i10 <= 0) {
                        String userName2 = UserObject.getUserName(user3);
                        Object[] objArr4 = new Object[2];
                        objArr4[i12] = str3;
                        objArr4[1] = userName2;
                        h10.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j12, objArr4)));
                    } else {
                        String userName3 = UserObject.getUserName(user3);
                        Object[] objArr5 = new Object[2];
                        objArr5[i12] = str3;
                        objArr5[1] = userName3;
                        h10.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j12, objArr5)));
                    }
                }
                h10.setMaxWidth(lh.w3.a(h10.getText(), h10.getPaint()));
                h10.setGravity(17);
                viewGroup.addView(h10, h7.z5.t(-2, -2, 1, 0, 6, 0, 18));
                lh.d dVar = new lh.d(context2, I, true);
                if (i10 <= 0) {
                    dVar.g(oa.Q0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionButton", (int) j12))), i12, true);
                } else {
                    dVar.g(oa.Q0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", (int) j12))), i12, true);
                }
                viewGroup.addView(dVar, h7.z5.c(48.0f, -1));
                p80 p80Var = new p80(context2, I);
                p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, I));
                p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, I));
                p80Var.setTextSize(1, 14.0f);
                p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10 <= 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new e2.e(context2, 6)));
                p80Var.setGravity(17);
                viewGroup.addView(p80Var, h7.z5.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                e3Var2.customView = viewGroup;
                dVar.setOnClickListener(new gg.f(m6Var, e3Var2, dVar, 7));
                e3Var2.setOnDismissListener(new ag.j0(n6Var, 3));
                e3Var2.fixNavigationBar();
                e3Var2.show();
            }
            org.telegram.ui.Components.n9 n9Var3 = new org.telegram.ui.Components.n9(context2);
            n9Var3.setRoundRadius(AndroidUtilities.dp(80.0f));
            org.telegram.ui.Components.y8 y8Var2 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            y8Var2.r(user3);
            n9Var3.e(user3, y8Var2);
            frameLayout.addView(n9Var3, h7.z5.e(80, 80, 17));
        } else {
            o9 o9Var2 = new o9(context2);
            o9Var2.D = new Path();
            o9Var2.E = new RectF();
            o9Var2.F = context2.getResources().getDrawable(R.drawable.large_locked_post).mutate();
            o9Var2.setRoundRadius(AndroidUtilities.dp(24.0f));
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                e3Var = o10;
                n6Var = n6Var2;
                m6Var = m6Var2;
                viewGroup = g10;
                messageObject2 = messageObject;
                i10 = i18;
                i15 = 17;
                i16 = 80;
            } else {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                    imageLocation = ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, messageObject.messageOwner);
                    o9Var = o9Var2;
                } else {
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            o9Var = o9Var2;
                            imageLocation = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(80.0f), true), messageMedia.photo);
                        } else {
                            o9Var = o9Var2;
                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                imageLocation = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(80.0f), true), messageMedia.document);
                            }
                        }
                    } else {
                        o9Var = o9Var2;
                    }
                    linearLayout = g10;
                    imageLocation = null;
                    e3Var = o10;
                    viewGroup = linearLayout;
                    n6Var = n6Var2;
                    i10 = i18;
                    m6Var = m6Var2;
                    i15 = 17;
                    i16 = 80;
                    o9Var2 = o9Var;
                    o9Var2.l(imageLocation, "80_80_b2", null, null, null, messageObject);
                    messageObject2 = messageObject;
                }
                linearLayout = g10;
                e3Var = o10;
                viewGroup = linearLayout;
                n6Var = n6Var2;
                i10 = i18;
                m6Var = m6Var2;
                i15 = 17;
                i16 = 80;
                o9Var2 = o9Var;
                o9Var2.l(imageLocation, "80_80_b2", null, null, null, messageObject);
                messageObject2 = messageObject;
            }
            frameLayout.addView(o9Var2, h7.z5.e(i16, i16, i15));
        }
        j11 = j15;
        i11 = -1;
        f10 = 13.0f;
        i12 = 0;
        da daVar2 = new da(context2, i19, I);
        h7.b6.a(daVar2);
        daVar2.setOnClickListener(new k8(daVar2, i12));
        frameLayout.addView(daVar2, h7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        viewGroup.addView(frameLayout, h7.z5.q(i11, 117, 7));
        TextView h11 = org.telegram.messenger.y1.h(context2, 1, 20.0f);
        h11.setTypeface(AndroidUtilities.bold());
        int i202 = org.telegram.ui.ActionBar.g6.j5;
        h11.setTextColor(org.telegram.ui.ActionBar.g6.v0(i202, I));
        if (i10 <= 0) {
        }
        NotificationCenter.listenEmojiLoading(h11);
        h11.setGravity(17);
        viewGroup.addView(h11, h7.z5.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
        if (webDocument != null) {
        }
        TextView h102 = org.telegram.messenger.y1.h(context2, 1, 14.0f);
        h102.setTextColor(org.telegram.ui.ActionBar.g6.v0(i202, I));
        if (messageObject2 == null) {
        }
        j12 = j11;
        if (i10 <= 0) {
        }
        h102.setMaxWidth(lh.w3.a(h102.getText(), h102.getPaint()));
        h102.setGravity(17);
        viewGroup.addView(h102, h7.z5.t(-2, -2, 1, 0, 6, 0, 18));
        lh.d dVar2 = new lh.d(context2, I, true);
        if (i10 <= 0) {
        }
        viewGroup.addView(dVar2, h7.z5.c(48.0f, -1));
        p80 p80Var2 = new p80(context2, I);
        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, I));
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, I));
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10 <= 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new e2.e(context2, 6)));
        p80Var2.setGravity(17);
        viewGroup.addView(p80Var2, h7.z5.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
        org.telegram.ui.ActionBar.e3 e3Var22 = e3Var;
        e3Var22.customView = viewGroup;
        dVar2.setOnClickListener(new gg.f(m6Var, e3Var22, dVar2, 7));
        e3Var22.setOnDismissListener(new ag.j0(n6Var, 3));
        e3Var22.fixNavigationBar();
        e3Var22.show();
    }

    public final void Z(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final org.telegram.ui.ActionBar.c6 I = I();
        if (context == null) {
            return;
        }
        final long j10 = chatInvite.subscription_pricing.amount;
        final String str2 = chatInvite.title;
        TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
        tL_inputInvoiceChatInviteSubscription.hash = str;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: hh.w5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u7 u7Var = u7.this;
                final Utilities.Callback2 callback22 = callback2;
                final long j11 = j10;
                final String str3 = str2;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.c6 c6Var = I;
                final TLRPC.ChatInvite chatInvite2 = chatInvite;
                final String str4 = str;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.c6
                    @Override // java.lang.Runnable
                    public final void run() {
                        pa0 pa0Var;
                        u7 u7Var2 = u7.this;
                        TLObject tLObject2 = tLObject;
                        Utilities.Callback2 callback23 = callback22;
                        long j12 = j11;
                        String str5 = str3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        TLRPC.ChatInvite chatInvite3 = chatInvite2;
                        String str6 = str4;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        mc a02 = !AndroidUtilities.hasDialogOnTop(R) ? mc.a0(R) : mc.X();
                        int i10 = 0;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                callback23.run(0L, Boolean.FALSE);
                                org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, a02, R.raw.error, 36);
                                return;
                            } else if (!MessagesController.getInstance(u7Var2.a).starsPurchaseAvailable()) {
                                callback23.run(0L, Boolean.FALSE);
                                u7.e0(context3, c6Var2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                ea eaVar = new ea(context3, c6Var2, j12, 1, chatInvite3.title, new cg.k0(u7Var2, zArr, str6, chatInvite3, callback23, 8), 0L);
                                eaVar.setOnDismissListener(new i6(callback23, zArr, 0));
                                eaVar.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.stageQueue.postRunnable(new h6(u7Var2, tL_payments_paymentResult, i10));
                        TLRPC.Updates updates = tL_payments_paymentResult.updates;
                        TLRPC.Update update = updates.update;
                        long j13 = update instanceof TL_update.TL_updateChannel ? -((TL_update.TL_updateChannel) update).channel_id : 0L;
                        if (updates.updates != null) {
                            for (int i11 = 0; i11 < tL_payments_paymentResult.updates.updates.size(); i11++) {
                                if (tL_payments_paymentResult.updates.updates.get(i11) instanceof TL_update.TL_updateChannel) {
                                    j13 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i11)).channel_id;
                                }
                            }
                        }
                        callback23.run(Long.valueOf(j13), Boolean.TRUE);
                        if (j13 == 0) {
                            a02.M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j12, str5)), R.raw.stars_send).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null && (pa0Var = launchActivity.t0) != null) {
                            pa0Var.c(true);
                        }
                        u7Var2.T(true);
                        u7Var2.S();
                    }
                });
            }
        });
    }

    public final void a0(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Utilities.Callback callback) {
        long j10;
        String str;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final org.telegram.ui.ActionBar.c6 I = I();
        if (context == null) {
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        final long j11 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j11 += tL_labeledPrice.amount;
        }
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            j10 = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? messageObject.getDialogId() : DialogObject.getPeerDialogId(peer);
            if (j10 < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.a).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                j10 = user.id;
            }
        } else {
            j10 = tL_payments_paymentFormStars.bot_id;
        }
        final long j12 = j10;
        if (j12 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.a).getUser(Long.valueOf(j12)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.a).getChat(Long.valueOf(-j12));
            str = chat == null ? "" : chat.title;
        }
        final String str2 = str;
        final String str3 = tL_payments_paymentFormStars.title;
        final int i11 = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: hh.c7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u7 u7Var = u7.this;
                final Utilities.Callback callback2 = callback;
                final MessageObject messageObject2 = messageObject;
                final Context context2 = context;
                final long j13 = j11;
                final String str4 = str2;
                final int i12 = i11;
                final String str5 = str3;
                final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                final long j14 = j12;
                final org.telegram.ui.ActionBar.c6 c6Var = I;
                final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.f7
                    /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
                    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        boolean z10;
                        LaunchActivity launchActivity;
                        pa0 pa0Var;
                        TLRPC.Message message2;
                        u7 u7Var2 = u7.this;
                        TLObject tLObject2 = tLObject;
                        Utilities.Callback callback3 = callback2;
                        MessageObject messageObject3 = messageObject2;
                        Context context3 = context2;
                        long j15 = j13;
                        String str6 = str4;
                        int i13 = i12;
                        String str7 = str5;
                        TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                        long j16 = j14;
                        TLRPC.TL_error tL_error2 = tL_error;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        mc X = (R == null || R.visibleDialog != null) ? mc.X() : mc.a0(R);
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                if (!MessagesController.getInstance(u7Var2.a).starsPurchaseAvailable()) {
                                    callback3.run(Boolean.FALSE);
                                    u7.e0(context3, c6Var2);
                                    return;
                                } else {
                                    boolean[] zArr = {false};
                                    ea eaVar = new ea(context3, c6Var2, j15, 0, str6, new gh.i1(u7Var2, (Object) zArr, messageObject3, inputInvoice3, tL_payments_paymentFormStars3, callback3, 6), j16);
                                    eaVar.setOnDismissListener(new h7(callback3, zArr));
                                    eaVar.show();
                                    return;
                                }
                            }
                            if (tL_error2 != null && "FORM_EXPIRED".equals(tL_error2.text)) {
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject p6 = nh.b3.p(c6Var2, false);
                                if (p6 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = p6.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = inputInvoice3;
                                ConnectionsManager.getInstance(u7Var2.a).sendRequest(tL_payments_getPaymentForm, new cg.e0(u7Var2, messageObject3, inputInvoice3, callback3, X, 2));
                                return;
                            }
                            mc mcVar = X;
                            callback3.run(Boolean.FALSE);
                            org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, mcVar, R.raw.error, 36);
                            if (messageObject3 != null) {
                                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                tL_messages_getExtendedMedia.peer = MessagesController.getInstance(u7Var2.a).getInputPeer(j16);
                                tL_messages_getExtendedMedia.id.add(Integer.valueOf(messageObject3.getId()));
                                ConnectionsManager.getInstance(u7Var2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                return;
                            }
                            return;
                        }
                        callback3.run(Boolean.TRUE);
                        Utilities.stageQueue.postRunnable(new h6(u7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 4));
                        if (messageObject3 != null && (message2 = messageObject3.messageOwner) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            Drawable mutate = context3.getResources().getDrawable(R.drawable.star_small_inner).mutate();
                            String string = LocaleController.getString(R.string.StarsMediaPurchaseCompleted);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsMediaPurchaseCompletedInfo", (int) j15, str6));
                            X.getClass();
                            bc bcVar = new bc(X.W(), X.c);
                            bcVar.a.setImageDrawable(mutate);
                            bcVar.b.setText(string);
                            bcVar.c.setText(replaceTags);
                            X.b(bcVar, 2750).j();
                        } else {
                            if (i13 <= 0) {
                                z10 = true;
                                X.M(LocaleController.getString(R.string.StarsPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsPurchaseCompletedInfo", (int) j15, str7, str6)), R.raw.stars_send).j();
                                launchActivity = LaunchActivity.C1;
                                if (launchActivity != null && (pa0Var = launchActivity.t0) != null) {
                                    pa0Var.c(z10);
                                }
                                if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                    u7Var2.T(true);
                                }
                                if (messageObject3 == null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia2.peer = MessagesController.getInstance(u7Var2.a).getInputPeer(j16);
                                    tL_messages_getExtendedMedia2.id.add(Integer.valueOf(messageObject3.getId()));
                                    ConnectionsManager.getInstance(u7Var2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                    return;
                                }
                                return;
                            }
                            X.M(LocaleController.getString(R.string.StarsBotSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsBotSubscriptionCompletedInfo", (int) j15, str7, str6)), R.raw.stars_send).j();
                        }
                        z10 = true;
                        launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            pa0Var.c(z10);
                        }
                        if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                        }
                        u7Var2.T(true);
                        if (messageObject3 == null) {
                        }
                    }
                });
            }
        });
    }

    public final void b0(long j10, long j11, boolean z10) {
        int i10 = this.a;
        TopicsController topicsController = MessagesController.getInstance(i10).getTopicsController();
        TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, j11);
        if (findTopic != null) {
            findTopic.nopaid_messages_exception = z10;
            topicsController.saveTopics(j10);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
        }
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int id2 = ((MessageObject) obj).getId();
            hashSet.add(Integer.valueOf(id2));
            if (this.Q.remove(Integer.valueOf(id2))) {
                this.R.put(Integer.valueOf(id2), new androidx.car.app.utils.a(this, hashSet, runnable, 28));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void c0(int i10, long j10, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.a);
        messagesStorage.getStorageQueue().postRunnable(new x6(messagesStorage, j10, arrayList, i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        if (r12.a == r7) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0079, code lost:
    
        if (r4.intValue() >= 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0080, code lost:
    
        if (r2 >= 100) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(MessageObject messageObject) {
        boolean z10;
        p6 p6Var;
        org.telegram.ui.ActionBar.n2 U;
        q7 q7Var;
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return;
        }
        long j10 = message.paid_message_stars;
        if (j10 <= 0 || messageObject.isEphemeral()) {
            return;
        }
        q7 q7Var2 = this.N;
        if (q7Var2 == null || q7Var2.g <= 0 || !q7Var2.m || q7Var2.n || q7Var2.o) {
            if (!org.telegram.ui.Components.y4.d0(this.a, messageObject.getDialogId())) {
                Long l10 = (Long) this.O.get(Long.valueOf(messageObject.getDialogId()));
                if (l10 == null || System.currentTimeMillis() - l10.longValue() <= 5000) {
                    Integer num = (Integer) this.P.get(Long.valueOf(messageObject.getDialogId()));
                    if (num != null) {
                    }
                }
            }
            z10 = false;
            int id2 = messageObject.getId();
            if (z10) {
                this.Q.add(Integer.valueOf(id2));
            }
            long dialogId = messageObject.getDialogId();
            o6 o6Var = new o6(0, this, z10);
            p6Var = new p6(this, z10, id2, 0);
            U = LaunchActivity.U();
            q7Var = this.N;
            if (q7Var != null && (q7Var.o || q7Var.n)) {
                this.N = null;
            }
            if (this.N != null) {
                if (U != null && !U.isRemovingFromStack()) {
                    q7 q7Var3 = this.N;
                    if (q7Var3.b == dialogId) {
                    }
                }
                this.N.a();
                this.N = null;
            }
            if (U != null || U.isRemovingFromStack()) {
                p6Var.run();
            }
            if (this.N == null) {
                this.N = new q7(U, dialogId);
            }
            q7 q7Var4 = this.N;
            yb ybVar = q7Var4.d;
            cc ccVar = q7Var4.e;
            p7 p7Var = q7Var4.p;
            if (q7Var4.n || q7Var4.o) {
                p6Var.run();
                return;
            }
            q7Var4.g++;
            q7Var4.k.add(messageObject);
            q7Var4.h += j10;
            q7Var4.i = o6Var;
            q7Var4.j.add(p6Var);
            if (q7Var4.m && !z10) {
                q7Var4.m = false;
                AndroidUtilities.cancelRunOnUIThread(p7Var);
                ec ecVar = q7Var4.c;
                ecVar.j = 5000;
                ecVar.i(true);
                if (System.currentTimeMillis() - q7Var4.l > 500) {
                    ccVar.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                } else {
                    ccVar.setAlpha(0.0f);
                    ccVar.setVisibility(8);
                }
            }
            xb xbVar = q7Var4.f;
            if (xbVar != null && q7Var4.m) {
                xbVar.b = 3000L;
                AndroidUtilities.cancelRunOnUIThread(p7Var);
                AndroidUtilities.runOnUIThread(p7Var, 3000L);
            }
            org.telegram.ui.Components.j6 j6Var = ybVar.b;
            int i10 = q7Var4.g;
            j6Var.setText(i10 == 1 ? LocaleController.getString(R.string.PaidMessageSentTitleOne) : LocaleController.formatPluralString("PaidMessageSentTitle", i10, new Object[0]));
            ybVar.c.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) q7Var4.h))));
            ybVar.a.d();
            return;
        }
        z10 = true;
        int id22 = messageObject.getId();
        if (z10) {
        }
        long dialogId2 = messageObject.getDialogId();
        o6 o6Var2 = new o6(0, this, z10);
        p6Var = new p6(this, z10, id22, 0);
        U = LaunchActivity.U();
        q7Var = this.N;
        if (q7Var != null) {
            this.N = null;
        }
        if (this.N != null) {
        }
        if (U != null) {
        }
        p6Var.run();
    }

    public final t7 d0(final MessageObject messageObject, final rn rnVar, final long j10, boolean z10, boolean z11, final Long l10) {
        String str;
        long j11;
        final u7 u7Var;
        String str2;
        o7 b10 = o7.b(messageObject);
        int i10 = this.a;
        u7 y10 = y(i10, false);
        Context t10 = t(rnVar);
        if (t10 == null) {
            return null;
        }
        str = "";
        if (z11 && y10.e && y10.q(false, false, null).amount <= 0) {
            long a2 = rnVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(rnVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = rnVar.getMessagesController().getChat(Long.valueOf(-a2));
                if (chat != null) {
                    str = chat.title;
                }
            }
            final int i11 = 0;
            new ea(t10, rnVar.getResourceProvider(), j10, 5, str, new Runnable(this) { // from class: hh.q6
                public final /* synthetic */ u7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.d0(messageObject, rnVar, j10, true, true, l10);
                            break;
                        default:
                            this.b.d0(messageObject, rnVar, j10, true, true, l10);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        t7 t7Var = this.B;
        if (t7Var == null || !t7Var.a.equals(b10)) {
            t7 t7Var2 = this.B;
            if (t7Var2 != null) {
                t7Var2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            j11 = 0;
            u7Var = this;
            t7 t7Var3 = new t7(u7Var, b10, messageObject, rnVar, z10);
            u7Var.B = t7Var3;
            t7Var3.n = l10;
        } else {
            j11 = 0;
            u7Var = this;
        }
        if (u7Var.B.h + j10 > MessagesController.getInstance(i10).starsPaidReactionAmountMax) {
            u7Var.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            u7Var.B = new t7(u7Var, b10, messageObject, rnVar, z10);
        }
        final long j12 = u7Var.B.h + j10;
        if (z11 && y10.e && y10.q(false, false, null).amount < j12) {
            u7Var.B.a();
            long a3 = rnVar.a();
            if (a3 >= j11) {
                str2 = UserObject.getForcedFirstName(rnVar.getMessagesController().getUser(Long.valueOf(a3)));
            } else {
                TLRPC.Chat chat2 = rnVar.getMessagesController().getChat(Long.valueOf(-a3));
                str2 = chat2 != null ? chat2.title : "";
            }
            final int i12 = 1;
            new ea(t10, rnVar.getResourceProvider(), j12, 5, str2, new Runnable(u7Var) { // from class: hh.q6
                public final /* synthetic */ u7 b;

                {
                    this.b = u7Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.b.d0(messageObject, rnVar, j12, true, true, l10);
                            break;
                        default:
                            this.b.d0(messageObject, rnVar, j12, true, true, l10);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        t7 t7Var4 = u7Var.B;
        boolean z12 = !(messageObject == null || messageObject.doesPaidReactionExist()) || z10;
        r7 r7Var = t7Var4.p;
        u7 u7Var2 = t7Var4.q;
        int i13 = u7Var2.a;
        yb ybVar = t7Var4.e;
        MessageObject messageObject2 = t7Var4.b;
        if (!t7Var4.i && !t7Var4.j) {
            t7Var4.h += j10;
            System.currentTimeMillis();
            ybVar.c.a();
            ybVar.c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) t7Var4.h, new Object[0])), true, true);
            if (t7Var4.m) {
                t7Var4.f.b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(r7Var);
                AndroidUtilities.runOnUIThread(r7Var, 5000L);
            }
            if (z12) {
                t7Var4.l = true;
                messageObject2.addPaidReactions((int) j10, true, t7Var4.c());
                u7Var2.g += j10;
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                t7Var4.l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    t7Var4.k--;
                }
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                t7Var4.k += j10;
            }
            ybVar.b.setText(t7Var4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        t7 t7Var5 = u7Var.B;
        t7Var5.n = l10;
        return t7Var5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i10 = this.a;
        if (!MessagesController.getInstance(i10).starsPurchaseAvailable()) {
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R == null || R.getContext() == null) {
                e0(activity, null);
                return;
            } else {
                e0(R.getContext(), R.getResourceProvider());
                return;
            }
        }
        boolean z10 = AppGlobalConfig.getInstance(i10).starsSpendTopUpInvoiceDisabled.get() && inputPeer != null;
        if ((!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) || z10) {
            if (!BillingController.getInstance().isReady()) {
                callback2.run(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            c9.b bVar = new c9.b();
            bVar.c = "inapp";
            bVar.b = tL_starsTopupOption.store_product;
            n2.o a2 = bVar.a();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(a2), new a1.d(callback2, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity, 2));
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
        JSONObject p6 = nh.b3.p(I(), false);
        if (p6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new cg.y(this, callback2, tL_inputInvoiceStars, 9));
    }

    public final void f0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        MessageObject messageObject = (MessageObject) list.get(0);
        long dialogId = messageObject.getDialogId();
        int i10 = this.a;
        if (dialogId >= 0) {
            MessagesController.getInstance(i10).loadFullUser(MessagesController.getInstance(i10).getUser(Long.valueOf(dialogId)), 0, true);
        } else {
            MessagesController.getInstance(i10).loadFullChat(-dialogId, 0, true);
        }
        mc.a0(LaunchActivity.U()).Q(R.raw.error, 36, oa.Q0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i10;
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.c6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new gh.k1(this, callback2, j10, tLObject, tL_textWithEntities, 3));
                return;
            }
            if (z10) {
                i10 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i10 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String name = DialogObject.getName(this.a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.a).getInputUser(j10);
            tL_inputInvoicePremiumGiftStars.months = i10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p6 = nh.b3.p(I, false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: hh.b6
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final u7 u7Var = u7.this;
                    final Utilities.Callback2 callback22 = callback2;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.c6 c6Var = I;
                    final String str = name;
                    final long j11 = j10;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.d6
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            Utilities.Callback2 callback23 = callback22;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                u7.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                callback23.run(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i11 = 0;
                            long j12 = 0;
                            while (i11 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                                i11++;
                                j12 += tL_labeledPrice.amount;
                            }
                            u7 u7Var2 = u7.this;
                            ConnectionsManager.getInstance(u7Var2.a).sendRequest(tL_payments_sendStarsForm, new f6(u7Var2, callback23, context3, c6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(LaunchActivity launchActivity, long j10, String str) {
        if (this.e) {
            h0(launchActivity, j10, str);
        } else {
            r(new e2(this, (Object) launchActivity, j10, (Object) str, 7));
        }
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.c6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new gh.k1(this, callback2, tL_payments_paymentFormStarGift, starGift, j10, 4));
            return;
        }
        String name = DialogObject.getName(this.a, j10);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.a).getInputPeer(j10);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        int i10 = 0;
        JSONObject p6 = nh.b3.p(I, false);
        if (p6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
        int size = arrayList.size();
        long j11 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j11 += tL_labeledPrice.amount;
            size = size;
            context2 = context2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new f6(this, callback2, context2, I, j11, name, tL_payments_paymentFormStarGift, starGift, j10));
    }

    public final void h0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new ea(launchActivity, null, j10, 4, str, new ag.l3(7), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        ec J = mc.a0(U).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new ag.l3(6));
        J.j = 5000;
        J.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final gh.z5 z5Var) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.c6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new Runnable() { // from class: hh.u5
                @Override // java.lang.Runnable
                public final void run() {
                    u7 u7Var = u7.this;
                    boolean z12 = u7Var.e;
                    gh.z5 z5Var2 = z5Var;
                    if (z12) {
                        u7Var.i(starGift, z10, z11, j10, tL_textWithEntities, z5Var2);
                    } else {
                        u7.e("NO_BALANCE");
                        z5Var2.run(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String name = DialogObject.getName(this.a, j10);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z10;
        tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.a).getInputPeer(j10);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z11;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject p6 = nh.b3.p(I, false);
        if (p6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: hh.v5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u7 u7Var = u7.this;
                final gh.z5 z5Var2 = z5Var;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.c6 c6Var = I;
                final String str = name;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z12 = z10;
                final boolean z13 = z11;
                final long j11 = j10;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.e6
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final gh.z5 z5Var3 = z5Var2;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            u7.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            z5Var3.run(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                        int size = arrayList.size();
                        int i10 = 0;
                        final long j12 = 0;
                        while (i10 < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                            i10++;
                            j12 += tL_labeledPrice.amount;
                        }
                        final u7 u7Var2 = u7.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(u7Var2.a);
                        final Context context4 = context3;
                        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z15 = z12;
                        final boolean z16 = z13;
                        final long j13 = j11;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: hh.j6
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final u7 u7Var3 = u7.this;
                                final gh.z5 z5Var4 = z5Var3;
                                final Context context5 = context4;
                                final org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
                                final long j14 = j12;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z17 = z15;
                                final boolean z18 = z16;
                                final long j15 = j13;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.q5
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r5v16 */
                                    /* JADX WARN: Type inference failed for: r5v17, types: [boolean] */
                                    /* JADX WARN: Type inference failed for: r5v19 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i11;
                                        SpannableStringBuilder spannableStringBuilder;
                                        pa0 pa0Var;
                                        ?? r52;
                                        char c10;
                                        u7 u7Var4 = u7.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        gh.z5 z5Var5 = z5Var4;
                                        Context context6 = context5;
                                        org.telegram.ui.ActionBar.c6 c6Var4 = c6Var3;
                                        long j16 = j14;
                                        String str4 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z19 = z17;
                                        boolean z20 = z18;
                                        long j17 = j15;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                                        mc X = (R == null || R.visibleDialog != null) ? mc.X() : mc.a0(R);
                                        int i12 = 1;
                                        if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                            if (tL_error4 != null) {
                                                c10 = 0;
                                                if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (!MessagesController.getInstance(u7Var4.a).starsPurchaseAvailable()) {
                                                        z5Var5.run(Boolean.FALSE, null);
                                                        u7.e0(context6, c6Var4);
                                                        return;
                                                    } else {
                                                        boolean[] zArr = {false};
                                                        ea eaVar = new ea(context6, c6Var4, j16, 6, str4, new k6(u7Var4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, z5Var5), 0L);
                                                        eaVar.setOnDismissListener(new cg.g(i12, z5Var5, zArr));
                                                        eaVar.show();
                                                        return;
                                                    }
                                                }
                                            } else {
                                                c10 = 0;
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                z5Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            }
                                            if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                z5Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            }
                                            z5Var5.run(Boolean.FALSE, null);
                                            int i13 = R.raw.error;
                                            int i14 = R.string.UnknownErrorCode;
                                            Object[] objArr = new Object[1];
                                            objArr[c10] = tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS";
                                            org.telegram.ui.Cells.pa.r(i14, objArr, X, i13, 36);
                                            return;
                                        }
                                        Utilities.stageQueue.postRunnable(new h6(u7Var4, (TLRPC.TL_payments_paymentResult) tLObject4, i12));
                                        u7Var4.D = false;
                                        u7Var4.E = true;
                                        u7Var4.G = 0L;
                                        u7Var4.V();
                                        u7Var4.Q(j17);
                                        u7Var4.T(true);
                                        z5Var5.run(Boolean.TRUE, null);
                                        if (BirthdayController.getInstance(u7Var4.a).contains(j17)) {
                                            i11 = 0;
                                            MessagesController.getInstance(u7Var4.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
                                        } else {
                                            i11 = 0;
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            spannableStringBuilder = null;
                                        } else {
                                            int i15 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i15;
                                            spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SentRemainsLimit", Math.max(i11, i15)));
                                        }
                                        if (j17 < 0) {
                                            long j18 = -j17;
                                            TLRPC.ChatFull chatFull = MessagesController.getInstance(u7Var4.a).getChatFull(j18);
                                            if (chatFull != null) {
                                                chatFull.stargifts_count++;
                                                chatFull.flags2 |= 262144;
                                                MessagesController.getInstance(u7Var4.a).putChatFull(chatFull);
                                            }
                                            if (R instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) R;
                                                if (profileActivity.a() == j17) {
                                                    hz0 hz0Var = profileActivity.K;
                                                    if (hz0Var != null) {
                                                        hz0Var.v1(true);
                                                        profileActivity.K.Y0(14);
                                                        r52 = 0;
                                                        profileActivity.G4(false);
                                                    } else {
                                                        r52 = 0;
                                                    }
                                                    mc a02 = mc.a0(R);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String string = LocaleController.getString(R.string.StarsGiftCompleted);
                                                    if (spannableStringBuilder == null) {
                                                        Object[] objArr2 = new Object[1];
                                                        objArr2[r52] = str4;
                                                        spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j16, objArr2));
                                                    }
                                                    a02.s(document, string, spannableStringBuilder).k(r52);
                                                }
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", j18);
                                            bundle.putBoolean("open_gifts", true);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                            profileActivity2.whenFullyVisible(new gh.k1(profileActivity2, starGift5, spannableStringBuilder, j16, str4, 5));
                                            R.presentFragment(profileActivity2);
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                            if ((R instanceof rn) && ((rn) R).a() == j17) {
                                                mc.a0(R).s(starGift5.sticker, LocaleController.getString(R.string.StarsGiftCompleted), spannableStringBuilder2 != null ? spannableStringBuilder2 : AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j16, new Object[0]))).k(true);
                                            } else {
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(u7Var4.a);
                                                int i16 = NotificationCenter.closeProfileActivity;
                                                Long valueOf = Long.valueOf(j17);
                                                Boolean bool = Boolean.FALSE;
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, valueOf, bool);
                                                NotificationCenter.getInstance(u7Var4.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j17), bool);
                                                rn R9 = rn.R9(j17);
                                                R9.whenFullyVisible(new e2(R9, starGift5, spannableStringBuilder2, j16, 6));
                                                R.presentFragment(R9);
                                            }
                                        }
                                        MessagesController.getInstance(u7Var4.a).getMainSettings().edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.C1;
                                        if (launchActivity == null || (pa0Var = launchActivity.t0) == null) {
                                            return;
                                        }
                                        pa0Var.c(true);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public final void i0(final long j10, final long j11, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i10 = this.a;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: hh.r6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new z6(u7.this, tLObject, j11, j10, z11));
            }
        });
    }

    public final boolean j() {
        if (!this.b) {
            return false;
        }
        if (mh.g.B0()) {
            return true;
        }
        TL_stars.StarsAmount p6 = p();
        return (p6.nanos == 0 && p6.amount == 0) ? false : true;
    }

    public final void j0(String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        int i10;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.c6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i11 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                e7 e7Var = new e7(this, j10, i11, zArr, callback2, context2, I, chatInvite, str);
                m5 m5Var = new m5(this, zArr, callback2);
                org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(context2, I, false, false);
                LinearLayout g10 = org.telegram.messenger.y1.g(context2, 1);
                g10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new m9(context2, 40, 0), h7.z5.c(-1.0f, -1));
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context2);
                n9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                y8Var.s(chatInvite.color);
                String str2 = chatInvite.title;
                y8Var.A = true;
                y8Var.n = 0;
                y8Var.m = false;
                org.telegram.ui.Components.y8.a(str2, null, null, y8Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    n9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", y8Var, chatInvite);
                } else {
                    n9Var.setImageDrawable(y8Var);
                }
                frameLayout.addView(n9Var, h7.z5.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i12 = org.telegram.ui.ActionBar.g6.h5;
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, I), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, h7.z5.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, h7.z5.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                da daVar = new da(context2, i11, I);
                h7.b6.a(daVar);
                daVar.setOnClickListener(new k8(daVar, 1));
                frameLayout.addView(daVar, h7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                g10.addView(frameLayout, h7.z5.q(-1, 117, 7));
                TextView h = org.telegram.messenger.y1.h(context2, 1, 20.0f);
                h.setTypeface(AndroidUtilities.bold());
                int i13 = org.telegram.ui.ActionBar.g6.j5;
                h.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, I));
                rl.i(R.string.StarsSubscribeTitle, h, 17);
                TextView i14 = org.telegram.ui.Cells.pa.i(g10, h, h7.z5.t(-2, -2, 1, 0, 8, 0, 0), context2);
                i14.setTextSize(1, 14.0f);
                i14.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, I));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i15 = tL_starsSubscriptionPricing.period;
                if (i15 == 2592000) {
                    i10 = i12;
                    i14.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    i10 = i12;
                    i14.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, i15 == 300 ? "5 minutes" : "a minute")));
                }
                i14.setMaxWidth(lh.w3.a(i14.getText(), i14.getPaint()));
                i14.setGravity(17);
                g10.addView(i14, h7.z5.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView h10 = org.telegram.messenger.y1.h(context2, 1, 14.0f);
                    h10.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, I));
                    h10.setText(Emoji.replaceEmoji(chatInvite.about, h10.getPaint().getFontMetricsInt(), false));
                    h10.setGravity(17);
                    g10.addView(h10, h7.z5.t(-2, -2, 1, 0, 6, 0, 22));
                }
                lh.d dVar = new lh.d(context2, I, true);
                dVar.g(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                g10.addView(dVar, h7.z5.n(-1, 48));
                p80 p80Var = new p80(context2, I);
                p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new e2.e(context2, 9)));
                p80Var.setGravity(17);
                p80Var.setTextSize(1, 13.0f);
                p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, I));
                p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, I));
                g10.addView(p80Var, h7.z5.t(-1, -2, 49, 14, 14, 14, 6));
                o10.customView = g10;
                dVar.setOnClickListener(new gg.f(e7Var, o10, dVar, 8));
                o10.setOnDismissListener(new ag.j0(m5Var, 5));
                o10.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i10, I));
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
                    o10.makeAttached(U);
                }
                o10.show();
            }
        }
    }

    public final void k0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f.equals(starsAmount);
        int i10 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
    }

    public final void l0(final MessageObject messageObject, final long j10, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (messageObject == null) {
            runnable.run();
            return;
        }
        final long dialogId = messageObject.getDialogId();
        final int id2 = messageObject.getId();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i10 = this.a;
        tL_messages_editMessage.peer = MessagesController.getInstance(i10).getInputPeer(dialogId);
        int i11 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i11;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.id = id2;
        tL_messages_editMessage.flags = i11 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j10;
        int i12 = 0;
        while (i12 < tL_messageMediaPaidMedia2.extended_media.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i12);
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
            i12++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: hh.b7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new g7(u7.this, tLObject, runnable, tL_error, z10, dialogId, id2, messageObject, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 >= longSparseArray.size()) {
                return null;
            }
            m7 m7Var = (m7) longSparseArray.valueAt(i10);
            for (int i11 = 0; i11 < m7Var.l.size(); i11++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) m7Var.l.get(i11);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.id == j10) {
                    return savedStarGift;
                }
            }
            i10++;
        }
    }

    public final TL_stars.StarsAmount p() {
        return q(true, false, null);
    }

    public final TL_stars.StarsAmount q(boolean z10, boolean z11, Runnable runnable) {
        if (((!this.e || System.currentTimeMillis() - this.c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new cg.g0(9, this, runnable));
        }
        if (!z10 || this.g <= 0) {
            return this.f;
        }
        hf.a m10 = hf.a.m(this.f);
        return hf.a.g(Math.max(0L, m10.a() - this.g), m10.a).o();
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final hf.a s() {
        hf.a l10 = hf.a.l(p());
        if (l10 == null) {
            return hf.a.i(0L, this.b ? hf.b.b : hf.b.a);
        }
        return l10;
    }

    public final ArrayList u() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new l6(this, 3));
        return this.m;
    }

    public final ArrayList v() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new l6(this, 4));
        return this.p;
    }

    public final ArrayList z() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new l6(this, 2));
        return this.j;
    }
}
