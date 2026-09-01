package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ db0(sb0 sb0Var, Context context, int i10) {
        this.a = i10;
        this.b = sb0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sb0 sb0Var = this.b;
                sb0Var.W.a(false);
                AndroidUtilities.runOnUIThread(new db0(sb0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new fg.n1(context, 43, this.b.W.C).show();
                    break;
                }
                break;
        }
    }
}
