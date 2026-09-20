package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ k8(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l9 l9Var = this.b;
                l9Var.f0();
                l9Var.i0();
                break;
            case 1:
                l9 l9Var2 = this.b;
                l9Var2.n0(false);
                org.telegram.ui.Components.pc I = (l9Var2.w ? org.telegram.ui.Components.xc.X() : org.telegram.ui.Components.xc.a0(l9Var2)).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new k8(l9Var2, 5));
                I.j = 5000;
                I.j();
                break;
            case 2:
                this.b.p0(true);
                break;
            case 3:
                l9 l9Var3 = this.b;
                l9Var3.h0();
                l9Var3.f0();
                break;
            case 4:
                this.b.n0(false);
                break;
            case 5:
                this.b.n0(true);
                break;
            default:
                l9 l9Var4 = this.b;
                l9Var4.d.postOnAnimation(new k8(l9Var4, 3));
                break;
        }
    }
}
