package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class xj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                ((SendMessagesHelper) this.b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.c, (ArrayList) this.d, (sj) this.e);
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

    public /* synthetic */ xj(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.a = 2;
        this.b = unconfirmedAuthController;
        this.d = arrayList;
        this.c = hashSet;
        this.e = arrayList2;
    }
}
