package id;

import java.util.Iterator;
import k7.h8;
import ld.q1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // id.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                c cVar = new c();
                cVar.c = h8.a(q1Var, cVar, cVar);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new jd.b((String) this.b);
        }
    }
}
