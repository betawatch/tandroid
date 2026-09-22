package c5;

import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                r rVar = new r(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.c0) this.b).a((h) obj, rVar);
                return;
            case 1:
                o0.g gVar = (o0.g) obj;
                if (gVar == null) {
                    gVar = new o0.g(-3);
                }
                ((m5.e) this.b).K(gVar);
                return;
            default:
                o0.g gVar2 = (o0.g) obj;
                synchronized (o0.h.c) {
                    try {
                        a0.m mVar = o0.h.d;
                        ArrayList arrayList = (ArrayList) mVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        mVar.remove((String) this.b);
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
