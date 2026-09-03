package mg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                if (!sVar.H) {
                    sVar.H = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.y.setLayoutParams(marginLayoutParams);
                    sVar.c.setVisibility(0);
                    sVar.c.setTranslationY(r0.getMeasuredHeight());
                    sVar.c.animate().setListener(null).cancel();
                    sVar.c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(mr.f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
                    break;
                }
                break;
            case 3:
                ze.d.s(sVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 4:
                ze.d.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                sVar.Y(false);
                break;
        }
    }
}
