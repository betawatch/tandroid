package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t70 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r70(t70 t70Var, boolean z10, int i9) {
        this.a = i9;
        this.b = t70Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r70(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
