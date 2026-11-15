package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.xe;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ a0(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0 p0Var;
        p0 p0Var2;
        p0 p0Var3;
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                if (!m0Var.k() && (p0Var = m0Var.s) != null) {
                    p0Var.setShown(false);
                    break;
                }
                break;
            case 1:
                m0 m0Var2 = this.b;
                if (!m0Var2.k() && (p0Var2 = m0Var2.s) != null) {
                    p0Var2.e();
                    break;
                }
                break;
            case 2:
                xe xeVar = this.b.f.b.F0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.b.f.b;
                chatActivityEnterView.y1 = 0L;
                chatActivityEnterView.z1 = null;
                break;
            case 4:
                m0 m0Var3 = this.b;
                ae aeVar = m0Var3.f;
                String t6 = m0Var3.t();
                f0 f0Var = new f0(m0Var3, 0);
                aeVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = aeVar.b;
                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(chatActivityEnterView2.getContext(), chatActivityEnterView2.E4);
                d0Var.s1(t6);
                d0Var.f2 = f0Var;
                d0Var.show();
                break;
            case 5:
                xe xeVar2 = this.b.f.b.F0;
                if (xeVar2 != null) {
                    xeVar2.requestFocus();
                    break;
                }
                break;
            case 6:
                m0 m0Var4 = this.b;
                if (m0Var4.r == 3 && (p0Var3 = m0Var4.s) != null) {
                    p0Var3.e();
                    break;
                }
                break;
            case 7:
                m0 m0Var5 = this.b;
                int i7 = m0Var5.r;
                if (i7 == 3 || i7 == 4) {
                    m0Var5.w.setIsland(true);
                    break;
                }
                break;
            case 8:
                m0 m0Var6 = this.b;
                if (m0Var6.r == 1) {
                    m0Var6.B(true);
                    break;
                }
                break;
            case 9:
                m0 m0Var7 = this.b;
                if (m0Var7.r == 1) {
                    m0Var7.B(false);
                    break;
                }
                break;
            case 10:
                er erVar = er.h;
                m0 m0Var8 = this.b;
                m0Var8.b(0.0f, 320L, erVar);
                org.telegram.messenger.g0.i3(new a0(m0Var8, 1), 360L);
                break;
            default:
                m0 m0Var9 = this.b;
                if (!m0Var9.k()) {
                    m0Var9.f.b.A1(null, true);
                    m0Var9.b(0.0f, 240L, er.g);
                    break;
                }
                break;
        }
    }
}
