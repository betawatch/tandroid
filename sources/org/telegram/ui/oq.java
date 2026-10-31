package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.q4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ oq(pr prVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.c = prVar;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        ((org.telegram.ui.Components.lf) this.c).B((View) this.d, this.e, this.a, this.f, z10, i10, i11, (org.telegram.messenger.ef) this.h, this.b);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        pr prVar = (pr) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        prVar.getClass();
        prVar.x0(user.id, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, prVar.d1 == 1 ? 0 : 1, false);
    }

    public /* synthetic */ oq(org.telegram.ui.Components.lf lfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ef efVar, boolean z10) {
        this.c = lfVar;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = efVar;
        this.b = z10;
    }
}
