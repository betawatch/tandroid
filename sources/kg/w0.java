package kg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qa0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ qa0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 d;

    public /* synthetic */ w0(d1 d1Var, org.telegram.ui.ActionBar.u1 u1Var, qa0 qa0Var) {
        this.b = d1Var;
        this.d = u1Var;
        this.c = qa0Var;
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
                qa0 qa0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(d1Var2.getParentActivity(), gd.E0().y).getFromLocationName(d1Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = d1Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        qa0Var.I0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.g3(new w0(d1Var2, this.d, qa0Var));
                break;
        }
    }

    public /* synthetic */ w0(d1 d1Var, qa0 qa0Var, org.telegram.ui.ActionBar.u1 u1Var) {
        this.b = d1Var;
        this.c = qa0Var;
        this.d = u1Var;
    }
}
