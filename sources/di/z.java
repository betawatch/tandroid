package di;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ z(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                u0 u0Var = this.b;
                ArrayList arrayList = u0Var.s;
                z zVar = u0Var.E;
                if (zVar != null) {
                    org.telegram.messenger.g0.r(zVar);
                    u0Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(u0Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    t0 t0Var = (t0) arrayList.get(size);
                    ArrayList arrayList2 = t0Var.f;
                    int size2 = arrayList2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            s0 s0Var = (s0) obj;
                            long j3 = s0Var.g;
                            if (j3 <= 0 || currentTime - s0Var.d > t.b(t0Var.a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a3.c(u0Var, 20));
                u0Var.n.O(true);
                u0Var.u(true);
                u0Var.m();
                break;
        }
    }
}
