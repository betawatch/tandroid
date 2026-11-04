package bi;

import android.text.TextUtils;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ r0(a1 a1Var, String str, int i3) {
        this.a = i3;
        this.b = a1Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        e eVar = (e) obj;
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                if (TextUtils.equals(a1Var.d, this.c)) {
                    boolean z10 = a1Var.u0 == null;
                    a1Var.u0 = eVar;
                    if (!a1Var.w0) {
                        if (!z10) {
                            a1Var.j1(eVar);
                            break;
                        } else {
                            a1Var.t0.a(eVar);
                            a1Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                a1 a1Var2 = this.b;
                if (TextUtils.equals(a1Var2.e, this.c)) {
                    a1Var2.v0 = eVar;
                    if (a1Var2.w0 && a1Var2.x0 && a1Var2.B0) {
                        a1Var2.B0 = false;
                        a1Var2.A0 = System.currentTimeMillis() + 60000;
                        a1Var2.B2 = -1;
                    }
                    if (a1Var2.w0) {
                        a1Var2.j1(eVar);
                        break;
                    }
                }
                break;
        }
    }
}
