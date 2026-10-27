package bh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ j(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        u uVar = this.b;
        switch (i10) {
            case 0:
                uVar.h.requestFocus();
                break;
            case 1:
                uVar.h.setFocusableInTouchMode(true);
                break;
            case 2:
                uVar.finishFragment();
                break;
            case 3:
                if (uVar.O && !uVar.N) {
                    uVar.N = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    uVar.c.setVisibility(0);
                    uVar.c.setLayerType(2, null);
                    uVar.f0(uVar.P.e);
                    uVar.P.a(true, true);
                    break;
                }
                break;
            case 4:
                qf.d.r(uVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                qf.d.r(uVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                break;
            default:
                uVar.a0(false);
                break;
        }
    }
}
