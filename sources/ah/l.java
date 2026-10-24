package ah;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ l(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a0 a0Var = this.b;
        switch (i10) {
            case 0:
                a0Var.n.requestFocus();
                break;
            case 1:
                a0Var.finishFragment();
                break;
            case 2:
                if (!a0Var.K) {
                    a0Var.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = a0Var.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a0Var.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    a0Var.y.setLayoutParams(marginLayoutParams);
                    a0Var.c.setVisibility(0);
                    a0Var.c.setTranslationY(r0.getMeasuredHeight());
                    a0Var.c.animate().setListener(null).cancel();
                    a0Var.c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(bs.f).setUpdateListener(new n(a0Var, 0)).setListener(new z(0)).start();
                    break;
                }
                break;
            case 3:
                pf.d.r(a0Var.getParentActivity(), "https://t.me/stickers");
                break;
            case 4:
                pf.d.r(a0Var.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                a0Var.Y(false);
                break;
        }
    }
}
