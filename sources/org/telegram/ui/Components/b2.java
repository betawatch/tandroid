package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;

    public /* synthetic */ b2(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.a = i10;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.dismiss();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.b.dismiss();
                break;
        }
    }
}
