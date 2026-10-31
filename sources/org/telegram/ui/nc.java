package org.telegram.ui;

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
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nc(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.q20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        org.telegram.ui.Components.u71 u71Var;
        int[] iArr;
        r3 = false;
        r3 = false;
        boolean z10 = false;
        r3 = false;
        boolean z11 = false;
        int i10 = 1;
        switch (this.a) {
            case 0:
                qc qcVar = (qc) this.c;
                boolean z12 = this.b;
                View view = (View) obj;
                pc pcVar = (pc) view;
                qcVar.b.getClass();
                r3 = RecyclerView.R(view) == qcVar.e;
                pcVar.s = r3;
                if (!z12) {
                    pcVar.w.f(r3, true);
                }
                pcVar.invalidate();
                break;
            case 1:
                un unVar = (un) this.c;
                boolean z13 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.U6 && q1Var.W6) {
                        z11 = true;
                    }
                    if (z11 != z13 && unVar.O9()) {
                        q1Var.U6 = z13;
                        q1Var.W6 = unVar.O9();
                        q1Var.D6 = true;
                        q1Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof org.telegram.ui.Cells.s0) {
                    ((org.telegram.ui.Cells.s0) view2).e0 = z13;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.v71 v71Var = (org.telegram.ui.Components.v71) this.c;
                boolean z14 = this.b;
                View view3 = (View) obj;
                v71Var.w.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.t71) {
                    org.telegram.ui.Components.t71 t71Var = (org.telegram.ui.Components.t71) view3;
                    if (z14 && (u71Var = v71Var.D) != null && ((n2.u) u71Var).G(R)) {
                        z10 = true;
                    }
                    t71Var.setReordering(z10);
                    break;
                }
                break;
            case 3:
                View view4 = (View) this.c;
                boolean z15 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((org.telegram.ui.Cells.t8) view4).setChecked(!z15);
                    break;
                }
                break;
            case 4:
                dx0 dx0Var = (dx0) this.c;
                boolean z16 = this.b;
                ProfileActivity profileActivity = dx0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    org.telegram.ui.Components.cc.a0(profileActivity).o(z16 ? org.telegram.ui.Components.bc.h : org.telegram.ui.Components.bc.e, null).j();
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.i0.g3(new bk0((org.telegram.ui.web.j) this.c, (String) obj, this.b, 12));
                break;
            case 6:
                org.telegram.ui.web.p1 p1Var = (org.telegram.ui.web.p1) this.c;
                p1Var.getMessagesController().p((String) obj, this.b);
                p1Var.a.f3.O(true);
                break;
            case 7:
                rh.e6 e6Var = (rh.e6) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    org.telegram.messenger.qz.C(e6Var.a).f(new ArrayList(hashSet));
                    break;
                } else {
                    e6Var.getClass();
                    break;
                }
            case 8:
                th.z2 z2Var = (th.z2) this.c;
                boolean z17 = this.b;
                th.g2 g2Var = z2Var.L0;
                org.telegram.ui.ActionBar.p6 p6Var = z2Var.k0;
                new org.telegram.ui.Components.cc(g2Var, p6Var).o(z17 ? org.telegram.ui.Components.bc.h : org.telegram.ui.Components.bc.e, p6Var).j();
                break;
            case 9:
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.c;
                boolean z18 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    q20Var.a(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.I1;
                    if (activity == null) {
                        activity = org.telegram.messenger.i0.W(org.telegram.messenger.w0.b);
                    }
                    if (activity == null || activity.isFinishing()) {
                        q20Var.a(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.x1 x1Var = z18 ? new org.telegram.ui.ActionBar.x1(3, activity, new th.b()) : null;
                        if (z18) {
                            x1Var.r(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        org.telegram.ui.Components.ll llVar = new org.telegram.ui.Components.ll(z18, x1Var, q20Var, 4);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (vh.l9.b == null || !TextUtils.equals(vh.l9.a, str)) {
                            int[] iArr2 = new int[1];
                            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.d20.s0);
                            String str2 = r12.W5;
                            TLObject e22 = r12.e2(str2);
                            TLRPC.User[] userArr = {e22 instanceof TLRPC.User ? (TLRPC.User) e22 : null};
                            vh.h9 h9Var = new vh.h9(r12, userArr, latitude, longitude, iArr2, connectionsManager, llVar, str);
                            if (userArr[0] == 0) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                RequestDelegate zVar = new mg.z(iArr2, r12, userArr, h9Var, llVar, 14);
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, zVar);
                            } else {
                                iArr = iArr2;
                                h9Var.run();
                            }
                            r2 = new vh.d1(19, iArr, connectionsManager);
                        } else {
                            llVar.a(vh.l9.b);
                        }
                        if (z18 && r2 != null) {
                            x1Var.setOnCancelListener(new eg.k(r2, i10));
                            break;
                        }
                    }
                }
                break;
            default:
                nc ncVar = (nc) this.c;
                boolean z19 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    ncVar.a(null);
                    break;
                } else {
                    final LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.b.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            if (location2 == null && z19) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    Context context = LaunchActivity.I1;
                                    if (context == null) {
                                        context = org.telegram.messenger.w0.b;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            int i11 = org.telegram.ui.ActionBar.t6.L5;
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
                                            alertDialog$Builder.n(i11, null);
                                            alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131749539, null);
                                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751161, null), new vh.i9(context, r3 ? 1 : 0));
                                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                            alertDialog$Builder.p();
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                        }
                                    }
                                } else {
                                    try {
                                        final org.telegram.messenger.q20[] q20VarArr = {ncVar};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: vh.j9
                                            @Override // android.location.LocationListener
                                            public final void onLocationChanged(Location location3) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                q20[] q20VarArr2 = q20VarArr;
                                                q20 q20Var2 = q20VarArr2[0];
                                                if (q20Var2 != null) {
                                                    q20Var2.a(location3);
                                                    q20VarArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e7) {
                                        org.telegram.messenger.f8.g(e7, true);
                                        ncVar.a(null);
                                        return;
                                    }
                                }
                            }
                            ncVar.a(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    ncVar.a(location2);
                }
        }
    }
}
