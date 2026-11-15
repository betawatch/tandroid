package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
