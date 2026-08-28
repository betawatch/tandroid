package of;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b1 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f = -1;

    public b1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9, long j10, long j11, int i10) {
        this.g = i10;
        this.h = notificationCenterDelegate;
        this.a = i9;
        this.b = j10;
        this.c = j11;
    }

    public final void a() {
        boolean N;
        switch (this.g) {
            case 0:
                N = ((f1) this.h).N();
                break;
            default:
                wy wyVar = (wy) this.h;
                if (wyVar.p1 == null || wyVar.getVisibility() != 0 || !wyVar.G0) {
                    N = false;
                    break;
                } else {
                    N = true;
                    break;
                }
        }
        this.d = N;
        if (N) {
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
