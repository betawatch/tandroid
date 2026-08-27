package lh;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lp;
import org.telegram.ui.r00;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class h2 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh.c(this, 11));
                break;
            case 1:
                o5.c cVar = (o5.c) this.b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.k == null && cVar.b != 0) {
                    o5.h hVar = cVar.c;
                    int[] e9 = r5.a.e(arrayDeque);
                    hVar.getClass();
                    y5.l.e("Must be called from the main thread.");
                    if (hVar.w()) {
                        o5.j jVar = new o5.j(hVar, e9);
                        o5.h.x(jVar);
                        basePendingResult = jVar;
                    } else {
                        basePendingResult = o5.h.t();
                    }
                    cVar.k = basePendingResult;
                    basePendingResult.i(new o5.p(cVar, 1));
                    arrayDeque.clear();
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new lp(this, 24));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new r00(this, 23));
                break;
            default:
                AndroidUtilities.runOnUIThread(new zk0(this, 5));
                break;
        }
    }
}
