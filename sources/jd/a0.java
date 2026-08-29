package jd;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a0 extends sc.a implements sc.e {
    public static final z b = new z(sc.d.a, y.b);

    public a0() {
        super(sc.d.a);
    }

    public abstract void c(sc.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof f2);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [bd.l, kotlin.jvm.internal.k] */
    @Override // sc.a, sc.h
    public final sc.f get(sc.g key) {
        sc.f fVar;
        kotlin.jvm.internal.j.e(key, "key");
        if (!(key instanceof z)) {
            if (sc.d.a == key) {
                return this;
            }
            return null;
        }
        z zVar = (z) key;
        sc.g gVar = this.a;
        if ((gVar == zVar || zVar.b == gVar) && (fVar = (sc.f) zVar.a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((sc.f) r3.a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return sc.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (sc.d.a == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [bd.l, kotlin.jvm.internal.k] */
    @Override // sc.a, sc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sc.h minusKey(sc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            sc.g gVar = this.a;
            if (gVar != zVar && zVar.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this);
    }
}
