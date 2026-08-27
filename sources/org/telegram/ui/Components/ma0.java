package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ma0(ab0 ab0Var, Context context, int i10) {
        this.a = i10;
        this.b = ab0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ab0 ab0Var = this.b;
                ab0Var.V.a(false);
                AndroidUtilities.runOnUIThread(new ma0(ab0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new ag.g2(context, 43, this.b.V.B).show();
                    break;
                }
                break;
        }
    }
}
