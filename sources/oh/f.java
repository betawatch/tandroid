package oh;

import ag.v;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.o;
import dg.i;
import f2.l;
import i7.f6;
import jh.s7;
import nh.t3;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dk;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f extends xa implements NotificationCenter.NotificationCenterDelegate {
    public final kf.a T;
    public final v U;
    public final FrameLayout V;
    public Runnable W;
    public k51 X;

    public f(Context context, c6 c6Var, kf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, false, 1, c6Var);
        this.v = 0.2f;
        this.W = runnable;
        fixNavigationBar();
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        jl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new o(this, 18));
        l lVar = new l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(g6.v0(g6.h5, c6Var));
        this.T = aVar;
        v vVar = new v(context, 3, c6Var);
        this.U = vVar;
        final int i12 = 1;
        ((TextView) vVar.c).setText(LocaleController.formatString(R.string.TonNeededTitle, kf.a.i(aVar.b - s7.y(this.currentAccount, true).s().b, kf.b.b).d()));
        TextView textView = (TextView) vVar.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(t3.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        nh.d dVar = new nh.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, f6.t(-1, 48, 17, 20, 10, 20, 20));
        if (z10 || g.B0()) {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: oh.e
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ye.d.u(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: oh.e
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            ye.d.u(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        }
        k51 k51Var = this.X;
        if (k51Var != null) {
            k51Var.N(false);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            k51 k51Var = this.X;
            if (k51Var != null) {
                k51Var.N(true);
            }
            kf.a s10 = s7.y(this.currentAccount, true).s();
            TextView textView = (TextView) this.U.c;
            int i12 = R.string.TonNeededTitle;
            kf.a aVar = this.T;
            textView.setText(LocaleController.formatString(i12, kf.a.i(aVar.b - s10.b, kf.b.b).d()));
            ua uaVar = this.e;
            if (uaVar != null) {
                uaVar.setTitle(y());
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
        v vVar = this.U;
        if (vVar != null) {
            ((i) vVar.b).setPaused(true);
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
        if (s7.y(this.currentAccount, true).s().b >= this.T.b) {
            Runnable runnable = this.W;
            if (runnable != null) {
                runnable.run();
                this.W = null;
                return;
            }
            return;
        }
        o2 R = LaunchActivity.R();
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
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new t4(this, 5), this.resourcesProvider);
        this.X = k51Var;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        v vVar = this.U;
        if (vVar == null) {
            return null;
        }
        return ((TextView) vVar.c).getText();
    }
}
