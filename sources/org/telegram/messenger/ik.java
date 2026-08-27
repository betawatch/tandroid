package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class ik implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ik(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.c = sendMessagesHelper;
        this.d = arrayList;
        this.g = tLObject;
        this.e = arrayList2;
        this.f = arrayList3;
        this.h = delayedMessage;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.g, (ArrayList) this.e, (ArrayList) this.f, (SendMessagesHelper.DelayedMessage) this.h, this.b, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new s1((pf.u0) this.c, (String) this.d, this.b, tLObject, (TLRPC.User) this.e, (String) this.f, (MessagesStorage) this.g, (String) this.h));
                break;
        }
    }

    public /* synthetic */ ik(pf.u0 u0Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.c = u0Var;
        this.d = str;
        this.b = z10;
        this.e = user;
        this.f = str2;
        this.g = messagesStorage;
        this.h = str3;
    }
}
