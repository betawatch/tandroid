package ci;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aq;
import org.telegram.ui.g10;
import org.telegram.ui.nl0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class o2 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 14));
                break;
            case 1:
                e6.c cVar = (e6.c) this.b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.k == null && cVar.b != 0) {
                    e6.h hVar = cVar.c;
                    int[] e7 = g6.a.e(arrayDeque);
                    hVar.getClass();
                    n6.l.e("Must be called from the main thread.");
                    if (hVar.w()) {
                        e6.k kVar = new e6.k(hVar, e7);
                        e6.h.x(kVar);
                        basePendingResult = kVar;
                    } else {
                        basePendingResult = e6.h.t();
                    }
                    cVar.k = basePendingResult;
                    basePendingResult.i(new e6.r(cVar, 1));
                    arrayDeque.clear();
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new aq(this, 24));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new g10(this, 23));
                break;
            default:
                AndroidUtilities.runOnUIThread(new nl0(this, 5));
                break;
        }
    }
}
