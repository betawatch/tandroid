package oh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ x(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                v0 v0Var = this.b;
                ArrayList arrayList = v0Var.s;
                x xVar = v0Var.B;
                if (xVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(xVar);
                    v0Var.B = null;
                }
                int currentTime = ConnectionsManager.getInstance(v0Var.K).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    u0 u0Var = (u0) arrayList.get(size);
                    ArrayList arrayList2 = u0Var.f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            t0 t0Var = (t0) obj;
                            long j10 = t0Var.g;
                            if (j10 <= 0 || currentTime - t0Var.d > s.b(u0Var.a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new e5.f(v0Var, 27));
                v0Var.n.N(true);
                v0Var.u(true);
                v0Var.m();
                break;
        }
    }
}
