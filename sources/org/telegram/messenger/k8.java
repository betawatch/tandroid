package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;
    public final /* synthetic */ TLRPC.TL_messages_sendMedia c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ k8(r8 r8Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i7) {
        this.a = i7;
        this.b = r8Var;
        this.c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ez sendMessagesHelper = this.b.getSendMessagesHelper();
                Object[] objArr = this.d;
                sendMessagesHelper.P(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (qy) objArr[4], ((Boolean) objArr[5]).booleanValue());
                break;
            default:
                ez sendMessagesHelper2 = this.b.getSendMessagesHelper();
                Object[] objArr2 = this.d;
                sendMessagesHelper2.P(this.c, (ArrayList) objArr2[1], (ArrayList) objArr2[2], null, (qy) objArr2[4], ((Boolean) objArr2[5]).booleanValue());
                break;
        }
    }
}
