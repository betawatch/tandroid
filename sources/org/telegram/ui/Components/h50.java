package org.telegram.ui.Components;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h50 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new up(this, 24));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.d10(this, 23));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.gl0(this, 5));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 16));
                break;
            default:
                s5.c cVar = (s5.c) this.b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.k == null && cVar.b != 0) {
                    s5.h hVar = cVar.c;
                    int[] e = u5.a.e(arrayDeque);
                    hVar.getClass();
                    b6.m.e("Must be called from the main thread.");
                    if (hVar.w()) {
                        s5.j jVar = new s5.j(hVar, e);
                        s5.h.x(jVar);
                        basePendingResult = jVar;
                    } else {
                        basePendingResult = s5.h.t();
                    }
                    cVar.k = basePendingResult;
                    basePendingResult.i(new s5.q(cVar, 1));
                    arrayDeque.clear();
                    break;
                }
                break;
        }
    }
}
