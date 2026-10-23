package hi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ju0;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class m extends zt0 {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                ju0 ju0Var = new ju0();
                ju0Var.b = iArr[0];
                ju0Var.c = iArr[1];
                w9 w9Var = oVar.v;
                ju0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                ju0Var.a = imageReceiver;
                ju0Var.f = -oVar.b;
                ju0Var.e = imageReceiver.getBitmapSafe();
                ju0Var.g = -1L;
                ju0Var.h = oVar.v.getImageReceiver().getRoundRadius(true);
                ju0Var.k = 1.0f;
                ju0Var.p = true;
                return ju0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void f(String str, String str2, boolean z10) {
        this.a.E.p(str, str2, z10);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int y() {
        return 1;
    }
}
