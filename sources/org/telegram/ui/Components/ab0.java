package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
