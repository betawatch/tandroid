package org.telegram.messenger;

import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class lh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lh(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((CancellationSignal) this.b).cancel();
                break;
            case 1:
                ((ProxyRotationController) this.b).lambda$new$2();
                break;
            case 2:
                ((PushListenerController.GooglePushListenerServiceProvider) this.b).lambda$onRequestPushToken$1();
                break;
            case 3:
                ((RichMessageLayout.PreviewView) this.b).lambda$onTouchEvent$0();
                break;
            case 4:
                ((RichMessageLayout.RichButtonRowBlock) this.b).invalidate();
                break;
            case 5:
                ((RichMessageLayout.RichButtonSpan) this.b).invalidate();
                break;
            case 6:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.b);
                break;
            case 7:
                ((RichMessageLayout.Text) this.b).lambda$scheduleLongPress$2();
                break;
            case 8:
                ((SecretChatHelper) this.b).lambda$startSecretChat$25();
                break;
            case 9:
                ((SendMessagesHelper) this.b).lambda$new$0();
                break;
            case 10:
                ((MessagesStorage.StringCallback) this.b).run(null);
                break;
            case 11:
                ((SendMessagesHelper.LocationProvider) this.b).lambda$start$0();
                break;
            case 12:
                ((TelegramMediaSession) this.b).onAccountSwitched();
                break;
            default:
                ((TranslateController) this.b).loadTranslatingDialogsCached();
                break;
        }
    }
}
