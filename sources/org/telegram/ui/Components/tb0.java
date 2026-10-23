package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                    new sg.y0(context, 43, this.b.c0.F).show();
                    break;
                }
                break;
        }
    }
}
