// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dh2 implements ee, oac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hh2 b;

    public /* synthetic */ dh2(hh2 hh2Var, byte b) {
        this.a = b;
        this.b = hh2Var;
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.b.e0((c6c) obj, (View) obj2);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        hh2 hh2Var = this.b;
        switch (b) {
            case 0:
                hh2Var.f0();
                break;
            case 1:
                hh2Var.finishFragment();
                break;
            default:
                hh2Var.f0();
                break;
        }
    }
}
