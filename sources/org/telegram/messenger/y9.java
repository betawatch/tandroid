package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class y9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                ((MessagesController) this.b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.d2) this.c, (af.f) this.d, (org.telegram.ui.ActionBar.p2) this.e, (Bundle) this.f, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.c, (org.telegram.ui.ActionBar.j6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.i6) this.f, tLObject, tL_error);
                break;
            case 2:
                ((SecretChatHelper) this.b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.d2) this.c, (byte[]) this.e, (TLRPC.User) this.f, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ y9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.d2 d2Var, byte[] bArr, TLRPC.User user) {
        this.a = 2;
        this.b = secretChatHelper;
        this.d = context;
        this.c = d2Var;
        this.e = bArr;
        this.f = user;
    }
}
