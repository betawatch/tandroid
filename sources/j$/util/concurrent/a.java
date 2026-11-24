package j$.util.concurrent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
