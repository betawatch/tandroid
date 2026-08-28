package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 d;

    public /* synthetic */ o0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        this.a = i9;
        this.b = editTextBoldCursor;
        this.c = c2Var;
        this.d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o0(this.b, this.c, this.d, 1));
                break;
            default:
                y4.e0(this.b, this.c, this.d);
                break;
        }
    }
}
