package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class h1 implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ d1 d;

    public h1(d1 d1Var) {
        this.d = d1Var;
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
        d1 d1Var = this.d;
        return i10 < d1Var.b.size() || (!d1Var.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i10 = this.a + 1;
        this.a = i10;
        d1 d1Var = this.d;
        return i10 < d1Var.b.size() ? (Map.Entry) d1Var.b.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        int i10 = d1.h;
        d1 d1Var = this.d;
        d1Var.b();
        if (this.a >= d1Var.b.size()) {
            a().remove();
            return;
        }
        int i11 = this.a;
        this.a = i11 - 1;
        d1Var.g(i11);
    }
}
