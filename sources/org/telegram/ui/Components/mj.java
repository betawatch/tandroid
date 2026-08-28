package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oj b;

    public /* synthetic */ mj(oj ojVar, int i9) {
        this.a = i9;
        this.b = ojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oj ojVar = this.b;
                if (ojVar.f != null) {
                    ojVar.v = org.telegram.messenger.ll.g(new StringBuilder("+"), ojVar.f.phone, ne.b.c());
                    ojVar.s = ojVar.f;
                    AndroidUtilities.runOnUIThread(new mj(ojVar, 1));
                    break;
                }
                break;
            default:
                oj ojVar2 = this.b;
                ojVar2.c.l(ojVar2.v, false);
                break;
        }
    }
}
