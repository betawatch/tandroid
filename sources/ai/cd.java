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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class cd extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final bd Y;
    public final FrameLayout Z;
    public final z00 a0;
    public Runnable b0;
    public final TLRPC.InputPeer c0;
    public final boolean d0;
    public s61 e0;
    public boolean f0;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r6)) == null) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cd(Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, int i10, String str, Runnable runnable, long j11) {
        super(context, null, false, false, d6Var);
        String str2;
        String str3;
        this.v = 0.2f;
        this.b0 = runnable;
        TLRPC.InputPeer inputPeer = j11 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
        this.c0 = inputPeer;
        boolean isReady = (inputPeer == null || !AppGlobalConfig.getInstance(ga.y(this.currentAccount, false).a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.d0 = isReady;
        fixNavigationBar();
        im0 im0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        im0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new wa(this, 2));
        this.d.p1();
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i5, d6Var));
        this.X = j10;
        bd bdVar = new bd(context, this.currentAccount, d6Var);
        TextView textView = (TextView) bdVar.e;
        this.Y = bdVar;
        ((TextView) bdVar.b).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j10 - ga.y(this.currentAccount, false).p().amount), new Object[0]));
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
        this.e.setTitle(A());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        x90 x90Var = new x90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        x90Var.setTextSize(1, 12.0f);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        if (isReady) {
            x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new a3.d(this, 24)));
        } else {
            org.telegram.ui.Cells.c1.s(R.string.StarsPurchaseUnavailable, x90Var);
        }
        x90Var.setGravity(17);
        x90Var.setMaxWidth(ei.x3.a(x90Var.getText(), x90Var.getPaint()));
        frameLayout.addView(x90Var, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        z00 z00Var = new z00(getContext());
        this.a0 = z00Var;
        this.containerView.addView(z00Var, w7.z5.c(-1.0f, -1));
        s61 s61Var = this.e0;
        if (s61Var != null) {
            s61Var.N(false);
        }
    }

    public static void Q(cd cdVar, int i10) {
        f61 G;
        s61 s61Var = cdVar.e0;
        if (s61Var == null || (G = s61Var.G(i10 - 1)) == null) {
            return;
        }
        s61 s61Var2 = cdVar.e0;
        if (G.d == -1) {
            cdVar.f0 = !cdVar.f0;
            s61Var2.N(true);
        } else if (G.G(xc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(cdVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.H1;
            }
            if (findActivity == null) {
                return;
            }
            ga.y(cdVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new q5(2, cdVar, G), cdVar.c0);
        }
    }

    public static void R(cd cdVar, f61 f61Var, Boolean bool, String str) {
        if (cdVar.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new org.telegram.ui.Components.xc((FrameLayout) cdVar.containerView, cdVar.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) f61Var.B, new Object[0])), R.raw.stars_topup).j();
            cdVar.a0.c(true);
            ga.y(cdVar.currentAccount, false).T(true);
        } else if (str != null) {
            i2.d.s(R.string.UnknownErrorCode, new Object[]{str}, new org.telegram.ui.Components.xc((FrameLayout) cdVar.containerView, cdVar.resourcesProvider), R.raw.error, 36);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        bd bdVar = this.Y;
        if (bdVar == null) {
            return null;
        }
        return ((TextView) bdVar.b).getText();
    }

    public final void S(ArrayList arrayList, s61 s61Var) {
        long j10;
        bd bdVar = this.Y;
        arrayList.add(f61.l(bdVar));
        boolean z10 = this.d0;
        if (z10) {
            i2.d.p(R.string.TelegramStarsChoose, arrayList);
        }
        int i10 = 0;
        ArrayList z11 = ga.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(f61.n(31));
                arrayList.add(f61.n(31));
                arrayList.add(f61.n(31));
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
                            arrayList.add(xc.a(i12, i11, tL_starsTopupOption));
                            i13++;
                            i11++;
                            z12 = true;
                        }
                    }
                    i12++;
                }
                if (i13 < 3) {
                    arrayList.clear();
                    arrayList.add(f61.k(bdVar));
                    i2.d.p(R.string.TelegramStarsChoose, arrayList);
                    int i15 = 0;
                    for (int i16 = 0; i16 < z11.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i16);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(xc.a(i16, i11, tL_starsTopupOption2));
                            i15++;
                            i11++;
                        }
                    }
                    if (i15 == 0) {
                        while (i10 < z11.size()) {
                            arrayList.add(xc.a(i10, i11, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                            i10++;
                            i11++;
                        }
                        boolean z13 = this.f0;
                        if (!z13 && i14 > 0) {
                            String string = LocaleController.getString(z13 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z14 = !this.f0;
                            int i17 = qc.a;
                            f61 J = f61.J(qc.class);
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
                        int i18 = qc.a;
                        f61 J2 = f61.J(qc.class);
                        J2.d = -1;
                        J2.l = string2;
                        J2.f = z16;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i10 < z11.size()) {
                        arrayList.add(xc.a(i10, i11, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                        i10++;
                        i11++;
                    }
                }
            }
        }
        arrayList.add(f61.k(this.Z));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            s61 s61Var = this.e0;
            if (s61Var != null) {
                s61Var.N(true);
            }
            long j10 = ga.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.Y.b;
            long j11 = this.X;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(A());
            }
            if (j10 < j11 || (runnable = this.b0) == null) {
                return;
            }
            runnable.run();
            this.b0 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        bd bdVar = this.Y;
        if (bdVar != null) {
            ((tg.n) bdVar.c).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        hk hkVar;
        if (!this.d0) {
            org.telegram.messenger.g0.q(R.string.PaymentInvoiceDisabledStarsText, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
            return;
        }
        if (ga.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.b0;
            if (runnable != null) {
                runnable.run();
                this.b0 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof sn) {
            sn snVar = (sn) R;
            if (snVar.C9() && (hkVar = snVar.Y) != null) {
                hkVar.N();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 8), this.resourcesProvider);
        this.e0 = s61Var;
        return s61Var;
    }
}
