// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ea6 extends c6 {
    public final /* synthetic */ qa6 a;

    public ea6(qa6 qa6Var) {
        this.a = qa6Var;
    }

    @Override // c6
    public final void b(int i) {
        qa6 qa6Var = this.a;
        if (i == -1) {
            qa6Var.finishFragment();
            return;
        }
        if (i != 1) {
            if (i == 5) {
                qa6Var.B0(false);
                return;
            }
            if (i == 6) {
                qa6Var.A0(null);
                return;
            }
            if ((i == 2 || i == 3 || i == 4) && qa6Var.F != null) {
                qa6Var.C0();
                qa6Var.F.j(i != 3 ? i == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = qa6Var.J0.k.media.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            qa6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
