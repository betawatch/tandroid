package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kw implements s60 {
    public final /* synthetic */ fy a;

    public kw(fy fyVar) {
        this.a = fyVar;
    }

    @Override // org.telegram.ui.s60
    public final void a(t60 t60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        fy fyVar = this.a;
        yx yxVar = fyVar.y2;
        if (fyVar.x2) {
            fyVar.removeSelfFromStack();
        }
        yxVar.v(fyVar, arrayList, null, true, fyVar.F2, fyVar.G2, fyVar.H2, null);
    }
}
