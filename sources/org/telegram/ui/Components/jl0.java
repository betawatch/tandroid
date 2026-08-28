package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll0 b;

    public /* synthetic */ jl0(ll0 ll0Var, int i9) {
        this.a = i9;
        this.b = ll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ll0 ll0Var = this.b;
                ll0Var.getClass();
                AndroidUtilities.runOnUIThread(new jl0(ll0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new jl0(this.b, 3));
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
