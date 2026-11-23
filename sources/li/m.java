package li;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p9;
import org.telegram.ui.oq0;
import org.telegram.ui.wq0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class m extends oq0 {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.a;
            TLRPC.Chat O0 = oVar.getMessagesController().O0(Long.valueOf(oVar.c));
            if (O0 == null || (chatPhoto = O0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.x.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.b = iArr[0];
                wq0Var.c = iArr[1];
                p9 p9Var = oVar.x;
                wq0Var.d = p9Var;
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                wq0Var.a = imageReceiver;
                wq0Var.f = -oVar.c;
                wq0Var.e = imageReceiver.p();
                wq0Var.g = -1L;
                wq0Var.h = oVar.x.getImageReceiver().F();
                wq0Var.k = 1.0f;
                wq0Var.p = true;
                return wq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void G() {
        this.a.x.getImageReceiver().P0(true, true);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void f(String str, String str2, boolean z10) {
        this.a.G.p(str, str2, z10);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int y() {
        return 1;
    }
}
