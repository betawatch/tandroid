package n2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class x extends IOException {
    public final g2.m a;
    public final Uri b;
    public final Map c;
    public final long d;

    public x(g2.m mVar, Uri uri, Map map, long j10, Exception exc) {
        super(exc);
        this.a = mVar;
        this.b = uri;
        this.c = map;
        this.d = j10;
    }
}
