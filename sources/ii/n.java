package ii;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k9;
import org.telegram.ui.qq0;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class n extends qq0 {
    public final /* synthetic */ p a;

    public n(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final zq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.a;
            TLRPC.Chat M0 = pVar.getMessagesController().M0(Long.valueOf(pVar.c));
            if (M0 == null || (chatPhoto = M0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.x.getLocationInWindow(iArr);
                zq0 zq0Var = new zq0();
                zq0Var.b = iArr[0];
                zq0Var.c = iArr[1];
                k9 k9Var = pVar.x;
                zq0Var.d = k9Var;
                ImageReceiver imageReceiver = k9Var.getImageReceiver();
                zq0Var.a = imageReceiver;
                zq0Var.f = -pVar.c;
                zq0Var.e = imageReceiver.p();
                zq0Var.g = -1L;
                zq0Var.h = pVar.x.getImageReceiver().E();
                zq0Var.k = 1.0f;
                zq0Var.p = true;
                return zq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void G() {
        this.a.x.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void f(String str, String str2, boolean z9) {
        this.a.F.p(str, str2, z9);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int y() {
        return 1;
    }
}
