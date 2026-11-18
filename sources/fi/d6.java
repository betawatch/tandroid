package fi;

import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class d6 {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final /* synthetic */ p6 j;

    public d6(int i7, long j3, p6 p6Var) {
        this.j = p6Var;
        this.a = i7;
        this.b = j3;
        this.c = j3 == j10.i(i7).e();
        d();
    }

    public final boolean a() {
        return (this.c || this.j.i(this.b)) && this.f && this.h.size() < ((org.telegram.messenger.j0) mp.u1(this.a).A7.z.b).c;
    }

    public final i6 b(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            i6 i6Var = (i6) arrayList.get(i10);
            if (i7 == i6Var.a) {
                return i6Var;
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
            if (i7 == ((i6) arrayList.get(i10)).a) {
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
        long j3 = this.b;
        int i7 = this.a;
        if (z10) {
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = mp.u1(i7).l1(j3);
            ConnectionsManager.getInstance(i7).sendRequest(tL_getAlbums, new ai.e1(this, 8));
        } else {
            tr a02 = tr.a0(i7);
            a02.a.c(new org.telegram.messenger.d4(a02, j3, new c6(this), 23));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i7 = this.a;
        tL_reorderAlbums.peer = mp.u1(i7).l1(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((i6) obj).a));
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i7 = this.a;
        tr a02 = tr.a0(i7);
        org.telegram.messenger.q5 q5Var = a02.a;
        long j3 = this.b;
        q5Var.c(new org.telegram.messenger.d4(a02, j3, this.h, 26));
        if (z10) {
            ks.f(i7).k(ks.l3, Long.valueOf(j3), this);
        }
    }
}
