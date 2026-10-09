package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class b0 extends jd.a implements jd.e {
    public static final a0 b = new a0(jd.d.a, z.b);

    public b0() {
        super(jd.d.a);
    }

    public abstract void c(jd.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof h2);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, sd.l] */
    @Override // jd.a, jd.h
    public final jd.f get(jd.g key) {
        jd.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (!(key instanceof a0)) {
            if (jd.d.a == key) {
                return this;
            }
            return null;
        }
        a0 a0Var = (a0) key;
        jd.g gVar = this.a;
        if ((gVar == a0Var || a0Var.b == gVar) && (fVar = (jd.f) a0Var.a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((jd.f) r3.a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return jd.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (jd.d.a == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.j, sd.l] */
    @Override // jd.a, jd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jd.h minusKey(jd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof a0) {
            a0 a0Var = (a0) key;
            jd.g gVar = this.a;
            if (gVar != a0Var && a0Var.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + g0.k(this);
    }
}
