package h9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e implements j {
    public static final x9.d c = new x9.d(8);
    public final Object a;
    public Object b;

    public e(l9.b bVar) {
        this.a = bVar;
        this.b = c;
    }

    @Override // h9.j
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
