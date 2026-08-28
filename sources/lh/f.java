package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import eh.j;
import f2.n;
import g7.e6;
import gh.v7;
import gh.x9;
import kh.b8;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final gf.a T;
    public final x9 U;
    public final FrameLayout V;
    public Runnable W;
    public z41 X;

    public f(Context context, b6 b6Var, gf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, false, 1, b6Var);
        this.v = 0.2f;
        this.W = runnable;
        fixNavigationBar();
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        final int i10 = 0;
        wk0Var.setPadding(i9, 0, i9, 0);
        this.d.setOnItemClickListener(new j(this, 14));
        n nVar = new n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        setBackgroundColor(f6.v0(f6.h5, b6Var));
        this.T = aVar;
        x9 x9Var = new x9(context, 2, b6Var);
        this.U = x9Var;
        final int i11 = 1;
        ((TextView) x9Var.c).setText(LocaleController.formatString(R.string.TonNeededTitle, gf.a.i(aVar.b - v7.y(this.currentAccount, true).s().b, gf.b.b).d()));
        TextView textView = (TextView) x9Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(x3.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        kh.d dVar = new kh.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, e6.t(-1, 48, 17, 20, 10, 20, 20));
        if (z10 || g.A0()) {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: lh.e
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            ve.e.u(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: lh.e
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ve.e.u(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        }
        z41 z41Var = this.X;
        if (z41Var != null) {
            z41Var.N(false);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        Runnable runnable;
        if (i9 == NotificationCenter.starOptionsLoaded || i9 == NotificationCenter.starBalanceUpdated) {
            z41 z41Var = this.X;
            if (z41Var != null) {
                z41Var.N(true);
            }
            gf.a s10 = v7.y(this.currentAccount, true).s();
            TextView textView = (TextView) this.U.c;
            int i11 = R.string.TonNeededTitle;
            gf.a aVar = this.T;
            textView.setText(LocaleController.formatString(i11, gf.a.i(aVar.b - s10.b, gf.b.b).d()));
            pa paVar = this.e;
            if (paVar != null) {
                paVar.setTitle(y());
            }
            if (s10.b < aVar.b || (runnable = this.W) == null) {
                return;
            }
            runnable.run();
            this.W = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        x9 x9Var = this.U;
        if (x9Var != null) {
            ((ag.j) x9Var.b).setPaused(true);
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
        if (v7.y(this.currentAccount, true).s().b >= this.T.b) {
            Runnable runnable = this.W;
            if (runnable != null) {
                runnable.run();
                this.W = null;
                return;
            }
            return;
        }
        o2 R = LaunchActivity.R();
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
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new b8(this, 4), this.resourcesProvider);
        this.X = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        x9 x9Var = this.U;
        if (x9Var == null) {
            return null;
        }
        return ((TextView) x9Var.c).getText();
    }
}
