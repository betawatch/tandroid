package ig;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ id0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 d;

    public /* synthetic */ x0(e1 e1Var, org.telegram.ui.ActionBar.b2 b2Var, id0 id0Var) {
        this.b = e1Var;
        this.d = b2Var;
        this.c = id0Var;
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
                id0 id0Var = this.c;
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
                        id0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                AndroidUtilities.runOnUIThread(new x0(e1Var2, this.d, id0Var));
                break;
        }
    }

    public /* synthetic */ x0(e1 e1Var, id0 id0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.b = e1Var;
        this.c = id0Var;
        this.d = b2Var;
    }
}
