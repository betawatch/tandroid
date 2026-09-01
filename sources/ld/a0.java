package ld;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class a0 extends uc.a implements uc.e {
    public static final z b = new z(uc.d.a, y.b);

    public a0() {
        super(uc.d.a);
    }

    public abstract void c(uc.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof f2);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [dd.l, kotlin.jvm.internal.k] */
    @Override // uc.a, uc.h
    public final uc.f get(uc.g key) {
        uc.f fVar;
        kotlin.jvm.internal.j.e(key, "key");
        if (!(key instanceof z)) {
            if (uc.d.a == key) {
                return this;
            }
            return null;
        }
        z zVar = (z) key;
        uc.g gVar = this.a;
        if ((gVar == zVar || zVar.b == gVar) && (fVar = (uc.f) zVar.a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((uc.f) r3.a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return uc.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (uc.d.a == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [dd.l, kotlin.jvm.internal.k] */
    @Override // uc.a, uc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uc.h minusKey(uc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            uc.g gVar = this.a;
            if (gVar != zVar && zVar.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this);
    }
}
