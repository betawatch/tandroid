package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
