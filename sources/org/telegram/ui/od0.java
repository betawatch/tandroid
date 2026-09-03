package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf0 b;

    public /* synthetic */ od0(bf0 bf0Var, int i10) {
        this.a = i10;
        this.b = bf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.I.n();
                break;
            case 1:
                bf0 bf0Var = this.b;
                bf0Var.J = null;
                bf0Var.K = null;
                bf0Var.p(true);
                bf0Var.e.h(null, null, bf0Var.f, null);
                md mdVar = bf0Var.n;
                org.telegram.ui.Components.gj0 gj0Var = bf0Var.F;
                mdVar.setAnimation(gj0Var);
                gj0Var.K(0);
                bf0Var.H = true;
                break;
            case 2:
                this.b.H = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
