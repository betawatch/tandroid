// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dt6 {
    public final Object a;
    public final byte b;

    public dt6(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = (byte) 1;
        } else if (obj instanceof eu6) {
            this.b = (byte) 2;
        } else {
            sc8.e();
            throw null;
        }
    }
}
