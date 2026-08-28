package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;

    public /* synthetic */ ff0(jf0 jf0Var, int i9) {
        this.a = i9;
        this.b = jf0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.o0.finishFragment();
                break;
            default:
                this.b.o0.finishFragment();
                break;
        }
    }
}
