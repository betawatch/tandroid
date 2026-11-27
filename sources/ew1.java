// default package

import android.view.KeyEvent;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ew1 implements lq0, fd, vt3, l8 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ew1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // vt3
    public final void c() {
        int i = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F0.f();
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var != null) {
            xy1Var.d1(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override // l8
    public final void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        nx1 nx1Var;
        int i = ChatActivityEnterView.X7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (nx1Var = (chatActivityEnterView = this.a).O0) != null && nx1Var.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        int i2 = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.T();
        tx1 tx1Var = chatActivityEnterView.F0;
        if (tx1Var != null) {
            tx1Var.setText("");
        }
    }
}
