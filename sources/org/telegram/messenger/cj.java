package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class cj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$60((TLObject) this.c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                break;
            case 1:
                ((SendMessagesHelper) this.b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.c, (ArrayList) this.d, (vj) this.e);
                break;
            case 2:
                ((SendMessagesHelper) this.b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.c, (MessageObject) this.e);
                break;
            case 3:
                ((UnconfirmedAuthController) this.b).lambda$readCache$0((ArrayList) this.c, (HashSet) this.d, (ArrayList) this.e);
                break;
            default:
                ((UserNameResolver) this.b).lambda$resolve$0((String) this.e, (TLRPC.TL_error) this.d, (TLObject) this.c);
                break;
        }
    }

    public /* synthetic */ cj(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 4;
        this.b = userNameResolver;
        this.e = str;
        this.d = tL_error;
        this.c = tLObject;
    }

    public /* synthetic */ cj(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.a = 2;
        this.b = sendMessagesHelper;
        this.d = delayedMessage;
        this.c = file;
        this.e = messageObject;
    }
}
