package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.h;
import n4.y;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class d {
    public final y a;
    public final h b;
    public final HashMap c;

    public d(Context context, h hVar) {
        y yVar = new y(context);
        this.c = new HashMap();
        this.a = yVar;
        this.b = hVar;
    }

    public final synchronized f a(String str) {
        if (this.c.containsKey(str)) {
            return (f) this.c.get(str);
        }
        CctBackendFactory L = this.a.L(str);
        if (L == null) {
            return null;
        }
        h hVar = this.b;
        f create = L.create(new b((Context) hVar.b, (u5.a) hVar.c, (u5.a) hVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
