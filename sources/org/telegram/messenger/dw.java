package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class dw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;
    public final /* synthetic */ long d;

    public /* synthetic */ dw(az azVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.a = i7;
        this.b = azVar;
        this.c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                az azVar = this.b;
                azVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.c.message.id));
                azVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                break;
            default:
                az azVar2 = this.b;
                azVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.c.message.id));
                azVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                break;
        }
    }
}
