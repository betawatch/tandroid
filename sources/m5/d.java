package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
import n4.x;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d {
    public final x a;
    public final h b;
    public final HashMap c;

    public d(Context context, h hVar) {
        x xVar = new x(context, 25);
        this.c = new HashMap();
        this.a = xVar;
        this.b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory R = this.a.R(str);
        if (R == null) {
            return null;
        }
        h hVar = this.b;
        e create = R.create(new b((Context) hVar.b, (u5.a) hVar.c, (u5.a) hVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
