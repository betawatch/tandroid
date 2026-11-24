// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ai1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vi1 b;

    public /* synthetic */ ai1(vi1 vi1Var, byte b) {
        this.a = b;
        this.b = vi1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vi1 vi1Var = this.b;
        switch (b) {
            case 0:
                vi1Var.Y0();
                break;
            default:
                vi1Var.getClass();
                ts2.u(null, 2131752197, c41.b0(vi1Var), R.raw.done, 36);
                break;
        }
    }
}
