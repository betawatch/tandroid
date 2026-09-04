package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
