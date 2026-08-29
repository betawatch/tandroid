package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ fv(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                fy.i0(this.b);
                break;
            case 1:
                fy fyVar = this.b;
                if (fyVar.O3 != null) {
                    fyVar.getMessagesController().removeSuggestion(0L, fyVar.O3);
                    fyVar.O3 = null;
                    fyVar.L4();
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
