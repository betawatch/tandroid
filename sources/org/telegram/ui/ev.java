package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ ev(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ey.Y(this.b);
                break;
            case 1:
                ey eyVar = this.b;
                if (eyVar.S3 != null) {
                    eyVar.getMessagesController().removeSuggestion(0L, eyVar.S3);
                    eyVar.S3 = null;
                    eyVar.J4();
                    break;
                }
                break;
            case 2:
                this.b.Z3(true);
                break;
            default:
                this.b.Z3(true);
                break;
        }
    }
}
