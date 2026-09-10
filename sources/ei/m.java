package ei;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ev0;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class m extends tu0 {
    public final /* synthetic */ p a;

    public m(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                ev0 ev0Var = new ev0();
                ev0Var.b = iArr[0];
                ev0Var.c = iArr[1];
                w9 w9Var = pVar.v;
                ev0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                ev0Var.a = imageReceiver;
                ev0Var.f = -pVar.b;
                ev0Var.e = imageReceiver.getBitmapSafe();
                ev0Var.g = -1L;
                ev0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                ev0Var.k = 1.0f;
                ev0Var.p = true;
                return ev0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void f(String str, String str2, boolean z10) {
        this.a.E.q(str, str2, z10);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int y() {
        return 1;
    }
}
