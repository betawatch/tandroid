package gh;

import hh.m7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w5 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final m7 b;
    public final i5 c;
    public m5 d;
    public boolean e;

    public w5(int i10, long j10) {
        this.a = i10;
        m7 m7Var = new m7(i10, 0L, false);
        this.b = m7Var;
        m7Var.p = j10;
        i5 i5Var = new i5(j10, i10, new ag.n0(this, 11));
        i5Var.s = true;
        this.c = i5Var;
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
            m7 m7Var = this.b;
            if (m7Var.m != -1) {
                ConnectionsManager.getInstance(m7Var.a).cancelRequest(m7Var.m, true);
                m7Var.m = -1;
            }
            m7Var.i = false;
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m5 m5Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.b && (m5Var = this.d) != null) {
            m5Var.run();
        }
    }
}
