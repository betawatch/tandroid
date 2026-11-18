package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                org.telegram.ui.Components.ph0 ph0Var = rc0Var.h;
                ph0Var.getAnimatedDrawable().N(0, false, false);
                ph0Var.d();
                EditTextBoldCursor editTextBoldCursor = rc0Var.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
