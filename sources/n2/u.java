package n2;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                q qVar = new q(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d) this.b).a((g) obj, qVar);
                return;
            case 1:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((g5.b) this.b).s(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.c) {
                    try {
                        a0.k kVar = o0.g.d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.b);
                        for (int i9 = 0; i9 < arrayList.size(); i9++) {
                            ((q0.a) arrayList.get(i9)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
