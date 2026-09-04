package ah;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ l(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        b0 b0Var = this.b;
        switch (i10) {
            case 0:
                b0Var.n.requestFocus();
                break;
            case 1:
                b0Var.finishFragment();
                break;
            case 2:
                if (!b0Var.K) {
                    b0Var.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = b0Var.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b0Var.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    b0Var.y.setLayoutParams(marginLayoutParams);
                    b0Var.c.setVisibility(0);
                    b0Var.c.setTranslationY(r0.getMeasuredHeight());
                    b0Var.c.animate().setListener(null).cancel();
                    b0Var.c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(pr.f).setUpdateListener(new n(b0Var, 0)).setListener(new a0(0)).start();
                    break;
                }
                break;
            case 3:
                of.f.s(b0Var.getParentActivity(), "https://t.me/stickers");
                break;
            case 4:
                of.f.s(b0Var.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                b0Var.Y(false);
                break;
        }
    }
}
