package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.g3;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        CctBackendFactory U = this.a.U(str);
        if (U == null) {
            return null;
        }
        g3 g3Var = this.b;
        e create = U.create(new b((Context) g3Var.b, (u5.a) g3Var.c, (u5.a) g3Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
