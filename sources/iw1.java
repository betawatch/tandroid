// default package

import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iw1 implements gj, e39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ iw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        if (!(view instanceof cp0)) {
            return false;
        }
        String str = ((cp0) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.b;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.n0.c();
        return true;
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        switch (this.a) {
            case 0:
                this.b.v1(z, i, i2, 0L, true);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                boolean v1 = chatActivityEnterView.v1(z, i, i2, 0L, true);
                j47 j47Var = chatActivityEnterView.M0;
                if (j47Var != null) {
                    j47Var.f(!v1);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
        }
    }
}
