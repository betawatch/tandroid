package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
