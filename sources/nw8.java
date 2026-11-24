// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nw8 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vw8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ nw8(vw8 vw8Var, String str, byte b) {
        this.a = b;
        this.b = vw8Var;
        this.c = str;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        String str = this.c;
        vw8 vw8Var = this.b;
        gv8 gv8Var = (gv8) obj;
        switch (b) {
            case 0:
                if (TextUtils.equals(vw8Var.d, str)) {
                    boolean z = vw8Var.u0 == null;
                    vw8Var.u0 = gv8Var;
                    if (!vw8Var.w0) {
                        if (!z) {
                            vw8Var.i1(gv8Var);
                            break;
                        } else {
                            vw8Var.t0.a(gv8Var);
                            vw8Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                if (TextUtils.equals(vw8Var.e, str)) {
                    vw8Var.v0 = gv8Var;
                    if (vw8Var.w0 && vw8Var.x0 && vw8Var.B0) {
                        vw8Var.B0 = false;
                        vw8Var.A0 = System.currentTimeMillis() + 60000;
                        vw8Var.B2 = -1;
                    }
                    if (vw8Var.w0) {
                        vw8Var.i1(gv8Var);
                        break;
                    }
                }
                break;
        }
    }
}
