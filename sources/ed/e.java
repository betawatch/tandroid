package ed;

import g7.g7;
import hd.r1;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // ed.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                r1 r1Var = (r1) this.b;
                c cVar = new c();
                cVar.c = g7.a(cVar, cVar, r1Var);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new fd.b((String) this.b);
        }
    }
}
