// default package

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mw1 implements hj, ez5, b7c {
    public final /* synthetic */ Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fn7 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mw1(zu1 zu1Var, r47 r47Var, r7a r7aVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        this.c = r7aVar;
        this.b = z;
        this.d = r47Var;
        this.a = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f = zu1Var;
    }

    @Override // ez5
    public final void a(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        String[] strArr = (String[]) this.d;
        boolean[] zArr = (boolean[]) this.e;
        String str2 = (String) this.a;
        st stVar = (st) this.f;
        RectF rectF = ProfileActivity.Z6;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(str2) || str.equals("und")) && ((this.b && !ee9.b0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || xc2.t0(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        stVar.run();
    }

    @Override // b7c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((r7a) this.c).m0(this.b, (r47) this.d, (TL_keyboard.KeyboardButtonProto) this.a, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.e, (zu1) this.f);
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        String str = (String) this.a;
        n47 n47Var = (n47) this.f;
        int i3 = ChatActivityEnterView.X7;
        chatActivityEnterView.e(document, str, this.e, n47Var, this.b, z, i, i2);
    }

    public /* synthetic */ mw1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, n47 n47Var, boolean z) {
        this.c = chatActivityEnterView;
        this.d = document;
        this.a = str;
        this.e = obj;
        this.f = n47Var;
        this.b = z;
    }

    public /* synthetic */ mw1(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z, st stVar) {
        this.c = profileActivity;
        this.d = strArr;
        this.e = zArr;
        this.a = str;
        this.b = z;
        this.f = stVar;
    }
}
