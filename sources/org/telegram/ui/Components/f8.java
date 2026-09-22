package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ f8(h8 h8Var, String str, int i10) {
        this.a = i10;
        this.b = h8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h8 h8Var = this.b;
                String str = this.c;
                h8Var.f = null;
                AndroidUtilities.runOnUIThread(new f8(h8Var, str, 1));
                break;
            default:
                h8 h8Var2 = this.b;
                String str2 = this.c;
                h8Var2.getClass();
                Utilities.searchQueue.postRunnable(new g8(h8Var2, str2, new ArrayList(h8Var2.n.x0)));
                break;
        }
    }
}
