package ai;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk;
import org.telegram.ui.la0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class vc extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final uc X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final ug.z0 a0;
    public s61 b0;
    public boolean c0;

    public vc(Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.User user, ug.z0 z0Var) {
        super(context, null, false, false, d6Var);
        this.Z = user;
        this.a0 = z0Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        im0Var.setPadding(i10, 0, i10, 0);
        final int i12 = 1;
        this.d.setOnItemClickListener(new wa(this, i12));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i5, d6Var));
        uc ucVar = new uc(context, 0, d6Var);
        this.X = ucVar;
        ((TextView) ucVar.c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        x90 x90Var = (x90) ucVar.d;
        x90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) { // from class: ai.sc
            public final /* synthetic */ vc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (i11) {
                    case 0:
                        vc vcVar = this.b;
                        yw0 yw0Var = new yw0(vcVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(vcVar.attachedFragment) && (n2Var = vcVar.attachedFragment) != null) {
                            yw0Var.makeAttached(n2Var);
                        }
                        yw0Var.show();
                        break;
                    default:
                        pf.d.r(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }), true)));
        x90Var.setMaxWidth(ei.x3.a(x90Var.getText(), x90Var.getPaint()) + 1);
        this.e.setTitle(A());
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(user);
        ((org.telegram.ui.Components.w9) ucVar.b).e(user, h9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        x90 x90Var2 = new x90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        x90Var2.setTextSize(1, 12.0f);
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, d6Var));
        x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        x90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) { // from class: ai.sc
            public final /* synthetic */ vc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (i12) {
                    case 0:
                        vc vcVar = this.b;
                        yw0 yw0Var = new yw0(vcVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(vcVar.attachedFragment) && (n2Var = vcVar.attachedFragment) != null) {
                            yw0Var.makeAttached(n2Var);
                        }
                        yw0Var.show();
                        break;
                    default:
                        pf.d.r(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }));
        x90Var2.setGravity(17);
        x90Var2.setMaxWidth(ei.x3.a(x90Var2.getText(), x90Var2.getPaint()));
        frameLayout.addView(x90Var2, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        this.containerView.addView(new z00(getContext()), w7.z5.c(-1.0f, -1));
        s61 s61Var = this.b0;
        if (s61Var != null) {
            s61Var.N(false);
        }
    }

    public static void Q(vc vcVar, int i10) {
        f61 G;
        s61 s61Var = vcVar.b0;
        if (s61Var == null || (G = s61Var.G(i10 - 1)) == null) {
            return;
        }
        s61 s61Var2 = vcVar.b0;
        if (G.d == -1) {
            vcVar.c0 = !vcVar.c0;
            s61Var2.N(true);
            vcVar.d.v0(0, AndroidUtilities.dp(200.0f), bs.g);
            return;
        }
        if (G.G(xc.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
            Context findActivity = AndroidUtilities.findActivity(vcVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.H1;
            }
            Context context = findActivity;
            if (context == null) {
                return;
            }
            long j10 = vcVar.Z.id;
            ga y3 = ga.y(vcVar.currentAccount, false);
            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
            tc tcVar = new tc(vcVar, G, j10, 0);
            int i11 = y3.a;
            if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R == null || R.getContext() == null) {
                    ga.e0(context, null);
                    return;
                } else {
                    ga.e0(R.getContext(), R.getResourceProvider());
                    return;
                }
            }
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                c5.a aVar = new c5.a();
                aVar.b = "inapp";
                aVar.a = tL_starsGiftOption.store_product;
                BillingController.getInstance().queryProductDetails(Arrays.asList(aVar.a()), new s7(y3, tcVar, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
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
            JSONObject q6 = gi.d3.q(ga.I(), false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new k2(y3, tcVar, tL_inputInvoiceStars, 2));
        }
    }

    public static void R(vc vcVar, f61 f61Var, long j10, Boolean bool, String str) {
        ug.z0 z0Var;
        if (vcVar.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (z0Var = vcVar.a0) != null) {
            z0Var.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        la0 la0Var = LaunchActivity.H1.x0;
        if (U == null) {
            return;
        }
        int i10 = 1;
        if (!bool.booleanValue()) {
            if (str != null) {
                i2.d.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.xc.a0(U), R.raw.error, 36);
            }
        } else {
            org.telegram.ui.Components.qc K = org.telegram.ui.Components.xc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) f61Var.B, UserObject.getForcedFirstName(vcVar.Z))), LocaleController.getString(R.string.ViewInChat), new l4(j10, i10));
            K.j = 5000;
            K.k(true);
            if (la0Var != null) {
                la0Var.c(true);
            }
            ga.y(vcVar.currentAccount, false).T(true);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        uc ucVar = this.X;
        if (ucVar == null) {
            return null;
        }
        return ((TextView) ucVar.c).getText();
    }

    public final void S(ArrayList arrayList, s61 s61Var) {
        arrayList.add(f61.k(this.X));
        i2.d.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = ga.y(this.currentAccount, false).u();
        if (u10 == null || u10.isEmpty()) {
            arrayList.add(f61.n(31));
            arrayList.add(f61.n(31));
            arrayList.add(f61.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < u10.size(); i12++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i12);
                if (this.c0 || !tL_starsGiftOption.extended) {
                    int i13 = i11 + 1;
                    int i14 = xc.a;
                    f61 J = f61.J(xc.class);
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
            boolean z10 = this.c0;
            if (!z10 && i10 > 0) {
                String string = LocaleController.getString(z10 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z11 = !this.c0;
                int i15 = qc.a;
                f61 J2 = f61.J(qc.class);
                J2.d = -1;
                J2.l = string;
                J2.f = z11;
                J2.q = true;
                arrayList.add(J2);
            }
        }
        arrayList.add(f61.k(this.Y));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (s61Var = this.b0) != null) {
            s61Var.N(true);
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
        hk hkVar;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof sn) {
            sn snVar = (sn) R;
            if (snVar.C9() && (hkVar = snVar.Y) != null) {
                hkVar.N();
            }
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 7), this.resourcesProvider);
        this.b0 = s61Var;
        return s61Var;
    }
}
