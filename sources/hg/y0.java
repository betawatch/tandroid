package hg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dd0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ dd0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 d;

    public /* synthetic */ y0(f1 f1Var, org.telegram.ui.ActionBar.b2 b2Var, dd0 dd0Var) {
        this.b = f1Var;
        this.d = b2Var;
        this.c = dd0Var;
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
                dd0 dd0Var = this.c;
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
                        dd0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new y0(f1Var2, this.d, dd0Var));
                break;
        }
    }

    public /* synthetic */ y0(f1 f1Var, dd0 dd0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.b = f1Var;
        this.c = dd0Var;
        this.d = b2Var;
    }
}
