package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
