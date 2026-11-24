// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j64 {
    public final sxb a;
    public final int[] b;

    public j64(sxb sxbVar, int... iArr) {
        if (iArr.length == 0) {
            lad.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = sxbVar;
        this.b = iArr;
    }
}
