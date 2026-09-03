package kh;

import lh.l7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o5 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final l7 b;
    public final a5 c;
    public e5 d;
    public boolean e;

    public o5(int i10, long j10) {
        this.a = i10;
        l7 l7Var = new l7(i10, 0L, false);
        this.b = l7Var;
        l7Var.p = j10;
        a5 a5Var = new a5(j10, i10, new cg.h0(this, 16));
        a5Var.s = true;
        this.c = a5Var;
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
            l7 l7Var = this.b;
            if (l7Var.m != -1) {
                ConnectionsManager.getInstance(l7Var.a).cancelRequest(l7Var.m, true);
                l7Var.m = -1;
            }
            l7Var.i = false;
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e5 e5Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.b && (e5Var = this.d) != null) {
            e5Var.run();
        }
    }
}
