package ca;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
