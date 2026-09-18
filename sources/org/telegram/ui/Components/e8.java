package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ e8(g8 g8Var, String str, int i10) {
        this.a = i10;
        this.b = g8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g8 g8Var = this.b;
                String str = this.c;
                g8Var.f = null;
                AndroidUtilities.runOnUIThread(new e8(g8Var, str, 1));
                break;
            default:
                g8 g8Var2 = this.b;
                String str2 = this.c;
                g8Var2.getClass();
                Utilities.searchQueue.postRunnable(new f8(g8Var2, str2, new ArrayList(g8Var2.n.x0)));
                break;
        }
    }
}
