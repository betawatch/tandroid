package ei;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ a0(w0 w0Var, int i3) {
        this.a = i3;
        this.b = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                w0 w0Var = this.b;
                ArrayList arrayList = w0Var.s;
                a0 a0Var = w0Var.F;
                if (a0Var != null) {
                    org.telegram.messenger.g0.r(a0Var);
                    w0Var.F = null;
                }
                int currentTime = ConnectionsManager.getInstance(w0Var.O).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    v0 v0Var = (v0) arrayList.get(size);
                    ArrayList arrayList2 = v0Var.f;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            Object obj = arrayList2.get(i3);
                            i3++;
                            u0 u0Var = (u0) obj;
                            long j10 = u0Var.g;
                            if (j10 <= 0 || currentTime - u0Var.d > u.b(v0Var.a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a3.u(w0Var, 10));
                w0Var.n.O(true);
                w0Var.u(true);
                w0Var.m();
                break;
        }
    }
}
