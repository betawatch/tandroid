// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class erc implements ed, pmb {
    public final /* synthetic */ WallpapersListActivity a;

    public /* synthetic */ erc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // pmb
    public final void a(TLRPC.WallPaper wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        this.a.B0();
    }
}
