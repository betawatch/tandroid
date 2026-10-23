package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class uj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                ((SendMessagesHelper) this.b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.c, (ArrayList) this.d, (pj) this.e);
                break;
            case 1:
                ((SendMessagesHelper) this.b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.c, (File) this.d, (MessageObject) this.e);
                break;
            case 2:
                ((UnconfirmedAuthController) this.b).lambda$readCache$0((ArrayList) this.d, (HashSet) this.c, (ArrayList) this.e);
                break;
            default:
                ((UserNameResolver) this.b).lambda$resolve$0((String) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e);
                break;
        }
    }

    public /* synthetic */ uj(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.a = 2;
        this.b = unconfirmedAuthController;
        this.d = arrayList;
        this.c = hashSet;
        this.e = arrayList2;
    }
}
