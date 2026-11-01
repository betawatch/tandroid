package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import li.k;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class d {
    public final m4.c a;
    public final k b;
    public final HashMap c;

    public d(Context context, k kVar) {
        m4.c cVar = new m4.c(context);
        this.c = new HashMap();
        this.a = cVar;
        this.b = kVar;
    }

    public final synchronized f a(String str) {
        if (this.c.containsKey(str)) {
            return (f) this.c.get(str);
        }
        CctBackendFactory E = this.a.E(str);
        if (E == null) {
            return null;
        }
        k kVar = this.b;
        f create = E.create(new b((Context) kVar.b, (u5.a) kVar.c, (u5.a) kVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
