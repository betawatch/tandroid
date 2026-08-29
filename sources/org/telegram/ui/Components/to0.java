package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to0 implements o1.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ View d;

    public /* synthetic */ to0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.d = view;
        this.b = iArr;
    }

    @Override // o1.h
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.a) {
            case 0:
                ((dq0) this.c).Q0((org.telegram.ui.Cells.c7) this.d, this.b, f9 / 1000.0f);
                break;
            default:
                ((jp0) this.c).d.Q0(this.d, this.b, f9 / 1000.0f);
                break;
        }
    }
}
