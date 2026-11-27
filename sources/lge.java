// default package

import java.io.IOException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
