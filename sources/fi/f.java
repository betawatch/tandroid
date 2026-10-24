package fi;

import ai.ha;
import ai.q;
import ai.vc;
import ai.xa;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ei.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.gk;
import org.telegram.ui.sn;
import s4.k;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class f extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ag.a X;
    public final vc Y;
    public final FrameLayout Z;
    public Runnable a0;
    public int b0;
    public b71 c0;

    public f(Context context, g6 g6Var, ag.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, g6Var);
        this.v = 0.2f;
        this.a0 = runnable;
        fixNavigationBar();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new xa(this, 11));
        k kVar = new k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColor(k6.w0(k6.h5, g6Var));
        this.X = aVar;
        vc vcVar = new vc(context, 2, g6Var);
        this.Y = vcVar;
        final int i12 = 1;
        ((TextView) vcVar.c).setText(LocaleController.formatString(R.string.TonNeededTitle, ag.a.i(aVar.b - ha.y(this.currentAccount, true).s().b, ag.b.b).d()));
        TextView textView = (TextView) vcVar.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(x3.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(z());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        ei.d dVar = new ei.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, z5.t(-1, 48, 17, 20, 10, 20, 20));
        if (z10 || g.C0()) {
            dVar.i(LocaleController.getString(R.string.TopUpViaFragment), false, true);
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
            dVar.i(LocaleController.getString(R.string.Close), false, true);
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
        b71 b71Var = this.c0;
        if (b71Var != null) {
            b71Var.N(false);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            b71 b71Var = this.c0;
            if (b71Var != null) {
                b71Var.N(true);
            }
            ag.a s10 = ha.y(this.currentAccount, true).s();
            TextView textView = (TextView) this.Y.c;
            int i12 = R.string.TonNeededTitle;
            ag.a aVar = this.X;
            textView.setText(LocaleController.formatString(i12, ag.a.i(aVar.b - s10.b, ag.b.b).d()));
            org.telegram.ui.Components.xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(z());
            }
            if (s10.b < aVar.b || (runnable = this.a0) == null) {
                return;
            }
            runnable.run();
            this.a0 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        vc vcVar = this.Y;
        if (vcVar != null) {
            ((m6) vcVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int w02 = k6.w0(k6.h5, this.resourcesProvider);
            if (w02 != this.b0) {
                this.b0 = w02;
                setBackgroundColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        gk gkVar;
        if (ha.y(this.currentAccount, true).s().b >= this.X.b) {
            Runnable runnable = this.a0;
            if (runnable != null) {
                runnable.run();
                this.a0 = null;
                return;
            }
            return;
        }
        o2 R = LaunchActivity.R();
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
        b71 b71Var = new b71(this.d, getContext(), this.currentAccount, 0, true, new q(this, 22), this.resourcesProvider);
        this.c0 = b71Var;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        vc vcVar = this.Y;
        if (vcVar == null) {
            return null;
        }
        return ((TextView) vcVar.c).getText();
    }
}
