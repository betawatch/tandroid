package fh;

import gh.n7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e6 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final n7 b;
    public final p5 c;
    public t5 d;
    public boolean e;

    public e6(int i9, long j10) {
        this.a = i9;
        n7 n7Var = new n7(i9, 0L, false);
        this.b = n7Var;
        n7Var.p = j10;
        p5 p5Var = new p5(j10, i9, new bg.i(this, 9));
        p5Var.s = true;
        this.c = p5Var;
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
            n7 n7Var = this.b;
            if (n7Var.m != -1) {
                ConnectionsManager.getInstance(n7Var.a).cancelRequest(n7Var.m, true);
                n7Var.m = -1;
            }
            n7Var.i = false;
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        t5 t5Var;
        if (i9 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.b && (t5Var = this.d) != null) {
            t5Var.run();
        }
    }
}
