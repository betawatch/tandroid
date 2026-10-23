package n2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
