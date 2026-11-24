// default package

import android.os.RemoteException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class nv6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tv6 b;

    public /* synthetic */ nv6(tv6 tv6Var, byte b) {
        this.a = b;
        this.b = tv6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tv6 tv6Var = this.b;
        switch (b) {
            case 0:
                tv6Var.getClass();
                return;
            case 1:
                synchronized (tv6Var.a) {
                    if (tv6Var.v) {
                        return;
                    }
                    final l6a R0 = tv6Var.t.R0();
                    if (!tv6Var.c.hasMessages(1)) {
                        l6a l6aVar = tv6Var.s.c;
                        nc8 nc8Var = R0.a;
                        int i = nc8Var.b;
                        nc8 nc8Var2 = l6aVar.a;
                        if (i == nc8Var2.b && nc8Var.e == nc8Var2.e && nc8Var.h == nc8Var2.h && nc8Var.i == nc8Var2.i) {
                            mv6 mv6Var = tv6Var.g.b;
                            mm5 K = mv6Var.K();
                            for (int i2 = 0; i2 < K.size(); i2++) {
                                final su6 su6Var = (su6) K.get(i2);
                                mv6Var.x0();
                                final boolean X = mv6Var.X(su6Var, 16);
                                final boolean X2 = mv6Var.X(su6Var, 17);
                                tv6Var.c(su6Var, new sv6() { // from class: ov6
                                    @Override // sv6
                                    public final void f(ru6 ru6Var, int i3) {
                                        ru6Var.i(i3, l6a.this, X, X2, su6Var.c);
                                    }
                                });
                            }
                            try {
                                tv6Var.h.l.i(0, R0, true, true, 0);
                            } catch (RemoteException e) {
                                lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                            }
                        }
                    }
                    tv6Var.r();
                    return;
                }
            default:
                tv6Var.r();
                return;
        }
    }
}
