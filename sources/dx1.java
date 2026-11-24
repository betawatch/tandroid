// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dx1 implements c39 {
    public final /* synthetic */ ChatActivityEnterView a;

    public dx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // c39
    public final void d(int i, View view) {
        if (view instanceof cp0) {
            String command = ((cp0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                ij.J(chatActivityEnterView.E3, chatActivityEnterView.G3, new q31(this, command, (byte) 20), chatActivityEnterView.L4);
                return;
            }
            mu1 mu1Var = chatActivityEnterView.F3;
            if (mu1Var == null || !mu1Var.k5(view)) {
                ij.X(chatActivityEnterView.R, chatActivityEnterView.G3, 1, new x0(this, command, (byte) 29));
            }
        }
    }
}
