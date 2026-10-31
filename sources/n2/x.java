package n2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
