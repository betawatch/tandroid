// default package

import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class bid implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pid b;

    public /* synthetic */ bid(pid pidVar, byte b) {
        this.a = b;
        this.b = pidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pid pidVar = this.b;
        switch (b) {
            case 0:
                he6 he6Var = pid.i;
                Log.i(he6Var.a, he6Var.d("transfer with type = %d has timed out", Integer.valueOf(pidVar.e)));
                pidVar.b(101);
                break;
            default:
                ve9 ve9Var = new ve9((Object) pidVar, (byte) 26);
                baa baaVar = pidVar.f;
                xve.h(baaVar);
                baaVar.a(ve9Var);
                break;
        }
    }
}
