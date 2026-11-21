package kg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qa0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ qa0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 d;

    public /* synthetic */ v0(c1 c1Var, org.telegram.ui.ActionBar.t1 t1Var, qa0 qa0Var) {
        this.b = c1Var;
        this.d = t1Var;
        this.c = qa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                c1Var.getClass();
                this.d.dismiss();
                c1Var.presentFragment(this.c);
                break;
            default:
                c1 c1Var2 = this.b;
                qa0 qa0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(c1Var2.getParentActivity(), gd.E0().y).getFromLocationName(c1Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = c1Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        qa0Var.I0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.g3(new v0(c1Var2, this.d, qa0Var));
                break;
        }
    }

    public /* synthetic */ v0(c1 c1Var, qa0 qa0Var, org.telegram.ui.ActionBar.t1 t1Var) {
        this.b = c1Var;
        this.c = qa0Var;
        this.d = t1Var;
    }
}
