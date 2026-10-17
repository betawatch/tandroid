package ig;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ pc0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 d;

    public /* synthetic */ u0(b1 b1Var, org.telegram.ui.ActionBar.b2 b2Var, pc0 pc0Var) {
        this.b = b1Var;
        this.d = b2Var;
        this.c = pc0Var;
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
                pc0 pc0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(b1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(b1Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = b1Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        pc0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new u0(b1Var2, this.d, pc0Var));
                break;
        }
    }

    public /* synthetic */ u0(b1 b1Var, pc0 pc0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.b = b1Var;
        this.c = pc0Var;
        this.d = b2Var;
    }
}
