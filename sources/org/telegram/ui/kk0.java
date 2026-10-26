package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ kk0(lk0 lk0Var, String str, int i10) {
        this.a = i10;
        this.b = lk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lk0 lk0Var = this.b;
                String str = this.c;
                lk0Var.getClass();
                AndroidUtilities.runOnUIThread(new kk0(lk0Var, str, 1));
                break;
            default:
                lk0 lk0Var2 = this.b;
                String str2 = this.c;
                ig.a2 a2Var = lk0Var2.h;
                int i10 = lk0Var2.n.s;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new oe0(lk0Var2, str2, new ArrayList(lk0Var2.n.w), 11));
                break;
        }
    }
}
