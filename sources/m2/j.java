package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
