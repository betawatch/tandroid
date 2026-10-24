package n2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
