package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class nk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ok0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ nk0(ok0 ok0Var, String str, int i10) {
        this.a = i10;
        this.b = ok0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ok0 ok0Var = this.b;
                String str = this.c;
                ok0Var.getClass();
                AndroidUtilities.runOnUIThread(new nk0(ok0Var, str, 1));
                break;
            default:
                ok0 ok0Var2 = this.b;
                String str2 = this.c;
                gg.c2 c2Var = ok0Var2.h;
                int i10 = ok0Var2.n.s;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new nf0(ok0Var2, str2, new ArrayList(ok0Var2.n.w), 8));
                break;
        }
    }
}
