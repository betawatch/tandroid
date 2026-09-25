package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ jk0(kk0 kk0Var, String str, int i10) {
        this.a = i10;
        this.b = kk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kk0 kk0Var = this.b;
                String str = this.c;
                kk0Var.getClass();
                AndroidUtilities.runOnUIThread(new jk0(kk0Var, str, 1));
                break;
            default:
                kk0 kk0Var2 = this.b;
                String str2 = this.c;
                gg.c2 c2Var = kk0Var2.h;
                int i10 = kk0Var2.n.s;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new jf0(kk0Var2, str2, new ArrayList(kk0Var2.n.w), 8));
                break;
        }
    }
}
