package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j50 extends Paint {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                super.setAlpha(i10);
                ((y50) this.b).invalidate();
                break;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.b).fragmentView.invalidate();
                break;
        }
    }
}
