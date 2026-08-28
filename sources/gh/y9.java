package gh;

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
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.la0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y9 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final x9 T;
    public final FrameLayout U;
    public final TLRPC.User V;
    public final bg.r2 W;
    public z41 X;
    public boolean Y;

    public y9(Context context, org.telegram.ui.ActionBar.b6 b6Var, TLRPC.User user, bg.r2 r2Var) {
        super(context, null, false, false, false, 1, b6Var);
        this.V = user;
        this.W = r2Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        final int i10 = 0;
        wk0Var.setPadding(i9, 0, i9, 0);
        this.d.setOnItemClickListener(new eh.j(this, 4));
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i5, b6Var));
        x9 x9Var = new x9(context, 0, b6Var);
        this.T = x9Var;
        ((TextView) x9Var.c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        l80 l80Var = (l80) x9Var.d;
        final int i11 = 1;
        l80Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) { // from class: gh.v9
            public final /* synthetic */ y9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.o2 o2Var;
                switch (i10) {
                    case 0:
                        y9 y9Var = this.b;
                        mv0 mv0Var = new mv0(y9Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(y9Var.attachedFragment) && (o2Var = y9Var.attachedFragment) != null) {
                            mv0Var.makeAttached(o2Var);
                        }
                        mv0Var.show();
                        break;
                    default:
                        ve.e.s(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }), true)));
        l80Var.setMaxWidth(kh.x3.a(l80Var.getText(), l80Var.getPaint()) + 1);
        this.e.setTitle(y());
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.r(user);
        ((org.telegram.ui.Components.o9) x9Var.b).e(user, z8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        l80 l80Var2 = new l80(context, b6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        l80Var2.setTextSize(1, 12.0f);
        l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B6, b6Var));
        l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var));
        l80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) { // from class: gh.v9
            public final /* synthetic */ y9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.o2 o2Var;
                switch (i11) {
                    case 0:
                        y9 y9Var = this.b;
                        mv0 mv0Var = new mv0(y9Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(y9Var.attachedFragment) && (o2Var = y9Var.attachedFragment) != null) {
                            mv0Var.makeAttached(o2Var);
                        }
                        mv0Var.show();
                        break;
                    default:
                        ve.e.s(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }));
        l80Var2.setGravity(17);
        l80Var2.setMaxWidth(kh.x3.a(l80Var2.getText(), l80Var2.getPaint()));
        frameLayout.addView(l80Var2, g7.e6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        this.containerView.addView(new c00(getContext()), g7.e6.c(-1.0f, -1));
        z41 z41Var = this.X;
        if (z41Var != null) {
            z41Var.N(false);
        }
    }

    public static void O(y9 y9Var, int i9) {
        l41 G;
        z41 z41Var = y9Var.X;
        if (z41Var == null || (G = z41Var.G(i9 - 1)) == null) {
            return;
        }
        z41 z41Var2 = y9Var.X;
        if (G.d == -1) {
            y9Var.Y = !y9Var.Y;
            z41Var2.N(true);
            y9Var.d.v0(0, AndroidUtilities.dp(200.0f), gr.g);
            return;
        }
        if (G.G(aa.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
            Context findActivity = AndroidUtilities.findActivity(y9Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            Context context = findActivity;
            if (context == null) {
                return;
            }
            long j10 = y9Var.V.id;
            v7 y10 = v7.y(y9Var.currentAccount, false);
            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
            fh.w5 w5Var = new fh.w5(y9Var, G, j10, 1);
            int i10 = y10.a;
            if (!MessagesController.getInstance(i10).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R == null || R.getContext() == null) {
                    v7.e0(context, null);
                    return;
                } else {
                    v7.e0(R.getContext(), R.getResourceProvider());
                    return;
                }
            }
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i10).getInputUser(j10);
                b9.c cVar = new b9.c();
                cVar.c = "inapp";
                cVar.b = tL_starsGiftOption.store_product;
                BillingController.getInstance().queryProductDetails(Arrays.asList(cVar.a()), new f1.a(y10, w5Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                return;
            }
            TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
            tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
            tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
            tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
            tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i10).getInputUser(j10);
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p6 = mh.c3.p(v7.I(), false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new bg.b0(y10, w5Var, tL_inputInvoiceStars, 8));
        }
    }

    public static void P(y9 y9Var, l41 l41Var, long j10, Boolean bool, String str) {
        bg.r2 r2Var;
        if (y9Var.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (r2Var = y9Var.W) != null) {
            r2Var.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        la0 la0Var = LaunchActivity.C1.t0;
        if (U == null) {
            return;
        }
        int i9 = 0;
        if (!bool.booleanValue()) {
            if (str != null) {
                org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, oc.a0(U), R.raw.error, 36);
            }
        } else {
            gc K = oc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) l41Var.B, UserObject.getForcedFirstName(y9Var.V))), LocaleController.getString(R.string.ViewInChat), new w9(j10, i9));
            K.j = 5000;
            K.k(true);
            if (la0Var != null) {
                la0Var.c(true);
            }
            v7.y(y9Var.currentAccount, false).T(true);
        }
    }

    public final void Q(ArrayList arrayList, z41 z41Var) {
        arrayList.add(l41.k(this.T));
        org.telegram.ui.Cells.j2.l(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = v7.y(this.currentAccount, false).u();
        if (u10 == null || u10.isEmpty()) {
            arrayList.add(l41.n(31));
            arrayList.add(l41.n(31));
            arrayList.add(l41.n(31));
        } else {
            int i9 = 0;
            int i10 = 1;
            for (int i11 = 0; i11 < u10.size(); i11++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i11);
                if (this.Y || !tL_starsGiftOption.extended) {
                    int i12 = i10 + 1;
                    int i13 = aa.a;
                    l41 J = l41.J(aa.class);
                    J.d = i11;
                    J.z = i10;
                    long j10 = tL_starsGiftOption.stars;
                    J.B = j10;
                    J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
                    J.m = tL_starsGiftOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i10 = i12;
                } else {
                    i9++;
                }
            }
            boolean z10 = this.Y;
            if (!z10 && i9 > 0) {
                String string = LocaleController.getString(z10 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z11 = !this.Y;
                int i14 = t9.a;
                l41 J2 = l41.J(t9.class);
                J2.d = -1;
                J2.l = string;
                J2.f = z11;
                J2.q = true;
                arrayList.add(J2);
            }
        }
        arrayList.add(l41.k(this.U));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        if ((i9 == NotificationCenter.starGiftOptionsLoaded || i9 == NotificationCenter.starBalanceUpdated) && (z41Var = this.X) != null) {
            z41Var.N(true);
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
        ak akVar;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof qn) {
            qn qnVar = (qn) R;
            if (qnVar.x9() && (akVar = qnVar.U) != null) {
                akVar.O();
            }
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 19), this.resourcesProvider);
        this.X = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        x9 x9Var = this.T;
        if (x9Var == null) {
            return null;
        }
        return ((TextView) x9Var.c).getText();
    }
}
