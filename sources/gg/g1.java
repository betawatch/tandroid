package gg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mz;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class g1 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f = -1;

    public g1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.g = i11;
        this.h = notificationCenterDelegate;
        this.a = i10;
        this.b = j3;
        this.c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.g) {
            case 0:
                N = ((k1) this.h).N();
                break;
            default:
                mz mzVar = (mz) this.h;
                if (mzVar.t1 == null || mzVar.getVisibility() != 0 || !mzVar.K0) {
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
