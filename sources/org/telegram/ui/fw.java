package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fw implements y60 {
    public final /* synthetic */ ey a;

    public fw(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.y60
    public final void a(z60 z60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        ey eyVar = this.a;
        xx xxVar = eyVar.C2;
        if (eyVar.B2) {
            eyVar.removeSelfFromStack();
        }
        xxVar.v(eyVar, arrayList, null, true, eyVar.J2, eyVar.K2, eyVar.L2, null);
    }
}
