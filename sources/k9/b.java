package k9;

import java.io.IOException;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class b {
    public static void a(Appendable appendable, char c10) {
        try {
            appendable.append(c10);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
