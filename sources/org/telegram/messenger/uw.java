package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class uw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;
    public final /* synthetic */ long d;

    public /* synthetic */ uw(qz qzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.a = i10;
        this.b = qzVar;
        this.c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qz qzVar = this.b;
                qzVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.c.message.id));
                qzVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                break;
            default:
                qz qzVar2 = this.b;
                qzVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.c.message.id));
                qzVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                break;
        }
    }
}
