package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ d8(f8 f8Var, String str, int i10) {
        this.a = i10;
        this.b = f8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f8 f8Var = this.b;
                String str = this.c;
                f8Var.f = null;
                AndroidUtilities.runOnUIThread(new d8(f8Var, str, 1));
                break;
            default:
                f8 f8Var2 = this.b;
                String str2 = this.c;
                f8Var2.getClass();
                Utilities.searchQueue.postRunnable(new e8(f8Var2, str2, new ArrayList(f8Var2.n.t0)));
                break;
        }
    }
}
