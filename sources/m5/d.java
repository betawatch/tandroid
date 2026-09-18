package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.i;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        CctBackendFactory I = this.a.I(str);
        if (I == null) {
            return null;
        }
        i iVar = this.b;
        e create = I.create(new b((Context) iVar.b, (u5.a) iVar.c, (u5.a) iVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
