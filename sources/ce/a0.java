package ce;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class a0 extends ld.a implements ld.e {
    public static final z b = new z(ld.d.a, y.b);

    public a0() {
        super(ld.d.a);
    }

    public abstract void c(ld.h hVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof g2);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, ud.l] */
    @Override // ld.a, ld.h
    public final ld.f get(ld.g key) {
        ld.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (!(key instanceof z)) {
            if (ld.d.a == key) {
                return this;
            }
            return null;
        }
        z zVar = (z) key;
        ld.g gVar = this.a;
        if ((gVar == zVar || zVar.b == gVar) && (fVar = (ld.f) zVar.a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((ld.f) r3.a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return ld.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (ld.d.a == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.j, ud.l] */
    @Override // ld.a, ld.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ld.h minusKey(ld.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            ld.g gVar = this.a;
            if (gVar != zVar && zVar.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this);
    }
}
