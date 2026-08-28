package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t70 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ s70(t70 t70Var, boolean z10, boolean z11, int i9) {
        this.a = i9;
        this.b = t70Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s70(this.b, this.c, this.d, 1));
                break;
            default:
                t70 t70Var = this.b;
                t70Var.setJoinRequest(this.c);
                t70Var.setJoinToSend(this.d);
                break;
        }
    }
}
