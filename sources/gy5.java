// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gy5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xma c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gy5(xma xmaVar, Object obj, int i, byte b) {
        this.a = b;
        this.c = xmaVar;
        this.d = obj;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.d;
        xma xmaVar = this.c;
        switch (b) {
            case 0:
                wy5 wy5Var = (wy5) xmaVar;
                if (wy5Var.K1 == ((ly5) obj)) {
                    wy5Var.K1 = null;
                }
                wy5Var.q0(false);
                wy5Var.E0(i);
                break;
            default:
                dx7 dx7Var = (dx7) xmaVar;
                dx7Var.Y1 = null;
                if (((boolean[]) obj)[0]) {
                    dx7Var.y0(false);
                }
                dx7Var.Q0(i);
                break;
        }
    }
}
