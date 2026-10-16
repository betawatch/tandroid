package ig;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ ld0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 d;

    public /* synthetic */ x0(e1 e1Var, org.telegram.ui.ActionBar.a2 a2Var, ld0 ld0Var) {
        this.b = e1Var;
        this.d = a2Var;
        this.c = ld0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e1 e1Var = this.b;
                e1Var.getClass();
                this.d.dismiss();
                e1Var.presentFragment(this.c);
                break;
            default:
                e1 e1Var2 = this.b;
                ld0 ld0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(e1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(e1Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = e1Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        ld0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new x0(e1Var2, this.d, ld0Var));
                break;
        }
    }

    public /* synthetic */ x0(e1 e1Var, ld0 ld0Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.b = e1Var;
        this.c = ld0Var;
        this.d = a2Var;
    }
}
