package ai;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ n0(o1 o1Var, int i10) {
        this.a = i10;
        this.b = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                o1 o1Var = this.b;
                ArrayList arrayList = o1Var.s;
                n0 n0Var = o1Var.E;
                if (n0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    o1Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(o1Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    n1 n1Var = (n1) arrayList.get(size);
                    ArrayList arrayList2 = n1Var.f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            m1 m1Var = (m1) obj;
                            long j3 = m1Var.g;
                            if (j3 <= 0 || currentTime - m1Var.d > g0.b(n1Var.a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a4.e(o1Var, 2));
                o1Var.n.N(true);
                o1Var.u(true);
                o1Var.m();
                break;
        }
    }
}
