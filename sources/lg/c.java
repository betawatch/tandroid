package lg;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c extends b {
    public float[] l;

    @Override // lg.b
    public final void e() {
        super.e();
        int size = this.d.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long j11 = ((a) this.d.get(i10)).e;
            if (j11 > j10) {
                j10 = j11;
            }
        }
        this.l = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            if (j10 == ((a) this.d.get(i11)).e) {
                this.l[i11] = 1.0f;
            } else {
                this.l[i11] = j10 / r4;
            }
        }
    }
}
