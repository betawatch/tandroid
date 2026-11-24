// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bp3 extends fk1 {
    public float[] l;

    @Override // fk1
    public final void e() {
        super.e();
        int size = this.d.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            long j2 = ((ek1) this.d.get(i)).e;
            if (j2 > j) {
                j = j2;
            }
        }
        this.l = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            long j3 = ((ek1) this.d.get(i2)).e;
            float[] fArr = this.l;
            if (j == j3) {
                fArr[i2] = 1.0f;
            } else {
                fArr[i2] = j / j3;
            }
        }
    }
}
