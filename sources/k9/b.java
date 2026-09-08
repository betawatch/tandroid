package k9;

import java.io.IOException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class b {
    public static void a(Appendable appendable, char c10) {
        try {
            appendable.append(c10);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }
}
