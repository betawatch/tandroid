package ig;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sc0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ sc0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 d;

    public /* synthetic */ v0(c1 c1Var, org.telegram.ui.ActionBar.c2 c2Var, sc0 sc0Var) {
        this.b = c1Var;
        this.d = c2Var;
        this.c = sc0Var;
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
                sc0 sc0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(c1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(c1Var2.E, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = c1Var2.E;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        sc0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new v0(c1Var2, this.d, sc0Var));
                break;
        }
    }

    public /* synthetic */ v0(c1 c1Var, sc0 sc0Var, org.telegram.ui.ActionBar.c2 c2Var) {
        this.b = c1Var;
        this.c = sc0Var;
        this.d = c2Var;
    }
}
