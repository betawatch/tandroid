// default package

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ig8 {
    public static final ig8 c;
    public final String a;
    public final hg8 b;

    static {
        new ig8("");
        c = new ig8("preload");
    }

    public ig8(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new hg8() : null;
    }

    public final synchronized LogSessionId a() {
        hg8 hg8Var;
        hg8Var = this.b;
        hg8Var.getClass();
        return hg8Var.a;
    }
}
