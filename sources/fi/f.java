package fi;

import ai.ga;
import ai.q;
import ai.uc;
import ai.wa;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ei.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.fk;
import org.telegram.ui.qn;
import s4.k;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class f extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ag.a X;
    public final uc Y;
    public final FrameLayout Z;
    public Runnable a0;
    public t61 b0;

    public f(Context context, d6 d6Var, ag.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, d6Var);
        this.v = 0.2f;
        this.a0 = runnable;
        fixNavigationBar();
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        im0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new wa(this, 11));
        k kVar = new k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColor(h6.w0(h6.h5, d6Var));
        this.X = aVar;
        uc ucVar = new uc(context, 2, d6Var);
        this.Y = ucVar;
        final int i12 = 1;
        ((TextView) ucVar.c).setText(LocaleController.formatString(R.string.TonNeededTitle, ag.a.i(aVar.b - ga.y(this.currentAccount, true).s().b, ag.b.b).d()));
        TextView textView = (TextView) ucVar.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(x3.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(A());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        ei.d dVar = new ei.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, z5.t(-1, 48, 17, 20, 10, 20, 20));
        if (z10 || g.C0()) {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: fi.e
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            pf.d.t(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: fi.e
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            pf.d.t(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        }
        t61 t61Var = this.b0;
        if (t61Var != null) {
            t61Var.N(false);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        uc ucVar = this.Y;
        if (ucVar == null) {
            return null;
        }
        return ((TextView) ucVar.c).getText();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            t61 t61Var = this.b0;
            if (t61Var != null) {
                t61Var.N(true);
            }
            ag.a s10 = ga.y(this.currentAccount, true).s();
            TextView textView = (TextView) this.Y.c;
            int i12 = R.string.TonNeededTitle;
            ag.a aVar = this.X;
            textView.setText(LocaleController.formatString(i12, ag.a.i(aVar.b - s10.b, ag.b.b).d()));
            xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(A());
            }
            if (s10.b < aVar.b || (runnable = this.a0) == null) {
                return;
            }
            runnable.run();
            this.a0 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        uc ucVar = this.Y;
        if (ucVar != null) {
            ((m6) ucVar.b).setPaused(true);
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
        fk fkVar;
        if (ga.y(this.currentAccount, true).s().b >= this.X.b) {
            Runnable runnable = this.a0;
            if (runnable != null) {
                runnable.run();
                this.a0 = null;
                return;
            }
            return;
        }
        n2 R = LaunchActivity.R();
        if (R instanceof qn) {
            qn qnVar = (qn) R;
            if (qnVar.C9() && (fkVar = qnVar.Y) != null) {
                fkVar.N();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 22), this.resourcesProvider);
        this.b0 = t61Var;
        return t61Var;
    }
}
