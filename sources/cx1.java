// default package

import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cx1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ cx1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j67 j67Var;
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                if (!z) {
                    chatActivityEnterView.j2.setVisibility(8);
                    break;
                }
                break;
            case 1:
                int i2 = ChatActivityEnterView.z7;
                if (!z) {
                    chatActivityEnterView.k2.setVisibility(8);
                    break;
                }
                break;
            default:
                int i3 = ChatActivityEnterView.z7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                mw1 mw1Var = chatActivityEnterView2.e6;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean x1 = chatActivityEnterView2.x1(false, 0, 0, 0L, true);
                if (!z && (j67Var = chatActivityEnterView2.M0) != null) {
                    j67Var.f(!x1);
                    chatActivityEnterView2.M0 = null;
                    break;
                } else {
                    chatActivityEnterView2.d6 = !x1;
                    gm.r(mw1Var);
                    gm.d3(mw1Var, 500L);
                    break;
                }
                break;
        }
    }
}
