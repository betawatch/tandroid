// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kz1 implements gk, ee {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ kz1(nz1 nz1Var, View view, Object obj, String str, Object obj2, jo6 jo6Var, boolean z) {
        this.c = nz1Var;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = jo6Var;
        this.b = z;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        wg2 wg2Var = (wg2) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        wg2Var.getClass();
        wg2Var.x0(user.id, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, wg2Var.e1 == 1 ? 0 : 1, false);
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        ((nz1) this.c).B((View) this.d, this.e, this.a, this.f, z, i, i2, (jo6) this.h, this.b);
    }

    public /* synthetic */ kz1(wg2 wg2Var, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.c = wg2Var;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z;
    }
}
