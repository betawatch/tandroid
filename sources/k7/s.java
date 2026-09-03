package k7;

import java.io.IOException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(Appendable appendable, char c3) {
        try {
            appendable.append(c3);
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }
}
