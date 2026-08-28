package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ak0(bk0 bk0Var, String str, int i9) {
        this.a = i9;
        this.b = bk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bk0 bk0Var = this.b;
                String str = this.c;
                bk0Var.getClass();
                AndroidUtilities.runOnUIThread(new ak0(bk0Var, str, 1));
                break;
            default:
                bk0 bk0Var2 = this.b;
                String str2 = this.c;
                of.v1 v1Var = bk0Var2.h;
                int i9 = bk0Var2.n.s;
                v1Var.g(str2, true, (i9 == 1 || i9 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new ye0(bk0Var2, str2, new ArrayList(bk0Var2.n.w), 8));
                break;
        }
    }
}
