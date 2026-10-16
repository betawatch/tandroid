package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ zb0(pc0 pc0Var, Context context, int i10) {
        this.a = i10;
        this.b = pc0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pc0 pc0Var = this.b;
                pc0Var.c0.a(false);
                AndroidUtilities.runOnUIThread(new zb0(pc0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.b.c0.F).show();
                    break;
                }
                break;
        }
    }
}
