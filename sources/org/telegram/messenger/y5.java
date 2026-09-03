package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y5(Object obj, int i10) {
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
