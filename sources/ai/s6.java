package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
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
    public b2 r;
    public b2 s;
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
            AndroidUtilities.runOnUIThread(new l6(this, 1));
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
            ((q6) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
