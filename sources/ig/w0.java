package ig;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nc0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ nc0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 d;

    public /* synthetic */ w0(d1 d1Var, org.telegram.ui.ActionBar.b2 b2Var, nc0 nc0Var) {
        this.b = d1Var;
        this.d = b2Var;
        this.c = nc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                d1Var.getClass();
                this.d.dismiss();
                d1Var.presentFragment(this.c);
                break;
            default:
                d1 d1Var2 = this.b;
                nc0 nc0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(d1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(d1Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = d1Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        nc0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new w0(d1Var2, this.d, nc0Var));
                break;
        }
    }

    public /* synthetic */ w0(d1 d1Var, nc0 nc0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.b = d1Var;
        this.c = nc0Var;
        this.d = b2Var;
    }
}
