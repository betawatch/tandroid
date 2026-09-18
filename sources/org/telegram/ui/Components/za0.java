package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
