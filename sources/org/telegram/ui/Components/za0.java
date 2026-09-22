package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class za0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ za0(pb0 pb0Var, Context context, int i10) {
        this.a = i10;
        this.b = pb0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pb0 pb0Var = this.b;
                pb0Var.c0.a(false);
                AndroidUtilities.runOnUIThread(new za0(pb0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.x0(context, 43, this.b.c0.F).show();
                    break;
                }
                break;
        }
    }
}
