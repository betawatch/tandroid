// default package

import android.util.Log;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class idd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ydd b;

    public /* synthetic */ idd(ydd yddVar, byte b) {
        this.a = b;
        this.b = yddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ydd yddVar = this.b;
        switch (b) {
            case 0:
                dc6 dc6Var = ydd.i;
                Log.i(dc6Var.a, dc6Var.d("transfer with type = %d has timed out", Integer.valueOf(yddVar.e)));
                yddVar.b(101);
                break;
            default:
                u39 u39Var = new u39(yddVar, (byte) 29);
                j6a j6aVar = yddVar.f;
                fre.h(j6aVar);
                j6aVar.a(u39Var);
                break;
        }
    }
}
