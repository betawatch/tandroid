package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ nf0(w3 w3Var, int i9) {
        this.a = i9;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run("CANCELLED");
                break;
            default:
                AndroidUtilities.runOnUIThread(new nf0(this.b, 0));
                break;
        }
    }
}
