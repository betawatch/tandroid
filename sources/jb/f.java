package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
