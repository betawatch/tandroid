package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.v0;
import ci.u;
import di.f4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.mk;
import s4.j;
import w7.x5;
import zh.s5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class h extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final zf.a X;
    public final v0 Y;
    public final FrameLayout Z;
    public Runnable a0;
    public v51 b0;

    public h(Context context, f6 f6Var, zf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, f6Var);
        this.v = 0.2f;
        this.a0 = runnable;
        fixNavigationBar();
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bi.d(this, 7));
        j jVar = new j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(j6.v0(j6.h5, f6Var));
        this.X = aVar;
        final int i12 = 1;
        v0 v0Var = new v0(context, 1, f6Var);
        this.Y = v0Var;
        ((TextView) v0Var.c).setText(LocaleController.formatString(R.string.TonNeededTitle, zf.a.i(aVar.b - s5.y(this.currentAccount, true).s().b, zf.b.b).d()));
        TextView textView = (TextView) v0Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(f4.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        di.d dVar = new di.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, x5.t(-1, 48, 17, 20, 10, 20, 20));
        if (z10 || i.B0()) {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ei.g
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            of.f.u(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ei.g
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            of.f.u(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        }
        v51 v51Var = this.b0;
        if (v51Var != null) {
            v51Var.N(false);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            v51 v51Var = this.b0;
            if (v51Var != null) {
                v51Var.N(true);
            }
            zf.a s10 = s5.y(this.currentAccount, true).s();
            TextView textView = (TextView) this.Y.c;
            int i12 = R.string.TonNeededTitle;
            zf.a aVar = this.X;
            textView.setText(LocaleController.formatString(i12, zf.a.i(aVar.b - s10.b, zf.b.b).d()));
            xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(y());
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
        v0 v0Var = this.Y;
        if (v0Var != null) {
            ((tg.e) v0Var.b).setPaused(true);
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
        mk mkVar;
        if (s5.y(this.currentAccount, true).s().b >= this.X.b) {
            Runnable runnable = this.a0;
            if (runnable != null) {
                runnable.run();
                this.a0 = null;
                return;
            }
            return;
        }
        n2 R = LaunchActivity.R();
        if (R instanceof co) {
            co coVar = (co) R;
            if (coVar.x9() && (mkVar = coVar.Y) != null) {
                mkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new u(this, 11), this.resourcesProvider);
        this.b0 = v51Var;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        v0 v0Var = this.Y;
        if (v0Var == null) {
            return null;
        }
        return ((TextView) v0Var.c).getText();
    }
}
