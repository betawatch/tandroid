package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
