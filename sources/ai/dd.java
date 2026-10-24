package ai;

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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gk;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class dd extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final cd Y;
    public final FrameLayout Z;
    public final z00 a0;
    public Runnable b0;
    public final TLRPC.InputPeer c0;
    public final boolean d0;
    public b71 e0;
    public boolean f0;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ff, code lost:
    
        if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r6)) == null) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dd(Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, int i10, String str, Runnable runnable, long j11) {
        super(context, null, false, false, g6Var);
        String str2;
        String str3;
        this.v = 0.2f;
        this.b0 = runnable;
        TLRPC.InputPeer inputPeer = j11 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
        this.c0 = inputPeer;
        boolean isReady = (inputPeer == null || !AppGlobalConfig.getInstance(ha.y(this.currentAccount, false).a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.d0 = isReady;
        fixNavigationBar();
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new xa(this, 2));
        this.d.t1();
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColorKey(org.telegram.ui.ActionBar.k6.i5);
        this.X = j10;
        cd cdVar = new cd(context, this.currentAccount, g6Var);
        TextView textView = (TextView) cdVar.e;
        this.Y = cdVar;
        ((TextView) cdVar.b).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j10 - ha.y(this.currentAccount, false).p().amount), new Object[0]));
        if (i10 == 1) {
            str2 = "StarsNeededTextBuySubscription";
        } else {
            str2 = "StarsNeededTextKeepSubscription";
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
        }
        str3 = str2;
        if (TextUtils.isEmpty(str3)) {
            textView.setText("");
        } else {
            String nullable = LocaleController.nullable(LocaleController.formatString(str3, 0, str));
            textView.setText(AndroidUtilities.replaceTags(nullable == null ? LocaleController.getString(str3) : nullable));
            textView.setMaxWidth(ei.x3.a(textView.getText(), textView.getPaint()));
        }
        this.e.setTitle(z());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        y90 y90Var = new y90(context, g6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        y90Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.B6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, g6Var);
        if (isReady) {
            y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new a3.d(this, 24)));
        } else {
            org.telegram.ui.Cells.b1.r(R.string.StarsPurchaseUnavailable, y90Var);
        }
        y90Var.setGravity(17);
        y90Var.setMaxWidth(ei.x3.a(y90Var.getText(), y90Var.getPaint()));
        frameLayout.addView(y90Var, w7.z5.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, g6Var);
        z00 z00Var = new z00(getContext());
        this.a0 = z00Var;
        this.containerView.addView(z00Var, w7.z5.c(-1.0f, -1));
        b71 b71Var = this.e0;
        if (b71Var != null) {
            b71Var.N(false);
        }
    }

    public static void P(dd ddVar, int i10) {
        m61 G;
        b71 b71Var = ddVar.e0;
        if (b71Var == null || (G = b71Var.G(i10 - 1)) == null) {
            return;
        }
        b71 b71Var2 = ddVar.e0;
        if (G.d == -1) {
            ddVar.f0 = !ddVar.f0;
            b71Var2.N(true);
        } else if (G.G(yc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(ddVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.J1;
            }
            if (findActivity == null) {
                return;
            }
            ha.y(ddVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new r5(2, ddVar, G), ddVar.c0);
        }
    }

    public static void Q(dd ddVar, m61 m61Var, Boolean bool, String str) {
        if (ddVar.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new org.telegram.ui.Components.xc((FrameLayout) ddVar.containerView, ddVar.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) m61Var.B, new Object[0])), R.raw.stars_topup).j();
            ddVar.a0.c(true);
            ha.y(ddVar.currentAccount, false).T(true);
        } else if (str != null) {
            i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, new org.telegram.ui.Components.xc((FrameLayout) ddVar.containerView, ddVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, b71 b71Var) {
        long j10;
        cd cdVar = this.Y;
        arrayList.add(m61.l(cdVar));
        boolean z10 = this.d0;
        if (z10) {
            i2.o1.q(R.string.TelegramStarsChoose, arrayList);
        }
        int i10 = 0;
        ArrayList z11 = ha.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(m61.n(31));
                arrayList.add(m61.n(31));
                arrayList.add(m61.n(31));
            } else {
                int i11 = 1;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z12 = false;
                while (true) {
                    int size = z11.size();
                    j10 = this.X;
                    if (i12 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i12);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.f0 && z12) {
                            i14++;
                        } else {
                            arrayList.add(yc.a(i12, i11, tL_starsTopupOption));
                            i13++;
                            i11++;
                            z12 = true;
                        }
                    }
                    i12++;
                }
                if (i13 < 3) {
                    arrayList.clear();
                    arrayList.add(m61.k(cdVar));
                    i2.o1.q(R.string.TelegramStarsChoose, arrayList);
                    int i15 = 0;
                    for (int i16 = 0; i16 < z11.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i16);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(yc.a(i16, i11, tL_starsTopupOption2));
                            i15++;
                            i11++;
                        }
                    }
                    if (i15 == 0) {
                        while (i10 < z11.size()) {
                            arrayList.add(yc.a(i10, i11, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                            i10++;
                            i11++;
                        }
                        boolean z13 = this.f0;
                        if (!z13 && i14 > 0) {
                            String string = LocaleController.getString(z13 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z14 = !this.f0;
                            int i17 = rc.a;
                            m61 J = m61.J(rc.class);
                            J.d = -1;
                            J.l = string;
                            J.f = z14;
                            J.q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f0 = true;
                    }
                } else if (i13 > 0) {
                    boolean z15 = this.f0;
                    if (!z15 && i14 > 0) {
                        String string2 = LocaleController.getString(z15 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                        boolean z16 = !this.f0;
                        int i18 = rc.a;
                        m61 J2 = m61.J(rc.class);
                        J2.d = -1;
                        J2.l = string2;
                        J2.f = z16;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i10 < z11.size()) {
                        arrayList.add(yc.a(i10, i11, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                        i10++;
                        i11++;
                    }
                }
            }
        }
        arrayList.add(m61.k(this.Z));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            b71 b71Var = this.e0;
            if (b71Var != null) {
                b71Var.N(true);
            }
            long j10 = ha.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.Y.b;
            long j11 = this.X;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(z());
            }
            if (j10 < j11 || (runnable = this.b0) == null) {
                return;
            }
            runnable.run();
            this.b0 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        cd cdVar = this.Y;
        if (cdVar != null) {
            ((tg.n) cdVar.c).setPaused(true);
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
        gk gkVar;
        if (!this.d0) {
            org.telegram.messenger.v0.p(R.string.PaymentInvoiceDisabledStarsText, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
            return;
        }
        if (ha.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.b0;
            if (runnable != null) {
                runnable.run();
                this.b0 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof sn) {
            sn snVar = (sn) R;
            if (snVar.C9() && (gkVar = snVar.Y) != null) {
                gkVar.M();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(this.d, getContext(), this.currentAccount, 0, true, new q(this, 8), this.resourcesProvider);
        this.e0 = b71Var;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        cd cdVar = this.Y;
        if (cdVar == null) {
            return null;
        }
        return ((TextView) cdVar.b).getText();
    }
}
