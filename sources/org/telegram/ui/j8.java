package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;

    public /* synthetic */ j8(k9 k9Var, int i10) {
        this.a = i10;
        this.b = k9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k9 k9Var = this.b;
                k9Var.f0();
                k9Var.i0();
                break;
            case 1:
                k9 k9Var2 = this.b;
                k9Var2.n0(false);
                org.telegram.ui.Components.qc I = (k9Var2.w ? org.telegram.ui.Components.yc.X() : org.telegram.ui.Components.yc.a0(k9Var2)).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new j8(k9Var2, 5));
                I.j = 5000;
                I.j();
                break;
            case 2:
                this.b.p0(true);
                break;
            case 3:
                k9 k9Var3 = this.b;
                k9Var3.h0();
                k9Var3.f0();
                break;
            case 4:
                this.b.n0(false);
                break;
            case 5:
                this.b.n0(true);
                break;
            default:
                k9 k9Var4 = this.b;
                k9Var4.d.postOnAnimation(new j8(k9Var4, 3));
                break;
        }
    }
}
