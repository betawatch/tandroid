package jg;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class c extends b {
    public float[] l;

    @Override // jg.b
    public final void e() {
        super.e();
        int size = this.d.size();
        long j3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long j10 = ((a) this.d.get(i10)).e;
            if (j10 > j3) {
                j3 = j10;
            }
        }
        this.l = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            if (j3 == ((a) this.d.get(i11)).e) {
                this.l[i11] = 1.0f;
            } else {
                this.l[i11] = j3 / r4;
            }
        }
    }
}
