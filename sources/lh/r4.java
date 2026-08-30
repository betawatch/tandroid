package lh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class r4 {
    public final c5 a;
    public w4 b;
    public w4 c;
    public w4 d;
    public n4 h;
    public n4 i;
    public n4 j;
    public n4 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public t1 r;
    public t1 s;
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

    public r4(c5 c5Var) {
        this.a = c5Var;
        c5Var.c.addOnAttachStateChangeListener(new ff.b(this, 6));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        n4 n4Var = this.h;
        if (n4Var != null) {
            n4Var.a();
        }
        n4 n4Var2 = this.i;
        if (n4Var2 != null) {
            n4Var2.a();
        }
        n4 n4Var3 = this.j;
        if (n4Var3 != null) {
            n4Var3.a();
        }
        n4 n4Var4 = this.k;
        if (n4Var4 != null) {
            n4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new l4(this, 1));
        }
    }

    public final void c() {
        if (this.o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p4) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
