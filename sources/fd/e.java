package fd;

import h7.h7;
import id.r1;
import java.util.Iterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // fd.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                r1 r1Var = (r1) this.b;
                c cVar = new c();
                cVar.c = h7.a(r1Var, cVar, cVar);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new gd.b((String) this.b);
        }
    }
}
