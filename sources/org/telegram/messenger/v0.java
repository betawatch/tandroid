package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v0(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((ChatObject.Call) this.c).lambda$loadMembers$3(this.b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.c).lambda$loadAvatarConstructor$242((SharedPreferences) this.d, this.b, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.b, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.c).lambda$getBlockedPeers$113(this.b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController.CommonChatsList) this.c).lambda$load$1((int[]) this.d, this.b, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ v0(Object obj, boolean z10, TLObject tLObject, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
        this.d = tLObject;
    }
}
