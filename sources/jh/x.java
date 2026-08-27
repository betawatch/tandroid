package jh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ x(u0 u0Var, int i10) {
        this.a = i10;
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
                x xVar = u0Var.A;
                if (xVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(xVar);
                    u0Var.A = null;
                }
                int currentTime = ConnectionsManager.getInstance(u0Var.J).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    t0 t0Var = (t0) arrayList.get(size);
                    ArrayList arrayList2 = t0Var.f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            s0 s0Var = (s0) obj;
                            long j10 = s0Var.g;
                            if (j10 <= 0 || currentTime - s0Var.d > s.b(t0Var.a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a5.f(u0Var, 24));
                u0Var.n.N(true);
                u0Var.u(true);
                u0Var.m();
                break;
        }
    }
}
