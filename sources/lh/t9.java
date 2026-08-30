package lh;

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
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.wa0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class t9 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final cg.u U;
    public final FrameLayout V;
    public final TLRPC.User W;
    public final gg.g2 X;
    public w51 Y;
    public boolean Z;

    public t9(Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user, gg.g2 g2Var) {
        super(context, null, false, false, false, 1, f6Var);
        this.W = user;
        this.X = g2Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new dg.n(this, 8));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(nr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, f6Var));
        final int i12 = 1;
        cg.u uVar = new cg.u(context, 1, f6Var);
        this.U = uVar;
        ((TextView) uVar.c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        e90 e90Var = (e90) uVar.d;
        e90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) { // from class: lh.r9
            public final /* synthetic */ t9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.p2 p2Var;
                switch (i11) {
                    case 0:
                        t9 t9Var = this.b;
                        fw0 fw0Var = new fw0(t9Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(t9Var.attachedFragment) && (p2Var = t9Var.attachedFragment) != null) {
                            fw0Var.makeAttached(p2Var);
                        }
                        fw0Var.show();
                        break;
                    default:
                        af.g.s(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }), true)));
        e90Var.setMaxWidth(ph.f3.a(e90Var.getText(), e90Var.getPaint()) + 1);
        this.e.setTitle(y());
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.r(user);
        ((org.telegram.ui.Components.p9) uVar.b).e(user, z8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        e90 e90Var2 = new e90(context, f6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        e90Var2.setTextSize(1, 12.0f);
        e90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, f6Var));
        e90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        e90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) { // from class: lh.r9
            public final /* synthetic */ t9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.p2 p2Var;
                switch (i12) {
                    case 0:
                        t9 t9Var = this.b;
                        fw0 fw0Var = new fw0(t9Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(t9Var.attachedFragment) && (p2Var = t9Var.attachedFragment) != null) {
                            fw0Var.makeAttached(p2Var);
                        }
                        fw0Var.show();
                        break;
                    default:
                        af.g.s(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }));
        e90Var2.setGravity(17);
        e90Var2.setMaxWidth(ph.f3.a(e90Var2.getText(), e90Var2.getPaint()));
        frameLayout.addView(e90Var2, k7.b6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        this.containerView.addView(new r00(getContext()), k7.b6.c(-1.0f, -1));
        w51 w51Var = this.Y;
        if (w51Var != null) {
            w51Var.N(false);
        }
    }

    public static void P(t9 t9Var, int i10) {
        i51 G;
        w51 w51Var = t9Var.Y;
        if (w51Var == null || (G = w51Var.G(i10 - 1)) == null) {
            return;
        }
        w51 w51Var2 = t9Var.Y;
        if (G.d == -1) {
            t9Var.Z = !t9Var.Z;
            w51Var2.N(true);
            t9Var.d.v0(0, AndroidUtilities.dp(200.0f), nr.g);
            return;
        }
        if (G.G(v9.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
            Context findActivity = AndroidUtilities.findActivity(t9Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.D1;
            }
            Context context = findActivity;
            if (context == null) {
                return;
            }
            long j10 = t9Var.W.id;
            t7 y10 = t7.y(t9Var.currentAccount, false);
            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
            kh.i5 i5Var = new kh.i5(t9Var, G, j10, 1);
            int i11 = y10.a;
            if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R == null || R.getContext() == null) {
                    t7.e0(context, null);
                    return;
                } else {
                    t7.e0(R.getContext(), R.getResourceProvider());
                    return;
                }
            }
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                b6.h hVar = new b6.h();
                hVar.c = "inapp";
                hVar.b = tL_starsGiftOption.store_product;
                BillingController.getInstance().queryProductDetails(Arrays.asList(hVar.a()), new f1.a(y10, i5Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
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
            JSONObject p10 = rh.q2.p(t7.I(), false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new gg.y(y10, i5Var, tL_inputInvoiceStars, 8));
        }
    }

    public static void Q(t9 t9Var, i51 i51Var, long j10, Boolean bool, String str) {
        gg.g2 g2Var;
        if (t9Var.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (g2Var = t9Var.X) != null) {
            g2Var.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        wa0 wa0Var = LaunchActivity.D1.u0;
        if (U == null) {
            return;
        }
        int i10 = 0;
        if (!bool.booleanValue()) {
            if (str != null) {
                yh.s(R.string.UnknownErrorCode, new Object[]{str}, qc.a0(U), R.raw.error, 36);
            }
        } else {
            ic K = qc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) i51Var.B, UserObject.getForcedFirstName(t9Var.W))), LocaleController.getString(R.string.ViewInChat), new s9(j10, i10));
            K.j = 5000;
            K.k(true);
            if (wa0Var != null) {
                wa0Var.c(true);
            }
            t7.y(t9Var.currentAccount, false).T(true);
        }
    }

    public final void R(ArrayList arrayList, w51 w51Var) {
        arrayList.add(i51.k(this.U));
        yh.r(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = t7.y(this.currentAccount, false).u();
        if (u10 == null || u10.isEmpty()) {
            arrayList.add(i51.n(31));
            arrayList.add(i51.n(31));
            arrayList.add(i51.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < u10.size(); i12++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i12);
                if (this.Z || !tL_starsGiftOption.extended) {
                    int i13 = i11 + 1;
                    int i14 = v9.a;
                    i51 J = i51.J(v9.class);
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
            boolean z4 = this.Z;
            if (!z4 && i10 > 0) {
                String string = LocaleController.getString(z4 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z10 = !this.Z;
                int i15 = p9.a;
                i51 J2 = i51.J(p9.class);
                J2.d = -1;
                J2.l = string;
                J2.f = z10;
                J2.q = true;
                arrayList.add(J2);
            }
        }
        arrayList.add(i51.k(this.V));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (w51Var = this.Y) != null) {
            w51Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        jk jkVar;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R instanceof xn) {
            xn xnVar = (xn) R;
            if (xnVar.x9() && (jkVar = xnVar.V) != null) {
                jkVar.P();
            }
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new dg.r1(this, 20), this.resourcesProvider);
        this.Y = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        cg.u uVar = this.U;
        if (uVar == null) {
            return null;
        }
        return ((TextView) uVar.c).getText();
    }
}
