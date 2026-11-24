// default package

import android.view.KeyEvent;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dx1 implements lr0, ee, ou3, k8 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ dx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // ou3
    public final void m() {
        int i = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F0.f();
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var != null) {
            uz1Var.c1(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        my1 my1Var;
        int i = ChatActivityEnterView.z7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (my1Var = (chatActivityEnterView = this.a).O0) != null && my1Var.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        int i2 = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.Q();
        sy1 sy1Var = chatActivityEnterView.F0;
        if (sy1Var != null) {
            sy1Var.setText("");
        }
    }
}
