package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ o7(int i9, Utilities.Callback callback) {
        this.a = i9;
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
