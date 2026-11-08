package bi;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.g60;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b9 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b9(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int[] iArr;
        t61 t61Var;
        r4 = false;
        boolean z9 = false;
        switch (this.a) {
            case 0:
                ea eaVar = (ea) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    gz.C(eaVar.a).f(new ArrayList(hashSet));
                    break;
                } else {
                    eaVar.getClass();
                    break;
                }
            case 1:
                di.i4 i4Var = (di.i4) this.c;
                boolean z10 = this.b;
                di.j3 j3Var = i4Var.L0;
                org.telegram.ui.ActionBar.f6 f6Var = i4Var.k0;
                new org.telegram.ui.Components.hc(j3Var, f6Var).o(z10 ? org.telegram.ui.Components.gc.h : org.telegram.ui.Components.gc.e, f6Var).j();
                break;
            case 2:
                c20 c20Var = (c20) this.c;
                boolean z11 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    c20Var.a(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.G1;
                    if (activity == null) {
                        activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
                    }
                    if (activity == null || activity.isFinishing()) {
                        c20Var.a(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.u1 u1Var = z11 ? new org.telegram.ui.ActionBar.u1(3, activity, new di.b()) : null;
                        if (z11) {
                            u1Var.r(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        fi.nb nbVar = new fi.nb(z11, u1Var, c20Var, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (fi.tb.b == null || !TextUtils.equals(fi.tb.a, str)) {
                            int[] iArr2 = new int[1];
                            qp s12 = qp.s1(p10.s0);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.s0);
                            String str2 = s12.V5;
                            TLObject f22 = s12.f2(str2);
                            TLRPC.User[] userArr = {f22 instanceof TLRPC.User ? (TLRPC.User) f22 : null};
                            fi.pb pbVar = new fi.pb(s12, userArr, latitude, longitude, iArr2, connectionsManager, nbVar, str);
                            if (userArr[0] == 0) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new r8(iArr2, s12, userArr, pbVar, nbVar, 1));
                            } else {
                                iArr = iArr2;
                                pbVar.run();
                            }
                            r2 = new f2.h(22, iArr, connectionsManager);
                        } else {
                            nbVar.a(fi.tb.b);
                        }
                        if (z11 && r2 != null) {
                            u1Var.setOnCancelListener(new fi.ob(r2, r4 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 3:
                b9 b9Var = (b9) this.c;
                boolean z12 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    b9Var.a(null);
                    break;
                } else {
                    final LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            if (location2 == null && z12) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    Context context = LaunchActivity.G1;
                                    if (context == null) {
                                        context = org.telegram.messenger.t0.b;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            int i7 = org.telegram.ui.ActionBar.k6.L5;
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.k6.x0(null, i7, false), null);
                                            alertDialog$Builder.n(i7, null);
                                            alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131749531, null);
                                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751161, null), new fi.qb(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                            alertDialog$Builder.p();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                    }
                                } else {
                                    try {
                                        final c20[] c20VarArr = {b9Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: fi.rb
                                            @Override // android.location.LocationListener
                                            public final void onLocationChanged(Location location3) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                c20[] c20VarArr2 = c20VarArr;
                                                c20 c20Var2 = c20VarArr2[0];
                                                if (c20Var2 != null) {
                                                    c20Var2.a(location3);
                                                    c20VarArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                        b9Var.a(null);
                                        return;
                                    }
                                }
                            }
                            b9Var.a(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    b9Var.a(location2);
                }
            case 4:
                org.telegram.ui.ic icVar = (org.telegram.ui.ic) this.c;
                boolean z13 = this.b;
                View view = (View) obj;
                org.telegram.ui.hc hcVar = (org.telegram.ui.hc) view;
                icVar.b.getClass();
                r4 = RecyclerView.R(view) == icVar.e;
                hcVar.s = r4;
                if (!z13) {
                    hcVar.w.f(r4, true);
                }
                hcVar.invalidate();
                break;
            case 5:
                an anVar = (an) this.c;
                boolean z14 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.V6 && q1Var.X6) {
                        z9 = true;
                    }
                    if (z9 != z14 && anVar.Y9()) {
                        q1Var.V6 = z14;
                        q1Var.X6 = anVar.Y9();
                        q1Var.E6 = true;
                        q1Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof org.telegram.ui.Cells.t0) {
                    ((org.telegram.ui.Cells.t0) view2).e0 = z14;
                    break;
                }
                break;
            case 6:
                u61 u61Var = (u61) this.c;
                boolean z15 = this.b;
                View view3 = (View) obj;
                u61Var.w.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof s61) {
                    ((s61) view3).setReordering(z15 && (t61Var = u61Var.D) != null && ((org.telegram.ui.Components.n) t61Var).r(R));
                    break;
                }
                break;
            case 7:
                View view4 = (View) this.c;
                boolean z16 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((org.telegram.ui.Cells.r8) view4).setChecked(!z16);
                    break;
                }
                break;
            case 8:
                rv0 rv0Var = (rv0) this.c;
                boolean z17 = this.b;
                ProfileActivity profileActivity = rv0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    org.telegram.ui.Components.hc.a0(profileActivity).o(z17 ? org.telegram.ui.Components.gc.h : org.telegram.ui.Components.gc.e, null).j();
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.g0.h3(new g60((org.telegram.ui.web.j) this.c, (String) obj, this.b, 15));
                break;
            default:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.c;
                o1Var.getMessagesController().p((String) obj, this.b);
                o1Var.a.f3.O(true);
                break;
        }
    }
}
