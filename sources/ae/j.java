package ae;

import a8.pe;
import ce.r1;
import java.util.Iterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j implements zd.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // zd.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new b((String) this.b);
            case 1:
                r1 r1Var = (r1) this.b;
                zd.c cVar = new zd.c();
                cVar.c = pe.a(cVar, cVar, r1Var);
                return cVar;
            default:
                return (Iterator) this.b;
        }
    }
}
