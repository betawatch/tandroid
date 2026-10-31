package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
