// default package

import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lo4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sxb b;

    public /* synthetic */ lo4(sxb sxbVar, byte b) {
        this.a = b;
        this.b = sxbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sxb sxbVar = this.b;
        switch (b) {
            case 0:
                if (sxbVar.getParentLayout() != null) {
                    sxbVar.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", sxbVar.a);
                    yv1 yv1Var = new yv1(bundle);
                    yv1Var.Ga = true;
                    sxbVar.presentFragment(yv1Var);
                    break;
                }
                break;
            case 1:
                sxbVar.y0();
                sxbVar.C0();
                break;
            case 2:
                sxbVar.y0();
                break;
            case 3:
                sxbVar.S0(true);
                break;
            case 4:
                sxbVar.finishPreviewFragment();
                break;
            case 5:
                sxbVar.B0 = null;
                sxbVar.Z0(true, false);
                break;
            default:
                sxbVar.O.postOnAnimation(new lo4(sxbVar, (byte) 2));
                break;
        }
    }
}
