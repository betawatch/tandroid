package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class p6 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                MediaController.lambda$saveFile$54((boolean[]) this.b, dialogInterface);
                break;
            case 1:
                MediaController.lambda$saveFile$47((boolean[]) this.b, dialogInterface);
                break;
            case 2:
                MessagesController.lambda$openByUserName$463((boolean[]) this.b, dialogInterface);
                break;
            default:
                ((MediaController.MediaLoader) this.b).lambda$new$0(dialogInterface);
                break;
        }
    }
}
