package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qb0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ bb0(qb0 qb0Var, Context context, int i10) {
        this.a = i10;
        this.b = qb0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qb0 qb0Var = this.b;
                qb0Var.W.a(false);
                AndroidUtilities.runOnUIThread(new bb0(qb0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new eg.o1(context, 43, this.b.W.C).show();
                    break;
                }
                break;
        }
    }
}
