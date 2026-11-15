package fi;

import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g6 {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final /* synthetic */ s6 j;

    public g6(int i7, long j3, s6 s6Var) {
        this.j = s6Var;
        this.a = i7;
        this.b = j3;
        this.c = j3 == m10.i(i7).e();
        d();
    }

    public final boolean a() {
        return (this.c || this.j.i(this.b)) && this.f && this.h.size() < ((org.telegram.messenger.j0) np.s1(this.a).y7.u.b).c;
    }

    public final l6 b(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            l6 l6Var = (l6) arrayList.get(i10);
            if (i7 == l6Var.a) {
                return l6Var;
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
            if (i7 == ((l6) arrayList.get(i10)).a) {
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
            tL_getAlbums.peer = np.s1(i7).j1(j3);
            ConnectionsManager.getInstance(i7).sendRequest(tL_getAlbums, new ai.e1(this, 8));
        } else {
            vr a02 = vr.a0(i7);
            a02.a.c(new org.telegram.messenger.a4(a02, j3, new e6(this), 23));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i7 = this.a;
        tL_reorderAlbums.peer = np.s1(i7).j1(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((l6) obj).a));
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i7 = this.a;
        vr a02 = vr.a0(i7);
        org.telegram.messenger.p5 p5Var = a02.a;
        long j3 = this.b;
        p5Var.c(new org.telegram.messenger.a4(a02, j3, this.h, 26));
        if (z10) {
            ns.f(i7).k(ns.j3, Long.valueOf(j3), this);
        }
    }
}
