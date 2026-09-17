package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m2.t;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
