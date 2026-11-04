package ba;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements l {
    public static final ra.e c = new ra.e(4);
    public final Object a;
    public Object b;

    public f(fa.f fVar) {
        this.a = fVar;
        this.b = c;
    }

    @Override // ba.l
    public void a(k kVar, int i3) {
        int[] iArr = (int[]) this.b;
        try {
            kVar.read((byte[]) this.a, iArr[0], i3);
            iArr[0] = iArr[0] + i3;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }
}
