package gi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cv0;
import org.telegram.ui.su0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class m extends su0 {
    public final /* synthetic */ p a;

    public m(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                cv0 cv0Var = new cv0();
                cv0Var.b = iArr[0];
                cv0Var.c = iArr[1];
                x9 x9Var = pVar.v;
                cv0Var.d = x9Var;
                ImageReceiver imageReceiver = x9Var.getImageReceiver();
                cv0Var.a = imageReceiver;
                cv0Var.f = -pVar.b;
                cv0Var.e = imageReceiver.getBitmapSafe();
                cv0Var.g = -1L;
                cv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                cv0Var.k = 1.0f;
                cv0Var.p = true;
                return cv0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void f(String str, String str2, boolean z10) {
        this.a.E.q(str, str2, z10);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int y() {
        return 1;
    }
}
