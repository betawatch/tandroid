package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
