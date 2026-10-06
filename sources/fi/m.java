package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ou0;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class m extends ou0 {
    public final /* synthetic */ p a;

    public m(p pVar) {
        this.a = pVar;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                yu0 yu0Var = new yu0();
                yu0Var.b = iArr[0];
                yu0Var.c = iArr[1];
                w9 w9Var = pVar.v;
                yu0Var.d = w9Var;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                yu0Var.a = imageReceiver;
                yu0Var.f = -pVar.b;
                yu0Var.e = imageReceiver.getBitmapSafe();
                yu0Var.g = -1L;
                yu0Var.h = pVar.v.getImageReceiver().getRoundRadius(true);
                yu0Var.k = 1.0f;
                yu0Var.p = true;
                return yu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void f(String str, String str2, boolean z10) {
        this.a.E.q(str, str2, z10);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int y() {
        return 1;
    }
}
