package lh;

import mh.l7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p5 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final l7 b;
    public final b5 c;
    public f5 d;
    public boolean e;

    public p5(int i10, long j10) {
        this.a = i10;
        l7 l7Var = new l7(i10, 0L, false);
        this.b = l7Var;
        l7Var.p = j10;
        b5 b5Var = new b5(j10, i10, new dg.h0(this, 16));
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
        f5 f5Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.b && (f5Var = this.d) != null) {
            f5Var.run();
        }
    }
}
