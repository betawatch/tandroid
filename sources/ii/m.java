package ii;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.gu0;
import org.telegram.ui.qu0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class m extends gu0 {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                qu0 qu0Var = new qu0();
                qu0Var.b = iArr[0];
                qu0Var.c = iArr[1];
                y9 y9Var = oVar.w;
                qu0Var.d = y9Var;
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                qu0Var.a = imageReceiver;
                qu0Var.f = -oVar.c;
                qu0Var.e = imageReceiver.getBitmapSafe();
                qu0Var.g = -1L;
                qu0Var.h = oVar.w.getImageReceiver().getRoundRadius(true);
                qu0Var.k = 1.0f;
                qu0Var.p = true;
                return qu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void G() {
        this.a.w.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void f(String str, String str2, boolean z10) {
        this.a.F.p(str, str2, z10);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final int y() {
        return 1;
    }
}
