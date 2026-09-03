package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k50 extends Paint {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                super.setAlpha(i10);
                ((z50) this.b).invalidate();
                break;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.b).fragmentView.invalidate();
                break;
        }
    }
}
