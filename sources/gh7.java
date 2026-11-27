// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class gh7 {
    public float a;
    public float[] b;
    public int[] c;
    public boolean d;
    public int[] e;
    public float f;

    public final String toString() {
        return (this.d ? "columns " : "rows ") + Arrays.toString(this.e) + " aspect=" + this.a + " cost=" + this.f + " order=" + Arrays.toString(this.c);
    }
}
