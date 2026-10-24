package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v6(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaController.4) this.c).lambda$onCallStateChanged$0(this.b);
                break;
            case 1:
                MessagesController.1.lambda$setLocal$2(this.b, (TLRPC.TL_help_appConfig) this.c);
                break;
            case 2:
                MessagesController.4.lambda$setLocal$2(this.b, (TLRPC.messages_AvailableEffects) this.c);
                break;
            case 3:
                MessagesController.5.lambda$setLocal$1(this.b, (TL_account.TL_webBrowserSettings) this.c);
                break;
            case 4:
                AutoDeleteMediaTask.lambda$run$1(this.b, (File) this.c);
                break;
            case 5:
                FileLoader.lambda$deleteFiles$18((ArrayList) this.c, this.b);
                break;
            case 6:
                ((FilesMigrationService) this.c).lambda$updateProgress$1(this.b);
                break;
            case 7:
                MediaController.lambda$saveFile$50((org.telegram.ui.ActionBar.c2) this.c, this.b);
                break;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.c, this.b);
                break;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                break;
            case 10:
                SendMessagesHelper.lambda$handleError$122(this.b, (AccountInstance) this.c);
                break;
            default:
                Utilities.lambda$doCallbacks$0(this.b, (Utilities.Callback[]) this.c);
                break;
        }
    }

    public /* synthetic */ v6(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
