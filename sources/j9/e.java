package j9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e implements j {
    public static final cb.b c = new cb.b(10);
    public final Object a;
    public Object b;

    public e(n9.b bVar) {
        this.a = bVar;
        this.b = c;
    }

    @Override // j9.j
    public void a(i iVar, int i10) {
        int[] iArr = (int[]) this.b;
        try {
            iVar.read((byte[]) this.a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }
}
