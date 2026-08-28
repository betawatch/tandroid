package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i1 implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ e1 d;

    public i1(e1 e1Var) {
        this.d = e1Var;
    }

    public final Iterator a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9 = this.a + 1;
        e1 e1Var = this.d;
        return i9 < e1Var.b.size() || (!e1Var.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i9 = this.a + 1;
        this.a = i9;
        e1 e1Var = this.d;
        return i9 < e1Var.b.size() ? (Map.Entry) e1Var.b.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        int i9 = e1.h;
        e1 e1Var = this.d;
        e1Var.b();
        if (this.a >= e1Var.b.size()) {
            a().remove();
            return;
        }
        int i10 = this.a;
        this.a = i10 - 1;
        e1Var.g(i10);
    }
}
