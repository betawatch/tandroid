package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ q7(int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaDataController.lambda$loadStickers$98(this.b);
                break;
            case 1:
                MediaDataController.lambda$loadStickers$99(this.b);
                break;
            case 2:
                MediaDataController.lambda$loadBotInfo$198(this.b);
                break;
            case 3:
                MediaDataController.lambda$loadStickers$94(this.b);
                break;
            case 4:
                MediaDataController.lambda$loadStickers$95(this.b);
                break;
            case 5:
                MediaDataController.lambda$loadStickers$96(this.b);
                break;
            case 6:
                this.b.run(null);
                break;
            case 7:
                MessagesController.lambda$addUserToChat$301(this.b);
                break;
            case 8:
                MessagesController.lambda$addUserToChat$305(this.b);
                break;
            case 9:
                this.b.run(null);
                break;
            default:
                ShortcutResultReceiver.lambda$onReceive$0(this.b);
                break;
        }
    }
}
