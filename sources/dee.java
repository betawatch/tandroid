// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class dee {
    public static yja a;

    public static final void a() {
        try {
            yja yjaVar = a;
            if (yjaVar == null) {
                yjaVar = (yja) ((t53) ((jj4) ji4.c().b(jj4.class))).o.get();
                yjaVar.getClass();
                a = yjaVar;
            }
            if (yjaVar == null) {
                ur5.e("sharedSessionRepository");
                throw null;
            }
            if (yjaVar.i) {
                if (yjaVar != null) {
                    yjaVar.a();
                } else {
                    ur5.e("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
