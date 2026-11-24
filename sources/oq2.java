// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oq2 {
    public final Object a;
    public final rb1 b;
    public final hs4 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ oq2(Object obj, rb1 rb1Var, hs4 hs4Var, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : rb1Var, (i & 4) != 0 ? null : hs4Var, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static oq2 a(oq2 oq2Var, rb1 rb1Var, CancellationException cancellationException, int i) {
        Object obj = oq2Var.a;
        if ((i & 2) != 0) {
            rb1Var = oq2Var.b;
        }
        rb1 rb1Var2 = rb1Var;
        hs4 hs4Var = oq2Var.c;
        Object obj2 = oq2Var.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = oq2Var.e;
        }
        return new oq2(obj, rb1Var2, hs4Var, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq2)) {
            return false;
        }
        oq2 oq2Var = (oq2) obj;
        return rr5.a(this.a, oq2Var.a) && rr5.a(this.b, oq2Var.b) && rr5.a(this.c, oq2Var.c) && rr5.a(this.d, oq2Var.d) && rr5.a(this.e, oq2Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        rb1 rb1Var = this.b;
        int hashCode2 = (hashCode + (rb1Var == null ? 0 : rb1Var.hashCode())) * 31;
        hs4 hs4Var = this.c;
        int hashCode3 = (hashCode2 + (hs4Var == null ? 0 : hs4Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public oq2(Object obj, rb1 rb1Var, hs4 hs4Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = rb1Var;
        this.c = hs4Var;
        this.d = obj2;
        this.e = th;
    }
}
