package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n6(int i9, Object obj, int i10) {
        this.a = i10;
        this.b = i9;
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
                FileLoader.lambda$deleteFiles$16((ArrayList) this.c, this.b);
                break;
            case 6:
                ((FilesMigrationService) this.c).lambda$updateProgress$1(this.b);
                break;
            case 7:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.c2) this.c, this.b);
                break;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.c, this.b);
                break;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                break;
            case 10:
                SendMessagesHelper.lambda$handleError$119(this.b, (AccountInstance) this.c);
                break;
            default:
                Utilities.lambda$doCallbacks$0(this.b, (Utilities.Callback[]) this.c);
                break;
        }
    }

    public /* synthetic */ n6(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }
}
