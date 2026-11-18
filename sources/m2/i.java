package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
