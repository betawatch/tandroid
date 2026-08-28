package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ z7(b8 b8Var, String str, int i9) {
        this.a = i9;
        this.b = b8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b8 b8Var = this.b;
                String str = this.c;
                b8Var.f = null;
                AndroidUtilities.runOnUIThread(new z7(b8Var, str, 1));
                break;
            default:
                b8 b8Var2 = this.b;
                String str2 = this.c;
                b8Var2.getClass();
                Utilities.searchQueue.postRunnable(new a8(b8Var2, str2, new ArrayList(b8Var2.n.t0)));
                break;
        }
    }
}
