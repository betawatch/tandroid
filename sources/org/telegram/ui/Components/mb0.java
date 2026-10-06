package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ mb0(cc0 cc0Var, Context context, int i10) {
        this.a = i10;
        this.b = cc0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cc0 cc0Var = this.b;
                cc0Var.c0.a(false);
                AndroidUtilities.runOnUIThread(new mb0(cc0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new rg.y0(context, 43, this.b.c0.F).show();
                    break;
                }
                break;
        }
    }
}
