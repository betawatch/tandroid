package e5;

import java.util.ArrayList;
import mi.h0;
import org.telegram.messenger.p1;
import org.telegram.messenger.q1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(com.google.android.gms.internal.clearcut.e eVar, g gVar) {
        this.a = 1;
        this.b = gVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                ((q1) ((p1) this.b).b).k((f) obj, arrayList);
                return;
            case 1:
                ((g) this.b).a((f) obj);
                return;
            case 2:
                o0.g gVar = (o0.g) obj;
                if (gVar == null) {
                    gVar = new o0.g(-3);
                }
                ((h0) this.b).U(gVar);
                return;
            default:
                o0.g gVar2 = (o0.g) obj;
                synchronized (o0.h.c) {
                    try {
                        a0.l lVar = o0.h.d;
                        ArrayList arrayList2 = (ArrayList) lVar.get((String) this.b);
                        if (arrayList2 == null) {
                            return;
                        }
                        lVar.remove((String) this.b);
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((q0.a) arrayList2.get(i3)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ t(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }
}
