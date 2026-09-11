package di;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wp;
import org.telegram.ui.g10;
import org.telegram.ui.rl0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class p2 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.oa(this, 20));
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
                AndroidUtilities.runOnUIThread(new wp(this, 24));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new g10(this, 23));
                break;
            default:
                AndroidUtilities.runOnUIThread(new rl0(this, 5));
                break;
        }
    }
}
