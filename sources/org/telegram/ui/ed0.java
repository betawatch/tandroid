package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ id0 b;

    public /* synthetic */ ed0(id0 id0Var, int i7) {
        this.a = i7;
        this.b = id0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.u0.finishFragment();
                break;
            default:
                this.b.u0.finishFragment();
                break;
        }
    }
}
