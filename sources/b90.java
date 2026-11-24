// default package

import java.io.File;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b90 {
    public final a90 a;
    public final String b;
    public final File c;

    public b90(a90 a90Var, String str, File file) {
        this.a = a90Var;
        if (str == null) {
            gxc.d("Null sessionId");
            throw null;
        }
        this.b = str;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b90)) {
            return false;
        }
        b90 b90Var = (b90) obj;
        return this.a.equals(b90Var.a) && this.b.equals(b90Var.b) && this.c.equals(b90Var.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
