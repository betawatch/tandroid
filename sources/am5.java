// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class am5 {
    public static final ni8 c = new ni8("|S||P|");
    public static final ni8 d = new ni8("|S|id");
    public static final String[] e = {"*", "FCM", "GCM", ""};
    public final wu5 a;
    public final String b;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public am5(li4 li4Var) {
        li4Var.a();
        this.a = new wu5(li4Var.a, "com.google.android.gms.appid");
        li4Var.a();
        zi4 zi4Var = li4Var.c;
        String str = zi4Var.e;
        if (str == null) {
            li4Var.a();
            str = zi4Var.b;
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
