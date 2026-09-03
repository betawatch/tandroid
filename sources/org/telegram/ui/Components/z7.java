package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ z7(b8 b8Var, String str, int i10) {
        this.a = i10;
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
                Utilities.searchQueue.postRunnable(new a8(b8Var2, str2, new ArrayList(b8Var2.n.u0)));
                break;
        }
    }
}
