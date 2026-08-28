package nh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o9;
import org.telegram.ui.bu0;
import org.telegram.ui.rt0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m extends rt0 {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
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
                bu0 bu0Var = new bu0();
                bu0Var.b = iArr[0];
                bu0Var.c = iArr[1];
                o9 o9Var = oVar.v;
                bu0Var.d = o9Var;
                ImageReceiver imageReceiver = o9Var.getImageReceiver();
                bu0Var.a = imageReceiver;
                bu0Var.f = -oVar.b;
                bu0Var.e = imageReceiver.getBitmapSafe();
                bu0Var.g = -1L;
                bu0Var.h = oVar.v.getImageReceiver().getRoundRadius(true);
                bu0Var.k = 1.0f;
                bu0Var.p = true;
                return bu0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void G() {
        this.a.v.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean M() {
        return true;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void f(String str, String str2, boolean z10) {
        this.a.A.q(str, str2, z10);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int y() {
        return 1;
    }
}
