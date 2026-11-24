// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dp2 {
    public final Object a;
    public final ja1 b;
    public final gq4 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ dp2(Object obj, ja1 ja1Var, gq4 gq4Var, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : ja1Var, (i & 4) != 0 ? null : gq4Var, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static dp2 a(dp2 dp2Var, ja1 ja1Var, CancellationException cancellationException, int i) {
        Object obj = dp2Var.a;
        if ((i & 2) != 0) {
            ja1Var = dp2Var.b;
        }
        ja1 ja1Var2 = ja1Var;
        gq4 gq4Var = dp2Var.c;
        Object obj2 = dp2Var.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = dp2Var.e;
        }
        return new dp2(obj, ja1Var2, gq4Var, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp2)) {
            return false;
        }
        dp2 dp2Var = (dp2) obj;
        return rp5.a(this.a, dp2Var.a) && rp5.a(this.b, dp2Var.b) && rp5.a(this.c, dp2Var.c) && rp5.a(this.d, dp2Var.d) && rp5.a(this.e, dp2Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ja1 ja1Var = this.b;
        int hashCode2 = (hashCode + (ja1Var == null ? 0 : ja1Var.hashCode())) * 31;
        gq4 gq4Var = this.c;
        int hashCode3 = (hashCode2 + (gq4Var == null ? 0 : gq4Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public dp2(Object obj, ja1 ja1Var, gq4 gq4Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = ja1Var;
        this.c = gq4Var;
        this.d = obj2;
        this.e = th;
    }
}
