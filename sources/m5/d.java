package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.h3;
import n4.s;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class d {
    public final s a;
    public final h3 b;
    public final HashMap c;

    public d(Context context, h3 h3Var) {
        s sVar = new s(context, 28);
        this.c = new HashMap();
        this.a = sVar;
        this.b = h3Var;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory l4 = this.a.l(str);
        if (l4 == null) {
            return null;
        }
        h3 h3Var = this.b;
        e create = l4.create(new b((Context) h3Var.b, (u5.a) h3Var.c, (u5.a) h3Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
