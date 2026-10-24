package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class m6 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6(Object obj, int i10) {
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
                MessagesController.lambda$openByUserName$460((boolean[]) this.b, dialogInterface);
                break;
            default:
                ((MediaController.MediaLoader) this.b).lambda$new$0(dialogInterface);
                break;
        }
    }
}
