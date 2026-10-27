package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ tb0(ic0 ic0Var, Context context, int i10) {
        this.a = i10;
        this.b = ic0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ic0 ic0Var = this.b;
                ic0Var.c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(ic0Var, this.c, 1));
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
