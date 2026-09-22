package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.h;
import n4.y;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class d {
    public final y a;
    public final h b;
    public final HashMap c;

    public d(Context context, h hVar) {
        y yVar = new y(context);
        this.c = new HashMap();
        this.a = yVar;
        this.b = hVar;
    }

    public final synchronized f a(String str) {
        if (this.c.containsKey(str)) {
            return (f) this.c.get(str);
        }
        CctBackendFactory L = this.a.L(str);
        if (L == null) {
            return null;
        }
        h hVar = this.b;
        f create = L.create(new b((Context) hVar.b, (u5.a) hVar.c, (u5.a) hVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
