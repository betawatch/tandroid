package jh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class s4 {
    public final d5 a;
    public x4 b;
    public x4 c;
    public x4 d;
    public o4 h;
    public o4 i;
    public o4 j;
    public o4 k;
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

    public s4(d5 d5Var) {
        this.a = d5Var;
        d5Var.c.addOnAttachStateChangeListener(new df.b(this, 4));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        o4 o4Var = this.h;
        if (o4Var != null) {
            o4Var.a();
        }
        o4 o4Var2 = this.i;
        if (o4Var2 != null) {
            o4Var2.a();
        }
        o4 o4Var3 = this.j;
        if (o4Var3 != null) {
            o4Var3.a();
        }
        o4 o4Var4 = this.k;
        if (o4Var4 != null) {
            o4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new m4(this, 1));
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
            ((q4) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
