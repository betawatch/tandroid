package n7;

import java.util.Arrays;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class w0 extends e1 {
    public final boolean a;

    public w0(boolean z10) {
        this.a = z10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int zza = e1Var.zza();
        int c10 = e1.c((byte) -32);
        if (c10 != zza) {
            return c10 - e1Var.zza();
        }
        return (true != this.a ? 20 : 21) - (true != ((w0) e1Var).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && w0.class == obj.getClass() && this.a == ((w0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e1.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // n7.e1
    public final int zza() {
        return e1.c((byte) -32);
    }
}
