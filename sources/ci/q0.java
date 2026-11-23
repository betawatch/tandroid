package ci;

import android.text.TextUtils;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ q0(z0 z0Var, String str, int i7) {
        this.a = i7;
        this.b = z0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        e eVar = (e) obj;
        switch (this.a) {
            case 0:
                z0 z0Var = this.b;
                if (TextUtils.equals(z0Var.d, this.c)) {
                    boolean z10 = z0Var.u0 == null;
                    z0Var.u0 = eVar;
                    if (!z0Var.w0) {
                        if (!z10) {
                            z0Var.j1(eVar);
                            break;
                        } else {
                            z0Var.t0.a(eVar);
                            z0Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                z0 z0Var2 = this.b;
                if (TextUtils.equals(z0Var2.e, this.c)) {
                    z0Var2.v0 = eVar;
                    if (z0Var2.w0 && z0Var2.x0 && z0Var2.B0) {
                        z0Var2.B0 = false;
                        z0Var2.A0 = System.currentTimeMillis() + 60000;
                        z0Var2.B2 = -1;
                    }
                    if (z0Var2.w0) {
                        z0Var2.j1(eVar);
                        break;
                    }
                }
                break;
        }
    }
}
