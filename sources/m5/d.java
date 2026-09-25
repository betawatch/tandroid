package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        CctBackendFactory I = this.a.I(str);
        if (I == null) {
            return null;
        }
        h hVar = this.b;
        e create = I.create(new b((Context) hVar.b, (u5.a) hVar.c, (u5.a) hVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
