package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ i8(k8 k8Var, String str, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8 k8Var = this.b;
                String str = this.c;
                k8Var.f = null;
                AndroidUtilities.runOnUIThread(new i8(k8Var, str, 1));
                break;
            default:
                k8 k8Var2 = this.b;
                String str2 = this.c;
                k8Var2.getClass();
                Utilities.searchQueue.postRunnable(new j8(k8Var2, str2, new ArrayList(k8Var2.n.x0)));
                break;
        }
    }
}
