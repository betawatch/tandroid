package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p40 extends Paint {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p40(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        super(1);
        this.a = i9;
        this.b = notificationCenterDelegate;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i9) {
        switch (this.a) {
            case 0:
                super.setAlpha(i9);
                ((f50) this.b).invalidate();
                break;
            default:
                super.setAlpha(i9);
                ((ProfileActivity) this.b).fragmentView.invalidate();
                break;
        }
    }
}
