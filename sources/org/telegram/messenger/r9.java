package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.b = baseController;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.c2) this.c, (ve.d) this.d, (org.telegram.ui.ActionBar.o2) this.e, (Bundle) this.f, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.c, (org.telegram.ui.ActionBar.e6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.d6) this.f, tLObject, tL_error);
                break;
            case 2:
                ((SecretChatHelper) this.b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.c2) this.c, (byte[]) this.e, (TLRPC.User) this.f, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ r9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, byte[] bArr, TLRPC.User user) {
        this.a = 2;
        this.b = secretChatHelper;
        this.d = context;
        this.c = c2Var;
        this.e = bArr;
        this.f = user;
    }
}
