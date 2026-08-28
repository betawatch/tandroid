package f9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements j {
    public static final za.a c = new za.a(7);
    public final Object a;
    public Object b;

    public e(j9.c cVar) {
        this.a = cVar;
        this.b = c;
    }

    @Override // f9.j
    public void a(i iVar, int i9) {
        int[] iArr = (int[]) this.b;
        try {
            iVar.read((byte[]) this.a, iArr[0], i9);
            iArr[0] = iArr[0] + i9;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }
}
