package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class f1 implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ d1 d;

    public f1(d1 d1Var) {
        this.d = d1Var;
    }

    public final Iterator a() {
        if (this.c == null) {
            this.c = this.d.b.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.a + 1;
        d1 d1Var = this.d;
        return i7 < d1Var.a.size() || (!d1Var.b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i7 = this.a + 1;
        this.a = i7;
        d1 d1Var = this.d;
        return i7 < d1Var.a.size() ? (Map.Entry) d1Var.a.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        int i7 = d1.f;
        d1 d1Var = this.d;
        d1Var.c();
        if (this.a >= d1Var.a.size()) {
            a().remove();
            return;
        }
        int i10 = this.a;
        this.a = i10 - 1;
        d1Var.i(i10);
    }
}
