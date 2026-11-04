package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.r4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ np(nq nqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.c = nqVar;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        ((org.telegram.ui.Components.nf) this.c).B((View) this.d, this.e, this.a, this.f, z10, i3, i10, (org.telegram.messenger.ye) this.h, this.b);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        nq nqVar = (nq) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        nqVar.getClass();
        nqVar.y0(user.id, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, nqVar.e1 == 1 ? 0 : 1, false);
    }

    public /* synthetic */ np(org.telegram.ui.Components.nf nfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ye yeVar, boolean z10) {
        this.c = nfVar;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = yeVar;
        this.b = z10;
    }
}
