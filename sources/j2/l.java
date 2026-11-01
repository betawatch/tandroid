package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class l {
    public static final l c;
    public final String a;
    public final k b;

    static {
        new l("");
        c = new l("preload");
    }

    public l(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new k() : null;
    }

    public final synchronized LogSessionId a() {
        k kVar;
        kVar = this.b;
        kVar.getClass();
        return (LogSessionId) kVar.b;
    }
}
