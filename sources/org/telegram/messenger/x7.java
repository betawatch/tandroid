package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ x7(int i10, Utilities.Callback callback) {
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
