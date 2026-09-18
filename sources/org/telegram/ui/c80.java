package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c80 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 a;
    public final /* synthetic */ f80 b;

    public c80(f80 f80Var, org.telegram.ui.ActionBar.c2 c2Var) {
        this.b = f80Var;
        this.a = c2Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new i10(this, 12), 100L);
        }
    }
}
