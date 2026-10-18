package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class iw implements t60 {
    public final /* synthetic */ ey a;

    public iw(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.t60
    public final void a(u60 u60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        ey eyVar = this.a;
        xx xxVar = eyVar.C2;
        if (eyVar.B2) {
            eyVar.removeSelfFromStack();
        }
        xxVar.w(eyVar, arrayList, null, true, eyVar.J2, eyVar.K2, eyVar.L2, null);
    }
}
