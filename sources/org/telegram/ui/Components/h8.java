package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ h8(j8 j8Var, String str, int i10) {
        this.a = i10;
        this.b = j8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j8 j8Var = this.b;
                String str = this.c;
                j8Var.f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                break;
            default:
                j8 j8Var2 = this.b;
                String str2 = this.c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.n.x0)));
                break;
        }
    }
}
