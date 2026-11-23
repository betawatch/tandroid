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
import hi.fc;
import hi.gc;
import hi.hc;
import hi.ic;
import hi.lc;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a80;
import org.telegram.ui.bn;
import org.telegram.ui.qv0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o2(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.w10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int[] iArr;
        i71 i71Var;
        r4 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                r2 r2Var = (r2) this.c;
                Integer num = (Integer) obj;
                if (this.b) {
                    kc.b0(r2Var).Q(R.raw.ic_delete, 36, gd.G(num.intValue(), "SpeechToTextTranscriptionsDeleted", new Object[0])).j();
                    break;
                }
                break;
            case 1:
                y8 y8Var = (y8) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    zy.C(y8Var.a).f(new ArrayList(hashSet));
                    break;
                } else {
                    y8Var.getClass();
                    break;
                }
            case 2:
                z3 z3Var = (z3) this.c;
                boolean z11 = this.b;
                c3 c3Var = z3Var.M0;
                i6 i6Var = z3Var.l0;
                new kc(c3Var, i6Var).o(z11 ? jc.h : jc.e, i6Var).j();
                break;
            case 3:
                w10 w10Var = (w10) this.c;
                boolean z12 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    w10Var.a(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.H1;
                    if (activity == null) {
                        activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
                    }
                    if (activity == null || activity.isFinishing()) {
                        w10Var.a(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.t1 t1Var = z12 ? new org.telegram.ui.ActionBar.t1(3, activity, new fi.b()) : null;
                        if (z12) {
                            t1Var.r(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        fc fcVar = new fc(z12, t1Var, w10Var, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (lc.b == null || !TextUtils.equals(lc.a, str)) {
                            int[] iArr2 = new int[1];
                            mp u12 = mp.u1(i10.t0);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10.t0);
                            String str2 = u12.Y5;
                            TLObject h22 = u12.h2(str2);
                            TLRPC.User[] userArr = {h22 instanceof TLRPC.User ? (TLRPC.User) h22 : null};
                            hc hcVar = new hc(u12, userArr, latitude, longitude, iArr2, connectionsManager, fcVar, str);
                            if (userArr[0] == 0) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new m7(iArr2, u12, userArr, hcVar, fcVar, 1));
                            } else {
                                iArr = iArr2;
                                hcVar.run();
                            }
                            r2 = new hi.c(23, iArr, connectionsManager);
                        } else {
                            fcVar.a(lc.b);
                        }
                        if (z12 && r2 != null) {
                            t1Var.setOnCancelListener(new gc(r2, r4 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 4:
                o2 o2Var = (o2) this.c;
                boolean z13 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    o2Var.a(null);
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
                                            int i7 = n6.L5;
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, n6.x0(null, i7, false), null);
                                            alertDialog$Builder.n(i7, null);
                                            alertDialog$Builder.a.U = gd.N0(2131749354, null);
                                            alertDialog$Builder.k(gd.N0(2131751148, null), new ic(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(gd.N0(2131752577, null), null);
                                            alertDialog$Builder.p();
                                        } catch (Exception e10) {
                                            a8.g(e10, true);
                                        }
                                    }
                                } else {
                                    try {
                                        final w10[] w10VarArr = {o2Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: hi.jc
                                            @Override // android.location.LocationListener
                                            public final void onLocationChanged(Location location3) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                w10[] w10VarArr2 = w10VarArr;
                                                w10 w10Var2 = w10VarArr2[0];
                                                if (w10Var2 != null) {
                                                    w10Var2.a(location3);
                                                    w10VarArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                        o2Var.a(null);
                                        return;
                                    }
                                }
                            }
                            o2Var.a(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    o2Var.a(location2);
                }
            case 5:
                org.telegram.ui.hc hcVar2 = (org.telegram.ui.hc) this.c;
                boolean z14 = this.b;
                View view = (View) obj;
                org.telegram.ui.gc gcVar = (org.telegram.ui.gc) view;
                hcVar2.b.getClass();
                r4 = RecyclerView.R(view) == hcVar2.e;
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
                j71 j71Var = (j71) this.c;
                boolean z16 = this.b;
                View view3 = (View) obj;
                j71Var.w.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof h71) {
                    ((h71) view3).setReordering(z16 && (i71Var = j71Var.E) != null && i71Var.i(R));
                    break;
                }
                break;
            case 8:
                View view4 = (View) this.c;
                boolean z17 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((r8) view4).setChecked(!z17);
                    break;
                }
                break;
            case 9:
                qv0 qv0Var = (qv0) this.c;
                boolean z18 = this.b;
                ProfileActivity profileActivity = qv0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    kc.b0(profileActivity).o(z18 ? jc.h : jc.e, null).j();
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.g3(new a80((org.telegram.ui.web.k) this.c, (String) obj, this.b, 14));
                break;
            default:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.c;
                n1Var.getMessagesController().p((String) obj, this.b);
                n1Var.a.g3.O(true);
                break;
        }
    }
}
