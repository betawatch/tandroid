package mh;

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
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uz0;
import org.telegram.ui.xa0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class t7 {
    public static volatile t7[][] S = (t7[][]) Array.newInstance((Class<?>) t7.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public s7 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public p7 N;
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

    public t7(int i10, boolean z4) {
        this.a = i10;
        this.b = z4;
    }

    public static org.telegram.ui.ActionBar.g6 I() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            return U.getResourceProvider();
        }
        return null;
    }

    public static t7 L(int i10) {
        return y(i10, true);
    }

    public static boolean U(int i10, mf.a aVar) {
        return aVar == null || x(i10, aVar.a).s().b >= aVar.b;
    }

    public static /* synthetic */ void a(t7 t7Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = t7Var.I;
        ArrayList arrayList2 = t7Var.J;
        int i10 = t7Var.a;
        ArrayList arrayList3 = t7Var.H;
        t7Var.C = false;
        t7Var.D = true;
        if (!(starGifts instanceof TL_stars.TL_starGifts)) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i11 = t7Var.F;
                long currentTimeMillis = System.currentTimeMillis();
                t7Var.G = currentTimeMillis;
                t7Var.c0(i11, currentTimeMillis, arrayList3);
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
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new lf.d(4)), new lf.d(5)));
        arrayList.clear();
        arrayList.addAll(arrayList3);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new lf.d(6)));
        t7Var.F = tL_starGifts.hash;
        t7Var.G = System.currentTimeMillis();
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        t7Var.c0(t7Var.F, t7Var.G, tL_starGifts.gifts);
    }

    public static /* synthetic */ void b(t7 t7Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = t7Var.a;
        MessagesController.getInstance(i10).putUsers(arrayList2, true);
        MessagesController.getInstance(i10).putChats(arrayList3, true);
        t7Var.E = true;
        ArrayList arrayList4 = t7Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = t7Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new lf.d(1)), new lf.d(2)));
        ArrayList arrayList6 = t7Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new lf.d(3)));
        t7Var.F = num.intValue();
        t7Var.G = l10.longValue();
        t7Var.C = false;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        t7Var.V();
    }

    public static void e(String str) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        yh.s(R.string.UnknownErrorCode, new Object[]{str}, (R == null || R.visibleDialog != null) ? qc.X() : qc.a0(R), R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.StarsNotAvailableText);
        l.d.C(R.string.OK, alertDialog$Builder, null);
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

    public static Context t(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var != null && p2Var.getContext() != null) {
            return p2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.D1;
        }
        if (ApplicationLoader.applicationContext != null) {
            return ApplicationLoader.applicationContext;
        }
        return null;
    }

    public static t7 w(int i10) {
        return y(i10, false);
    }

    public static t7 x(int i10, mf.b bVar) {
        return y(i10, bVar == mf.b.b);
    }

    public static t7 y(int i10, boolean z4) {
        t7 t7Var;
        t7 t7Var2 = S[z4 ? 1 : 0][i10];
        if (t7Var2 != null) {
            return t7Var2;
        }
        synchronized (T[z4 ? 1 : 0][i10]) {
            try {
                t7Var = S[z4 ? 1 : 0][i10];
                if (t7Var == null) {
                    t7[] t7VarArr = S[z4 ? 1 : 0];
                    t7 t7Var3 = new t7(i10, z4);
                    t7VarArr[i10] = t7Var3;
                    t7Var = t7Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t7Var;
    }

    public final long A(n7 n7Var, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l10;
        s7 s7Var = this.B;
        if (s7Var != null && s7Var.a.equals(n7Var) && (l10 = this.B.n) != null) {
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
        s7 s7Var = this.B;
        if (s7Var != null && s7Var.a.equals(n7.b(messageObject)) && (l10 = this.B.n) != null) {
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
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new v6(0, callback));
    }

    public final long D(int i10, long j10) {
        s7 s7Var = this.B;
        if (s7Var == null) {
            return 0L;
        }
        n7 n7Var = s7Var.a;
        if (n7Var.a == j10 && n7Var.b == i10 && s7Var.l) {
            return s7Var.h;
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

    public final j7 F(long j10, boolean z4) {
        LongSparseArray longSparseArray = this.K;
        j7 j7Var = (j7) longSparseArray.get(j10);
        if (j7Var != null || !z4) {
            return j7Var;
        }
        j7 j7Var2 = new j7(this.a, j10);
        longSparseArray.put(j10, j7Var2);
        return j7Var2;
    }

    public final l7 G(long j10, boolean z4) {
        LongSparseArray longSparseArray = this.L;
        l7 l7Var = (l7) longSparseArray.get(j10);
        if (l7Var != null || !z4) {
            return l7Var;
        }
        l7 l7Var2 = new l7(this.a, j10, true);
        longSparseArray.put(j10, l7Var2);
        return l7Var2;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4, Utilities.Callback callback) {
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.g6 I = I();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            r(new b2(this, callback, starGift, j10));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.a).getInputPeer(j10);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z4;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject p10 = sh.p2.p(I, false);
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new eg.b3(9, this, callback));
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
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new hg.c0(this, j10, callback, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
        d2Var.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new lh.b1(this, d2Var, inputSavedStarGift, callback, 3));
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
        l7 G = G(j10, false);
        if (G != null) {
            G.i(false);
        }
        j7 j7Var = (j7) this.K.get(j10);
        if (j7Var != null) {
            j7Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j10 = userFull.id;
        l7 G = G(j10, false);
        if (G != null && G.n != userFull.stargifts_count) {
            G.i(false);
        }
        j7 j7Var = (j7) this.K.get(j10);
        if (j7Var != null) {
            j7Var.g();
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

    public final void T(boolean z4) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.t;
            if (!zArr[i10]) {
                this.q[i10].clear();
                this.s[i10] = null;
                zArr[i10] = false;
                this.u[i10] = false;
                if (z4) {
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
            boolean z4 = this.E;
            int i10 = this.a;
            if (z4) {
                int i11 = this.F;
                dg.h0 h0Var = new dg.h0(this, 21);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new gf.a(h0Var, 8));
                return;
            }
            m5 m5Var = new m5(this, 0);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new hg.j0(messagesStorage, arrayList3, arrayList2, arrayList, m5Var, 9));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new j6(this, 1));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new r1(this, i10, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04c0  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, Utilities.Callback callback) {
        long j10;
        String str;
        boolean z4;
        org.telegram.ui.ActionBar.h3 h3Var;
        k6 k6Var;
        l6 l6Var;
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
        boolean z10;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i13;
        int i14;
        char c3;
        String formatPluralString;
        String formatPluralString2;
        char c10;
        String formatPluralString3;
        boolean z11;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message2;
        int i15;
        int i16;
        l9 l9Var;
        LinearLayout linearLayout;
        ImageLocation imageLocation;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        MessagesController.getInstance(this.a).putUsers(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.g6 I = I();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            r(new lh.e1(this, (Object) runnable, messageObject, inputInvoice, tL_payments_paymentFormStars, callback, 4));
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
            z4 = !UserObject.isBot(user2);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.a).getChat(Long.valueOf(-j14));
            str = chat == null ? "" : chat.title;
            z4 = false;
        }
        String str3 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i18 = tL_payments_paymentFormStars.invoice.subscription_period;
        long j15 = j13;
        boolean[] zArr = {false};
        int i19 = this.a;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        k6 k6Var2 = new k6(this, j15, zArr, callback, context2, I, z4, str, messageObject, inputInvoice, tL_payments_paymentFormStars, i18, j14);
        l6 l6Var2 = new l6(this, zArr, callback);
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context2, I, false, false);
        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j14));
        LinearLayout f11 = org.telegram.messenger.y3.f(context2, 1);
        f11.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.addView(new j9(context2, 40, 0), k7.c6.c(-1.0f, -1));
        if (messageObject == null || (message2 = messageObject.messageOwner) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            h3Var = o10;
            k6Var = k6Var2;
            l6Var = l6Var2;
            viewGroup = f11;
            messageObject2 = messageObject;
            i10 = i18;
            if (webDocument != null) {
                FrameLayout frameLayout2 = new FrameLayout(context2);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context2);
                p9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
                p9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "80_80", null, null);
                frameLayout2.addView(p9Var, k7.c6.e(80, 80, 48));
                frameLayout.addView(frameLayout2, k7.c6.e(80, 87, 17));
                TextView textView = new TextView(context2);
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                f10 = 13.0f;
                textView.setTextSize(1, 13.0f);
                i11 = -1;
                textView.setTextColor(-1);
                j11 = j15;
                textView.setText(ja.R0(l.d.l((int) j15, ',', new StringBuilder("XTR ")), 0.85f, null));
                i12 = 0;
                textView.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
                textView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(16.0f), -1133566));
                FrameLayout frameLayout3 = new FrameLayout(context2);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, I)));
                frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                frameLayout3.addView(textView, k7.c6.q(-2, 16, 119));
                frameLayout2.addView(frameLayout3, k7.c6.a(-2.0f, 18.66f, 81));
                y9 y9Var = new y9(context2, i19, I);
                k7.e6.a(y9Var);
                y9Var.setOnClickListener(new j8(y9Var, i12));
                frameLayout.addView(y9Var, k7.c6.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                viewGroup.addView(frameLayout, k7.c6.q(i11, 117, 7));
                TextView g10 = org.telegram.messenger.y3.g(context2, 1, 20.0f);
                g10.setTypeface(AndroidUtilities.bold());
                int i20 = org.telegram.ui.ActionBar.k6.j5;
                g10.setTextColor(org.telegram.ui.ActionBar.k6.v0(i20, I));
                if (i10 <= 0) {
                    g10.setText(Emoji.replaceEmoji(webDocument != null ? str3 : LocaleController.getString(R.string.StarsConfirmSubscriptionTitle), g10.getPaint().getFontMetricsInt(), i12));
                } else {
                    g10.setText(Emoji.replaceEmoji(webDocument != null ? str3 : LocaleController.getString(R.string.StarsConfirmPurchaseTitle), g10.getPaint().getFontMetricsInt(), i12));
                }
                NotificationCenter.listenEmojiLoading(g10);
                g10.setGravity(17);
                viewGroup.addView(g10, k7.c6.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                if (webDocument != null) {
                    LinearLayout f12 = org.telegram.messenger.y3.f(context2, i12);
                    f12.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, I)));
                    org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context2);
                    p9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
                    z8Var.r(user3);
                    p9Var2.e(user3, z8Var);
                    f12.addView(p9Var2, k7.c6.n(28, 28));
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, f10);
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, I));
                    textView2.setText(UserObject.getUserName(user3));
                    f12.addView(textView2, k7.c6.t(-2, -2, 16, 6, 0, 10, 0));
                    viewGroup.addView(f12, k7.c6.t(-2, 28, 1, 0, 8, 0, 2));
                }
                TextView g11 = org.telegram.messenger.y3.g(context2, 1, 14.0f);
                g11.setTextColor(org.telegram.ui.ActionBar.k6.v0(i20, I));
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
                            z10 = true;
                            tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                            i14 = 0;
                            int i21 = 0;
                            for (i13 = 0; i13 < tL_messageMediaPaidMedia.extended_media.size(); i13++) {
                                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i13);
                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                                    if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                        z11 = true;
                                    }
                                    z11 = false;
                                } else {
                                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                        z11 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                                    }
                                    z11 = false;
                                }
                                if (z11) {
                                    i14++;
                                } else {
                                    i21++;
                                }
                            }
                            if (i14 != 0) {
                                String str4 = z10 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                long j16 = j11;
                                int i22 = (int) j16;
                                if (i21 == 1) {
                                    formatPluralString3 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                                    c10 = 1;
                                } else {
                                    c10 = 1;
                                    formatPluralString3 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i21, new Object[i12]);
                                }
                                Object[] objArr = new Object[2];
                                objArr[i12] = formatPluralString3;
                                objArr[c10] = str2;
                                formatPluralString2 = LocaleController.formatPluralString(str4, i22, objArr);
                                j12 = j16;
                            } else {
                                j12 = j11;
                                if (i21 == 0) {
                                    String str5 = z10 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                    int i23 = (int) j12;
                                    Object[] objArr2 = new Object[2];
                                    objArr2[i12] = i14 == 1 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i14, new Object[i12]);
                                    objArr2[1] = str2;
                                    formatPluralString2 = LocaleController.formatPluralString(str5, i23, objArr2);
                                } else {
                                    String str6 = z10 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                                    int i24 = (int) j12;
                                    if (i21 == 1) {
                                        formatPluralString = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                                        c3 = 2;
                                    } else {
                                        c3 = 2;
                                        formatPluralString = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i21, new Object[i12]);
                                    }
                                    String string = i14 == 1 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i14, new Object[i12]);
                                    Object[] objArr3 = new Object[3];
                                    objArr3[i12] = formatPluralString;
                                    objArr3[1] = string;
                                    objArr3[c3] = str2;
                                    formatPluralString2 = LocaleController.formatPluralString(str6, i24, objArr3);
                                }
                            }
                            g11.setText(AndroidUtilities.replaceTags(formatPluralString2));
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i19).getChat(Long.valueOf(-dialogId));
                        str2 = chat2 != null ? chat2.title : "";
                    }
                    z10 = false;
                    tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                    i14 = 0;
                    int i212 = 0;
                    while (i13 < tL_messageMediaPaidMedia.extended_media.size()) {
                    }
                    if (i14 != 0) {
                    }
                    g11.setText(AndroidUtilities.replaceTags(formatPluralString2));
                } else {
                    j12 = j11;
                    if (i10 <= 0) {
                        String userName2 = UserObject.getUserName(user3);
                        Object[] objArr4 = new Object[2];
                        objArr4[i12] = str3;
                        objArr4[1] = userName2;
                        g11.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j12, objArr4)));
                    } else {
                        String userName3 = UserObject.getUserName(user3);
                        Object[] objArr5 = new Object[2];
                        objArr5[i12] = str3;
                        objArr5[1] = userName3;
                        g11.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j12, objArr5)));
                    }
                }
                g11.setMaxWidth(qh.f3.a(g11.getText(), g11.getPaint()));
                g11.setGravity(17);
                viewGroup.addView(g11, k7.c6.t(-2, -2, 1, 0, 6, 0, 18));
                qh.d dVar = new qh.d(context2, I, true);
                if (i10 <= 0) {
                    dVar.g(ja.Q0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionButton", (int) j12))), i12, true);
                } else {
                    dVar.g(ja.Q0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", (int) j12))), i12, true);
                }
                viewGroup.addView(dVar, k7.c6.c(48.0f, -1));
                g90 g90Var = new g90(context2, I);
                g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z6, I));
                g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, I));
                g90Var.setTextSize(1, 14.0f);
                g90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10 <= 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new e2.f(context2, 6)));
                g90Var.setGravity(17);
                viewGroup.addView(g90Var, k7.c6.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                h3Var2.customView = viewGroup;
                dVar.setOnClickListener(new eg.o(k6Var, h3Var2, dVar, 8));
                h3Var2.setOnDismissListener(new fg.d0(l6Var, 3));
                h3Var2.fixNavigationBar();
                h3Var2.show();
            }
            org.telegram.ui.Components.p9 p9Var3 = new org.telegram.ui.Components.p9(context2);
            p9Var3.setRoundRadius(AndroidUtilities.dp(80.0f));
            org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
            z8Var2.r(user3);
            p9Var3.e(user3, z8Var2);
            frameLayout.addView(p9Var3, k7.c6.e(80, 80, 17));
        } else {
            l9 l9Var2 = new l9(context2);
            l9Var2.E = new Path();
            l9Var2.F = new RectF();
            l9Var2.G = context2.getResources().getDrawable(R.drawable.large_locked_post).mutate();
            l9Var2.setRoundRadius(AndroidUtilities.dp(24.0f));
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                h3Var = o10;
                l6Var = l6Var2;
                k6Var = k6Var2;
                viewGroup = f11;
                messageObject2 = messageObject;
                i10 = i18;
                i15 = 17;
                i16 = 80;
            } else {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                    imageLocation = ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, messageObject.messageOwner);
                    l9Var = l9Var2;
                } else {
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            l9Var = l9Var2;
                            imageLocation = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(80.0f), true), messageMedia.photo);
                        } else {
                            l9Var = l9Var2;
                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                imageLocation = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(80.0f), true), messageMedia.document);
                            }
                        }
                    } else {
                        l9Var = l9Var2;
                    }
                    linearLayout = f11;
                    imageLocation = null;
                    h3Var = o10;
                    viewGroup = linearLayout;
                    l6Var = l6Var2;
                    i10 = i18;
                    k6Var = k6Var2;
                    i15 = 17;
                    i16 = 80;
                    l9Var2 = l9Var;
                    l9Var2.l(imageLocation, "80_80_b2", null, null, null, messageObject);
                    messageObject2 = messageObject;
                }
                linearLayout = f11;
                h3Var = o10;
                viewGroup = linearLayout;
                l6Var = l6Var2;
                i10 = i18;
                k6Var = k6Var2;
                i15 = 17;
                i16 = 80;
                l9Var2 = l9Var;
                l9Var2.l(imageLocation, "80_80_b2", null, null, null, messageObject);
                messageObject2 = messageObject;
            }
            frameLayout.addView(l9Var2, k7.c6.e(i16, i16, i15));
        }
        j11 = j15;
        i11 = -1;
        f10 = 13.0f;
        i12 = 0;
        y9 y9Var2 = new y9(context2, i19, I);
        k7.e6.a(y9Var2);
        y9Var2.setOnClickListener(new j8(y9Var2, i12));
        frameLayout.addView(y9Var2, k7.c6.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        viewGroup.addView(frameLayout, k7.c6.q(i11, 117, 7));
        TextView g102 = org.telegram.messenger.y3.g(context2, 1, 20.0f);
        g102.setTypeface(AndroidUtilities.bold());
        int i202 = org.telegram.ui.ActionBar.k6.j5;
        g102.setTextColor(org.telegram.ui.ActionBar.k6.v0(i202, I));
        if (i10 <= 0) {
        }
        NotificationCenter.listenEmojiLoading(g102);
        g102.setGravity(17);
        viewGroup.addView(g102, k7.c6.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
        if (webDocument != null) {
        }
        TextView g112 = org.telegram.messenger.y3.g(context2, 1, 14.0f);
        g112.setTextColor(org.telegram.ui.ActionBar.k6.v0(i202, I));
        if (messageObject2 == null) {
        }
        j12 = j11;
        if (i10 <= 0) {
        }
        g112.setMaxWidth(qh.f3.a(g112.getText(), g112.getPaint()));
        g112.setGravity(17);
        viewGroup.addView(g112, k7.c6.t(-2, -2, 1, 0, 6, 0, 18));
        qh.d dVar2 = new qh.d(context2, I, true);
        if (i10 <= 0) {
        }
        viewGroup.addView(dVar2, k7.c6.c(48.0f, -1));
        g90 g90Var2 = new g90(context2, I);
        g90Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z6, I));
        g90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, I));
        g90Var2.setTextSize(1, 14.0f);
        g90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10 <= 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new e2.f(context2, 6)));
        g90Var2.setGravity(17);
        viewGroup.addView(g90Var2, k7.c6.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
        org.telegram.ui.ActionBar.h3 h3Var22 = h3Var;
        h3Var22.customView = viewGroup;
        dVar2.setOnClickListener(new eg.o(k6Var, h3Var22, dVar2, 8));
        h3Var22.setOnDismissListener(new fg.d0(l6Var, 3));
        h3Var22.fixNavigationBar();
        h3Var22.show();
    }

    public final void Z(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final org.telegram.ui.ActionBar.g6 I = I();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: mh.u5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final t7 t7Var = t7.this;
                final Utilities.Callback2 callback22 = callback2;
                final long j11 = j10;
                final String str3 = str2;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.g6 g6Var = I;
                final TLRPC.ChatInvite chatInvite2 = chatInvite;
                final String str4 = str;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.a6
                    @Override // java.lang.Runnable
                    public final void run() {
                        xa0 xa0Var;
                        t7 t7Var2 = t7.this;
                        TLObject tLObject2 = tLObject;
                        Utilities.Callback2 callback23 = callback22;
                        long j12 = j11;
                        String str5 = str3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        TLRPC.ChatInvite chatInvite3 = chatInvite2;
                        String str6 = str4;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        qc a02 = !AndroidUtilities.hasDialogOnTop(R) ? qc.a0(R) : qc.X();
                        int i10 = 0;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                callback23.run(0L, Boolean.FALSE);
                                yh.s(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, a02, R.raw.error, 36);
                                return;
                            } else if (!MessagesController.getInstance(t7Var2.a).starsPurchaseAvailable()) {
                                callback23.run(0L, Boolean.FALSE);
                                t7.e0(context3, g6Var2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                z9 z9Var = new z9(context3, g6Var2, j12, 1, chatInvite3.title, new hg.j0(t7Var2, zArr, str6, chatInvite3, callback23, 8), 0L);
                                z9Var.setOnDismissListener(new g6(callback23, zArr, 0));
                                z9Var.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.stageQueue.postRunnable(new f6(t7Var2, tL_payments_paymentResult, i10));
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
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null && (xa0Var = launchActivity.u0) != null) {
                            xa0Var.c(true);
                        }
                        t7Var2.T(true);
                        t7Var2.S();
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
        final org.telegram.ui.ActionBar.g6 I = I();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: mh.b7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final t7 t7Var = t7.this;
                final Utilities.Callback callback2 = callback;
                final MessageObject messageObject2 = messageObject;
                final Context context2 = context;
                final long j13 = j11;
                final String str4 = str2;
                final int i12 = i11;
                final String str5 = str3;
                final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                final long j14 = j12;
                final org.telegram.ui.ActionBar.g6 g6Var = I;
                final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.e7
                    /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
                    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        boolean z4;
                        LaunchActivity launchActivity;
                        xa0 xa0Var;
                        TLRPC.Message message2;
                        t7 t7Var2 = t7.this;
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
                        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        qc X = (R == null || R.visibleDialog != null) ? qc.X() : qc.a0(R);
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                if (!MessagesController.getInstance(t7Var2.a).starsPurchaseAvailable()) {
                                    callback3.run(Boolean.FALSE);
                                    t7.e0(context3, g6Var2);
                                    return;
                                } else {
                                    boolean[] zArr = {false};
                                    z9 z9Var = new z9(context3, g6Var2, j15, 0, str6, new lh.e1(t7Var2, (Object) zArr, messageObject3, inputInvoice3, tL_payments_paymentFormStars3, callback3, 6), j16);
                                    z9Var.setOnDismissListener(new g7(callback3, zArr));
                                    z9Var.show();
                                    return;
                                }
                            }
                            if (tL_error2 != null && "FORM_EXPIRED".equals(tL_error2.text)) {
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject p10 = sh.p2.p(g6Var2, false);
                                if (p10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = p10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = inputInvoice3;
                                ConnectionsManager.getInstance(t7Var2.a).sendRequest(tL_payments_getPaymentForm, new hg.e0(t7Var2, messageObject3, inputInvoice3, callback3, X, 2));
                                return;
                            }
                            qc qcVar = X;
                            callback3.run(Boolean.FALSE);
                            yh.s(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, qcVar, R.raw.error, 36);
                            if (messageObject3 != null) {
                                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                tL_messages_getExtendedMedia.peer = MessagesController.getInstance(t7Var2.a).getInputPeer(j16);
                                tL_messages_getExtendedMedia.id.add(Integer.valueOf(messageObject3.getId()));
                                ConnectionsManager.getInstance(t7Var2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                return;
                            }
                            return;
                        }
                        callback3.run(Boolean.TRUE);
                        Utilities.stageQueue.postRunnable(new f6(t7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 4));
                        if (messageObject3 != null && (message2 = messageObject3.messageOwner) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            Drawable mutate = context3.getResources().getDrawable(R.drawable.star_small_inner).mutate();
                            String string = LocaleController.getString(R.string.StarsMediaPurchaseCompleted);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsMediaPurchaseCompletedInfo", (int) j15, str6));
                            X.getClass();
                            fc fcVar = new fc(X.W(), X.c);
                            fcVar.a.setImageDrawable(mutate);
                            fcVar.b.setText(string);
                            fcVar.c.setText(replaceTags);
                            X.b(fcVar, 2750).j();
                        } else {
                            if (i13 <= 0) {
                                z4 = true;
                                X.M(LocaleController.getString(R.string.StarsPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsPurchaseCompletedInfo", (int) j15, str7, str6)), R.raw.stars_send).j();
                                launchActivity = LaunchActivity.D1;
                                if (launchActivity != null && (xa0Var = launchActivity.u0) != null) {
                                    xa0Var.c(z4);
                                }
                                if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                    t7Var2.T(true);
                                }
                                if (messageObject3 == null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia2.peer = MessagesController.getInstance(t7Var2.a).getInputPeer(j16);
                                    tL_messages_getExtendedMedia2.id.add(Integer.valueOf(messageObject3.getId()));
                                    ConnectionsManager.getInstance(t7Var2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                    return;
                                }
                                return;
                            }
                            X.M(LocaleController.getString(R.string.StarsBotSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsBotSubscriptionCompletedInfo", (int) j15, str7, str6)), R.raw.stars_send).j();
                        }
                        z4 = true;
                        launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            xa0Var.c(z4);
                        }
                        if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                        }
                        t7Var2.T(true);
                        if (messageObject3 == null) {
                        }
                    }
                });
            }
        });
    }

    public final void b0(long j10, long j11, boolean z4) {
        int i10 = this.a;
        TopicsController topicsController = MessagesController.getInstance(i10).getTopicsController();
        TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, j11);
        if (findTopic != null) {
            findTopic.nopaid_messages_exception = z4;
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
        boolean z4 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int id2 = ((MessageObject) obj).getId();
            hashSet.add(Integer.valueOf(id2));
            if (this.Q.remove(Integer.valueOf(id2))) {
                this.R.put(Integer.valueOf(id2), new p6(this, hashSet, runnable, 0));
                z4 = true;
            }
        }
        return !z4;
    }

    public final void c0(int i10, long j10, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.a);
        messagesStorage.getStorageQueue().postRunnable(new w6(messagesStorage, j10, arrayList, i10));
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
        boolean z4;
        n6 n6Var;
        org.telegram.ui.ActionBar.p2 U;
        p7 p7Var;
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return;
        }
        long j10 = message.paid_message_stars;
        if (j10 <= 0 || messageObject.isEphemeral()) {
            return;
        }
        p7 p7Var2 = this.N;
        if (p7Var2 == null || p7Var2.g <= 0 || !p7Var2.m || p7Var2.n || p7Var2.o) {
            if (!org.telegram.ui.Components.z4.d0(this.a, messageObject.getDialogId())) {
                Long l10 = (Long) this.O.get(Long.valueOf(messageObject.getDialogId()));
                if (l10 == null || System.currentTimeMillis() - l10.longValue() <= 5000) {
                    Integer num = (Integer) this.P.get(Long.valueOf(messageObject.getDialogId()));
                    if (num != null) {
                    }
                }
            }
            z4 = false;
            int id2 = messageObject.getId();
            if (z4) {
                this.Q.add(Integer.valueOf(id2));
            }
            long dialogId = messageObject.getDialogId();
            m6 m6Var = new m6(0, this, z4);
            n6Var = new n6(this, z4, id2, 0);
            U = LaunchActivity.U();
            p7Var = this.N;
            if (p7Var != null && (p7Var.o || p7Var.n)) {
                this.N = null;
            }
            if (this.N != null) {
                if (U != null && !U.isRemovingFromStack()) {
                    p7 p7Var3 = this.N;
                    if (p7Var3.b == dialogId) {
                    }
                }
                this.N.a();
                this.N = null;
            }
            if (U != null || U.isRemovingFromStack()) {
                n6Var.run();
            }
            if (this.N == null) {
                this.N = new p7(U, dialogId);
            }
            p7 p7Var4 = this.N;
            cc ccVar = p7Var4.d;
            gc gcVar = p7Var4.e;
            o7 o7Var = p7Var4.p;
            if (p7Var4.n || p7Var4.o) {
                n6Var.run();
                return;
            }
            p7Var4.g++;
            p7Var4.k.add(messageObject);
            p7Var4.h += j10;
            p7Var4.i = m6Var;
            p7Var4.j.add(n6Var);
            if (p7Var4.m && !z4) {
                p7Var4.m = false;
                AndroidUtilities.cancelRunOnUIThread(o7Var);
                ic icVar = p7Var4.c;
                icVar.j = 5000;
                icVar.i(true);
                if (System.currentTimeMillis() - p7Var4.l > 500) {
                    gcVar.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                } else {
                    gcVar.setAlpha(0.0f);
                    gcVar.setVisibility(8);
                }
            }
            bc bcVar = p7Var4.f;
            if (bcVar != null && p7Var4.m) {
                bcVar.b = 3000L;
                AndroidUtilities.cancelRunOnUIThread(o7Var);
                AndroidUtilities.runOnUIThread(o7Var, 3000L);
            }
            org.telegram.ui.Components.k6 k6Var = ccVar.b;
            int i10 = p7Var4.g;
            k6Var.setText(i10 == 1 ? LocaleController.getString(R.string.PaidMessageSentTitleOne) : LocaleController.formatPluralString("PaidMessageSentTitle", i10, new Object[0]));
            ccVar.c.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) p7Var4.h))));
            ccVar.a.d();
            return;
        }
        z4 = true;
        int id22 = messageObject.getId();
        if (z4) {
        }
        long dialogId2 = messageObject.getDialogId();
        m6 m6Var2 = new m6(0, this, z4);
        n6Var = new n6(this, z4, id22, 0);
        U = LaunchActivity.U();
        p7Var = this.N;
        if (p7Var != null) {
            this.N = null;
        }
        if (this.N != null) {
        }
        if (U != null) {
        }
        n6Var.run();
    }

    public final s7 d0(final MessageObject messageObject, final xn xnVar, final long j10, boolean z4, boolean z10, final Long l10) {
        String str;
        long j11;
        final t7 t7Var;
        String str2;
        n7 b10 = n7.b(messageObject);
        int i10 = this.a;
        t7 y10 = y(i10, false);
        Context t6 = t(xnVar);
        if (t6 == null) {
            return null;
        }
        str = "";
        if (z10 && y10.e && y10.q(false, false, null).amount <= 0) {
            long a2 = xnVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(xnVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = xnVar.getMessagesController().getChat(Long.valueOf(-a2));
                if (chat != null) {
                    str = chat.title;
                }
            }
            final int i11 = 0;
            new z9(t6, xnVar.getResourceProvider(), j10, 5, str, new Runnable(this) { // from class: mh.o6
                public final /* synthetic */ t7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.d0(messageObject, xnVar, j10, true, true, l10);
                            break;
                        default:
                            this.b.d0(messageObject, xnVar, j10, true, true, l10);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        s7 s7Var = this.B;
        if (s7Var == null || !s7Var.a.equals(b10)) {
            s7 s7Var2 = this.B;
            if (s7Var2 != null) {
                s7Var2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            j11 = 0;
            t7Var = this;
            s7 s7Var3 = new s7(t7Var, b10, messageObject, xnVar, z4);
            t7Var.B = s7Var3;
            s7Var3.n = l10;
        } else {
            j11 = 0;
            t7Var = this;
        }
        if (t7Var.B.h + j10 > MessagesController.getInstance(i10).starsPaidReactionAmountMax) {
            t7Var.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            t7Var.B = new s7(t7Var, b10, messageObject, xnVar, z4);
        }
        final long j12 = t7Var.B.h + j10;
        if (z10 && y10.e && y10.q(false, false, null).amount < j12) {
            t7Var.B.a();
            long a10 = xnVar.a();
            if (a10 >= j11) {
                str2 = UserObject.getForcedFirstName(xnVar.getMessagesController().getUser(Long.valueOf(a10)));
            } else {
                TLRPC.Chat chat2 = xnVar.getMessagesController().getChat(Long.valueOf(-a10));
                str2 = chat2 != null ? chat2.title : "";
            }
            final int i12 = 1;
            new z9(t6, xnVar.getResourceProvider(), j12, 5, str2, new Runnable(t7Var) { // from class: mh.o6
                public final /* synthetic */ t7 b;

                {
                    this.b = t7Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.b.d0(messageObject, xnVar, j12, true, true, l10);
                            break;
                        default:
                            this.b.d0(messageObject, xnVar, j12, true, true, l10);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        s7 s7Var4 = t7Var.B;
        boolean z11 = !(messageObject == null || messageObject.doesPaidReactionExist()) || z4;
        q7 q7Var = s7Var4.p;
        t7 t7Var2 = s7Var4.q;
        int i13 = t7Var2.a;
        cc ccVar = s7Var4.e;
        MessageObject messageObject2 = s7Var4.b;
        if (!s7Var4.i && !s7Var4.j) {
            s7Var4.h += j10;
            System.currentTimeMillis();
            ccVar.c.a();
            ccVar.c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) s7Var4.h, new Object[0])), true, true);
            if (s7Var4.m) {
                s7Var4.f.b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(q7Var);
                AndroidUtilities.runOnUIThread(q7Var, 5000L);
            }
            if (z11) {
                s7Var4.l = true;
                messageObject2.addPaidReactions((int) j10, true, s7Var4.c());
                t7Var2.g += j10;
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                s7Var4.l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    s7Var4.k--;
                }
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                s7Var4.k += j10;
            }
            ccVar.b.setText(s7Var4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        s7 s7Var5 = t7Var.B;
        s7Var5.n = l10;
        return s7Var5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i10 = this.a;
        if (!MessagesController.getInstance(i10).starsPurchaseAvailable()) {
            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
            if (R == null || R.getContext() == null) {
                e0(activity, null);
                return;
            } else {
                e0(R.getContext(), R.getResourceProvider());
                return;
            }
        }
        boolean z4 = AppGlobalConfig.getInstance(i10).starsSpendTopUpInvoiceDisabled.get() && inputPeer != null;
        if ((!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) || z4) {
            if (!BillingController.getInstance().isReady()) {
                callback2.run(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            b6.h hVar = new b6.h();
            hVar.c = "inapp";
            hVar.b = tL_starsTopupOption.store_product;
            p2.p a2 = hVar.a();
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
        JSONObject p10 = sh.p2.p(I(), false);
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new hg.y(this, callback2, tL_inputInvoiceStars, 9));
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
        qc.a0(LaunchActivity.U()).Q(R.raw.error, 36, ja.Q0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i10;
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.g6 I = I();
        boolean z4 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z4 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new lh.g1(this, callback2, j10, tLObject, tL_textWithEntities, 3));
                return;
            }
            if (z4) {
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
            JSONObject p10 = sh.p2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: mh.z5
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final t7 t7Var = t7.this;
                    final Utilities.Callback2 callback22 = callback2;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.g6 g6Var = I;
                    final String str = name;
                    final long j11 = j10;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.b6
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z10 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            Utilities.Callback2 callback23 = callback22;
                            if (!z10) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                t7.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
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
                            t7 t7Var2 = t7.this;
                            ConnectionsManager.getInstance(t7Var2.a).sendRequest(tL_payments_sendStarsForm, new d6(t7Var2, callback23, context3, g6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
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
            r(new b2(this, (Object) launchActivity, j10, (Object) str, 7));
        }
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.g6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new lh.g1(this, callback2, tL_payments_paymentFormStarGift, starGift, j10, 4));
            return;
        }
        String name = DialogObject.getName(this.a, j10);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.a).getInputPeer(j10);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z4;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        int i10 = 0;
        JSONObject p10 = sh.p2.p(I, false);
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p10.toString();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new d6(this, callback2, context2, I, j11, name, tL_payments_paymentFormStarGift, starGift, j10));
    }

    public final void h0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new z9(launchActivity, null, j10, 4, str, new ag.f(13), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        ic J = qc.a0(U).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new ag.f(12));
        J.j = 5000;
        J.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z4, final boolean z10, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final lh.s5 s5Var) {
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.g6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new Runnable() { // from class: mh.s5
                @Override // java.lang.Runnable
                public final void run() {
                    t7 t7Var = t7.this;
                    boolean z11 = t7Var.e;
                    lh.s5 s5Var2 = s5Var;
                    if (z11) {
                        t7Var.i(starGift, z4, z10, j10, tL_textWithEntities, s5Var2);
                    } else {
                        t7.e("NO_BALANCE");
                        s5Var2.run(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String name = DialogObject.getName(this.a, j10);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z4;
        tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.a).getInputPeer(j10);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z10;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject p10 = sh.p2.p(I, false);
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: mh.t5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final t7 t7Var = t7.this;
                final lh.s5 s5Var2 = s5Var;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.g6 g6Var = I;
                final String str = name;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z11 = z4;
                final boolean z12 = z10;
                final long j11 = j10;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.c6
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z13 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final lh.s5 s5Var3 = s5Var2;
                        if (!z13) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            t7.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            s5Var3.run(Boolean.FALSE, null);
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
                        final t7 t7Var2 = t7.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(t7Var2.a);
                        final Context context4 = context3;
                        final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z14 = z11;
                        final boolean z15 = z12;
                        final long j13 = j11;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: mh.h6
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final t7 t7Var3 = t7.this;
                                final lh.s5 s5Var4 = s5Var3;
                                final Context context5 = context4;
                                final org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                                final long j14 = j12;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z16 = z14;
                                final boolean z17 = z15;
                                final long j15 = j13;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.o5
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r5v16 */
                                    /* JADX WARN: Type inference failed for: r5v17, types: [boolean] */
                                    /* JADX WARN: Type inference failed for: r5v19 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i11;
                                        SpannableStringBuilder spannableStringBuilder;
                                        xa0 xa0Var;
                                        ?? r52;
                                        char c3;
                                        t7 t7Var4 = t7.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        lh.s5 s5Var5 = s5Var4;
                                        Context context6 = context5;
                                        org.telegram.ui.ActionBar.g6 g6Var4 = g6Var3;
                                        long j16 = j14;
                                        String str4 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z18 = z16;
                                        boolean z19 = z17;
                                        long j17 = j15;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                                        qc X = (R == null || R.visibleDialog != null) ? qc.X() : qc.a0(R);
                                        int i12 = 1;
                                        if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                            if (tL_error4 != null) {
                                                c3 = 0;
                                                if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (!MessagesController.getInstance(t7Var4.a).starsPurchaseAvailable()) {
                                                        s5Var5.run(Boolean.FALSE, null);
                                                        t7.e0(context6, g6Var4);
                                                        return;
                                                    } else {
                                                        boolean[] zArr = {false};
                                                        z9 z9Var = new z9(context6, g6Var4, j16, 6, str4, new i6(t7Var4, zArr, starGift5, z18, z19, j17, tL_textWithEntities5, s5Var5), 0L);
                                                        z9Var.setOnDismissListener(new hg.g(i12, s5Var5, zArr));
                                                        z9Var.show();
                                                        return;
                                                    }
                                                }
                                            } else {
                                                c3 = 0;
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                s5Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            }
                                            if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                s5Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            }
                                            s5Var5.run(Boolean.FALSE, null);
                                            int i13 = R.raw.error;
                                            int i14 = R.string.UnknownErrorCode;
                                            Object[] objArr = new Object[1];
                                            objArr[c3] = tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS";
                                            yh.s(i14, objArr, X, i13, 36);
                                            return;
                                        }
                                        Utilities.stageQueue.postRunnable(new f6(t7Var4, (TLRPC.TL_payments_paymentResult) tLObject4, i12));
                                        t7Var4.D = false;
                                        t7Var4.E = true;
                                        t7Var4.G = 0L;
                                        t7Var4.V();
                                        t7Var4.Q(j17);
                                        t7Var4.T(true);
                                        s5Var5.run(Boolean.TRUE, null);
                                        if (BirthdayController.getInstance(t7Var4.a).contains(j17)) {
                                            i11 = 0;
                                            MessagesController.getInstance(t7Var4.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
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
                                            TLRPC.ChatFull chatFull = MessagesController.getInstance(t7Var4.a).getChatFull(j18);
                                            if (chatFull != null) {
                                                chatFull.stargifts_count++;
                                                chatFull.flags2 |= 262144;
                                                MessagesController.getInstance(t7Var4.a).putChatFull(chatFull);
                                            }
                                            if (R instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) R;
                                                if (profileActivity.a() == j17) {
                                                    uz0 uz0Var = profileActivity.L;
                                                    if (uz0Var != null) {
                                                        uz0Var.v1(true);
                                                        profileActivity.L.Y0(14);
                                                        r52 = 0;
                                                        profileActivity.G4(false);
                                                    } else {
                                                        r52 = 0;
                                                    }
                                                    qc a02 = qc.a0(R);
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
                                            profileActivity2.whenFullyVisible(new lh.g1(profileActivity2, starGift5, spannableStringBuilder, j16, str4, 5));
                                            R.presentFragment(profileActivity2);
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                            if ((R instanceof xn) && ((xn) R).a() == j17) {
                                                qc.a0(R).s(starGift5.sticker, LocaleController.getString(R.string.StarsGiftCompleted), spannableStringBuilder2 != null ? spannableStringBuilder2 : AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j16, new Object[0]))).k(true);
                                            } else {
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(t7Var4.a);
                                                int i16 = NotificationCenter.closeProfileActivity;
                                                Long valueOf = Long.valueOf(j17);
                                                Boolean bool = Boolean.FALSE;
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, valueOf, bool);
                                                NotificationCenter.getInstance(t7Var4.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j17), bool);
                                                xn R9 = xn.R9(j17);
                                                R9.whenFullyVisible(new b2(R9, starGift5, spannableStringBuilder2, j16, 6));
                                                R.presentFragment(R9);
                                            }
                                        }
                                        MessagesController.getInstance(t7Var4.a).getMainSettings().edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.D1;
                                        if (launchActivity == null || (xa0Var = launchActivity.u0) == null) {
                                            return;
                                        }
                                        xa0Var.c(true);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public final void i0(final long j10, final long j11, boolean z4, final boolean z10) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i10 = this.a;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        togglenopaidmessagesexception.refund_charged = z4;
        togglenopaidmessagesexception.require_payment = !z10;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: mh.q6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new y6(t7.this, tLObject, j11, j10, z10));
            }
        });
    }

    public final boolean j() {
        if (!this.b) {
            return false;
        }
        if (rh.g.B0()) {
            return true;
        }
        TL_stars.StarsAmount p10 = p();
        return (p10.nanos == 0 && p10.amount == 0) ? false : true;
    }

    public final void j0(String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        int i10;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.D1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.g6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i11 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                d7 d7Var = new d7(this, j10, i11, zArr, callback2, context2, I, chatInvite, str);
                m2 m2Var = new m2(this, zArr, callback2);
                org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context2, I, false, false);
                LinearLayout f10 = org.telegram.messenger.y3.f(context2, 1);
                f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new j9(context2, 40, 0), k7.c6.c(-1.0f, -1));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context2);
                p9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
                z8Var.s(chatInvite.color);
                String str2 = chatInvite.title;
                z8Var.A = true;
                z8Var.n = 0;
                z8Var.m = false;
                org.telegram.ui.Components.z8.a(str2, null, null, z8Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    p9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", z8Var, chatInvite);
                } else {
                    p9Var.setImageDrawable(z8Var);
                }
                frameLayout.addView(p9Var, k7.c6.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i12 = org.telegram.ui.ActionBar.k6.h5;
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i12, I), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, k7.c6.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, k7.c6.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                y9 y9Var = new y9(context2, i11, I);
                k7.e6.a(y9Var);
                y9Var.setOnClickListener(new j8(y9Var, 1));
                frameLayout.addView(y9Var, k7.c6.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f10.addView(frameLayout, k7.c6.q(-1, 117, 7));
                TextView g10 = org.telegram.messenger.y3.g(context2, 1, 20.0f);
                g10.setTypeface(AndroidUtilities.bold());
                int i13 = org.telegram.ui.ActionBar.k6.j5;
                g10.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, I));
                org.telegram.messenger.y3.r(R.string.StarsSubscribeTitle, g10, 17);
                TextView i14 = yh.i(f10, g10, k7.c6.t(-2, -2, 1, 0, 8, 0, 0), context2);
                i14.setTextSize(1, 14.0f);
                i14.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, I));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i15 = tL_starsSubscriptionPricing.period;
                if (i15 == 2592000) {
                    i10 = i12;
                    i14.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    i10 = i12;
                    i14.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, i15 == 300 ? "5 minutes" : "a minute")));
                }
                i14.setMaxWidth(qh.f3.a(i14.getText(), i14.getPaint()));
                i14.setGravity(17);
                f10.addView(i14, k7.c6.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView g11 = org.telegram.messenger.y3.g(context2, 1, 14.0f);
                    g11.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, I));
                    g11.setText(Emoji.replaceEmoji(chatInvite.about, g11.getPaint().getFontMetricsInt(), false));
                    g11.setGravity(17);
                    f10.addView(g11, k7.c6.t(-2, -2, 1, 0, 6, 0, 22));
                }
                qh.d dVar = new qh.d(context2, I, true);
                dVar.g(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                f10.addView(dVar, k7.c6.n(-1, 48));
                g90 g90Var = new g90(context2, I);
                int i16 = 9;
                g90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new e2.f(context2, i16)));
                g90Var.setGravity(17);
                g90Var.setTextSize(1, 13.0f);
                g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.B6, I));
                g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, I));
                f10.addView(g90Var, k7.c6.t(-1, -2, 49, 14, 14, 14, 6));
                o10.customView = f10;
                dVar.setOnClickListener(new eg.o(d7Var, o10, dVar, i16));
                o10.setOnDismissListener(new fg.d0(m2Var, 5));
                o10.fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(i10, I));
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
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

    public final void l0(final MessageObject messageObject, final long j10, final Runnable runnable, final boolean z4) {
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: mh.a7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new f7(t7.this, tLObject, runnable, tL_error, z4, dialogId, id2, messageObject, j10));
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
            l7 l7Var = (l7) longSparseArray.valueAt(i10);
            for (int i11 = 0; i11 < l7Var.l.size(); i11++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) l7Var.l.get(i11);
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

    public final TL_stars.StarsAmount q(boolean z4, boolean z10, Runnable runnable) {
        if (((!this.e || System.currentTimeMillis() - this.c > 60000) && !this.d) || z10) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new eg.b3(10, this, runnable));
        }
        if (!z4 || this.g <= 0) {
            return this.f;
        }
        mf.a m9 = mf.a.m(this.f);
        return mf.a.g(Math.max(0L, m9.a() - this.g), m9.a).o();
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final mf.a s() {
        mf.a l10 = mf.a.l(p());
        if (l10 == null) {
            return mf.a.i(0L, this.b ? mf.b.b : mf.b.a);
        }
        return l10;
    }

    public final ArrayList u() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new j6(this, 3));
        return this.m;
    }

    public final ArrayList v() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new j6(this, 4));
        return this.p;
    }

    public final ArrayList z() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new j6(this, 2));
        return this.j;
    }
}
