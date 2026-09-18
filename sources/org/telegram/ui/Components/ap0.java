package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ View d;

    public /* synthetic */ ap0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.d = view;
        this.b = iArr;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((iq0) this.c).Q0((org.telegram.ui.Cells.f7) this.d, this.b, f7 / 1000.0f);
                break;
            default:
                ((pp0) this.c).d.Q0(this.d, this.b, f7 / 1000.0f);
                break;
        }
    }
}
