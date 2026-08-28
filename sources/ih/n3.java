package ih;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ n3(m9 m9Var, int i9) {
        this.a = i9;
        this.b = m9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            case 1:
                m9 m9Var = this.b;
                m9Var.Y = true;
                m9Var.n(true);
                break;
            case 2:
                m9 m9Var2 = this.b;
                if (m9Var2.B != null) {
                    b9 b9Var = m9Var2.v;
                    if (b9Var != null) {
                        v.c = true;
                        b9Var.setLayerType(2, null);
                    }
                    m9Var2.B.addListener(new v8(m9Var2, 0));
                    m9Var2.B.setDuration(320L);
                    m9Var2.B.setInterpolator(gr.h);
                    m9Var2.B.start();
                    break;
                }
                break;
            case 3:
                m9 m9Var3 = this.b;
                m9Var3.r0 = null;
                m9Var3.P();
                break;
            case 4:
                this.b.L(true);
                break;
            case 5:
                m9 m9Var4 = this.b;
                m9Var4.Q();
                j9 j9Var = m9Var4.o0;
                ImageReceiver imageReceiver = j9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = j9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    break;
                }
                break;
            default:
                this.b.m();
                break;
        }
    }
}
