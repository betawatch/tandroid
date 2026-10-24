package kb;

import java.sql.Date;
import java.sql.Timestamp;
import kb.a;
import kb.b;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class f {
    public static final boolean a;
    public static final a.a b;
    public static final b.a c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        a = z10;
        if (!z10) {
            b = null;
            c = null;
            d = null;
        } else {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            b = a.b;
            c = b.b;
            d = d.b;
        }
    }
}
