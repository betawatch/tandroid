package di;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public n6(int i7, long j3, z6 z6Var) {
        this.j = z6Var;
        this.a = i7;
        this.b = j3;
        this.c = j3 == p10.i(i7).e();
        d();
    }

    public final boolean a() {
        return (this.c || this.j.i(this.b)) && this.f && this.h.size() < ((org.telegram.messenger.j0) qp.s1(this.a).x7.u.b).c;
    }

    public final s6 b(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            s6 s6Var = (s6) arrayList.get(i10);
            if (i7 == s6Var.a) {
                return s6Var;
            }
            i10++;
        }
    }

    public final int c(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (i7 == ((s6) arrayList.get(i10)).a) {
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
        boolean z9 = this.d;
        long j3 = this.b;
        int i7 = this.a;
        if (z9) {
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = qp.s1(i7).j1(j3);
            ConnectionsManager.getInstance(i7).sendRequest(tL_getAlbums, new bi.j0(this, 7));
        } else {
            yr a02 = yr.a0(i7);
            a02.a.c(new org.telegram.messenger.a4(a02, j3, new m6(this), 23));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i7 = this.a;
        tL_reorderAlbums.peer = qp.s1(i7).j1(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((s6) obj).a));
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z9) {
        int i7 = this.a;
        yr a02 = yr.a0(i7);
        org.telegram.messenger.p5 p5Var = a02.a;
        long j3 = this.b;
        p5Var.c(new org.telegram.messenger.a4(a02, j3, this.h, 26));
        if (z9) {
            qs.f(i7).k(qs.j3, Long.valueOf(j3), this);
        }
    }
}
