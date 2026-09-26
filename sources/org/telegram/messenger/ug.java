package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class ug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ug(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.b);
                break;
            case 1:
                ((NotificationsSettingsFacade) this.b).lambda$applyDialogNotificationsSettings$0();
                break;
            case 2:
                ((CancellationSignal) this.b).cancel();
                break;
            case 3:
                ((ProxyRotationController) this.b).lambda$new$2();
                break;
            case 4:
                ((PushListenerController.GooglePushListenerServiceProvider) this.b).lambda$onRequestPushToken$1();
                break;
            case 5:
                ((RichMessageLayout.PreviewView) this.b).lambda$onTouchEvent$0();
                break;
            case 6:
                ((RichMessageLayout.RichButtonRowBlock) this.b).invalidate();
                break;
            case 7:
                ((RichMessageLayout.RichButtonSpan) this.b).invalidate();
                break;
            case 8:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.b);
                break;
            case 9:
                ((RichMessageLayout.Text) this.b).lambda$scheduleLongPress$2();
                break;
            case 10:
                ((SecretChatHelper) this.b).lambda$startSecretChat$25();
                break;
            case 11:
                ((SendMessagesHelper) this.b).lambda$new$0();
                break;
            case 12:
                ((MessagesStorage.StringCallback) this.b).run(null);
                break;
            case 13:
                ((SendMessagesHelper.LocationProvider) this.b).lambda$start$0();
                break;
            case 14:
                ((TelegramMediaSession) this.b).onAccountSwitched();
                break;
            default:
                ((TranslateController) this.b).loadTranslatingDialogsCached();
                break;
        }
    }
}
