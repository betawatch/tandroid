package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class bj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$57((TLObject) this.c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                break;
            case 1:
                ((SendMessagesHelper) this.b).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.c, (ArrayList) this.d, (fj) this.e);
                break;
            case 2:
                ((SendMessagesHelper) this.b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.c, (MessageObject) this.e);
                break;
            case 3:
                ((TelegramMediaSession) this.b).lambda$loadBrowseChildren$4((MessagesStorage) this.c, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.e);
                break;
            case 4:
                ((UnconfirmedAuthController) this.b).lambda$readCache$0((ArrayList) this.c, (HashSet) this.d, (ArrayList) this.e);
                break;
            default:
                ((UserNameResolver) this.b).lambda$resolve$0((String) this.e, (TLRPC.TL_error) this.d, (TLObject) this.c);
                break;
        }
    }

    public /* synthetic */ bj(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 5;
        this.b = userNameResolver;
        this.e = str;
        this.d = tL_error;
        this.c = tLObject;
    }

    public /* synthetic */ bj(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.a = 2;
        this.b = sendMessagesHelper;
        this.d = delayedMessage;
        this.c = file;
        this.e = messageObject;
    }
}
