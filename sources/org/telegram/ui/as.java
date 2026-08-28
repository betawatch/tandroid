package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ as(is isVar, int i9) {
        this.a = i9;
        this.b = isVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                is isVar = this.b;
                if (isVar.F) {
                    isVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(isVar.d.b);
                    break;
                }
                break;
            case 1:
                is.Y(this.b);
                break;
            default:
                is isVar2 = this.b;
                isVar2.presentFragment(qn.R9(isVar2.D), true);
                break;
        }
    }
}
