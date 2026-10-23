package ci;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ a0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                x0 x0Var = this.b;
                ArrayList arrayList = x0Var.s;
                a0 a0Var = x0Var.E;
                if (a0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    x0Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(x0Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    w0 w0Var = (w0) arrayList.get(size);
                    ArrayList arrayList2 = w0Var.f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            v0 v0Var = (v0) obj;
                            long j10 = v0Var.g;
                            if (j10 <= 0 || currentTime - v0Var.d > u.b(w0Var.a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a4.d(x0Var, 10));
                x0Var.n.N(true);
                x0Var.u(true);
                x0Var.m();
                break;
        }
    }
}
