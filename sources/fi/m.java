package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.mu0;
import org.telegram.ui.wu0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class m extends mu0 {
    public final /* synthetic */ p a;

    public m(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                wu0 wu0Var = new wu0();
                wu0Var.b = iArr[0];
                wu0Var.c = iArr[1];
                w9 w9Var = pVar.v;
                wu0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                wu0Var.a = imageReceiver;
                wu0Var.f = -pVar.b;
                wu0Var.e = imageReceiver.getBitmapSafe();
                wu0Var.g = -1L;
                wu0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                wu0Var.k = 1.0f;
                wu0Var.p = true;
                return wu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void f(String str, String str2, boolean z10) {
        this.a.E.q(str, str2, z10);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final int y() {
        return 1;
    }
}
