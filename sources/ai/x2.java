package ai;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.m7;
import di.y8;
import fi.c3;
import fi.z3;
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
import org.telegram.messenger.az;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b80;
import org.telegram.ui.bn;
import org.telegram.ui.gc;
import org.telegram.ui.hc;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x2(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.y10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int[] iArr;
        h71 h71Var;
        r4 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                a3 a3Var = (a3) this.c;
                Integer num = (Integer) obj;
                if (this.b) {
                    lc.b0(a3Var).Q(R.raw.ic_delete, 36, hd.G(num.intValue(), "SpeechToTextTranscriptionsDeleted", new Object[0])).j();
                    break;
                }
                break;
            case 1:
                y8 y8Var = (y8) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    az.C(y8Var.a).f(new ArrayList(hashSet));
                    break;
                } else {
                    y8Var.getClass();
                    break;
                }
            case 2:
                z3 z3Var = (z3) this.c;
                boolean z11 = this.b;
                c3 c3Var = z3Var.M0;
                h6 h6Var = z3Var.l0;
                new lc(c3Var, h6Var).o(z11 ? kc.h : kc.e, h6Var).j();
                break;
            case 3:
                y10 y10Var = (y10) this.c;
                boolean z12 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    y10Var.a(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.H1;
                    if (activity == null) {
                        activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
                    }
                    if (activity == null || activity.isFinishing()) {
                        y10Var.a(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.t1 t1Var = z12 ? new org.telegram.ui.ActionBar.t1(3, activity, new fi.b()) : null;
                        if (z12) {
                            t1Var.r(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        kb kbVar = new kb(z12, t1Var, y10Var, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (qb.b == null || !TextUtils.equals(qb.a, str)) {
                            int[] iArr2 = new int[1];
                            np u12 = np.u1(k10.t0);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.t0);
                            String str2 = u12.Y5;
                            TLObject h22 = u12.h2(str2);
                            TLRPC.User[] userArr = {h22 instanceof TLRPC.User ? (TLRPC.User) h22 : null};
                            mb mbVar = new mb(u12, userArr, latitude, longitude, iArr2, connectionsManager, kbVar, str);
                            if (userArr[0] == 0) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new m7(iArr2, u12, userArr, mbVar, kbVar, 1));
                            } else {
                                iArr = iArr2;
                                mbVar.run();
                            }
                            r2 = new hi.c(21, iArr, connectionsManager);
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
                x2 x2Var = (x2) this.c;
                boolean z13 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    x2Var.a(null);
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
                                            int i7 = m6.L5;
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, m6.x0(null, i7, false), null);
                                            alertDialog$Builder.n(i7, null);
                                            alertDialog$Builder.a.U = hd.N0(2131749354, null);
                                            alertDialog$Builder.k(hd.N0(2131751148, null), new nb(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(hd.N0(2131752577, null), null);
                                            alertDialog$Builder.p();
                                        } catch (Exception e10) {
                                            a8.g(e10, true);
                                        }
                                    }
                                } else {
                                    try {
                                        final y10[] y10VarArr = {x2Var};
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
                                                y10[] y10VarArr2 = y10VarArr;
                                                y10 y10Var2 = y10VarArr2[0];
                                                if (y10Var2 != null) {
                                                    y10Var2.a(location3);
                                                    y10VarArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                        x2Var.a(null);
                                        return;
                                    }
                                }
                            }
                            x2Var.a(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    x2Var.a(location2);
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
                bn bnVar = (bn) this.c;
                boolean z15 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view2;
                    if (r1Var.W6 && r1Var.Y6) {
                        z10 = true;
                    }
                    if (z10 != z15 && bnVar.aa()) {
                        r1Var.W6 = z15;
                        r1Var.Y6 = bnVar.aa();
                        r1Var.F6 = true;
                        r1Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) view2).f0 = z15;
                    break;
                }
                break;
            case 7:
                i71 i71Var = (i71) this.c;
                boolean z16 = this.b;
                View view3 = (View) obj;
                i71Var.w.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof g71) {
                    ((g71) view3).setReordering(z16 && (h71Var = i71Var.E) != null && h71Var.h(R));
                    break;
                }
                break;
            case 8:
                View view4 = (View) this.c;
                boolean z17 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((s8) view4).setChecked(!z17);
                    break;
                }
                break;
            case 9:
                rv0 rv0Var = (rv0) this.c;
                boolean z18 = this.b;
                ProfileActivity profileActivity = rv0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    lc.b0(profileActivity).o(z18 ? kc.h : kc.e, null).j();
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.g3(new b80((org.telegram.ui.web.k) this.c, (String) obj, this.b, 14));
                break;
            default:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.c;
                n1Var.getMessagesController().p((String) obj, this.b);
                n1Var.a.g3.O(true);
                break;
        }
    }
}
