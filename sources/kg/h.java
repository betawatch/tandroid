package kg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ h(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        s sVar = this.b;
        switch (i10) {
            case 0:
                sVar.n.requestFocus();
                break;
            case 1:
                sVar.finishFragment();
                break;
            case 2:
                if (!sVar.G) {
                    sVar.G = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.y.setLayoutParams(marginLayoutParams);
                    sVar.c.setVisibility(0);
                    sVar.c.setTranslationY(r0.getMeasuredHeight());
                    sVar.c.animate().setListener(null).cancel();
                    sVar.c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(jr.f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
                    break;
                }
                break;
            case 3:
                ye.d.s(sVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 4:
                ye.d.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                sVar.Y(false);
                break;
        }
    }
}
