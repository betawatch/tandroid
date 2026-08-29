package jh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dk;
import org.telegram.ui.oa0;
import org.telegram.ui.th;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class s9 extends org.telegram.ui.Components.xa implements NotificationCenter.NotificationCenterDelegate {
    public final ag.v T;
    public final FrameLayout U;
    public final TLRPC.User V;
    public final eg.h2 W;
    public k51 X;
    public boolean Y;

    public s9(Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.User user, eg.h2 h2Var) {
        super(context, null, false, false, false, 1, c6Var);
        this.V = user;
        this.W = h2Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        jl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bg.o(this, 8));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i5, c6Var));
        final int i12 = 1;
        ag.v vVar = new ag.v(context, 1, c6Var);
        this.T = vVar;
        ((TextView) vVar.c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        y80 y80Var = (y80) vVar.d;
        y80Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) { // from class: jh.q9
            public final /* synthetic */ s9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.o2 o2Var;
                switch (i11) {
                    case 0:
                        s9 s9Var = this.b;
                        wv0 wv0Var = new wv0(s9Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(s9Var.attachedFragment) && (o2Var = s9Var.attachedFragment) != null) {
                            wv0Var.makeAttached(o2Var);
                        }
                        wv0Var.show();
                        break;
                    default:
                        ye.d.s(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }), true)));
        y80Var.setMaxWidth(nh.t3.a(y80Var.getText(), y80Var.getPaint()) + 1);
        this.e.setTitle(y());
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.r(user);
        ((org.telegram.ui.Components.t9) vVar.b).e(user, e9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        y80 y80Var2 = new y80(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        y80Var2.setTextSize(1, 12.0f);
        y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        y80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) { // from class: jh.q9
            public final /* synthetic */ s9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.o2 o2Var;
                switch (i12) {
                    case 0:
                        s9 s9Var = this.b;
                        wv0 wv0Var = new wv0(s9Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(s9Var.attachedFragment) && (o2Var = s9Var.attachedFragment) != null) {
                            wv0Var.makeAttached(o2Var);
                        }
                        wv0Var.show();
                        break;
                    default:
                        ye.d.s(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }));
        y80Var2.setGravity(17);
        y80Var2.setMaxWidth(nh.t3.a(y80Var2.getText(), y80Var2.getPaint()));
        frameLayout.addView(y80Var2, i7.f6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        this.containerView.addView(new n00(getContext()), i7.f6.c(-1.0f, -1));
        k51 k51Var = this.X;
        if (k51Var != null) {
            k51Var.N(false);
        }
    }

    public static void P(s9 s9Var, int i10) {
        w41 G;
        k51 k51Var = s9Var.X;
        if (k51Var == null || (G = k51Var.G(i10 - 1)) == null) {
            return;
        }
        k51 k51Var2 = s9Var.X;
        if (G.d == -1) {
            s9Var.Y = !s9Var.Y;
            k51Var2.N(true);
            s9Var.d.v0(0, AndroidUtilities.dp(200.0f), jr.g);
            return;
        }
        if (G.G(u9.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
            Context findActivity = AndroidUtilities.findActivity(s9Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            Context context = findActivity;
            if (context == null) {
                return;
            }
            long j10 = s9Var.V.id;
            s7 y8 = s7.y(s9Var.currentAccount, false);
            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
            ih.i5 i5Var = new ih.i5(s9Var, G, j10, 1);
            int i11 = y8.a;
            if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R == null || R.getContext() == null) {
                    s7.e0(context, null);
                    return;
                } else {
                    s7.e0(R.getContext(), R.getResourceProvider());
                    return;
                }
            }
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                d9.c cVar = new d9.c();
                cVar.c = "inapp";
                cVar.b = tL_starsGiftOption.store_product;
                BillingController.getInstance().queryProductDetails(Arrays.asList(cVar.a()), new f1.a(y8, i5Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                return;
            }
            TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
            tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
            tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
            tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
            tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j10);
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = ph.p2.p(s7.I(), false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new eg.z(y8, i5Var, tL_inputInvoiceStars, 8));
        }
    }

    public static void Q(s9 s9Var, w41 w41Var, long j10, Boolean bool, String str) {
        eg.h2 h2Var;
        if (s9Var.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (h2Var = s9Var.W) != null) {
            h2Var.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        oa0 oa0Var = LaunchActivity.C1.t0;
        if (U == null) {
            return;
        }
        int i10 = 0;
        if (!bool.booleanValue()) {
            if (str != null) {
                th.r(R.string.UnknownErrorCode, new Object[]{str}, tc.a0(U), R.raw.error, 36);
            }
        } else {
            mc K = tc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) w41Var.B, UserObject.getForcedFirstName(s9Var.V))), LocaleController.getString(R.string.ViewInChat), new r9(j10, i10));
            K.j = 5000;
            K.k(true);
            if (oa0Var != null) {
                oa0Var.c(true);
            }
            s7.y(s9Var.currentAccount, false).T(true);
        }
    }

    public final void R(ArrayList arrayList, k51 k51Var) {
        arrayList.add(w41.k(this.T));
        th.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = s7.y(this.currentAccount, false).u();
        if (u10 == null || u10.isEmpty()) {
            arrayList.add(w41.n(31));
            arrayList.add(w41.n(31));
            arrayList.add(w41.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < u10.size(); i12++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i12);
                if (this.Y || !tL_starsGiftOption.extended) {
                    int i13 = i11 + 1;
                    int i14 = u9.a;
                    w41 J = w41.J(u9.class);
                    J.d = i12;
                    J.z = i11;
                    long j10 = tL_starsGiftOption.stars;
                    J.B = j10;
                    J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
                    J.m = tL_starsGiftOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i11 = i13;
                } else {
                    i10++;
                }
            }
            boolean z10 = this.Y;
            if (!z10 && i10 > 0) {
                String string = LocaleController.getString(z10 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z11 = !this.Y;
                int i15 = o9.a;
                w41 J2 = w41.J(o9.class);
                J2.d = -1;
                J2.l = string;
                J2.f = z11;
                J2.q = true;
                arrayList.add(J2);
            }
        }
        arrayList.add(w41.k(this.U));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (k51Var = this.X) != null) {
            k51Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        dk dkVar;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof tn) {
            tn tnVar = (tn) R;
            if (tnVar.x9() && (dkVar = tnVar.U) != null) {
                dkVar.P();
            }
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 20), this.resourcesProvider);
        this.X = k51Var;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        ag.v vVar = this.T;
        if (vVar == null) {
            return null;
        }
        return ((TextView) vVar.c).getText();
    }
}
