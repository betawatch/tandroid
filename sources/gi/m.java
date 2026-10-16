package gi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z9;
import org.telegram.ui.jv0;
import org.telegram.ui.zu0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class m extends zu0 {
    public final /* synthetic */ p a;

    public m(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            p pVar = this.a;
            TLRPC.Chat chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                pVar.v.getLocationInWindow(iArr);
                jv0 jv0Var = new jv0();
                jv0Var.b = iArr[0];
                jv0Var.c = iArr[1];
                z9 z9Var = pVar.v;
                jv0Var.d = z9Var;
                ImageReceiver imageReceiver = z9Var.getImageReceiver();
                jv0Var.a = imageReceiver;
                jv0Var.f = -pVar.b;
                jv0Var.e = imageReceiver.getBitmapSafe();
                jv0Var.g = -1L;
                jv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                jv0Var.k = 1.0f;
                jv0Var.p = true;
                return jv0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void f(String str, String str2, boolean z10) {
        this.a.E.p(str, str2, z10);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int y() {
        return 1;
    }
}
