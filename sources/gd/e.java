package gd;

import i7.v7;
import java.util.Iterator;
import jd.q1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // gd.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                c cVar = new c();
                cVar.c = v7.a(q1Var, cVar, cVar);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new hd.b((String) this.b);
        }
    }
}
