package hg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ h(s sVar, int i9) {
        this.a = i9;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        s sVar = this.b;
        switch (i9) {
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
                    sVar.c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(gr.f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
                    break;
                }
                break;
            case 3:
                ve.e.s(sVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 4:
                ve.e.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                sVar.X(false);
                break;
        }
    }
}
