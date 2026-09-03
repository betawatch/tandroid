package j9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e implements j {
    public static final ab.a c = new ab.a(10);
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
