package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class sl implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ BaseController e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ sl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.b = j3;
        this.c = str;
        this.d = runnable;
        this.f = p2Var;
        this.g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f, this.c, (TranslateController.MessageKey) this.g, this.d, this.b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$292(this.b, this.c, this.d, (org.telegram.ui.ActionBar.p2) this.f, (TLRPC.TL_channels_updateUsername) this.g, (Runnable) this.h, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f, (TLRPC.FileLocation) this.g, (TLRPC.FileLocation) this.h, this.c, this.b, this.d, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ sl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.e = messagesController;
        this.f = tL_inputChatPhoto;
        this.g = fileLocation;
        this.h = fileLocation2;
        this.c = str;
        this.b = j3;
        this.d = runnable;
    }

    public /* synthetic */ sl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f = messageObject;
        this.c = str;
        this.g = messageKey;
        this.d = runnable;
        this.b = j3;
        this.h = tL_textWithEntities;
    }
}
