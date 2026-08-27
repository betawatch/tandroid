package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class dj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ String d;
    public final /* synthetic */ SendMessagesHelper.DelayedMessage e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ SendMessagesHelper.DelayedMessage h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ HashMap r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object v;
    public final /* synthetic */ TLObject w;
    public final /* synthetic */ TLObject x;

    public /* synthetic */ dj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.b = sendMessagesHelper;
        this.v = tLObject;
        this.x = tL_messages_addPollAnswer;
        this.w = tLObject2;
        this.c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f = z10;
        this.h = delayedMessage2;
        this.n = obj;
        this.r = hashMap;
        this.s = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.x, this.w, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s);
                break;
            default:
                this.b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.w, (TLRPC.TL_messages_sendMedia) this.x, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s);
                break;
        }
    }

    public /* synthetic */ dj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.b = sendMessagesHelper;
        this.v = n2Var;
        this.w = tL_inputMediaStakeDice;
        this.x = tL_messages_sendMedia;
        this.c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f = z10;
        this.h = delayedMessage2;
        this.n = obj;
        this.r = hashMap;
        this.s = z11;
    }
}
