package gh;

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
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ea extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final long T;
    public final fg.a U;
    public final FrameLayout V;
    public final c00 W;
    public Runnable X;
    public final TLRPC.InputPeer Y;
    public final boolean Z;
    public z41 a0;
    public boolean b0;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r5)) == null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ea(Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, int i9, String str, Runnable runnable, long j11) {
        super(context, null, false, false, false, 1, b6Var);
        String str2;
        String str3;
        this.v = 0.2f;
        this.X = runnable;
        TLRPC.InputPeer inputPeer = j11 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
        this.Y = inputPeer;
        boolean isReady = (inputPeer == null || !AppGlobalConfig.getInstance(v7.y(this.currentAccount, false).a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.Z = isReady;
        fixNavigationBar();
        wk0 wk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new eh.j(this, 5));
        this.d.p1();
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i5, b6Var));
        this.T = j10;
        fg.a aVar = new fg.a(context, this.currentAccount, b6Var);
        TextView textView = (TextView) aVar.e;
        this.U = aVar;
        ((TextView) aVar.d).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j10 - v7.y(this.currentAccount, false).p().amount), new Object[0]));
        if (i9 == 1) {
            str2 = "StarsNeededTextBuySubscription";
        } else {
            if (i9 != 2) {
                if (i9 == 7) {
                    str2 = "StarsNeededTextKeepBotSubscription";
                } else if (i9 == 8) {
                    str2 = "StarsNeededTextKeepBizSubscription";
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        str2 = "StarsNeededTextLink";
                        if (str == null) {
                            str3 = "StarsNeededTextLink";
                        } else {
                            str3 = "StarsNeededTextLink_" + str.toLowerCase();
                        }
                    } else {
                        str2 = i9 == 5 ? "StarsNeededTextReactions" : i9 == 6 ? "StarsNeededTextGift" : i9 == 12 ? "StarsNeededTextGiftChannel" : i9 == 13 ? "StarsNeededTextPrivateMessage" : i9 == 10 ? "StarsNeededTextGiftUpgrade" : i9 == 11 ? "StarsNeededTextGiftTransfer" : i9 == 9 ? "StarsNeededBizText" : i9 == 14 ? "StarsNeededTextGiftBuyResale" : i9 == 15 ? "StarsNeededTextSearch" : i9 == 16 ? "StarsNeededRemoveGiftDescription" : i9 == 17 ? "StarsNeededLiveComments" : "StarsNeededText";
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
            textView.setMaxWidth(kh.x3.a(textView.getText(), textView.getPaint()));
        }
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        l80 l80Var = new l80(context, b6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        l80Var.setTextSize(1, 12.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B6, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var));
        if (isReady) {
            l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new fh.o1(this, 20)));
        } else {
            org.telegram.ui.Cells.j2.p(R.string.StarsPurchaseUnavailable, l80Var);
        }
        l80Var.setGravity(17);
        l80Var.setMaxWidth(kh.x3.a(l80Var.getText(), l80Var.getPaint()));
        frameLayout.addView(l80Var, g7.e6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        c00 c00Var = new c00(getContext());
        this.W = c00Var;
        this.containerView.addView(c00Var, g7.e6.c(-1.0f, -1));
        z41 z41Var = this.a0;
        if (z41Var != null) {
            z41Var.N(false);
        }
    }

    public static void O(ea eaVar, int i9) {
        l41 G;
        z41 z41Var = eaVar.a0;
        if (z41Var == null || (G = z41Var.G(i9 - 1)) == null) {
            return;
        }
        z41 z41Var2 = eaVar.a0;
        if (G.d == -1) {
            eaVar.b0 = !eaVar.b0;
            z41Var2.N(true);
        } else if (G.G(aa.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(eaVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            if (findActivity == null) {
                return;
            }
            v7.y(eaVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new bg.y0(4, eaVar, G), eaVar.Y);
        }
    }

    public static void P(ea eaVar, l41 l41Var, Boolean bool, String str) {
        if (eaVar.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new oc((FrameLayout) eaVar.containerView, eaVar.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) l41Var.B, new Object[0])), R.raw.stars_topup).j();
            eaVar.W.c(true);
            v7.y(eaVar.currentAccount, false).T(true);
        } else if (str != null) {
            org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, new oc((FrameLayout) eaVar.containerView, eaVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public final void Q(ArrayList arrayList, z41 z41Var) {
        long j10;
        fg.a aVar = this.U;
        arrayList.add(l41.l(aVar));
        boolean z10 = this.Z;
        if (z10) {
            org.telegram.ui.Cells.j2.l(R.string.TelegramStarsChoose, arrayList);
        }
        int i9 = 0;
        ArrayList z11 = v7.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(l41.n(31));
                arrayList.add(l41.n(31));
                arrayList.add(l41.n(31));
            } else {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z12 = false;
                int i13 = 1;
                while (true) {
                    int size = z11.size();
                    j10 = this.T;
                    if (i10 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i10);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.b0 && z12) {
                            i12++;
                        } else {
                            arrayList.add(aa.a(i10, i13, tL_starsTopupOption));
                            i11++;
                            i13++;
                            z12 = true;
                        }
                    }
                    i10++;
                }
                if (i11 < 3) {
                    arrayList.clear();
                    arrayList.add(l41.k(aVar));
                    org.telegram.ui.Cells.j2.l(R.string.TelegramStarsChoose, arrayList);
                    int i14 = 0;
                    for (int i15 = 0; i15 < z11.size(); i15++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i15);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(aa.a(i15, i13, tL_starsTopupOption2));
                            i14++;
                            i13++;
                        }
                    }
                    if (i14 == 0) {
                        while (i9 < z11.size()) {
                            arrayList.add(aa.a(i9, i13, (TL_stars.TL_starsTopupOption) z11.get(i9)));
                            i9++;
                            i13++;
                        }
                        boolean z13 = this.b0;
                        if (!z13 && i12 > 0) {
                            String string = LocaleController.getString(z13 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z14 = !this.b0;
                            int i16 = t9.a;
                            l41 J = l41.J(t9.class);
                            J.d = -1;
                            J.l = string;
                            J.f = z14;
                            J.q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.b0 = true;
                    }
                } else if (i11 > 0) {
                    boolean z15 = this.b0;
                    if (!z15 && i12 > 0) {
                        String string2 = LocaleController.getString(z15 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                        boolean z16 = !this.b0;
                        int i17 = t9.a;
                        l41 J2 = l41.J(t9.class);
                        J2.d = -1;
                        J2.l = string2;
                        J2.f = z16;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i9 < z11.size()) {
                        arrayList.add(aa.a(i9, i13, (TL_stars.TL_starsTopupOption) z11.get(i9)));
                        i9++;
                        i13++;
                    }
                }
            }
        }
        arrayList.add(l41.k(this.V));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        Runnable runnable;
        if (i9 == NotificationCenter.starOptionsLoaded || i9 == NotificationCenter.starBalanceUpdated) {
            z41 z41Var = this.a0;
            if (z41Var != null) {
                z41Var.N(true);
            }
            long j10 = v7.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.U.d;
            long j11 = this.T;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.pa paVar = this.e;
            if (paVar != null) {
                paVar.setTitle(y());
            }
            if (j10 < j11 || (runnable = this.X) == null) {
                return;
            }
            runnable.run();
            this.X = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        fg.a aVar = this.U;
        if (aVar != null) {
            ((ag.j) aVar.b).setPaused(true);
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
        ak akVar;
        if (!this.Z) {
            org.telegram.messenger.l0.p(R.string.PaymentInvoiceDisabledStarsText, new oc(org.telegram.ui.Components.cb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
            return;
        }
        if (v7.y(this.currentAccount, false).p().amount >= this.T) {
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
                this.X = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof qn) {
            qn qnVar = (qn) R;
            if (qnVar.x9() && (akVar = qnVar.U) != null) {
                akVar.O();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 20), this.resourcesProvider);
        this.a0 = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        fg.a aVar = this.U;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }
}
