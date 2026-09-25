package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                MediaController.lambda$saveFile$44((boolean[]) this.b, dialogInterface);
                break;
            case 1:
                MediaController.lambda$saveFile$51((boolean[]) this.b, dialogInterface);
                break;
            case 2:
                MessagesController.lambda$openByUserName$457((boolean[]) this.b, dialogInterface);
                break;
            default:
                ((MediaController.MediaLoader) this.b).lambda$new$0(dialogInterface);
                break;
        }
    }
}
