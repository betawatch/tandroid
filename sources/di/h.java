package di;

import ai.d1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.v;
import ci.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.wn;
import s4.j;
import w7.y5;
import yh.s5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class h extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final zf.a X;
    public final d1 Y;
    public final FrameLayout Z;
    public Runnable a0;
    public j61 b0;

    public h(Context context, d6 d6Var, zf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, d6Var);
        this.v = 0.2f;
        this.a0 = runnable;
        fixNavigationBar();
        wl0 wl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        wl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 7));
        j jVar = new j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(h6.v0(h6.h5, d6Var));
        this.X = aVar;
        final int i12 = 1;
        d1 d1Var = new d1(context, 1, d6Var);
        this.Y = d1Var;
        ((TextView) d1Var.c).setText(LocaleController.formatString(R.string.TonNeededTitle, zf.a.i(aVar.b - s5.y(this.currentAccount, true).s().b, zf.b.b).d()));
        TextView textView = (TextView) d1Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(e4.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        ci.d dVar = new ci.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, y5.t(-1, 48, 17, 20, 10, 20, 20));
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
        j61 j61Var = this.b0;
        if (j61Var != null) {
            j61Var.N(false);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            j61 j61Var = this.b0;
            if (j61Var != null) {
                j61Var.N(true);
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

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        d1 d1Var = this.Y;
        if (d1Var != null) {
            ((sg.e) d1Var.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        jk jkVar;
        if (s5.y(this.currentAccount, true).s().b >= this.X.b) {
            Runnable runnable = this.a0;
            if (runnable != null) {
                runnable.run();
                this.a0 = null;
                return;
            }
            return;
        }
        m2 R = LaunchActivity.R();
        if (R instanceof wn) {
            wn wnVar = (wn) R;
            if (wnVar.x9() && (jkVar = wnVar.Y) != null) {
                jkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final vl0 v(wl0 wl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new v(this, 11), this.resourcesProvider);
        this.b0 = j61Var;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        d1 d1Var = this.Y;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.c).getText();
    }
}
