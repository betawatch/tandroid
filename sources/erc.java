// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
