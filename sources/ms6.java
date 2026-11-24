// default package

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ms6 extends IOException {
    public final g83 a;
    public final Uri b;
    public final Map c;
    public final long d;

    public ms6(g83 g83Var, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.a = g83Var;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
