package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc0 b;

    public /* synthetic */ qc0(rc0 rc0Var, int i7) {
        this.a = i7;
        this.b = rc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rc0 rc0Var = this.b;
                org.telegram.ui.Components.fh0 fh0Var = rc0Var.h;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                EditTextBoldCursor editTextBoldCursor = rc0Var.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
