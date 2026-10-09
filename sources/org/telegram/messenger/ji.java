package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class ji implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.b = sendMessagesHelper;
        this.d = str;
        this.g = list;
        this.e = z10;
        this.c = messageObject;
        this.h = keyboardButtonProto;
        this.i = znVar;
        this.j = twoStepVerificationActivity;
        this.k = tLObjectArr;
        this.l = inputCheckPasswordSRP;
        this.f = z11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                List list = (List) this.g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                zn znVar = (zn) this.i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.j;
                TLObject[] tLObjectArr = (TLObject[]) this.k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.l;
                boolean z10 = this.f;
                this.b.lambda$sendCallback$49(this.d, list, this.e, this.c, keyboardButtonProto, znVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.g, (TLRPC.TL_messages_addPollAnswer) this.h, this.c, this.d, (SendMessagesHelper.DelayedMessage) this.i, this.e, (SendMessagesHelper.DelayedMessage) this.j, this.k, (HashMap) this.l, this.f, tLObject, tL_error);
                break;
            default:
                this.b.lambda$performSendMessageRequest$104((TLObject) this.g, this.c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.i, this.j, (HashMap) this.k, this.f, (TLRPC.Message) this.l, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.b = sendMessagesHelper;
        this.g = tLObject;
        this.c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.i = delayedMessage2;
        this.j = obj;
        this.k = hashMap;
        this.f = z11;
        this.l = message;
    }

    public /* synthetic */ ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.b = sendMessagesHelper;
        this.g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.c = messageObject;
        this.d = str;
        this.i = delayedMessage;
        this.e = z10;
        this.j = delayedMessage2;
        this.k = obj;
        this.l = hashMap;
        this.f = z11;
    }
}
