package bi;

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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.qa0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class nc extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final mc X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final vg.a1 a0;
    public k71 b0;
    public boolean c0;

    public nc(Context context, org.telegram.ui.ActionBar.u6 u6Var, TLRPC.User user, vg.a1 a1Var) {
        super(context, null, false, false, u6Var);
        this.Z = user;
        this.a0 = a1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        nm0 nm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        nm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.k(this, 2));
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColorKey(org.telegram.ui.ActionBar.y6.i5);
        mc mcVar = new mc(context, 0, u6Var);
        this.X = mcVar;
        ((TextView) mcVar.c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        aa0 aa0Var = (aa0) mcVar.d;
        final int i12 = 1;
        aa0Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) { // from class: bi.kc
            public final /* synthetic */ nc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.r2 r2Var;
                switch (i11) {
                    case 0:
                        nc ncVar = this.b;
                        lx0 lx0Var = new lx0(ncVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(ncVar.attachedFragment) && (r2Var = ncVar.attachedFragment) != null) {
                            lx0Var.makeAttached(r2Var);
                        }
                        lx0Var.show();
                        break;
                    default:
                        qf.d.r(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }), true)));
        aa0Var.setMaxWidth(fi.v3.a(aa0Var.getText(), aa0Var.getPaint()) + 1);
        this.e.setTitle(y());
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.r(user);
        ((org.telegram.ui.Components.y9) mcVar.b).f(user, j9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        aa0 aa0Var2 = new aa0(context, u6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        aa0Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(aa0Var2, org.telegram.ui.ActionBar.y6.B6, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var2, org.telegram.ui.ActionBar.y6.gc, u6Var);
        aa0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) { // from class: bi.kc
            public final /* synthetic */ nc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.r2 r2Var;
                switch (i12) {
                    case 0:
                        nc ncVar = this.b;
                        lx0 lx0Var = new lx0(ncVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(ncVar.attachedFragment) && (r2Var = ncVar.attachedFragment) != null) {
                            lx0Var.makeAttached(r2Var);
                        }
                        lx0Var.show();
                        break;
                    default:
                        qf.d.r(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }));
        aa0Var2.setGravity(17);
        aa0Var2.setMaxWidth(fi.v3.a(aa0Var2.getText(), aa0Var2.getPaint()));
        frameLayout.addView(aa0Var2, kb1.i(-2, -1, 17));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, frameLayout, u6Var);
        this.containerView.addView(new z00(getContext()), kb1.g(-1.0f, -1));
        k71 k71Var = this.b0;
        if (k71Var != null) {
            k71Var.O(false);
        }
    }

    public static void P(nc ncVar, int i10) {
        u61 G;
        k71 k71Var = ncVar.b0;
        if (k71Var == null || (G = k71Var.G(i10 - 1)) == null) {
            return;
        }
        k71 k71Var2 = ncVar.b0;
        if (G.d == -1) {
            ncVar.c0 = !ncVar.c0;
            k71Var2.O(true);
            ncVar.d.w0(0, AndroidUtilities.dp(200.0f), ds.g);
            return;
        }
        if (G.H(oc.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
            Context findActivity = AndroidUtilities.findActivity(ncVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.I1;
            }
            Context context = findActivity;
            if (context == null) {
                return;
            }
            long j10 = ncVar.Z.id;
            ca y3 = ca.y(ncVar.currentAccount, false);
            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
            lc lcVar = new lc(ncVar, G, j10, 0);
            int i11 = y3.a;
            if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R == null || R.getContext() == null) {
                    ca.e0(context, null);
                    return;
                } else {
                    ca.e0(R.getContext(), R.getResourceProvider());
                    return;
                }
            }
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                d5.a aVar = new d5.a();
                aVar.b = "inapp";
                aVar.a = tL_starsGiftOption.store_product;
                BillingController.getInstance().queryProductDetails(Arrays.asList(aVar.a()), new p7(y3, lcVar, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
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
            JSONObject q5 = hi.m3.q(ca.I(), false);
            if (q5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new h2(y3, lcVar, tL_inputInvoiceStars, 2));
        }
    }

    public static void Q(nc ncVar, u61 u61Var, long j10, Boolean bool, String str) {
        vg.a1 a1Var;
        if (ncVar.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (a1Var = ncVar.a0) != null) {
            a1Var.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        qa0 qa0Var = LaunchActivity.I1.x0;
        if (U == null) {
            return;
        }
        int i10 = 1;
        if (!bool.booleanValue()) {
            if (str != null) {
                ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.wc.b0(U), R.raw.error, 36);
            }
        } else {
            org.telegram.ui.Components.qc K = org.telegram.ui.Components.wc.b0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) u61Var.B, UserObject.getForcedFirstName(ncVar.Z))), LocaleController.getString(R.string.ViewInChat), new j4(j10, i10));
            K.j = 5000;
            K.k(true);
            if (qa0Var != null) {
                qa0Var.c(true);
            }
            ca.y(ncVar.currentAccount, false).T(true);
        }
    }

    public final void R(ArrayList arrayList, k71 k71Var) {
        arrayList.add(u61.k(this.X));
        ic.a.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = ca.y(this.currentAccount, false).u();
        if (u10 == null || u10.isEmpty()) {
            arrayList.add(u61.p(31));
            arrayList.add(u61.p(31));
            arrayList.add(u61.p(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < u10.size(); i12++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i12);
                if (this.c0 || !tL_starsGiftOption.extended) {
                    int i13 = i11 + 1;
                    int i14 = oc.a;
                    u61 K = u61.K(oc.class);
                    K.d = i12;
                    K.z = i11;
                    long j10 = tL_starsGiftOption.stars;
                    K.B = j10;
                    K.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
                    K.m = tL_starsGiftOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    K.G = tL_starsGiftOption;
                    arrayList.add(K);
                    i11 = i13;
                } else {
                    i10++;
                }
            }
            boolean z10 = this.c0;
            if (!z10 && i10 > 0) {
                String string = LocaleController.getString(z10 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z11 = !this.c0;
                int i15 = ic.a;
                u61 K2 = u61.K(ic.class);
                K2.d = -1;
                K2.l = string;
                K2.f = z11;
                K2.q = true;
                arrayList.add(K2);
            }
        }
        arrayList.add(u61.k(this.Y));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (k71Var = this.b0) != null) {
            k71Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        jk jkVar;
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R instanceof wn) {
            wn wnVar = (wn) R;
            if (wnVar.I9() && (jkVar = wnVar.Y) != null) {
                jkVar.L();
            }
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 10), this.resourcesProvider);
        this.b0 = k71Var;
        return k71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        mc mcVar = this.X;
        if (mcVar == null) {
            return null;
        }
        return ((TextView) mcVar.c).getText();
    }
}
