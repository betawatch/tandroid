package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class xg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MusicPlayerService) this.b).stopSelf();
                break;
            case 1:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.b);
                break;
            case 2:
                ((NotificationsSettingsFacade) this.b).lambda$applyDialogNotificationsSettings$0();
                break;
            case 3:
                ((CancellationSignal) this.b).cancel();
                break;
            case 4:
                ((ProxyRotationController) this.b).lambda$new$2();
                break;
            case 5:
                ((PushListenerController.GooglePushListenerServiceProvider) this.b).lambda$onRequestPushToken$1();
                break;
            case 6:
                ((RichMessageLayout.PreviewView) this.b).lambda$onTouchEvent$0();
                break;
            case 7:
                ((RichMessageLayout.RichButtonRowBlock) this.b).invalidate();
                break;
            case 8:
                ((RichMessageLayout.RichButtonSpan) this.b).invalidate();
                break;
            case 9:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.b);
                break;
            case 10:
                ((RichMessageLayout.Text) this.b).lambda$scheduleLongPress$2();
                break;
            case 11:
                ((SecretChatHelper) this.b).lambda$startSecretChat$25();
                break;
            case 12:
                ((SendMessagesHelper) this.b).lambda$new$0();
                break;
            case 13:
                ((MessagesStorage.StringCallback) this.b).run(null);
                break;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.b).lambda$start$0();
                break;
            case 15:
                ((TelegramMediaSession) this.b).onAccountSwitched();
                break;
            default:
                ((TranslateController) this.b).loadTranslatingDialogsCached();
                break;
        }
    }
}
