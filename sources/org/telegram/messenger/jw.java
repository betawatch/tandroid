package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;
    public final /* synthetic */ long d;

    public /* synthetic */ jw(gz gzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i7) {
        this.a = i7;
        this.b = gzVar;
        this.c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gz gzVar = this.b;
                gzVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(this.c.message.id));
                gzVar.getMessagesStorage().c2(-this.d, arrayList, true, -1, 0, false, null);
                break;
            default:
                gz gzVar2 = this.b;
                gzVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.c.message.id));
                gzVar2.getMessagesStorage().c2(-this.d, arrayList2, true, -1, 0, false, null);
                break;
        }
    }
}
