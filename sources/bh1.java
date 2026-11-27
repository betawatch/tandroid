// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bh1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wh1 b;

    public /* synthetic */ bh1(wh1 wh1Var, byte b) {
        this.a = b;
        this.b = wh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wh1 wh1Var = this.b;
        switch (b) {
            case 0:
                wh1Var.getClass();
                bs2.v(null, 2131752225, d31.b0(wh1Var), R.raw.done, 36);
                break;
            default:
                wh1Var.Y0();
                break;
        }
    }
}
