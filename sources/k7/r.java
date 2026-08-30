package k7;

import java.io.IOException;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class r {
    public static void a(Appendable appendable, char c3) {
        try {
            appendable.append(c3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
