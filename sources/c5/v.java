package c5;

import java.util.ArrayList;
import org.telegram.messenger.s1;
import org.telegram.messenger.t1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(h hVar, k6.h hVar2) {
        this.a = 1;
        this.b = hVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                ((t1) ((s1) this.b).b).a((g) obj, arrayList);
                return;
            case 1:
                ((h) this.b).a((g) obj);
                return;
            case 2:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((m5.e) this.b).V(fVar);
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
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            ((q0.a) arrayList2.get(i10)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ v(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
