package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wa0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ia0(wa0 wa0Var, Context context, int i9) {
        this.a = i9;
        this.b = wa0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wa0 wa0Var = this.b;
                wa0Var.V.a(false);
                AndroidUtilities.runOnUIThread(new ia0(wa0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new zf.x0(context, 43, this.b.V.B).show();
                    break;
                }
                break;
        }
    }
}
