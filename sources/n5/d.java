package n5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
