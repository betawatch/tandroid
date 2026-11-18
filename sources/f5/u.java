package f5;

import java.util.ArrayList;
import org.telegram.messenger.j1;
import org.telegram.messenger.q1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(g gVar, h hVar) {
        this.a = 1;
        this.b = hVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                ((q1) ((j1) this.b).b).a((f) obj, arrayList);
                return;
            case 1:
                ((h) this.b).a((f) obj);
                return;
            case 2:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((k8.a) this.b).P0(fVar);
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

    public /* synthetic */ u(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
