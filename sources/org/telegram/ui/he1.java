package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class he1 implements org.telegram.ui.ActionBar.u1, l91 {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ he1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.l91
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        WallpapersListActivity.Z(this.a);
    }
}
