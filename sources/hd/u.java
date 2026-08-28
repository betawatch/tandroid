package hd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u {
    public final Object a;
    public final k b;
    public final zc.l c;
    public final Object d;
    public final Throwable e;

    public u(Object obj, k kVar, zc.l lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = kVar;
        this.c = lVar;
        this.d = obj2;
        this.e = th;
    }

    public static u a(u uVar, k kVar, Throwable th, int i9) {
        Object obj = uVar.a;
        if ((i9 & 2) != 0) {
            kVar = uVar.b;
        }
        k kVar2 = kVar;
        zc.l lVar = uVar.c;
        Object obj2 = uVar.d;
        if ((i9 & 16) != 0) {
            th = uVar.e;
        }
        return new u(obj, kVar2, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.i.a(this.a, uVar.a) && kotlin.jvm.internal.i.a(this.b, uVar.b) && kotlin.jvm.internal.i.a(this.c, uVar.c) && kotlin.jvm.internal.i.a(this.d, uVar.d) && kotlin.jvm.internal.i.a(this.e, uVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        zc.l lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ u(Object obj, k kVar, zc.l lVar, Throwable th, int i9) {
        this(obj, (i9 & 2) != 0 ? null : kVar, (i9 & 4) != 0 ? null : lVar, (Object) null, (i9 & 16) != 0 ? null : th);
    }
}
