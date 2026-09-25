package jg;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
