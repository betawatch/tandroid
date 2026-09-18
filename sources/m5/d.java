package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.i;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class d {
    public final of.b a;
    public final i b;
    public final HashMap c;

    public d(Context context, i iVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.c = new HashMap();
        this.a = bVar;
        this.b = iVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory J = this.a.J(str);
        if (J == null) {
            return null;
        }
        i iVar = this.b;
        e create = J.create(new b((Context) iVar.b, (u5.a) iVar.c, (u5.a) iVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
