// default package

import android.net.Uri;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oq6 {
    public static final String b;
    public final Uri a;

    static {
        String str = g8c.a;
        b = "0";
    }

    public oq6(z24 z24Var) {
        this.a = (Uri) z24Var.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof oq6) && this.a.equals(((oq6) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
