package ca;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class f implements l {
    public static final qb.a c = new qb.a(6);
    public final Object a;
    public Object b;

    public f(ga.d dVar) {
        this.a = dVar;
        this.b = c;
    }

    @Override // ca.l
    public void a(k kVar, int i7) {
        int[] iArr = (int[]) this.b;
        try {
            kVar.read((byte[]) this.a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }
}
