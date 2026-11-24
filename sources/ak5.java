// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ak5 {
    public static final lg8 c = new lg8("|S||P|");
    public static final lg8 d = new lg8("|S|id");
    public static final String[] e = {"*", "FCM", "GCM", ""};
    public final xs5 a;
    public final String b;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ak5(jg4 jg4Var) {
        jg4Var.a();
        this.a = new xs5(jg4Var.a, "com.google.android.gms.appid");
        jg4Var.a();
        xg4 xg4Var = jg4Var.c;
        String str = xg4Var.e;
        if (str == null) {
            jg4Var.a();
            str = xg4Var.b;
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
