package mg;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class c extends b {
    public float[] l;

    @Override // mg.b
    public final void e() {
        super.e();
        int size = this.d.size();
        long j3 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            long j10 = ((a) this.d.get(i7)).e;
            if (j10 > j3) {
                j3 = j10;
            }
        }
        this.l = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            if (j3 == ((a) this.d.get(i10)).e) {
                this.l[i10] = 1.0f;
            } else {
                this.l[i10] = j3 / r4;
            }
        }
    }
}
