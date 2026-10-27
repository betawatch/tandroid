package ig;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sz;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f1 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f = -1;

    public f1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.g = i11;
        this.h = notificationCenterDelegate;
        this.a = i10;
        this.b = j10;
        this.c = j11;
    }

    public final void a() {
        boolean N;
        switch (this.g) {
            case 0:
                N = ((j1) this.h).N();
                break;
            default:
                sz szVar = (sz) this.h;
                if (szVar.t1 == null || szVar.getVisibility() != 0 || !szVar.K0) {
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
