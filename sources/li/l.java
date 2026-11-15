package li;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i9;
import org.telegram.ui.mq0;
import org.telegram.ui.uq0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class l extends mq0 {
    public final /* synthetic */ n a;

    public l(n nVar) {
        this.a = nVar;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            n nVar = this.a;
            TLRPC.Chat M0 = nVar.getMessagesController().M0(Long.valueOf(nVar.c));
            if (M0 == null || (chatPhoto = M0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                nVar.x.getLocationInWindow(iArr);
                uq0 uq0Var = new uq0();
                uq0Var.b = iArr[0];
                uq0Var.c = iArr[1];
                i9 i9Var = nVar.x;
                uq0Var.d = i9Var;
                ImageReceiver imageReceiver = i9Var.getImageReceiver();
                uq0Var.a = imageReceiver;
                uq0Var.f = -nVar.c;
                uq0Var.e = imageReceiver.p();
                uq0Var.g = -1L;
                uq0Var.h = nVar.x.getImageReceiver().E();
                uq0Var.k = 1.0f;
                uq0Var.p = true;
                return uq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void G() {
        this.a.x.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void f(String str, String str2, boolean z10) {
        this.a.G.p(str, str2, z10);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int y() {
        return 1;
    }
}
