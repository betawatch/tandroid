// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
