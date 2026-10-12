package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import li.k;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d {
    public final m4.c a;
    public final k b;
    public final HashMap c;

    public d(Context context, k kVar) {
        m4.c cVar = new m4.c(context, 1);
        this.c = new HashMap();
        this.a = cVar;
        this.b = kVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory D = this.a.D(str);
        if (D == null) {
            return null;
        }
        k kVar = this.b;
        e create = D.create(new b((Context) kVar.b, (u5.a) kVar.c, (u5.a) kVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
