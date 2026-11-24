// default package

import android.os.Bundle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class km4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qvb b;

    public /* synthetic */ km4(qvb qvbVar, byte b) {
        this.a = b;
        this.b = qvbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qvb qvbVar = this.b;
        switch (b) {
            case 0:
                if (qvbVar.getParentLayout() != null) {
                    qvbVar.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", qvbVar.a);
                    mu1 mu1Var = new mu1(bundle);
                    mu1Var.Ga = true;
                    qvbVar.presentFragment(mu1Var);
                    break;
                }
                break;
            case 1:
                qvbVar.x0();
                qvbVar.B0();
                break;
            case 2:
                qvbVar.x0();
                break;
            case 3:
                qvbVar.R0(true);
                break;
            case 4:
                qvbVar.finishPreviewFragment();
                break;
            case 5:
                qvbVar.B0 = null;
                qvbVar.Y0(true, false);
                break;
            default:
                qvbVar.O.postOnAnimation(new km4(qvbVar, (byte) 2));
                break;
        }
    }
}
