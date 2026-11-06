package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc1 implements org.telegram.ui.ActionBar.r1, t71 {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ jc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.t71
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        WallpapersListActivity.a0(this.a);
    }
}
