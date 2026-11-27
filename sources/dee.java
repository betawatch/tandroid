// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
