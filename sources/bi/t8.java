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
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d80;
import org.telegram.ui.rz0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t8(int i10, Object obj, boolean z10) {
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
        s91 s91Var;
        e2.q0 q0Var = null;
        r4 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ca caVar = (ca) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(caVar.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    caVar.getClass();
                    break;
                }
            case 1:
                di.q4 q4Var = (di.q4) this.c;
                boolean z11 = this.b;
                di.q3 q3Var = q4Var.R0;
                org.telegram.ui.ActionBar.u6 u6Var = q4Var.q0;
                new org.telegram.ui.Components.wc(q3Var, u6Var).o(z11 ? org.telegram.ui.Components.vc.h : org.telegram.ui.Components.vc.e, u6Var).j();
                break;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean z12 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    callback.run(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.I1;
                    if (activity == null) {
                        activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                    }
                    if (activity == null || activity.isFinishing()) {
                        callback.run(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.e2 e2Var = z12 ? new org.telegram.ui.ActionBar.e2(activity, 3, new di.b()) : null;
                        if (z12) {
                            e2Var.r(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        fi.kc kcVar = new fi.kc(z12, e2Var, callback, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (fi.qc.b == null || !TextUtils.equals(fi.qc.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            fi.mc mcVar = new fi.mc(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, kcVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new n9(iArr2, messagesController, userArr, mcVar, kcVar, 1));
                            } else {
                                iArr = iArr2;
                                mcVar.run();
                            }
                            q0Var = new e2.q0(24, iArr, connectionsManager);
                        } else {
                            kcVar.run(fi.qc.b);
                        }
                        if (z12 && q0Var != null) {
                            e2Var.setOnCancelListener(new fi.lc(q0Var, r4 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 3:
                t8 t8Var = (t8) this.c;
                boolean z13 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    t8Var.run(null);
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
                                    Context context = LaunchActivity.I1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            int i10 = R.raw.permission_request_location;
                                            int i11 = org.telegram.ui.ActionBar.y6.L5;
                                            alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.y6.x0(null, i11, false), null);
                                            alertDialog$Builder.n(i11, null);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new fi.nc(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.p();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {t8Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: fi.oc
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
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        t8Var.run(null);
                                        return;
                                    }
                                }
                            }
                            t8Var.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    t8Var.run(location2);
                }
            case 4:
                org.telegram.ui.sc scVar = (org.telegram.ui.sc) this.c;
                boolean z14 = this.b;
                View view = (View) obj;
                org.telegram.ui.rc rcVar = (org.telegram.ui.rc) view;
                scVar.b.getClass();
                r4 = RecyclerView.R(view) == scVar.e;
                rcVar.s = r4;
                if (!z14) {
                    rcVar.v.f(r4, true);
                }
                rcVar.invalidate();
                break;
            case 5:
                un unVar = (un) this.c;
                boolean z15 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                    if (s1Var.E8 && s1Var.G8) {
                        z10 = true;
                    }
                    if (z10 != z15 && unVar.K9()) {
                        s1Var.E8 = z15;
                        s1Var.G8 = unVar.K9();
                        s1Var.n8 = true;
                        s1Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) view2).e0 = z15;
                    break;
                }
                break;
            case 6:
                t91 t91Var = (t91) this.c;
                boolean z16 = this.b;
                View view3 = (View) obj;
                t91Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof r91) {
                    ((r91) view3).setReordering(z16 && (s91Var = t91Var.y) != null && ((jg.i) s91Var).b0(R));
                    break;
                }
                break;
            case 7:
                View view4 = (View) this.c;
                boolean z17 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((org.telegram.ui.Cells.a9) view4).setChecked(!z17);
                    break;
                }
                break;
            case 8:
                rz0 rz0Var = (rz0) this.c;
                boolean z18 = this.b;
                ProfileActivity profileActivity = rz0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    org.telegram.ui.Components.wc.b0(profileActivity).o(z18 ? org.telegram.ui.Components.vc.h : org.telegram.ui.Components.vc.e, null).j();
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new d80((org.telegram.ui.web.l) this.c, (String) obj, this.b, 15));
                break;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.c;
                y1Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                y1Var.a.g3.O(true);
                break;
        }
    }
}
