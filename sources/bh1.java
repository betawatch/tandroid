// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
