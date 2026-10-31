package ag;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ yb0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 d;

    public /* synthetic */ w1(f2 f2Var, org.telegram.ui.ActionBar.x1 x1Var, yb0 yb0Var) {
        this.b = f2Var;
        this.d = x1Var;
        this.c = yb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                f2Var.getClass();
                this.d.dismiss();
                f2Var.presentFragment(this.c);
                break;
            default:
                f2 f2Var2 = this.b;
                yb0 yb0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(f2Var2.getParentActivity(), cd.D0().y).getFromLocationName(f2Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = f2Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        yb0Var.I0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
                org.telegram.messenger.i0.g3(new w1(f2Var2, this.d, yb0Var));
                break;
        }
    }

    public /* synthetic */ w1(f2 f2Var, yb0 yb0Var, org.telegram.ui.ActionBar.x1 x1Var) {
        this.b = f2Var;
        this.c = yb0Var;
        this.d = x1Var;
    }
}
