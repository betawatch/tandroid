package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class aa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ aa(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
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
                ((MessagesController) this.b).lambda$checkCanOpenChat$458((org.telegram.ui.ActionBar.e2) this.c, (qf.c) this.d, (org.telegram.ui.ActionBar.r2) this.e, (Bundle) this.f, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.c, (org.telegram.ui.ActionBar.x6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.w6) this.f, tLObject, tL_error);
                break;
            case 2:
                ((SecretChatHelper) this.b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.e2) this.c, (byte[]) this.e, (TLRPC.User) this.f, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ aa(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.e2 e2Var, byte[] bArr, TLRPC.User user) {
        this.a = 2;
        this.b = secretChatHelper;
        this.d = context;
        this.c = e2Var;
        this.e = bArr;
        this.f = user;
    }
}
