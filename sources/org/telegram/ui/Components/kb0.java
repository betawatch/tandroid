package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ kb0(zb0 zb0Var, Context context, int i10) {
        this.a = i10;
        this.b = zb0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zb0 zb0Var = this.b;
                zb0Var.c0.a(false);
                AndroidUtilities.runOnUIThread(new kb0(zb0Var, this.c, 1));
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
