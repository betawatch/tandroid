// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bza implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mza b;

    public /* synthetic */ bza(mza mzaVar, byte b) {
        this.a = b;
        this.b = mzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mza mzaVar = this.b;
        switch (b) {
            case 0:
                kza kzaVar = mzaVar.a0;
                if (kzaVar != null) {
                    if (kzaVar.r != null) {
                        MediaController.w().d(mzaVar.a0.r);
                        ba4.G(mzaVar.a).b(mzaVar.a0.b, false);
                        mzaVar.a0.getClass();
                    }
                    mzaVar.a0.a();
                    mzaVar.a0 = null;
                }
                mzaVar.e0.a();
                mzaVar.e0 = null;
                break;
            default:
                ijb ijbVar = mzaVar.T;
                if (ijbVar != null) {
                    mzaVar.T = null;
                    mzaVar.removeView(ijbVar);
                    break;
                }
                break;
        }
    }
}
