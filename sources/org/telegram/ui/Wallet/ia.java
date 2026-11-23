package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class ia implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa b;

    public /* synthetic */ ia(oa oaVar, int i7) {
        this.a = i7;
        this.b = oaVar;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.a) {
            case 0:
                oa.e0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                oa oaVar = this.b;
                if (!oaVar.isFinished && (iVar = oaVar.O) != null) {
                    if (user != null) {
                        org.telegram.messenger.g0.v1(iVar);
                        oaVar.m0(null, user);
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(new ja(oaVar, 1));
                        break;
                    }
                }
                break;
        }
    }
}
