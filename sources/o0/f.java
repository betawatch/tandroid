package o0;

import java.util.ArrayList;
import n7.qa;
import p2.r;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((qa) this.b).c1(gVar);
                return;
            case 1:
                g gVar2 = (g) obj;
                synchronized (h.c) {
                    try {
                        a0.k kVar = h.d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((q0.a) arrayList.get(i10)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
            default:
                r rVar = new r(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d) this.b).a((p2.h) obj, rVar);
                return;
        }
    }
}
