// default package

import android.net.Uri;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
