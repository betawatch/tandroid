package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc1 implements org.telegram.ui.ActionBar.r1, w71 {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ mc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.w71
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        WallpapersListActivity.a0(this.a);
    }
}
