package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class gw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;
    public final /* synthetic */ long d;

    public /* synthetic */ gw(ez ezVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.a = i7;
        this.b = ezVar;
        this.c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ez ezVar = this.b;
                ezVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.c.message.id));
                ezVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                break;
            default:
                ez ezVar2 = this.b;
                ezVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.c.message.id));
                ezVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                break;
        }
    }
}
