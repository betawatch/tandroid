package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ig1;
import org.telegram.ui.t31;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class nj implements ig1, org.telegram.ui.Components.y4, LanguageDetector.StringCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4) {
        this.b = sendMessagesHelper;
        this.a = z4;
        this.c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f = xnVar;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
        int i12 = ChatActivityEnterView.j5;
        chatActivityEnterView.d(document, str, this.e, sendAnimationData, this.a, z4, i10, i11);
    }

    @Override // org.telegram.ui.ig1
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.b).lambda$sendCallback$40(this.a, (MessageObject) this.c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (xn) this.f, tL_inputCheckPasswordSRP);
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String[] strArr = (String[]) this.c;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        lh.l2 l2Var = (lh.l2) this.f;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(str2) || str.equals(TranslateController.UNKNOWN_LANGUAGE)) && ((this.a && !t31.Y().contains(str)) || ((chat = profileActivity.B2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        l2Var.run();
    }

    public /* synthetic */ nj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4) {
        this.b = chatActivityEnterView;
        this.c = document;
        this.d = str;
        this.e = obj;
        this.f = sendAnimationData;
        this.a = z4;
    }

    public /* synthetic */ nj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z4, lh.l2 l2Var) {
        this.b = profileActivity;
        this.c = strArr;
        this.d = zArr;
        this.e = str;
        this.a = z4;
        this.f = l2Var;
    }
}
