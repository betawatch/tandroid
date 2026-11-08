package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.t4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ pp(oq oqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        this.c = oqVar;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z9;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        ((org.telegram.ui.Components.pf) this.c).B((View) this.d, this.e, this.a, this.f, z9, i7, i10, (org.telegram.messenger.gf) this.h, this.b);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        oq oqVar = (oq) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        oqVar.getClass();
        oqVar.y0(user.id, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, oqVar.d1 == 1 ? 0 : 1, false);
    }

    public /* synthetic */ pp(org.telegram.ui.Components.pf pfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.gf gfVar, boolean z9) {
        this.c = pfVar;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = gfVar;
        this.b = z9;
    }
}
