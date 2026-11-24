// default package

import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class lmd {
    public static void a(Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            sdb.b(e);
        }
    }
}
