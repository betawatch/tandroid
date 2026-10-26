package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ sb0(hc0 hc0Var, Context context, int i10) {
        this.a = i10;
        this.b = hc0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hc0 hc0Var = this.b;
                hc0Var.c0.a(false);
                AndroidUtilities.runOnUIThread(new sb0(hc0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new tg.y0(context, 43, this.b.c0.F).show();
                    break;
                }
                break;
        }
    }
}
