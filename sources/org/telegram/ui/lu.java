package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ lu(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ww wwVar = this.b;
                if (wwVar.R3 != null) {
                    wwVar.getMessagesController().k4(0L, wwVar.R3);
                    wwVar.R3 = null;
                    wwVar.X4();
                    break;
                }
                break;
            case 1:
                this.b.n4(true);
                break;
            case 2:
                this.b.n4(true);
                break;
            default:
                ww.l0(this.b);
                break;
        }
    }
}
