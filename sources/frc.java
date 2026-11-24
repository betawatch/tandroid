// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class frc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rrc b;

    public /* synthetic */ frc(rrc rrcVar, byte b) {
        this.a = b;
        this.b = rrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        rrc rrcVar = this.b;
        switch (b) {
            case 0:
                if (rrcVar.J && (editTextBoldCursor = rrcVar.I) != null && editTextBoldCursor.isAttachedToWindow() && rrcVar.I.hasWindowFocus()) {
                    rrcVar.I.requestFocus();
                    if (gm.E3(rrcVar.I)) {
                        rrcVar.J = false;
                        break;
                    }
                }
                break;
            case 1:
                float f = rrcVar.c0;
                if (f < 1.0f && rrcVar.b0 == null) {
                    zna znaVar = new zna(new xk4(f));
                    rrcVar.b0 = znaVar;
                    aoa aoaVar = new aoa(1.0f);
                    aoaVar.a(0.55f);
                    aoaVar.b(65.0f);
                    znaVar.m = aoaVar;
                    rrcVar.b0.f(0.001f);
                    rrcVar.b0.b(new h20(rrcVar, (byte) 20));
                    rrcVar.b0.a(new hx0(rrcVar, (byte) 13));
                    rrcVar.b0.h();
                    break;
                }
                break;
            case 2:
                rrcVar.e0.setLoading(false);
                break;
            case 3:
                rrcVar.e0.setLoading(false);
                break;
            case 4:
                rrcVar.v0();
                break;
            case 5:
                rrcVar.presentFragment(yv1.ga(rrcVar.f.id));
                break;
            default:
                ts2.u(null, 2131742884, c41.b0(rrcVar), R.raw.copy, 36);
                break;
        }
    }
}
