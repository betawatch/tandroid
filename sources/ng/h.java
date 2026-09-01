package ng;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                    sVar.c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(pr.f).setUpdateListener(new j(sVar, 0)).setListener(new r(0)).start();
                    break;
                }
                break;
            case 3:
                af.g.s(sVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 4:
                af.g.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                sVar.Y(false);
                break;
        }
    }
}
