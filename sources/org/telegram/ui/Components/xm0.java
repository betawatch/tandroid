package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm0 b;

    public /* synthetic */ xm0(zm0 zm0Var, int i10) {
        this.a = i10;
        this.b = zm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zm0 zm0Var = this.b;
                zm0Var.getClass();
                AndroidUtilities.runOnUIThread(new xm0(zm0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new xm0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
