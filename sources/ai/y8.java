package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.k91;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nz0;
import org.telegram.ui.sn;
import org.telegram.ui.v90;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y8(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int[] iArr;
        j91 j91Var;
        ei.p6 p6Var = null;
        r4 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ha haVar = (ha) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(haVar.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    haVar.getClass();
                    break;
                }
            case 1:
                ci.p4 p4Var = (ci.p4) this.c;
                boolean z11 = this.b;
                ci.q3 q3Var = p4Var.c1;
                org.telegram.ui.ActionBar.g6 g6Var = p4Var.B0;
                new org.telegram.ui.Components.xc(q3Var, g6Var).o(z11 ? org.telegram.ui.Components.wc.h : org.telegram.ui.Components.wc.e, g6Var).j();
                break;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean z12 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    callback.run(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.J1;
                    if (activity == null) {
                        activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                    }
                    if (activity == null || activity.isFinishing()) {
                        callback.run(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.c2 c2Var = z12 ? new org.telegram.ui.ActionBar.c2(activity, 3, new ci.b()) : null;
                        if (z12) {
                            c2Var.r(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        ei.oc ocVar = new ei.oc(z12, c2Var, callback, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (ei.uc.b == null || !TextUtils.equals(ei.uc.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            ei.qc qcVar = new ei.qc(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, ocVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new s9(iArr2, messagesController, userArr, qcVar, ocVar, 1));
                            } else {
                                iArr = iArr2;
                                qcVar.run();
                            }
                            p6Var = new ei.p6(13, iArr, connectionsManager);
                        } else {
                            ocVar.run(ei.uc.b);
                        }
                        if (z12 && p6Var != null) {
                            c2Var.setOnCancelListener(new ei.pc(p6Var, r4 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 3:
                y8 y8Var = (y8) this.c;
                boolean z13 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    y8Var.run(null);
                    break;
                } else {
                    final LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            if (location2 == null && z13) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    Context context = LaunchActivity.J1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            int i10 = R.raw.permission_request_location;
                                            int i11 = org.telegram.ui.ActionBar.k6.L5;
                                            alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                                            alertDialog$Builder.n(i11, null);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ei.rc(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.p();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {y8Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: ei.sc
                                            @Override // android.location.LocationListener
                                            public final void onLocationChanged(Location location3) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                Utilities.Callback[] callbackArr2 = callbackArr;
                                                Utilities.Callback callback2 = callbackArr2[0];
                                                if (callback2 != null) {
                                                    callback2.run(location3);
                                                    callbackArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        y8Var.run(null);
                                        return;
                                    }
                                }
                            }
                            y8Var.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    y8Var.run(location2);
                }
            case 4:
                org.telegram.ui.rc rcVar = (org.telegram.ui.rc) this.c;
                boolean z14 = this.b;
                View view = (View) obj;
                org.telegram.ui.qc qcVar2 = (org.telegram.ui.qc) view;
                rcVar.b.getClass();
                r4 = RecyclerView.R(view) == rcVar.e;
                qcVar2.s = r4;
                if (!z14) {
                    qcVar2.v.f(r4, true);
                }
                qcVar2.invalidate();
                break;
            case 5:
                sn snVar = (sn) this.c;
                boolean z15 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                    if (t1Var.E8 && t1Var.G8) {
                        z10 = true;
                    }
                    if (z10 != z15 && snVar.G9()) {
                        t1Var.E8 = z15;
                        t1Var.G8 = snVar.G9();
                        t1Var.n8 = true;
                        t1Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) view2).e0 = z15;
                    break;
                }
                break;
            case 6:
                k91 k91Var = (k91) this.c;
                boolean z16 = this.b;
                View view3 = (View) obj;
                k91Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof i91) {
                    ((i91) view3).setReordering(z16 && (j91Var = k91Var.y) != null && ((l2.f) j91Var).l(R));
                    break;
                }
                break;
            case 7:
                View view4 = (View) this.c;
                boolean z17 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((org.telegram.ui.Cells.w8) view4).setChecked(!z17);
                    break;
                }
                break;
            case 8:
                nz0 nz0Var = (nz0) this.c;
                boolean z18 = this.b;
                ProfileActivity profileActivity = nz0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    org.telegram.ui.Components.xc.a0(profileActivity).o(z18 ? org.telegram.ui.Components.wc.h : org.telegram.ui.Components.wc.e, null).j();
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new v90((org.telegram.ui.web.l) this.c, (String) obj, this.b, 14));
                break;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.c;
                y1Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                y1Var.a.Z2.N(true);
                break;
        }
    }
}
