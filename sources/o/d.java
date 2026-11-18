package o;

import java.util.Iterator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {
    public c a;
    public boolean b = true;
    public final /* synthetic */ f c;

    public d(f fVar) {
        this.c = fVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2 = this.a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.a = cVar3;
            this.b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        c cVar = this.a;
        return (cVar == null || cVar.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            c cVar = this.a;
            this.a = cVar != null ? cVar.c : null;
        }
        return this.a;
    }
}
