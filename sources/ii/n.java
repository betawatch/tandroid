package ii;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l9;
import org.telegram.ui.pq0;
import org.telegram.ui.yq0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class n extends pq0 {
    public final /* synthetic */ p a;

    public n(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final yq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
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
                yq0 yq0Var = new yq0();
                yq0Var.b = iArr[0];
                yq0Var.c = iArr[1];
                l9 l9Var = pVar.x;
                yq0Var.d = l9Var;
                ImageReceiver imageReceiver = l9Var.getImageReceiver();
                yq0Var.a = imageReceiver;
                yq0Var.f = -pVar.c;
                yq0Var.e = imageReceiver.p();
                yq0Var.g = -1L;
                yq0Var.h = pVar.x.getImageReceiver().E();
                yq0Var.k = 1.0f;
                yq0Var.p = true;
                return yq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void G() {
        this.a.x.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void f(String str, String str2, boolean z9) {
        this.a.F.p(str, str2, z9);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final int y() {
        return 1;
    }
}
