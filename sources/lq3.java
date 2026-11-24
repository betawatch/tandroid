// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lq3 extends nl1 {
    public float[] l;

    @Override // nl1
    public final void e() {
        super.e();
        int size = this.d.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            long j2 = ((ml1) this.d.get(i)).e;
            if (j2 > j) {
                j = j2;
            }
        }
        this.l = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            long j3 = ((ml1) this.d.get(i2)).e;
            float[] fArr = this.l;
            if (j == j3) {
                fArr[i2] = 1.0f;
            } else {
                fArr[i2] = j / j3;
            }
        }
    }
}
