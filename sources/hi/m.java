package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.cu0;
import org.telegram.ui.mu0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class m extends cu0 {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.a;
            TLRPC.Chat chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.c));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.w.getLocationInWindow(iArr);
                mu0 mu0Var = new mu0();
                mu0Var.b = iArr[0];
                mu0Var.c = iArr[1];
                w9 w9Var = oVar.w;
                mu0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                mu0Var.a = imageReceiver;
                mu0Var.f = -oVar.c;
                mu0Var.e = imageReceiver.getBitmapSafe();
                mu0Var.g = -1L;
                mu0Var.h = oVar.w.getImageReceiver().getRoundRadius(true);
                mu0Var.k = 1.0f;
                mu0Var.p = true;
                return mu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void G() {
        this.a.w.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void f(String str, String str2, boolean z10) {
        this.a.F.p(str, str2, z10);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final int y() {
        return 1;
    }
}
