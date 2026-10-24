package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class j {
    public static final j c;
    public final String a;
    public final i b;

    static {
        new j("");
        c = new j("preload");
    }

    public j(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new i() : null;
    }

    public final synchronized LogSessionId a() {
        i iVar;
        iVar = this.b;
        iVar.getClass();
        return (LogSessionId) iVar.b;
    }
}
