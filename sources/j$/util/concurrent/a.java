package j$.util.concurrent;

/* loaded from: classes2.dex */
public abstract class a extends p {
    public final ConcurrentHashMap i;
    public l j;

    public a(l[] lVarArr, int i9, int i10, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i9, 0, i10);
        this.i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final void remove() {
        l lVar = this.j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.g(lVar.b, null, null);
    }
}
