package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ vb0(lc0 lc0Var, Context context, int i10) {
        this.a = i10;
        this.b = lc0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lc0 lc0Var = this.b;
                lc0Var.c0.a(false);
                AndroidUtilities.runOnUIThread(new vb0(lc0Var, this.c, 1));
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
