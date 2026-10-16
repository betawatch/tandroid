package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
