package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zw {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f = -1;

    public zw(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.g = i11;
        this.h = notificationCenterDelegate;
        this.a = i10;
        this.b = j10;
        this.c = j11;
    }

    public final void a() {
        boolean z4;
        switch (this.g) {
            case 0:
                kz kzVar = (kz) this.h;
                if (kzVar.q1 == null || kzVar.getVisibility() != 0 || !kzVar.H0) {
                    z4 = false;
                    break;
                } else {
                    z4 = true;
                    break;
                }
            default:
                z4 = ((tf.u0) this.h).N();
                break;
        }
        this.d = z4;
        if (z4) {
            return;
        }
        if (this.e) {
            MessagesController.getInstance(this.a).sendTyping(this.b, this.c, 2, 0);
        }
        this.f = -1L;
    }

    public final void b() {
        if (this.d) {
            if (this.f == -1) {
                this.f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f > 2000) {
                this.e = true;
                this.f = System.currentTimeMillis();
                MessagesController.getInstance(this.a).sendTyping(this.b, this.c, 10, 0);
            }
        }
    }
}
