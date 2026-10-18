package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.jf1;
import org.telegram.ui.sn;
import org.telegram.ui.t21;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class dk implements jf1, org.telegram.ui.Components.e5, LanguageDetector.StringCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.b = sendMessagesHelper;
        this.a = z10;
        this.c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f = snVar;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
        int i12 = ChatActivityEnterView.n5;
        chatActivityEnterView.e(document, str, this.e, sendAnimationData, this.a, z10, i10, i11);
    }

    @Override // org.telegram.ui.jf1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.b).lambda$sendCallback$43(this.a, (MessageObject) this.c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (sn) this.f, tL_inputCheckPasswordSRP);
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String[] strArr = (String[]) this.c;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        hg.d1 d1Var = (hg.d1) this.f;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(str2) || str.equals(TranslateController.UNKNOWN_LANGUAGE)) && ((this.a && !t21.Y().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        d1Var.run();
    }

    public /* synthetic */ dk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.b = chatActivityEnterView;
        this.c = document;
        this.d = str;
        this.e = obj;
        this.f = sendAnimationData;
        this.a = z10;
    }

    public /* synthetic */ dk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, hg.d1 d1Var) {
        this.b = profileActivity;
        this.c = strArr;
        this.d = zArr;
        this.e = str;
        this.a = z10;
        this.f = d1Var;
    }
}
