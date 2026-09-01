package o4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class u {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public u(Object obj) {
        this(obj, -1L);
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a.equals(uVar.a) && this.b == uVar.b && this.c == uVar.c && this.d == uVar.d && this.e == uVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public u(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public u(u uVar) {
        this.a = uVar.a;
        this.b = uVar.b;
        this.c = uVar.c;
        this.d = uVar.d;
        this.e = uVar.e;
    }

    public u(int i10, int i11, int i12, long j10, Object obj) {
        this.a = obj;
        this.b = i10;
        this.c = i11;
        this.d = j10;
        this.e = i12;
    }
}
