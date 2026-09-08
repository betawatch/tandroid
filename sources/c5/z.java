package c5;

import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                s sVar = new s(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.c0) this.b).a((h) obj, sVar);
                return;
            case 1:
                o0.g gVar = (o0.g) obj;
                if (gVar == null) {
                    gVar = new o0.g(-3);
                }
                ((o0.a) this.b).H(gVar);
                return;
            default:
                o0.g gVar2 = (o0.g) obj;
                synchronized (o0.h.c) {
                    try {
                        a0.l lVar = o0.h.d;
                        ArrayList arrayList = (ArrayList) lVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        lVar.remove((String) this.b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((q0.a) arrayList.get(i10)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
