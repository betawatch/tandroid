// default package

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g9d {
    public final Context a;
    public final String b;
    public final t7d c;
    public final le1 d;
    public final qed e;

    public g9d(Context context, le1 le1Var, qed qedVar) {
        String r;
        boolean isEmpty = DesugarCollections.unmodifiableList(le1Var.b).isEmpty();
        String str = le1Var.a;
        if (isEmpty) {
            r = osd.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(le1Var.b);
            if (str == null) {
                u36.j("applicationId cannot be null");
                throw null;
            }
            if (unmodifiableList == null) {
                u36.j("namespaces cannot be null");
                throw null;
            }
            r = xab.r(new xab(str, unmodifiableList));
        }
        this.c = new t7d(this);
        this.a = context.getApplicationContext();
        ite.f(r);
        this.b = r;
        this.d = le1Var;
        this.e = qedVar;
    }
}
