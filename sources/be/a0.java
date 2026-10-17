package be;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class a0 extends kd.a implements kd.e {
    public static final z b = new z(kd.d.a, y.b);

    public a0() {
        super(kd.d.a);
    }

    public abstract void c(kd.h hVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof g2);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, td.l] */
    @Override // kd.a, kd.h
    public final kd.f get(kd.g key) {
        kd.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (!(key instanceof z)) {
            if (kd.d.a == key) {
                return this;
            }
            return null;
        }
        z zVar = (z) key;
        kd.g gVar = this.a;
        if ((gVar == zVar || zVar.b == gVar) && (fVar = (kd.f) zVar.a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((kd.f) r3.a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return kd.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (kd.d.a == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.j, td.l] */
    @Override // kd.a, kd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kd.h minusKey(kd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            kd.g gVar = this.a;
            if (gVar != zVar && zVar.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this);
    }
}
