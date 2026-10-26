package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class o6 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o6(Object obj, int i10) {
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
                MessagesController.lambda$openByUserName$462((boolean[]) this.b, dialogInterface);
                break;
            default:
                ((MediaController.MediaLoader) this.b).lambda$new$0(dialogInterface);
                break;
        }
    }
}
