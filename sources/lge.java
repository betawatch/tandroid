// default package

import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class lge {
    public static void a(h73 h73Var) {
        if (h73Var != null) {
            try {
                h73Var.close();
            } catch (IOException unused) {
            }
        }
    }
}
