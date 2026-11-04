package ei;

import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n6 {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final /* synthetic */ z6 j;

    public n6(int i3, long j10, z6 z6Var) {
        this.j = z6Var;
        this.a = i3;
        this.b = j10;
        this.c = j10 == h10.i(i3).e();
        d();
    }

    public final boolean a() {
        return (this.c || this.j.i(this.b)) && this.f && this.h.size() < ((org.telegram.messenger.j0) hp.s1(this.a).x7.u.b).c;
    }

    public final s6 b(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            s6 s6Var = (s6) arrayList.get(i10);
            if (i3 == s6Var.a) {
                return s6Var;
            }
            i10++;
        }
    }

    public final int c(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (i3 == ((s6) arrayList.get(i10)).a) {
                return i10;
            }
            i10++;
        }
    }

    public final void d() {
        if (this.e || this.f) {
            return;
        }
        this.e = true;
        boolean z10 = this.d;
        long j10 = this.b;
        int i3 = this.a;
        if (z10) {
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = hp.s1(i3).j1(j10);
            ConnectionsManager.getInstance(i3).sendRequest(tL_getAlbums, new ci.d0(this, 7));
        } else {
            qr a02 = qr.a0(i3);
            a02.a.c(new org.telegram.messenger.a4(a02, j10, new m6(this), 23));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i3 = this.a;
        tL_reorderAlbums.peer = hp.s1(i3).j1(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((s6) obj).a));
        }
        ConnectionsManager.getInstance(i3).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i3 = this.a;
        qr a02 = qr.a0(i3);
        org.telegram.messenger.p5 p5Var = a02.a;
        long j10 = this.b;
        p5Var.c(new org.telegram.messenger.a4(a02, j10, this.h, 26));
        if (z10) {
            hs.f(i3).k(hs.j3, Long.valueOf(j10), this);
        }
    }
}
