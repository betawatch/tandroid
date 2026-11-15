package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc1 implements org.telegram.ui.ActionBar.q1, s71 {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ jc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.s71
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        WallpapersListActivity.a0(this.a);
    }
}
