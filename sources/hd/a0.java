package hd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a0 extends qc.a implements qc.e {
    public static final z b = new z(qc.d.a, y.b);

    public a0() {
        super(qc.d.a);
    }

    public abstract void c(qc.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof g2);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, zc.l] */
    @Override // qc.a, qc.h
    public final qc.f get(qc.g key) {
        qc.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (!(key instanceof z)) {
            if (qc.d.a == key) {
                return this;
            }
            return null;
        }
        z zVar = (z) key;
        qc.g gVar = this.a;
        if ((gVar == zVar || zVar.b == gVar) && (fVar = (qc.f) zVar.a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((qc.f) r3.a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return qc.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (qc.d.a == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.j, zc.l] */
    @Override // qc.a, qc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qc.h minusKey(qc.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            qc.g gVar = this.a;
            if (gVar != zVar && zVar.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this);
    }
}
