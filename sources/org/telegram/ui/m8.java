package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ m8(m9 m9Var, int i10) {
        this.a = i10;
        this.b = m9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m9 m9Var = this.b;
                m9Var.e0();
                m9Var.h0();
                break;
            case 1:
                m9 m9Var2 = this.b;
                m9Var2.m0(false);
                org.telegram.ui.Components.qc I = (m9Var2.w ? org.telegram.ui.Components.xc.X() : org.telegram.ui.Components.xc.a0(m9Var2)).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new m8(m9Var2, 5));
                I.j = 5000;
                I.j();
                break;
            case 2:
                this.b.o0(true);
                break;
            case 3:
                m9 m9Var3 = this.b;
                m9Var3.g0();
                m9Var3.e0();
                break;
            case 4:
                this.b.m0(false);
                break;
            case 5:
                this.b.m0(true);
                break;
            default:
                m9 m9Var4 = this.b;
                m9Var4.d.postOnAnimation(new m8(m9Var4, 3));
                break;
        }
    }
}
