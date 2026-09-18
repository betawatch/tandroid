package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ax implements m70 {
    public final /* synthetic */ wy a;

    public ax(wy wyVar) {
        this.a = wyVar;
    }

    @Override // org.telegram.ui.m70
    public final void a(n70 n70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        wy wyVar = this.a;
        qy qyVar = wyVar.C2;
        if (wyVar.B2) {
            wyVar.removeSelfFromStack();
        }
        qyVar.u(wyVar, arrayList, null, true, wyVar.J2, wyVar.K2, wyVar.L2, null);
    }
}
