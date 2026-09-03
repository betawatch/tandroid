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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class ni implements RequestDelegate {
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

    public /* synthetic */ ni(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z4, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z10) {
        this.b = sendMessagesHelper;
        this.d = str;
        this.k = list;
        this.f = z4;
        this.c = messageObject;
        this.l = keyboardButtonProto;
        this.e = znVar;
        this.g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.i = inputCheckPasswordSRP;
        this.j = z10;
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
                zn znVar = (zn) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.g;
                TLObject[] tLObjectArr = (TLObject[]) this.h;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.i;
                boolean z4 = this.j;
                this.b.lambda$sendCallback$46(this.d, list, this.f, this.c, keyboardButtonProto, znVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z4, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ ni(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10, TLRPC.Message message) {
        this.b = sendMessagesHelper;
        this.k = tLObject;
        this.c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f = z4;
        this.g = delayedMessage2;
        this.h = obj;
        this.i = hashMap;
        this.j = z10;
        this.l = message;
    }

    public /* synthetic */ ni(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.b = sendMessagesHelper;
        this.k = tL_messages_addPollAnswer;
        this.l = tL_messages_addPollAnswer2;
        this.c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f = z4;
        this.g = delayedMessage2;
        this.h = obj;
        this.i = hashMap;
        this.j = z10;
    }
}
