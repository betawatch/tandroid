package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ View d;

    public /* synthetic */ dp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.d = view;
        this.b = iArr;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((lq0) this.c).Q0((org.telegram.ui.Cells.e7) this.d, this.b, f10 / 1000.0f);
                break;
            default:
                ((sp0) this.c).d.Q0(this.d, this.b, f10 / 1000.0f);
                break;
        }
    }
}
