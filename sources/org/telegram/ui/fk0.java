package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ fk0(gk0 gk0Var, String str, int i10) {
        this.a = i10;
        this.b = gk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gk0 gk0Var = this.b;
                String str = this.c;
                gk0Var.getClass();
                AndroidUtilities.runOnUIThread(new fk0(gk0Var, str, 1));
                break;
            default:
                gk0 gk0Var2 = this.b;
                String str2 = this.c;
                tf.k1 k1Var = gk0Var2.h;
                int i10 = gk0Var2.n.s;
                k1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new hf0(gk0Var2, str2, new ArrayList(gk0Var2.n.w), 8));
                break;
        }
    }
}
