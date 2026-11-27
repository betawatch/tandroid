// default package

import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ex1 implements pgc, hj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ex1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        switch (this.a) {
            case 1:
                this.b.F1(z, i, 0, 0L, true);
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                boolean F1 = chatActivityEnterView.F1(z, i, i2, 0L, true);
                q67 q67Var = chatActivityEnterView.M0;
                if (q67Var != null) {
                    q67Var.f(!F1);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                boolean F12 = chatActivityEnterView2.F1(z, i, i2, 0L, true);
                q67 q67Var2 = chatActivityEnterView2.M0;
                if (q67Var2 != null) {
                    q67Var2.f(!F12);
                    chatActivityEnterView2.M0 = null;
                    break;
                }
                break;
        }
    }
}
