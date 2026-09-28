package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ mb0(bc0 bc0Var, Context context, int i10) {
        this.a = i10;
        this.b = bc0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bc0 bc0Var = this.b;
                bc0Var.c0.a(false);
                AndroidUtilities.runOnUIThread(new mb0(bc0Var, this.c, 1));
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
