// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class d74 {
    public final t1c a;
    public final int[] b;

    public d74(t1c t1cVar, int... iArr) {
        if (iArr.length == 0) {
            efd.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = t1cVar;
        this.b = iArr;
    }
}
