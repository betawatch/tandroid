package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ w7(int i10, Utilities.Callback callback) {
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
                MediaDataController.lambda$loadStickers$94(this.b);
                break;
            case 3:
                MediaDataController.lambda$loadStickers$95(this.b);
                break;
            case 4:
                MediaDataController.lambda$loadStickers$96(this.b);
                break;
            case 5:
                MediaDataController.lambda$loadBotInfo$199(this.b);
                break;
            case 6:
                this.b.run(null);
                break;
            case 7:
                MessagesController.lambda$addUserToChat$300(this.b);
                break;
            case 8:
                MessagesController.lambda$addUserToChat$304(this.b);
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
