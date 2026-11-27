// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class fh7 {
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
