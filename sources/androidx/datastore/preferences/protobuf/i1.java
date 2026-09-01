package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        int i10 = this.a + 1;
        e1 e1Var = this.d;
        return i10 < e1Var.b.size() || (!e1Var.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i10 = this.a + 1;
        this.a = i10;
        e1 e1Var = this.d;
        return i10 < e1Var.b.size() ? (Map.Entry) e1Var.b.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        int i10 = e1.h;
        e1 e1Var = this.d;
        e1Var.b();
        if (this.a >= e1Var.b.size()) {
            a().remove();
            return;
        }
        int i11 = this.a;
        this.a = i11 - 1;
        e1Var.g(i11);
    }
}
