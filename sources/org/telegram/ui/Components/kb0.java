package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
