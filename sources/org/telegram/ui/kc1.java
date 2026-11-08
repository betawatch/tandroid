package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc1 implements org.telegram.ui.ActionBar.r1, u71 {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ kc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.u71
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        WallpapersListActivity.a0(this.a);
    }
}
