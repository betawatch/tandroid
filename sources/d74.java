// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
