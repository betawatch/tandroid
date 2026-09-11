package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
