package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ek0(fk0 fk0Var, String str, int i10) {
        this.a = i10;
        this.b = fk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fk0 fk0Var = this.b;
                String str = this.c;
                fk0Var.getClass();
                AndroidUtilities.runOnUIThread(new ek0(fk0Var, str, 1));
                break;
            default:
                fk0 fk0Var2 = this.b;
                String str2 = this.c;
                hg.a2 a2Var = fk0Var2.h;
                int i10 = fk0Var2.n.s;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new re0(fk0Var2, str2, new ArrayList(fk0Var2.n.w), 10));
                break;
        }
    }
}
