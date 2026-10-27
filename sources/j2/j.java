package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
