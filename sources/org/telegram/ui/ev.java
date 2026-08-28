package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ ev(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                dy.h0(this.b);
                break;
            case 1:
                dy dyVar = this.b;
                if (dyVar.O3 != null) {
                    dyVar.getMessagesController().removeSuggestion(0L, dyVar.O3);
                    dyVar.O3 = null;
                    dyVar.L4();
                    break;
                }
                break;
            case 2:
                this.b.b4(true);
                break;
            default:
                this.b.b4(true);
                break;
        }
    }
}
