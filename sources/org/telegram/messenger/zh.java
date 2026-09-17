package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class zh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zh(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((SavedMessagesController) this.c).lambda$loadDialogs$2((TLObject) this.b, (ArrayList) this.d, (TLRPC.TL_error) this.e);
                break;
            case 1:
                ((SendMessagesHelper) this.c).lambda$performSendDelayedMessage$57((TLObject) this.b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                break;
            case 2:
                ((SendMessagesHelper) this.c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.b, (ArrayList) this.d, (fj) this.e);
                break;
            case 3:
                ((SendMessagesHelper) this.c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.b, (File) this.d, (MessageObject) this.e);
                break;
            case 4:
                ((TelegramMediaSession) this.c).lambda$loadBrowseChildren$4((MessagesStorage) this.b, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.e);
                break;
            case 5:
                ((UnconfirmedAuthController) this.c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.b, (ArrayList) this.e);
                break;
            default:
                ((UserNameResolver) this.c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.e, (TLObject) this.b);
                break;
        }
    }

    public /* synthetic */ zh(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 6;
        this.c = userNameResolver;
        this.d = str;
        this.e = tL_error;
        this.b = tLObject;
    }

    public /* synthetic */ zh(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.a = 5;
        this.c = unconfirmedAuthController;
        this.d = arrayList;
        this.b = hashSet;
        this.e = arrayList2;
    }
}
