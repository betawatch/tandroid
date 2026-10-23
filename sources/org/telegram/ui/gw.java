package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class gw implements r60 {
    public final /* synthetic */ cy a;

    public gw(cy cyVar) {
        this.a = cyVar;
    }

    @Override // org.telegram.ui.r60
    public final void a(s60 s60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        cy cyVar = this.a;
        vx vxVar = cyVar.C2;
        if (cyVar.B2) {
            cyVar.removeSelfFromStack();
        }
        vxVar.w(cyVar, arrayList, null, true, cyVar.J2, cyVar.K2, cyVar.L2, null);
    }
}
