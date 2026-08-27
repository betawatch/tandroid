package oh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n9;
import org.telegram.ui.cu0;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class m extends st0 {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                cu0 cu0Var = new cu0();
                cu0Var.b = iArr[0];
                cu0Var.c = iArr[1];
                n9 n9Var = oVar.v;
                cu0Var.d = n9Var;
                ImageReceiver imageReceiver = n9Var.getImageReceiver();
                cu0Var.a = imageReceiver;
                cu0Var.f = -oVar.b;
                cu0Var.e = imageReceiver.getBitmapSafe();
                cu0Var.g = -1L;
                cu0Var.h = oVar.v.getImageReceiver().getRoundRadius(true);
                cu0Var.k = 1.0f;
                cu0Var.p = true;
                return cu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void f(String str, String str2, boolean z10) {
        this.a.A.q(str, str2, z10);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final int y() {
        return 1;
    }
}
