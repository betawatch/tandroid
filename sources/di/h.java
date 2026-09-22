package di;

import ai.d1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.v;
import ci.f4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.mk;
import s4.j;
import w7.x5;
import yh.u5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class h extends za implements NotificationCenter.NotificationCenterDelegate {
    public final zf.a X;
    public final d1 Y;
    public final FrameLayout Z;
    public Runnable a0;
    public w51 b0;

    public h(Context context, e6 e6Var, zf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, e6Var);
        this.v = 0.2f;
        this.a0 = runnable;
        fixNavigationBar();
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 7));
        j jVar = new j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(i6.v0(i6.h5, e6Var));
        this.X = aVar;
        final int i12 = 1;
        d1 d1Var = new d1(context, 1, e6Var);
        this.Y = d1Var;
        ((TextView) d1Var.c).setText(LocaleController.formatString(R.string.TonNeededTitle, zf.a.i(aVar.b - u5.y(this.currentAccount, true).s().b, zf.b.b).d()));
        TextView textView = (TextView) d1Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(f4.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        ci.d dVar = new ci.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, x5.t(-1, 48, 17, 20, 10, 20, 20));
        if (z10 || i.B0()) {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: di.g
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            nf.f.u(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: di.g
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            nf.f.u(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        }
        w51 w51Var = this.b0;
        if (w51Var != null) {
            w51Var.N(false);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            w51 w51Var = this.b0;
            if (w51Var != null) {
                w51Var.N(true);
            }
            zf.a s10 = u5.y(this.currentAccount, true).s();
            TextView textView = (TextView) this.Y.c;
            int i12 = R.string.TonNeededTitle;
            zf.a aVar = this.X;
            textView.setText(LocaleController.formatString(i12, zf.a.i(aVar.b - s10.b, zf.b.b).d()));
            va vaVar = this.e;
            if (vaVar != null) {
                vaVar.setTitle(y());
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
        d1 d1Var = this.Y;
        if (d1Var != null) {
            ((sg.e) d1Var.b).setPaused(true);
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
        if (u5.y(this.currentAccount, true).s().b >= this.X.b) {
            Runnable runnable = this.a0;
            if (runnable != null) {
                runnable.run();
                this.a0 = null;
                return;
            }
            return;
        }
        n2 R = LaunchActivity.R();
        if (R instanceof bo) {
            bo boVar = (bo) R;
            if (boVar.x9() && (mkVar = boVar.Y) != null) {
                mkVar.Q();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new v(this, 11), this.resourcesProvider);
        this.b0 = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        d1 d1Var = this.Y;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.c).getText();
    }
}
