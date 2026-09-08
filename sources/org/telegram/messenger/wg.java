package org.telegram.messenger;

import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wg(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((NotificationBadge.ZukHomeBadger) this.b).lambda$executeBadge$0((Bundle) this.c);
                break;
            case 1:
                NotificationsController.lambda$showExtraNotifications$45((Uri) this.b, (File) this.c);
                break;
            case 2:
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53((Consumer) this.b, (HashSet) this.c);
                break;
            case 3:
                ((NotificationsController) this.b).lambda$didReceivedNotification$38((String) this.c);
                break;
            case 4:
                ((NotificationsController) this.b).lambda$processEditedMessages$22((a0.i) this.c);
                break;
            case 5:
                PasskeysController.lambda$create$2((Utilities.Callback2) this.b, (Throwable) this.c);
                break;
            case 6:
                ((SavedMessagesController) this.b).lambda$deleteCache$13((MessagesStorage) this.c);
                break;
            case 7:
                ((SecretChatHelper) this.b).lambda$performSendEncryptedRequest$6((TLRPC.Message) this.c);
                break;
            case 8:
                ((SendMessagesHelper) this.b).lambda$performSendMessageRequest$90((TLRPC.TL_updateShortSentMessage) this.c);
                break;
            case 9:
                ((SendMessagesHelper) this.b).lambda$sendMessage$16((ArrayList) this.c);
                break;
            case 10:
                ((SendMessagesHelper.ImportingStickers) this.b).lambda$onMediaImport$0((String) this.c);
                break;
            case 11:
                ((TopicsController) this.b).lambda$processUpdate$22((List) this.c);
                break;
            case 12:
                ((TopicsController) this.b).lambda$pinTopic$19((org.telegram.ui.ActionBar.n2) this.c);
                break;
            case 13:
                ((TopicsController) this.b).lambda$onTopicsDeletedServerSide$23((ArrayList) this.c);
                break;
            case 14:
                ((TopicsController) this.b).lambda$updateReadOutbox$26((HashMap) this.c);
                break;
            default:
                ((UserConfig) this.b).lambda$loadGlobalTTl$3((TLObject) this.c);
                break;
        }
    }
}
