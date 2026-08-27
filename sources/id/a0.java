package id;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class a0 extends rc.a implements rc.e {
    public static final z b = new z(rc.d.a, y.b);

    public a0() {
        super(rc.d.a);
    }

    public abstract void c(rc.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof g2);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ad.l, kotlin.jvm.internal.k] */
    @Override // rc.a, rc.h
    public final rc.f get(rc.g key) {
        rc.f fVar;
        kotlin.jvm.internal.j.e(key, "key");
        if (!(key instanceof z)) {
            if (rc.d.a == key) {
                return this;
            }
            return null;
        }
        z zVar = (z) key;
        rc.g gVar = this.a;
        if ((gVar == zVar || zVar.b == gVar) && (fVar = (rc.f) zVar.a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((rc.f) r3.a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return rc.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (rc.d.a == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [ad.l, kotlin.jvm.internal.k] */
    @Override // rc.a, rc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rc.h minusKey(rc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            rc.g gVar = this.a;
            if (gVar != zVar && zVar.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this);
    }
}
