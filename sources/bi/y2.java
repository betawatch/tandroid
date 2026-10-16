package bi;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.cd;
import di.dd;
import di.ed;
import di.fd;
import di.gd;
import di.jd;
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
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.gm0;
import org.telegram.ui.m01;
import org.telegram.ui.wc;
import org.telegram.ui.xc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int[] iArr;
        j91 j91Var;
        di.y6 y6Var = null;
        r4 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                q5 q5Var = (q5) this.c;
                boolean z11 = this.b;
                o4 o4Var = q5Var.c1;
                org.telegram.ui.ActionBar.c6 c6Var = q5Var.B0;
                new zc(o4Var, c6Var).o(z11 ? yc.h : yc.e, c6Var).j();
                break;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean z12 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    callback.run(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.G1;
                    if (activity == null) {
                        activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                    }
                    if (activity == null || activity.isFinishing()) {
                        callback.run(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.a2 a2Var = z12 ? new org.telegram.ui.ActionBar.a2(activity, 3, new b()) : null;
                        if (z12) {
                            a2Var.q(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        cd cdVar = new cd(z12, a2Var, callback, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (jd.b == null || !TextUtils.equals(jd.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            ed edVar = new ed(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, cdVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new fd(iArr2, messagesController, userArr, edVar, cdVar, 0));
                            } else {
                                iArr = iArr2;
                                edVar.run();
                            }
                            y6Var = new di.y6(15, iArr, connectionsManager);
                        } else {
                            cdVar.run(jd.b);
                        }
                        if (z12 && y6Var != null) {
                            a2Var.setOnCancelListener(new dd(y6Var, r4 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 2:
                y2 y2Var = (y2) this.c;
                boolean z13 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    y2Var.run(null);
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
                                    Context context = LaunchActivity.G1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new gd(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {y2Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: di.hd
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
                                        y2Var.run(null);
                                        return;
                                    }
                                }
                            }
                            y2Var.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    y2Var.run(location2);
                }
            case 3:
                xc xcVar = (xc) this.c;
                boolean z14 = this.b;
                View view = (View) obj;
                wc wcVar = (wc) view;
                xcVar.b.getClass();
                r4 = RecyclerView.R(view) == xcVar.e;
                wcVar.s = r4;
                if (!z14) {
                    wcVar.v.f(r4, true);
                }
                wcVar.invalidate();
                break;
            case 4:
                fo foVar = (fo) this.c;
                boolean z15 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view2;
                    if (u1Var.E8 && u1Var.G8) {
                        z10 = true;
                    }
                    if (z10 != z15 && foVar.G9()) {
                        u1Var.E8 = z15;
                        u1Var.G8 = foVar.G9();
                        u1Var.n8 = true;
                        u1Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                    ((org.telegram.ui.Cells.w0) view2).e0 = z15;
                    break;
                }
                break;
            case 5:
                k91 k91Var = (k91) this.c;
                boolean z16 = this.b;
                View view3 = (View) obj;
                k91Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof i91) {
                    ((i91) view3).setReordering(z16 && (j91Var = k91Var.y) != null && ((m.h) j91Var).b(R));
                    break;
                }
                break;
            case 6:
                View view4 = (View) this.c;
                boolean z17 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((org.telegram.ui.Cells.w8) view4).setChecked(!z17);
                    break;
                }
                break;
            case 7:
                m01 m01Var = (m01) this.c;
                boolean z18 = this.b;
                ProfileActivity profileActivity = m01Var.b;
                if (profileActivity.getParentActivity() != null) {
                    zc.a0(profileActivity).o(z18 ? yc.h : yc.e, null).j();
                    break;
                }
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new gm0((org.telegram.ui.web.k) this.c, (String) obj, this.b, 12));
                break;
            case 9:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.c;
                z1Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                z1Var.a.W2.N(true);
                break;
            default:
                zh.n5 n5Var = (zh.n5) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(n5Var.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    n5Var.getClass();
                    break;
                }
        }
    }
}
