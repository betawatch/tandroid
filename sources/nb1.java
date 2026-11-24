// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j7b b;

    public /* synthetic */ nb1(j7b j7bVar, byte b) {
        this.a = b;
        this.b = j7bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j7b j7bVar = this.b;
        switch (b) {
            case 0:
                j7bVar.n();
                break;
            case 1:
                j7bVar.K0 = false;
                j7bVar.L0 = TLObject.FLAG_31;
                j7bVar.invalidate();
                j7bVar.S0.setVisibility(0);
                j7bVar.T0.setVisibility(0);
                break;
            default:
                t7b t7bVar = j7bVar.S1;
                i7b i7bVar = t7bVar.Y0;
                if (i7bVar != null) {
                    i7bVar.P = false;
                    i7bVar.b();
                    i7b i7bVar2 = t7bVar.Y0;
                    i7bVar2.m(0L);
                    kob kobVar = i7bVar2.G;
                    if (kobVar != null) {
                        kobVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
