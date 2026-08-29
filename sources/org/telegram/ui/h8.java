package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;

    public /* synthetic */ h8(h9 h9Var, int i10) {
        this.a = i10;
        this.b = h9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h9 h9Var = this.b;
                h9Var.f0();
                h9Var.i0();
                break;
            case 1:
                h9 h9Var2 = this.b;
                h9Var2.n0(false);
                org.telegram.ui.Components.mc I = (h9Var2.w ? org.telegram.ui.Components.tc.X() : org.telegram.ui.Components.tc.a0(h9Var2)).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new h8(h9Var2, 5));
                I.j = 5000;
                I.j();
                break;
            case 2:
                this.b.p0(true);
                break;
            case 3:
                h9 h9Var3 = this.b;
                h9Var3.h0();
                h9Var3.f0();
                break;
            case 4:
                this.b.n0(false);
                break;
            case 5:
                this.b.n0(true);
                break;
            default:
                h9 h9Var4 = this.b;
                h9Var4.d.postOnAnimation(new h8(h9Var4, 3));
                break;
        }
    }
}
