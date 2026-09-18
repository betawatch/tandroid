package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ l8(m9 m9Var, int i10) {
        this.a = i10;
        this.b = m9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m9 m9Var = this.b;
                m9Var.f0();
                m9Var.i0();
                break;
            case 1:
                m9 m9Var2 = this.b;
                m9Var2.n0(false);
                org.telegram.ui.Components.oc I = (m9Var2.w ? org.telegram.ui.Components.vc.X() : org.telegram.ui.Components.vc.a0(m9Var2)).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new l8(m9Var2, 5));
                I.j = 5000;
                I.j();
                break;
            case 2:
                this.b.p0(true);
                break;
            case 3:
                m9 m9Var3 = this.b;
                m9Var3.h0();
                m9Var3.f0();
                break;
            case 4:
                this.b.n0(false);
                break;
            case 5:
                this.b.n0(true);
                break;
            default:
                m9 m9Var4 = this.b;
                m9Var4.d.postOnAnimation(new l8(m9Var4, 3));
                break;
        }
    }
}
