package j$.util.concurrent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public abstract class a extends o {
    public final ConcurrentHashMap i;
    public k j;

    public a(k[] kVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        k kVar = this.j;
        if (kVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.g(kVar.b, null, null);
    }
}
