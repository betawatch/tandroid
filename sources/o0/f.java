package o0;

import java.util.ArrayList;
import n7.qa;
import org.telegram.messenger.d0;
import p2.q;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ((qa) this.b).Y0(gVar);
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
                q qVar = new q(new ArrayList(), new ArrayList());
                ((d0) this.b).a((p2.h) obj, qVar);
                return;
        }
    }
}
