package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc0 b;

    public /* synthetic */ pc0(qc0 qc0Var, int i3) {
        this.a = i3;
        this.b = qc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qc0 qc0Var = this.b;
                org.telegram.ui.Components.fh0 fh0Var = qc0Var.h;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                EditTextBoldCursor editTextBoldCursor = qc0Var.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
