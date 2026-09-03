package k7;

import java.io.IOException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
