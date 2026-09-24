package hg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ cd0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 d;

    public /* synthetic */ y0(f1 f1Var, org.telegram.ui.ActionBar.a2 a2Var, cd0 cd0Var) {
        this.b = f1Var;
        this.d = a2Var;
        this.c = cd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                f1Var.getClass();
                this.d.dismiss();
                f1Var.presentFragment(this.c);
                break;
            default:
                f1 f1Var2 = this.b;
                cd0 cd0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(f1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(f1Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = f1Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        cd0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new y0(f1Var2, this.d, cd0Var));
                break;
        }
    }

    public /* synthetic */ y0(f1 f1Var, cd0 cd0Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.b = f1Var;
        this.c = cd0Var;
        this.d = a2Var;
    }
}
