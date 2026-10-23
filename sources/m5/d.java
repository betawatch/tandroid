package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.g3;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class d {
    public final qf.b a;
    public final g3 b;
    public final HashMap c;

    public d(Context context, g3 g3Var) {
        qf.b bVar = new qf.b(context, 29);
        this.c = new HashMap();
        this.a = bVar;
        this.b = g3Var;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory V = this.a.V(str);
        if (V == null) {
            return null;
        }
        g3 g3Var = this.b;
        e create = V.create(new b((Context) g3Var.b, (u5.a) g3Var.c, (u5.a) g3Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
