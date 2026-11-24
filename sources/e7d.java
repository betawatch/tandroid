// default package

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class e7d {
    public final Context a;
    public final String b;
    public final r5d c;
    public final dd1 d;
    public final ocd e;

    public e7d(Context context, dd1 dd1Var, ocd ocdVar) {
        String r;
        boolean isEmpty = DesugarCollections.unmodifiableList(dd1Var.b).isEmpty();
        String str = dd1Var.a;
        if (isEmpty) {
            r = lqd.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(dd1Var.b);
            if (str == null) {
                w26.j("applicationId cannot be null");
                throw null;
            }
            if (unmodifiableList == null) {
                w26.j("namespaces cannot be null");
                throw null;
            }
            r = v8b.r(new v8b(str, unmodifiableList));
        }
        this.c = new r5d(this);
        this.a = context.getApplicationContext();
        fre.f(r);
        this.b = r;
        this.d = dd1Var;
        this.e = ocdVar;
    }
}
