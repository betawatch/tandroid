package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ View d;

    public /* synthetic */ tp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.d = view;
        this.b = iArr;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((br0) this.c).N0((org.telegram.ui.Cells.g7) this.d, this.b, f7 / 1000.0f);
                break;
            default:
                ((iq0) this.c).d.N0(this.d, this.b, f7 / 1000.0f);
                break;
        }
    }
}
