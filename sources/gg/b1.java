package gg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k1 b;
    public final /* synthetic */ id0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 d;

    public /* synthetic */ b1(k1 k1Var, org.telegram.ui.ActionBar.d2 d2Var, id0 id0Var) {
        this.b = k1Var;
        this.d = d2Var;
        this.c = id0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k1 k1Var = this.b;
                k1Var.getClass();
                this.d.dismiss();
                k1Var.presentFragment(this.c);
                break;
            default:
                k1 k1Var2 = this.b;
                id0 id0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(k1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(k1Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = k1Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        id0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new b1(k1Var2, this.d, id0Var));
                break;
        }
    }

    public /* synthetic */ b1(k1 k1Var, id0 id0Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.b = k1Var;
        this.c = id0Var;
        this.d = d2Var;
    }
}
