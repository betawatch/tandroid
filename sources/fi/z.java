package fi;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ z(t0 t0Var, int i7) {
        this.a = i7;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                t0 t0Var = this.b;
                ArrayList arrayList = t0Var.s;
                z zVar = t0Var.F;
                if (zVar != null) {
                    org.telegram.messenger.g0.r(zVar);
                    t0Var.F = null;
                }
                int currentTime = ConnectionsManager.getInstance(t0Var.O).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    s0 s0Var = (s0) arrayList.get(size);
                    ArrayList arrayList2 = s0Var.f;
                    int size2 = arrayList2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            r0 r0Var = (r0) obj;
                            long j3 = r0Var.g;
                            if (j3 <= 0 || currentTime - r0Var.d > t.b(s0Var.a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a3.c(t0Var, 20));
                t0Var.n.O(true);
                t0Var.u(true);
                t0Var.m();
                break;
        }
    }
}
