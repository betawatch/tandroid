package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ fv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ey.h0(this.b);
                break;
            case 1:
                ey eyVar = this.b;
                if (eyVar.S3 != null) {
                    eyVar.getMessagesController().removeSuggestion(0L, eyVar.S3);
                    eyVar.S3 = null;
                    eyVar.T4();
                    break;
                }
                break;
            case 2:
                this.b.j4(true);
                break;
            default:
                this.b.j4(true);
                break;
        }
    }
}
