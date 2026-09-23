package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.i;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
