package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ pk0(qk0 qk0Var, String str, int i10) {
        this.a = i10;
        this.b = qk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qk0 qk0Var = this.b;
                String str = this.c;
                qk0Var.getClass();
                AndroidUtilities.runOnUIThread(new pk0(qk0Var, str, 1));
                break;
            default:
                qk0 qk0Var2 = this.b;
                String str2 = this.c;
                gg.c2 c2Var = qk0Var2.h;
                int i10 = qk0Var2.n.s;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new pf0(qk0Var2, str2, new ArrayList(qk0Var2.n.w), 8));
                break;
        }
    }
}
