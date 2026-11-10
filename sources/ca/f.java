package ca;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f implements l {
    public static final pb.b c = new pb.b(6);
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
