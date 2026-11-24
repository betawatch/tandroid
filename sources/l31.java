// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class l31 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l31(String str, k31 k31Var) {
        super(r2.toString());
        StringBuilder k = b00.k(str, ", frames: ");
        k.append(k31Var.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l31(String str, k31 k31Var, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder k = b00.k(str, ", frames: ");
        k.append(k31Var.a());
    }
}
