package ng;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c extends b {
    public float[] l;

    @Override // ng.b
    public final void e() {
        super.e();
        int size = this.d.size();
        long j10 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long j11 = ((a) this.d.get(i3)).e;
            if (j11 > j10) {
                j10 = j11;
            }
        }
        this.l = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            if (j10 == ((a) this.d.get(i10)).e) {
                this.l[i10] = 1.0f;
            } else {
                this.l[i10] = j10 / r4;
            }
        }
    }
}
