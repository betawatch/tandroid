package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ax implements j70 {
    public final /* synthetic */ wy a;

    public ax(wy wyVar) {
        this.a = wyVar;
    }

    @Override // org.telegram.ui.j70
    public final void a(k70 k70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        wy wyVar = this.a;
        qy qyVar = wyVar.C2;
        if (wyVar.B2) {
            wyVar.removeSelfFromStack();
        }
        qyVar.v(wyVar, arrayList, null, true, wyVar.J2, wyVar.K2, wyVar.L2, null);
    }
}
