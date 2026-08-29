package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ wa0(lb0 lb0Var, Context context, int i10) {
        this.a = i10;
        this.b = lb0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lb0 lb0Var = this.b;
                lb0Var.V.a(false);
                AndroidUtilities.runOnUIThread(new wa0(lb0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new cg.p1(context, 43, this.b.V.B).show();
                    break;
                }
                break;
        }
    }
}
