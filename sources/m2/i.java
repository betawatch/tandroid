package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class i {
    public static final i c;
    public final String a;
    public final h b;

    static {
        new i("");
        c = new i("preload");
    }

    public i(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new h() : null;
    }

    public final synchronized LogSessionId a() {
        h hVar;
        hVar = this.b;
        hVar.getClass();
        return (LogSessionId) hVar.b;
    }
}
