package jg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rc0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ rc0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 d;

    public /* synthetic */ w0(d1 d1Var, org.telegram.ui.ActionBar.e2 e2Var, rc0 rc0Var) {
        this.b = d1Var;
        this.d = e2Var;
        this.c = rc0Var;
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
                rc0 rc0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(d1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(d1Var2.x, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = d1Var2.x;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        rc0Var.z0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new w0(d1Var2, this.d, rc0Var));
                break;
        }
    }

    public /* synthetic */ w0(d1 d1Var, rc0 rc0Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.b = d1Var;
        this.c = rc0Var;
        this.d = e2Var;
    }
}
