package o;

import java.util.Iterator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
