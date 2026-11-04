package ji;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k9;
import org.telegram.ui.eq0;
import org.telegram.ui.mq0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l extends eq0 {
    public final /* synthetic */ n a;

    public l(n nVar) {
        this.a = nVar;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
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
                mq0 mq0Var = new mq0();
                mq0Var.b = iArr[0];
                mq0Var.c = iArr[1];
                k9 k9Var = nVar.x;
                mq0Var.d = k9Var;
                ImageReceiver imageReceiver = k9Var.getImageReceiver();
                mq0Var.a = imageReceiver;
                mq0Var.f = -nVar.c;
                mq0Var.e = imageReceiver.p();
                mq0Var.g = -1L;
                mq0Var.h = nVar.x.getImageReceiver().E();
                mq0Var.k = 1.0f;
                mq0Var.p = true;
                return mq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void G() {
        this.a.x.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void f(String str, String str2, boolean z10) {
        this.a.G.p(str, str2, z10);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int y() {
        return 1;
    }
}
