package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a31;
import org.telegram.ui.sf1;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class jk implements sf1, org.telegram.ui.Components.e5, LanguageDetector.StringCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.b = sendMessagesHelper;
        this.a = z10;
        this.c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f = wnVar;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
        int i12 = ChatActivityEnterView.r5;
        chatActivityEnterView.a(document, str, this.e, sendAnimationData, this.a, z10, i10, i11);
    }

    @Override // org.telegram.ui.sf1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.b).lambda$sendCallback$43(this.a, (MessageObject) this.c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (wn) this.f, tL_inputCheckPasswordSRP);
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String[] strArr = (String[]) this.c;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        ig.d1 d1Var = (ig.d1) this.f;
        int i10 = ProfileActivity.R6;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(str2) || str.equals(TranslateController.UNKNOWN_LANGUAGE)) && ((this.a && !a31.Z().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        d1Var.run();
    }

    public /* synthetic */ jk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.b = chatActivityEnterView;
        this.c = document;
        this.d = str;
        this.e = obj;
        this.f = sendAnimationData;
        this.a = z10;
    }

    public /* synthetic */ jk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, ig.d1 d1Var) {
        this.b = profileActivity;
        this.c = strArr;
        this.d = zArr;
        this.e = str;
        this.a = z10;
        this.f = d1Var;
    }
}
