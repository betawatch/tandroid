package kh;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.np;
import org.telegram.ui.o00;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j2 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f1(this, 4));
                break;
            case 1:
                o5.c cVar = (o5.c) this.b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.k == null && cVar.b != 0) {
                    o5.h hVar = cVar.c;
                    int[] e10 = q5.a.e(arrayDeque);
                    hVar.getClass();
                    x5.l.e("Must be called from the main thread.");
                    if (hVar.w()) {
                        o5.j jVar = new o5.j(hVar, e10);
                        o5.h.x(jVar);
                        basePendingResult = jVar;
                    } else {
                        basePendingResult = o5.h.t();
                    }
                    cVar.k = basePendingResult;
                    basePendingResult.i(new o5.q(cVar, 1));
                    arrayDeque.clear();
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new np(this, 24));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new o00(this, 23));
                break;
            default:
                AndroidUtilities.runOnUIThread(new zk0(this, 5));
                break;
        }
    }
}
