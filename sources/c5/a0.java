package c5;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                t tVar = new t(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d0) this.b).c((i) obj, tVar);
                return;
            case 1:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((n2.e) this.b).N(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.c) {
                    try {
                        a0.l lVar = o0.g.d;
                        ArrayList arrayList = (ArrayList) lVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        lVar.remove((String) this.b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((q0.a) arrayList.get(i10)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
