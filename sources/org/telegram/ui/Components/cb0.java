package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ cb0(rb0 rb0Var, Context context, int i10) {
        this.a = i10;
        this.b = rb0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rb0 rb0Var = this.b;
                rb0Var.W.a(false);
                AndroidUtilities.runOnUIThread(new cb0(rb0Var, this.c, 1));
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
