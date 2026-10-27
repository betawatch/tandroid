package n2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class w extends IOException {
    public final g2.m a;
    public final Uri b;
    public final Map c;
    public final long d;

    public w(g2.m mVar, Uri uri, Map map, long j10, Exception exc) {
        super(exc);
        this.a = mVar;
        this.b = uri;
        this.c = map;
        this.d = j10;
    }
}
