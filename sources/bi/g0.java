package bi;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ g0(g1 g1Var, int i10) {
        this.a = i10;
        this.b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                g1 g1Var = this.b;
                ArrayList arrayList = g1Var.s;
                g0 g0Var = g1Var.E;
                if (g0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(g0Var);
                    g1Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(g1Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    f1 f1Var = (f1) arrayList.get(size);
                    ArrayList arrayList2 = f1Var.f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            e1 e1Var = (e1) obj;
                            long j3 = e1Var.g;
                            if (j3 <= 0 || currentTime - e1Var.d > z.b(f1Var.a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a4.e(g1Var, 6));
                g1Var.n.N(true);
                g1Var.u(true);
                g1Var.m();
                break;
        }
    }
}
