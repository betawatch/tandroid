package bi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class s6 {
    public final e7 a;
    public x6 b;
    public x6 c;
    public x6 d;
    public o6 h;
    public o6 i;
    public o6 j;
    public o6 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public z1 r;
    public z1 s;
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

    public s6(e7 e7Var) {
        this.a = e7Var;
        e7Var.c.addOnAttachStateChangeListener(new m6(this, 0));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        o6 o6Var = this.h;
        if (o6Var != null) {
            o6Var.a();
        }
        o6 o6Var2 = this.i;
        if (o6Var2 != null) {
            o6Var2.a();
        }
        o6 o6Var3 = this.j;
        if (o6Var3 != null) {
            o6Var3.a();
        }
        o6 o6Var4 = this.k;
        if (o6Var4 != null) {
            o6Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            org.telegram.messenger.g0.h3(new l6(this, 1));
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
            ((q6) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
