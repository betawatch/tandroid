package org.telegram.messenger;

import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class jh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((NotificationsSettingsFacade) this.b).lambda$applyDialogNotificationsSettings$0();
                break;
            case 1:
                ((CancellationSignal) this.b).cancel();
                break;
            case 2:
                ((ProxyRotationController) this.b).lambda$new$2();
                break;
            case 3:
                ((PushListenerController.GooglePushListenerServiceProvider) this.b).lambda$onRequestPushToken$1();
                break;
            case 4:
                ((RichMessageLayout.PreviewView) this.b).lambda$onTouchEvent$0();
                break;
            case 5:
                ((RichMessageLayout.RichButtonRowBlock) this.b).invalidate();
                break;
            case 6:
                ((RichMessageLayout.RichButtonSpan) this.b).invalidate();
                break;
            case 7:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.b);
                break;
            case 8:
                ((RichMessageLayout.Text) this.b).lambda$scheduleLongPress$2();
                break;
            case 9:
                ((SecretChatHelper) this.b).lambda$startSecretChat$25();
                break;
            case 10:
                ((SendMessagesHelper) this.b).lambda$new$0();
                break;
            case 11:
                ((MessagesStorage.StringCallback) this.b).run(null);
                break;
            case 12:
                ((SendMessagesHelper.LocationProvider) this.b).lambda$start$0();
                break;
            case 13:
                ((TelegramMediaSession) this.b).onAccountSwitched();
                break;
            default:
                ((TranslateController) this.b).loadTranslatingDialogsCached();
                break;
        }
    }
}
