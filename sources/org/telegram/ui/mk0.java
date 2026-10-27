package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ mk0(nk0 nk0Var, String str, int i10) {
        this.a = i10;
        this.b = nk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nk0 nk0Var = this.b;
                String str = this.c;
                nk0Var.getClass();
                AndroidUtilities.runOnUIThread(new mk0(nk0Var, str, 1));
                break;
            default:
                nk0 nk0Var2 = this.b;
                String str2 = this.c;
                ig.a2 a2Var = nk0Var2.h;
                int i10 = nk0Var2.n.s;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new ne0(nk0Var2, str2, new ArrayList(nk0Var2.n.w), 12));
                break;
        }
    }
}
