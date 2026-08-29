package jh;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import nh.ac;
import nh.bc;
import nh.ec;
import nh.yb;
import nh.zb;
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
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dz0;
import org.telegram.ui.mp0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m6(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int[] iArr;
        nh.b6 b6Var = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(s7Var.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    s7Var.getClass();
                    break;
                }
            case 1:
                lh.d4 d4Var = (lh.d4) this.c;
                boolean z10 = this.b;
                lh.h3 h3Var = d4Var.Y0;
                org.telegram.ui.ActionBar.c6 c6Var = d4Var.x0;
                new tc(h3Var, c6Var).o(z10 ? sc.h : sc.e, c6Var).j();
                break;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean z11 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    callback.run(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.C1;
                    if (activity == null) {
                        activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                    }
                    if (activity == null || activity.isFinishing()) {
                        callback.run(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.c2 c2Var = z11 ? new org.telegram.ui.ActionBar.c2(activity, 3, new lh.b()) : null;
                        if (z11) {
                            c2Var.q(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        yb ybVar = new yb(z11, c2Var, callback, i10);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (ec.b == null || !TextUtils.equals(ec.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            ac acVar = new ac(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, ybVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new eg.f0(iArr2, messagesController, userArr, acVar, ybVar, 3));
                            } else {
                                iArr = iArr2;
                                acVar.run();
                            }
                            b6Var = new nh.b6(15, iArr, connectionsManager);
                        } else {
                            ybVar.run(ec.b);
                        }
                        if (z11 && b6Var != null) {
                            c2Var.setOnCancelListener(new zb(b6Var, i10));
                            break;
                        }
                    }
                }
                break;
            case 3:
                m6 m6Var = (m6) this.c;
                boolean z12 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    m6Var.run(null);
                    break;
                } else {
                    final LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            if (location2 == null && z12) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    Context context = LaunchActivity.C1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                                            alertDialog$Builder.a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new bc(context, i10));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {m6Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: nh.cc
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
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                        m6Var.run(null);
                                        return;
                                    }
                                }
                            }
                            m6Var.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    m6Var.run(location2);
                }
            case 4:
                dz0 dz0Var = (dz0) this.c;
                boolean z13 = this.b;
                ProfileActivity profileActivity = dz0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    tc.a0(profileActivity).o(z13 ? sc.h : sc.e, null).j();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new mp0((org.telegram.ui.web.l) this.c, (String) obj, this.b, 8));
                break;
            default:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.c;
                w1Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                w1Var.a.U2.N(true);
                break;
        }
    }
}
