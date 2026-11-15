package ai;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.k7;
import di.u8;
import fi.b4;
import fi.e3;
import hi.h4;
import hi.kb;
import hi.lb;
import hi.mb;
import hi.nb;
import hi.qb;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.f60;
import org.telegram.ui.gc;
import org.telegram.ui.hc;
import org.telegram.ui.pv0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u2(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.z10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int[] iArr;
        u61 u61Var;
        r4 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                x2 x2Var = (x2) this.c;
                Integer num = (Integer) obj;
                if (this.b) {
                    cc.a0(x2Var).Q(R.raw.ic_delete, 36, num + " local transcriptions deleted").j();
                    break;
                }
                break;
            case 1:
                u8 u8Var = (u8) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    ez.C(u8Var.a).f(new ArrayList(hashSet));
                    break;
                } else {
                    u8Var.getClass();
                    break;
                }
            case 2:
                b4 b4Var = (b4) this.c;
                boolean z11 = this.b;
                e3 e3Var = b4Var.M0;
                e6 e6Var = b4Var.l0;
                new cc(e3Var, e6Var).o(z11 ? bc.h : bc.e, e6Var).j();
                break;
            case 3:
                z10 z10Var = (z10) this.c;
                boolean z12 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    z10Var.a(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.H1;
                    if (activity == null) {
                        activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
                    }
                    if (activity == null || activity.isFinishing()) {
                        z10Var.a(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.t1 t1Var = z12 ? new org.telegram.ui.ActionBar.t1(3, activity, new fi.b()) : null;
                        if (z12) {
                            t1Var.r(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        kb kbVar = new kb(z12, t1Var, z10Var, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (qb.b == null || !TextUtils.equals(qb.a, str)) {
                            int[] iArr2 = new int[1];
                            np s12 = np.s1(m10.t0);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.t0);
                            String str2 = s12.W5;
                            TLObject f22 = s12.f2(str2);
                            TLRPC.User[] userArr = {f22 instanceof TLRPC.User ? (TLRPC.User) f22 : null};
                            mb mbVar = new mb(s12, userArr, latitude, longitude, iArr2, connectionsManager, kbVar, str);
                            if (userArr[0] == 0) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new k7(iArr2, s12, userArr, mbVar, kbVar, 1));
                            } else {
                                iArr = iArr2;
                                mbVar.run();
                            }
                            r2 = new h4(17, iArr, connectionsManager);
                        } else {
                            kbVar.a(qb.b);
                        }
                        if (z12 && r2 != null) {
                            t1Var.setOnCancelListener(new lb(r2, r4 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 4:
                u2 u2Var = (u2) this.c;
                boolean z13 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    u2Var.a(null);
                    break;
                } else {
                    final LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            if (location2 == null && z13) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    Context context = LaunchActivity.H1;
                                    if (context == null) {
                                        context = org.telegram.messenger.t0.b;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            int i7 = j6.L5;
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, j6.x0(null, i7, false), null);
                                            alertDialog$Builder.n(i7, null);
                                            alertDialog$Builder.a.U = hd.M0(2131749530, null);
                                            alertDialog$Builder.k(hd.M0(2131751160, null), new nb(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                            alertDialog$Builder.p();
                                        } catch (Exception e10) {
                                            a8.g(e10, true);
                                        }
                                    }
                                } else {
                                    try {
                                        final z10[] z10VarArr = {u2Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: hi.ob
                                            @Override // android.location.LocationListener
                                            public final void onLocationChanged(Location location3) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                z10[] z10VarArr2 = z10VarArr;
                                                z10 z10Var2 = z10VarArr2[0];
                                                if (z10Var2 != null) {
                                                    z10Var2.a(location3);
                                                    z10VarArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                        u2Var.a(null);
                                        return;
                                    }
                                }
                            }
                            u2Var.a(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    u2Var.a(location2);
                }
            case 5:
                hc hcVar = (hc) this.c;
                boolean z14 = this.b;
                View view = (View) obj;
                gc gcVar = (gc) view;
                hcVar.b.getClass();
                r4 = RecyclerView.R(view) == hcVar.e;
                gcVar.s = r4;
                if (!z14) {
                    gcVar.w.f(r4, true);
                }
                gcVar.invalidate();
                break;
            case 6:
                an anVar = (an) this.c;
                boolean z15 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.W6 && q1Var.Y6) {
                        z10 = true;
                    }
                    if (z10 != z15 && anVar.aa()) {
                        q1Var.W6 = z15;
                        q1Var.Y6 = anVar.aa();
                        q1Var.F6 = true;
                        q1Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof org.telegram.ui.Cells.t0) {
                    ((org.telegram.ui.Cells.t0) view2).f0 = z15;
                    break;
                }
                break;
            case 7:
                v61 v61Var = (v61) this.c;
                boolean z16 = this.b;
                View view3 = (View) obj;
                v61Var.w.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof t61) {
                    ((t61) view3).setReordering(z16 && (u61Var = v61Var.E) != null && ((cf) u61Var).l(R));
                    break;
                }
                break;
            case 8:
                View view4 = (View) this.c;
                boolean z17 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((q8) view4).setChecked(!z17);
                    break;
                }
                break;
            case 9:
                pv0 pv0Var = (pv0) this.c;
                boolean z18 = this.b;
                ProfileActivity profileActivity = pv0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    cc.a0(profileActivity).o(z18 ? bc.h : bc.e, null).j();
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.h3(new f60((org.telegram.ui.web.k) this.c, (String) obj, this.b, 15));
                break;
            default:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.c;
                n1Var.getMessagesController().p((String) obj, this.b);
                n1Var.a.g3.O(true);
                break;
        }
    }
}
