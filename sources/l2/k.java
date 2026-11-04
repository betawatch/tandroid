package l2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k {
    public static final k c;
    public final String a;
    public final j b;

    static {
        new k("");
        c = new k("preload");
    }

    public k(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new j() : null;
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.b;
        jVar.getClass();
        return (LogSessionId) jVar.b;
    }
}
