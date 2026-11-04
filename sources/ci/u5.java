package ci;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u5 {
    public final f6 a;
    public z5 b;
    public z5 c;
    public z5 d;
    public q5 h;
    public q5 i;
    public q5 j;
    public q5 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public s1 r;
    public s1 s;
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

    public u5(f6 f6Var) {
        this.a = f6Var;
        f6Var.c.addOnAttachStateChangeListener(new ai.f2(this, 4));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.a();
        }
        q5 q5Var2 = this.i;
        if (q5Var2 != null) {
            q5Var2.a();
        }
        q5 q5Var3 = this.j;
        if (q5Var3 != null) {
            q5Var3.a();
        }
        q5 q5Var4 = this.k;
        if (q5Var4 != null) {
            q5Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.h3(new o5(this, 1));
        }
    }

    public final void c() {
        if (this.o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((s5) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
