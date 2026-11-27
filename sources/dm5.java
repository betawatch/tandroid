// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dm5 {
    public static final zj8 c = new zj8("|S||P|");
    public static final zj8 d = new zj8("|S|id");
    public static final String[] e = {"*", "FCM", "GCM", ""};
    public final av5 a;
    public final String b;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dm5(ji4 ji4Var) {
        ji4Var.a();
        this.a = new av5(ji4Var.a, "com.google.android.gms.appid");
        ji4Var.a();
        yi4 yi4Var = ji4Var.c;
        String str = yi4Var.e;
        if (str == null) {
            ji4Var.a();
            str = yi4Var.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.b = str;
    }
}
