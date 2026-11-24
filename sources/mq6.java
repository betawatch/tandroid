// default package

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mq6 extends IOException {
    public final u63 a;
    public final Uri b;
    public final Map c;
    public final long d;

    public mq6(u63 u63Var, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.a = u63Var;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
