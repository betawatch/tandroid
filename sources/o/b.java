package o;

import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {
    public c a;
    public c b;
    public final /* synthetic */ int c;

    public b(c cVar, c cVar2, int i3) {
        this.c = i3;
        this.a = cVar2;
        this.b = cVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.a == cVar && cVar == this.b) {
            this.b = null;
            this.a = null;
        }
        c cVar4 = this.a;
        if (cVar4 == cVar) {
            switch (this.c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.c;
                    break;
            }
            this.a = cVar2;
        }
        c cVar5 = this.b;
        if (cVar5 == cVar) {
            c cVar6 = this.a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.c) {
            case 0:
                return cVar.c;
            default:
                return cVar.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.b;
        c cVar2 = this.a;
        this.b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
