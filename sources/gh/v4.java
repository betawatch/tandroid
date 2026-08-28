package gh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v4 {
    public final g5 a;
    public a5 b;
    public a5 c;
    public a5 d;
    public r4 h;
    public r4 i;
    public r4 j;
    public r4 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public v1 r;
    public v1 s;
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

    public v4(g5 g5Var) {
        this.a = g5Var;
        g5Var.c.addOnAttachStateChangeListener(new af.b(this, 4));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        r4 r4Var = this.h;
        if (r4Var != null) {
            r4Var.a();
        }
        r4 r4Var2 = this.i;
        if (r4Var2 != null) {
            r4Var2.a();
        }
        r4 r4Var3 = this.j;
        if (r4Var3 != null) {
            r4Var3.a();
        }
        r4 r4Var4 = this.k;
        if (r4Var4 != null) {
            r4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new p4(this, 1));
        }
    }

    public final void c() {
        if (this.o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((t4) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
