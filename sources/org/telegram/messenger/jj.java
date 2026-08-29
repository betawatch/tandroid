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
import org.telegram.ui.pf1;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class jj implements pf1, org.telegram.ui.Components.b5, LanguageDetector.StringCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, tn tnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.b = sendMessagesHelper;
        this.a = z10;
        this.c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f = tnVar;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
        int i12 = ChatActivityEnterView.i5;
        chatActivityEnterView.a(document, str, this.e, sendAnimationData, this.a, z10, i10, i11);
    }

    @Override // org.telegram.ui.pf1
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.b).lambda$sendCallback$40(this.a, (MessageObject) this.c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (tn) this.f, tL_inputCheckPasswordSRP);
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String[] strArr = (String[]) this.c;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        ih.m2 m2Var = (ih.m2) this.f;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(str2) || str.equals(TranslateController.UNKNOWN_LANGUAGE)) && ((this.a && !b31.Y().contains(str)) || ((chat = profileActivity.A2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        m2Var.run();
    }

    public /* synthetic */ jj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.b = chatActivityEnterView;
        this.c = document;
        this.d = str;
        this.e = obj;
        this.f = sendAnimationData;
        this.a = z10;
    }

    public /* synthetic */ jj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, ih.m2 m2Var) {
        this.b = profileActivity;
        this.c = strArr;
        this.d = zArr;
        this.e = str;
        this.a = z10;
        this.f = m2Var;
    }
}
