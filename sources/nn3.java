// default package

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nn3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ un3 b;

    public /* synthetic */ nn3(un3 un3Var, byte b) {
        this.a = b;
        this.b = un3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xn3 xn3Var;
        xn3 xn3Var2;
        xn3 xn3Var3;
        byte b = this.a;
        byte b2 = 1;
        un3 un3Var = this.b;
        switch (b) {
            case 0:
                if (!un3Var.q() && (xn3Var = un3Var.s) != null) {
                    xn3Var.setShown(false);
                    break;
                }
                break;
            case 1:
                if (!un3Var.q() && (xn3Var2 = un3Var.s) != null) {
                    xn3Var2.e();
                    break;
                }
                break;
            case 2:
                sy1 sy1Var = un3Var.f.a.F0;
                if (sy1Var != null) {
                    sy1Var.requestFocus();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = un3Var.f.a;
                chatActivityEnterView.G1 = 0L;
                chatActivityEnterView.H1 = null;
                break;
            case 4:
                d dVar = un3Var.f;
                String z = un3Var.z();
                sk3 sk3Var = new sk3(un3Var, (byte) 3);
                dVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = dVar.a;
                a1 a1Var = new a1(chatActivityEnterView2.getContext(), chatActivityEnterView2.L4);
                a1Var.o1(z);
                a1Var.e2 = sk3Var;
                a1Var.show();
                break;
            case 5:
                sy1 sy1Var2 = un3Var.f.a.F0;
                if (sy1Var2 != null) {
                    sy1Var2.requestFocus();
                    break;
                }
                break;
            case 6:
                if (un3Var.r == 3 && (xn3Var3 = un3Var.s) != null) {
                    xn3Var3.e();
                    break;
                }
                break;
            case 7:
                byte b3 = un3Var.r;
                if (b3 == 3 || b3 == 4) {
                    un3Var.w.setIsland(true);
                    break;
                }
                break;
            case 8:
                if (un3Var.r == 1) {
                    un3Var.M(true);
                    break;
                }
                break;
            case 9:
                if (un3Var.r == 1) {
                    un3Var.M(false);
                    break;
                }
                break;
            case 10:
                un3Var.b(0.0f, 320L, d53.h);
                gm.d3(new nn3(un3Var, b2), 360L);
                break;
            default:
                if (!un3Var.q()) {
                    un3Var.f.a.O1(null, true);
                    un3Var.b(0.0f, 240L, d53.g);
                    break;
                }
                break;
        }
    }
}
