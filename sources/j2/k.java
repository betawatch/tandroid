package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k {
    public final String a;
    public final j b;
    public final Object c;

    static {
        new k("");
    }

    public k(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new j() : null;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.b;
        jVar.getClass();
        return (LogSessionId) jVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.a, kVar.a) && Objects.equals(this.b, kVar.b) && Objects.equals(this.c, kVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
