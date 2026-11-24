// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dc6 extends c6 {
    public final /* synthetic */ pc6 a;

    public dc6(pc6 pc6Var) {
        this.a = pc6Var;
    }

    @Override // c6
    public final void b(int i) {
        pc6 pc6Var = this.a;
        if (i == -1) {
            pc6Var.finishFragment();
            return;
        }
        if (i != 1) {
            if (i == 5) {
                pc6Var.C0(false);
                return;
            }
            if (i == 6) {
                pc6Var.B0(null);
                return;
            }
            if ((i == 2 || i == 3 || i == 4) && pc6Var.F != null) {
                pc6Var.D0();
                pc6Var.F.j(i != 3 ? i == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = pc6Var.J0.k.media.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            pc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
