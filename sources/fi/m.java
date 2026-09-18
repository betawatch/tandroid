package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u9;
import org.telegram.ui.fv0;
import org.telegram.ui.vu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class m extends vu0 {
    public final /* synthetic */ p a;

    public m(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                fv0 fv0Var = new fv0();
                fv0Var.b = iArr[0];
                fv0Var.c = iArr[1];
                u9 u9Var = pVar.v;
                fv0Var.d = u9Var;
                ImageReceiver imageReceiver = u9Var.getImageReceiver();
                fv0Var.a = imageReceiver;
                fv0Var.f = -pVar.b;
                fv0Var.e = imageReceiver.getBitmapSafe();
                fv0Var.g = -1L;
                fv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                fv0Var.k = 1.0f;
                fv0Var.p = true;
                return fv0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void f(String str, String str2, boolean z10) {
        this.a.E.q(str, str2, z10);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final int y() {
        return 1;
    }
}
