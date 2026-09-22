package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a80 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 a;
    public final /* synthetic */ d80 b;

    public a80(d80 d80Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.b = d80Var;
        this.a = b2Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new g10(this, 12), 100L);
        }
    }
}
