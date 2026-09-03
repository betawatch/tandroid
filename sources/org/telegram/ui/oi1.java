package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oi1 implements org.telegram.ui.ActionBar.c2, id1 {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ oi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.id1
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.h0;
        this.a.removeSelfFromStack();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        WallpapersListActivity.U(this.a);
    }
}
