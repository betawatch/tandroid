package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class t6 {
    public final f7 a;
    public y6 b;
    public y6 c;
    public y6 d;
    public p6 h;
    public p6 i;
    public p6 j;
    public p6 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public d2 r;
    public d2 s;
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

    public t6(f7 f7Var) {
        this.a = f7Var;
        f7Var.c.addOnAttachStateChangeListener(new n6(this, 0));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        p6 p6Var = this.h;
        if (p6Var != null) {
            p6Var.a();
        }
        p6 p6Var2 = this.i;
        if (p6Var2 != null) {
            p6Var2.a();
        }
        p6 p6Var3 = this.j;
        if (p6Var3 != null) {
            p6Var3.a();
        }
        p6 p6Var4 = this.k;
        if (p6Var4 != null) {
            p6Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new m6(this, 1));
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
            ((r6) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
