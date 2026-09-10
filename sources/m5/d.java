package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.e3;
import n4.y;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d {
    public final y a;
    public final e3 b;
    public final HashMap c;

    public d(Context context, e3 e3Var) {
        y yVar = new y((Object) context, 27);
        this.c = new HashMap();
        this.a = yVar;
        this.b = e3Var;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory j3 = this.a.j(str);
        if (j3 == null) {
            return null;
        }
        e3 e3Var = this.b;
        e create = j3.create(new b((Context) e3Var.b, (u5.a) e3Var.c, (u5.a) e3Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
