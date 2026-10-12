package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ j8(l8 l8Var, String str, int i10) {
        this.a = i10;
        this.b = l8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l8 l8Var = this.b;
                String str = this.c;
                l8Var.f = null;
                AndroidUtilities.runOnUIThread(new j8(l8Var, str, 1));
                break;
            default:
                l8 l8Var2 = this.b;
                String str2 = this.c;
                l8Var2.getClass();
                Utilities.searchQueue.postRunnable(new k8(l8Var2, str2, new ArrayList(l8Var2.n.x0)));
                break;
        }
    }
}
