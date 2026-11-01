package n2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class x extends IOException {
    public final g2.n a;
    public final Uri b;
    public final Map c;
    public final long d;

    public x(g2.n nVar, Uri uri, Map map, long j10, Exception exc) {
        super(exc);
        this.a = nVar;
        this.b = uri;
        this.c = map;
        this.d = j10;
    }
}
