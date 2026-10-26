package ae;

import a8.pe;
import ce.r1;
import java.util.Iterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
