// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oab implements Comparable {
    public final long a;
    public final byte[] b;

    public oab(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((oab) obj).a);
    }
}
