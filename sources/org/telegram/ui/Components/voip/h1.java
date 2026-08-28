package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;
    public final /* synthetic */ pi0 c;

    public /* synthetic */ h1(l1 l1Var, pi0 pi0Var, int i9) {
        this.a = i9;
        this.b = l1Var;
        this.c = pi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h1(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
