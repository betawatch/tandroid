package f7;

import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class n8 {
    public static void a(Appendable appendable, char c10) {
        try {
            appendable.append(c10);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
