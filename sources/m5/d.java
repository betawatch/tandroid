package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class d {
    public final of.b a;
    public final h b;
    public final HashMap c;

    public d(Context context, h hVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.c = new HashMap();
        this.a = bVar;
        this.b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory x10 = this.a.x(str);
        if (x10 == null) {
            return null;
        }
        h hVar = this.b;
        e create = x10.create(new b((Context) hVar.b, (u5.a) hVar.c, (u5.a) hVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
