// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class by5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fla c;
    public final /* synthetic */ Object d;

    public /* synthetic */ by5(fla flaVar, Object obj, int i, byte b) {
        this.a = b;
        this.c = flaVar;
        this.d = obj;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.d;
        fla flaVar = this.c;
        switch (b) {
            case 0:
                ry5 ry5Var = (ry5) flaVar;
                if (ry5Var.Q1 == ((gy5) obj)) {
                    ry5Var.Q1 = null;
                }
                ry5Var.q0(false);
                ry5Var.E0(i);
                break;
            default:
                xv7 xv7Var = (xv7) flaVar;
                xv7Var.e2 = null;
                if (((boolean[]) obj)[0]) {
                    xv7Var.y0(false);
                }
                xv7Var.R0(i);
                break;
        }
    }
}
