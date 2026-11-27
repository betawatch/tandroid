// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ky1 implements Runnable {
    public final /* synthetic */ r47 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ r47 d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public ky1(ChatActivityEnterView chatActivityEnterView, r47 r47Var, long j, TL_keyboard.KeyboardButtonProto keyboardButtonProto, r47 r47Var2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = r47Var;
        this.b = j;
        this.c = keyboardButtonProto;
        this.d = r47Var2;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f;
        zu1 zu1Var = chatActivityEnterView.E3;
        if (chatActivityEnterView.b2.Q() > hl.L(20.0f) || chatActivityEnterView.U0()) {
            chatActivityEnterView.N0(false);
            hl.t1(chatActivityEnterView);
            hl.d3(this, 150L);
            return;
        }
        if (zu1Var != null) {
            int i = chatActivityEnterView.R;
            long j = this.a.k.dialog_id;
            TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
            String text = keyboardButtonProto.getText();
            String url = keyboardButtonProto.getUrl();
            boolean c = ehb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
            r47 r47Var = this.d;
            gzc b = gzc.b(i, j, this.b, text, url, c ? 1 : 0, r47Var != null ? r47Var.k.id : 0, zu1Var == null ? 0L : zu1Var.k7(), null, false, null, null, 0, false, false);
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().l(b) != null) {
                ep0 ep0Var = chatActivityEnterView.m0;
                if (ep0Var != null) {
                    ep0Var.setOpened(false);
                    return;
                }
                return;
            }
            TLRPC.User user = this.e;
            String E1 = user == null ? null : uc7.s1(chatActivityEnterView.R).E1(user.restriction_reason);
            if (!TextUtils.isEmpty(E1)) {
                uc7.s1(chatActivityEnterView.R);
                uc7.f5(E1, zu1Var);
            } else {
                xw0 xw0Var = new xw0(chatActivityEnterView.getContext(), chatActivityEnterView.K4);
                xw0Var.m0 = chatActivityEnterView.D3;
                xw0Var.x(zu1Var, b);
                xw0Var.show();
            }
        }
    }
}
