package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e3(j3 j3Var, int i9, int i10) {
        this.a = i10;
        this.b = j3Var;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e3(this.b, this.c, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new e3(this.b, this.c, 3));
                break;
            case 2:
                this.b.c(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
