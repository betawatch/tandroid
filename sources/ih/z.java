package ih;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ z(w0 w0Var, int i9) {
        this.a = i9;
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
                z zVar = w0Var.A;
                if (zVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(zVar);
                    w0Var.A = null;
                }
                int currentTime = ConnectionsManager.getInstance(w0Var.J).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    v0 v0Var = (v0) arrayList.get(size);
                    ArrayList arrayList2 = v0Var.f;
                    int size2 = arrayList2.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 < size2) {
                            Object obj = arrayList2.get(i9);
                            i9++;
                            u0 u0Var = (u0) obj;
                            long j10 = u0Var.g;
                            if (j10 <= 0 || currentTime - u0Var.d > u.b(v0Var.a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a5.e(w0Var, 23));
                w0Var.n.N(true);
                w0Var.u(true);
                w0Var.m();
                break;
        }
    }
}
