package nh;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rp;
import org.telegram.ui.q00;
import org.telegram.ui.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g2 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lh.m5(this, 25));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new rp(this, 24));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new q00(this, 23));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new vk0(this, 5));
                break;
            default:
                q5.c cVar = (q5.c) this.b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.k == null && cVar.b != 0) {
                    q5.h hVar = cVar.c;
                    int[] e10 = s5.a.e(arrayDeque);
                    hVar.getClass();
                    z5.l.e("Must be called from the main thread.");
                    if (hVar.w()) {
                        q5.j jVar = new q5.j(hVar, e10);
                        q5.h.x(jVar);
                        basePendingResult = jVar;
                    } else {
                        basePendingResult = q5.h.t();
                    }
                    cVar.k = basePendingResult;
                    basePendingResult.i(new q5.p(cVar, 1));
                    arrayDeque.clear();
                    break;
                }
                break;
        }
    }
}
