package ii;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l9;
import org.telegram.ui.nq0;
import org.telegram.ui.wq0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class n extends nq0 {
    public final /* synthetic */ p a;

    public n(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
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
                wq0 wq0Var = new wq0();
                wq0Var.b = iArr[0];
                wq0Var.c = iArr[1];
                l9 l9Var = pVar.x;
                wq0Var.d = l9Var;
                ImageReceiver imageReceiver = l9Var.getImageReceiver();
                wq0Var.a = imageReceiver;
                wq0Var.f = -pVar.c;
                wq0Var.e = imageReceiver.p();
                wq0Var.g = -1L;
                wq0Var.h = pVar.x.getImageReceiver().E();
                wq0Var.k = 1.0f;
                wq0Var.p = true;
                return wq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void G() {
        this.a.x.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void f(String str, String str2, boolean z9) {
        this.a.F.p(str, str2, z9);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int y() {
        return 1;
    }
}
