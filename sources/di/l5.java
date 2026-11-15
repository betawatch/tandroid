package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l5 {
    public final w5 a;
    public q5 b;
    public q5 c;
    public q5 d;
    public h5 h;
    public h5 i;
    public h5 j;
    public h5 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public l1 r;
    public l1 s;
    public float t;
    public boolean u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public float n = 0.0f;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;

    public l5(w5 w5Var) {
        this.a = w5Var;
        w5Var.c.addOnAttachStateChangeListener(new bi.x1(this, 4));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        h5 h5Var = this.h;
        if (h5Var != null) {
            h5Var.a();
        }
        h5 h5Var2 = this.i;
        if (h5Var2 != null) {
            h5Var2.a();
        }
        h5 h5Var3 = this.j;
        if (h5Var3 != null) {
            h5Var3.a();
        }
        h5 h5Var4 = this.k;
        if (h5Var4 != null) {
            h5Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.h3(new f5(this, 1));
        }
    }

    public final void c() {
        if (this.o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((j5) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
