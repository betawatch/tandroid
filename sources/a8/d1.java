package a8;

import java.io.IOException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class d1 {
    public static void a(Appendable appendable, char c10) {
        try {
            appendable.append(c10);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
