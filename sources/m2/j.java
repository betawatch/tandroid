package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
