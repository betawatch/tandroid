package id;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u {
    public final Object a;
    public final k b;
    public final ad.l c;
    public final Object d;
    public final Throwable e;

    public u(Object obj, k kVar, ad.l lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = kVar;
        this.c = lVar;
        this.d = obj2;
        this.e = th;
    }

    public static u a(u uVar, k kVar, Throwable th, int i10) {
        Object obj = uVar.a;
        if ((i10 & 2) != 0) {
            kVar = uVar.b;
        }
        k kVar2 = kVar;
        ad.l lVar = uVar.c;
        Object obj2 = uVar.d;
        if ((i10 & 16) != 0) {
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
        return kotlin.jvm.internal.j.a(this.a, uVar.a) && kotlin.jvm.internal.j.a(this.b, uVar.b) && kotlin.jvm.internal.j.a(this.c, uVar.c) && kotlin.jvm.internal.j.a(this.d, uVar.d) && kotlin.jvm.internal.j.a(this.e, uVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        ad.l lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ u(Object obj, k kVar, ad.l lVar, Throwable th, int i10) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : th);
    }
}
