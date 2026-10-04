package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ n8(m9 m9Var, int i10) {
        this.a = i10;
        this.b = m9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m9 m9Var = this.b;
                m9Var.h0(false);
                org.telegram.ui.Components.rc I = (m9Var.v ? org.telegram.ui.Components.yc.X() : org.telegram.ui.Components.yc.a0(m9Var)).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new n8(m9Var, 3));
                I.j = 5000;
                I.j();
                break;
            case 1:
                this.b.j0(true);
                break;
            case 2:
                this.b.h0(false);
                break;
            case 3:
                this.b.h0(true);
                break;
            default:
                this.b.c0();
                break;
        }
    }
}
