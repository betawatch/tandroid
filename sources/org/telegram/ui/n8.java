package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;

    public /* synthetic */ n8(n9 n9Var, int i10) {
        this.a = i10;
        this.b = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n9 n9Var = this.b;
                n9Var.f0();
                n9Var.i0();
                break;
            case 1:
                n9 n9Var2 = this.b;
                n9Var2.n0(false);
                org.telegram.ui.Components.ic I = (n9Var2.w ? org.telegram.ui.Components.qc.X() : org.telegram.ui.Components.qc.a0(n9Var2)).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new n8(n9Var2, 5));
                I.j = 5000;
                I.j();
                break;
            case 2:
                this.b.p0(true);
                break;
            case 3:
                n9 n9Var3 = this.b;
                n9Var3.h0();
                n9Var3.f0();
                break;
            case 4:
                this.b.n0(false);
                break;
            case 5:
                this.b.n0(true);
                break;
            default:
                n9 n9Var4 = this.b;
                n9Var4.d.postOnAnimation(new n8(n9Var4, 3));
                break;
        }
    }
}
