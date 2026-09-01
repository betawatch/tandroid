package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ik0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ hk0(ik0 ik0Var, String str, int i10) {
        this.a = i10;
        this.b = ik0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ik0 ik0Var = this.b;
                String str = this.c;
                ik0Var.getClass();
                AndroidUtilities.runOnUIThread(new hk0(ik0Var, str, 1));
                break;
            default:
                ik0 ik0Var2 = this.b;
                String str2 = this.c;
                uf.k1 k1Var = ik0Var2.h;
                int i10 = ik0Var2.n.s;
                k1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new if0(ik0Var2, str2, new ArrayList(ik0Var2.n.w), 8));
                break;
        }
    }
}
