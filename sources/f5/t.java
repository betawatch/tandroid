package f5;

import aa.c0;
import java.util.ArrayList;
import m4.d0;
import org.telegram.messenger.p1;
import org.telegram.messenger.q1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(c0 c0Var, g gVar) {
        this.a = 1;
        this.b = gVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                ((q1) ((p1) this.b).b).a((f) obj, arrayList);
                return;
            case 1:
                ((g) this.b).a((f) obj);
                return;
            case 2:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((d0) this.b).l0(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.c) {
                    try {
                        a0.l lVar = o0.g.d;
                        ArrayList arrayList2 = (ArrayList) lVar.get((String) this.b);
                        if (arrayList2 == null) {
                            return;
                        }
                        lVar.remove((String) this.b);
                        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                            ((q0.a) arrayList2.get(i7)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ t(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
