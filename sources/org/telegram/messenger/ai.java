package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class ai implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ ai(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.a = i10;
        this.b = secretChatHelper;
        this.c = encryptedChat;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$acceptSecretChat$22(this.c, tLObject, tL_error);
                break;
            default:
                this.b.lambda$acceptSecretChat$23(this.c, tLObject, tL_error);
                break;
        }
    }
}
