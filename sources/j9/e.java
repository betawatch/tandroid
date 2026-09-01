package j9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
