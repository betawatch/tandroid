package lg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.la0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ la0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 d;

    public /* synthetic */ u0(b1 b1Var, org.telegram.ui.ActionBar.s1 s1Var, la0 la0Var) {
        this.b = b1Var;
        this.d = s1Var;
        this.c = la0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b1 b1Var = this.b;
                b1Var.getClass();
                this.d.dismiss();
                b1Var.presentFragment(this.c);
                break;
            default:
                b1 b1Var2 = this.b;
                la0 la0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(b1Var2.getParentActivity(), bd.E0().y).getFromLocationName(b1Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = b1Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        la0Var.D0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new u0(b1Var2, this.d, la0Var));
                break;
        }
    }

    public /* synthetic */ u0(b1 b1Var, la0 la0Var, org.telegram.ui.ActionBar.s1 s1Var) {
        this.b = b1Var;
        this.c = la0Var;
        this.d = s1Var;
    }
}
