package ai;

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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.y90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pa0;
import org.telegram.ui.rz0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class ha {
    public static volatile ha[][] S = (ha[][]) Array.newInstance((Class<?>) ha.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public fa B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public ca N;
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

    public ha(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    public static org.telegram.ui.ActionBar.g6 I() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            return U.getResourceProvider();
        }
        return null;
    }

    public static ha L(int i10) {
        return y(i10, true);
    }

    public static boolean U(int i10, ag.a aVar) {
        return aVar == null || x(i10, aVar.a).s().b >= aVar.b;
    }

    public static /* synthetic */ void a(ha haVar, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = haVar.I;
        ArrayList arrayList2 = haVar.J;
        int i10 = haVar.a;
        ArrayList arrayList3 = haVar.H;
        haVar.C = false;
        haVar.D = true;
        if (!(starGifts instanceof TL_stars.TL_starGifts)) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i11 = haVar.F;
                long currentTimeMillis = System.currentTimeMillis();
                haVar.G = currentTimeMillis;
                haVar.c0(i11, currentTimeMillis, arrayList3);
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
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new v8(3)), new v8(4)));
        arrayList.clear();
        arrayList.addAll(arrayList3);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new v8(5)));
        haVar.F = tL_starGifts.hash;
        haVar.G = System.currentTimeMillis();
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        haVar.c0(haVar.F, haVar.G, tL_starGifts.gifts);
    }

    public static /* synthetic */ void b(ha haVar, ArrayList arrayList, Integer num, Long l4, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = haVar.a;
        MessagesController.getInstance(i10).putUsers(arrayList2, true);
        MessagesController.getInstance(i10).putChats(arrayList3, true);
        haVar.E = true;
        ArrayList arrayList4 = haVar.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = haVar.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new v8(0)), new v8(1)));
        ArrayList arrayList6 = haVar.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new v8(2)));
        haVar.F = num.intValue();
        haVar.G = l4.longValue();
        haVar.C = false;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        haVar.V();
    }

    public static void e(String str) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, (R == null || R.visibleDialog != null) ? org.telegram.ui.Components.xc.X() : org.telegram.ui.Components.xc.a0(R), R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StarsNotAvailableText);
        org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
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

    public static Context t(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != null && o2Var.getContext() != null) {
            return o2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.J1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.J1;
        }
        if (ApplicationLoader.applicationContext != null) {
            return ApplicationLoader.applicationContext;
        }
        return null;
    }

    public static ha w(int i10) {
        return y(i10, false);
    }

    public static ha x(int i10, ag.b bVar) {
        return y(i10, bVar == ag.b.b);
    }

    public static ha y(int i10, boolean z10) {
        ha haVar;
        ha haVar2 = S[z10 ? 1 : 0][i10];
        if (haVar2 != null) {
            return haVar2;
        }
        synchronized (T[z10 ? 1 : 0][i10]) {
            try {
                haVar = S[z10 ? 1 : 0][i10];
                if (haVar == null) {
                    ha[] haVarArr = S[z10 ? 1 : 0];
                    ha haVar3 = new ha(i10, z10);
                    haVarArr[i10] = haVar3;
                    haVar = haVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return haVar;
    }

    public final long A(aa aaVar, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l4;
        fa faVar = this.B;
        if (faVar != null && faVar.a.equals(aaVar) && (l4 = this.B.n) != null) {
            return l4.longValue();
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
        Long l4;
        fa faVar = this.B;
        if (faVar != null && faVar.a.equals(aa.b(messageObject)) && (l4 = this.B.n) != null) {
            return l4.longValue();
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
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new g9(0, callback));
    }

    public final long D(int i10, long j10) {
        fa faVar = this.B;
        if (faVar == null) {
            return 0L;
        }
        aa aaVar = faVar.a;
        if (aaVar.a == j10 && aaVar.b == i10 && faVar.l) {
            return faVar.h;
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

    public final v9 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        v9 v9Var = (v9) longSparseArray.get(j10);
        if (v9Var != null || !z10) {
            return v9Var;
        }
        v9 v9Var2 = new v9(this.a, j10);
        longSparseArray.put(j10, v9Var2);
        return v9Var2;
    }

    public final y9 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        y9 y9Var = (y9) longSparseArray.get(j10);
        if (y9Var != null || !z10) {
            return y9Var;
        }
        y9 y9Var2 = new y9(this.a, j10, true);
        longSparseArray.put(j10, y9Var2);
        return y9Var2;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback callback) {
        Context context = LaunchActivity.J1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.g6 I = I();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            r(new c3(this, callback, starGift, j10));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.a).getInputPeer(j10);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject q6 = gi.d3.q(I, false);
        if (q6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = q6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new g(5, this, callback));
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
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new m3(this, j10, callback, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new k2(this, c2Var, inputSavedStarGift, callback, 2));
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
        y9 G = G(j10, false);
        if (G != null) {
            G.j(false);
        }
        v9 v9Var = (v9) this.K.get(j10);
        if (v9Var != null) {
            v9Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j10 = userFull.id;
        y9 G = G(j10, false);
        if (G != null && G.n != userFull.stargifts_count) {
            G.j(false);
        }
        v9 v9Var = (v9) this.K.get(j10);
        if (v9Var != null) {
            v9Var.g();
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
                r0 r0Var = new r0(this, 3);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new h(r0Var, 3));
                return;
            }
            a1.c cVar = new a1.c(this, 7);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new t0(messagesStorage, arrayList3, arrayList2, arrayList, cVar, 4));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new u8(this, 1));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new n2(this, i10, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03b5  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, Utilities.Callback callback) {
        long j10;
        String str;
        boolean z10;
        org.telegram.ui.ActionBar.h3 h3Var;
        w8 w8Var;
        x8 x8Var;
        ViewGroup viewGroup;
        MessageObject messageObject2;
        int i10;
        float f7;
        ?? r22;
        int i11;
        long j11;
        int i12;
        TextView textView;
        TextView textView2;
        long j12;
        TLRPC.Message message;
        boolean z11;
        String str2;
        TextView textView3;
        String formatPluralString;
        String str3;
        boolean z12;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message2;
        int i13;
        int i14;
        nc ncVar;
        w8 w8Var2;
        ImageLocation imageLocation;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        MessagesController.getInstance(this.a).putUsers(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.J1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.g6 I = I();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            r(new g3(this, runnable, messageObject, inputInvoice, tL_payments_paymentFormStars, callback, 3));
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
        String str4 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i16 = tL_payments_paymentFormStars.invoice.subscription_period;
        long j15 = j13;
        boolean[] zArr = {false};
        int i17 = this.a;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        w8 w8Var3 = new w8(this, j15, zArr, callback, context2, I, z10, str, messageObject, inputInvoice, tL_payments_paymentFormStars, i16, j14);
        x8 x8Var2 = new x8(this, zArr, callback);
        org.telegram.ui.ActionBar.h3 j16 = sl.j(1, context2, I, false);
        TLRPC.User user3 = MessagesController.getInstance(i17).getUser(Long.valueOf(j14));
        LinearLayout e = sl.e(context2, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.addView(new lc(context2, 40, 0), w7.z5.c(-1.0f, -1));
        if (messageObject == null || (message2 = messageObject.messageOwner) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            h3Var = j16;
            w8Var = w8Var3;
            x8Var = x8Var2;
            viewGroup = frameLayout;
            messageObject2 = messageObject;
            i10 = i16;
            f7 = 20.0f;
            if (webDocument != null) {
                FrameLayout frameLayout2 = new FrameLayout(context2);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context2);
                w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
                w9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "80_80", null, null);
                frameLayout2.addView(w9Var, w7.z5.e(80, 80, 48));
                viewGroup.addView(frameLayout2, w7.z5.e(80, 87, 17));
                TextView textView4 = new TextView(context2);
                textView4.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                r22 = 1;
                textView4.setTextSize(1, 13.0f);
                i11 = -1;
                textView4.setTextColor(-1);
                j11 = j15;
                textView4.setText(nd.S0(i2.o1.m((int) j15, ',', new StringBuilder("XTR ")), 0.85f, null));
                i12 = 0;
                textView4.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
                textView4.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(16.0f), -1133566));
                FrameLayout frameLayout3 = new FrameLayout(context2);
                int dp = AndroidUtilities.dp(20.0f);
                int i18 = org.telegram.ui.ActionBar.k6.h5;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i18, I));
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i18);
                frameLayout3.setBackground(c02);
                org.telegram.ui.ActionBar.r6.k(frameLayout3, c02, O, null, I);
                frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                frameLayout3.addView(textView4, w7.z5.q(-2, 16, 119));
                frameLayout2.addView(frameLayout3, w7.z5.a(-2.0f, 18.66f, 81));
                bd bdVar = new bd(context2, i17, I);
                w7.b6.a(bdVar);
                bdVar.setOnClickListener(new bb(bdVar, i12));
                viewGroup.addView(bdVar, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                e.addView(viewGroup, w7.z5.q(i11, 117, 7));
                TextView g10 = org.telegram.messenger.v0.g(context2, r22, f7);
                g10.setTypeface(AndroidUtilities.bold());
                int i19 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.W(g10, i19, I);
                if (i10 <= 0) {
                    g10.setText(Emoji.replaceEmoji(webDocument != null ? str4 : LocaleController.getString(R.string.StarsConfirmSubscriptionTitle), g10.getPaint().getFontMetricsInt(), i12));
                } else {
                    g10.setText(Emoji.replaceEmoji(webDocument != null ? str4 : LocaleController.getString(R.string.StarsConfirmPurchaseTitle), g10.getPaint().getFontMetricsInt(), i12));
                }
                NotificationCenter.listenEmojiLoading(g10);
                g10.setGravity(17);
                e.addView(g10, w7.z5.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                if (webDocument != null) {
                    LinearLayout e7 = sl.e(context2, i12);
                    int dp2 = AndroidUtilities.dp(28.0f);
                    int i20 = org.telegram.ui.ActionBar.k6.a7;
                    Drawable c03 = org.telegram.ui.ActionBar.k6.c0(dp2, org.telegram.ui.ActionBar.k6.w0(i20, I));
                    org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i20);
                    e7.setBackground(c03);
                    org.telegram.ui.ActionBar.r6.k(e7, c03, O2, null, I);
                    org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context2);
                    w9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
                    org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
                    h9Var.r(user3);
                    w9Var2.e(user3, h9Var);
                    e7.addView(w9Var2, w7.z5.n(28, 28));
                    TextView textView5 = new TextView(context2);
                    textView5.setTextSize(r22, 13.0f);
                    org.telegram.ui.ActionBar.r6.W(textView5, org.telegram.ui.ActionBar.k6.G6, I);
                    textView5.setText(UserObject.getUserName(user3));
                    e7.addView(textView5, w7.z5.t(-2, -2, 16, 6, 0, 10, 0));
                    e.addView(e7, w7.z5.t(-2, 28, 1, 0, 8, 0, 2));
                }
                textView = new TextView(context2);
                textView.setTextSize(r22, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView, i19, I);
                int i21 = 2;
                if (messageObject2 == null && (message = messageObject2.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    long dialogId = messageObject2.getDialogId();
                    TLRPC.Message message3 = messageObject2.messageOwner;
                    if (message3 != null && (messageFwdHeader = message3.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        dialogId = DialogObject.getPeerDialogId(peer);
                    }
                    if (dialogId < 0 && messageObject2.getFromChatId() > 0 && (user = MessagesController.getInstance(i17).getUser(Long.valueOf(messageObject2.getFromChatId()))) != null && user.bot) {
                        dialogId = user.id;
                    }
                    if (dialogId >= 0) {
                        TLRPC.User user4 = MessagesController.getInstance(i17).getUser(Long.valueOf(dialogId));
                        str2 = UserObject.getUserName(user4);
                        z11 = (user4 == null || !user4.bot) ? i12 : r22;
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(-dialogId));
                        String str5 = chat2 != null ? chat2.title : "";
                        z11 = i12;
                        str2 = str5;
                    }
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                    int i22 = i12;
                    int i23 = i22;
                    int i24 = i23;
                    while (i22 < tL_messageMediaPaidMedia.extended_media.size()) {
                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i22);
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                            if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                z12 = r22;
                            }
                            z12 = i12;
                        } else {
                            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                z12 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                            }
                            z12 = i12;
                        }
                        if (z12) {
                            i23++;
                        } else {
                            i24++;
                        }
                        i22++;
                    }
                    if (i23 == 0) {
                        str3 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                        long j17 = j11;
                        int i25 = (int) j17;
                        Object[] objArr = new Object[2];
                        objArr[i12] = i24 == r22 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i24, new Object[i12]);
                        objArr[r22] = str2;
                        formatPluralString = LocaleController.formatPluralString(str3, i25, objArr);
                        textView3 = textView;
                        j12 = j17;
                    } else {
                        textView3 = textView;
                        j12 = j11;
                        if (i24 == 0) {
                            str3 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                            int i26 = (int) j12;
                            Object[] objArr2 = new Object[2];
                            objArr2[i12] = i23 == r22 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i23, new Object[i12]);
                            objArr2[r22] = str2;
                            formatPluralString = LocaleController.formatPluralString(str3, i26, objArr2);
                        } else {
                            String str6 = z11 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                            int i27 = (int) j12;
                            String string = i24 == r22 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i24, new Object[i12]);
                            String string2 = i23 == r22 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i23, new Object[i12]);
                            Object[] objArr3 = new Object[3];
                            objArr3[i12] = string;
                            objArr3[r22] = string2;
                            objArr3[2] = str2;
                            formatPluralString = LocaleController.formatPluralString(str6, i27, objArr3);
                        }
                    }
                    textView2 = textView3;
                    textView2.setText(AndroidUtilities.replaceTags(formatPluralString));
                } else {
                    textView2 = textView;
                    j12 = j11;
                    if (i10 <= 0) {
                        String userName2 = UserObject.getUserName(user3);
                        Object[] objArr4 = new Object[2];
                        objArr4[i12] = str4;
                        objArr4[r22] = userName2;
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j12, objArr4)));
                    } else {
                        String userName3 = UserObject.getUserName(user3);
                        Object[] objArr5 = new Object[2];
                        objArr5[i12] = str4;
                        objArr5[r22] = userName3;
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j12, objArr5)));
                    }
                }
                textView2.setMaxWidth(ei.x3.a(textView2.getText(), textView2.getPaint()));
                textView2.setGravity(17);
                e.addView(textView2, w7.z5.t(-2, -2, 1, 0, 6, 0, 18));
                ei.d dVar = new ei.d(context2, I, r22);
                if (i10 <= 0) {
                    dVar.i(nd.R0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionButton", (int) j12))), i12, r22);
                } else {
                    dVar.i(nd.R0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", (int) j12))), i12, r22);
                }
                e.addView(dVar, w7.z5.c(48.0f, -1));
                y90 y90Var = new y90(context2, I);
                org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.z6, I);
                org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, I);
                y90Var.setTextSize(r22, 14.0f);
                y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10 <= 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new sa(context2, i21)));
                y90Var.setGravity(17);
                e.addView(y90Var, w7.z5.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                h3Var2.customView = e;
                dVar.setOnClickListener(new v0(w8Var, h3Var2, dVar, r22));
                h3Var2.setOnDismissListener(new cb(x8Var, i12));
                h3Var2.fixNavigationBar();
                h3Var2.show();
            }
            org.telegram.ui.Components.w9 w9Var3 = new org.telegram.ui.Components.w9(context2);
            w9Var3.setRoundRadius(AndroidUtilities.dp(80.0f));
            org.telegram.ui.Components.h9 h9Var2 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
            h9Var2.r(user3);
            w9Var3.e(user3, h9Var2);
            viewGroup.addView(w9Var3, w7.z5.e(80, 80, 17));
        } else {
            nc ncVar2 = new nc(context2);
            ncVar2.H = new Path();
            ncVar2.I = new RectF();
            ncVar2.J = context2.getResources().getDrawable(R.drawable.large_locked_post).mutate();
            ncVar2.setRoundRadius(AndroidUtilities.dp(24.0f));
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                h3Var = j16;
                x8Var = x8Var2;
                viewGroup = frameLayout;
                w8Var = w8Var3;
                messageObject2 = messageObject;
                i10 = i16;
                i13 = 17;
                i14 = 80;
                f7 = 20.0f;
            } else {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                    imageLocation = ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, messageObject.messageOwner);
                    ncVar = ncVar2;
                    w8Var2 = w8Var3;
                } else {
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            ncVar = ncVar2;
                            imageLocation = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(80.0f), true), messageMedia.photo);
                        } else {
                            ncVar = ncVar2;
                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                imageLocation = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(80.0f), true), messageMedia.document);
                            }
                        }
                        w8Var2 = w8Var3;
                    } else {
                        ncVar = ncVar2;
                    }
                    w8Var2 = w8Var3;
                    imageLocation = null;
                }
                w8Var = w8Var2;
                ncVar2 = ncVar;
                h3Var = j16;
                x8Var = x8Var2;
                i10 = i16;
                viewGroup = frameLayout;
                i13 = 17;
                i14 = 80;
                f7 = 20.0f;
                ncVar2.l(imageLocation, "80_80_b2", null, null, null, messageObject);
                messageObject2 = messageObject;
            }
            viewGroup.addView(ncVar2, w7.z5.e(i14, i14, i13));
        }
        j11 = j15;
        r22 = 1;
        i11 = -1;
        i12 = 0;
        bd bdVar2 = new bd(context2, i17, I);
        w7.b6.a(bdVar2);
        bdVar2.setOnClickListener(new bb(bdVar2, i12));
        viewGroup.addView(bdVar2, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        e.addView(viewGroup, w7.z5.q(i11, 117, 7));
        TextView g102 = org.telegram.messenger.v0.g(context2, r22, f7);
        g102.setTypeface(AndroidUtilities.bold());
        int i192 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.W(g102, i192, I);
        if (i10 <= 0) {
        }
        NotificationCenter.listenEmojiLoading(g102);
        g102.setGravity(17);
        e.addView(g102, w7.z5.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
        if (webDocument != null) {
        }
        textView = new TextView(context2);
        textView.setTextSize(r22, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView, i192, I);
        int i212 = 2;
        if (messageObject2 == null) {
        }
        textView2 = textView;
        j12 = j11;
        if (i10 <= 0) {
        }
        textView2.setMaxWidth(ei.x3.a(textView2.getText(), textView2.getPaint()));
        textView2.setGravity(17);
        e.addView(textView2, w7.z5.t(-2, -2, 1, 0, 6, 0, 18));
        ei.d dVar2 = new ei.d(context2, I, r22);
        if (i10 <= 0) {
        }
        e.addView(dVar2, w7.z5.c(48.0f, -1));
        y90 y90Var2 = new y90(context2, I);
        org.telegram.ui.ActionBar.r6.W(y90Var2, org.telegram.ui.ActionBar.k6.z6, I);
        org.telegram.ui.ActionBar.r6.I(y90Var2, org.telegram.ui.ActionBar.k6.gc, I);
        y90Var2.setTextSize(r22, 14.0f);
        y90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10 <= 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new sa(context2, i212)));
        y90Var2.setGravity(17);
        e.addView(y90Var2, w7.z5.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
        org.telegram.ui.ActionBar.h3 h3Var22 = h3Var;
        h3Var22.customView = e;
        dVar2.setOnClickListener(new v0(w8Var, h3Var22, dVar2, r22));
        h3Var22.setOnDismissListener(new cb(x8Var, i12));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: ai.b8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final ha haVar = ha.this;
                final Utilities.Callback2 callback22 = callback2;
                final long j11 = j10;
                final String str3 = str2;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.g6 g6Var = I;
                final TLRPC.ChatInvite chatInvite2 = chatInvite;
                final String str4 = str;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.j8
                    @Override // java.lang.Runnable
                    public final void run() {
                        pa0 pa0Var;
                        ha haVar2 = ha.this;
                        TLObject tLObject2 = tLObject;
                        Utilities.Callback2 callback23 = callback22;
                        long j12 = j11;
                        String str5 = str3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        TLRPC.ChatInvite chatInvite3 = chatInvite2;
                        String str6 = str4;
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        org.telegram.ui.Components.xc a02 = !AndroidUtilities.hasDialogOnTop(R) ? org.telegram.ui.Components.xc.a0(R) : org.telegram.ui.Components.xc.X();
                        int i10 = 0;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                callback23.run(0L, Boolean.FALSE);
                                i2.o1.t(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, a02, R.raw.error, 36);
                                return;
                            } else if (!MessagesController.getInstance(haVar2.a).starsPurchaseAvailable()) {
                                callback23.run(0L, Boolean.FALSE);
                                ha.e0(context3, g6Var2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                dd ddVar = new dd(context3, g6Var2, j12, 1, chatInvite3.title, new t0(haVar2, zArr, str6, chatInvite3, callback23, 3), 0L);
                                ddVar.setOnDismissListener(new q8(callback23, zArr, 0));
                                ddVar.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.stageQueue.postRunnable(new p8(haVar2, tL_payments_paymentResult, i10));
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
                        LaunchActivity launchActivity = LaunchActivity.J1;
                        if (launchActivity != null && (pa0Var = launchActivity.x0) != null) {
                            pa0Var.c(true);
                        }
                        haVar2.T(true);
                        haVar2.S();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: ai.m9
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final ha haVar = ha.this;
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
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.p9
                    /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
                    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        LaunchActivity launchActivity;
                        pa0 pa0Var;
                        TLRPC.Message message2;
                        ha haVar2 = ha.this;
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
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        org.telegram.ui.Components.xc X = (R == null || R.visibleDialog != null) ? org.telegram.ui.Components.xc.X() : org.telegram.ui.Components.xc.a0(R);
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null) {
                                z10 = false;
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!MessagesController.getInstance(haVar2.a).starsPurchaseAvailable()) {
                                        callback3.run(Boolean.FALSE);
                                        ha.e0(context3, g6Var2);
                                        return;
                                    } else {
                                        boolean[] zArr = {false};
                                        dd ddVar = new dd(context3, g6Var2, j15, 0, str6, new g3(haVar2, zArr, messageObject3, inputInvoice3, tL_payments_paymentFormStars3, callback3, 5), j16);
                                        ddVar.setOnDismissListener(new r9(callback3, zArr));
                                        ddVar.show();
                                        return;
                                    }
                                }
                            } else {
                                z10 = false;
                            }
                            if (tL_error2 != null && "FORM_EXPIRED".equals(tL_error2.text)) {
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject q6 = gi.d3.q(g6Var2, z10);
                                if (q6 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = q6.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = inputInvoice3;
                                ConnectionsManager.getInstance(haVar2.a).sendRequest(tL_payments_getPaymentForm, new s9(haVar2, messageObject3, inputInvoice3, callback3, X, 0));
                                return;
                            }
                            org.telegram.ui.Components.xc xcVar = X;
                            callback3.run(Boolean.FALSE);
                            i2.o1.t(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, xcVar, R.raw.error, 36);
                            if (messageObject3 != null) {
                                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                tL_messages_getExtendedMedia.peer = MessagesController.getInstance(haVar2.a).getInputPeer(j16);
                                tL_messages_getExtendedMedia.id.add(Integer.valueOf(messageObject3.getId()));
                                ConnectionsManager.getInstance(haVar2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                return;
                            }
                            return;
                        }
                        callback3.run(Boolean.TRUE);
                        Utilities.stageQueue.postRunnable(new p8(haVar2, (TLRPC.TL_payments_paymentResult) tLObject2, 4));
                        if (messageObject3 != null && (message2 = messageObject3.messageOwner) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            Drawable mutate = context3.getResources().getDrawable(R.drawable.star_small_inner).mutate();
                            String string = LocaleController.getString(R.string.StarsMediaPurchaseCompleted);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsMediaPurchaseCompletedInfo", (int) j15, str6));
                            X.getClass();
                            org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(X.W(), X.c);
                            ncVar.a.setImageDrawable(mutate);
                            ncVar.b.setText(string);
                            ncVar.c.setText(replaceTags);
                            X.b(ncVar, 2750).j();
                        } else {
                            if (i13 <= 0) {
                                z11 = true;
                                X.M(LocaleController.getString(R.string.StarsPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsPurchaseCompletedInfo", (int) j15, str7, str6)), R.raw.stars_send).j();
                                launchActivity = LaunchActivity.J1;
                                if (launchActivity != null && (pa0Var = launchActivity.x0) != null) {
                                    pa0Var.c(z11);
                                }
                                if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                    haVar2.T(true);
                                }
                                if (messageObject3 == null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia2.peer = MessagesController.getInstance(haVar2.a).getInputPeer(j16);
                                    tL_messages_getExtendedMedia2.id.add(Integer.valueOf(messageObject3.getId()));
                                    ConnectionsManager.getInstance(haVar2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                    return;
                                }
                                return;
                            }
                            X.M(LocaleController.getString(R.string.StarsBotSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsBotSubscriptionCompletedInfo", (int) j15, str7, str6)), R.raw.stars_send).j();
                        }
                        z11 = true;
                        launchActivity = LaunchActivity.J1;
                        if (launchActivity != null) {
                            pa0Var.c(z11);
                        }
                        if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                        }
                        haVar2.T(true);
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
                this.R.put(Integer.valueOf(id2), new a3.l0(this, hashSet, runnable, 14));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void c0(int i10, long j10, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.a);
        messagesStorage.getStorageQueue().postRunnable(new h9(messagesStorage, j10, arrayList, i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (r10.a == r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0075, code lost:
    
        if (r2.intValue() >= 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x007c, code lost:
    
        if (r0 >= 100) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(MessageObject messageObject) {
        boolean z10;
        z8 z8Var;
        org.telegram.ui.ActionBar.o2 U;
        ca caVar;
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return;
        }
        long j10 = message.paid_message_stars;
        if (j10 <= 0 || messageObject.isEphemeral()) {
            return;
        }
        ca caVar2 = this.N;
        if (caVar2 == null || caVar2.g <= 0 || !caVar2.m || caVar2.n || caVar2.o) {
            if (!org.telegram.ui.Components.f5.d0(this.a, messageObject.getDialogId())) {
                Long l4 = (Long) this.O.get(Long.valueOf(messageObject.getDialogId()));
                if (l4 == null || System.currentTimeMillis() - l4.longValue() <= 5000) {
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
            y8 y8Var = new y8(0, this, z10);
            z8Var = new z8(this, z10, id2, 0);
            U = LaunchActivity.U();
            caVar = this.N;
            if (caVar != null && (caVar.o || caVar.n)) {
                this.N = null;
            }
            if (this.N != null) {
                if (U != null && !U.isRemovingFromStack()) {
                    ca caVar3 = this.N;
                    if (caVar3.b == dialogId) {
                    }
                }
                this.N.a();
                this.N = null;
            }
            if (U != null || U.isRemovingFromStack()) {
                z8Var.run();
            }
            if (this.N == null) {
                this.N = new ca(U, dialogId);
            }
            ca caVar4 = this.N;
            org.telegram.ui.Components.kc kcVar = caVar4.d;
            org.telegram.ui.Components.oc ocVar = caVar4.e;
            ba baVar = caVar4.p;
            if (caVar4.n || caVar4.o) {
                z8Var.run();
                return;
            }
            caVar4.g++;
            caVar4.k.add(messageObject);
            caVar4.h += j10;
            caVar4.i = y8Var;
            caVar4.j.add(z8Var);
            if (caVar4.m && !z10) {
                caVar4.m = false;
                AndroidUtilities.cancelRunOnUIThread(baVar);
                org.telegram.ui.Components.qc qcVar = caVar4.c;
                qcVar.j = 5000;
                qcVar.i(true);
                if (System.currentTimeMillis() - caVar4.l > 500) {
                    ocVar.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                } else {
                    ocVar.setAlpha(0.0f);
                    ocVar.setVisibility(8);
                }
            }
            ga gaVar = caVar4.f;
            if (gaVar != null && caVar4.m) {
                gaVar.b = 3000L;
                AndroidUtilities.cancelRunOnUIThread(baVar);
                AndroidUtilities.runOnUIThread(baVar, 3000L);
            }
            org.telegram.ui.Components.q6 q6Var = kcVar.b;
            int i10 = caVar4.g;
            q6Var.setText(i10 == 1 ? LocaleController.getString(R.string.PaidMessageSentTitleOne) : LocaleController.formatPluralString("PaidMessageSentTitle", i10, new Object[0]));
            kcVar.c.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) caVar4.h))));
            kcVar.a.d();
            return;
        }
        z10 = true;
        int id22 = messageObject.getId();
        if (z10) {
        }
        long dialogId2 = messageObject.getDialogId();
        y8 y8Var2 = new y8(0, this, z10);
        z8Var = new z8(this, z10, id22, 0);
        U = LaunchActivity.U();
        caVar = this.N;
        if (caVar != null) {
            this.N = null;
        }
        if (this.N != null) {
        }
        if (U != null) {
        }
        z8Var.run();
    }

    public final fa d0(final MessageObject messageObject, final sn snVar, final long j10, boolean z10, boolean z11, final Long l4) {
        String str;
        long j11;
        final ha haVar;
        String str2;
        aa b10 = aa.b(messageObject);
        int i10 = this.a;
        ha y3 = y(i10, false);
        Context t10 = t(snVar);
        if (t10 == null) {
            return null;
        }
        str = "";
        if (z11 && y3.e && y3.q(false, false, null).amount <= 0) {
            long a2 = snVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(snVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = snVar.getMessagesController().getChat(Long.valueOf(-a2));
                if (chat != null) {
                    str = chat.title;
                }
            }
            final int i11 = 0;
            new dd(t10, snVar.getResourceProvider(), j10, 5, str, new Runnable(this) { // from class: ai.a9
                public final /* synthetic */ ha b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.d0(messageObject, snVar, j10, true, true, l4);
                            break;
                        default:
                            this.b.d0(messageObject, snVar, j10, true, true, l4);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        fa faVar = this.B;
        if (faVar == null || !faVar.a.equals(b10)) {
            fa faVar2 = this.B;
            if (faVar2 != null) {
                faVar2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            j11 = 0;
            haVar = this;
            fa faVar3 = new fa(haVar, b10, messageObject, snVar, z10);
            haVar.B = faVar3;
            faVar3.n = l4;
        } else {
            j11 = 0;
            haVar = this;
        }
        if (haVar.B.h + j10 > MessagesController.getInstance(i10).starsPaidReactionAmountMax) {
            haVar.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            haVar.B = new fa(haVar, b10, messageObject, snVar, z10);
        }
        final long j12 = haVar.B.h + j10;
        if (z11 && y3.e && y3.q(false, false, null).amount < j12) {
            haVar.B.a();
            long a10 = snVar.a();
            if (a10 >= j11) {
                str2 = UserObject.getForcedFirstName(snVar.getMessagesController().getUser(Long.valueOf(a10)));
            } else {
                TLRPC.Chat chat2 = snVar.getMessagesController().getChat(Long.valueOf(-a10));
                str2 = chat2 != null ? chat2.title : "";
            }
            final int i12 = 1;
            new dd(t10, snVar.getResourceProvider(), j12, 5, str2, new Runnable(haVar) { // from class: ai.a9
                public final /* synthetic */ ha b;

                {
                    this.b = haVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.b.d0(messageObject, snVar, j12, true, true, l4);
                            break;
                        default:
                            this.b.d0(messageObject, snVar, j12, true, true, l4);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        fa faVar4 = haVar.B;
        boolean z12 = !(messageObject == null || messageObject.doesPaidReactionExist()) || z10;
        da daVar = faVar4.p;
        ha haVar2 = faVar4.q;
        int i13 = haVar2.a;
        org.telegram.ui.Components.kc kcVar = faVar4.e;
        MessageObject messageObject2 = faVar4.b;
        if (!faVar4.i && !faVar4.j) {
            faVar4.h += j10;
            System.currentTimeMillis();
            kcVar.c.a();
            kcVar.c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) faVar4.h, new Object[0])), true, true);
            if (faVar4.m) {
                faVar4.f.b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(daVar);
                AndroidUtilities.runOnUIThread(daVar, 5000L);
            }
            if (z12) {
                faVar4.l = true;
                messageObject2.addPaidReactions((int) j10, true, faVar4.c());
                haVar2.g += j10;
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                faVar4.l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    faVar4.k--;
                }
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                faVar4.k += j10;
            }
            kcVar.b.setText(faVar4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        fa faVar5 = haVar.B;
        faVar5.n = l4;
        return faVar5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i10 = this.a;
        if (!MessagesController.getInstance(i10).starsPurchaseAvailable()) {
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
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
            c5.a aVar = new c5.a();
            aVar.b = "inapp";
            aVar.a = tL_starsTopupOption.store_product;
            c5.s a2 = aVar.a();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(a2), new a1.d(callback2, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity, 1));
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
        JSONObject q6 = gi.d3.q(I(), false);
        if (q6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = q6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new j2(this, callback2, tL_inputInvoiceStars, 3));
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
        org.telegram.ui.Components.xc.a0(LaunchActivity.U()).Q(R.raw.error, 36, nd.R0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i10;
        Context context = LaunchActivity.J1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.g6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new z(this, callback2, j10, tLObject, tL_textWithEntities, 3));
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
            JSONObject q6 = gi.d3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: ai.i8
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final ha haVar = ha.this;
                    final Utilities.Callback2 callback22 = callback2;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.g6 g6Var = I;
                    final String str = name;
                    final long j11 = j10;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.k8
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            Utilities.Callback2 callback23 = callback22;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                ha.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
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
                            ha haVar2 = ha.this;
                            ConnectionsManager.getInstance(haVar2.a).sendRequest(tL_payments_sendStarsForm, new n8(haVar2, callback23, context3, g6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
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
            r(new c3(this, (Object) launchActivity, j10, (Object) str, 7));
        }
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.J1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.g6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new z(this, callback2, tL_payments_paymentFormStarGift, starGift, j10, 4));
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
        JSONObject q6 = gi.d3.q(I, false);
        if (q6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = q6.toString();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new n8(this, callback2, context2, I, j11, name, tL_payments_paymentFormStarGift, starGift, j10));
    }

    public final void h0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new dd(launchActivity, null, j10, 4, str, new ah.j(4), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        org.telegram.ui.Components.qc J = org.telegram.ui.Components.xc.a0(U).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new ah.j(3));
        J.j = 5000;
        J.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final yh.l4 l4Var) {
        Context context = LaunchActivity.J1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.g6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new Runnable() { // from class: ai.z7
                @Override // java.lang.Runnable
                public final void run() {
                    ha haVar = ha.this;
                    boolean z12 = haVar.e;
                    yh.l4 l4Var2 = l4Var;
                    if (z12) {
                        haVar.i(starGift, z10, z11, j10, tL_textWithEntities, l4Var2);
                    } else {
                        ha.e("NO_BALANCE");
                        l4Var2.run(Boolean.FALSE, null);
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
        JSONObject q6 = gi.d3.q(I, false);
        if (q6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = q6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: ai.a8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final ha haVar = ha.this;
                final yh.l4 l4Var2 = l4Var;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.g6 g6Var = I;
                final String str = name;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z12 = z10;
                final boolean z13 = z11;
                final long j11 = j10;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.l8
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final yh.l4 l4Var3 = l4Var2;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            ha.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            l4Var3.run(Boolean.FALSE, null);
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
                        final ha haVar2 = ha.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(haVar2.a);
                        final Context context4 = context3;
                        final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z15 = z12;
                        final boolean z16 = z13;
                        final long j13 = j11;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: ai.r8
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final ha haVar3 = ha.this;
                                final yh.l4 l4Var4 = l4Var3;
                                final Context context5 = context4;
                                final org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                                final long j14 = j12;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z17 = z15;
                                final boolean z18 = z16;
                                final long j15 = j13;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.u7
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
                                        ha haVar4 = ha.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        yh.l4 l4Var5 = l4Var4;
                                        Context context6 = context5;
                                        org.telegram.ui.ActionBar.g6 g6Var4 = g6Var3;
                                        long j16 = j14;
                                        String str4 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z19 = z17;
                                        boolean z20 = z18;
                                        long j17 = j15;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                                        org.telegram.ui.Components.xc X = (R == null || R.visibleDialog != null) ? org.telegram.ui.Components.xc.X() : org.telegram.ui.Components.xc.a0(R);
                                        int i12 = 1;
                                        if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                            if (tL_error4 != null) {
                                                c10 = 0;
                                                if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (!MessagesController.getInstance(haVar4.a).starsPurchaseAvailable()) {
                                                        l4Var5.run(Boolean.FALSE, null);
                                                        ha.e0(context6, g6Var4);
                                                        return;
                                                    } else {
                                                        boolean[] zArr = {false};
                                                        dd ddVar = new dd(context6, g6Var4, j16, 6, str4, new s8(haVar4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, l4Var5), 0L);
                                                        ddVar.setOnDismissListener(new z3(l4Var5, zArr, i12));
                                                        ddVar.show();
                                                        return;
                                                    }
                                                }
                                            } else {
                                                c10 = 0;
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                l4Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            }
                                            if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                l4Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            }
                                            l4Var5.run(Boolean.FALSE, null);
                                            int i13 = R.raw.error;
                                            int i14 = R.string.UnknownErrorCode;
                                            Object[] objArr = new Object[1];
                                            objArr[c10] = tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS";
                                            i2.o1.t(i14, objArr, X, i13, 36);
                                            return;
                                        }
                                        Utilities.stageQueue.postRunnable(new p8(haVar4, (TLRPC.TL_payments_paymentResult) tLObject4, i12));
                                        haVar4.D = false;
                                        haVar4.E = true;
                                        haVar4.G = 0L;
                                        haVar4.V();
                                        haVar4.Q(j17);
                                        haVar4.T(true);
                                        l4Var5.run(Boolean.TRUE, null);
                                        if (BirthdayController.getInstance(haVar4.a).contains(j17)) {
                                            i11 = 0;
                                            MessagesController.getInstance(haVar4.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
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
                                            TLRPC.ChatFull chatFull = MessagesController.getInstance(haVar4.a).getChatFull(j18);
                                            if (chatFull != null) {
                                                chatFull.stargifts_count++;
                                                chatFull.flags2 |= 262144;
                                                MessagesController.getInstance(haVar4.a).putChatFull(chatFull);
                                            }
                                            if (R instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) R;
                                                if (profileActivity.a() == j17) {
                                                    rz0 rz0Var = profileActivity.O;
                                                    if (rz0Var != null) {
                                                        rz0Var.A1(true);
                                                        profileActivity.O.b1(14);
                                                        r52 = 0;
                                                        profileActivity.I4(false);
                                                    } else {
                                                        r52 = 0;
                                                    }
                                                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(R);
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
                                            profileActivity2.whenFullyVisible(new z(profileActivity2, starGift5, spannableStringBuilder, j16, str4, 5));
                                            R.presentFragment(profileActivity2);
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                            if ((R instanceof sn) && ((sn) R).a() == j17) {
                                                org.telegram.ui.Components.xc.a0(R).s(starGift5.sticker, LocaleController.getString(R.string.StarsGiftCompleted), spannableStringBuilder2 != null ? spannableStringBuilder2 : AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j16, new Object[0]))).k(true);
                                            } else {
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(haVar4.a);
                                                int i16 = NotificationCenter.closeProfileActivity;
                                                Long valueOf = Long.valueOf(j17);
                                                Boolean bool = Boolean.FALSE;
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, valueOf, bool);
                                                NotificationCenter.getInstance(haVar4.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j17), bool);
                                                sn W9 = sn.W9(j17);
                                                W9.whenFullyVisible(new c3(W9, starGift5, spannableStringBuilder2, j16, 6));
                                                R.presentFragment(W9);
                                            }
                                        }
                                        MessagesController.getInstance(haVar4.a).getMainSettings().edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.J1;
                                        if (launchActivity == null || (pa0Var = launchActivity.x0) == null) {
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
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: ai.b9
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new j9(ha.this, tLObject, j11, j10, z11));
            }
        });
    }

    public final boolean j() {
        if (!this.b) {
            return false;
        }
        if (fi.g.C0()) {
            return true;
        }
        TL_stars.StarsAmount p5 = p();
        return (p5.nanos == 0 && p5.amount == 0) ? false : true;
    }

    public final void j0(String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.J1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.g6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i10 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                o9 o9Var = new o9(this, j10, i10, zArr, callback2, context2, I, chatInvite, str);
                a1.f fVar = new a1.f(this, zArr, callback2);
                org.telegram.ui.ActionBar.h3 j11 = sl.j(1, context2, I, false);
                LinearLayout e = sl.e(context2, 1);
                e.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new lc(context2, 40, 0), w7.z5.c(-1.0f, -1));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context2);
                w9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
                h9Var.s(chatInvite.color);
                String str2 = chatInvite.title;
                h9Var.A = true;
                h9Var.n = 0;
                h9Var.m = false;
                org.telegram.ui.Components.h9.a(str2, null, null, h9Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    w9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", h9Var, chatInvite);
                } else {
                    w9Var.setImageDrawable(h9Var);
                }
                frameLayout.addView(w9Var, w7.z5.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i11 = org.telegram.ui.ActionBar.k6.h5;
                org.telegram.ui.ActionBar.r6.z(frameLayout, drawable, i11, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, w7.z5.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, w7.z5.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                bd bdVar = new bd(context2, i10, I);
                w7.b6.a(bdVar);
                bdVar.setOnClickListener(new bb(bdVar, 1));
                frameLayout.addView(bdVar, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                e.addView(frameLayout, w7.z5.q(-1, 117, 7));
                TextView g10 = org.telegram.messenger.v0.g(context2, 1, 20.0f);
                g10.setTypeface(AndroidUtilities.bold());
                int i12 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.W(g10, i12, I);
                sl.m(R.string.StarsSubscribeTitle, g10, 17);
                TextView f7 = sl.f(e, g10, w7.z5.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f7.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(f7, i12, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i13 = tL_starsSubscriptionPricing.period;
                int i14 = 2;
                if (i13 == 2592000) {
                    f7.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    f7.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, i13 == 300 ? "5 minutes" : "a minute")));
                }
                f7.setMaxWidth(ei.x3.a(f7.getText(), f7.getPaint()));
                f7.setGravity(17);
                e.addView(f7, w7.z5.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.W(textView, i12, I);
                    textView.setText(Emoji.replaceEmoji(chatInvite.about, textView.getPaint().getFontMetricsInt(), false));
                    textView.setGravity(17);
                    e.addView(textView, w7.z5.t(-2, -2, 1, 0, 6, 0, 22));
                }
                ei.d dVar = new ei.d(context2, I, true);
                dVar.i(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                e.addView(dVar, w7.z5.n(-1, 48));
                y90 y90Var = new y90(context2, I);
                y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new sa(context2, 5)));
                y90Var.setGravity(17);
                y90Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.B6, I);
                org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, I);
                e.addView(y90Var, w7.z5.t(-1, -2, 49, 14, 14, 14, 6));
                j11.customView = e;
                dVar.setOnClickListener(new v0(o9Var, j11, dVar, i14));
                j11.setOnDismissListener(new cb(fVar, i14));
                j11.fixNavigationBarKey(i11);
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
                    j11.makeAttached(U);
                }
                j11.show();
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: ai.l9
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new q9(ha.this, tLObject, runnable, tL_error, z10, dialogId, id2, messageObject, j10));
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
            y9 y9Var = (y9) longSparseArray.valueAt(i10);
            for (int i11 = 0; i11 < y9Var.l.size(); i11++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) y9Var.l.get(i11);
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new g(6, this, runnable));
        }
        if (!z10 || this.g <= 0) {
            return this.f;
        }
        ag.a m10 = ag.a.m(this.f);
        return ag.a.g(Math.max(0L, m10.a() - this.g), m10.a).o();
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final ag.a s() {
        ag.a l4 = ag.a.l(p());
        if (l4 == null) {
            return ag.a.i(0L, this.b ? ag.b.b : ag.b.a);
        }
        return l4;
    }

    public final ArrayList u() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new u8(this, 3));
        return this.m;
    }

    public final ArrayList v() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new u8(this, 4));
        return this.p;
    }

    public final ArrayList z() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new u8(this, 2));
        return this.j;
    }
}
