package n5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d {
    public final m4.c a;
    public final k6.c b;
    public final HashMap c;

    public d(Context context, k6.c cVar) {
        m4.c cVar2 = new m4.c(context, 3);
        this.c = new HashMap();
        this.a = cVar2;
        this.b = cVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory G = this.a.G(str);
        if (G == null) {
            return null;
        }
        k6.c cVar = this.b;
        e create = G.create(new b((Context) cVar.b, (v5.a) cVar.c, (v5.a) cVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
