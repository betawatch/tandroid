package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a60;
import org.telegram.ui.iv0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b8(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int[] iArr;
        l61 l61Var;
        r4 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                e9 e9Var = (e9) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    yy.C(e9Var.a).f(new ArrayList(hashSet));
                    break;
                } else {
                    e9Var.getClass();
                    break;
                }
            case 1:
                ei.j4 j4Var = (ei.j4) this.c;
                boolean z11 = this.b;
                ei.m3 m3Var = j4Var.M0;
                org.telegram.ui.ActionBar.e6 e6Var = j4Var.l0;
                new org.telegram.ui.Components.fc(m3Var, e6Var).o(z11 ? org.telegram.ui.Components.ec.h : org.telegram.ui.Components.ec.e, e6Var).j();
                break;
            case 2:
                u10 u10Var = (u10) this.c;
                boolean z12 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    u10Var.a(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.K1;
                    if (activity == null) {
                        activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
                    }
                    if (activity == null || activity.isFinishing()) {
                        u10Var.a(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.s1 s1Var = z12 ? new org.telegram.ui.ActionBar.s1(3, activity, new ei.b()) : null;
                        if (z12) {
                            s1Var.r(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        gi.nb nbVar = new gi.nb(z12, s1Var, u10Var, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (gi.tb.b == null || !TextUtils.equals(gi.tb.a, str)) {
                            int[] iArr2 = new int[1];
                            hp s12 = hp.s1(h10.t0);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.t0);
                            String str2 = s12.V5;
                            TLObject f22 = s12.f2(str2);
                            TLRPC.User[] userArr = {f22 instanceof TLRPC.User ? (TLRPC.User) f22 : null};
                            gi.pb pbVar = new gi.pb(s12, userArr, latitude, longitude, iArr2, connectionsManager, nbVar, str);
                            if (userArr[0] == 0) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new s7(iArr2, s12, userArr, pbVar, nbVar, 1));
                            } else {
                                iArr = iArr2;
                                pbVar.run();
                            }
                            r2 = new g2.c(28, iArr, connectionsManager);
                        } else {
                            nbVar.a(gi.tb.b);
                        }
                        if (z12 && r2 != null) {
                            s1Var.setOnCancelListener(new gi.ob(r2, r4 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 3:
                b8 b8Var = (b8) this.c;
                boolean z13 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    b8Var.a(null);
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
                                    Context context = LaunchActivity.K1;
                                    if (context == null) {
                                        context = org.telegram.messenger.t0.b;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            int i3 = org.telegram.ui.ActionBar.k6.L5;
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
                                            alertDialog$Builder.n(i3, null);
                                            alertDialog$Builder.a.U = bd.M0(2131749538, null);
                                            alertDialog$Builder.k(bd.M0(2131751161, null), new gi.qb(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                            alertDialog$Builder.p();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                    }
                                } else {
                                    try {
                                        final u10[] u10VarArr = {b8Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: gi.rb
                                            @Override // android.location.LocationListener
                                            public final void onLocationChanged(Location location3) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                u10[] u10VarArr2 = u10VarArr;
                                                u10 u10Var2 = u10VarArr2[0];
                                                if (u10Var2 != null) {
                                                    u10Var2.a(location3);
                                                    u10VarArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                        b8Var.a(null);
                                        return;
                                    }
                                }
                            }
                            b8Var.a(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    b8Var.a(location2);
                }
            case 4:
                org.telegram.ui.gc gcVar = (org.telegram.ui.gc) this.c;
                boolean z14 = this.b;
                View view = (View) obj;
                org.telegram.ui.fc fcVar = (org.telegram.ui.fc) view;
                gcVar.b.getClass();
                r4 = RecyclerView.R(view) == gcVar.e;
                fcVar.s = r4;
                if (!z14) {
                    fcVar.w.f(r4, true);
                }
                fcVar.invalidate();
                break;
            case 5:
                wm wmVar = (wm) this.c;
                boolean z15 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.V6 && q1Var.X6) {
                        z10 = true;
                    }
                    if (z10 != z15 && wmVar.Y9()) {
                        q1Var.V6 = z15;
                        q1Var.X6 = wmVar.Y9();
                        q1Var.E6 = true;
                        q1Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof org.telegram.ui.Cells.t0) {
                    ((org.telegram.ui.Cells.t0) view2).f0 = z15;
                    break;
                }
                break;
            case 6:
                m61 m61Var = (m61) this.c;
                boolean z16 = this.b;
                View view3 = (View) obj;
                m61Var.w.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof k61) {
                    ((k61) view3).setReordering(z16 && (l61Var = m61Var.E) != null && ((y00) l61Var).i(R));
                    break;
                }
                break;
            case 7:
                View view4 = (View) this.c;
                boolean z17 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((org.telegram.ui.Cells.q8) view4).setChecked(!z17);
                    break;
                }
                break;
            case 8:
                iv0 iv0Var = (iv0) this.c;
                boolean z18 = this.b;
                ProfileActivity profileActivity = iv0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    org.telegram.ui.Components.fc.a0(profileActivity).o(z18 ? org.telegram.ui.Components.ec.h : org.telegram.ui.Components.ec.e, null).j();
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.g0.h3(new a60((org.telegram.ui.web.l) this.c, (String) obj, this.b, 15));
                break;
            default:
                org.telegram.ui.web.m1 m1Var = (org.telegram.ui.web.m1) this.c;
                m1Var.getMessagesController().p((String) obj, this.b);
                m1Var.a.g3.O(true);
                break;
        }
    }
}
