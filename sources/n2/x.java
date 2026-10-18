package n2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
