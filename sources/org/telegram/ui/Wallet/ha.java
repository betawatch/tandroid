package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class ha implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ na b;

    public /* synthetic */ ha(na naVar, int i7) {
        this.a = i7;
        this.b = naVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.a) {
            case 0:
                na.e0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                na naVar = this.b;
                if (!naVar.isFinished && (iVar = naVar.O) != null) {
                    if (user != null) {
                        org.telegram.messenger.g0.v1(iVar);
                        naVar.m0(null, user);
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(new ia(naVar, 1));
                        break;
                    }
                }
                break;
        }
    }
}
