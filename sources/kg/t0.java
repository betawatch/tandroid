package kg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ra0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ ra0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 d;

    public /* synthetic */ t0(a1 a1Var, org.telegram.ui.ActionBar.u1 u1Var, ra0 ra0Var) {
        this.b = a1Var;
        this.d = u1Var;
        this.c = ra0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                a1Var.getClass();
                this.d.dismiss();
                a1Var.presentFragment(this.c);
                break;
            default:
                a1 a1Var2 = this.b;
                ra0 ra0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(a1Var2.getParentActivity(), id.E0().y).getFromLocationName(a1Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = a1Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        ra0Var.C0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new t0(a1Var2, this.d, ra0Var));
                break;
        }
    }

    public /* synthetic */ t0(a1 a1Var, ra0 ra0Var, org.telegram.ui.ActionBar.u1 u1Var) {
        this.b = a1Var;
        this.c = ra0Var;
        this.d = u1Var;
    }
}
