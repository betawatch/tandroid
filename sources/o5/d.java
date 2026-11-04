package o5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import k4.j;
import mi.h0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public final h0 a;
    public final j b;
    public final HashMap c;

    public d(Context context, j jVar) {
        h0 h0Var = new h0(context, 3);
        this.c = new HashMap();
        this.a = h0Var;
        this.b = jVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory B = this.a.B(str);
        if (B == null) {
            return null;
        }
        j jVar = this.b;
        e create = B.create(new b((Context) jVar.a, (w5.a) jVar.b, (w5.a) jVar.c, str));
        this.c.put(str, create);
        return create;
    }
}
