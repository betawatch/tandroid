package ih;

import jh.k7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p5 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final k7 b;
    public final b5 c;
    public f5 d;
    public boolean e;

    public p5(int i10, long j10) {
        this.a = i10;
        k7 k7Var = new k7(i10, 0L, false);
        this.b = k7Var;
        k7Var.p = j10;
        b5 b5Var = new b5(j10, i10, new ag.i0(this, 16));
        b5Var.s = true;
        this.c = b5Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.b.a();
        this.c.g(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
            k7 k7Var = this.b;
            if (k7Var.m != -1) {
                ConnectionsManager.getInstance(k7Var.a).cancelRequest(k7Var.m, true);
                k7Var.m = -1;
            }
            k7Var.i = false;
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f5 f5Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.b && (f5Var = this.d) != null) {
            f5Var.run();
        }
    }
}
