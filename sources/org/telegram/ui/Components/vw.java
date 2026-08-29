package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vw {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f = -1;

    public vw(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.g = i11;
        this.h = notificationCenterDelegate;
        this.a = i10;
        this.b = j10;
        this.c = j11;
    }

    public final void a() {
        boolean z10;
        switch (this.g) {
            case 0:
                fz fzVar = (fz) this.h;
                if (fzVar.p1 == null || fzVar.getVisibility() != 0 || !fzVar.G0) {
                    z10 = false;
                    break;
                } else {
                    z10 = true;
                    break;
                }
            default:
                z10 = ((rf.v0) this.h).N();
                break;
        }
        this.d = z10;
        if (z10) {
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
