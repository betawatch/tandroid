package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ View d;

    public /* synthetic */ io0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i9) {
        this.a = i9;
        this.c = notificationCenterDelegate;
        this.d = view;
        this.b = iArr;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((rp0) this.c).Q0((org.telegram.ui.Cells.e7) this.d, this.b, f10 / 1000.0f);
                break;
            default:
                ((yo0) this.c).d.Q0(this.d, this.b, f10 / 1000.0f);
                break;
        }
    }
}
