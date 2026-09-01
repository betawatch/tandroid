package mh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.xn;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class z9 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final long U;
    public final lg.a V;
    public final FrameLayout W;
    public final s00 X;
    public Runnable Y;
    public final TLRPC.InputPeer Z;
    public final boolean a0;
    public x51 b0;
    public boolean c0;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0107, code lost:
    
        if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r5)) == null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z9(Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, int i10, String str, Runnable runnable, long j11) {
        super(context, null, false, false, false, 1, g6Var);
        String str2;
        String str3;
        this.v = 0.2f;
        this.Y = runnable;
        TLRPC.InputPeer inputPeer = j11 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
        this.Z = inputPeer;
        boolean isReady = (inputPeer == null || !AppGlobalConfig.getInstance(t7.y(this.currentAccount, false).a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.a0 = isReady;
        fixNavigationBar();
        tl0 tl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new ag.h(this, 10));
        this.d.p1();
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i5, g6Var));
        this.U = j10;
        lg.a aVar = new lg.a(context, this.currentAccount, g6Var);
        TextView textView = (TextView) aVar.e;
        this.V = aVar;
        ((TextView) aVar.d).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j10 - t7.y(this.currentAccount, false).p().amount), new Object[0]));
        int i12 = 17;
        if (i10 == 1) {
            str2 = "StarsNeededTextBuySubscription";
        } else {
            if (i10 != 2) {
                if (i10 == 7) {
                    str2 = "StarsNeededTextKeepBotSubscription";
                } else if (i10 == 8) {
                    str2 = "StarsNeededTextKeepBizSubscription";
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        str2 = "StarsNeededTextLink";
                        if (str == null) {
                            str3 = "StarsNeededTextLink";
                        } else {
                            str3 = "StarsNeededTextLink_" + str.toLowerCase();
                        }
                    } else {
                        str2 = i10 == 5 ? "StarsNeededTextReactions" : i10 == 6 ? "StarsNeededTextGift" : i10 == 12 ? "StarsNeededTextGiftChannel" : i10 == 13 ? "StarsNeededTextPrivateMessage" : i10 == 10 ? "StarsNeededTextGiftUpgrade" : i10 == 11 ? "StarsNeededTextGiftTransfer" : i10 == 9 ? "StarsNeededBizText" : i10 == 14 ? "StarsNeededTextGiftBuyResale" : i10 == 15 ? "StarsNeededTextSearch" : i10 == 16 ? "StarsNeededRemoveGiftDescription" : i10 == 17 ? "StarsNeededLiveComments" : "StarsNeededText";
                    }
                }
            }
            str2 = "StarsNeededTextKeepSubscription";
        }
        str3 = str2;
        if (TextUtils.isEmpty(str3)) {
            textView.setText("");
        } else {
            String nullable = LocaleController.nullable(LocaleController.formatString(str3, LocaleController.getStringResId(str3), str));
            textView.setText(AndroidUtilities.replaceTags(nullable == null ? LocaleController.getString(str3) : nullable));
            textView.setMaxWidth(qh.f3.a(textView.getText(), textView.getPaint()));
        }
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        g90 g90Var = new g90(context, g6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        g90Var.setTextSize(1, 12.0f);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.B6, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, g6Var));
        if (isReady) {
            g90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new lh.c3(this, i12)));
        } else {
            org.telegram.ui.b.n(R.string.StarsPurchaseUnavailable, g90Var);
        }
        g90Var.setGravity(17);
        g90Var.setMaxWidth(qh.f3.a(g90Var.getText(), g90Var.getPaint()));
        frameLayout.addView(g90Var, k7.c6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
        s00 s00Var = new s00(getContext());
        this.X = s00Var;
        this.containerView.addView(s00Var, k7.c6.c(-1.0f, -1));
        x51 x51Var = this.b0;
        if (x51Var != null) {
            x51Var.N(false);
        }
    }

    public static void P(z9 z9Var, int i10) {
        j51 G;
        x51 x51Var = z9Var.b0;
        if (x51Var == null || (G = x51Var.G(i10 - 1)) == null) {
            return;
        }
        x51 x51Var2 = z9Var.b0;
        if (G.d == -1) {
            z9Var.c0 = !z9Var.c0;
            x51Var2.N(true);
        } else if (G.G(v9.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(z9Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.D1;
            }
            if (findActivity == null) {
                return;
            }
            t7.y(z9Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new eh.w(5, z9Var, G), z9Var.Z);
        }
    }

    public static void Q(z9 z9Var, j51 j51Var, Boolean bool, String str) {
        if (z9Var.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new qc((FrameLayout) z9Var.containerView, z9Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) j51Var.B, new Object[0])), R.raw.stars_topup).j();
            z9Var.X.c(true);
            t7.y(z9Var.currentAccount, false).T(true);
        } else if (str != null) {
            yh.s(R.string.UnknownErrorCode, new Object[]{str}, new qc((FrameLayout) z9Var.containerView, z9Var.resourcesProvider), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, x51 x51Var) {
        long j10;
        lg.a aVar = this.V;
        arrayList.add(j51.l(aVar));
        boolean z4 = this.a0;
        if (z4) {
            yh.r(R.string.TelegramStarsChoose, arrayList);
        }
        int i10 = 0;
        ArrayList z10 = t7.y(this.currentAccount, false).z();
        if (z4) {
            if (z10 == null || z10.isEmpty()) {
                arrayList.add(j51.n(31));
                arrayList.add(j51.n(31));
                arrayList.add(j51.n(31));
            } else {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z11 = false;
                int i14 = 1;
                while (true) {
                    int size = z10.size();
                    j10 = this.U;
                    if (i11 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i11);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.c0 && z11) {
                            i13++;
                        } else {
                            arrayList.add(v9.a(i11, i14, tL_starsTopupOption));
                            i12++;
                            i14++;
                            z11 = true;
                        }
                    }
                    i11++;
                }
                if (i12 < 3) {
                    arrayList.clear();
                    arrayList.add(j51.k(aVar));
                    yh.r(R.string.TelegramStarsChoose, arrayList);
                    int i15 = 0;
                    for (int i16 = 0; i16 < z10.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z10.get(i16);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(v9.a(i16, i14, tL_starsTopupOption2));
                            i15++;
                            i14++;
                        }
                    }
                    if (i15 == 0) {
                        while (i10 < z10.size()) {
                            arrayList.add(v9.a(i10, i14, (TL_stars.TL_starsTopupOption) z10.get(i10)));
                            i10++;
                            i14++;
                        }
                        boolean z12 = this.c0;
                        if (!z12 && i13 > 0) {
                            String string = LocaleController.getString(z12 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z13 = !this.c0;
                            int i17 = p9.a;
                            j51 J = j51.J(p9.class);
                            J.d = -1;
                            J.l = string;
                            J.f = z13;
                            J.q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.c0 = true;
                    }
                } else if (i12 > 0) {
                    boolean z14 = this.c0;
                    if (!z14 && i13 > 0) {
                        String string2 = LocaleController.getString(z14 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                        boolean z15 = !this.c0;
                        int i18 = p9.a;
                        j51 J2 = j51.J(p9.class);
                        J2.d = -1;
                        J2.l = string2;
                        J2.f = z15;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i10 < z10.size()) {
                        arrayList.add(v9.a(i10, i14, (TL_stars.TL_starsTopupOption) z10.get(i10)));
                        i10++;
                        i14++;
                    }
                }
            }
        }
        arrayList.add(j51.k(this.W));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            x51 x51Var = this.b0;
            if (x51Var != null) {
                x51Var.N(true);
            }
            long j10 = t7.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.V.d;
            long j11 = this.U;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.pa paVar = this.e;
            if (paVar != null) {
                paVar.setTitle(y());
            }
            if (j10 < j11 || (runnable = this.Y) == null) {
                return;
            }
            runnable.run();
            this.Y = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        lg.a aVar = this.V;
        if (aVar != null) {
            ((gg.i) aVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        jk jkVar;
        if (!this.a0) {
            l.d.v(R.string.PaymentInvoiceDisabledStarsText, new qc(org.telegram.ui.Components.cb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
            return;
        }
        if (t7.y(this.currentAccount, false).p().amount >= this.U) {
            Runnable runnable = this.Y;
            if (runnable != null) {
                runnable.run();
                this.Y = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R instanceof xn) {
            xn xnVar = (xn) R;
            if (xnVar.x9() && (jkVar = xnVar.V) != null) {
                jkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.sa
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new eg.p1(this, 21), this.resourcesProvider);
        this.b0 = x51Var;
        return x51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        lg.a aVar = this.V;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }
}
