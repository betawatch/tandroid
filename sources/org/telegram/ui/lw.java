package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lw implements t60 {
    public final /* synthetic */ gy a;

    public lw(gy gyVar) {
        this.a = gyVar;
    }

    @Override // org.telegram.ui.t60
    public final void a(u60 u60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        gy gyVar = this.a;
        zx zxVar = gyVar.y2;
        if (gyVar.x2) {
            gyVar.removeSelfFromStack();
        }
        zxVar.w(gyVar, arrayList, null, true, gyVar.F2, gyVar.G2, gyVar.H2, null);
    }
}
