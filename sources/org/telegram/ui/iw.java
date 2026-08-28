package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iw implements q60 {
    public final /* synthetic */ dy a;

    public iw(dy dyVar) {
        this.a = dyVar;
    }

    @Override // org.telegram.ui.q60
    public final void a(r60 r60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        dy dyVar = this.a;
        wx wxVar = dyVar.y2;
        if (dyVar.x2) {
            dyVar.removeSelfFromStack();
        }
        wxVar.v(dyVar, arrayList, null, true, dyVar.F2, dyVar.G2, dyVar.H2, null);
    }
}
