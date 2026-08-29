package jh;

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
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dk;
import org.telegram.ui.th;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y9 extends org.telegram.ui.Components.xa implements NotificationCenter.NotificationCenterDelegate {
    public final long T;
    public final ig.a U;
    public final FrameLayout V;
    public final n00 W;
    public Runnable X;
    public final TLRPC.InputPeer Y;
    public final boolean Z;
    public k51 a0;
    public boolean b0;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0109, code lost:
    
        if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r8)) == null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y9(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, int i10, String str, Runnable runnable, long j11) {
        super(context, null, false, false, false, 1, c6Var);
        String str2;
        String str3;
        this.v = 0.2f;
        this.X = runnable;
        TLRPC.InputPeer inputPeer = j11 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
        this.Y = inputPeer;
        boolean isReady = (inputPeer == null || !AppGlobalConfig.getInstance(s7.y(this.currentAccount, false).a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.Z = isReady;
        fixNavigationBar();
        jl0 jl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new bg.o(this, 9));
        this.d.p1();
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i5, c6Var));
        this.T = j10;
        ig.a aVar = new ig.a(context, this.currentAccount, c6Var);
        TextView textView = (TextView) aVar.e;
        this.U = aVar;
        ((TextView) aVar.d).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j10 - s7.y(this.currentAccount, false).p().amount), new Object[0]));
        int i12 = 15;
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
            textView.setMaxWidth(nh.t3.a(textView.getText(), textView.getPaint()));
        }
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        y80 y80Var = new y80(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        y80Var.setTextSize(1, 12.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        if (isReady) {
            y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new o(this, i12)));
        } else {
            org.telegram.ui.b.o(R.string.StarsPurchaseUnavailable, y80Var);
        }
        y80Var.setGravity(17);
        y80Var.setMaxWidth(nh.t3.a(y80Var.getText(), y80Var.getPaint()));
        frameLayout.addView(y80Var, i7.f6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        n00 n00Var = new n00(getContext());
        this.W = n00Var;
        this.containerView.addView(n00Var, i7.f6.c(-1.0f, -1));
        k51 k51Var = this.a0;
        if (k51Var != null) {
            k51Var.N(false);
        }
    }

    public static void P(y9 y9Var, int i10) {
        w41 G;
        k51 k51Var = y9Var.a0;
        if (k51Var == null || (G = k51Var.G(i10 - 1)) == null) {
            return;
        }
        k51 k51Var2 = y9Var.a0;
        if (G.d == -1) {
            y9Var.b0 = !y9Var.b0;
            k51Var2.N(true);
        } else if (G.G(u9.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(y9Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            if (findActivity == null) {
                return;
            }
            s7.y(y9Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new bh.v(5, y9Var, G), y9Var.Y);
        }
    }

    public static void Q(y9 y9Var, w41 w41Var, Boolean bool, String str) {
        if (y9Var.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new tc((FrameLayout) y9Var.containerView, y9Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) w41Var.B, new Object[0])), R.raw.stars_topup).j();
            y9Var.W.c(true);
            s7.y(y9Var.currentAccount, false).T(true);
        } else if (str != null) {
            th.r(R.string.UnknownErrorCode, new Object[]{str}, new tc((FrameLayout) y9Var.containerView, y9Var.resourcesProvider), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, k51 k51Var) {
        long j10;
        ig.a aVar = this.U;
        arrayList.add(w41.l(aVar));
        boolean z10 = this.Z;
        if (z10) {
            th.p(R.string.TelegramStarsChoose, arrayList);
        }
        int i10 = 0;
        ArrayList z11 = s7.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(w41.n(31));
                arrayList.add(w41.n(31));
                arrayList.add(w41.n(31));
            } else {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z12 = false;
                int i14 = 1;
                while (true) {
                    int size = z11.size();
                    j10 = this.T;
                    if (i11 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i11);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.b0 && z12) {
                            i13++;
                        } else {
                            arrayList.add(u9.a(i11, i14, tL_starsTopupOption));
                            i12++;
                            i14++;
                            z12 = true;
                        }
                    }
                    i11++;
                }
                if (i12 < 3) {
                    arrayList.clear();
                    arrayList.add(w41.k(aVar));
                    th.p(R.string.TelegramStarsChoose, arrayList);
                    int i15 = 0;
                    for (int i16 = 0; i16 < z11.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i16);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(u9.a(i16, i14, tL_starsTopupOption2));
                            i15++;
                            i14++;
                        }
                    }
                    if (i15 == 0) {
                        while (i10 < z11.size()) {
                            arrayList.add(u9.a(i10, i14, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                            i10++;
                            i14++;
                        }
                        boolean z13 = this.b0;
                        if (!z13 && i13 > 0) {
                            String string = LocaleController.getString(z13 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z14 = !this.b0;
                            int i17 = o9.a;
                            w41 J = w41.J(o9.class);
                            J.d = -1;
                            J.l = string;
                            J.f = z14;
                            J.q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.b0 = true;
                    }
                } else if (i12 > 0) {
                    boolean z15 = this.b0;
                    if (!z15 && i13 > 0) {
                        String string2 = LocaleController.getString(z15 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                        boolean z16 = !this.b0;
                        int i18 = o9.a;
                        w41 J2 = w41.J(o9.class);
                        J2.d = -1;
                        J2.l = string2;
                        J2.f = z16;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i10 < z11.size()) {
                        arrayList.add(u9.a(i10, i14, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                        i10++;
                        i14++;
                    }
                }
            }
        }
        arrayList.add(w41.k(this.V));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            k51 k51Var = this.a0;
            if (k51Var != null) {
                k51Var.N(true);
            }
            long j10 = s7.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.U.d;
            long j11 = this.T;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.ua uaVar = this.e;
            if (uaVar != null) {
                uaVar.setTitle(y());
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
        ig.a aVar = this.U;
        if (aVar != null) {
            ((dg.i) aVar.b).setPaused(true);
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
        dk dkVar;
        if (!this.Z) {
            j7.l1.v(R.string.PaymentInvoiceDisabledStarsText, new tc(hb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
            return;
        }
        if (s7.y(this.currentAccount, false).p().amount >= this.T) {
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
                this.X = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof tn) {
            tn tnVar = (tn) R;
            if (tnVar.x9() && (dkVar = tnVar.U) != null) {
                dkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 21), this.resourcesProvider);
        this.a0 = k51Var;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        ig.a aVar = this.U;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }
}
