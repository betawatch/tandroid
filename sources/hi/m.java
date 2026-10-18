package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.bu0;
import org.telegram.ui.lu0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class m extends bu0 {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            o oVar = this.a;
            TLRPC.Chat chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                oVar.v.getLocationInWindow(iArr);
                lu0 lu0Var = new lu0();
                lu0Var.b = iArr[0];
                lu0Var.c = iArr[1];
                w9 w9Var = oVar.v;
                lu0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                lu0Var.a = imageReceiver;
                lu0Var.f = -oVar.b;
                lu0Var.e = imageReceiver.getBitmapSafe();
                lu0Var.g = -1L;
                lu0Var.h = oVar.v.getImageReceiver().getRoundRadius(true);
                lu0Var.k = 1.0f;
                lu0Var.p = true;
                return lu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void f(String str, String str2, boolean z10) {
        this.a.E.p(str, str2, z10);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final int y() {
        return 1;
    }
}
