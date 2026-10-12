package gi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z9;
import org.telegram.ui.av0;
import org.telegram.ui.kv0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class m extends av0 {
    public final /* synthetic */ p a;

    public m(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                kv0 kv0Var = new kv0();
                kv0Var.b = iArr[0];
                kv0Var.c = iArr[1];
                z9 z9Var = pVar.v;
                kv0Var.d = z9Var;
                ImageReceiver imageReceiver = z9Var.getImageReceiver();
                kv0Var.a = imageReceiver;
                kv0Var.f = -pVar.b;
                kv0Var.e = imageReceiver.getBitmapSafe();
                kv0Var.g = -1L;
                kv0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                kv0Var.k = 1.0f;
                kv0Var.p = true;
                return kv0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void f(String str, String str2, boolean z10) {
        this.a.E.p(str, str2, z10);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final int y() {
        return 1;
    }
}
