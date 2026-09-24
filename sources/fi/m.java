package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.lu0;
import org.telegram.ui.vu0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class m extends lu0 {
    public final /* synthetic */ p a;

    public m(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                vu0 vu0Var = new vu0();
                vu0Var.b = iArr[0];
                vu0Var.c = iArr[1];
                w9 w9Var = pVar.v;
                vu0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                vu0Var.a = imageReceiver;
                vu0Var.f = -pVar.b;
                vu0Var.e = imageReceiver.getBitmapSafe();
                vu0Var.g = -1L;
                vu0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                vu0Var.k = 1.0f;
                vu0Var.p = true;
                return vu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void f(String str, String str2, boolean z10) {
        this.a.E.q(str, str2, z10);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final int y() {
        return 1;
    }
}
