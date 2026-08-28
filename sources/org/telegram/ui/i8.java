package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ i8(i9 i9Var, int i9) {
        this.a = i9;
        this.b = i9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i9 i9Var = this.b;
                i9Var.e0();
                i9Var.h0();
                break;
            case 1:
                i9 i9Var2 = this.b;
                i9Var2.m0(false);
                org.telegram.ui.Components.gc I = (i9Var2.w ? org.telegram.ui.Components.oc.X() : org.telegram.ui.Components.oc.a0(i9Var2)).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new i8(i9Var2, 5));
                I.j = 5000;
                I.j();
                break;
            case 2:
                this.b.o0(true);
                break;
            case 3:
                i9 i9Var3 = this.b;
                i9Var3.g0();
                i9Var3.e0();
                break;
            case 4:
                this.b.m0(false);
                break;
            case 5:
                this.b.m0(true);
                break;
            default:
                i9 i9Var4 = this.b;
                i9Var4.d.postOnAnimation(new i8(i9Var4, 3));
                break;
        }
    }
}
