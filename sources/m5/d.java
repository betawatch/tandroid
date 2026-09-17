package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m2.t;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class d {
    public final pf.b a;
    public final t b;
    public final HashMap c;

    public d(Context context, t tVar) {
        pf.b bVar = new pf.b(context, 27);
        this.c = new HashMap();
        this.a = bVar;
        this.b = tVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory S = this.a.S(str);
        if (S == null) {
            return null;
        }
        t tVar = this.b;
        e create = S.create(new b((Context) tVar.b, (u5.a) tVar.c, (u5.a) tVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
