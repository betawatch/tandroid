// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bw5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dja c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bw5(dja djaVar, Object obj, int i, byte b) {
        this.a = b;
        this.c = djaVar;
        this.d = obj;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.d;
        dja djaVar = this.c;
        switch (b) {
            case 0:
                rw5 rw5Var = (rw5) djaVar;
                if (rw5Var.Q1 == ((gw5) obj)) {
                    rw5Var.Q1 = null;
                }
                rw5Var.q0(false);
                rw5Var.E0(i);
                break;
            default:
                wt7 wt7Var = (wt7) djaVar;
                wt7Var.e2 = null;
                if (((boolean[]) obj)[0]) {
                    wt7Var.y0(false);
                }
                wt7Var.R0(i);
                break;
        }
    }
}
