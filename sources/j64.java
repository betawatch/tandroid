// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
