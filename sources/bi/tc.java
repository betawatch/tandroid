package bi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.z90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class tc extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final sc Y;
    public final FrameLayout Z;
    public final z00 a0;
    public Runnable b0;
    public final TLRPC.InputPeer c0;
    public final boolean d0;
    public j71 e0;
    public boolean f0;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r7)) == null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tc(Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, int i10, String str, Runnable runnable, long j11) {
        super(context, null, false, false, u6Var);
        String str2;
        String str3;
        this.v = 0.2f;
        this.b0 = runnable;
        TLRPC.InputPeer inputPeer = j11 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
        this.c0 = inputPeer;
        boolean isReady = (inputPeer == null || !AppGlobalConfig.getInstance(ca.y(this.currentAccount, false).a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.d0 = isReady;
        fixNavigationBar();
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new ai.k(this, 3));
        this.d.u1();
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColorKey(org.telegram.ui.ActionBar.y6.i5);
        this.X = j10;
        sc scVar = new sc(context, this.currentAccount, u6Var);
        TextView textView = (TextView) scVar.e;
        this.Y = scVar;
        ((TextView) scVar.b).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j10 - ca.y(this.currentAccount, false).p().amount), new Object[0]));
        int i12 = 5;
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
            String nullable = LocaleController.nullable(LocaleController.formatString(str3, 0, str));
            textView.setText(AndroidUtilities.replaceTags(nullable == null ? LocaleController.getString(str3) : nullable));
            textView.setMaxWidth(fi.v3.a(textView.getText(), textView.getPaint()));
        }
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        z90 z90Var = new z90(context, u6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        z90Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.B6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        if (isReady) {
            z90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new u6(this, i12)));
        } else {
            org.telegram.ui.d3.s(R.string.StarsPurchaseUnavailable, z90Var);
        }
        z90Var.setGravity(17);
        z90Var.setMaxWidth(fi.v3.a(z90Var.getText(), z90Var.getPaint()));
        frameLayout.addView(z90Var, gb1.i(-2, -1, 17));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, frameLayout, u6Var);
        z00 z00Var = new z00(getContext());
        this.a0 = z00Var;
        this.containerView.addView(z00Var, gb1.g(-1.0f, -1));
        j71 j71Var = this.e0;
        if (j71Var != null) {
            j71Var.O(false);
        }
    }

    public static void P(tc tcVar, int i10) {
        t61 G;
        j71 j71Var = tcVar.e0;
        if (j71Var == null || (G = j71Var.G(i10 - 1)) == null) {
            return;
        }
        j71 j71Var2 = tcVar.e0;
        if (G.d == -1) {
            tcVar.f0 = !tcVar.f0;
            j71Var2.O(true);
        } else if (G.H(oc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(tcVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.I1;
            }
            if (findActivity == null) {
                return;
            }
            ca.y(tcVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new m5(2, tcVar, G), tcVar.c0);
        }
    }

    public static void Q(tc tcVar, t61 t61Var, Boolean bool, String str) {
        if (tcVar.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new org.telegram.ui.Components.wc((FrameLayout) tcVar.containerView, tcVar.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) t61Var.B, new Object[0])), R.raw.stars_topup).j();
            tcVar.a0.c(true);
            ca.y(tcVar.currentAccount, false).T(true);
        } else if (str != null) {
            ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, new org.telegram.ui.Components.wc((FrameLayout) tcVar.containerView, tcVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, j71 j71Var) {
        long j10;
        sc scVar = this.Y;
        arrayList.add(t61.m(scVar));
        boolean z10 = this.d0;
        if (z10) {
            ic.a.p(R.string.TelegramStarsChoose, arrayList);
        }
        int i10 = 0;
        ArrayList z11 = ca.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(t61.p(31));
                arrayList.add(t61.p(31));
                arrayList.add(t61.p(31));
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
                            arrayList.add(oc.a(i12, i11, tL_starsTopupOption));
                            i13++;
                            i11++;
                            z12 = true;
                        }
                    }
                    i12++;
                }
                if (i13 < 3) {
                    arrayList.clear();
                    arrayList.add(t61.k(scVar));
                    ic.a.p(R.string.TelegramStarsChoose, arrayList);
                    int i15 = 0;
                    for (int i16 = 0; i16 < z11.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i16);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(oc.a(i16, i11, tL_starsTopupOption2));
                            i15++;
                            i11++;
                        }
                    }
                    if (i15 == 0) {
                        while (i10 < z11.size()) {
                            arrayList.add(oc.a(i10, i11, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                            i10++;
                            i11++;
                        }
                        boolean z13 = this.f0;
                        if (!z13 && i14 > 0) {
                            String string = LocaleController.getString(z13 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z14 = !this.f0;
                            int i17 = ic.a;
                            t61 K = t61.K(ic.class);
                            K.d = -1;
                            K.l = string;
                            K.f = z14;
                            K.q = true;
                            arrayList.add(K);
                        }
                    } else {
                        this.f0 = true;
                    }
                } else if (i13 > 0) {
                    boolean z15 = this.f0;
                    if (!z15 && i14 > 0) {
                        String string2 = LocaleController.getString(z15 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                        boolean z16 = !this.f0;
                        int i18 = ic.a;
                        t61 K2 = t61.K(ic.class);
                        K2.d = -1;
                        K2.l = string2;
                        K2.f = z16;
                        K2.q = true;
                        arrayList.add(K2);
                    }
                } else {
                    while (i10 < z11.size()) {
                        arrayList.add(oc.a(i10, i11, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                        i10++;
                        i11++;
                    }
                }
            }
        }
        arrayList.add(t61.k(this.Z));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            j71 j71Var = this.e0;
            if (j71Var != null) {
                j71Var.O(true);
            }
            long j10 = ca.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.Y.b;
            long j11 = this.X;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(y());
            }
            if (j10 < j11 || (runnable = this.b0) == null) {
                return;
            }
            runnable.run();
            this.b0 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        sc scVar = this.Y;
        if (scVar != null) {
            ((ug.n) scVar.c).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        hk hkVar;
        if (!this.d0) {
            org.telegram.messenger.t.q(R.string.PaymentInvoiceDisabledStarsText, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
            return;
        }
        if (ca.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.b0;
            if (runnable != null) {
                runnable.run();
                this.b0 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R instanceof un) {
            un unVar = (un) R;
            if (unVar.F9() && (hkVar = unVar.Y) != null) {
                hkVar.M();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 11), this.resourcesProvider);
        this.e0 = j71Var;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        sc scVar = this.Y;
        if (scVar == null) {
            return null;
        }
        return ((TextView) scVar.b).getText();
    }
}
