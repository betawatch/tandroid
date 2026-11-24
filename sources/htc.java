// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class htc implements ee, qob {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ htc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // qob
    public final void a(TLRPC.WallPaper wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override // ee
    public final void r(he heVar, int i) {
        this.a.C0();
    }
}
