// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ic6 extends d6 {
    public final /* synthetic */ uc6 a;

    public ic6(uc6 uc6Var) {
        this.a = uc6Var;
    }

    @Override // d6
    public final void b(int i) {
        uc6 uc6Var = this.a;
        if (i == -1) {
            uc6Var.finishFragment();
            return;
        }
        if (i != 1) {
            if (i == 5) {
                uc6Var.C0(false);
                return;
            }
            if (i == 6) {
                uc6Var.B0(null);
                return;
            }
            if ((i == 2 || i == 3 || i == 4) && uc6Var.F != null) {
                uc6Var.D0();
                uc6Var.F.j(i != 3 ? i == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = uc6Var.J0.k.media.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            uc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
