package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class cw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;
    public final /* synthetic */ long d;

    public /* synthetic */ cw(zy zyVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.a = i7;
        this.b = zyVar;
        this.c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zy zyVar = this.b;
                zyVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.c.message.id));
                zyVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                break;
            default:
                zy zyVar2 = this.b;
                zyVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.c.message.id));
                zyVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                break;
        }
    }
}
