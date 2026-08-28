package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class bi implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ bi(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.b = sendMessagesHelper;
        this.d = str;
        this.k = list;
        this.f = z10;
        this.c = messageObject;
        this.l = keyboardButtonProto;
        this.e = qnVar;
        this.g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.i = inputCheckPasswordSRP;
        this.j = z11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.k, (TLRPC.TL_messages_addPollAnswer) this.l, this.c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f, (SendMessagesHelper.DelayedMessage) this.g, this.h, (HashMap) this.i, this.j, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$performSendMessageRequest$101((TLObject) this.k, this.c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f, (SendMessagesHelper.DelayedMessage) this.g, this.h, (HashMap) this.i, this.j, (TLRPC.Message) this.l, tLObject, tL_error);
                break;
            default:
                List list = (List) this.k;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.l;
                qn qnVar = (qn) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.g;
                TLObject[] tLObjectArr = (TLObject[]) this.h;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.i;
                boolean z10 = this.j;
                this.b.lambda$sendCallback$46(this.d, list, this.f, this.c, keyboardButtonProto, qnVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ bi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.b = sendMessagesHelper;
        this.k = tLObject;
        this.c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f = z10;
        this.g = delayedMessage2;
        this.h = obj;
        this.i = hashMap;
        this.j = z11;
        this.l = message;
    }

    public /* synthetic */ bi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.b = sendMessagesHelper;
        this.k = tL_messages_addPollAnswer;
        this.l = tL_messages_addPollAnswer2;
        this.c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f = z10;
        this.g = delayedMessage2;
        this.h = obj;
        this.i = hashMap;
        this.j = z11;
    }
}
