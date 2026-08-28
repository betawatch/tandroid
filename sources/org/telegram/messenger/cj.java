package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b31;
import org.telegram.ui.nf1;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class cj implements nf1, org.telegram.ui.Components.x4, LanguageDetector.StringCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.b = sendMessagesHelper;
        this.a = z10;
        this.c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f = qnVar;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
        int i11 = ChatActivityEnterView.i5;
        chatActivityEnterView.a(document, str, this.e, sendAnimationData, this.a, z10, i9, i10);
    }

    @Override // org.telegram.ui.nf1
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.b).lambda$sendCallback$40(this.a, (MessageObject) this.c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (qn) this.f, tL_inputCheckPasswordSRP);
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String[] strArr = (String[]) this.c;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        fh.u2 u2Var = (fh.u2) this.f;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(str2) || str.equals(TranslateController.UNKNOWN_LANGUAGE)) && ((this.a && !b31.X().contains(str)) || ((chat = profileActivity.A2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        u2Var.run();
    }

    public /* synthetic */ cj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.b = chatActivityEnterView;
        this.c = document;
        this.d = str;
        this.e = obj;
        this.f = sendAnimationData;
        this.a = z10;
    }

    public /* synthetic */ cj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, fh.u2 u2Var) {
        this.b = profileActivity;
        this.c = strArr;
        this.d = zArr;
        this.e = str;
        this.a = z10;
        this.f = u2Var;
    }
}
