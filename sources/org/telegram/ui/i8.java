package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;

    public /* synthetic */ i8(j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j9 j9Var = this.b;
                j9Var.f0();
                j9Var.i0();
                break;
            case 1:
                j9 j9Var2 = this.b;
                j9Var2.n0(false);
                org.telegram.ui.Components.tc I = (j9Var2.w ? org.telegram.ui.Components.ad.X() : org.telegram.ui.Components.ad.a0(j9Var2)).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new i8(j9Var2, 5));
                I.j = 5000;
                I.j();
                break;
            case 2:
                this.b.p0(true);
                break;
            case 3:
                j9 j9Var3 = this.b;
                j9Var3.h0();
                j9Var3.f0();
                break;
            case 4:
                this.b.n0(false);
                break;
            case 5:
                this.b.n0(true);
                break;
            default:
                j9 j9Var4 = this.b;
                j9Var4.d.postOnAnimation(new i8(j9Var4, 3));
                break;
        }
    }
}
