package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qb0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ab0(qb0 qb0Var, Context context, int i10) {
        this.a = i10;
        this.b = qb0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qb0 qb0Var = this.b;
                qb0Var.c0.a(false);
                AndroidUtilities.runOnUIThread(new ab0(qb0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.a1(context, 43, this.b.c0.F).show();
                    break;
                }
                break;
        }
    }
}
